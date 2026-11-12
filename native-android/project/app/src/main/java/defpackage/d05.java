package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d05 {
    public static final vr1 a = null;
    public static final fg4 b = null;
    public static Paint c;

    static {
        Trace.beginSection(xl.N("TypefaceCompat static init"));
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 31) goto L6;
        a = new j05();
    L20:
        b = new fg4(16);
        c = null;
        Trace.endSection();
        return;
    L6:
        if (r0 < 29) goto L9;
        a = new i05();
        goto L20
    L9:
        if (r0 < 28) goto L12;
        a = new h05();
        goto L20
    L12:
        if (r0 < 26) goto L14;
        a = new g05();
        goto L20
    L14:
        Method r1 = f05.e;
        if (r1 != null) goto L17;
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
    L17:
        if (r1 == null) goto L19;
        a = new f05();
        goto L20
    L19:
        a = new e05();
        goto L20
    }

    public static Typeface a(Context r16, xa1 r17, Resources r18, int r19, String r20, int r21, int r22, au0 r23, boolean r24) {
        int r5 = 19;
        int r6 = -3;
        if ((r17 instanceof ab1) == false) goto L108;
        ab1 r0 = (ab1) r17;
        String r7 = r0.d;
        Typeface r9 = null;
        int r10 = 1;
        int r11 = 0;
        if (TextUtils.isEmpty(r7) == true) goto L9;
        Typeface r8 = c(r7);
        if (r8 == null) goto L9;
    L44:
        if (r8 == null) goto L49;
        if (r23 == null) goto L47;
        new Handler(Looper.getMainLooper()).post(new ur2(r5, r23, r8));
    L47:
        b.l(b(r18, r19, r20, r21, r22), r8);
        return r8;
    L49:
        if (r24 == true) goto L51;
        if (r23 == null) goto L52;
    L53:
        boolean r3 = false;
    L57:
        if (r24 == false) goto L59;
        int r12 = r0.b;
    L60:
        Handler r13 = new Handler(Looper.getMainLooper());
        c05 r14 = new c05();
        r14.n = r23;
        ArrayList r1 = r0.a;
        ok r2 = new ok(r13, 2);
        wo0 r15 = new wo0(r14, r2);
        int r25 = 6;
        if (r3 == true) goto L63;
        String r4 = wa1.a(r1, r22);
        Typeface r26 = (Typeface) wa1.a.g(r4);
        if (r26 == null) goto L89;
        r2.execute(new lg1(r25, r14, r26));
        r9 = r26;
    L113:
        if (r9 == null) goto L115;
        b.l(b(r18, r19, r20, r21, r22), r9);
    L115:
        return r9;
    L89:
        ua1 r27 = new ua1(r11, r15);
        Object r28 = wa1.c;
        monitor-enter(r28);
        yd4 r29 = wa1.d;     // Catch: Throwable -> L96
        ArrayList r30 = (ArrayList) r29.get(r4);     // Catch: Throwable -> L96
        if (r30 == null) goto L98;
        r30.add(r27);     // Catch: Throwable -> L96
        monitor-exit(r28);     // Catch: Throwable -> L96
    L118:
        goto L113
    L98:
        ArrayList r31 = new ArrayList();     // Catch: Throwable -> L96
        r31.add(r27);     // Catch: Throwable -> L96
        r29.put(r4, r31);     // Catch: Throwable -> L96
        monitor-exit(r28);     // Catch: Throwable -> L96
        ta1 r32 = new ta1(r4, r16, r1, r22, 1);
        ThreadPoolExecutor r33 = wa1.b;
        ua1 r34 = new ua1(r10, r4);
        if (Looper.myLooper() != null) goto L103;
        Handler r35 = new Handler(Looper.getMainLooper());
    L104:
        pb0 r36 = new pb0();
        r36.o = r32;
        r36.p = r34;
        r36.q = r35;
        r33.execute(r36);
        goto L118
    L103:
        r35 = new Handler();
    L96:
        th = move-exception;
        throw th;
    L63:
        if (r1.size() > 1) goto L84;
        pa1 r37 = (pa1) r1.get(0);
        fg4 r38 = wa1.a;
        ArrayList r110 = new ArrayList(1);
        Object r39 = new Object[]{r37}[0];
        Objects.requireNonNull(r39);
        r110.add(r39);
        String r40 = wa1.a(Collections.unmodifiableList(r110), r22);
        Typeface r111 = (Typeface) wa1.a.g(r40);
        if (r111 == null) goto L67;
        r2.execute(new lg1(r25, r14, r111));
        r9 = r111;
        goto L113
    L67:
        if (r12 != (-1)) goto L121;
        Object[] r41 = {r37};
        ArrayList r42 = new ArrayList(1);
        Object r43 = r41[0];
        Objects.requireNonNull(r43);
        r42.add(r43);
        va1 r44 = wa1.b(r40, r16, Collections.unmodifiableList(r42), r22);
        r15.H(r44);
        r9 = r44.a;
        goto L113
    L121:
    L83:
        ((ok) r15.o).execute(new rq(r6, r10, (c05) r15.n));
        goto L113
    L122:
        va1 r45 = (va1) wa1.b.submit(new ta1(r40, r16, r37, r22, 0)).get(r12, TimeUnit.MILLISECONDS);     // Catch: InterruptedException -> L83
        r15.H(r45);     // Catch: InterruptedException -> L83
        r9 = r45.a;     // Catch: InterruptedException -> L83
        goto L113
    L74:
        e = move-exception;
        throw e;     // Catch: InterruptedException -> L83
    L76:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: InterruptedException -> L83
    L79:
        throw new InterruptedException("timeout");     // Catch: InterruptedException -> L83
    L84:
        kf2.n("Fallbacks with blocking fetches are not supported for performance reasons");
        return null;
    L59:
        r12 = -1;
    L52:
        r3 = true;
        goto L57
    L51:
        if (r0.c != 0) goto L53;
    L9:
        ArrayList r46 = r0.a;
        if (r46.size() != 1) goto L13;
        r8 = c(((pa1) r46.get(0)).e);
        goto L44
    L13:
        if (Build.VERSION.SDK_INT >= 31) goto L15;
    L14:
        r8 = null;
        goto L44
    L15:
        int r47 = 0;
    L17:
        if (r47 >= r46.size()) goto L22;
        if (c(((pa1) r46.get(r47)).e) == null) goto L14;
        r47 = r47 + 1;
        goto L17
    L22:
        Typeface.CustomFallbackBuilder r112 = null;
        int r48 = 0;
    L24:
        if (r48 >= r46.size()) goto L43;
        pa1 r113 = (pa1) r46.get(r48);
        if (r48 == (r46.size() - 1)) goto L28;
    L30:
        String r114 = r113.e;
        String r115 = r113.f;
        Font r116 = d(c(r114));
        if (r116 == null) goto L32;
        if (TextUtils.isEmpty(r115) == false) goto L116;
        FontFamily r117 = lm4.i(lm4.y(r116));
    L39:
        if (r112 != null) goto L41;
        r112 = lm4.c(r117);
    L42:
        r48 = r48 + 1;
        goto L24
    L41:
        lm4.p(r112, r117);
        goto L42
    L116:
        lm4.m();     // Catch: IOException -> L37
        lm4.z();     // Catch: IOException -> L37
        r117 = lm4.i(lm4.h(lm4.g(lm4.f(b05.c(r116), r115))));     // Catch: IOException -> L37
    L37:
        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
        goto L14
    L32:
        Log.w("TypefaceCompat", "Unable identify the primary font for " + r113.e + ". Falling back to provider font.");
        goto L14
    L28:
        if (TextUtils.isEmpty(r113.f) == false) goto L30;
        lm4.q(r112, r113.e);
    L43:
        r8 = lm4.d(r112);
        goto L44
    L108:
        r9 = a.e(r16, (ya1) r17, r18, r22);
        if (r23 == null) goto L113;
        if (r9 == null) goto L112;
        new Handler(Looper.getMainLooper()).post(new ur2(r5, r23, r9));
        goto L113
    L112:
        r23.e(-3);
        goto L113
    }

    public static String b(Resources r1, int r2, String r3, int r4, int r5) {
        return r1.getResourcePackageName(r2) + '-' + r3 + '-' + r4 + '-' + r2 + '-' + r5;
    }

    public static Typeface c(String r3) {
        if (r3 != null) goto L5;
    L12:
        return null;
    L5:
        if (r3.isEmpty() == true) goto L12;
        Typeface r4 = Typeface.create(r3, 0);
        Typeface r1 = Typeface.create(Typeface.DEFAULT, 0);
        if (r4 == null) goto L12;
        if (r4.equals(r1) == true) goto L12;
        return r4;
    }

    public static Font d(Typeface r2) {
        if (c != null) goto L5;
        c = new Paint();
    L5:
        c.setTextSize(10.0f);
        c.setTypeface(r2);
        PositionedGlyphs r3 = go2.c(c);
        if (b05.a(r3) != 0) goto L10;
        return null;
    L10:
        return b05.d(r3);
    }
}
