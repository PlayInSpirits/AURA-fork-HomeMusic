package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pf {
    public static final ia4 n = null;
    public static int o;
    public static wd2 p;
    public static wd2 q;
    public static Boolean r;
    public static boolean s;
    public static final qi t = null;
    public static final Object u = null;
    public static final Object v = null;

    static {
        n = new ia4(new of(0));
        o = -100;
        p = null;
        q = null;
        r = null;
        s = false;
        t = new qi(0);
        u = new Object();
        v = new Object();
    }

    public static void a() {
        qi r0 = t;
        r0.getClass();
        ki r1 = new ki(r0);
    L4:
        if (r1.hasNext() == false) goto L15;
        pf r2 = (pf) ((WeakReference) r1.next()).get();
        if (r2 == null) goto L4;
        bg r3 = (bg) r2;
        Context r4 = r3.x;
        int r5 = 1;
        if (e(r4) == false) goto L14;
        wd2 r6 = p;
        if (r6 == null) goto L14;
        if (r6.equals(q) == true) goto L14;
        lf r7 = new lf(r4, r5);
        n.execute(r7);
    L14:
        r3.r(true, true);
        goto L4
    }

    public static Object b() {
        qi r0 = t;
        r0.getClass();
        ki r1 = new ki(r0);
    L4:
        if (r1.hasNext() == false) goto L11;
        pf r2 = (pf) ((WeakReference) r1.next()).get();
        if (r2 == null) goto L4;
        Context r3 = ((bg) r2).x;
        if (r3 == null) goto L4;
        return r3.getSystemService("locale");
    L11:
        return null;
    }

    public static boolean e(Context r4) {
        if (r != null) goto L10;
        int r0 = AppLocalesMetadataHolderService.n;     // Catch: PackageManager.NameNotFoundException -> L8
        int r1 = xh.a() | 128;     // Catch: PackageManager.NameNotFoundException -> L8
        Bundle r5 = r4.getPackageManager().getServiceInfo(new ComponentName(r4, AppLocalesMetadataHolderService.class), r1).metaData;     // Catch: PackageManager.NameNotFoundException -> L8
        if (r5 == null) goto L10;
        r = Boolean.valueOf(r5.getBoolean("autoStoreLocales"));     // Catch: PackageManager.NameNotFoundException -> L8
    L8:
        Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
        r = Boolean.FALSE;
    L10:
        return r.booleanValue();
    }

    public static void h(bg r3) {
        Object r0 = u;
        monitor-enter(r0);
        qi r1 = t;     // Catch: Throwable -> L11
        r1.getClass();     // Catch: Throwable -> L11
        ki r2 = new ki(r1);     // Catch: Throwable -> L11
    L6:
        if (r2.hasNext() == false) goto L13;
        pf r4 = (pf) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L11
        if (r4 == r3) goto L10;
        if (r4 != null) goto L6;
    L10:
        r2.remove();     // Catch: Throwable -> L11
        goto L6
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public static void j(wd2 r2) {
        Objects.requireNonNull(r2);
        if (Build.VERSION.SDK_INT < 33) goto L9;
        Object r0 = b();
        if (r0 == null) goto L18;
        nf.b(r0, mf.a(r2.a.a.toLanguageTags()));
        return;
    L18:
        return;
    L9:
        if (r2.equals(p) == true) goto L21;
        Object r1 = u;
        monitor-enter(r1);
        p = r2;     // Catch: Throwable -> L15
        a();     // Catch: Throwable -> L15
        monitor-exit(r1);     // Catch: Throwable -> L15
        return;
    L15:
        th = move-exception;
        throw th;
    }

    public static void o(int r3) {
        if (r3 == (-1)) goto L13;
        if (r3 == 0) goto L13;
        if (r3 == 1) goto L13;
        if (r3 == 2) goto L13;
        if (r3 == 3) goto L13;
        Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        return;
    L13:
        if (o == r3) goto L28;
        o = r3;
        Object r4 = u;
        monitor-enter(r4);
        qi r0 = t;     // Catch: Throwable -> L22
        r0.getClass();     // Catch: Throwable -> L22
        ki r2 = new ki(r0);     // Catch: Throwable -> L22
    L18:
        if (r2.hasNext() == false) goto L24;
        pf r1 = (pf) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L22
        if (r1 == null) goto L18;
        ((bg) r1).r(true, true);     // Catch: Throwable -> L22
        goto L18
    L24:
        monitor-exit(r4);     // Catch: Throwable -> L22
        return;
    L22:
        th = move-exception;
        throw th;
    }

    public static void q(Context r3) {
        if (e(r3) == true) goto L6;
        return;
    L6:
        if (Build.VERSION.SDK_INT >= 33) goto L8;
        Object r0 = v;
        monitor-enter(r0);
        wd2 r1 = p;     // Catch: Throwable -> L18
        if (r1 != null) goto L26;
        if (q != null) goto L21;
        q = wd2.a(si0.I(r3));     // Catch: Throwable -> L18
    L21:
        if (q.a.a.isEmpty() == false) goto L24;
        monitor-exit(r0);     // Catch: Throwable -> L18
        return;
    L24:
        p = q;     // Catch: Throwable -> L18
    L28:
        monitor-exit(r0);     // Catch: Throwable -> L18
        return;
    L26:
        if (r1.equals(q) == true) goto L28;
        wd2 r2 = p;     // Catch: Throwable -> L18
        q = r2;     // Catch: Throwable -> L18
        si0.F(r3, r2.a.a.toLanguageTags());     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    L8:
        if (s == true) goto L33;
        n.execute(new lf(r3, 0));
        return;
    }

    public abstract void c();

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int r1);

    public abstract void k(int r1);

    public abstract void l(View r1);

    public abstract void n(View r1, ViewGroup.LayoutParams r2);

    public abstract void p(CharSequence r1);
}
