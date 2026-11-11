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
    changes={'app_name':'AURA','homemusic_login_title':'AURA','homemusic_wave_subtitle':'Музыка, которая звучит в твоём ритме','homemusic_login_server_helper':'Это локальный сервер, если нужно - замени на свой глобальный сервер','homemusic_login_server_bad':'Это не адрес сервера: например, http://192.168.1.129:4533','homemusic_settings_hub_url_dialog':'Адрес Хаба через интернет: http://192.168.1.129:8080','homemusic_settings_hub_local_url_dialog':'Домашний адрес Хаба по Wi-Fi: http://192.168.1.129:8080'}
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

def generate_aurora(res,count=60):
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
    items='\n'.join(f' <item android:drawable="@drawable/aura_aurora_{i:02d}" android:duration="50" />' for i in range(count))
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
      'settings_version_summary':'AURA 0.6-1',
      'settings_version_title':'AURA version',
      'homemusic_settings_title':'AURA (HomeMusic)',
      'aura_contact_author_title':'Contact the fork author',
      'aura_contact_author_summary':'Telegram: Play_in_Spirits',
      'aura_contact_author_link':'https://t.me/Play_in_Spirits'
    }
    ru_values={
      'settings_about_summary':'AURA — независимый Android-форк клиента HomeMusic.',
      'settings_about_title':'О приложении',
      'settings_github_link':'https://github.com/PlayInSpirits/HomeMusic-Fork',
      'settings_github_summary':'Исходный код и релизы AURA',
      'settings_github_title':'GitHub',
      'settings_version_summary':'AURA 0.6-1',
      'settings_version_title':'Версия AURA',
      'homemusic_settings_title':'AURA (HomeMusic)',
      'aura_contact_author_title':'Связаться с автором форка',
      'aura_contact_author_summary':'Telegram: Play_in_Spirits',
      'aura_contact_author_link':'https://t.me/Play_in_Spirits'
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
    s=replace_once(s,'    const/16 v0, 0x2b','''    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v0
    invoke-static {v0}, Lapp/homemusic/AURAVersion;->versionCodeInt(Landroid/content/Context;)I
    move-result v0''','HomeMusic settings versionCode')
    s=replace_once(s,'const-string v2, "1.14.7"','''invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v2
    invoke-static {v2}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v2''','HomeMusic settings versionName')
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
    'body{font-family:system-ui,-apple-system,Roboto,sans-serif!important;padding-bottom:calc(112px + env(safe-area-inset-bottom))!important}',
    'main{padding:14px 14px calc(152px + env(safe-area-inset-bottom))!important;background:transparent!important;min-height:100vh}',
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
    '.aura-assistant-composer{position:sticky!important;bottom:calc(104px + env(safe-area-inset-bottom))!important;z-index:30!important;margin-top:14px!important;padding:12px!important;background:rgba(17,18,34,.97)!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;backdrop-filter:blur(18px)!important;box-shadow:0 -8px 26px rgba(0,0,0,.32)!important}',
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
    if (!/catalog/.test(routeText())) return;
    var labels = /^(моя волна|микс дня|my wave|daily mix)$/i;
    document.querySelectorAll('button,a,[role="button"]').forEach(function (el) {
      var label = (el.innerText || el.textContent || '').replace(/\s+/g,' ').trim();
      if (!labels.test(label)) return;
      var card = el.closest('article,[data-slot="card"],.card,[class*="Card"]') || el;
      card.style.setProperty('display','none','important');
    });
  }
  function liftAssistantComposer() {
    if (!/assistant/.test(routeText())) return;
    document.querySelectorAll('button,a,[role="button"]').forEach(function (el) {
      var label = (el.innerText || el.textContent || '').replace(/\s+/g,' ').trim();
      if (!/(сообщени[ея] ассистенту|написать ассистенту|send.*assistant|message.*assistant)/i.test(label)) return;
      el.classList.add('aura-assistant-action');
      var shell = el.closest('form') || el.parentElement;
      if (shell) shell.classList.add('aura-assistant-composer');
    });
    var input = document.querySelector('textarea[placeholder],input[placeholder]');
    if (input) {
      var form = input.closest('form') || input.parentElement;
      if (form) form.classList.add('aura-assistant-composer');
    }
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
    root.set(a('orientation'),'vertical'); root.set(a('paddingLeft'),'16dp'); root.set(a('paddingRight'),'16dp'); root.set(a('paddingTop'),'18dp'); root.set(a('paddingBottom'),'14dp')
    cards={x.get(a('id')):x for x in root}; wave=cards.get('@id/homemusic_wave_card'); mix=cards.get('@id/homemusic_mix_card')
    if wave is None or mix is None: raise RuntimeError('HomeMusic My Wave / Mix cards not found')
    for k,v in {'layout_width':'match_parent','layout_height':'wrap_content','layout_weight':'0','layout_marginLeft':'0dp','layout_marginRight':'0dp','layout_marginTop':'0dp','layout_marginBottom':'0dp','foreground':'?attr/selectableItemBackground'}.items(): wave.set(a(k),v)
    for k,v in {'cardBackgroundColor':'#ff18182a','cardCornerRadius':'28dp','cardElevation':'0dp','strokeWidth':'1dp','strokeColor':'#4dffffff','rippleColor':'#33ffffff'}.items(): wave.set(p(k),v)
    content=list(wave)[0]
    for k,v in {'orientation':'horizontal','gravity':'center_vertical','padding':'22dp','minHeight':'164dp','background':'@drawable/aura_aurora_background'}.items(): content.set(a(k),v)
    content.clear()
    for k,v in {'orientation':'horizontal','gravity':'center_vertical','padding':'22dp','minHeight':'164dp','layout_width':'match_parent','layout_height':'wrap_content','background':'@drawable/aura_aurora_background'}.items(): content.set(a(k),v)
    ET.SubElement(content,'ImageView',{a('layout_width'):'54dp',a('layout_height'):'54dp',a('src'):'@drawable/aura_logo',a('contentDescription'):'@string/homemusic_wave_title',a('importantForAccessibility'):'no',a('layout_marginEnd'):'16dp'})
    col=ET.SubElement(content,'LinearLayout',{a('orientation'):'vertical',a('layout_width'):'0dp',a('layout_height'):'wrap_content',a('layout_weight'):'1',a('gravity'):'center_vertical'})
    ET.SubElement(col,'TextView',{a('layout_width'):'match_parent',a('layout_height'):'wrap_content',a('text'):'@string/homemusic_wave_title',a('textColor'):'#ffffffff',a('textSize'):'23sp',a('fontFamily'):'sans-serif-medium',a('letterSpacing'):'0.01',a('maxLines'):'1'})
    ET.SubElement(col,'TextView',{a('layout_width'):'match_parent',a('layout_height'):'wrap_content',a('layout_marginTop'):'5dp',a('text'):'@string/homemusic_wave_subtitle',a('textColor'):'#d9ffffff',a('textSize'):'13sp',a('maxLines'):'2',a('ellipsize'):'end'})
    ET.SubElement(content,'ImageView',{a('layout_width'):'26dp',a('layout_height'):'26dp',a('src'):'@drawable/aura_arrow_right',a('contentDescription'):'@string/homemusic_wave_title',a('layout_marginStart'):'8dp'})
    mix.set(a('visibility'),'gone'); save(t,f)
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
def patch_home_scroll_background(res):
    f=res/'layout/fragment_home_tab_music.xml';t=xml(f)
    t.getroot().set(a('background'),'@drawable/aura_home_background')
    child=t.getroot().find('LinearLayout')
    if child is not None: child.set(a('paddingTop'),'4dp')
    save(t,f)
def patch_smali(decoded):
    f=decoded/'smali/cp1.smali';s=f.read_text(encoding='utf-8')
    pattern=re.compile(r'(?s)    invoke-virtual \{v1, v0\}, Landroid/view/ViewGroup;->indexOfChild\(Landroid/view/View;\)I\s+\.line 1425\s+\.line 1426\s+\.line 1427\s+move-result v0\s+\.line 1428\s+add-int/2addr v0, v7\s+\.line 1429\s+invoke-virtual \{v1, v2, v0\}, Landroid/view/ViewGroup;->addView\(Landroid/view/View;I\)V')
    repl='''    const/4 v0, 0x0
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
    check-cast v2, Landroid/view/ViewGroup;
    move-object/from16 v70, v2
    const/16 v71, 0x0
    invoke-virtual/range {v70 .. v71}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    move-result-object v70
    check-cast v70, Landroid/view/ViewGroup;
    const/16 v71, 0x0
    invoke-virtual/range {v70 .. v71}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
    move-result-object v70
    invoke-virtual/range {v70 .. v70}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    move-result-object v70
    move-object/from16 v14, v70
    instance-of v15, v14, Landroid/graphics/drawable/AnimationDrawable;
    if-eqz v15, :cond_aura_animation_done
    check-cast v14, Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual/range {v14 .. v14}, Landroid/graphics/drawable/AnimationDrawable;->start()V
    :cond_aura_animation_done'''
    s,n=pattern.subn(repl,s,count=1)
    if n!=1: raise RuntimeError('Unable to locate original My Wave insertion point in cp1.smali')
    f.write_text(s,encoding='utf-8')
def version(decoded):
    f=decoded/'apktool.yml';s=f.read_text(encoding='utf-8');s=re.sub(r'(?m)^  versionCode: .*?$','  versionCode: 601',s);s=re.sub(r'(?m)^  versionName: .*?$','  versionName: "0.6-1"',s);f.write_text(s,encoding='utf-8')

def main():
    if len(sys.argv)<2: raise SystemExit('Usage: patch_aura.py decoded [logo.png]')
    decoded=Path(sys.argv[1]).resolve(); root=Path(__file__).resolve().parents[1]; logo=Path(sys.argv[2]).resolve() if len(sys.argv)>2 else root/'assets/aura_logo.png';res=decoded/'res'
    if not (decoded/'AndroidManifest.xml').exists(): raise SystemExit('Input is not a decoded APK')
    colors(res/'values/colors.xml',{
      'md_theme_light_background':'#fff7f7fc','md_theme_light_onBackground':'#ff191922','md_theme_light_surface':'#fffcfbff','md_theme_light_onSurface':'#ff191922','md_theme_light_surfaceVariant':'#fff0eef6','md_theme_light_onSurfaceVariant':'#ff625f72','md_theme_light_primary':'#ff6652d9','md_theme_light_onPrimary':'#ffffffff','md_theme_light_primaryContainer':'#ffe9e5ff','md_theme_light_onPrimaryContainer':'#ff21154f','md_theme_light_secondary':'#ff007f89','md_theme_light_onSecondary':'#ffffffff','md_theme_light_secondaryContainer':'#ffd1f5f5','md_theme_light_onSecondaryContainer':'#ff00363d','md_theme_light_tertiary':'#ffc64b78','md_theme_light_onTertiary':'#ffffffff','md_theme_light_tertiaryContainer':'#ffffdbe8','md_theme_light_onTertiaryContainer':'#ff4e102e','md_theme_light_outline':'#ff7d7788','dividerColor':'#ffe6e2f0','titleTextColor':'#ff191922','subtitleTextColor':'#ff666477','hub_background':'#ff111320','hub_text':'#fff5f2ff','homemusic_danger':'#ffce486d','widget_icon_tint_active':'#ff6652d9'})
    colors(res/'values/colors.xml',{'md_theme_dark_background':'#ff0d0e18','md_theme_dark_onBackground':'#fff4f1ff','md_theme_dark_surface':'#ff131522','md_theme_dark_onSurface':'#fff4f1ff','md_theme_dark_surfaceVariant':'#ff272839','md_theme_dark_onSurfaceVariant':'#ffb9b5cf','md_theme_dark_primary':'#ffbdadff','md_theme_dark_onPrimary':'#ff241858','md_theme_dark_primaryContainer':'#ff382f6d','md_theme_dark_onPrimaryContainer':'#fff0eaff','md_theme_dark_secondary':'#ff79d9df','md_theme_dark_onSecondary':'#ff00363d','md_theme_dark_secondaryContainer':'#ff15464d','md_theme_dark_onSecondaryContainer':'#ffb9f7fb','md_theme_dark_tertiary':'#ffff9fc3','md_theme_dark_onTertiary':'#ff4e102e','md_theme_dark_tertiaryContainer':'#ff643148','md_theme_dark_onTertiaryContainer':'#ffffdbe8','md_theme_dark_outline':'#ffaaa5bc'})
    if (res/'values-night/colors.xml').exists(): colors(res/'values-night/colors.xml',{'dividerColor':'#ff343448','titleTextColor':'#fff4f1ff','subtitleTextColor':'#ffb9b5cf','widget_bg':'#e51a1b2d','widget_icon_tint':'#ffffffff','widget_icon_tint_active':'#ffbdadff','widget_subtitle':'#ffc6c2d8','widget_title':'#ffffffff'})
    strings(res);login_refs=patch_login_server(decoded);drawables(res);generate_aurora(res);create_player_state_drawables(res);patch_logo(res,logo);patch_vectors(res);patch_theme(res);patch_main_menu(res);patch_toolbar_menu_null_guard(decoded);patch_about_settings(res,decoded);patch_hub_preferences(res);patch_hub_defaults(decoded);patch_hub_native_ui(res);patch_search_ui(res);patch_github_updater(decoded);patch_hub_web_background(decoded);patch_screen_backgrounds(res);patch_toolbar(res);patch_home_mix_layout(res);patch_player_controls(res);patch_smali(decoded);patch_home_scroll_background(res);version(decoded)
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
    if '1.14.7' in version_smali or 'AURA 0.4' in version_smali or 'Lapp/homemusic/AURAVersion;->versionName' not in version_smali or 'Lapp/homemusic/AURAVersion;->versionCodeInt' not in version_smali: raise RuntimeError('About/HomeMusic settings must read PackageInfo dynamically')
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
    if 'versionCode: 601' not in apktool_text or 'versionName: "0.6-1"' not in apktool_text:
        raise RuntimeError('AURA 0.6-1 manifest version is not set')
    updater=(decoded/'smali/com/eddyizm/tempus/homemusic/HubUpdater.smali').read_text(encoding='utf-8')
    if '1.14.7' in updater or '0x2b' in updater or updater.count('Lapp/homemusic/AURAVersion;->versionCode')!=2:
        raise RuntimeError('GitHub updater still contains original HomeMusic version constants')
    rr1_text=(decoded/'smali/rr1.smali').read_text(encoding='utf-8')
    if 'https://raw.githubusercontent.com/PlayInSpirits/HomeMusic-Fork/main' not in rr1_text or '"/app/latest.json"' not in rr1_text:
        raise RuntimeError('GitHub latest.json update feed is not configured')
    hub_smali=(decoded/'smali/com/eddyizm/tempus/homemusic/HubFragment.smali').read_text(encoding='utf-8')
    if '__AURA_HUB_STYLE__' not in hub_smali or 'auraHubEnter' not in hub_smali:
        raise RuntimeError('AURA Hub styling and animations were not installed')
    if 'nav[aria-label="Разделы"]{display:none!important}' in hub_smali:
        raise RuntimeError('Hub sub-navigation must stay visible')
    if 'aura_contact_author' not in about_xml or 'https://t.me/Play_in_Spirits' not in ru_strings:
        raise RuntimeError('Telegram contact preference is missing')
    menu_tree=xml(res/'menu/main_page_menu.xml').getroot()
    menu_ids=[node.get(a('id')) for node in list(menu_tree)]
    if menu_ids.index('@id/action_settings') < menu_ids.index('@id/action_search'):
        raise RuntimeError('Settings action is not rightmost in the toolbar')
    search_layout=(res/'layout/fragment_search.xml').read_text(encoding='utf-8')
    if 'hideNavigationIcon' not in search_layout or 'ic_arrow_back' not in search_layout or 'aura_home_background' not in search_layout:
        raise RuntimeError('AURA SearchView back navigation and dark background are missing')
    if 'aura-assistant-composer' not in hub_smali or 'removeCatalogShortcuts' not in hub_smali or 'keepTabsVisible' not in hub_smali:
        raise RuntimeError('Hub Assistant composer, Catalog shortcuts or navigation restoration are missing')
    aurora=(res/'drawable/aura_aurora_background.xml').read_text(encoding='utf-8')
    if 'android:duration="50"' not in aurora or aurora.count('<item')<60:
        raise RuntimeError('Dynamic My Wave aurora animation is incomplete')

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

    print(f'AURA 0.6-1: dynamic PackageInfo versionName/versionCode; GitHub latest.json update feed; Telegram contact in About; Settings action moved right of Search; Hub tabs, Assistant composer and Catalog use unified styling; SearchView has an explicit back arrow; My Wave uses a multi-phase aurora animation; MediaRoute item hidden and null-guarded; Hub URLs, login, authentication, playback and My Wave preserved ({login_refs} login references).')
if __name__=='__main__': main()