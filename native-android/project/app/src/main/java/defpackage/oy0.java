package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oy0 {
    static {
        new ThreadLocal();
        new zc(4);
    }

    public static int a(Context r8) {
        Class<?> r9 = r8.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.auth.api.fallback.ModuleDescriptor");     // Catch: Exception -> L7 ClassNotFoundException -> L12
        Field r5 = r9.getDeclaredField("MODULE_ID");     // Catch: Exception -> L7 ClassNotFoundException -> L12
        Field r10 = r9.getDeclaredField("MODULE_VERSION");     // Catch: Exception -> L7 ClassNotFoundException -> L12
        if (au0.n(r5.get(null), "com.google.android.gms.auth.api.fallback") == true) goto L10;
        Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(r5.get(null)) + "' didn't match expected id 'com.google.android.gms.auth.api.fallback'");     // Catch: Exception -> L7 ClassNotFoundException -> L12
        return 0;
    L10:
        return r10.getInt(null);
    L12:
        Log.w("DynamiteModule", "Local module descriptor class for com.google.android.gms.auth.api.fallback not found.");
    L13:
        return 0;
    L7:
        e = move-exception;
        Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
        goto L13
    }
}
