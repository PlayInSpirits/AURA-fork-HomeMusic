package cat.ereza.customactivityoncrash.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import defpackage.qg0;
import defpackage.rg0;
import defpackage.sg0;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CaocInitProvider extends ContentProvider {
    public CaocInitProvider() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r1) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context r6 = getContext();
        Application r0 = sg0.a;
        if (r6 != null) goto L7;
        Log.e("CustomActivityOnCrash", "Install failed: context is null!");     // Catch: Throwable -> L5
    L20:
        return false;
    L7:
        final Thread.UncaughtExceptionHandler r2 = Thread.getDefaultUncaughtExceptionHandler();     // Catch: Throwable -> L5
        if (r2 != null) goto L10;
    L12:
        if (r2 != null) goto L14;
    L16:
        sg0.a = (Application) r6.getApplicationContext();     // Catch: Throwable -> L5
        Thread.setDefaultUncaughtExceptionHandler(new qg0(r2));     // Catch: Throwable -> L5
        Application r7 = sg0.a;     // Catch: Throwable -> L5
        rg0 r3 = new rg0();     // Catch: Throwable -> L5
        r3.n = 0;     // Catch: Throwable -> L5
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);     // Catch: Throwable -> L5
        r7.registerActivityLifecycleCallbacks(r3);     // Catch: Throwable -> L5
    L17:
        Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");     // Catch: Throwable -> L5
        goto L20
    L14:
        if (r2.getClass().getName().startsWith("com.android.internal.os") == true) goto L16;
        Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");     // Catch: Throwable -> L5
        goto L16
    L10:
        if (r2.getClass().getName().startsWith("cat.ereza.customactivityoncrash") == false) goto L12;
        Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th);
        goto L20
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        return 0;
    }
}
