package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa1 {
    public static final fg4 a = null;
    public static final ThreadPoolExecutor b = null;
    public static final Object c = null;
    public static final yd4 d = null;

    static {
        a = new fg4(16);
        h5 r9 = new h5(2);
        LinkedBlockingDeque r8 = new LinkedBlockingDeque();
        ThreadPoolExecutor r2 = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, r8, r9);
        r2.allowCoreThreadTimeOut(true);
        b = r2;
        c = new Object();
        d = new yd4(0);
    }

    public static String a(List r3, int r4) {
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r3.size()) goto L10;
        r0.append(((pa1) r3.get(r1)).g);
        r0.append("-");
        r0.append(r4);
        if (r1 >= (r3.size() - 1)) goto L8;
        r0.append(";");
    L8:
        r1 = r1 + 1;
        goto L4
    L10:
        return r0.toString();
    }

    public static va1 b(String r8, Context r9, List r10, int r11) {
        fg4 r0 = a;
        Trace.beginSection(xl.N("getFontSync"));
        Typeface r1 = (Typeface) r0.g(r8);     // Catch: Throwable -> L59
        if (r1 == null) goto L65;
        va1 r12 = new va1(r1);     // Catch: Throwable -> L59
        Trace.endSection();
        return r12;
    L65:
        qn0 r13 = oa1.a(r9, r10);     // Catch: PackageManager.NameNotFoundException -> L56 Throwable -> L59
        List r2 = r13.b;     // Catch: Throwable -> L59
        int r14 = r13.a;     // Catch: Throwable -> L59
        if (r14 == 0) goto L14;
        if (r14 == 1) goto L13;
    L12:
        int r15 = -3;
    L29:
        if (r15 == 0) goto L34;
        va1 r16 = new va1(r15);     // Catch: Throwable -> L59
        Trace.endSection();
        return r16;
    L34:
        if (r2.size() > 1) goto L36;
    L43:
        ib1[] r17 = (ib1[]) r2.get(0);     // Catch: Throwable -> L59
        vr1 r3 = d05.a;     // Catch: Throwable -> L59
        Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfo"));     // Catch: Throwable -> L59
        Typeface r18 = d05.a.f(r9, r17, r11);     // Catch: Throwable -> L53
        Trace.endSection();     // Catch: Throwable -> L59
    L46:
        if (r18 == null) goto L50;
        r0.l(r8, r18);     // Catch: Throwable -> L59
        va1 r19 = new va1(r18);     // Catch: Throwable -> L59
        Trace.endSection();
        return r19;
    L50:
        va1 r20 = new va1(-3);     // Catch: Throwable -> L59
        Trace.endSection();
        return r20;
    L53:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L59
        throw th;     // Catch: Throwable -> L59
    L36:
        if (Build.VERSION.SDK_INT < 29) goto L43;
        vr1 r110 = d05.a;     // Catch: Throwable -> L59
        Trace.beginSection(xl.N("TypefaceCompat.createFromFontInfoWithFallback"));     // Catch: Throwable -> L59
        r18 = d05.a.g(r9, r2, r11);     // Catch: Throwable -> L40
        Trace.endSection();     // Catch: Throwable -> L59
        goto L46
    L40:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L59
        throw th;     // Catch: Throwable -> L59
    L13:
        r15 = -2;
        goto L29
    L14:
        ib1[] r111 = (ib1[]) r2.get(0);     // Catch: Throwable -> L59
        if (r111 != null) goto L17;
    L28:
        r15 = 1;
        goto L29
    L17:
        if (r111.length == 0) goto L28;
        int r5 = r111.length;     // Catch: Throwable -> L59
        int r6 = 0;
    L20:
        if (r6 >= r5) goto L27;
        int r7 = r111[r6].f;     // Catch: Throwable -> L59
        if (r7 != 0) goto L23;
        r6 = r6 + 1;     // Catch: Throwable -> L59
        goto L20
    L23:
        if (r7 < 0) goto L12;
        r15 = r7;
        goto L29
    L27:
        r15 = 0;
        goto L29
    L56:
        va1 r21 = new va1(-1);     // Catch: Throwable -> L59
        Trace.endSection();
        return r21;
    L59:
        th = move-exception;
        Trace.endSection();
        throw th;
    }
}
