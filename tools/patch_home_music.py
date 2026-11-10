#!/usr/bin/env python3
"""UI-only patch for the official HomeMusic 1.14.7 Apktool tree."""
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

A = "http://schemas.android.com/apk/res/android"
APP = "http://schemas.android.com/apk/res-auto"
ET.register_namespace("android", A)
ET.register_namespace("app", APP)
root = Path(sys.argv[1] if len(sys.argv) > 1 else "decoded")
res = root / "res"

def load(path):
    return ET.parse(path)

def save(tree, path):
    tree.write(path, encoding="utf-8", xml_declaration=True)

def colors(path, updates):
    tree = load(path)
    found = set()
    for node in tree.getroot().findall("color"):
        name = node.get("name")
        if name in updates:
            node.text = updates[name]
            found.add(name)
    missing = set(updates) - found
    if missing:
        raise RuntimeError(f"Missing colors in {path}: {sorted(missing)}")
    save(tree, path)

def style(path, name, updates):
    tree = load(path)
    node = next((x for x in tree.getroot().findall("style") if x.get("name") == name), None)
    if node is None:
        raise RuntimeError(f"Missing style {name} in {path}")
    for key, value in updates.items():
        item = next((x for x in node.findall("item") if x.get("name") == key), None)
        if item is None:
            item = ET.SubElement(node, "item", {"name": key})
        item.text = value
    save(tree, path)

def android(node, name, value):
    node.set(f"{{{A}}}{name}", value)

def app(node, name, value):
    node.set(f"{{{APP}}}{name}", value)

colors(res / "values/colors.xml", {
    "md_theme_light_background":"#fff6f4f7",
    "md_theme_light_error":"#ffb3263f",
    "md_theme_light_errorContainer":"#ffffd9df",
    "md_theme_light_inverseOnSurface":"#fff7eff2",
    "md_theme_light_inverseSurface":"#ff2c252c",
    "md_theme_light_onBackground":"#ff211e24",
    "md_theme_light_onError":"#ffffffff",
    "md_theme_light_onErrorContainer":"#ff410b16",
    "md_theme_light_onPrimary":"#ffffffff",
    "md_theme_light_onPrimaryContainer":"#ff400c18",
    "md_theme_light_onSecondary":"#ffffffff",
    "md_theme_light_onSecondaryContainer":"#ff261b25",
    "md_theme_light_onSurface":"#ff211e24",
    "md_theme_light_onSurfaceVariant":"#ff625c66",
    "md_theme_light_onTertiary":"#ffffffff",
    "md_theme_light_onTertiaryContainer":"#ff241b3e",
    "md_theme_light_outline":"#ff837982",
    "md_theme_light_primary":"#ffea465e",
    "md_theme_light_primaryContainer":"#ffffdbe1",
    "md_theme_light_primaryInverse":"#ffffa0ad",
    "md_theme_light_secondary":"#ff705b67",
    "md_theme_light_secondaryContainer":"#fff4e1e9",
    "md_theme_light_surface":"#fffcf9fb",
    "md_theme_light_surfaceVariant":"#fff0eaf0",
    "md_theme_light_tertiary":"#ff705ca9",
    "md_theme_light_tertiaryContainer":"#ffe9ddff",
    "homemusic_danger":"#ffca394b",
    "hub_background":"#ff111116",
    "hub_text":"#fff5f1f6",
    "dividerColor":"#ffe8e2e9",
    "subtitleTextColor":"#ff706975",
    "titleTextColor":"#ff201d23",
    "widget_icon_tint_active":"#ffea465e",
    "md_theme_amoled_outline":"#ff493c46",
    "md_theme_amoled_surfaceVariant":"#ff18151b",
    "md_theme_dark_background":"#ff101015",
    "md_theme_dark_error":"#ffffb3ba",
    "md_theme_dark_errorContainer":"#ff8e2439",
    "md_theme_dark_inverseOnSurface":"#ff19171d",
    "md_theme_dark_inverseSurface":"#fff1eaf0",
    "md_theme_dark_onBackground":"#fff2edf3",
    "md_theme_dark_onError":"#ff690e25",
    "md_theme_dark_onErrorContainer":"#ffffd9df",
    "md_theme_dark_onPrimary":"#ff530b1b",
    "md_theme_dark_onPrimaryContainer":"#ffffdbe1",
    "md_theme_dark_onSecondary":"#ff3b2e38",
    "md_theme_dark_onSecondaryContainer":"#fff4e1e9",
    "md_theme_dark_onSurface":"#fff2edf3",
    "md_theme_dark_onSurfaceVariant":"#ffc3bac5",
    "md_theme_dark_onTertiary":"#ff36285e",
    "md_theme_dark_onTertiaryContainer":"#ffe9ddff",
    "md_theme_dark_outline":"#ff948a95",
    "md_theme_dark_primary":"#ffff7d91",
    "md_theme_dark_primaryContainer":"#ff7d273a",
    "md_theme_dark_primaryInverse":"#ffea465e",
    "md_theme_dark_secondary":"#ffe2c4d2",
    "md_theme_dark_secondaryContainer":"#ff55414c",
    "md_theme_dark_surface":"#ff19171d",
    "md_theme_dark_surfaceVariant":"#ff2a2730",
    "md_theme_dark_tertiary":"#ffccbcfa",
    "md_theme_dark_tertiaryContainer":"#ff4e407c",
})
colors(res / "values-night/colors.xml", {
    "dividerColor":"#ff3a343e",
    "homemusic_danger":"#ffff8b9a",
    "lyricsTextColor":"#ffe7e0e9",
    "shadowsLyricsTextColor":"#ff514956",
    "subtitleTextColor":"#ffb4aab7",
    "titleTextColor":"#fff4eff5",
    "widget_bg":"#e51a171e",
    "widget_icon_tint":"#ffffffff",
    "widget_subtitle":"#ffcbbfcd",
    "widget_title":"#ffffffff",
})
style(res / "values/styles.xml", "HeadlineSmall", {
    "android:textSize":"24.0sp", "android:textStyle":"bold"
})
style(res / "values/styles.xml", "TitleLarge", {
    "android:textSize":"22.0sp", "android:textStyle":"bold"
})
style(res / "values/styles.xml", "TitleMedium", {
    "android:textSize":"15.0sp", "android:textStyle":"bold"
})
style(res / "values/styles.xml", "TitleSmall", {"android:textSize":"13.0sp"})
style(res / "values/styles.xml", "HomeMusicLoginField", {
    "boxCornerRadiusTopStart":"18.0dip",
    "boxCornerRadiusTopEnd":"18.0dip",
    "boxCornerRadiusBottomStart":"18.0dip",
    "boxCornerRadiusBottomEnd":"18.0dip",
    "boxStrokeWidth":"1.0dip",
    "boxStrokeWidthFocused":"2.0dip",
})

