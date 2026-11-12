package com.eddyizm.tempus.homemusic;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import defpackage.h12;
import defpackage.pp3;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HomeDefaults extends ContentProvider {
    public static final int[] n = null;

    static {
        n = new int[]{2048, 1024};
    }

    public HomeDefaults() {
    }

    public static final boolean a(SharedPreferences r1, String r2, Object r3) {
        if (r1.contains(r2) == true) goto L5;
        return true;
    L5:
        if (h12.c(r1.getAll().get(r2), r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        r1.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r1) {
        r1.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        r1.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context r15 = getContext();
        if (r15 != null) goto L5;
        return true;
    L5:
        int r2 = 0;
        SharedPreferences r1 = r15.getSharedPreferences(pp3.b(r15), 0);
        int r4 = r1.getInt("homemusic_defaults_version", 0);
        if (r4 < 6) goto L8;
        return true;
    L8:
        SharedPreferences.Editor r6 = r1.edit();
        if (r4 >= 2) goto L24;
        Boolean r8 = Boolean.TRUE;
        if (a(r1, "dynamic_color_accent", r8) == false) goto L16;
        if (a(r1, "color_accent", "DYNAMIC") == false) goto L16;
        r6.putBoolean("dynamic_color_accent", false);
        r6.putString("color_accent", "HEX:#1ED760");
    L16:
        if (a(r1, "dark_theme_black", Boolean.FALSE) == false) goto L19;
        r6.putBoolean("dark_theme_black", true);
    L19:
        if (a(r1, "podcast_section_visibility", r8) == false) goto L22;
        r6.putBoolean("podcast_section_visibility", false);
    L22:
        if (a(r1, "radio_section_visibility", r8) == false) goto L24;
        r6.putBoolean("radio_section_visibility", false);
    L24:
        Integer r10 = null;
        if (r4 >= 3) goto L33;
        if (a(r1, "precache_tracks_count", "0") == false) goto L30;
        r6.putString("precache_tracks_count", "3");
    L30:
        if (a(r1, "precache_wifi_only", Boolean.TRUE) == false) goto L37;
        r6.putBoolean("precache_wifi_only", false);
    L37:
        if (r4 >= 6) goto L54;
        File r5 = r15.getExternalFilesDir(null);
        if (r5 != null) goto L41;
        r5 = r15.getFilesDir();
    L41:
        long r9 = r5.getUsableSpace();
    L42:
        if (r2 >= 2) goto L47;
        int r16 = n[r2];
        if ((((long) r16) * 1048576) <= (r9 / 10)) goto L45;
        r2 = r2 + 1;
        goto L42
    L45:
        r10 = Integer.valueOf(r16);
    L47:
        if (r10 == null) goto L52;
        int r17 = r10.intValue();
        if (a(r1, "streaming_cache_size", "256") == false) goto L52;
        r6.putString("streaming_cache_size", String.valueOf(r17));
    L52:
        if (a(r1, "image_size", "-1") == false) goto L54;
        r6.putString("image_size", "500");
    L54:
        r6.putString("homemusic_hub_url", "http://192.168.1.129:8080");
        r6.putString("homemusic_hub_local_url", "http://192.168.1.129:8080");
        r6.putInt("homemusic_defaults_version", 6);
        r6.apply();
        return true;
    L33:
        if (r4 >= 4) goto L37;
        if (h12.c(r1.getString("precache_tracks_count", null), "5") == false) goto L37;
        r6.putString("precache_tracks_count", "3");
        goto L37
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        r1.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        r1.getClass();
        return 0;
    }
}
