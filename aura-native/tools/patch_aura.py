#!/usr/bin/env python3
from __future__ import annotations
import json, math, re, shutil, sys, xml.etree.ElementTree as ET
from pathlib import Path

A='http://schemas.android.com/apk/res/android'; P='http://schemas.android.com/apk/res-auto'
ET.register_namespace('android', A); ET.register_namespace('app', P)
def a(k): return '{%s}%s'%(A,k)
def p(k): return '{%s}%s'%(P,k)
def xml(path): return ET.parse(path)
def save(tree,path): tree.write(path,encoding='utf-8',xml_declaration=True)
def replace_once(text,old,new,label):
    n=text.count(old)
    if n!=1: raise RuntimeError(f'{label}: expected one match, got {n}')
    return text.replace(old,new,1)
def colors(path, values):
    t=xml(path); nodes={x.get('name'):x for x in t.getroot().findall('color')}
    for k,v in values.items():
        n=nodes.get(k)
        if n is None: n=ET.SubElement(t.getroot(),'color',{'name':k})
        n.text=v
    save(t,path)
def strings(res):
    changes={'app_name':'AURA','homemusic_login_title':'AURA','homemusic_wave_title':'МОЯ ВОЛНА','homemusic_wave_subtitle':'','homemusic_login_server_helper':'Это локальный сервер, если нужно - замени на свой глобальный сервер','homemusic_login_server_bad':'Это не адрес сервера: например, http://192.168.1.129:4533','homemusic_settings_hub_url_dialog':'Адрес Хаба через интернет: http://192.168.1.129:8080','homemusic_settings_hub_local_url_dialog':'Домашний адрес Хаба по Wi-Fi: http://192.168.1.129:8080'}
    for f in [res/'values/strings.xml',*res.glob('values-*/strings.xml')]:
        if not f.exists(): continue
        t=xml(f); nodes={x.get('name'):x for x in t.getroot().findall('string')}
        for k,v in changes.items():
            if k in nodes: nodes[k].text=v
        save(t,f)
def patch_login_server(decoded):
    old_public='https://146.103.112.215:8444'
    old_local='http://192.168.0.111:4533'
    new='http://192.168.1.129:4533'
    replaced=0
    for f in decoded.rglob('*.smali'):
        s=f.read_text(encoding='utf-8')
        n=s.count(old_public)+s.count(old_local)
        if n:
            s=s.replace(old_public,new).replace(old_local,new)
            f.write_text(s,encoding='utf-8')
            replaced+=n
    if replaced < 5:
        raise RuntimeError(f'Expected at least 5 default HomeMusic server references; updated {replaced}')
    return replaced

def generate_aurora(res,count=30):
    import numpy as np
    from PIL import Image,ImageFilter
    d=res/'drawable-nodpi'; d.mkdir(parents=True,exist_ok=True)
    w,h=480,230
    yy,xx=np.mgrid[0:h,0:w].astype(np.float32); xx/=w-1; yy/=h-1
    base=np.zeros((h,w,3),np.float32); base[:]=[15,16,31]
    palette=[(112,78,226),(220,68,154),(27,174,192),(246,139,91),(53,119,218)]
    def blend(c1,c2,mix):
        return np.asarray(c1,dtype=np.float32)*(1.0-mix)+np.asarray(c2,dtype=np.float32)*mix
    for f in range(count):
        phase=2*math.pi*f/count
        p1=phase
        p2=2*phase+0.85
        p3=3*phase+2.10
        p4=4*phase+0.45
        colors=[
            blend(palette[0],palette[4],0.5+0.5*math.sin(p2)),
            blend(palette[1],palette[2],0.5+0.5*math.sin(p3)),
            blend(palette[2],palette[4],0.5+0.5*math.cos(p1+0.7)),
            blend(palette[3],palette[1],0.5+0.5*math.sin(p4+1.1))
        ]
        blobs=[
            (.19+.15*math.sin(p1),.34+.12*math.cos(p2),.37,.77,colors[0],.66+.12*math.sin(p3)),
            (.78+.12*math.cos(p2+1.1),.56+.13*math.sin(p3),.34,.82,colors[1],.64+.14*math.cos(p1)),
            (.50+.16*math.sin(p3+1.8),.16+.10*math.cos(p1),.29,.52,colors[2],.61+.12*math.sin(p2)),
            (.89-.09*math.sin(p4+.4),.84+.07*math.cos(p2),.27,.57,colors[3],.58+.13*math.cos(p3))
        ]
        image=base.copy()
        for cx,cy,sx,sy,color,strength in blobs:
            glow=np.exp(-(((xx-cx)/sx)**2+((yy-cy)/sy)**2)*3)*strength
            image+=glow[...,None]*color[None,None,:]
        sweep_x=.50+.28*math.sin(p2)
        sweep_y=.48+.22*math.cos(p1)
        sweep=np.exp(-(((xx-sweep_x)/.72)**2+((yy-sweep_y)/.18)**2)*2.2)*.16
        image+=sweep[...,None]*np.array((48,116,190),np.float32)[None,None,:]
        vignette=np.clip(1-.24*(((xx-.5)/.76)**2+((yy-.5)/.86)**2),.58,1)
        image*=vignette[...,None]
        Image.fromarray(np.clip(image,0,255).astype('uint8'),'RGB').filter(ImageFilter.GaussianBlur(1.25)).save(d/f'aura_aurora_{f:02d}.png',optimize=True)

        player=base.copy()
        for cx,cy,sx,sy,color,strength in blobs:
            glow=np.exp(-(((xx-cx)/sx)**2+((yy-cy)/sy)**2)*3)*(strength*.55)
            player+=glow[...,None]*color[None,None,:]
        player+=sweep[...,None]*np.array((43,94,157),np.float32)[None,None,:]*.7
        player*=vignette[...,None]
        Image.fromarray(np.clip(player,0,255).astype('uint8'),'RGB').filter(ImageFilter.GaussianBlur(1.25)).save(d/f'aura_player_aurora_{f:02d}.png',optimize=True)
    items='\n'.join(f' <item android:drawable="@drawable/aura_aurora_{i:02d}" android:duration="240" />' for i in range(count))
    (res/'drawable/aura_aurora_background.xml').write_text(f'<?xml version="1.0" encoding="utf-8"?>\n<animation-list xmlns:android="http://schemas.android.com/apk/res/android" android:oneshot="false">\n{items}\n</animation-list>',encoding='utf-8')
    for name,seq in [('aura_player_play_transition.xml',range(0,10)),('aura_player_pause_transition.xml',range(10,0,-1))]:
        items='\n'.join(f' <item android:drawable="@drawable/aura_player_aurora_{i:02d}" android:duration="85" />' for i in seq)
        (res/'drawable'/name).write_text(f'<?xml version="1.0" encoding="utf-8"?>\n<animation-list xmlns:android="http://schemas.android.com/apk/res/android" android:oneshot="true">\n{items}\n</animation-list>',encoding='utf-8')

def create_player_state_drawables(res):
    d=res/'drawable'
    for name,seq in [('aura_player_play_transition.xml',range(0,10)),('aura_player_pause_transition.xml',range(10,0,-1))]:
        items='\n'.join(f' <item android:drawable="@drawable/aura_player_aurora_{i:02d}" android:duration="85" />' for i in seq)
        (d/name).write_text(f'<?xml version="1.0" encoding="utf-8"?>\n<animation-list xmlns:android="http://schemas.android.com/apk/res/android" android:oneshot="true">\n{items}\n</animation-list>',encoding='utf-8')
def drawables(res):
    d=res/'drawable'; d.mkdir(parents=True,exist_ok=True)
    files={
    'aura_home_background.xml':'<layer-list xmlns:android="http://schemas.android.com/apk/res/android"><item><shape android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#ff241b43" android:centerColor="#ff131a31" android:endColor="#ff071e2b"/></shape></item><item><shape android:shape="rectangle"><gradient android:type="linear" android:angle="0" android:startColor="#552c1d70" android:centerColor="#221c4d66" android:endColor="#001d4c66"/></shape></item><item><shape android:shape="rectangle"><gradient android:type="linear" android:angle="90" android:startColor="#001f9aa8" android:centerColor="#001e8794" android:endColor="#3329154f"/></shape></item></layer-list>',
    'aura_toolbar_gradient.xml':'<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="0" android:startColor="#ff171629" android:endColor="#ff10222e"/></shape>',
    'aura_player_gradient.xml':'<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#ff21183f" android:centerColor="#ff121c31" android:endColor="#ff082631"/></shape>',
    'aura_arrow_right.xml':'<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="24dp" android:height="24dp" android:viewportWidth="24" android:viewportHeight="24"><path android:fillColor="#ffffffff" android:pathData="M5,11h11.2l-4.9,-4.9L12.7,4.7 20,12l-7.3,7.3 -1.4,-1.4 4.9,-4.9H5z"/></vector>',
    'aura_player_state_bg.xml':'<animated-selector xmlns:android="http://schemas.android.com/apk/res/android"><item android:id="@+id/aura_player_idle" android:drawable="@drawable/aura_player_gradient"/><item android:id="@+id/aura_player_playing" android:state_checked="true" android:drawable="@drawable/aura_player_gradient"/><transition android:fromId="@id/aura_player_idle" android:toId="@id/aura_player_playing" android:drawable="@drawable/aura_player_play_transition"/><transition android:fromId="@id/aura_player_playing" android:toId="@id/aura_player_idle" android:drawable="@drawable/aura_player_pause_transition"/></animated-selector>'}
    for n,x in files.items(): (d/n).write_text('<?xml version="1.0" encoding="utf-8"?>\n'+x,encoding='utf-8')