login = res / "layout/fragment_homemusic_login.xml"
tree = load(login)
lr = tree.getroot()
android(lr, "background", "@drawable/hm_login_background")
for node in lr.iter():
    tag = node.tag.split("}")[-1]
    rid = node.get(f"{{{A}}}id", "")
    if tag == "LinearLayout" and not rid and node in list(lr):
        android(node, "paddingTop", "32.0dip")
        android(node, "paddingBottom", "28.0dip")
        android(node, "paddingStart", "20.0dip")
        android(node, "paddingEnd", "20.0dip")
    if tag == "ImageView" and node.get(f"{{{A}}}src") == "@mipmap/ic_launcher":
        android(node, "layout_width", "80.0dip")
        android(node, "layout_height", "80.0dip")
    if rid in ("@id/hm_login_server_step", "@id/hm_login_account_step"):
        android(node, "background", "@drawable/hm_login_card")
        android(node, "padding", "16.0dip")
        android(node, "layout_marginTop", "8.0dip")
    if rid in ("@id/hm_login_primary", "@id/hm_login_google"):
        app(node, "cornerRadius", "18.0dip")
        android(node, "insetTop", "0.0dip")
        android(node, "insetBottom", "0.0dip")
save(tree, login)

mixes = res / "layout/homemusic_home_mixes.xml"
tree = load(mixes)
for node in tree.getroot().iter():
    rid = node.get(f"{{{A}}}id", "")
    if rid == "@id/homemusic_wave_card":
        app(node, "cardBackgroundColor", "?colorPrimaryContainer")
        app(node, "cardCornerRadius", "20.0dip")
        app(node, "cardElevation", "0.0dip")
    elif rid == "@id/homemusic_mix_card":
        app(node, "cardBackgroundColor", "?colorSecondaryContainer")
        app(node, "cardCornerRadius", "20.0dip")
        app(node, "cardElevation", "0.0dip")
    elif node.tag.split("}")[-1] == "LinearLayout" and node.get(f"{{{A}}}minHeight") == "104.0dip":
        android(node, "padding", "16.0dip")
        android(node, "minHeight", "116.0dip")
    elif node.tag.split("}")[-1] == "ImageView" and node.get(f"{{{A}}}src") in ("@drawable/ic_homemusic_wave", "@drawable/ic_playlist"):
        android(node, "layout_width", "30.0dip")
        android(node, "layout_height", "30.0dip")
    elif rid == "@id/homemusic_mix_play":
        app(node, "tint", "?colorOnSecondaryContainer")
save(tree, mixes)

drawable = res / "drawable"
drawable.mkdir(parents=True, exist_ok=True)
(drawable / "hm_login_background.xml").write_text(
    '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <gradient android:type="linear" android:angle="270" android:startColor="?attr/colorSurfaceVariant" android:centerColor="?attr/colorBackground" android:endColor="?attr/colorSurface" />
</shape>
''', encoding="utf-8")
(drawable / "hm_login_card.xml").write_text(
    '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="?attr/colorSurface" />
    <corners android:radius="26dp" />
    <stroke android:width="1dp" android:color="?attr/colorOutlineVariant" />
</shape>
''', encoding="utf-8")

# HomeDefaults changes only the default accent preference, not app logic.
smali = root / "smali/com/eddyizm/tempus/homemusic/HomeDefaults.smali"
content = smali.read_text(encoding="utf-8")
if "HEX:#1ED760" not in content:
    raise RuntimeError("Original HomeMusic default accent not found in HomeDefaults.smali")
smali.write_text(content.replace("HEX:#1ED760", "HEX:#FF5266", 1), encoding="utf-8")

for required in ("hm_login_server", "hm_login_user", "hm_login_password", "hm_login_code",
                 "hm_login_primary", "hm_login_google", "hm_login_email_switch", "hm_login_switch"):
    if f"@id/{required}" not in login.read_text(encoding="utf-8"):
        raise RuntimeError(f"Missing original login view ID: {required}")
for required in ("homemusic_wave_card", "homemusic_mix_card", "homemusic_mix_play"):
    if f"@id/{required}" not in mixes.read_text(encoding="utf-8"):
        raise RuntimeError(f"Missing original home view ID: {required}")
print("HomeMusic UI patch applied; original auth and music view IDs preserved.")
