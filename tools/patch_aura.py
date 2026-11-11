#!/usr/bin/env python3
from __future__ import annotations
import math, re, shutil, sys, xml.etree.ElementTree as ET
from pathlib import Path

A='http://schemas.android.com/apk/res/android'; P='http://schemas.android.com/apk/res-auto'
ET.register_namespace('android', A); ET.register_namespace('app', P)
def a(k): return '{%s}%s'%(A,k)
def p(k): return '{%s}%s'%(P,k)
def xml(path): return ET.parse(path)
def save(tree,path): tree.write(path,encoding='utf-8',xml_declaration=True)
def colors(path, values):
    t=xml(path); nodes={x.get('name'):x for x in t.getroot().findall('color')}
    for k,v in values.items():
        n=nodes.get(k)
        if n is None: n=ET.SubElement(t.getroot(),'color',{'name':k})
        n.text=v
    save(t,path)
def strings(res):
    changes={'app_name':'AURA','homemusic_login_title':'AURA','homemusic_wave_subtitle':'Музыка, которая звучит в твоём ритме','homemusic_login_server_helper':'Это локальный сервер, если нужно - замени на свой глобальный сервер','homemusic_login_server_bad':'Это не адрес сервера: например, http://192.168.1.129:4533'}
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

def generate_aurora(res,count=48):
    import numpy as np
    from PIL import Image,ImageFilter
    d=res/'drawable-nodpi'; d.mkdir(parents=True,exist_ok=True)
    w,h=480,230; yy,xx=np.mgrid[0:h,0:w].astype(np.float32); xx/=w-1; yy/=h-1
    base=np.zeros((h,w,3),np.float32); base[:]=[18,18,34]
    palette=[(104,72,224),(220,66,142),(22,166,190),(244,132,82)]
    for f in range(count):
        phase=2*math.pi*f/count; image=base.copy()
        blobs=[(.22+.13*math.sin(phase),.36+.10*math.cos(phase*.8),.36,.78,palette[0]),(.76+.10*math.cos(phase+1.2),.55+.11*math.sin(phase*1.1),.34,.82,palette[1]),(.52+.13*math.sin(phase+2.1),.12+.10*math.cos(phase*.7),.28,.48,palette[2]),(.92-.08*math.sin(phase+.4),.88+.05*math.cos(phase),.26,.56,palette[3])]
        for cx,cy,sx,sy,c in blobs:
            glow=np.exp(-(((xx-cx)/sx)**2+((yy-cy)/sy)**2)*3)*.72
            image+=glow[...,None]*np.array(c,np.float32)[None,None,:]
        vignette=np.clip(1-.25*(((xx-.5)/.75)**2+((yy-.5)/.85)**2),.58,1); image*=vignette[...,None]
        Image.fromarray(np.clip(image,0,255).astype('uint8'),'RGB').filter(ImageFilter.GaussianBlur(1.2)).save(d/f'aura_aurora_{f:02d}.png',optimize=True)
        # A light pastel version is used for the player so dark text remains readable.
        light=np.zeros((h,w,3),np.float32); light[:]=[246,244,253]
        pblobs=[(.22+.13*math.sin(phase),.36+.10*math.cos(phase*.8),.36,.78,(164,145,255)),(.76+.10*math.cos(phase+1.2),.55+.11*math.sin(phase*1.1),.34,.82,(255,164,194)),(.52+.13*math.sin(phase+2.1),.12+.10*math.cos(phase*.7),.28,.48,(127,218,226)),(.92-.08*math.sin(phase+.4),.88+.05*math.cos(phase),.26,.56,(255,207,164))]
        for cx,cy,sx,sy,c in pblobs:
            glow=np.exp(-(((xx-cx)/sx)**2+((yy-cy)/sy)**2)*3)*.23
            light+=glow[...,None]*np.array(c,np.float32)[None,None,:]
        Image.fromarray(np.clip(light,0,255).astype('uint8'),'RGB').filter(ImageFilter.GaussianBlur(1.2)).save(d/f'aura_player_aurora_{f:02d}.png',optimize=True)
    items='\n'.join(f' <item android:drawable="@drawable/aura_aurora_{i:02d}" android:duration="66" />' for i in range(count))
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
    'aura_home_background.xml':'<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#fff9f7ff" android:centerColor="#fff5f6fc" android:endColor="#fff0f9fa"/></shape>',
    'aura_toolbar_gradient.xml':'<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="0" android:startColor="#fffaf9ff" android:endColor="#fff2fafb"/></shape>',
    'aura_player_gradient.xml':'<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#fff7f4ff" android:centerColor="#fff0f9fb" android:endColor="#fffff4f7"/></shape>',
    'aura_arrow_right.xml':'<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="24dp" android:height="24dp" android:viewportWidth="24" android:viewportHeight="24"><path android:fillColor="#ffffffff" android:pathData="M5,11h11.2l-4.9,-4.9L12.7,4.7 20,12l-7.3,7.3 -1.4,-1.4 4.9,-4.9H5z"/></vector>',
    'aura_player_state_bg.xml':'<animated-selector xmlns:android="http://schemas.android.com/apk/res/android"><item android:id="@+id/aura_player_idle" android:drawable="@drawable/aura_player_gradient"/><item android:id="@+id/aura_player_playing" android:state_checked="true" android:drawable="@drawable/aura_player_gradient"/><transition android:fromId="@id/aura_player_idle" android:toId="@id/aura_player_playing" android:drawable="@drawable/aura_player_play_transition"/><transition android:fromId="@id/aura_player_playing" android:toId="@id/aura_player_idle" android:drawable="@drawable/aura_player_pause_transition"/></animated-selector>'}
    for n,x in files.items(): (d/n).write_text('<?xml version="1.0" encoding="utf-8"?>\n'+x,encoding='utf-8')
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
    from PIL import Image
    d=res/'drawable-nodpi'; d.mkdir(exist_ok=True)
    shutil.copy2(logo,d/'aura_logo.png'); shutil.copy2(logo,d/'ic_toolbar_tempo.png')
    im=Image.open(logo).convert('RGBA'); im.thumbnail((148,148),Image.Resampling.LANCZOS)
    launcher=Image.new('RGBA',(224,224),(0,0,0,0)); launcher.alpha_composite(im,((224-im.width)//2,(224-im.height)//2)); launcher.save(d/'ic_launcher_foreground.png',optimize=True)
    for n in ['ic_toolbar_tempo.xml','ic_launcher_foreground.xml']:
        f=res/'drawable'/n
        if f.exists(): f.unlink()
    (res/'drawable/ic_launcher_background.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>\n<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle"><gradient android:type="linear" android:angle="315" android:startColor="#ff35246e" android:centerColor="#ff17162b" android:endColor="#ff062a38"/></shape>''',encoding='utf-8')
    (res/'drawable/ic_launcher_monochrome.xml').write_text('''<?xml version="1.0" encoding="utf-8"?>\n<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="108dp" android:height="108dp" android:viewportWidth="108" android:viewportHeight="108"><path android:fillColor="#ffffffff" android:pathData="M17,57c9,0 9,-11 18,-11s9,11 18,11 9,-11 18,-11 9,11 18,11v10c-9,0 -9,-11 -18,-11s-9,11 -18,11 -9,-11 -18,-11 -9,11 -18,11zM17,77c9,0 9,-11 18,-11s9,11 18,11 9,-11 18,-11 9,11 18,11v10c-9,0 -9,-11 -18,-11s-9,11 -18,11 -9,-11 -18,-11 -9,11 -18,11z"/></vector>''',encoding='utf-8')
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
    f=decoded/'apktool.yml';s=f.read_text(encoding='utf-8');s=re.sub(r'(?m)^  versionCode: .*?$','  versionCode: 300',s);s=re.sub(r'(?m)^  versionName: .*?$','  versionName: "0.3"',s);f.write_text(s,encoding='utf-8')

def main():
    if len(sys.argv)<2: raise SystemExit('Usage: patch_aura.py decoded [logo.png]')
    decoded=Path(sys.argv[1]).resolve(); root=Path(__file__).resolve().parents[1]; logo=Path(sys.argv[2]).resolve() if len(sys.argv)>2 else root/'assets/aura_logo.png';res=decoded/'res'
    if not (decoded/'AndroidManifest.xml').exists(): raise SystemExit('Input is not a decoded APK')
    colors(res/'values/colors.xml',{
      'md_theme_light_background':'#fff7f7fc','md_theme_light_onBackground':'#ff191922','md_theme_light_surface':'#fffcfbff','md_theme_light_onSurface':'#ff191922','md_theme_light_surfaceVariant':'#fff0eef6','md_theme_light_onSurfaceVariant':'#ff625f72','md_theme_light_primary':'#ff6652d9','md_theme_light_onPrimary':'#ffffffff','md_theme_light_primaryContainer':'#ffe9e5ff','md_theme_light_onPrimaryContainer':'#ff21154f','md_theme_light_secondary':'#ff007f89','md_theme_light_onSecondary':'#ffffffff','md_theme_light_secondaryContainer':'#ffd1f5f5','md_theme_light_onSecondaryContainer':'#ff00363d','md_theme_light_tertiary':'#ffc64b78','md_theme_light_onTertiary':'#ffffffff','md_theme_light_tertiaryContainer':'#ffffdbe8','md_theme_light_onTertiaryContainer':'#ff4e102e','md_theme_light_outline':'#ff7d7788','dividerColor':'#ffe6e2f0','titleTextColor':'#ff191922','subtitleTextColor':'#ff666477','hub_background':'#ff111320','hub_text':'#fff5f2ff','homemusic_danger':'#ffce486d','widget_icon_tint_active':'#ff6652d9'})
    colors(res/'values/colors.xml',{'md_theme_dark_background':'#ff0d0e18','md_theme_dark_onBackground':'#fff4f1ff','md_theme_dark_surface':'#ff131522','md_theme_dark_onSurface':'#fff4f1ff','md_theme_dark_surfaceVariant':'#ff272839','md_theme_dark_onSurfaceVariant':'#ffb9b5cf','md_theme_dark_primary':'#ffbdadff','md_theme_dark_onPrimary':'#ff241858','md_theme_dark_primaryContainer':'#ff382f6d','md_theme_dark_onPrimaryContainer':'#fff0eaff','md_theme_dark_secondary':'#ff79d9df','md_theme_dark_onSecondary':'#ff00363d','md_theme_dark_secondaryContainer':'#ff15464d','md_theme_dark_onSecondaryContainer':'#ffb9f7fb','md_theme_dark_tertiary':'#ffff9fc3','md_theme_dark_onTertiary':'#ff4e102e','md_theme_dark_tertiaryContainer':'#ff643148','md_theme_dark_onTertiaryContainer':'#ffffdbe8','md_theme_dark_outline':'#ffaaa5bc'})
    if (res/'values-night/colors.xml').exists(): colors(res/'values-night/colors.xml',{'dividerColor':'#ff343448','titleTextColor':'#fff4f1ff','subtitleTextColor':'#ffb9b5cf','widget_bg':'#e51a1b2d','widget_icon_tint':'#ffffffff','widget_icon_tint_active':'#ffbdadff','widget_subtitle':'#ffc6c2d8','widget_title':'#ffffffff'})
    strings(res);login_refs=patch_login_server(decoded);drawables(res);generate_aurora(res);create_player_state_drawables(res);patch_logo(res,logo);patch_vectors(res);patch_toolbar(res);patch_home_mix_layout(res);patch_player_controls(res);patch_smali(decoded);patch_home_scroll_background(res);version(decoded)
    manifest=(decoded/'AndroidManifest.xml').read_text(encoding='utf-8')
    if 'package="app.homemusic"' not in manifest: raise RuntimeError('HomeMusic package ID changed')
    for file,ids in {'layout/fragment_homemusic_login.xml':['hm_login_server','hm_login_primary','hm_login_code','hm_login_google'],'layout/fragment_home_tab_music.xml':['home_discover_sector','home_similar_tracks_sector','home_radio_artist_sector']}.items():
        text=(res/file).read_text(encoding='utf-8')
        for ident in ids:
            if '@id/'+ident not in text: raise RuntimeError(f'Missing original ID: {file} / {ident}')
    if 'http://192.168.1.129:4533' not in (decoded/'smali/fo1.smali').read_text(encoding='utf-8'): raise RuntimeError('Local HomeMusic server default not patched')
    if 'https://146.103.112.215:8444' in ''.join(x.read_text(encoding='utf-8') for x in decoded.rglob('*.smali')): raise RuntimeError('Old public HomeMusic server URL remains in smali')
    print(f'AURA 0.3: HomeMusic UI rebrand and aurora theme applied; login default changed to http://192.168.1.129:4533 ({login_refs} references); My Wave promoted, Mix of Day and remote-play controls hidden; network/auth code otherwise preserved.')
if __name__=='__main__': main()