def patch_bottom_nav_resources(res):
    from PIL import Image, ImageDraw
    d=res/'drawable'; d.mkdir(parents=True,exist_ok=True)
    nd=res/'drawable-nodpi'; nd.mkdir(parents=True,exist_ok=True)
    color=res/'color'; color.mkdir(parents=True,exist_ok=True)

    white=(255,255,255,255)
    def canvas():
        image=Image.new('RGBA',(144,144),(0,0,0,0))
        return image,ImageDraw.Draw(image)
    def line(draw,points,width=10):
        draw.line(points,fill=white,width=width,joint='curve')

    # Home
    image,draw=canvas()
    line(draw,[(22,67),(72,23),(122,67)],11)
    line(draw,[(38,61),(38,120),(106,120),(106,61)],11)
    line(draw,[(61,120),(61,88),(83,88),(83,120)],9)
    image.save(nd/'aura_nav_home.png',format='PNG',optimize=True)

    # Open book / library
    image,draw=canvas()
    line(draw,[(72,48),(51,39),(25,44),(25,111),(49,106),(72,117)],10)
    line(draw,[(72,48),(93,39),(119,44),(119,111),(95,106),(72,117)],10)
    line(draw,[(72,48),(72,117)],9)
    line(draw,[(35,62),(51,58),(61,62)],6)
    line(draw,[(35,78),(51,74),(61,78)],6)
    line(draw,[(109,62),(93,58),(83,62)],6)
    line(draw,[(109,78),(93,74),(83,78)],6)
    image.save(nd/'aura_nav_library.png',format='PNG',optimize=True)

    # Hub / connected nodes
    image,draw=canvas()
    line(draw,[(72,70),(72,34)],9)
    line(draw,[(66,78),(39,105)],9)
    line(draw,[(78,78),(105,105)],9)
    draw.ellipse((58,58,86,86),fill=white)
    draw.ellipse((58,14,86,42),fill=white)
    draw.ellipse((20,96,48,124),fill=white)
    draw.ellipse((96,96,124,124),fill=white)
    image.save(nd/'aura_nav_hub.png',format='PNG',optimize=True)

    # Download into tray
    image,draw=canvas()
    line(draw,[(72,20),(72,86)],11)
    line(draw,[(46,63),(72,89),(98,63)],11)
    line(draw,[(27,92),(27,119),(117,119),(117,92)],11)
    image.save(nd/'aura_nav_download.png',format='PNG',optimize=True)

    # Remove the earlier VectorDrawable versions.
    for name in ('aura_nav_home.xml','aura_nav_library.xml','aura_nav_hub.xml','aura_nav_download.xml'):
        old=d/name
        if old.exists(): old.unlink()

    (color/'aura_bottom_nav_tint.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_checked="true" android:color="#ff292343"/>
    <item android:color="#ffe0e5f4"/>
</selector>
''',encoding='utf-8')

    menu_icons={
      'homeFragment':('@drawable/aura_nav_home','@string/menu_home_label'),
      'libraryFragment':('@drawable/aura_nav_library','@string/menu_library_label'),
      'hubFragment':('@drawable/aura_nav_hub','@string/homemusic_menu_hub'),
      'downloadFragment':('@drawable/aura_nav_download','@string/menu_download_label')
    }
    for rel in ('menu/bottom_nav_menu.xml','menu-land/bottom_nav_menu.xml'):
        f=res/rel
        if not f.exists(): continue
        t=xml(f)
        for node in t.getroot().iter():
            key=node.get(a('id'))
            if not key: continue
            key=key.rsplit('/',1)[-1]
            if key in menu_icons:
                icon,title=menu_icons[key]
                # Preserve accessible titles. Material's unlabeled mode hides them visually.
                node.set(a('icon'),icon)
                node.set(a('title'),title)
                node.set(p('contentDescription'),title)
        save(t,f)

    land=res/'layout-land/activity_main.xml'
    if land.exists():
        t=xml(land)
        nav=next((n for n in t.getroot().iter() if n.tag.endswith('BottomNavigationView')),None)
        if nav is not None:
            nav.set(p('itemIconTint'),'@color/aura_bottom_nav_tint')
            nav.set(p('labelVisibilityMode'),'unlabeled')
            nav.set(p('itemIconSize'),'28dp')
            nav.set(p('itemActiveIndicatorStyle'),'@style/AURA.BottomNavigation.ActiveIndicator')
            save(t,land)

def patch_aura_islands(res):
    f=res/'layout/activity_main.xml'; t=xml(f)
    nav=next((n for n in t.getroot().iter() if n.tag.endswith('BottomNavigationView')),None)
    if nav is None: raise RuntimeError('BottomNavigationView missing from activity_main.xml')
    for k,v in {'layout_gravity':'bottom|center_horizontal','layout_width':'match_parent','layout_height':'76dp','layout_marginStart':'14dp','layout_marginEnd':'14dp','layout_marginBottom':'22dp','paddingStart':'8dp','paddingEnd':'8dp','paddingTop':'3dp','paddingBottom':'3dp','elevation':'18dp','background':'@drawable/aura_bottom_nav_island','clipToPadding':'false'}.items(): nav.set(a(k),v)
    for k,v in {'itemIconSize':'28dp','itemHorizontalTranslationEnabled':'false','labelVisibilityMode':'unlabeled','itemPaddingTop':'10dp','itemPaddingBottom':'10dp','itemRippleColor':'#447fddda','itemIconTint':'@color/aura_bottom_nav_tint','itemActiveIndicatorStyle':'@style/AURA.BottomNavigation.ActiveIndicator'}.items(): nav.set(p(k),v)
    nav.attrib.pop(p('itemTextColor'),None)
    save(t,f)
    style_file=res/'values/styles.xml'
    style_tree=xml(style_file)
    style_root=style_tree.getroot()
    indicator=next((x for x in style_root.findall('style') if x.get('name')=='AURA.BottomNavigation.ActiveIndicator'),None)
    if indicator is None:
        indicator=ET.SubElement(style_root,'style',{'name':'AURA.BottomNavigation.ActiveIndicator','parent':'@style/Widget.Material3.BottomNavigationView.ActiveIndicator'})
    style_values={'android:height':'40dp','android:width':'54dp','android:color':'#ffdcd4ff','marginHorizontal':'5dp'}
    for name,value in style_values.items():
        item=next((x for x in indicator.findall('item') if x.get('name')==name),None)
        if item is None: item=ET.SubElement(indicator,'item',{'name':name})
        item.text=value
    save(style_tree,style_file)
    d=res/'drawable'; d.mkdir(parents=True,exist_ok=True)
    (d/'aura_bottom_nav_island.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
  <item><shape android:shape="rectangle"><gradient android:angle="0" android:startColor="#ee22283e" android:centerColor="#ee25384b" android:endColor="#ee19434a"/><corners android:radius="28dp"/><stroke android:width="1dp" android:color="#669bb3c8"/></shape></item>
  <item android:left="2dp" android:top="2dp" android:right="2dp" android:bottom="2dp"><shape android:shape="rectangle"><corners android:radius="26dp"/><solid android:color="#12ffffff"/></shape></item>
</layer-list>
''',encoding='utf-8')
    (d/'aura_wave_play_button.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
  <item><shape android:shape="oval"><gradient android:angle="315" android:startColor="#e77d5ce5" android:centerColor="#e24c72bb" android:endColor="#e1289eaa"/><stroke android:width="1dp" android:color="#99ffffff"/></shape></item>
  <item android:left="2dp" android:top="2dp" android:right="2dp" android:bottom="2dp"><shape android:shape="oval"><solid android:color="#18ffffff"/></shape></item>
</layer-list>
''',encoding='utf-8')
    (d/'aura_wave_play_icon.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="32dp" android:height="32dp" android:viewportWidth="24" android:viewportHeight="24">
  <path android:fillColor="#ffffffff" android:pathData="M8,5.6C8,4.85 8.82,4.39 9.46,4.78L19.1,10.68C19.7,11.05 19.7,11.95 19.1,12.32L9.46,18.22C8.82,18.61 8,18.15 8,17.4Z"/>
</vector>
''',encoding='utf-8')

def patch_initial_preferences(res):
    f=res/'xml/global_preferences.xml'; t=xml(f)
    desired={'number_tracks_keep_in_queue':'50','fallback_to_random_tracks':'true','data_saving_mode':'false','sync_starred_tracks_for_offline_use':'true','queue_syncing':'true'}
    found=set()
    for node in t.getroot().iter():
        key=node.get(a('key'))
        if key not in desired: continue
        value=desired[key]
        if node.get(a('defaultValue')) is not None: node.set(a('defaultValue'),value)
        elif node.get(p('defaultValue')) is not None: node.set(p('defaultValue'),value)
        else: node.set(a('defaultValue'),value)
        found.add(key)
    if found!=set(desired): raise RuntimeError(f'Could not apply all AURA first-install defaults: {sorted(found)}')
    save(t,f)
    for f in [res/'values/strings.xml',*res.glob('values-*/strings.xml')]:
        if not f.exists(): continue
        st=xml(f); changed=False
        for node in st.getroot().findall('string'):
            if node.get('name') in ('lan_title','lan_controller_role','lan_remote_active'):
                node.text='Sharing'; changed=True
        if changed: save(st,f)

def patch_updater_external_asset(decoded):
    f=decoded/'smali/d25.smali'; s=f.read_text(encoding='utf-8')
    pattern=re.compile(r'(?s)    invoke-virtual \{p0\}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getUrl\(\)Ljava/lang/String;.*?    const-string v4, "/app/artifacts/"')
    replacement='''    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getUrl()Ljava/lang/String;
    move-result-object p0
    const-string v1, "apk"
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    move-result v1
    if-eqz v1, :cond_aura_hub_artifact
    const-string v1, "https://github.com/PlayInSpirits/HomeMusic-Fork/releases/download/"
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    move-result v1
    if-eqz v1, :cond_aura_hub_artifact
    const-string v1, ".apk"
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    move-result p0
    return p0
    :cond_aura_hub_artifact
    const-string v1, "-"
    const-string v3, "."
    const-string v4, "/app/artifacts/"'''
    s,n=pattern.subn(replacement,s,count=1)
    if n!=1: raise RuntimeError(f'GitHub APK URL allow-list: expected one stable URL section, got {n}')
    f.write_text(s,encoding='utf-8')
def patch_main_menu(res):
    f=res/'menu/main_page_menu.xml'
    t=xml(f); root=t.getroot()
    route=next((node for node in list(root) if node.get(a('id'))=='@id/media_route_menu_item'),None)
    if route is None:
        route=ET.Element('item',{
            a('id'):'@id/media_route_menu_item',
            a('title'):'@string/media_route_menu_title',
            a('visible'):'false',
            p('showAsAction'):'never'
        })
        root.insert(0,route)
    else:
        route.set(a('visible'),'false')
        route.set(p('showAsAction'),'never')
    route.attrib.pop(p('actionProviderClass'),None)
    route.attrib.pop(p('actionViewClass'),None)
    search=next((node for node in list(root) if node.get(a('id'))=='@id/action_search'),None)
    settings=next((node for node in list(root) if node.get(a('id'))=='@id/action_settings'),None)
    if search is None or settings is None:
        raise RuntimeError('Search and Settings toolbar actions must both exist')
    for item in (search,settings):
        root.remove(item)
        item.set(a('visible'),'true')
        item.set(p('showAsAction'),'always')
    root.append(search)
    root.append(settings)
    ids=[node.get(a('id')) for node in list(root)]
    if ids.index('@id/action_settings') < ids.index('@id/action_search'):
        raise RuntimeError('Settings action must be the rightmost toolbar item')
    if not any(node.get(a('id'))=='@id/media_route_menu_item' and node.get(a('visible'))=='false' for node in root):
        raise RuntimeError('Hidden MediaRoute menu item is required by ToolbarFragment')
    save(t,f)

def patch_toolbar_menu_null_guard(decoded):
    f=decoded/'smali/com/eddyizm/tempus/ui/fragment/ToolbarFragment.smali'
    s=f.read_text(encoding='utf-8')
    anchor='''    move-result-object v0

    .line 18
    const v1, 0x7f130587
'''
    replacement='''    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    const v1, 0x7f130587
'''
    if s.count(anchor)!=1:
        raise RuntimeError('ToolbarFragment route-item null-guard insertion point not found uniquely')
    s=s.replace(anchor,replacement,1)
    f.write_text(s,encoding='utf-8')

def patch_about_settings(res,decoded):
    f=res/'xml/global_preferences.xml'
    t=xml(f)
    about=next((node for node in t.getroot().iter() if node.get(p('title'))=='@string/settings_about_title'),None)
    if about is None:
        raise RuntimeError('About preference category not found')
    root=t.getroot()
    removed=set()
    for node in list(about):
        summary=node.get(p('summary'),'')
        title=node.get(p('title'),'')
        if summary in ('@string/settings_support_summary','@string/undraw_thanks') or title in ('@string/settings_support_title','@string/undraw_page'):
            removed.add(summary or title)
            about.remove(node)
    if len(removed)!=2:
        raise RuntimeError(f'Expected Support and unDraw preferences to be removed; removed={sorted(removed)}')

    contact=next((node for node in list(about) if node.get(a('key'))=='aura_contact_author'),None)
    if contact is None:
        contact=ET.SubElement(about,'Preference',{
            a('key'):'aura_contact_author',
            p('title'):'@string/aura_contact_author_title',
            p('summary'):'@string/aura_contact_author_summary'
        })
        ET.SubElement(contact,'intent',{
            a('action'):'android.intent.action.VIEW',
            a('data'):'@string/aura_contact_author_link'
        })
    upstream=next((node for node in list(about) if node.get(a('key'))=='aura_upstream_project'),None)
    if upstream is None:
        upstream=ET.SubElement(about,'Preference',{
            a('key'):'aura_upstream_project',
            p('title'):'@string/aura_upstream_project_title'
        })
        ET.SubElement(upstream,'intent',{
            a('action'):'android.intent.action.VIEW',
            a('data'):'@string/aura_upstream_project_link'
        })

    check_update_rows=[]
    for parent in root.iter():
        for child in list(parent):
            if child.get(a('key'))=='homemusic_check_update':
                check_update_rows.append((parent,child))
    if len(check_update_rows)!=1:
        raise RuntimeError(f'Expected one Check for updates row, found {len(check_update_rows)}')
    if about not in list(root):
        raise RuntimeError('About category must be a top-level preference group')
    parent,check_update=check_update_rows[0]
    parent.remove(check_update)
    root.insert(list(root).index(about)+1,check_update)
    save(t,f)

    base_values={
      'settings_about_summary':'AURA is an independent Android fork of HomeMusic.',
      'settings_about_title':'About',
      'settings_github_link':'https://github.com/PlayInSpirits/HomeMusic-Fork',
      'settings_github_summary':'AURA source code and releases',
      'settings_github_title':'GitHub',
      'settings_version_summary':'AURA v0.75-1',
      'homemusic_settings_version':'%1$s',
      'settings_version_title':'AURA version',
      'homemusic_settings_title':'AURA (HomeMusic)',
      'aura_contact_author_title':'Contact the fork author',
      'aura_contact_author_summary':'Telegram: Play_in_Spirits',
      'aura_contact_author_link':'https://t.me/Play_in_Spirits',
      'aura_upstream_project_title':'Original HomeMusic application',
      'aura_upstream_project_link':'https://github.com/justman-1/HomeMusic-public'
    }
    ru_values={
      'settings_about_summary':'AURA — независимый Android-форк клиента HomeMusic.',
      'settings_about_title':'О приложении',
      'settings_github_link':'https://github.com/PlayInSpirits/HomeMusic-Fork',
      'settings_github_summary':'Исходный код и релизы AURA',
      'settings_github_title':'GitHub',
      'settings_version_summary':'AURA v0.75-1',
      'homemusic_settings_version':'%1$s',
      'settings_version_title':'Версия AURA',
      'homemusic_settings_title':'AURA (HomeMusic)',
      'aura_contact_author_title':'Связаться с автором форка',
      'aura_contact_author_summary':'Telegram: Play_in_Spirits',
      'aura_contact_author_link':'https://t.me/Play_in_Spirits',
      'aura_upstream_project_title':'Оригинальное приложение HomeMusic',
      'aura_upstream_project_link':'https://github.com/justman-1/HomeMusic-public'
    }
    for filename,values in [
        (res/'values/strings.xml',base_values),
        (res/'values-ru/strings.xml',ru_values)
    ]:
        st=xml(filename)
        nodes={x.get('name'):x for x in st.getroot().findall('string')}
        for name,value in values.items():
            node=nodes.get(name)
            if node is None:
                node=ET.SubElement(st.getroot(),'string',{'name':name})
            node.text=value
        save(st,filename)

    f=decoded/'smali/vb4.smali'
    s=f.read_text(encoding='utf-8')
    s=replace_once(s,'const-string v3, "1.14.7"','''invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v3
    invoke-static {v3}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v3''','About versionName')
    s=replace_once(s,'    const/16 v0, 0x2b','    const/4 v0, 0x0','HomeMusic settings: keep versionCode out of the visible version label')
    s=replace_once(s,'const-string v2, "1.14.7"','''invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v2
    invoke-static {v2}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v2''','HomeMusic settings versionName')
    s=replace_once(s,'''    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const v2, 0x7f130226

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0''','''    move-object v0, v2''','HomeMusic settings display versionName only')
    f.write_text(s,encoding='utf-8')

    helper=decoded/'smali/app/homemusic/AURAVersion.smali'
    helper.parent.mkdir(parents=True,exist_ok=True)
    helper.write_text('''.class public final Lapp/homemusic/AURAVersion;
.super Ljava/lang/Object;

.method public static versionName(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    move-result-object v0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    const/4 v2, 0x0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    move-result-object v0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    if-eqz v0, :fallback
    return-object v0
:fallback
    const-string v0, "unknown"
    return-object v0
.end method

.method public static versionCodeInt(Landroid/content/Context;)I
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    move-result-object v0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    const/4 v2, 0x0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    move-result-object v0
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    return v0
.end method

.method public static versionCode(Landroid/content/Context;)J
    .locals 2
    invoke-static {p0}, Lapp/homemusic/AURAVersion;->versionCodeInt(Landroid/content/Context;)I
    move-result v0
    int-to-long v0, v0
    return-wide v0
.end method
''',encoding='utf-8')

