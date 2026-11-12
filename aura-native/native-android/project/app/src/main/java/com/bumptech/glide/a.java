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
    public final ArrayList t = new ArrayList();

    public a(Context context, i11 i11Var, pf2 pf2Var, zs zsVar, qj0 qj0Var, e04 e04Var, i80 i80Var, int i, fi1 fi1Var, oi oiVar, List list, List list2, g12 g12Var, d34 d34Var) {
        this.n = zsVar;
        this.q = qj0Var;
        this.o = pf2Var;
        this.r = e04Var;
        this.s = i80Var;
        this.p = new ii1(context, qj0Var, new ll(this, list2, g12Var), new tv1(), fi1Var, oiVar, list, i11Var, d34Var, i);
    }

    public static a a(Context context) {
        if (u == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                mj0.j("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (u == null) {
                    if (v) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    v = true;
                    try {
                        b(context, generatedAppGlideModule);
                        v = false;
                    } catch (Throwable th) {
                        v = false;
                        throw th;
                    }
                }
            }
        }
        return u;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        hi1 hi1Var = new hi1();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.G();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        j51.G(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.V().isEmpty()) {
            generatedAppGlideModule.V();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw xa3.d(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw xa3.d(it2);
            }
        }
        hi1Var.n = generatedAppGlideModule != null ? generatedAppGlideModule.W() : null;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw xa3.d(it3);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.e(applicationContext, hi1Var);
        }
        int i = 1;
        if (hi1Var.g == null) {
            h5 h5Var = new h5(i);
            if (li1.o == 0) {
                li1.o = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = li1.o;
            if (TextUtils.isEmpty("source")) {
                kf2.n("Name must be non-null and non-empty, but given: source");
                return;
            }
            hi1Var.g = new li1(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(h5Var, "source", false)));
        }
        if (hi1Var.h == null) {
            h5 h5Var2 = new h5(i);
            if (TextUtils.isEmpty("disk-cache")) {
                kf2.n("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            hi1Var.h = new li1(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(h5Var2, "disk-cache", true)));
        }
        if (hi1Var.o == null) {
            if (li1.o == 0) {
                li1.o = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = li1.o >= 4 ? 2 : 1;
            h5 h5Var3 = new h5(i);
            if (TextUtils.isEmpty("animation")) {
                kf2.n("Name must be non-null and non-empty, but given: animation");
                return;
            }
            hi1Var.o = new li1(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ki1(h5Var3, "animation", true)));
        }
        if (hi1Var.j == null) {
            mu2 mu2Var = new mu2(applicationContext);
            v2 v2Var = new v2();
            Context context2 = mu2Var.a;
            float f = mu2Var.d;
            ActivityManager activityManager = mu2Var.b;
            int i4 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            v2Var.c = i4;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) mu2Var.c.o;
            float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            int iRound2 = Math.round(f2 * f);
            int iRound3 = Math.round(f2 * 2.0f);
            int i5 = iRound - i4;
            int i6 = iRound3 + iRound2;
            if (i6 <= i5) {
                v2Var.b = iRound3;
                v2Var.a = iRound2;
            } else {
                float f3 = i5 / (f + 2.0f);
                v2Var.b = Math.round(f3 * 2.0f);
                v2Var.a = Math.round(f3 * f);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                sb.append(Formatter.formatFileSize(context2, v2Var.b));
                sb.append(", pool size: ");
                sb.append(Formatter.formatFileSize(context2, v2Var.a));
                sb.append(", byte array size: ");
                sb.append(Formatter.formatFileSize(context2, i4));
                sb.append(", memory class limited? ");
                sb.append(i6 > iRound);
                sb.append(", max size: ");
                sb.append(Formatter.formatFileSize(context2, iRound));
                sb.append(", memoryClass: ");
                sb.append(activityManager.getMemoryClass());
                sb.append(", isLowMemoryDevice: ");
                sb.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb.toString());
            }
            hi1Var.j = v2Var;
        }
        if (hi1Var.k == null) {
            hi1Var.k = new i80(25);
        }
        if (hi1Var.d == null) {
            int i7 = hi1Var.j.a;
            if (i7 > 0) {
                hi1Var.d = new nf2(i7);
            } else {
                hi1Var.d = new pa(19);
            }
        }
        if (hi1Var.e == null) {
            hi1Var.e = new qj0(hi1Var.j.c);
        }
        if (hi1Var.f == null) {
            hi1Var.f = new pf2(hi1Var.j.b);
        }
        if (hi1Var.i == null) {
            hi1Var.i = new e20(applicationContext, "image_manager_disk_cache", 262144000L);
        }
        if (hi1Var.c == null) {
            hi1Var.c = new i11(hi1Var.f, hi1Var.i, hi1Var.h, hi1Var.g, new li1(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ki1(new h5(1), "source-unlimited", false))), hi1Var.o);
        }
        List list2 = hi1Var.p;
        if (list2 == null) {
            hi1Var.p = Collections.EMPTY_LIST;
        } else {
            hi1Var.p = Collections.unmodifiableList(list2);
        }
        zg5 zg5Var = hi1Var.b;
        zg5Var.getClass();
        a aVar = new a(applicationContext, hi1Var.c, hi1Var.f, hi1Var.d, hi1Var.e, new e04(hi1Var.n), hi1Var.k, hi1Var.l, hi1Var.m, hi1Var.a, hi1Var.p, arrayList, generatedAppGlideModule, new d34(zg5Var));
        applicationContext.registerComponentCallbacks(aVar);
        u = aVar;
    }

    public static c04 c(Context context) {
        h12.f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).r.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e35.m();
        this.o.f(0L);
        this.n.k();
        qj0 qj0Var = this.q;
        synchronized (qj0Var) {
            qj0Var.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        e35.m();
        synchronized (this.t) {
            try {
                ArrayList arrayList = this.t;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c04) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pf2 pf2Var = this.o;
        pf2Var.getClass();
        if (i >= 40) {
            pf2Var.f(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (pf2Var) {
                j = pf2Var.a;
            }
            pf2Var.f(j / 2);
        }
        this.n.j(i);
        qj0 qj0Var = this.q;
        synchronized (qj0Var) {
            try {
                if (i >= 40) {
                    synchronized (qj0Var) {
                        qj0Var.c(0);
                    }
                } else if (i >= 20 || i == 15) {
                    qj0Var.c(qj0Var.a / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
