package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t24 extends ad2 {
    public final s24 l;
    public final hd5 m;
    public final y24 n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final ne0 r;
    public final if1 s;

    public t24(s24 s24Var, hd5 hd5Var, String[] strArr, if1 if1Var) {
        ne0 ne0Var;
        hd5Var.getClass();
        this.l = s24Var;
        this.m = hd5Var;
        this.n = new y24(strArr, this);
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        if (s24Var.m()) {
            td0 td0Var = s24Var.a;
            if (td0Var == null) {
                h12.Q("coroutineScope");
                throw null;
            }
            ne0Var = td0Var.n;
        } else {
            ne0Var = q01.n;
        }
        this.r = ne0Var;
        this.s = if1Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x0027, B:44:0x00b6), top: B:64:0x0027, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[LOOP:0: B:42:0x00ae->B:48:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:12:0x0027, B:42:0x00ae, B:44:0x00b6, B:52:0x00d5, B:49:0x00cb, B:50:0x00d2), top: B:64:0x0027, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ac -> B:42:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e4 -> B:57:0x00e5). Please report as a decompilation issue!!! */
    public static final Object l(t24 t24Var, wd0 wd0Var) {
        z24 z24Var;
        t24 t24Var2;
        int i;
        xe0 xe0Var;
        if (wd0Var instanceof z24) {
            z24Var = (z24) wd0Var;
            int i2 = z24Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z24Var.r = i2 - Integer.MIN_VALUE;
            } else {
                z24Var = new z24(t24Var, wd0Var);
            }
        } else {
            z24Var = new z24(t24Var, wd0Var);
        }
        Object objF = z24Var.p;
        int i3 = z24Var.r;
        vd0 vd0Var = null;
        int i4 = 0;
        if (i3 == 0) {
            kb4.X(objF);
            if (t24Var.q.compareAndSet(false, true)) {
                s12 s12VarI = t24Var.l.i();
                y24 y24Var = t24Var.n;
                y24Var.getClass();
                f95 f95Var = new f95(s12VarI, y24Var);
                LinkedHashMap linkedHashMap = s12VarI.c;
                jy4 jy4Var = s12VarI.b;
                kd3 kd3VarG = jy4Var.g(f95Var.a);
                String[] strArr = (String[]) kd3VarG.n;
                int[] iArr = (int[]) kd3VarG.o;
                d83 d83Var = new d83(f95Var, iArr, strArr);
                ReentrantLock reentrantLock = s12VarI.d;
                reentrantLock.lock();
                try {
                    d83 d83Var2 = linkedHashMap.containsKey(f95Var) ? (d83) lg2.V(f95Var, linkedHashMap) : (d83) linkedHashMap.put(f95Var, d83Var);
                    reentrantLock.unlock();
                    if (d83Var2 == null && jy4Var.h.j(iArr)) {
                        g12.Q(new r12(s12VarI, vd0Var, i4));
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            t24Var2 = t24Var;
            if (t24Var.p.compareAndSet(false, true)) {
                objF = null;
                i = 0;
                while (t24Var2.o.compareAndSet(true, false)) {
                    z24Var.n = t24Var2;
                    z24Var.o = 1;
                    z24Var.r = 1;
                    objF = xl.F(t24Var2.l, true, t24Var2.s, z24Var);
                    xe0Var = xe0.n;
                    if (objF == xe0Var) {
                        return xe0Var;
                    }
                    i = 1;
                }
                if (i != 0) {
                    t24Var2.i(objF);
                }
                t24Var2.p.set(false);
            } else {
                i = 0;
            }
            if (i != 0) {
            }
            return j15.a;
        }
        if (i3 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = z24Var.o;
        t24Var2 = z24Var.n;
        try {
            try {
                kb4.X(objF);
                while (t24Var2.o.compareAndSet(true, false)) {
                    z24Var.n = t24Var2;
                    z24Var.o = 1;
                    z24Var.r = 1;
                    objF = xl.F(t24Var2.l, true, t24Var2.s, z24Var);
                    xe0Var = xe0.n;
                    if (objF == xe0Var) {
                        return xe0Var;
                    }
                    i = 1;
                }
                if (i != 0) {
                    t24Var2.i(objF);
                }
                t24Var2.p.set(false);
                if (i != 0 || !t24Var2.o.get()) {
                    return j15.a;
                }
                t24Var = t24Var2;
                t24Var2 = t24Var;
                if (t24Var.p.compareAndSet(false, true)) {
                    objF = null;
                    i = 0;
                    while (t24Var2.o.compareAndSet(true, false)) {
                        z24Var.n = t24Var2;
                        z24Var.o = 1;
                        z24Var.r = 1;
                        objF = xl.F(t24Var2.l, true, t24Var2.s, z24Var);
                        xe0Var = xe0.n;
                        if (objF == xe0Var) {
                            return xe0Var;
                        }
                        i = 1;
                    }
                    if (i != 0) {
                        t24Var2.i(objF);
                    }
                    t24Var2.p.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return j15.a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th2) {
            t24Var2.p.set(false);
            throw th2;
        }
    }

    @Override // defpackage.ad2
    public final void g() {
        hd5 hd5Var = this.m;
        hd5Var.getClass();
        ((Set) hd5Var.p).add(this);
        fu.G(this.l.h(), this.r, null, new x24(this, null, 1), 2);
    }

    @Override // defpackage.ad2
    public final void h() {
        hd5 hd5Var = this.m;
        hd5Var.getClass();
        ((Set) hd5Var.p).remove(this);
    }
}