def patch_hub_native_ui(res):
    f=res/'layout/fragment_hub.xml'
    t=xml(f); root=t.getroot()
    tabs=next((node for node in root.iter() if node.get(a('id'))=='@id/hub_tabs'),None)
    if tabs is None:
        raise RuntimeError('Hub TabLayout was not found')
    row=next((node for node in root.iter() if tabs in list(node)),None)
    if row is not None:
        row.set(a('background'),'?colorSurface')
        row.set(a('paddingHorizontal'),'4dp')
        row.set(a('paddingTop'),'4dp')
        row.set(a('paddingBottom'),'4dp')
    tabs.set(a('background'),'@drawable/aura_hub_tabs_background')
    tabs.set(a('layout_marginStart'),'8dp')
    tabs.set(a('layout_marginEnd'),'8dp')
    tabs.set(a('layout_marginTop'),'3dp')
    tabs.set(a('layout_marginBottom'),'3dp')
    tabs.set(a('clipToPadding'),'false')
    for key,value in {
      'tabMode':'scrollable',
      'tabGravity':'center',
      'tabIndicatorColor':'#ffbdadff',
      'tabIndicatorHeight':'3dp',
      'tabIndicatorFullWidth':'false',
      'tabIndicatorAnimationMode':'elastic',
      'tabSelectedTextColor':'#fff4f1ff',
      'tabTextColor':'#ffb9b5cf',
      'tabRippleColor':'#33bdadff',
      'tabPaddingStart':'12dp',
      'tabPaddingEnd':'12dp'
    }.items():
        tabs.set(p(key),value)
    save(t,f)
    drawable=res/'drawable/aura_hub_tabs_background.xml'
    drawable.parent.mkdir(parents=True,exist_ok=True)
    drawable.write_text('''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <gradient android:angle="0" android:startColor="#ee211b38" android:endColor="#ee10252f" />
    <corners android:radius="18dp" />
    <stroke android:width="1dp" android:color="#44bdadff" />
</shape>
''',encoding='utf-8')

def patch_search_ui(res):
    f=res/'layout/fragment_search.xml'
    t=xml(f); root=t.getroot()
    root.set(a('background'),'@drawable/aura_home_background')
    found={'appbar':False,'bar':False,'view':False}
    for n in root.iter():
        tag=n.tag.split('}')[-1]
        if tag.endswith('AppBarLayout'):
            found['appbar']=True
            n.set(a('background'),'@drawable/aura_toolbar_gradient')
        elif tag.endswith('SearchBar'):
            found['bar']=True
            n.set(a('background'),'@drawable/aura_toolbar_gradient')
            n.set(p('backgroundTint'),'@color/md_theme_dark_surface')
        elif tag.endswith('SearchView'):
            found['view']=True
            n.set(a('background'),'@drawable/aura_home_background')
            n.set(p('backgroundTint'),'@color/md_theme_dark_background')
            n.set(p('hideNavigationIcon'),'false')
            n.set(p('navigationIcon'),'@drawable/ic_arrow_back')
            n.set(p('navigationIconTint'),'#fff4f1ff')
        elif tag.endswith('ScrollView'):
            n.set(a('background'),'@drawable/aura_home_background')
    if not all(found.values()):
        raise RuntimeError(f'SearchBar/SearchView structure incomplete: {found}')
    save(t,f)


def patch_search_to_hub(decoded):
    helper=decoded/'smali/app/homemusic/AURAVersion.smali'
    h=helper.read_text(encoding='utf-8')
    if '.field public static pendingSearch:Z' not in h:
        marker='.super Ljava/lang/Object;\n'
        if h.count(marker)!=1: raise RuntimeError('AURAVersion superclass marker not found')
        h=h.replace(marker,marker+'\n.field public static pendingSearch:Z\n',1)
    helper.write_text(h,encoding='utf-8')

    toolbar=decoded/'smali/com/eddyizm/tempus/ui/fragment/ToolbarFragment.smali'
    t=toolbar.read_text(encoding='utf-8')
    start=t.index('.method public final N(Landroid/view/MenuItem;)Z')
    end=t.index('.end method',start)
    method=t[start:end]
    old='''    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;'''
    new='''    if-ne v0, v1, :cond_0

    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->pendingSearch:Z

    .line 11
    .line 12
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;'''
    if method.count(old)!=1: raise RuntimeError('Could not find unique toolbar search navigation branch')
    method=method.replace(old,new,1)
    if method.count('const p1, 0x7f0a0535')!=1: raise RuntimeError('Expected one native SearchFragment destination')
    method=method.replace('const p1, 0x7f0a0535','const p1, 0x7f0a02ed',1)
    t=t[:start]+method+t[end:]
    toolbar.write_text(t,encoding='utf-8')

    hub=decoded/'smali/com/eddyizm/tempus/homemusic/HubFragment.smali'
    h=hub.read_text(encoding='utf-8')
    start=h.index('.method public final T(Landroid/view/View;Landroid/os/Bundle;)V')
    end=h.index('.end method',start)
    method=h[start:end]
    old='''    :cond_f
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->j0(Ljava/lang/String;)V'''
    new='''    :cond_f
    sget-boolean v8, Lapp/homemusic/AURAVersion;->pendingSearch:Z
    if-eqz v8, :cond_aura_search_existing_done
    const/4 v8, 0x0
    sput-boolean v8, Lapp/homemusic/AURAVersion;->pendingSearch:Z
    const-string p1, "/search"
    :cond_aura_search_existing_done
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->j0(Ljava/lang/String;)V'''
    if method.count(old)!=1: raise RuntimeError('Could not find existing Hub WebView route restoration point')
    method=method.replace(old,new,1)
    old='''    :cond_11
    invoke-virtual {p0, v3, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V'''
    new='''    :cond_11
    sget-boolean v8, Lapp/homemusic/AURAVersion;->pendingSearch:Z
    if-eqz v8, :cond_aura_search_default_done
    const/4 v8, 0x0
    sput-boolean v8, Lapp/homemusic/AURAVersion;->pendingSearch:Z
    const-string v3, "/search"
    :cond_aura_search_default_done
    invoke-virtual {p0, v3, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V'''
    if method.count(old)!=1: raise RuntimeError('Could not find initial Hub route loading point')
    method=method.replace(old,new,1)
    h=h[:start]+method+h[end:]
    hub.write_text(h,encoding='utf-8')

def patch_github_updater(decoded):
    helper=decoded/'smali/app/homemusic/AURAVersion.smali'
    if not helper.exists():
        raise RuntimeError('AURAVersion helper must be installed before patching updater')
    f=decoded/'smali/rr1.smali'
    s=f.read_text(encoding='utf-8')
    start=s.index('.method public static final n()Lcom/eddyizm/tempus/homemusic/HubAppRelease;')
    end=s.index('.end method',start)
    method=s[start:end]
    old='''    invoke-static {}, Lrr1;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0'''
    new='''    const-string v0, "https://raw.githubusercontent.com/PlayInSpirits/HomeMusic-Fork/main"'''
    if method.count(old)!=1:
        raise RuntimeError('Updater feed URL insertion point was not found uniquely')
    method=method.replace(old,new,1)
    redirect_old='''    const/4 v2, 0x0

    .line 18
    iput-boolean v2, v1, Ln83;->i:Z

    .line 19
    .line 20
    iput-boolean v2, v1, Ln83;->j:Z'''
    redirect_new='''    const/4 v2, 0x1

    .line 18
    iput-boolean v2, v1, Ln83;->i:Z

    .line 19
    .line 20
    iput-boolean v2, v1, Ln83;->j:Z'''
    if method.count(redirect_old)!=1:
        raise RuntimeError('GitHub feed redirect flags insertion point was not found uniquely')
    method=method.replace(redirect_old,redirect_new,1)
    s=s[:start]+method+s[end:]
    f.write_text(s,encoding='utf-8')

    f=decoded/'smali/com/eddyizm/tempus/homemusic/HubUpdater.smali'
    s=f.read_text(encoding='utf-8')
    s=replace_once(s,'    const-wide/16 v5, 0x2b','''    invoke-static {p0}, Lapp/homemusic/AURAVersion;->versionCode(Landroid/content/Context;)J
    move-result-wide v5''','Updater current versionCode (worker)')
    s=replace_once(s,'    const-wide/16 v6, 0x2b','''    invoke-static {p0}, Lapp/homemusic/AURAVersion;->versionCode(Landroid/content/Context;)J
    move-result-wide v6''','Updater current versionCode (callback)')
    s=replace_once(s,'    const-string p2, "1.14.7"','''    invoke-static {p0}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object p2''','Updater latest-version toast')
    s=replace_once(s,'    const-string v4, "1.14.7"','''    invoke-static {p1}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v4''','Updater update-dialog installed version')
    f.write_text(s,encoding='utf-8')

def patch_updater_redirects(decoded):
    f=decoded/'smali/com/eddyizm/tempus/homemusic/HubUpdater.smali'
    s=f.read_text(encoding='utf-8')
    start=s.index('.method private static final updateHttp_delegate$lambda$0()Lo83;')
    end=s.index('.end method',start)
    method=s[start:end]
    old='''    const/4 v1, 0x0

    .line 14
    iput-boolean v1, v0, Ln83;->i:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Ln83;->j:Z'''
    new='''    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, Ln83;->i:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Ln83;->j:Z'''
    if method.count(old)!=1:
        raise RuntimeError('Updater redirect flags insertion point was not found uniquely')
    method=method.replace(old,new,1)
    s=s[:start]+method+s[end:]
    f.write_text(s,encoding='utf-8')

def patch_hub_preferences(res):
    f=res/'xml/global_preferences.xml'; t=xml(f)
    found=set()
    for node in t.getroot().iter():
        key=node.get(a('key'))
        if key in ('homemusic_hub_url','homemusic_hub_local_url'):
            node.set(a('defaultValue'),'http://192.168.1.129:8080')
            found.add(key)
    if found!={'homemusic_hub_url','homemusic_hub_local_url'}:
        raise RuntimeError(f'Expected both HomeMusic Hub URL preferences; found {sorted(found)}')
    save(t,f)

def patch_hub_defaults(decoded):
    f=decoded/'smali/com/eddyizm/tempus/homemusic/HomeDefaults.smali'
    s=f.read_text(encoding='utf-8')
    marker='    invoke-interface {v6, v3, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;'
    if s.count(marker)!=1: raise RuntimeError('HomeMusic defaults migration marker not found uniquely')
    if 'homemusic_hub_local_url' in s:
        raise RuntimeError('Hub URL migration already exists; refusing duplicate migration')
    old='    const/4 v5, 0x5'
    if s.count(old)!=1: raise RuntimeError('HomeMusic defaults version is not the expected v5')
    s=s.replace(old,'    const/4 v5, 0x6',1)
    inject='''    const-string v12, "homemusic_hub_url"
    const-string v13, "http://192.168.1.129:8080"
    invoke-interface {v6, v12, v13}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    const-string v12, "homemusic_hub_local_url"
    const-string v13, "http://192.168.1.129:8080"
    invoke-interface {v6, v12, v13}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
'''
    s=s.replace(marker,inject+marker,1)
    f.write_text(s,encoding='utf-8')

