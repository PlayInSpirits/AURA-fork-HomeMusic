package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class a32 implements s22 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(a32.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = dz.a;
        q = unsafe.objectFieldOffset(a32.class.getDeclaredField("_state$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(a32.class, Object.class, "_parentHandle$volatile");
        p = unsafe.objectFieldOffset(a32.class.getDeclaredField("_parentHandle$volatile"));
    }

    public a32(boolean z) {
        this._state$volatile = z ? zz1.j : zz1.i;
    }

    public static d20 V(zd2 zd2Var) {
        while (zd2Var.n()) {
            zd2Var = zd2Var.m();
        }
        while (true) {
            zd2Var = zd2Var.l();
            if (!zd2Var.n()) {
                if (zd2Var instanceof d20) {
                    return (d20) zd2Var;
                }
                if (zd2Var instanceof h63) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof z22)) {
            if (obj instanceof mx1) {
                return ((mx1) obj).b() ? "Active" : "New";
            }
            return obj instanceof a70 ? "Cancelled" : "Completed";
        }
        z22 z22Var = (z22) obj;
        if (z22Var.f()) {
            return "Cancelling";
        }
        return z22.o.get(z22Var) != 0 ? "Completing" : "Active";
    }

    public final Throwable A(Object obj) {
        Throwable thE;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a32 a32Var = (a32) obj;
        Object objH = a32Var.H();
        if (objH instanceof z22) {
            thE = ((z22) objH).e();
        } else if (objH instanceof a70) {
            thE = ((a70) objH).a;
        } else {
            if (objH instanceof mx1) {
                mj0.g(objH, "Cannot be cancelling child in this state: ");
                return null;
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(e0(objH)), thE, a32Var) : cancellationException;
    }

    public final Object B(z22 z22Var, Object obj) throws Throwable {
        Throwable th;
        a32 a32Var;
        z22 z22Var2;
        a70 a70Var = obj instanceof a70 ? (a70) obj : null;
        Throwable th2 = a70Var != null ? a70Var.a : null;
        synchronized (z22Var) {
            try {
                z22Var.f();
                ArrayList arrayListG = z22Var.g(th2);
                Throwable thC = C(z22Var, arrayListG);
                if (thC != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thC && th3 != thC && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    j51.d(thC, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thC != null && thC != th2) {
                    obj = new a70(thC, false);
                }
                if (thC != null && (w(thC) || I(thC))) {
                    obj.getClass();
                    a70.b.compareAndSet((a70) obj, 0, 1);
                }
                X(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                Object nx1Var = obj instanceof mx1 ? new nx1((mx1) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = dz.a;
                    long j = q;
                    a32Var = this;
                    z22Var2 = z22Var;
                    if (unsafe.compareAndSwapObject(a32Var, j, z22Var2, nx1Var) || unsafe.getObjectVolatile(a32Var, j) != z22Var2) {
                        break;
                    }
                    this = a32Var;
                    z22Var = z22Var2;
                }
                a32Var.z(z22Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Throwable C(z22 z22Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (z22Var.f()) {
                return new JobCancellationException(x(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return this instanceof x60;
    }

    public final h63 F(mx1 mx1Var) {
        h63 h63VarD = mx1Var.d();
        if (h63VarD != null) {
            return h63VarD;
        }
        if (mx1Var instanceof n01) {
            return new h63();
        }
        if (mx1Var instanceof u22) {
            a0((u22) mx1Var);
            return null;
        }
        mj0.g(mx1Var, "State should have list: ");
        return null;
    }

    public final c20 G() {
        o.getClass();
        return (c20) dz.a.getObjectVolatile(this, p);
    }

    public final Object H() {
        n.getClass();
        return dz.a.getObjectVolatile(this, q);
    }

    public boolean I(Throwable th) {
        return false;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        return ya4.F(this, ne0Var);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        return ya4.r(this, me0Var);
    }

    public void L(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    @Override // defpackage.s22
    public final as0 M(if1 if1Var) {
        return O(true, new v12(if1Var));
    }

    public final void N(s22 s22Var) {
        k63 k63Var = k63.n;
        if (s22Var == null) {
            c0(k63Var);
            return;
        }
        s22Var.start();
        c20 c20VarJ = s22Var.j(this);
        c0(c20VarJ);
        if (H() instanceof mx1) {
            return;
        }
        c20VarJ.a();
        c0(k63Var);
    }

    public final as0 O(boolean z, u22 u22Var) {
        a32 a32Var;
        u22 u22Var2;
        boolean zE;
        u22Var.t = this;
        loop0: while (true) {
            Object objH = this.H();
            if (!(objH instanceof n01)) {
                a32Var = this;
                u22Var2 = u22Var;
                boolean z2 = objH instanceof mx1;
                k63 k63Var = k63.n;
                if (z2) {
                    mx1 mx1Var = (mx1) objH;
                    h63 h63VarD = mx1Var.d();
                    if (h63VarD == null) {
                        a32Var.a0((u22) objH);
                    } else {
                        if (u22Var2.r()) {
                            z22 z22Var = mx1Var instanceof z22 ? (z22) mx1Var : null;
                            Throwable thE = z22Var != null ? z22Var.e() : null;
                            if (thE == null) {
                                zE = h63VarD.e(u22Var2, 5);
                            } else if (z) {
                                u22Var2.s(thE);
                                return k63Var;
                            }
                        } else {
                            zE = h63VarD.e(u22Var2, 1);
                        }
                        if (zE) {
                            break;
                        }
                    }
                    this = a32Var;
                    u22Var = u22Var2;
                } else if (z) {
                    Object objH2 = a32Var.H();
                    a70 a70Var = objH2 instanceof a70 ? (a70) objH2 : null;
                    u22Var2.s(a70Var != null ? a70Var.a : null);
                }
                return k63Var;
            }
            n01 n01Var = (n01) objH;
            if (n01Var.n) {
                while (true) {
                    n.getClass();
                    Unsafe unsafe = dz.a;
                    long j = q;
                    a32Var = this;
                    u22Var2 = u22Var;
                    if (unsafe.compareAndSwapObject(a32Var, j, objH, u22Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(a32Var, j) != objH) {
                        break;
                    }
                    this = a32Var;
                    u22Var = u22Var2;
                }
            } else {
                a32Var = this;
                u22Var2 = u22Var;
                a32Var.Z(n01Var);
            }
            this = a32Var;
            u22Var = u22Var2;
        }
        return u22Var2;
    }

    public boolean P() {
        return this instanceof ht;
    }

    public final boolean Q(Object obj) {
        Object objH0;
        do {
            objH0 = h0(H(), obj);
            if (objH0 == zz1.d) {
                return false;
            }
            if (objH0 == zz1.e) {
                return true;
            }
        } while (objH0 == zz1.f);
        l(objH0);
        return true;
    }

    @Override // defpackage.s22
    public final Object R(wd0 wd0Var) {
        Object objH;
        j15 j15Var;
        do {
            objH = H();
            boolean z = objH instanceof mx1;
            j15Var = j15.a;
            if (!z) {
                gb.u(wd0Var.getContext());
                return j15Var;
            }
        } while (d0(objH) < 0);
        cz czVar = new cz(1, ya4.x(wd0Var));
        czVar.u();
        czVar.x(new wy(2, gb.K(this, true, new x14(czVar))));
        Object objQ = czVar.q();
        xe0 xe0Var = xe0.n;
        if (objQ != xe0Var) {
            objQ = j15Var;
        }
        return objQ == xe0Var ? objQ : j15Var;
    }

    public final Object S(Object obj) {
        Object objH0;
        do {
            objH0 = h0(H(), obj);
            if (objH0 == zz1.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                a70 a70Var = obj instanceof a70 ? (a70) obj : null;
                throw new IllegalStateException(str, a70Var != null ? a70Var.a : null);
            }
        } while (objH0 == zz1.f);
        return objH0;
    }

    @Override // defpackage.s22
    public final as0 T(boolean z, boolean z2, q qVar) {
        return O(z2, z ? new u12(qVar) : new v12(qVar));
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(h63 h63Var, Throwable th) {
        h63Var.e(new sb2(4), 4);
        Object objK = h63Var.k();
        objK.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (zd2 zd2VarL = (zd2) objK; !zd2VarL.equals(h63Var); zd2VarL = zd2VarL.l()) {
            if ((zd2VarL instanceof u22) && ((u22) zd2VarL).r()) {
                try {
                    ((u22) zd2VarL).s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        j51.d(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + zd2VarL + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            L(completionHandlerException);
        }
        w(th);
    }

    public void X(Object obj) {
    }

    public void Y() {
    }

    public final void Z(n01 n01Var) {
        h63 h63Var = new h63();
        Object lx1Var = n01Var.n ? h63Var : new lx1(h63Var);
        while (true) {
            n.getClass();
            Unsafe unsafe = dz.a;
            long j = q;
            a32 a32Var = this;
            n01 n01Var2 = n01Var;
            if (unsafe.compareAndSwapObject(a32Var, j, n01Var2, lx1Var) || unsafe.getObjectVolatile(a32Var, j) != n01Var2) {
                return;
            }
            this = a32Var;
            n01Var = n01Var2;
        }
    }

    public final void a0(u22 u22Var) {
        u22Var.g(new h63());
        zd2 zd2VarL = u22Var.l();
        while (true) {
            n.getClass();
            Unsafe unsafe = dz.a;
            long j = q;
            a32 a32Var = this;
            u22 u22Var2 = u22Var;
            if (unsafe.compareAndSwapObject(a32Var, j, u22Var2, zd2VarL) || unsafe.getObjectVolatile(a32Var, j) != u22Var2) {
                return;
            }
            this = a32Var;
            u22Var = u22Var2;
        }
    }

    @Override // defpackage.s22
    public boolean b() {
        Object objH = H();
        return (objH instanceof mx1) && ((mx1) objH).b();
    }

    public final void b0(u22 u22Var) {
        a32 a32Var;
        while (true) {
            Object objH = this.H();
            if (!(objH instanceof u22)) {
                if (!(objH instanceof mx1) || ((mx1) objH).d() == null) {
                    return;
                }
                u22Var.o();
                return;
            }
            if (objH != u22Var) {
                return;
            }
            n01 n01Var = zz1.j;
            while (true) {
                n.getClass();
                Unsafe unsafe = dz.a;
                long j = q;
                a32Var = this;
                if (unsafe.compareAndSwapObject(a32Var, j, objH, n01Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(a32Var, j) != objH) {
                    break;
                } else {
                    this = a32Var;
                }
            }
            this = a32Var;
        }
    }

    public final void c0(c20 c20Var) {
        o.getClass();
        dz.a.putObjectVolatile(this, p, c20Var);
    }

    public final int d0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof n01;
        long j = q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (z) {
            if (((n01) obj).n) {
                return 0;
            }
            n01 n01Var = zz1.j;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = dz.a;
                if (unsafe2.compareAndSwapObject(this, q, obj, n01Var)) {
                    Y();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof lx1)) {
            return 0;
        }
        h63 h63Var = ((lx1) obj).n;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = dz.a;
            if (unsafe.compareAndSwapObject(this, q, obj, h63Var)) {
                Y();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // defpackage.s22
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        p(cancellationException);
    }

    public final boolean f0(mx1 mx1Var, Object obj) {
        Object nx1Var = obj instanceof mx1 ? new nx1((mx1) obj) : obj;
        while (true) {
            n.getClass();
            Unsafe unsafe = dz.a;
            long j = q;
            a32 a32Var = this;
            mx1 mx1Var2 = mx1Var;
            if (unsafe.compareAndSwapObject(a32Var, j, mx1Var2, nx1Var)) {
                a32Var.X(obj);
                a32Var.z(mx1Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(a32Var, j) != mx1Var2) {
                return false;
            }
            this = a32Var;
            mx1Var = mx1Var2;
        }
    }

    public final boolean g0(mx1 mx1Var, Throwable th) {
        h63 h63VarF = F(mx1Var);
        if (h63VarF == null) {
            return false;
        }
        z22 z22Var = new z22(h63VarF, th);
        while (true) {
            n.getClass();
            Unsafe unsafe = dz.a;
            long j = q;
            a32 a32Var = this;
            mx1 mx1Var2 = mx1Var;
            if (unsafe.compareAndSwapObject(a32Var, j, mx1Var2, z22Var)) {
                a32Var.W(h63VarF, th);
                return true;
            }
            if (unsafe.getObjectVolatile(a32Var, j) != mx1Var2) {
                return false;
            }
            this = a32Var;
            mx1Var = mx1Var2;
        }
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return fz0.h0;
    }

    public final Object h0(Object obj, Object obj2) {
        if (!(obj instanceof mx1)) {
            return zz1.d;
        }
        if (((obj instanceof n01) || (obj instanceof u22)) && !(obj instanceof d20) && !(obj2 instanceof a70)) {
            return f0((mx1) obj, obj2) ? obj2 : zz1.f;
        }
        mx1 mx1Var = (mx1) obj;
        h63 h63VarF = F(mx1Var);
        if (h63VarF == null) {
            return zz1.f;
        }
        z22 z22Var = mx1Var instanceof z22 ? (z22) mx1Var : null;
        if (z22Var == null) {
            z22Var = new z22(h63VarF, null);
        }
        synchronized (z22Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z22.o;
            if (atomicIntegerFieldUpdater.get(z22Var) != 0) {
                return zz1.d;
            }
            atomicIntegerFieldUpdater.set(z22Var, 1);
            if (z22Var != mx1Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mx1Var, z22Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != mx1Var) {
                        return zz1.f;
                    }
                }
            }
            boolean zF = z22Var.f();
            a70 a70Var = obj2 instanceof a70 ? (a70) obj2 : null;
            if (a70Var != null) {
                z22Var.a(a70Var.a);
            }
            Throwable thE = zF ? null : z22Var.e();
            if (thE != null) {
                W(h63VarF, thE);
            }
            d20 d20VarV = V(h63VarF);
            if (d20VarV != null && i0(z22Var, d20VarV, obj2)) {
                return zz1.e;
            }
            h63VarF.e(new sb2(2), 2);
            d20 d20VarV2 = V(h63VarF);
            return (d20VarV2 == null || !i0(z22Var, d20VarV2, obj2)) ? B(z22Var, obj2) : zz1.e;
        }
    }

    public final boolean i0(z22 z22Var, d20 d20Var, Object obj) {
        while (gb.K(d20Var.u, false, new y22(this, z22Var, d20Var, obj)) == k63.n) {
            d20Var = V(d20Var);
            if (d20Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.s22
    public final boolean isCancelled() {
        Object objH = H();
        if (objH instanceof a70) {
            return true;
        }
        return (objH instanceof z22) && ((z22) objH).f();
    }

    @Override // defpackage.s22
    public final c20 j(a32 a32Var) {
        a32 a32Var2;
        d20 d20Var = new d20(a32Var);
        d20Var.t = this;
        loop0: while (true) {
            Object objH = this.H();
            if (objH instanceof n01) {
                n01 n01Var = (n01) objH;
                if (n01Var.n) {
                    while (true) {
                        n.getClass();
                        Unsafe unsafe = dz.a;
                        long j = q;
                        a32Var2 = this;
                        if (unsafe.compareAndSwapObject(a32Var2, j, objH, d20Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(a32Var2, j) != objH) {
                            break;
                        }
                        this = a32Var2;
                    }
                } else {
                    a32Var2 = this;
                    a32Var2.Z(n01Var);
                }
                this = a32Var2;
            } else {
                a32Var2 = this;
                boolean z = objH instanceof mx1;
                k63 k63Var = k63.n;
                Throwable thE = null;
                if (!z) {
                    Object objH2 = a32Var2.H();
                    a70 a70Var = objH2 instanceof a70 ? (a70) objH2 : null;
                    d20Var.s(a70Var != null ? a70Var.a : null);
                    return k63Var;
                }
                h63 h63VarD = ((mx1) objH).d();
                if (h63VarD != null) {
                    if (h63VarD.e(d20Var, 7)) {
                        break;
                    }
                    boolean zE = h63VarD.e(d20Var, 3);
                    Object objH3 = a32Var2.H();
                    if (objH3 instanceof z22) {
                        thE = ((z22) objH3).e();
                    } else {
                        a70 a70Var2 = objH3 instanceof a70 ? (a70) objH3 : null;
                        if (a70Var2 != null) {
                            thE = a70Var2.a;
                        }
                    }
                    d20Var.s(thE);
                    if (zE) {
                        break;
                    }
                    return k63Var;
                }
                a32Var2.a0((u22) objH);
                this = a32Var2;
            }
        }
        return d20Var;
    }

    public void l(Object obj) {
    }

    public void m(Object obj) {
        l(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean o(Object obj) {
        Throwable thA;
        Object objH;
        Throwable thE;
        f01 f01Var;
        mx1 mx1Var;
        Object objH0;
        Object objH1 = zz1.d;
        if (E()) {
            do {
                Object objH2 = H();
                if (objH2 instanceof mx1) {
                    if (objH2 instanceof z22) {
                        if (z22.o.get((z22) objH2) != 0) {
                        }
                    }
                    objH1 = h0(objH2, new a70(A(obj), false));
                }
                objH1 = zz1.d;
                break;
            } while (objH1 == zz1.f);
            if (objH1 != zz1.e) {
                if (objH1 == zz1.d) {
                    thA = null;
                    while (true) {
                        objH = H();
                        if (objH instanceof z22) {
                            synchronized (objH) {
                                if (((z22) objH).c() == zz1.h) {
                                    f01Var = zz1.g;
                                } else {
                                    boolean zF = ((z22) objH).f();
                                    if (thA == null) {
                                        thA = A(obj);
                                    }
                                    ((z22) objH).a(thA);
                                    thE = zF ? null : ((z22) objH).e();
                                    if (thE != null) {
                                        W(((z22) objH).n, thE);
                                    }
                                    f01Var = zz1.d;
                                }
                            }
                        } else if (objH instanceof mx1) {
                            if (thA == null) {
                                thA = A(obj);
                            }
                            mx1Var = (mx1) objH;
                            if (mx1Var.b()) {
                                objH0 = h0(objH, new a70(thA, false));
                                if (objH0 != zz1.d) {
                                    mj0.g(objH, "Cannot happen in ");
                                    return false;
                                }
                                if (objH0 != zz1.f) {
                                    objH1 = objH0;
                                    break;
                                }
                            } else if (g0(mx1Var, thA)) {
                                f01Var = zz1.d;
                            }
                        } else {
                            f01Var = zz1.g;
                        }
                        objH1 = f01Var;
                        break;
                    }
                }
                if (objH1 != zz1.d && objH1 != zz1.e) {
                    if (objH1 == zz1.g) {
                        return false;
                    }
                    l(objH1);
                    return true;
                }
            }
        } else {
            if (objH1 == zz1.d) {
                thA = null;
                while (true) {
                    objH = H();
                    if (objH instanceof z22) {
                        synchronized (objH) {
                            if (((z22) objH).c() == zz1.h) {
                                f01Var = zz1.g;
                            } else {
                                boolean zF2 = ((z22) objH).f();
                                if (thA == null) {
                                    thA = A(obj);
                                }
                                ((z22) objH).a(thA);
                                if (zF2) {
                                }
                                if (thE != null) {
                                    W(((z22) objH).n, thE);
                                }
                                f01Var = zz1.d;
                            }
                        }
                    } else if (objH instanceof mx1) {
                        if (thA == null) {
                            thA = A(obj);
                        }
                        mx1Var = (mx1) objH;
                        if (mx1Var.b()) {
                            objH0 = h0(objH, new a70(thA, false));
                            if (objH0 != zz1.d) {
                                mj0.g(objH, "Cannot happen in ");
                                return false;
                            }
                            if (objH0 != zz1.f) {
                                objH1 = objH0;
                                break;
                            }
                        } else if (g0(mx1Var, thA)) {
                            f01Var = zz1.d;
                        }
                    } else {
                        f01Var = zz1.g;
                    }
                    objH1 = f01Var;
                    break;
                }
            }
            if (objH1 != zz1.d) {
                if (objH1 == zz1.g) {
                    return false;
                }
                l(objH1);
                return true;
            }
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    @Override // defpackage.s22
    public final CancellationException q() {
        CancellationException cancellationException;
        Object objH = H();
        if (objH instanceof z22) {
            Throwable thE = ((z22) objH).e();
            if (thE == null) {
                mj0.g(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thE, this) : cancellationException;
        }
        if (objH instanceof mx1) {
            mj0.g(this, "Job is still new or active: ");
            return null;
        }
        if (!(objH instanceof a70)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((a70) objH).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(x(), th, this) : cancellationException;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(obj, this);
    }

    @Override // defpackage.s22
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(H());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + e0(H()) + '}');
        sb.append('@');
        sb.append(si0.x(this));
        return sb.toString();
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        return ya4.C(this, me0Var);
    }

    public final boolean w(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        c20 c20VarG = G();
        if (c20VarG == null || c20VarG == k63.n) {
            return z;
        }
        return c20VarG.c(th) || z;
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && D();
    }

    public final void z(mx1 mx1Var, Object obj) {
        c20 c20VarG = G();
        if (c20VarG != null) {
            c20VarG.a();
            c0(k63.n);
        }
        CompletionHandlerException completionHandlerException = null;
        a70 a70Var = obj instanceof a70 ? (a70) obj : null;
        Throwable th = a70Var != null ? a70Var.a : null;
        if (mx1Var instanceof u22) {
            try {
                ((u22) mx1Var).s(th);
                return;
            } catch (Throwable th2) {
                L(new CompletionHandlerException("Exception in completion handler " + mx1Var + " for " + this, th2));
                return;
            }
        }
        h63 h63VarD = mx1Var.d();
        if (h63VarD != null) {
            h63VarD.e(new sb2(1), 1);
            Object objK = h63VarD.k();
            objK.getClass();
            for (zd2 zd2VarL = (zd2) objK; !zd2VarL.equals(h63VarD); zd2VarL = zd2VarL.l()) {
                if (zd2VarL instanceof u22) {
                    try {
                        ((u22) zd2VarL).s(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            j51.d(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + zd2VarL + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                L(completionHandlerException);
            }
        }
    }
}
