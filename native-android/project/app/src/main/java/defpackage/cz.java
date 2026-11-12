package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class cz extends or0 implements az, ye0, t85 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(cz.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(cz.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final vd0 q;
    public final ne0 r;

    static {
        Unsafe unsafe = dz.a;
        w = unsafe.objectFieldOffset(cz.class.getDeclaredField("_state$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(cz.class, Object.class, "_parentHandle$volatile");
        v = unsafe.objectFieldOffset(cz.class.getDeclaredField("_parentHandle$volatile"));
    }

    public cz(int i, vd0 vd0Var) {
        super(i);
        this.q = vd0Var;
        this.r = vd0Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f5.a;
    }

    public static Object F(o63 o63Var, Object obj, int i, xf1 xf1Var) {
        if (obj instanceof a70) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (xf1Var != null || (o63Var instanceof wy)) {
            return new y60(obj, o63Var instanceof wy ? (wy) o63Var : null, xf1Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thO;
        vd0 vd0Var = this.q;
        mr0 mr0Var = vd0Var instanceof mr0 ? (mr0) vd0Var : null;
        if (mr0Var == null || (thO = mr0Var.o(this)) == null) {
            return;
        }
        m();
        r(thO);
    }

    public final boolean C() {
        t.getClass();
        Unsafe unsafe = dz.a;
        long j = w;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof y60) && ((y60) objectVolatile).d != null) {
            m();
            return false;
        }
        s.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, f5.a);
        return true;
    }

    public final void D(Object obj, int i, xf1 xf1Var) {
        cz czVar;
        while (true) {
            t.getClass();
            Unsafe unsafe = dz.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof o63)) {
                cz czVar2 = this;
                if (objectVolatile instanceof hz) {
                    hz hzVar = (hz) objectVolatile;
                    if (hz.c.compareAndSet(hzVar, 0, 1)) {
                        if (xf1Var != null) {
                            czVar2.j(xf1Var, hzVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                mj0.g(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((o63) objectVolatile, obj, i, xf1Var);
            while (true) {
                Unsafe unsafe2 = dz.a;
                czVar = this;
                if (unsafe2.compareAndSwapObject(czVar, w, objectVolatile, objF)) {
                    if (!czVar.y()) {
                        czVar.m();
                    }
                    czVar.n(i);
                    return;
                } else if (unsafe2.getObjectVolatile(czVar, j) != objectVolatile) {
                    break;
                } else {
                    this = czVar;
                }
            }
            this = czVar;
        }
    }

    public final void E(pe0 pe0Var) {
        vd0 vd0Var = this.q;
        mr0 mr0Var = vd0Var instanceof mr0 ? (mr0) vd0Var : null;
        D(j15.a, (mr0Var != null ? mr0Var.q : null) == pe0Var ? 4 : this.p, null);
    }

    public final f01 G(Object obj, xf1 xf1Var) {
        cz czVar;
        f01 f01Var = vr1.a;
        while (true) {
            t.getClass();
            Unsafe unsafe = dz.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof o63)) {
                return null;
            }
            Object objF = F((o63) objectVolatile, obj, this.p, xf1Var);
            while (true) {
                Unsafe unsafe2 = dz.a;
                czVar = this;
                if (unsafe2.compareAndSwapObject(czVar, w, objectVolatile, objF)) {
                    if (!czVar.y()) {
                        czVar.m();
                    }
                    return f01Var;
                }
                if (unsafe2.getObjectVolatile(czVar, j) != objectVolatile) {
                    break;
                }
                this = czVar;
            }
            this = czVar;
        }
    }

    @Override // defpackage.t85
    public final void a(u84 u84Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = s;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                kf2.o("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(u84Var);
    }

    @Override // defpackage.or0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        cz czVar;
        while (true) {
            t.getClass();
            Unsafe unsafe = dz.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof o63) {
                kf2.o("Not completed");
                return;
            }
            if (objectVolatile instanceof a70) {
                return;
            }
            if (objectVolatile instanceof y60) {
                y60 y60Var = (y60) objectVolatile;
                if (y60Var.e != null) {
                    kf2.o("Must be called at most once");
                    return;
                }
                y60 y60VarA = y60.a(y60Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = dz.a;
                    cz czVar2 = this;
                    if (unsafe2.compareAndSwapObject(czVar2, w, objectVolatile, y60VarA)) {
                        wy wyVar = y60Var.b;
                        if (wyVar != null) {
                            czVar2.i(wyVar, cancellationException);
                        }
                        xf1 xf1Var = y60Var.c;
                        if (xf1Var != null) {
                            czVar2.j(xf1Var, cancellationException, y60Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(czVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        czVar = czVar2;
                        break;
                    }
                    this = czVar2;
                }
            } else {
                cz czVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                y60 y60Var2 = new y60(objectVolatile, (wy) null, (xf1) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    y60 y60Var3 = y60Var2;
                    Unsafe unsafe3 = dz.a;
                    czVar = czVar3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(czVar, w, objectVolatile, y60Var3);
                    y60Var2 = y60Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(czVar, j) != objectVolatile) {
                        break;
                    } else {
                        czVar3 = czVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = czVar;
        }
    }

    @Override // defpackage.az
    public final f01 c(Object obj, xf1 xf1Var) {
        return G(obj, xf1Var);
    }

    @Override // defpackage.or0
    public final vd0 d() {
        return this.q;
    }

    @Override // defpackage.or0
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // defpackage.or0
    public final Object f(Object obj) {
        return obj instanceof y60 ? ((y60) obj).a : obj;
    }

    @Override // defpackage.ye0
    public final ye0 getCallerFrame() {
        vd0 vd0Var = this.q;
        if (vd0Var instanceof ye0) {
            return (ye0) vd0Var;
        }
        return null;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r;
    }

    @Override // defpackage.or0
    public final Object h() {
        return s();
    }

    public final void i(wy wyVar, Throwable th) {
        try {
            switch (wyVar.a) {
                case 0:
                    ((ScheduledFuture) wyVar.b).cancel(false);
                    break;
                case 1:
                    ((if1) wyVar.b).invoke(th);
                    break;
                default:
                    ((as0) wyVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            uc5.s(this.r, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(xf1 xf1Var, Throwable th, Object obj) {
        ne0 ne0Var = this.r;
        try {
            xf1Var.a(th, obj, ne0Var);
        } catch (Throwable th2) {
            uc5.s(ne0Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.az
    public final void k(Object obj, xf1 xf1Var) {
        D(obj, this.p, xf1Var);
    }

    public final void l(u84 u84Var, Throwable th) {
        ne0 ne0Var = this.r;
        int i = s.get(this) & 536870911;
        if (i == 536870911) {
            kf2.o("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            u84Var.l(i, ne0Var);
        } catch (Throwable th2) {
            uc5.s(ne0Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        as0 as0VarP = p();
        if (as0VarP == null) {
            return;
        }
        as0VarP.a();
        u.getClass();
        dz.a.putObjectVolatile(this, v, k63.n);
    }

    public final void n(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = s;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    kf2.o("Already resumed");
                    return;
                }
                boolean z = i == 4;
                vd0 vd0Var = this.q;
                if (!z && (vd0Var instanceof mr0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.p;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        mr0 mr0Var = (mr0) vd0Var;
                        pe0 pe0Var = mr0Var.q;
                        ne0 context = mr0Var.r.getContext();
                        if (pe0Var.Y(context)) {
                            pe0Var.W(context, this);
                            return;
                        }
                        g21 g21VarA = it4.a();
                        if (g21VarA.p >= 4294967296L) {
                            g21VarA.b0(this);
                            return;
                        }
                        g21VarA.c0(true);
                        try {
                            wr1.P(this, vd0Var, true);
                            do {
                            } while (g21VarA.e0());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                g21VarA.a0(true);
                            }
                        }
                        return;
                    }
                }
                wr1.P(this, vd0Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable o(a32 a32Var) {
        return a32Var.q();
    }

    public final as0 p() {
        u.getClass();
        return (as0) dz.a.getObjectVolatile(this, v);
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        s22 s22Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = s;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    kf2.o("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objS = s();
                if (objS instanceof a70) {
                    throw ((a70) objS).a;
                }
                int i3 = this.p;
                if ((i3 != 1 && i3 != 2) || (s22Var = (s22) this.r.K(fz0.h0)) == null || s22Var.b()) {
                    return f(objS);
                }
                CancellationException cancellationExceptionQ = s22Var.q();
                b(cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (p() == null) {
            v();
        }
        if (zY) {
            B();
        }
        return xe0.n;
    }

    @Override // defpackage.az
    public final boolean r(Throwable th) {
        cz czVar;
        while (true) {
            t.getClass();
            Unsafe unsafe = dz.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof o63)) {
                return false;
            }
            hz hzVar = new hz(this, th, (objectVolatile instanceof wy) || (objectVolatile instanceof u84));
            while (true) {
                Unsafe unsafe2 = dz.a;
                czVar = this;
                if (unsafe2.compareAndSwapObject(czVar, w, objectVolatile, hzVar)) {
                    o63 o63Var = (o63) objectVolatile;
                    if (o63Var instanceof wy) {
                        czVar.i((wy) objectVolatile, th);
                    } else if (o63Var instanceof u84) {
                        czVar.l((u84) objectVolatile, th);
                    }
                    if (!czVar.y()) {
                        czVar.m();
                    }
                    czVar.n(czVar.p);
                    return true;
                }
                if (unsafe2.getObjectVolatile(czVar, j) != objectVolatile) {
                    break;
                }
                this = czVar;
            }
            this = czVar;
        }
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        Throwable thA = bb3.a(obj);
        if (thA != null) {
            obj = new a70(thA, false);
        }
        D(obj, this.p, null);
    }

    public final Object s() {
        t.getClass();
        return dz.a.getObjectVolatile(this, w);
    }

    @Override // defpackage.az
    public final void t(Object obj) {
        n(this.p);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(si0.P(this.q));
        sb.append("){");
        Object objS = s();
        if (objS instanceof o63) {
            str = "Active";
        } else {
            str = objS instanceof hz ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(si0.x(this));
        return sb.toString();
    }

    public final void u() {
        as0 as0VarV = v();
        if (as0VarV == null || (s() instanceof o63)) {
            return;
        }
        as0VarV.a();
        u.getClass();
        dz.a.putObjectVolatile(this, v, k63.n);
    }

    public final as0 v() {
        s22 s22Var = (s22) this.r.K(fz0.h0);
        if (s22Var == null) {
            return null;
        }
        as0 as0VarK = gb.K(s22Var, true, new b20(this));
        while (true) {
            u.getClass();
            Unsafe unsafe = dz.a;
            long j = v;
            cz czVar = this;
            if (unsafe.compareAndSwapObject(czVar, j, (Object) null, as0VarK) || unsafe.getObjectVolatile(czVar, j) != null) {
                break;
            }
            this = czVar;
        }
        return as0VarK;
    }

    public final void w(if1 if1Var) {
        x(new wy(1, if1Var));
    }

    public final void x(o63 o63Var) {
        cz czVar;
        Unsafe unsafe;
        cz czVar2;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = dz.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof f5) {
                while (true) {
                    Unsafe unsafe3 = dz.a;
                    czVar = this;
                    if (unsafe3.compareAndSwapObject(czVar, w, objectVolatile, o63Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(czVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = czVar;
                    }
                }
            } else {
                czVar = this;
                if ((objectVolatile instanceof wy) || (objectVolatile instanceof u84)) {
                    z(o63Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof a70) {
                    a70 a70Var = (a70) objectVolatile;
                    if (!a70.b.compareAndSet(a70Var, 0, 1)) {
                        z(o63Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof hz) {
                        Throwable th = a70Var.a;
                        if (o63Var instanceof wy) {
                            czVar.i((wy) o63Var, th);
                            return;
                        } else {
                            o63Var.getClass();
                            czVar.l((u84) o63Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof y60) {
                    y60 y60Var = (y60) objectVolatile;
                    if (y60Var.b != null) {
                        z(o63Var, objectVolatile);
                        throw null;
                    }
                    if (o63Var instanceof u84) {
                        return;
                    }
                    o63Var.getClass();
                    wy wyVar = (wy) o63Var;
                    Throwable th2 = y60Var.e;
                    if (th2 != null) {
                        czVar.i(wyVar, th2);
                        return;
                    }
                    y60 y60VarA = y60.a(y60Var, wyVar, null, 29);
                    do {
                        unsafe = dz.a;
                        czVar2 = czVar;
                        if (unsafe.compareAndSwapObject(czVar, w, objectVolatile, y60VarA)) {
                            return;
                        } else {
                            czVar = czVar2;
                        }
                    } while (unsafe.getObjectVolatile(czVar2, j) == objectVolatile);
                } else {
                    cz czVar3 = czVar;
                    if (o63Var instanceof u84) {
                        return;
                    }
                    o63Var.getClass();
                    y60 y60Var2 = new y60(objectVolatile, (wy) o63Var, (xf1) null, (Throwable) null, 28);
                    while (true) {
                        y60 y60Var3 = y60Var2;
                        Unsafe unsafe4 = dz.a;
                        czVar = czVar3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(czVar, w, objectVolatile, y60Var3);
                        y60Var2 = y60Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(czVar, j) != objectVolatile) {
                            break;
                        } else {
                            czVar3 = czVar;
                        }
                    }
                }
            }
            this = czVar;
        }
    }

    public final boolean y() {
        return this.p == 2 && ((mr0) this.q).m();
    }
}