def patch_theme(res):
    values=res/'values/colors.xml'
    colors(values,{
      'md_theme_light_background':'#ff0d0e18','md_theme_light_onBackground':'#fff4f1ff',
      'md_theme_light_surface':'#ff131522','md_theme_light_onSurface':'#fff4f1ff',
      'md_theme_light_surfaceVariant':'#ff272839','md_theme_light_onSurfaceVariant':'#ffb9b5cf',
      'md_theme_light_primary':'#ffbdadff','md_theme_light_onPrimary':'#ff241858',
      'md_theme_light_primaryContainer':'#ff382f6d','md_theme_light_onPrimaryContainer':'#fff0eaff',
      'md_theme_light_secondary':'#ff79d9df','md_theme_light_onSecondary':'#ff00363d',
      'md_theme_light_secondaryContainer':'#ff15464d','md_theme_light_onSecondaryContainer':'#ffb9f7fb',
      'md_theme_light_tertiary':'#ffff9fc3','md_theme_light_onTertiary':'#ff4e102e',
      'md_theme_light_tertiaryContainer':'#ff643148','md_theme_light_onTertiaryContainer':'#ffffdbe8',
      'md_theme_light_outline':'#ffaaa5bc','dividerColor':'#ff343448',
      'titleTextColor':'#fff4f1ff','subtitleTextColor':'#ffb9b5cf',
      'widget_bg':'#e51a1b2d','widget_icon_tint':'#ffffffff',
      'widget_icon_tint_active':'#ffbdadff','widget_subtitle':'#ffc6c2d8','widget_title':'#ffffffff',
      'hub_background':'#ff0d0e18','hub_text':'#fff4f1ff'})
    if (res/'values-night/colors.xml').exists():
        colors(res/'values-night/colors.xml',{
          'dividerColor':'#ff343448','titleTextColor':'#fff4f1ff','subtitleTextColor':'#ffb9b5cf',
          'widget_bg':'#e51a1b2d','widget_icon_tint':'#ffffffff',
          'widget_icon_tint_active':'#ffbdadff','widget_subtitle':'#ffc6c2d8','widget_title':'#ffffffff'})
    f=res/'values/styles.xml'; t=xml(f)
    app=next((n for n in t.getroot().findall('style') if n.get('name')=='AppTheme'),None)
    if app is None: raise RuntimeError('AppTheme not found')
    app.set('parent','@style/Theme.Material3.Dark.NoActionBar')
    wanted={
      'android:colorBackground':'@color/md_theme_light_background',
      'android:windowBackground':'@drawable/aura_home_background',
      'android:windowLightStatusBar':'false',
      'android:textColorPrimary':'@color/md_theme_light_onSurface',
      'android:textColorSecondary':'@color/md_theme_light_onSurfaceVariant',
      'android:statusBarColor':'@color/md_theme_light_surface',
      'android:navigationBarColor':'@color/md_theme_light_surface'
    }
    for item_name,value in wanted.items():
        n=next((x for x in app.findall('item') if x.get('name')==item_name),None)
        if n is None: n=ET.SubElement(app,'item',{'name':item_name})
        n.text=value
    save(t,f)

def patch_screen_backgrounds(res):
    files=[
      'layout/activity_main.xml','layout/fragment_home.xml','layout/fragment_home_tab_music.xml',
      'layout/fragment_home_tab_radio.xml','layout/fragment_home_tab_podcast.xml',
      'layout/fragment_library.xml','layout/fragment_search.xml','layout/fragment_settings.xml',
      'layout/fragment_hub.xml','layout/fragment_download.xml','layout/fragment_directory.xml',
      'layout/fragment_index.xml','layout/fragment_landing.xml'
    ]
    for rel in files:
        f=res/rel
        if not f.exists(): continue
        t=xml(f); t.getroot().set(a('background'),'@drawable/aura_home_background'); save(t,f)

def patch_hub_web_background(decoded):
    f=decoded/'smali/com/eddyizm/tempus/homemusic/HubFragment.smali'
    s=f.read_text(encoding='utf-8')
    lines=s.splitlines()
    indexes=[i for i,line in enumerate(lines) if 'const-string v8,' in line and '__HOMEMUSIC_EMBEDDED__' in line]
    if len(indexes)!=1:
        raise RuntimeError(f'Expected one embedded Hub style script, found {len(indexes)}')
    script=r'''(function () {
  if (window.__AURA_HUB_STYLE__) return;
  window.__AURA_HUB_STYLE__ = true;
  var css = [
    ':root{color-scheme:dark;--aura-text:#f4f1ff;--aura-muted:#beb9d2;--aura-violet:#bdadff;--aura-cyan:#79d9df;--aura-line:rgba(189,173,255,.18)}',
    'html,body{min-height:100%;background:radial-gradient(ellipse at 12% 0%,rgba(93,65,150,.22),transparent 42%),radial-gradient(ellipse at 92% 28%,rgba(30,132,145,.14),transparent 38%),#0d0e18!important;color:var(--aura-text)!important}',
    'body{font-family:system-ui,-apple-system,Roboto,sans-serif!important;padding-bottom:calc(210px + env(safe-area-inset-bottom))!important}',
    'main{padding:14px 14px calc(196px + env(safe-area-inset-bottom))!important;background:transparent!important;min-height:100vh}',
    'nav[aria-label="Разделы"]{display:flex!important;visibility:visible!important;opacity:1!important;position:sticky;top:0;z-index:15;gap:7px;max-width:100%;overflow-x:auto;white-space:nowrap;padding:9px 12px!important;background:rgba(17,18,34,.96)!important;border-bottom:1px solid var(--aura-line)!important;backdrop-filter:blur(16px)}',
    'nav[aria-label="Разделы"] a,nav[aria-label="Разделы"] button,nav[aria-label="Разделы"] [role="tab"]{flex:0 0 auto;min-height:38px;padding:8px 13px!important;border:1px solid transparent!important;border-radius:14px!important;color:var(--aura-muted)!important;background:rgba(255,255,255,.035)!important;transition:background .22s ease,border-color .22s ease,color .22s ease,transform .22s ease}',
    'nav[aria-label="Разделы"] [aria-current="page"],nav[aria-label="Разделы"] [aria-selected="true"],nav[aria-label="Разделы"] .active{color:var(--aura-text)!important;background:linear-gradient(110deg,rgba(129,98,201,.34),rgba(38,139,150,.24))!important;border-color:rgba(189,173,255,.34)!important}',
    'article,[data-slot="card"],[class*="Card"],[class*="rounded-xl"],[class*="rounded-2xl"],.card{background:linear-gradient(145deg,rgba(31,30,53,.92),rgba(17,28,42,.9))!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;box-shadow:0 10px 28px rgba(0,0,0,.2)!important;color:var(--aura-text)!important}',
    'h1,h2,h3,h4,strong{color:#fff!important}p,label,small,li{color:var(--aura-muted)}',
    'button,[role="button"],a[data-slot="button"]{border-radius:14px!important;transition:transform .2s ease,box-shadow .2s ease,background .2s ease,border-color .2s ease!important}',
    'button:not(:disabled):hover,[role="button"]:hover,a[data-slot="button"]:hover{transform:translateY(-1px);box-shadow:0 7px 20px rgba(0,0,0,.22)}',
    'input,select,textarea{background:rgba(10,12,24,.82)!important;color:var(--aura-text)!important;border-color:rgba(189,173,255,.25)!important;border-radius:13px!important;transition:border-color .2s ease,box-shadow .2s ease!important}',
    'input:focus,select:focus,textarea:focus{border-color:var(--aura-violet)!important;box-shadow:0 0 0 3px rgba(189,173,255,.12)!important;outline:none!important}',
    'a{color:var(--aura-cyan)}hr{border-color:var(--aura-line)!important}img{border-radius:12px}',
    '::-webkit-scrollbar{width:7px;height:7px}::-webkit-scrollbar-thumb{background:rgba(189,173,255,.28);border-radius:8px}',
    '.aura-hub-enter{animation:auraHubEnter .34s cubic-bezier(.2,.7,.25,1) both}',
    '@keyframes auraHubEnter{from{opacity:.35;transform:translateY(7px)}to{opacity:1;transform:translateY(0)}}',
    '.aura-assistant-composer{position:relative!important;bottom:auto!important;z-index:2!important;display:block!important;clear:both!important;margin:18px 0 14px!important;padding:12px!important;background:rgba(17,18,34,.94)!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;backdrop-filter:blur(18px)!important;box-shadow:0 8px 24px rgba(0,0,0,.25)!important}',
    '.aura-assistant-action{display:inline-flex!important;align-items:center!important;justify-content:center!important;min-height:44px!important;padding:10px 16px!important;border:1px solid rgba(189,173,255,.34)!important;border-radius:14px!important;background:linear-gradient(110deg,#59458f,#176e79)!important;color:#fff!important;box-shadow:0 7px 20px rgba(0,0,0,.22)!important}',
    '@media(prefers-reduced-motion:reduce){*,*::before,*::after{scroll-behavior:auto!important;animation-duration:.01ms!important;transition-duration:.01ms!important}}'
  ].join('');
  function routeText() {
    return ((location.pathname || '') + ' ' + (location.hash || '')).toLowerCase();
  }
  function addStyle() {
    if (document.getElementById('aura-hub-style')) return;
    var style = document.createElement('style');
    style.id = 'aura-hub-style';
    style.textContent = css;
    (document.head || document.documentElement).appendChild(style);
  }
  function animatePage() {
    var main = document.querySelector('main');
    if (!main || window.matchMedia('(prefers-reduced-motion: reduce)').matches) return;
    main.classList.remove('aura-hub-enter');
    void main.offsetWidth;
    main.classList.add('aura-hub-enter');
  }
  function keepTabsVisible() {
    var nav = document.querySelector('nav[aria-label="Разделы"]');
    if (!nav) return;
    nav.style.setProperty('display','flex','important');
    nav.style.setProperty('visibility','visible','important');
    nav.style.setProperty('opacity','1','important');
  }
  function removeCatalogShortcuts() {
    var labels = /^(моя волна|микс дня|my wave|daily mix)$/i;
    document.querySelectorAll('button,a,[role="button"],[role="tab"],h1,h2,h3,span').forEach(function (el) {
      var label = (el.innerText || el.textContent || '').replace(/\s+/g,' ').trim();
      if (!labels.test(label)) return;
      var card = el.closest('article,[data-slot="card"],.card,[class*="Card"],[class*="card"]') || el.parentElement || el;
      card.style.setProperty('display','none','important');
    });
  }
  function activeHubTab() {
    var nav = document.querySelector('nav[aria-label="Разделы"]');
    if (!nav) return '';
    var selected = nav.querySelector('[aria-current="page"],[aria-selected="true"],[data-state="active"],.active');
    return selected ? (selected.innerText || selected.textContent || '').replace(/\\s+/g,' ').trim().toLowerCase() : '';
  }
  function isAssistantTab() {
    var tab = activeHubTab();
    if (tab) return /(ассистент|assistant)/i.test(tab);
    return /assistant/.test(routeText());
  }
  function setComposerVisible(node, visible) {
    if (!node) return;
    if (visible) node.style.removeProperty('display');
    else node.style.setProperty('display','none','important');
  }
  function liftAssistantComposer() {
    var assistantTab = isAssistantTab();
    var candidates = [];
    document.querySelectorAll('button,a,[role="button"]').forEach(function (el) {
      var label = (el.innerText || el.textContent || '').replace(/\\s+/g,' ').trim();
      if (!/(сообщени[ея] ассистенту|написать ассистенту|send.*assistant|message.*assistant)/i.test(label)) return;
      el.classList.add('aura-assistant-action');
      var shell = el.closest('form,[class*="assistant"],[class*="composer"]') || el.parentElement;
      if (!shell) return;
      shell.classList.add('aura-assistant-composer');
      if (candidates.indexOf(shell) === -1) candidates.push(shell);
    });

    var roots = Array.prototype.slice.call(document.querySelectorAll('.aura-assistant-composer'));
    candidates.forEach(function (node) {
      if (roots.indexOf(node) === -1) roots.push(node);
    });
    if (!assistantTab) {
      roots.forEach(function (node) { setComposerVisible(node, false); });
      return;
    }

    var topLevel = roots.filter(function (node) {
      return !roots.some(function (other) { return other !== node && other.contains(node); });
    });
    var keeper = topLevel[0] || null;
    roots.forEach(function (node) {
      setComposerVisible(node, !!keeper && (node === keeper || keeper.contains(node)));
    });
  }
  function recoverLayout() {
    addStyle();
    keepTabsVisible();
    removeCatalogShortcuts();
    liftAssistantComposer();
  }
  var pending = false;
  function scheduleLayout() {
    if (pending) return;
    pending = true;
    requestAnimationFrame(function () {
      pending = false;
      recoverLayout();
      animatePage();
    });
  }
  function start() {
    recoverLayout();
    animatePage();
    if (document.documentElement && window.MutationObserver) {
      var observer = new MutationObserver(function (records) {
        var changed = records.some(function (record) {
          return record.addedNodes && record.addedNodes.length;
        });
        if (changed) scheduleLayout();
      });
      observer.observe(document.documentElement,{childList:true,subtree:true});
    }
  }
  if (document.readyState === 'loading') document.addEventListener('DOMContentLoaded',start,{once:true});
  else start();
  window.addEventListener('hashchange',scheduleLayout);
  window.addEventListener('popstate',scheduleLayout);
  window.addEventListener('pageshow',scheduleLayout);
  window.addEventListener('focus',scheduleLayout);
  document.addEventListener('visibilitychange',function () {
    if (document.visibilityState === 'visible') scheduleLayout();
  });
  window.addEventListener('hm:unauthorized',function () {
    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}
  });
})();'''
    lines[indexes[0]]='    const-string v8, '+json.dumps(script,ensure_ascii=True)
    f.write_text('\n'.join(lines)+'\n',encoding='utf-8')

