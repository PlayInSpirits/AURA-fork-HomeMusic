package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class aw implements y00 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(aw.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(aw.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(aw.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(aw.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int n;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = dz.a;
        B = unsafe.objectFieldOffset(aw.class.getDeclaredField("sendSegment$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "receiveSegment$volatile");
        A = unsafe.objectFieldOffset(aw.class.getDeclaredField("receiveSegment$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "bufferEndSegment$volatile");
        y = unsafe.objectFieldOffset(aw.class.getDeclaredField("bufferEndSegment$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "_closeCause$volatile");
        x = unsafe.objectFieldOffset(aw.class.getDeclaredField("_closeCause$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(aw.class, Object.class, "closeHandler$volatile");
        z = unsafe.objectFieldOffset(aw.class.getDeclaredField("closeHandler$volatile"));
    }

    public aw(int i) {
        this.n = i;
        if (i < 0) {
            kf2.e(b11.j(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        k10 k10Var = cw.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = q.get(this);
        k10 k10Var2 = new k10(0L, null, this, 3);
        this.sendSegment$volatile = k10Var2;
        this.receiveSegment$volatile = k10Var2;
        if (E()) {
            k10Var2 = cw.a;
            k10Var2.getClass();
        }
        this.bufferEndSegment$volatile = k10Var2;
        this._closeCause$volatile = cw.s;
    }

    public static Object H(aw awVar, ep4 ep4Var) throws Throwable {
        k10 k10Var;
        Throwable th;
        k10 k10Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        atomicReferenceFieldUpdater.getClass();
        if (awVar == null) {
            kf2.k();
            return null;
        }
        k10 k10Var3 = (k10) dz.a.getObjectVolatile(awVar, A);
        while (!awVar.B()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = p;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(awVar);
            long j = cw.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (k10Var3.e != j2) {
                k10 k10VarQ = awVar.q(j2, k10Var3);
                if (k10VarQ == null) {
                    continue;
                } else {
                    k10Var = k10VarQ;
                }
            } else {
                k10Var = k10Var3;
            }
            aw awVar2 = awVar;
            Object objP = awVar2.P(k10Var, i, andIncrement, null);
            f01 f01Var = cw.m;
            if (objP == f01Var) {
                kf2.o("unexpected");
                return null;
            }
            f01 f01Var2 = cw.o;
            if (objP == f01Var2) {
                if (andIncrement < awVar2.v()) {
                    k10Var.a();
                }
                awVar = awVar2;
                k10Var3 = k10Var;
            } else {
                if (objP != cw.n) {
                    k10Var.a();
                    return objP;
                }
                cz czVarS = zz1.s(ya4.x(ep4Var));
                try {
                    Object objP2 = awVar2.P(k10Var, i, andIncrement, czVarS);
                    if (objP2 != f01Var) {
                        if (objP2 == f01Var2) {
                            if (andIncrement < awVar2.v()) {
                                k10Var.a();
                            }
                            k10 k10Var4 = (k10) atomicReferenceFieldUpdater.get(awVar2);
                            while (true) {
                                if (awVar2.B()) {
                                    czVarS.resumeWith(new s14(awVar2.t()));
                                    break;
                                }
                                cz czVar = czVarS;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(awVar2);
                                    long j3 = cw.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (k10Var4.e != j4) {
                                        try {
                                            k10 k10VarQ2 = awVar2.q(j4, k10Var4);
                                            if (k10VarQ2 == null) {
                                                czVarS = czVar;
                                            } else {
                                                k10Var2 = k10VarQ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            czVarS = czVar;
                                            czVarS.B();
                                            throw th;
                                        }
                                    } else {
                                        k10Var2 = k10Var4;
                                    }
                                    aw awVar3 = awVar2;
                                    objP2 = awVar3.P(k10Var2, i2, andIncrement2, czVar);
                                    awVar2 = awVar3;
                                    k10 k10Var5 = k10Var2;
                                    czVarS = czVar;
                                    if (objP2 == cw.m) {
                                        czVarS.a(k10Var5, i2);
                                        break;
                                    }
                                    if (objP2 == cw.o) {
                                        if (andIncrement2 < awVar2.v()) {
                                            k10Var5.a();
                                        }
                                        k10Var4 = k10Var5;
                                    } else {
                                        if (objP2 == cw.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        k10Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    czVarS = czVar;
                                    th = th;
                                    czVarS.B();
                                    throw th;
                                }
                            }
                        } else {
                            k10Var.a();
                        }
                        czVarS.k(objP2, null);
                        break;
                    }
                    czVarS.a(k10Var, i);
                    return czVarS.q();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thT = awVar.t();
        int i3 = mk4.a;
        throw thT;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object I(aw awVar, wd0 wd0Var) {
        yv yvVar;
        k10 k10Var;
        if (wd0Var instanceof yv) {
            yvVar = (yv) wd0Var;
            int i = yvVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvVar.p = i - Integer.MIN_VALUE;
            } else {
                yvVar = new yv(awVar, wd0Var);
            }
        } else {
            yvVar = new yv(awVar, wd0Var);
        }
        yv yvVar2 = yvVar;
        Object obj = yvVar2.n;
        int i2 = yvVar2.p;
        if (i2 != 0) {
            if (i2 == 1) {
                kb4.X(obj);
                return ((j10) obj).a;
            }
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(obj);
        t.getClass();
        k10 k10Var2 = (k10) dz.a.getObjectVolatile(awVar, A);
        while (!awVar.B()) {
            long andIncrement = p.getAndIncrement(awVar);
            long j = cw.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (k10Var2.e != j2) {
                k10 k10VarQ = awVar.q(j2, k10Var2);
                if (k10VarQ == null) {
                    continue;
                } else {
                    k10Var = k10VarQ;
                }
            } else {
                k10Var = k10Var2;
            }
            aw awVar2 = awVar;
            Object objP = awVar2.P(k10Var, i3, andIncrement, null);
            if (objP == cw.m) {
                kf2.o("unexpected");
                return null;
            }
            if (objP != cw.o) {
                if (objP != cw.n) {
                    k10Var.a();
                    return objP;
                }
                yvVar2.p = 1;
                Object objJ = awVar2.J(k10Var, i3, andIncrement, yvVar2);
                xe0 xe0Var = xe0.n;
                return objJ == xe0Var ? xe0Var : objJ;
            }
            if (andIncrement < awVar2.v()) {
                k10Var.a();
            }
            awVar = awVar2;
            k10Var2 = k10Var;
        }
        return new h10(awVar.s());
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158 A[RETURN] */
    public static Object L(aw awVar, Object obj, vd0 vd0Var) {
        j15 j15Var;
        Object objQ;
        xe0 xe0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        atomicReferenceFieldUpdater.getClass();
        k10 k10Var = (k10) dz.a.getObjectVolatile(awVar, B);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(awVar);
            long j = andIncrement & 1152921504606846975L;
            boolean zA = awVar.A(false, andIncrement);
            int i = cw.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = k10Var.e;
            xe0 xe0Var2 = xe0.n;
            j15Var = j15.a;
            if (j4 != j3) {
                k10 k10VarR = awVar.r(j3, k10Var);
                if (k10VarR != null) {
                    k10Var = k10VarR;
                } else if (zA) {
                    Object objG = awVar.G(vd0Var, obj);
                    if (objG == xe0Var2) {
                        return objG;
                    }
                }
            }
            int iC = c(awVar, k10Var, i2, obj, j, null, zA);
            if (iC == 0) {
                k10Var.a();
                return j15Var;
            }
            if (iC != 1) {
                if (iC == 2) {
                    if (!zA) {
                        break;
                    }
                    k10Var.m();
                    Object objG2 = awVar.G(vd0Var, obj);
                    if (objG2 == xe0Var2) {
                        return objG2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = p;
                    if (iC == 3) {
                        cz czVarS = zz1.s(ya4.x(vd0Var));
                        try {
                            int iC2 = c(awVar, k10Var, i2, obj, j, czVarS, false);
                            if (iC2 != 0) {
                                if (iC2 == 1) {
                                    xe0Var2 = xe0Var2;
                                    czVarS.resumeWith(j15Var);
                                } else if (iC2 != 2) {
                                    if (iC2 == 4) {
                                        xe0Var2 = xe0Var2;
                                        if (j < atomicLongFieldUpdater2.get(awVar)) {
                                            k10Var.a();
                                        }
                                    } else {
                                        if (iC2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        k10Var.a();
                                        k10 k10Var2 = (k10) atomicReferenceFieldUpdater.get(awVar);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(awVar);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zA2 = awVar.A(false, andIncrement2);
                                            int i3 = cw.b;
                                            long j6 = i3;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j7 = j5 / j6;
                                            int i4 = (int) (j5 % j6);
                                            xe0Var2 = xe0Var2;
                                            if (k10Var2.e != j7) {
                                                k10 k10VarR2 = awVar.r(j7, k10Var2);
                                                if (k10VarR2 != null) {
                                                    k10Var2 = k10VarR2;
                                                } else if (zA2) {
                                                }
                                            }
                                            int iC3 = c(awVar, k10Var2, i4, obj, j5, czVarS, zA2);
                                            if (iC3 == 0) {
                                                k10Var2.a();
                                            } else if (iC3 != 1) {
                                                if (iC3 == 2) {
                                                    if (!zA2) {
                                                        czVarS.a(k10Var2, i4 + i3);
                                                        break;
                                                    }
                                                    k10Var2.m();
                                                } else {
                                                    if (iC3 == 3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    if (iC3 != 4) {
                                                        if (iC3 == 5) {
                                                            k10Var2.a();
                                                        }
                                                    } else if (j5 < atomicLongFieldUpdater2.get(awVar)) {
                                                        k10Var2.a();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b(awVar, obj, czVarS);
                                    break;
                                } else {
                                    xe0Var2 = xe0Var2;
                                    czVarS.a(k10Var, i2 + i);
                                }
                                objQ = czVarS.q();
                                xe0Var = xe0Var2;
                                if (objQ != xe0Var) {
                                    objQ = j15Var;
                                }
                                if (objQ == xe0Var) {
                                    return objQ;
                                }
                            } else {
                                xe0Var2 = xe0Var2;
                                k10Var.a();
                            }
                            czVarS.resumeWith(j15Var);
                            objQ = czVarS.q();
                            xe0Var = xe0Var2;
                            if (objQ != xe0Var) {
                                objQ = j15Var;
                            }
                            if (objQ == xe0Var) {
                                return objQ;
                            }
                        } catch (Throwable th) {
                            czVarS.B();
                            throw th;
                        }
                    } else if (iC == 4) {
                        if (j < atomicLongFieldUpdater2.get(awVar)) {
                            k10Var.a();
                        }
                        Object objG3 = awVar.G(vd0Var, obj);
                        if (objG3 == xe0Var2) {
                            return objG3;
                        }
                    } else if (iC == 5) {
                        k10Var.a();
                    }
                }
            } else {
                break;
            }
        }
        return j15Var;
    }

    public static boolean N(Object obj) {
        if (obj instanceof az) {
            return cw.a((az) obj, j15.a, null);
        }
        mj0.g(obj, "Unexpected waiter: ");
        return false;
    }

    public static final void b(aw awVar, Object obj, cz czVar) {
        czVar.resumeWith(new s14(awVar.u()));
    }

    public static final int c(aw awVar, k10 k10Var, int i, Object obj, long j, Object obj2, boolean z2) {
        k10Var.r(i, obj);
        if (z2) {
            return awVar.Q(k10Var, i, obj, j, obj2, z2);
        }
        Object objP = k10Var.p(i);
        if (objP == null) {
            if (awVar.e(j)) {
                if (k10Var.o(i, null, cw.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (k10Var.o(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objP instanceof t85) {
            k10Var.r(i, null);
            if (awVar.M(objP, obj)) {
                k10Var.s(i, cw.i);
                return 0;
            }
            f01 f01Var = cw.k;
            if (k10Var.h.getAndSet((i * 2) + 1, f01Var) == f01Var) {
                return 5;
            }
            k10Var.q(i, true);
            return 5;
        }
        return awVar.Q(k10Var, i, obj, j, obj2, z2);
    }

    public static void x(aw awVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        if ((atomicLongFieldUpdater.addAndGet(awVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(awVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(boolean z2, long j) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m(j & 1152921504606846975L);
                if (!z2 || !w()) {
                }
            } else {
                if (i != 3) {
                    nz2.f(f34.f(i, "unexpected close status: "));
                    return false;
                }
                k10 k10VarM = m(j & 1152921504606846975L);
                Object objJ = null;
                loop0: do {
                    for (int i2 = cw.b - 1; -1 < i2; i2--) {
                        long j2 = (k10VarM.e * ((long) cw.b)) + ((long) i2);
                        while (true) {
                            Object objP = k10VarM.p(i2);
                            if (objP == cw.i) {
                                break loop0;
                            }
                            f01 f01Var = cw.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = p;
                            if (objP != f01Var) {
                                if (objP != cw.e && objP != null) {
                                    if (!(objP instanceof t85) && !(objP instanceof u85)) {
                                        f01 f01Var2 = cw.g;
                                        if (objP == f01Var2 || objP == cw.f) {
                                            break loop0;
                                        }
                                        if (objP != f01Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        t85 t85Var = objP instanceof u85 ? ((u85) objP).a : (t85) objP;
                                        if (k10VarM.o(i2, objP, cw.l)) {
                                            objJ = g12.J(objJ, t85Var);
                                            k10VarM.r(i2, null);
                                            k10VarM.m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (k10VarM.o(i2, objP, cw.l)) {
                                        k10VarM.m();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (k10VarM.o(i2, objP, cw.l)) {
                                    k10VarM.r(i2, null);
                                    k10VarM.m();
                                    break;
                                }
                            }
                        }
                    }
                    k10VarM = (k10) k10VarM.e();
                } while (k10VarM != null);
                if (objJ != null) {
                    if (objJ instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objJ;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            K((t85) arrayList.get(size), false);
                        }
                    } else {
                        K((t85) objJ, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean B() {
        return A(true, o.get(this));
    }

    public final boolean C() {
        return A(false, o.get(this));
    }

    public boolean D() {
        return false;
    }

    public final boolean E() {
        long j = q.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void F(long j, k10 k10Var) {
        aw awVar;
        k10 k10Var2;
        k10 k10Var3;
        while (k10Var.e < j && (k10Var3 = (k10) k10Var.c()) != null) {
            k10Var = k10Var3;
        }
        while (true) {
            k10 k10Var4 = k10Var;
            while (k10Var4.f() && (k10Var2 = (k10) k10Var4.c()) != null) {
                k10Var4 = k10Var2;
            }
            while (true) {
                u.getClass();
                Unsafe unsafe = dz.a;
                long j2 = y;
                u84 u84Var = (u84) unsafe.getObjectVolatile(this, j2);
                if (u84Var.e >= k10Var4.e) {
                    return;
                }
                if (!k10Var4.n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = dz.a;
                    awVar = this;
                    if (unsafe2.compareAndSwapObject(awVar, y, u84Var, k10Var4)) {
                        if (u84Var.j()) {
                            u84Var.h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(awVar, j2) != u84Var) {
                        break;
                    } else {
                        this = awVar;
                    }
                }
                if (k10Var4.j()) {
                    k10Var4.h();
                }
                this = awVar;
            }
            k10Var = k10Var4;
        }
    }

    public final Object G(vd0 vd0Var, Object obj) {
        cz czVar = new cz(1, ya4.x(vd0Var));
        czVar.u();
        czVar.resumeWith(new s14(u()));
        Object objQ = czVar.q();
        return objQ == xe0.n ? objQ : j15.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(k10 k10Var, int i, long j, wd0 wd0Var) {
        zv zvVar;
        j10 j10Var;
        k10 k10Var2;
        if (wd0Var instanceof zv) {
            zvVar = (zv) wd0Var;
            int i2 = zvVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zvVar.p = i2 - Integer.MIN_VALUE;
            } else {
                zvVar = new zv(this, wd0Var);
            }
        } else {
            zvVar = new zv(this, wd0Var);
        }
        Object objQ = zvVar.n;
        int i3 = zvVar.p;
        if (i3 == 0) {
            kb4.X(objQ);
            zvVar.p = 1;
            cz czVarS = zz1.s(ya4.x(zvVar));
            try {
                hv3 hv3Var = new hv3(czVarS);
                Object objP = P(k10Var, i, j, hv3Var);
                if (objP != cw.m) {
                    if (objP == cw.o) {
                        if (j < v()) {
                            k10Var.a();
                        }
                        k10 k10Var3 = (k10) t.get(this);
                        while (true) {
                            if (B()) {
                                czVarS.resumeWith(new j10(new h10(s())));
                                break;
                            }
                            long andIncrement = p.getAndIncrement(this);
                            long j2 = cw.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (k10Var3.e != j3) {
                                k10 k10VarQ = q(j3, k10Var3);
                                if (k10VarQ != null) {
                                    k10Var2 = k10VarQ;
                                }
                            } else {
                                k10Var2 = k10Var3;
                            }
                            Object objP2 = P(k10Var2, i4, andIncrement, hv3Var);
                            k10 k10Var4 = k10Var2;
                            if (objP2 == cw.m) {
                                hv3Var.a(k10Var4, i4);
                                break;
                            }
                            if (objP2 == cw.o) {
                                if (andIncrement < v()) {
                                    k10Var4.a();
                                }
                                k10Var3 = k10Var4;
                            } else {
                                if (objP2 == cw.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                k10Var4.a();
                                j10Var = new j10(objP2);
                            }
                        }
                    } else {
                        k10Var.a();
                        j10Var = new j10(objP);
                    }
                    czVarS.k(j10Var, null);
                    break;
                }
                hv3Var.a(k10Var, i);
                objQ = czVarS.q();
                xe0 xe0Var = xe0.n;
                if (objQ == xe0Var) {
                    return xe0Var;
                }
            } catch (Throwable th) {
                czVarS.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objQ);
        }
        return ((j10) objQ).a;
    }

    public final void K(t85 t85Var, boolean z2) {
        if (t85Var instanceof az) {
            ((vd0) t85Var).resumeWith(new s14(z2 ? t() : u()));
            return;
        }
        if (t85Var instanceof hv3) {
            ((hv3) t85Var).n.resumeWith(new j10(new h10(s())));
            return;
        }
        if (!(t85Var instanceof xv)) {
            mj0.g(t85Var, "Unexpected waiter: ");
            return;
        }
        xv xvVar = (xv) t85Var;
        cz czVar = xvVar.o;
        czVar.getClass();
        xvVar.o = null;
        xvVar.n = cw.l;
        Throwable thS = xvVar.p.s();
        if (thS == null) {
            czVar.resumeWith(Boolean.FALSE);
        } else {
            czVar.resumeWith(new s14(thS));
        }
    }

    public final boolean M(Object obj, Object obj2) {
        if (obj instanceof hv3) {
            return cw.a(((hv3) obj).n, new j10(obj2), null);
        }
        if (!(obj instanceof xv)) {
            if (obj instanceof az) {
                return cw.a((az) obj, obj2, null);
            }
            mj0.g(obj, "Unexpected receiver type: ");
            return false;
        }
        xv xvVar = (xv) obj;
        cz czVar = xvVar.o;
        czVar.getClass();
        xvVar.o = null;
        xvVar.n = obj2;
        Boolean bool = Boolean.TRUE;
        xvVar.p.getClass();
        return cw.a(czVar, bool, null);
    }

    public final Object O(Object obj) {
        k10 k10VarR;
        e01 e01Var = cw.d;
        s.getClass();
        k10 k10Var = (k10) dz.a.getObjectVolatile(this, B);
        while (true) {
            long andIncrement = o.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zA = this.A(false, andIncrement);
            int i = cw.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (k10Var.e != j3) {
                k10VarR = this.r(j3, k10Var);
                if (k10VarR == null) {
                    if (zA) {
                        return new h10(this.u());
                    }
                }
            } else {
                k10VarR = k10Var;
            }
            Object obj2 = obj;
            int iC = c(this, k10VarR, i2, obj2, j, e01Var, zA);
            aw awVar = this;
            k10Var = k10VarR;
            j15 j15Var = j15.a;
            if (iC == 0) {
                k10Var.a();
                return j15Var;
            }
            if (iC != 1) {
                if (iC != 2) {
                    if (iC == 3) {
                        kf2.o("unexpected");
                        return null;
                    }
                    if (iC == 4) {
                        if (j < p.get(awVar)) {
                            k10Var.a();
                        }
                        return new h10(awVar.u());
                    }
                    if (iC == 5) {
                        k10Var.a();
                    }
                    this = awVar;
                    obj = obj2;
                } else {
                    if (zA) {
                        k10Var.m();
                        return new h10(awVar.u());
                    }
                    t85 t85Var = e01Var instanceof t85 ? (t85) e01Var : null;
                    if (t85Var != null) {
                        t85Var.a(k10Var, i2 + i);
                    }
                    awVar.n((k10Var.e * j2) + ((long) i2));
                }
            }
            return j15Var;
        }
    }

    public final Object P(k10 k10Var, int i, long j, Object obj) {
        Object objP = k10Var.p(i);
        AtomicReferenceArray atomicReferenceArray = k10Var.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (objP == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return cw.n;
                }
                if (k10Var.o(i, objP, obj)) {
                    o();
                    return cw.m;
                }
            }
        } else if (objP == cw.d && k10Var.o(i, objP, cw.i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i * 2);
            k10Var.r(i, null);
            return obj2;
        }
        while (true) {
            Object objP2 = k10Var.p(i);
            if (objP2 == null || objP2 == cw.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (k10Var.o(i, objP2, cw.h)) {
                        o();
                        return cw.o;
                    }
                } else {
                    if (obj == null) {
                        return cw.n;
                    }
                    if (k10Var.o(i, objP2, obj)) {
                        o();
                        return cw.m;
                    }
                }
            } else if (objP2 != cw.d) {
                f01 f01Var = cw.j;
                if (objP2 == f01Var) {
                    return cw.o;
                }
                if (objP2 == cw.h) {
                    return cw.o;
                }
                if (objP2 == cw.l) {
                    o();
                    return cw.o;
                }
                if (objP2 != cw.g && k10Var.o(i, objP2, cw.f)) {
                    boolean z2 = objP2 instanceof u85;
                    if (z2) {
                        objP2 = ((u85) objP2).a;
                    }
                    if (N(objP2)) {
                        k10Var.s(i, cw.i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        k10Var.r(i, null);
                        return obj3;
                    }
                    k10Var.s(i, f01Var);
                    k10Var.m();
                    if (z2) {
                        o();
                    }
                    return cw.o;
                }
            } else if (k10Var.o(i, objP2, cw.i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i * 2);
                k10Var.r(i, null);
                return obj4;
            }
        }
    }

    public final int Q(k10 k10Var, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objP = k10Var.p(i);
            if (objP == null) {
                if (!e(j) || z2) {
                    if (z2) {
                        if (k10Var.o(i, null, cw.j)) {
                            k10Var.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (k10Var.o(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (k10Var.o(i, null, cw.d)) {
                    break;
                }
            } else {
                if (objP != cw.e) {
                    f01 f01Var = cw.k;
                    if (objP == f01Var) {
                        k10Var.r(i, null);
                        return 5;
                    }
                    if (objP == cw.h) {
                        k10Var.r(i, null);
                        return 5;
                    }
                    if (objP == cw.l) {
                        k10Var.r(i, null);
                        C();
                        return 4;
                    }
                    k10Var.r(i, null);
                    if (objP instanceof u85) {
                        objP = ((u85) objP).a;
                    }
                    if (M(objP, obj)) {
                        k10Var.s(i, cw.i);
                        return 0;
                    }
                    if (k10Var.h.getAndSet((i * 2) + 1, f01Var) != f01Var) {
                        k10Var.q(i, true);
                    }
                    return 5;
                }
                if (k10Var.o(i, objP, cw.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void R(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        aw awVar = this;
        if (awVar.E()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = q;
            if (atomicLongFieldUpdater.get(awVar) > j) {
                break;
            } else {
                awVar = this;
            }
        }
        int i = cw.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = r;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(awVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(awVar)) && j2 == atomicLongFieldUpdater.get(awVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(awVar);
                    if (atomicLongFieldUpdater2.compareAndSet(awVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        awVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(awVar);
                    long j5 = atomicLongFieldUpdater2.get(awVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(awVar)) {
                        break;
                    }
                    if (z2) {
                        awVar = this;
                    } else {
                        awVar = this;
                        atomicLongFieldUpdater2.compareAndSet(awVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(awVar);
                    if (atomicLongFieldUpdater2.compareAndSet(awVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        awVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.y94
    public Object a(vd0 vd0Var, Object obj) {
        return L(this, obj, vd0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // defpackage.y94
    public Object d(Object obj) {
        int iC;
        j15 j15Var;
        t85 t85Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = A(false, j) ? false : !e(j & 1152921504606846975L);
        i10 i10Var = j10.b;
        if (z3) {
            return i10Var;
        }
        e01 e01Var = cw.j;
        s.getClass();
        k10 k10Var = (k10) dz.a.getObjectVolatile(this, B);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zA = A(z2, andIncrement);
            int i = cw.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (k10Var.e == j5) {
                iC = c(this, k10Var, i2, obj, j3, e01Var, zA);
                j15Var = j15.a;
                if (iC != 0) {
                    k10Var.a();
                    return j15Var;
                }
                if (iC != 1) {
                    return j15Var;
                }
                if (iC != 2) {
                    if (zA) {
                        k10Var.m();
                        return new h10(u());
                    }
                    t85Var = e01Var instanceof t85 ? (t85) e01Var : null;
                    if (t85Var != null) {
                        t85Var.a(k10Var, i2 + i);
                    }
                    k10Var.m();
                    return i10Var;
                }
                if (iC != 3) {
                    kf2.o("unexpected");
                    return null;
                }
                if (iC != 4) {
                    if (j3 < p.get(this)) {
                        k10Var.a();
                    }
                    return new h10(u());
                }
                if (iC == 5) {
                    k10Var.a();
                }
                z2 = false;
            } else {
                k10 k10VarR = r(j5, k10Var);
                if (k10VarR != null) {
                    k10Var = k10VarR;
                    iC = c(this, k10Var, i2, obj, j3, e01Var, zA);
                    j15Var = j15.a;
                    if (iC != 0) {
                        k10Var.a();
                        return j15Var;
                    }
                    if (iC != 1) {
                        return j15Var;
                    }
                    if (iC != 2) {
                        if (zA) {
                            k10Var.m();
                            return new h10(u());
                        }
                        if (e01Var instanceof t85) {
                        }
                        if (t85Var != null) {
                            t85Var.a(k10Var, i2 + i);
                        }
                        k10Var.m();
                        return i10Var;
                    }
                    if (iC != 3) {
                        kf2.o("unexpected");
                        return null;
                    }
                    if (iC != 4) {
                        if (j3 < p.get(this)) {
                            k10Var.a();
                        }
                        return new h10(u());
                    }
                    if (iC == 5) {
                        k10Var.a();
                    }
                    z2 = false;
                } else {
                    if (zA) {
                        return new h10(u());
                    }
                    z2 = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    public final boolean e(long j) {
        return j < q.get(this) || j < p.get(this) + ((long) this.n);
    }

    @Override // defpackage.y00
    public final void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // defpackage.y00
    public final Object g() {
        k10 k10Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = o.get(this);
        if (A(true, j2)) {
            return new h10(s());
        }
        long j3 = j2 & 1152921504606846975L;
        i10 i10Var = j10.b;
        if (j >= j3) {
            return i10Var;
        }
        Object obj = cw.k;
        t.getClass();
        k10 k10Var2 = (k10) dz.a.getObjectVolatile(this, A);
        while (!this.B()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = cw.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (k10Var2.e != j5) {
                k10 k10VarQ = this.q(j5, k10Var2);
                if (k10VarQ == null) {
                    continue;
                } else {
                    k10Var = k10VarQ;
                }
            } else {
                k10Var = k10Var2;
            }
            aw awVar = this;
            Object objP = awVar.P(k10Var, i, andIncrement, obj);
            k10Var2 = k10Var;
            if (objP == cw.m) {
                t85 t85Var = obj instanceof t85 ? (t85) obj : null;
                if (t85Var != null) {
                    t85Var.a(k10Var2, i);
                }
                awVar.R(andIncrement);
                k10Var2.m();
                return i10Var;
            }
            if (objP != cw.o) {
                if (objP != cw.n) {
                    k10Var2.a();
                    return objP;
                }
                kf2.o("unexpected");
                return null;
            }
            if (andIncrement < awVar.v()) {
                k10Var2.a();
            }
            this = awVar;
        }
        return new h10(this.s());
    }

    @Override // defpackage.y00
    public final Object h(ep4 ep4Var) {
        return H(this, ep4Var);
    }

    @Override // defpackage.y00
    public final Object i(c60 c60Var) {
        return I(this, c60Var);
    }

    @Override // defpackage.y00
    public final xv iterator() {
        return new xv(this);
    }

    public final boolean j(Throwable th) {
        return l(th, false);
    }

    public final k10 k() {
        u.getClass();
        Unsafe unsafe = dz.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, y);
        s.getClass();
        k10 k10Var = (k10) unsafe.getObjectVolatile(this, B);
        if (k10Var.e > ((k10) objectVolatile).e) {
            objectVolatile = k10Var;
        }
        t.getClass();
        k10 k10Var2 = (k10) unsafe.getObjectVolatile(this, A);
        if (k10Var2.e > ((k10) objectVolatile).e) {
            objectVolatile = k10Var2;
        }
        p90 p90Var = (p90) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p90.a;
            Object objD = p90Var.d();
            if (objD == ud3.a) {
                break;
            }
            p90 p90Var2 = (p90) objD;
            if (p90Var2 != null) {
                p90Var = p90Var2;
            } else if (p90Var.g()) {
                break;
            }
        }
        return (k10) p90Var;
    }

    public final boolean l(Throwable th, boolean z2) {
        aw awVar;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (!z2) {
            awVar = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                awVar = this;
                break;
            }
            k10 k10Var = cw.a;
            awVar = this;
            if (atomicLongFieldUpdater.compareAndSet(awVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = awVar;
        }
        f01 f01Var = cw.s;
        while (true) {
            v.getClass();
            aw awVar2 = awVar;
            Unsafe unsafe = dz.a;
            long j5 = x;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(awVar2, j5, f01Var, th2);
            awVar = awVar2;
            if (zCompareAndSwapObject) {
                z3 = true;
                break;
            }
            if (unsafe.getObjectVolatile(awVar, j5) != f01Var) {
                z3 = false;
                break;
            }
            th = th2;
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(awVar);
            } while (!atomicLongFieldUpdater.compareAndSet(awVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(awVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(awVar, j, j2));
        }
        awVar.C();
        if (z3) {
            awVar.y();
        }
        return z3;
    }

    public final k10 m(long j) {
        long j2;
        k10 k10VarK = k();
        if (D()) {
            k10 k10Var = k10VarK;
            loop0: while (true) {
                int i = cw.b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (k10Var.e * ((long) cw.b)) + ((long) i);
                        if (j2 >= p.get(this)) {
                            while (true) {
                                Object objP = k10Var.p(i);
                                if (objP != null && objP != cw.e) {
                                    if (objP != cw.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (k10Var.o(i, objP, cw.l)) {
                                    k10Var.m();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        k10Var = (k10) k10Var.e();
                        if (k10Var == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                n(j2);
            }
        }
        Object objJ = null;
        loop3: for (k10 k10Var2 = k10VarK; k10Var2 != null; k10Var2 = (k10) k10Var2.e()) {
            for (int i2 = cw.b - 1; -1 < i2; i2--) {
                if ((k10Var2.e * ((long) cw.b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objP2 = k10Var2.p(i2);
                    if (objP2 != null && objP2 != cw.e) {
                        if (!(objP2 instanceof u85)) {
                            if (!(objP2 instanceof t85)) {
                                break;
                            }
                            if (k10Var2.o(i2, objP2, cw.l)) {
                                objJ = g12.J(objJ, objP2);
                                k10Var2.q(i2, true);
                                break;
                            }
                        } else {
                            if (k10Var2.o(i2, objP2, cw.l)) {
                                objJ = g12.J(objJ, ((u85) objP2).a);
                                k10Var2.q(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (k10Var2.o(i2, objP2, cw.l)) {
                            k10Var2.m();
                            break;
                        }
                    }
                }
            }
        }
        if (objJ != null) {
            if (!(objJ instanceof ArrayList)) {
                K((t85) objJ, true);
                return k10VarK;
            }
            ArrayList arrayList = (ArrayList) objJ;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                K((t85) arrayList.get(size), true);
            }
        }
        return k10VarK;
    }

    public final void n(long j) {
        t.getClass();
        k10 k10Var = (k10) dz.a.getObjectVolatile(this, A);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = p;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.n) + j2, q.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = cw.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (k10Var.e != j4) {
                    k10 k10VarQ = this.q(j4, k10Var);
                    if (k10VarQ != null) {
                        k10Var = k10VarQ;
                    }
                }
                k10 k10Var2 = k10Var;
                if (this.P(k10Var2, i, j2, null) != cw.o || j2 < this.v()) {
                    k10Var2.a();
                }
                k10Var = k10Var2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    public final void o() {
        int i;
        boolean z2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objP;
        if (E()) {
            return;
        }
        u.getClass();
        k10 k10Var = (k10) dz.a.getObjectVolatile(this, y);
        while (true) {
            long andIncrement = q.getAndIncrement(this);
            long j = cw.b;
            long j2 = andIncrement / j;
            if (this.v() <= andIncrement) {
                if (k10Var.e < j2 && k10Var.c() != null) {
                    this.F(j2, k10Var);
                }
                x(this);
                return;
            }
            aw awVar = this;
            if (k10Var.e == j2) {
                i = (int) (andIncrement % j);
                Object objP2 = k10Var.p(i);
                z2 = objP2 instanceof t85;
                atomicLongFieldUpdater = p;
                if (z2 || andIncrement < atomicLongFieldUpdater.get(awVar) || !k10Var.o(i, objP2, cw.g)) {
                    while (true) {
                        objP = k10Var.p(i);
                        if (objP instanceof t85) {
                            if (andIncrement < atomicLongFieldUpdater.get(awVar)) {
                                if (k10Var.o(i, objP, new u85((t85) objP))) {
                                    x(awVar);
                                    return;
                                }
                            } else if (k10Var.o(i, objP, cw.g)) {
                                if (!N(objP)) {
                                    k10Var.s(i, cw.j);
                                    k10Var.m();
                                    break;
                                } else {
                                    k10Var.s(i, cw.d);
                                    x(awVar);
                                    return;
                                }
                            }
                        } else {
                            if (objP == cw.j) {
                                break;
                            }
                            if (objP == null) {
                                if (k10Var.o(i, objP, cw.e)) {
                                    x(awVar);
                                    return;
                                }
                            } else if (objP != cw.d || objP == cw.h || objP == cw.i || objP == cw.k || objP == cw.l) {
                                x(awVar);
                                return;
                            } else if (objP != cw.f) {
                                mj0.g(objP, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    x(awVar);
                } else if (N(objP2)) {
                    k10Var.s(i, cw.d);
                    x(awVar);
                    return;
                } else {
                    k10Var.s(i, cw.j);
                    k10Var.m();
                    x(awVar);
                }
            } else {
                k10 k10VarP = awVar.p(j2, k10Var, andIncrement);
                if (k10VarP == null) {
                    continue;
                } else {
                    k10Var = k10VarP;
                    i = (int) (andIncrement % j);
                    Object objP3 = k10Var.p(i);
                    z2 = objP3 instanceof t85;
                    atomicLongFieldUpdater = p;
                    if (z2) {
                        while (true) {
                            objP = k10Var.p(i);
                            if (objP instanceof t85) {
                                if (andIncrement < atomicLongFieldUpdater.get(awVar)) {
                                    if (k10Var.o(i, objP, new u85((t85) objP))) {
                                        x(awVar);
                                        return;
                                    }
                                } else if (k10Var.o(i, objP, cw.g)) {
                                    if (!N(objP)) {
                                        k10Var.s(i, cw.j);
                                        k10Var.m();
                                        break;
                                    } else {
                                        k10Var.s(i, cw.d);
                                        x(awVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objP == cw.j) {
                                    break;
                                    break;
                                }
                                if (objP == null) {
                                    if (objP != cw.d) {
                                        if (objP != cw.f) {
                                            mj0.g(objP, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    x(awVar);
                                    return;
                                }
                                if (k10Var.o(i, objP, cw.e)) {
                                    x(awVar);
                                    return;
                                }
                            }
                        }
                        x(awVar);
                    } else {
                        while (true) {
                            objP = k10Var.p(i);
                            if (objP instanceof t85) {
                                if (andIncrement < atomicLongFieldUpdater.get(awVar)) {
                                    if (k10Var.o(i, objP, new u85((t85) objP))) {
                                        x(awVar);
                                        return;
                                    }
                                } else if (k10Var.o(i, objP, cw.g)) {
                                    if (!N(objP)) {
                                        k10Var.s(i, cw.j);
                                        k10Var.m();
                                        break;
                                    } else {
                                        k10Var.s(i, cw.d);
                                        x(awVar);
                                        return;
                                    }
                                }
                            } else {
                                if (objP == cw.j) {
                                    break;
                                    break;
                                }
                                if (objP == null) {
                                    if (objP != cw.d) {
                                        if (objP != cw.f) {
                                            mj0.g(objP, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    x(awVar);
                                    return;
                                }
                                if (k10Var.o(i, objP, cw.e)) {
                                    x(awVar);
                                    return;
                                }
                            }
                        }
                        x(awVar);
                    }
                }
            }
            this = awVar;
        }
    }

    public final k10 p(long j, k10 k10Var, long j2) {
        Object objJ;
        Unsafe unsafe;
        k10 k10Var2 = cw.a;
        bw bwVar = bw.n;
        loop0: while (true) {
            objJ = ud3.j(k10Var, j, bwVar);
            if (!xl.x(objJ)) {
                u84 u84VarV = xl.v(objJ);
                while (true) {
                    u.getClass();
                    Unsafe unsafe2 = dz.a;
                    long j3 = y;
                    u84 u84Var = (u84) unsafe2.getObjectVolatile(this, j3);
                    if (u84Var.e >= u84VarV.e) {
                        break loop0;
                    }
                    if (!u84VarV.n()) {
                        break;
                    }
                    do {
                        unsafe = dz.a;
                        if (unsafe.compareAndSwapObject(this, y, u84Var, u84VarV)) {
                            if (!u84Var.j()) {
                                break loop0;
                            }
                            u84Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == u84Var);
                    if (u84VarV.j()) {
                        u84VarV.h();
                    }
                }
            } else {
                break;
            }
        }
        if (xl.x(objJ)) {
            C();
            F(j, k10Var);
            x(this);
            return null;
        }
        k10 k10Var3 = (k10) xl.v(objJ);
        long j4 = k10Var3.e;
        if (j4 <= j) {
            return k10Var3;
        }
        long j5 = j4 * ((long) cw.b);
        if (!q.compareAndSet(this, j2 + 1, j5)) {
            x(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final k10 q(long j, k10 k10Var) {
        Object objJ;
        k10 k10Var2;
        long j2;
        Unsafe unsafe;
        k10 k10Var3 = cw.a;
        bw bwVar = bw.n;
        loop0: while (true) {
            objJ = ud3.j(k10Var, j, bwVar);
            if (!xl.x(objJ)) {
                u84 u84VarV = xl.v(objJ);
                while (true) {
                    t.getClass();
                    Unsafe unsafe2 = dz.a;
                    long j3 = A;
                    u84 u84Var = (u84) unsafe2.getObjectVolatile(this, j3);
                    if (u84Var.e >= u84VarV.e) {
                        break loop0;
                    }
                    if (!u84VarV.n()) {
                        break;
                    }
                    do {
                        unsafe = dz.a;
                        if (unsafe.compareAndSwapObject(this, A, u84Var, u84VarV)) {
                            if (!u84Var.j()) {
                                break loop0;
                            }
                            u84Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == u84Var);
                    if (u84VarV.j()) {
                        u84VarV.h();
                    }
                }
            } else {
                break;
            }
        }
        if (xl.x(objJ)) {
            C();
            if (k10Var.e * ((long) cw.b) < v()) {
                k10Var.a();
                return null;
            }
        } else {
            k10 k10Var4 = (k10) xl.v(objJ);
            long j4 = k10Var4.e;
            if (E() || j > q.get(this) / ((long) cw.b)) {
                k10Var2 = k10Var4;
                break;
            }
            loop3: while (true) {
                u.getClass();
                Unsafe unsafe3 = dz.a;
                long j5 = y;
                u84 u84Var2 = (u84) unsafe3.getObjectVolatile(this, j5);
                if (u84Var2.e >= j4 || !k10Var4.n()) {
                    k10Var2 = k10Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = dz.a;
                    k10Var2 = k10Var4;
                    if (unsafe4.compareAndSwapObject(this, y, u84Var2, k10Var4)) {
                        if (!u84Var2.j()) {
                            break loop3;
                        }
                        u84Var2.h();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != u84Var2) {
                        break;
                    }
                    k10Var4 = k10Var2;
                }
                if (k10Var2.j()) {
                    k10Var2.h();
                }
                k10Var4 = k10Var2;
            }
            if (j4 <= j) {
                return k10Var2;
            }
            long j6 = j4 * ((long) cw.b);
            do {
                j2 = p.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!p.compareAndSet(this, j2, j6));
            if (j4 * ((long) cw.b) < v()) {
                k10Var2.a();
            }
        }
        return null;
    }

    public final k10 r(long j, k10 k10Var) {
        Object objJ;
        long j2;
        long j3;
        Unsafe unsafe;
        k10 k10Var2 = cw.a;
        bw bwVar = bw.n;
        loop0: while (true) {
            objJ = ud3.j(k10Var, j, bwVar);
            if (!xl.x(objJ)) {
                u84 u84VarV = xl.v(objJ);
                while (true) {
                    s.getClass();
                    Unsafe unsafe2 = dz.a;
                    long j4 = B;
                    u84 u84Var = (u84) unsafe2.getObjectVolatile(this, j4);
                    if (u84Var.e >= u84VarV.e) {
                        break loop0;
                    }
                    if (!u84VarV.n()) {
                        break;
                    }
                    do {
                        unsafe = dz.a;
                        if (unsafe.compareAndSwapObject(this, B, u84Var, u84VarV)) {
                            if (!u84Var.j()) {
                                break loop0;
                            }
                            u84Var.h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == u84Var);
                    if (u84VarV.j()) {
                        u84VarV.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zX = xl.x(objJ);
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        if (zX) {
            C();
            if (k10Var.e * ((long) cw.b) < atomicLongFieldUpdater.get(this)) {
                k10Var.a();
                return null;
            }
        } else {
            k10 k10Var3 = (k10) xl.v(objJ);
            long j5 = k10Var3.e;
            if (j5 <= j) {
                return k10Var3;
            }
            long j6 = j5 * ((long) cw.b);
            do {
                j2 = o.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!o.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) cw.b) < atomicLongFieldUpdater.get(this)) {
                k10Var3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        v.getClass();
        return (Throwable) dz.a.getObjectVolatile(this, x);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (o.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.n + ',');
        sb.append("data=[");
        t.getClass();
        Unsafe unsafe = dz.a;
        int i3 = 0;
        s.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, B);
        int i4 = 1;
        u.getClass();
        List listP = gb.P(unsafe.getObjectVolatile(this, A), objectVolatile, unsafe.getObjectVolatile(this, y));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((k10) obj) != cw.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            tb4.k();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((k10) next).e;
            do {
                Object next2 = it.next();
                long j2 = ((k10) next2).e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        k10 k10Var = (k10) next;
        long j3 = p.get(this);
        long jV = v();
        loop2: while (true) {
            int i5 = cw.b;
            int i6 = i3;
            while (i6 < i5) {
                i = i4;
                long j4 = (k10Var.e * ((long) cw.b)) + ((long) i6);
                if (j4 >= jV && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object objP = k10Var.p(i6);
                Object obj2 = k10Var.h.get(i6 * 2);
                if (objP instanceof az) {
                    string = (j4 >= j3 || j4 < jV) ? (j4 >= jV || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objP instanceof hv3) {
                    string = "receiveCatching";
                } else if (objP instanceof u85) {
                    string = "EB(" + objP + ')';
                } else if (h12.c(objP, cw.f) || h12.c(objP, cw.g)) {
                    string = "resuming_sender";
                } else {
                    if (objP != null && !objP.equals(cw.e) && !objP.equals(cw.i) && !objP.equals(cw.h) && !objP.equals(cw.k) && !objP.equals(cw.j) && !objP.equals(cw.l)) {
                        string = objP.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i = i4;
            str = null;
            k10Var = (k10) k10Var.c();
            if (k10Var == null) {
                break;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            kf2.m("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    public final long v() {
        return o.get(this) & 1152921504606846975L;
    }

    public final boolean w() {
        while (true) {
            t.getClass();
            Unsafe unsafe = dz.a;
            long j = A;
            k10 k10VarQ = (k10) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = p;
            long j2 = atomicLongFieldUpdater.get(this);
            if (v() <= j2) {
                return false;
            }
            long j3 = cw.b;
            long j4 = j2 / j3;
            if (k10VarQ.e == j4 || (k10VarQ = q(j4, k10VarQ)) != null) {
                k10VarQ.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objP = k10VarQ.p(i);
                    if (objP != null && objP != cw.e) {
                        if (objP != cw.d) {
                            if (objP != cw.j && objP != cw.l && objP != cw.i && objP != cw.h) {
                                if (objP != cw.g) {
                                    if (objP == cw.f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (k10VarQ.o(i, objP, cw.h)) {
                        o();
                        break;
                    }
                }
                p.compareAndSet(this, j2, j2 + 1);
            } else if (((k10) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }

    public final void y() {
        Object objectVolatile;
        aw awVar;
        loop0: while (true) {
            w.getClass();
            Unsafe unsafe = dz.a;
            long j = z;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            f01 f01Var = objectVolatile == null ? cw.q : cw.r;
            while (true) {
                Unsafe unsafe2 = dz.a;
                awVar = this;
                if (unsafe2.compareAndSwapObject(awVar, z, objectVolatile, f01Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(awVar, j) != objectVolatile) {
                    break;
                } else {
                    this = awVar;
                }
            }
            this = awVar;
        }
        if (objectVolatile == null) {
            return;
        }
        jz4.j(1, objectVolatile);
        ((if1) objectVolatile).invoke(awVar.s());
    }

    public final void z(kv kvVar) {
        Unsafe unsafe;
        while (true) {
            w.getClass();
            Unsafe unsafe2 = dz.a;
            aw awVar = this;
            if (unsafe2.compareAndSwapObject(awVar, z, (Object) null, kvVar)) {
                return;
            }
            long j = z;
            if (unsafe2.getObjectVolatile(awVar, j) != null) {
                while (true) {
                    Object objectVolatile = dz.a.getObjectVolatile(awVar, j);
                    f01 f01Var = cw.q;
                    if (objectVolatile != f01Var) {
                        if (objectVolatile == cw.r) {
                            kf2.o("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            mj0.g(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    f01 f01Var2 = cw.r;
                    do {
                        aw awVar2 = awVar;
                        unsafe = dz.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(awVar2, z, f01Var, f01Var2);
                        awVar = awVar2;
                        if (zCompareAndSwapObject) {
                            kvVar.invoke(awVar.s());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(awVar, j) == f01Var);
                }
            } else {
                this = awVar;
            }
        }
    }
}
