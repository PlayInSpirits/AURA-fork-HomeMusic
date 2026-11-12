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
    public static final int[] n = {2048, 1024};

    public static final boolean a(SharedPreferences sharedPreferences, String str, Object obj) {
        return !sharedPreferences.contains(str) || h12.c(sharedPreferences.getAll().get(str), obj);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(pp3.b(context), 0);
        int i = sharedPreferences.getInt("homemusic_defaults_version", 0);
        if (i >= 6) {
            return true;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (i < 2) {
            Boolean bool = Boolean.TRUE;
            if (a(sharedPreferences, "dynamic_color_accent", bool) && a(sharedPreferences, "color_accent", "DYNAMIC")) {
                editorEdit.putBoolean("dynamic_color_accent", false);
                editorEdit.putString("color_accent", "HEX:#1ED760");
            }
            if (a(sharedPreferences, "dark_theme_black", Boolean.FALSE)) {
                editorEdit.putBoolean("dark_theme_black", true);
            }
            if (a(sharedPreferences, "podcast_section_visibility", bool)) {
                editorEdit.putBoolean("podcast_section_visibility", false);
            }
            if (a(sharedPreferences, "radio_section_visibility", bool)) {
                editorEdit.putBoolean("radio_section_visibility", false);
            }
        }
        Integer numValueOf = null;
        if (i < 3) {
            if (a(sharedPreferences, "precache_tracks_count", "0")) {
                editorEdit.putString("precache_tracks_count", "3");
            }
            if (a(sharedPreferences, "precache_wifi_only", Boolean.TRUE)) {
                editorEdit.putBoolean("precache_wifi_only", false);
            }
        } else if (i < 4 && h12.c(sharedPreferences.getString("precache_tracks_count", null), "5")) {
            editorEdit.putString("precache_tracks_count", "3");
        }
        if (i < 6) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
            }
            long usableSpace = externalFilesDir.getUsableSpace();
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = n[i2];
                if (((long) i3) * 1048576 <= usableSpace / 10) {
                    numValueOf = Integer.valueOf(i3);
                    break;
                }
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (a(sharedPreferences, "streaming_cache_size", "256")) {
                    editorEdit.putString("streaming_cache_size", String.valueOf(iIntValue));
                }
            }
            if (a(sharedPreferences, "image_size", "-1")) {
                editorEdit.putString("image_size", "500");
            }
        }
        editorEdit.putString("homemusic_hub_url", "http://192.168.1.129:8080");
        editorEdit.putString("homemusic_hub_local_url", "http://192.168.1.129:8080");
        editorEdit.putInt("homemusic_defaults_version", 6);
        editorEdit.apply();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