def patch_vectors(res):
    d=res/'drawable'
    paths={
    'ic_home.xml':'M3.7,10.9L12,4l8.3,6.9M5.6,9.8V19h12.8V9.8M9.5,19v-5.4h5V19',
    'ic_search.xml':'M10.8,18a7.2,7.2 0,1 1,0 -14.4a7.2,7.2 0,0 1,0 14.4M16,16l4.2,4.2',
    'ic_queue.xml':'M4,6h11M4,11h11M4,16h6M18,13.5v7M14.5,17h7',
    'ic_lyrics.xml':'M5,6h14M5,10.5h14M5,15h9M5,19h6',
    'ic_timer.xml':'M9,3h6M12,7v5l3,2M19.2,8.2l1.4,-1.4M12,21a8,8 0,1 0,0 -16a8,8 0,0 0,0 16z',
    'ic_homemusic_wave.xml':'M3,8c2.2,0 2.2,-2.2 4.5,-2.2S9.8,8 12,8s2.2,-2.2 4.5,-2.2S18.8,8 21,8M3,12c2.2,0 2.2,-2.2 4.5,-2.2S9.8,12 12,12s2.2,-2.2 4.5,-2.2S18.8,12 21,12M3,16c2.2,0 2.2,-2.2 4.5,-2.2S9.8,16 12,16s2.2,-2.2 4.5,-2.2S18.8,16 21,16'}
    for name,data in paths.items():
        (d/name).write_text(f'''<?xml version="1.0" encoding="utf-8"?>\n<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="24dp" android:height="24dp" android:viewportWidth="24" android:viewportHeight="24"><path android:fillColor="#00000000" android:strokeColor="?attr/colorControlNormal" android:strokeWidth="1.9" android:strokeLineCap="round" android:strokeLineJoin="round" android:pathData="{data}"/></vector>''',encoding='utf-8')
