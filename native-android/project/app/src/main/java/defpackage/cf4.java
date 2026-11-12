package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cf4 implements pz3 {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;
    public final String a;
    public final ul4 b;
    public final Object c;
    public final zz3 d;
    public final wz3 e;
    public final ii1 f;
    public final Object g;
    public final Class h;
    public final lq i;
    public final int j;
    public final int k;
    public final eq3 l;
    public final wq4 m;
    public final List n;
    public final ex4 o;
    public final Executor p;
    public q04 q;
    public z05 r;
    public long s;
    public volatile i11 t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public cf4(Context context, ii1 ii1Var, Object obj, Object obj2, Class cls, lq lqVar, int i, int i2, eq3 eq3Var, wq4 wq4Var, zz3 zz3Var, ArrayList arrayList, wz3 wz3Var, i11 i11Var, ex4 ex4Var, Executor executor) {
        this.a = C ? String.valueOf(hashCode()) : null;
        this.b = new ul4();
        this.c = obj;
        this.f = ii1Var;
        this.g = obj2;
        this.h = cls;
        this.i = lqVar;
        this.j = i;
        this.k = i2;
        this.l = eq3Var;
        this.m = wq4Var;
        this.d = zz3Var;
        this.n = arrayList;
        this.e = wz3Var;
        this.t = i11Var;
        this.o = ex4Var;
        this.p = executor;
        this.B = 1;
        if (this.A == null && ((Map) ii1Var.h.o).containsKey(gi1.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.pz3
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    public final void b() {
        if (this.z) {
            kf2.o("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.m.b(this);
        z05 z05Var = this.r;
        if (z05Var != null) {
            synchronized (((i11) z05Var.q)) {
                ((m11) z05Var.o).g((cf4) z05Var.p);
            }
            this.r = null;
        }
    }

    @Override // defpackage.pz3
    public final void c() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                if (this.B == 6) {
                    return;
                }
                b();
                q04 q04Var = this.q;
                if (q04Var != null) {
                    this.q = null;
                } else {
                    q04Var = null;
                }
                wz3 wz3Var = this.e;
                if (wz3Var == null || wz3Var.g(this)) {
                    this.m.m(f());
                }
                this.B = 6;
                if (q04Var != null) {
                    this.t.getClass();
                    i11.f(q04Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 pz3Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        lq lqVar;
        eq3 eq3Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        lq lqVar2;
        eq3 eq3Var2;
        int size2;
        boolean zEquals;
        boolean zI;
        if (!(pz3Var instanceof cf4)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                lqVar = this.i;
                eq3Var = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        cf4 cf4Var = (cf4) pz3Var;
        synchronized (cf4Var.c) {
            try {
                i3 = cf4Var.j;
                i4 = cf4Var.k;
                obj2 = cf4Var.g;
                cls2 = cf4Var.h;
                lqVar2 = cf4Var.i;
                eq3Var2 = cf4Var.l;
                List list2 = cf4Var.n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (lqVar == null) {
                    zI = lqVar2 == null;
                } else {
                    zI = lqVar.i(lqVar2);
                }
                if (zI && eq3Var == eq3Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable f() {
        if (this.v == null) {
            this.v = this.i.s;
        }
        return this.v;
    }

    public final void g(String str) {
        StringBuilder sbS = b11.s(str, " this: ");
        sbS.append(this.a);
        Log.v("GlideRequest", sbS.toString());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    public final void h(GlideException glideException, int i) {
        boolean zA;
        boolean z;
        this.b.a();
        synchronized (this.c) {
            try {
                glideException.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", glideException);
                    if (i2 <= 4) {
                        glideException.d();
                    }
                }
                Drawable drawableF = null;
                this.r = null;
                this.B = 5;
                wz3 wz3Var = this.e;
                if (wz3Var != null) {
                    wz3Var.b(this);
                }
                boolean z2 = true;
                this.z = true;
                try {
                    List<zz3> list = this.n;
                    if (list != null) {
                        zA = false;
                        for (zz3 zz3Var : list) {
                            wz3 wz3Var2 = this.e;
                            if (wz3Var2 != null) {
                                wz3Var2.getRoot().a();
                            }
                            zA |= zz3Var.a(glideException);
                        }
                    } else {
                        zA = false;
                    }
                    zz3 zz3Var2 = this.d;
                    if (zz3Var2 == null) {
                        z = false;
                    } else {
                        wz3 wz3Var3 = this.e;
                        if (wz3Var3 != null) {
                            wz3Var3.getRoot().a();
                        }
                        if (zz3Var2.a(glideException)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!(z | zA)) {
                        wz3 wz3Var4 = this.e;
                        if (wz3Var4 != null && !wz3Var4.h(this)) {
                            z2 = false;
                        }
                        if (z2) {
                            if (this.g == null) {
                                if (this.w == null) {
                                    this.w = this.i.y;
                                }
                                drawableF = this.w;
                            }
                            if (drawableF == null) {
                                if (this.u == null) {
                                    this.u = this.i.r;
                                }
                                drawableF = this.u;
                            }
                            if (drawableF == null) {
                                drawableF = f();
                            }
                            this.m.i(drawableF);
                        }
                    }
                    this.z = false;
                } catch (Throwable th) {
                    this.z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(q04 q04Var, int i) {
        this.b.a();
        q04 q04Var2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (q04Var == null) {
                        h(new GlideException("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = q04Var.get();
                    try {
                        if (obj == null || !this.h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(q04Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            h(new GlideException(sb.toString()), 5);
                        } else {
                            wz3 wz3Var = this.e;
                            if (wz3Var == null || wz3Var.i(this)) {
                                l(q04Var, obj, i);
                                return;
                            } else {
                                this.q = null;
                                this.B = 4;
                            }
                        }
                        this.t.getClass();
                        i11.f(q04Var);
                    } catch (Throwable th) {
                        q04Var2 = q04Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (q04Var2 != null) {
                this.t.getClass();
                i11.f(q04Var2);
            }
            throw th3;
        }
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.pz3
    public final void k() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = ee2.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (e35.I(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.w = this.i.y;
                    }
                    h(new GlideException("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i2 = this.B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    i(this.q, 5);
                    return;
                }
                List<zz3> list = this.n;
                if (list != null) {
                    for (zz3 zz3Var : list) {
                    }
                }
                this.B = 3;
                if (e35.I(this.j, this.k)) {
                    m(this.j, this.k);
                } else {
                    this.m.d(this);
                }
                int i3 = this.B;
                if (i3 == 2 || i3 == 3) {
                    wz3 wz3Var = this.e;
                    if (wz3Var == null || wz3Var.h(this)) {
                        this.m.k(f());
                    }
                }
                if (C) {
                    g("finished run method in " + ee2.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(q04 q04Var, Object obj, int i) {
        wz3 wz3Var = this.e;
        if (wz3Var != null) {
            wz3Var.getRoot().a();
        }
        this.B = 4;
        this.q = q04Var;
        if (this.f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + xa3.x(i) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + ee2.a(this.s) + " ms");
        }
        if (wz3Var != null) {
            wz3Var.f(this);
        }
        this.z = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zz3) it.next()).g(obj);
                }
            }
            zz3 zz3Var = this.d;
            if (zz3Var != null) {
                zz3Var.g(obj);
            }
            this.m.c(obj, this.o.s(i));
        } finally {
            this.z = false;
        }
    }

    public final void m(int i, int i2) {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        g("Got onSizeReady in " + ee2.a(this.s));
                    }
                    if (this.B != 3) {
                        return;
                    }
                    this.B = 2;
                    float f = this.i.o;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.x = iRound;
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        g("finished setup for calling load in " + ee2.a(this.s));
                    }
                    i11 i11Var = this.t;
                    ii1 ii1Var = this.f;
                    Object obj3 = this.g;
                    lq lqVar = this.i;
                    try {
                        try {
                            try {
                                try {
                                    this.r = i11Var.a(ii1Var, obj3, lqVar.w, this.x, this.y, lqVar.B, this.h, this.l, lqVar.p, lqVar.A, lqVar.x, lqVar.G, lqVar.z, lqVar.t, lqVar.H, lqVar.F, this, this.p);
                                    if (this.B != 2) {
                                        this.r = null;
                                    }
                                    if (z) {
                                        g("finished onSizeReady in " + ee2.a(this.s));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
