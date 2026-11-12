package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import defpackage.c04;
import defpackage.d04;
import defpackage.d34;
import defpackage.e04;
import defpackage.e20;
import defpackage.e35;
import defpackage.fi1;
import defpackage.g12;
import defpackage.h12;
import defpackage.h5;
import defpackage.hi1;
import defpackage.i11;
import defpackage.i80;
import defpackage.ii1;
import defpackage.j51;
import defpackage.kf2;
import defpackage.ki1;
import defpackage.li1;
import defpackage.ll;
import defpackage.mj0;
import defpackage.mu2;
import defpackage.nf2;
import defpackage.oi;
import defpackage.pa;
import defpackage.pf2;
import defpackage.qj0;
import defpackage.tv1;
import defpackage.v2;
import defpackage.xa3;
import defpackage.zg5;
import defpackage.zs;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a u;
    public static volatile boolean v;
    public final zs n;
    public final pf2 o;
    public final ii1 p;
    public final qj0 q;
    public final e04 r;
    public final i80 s;
    public final ArrayList t;

    public a(Context r2, i11 r3, pf2 r4, zs r5, qj0 r6, e04 r7, i80 r8, int r9, fi1 r10, oi r11, List r12, List r13, g12 r14, d34 r15) {
        this.t = new ArrayList();
        this.n = r5;
        this.q = r6;
        this.o = r4;
        this.r = r7;
        this.s = r8;
        this.p = new ii1(r2, r6, new ll(this, r13, r14), new tv1(), r10, r11, r12, r3, r15, r9);
    }

    public static a a(Context r5) {
        if (u != null) goto L47;
        Context r0 = r5.getApplicationContext();
        GeneratedAppGlideModule r2 = null;
        r2 = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{r0.getApplicationContext()});     // Catch: InvocationTargetException -> L7 NoSuchMethodException -> L9 IllegalAccessException -> L11 InstantiationException -> L13 ClassNotFoundException -> L23
    L27:
        monitor-enter(a.class);
    L43:
        th = move-exception;
        throw th;
    L29:
        if (u == null) goto L31;
    L41:
        monitor-exit(a.class);     // Catch: Throwable -> L43
        goto L47
    L31:
        if (v == true) goto L40;
        v = true;     // Catch: Throwable -> L43
        b(r5, r2);     // Catch: Throwable -> L36
        v = false;     // Catch: Throwable -> L43
        goto L41
    L36:
        th = move-exception;
        v = false;     // Catch: Throwable -> L43
        throw th;     // Catch: Throwable -> L43
    L40:
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");     // Catch: Throwable -> L43
    L11:
        e = move-exception;
        mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        return null;
    L13:
        e = move-exception;
        mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        return null;
    L9:
        e = move-exception;
        mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        return null;
    L7:
        e = move-exception;
        mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        return null;
    L24:
        if (Log.isLoggable("Glide", 5) == false) goto L27;
        Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
    L47:
        return u;
    }

    public static void b(Context r26, GeneratedAppGlideModule r27) {
        hi1 r1 = new hi1();
        Context r2 = r26.getApplicationContext();
        List r0 = Collections.EMPTY_LIST;
        if (r27 == null) goto L6;
        r27.G();
    L6:
        if (Log.isLoggable("ManifestParser", 3) == false) goto L8;
        Log.d("ManifestParser", "Loading Glide modules");
    L8:
        ArrayList r12 = new ArrayList();
        d04 r6 = null;
        ApplicationInfo r7 = r2.getPackageManager().getApplicationInfo(r2.getPackageName(), 128);     // Catch: PackageManager.NameNotFoundException -> L17
        if (r7 == null) goto L31;
        if (r7.metaData == null) goto L31;
        if (Log.isLoggable("ManifestParser", 2) == false) goto L19;
        Log.v("ManifestParser", "Got app info metadata: " + r7.metaData);     // Catch: PackageManager.NameNotFoundException -> L17
    L19:
        Iterator<String> r3 = r7.metaData.keySet().iterator();     // Catch: PackageManager.NameNotFoundException -> L17
    L21:
        if (r3.hasNext() == false) goto L28;
        String r8 = r3.next();     // Catch: PackageManager.NameNotFoundException -> L17
        if ("GlideModule".equals(r7.metaData.get(r8)) == false) goto L21;
        j51.G(r8);     // Catch: PackageManager.NameNotFoundException -> L17
        throw null;     // Catch: PackageManager.NameNotFoundException -> L17
    L28:
        if (Log.isLoggable("ManifestParser", 3) == false) goto L37;
        Log.d("ManifestParser", "Finished loading Glide modules");     // Catch: PackageManager.NameNotFoundException -> L17
    L37:
        if (r27 == null) goto L46;
        if (r27.V().isEmpty() == true) goto L46;
        r27.V();
        Iterator r4 = r12.iterator();
        if (r4.hasNext() == false) goto L46;
        throw xa3.d(r4);
    L46:
        if (Log.isLoggable("Glide", 3) == false) goto L52;
        Iterator r5 = r12.iterator();
        if (r5.hasNext() == false) goto L52;
        throw xa3.d(r5);
    L52:
        if (r27 == null) goto L54;
        r6 = r27.W();
    L54:
        r1.n = r6;
        Iterator r9 = r12.iterator();
        if (r9.hasNext() == true) goto L139;
        if (r27 == null) goto L58;
        r27.e(r2, r1);
    L58:
        int r10 = 1;
        if (r1.g != null) goto L69;
        h5 r11 = new h5(r10);
        if (li1.o != 0) goto L63;
        li1.o = Math.min(4, Runtime.getRuntime().availableProcessors());
    L63:
        int r15 = li1.o;
        if (TextUtils.isEmpty("source") == true) goto L66;
        r1.g = new li1(new ThreadPoolExecutor(r15, r15, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(r11, "source", false)));
        goto L69
    L66:
        kf2.n("Name must be non-null and non-empty, but given: source");
        return;
    L69:
        if (r1.h != null) goto L76;
        h5 r13 = new h5(r10);
        if (TextUtils.isEmpty("disk-cache") == true) goto L73;
        r1.h = new li1(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(r13, "disk-cache", true)));
        goto L76
    L73:
        kf2.n("Name must be non-null and non-empty, but given: disk-cache");
        return;
    L76:
        if (r1.o != null) goto L90;
        if (li1.o != 0) goto L81;
        li1.o = Math.min(4, Runtime.getRuntime().availableProcessors());
    L81:
        if (li1.o < 4) goto L83;
        int r16 = 2;
    L84:
        h5 r14 = new h5(r10);
        if (TextUtils.isEmpty("animation") == true) goto L87;
        int r17 = r16;
        r1.o = new li1(new ThreadPoolExecutor(r16, r17, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(r14, "animation", true)));
        goto L90
    L87:
        kf2.n("Name must be non-null and non-empty, but given: animation");
        return;
    L83:
        r16 = 1;
    L90:
        if (r1.j != null) goto L112;
        mu2 r18 = new mu2(r2);
        v2 r19 = new v2();
        Context r20 = r18.a;
        float r21 = r18.d;
        ActivityManager r110 = r18.b;
        if (r110.isLowRamDevice() == false) goto L94;
        int r111 = 2097152;
    L95:
        r19.c = r111;
        float r112 = r110.getMemoryClass() * 1048576;
        if (r110.isLowRamDevice() == false) goto L98;
        float r113 = 0.33f;
    L99:
        int r114 = Math.round(r112 * r113);
        DisplayMetrics r22 = (DisplayMetrics) r18.c.o;
        float r23 = (r22.widthPixels * r22.heightPixels) * 4;
        int r24 = Math.round(r23 * r21);
        int r25 = Math.round(r23 * 2.0f);
        int r115 = r114 - r111;
        int r28 = r25 + r24;
        if (r28 > r115) goto L102;
        r19.b = r25;
        r19.a = r24;
    L104:
        if (Log.isLoggable("MemorySizeCalculator", 3) == false) goto L110;
        StringBuilder r29 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
        r29.append(Formatter.formatFileSize(r20, r19.b));
        r29.append(", pool size: ");
        r29.append(Formatter.formatFileSize(r20, r19.a));
        r29.append(", byte array size: ");
        r29.append(Formatter.formatFileSize(r20, r111));
        r29.append(", memory class limited? ");
        if (r28 <= r114) goto L108;
        boolean r30 = true;
    L109:
        r29.append(r30);
        r29.append(", max size: ");
        r29.append(Formatter.formatFileSize(r20, r114));
        r29.append(", memoryClass: ");
        r29.append(r110.getMemoryClass());
        r29.append(", isLowMemoryDevice: ");
        r29.append(r110.isLowRamDevice());
        Log.d("MemorySizeCalculator", r29.toString());
        goto L110
    L108:
        r30 = false;
    L110:
        r1.j = r19;
        goto L112
    L102:
        float r31 = r115 / (r21 + 2.0f);
        r19.b = Math.round(r31 * 2.0f);
        r19.a = Math.round(r31 * r21);
        goto L104
    L98:
        r113 = 0.4f;
        goto L99
    L94:
        r111 = 4194304;
    L112:
        if (r1.k != null) goto L115;
        r1.k = new i80(25);
    L115:
        if (r1.d != null) goto L121;
        int r32 = r1.j.a;
        if (r32 <= 0) goto L119;
        r1.d = new nf2(r32);
        goto L121
    L119:
        r1.d = new pa(19);
    L121:
        if (r1.e != null) goto L124;
        r1.e = new qj0(r1.j.c);
    L124:
        if (r1.f != null) goto L127;
        r1.f = new pf2(r1.j.b);
    L127:
        if (r1.i != null) goto L130;
        r1.i = new e20(r2, "image_manager_disk_cache", 262144000);
    L130:
        if (r1.c != null) goto L132;
        r1.c = new i11(r1.f, r1.i, r1.h, r1.g, new li1(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ki1(new h5(1), "source-unlimited", false))), r1.o);
    L132:
        List r33 = r1.p;
        if (r33 != null) goto L135;
        r1.p = Collections.EMPTY_LIST;
    L136:
        zg5 r34 = r1.b;
        r34.getClass();
        d34 r116 = new d34(r34);
        a r35 = new a(r2, r1.c, r1.f, r1.d, r1.e, new e04(r1.n), r1.k, r1.l, r1.m, r1.a, r1.p, r12, r27, r116);
        r2.registerComponentCallbacks(r35);
        u = r35;
        return;
    L135:
        r1.p = Collections.unmodifiableList(r33);
        goto L136
    L139:
        throw xa3.d(r9);
    L31:
        if (Log.isLoggable("ManifestParser", 3) == false) goto L37;
        Log.d("ManifestParser", "Got null app info metadata");     // Catch: PackageManager.NameNotFoundException -> L17
    L17:
        e = move-exception;
        if (Log.isLoggable("ManifestParser", 6) == false) goto L37;
        Log.e("ManifestParser", "Failed to parse glide modules", e);
        goto L37
    }

    public static c04 c(Context r1) {
        h12.f(r1, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(r1).r.b(r1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e35.m();
        this.o.f(0);
        this.n.k();
        qj0 r3 = this.q;
        monitor-enter(r3);
        r3.c(0);     // Catch: Throwable -> L8
        monitor-exit(r3);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r10) {
        e35.m();
        ArrayList r0 = this.t;
        monitor-enter(r0);
        ArrayList r1 = this.t;     // Catch: Throwable -> L7
        int r2 = r1.size();     // Catch: Throwable -> L7
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L9;
        Object r5 = r1.get(r4);     // Catch: Throwable -> L7
        r4 = r4 + 1;     // Catch: Throwable -> L7
        ((c04) r5).getClass();     // Catch: Throwable -> L7
        goto L5
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        pf2 r3 = this.o;
        r3.getClass();
        if (r10 < 40) goto L13;
        r3.f(0);
    L19:
        this.n.j(r10);
        qj0 r9 = this.q;
        monitor-enter(r9);
        if (r10 < 40) goto L29;
        monitor-enter(r9);     // Catch: Throwable -> L34
        r9.c(0);     // Catch: Throwable -> L26
        monitor-exit(r9);     // Catch: Throwable -> L34
    L32:
        monitor-exit(r9);
        return;
    L26:
        th = move-exception;
        throw th;     // Catch: Throwable -> L34
    L29:
        if (r10 >= 20) goto L31;
        if (r10 != 15) goto L32;
    L31:
        r9.c(r9.a / 2);     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;
    L13:
        if (r10 >= 20) goto L15;
        if (r10 != 15) goto L19;
    L15:
        monitor-enter(r3);
        long r6 = r3.a;     // Catch: Throwable -> L37
        monitor-exit(r3);
        r3.f(r6 / 2);
    L37:
        th = move-exception;
        throw th;
    L7:
        th = move-exception;
        throw th;
    }
}