def patch_logo(res,logo):
    from PIL import Image, ImageFilter
    d=res/'drawable-nodpi'
    d.mkdir(parents=True,exist_ok=True)
    master=Image.open(logo).convert('RGBA')
    shutil.copy2(logo,d/'aura_logo.png')
    shutil.copy2(logo,d/'ic_toolbar_tempo.png')
    repo_root=Path(__file__).resolve().parents[1]
    assets=repo_root/'assets'
    icons=assets/'icons'
    icons.mkdir(parents=True,exist_ok=True)

    def export_icon(size):
        image=master.resize((size,size),Image.Resampling.LANCZOS)
        return image.filter(ImageFilter.UnsharpMask(radius=0.55,percent=115,threshold=2))

    for size in (24,32,36,48,72,96,144,192,256,512):
        export_icon(size).save(icons/f'aura-{size}.png',optimize=True)
    export_icon(144).save(assets/'aura_logo_144.png',optimize=True)

    foreground=export_icon(168)
    launcher=Image.new('RGBA',(224,224),(0,0,0,0))
    launcher.alpha_composite(foreground,((224-foreground.width)//2,(224-foreground.height)//2))
    launcher.save(d/'ic_launcher_foreground.png',optimize=True)

    monochrome=Image.new('RGBA',master.size,(255,255,255,0))
    monochrome.putalpha(master.getchannel('A'))
    monochrome.resize((224,224),Image.Resampling.LANCZOS).save(d/'ic_launcher_monochrome.png',optimize=True)

    old_splash=res/'drawable/ic_splash_logo.xml'
    if old_splash.exists():
        old_splash.unlink()
    export_icon(256).save(d/'ic_splash_logo.png',optimize=True)

    for name in ('ic_toolbar_tempo.xml','ic_launcher_foreground.xml','ic_launcher_monochrome.xml'):
        old=res/'drawable'/name
        if old.exists():
            old.unlink()

    (res/'drawable/ic_launcher_background.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#ff35246e" android:centerColor="#ff17162b" android:endColor="#ff062a38"/></shape>''',encoding='utf-8')


def patch_home_mix_layout(res):
    f=res/'layout/homemusic_home_mixes.xml'; t=xml(f); root=t.getroot()
    root.set(a('orientation'),'vertical')
    root.set(a('paddingLeft'),'18dp'); root.set(a('paddingRight'),'18dp')
    root.set(a('paddingTop'),'12dp'); root.set(a('paddingBottom'),'10dp')
    cards={x.get(a('id')):x for x in root}
    wave=cards.get('@id/homemusic_wave_card'); mix=cards.get('@id/homemusic_mix_card')
    if wave is None or mix is None: raise RuntimeError('HomeMusic My Wave / Mix cards not found')
    wave.attrib.pop(a('id'),None)
    for k,v in {'layout_width':'match_parent','layout_height':'wrap_content','layout_weight':'0','layout_marginLeft':'0dp','layout_marginRight':'0dp','layout_marginTop':'0dp','layout_marginBottom':'0dp','foreground':'@android:color/transparent','clickable':'false','focusable':'false'}.items(): wave.set(a(k),v)
    for k,v in {'cardBackgroundColor':'#00000000','cardCornerRadius':'0dp','cardElevation':'0dp','strokeWidth':'0dp','strokeColor':'#00000000','rippleColor':'#00000000'}.items(): wave.set(p(k),v)
    content=list(wave)[0]; content.clear()
    for k,v in {'orientation':'vertical','gravity':'center','paddingLeft':'12dp','paddingRight':'12dp','paddingTop':'22dp','paddingBottom':'20dp','minHeight':'176dp','layout_width':'match_parent','layout_height':'wrap_content','background':'@android:color/transparent'}.items(): content.set(a(k),v)
    ET.SubElement(content,'TextView',{a('layout_width'):'match_parent',a('layout_height'):'wrap_content',a('gravity'):'center',a('text'):'@string/homemusic_wave_title',a('textColor'):'#ffffffff',a('textSize'):'29sp',a('fontFamily'):'sans-serif-black',a('textStyle'):'bold',a('letterSpacing'):'0.12',a('textAllCaps'):'true',a('maxLines'):'1',a('includeFontPadding'):'false'})
    button=ET.SubElement(content,'FrameLayout',{a('id'):'@id/homemusic_wave_card',a('layout_width'):'78dp',a('layout_height'):'78dp',a('layout_marginTop'):'17dp',a('layout_gravity'):'center',a('background'):'@drawable/aura_wave_play_button',a('foreground'):'?attr/selectableItemBackgroundBorderless',a('clickable'):'true',a('focusable'):'true',a('contentDescription'):'@string/home_title_radio_station',a('importantForAccessibility'):'no'})
    ET.SubElement(button,'ImageView',{a('layout_width'):'30dp',a('layout_height'):'30dp',a('layout_gravity'):'center',a('src'):'@drawable/aura_wave_play_icon',a('contentDescription'):'@null'})
    d=res/'drawable'; d.mkdir(parents=True,exist_ok=True)
    anim=res/'anim'; anim.mkdir(parents=True,exist_ok=True)
    (anim/'aura_wave_button_press.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<scale xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="110"
    android:fromXScale="1.0"
    android:toXScale="0.9"
    android:fromYScale="1.0"
    android:toYScale="0.9"
    android:pivotX="50%"
    android:pivotY="50%"
    android:repeatCount="1"
    android:repeatMode="reverse"/>
''',encoding='utf-8')
    (d/'aura_wave_pause_icon.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="32dp" android:height="32dp" android:viewportWidth="24" android:viewportHeight="24">
  <path android:fillColor="#ffffffff" android:pathData="M6.5,5H10V19H6.5Z M14,5H17.5V19H14Z"/>
</vector>
''',encoding='utf-8')
    mix.set(a('visibility'),'gone')
    save(t,f)

def patch_wave_button_behavior(decoded):
    helper=decoded/'smali/app/homemusic/AURAVersion.smali'
    h=helper.read_text(encoding='utf-8')
    marker='.super Ljava/lang/Object;'+chr(10)
    if h.count(marker)!=1: raise RuntimeError('AURAVersion superclass marker not found for My Wave state')
    for field in ('.field public static waveStarted:Z','.field public static wavePlaying:Z','.field public static waveButton:Landroid/view/View;'):
        if field not in h:
            h=h.replace(marker,marker+field+chr(10),1)
            marker=marker+field+chr(10)
    helper.write_text(h,encoding='utf-8')

    listener=decoded/'smali/app/homemusic/AURAWaveToggleClickListener.smali'
    listener.write_text('''.class public final Lapp/homemusic/AURAWaveToggleClickListener;
.super Ljava/lang/Object;
.implements Landroid/view/View$OnClickListener;

.field private final delegate:Landroid/view/View$OnClickListener;

.method public constructor <init>(Landroid/view/View$OnClickListener;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lapp/homemusic/AURAWaveToggleClickListener;->delegate:Landroid/view/View$OnClickListener;
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->pressAnimation(Landroid/view/View;)V
    sget-object v0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;
    if-eqz v0, :no_current_player
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->b()Lqi3;
    move-result-object v0
    if-eqz v0, :no_current_player
    invoke-interface {v0}, Lqi3;->a()Lgn2;
    move-result-object v1
    if-eqz v1, :no_current_player
    const/4 v1, 0x1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->waveStarted:Z
    invoke-interface {v0}, Lqi3;->h0()Z
    move-result v1
    if-eqz v1, :play_current
    const/4 v1, 0x0
    goto :dispatch_current
:play_current
    const/4 v1, 0x1
:dispatch_current
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {p1, v1}, Lapp/homemusic/AURAWaveToggleClickListener;->dispatchPlaybackKey(Landroid/view/View;Z)V
    return-void

:no_current_player
    sget-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    if-eqz v0, :launch_wave
    sget-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    xor-int/lit8 v1, v1, 0x1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {p1, v1}, Lapp/homemusic/AURAWaveToggleClickListener;->dispatchPlaybackKey(Landroid/view/View;Z)V
    return-void

:launch_wave
    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    iget-object v1, p0, Lapp/homemusic/AURAWaveToggleClickListener;->delegate:Landroid/view/View$OnClickListener;
    if-eqz v1, :done
    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
:done
    return-void
.end method

.method public static syncIcon(Landroid/view/View;)V
    .locals 5
    if-eqz p0, :sync_done
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    sget-boolean v2, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    if-eqz v2, :play_icon
    const-string v2, "aura_wave_pause_icon"
    goto :resolve_icon
:play_icon
    const-string v2, "aura_wave_play_icon"
:resolve_icon
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v3
    const-string v4, "drawable"
    invoke-virtual {v3, v2, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    move-result v4
    if-eqz v4, :sync_done
    move-object v2, p0
    check-cast v2, Landroid/view/ViewGroup;
    const/4 v3, 0x0
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    move-result-object v2
    instance-of v3, v2, Landroid/widget/ImageView;
    if-eqz v3, :sync_done
    check-cast v2, Landroid/widget/ImageView;
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V
:sync_done
    return-void
.end method

.method private static pressAnimation(Landroid/view/View;)V
    .locals 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2
    const-string v3, "aura_wave_button_press"
    const-string v4, "anim"
    invoke-virtual {v2, v3, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    move-result v4
    if-eqz v4, :animation_done
    invoke-static {v0, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
    move-result-object v4
    invoke-virtual {p0, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
:animation_done
    return-void
.end method

.method private static dispatchPlaybackKey(Landroid/view/View;Z)V
    .locals 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    move-result-object v0
    const-string v1, "audio"
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    move-result-object v0
    if-eqz v0, :dispatch_done
    check-cast v0, Landroid/media/AudioManager;
    const/16 v1, 0x7f
    if-eqz p1, :media_key_ready
    const/16 v1, 0x7e
:media_key_ready
    new-instance v2, Landroid/view/KeyEvent;
    const/4 v3, 0x0
    invoke-direct {v2, v3, v1}, Landroid/view/KeyEvent;-><init>(II)V
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V
    new-instance v2, Landroid/view/KeyEvent;
    const/4 v3, 0x1
    invoke-direct {v2, v3, v1}, Landroid/view/KeyEvent;-><init>(II)V
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V
:dispatch_done
    return-void
.end method
''',encoding='utf-8')

    observer=decoded/'smali/app/homemusic/AURAWavePlaybackListener.smali'
    observer.write_text('''.class public final Lapp/homemusic/AURAWavePlaybackListener;
.super Ljava/lang/Object;
.implements Loi3;

.field private static trackedPlayer:Lqi3;
.field private static observer:Loi3;
.field private final player:Lqi3;

.method public constructor <init>(Lqi3;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    return-void
.end method

.method public static attach(Lqi3;)V
    .locals 3
    if-eqz p0, :attach_done
    sget-object v0, Lapp/homemusic/AURAWavePlaybackListener;->trackedPlayer:Lqi3;
    if-ne v0, p0, :replace_observer
    invoke-static {p0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
:replace_observer
    if-eqz v0, :new_observer
    sget-object v1, Lapp/homemusic/AURAWavePlaybackListener;->observer:Loi3;
    if-eqz v1, :new_observer
    invoke-interface {v0, v1}, Lqi3;->r0(Loi3;)V
:new_observer
    new-instance v0, Lapp/homemusic/AURAWavePlaybackListener;
    invoke-direct {v0, p0}, Lapp/homemusic/AURAWavePlaybackListener;-><init>(Lqi3;)V
    sput-object v0, Lapp/homemusic/AURAWavePlaybackListener;->observer:Loi3;
    sput-object p0, Lapp/homemusic/AURAWavePlaybackListener;->trackedPlayer:Lqi3;
    invoke-interface {p0, v0}, Lqi3;->v(Loi3;)V
    invoke-static {p0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
:attach_done
    return-void
.end method

.method public static syncCurrent()V
    .locals 1
    sget-object v0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;
    if-eqz v0, :sync_current_done
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->b()Lqi3;
    move-result-object v0
    if-eqz v0, :sync_current_done
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
:sync_current_done
    return-void
.end method

.method public static syncFromPlayer(Lqi3;)V
    .locals 3
    if-eqz p0, :sync_done
    invoke-interface {p0}, Lqi3;->a()Lgn2;
    move-result-object v0
    if-eqz v0, :no_current_item
    const/4 v1, 0x1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->waveStarted:Z
    invoke-interface {p0}, Lqi3;->h0()Z
    move-result v1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :update_icon
:no_current_item
    const/4 v1, 0x0
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
:update_icon
    sget-object v2, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    if-eqz v2, :sync_done
    invoke-static {v2}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
:sync_done
    return-void
.end method

.method public V(Z)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public q(Z)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public v(I)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method

.method public t(ILgn2;)V
    .locals 1
    iget-object v0, p0, Lapp/homemusic/AURAWavePlaybackListener;->player:Lqi3;
    invoke-static {v0}, Lapp/homemusic/AURAWavePlaybackListener;->syncFromPlayer(Lqi3;)V
    return-void
.end method
''',encoding='utf-8')

    service=decoded/'smali/com/eddyizm/tempus/service/MediaService.smali'
    service_text=service.read_text(encoding='utf-8')
    service_anchor='''    invoke-interface {p1, v0}, Lqi3;->v(Loi3;)V

    .line 71'''
    service_replacement='''    invoke-interface {p1, v0}, Lqi3;->v(Loi3;)V

    invoke-static {p1}, Lapp/homemusic/AURAWavePlaybackListener;->attach(Lqi3;)V

    .line 71'''
    if service_text.count(service_anchor)!=1:
        raise RuntimeError('MediaService player-observer attachment point not found uniquely')
    service.write_text(service_text.replace(service_anchor,service_replacement,1),encoding='utf-8')

    circle=decoded/'smali/app/homemusic/AURAWaveCircleTouchListener.smali'
    circle.write_text('''.class public final Lapp/homemusic/AURAWaveCircleTouchListener;
.super Ljava/lang/Object;
.implements Landroid/view/View$OnTouchListener;

.field private tracking:Z

.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
    move-result v0
    if-nez v0, :not_down
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v1
    iput-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0

:not_down
    const/4 v1, 0x1
    if-ne v0, v1, :move_or_cancel
    iget-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v2
    and-int/2addr v1, v2
    const/4 v2, 0x0
    iput-boolean v2, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V
    if-eqz v1, :handled
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z
:handled
    const/4 v0, 0x1
    return v0

:move_or_cancel
    const/4 v1, 0x2
    if-ne v0, v1, :cancel
    iget-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v2
    and-int/2addr v1, v2
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0

:cancel
    const/4 v1, 0x0
    iput-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0
.end method

.method private static insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I
    move-result v0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I
    move-result v1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
    move-result v2
    int-to-float v2, v2
    const/high16 v3, 0x3f000000
    mul-float/2addr v2, v3
    int-to-float v4, v0
    mul-float/2addr v4, v3
    int-to-float v5, v1
    mul-float/2addr v5, v3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    move-result v6
    sub-float/2addr v6, v4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    move-result v7
    sub-float/2addr v7, v5
    mul-float/2addr v6, v6
    mul-float/2addr v7, v7
    add-float/2addr v6, v7
    mul-float v2, v2, v2
    cmpl-float v6, v6, v2
    if-lez v6, :inside
    const/4 v0, 0x0
    return v0
:inside
    const/4 v0, 0x1
    return v0
.end method
''',encoding='utf-8')

    f=decoded/'smali/cp1.smali'
    s=f.read_text(encoding='utf-8')
    method_start=s.index('.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;')
    method_end=s.index('.end method',method_start)
    method=s[method_start:method_end]
    if method.count('    .locals 76')!=1:
        raise RuntimeError('Expected cp1.H to declare exactly 76 local registers')
    if re.search(r'\bv(?:76|77|78|79)\b',method):
        raise RuntimeError('cp1.H already uses the proposed additional local registers')
    method=method.replace('    .locals 76','    .locals 77',1)
    old='''    new-instance v6, Lgo1;

    .line 1368
    .line 1369
    invoke-direct {v6, v0, v2}, Lgo1;-><init>(Lcp1;I)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V'''
    new='''    new-instance v6, Lgo1;

    .line 1368
    .line 1369
    invoke-direct {v6, v0, v2}, Lgo1;-><init>(Lcp1;I)V

    move/from16 v76, v7
    new-instance v7, Lapp/homemusic/AURAWaveToggleClickListener;
    invoke-direct {v7, v6}, Lapp/homemusic/AURAWaveToggleClickListener;-><init>(Landroid/view/View$OnClickListener;)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v8, Lapp/homemusic/AURAWaveCircleTouchListener;
    invoke-direct {v8}, Lapp/homemusic/AURAWaveCircleTouchListener;-><init>()V
    invoke-virtual {v5, v8}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sput-object v5, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    invoke-static {v5}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {}, Lapp/homemusic/AURAWavePlaybackListener;->syncCurrent()V
    move/from16 v7, v76'''
    if method.count(old)!=1:
        raise RuntimeError('My Wave click-listener insertion point was not found uniquely in cp1.H')
    method=method.replace(old,new,1)
    if method.count('move/from16 v76, v7')!=1 or method.count('move/from16 v7, v76')!=1:
        raise RuntimeError('cp1.H register save/restore validation failed')
    s=s[:method_start]+method+s[method_end:]
    f.write_text(s,encoding='utf-8')
def patch_wave_role_events(decoded):
    def replace_method(path, signature, replacement):
        source=path.read_text(encoding='utf-8')
        if source.count(signature)!=1:
            raise RuntimeError(f'{path.name}: expected one {signature} method')
        start=source.index(signature)
        end=source.index('.end method',start)+len('.end method')
        source=source[:start]+replacement+source[end:]
        path.write_text(source,encoding='utf-8')

    version=decoded/'smali/app/homemusic/AURAVersion.smali'
    text=version.read_text(encoding='utf-8')
    pending='.field public static wavePending:Z'
    if pending not in text:
        marker='.field public static waveButton:Landroid/view/View;'
        if text.count(marker)!=1:
            raise RuntimeError('AURAVersion waveButton field marker changed')
        text=text.replace(marker,marker+'\n'+pending,1)
        version.write_text(text,encoding='utf-8')

    click=decoded/'smali/app/homemusic/AURAWaveToggleClickListener.smali'
    click_method='''.method public onClick(Landroid/view/View;)V
    .locals 4
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->pressAnimation(Landroid/view/View;)V

    # A fresh process starts with waveStarted=false. The first tap on the
    # upper My Wave button must request a new wave, even if Media3 restored
    # the previous single track in the background.
    sget-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    if-nez v0, :toggle_existing

:launch_wave
    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePending:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    iget-object v1, p0, Lapp/homemusic/AURAWaveToggleClickListener;->delegate:Landroid/view/View$OnClickListener;
    if-eqz v1, :done
    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V
:done
    return-void

    # After a user has started My Wave or explicitly used the lower player,
    # the upper button becomes Play/Pause for the currently selected track.
:toggle_existing
    sget-object v0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;
    if-eqz v0, :no_current_item
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->b()Lqi3;
    move-result-object v0
    if-eqz v0, :no_current_item
    invoke-interface {v0}, Lqi3;->a()Lgn2;
    move-result-object v1
    if-eqz v1, :no_current_item
    invoke-interface {v0}, Lqi3;->h0()Z
    move-result v1
    if-eqz v1, :play_current
    const/4 v1, 0x0
    goto :dispatch_current
:play_current
    const/4 v1, 0x1
:dispatch_current
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    invoke-static {p1}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
    invoke-static {p1, v1}, Lapp/homemusic/AURAWaveToggleClickListener;->dispatchPlaybackKey(Landroid/view/View;Z)V
    return-void

:no_current_item
    # Keep the first request in flight, rather than firing "collecting My Wave"
    # again. If the player is really empty and no request is pending, restart.
    sget-boolean v0, Lapp/homemusic/AURAVersion;->wavePending:Z
    if-nez v0, :done
    const/4 v0, 0x0
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :launch_wave
.end method'''
    replace_method(click,'.method public onClick(Landroid/view/View;)V',click_method)

    observer=decoded/'smali/app/homemusic/AURAWavePlaybackListener.smali'
    sync_method='''.method public static syncFromPlayer(Lqi3;)V
    .locals 3
    if-eqz p0, :sync_done
    invoke-interface {p0}, Lqi3;->a()Lgn2;
    move-result-object v0
    if-eqz v0, :no_current_item
    invoke-interface {p0}, Lqi3;->h0()Z
    move-result v1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :update_icon

:no_current_item
    sget-boolean v1, Lapp/homemusic/AURAVersion;->wavePending:Z
    if-eqz v1, :player_empty
    const/4 v1, 0x1
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    goto :update_icon

:player_empty
    const/4 v1, 0x0
    sput-boolean v1, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    sput-boolean v1, Lapp/homemusic/AURAVersion;->waveStarted:Z

:update_icon
    sget-object v2, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    if-eqz v2, :sync_done
    invoke-static {v2}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
:sync_done
    return-void
.end method'''
    replace_method(observer,'.method public static syncFromPlayer(Lqi3;)V',sync_method)

    observer_text=observer.read_text(encoding='utf-8')
    helpers='''.method public static markBottomPlaybackInteraction()V
    .locals 1
    # The collapsed player header only exposes its Play/Pause toggle when a
    # media item exists. A real tap means the user chose the restored track.
    const/4 v0, 0x1
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    return-void
.end method

.method public static resetWaveState()V
    .locals 1
    const/4 v0, 0x0
    sput-boolean v0, Lapp/homemusic/AURAVersion;->waveStarted:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePending:Z
    sput-boolean v0, Lapp/homemusic/AURAVersion;->wavePlaying:Z
    sget-object v0, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    if-eqz v0, :reset_done
    invoke-static {v0}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V
:reset_done
    return-void
.end method

'''
    marker='.method public static syncCurrent()V'
    if observer_text.count(marker)!=1:
        raise RuntimeError('AURAWavePlaybackListener syncCurrent marker changed')
    if 'markBottomPlaybackInteraction()V' not in observer_text:
        observer_text=observer_text.replace(marker,helpers+marker,1)
    observer.write_text(observer_text,encoding='utf-8')

    # The real collapsed player Play/Pause click is handled by ti3 case 0.
    ti=decoded/'smali/ti3.smali'
    ti_text=ti.read_text(encoding='utf-8')
    ti_marker=':pswitch_4\n    invoke-static {}, Lu52;->c()Lv52;'
    if ti_text.count(ti_marker)!=1:
        raise RuntimeError('Collapsed player Play/Pause click handler marker changed')
    ti_text=ti_text.replace(ti_marker,':pswitch_4\n    invoke-static {}, Lapp/homemusic/AURAWavePlaybackListener;->markBottomPlaybackInteraction()V\n    invoke-static {}, Lu52;->c()Lv52;',1)
    ti.write_text(ti_text,encoding='utf-8')

    # BottomSheetBehavior STATE_HIDDEN (5) runs Lu52.f(), which stops the
    # player. Reset the upper My Wave role immediately afterward.
    wt=decoded/'smali/wt.smali'
    wt_text=wt.read_text(encoding='utf-8')
    method_start=wt_text.index('.method public final c(Landroid/view/View;I)V')
    hidden_marker='    :cond_0\n    invoke-static {}, Lu52;->f()V'
    hidden_at=wt_text.find(hidden_marker,method_start)
    if hidden_at<0:
        raise RuntimeError('Player sheet STATE_HIDDEN callback marker changed')
    wt_text=wt_text[:hidden_at]+wt_text[hidden_at:].replace(
        hidden_marker,
        '    :cond_0\n    invoke-static {}, Lu52;->f()V\n    invoke-static {}, Lapp/homemusic/AURAWavePlaybackListener;->resetWaveState()V',
        1
    )
    wt.write_text(wt_text,encoding='utf-8')


def patch_player_controls(res):
    specs={'inner_fragment_player_controller.xml':{'player_remote_toggle'},'player_header_bottom_sheet.xml':{'player_header_remote_button','placeholder_left_view'}}
    for fn,ids in specs.items():
        f=res/'layout'/fn;t=xml(f)
        for n in t.getroot().iter():
            if n.get(a('id')) in {'@id/'+x for x in ids}: n.set(a('visibility'),'gone')
        if fn=='player_header_bottom_sheet.xml':
            t.getroot().set(a('background'),'@drawable/aura_player_state_bg');t.getroot().set(a('addStatesFromChildren'),'true')
        save(t,f)
    for fn in ['inner_fragment_player_controller_layout.xml','player_body_bottom_sheet.xml']:
        f=res/'layout'/fn;t=xml(f);t.getroot().set(a('background'),'@drawable/aura_player_gradient');save(t,f)
    f=res/'layout/player_header_bottom_sheet.xml';t=xml(f);t.getroot().set(a('background'),'@drawable/aura_player_state_bg');t.getroot().set(a('addStatesFromChildren'),'true');save(t,f)
def patch_toolbar(res):
    f=res/'layout/fragment_toolbar.xml';t=xml(f)
    for n in t.getroot().iter():
        tag=n.tag.split('}')[-1]
        if tag=='ImageView' and n.get(a('background'))=='@drawable/ic_toolbar_tempo': n.set(a('background'),'@drawable/aura_logo');n.set(a('layout_width'),'38dp');n.set(a('layout_height'),'38dp');n.set(a('layout_marginTop'),'11dp');n.set(a('layout_marginEnd'),'8dp')
        if tag=='MaterialToolbar': n.set(a('background'),'@drawable/aura_toolbar_gradient')
        if tag=='TextView' and n.get(a('text'))=='@string/app_name': n.set(a('textSize'),'22sp');n.set(a('fontFamily'),'sans-serif-medium')
    save(t,f)

def patch_home_animation_lifecycle(decoded):
    helper=decoded/'smali/app/homemusic/AURAHomeAnimation.smali'
    helper.write_text('''.class public final Lapp/homemusic/AURAHomeAnimation;
.super Ljava/lang/Object;

.method public static stop(Lkc1;)V
    .locals 2
    iget-object v0, p0, Lkc1;->T:Landroid/view/View;
    if-eqz v0, :clear_wave_view
    const v1, 0x7f0a0263
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    move-result-object v0
    if-eqz v0, :clear_wave_view
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    move-result-object v0
    instance-of v1, v0, Landroid/graphics/drawable/AnimationDrawable;
    if-eqz v1, :clear_wave_view
    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V
:clear_wave_view
    const/4 v0, 0x0
    sput-object v0, Lapp/homemusic/AURAVersion;->waveButton:Landroid/view/View;
    return-void
.end method
''',encoding='utf-8')
    f=decoded/'smali/cp1.smali'
    source=f.read_text(encoding='utf-8')
    signature='.method public final J()V'
    if source.count(signature)!=1:
        raise RuntimeError('Home fragment view-destroyed callback is missing')
    start=source.index(signature)
    end=source.index('.end method',start)
    method=source[start:end]
    call='    invoke-static {p0}, Lapp/homemusic/AURAHomeAnimation;->stop(Lkc1;)V'
    if call not in method:
        marker='    .locals 1'
        if method.count(marker)!=1:
            raise RuntimeError('Home view cleanup local-register marker changed')
        method=method.replace(marker,marker+'\n\n'+call,1)
        source=source[:start]+method+source[end:]
        f.write_text(source,encoding='utf-8')


def patch_home_scroll_background(res):
    f=res/'layout/fragment_home_tab_music.xml'; t=xml(f)
    root=t.getroot(); root.set(a('background'),'@drawable/aura_aurora_background')
    child=root.find('LinearLayout')
    if child is not None:
        child.set(a('paddingTop'),'8dp')
        child.set(a('background'),'@android:color/transparent')
    save(t,f)


def patch_smali(decoded):
    f=decoded/'smali/cp1.smali';s=f.read_text(encoding='utf-8')
    pattern=re.compile(r'(?s)    invoke-virtual \{v1, v0\}, Landroid/view/ViewGroup;->indexOfChild\(Landroid/view/View;\)I\s+\.line 1425\s+\.line 1426\s+\.line 1427\s+move-result v0\s+\.line 1428\s+add-int/2addr v0, v7\s+\.line 1429\s+invoke-virtual \{v1, v2, v0\}, Landroid/view/ViewGroup;->addView\(Landroid/view/View;I\)V')
    repl='''    const/4 v0, 0x0
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;
    move-result-object v14
    const v15, 0x7f0a0263
    invoke-virtual {v14, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    move-result-object v14
    if-eqz v14, :cond_aura_animation_done
    invoke-virtual {v14}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    move-result-object v14
    instance-of v15, v14, Landroid/graphics/drawable/AnimationDrawable;
    if-eqz v15, :cond_aura_animation_done
    check-cast v14, Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual {v14}, Landroid/graphics/drawable/AnimationDrawable;->start()V
    :cond_aura_animation_done'''
    s,n=pattern.subn(repl,s,count=1)
    if n!=1: raise RuntimeError('Unable to locate original My Wave insertion point in cp1.smali')
    f.write_text(s,encoding='utf-8')

def version(decoded):
    f=decoded/'apktool.yml'
    s=f.read_text(encoding='utf-8')
    s=re.sub(r'(?m)^  versionCode: .*?$','  versionCode: 7501',s)
    s=re.sub(r'(?m)^  versionName: .*?$','  versionName: "v0.75-1"',s)
    f.write_text(s,encoding='utf-8')

def main():
    if len(sys.argv)<2: raise SystemExit('Usage: patch_aura.py decoded [logo.png]')
    decoded=Path(sys.argv[1]).resolve(); root=Path(__file__).resolve().parents[1]; logo=Path(sys.argv[2]).resolve() if len(sys.argv)>2 else root/'assets/aura_logo.png';res=decoded/'res'
    if not (decoded/'AndroidManifest.xml').exists(): raise SystemExit('Input is not a decoded APK')
    colors(res/'values/colors.xml',{
      'md_theme_light_background':'#fff7f7fc','md_theme_light_onBackground':'#ff191922','md_theme_light_surface':'#fffcfbff','md_theme_light_onSurface':'#ff191922','md_theme_light_surfaceVariant':'#fff0eef6','md_theme_light_onSurfaceVariant':'#ff625f72','md_theme_light_primary':'#ff6652d9','md_theme_light_onPrimary':'#ffffffff','md_theme_light_primaryContainer':'#ffe9e5ff','md_theme_light_onPrimaryContainer':'#ff21154f','md_theme_light_secondary':'#ff007f89','md_theme_light_onSecondary':'#ffffffff','md_theme_light_secondaryContainer':'#ffd1f5f5','md_theme_light_onSecondaryContainer':'#ff00363d','md_theme_light_tertiary':'#ffc64b78','md_theme_light_onTertiary':'#ffffffff','md_theme_light_tertiaryContainer':'#ffffdbe8','md_theme_light_onTertiaryContainer':'#ff4e102e','md_theme_light_outline':'#ff7d7788','dividerColor':'#ffe6e2f0','titleTextColor':'#ff191922','subtitleTextColor':'#ff666477','hub_background':'#ff111320','hub_text':'#fff5f2ff','homemusic_danger':'#ffce486d','widget_icon_tint_active':'#ff6652d9'})
    colors(res/'values/colors.xml',{'md_theme_dark_background':'#ff0d0e18','md_theme_dark_onBackground':'#fff4f1ff','md_theme_dark_surface':'#ff131522','md_theme_dark_onSurface':'#fff4f1ff','md_theme_dark_surfaceVariant':'#ff272839','md_theme_dark_onSurfaceVariant':'#ffb9b5cf','md_theme_dark_primary':'#ffbdadff','md_theme_dark_onPrimary':'#ff241858','md_theme_dark_primaryContainer':'#ff382f6d','md_theme_dark_onPrimaryContainer':'#fff0eaff','md_theme_dark_secondary':'#ff79d9df','md_theme_dark_onSecondary':'#ff00363d','md_theme_dark_secondaryContainer':'#ff15464d','md_theme_dark_onSecondaryContainer':'#ffb9f7fb','md_theme_dark_tertiary':'#ffff9fc3','md_theme_dark_onTertiary':'#ff4e102e','md_theme_dark_tertiaryContainer':'#ff643148','md_theme_dark_onTertiaryContainer':'#ffffdbe8','md_theme_dark_outline':'#ffaaa5bc'})
    if (res/'values-night/colors.xml').exists(): colors(res/'values-night/colors.xml',{'dividerColor':'#ff343448','titleTextColor':'#fff4f1ff','subtitleTextColor':'#ffb9b5cf','widget_bg':'#e51a1b2d','widget_icon_tint':'#ffffffff','widget_icon_tint_active':'#ffbdadff','widget_subtitle':'#ffc6c2d8','widget_title':'#ffffffff'})
    strings(res);login_refs=patch_login_server(decoded);drawables(res);generate_aurora(res);create_player_state_drawables(res);patch_logo(res,logo);patch_vectors(res);patch_theme(res);patch_bottom_nav_resources(res);patch_aura_islands(res);patch_initial_preferences(res);patch_main_menu(res);patch_toolbar_menu_null_guard(decoded);patch_about_settings(res,decoded);patch_hub_preferences(res);patch_hub_defaults(decoded);patch_hub_native_ui(res);patch_search_ui(res);patch_search_to_hub(decoded);patch_github_updater(decoded);patch_updater_redirects(decoded);patch_updater_external_asset(decoded);patch_hub_web_background(decoded);patch_screen_backgrounds(res);patch_toolbar(res);patch_home_mix_layout(res);patch_wave_button_behavior(decoded);patch_wave_role_events(decoded);patch_player_controls(res);patch_smali(decoded);patch_home_animation_lifecycle(decoded);patch_home_scroll_background(res);version(decoded)
    manifest=(decoded/'AndroidManifest.xml').read_text(encoding='utf-8')
    if 'package="app.homemusic"' not in manifest: raise RuntimeError('HomeMusic package ID changed')
    for file,ids in {'layout/fragment_homemusic_login.xml':['hm_login_server','hm_login_primary','hm_login_code','hm_login_google'],'layout/fragment_home_tab_music.xml':['home_discover_sector','home_similar_tracks_sector','home_radio_artist_sector']}.items():
        text=(res/file).read_text(encoding='utf-8')
        for ident in ids:
            if '@id/'+ident not in text: raise RuntimeError(f'Missing original ID: {file} / {ident}')
    if 'http://192.168.1.129:4533' not in (decoded/'smali/fo1.smali').read_text(encoding='utf-8'): raise RuntimeError('Local HomeMusic server default not patched')
    if 'https://146.103.112.215:8444' in ''.join(x.read_text(encoding='utf-8') for x in decoded.rglob('*.smali')): raise RuntimeError('Old public HomeMusic server URL remains in smali')
    menu=(res/'menu/main_page_menu.xml').read_text(encoding='utf-8')
    if 'media_route_menu_item' not in menu or 'android:visible="false"' not in menu or '@id/action_search' not in menu: raise RuntimeError('Hidden MediaRoute item / visible search action layout is incorrect')
    toolbar=(decoded/'smali/com/eddyizm/tempus/ui/fragment/ToolbarFragment.smali').read_text(encoding='utf-8')
    if 'if-eqz v0, :cond_0' not in toolbar: raise RuntimeError('ToolbarFragment null guard is missing')
    about_xml=(res/'xml/global_preferences.xml').read_text(encoding='utf-8')
    if 'settings_support_summary' in about_xml or 'undraw_thanks' in about_xml or 'undraw_page' in about_xml: raise RuntimeError('Support/unDraw preferences were not fully removed')
    version_smali=(decoded/'smali/vb4.smali').read_text(encoding='utf-8')
    if '1.14.7' in version_smali or 'AURA 0.4' in version_smali or 'Lapp/homemusic/AURAVersion;->versionName' not in version_smali or 'Lapp/homemusic/AURAVersion;->versionCodeInt' in version_smali: raise RuntimeError('About/HomeMusic settings must display versionName only; versionCode must not be shown')
    ru_strings=(res/'values-ru/strings.xml').read_text(encoding='utf-8')
    base_strings=(res/'values/strings.xml').read_text(encoding='utf-8')
    if 'https://github.com/PlayInSpirits/HomeMusic-Fork' not in ru_strings: raise RuntimeError('AURA GitHub link is not set in Russian strings')
    if 'AURA (HomeMusic)' not in ru_strings and 'AURA (HomeMusic)' not in base_strings: raise RuntimeError('HomeMusic settings category was not renamed to AURA')
    prefs=(res/'xml/global_preferences.xml').read_text(encoding='utf-8')
    pref_root=xml(res/'xml/global_preferences.xml').getroot()
    pref_children=list(pref_root)
    about_category=next((node for node in pref_children if node.get(p('title'))=='@string/settings_about_title'),None)
    if about_category is None or pref_children.index(about_category)+1>=len(pref_children) or pref_children[pref_children.index(about_category)+1].get(a('key'))!='homemusic_check_update':
        raise RuntimeError('Check for updates must be directly below About')
    if prefs.count('http://192.168.1.129:8080')<2: raise RuntimeError('Both Hub preference defaults are not present')
    defaults=(decoded/'smali/com/eddyizm/tempus/homemusic/HomeDefaults.smali').read_text(encoding='utf-8')
    if defaults.count('http://192.168.1.129:8080')!=2: raise RuntimeError('One-time Hub URL migration is incomplete')
    if 'Theme.Material3.Dark.NoActionBar' not in (res/'values/styles.xml').read_text(encoding='utf-8'): raise RuntimeError('Dark AURA theme was not applied')
    apktool_text=(decoded/'apktool.yml').read_text(encoding='utf-8')
    if 'versionCode: 7501' not in apktool_text or 'versionName: "v0.75-1"' not in apktool_text:
        raise RuntimeError('AURA v0.75-1 manifest version is not set')
    updater=(decoded/'smali/com/eddyizm/tempus/homemusic/HubUpdater.smali').read_text(encoding='utf-8')
    if '1.14.7' in updater or '0x2b' in updater or updater.count('Lapp/homemusic/AURAVersion;->versionCode')!=2:
        raise RuntimeError('GitHub updater still contains original HomeMusic version constants')
    updater_method=updater[updater.index('.method private static final updateHttp_delegate$lambda$0()Lo83;'):updater.index('.end method',updater.index('.method private static final updateHttp_delegate$lambda$0()Lo83;'))]
    if 'const/4 v1, 0x1' not in updater_method or 'iput-boolean v1, v0, Ln83;->i:Z' not in updater_method or 'iput-boolean v1, v0, Ln83;->j:Z' not in updater_method:
        raise RuntimeError('AURA updater must follow HTTP and HTTPS redirects')
    rr1_text=(decoded/'smali/rr1.smali').read_text(encoding='utf-8')
    if 'https://raw.githubusercontent.com/PlayInSpirits/HomeMusic-Fork/main' not in rr1_text or '"/app/latest.json"' not in rr1_text:
        raise RuntimeError('GitHub latest.json update feed is not configured')
    feed_method=rr1_text[rr1_text.index('.method public static final n()Lcom/eddyizm/tempus/homemusic/HubAppRelease;'):rr1_text.index('.end method',rr1_text.index('.method public static final n()Lcom/eddyizm/tempus/homemusic/HubAppRelease;'))]
    if 'const/4 v2, 0x1' not in feed_method or 'iput-boolean v2, v1, Ln83;->i:Z' not in feed_method or 'iput-boolean v2, v1, Ln83;->j:Z' not in feed_method:
        raise RuntimeError('AURA GitHub latest.json HTTP client must follow redirects')
    hub_smali=(decoded/'smali/com/eddyizm/tempus/homemusic/HubFragment.smali').read_text(encoding='utf-8')
    if '__AURA_HUB_STYLE__' not in hub_smali or 'auraHubEnter' not in hub_smali:
        raise RuntimeError('AURA Hub styling and animations were not installed')
    if 'nav[aria-label="Разделы"]{display:none!important}' in hub_smali:
        raise RuntimeError('Hub sub-navigation must stay visible')
    if 'aura_contact_author' not in about_xml or 'https://t.me/Play_in_Spirits' not in ru_strings:
        raise RuntimeError('Telegram contact preference is missing')
    if 'aura_upstream_project' not in about_xml or 'Оригинальное приложение HomeMusic' not in ru_strings or 'https://github.com/justman-1/HomeMusic-public' not in ru_strings:
        raise RuntimeError('Renamed clickable original HomeMusic link is missing from About')
    menu_tree=xml(res/'menu/main_page_menu.xml').getroot()
    menu_ids=[node.get(a('id')) for node in list(menu_tree)]
    if menu_ids.index('@id/action_settings') < menu_ids.index('@id/action_search'):
        raise RuntimeError('Settings action is not rightmost in the toolbar')
    search_layout=(res/'layout/fragment_search.xml').read_text(encoding='utf-8')
    if 'hideNavigationIcon' not in search_layout or 'ic_arrow_back' not in search_layout or 'aura_home_background' not in search_layout:
        raise RuntimeError('AURA SearchView back navigation and dark background are missing')
    if 'aura-assistant-composer' not in hub_smali or 'removeCatalogShortcuts' not in hub_smali or 'keepTabsVisible' not in hub_smali:
        raise RuntimeError('Hub Assistant composer, Catalog shortcuts or navigation restoration are missing')
    if 'pendingSearch' not in (decoded/'smali/app/homemusic/AURAVersion.smali').read_text(encoding='utf-8') or 'const p1, 0x7f0a02ed' not in (decoded/'smali/com/eddyizm/tempus/ui/fragment/ToolbarFragment.smali').read_text(encoding='utf-8'):
        raise RuntimeError('Main search is not routed to the Hub catalog')
    wave_helper=(decoded/'smali/app/homemusic/AURAVersion.smali').read_text(encoding='utf-8')
    wave_click=(decoded/'smali/app/homemusic/AURAWaveToggleClickListener.smali').read_text(encoding='utf-8')
    if 'waveStarted:Z' not in wave_helper or 'wavePending:Z' not in wave_helper or 'wavePlaying:Z' not in wave_helper or 'if-nez v0, :toggle_existing' not in wave_click or 'dispatchMediaKeyEvent' not in wave_click or 'MediaService;->b()Lqi3;' not in wave_click or 'Lqi3;->a()Lgn2;' not in wave_click or 'Lqi3;->h0()Z' not in wave_click:
        raise RuntimeError('My Wave must start from the upper button only once, then become Play/Pause')
    playback_sync=(decoded/'smali/app/homemusic/AURAWavePlaybackListener.smali').read_text(encoding='utf-8')
    service_smali=(decoded/'smali/com/eddyizm/tempus/service/MediaService.smali').read_text(encoding='utf-8')
    if 'Lapp/homemusic/AURAWavePlaybackListener;->attach(Lqi3;)V' not in service_smali or 'Lqi3;->h0()Z' not in playback_sync or 'AURAVersion;->waveButton:Landroid/view/View;' not in playback_sync or 'markBottomPlaybackInteraction()V' not in playback_sync or 'resetWaveState()V' not in playback_sync:
        raise RuntimeError('Media3 observer is missing lower-button and dismissed-sheet playback roles')
    sync_method=playback_sync[playback_sync.index('.method public static syncFromPlayer(Lqi3;)V'):playback_sync.index('.end method',playback_sync.index('.method public static syncFromPlayer(Lqi3;)V'))]
    restored_start_write=re.search(
        r'const/4\s+(v\d+),\s*0x1\s+sput-boolean\s+\1,\s*Lapp/homemusic/AURAVersion;->waveStarted:Z',
        sync_method)
    if restored_start_write:
        raise RuntimeError('Restored Media3 items must not automatically mark My Wave as started')
    player_empty_label=re.search(r'(?m)^[ \t]*:player_empty[ \t]*\r?$',sync_method)
    if not player_empty_label:
        raise RuntimeError('Media3 player-empty state branch is missing')
    update_icon_tail=sync_method[player_empty_label.end():]
    update_icon_label=re.search(r'(?m)^[ \t]*:update_icon[ \t]*\r?$',update_icon_tail)
    if not update_icon_label:
        raise RuntimeError('Media3 player-empty state branch has no update target')
    player_empty_block=update_icon_tail[:update_icon_label.start()]
    if 'const/4 v1, 0x0' not in player_empty_block or 'sput-boolean v1, Lapp/homemusic/AURAVersion;->waveStarted:Z' not in player_empty_block:
        raise RuntimeError('An empty Media3 player must clear My Wave started state')
    ti3_text=(decoded/'smali/ti3.smali').read_text(encoding='utf-8')
    wt_text=(decoded/'smali/wt.smali').read_text(encoding='utf-8')
    if 'markBottomPlaybackInteraction()V' not in ti3_text or 'resetWaveState()V' not in wt_text:
        raise RuntimeError('Lower Play/Pause click or player-sheet dismissal hook is missing')
    circle_touch=(decoded/'smali/app/homemusic/AURAWaveCircleTouchListener.smali').read_text(encoding='utf-8')
    cp1_text=(decoded/'smali/cp1.smali').read_text(encoding='utf-8')
    cp1_method=cp1_text[cp1_text.index('.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;'):cp1_text.index('.end method',cp1_text.index('.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;'))]
    if 'AURAWavePlaybackListener;->syncCurrent()V' not in cp1_method or 'AURAVersion;->waveButton:Landroid/view/View;' not in cp1_method:
        raise RuntimeError('My Wave view does not synchronize immediately after being created')
    if 'insideCircle' not in circle_touch or 'performClick()Z' not in circle_touch or 'setOnTouchListener' not in cp1_method:
        raise RuntimeError('My Wave must accept taps only inside the circular button')
    if '    .locals 77' not in cp1_method or 'move/from16 v76, v7' not in cp1_method or 'move/from16 v7, v76' not in cp1_method:
        raise RuntimeError('My Wave listener must preserve and restore cp1.H register v7')
    wave_layout=(res/'layout/homemusic_home_mixes.xml').read_text(encoding='utf-8')
    if 'android:id="@id/homemusic_wave_card"' not in wave_layout or 'android:clickable="false"' not in wave_layout or not (res/'drawable/aura_wave_pause_icon.xml').exists():
        raise RuntimeError('My Wave click target must be the round button and include a pause icon')
    home_animation=(decoded/'smali/app/homemusic/AURAHomeAnimation.smali').read_text(encoding='utf-8')
    home_j=cp1_text[cp1_text.index('.method public final J()V'):cp1_text.index('.end method',cp1_text.index('.method public final J()V'))]
    if 'AnimationDrawable;->stop()V' not in home_animation or 'AURAHomeAnimation;->stop(Lkc1;)V' not in home_j:
        raise RuntimeError('Home aurora animation must stop and release its view when the Home fragment is destroyed')
    nav_layout=(res/'layout/activity_main.xml').read_text(encoding='utf-8')
    if 'android:layout_height="76dp"' not in nav_layout or 'aura_bottom_nav_tint' not in nav_layout or 'android:layout_marginBottom="22dp"' not in nav_layout or 'itemIconSize="28dp"' not in nav_layout or 'labelVisibilityMode="unlabeled"' not in nav_layout or 'AURA.BottomNavigation.ActiveIndicator' not in nav_layout:
        raise RuntimeError('Bottom navigation must use visible icons, hidden labels, and the raised island position')
    nav_bg=(res/'drawable/aura_bottom_nav_island.xml').read_text(encoding='utf-8')
    if '#ee22283e' not in nav_bg or '#ee19434a' not in nav_bg:
        raise RuntimeError('AURA bottom navigation must retain its dark modern capsule background')
    nav_menu=(res/'menu/bottom_nav_menu.xml').read_text(encoding='utf-8')
    if any(name not in nav_menu for name in ('aura_nav_home','aura_nav_library','aura_nav_hub','aura_nav_download')):
        raise RuntimeError('Custom AURA bottom navigation icons are incomplete')
    if not all((res/'drawable-nodpi'/f'aura_nav_{name}.png').exists() for name in ('home','library','hub','download')):
        raise RuntimeError('One or more visible raster bottom navigation icons are missing')
    for menu_file in ('menu/bottom_nav_menu.xml','menu-land/bottom_nav_menu.xml'):
        menu_path=res/menu_file
        if menu_path.exists():
            menu_root=xml(menu_path).getroot()
            for menu_item in menu_root:
                if not menu_item.get(a('title')) or not menu_item.get(p('contentDescription')):
                    raise RuntimeError(f'{menu_file}: bottom navigation must retain accessible titles and descriptions')
    indicator_style=(res/'values/styles.xml').read_text(encoding='utf-8')
    if 'AURA.BottomNavigation.ActiveIndicator' not in indicator_style or 'labelVisibilityMode="unlabeled"' not in nav_layout:
        raise RuntimeError('Modern icon-only bottom navigation style is incomplete')
    landscape_nav=res/'layout-land/activity_main.xml'
    if landscape_nav.exists():
        landscape_text=landscape_nav.read_text(encoding='utf-8')
        if 'unlabeled' not in landscape_text or 'itemIconSize="28dp"' not in landscape_text:
            raise RuntimeError('Landscape bottom navigation must use icon-only 28dp icons')
    aurora=(res/'drawable/aura_aurora_background.xml').read_text(encoding='utf-8')
    if 'android:duration="240"' not in aurora or aurora.count('<item')<30 or aurora.count('<item')>=60:
        raise RuntimeError('Optimized My Wave aurora animation must contain 30 frames')

    if (res/'drawable/ic_splash_logo.xml').exists() or not (res/'drawable-nodpi/ic_splash_logo.png').exists():
        raise RuntimeError('Old HomeMusic splash logo is still present or AURA splash image is missing')
    if (res/'drawable/ic_launcher_monochrome.xml').exists() or not (res/'drawable-nodpi/ic_launcher_monochrome.png').exists():
        raise RuntimeError('Old launcher monochrome artwork is still present or AURA icon is missing')
    if not (res/'drawable-nodpi/ic_launcher_foreground.png').exists() or not (root/'assets/aura_logo_144.png').exists():
        raise RuntimeError('AURA launcher / README logo export is missing')
    if not all((root/'assets/icons'/f'aura-{size}.png').exists() for size in (24,32,36,48,72,96,144,192,256,512)):
        raise RuntimeError('One or more AURA icon size exports are missing')

    hub_layout=(res/'layout/fragment_hub.xml').read_text(encoding='utf-8')
    if 'tabIndicatorAnimationMode' not in hub_layout or 'aura_hub_tabs_background' not in hub_layout:
        raise RuntimeError('Native Hub tabs are not using AURA styling')

    print(f'AURA v0.75-1: raster Material 3 bottom navigation, separate My Wave startup from native Play/Pause, reset on dismissed player, reduced aurora rendering work ({login_refs} login references).')
if __name__=='__main__': main()
