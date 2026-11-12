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
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = null;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = null;
    public static final /* synthetic */ long p = 0;
    public static final /* synthetic */ long q = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        n = AtomicReferenceFieldUpdater.newUpdater(a32.class, Object.class, "_state$volatile");
        Unsafe r3 = dz.a;
        q = r3.objectFieldOffset(a32.class.getDeclaredField("_state$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(a32.class, Object.class, "_parentHandle$volatile");
        p = r3.objectFieldOffset(a32.class.getDeclaredField("_parentHandle$volatile"));
    }

    public a32(boolean r1) {
        if (r1 == false) goto L5;
        n01 r2 = zz1.j;
    L6:
        this._state$volatile = r2;
        return;
    L5:
        r2 = zz1.i;
        goto L6
    }

    public static d20 V(zd2 r1) {
    L3:
        if (r1.n() == false) goto L5;
        r1 = r1.m();
    L5:
        r1 = r1.l();
        if (r1.n() == true) goto L5;
        if ((r1 instanceof d20) == true) goto L10;
        if ((r1 instanceof h63) == false) goto L5;
        return null;
    L10:
        return (d20) r1;
    }

    public static String e0(Object r2) {
        if ((r2 instanceof z22) == false) goto L14;
        z22 r3 = (z22) r2;
        if (r3.f() == false) goto L9;
        return "Cancelling";
    L9:
        if (z22.o.get(r3) == 0) goto L12;
        return "Completing";
    L12:
        return "Active";
    L14:
        if ((r2 instanceof mx1) == false) goto L21;
        if (((mx1) r2).b() == false) goto L18;
        return "Active";
    L18:
        return "New";
    L21:
        if ((r2 instanceof a70) == false) goto L24;
        return "Cancelled";
    L24:
        return "Completed";
    }

    public final Throwable A(Object r4) {
        if ((r4 instanceof Throwable) == true) goto L5;
        a32 r5 = (a32) r4;
        Object r3 = r5.H();
        CancellationException r1 = null;
        if ((r3 instanceof z22) == false) goto L10;
        Throwable r0 = ((z22) r3).e();
    L16:
        if ((r0 instanceof CancellationException) == false) goto L18;
        r1 = (CancellationException) r0;
    L18:
        if (r1 == null) goto L20;
        return r1;
    L20:
        return new JobCancellationException("Parent job is ".concat(e0(r3)), r0, r5);
    L10:
        if ((r3 instanceof a70) == false) goto L13;
        r0 = ((a70) r3).a;
        goto L16
    L13:
        if ((r3 instanceof mx1) == true) goto L21;
        r0 = null;
        goto L16
    L21:
        mj0.g(r3, "Cannot be cancelling child in this state: ");
        return null;
    L5:
        return (Throwable) r4;
    }

    public final Object B(z22 r11, Object r12) {
        Throwable r1 = null;
        if ((r12 instanceof a70) == false) goto L5;
        a70 r0 = (a70) r12;
    L6:
        if (r0 == null) goto L8;
        r1 = r0.a;
    L8:
        monitor-enter(r11);
        r11.f();     // Catch: Throwable -> L52
        ArrayList r2 = r11.g(r1);     // Catch: Throwable -> L52
        Throwable r3 = C(r11, r2);     // Catch: Throwable -> L52
        if (r3 != null) goto L56;
    L28:
        monitor-exit(r11);
        if (r3 == null) goto L34;
        if (r3 == r1) goto L34;
        r12 = new a70(r3, false);
    L34:
        if (r3 != null) goto L36;
    L40:
        X(r12);
        AtomicReferenceFieldUpdater r4 = n;
        if ((r12 instanceof mx1) == false) goto L43;
        Object r8 = new nx1((mx1) r12);
    L44:
        r4.getClass();
        Unsafe r5 = dz.a;
        long r6 = q;
        a32 r7 = this;
        z22 r9 = r11;
        if (r5.compareAndSwapObject(r7, r6, r9, r8) == true) goto L49;
        if (r5.getObjectVolatile(r7, r6) != r9) goto L49;
        a32 this = r7;
        r11 = r9;
    L49:
        r7.z(r9, r12);
        return r12;
    L43:
        r8 = r12;
        goto L44
    L36:
        if (w(r3) == false) goto L38;
    L39:
        r12.getClass();
        a70.b.compareAndSet((a70) r12, 0, 1);
        goto L40
    L38:
        if (I(r3) == false) goto L40;
    L56:
    L26:
        th = move-exception;
        Throwable r10 = th;
    L54:
        monitor-exit(r11);
        throw r10;
    L13:
        if (r2.size() <= 1) goto L28;
        Set r13 = Collections.newSetFromMap(new IdentityHashMap(r2.size()));     // Catch: Throwable -> L26
        int r14 = r2.size();     // Catch: Throwable -> L26
        int r15 = 0;
    L16:
        if (r15 >= r14) goto L28;
        Object r16 = r2.get(r15);     // Catch: Throwable -> L26
        r15 = r15 + 1;     // Catch: Throwable -> L26
        Throwable r17 = (Throwable) r16;     // Catch: Throwable -> L26
        if (r17 == r3) goto L16;
        if (r17 == r3) goto L16;
        if ((r17 instanceof CancellationException) == true) goto L16;
        if (r13.add(r17) == false) goto L16;
        j51.d(r3, r17);     // Catch: Throwable -> L26
    L52:
        th = move-exception;
        r10 = th;
        goto L54
    L5:
        r0 = null;
        goto L6
    }

    public final Throwable C(z22 r5, ArrayList r6) {
        Object r1 = null;
        if (r6.isEmpty() == true) goto L5;
        int r4 = r6.size();
        int r7 = 0;
        int r0 = 0;
    L10:
        if (r0 >= r4) goto L14;
        Object r2 = r6.get(r0);
        r0 = r0 + 1;
        if ((((Throwable) r2) instanceof CancellationException) == true) goto L10;
    L15:
        Throwable r3 = (Throwable) r2;
        if (r3 == null) goto L18;
        return r3;
    L18:
        Throwable r8 = (Throwable) r6.get(0);
        if ((r8 instanceof TimeoutCancellationException) == false) goto L30;
        int r9 = r6.size();
    L21:
        if (r7 >= r9) goto L27;
        Object r10 = r6.get(r7);
        r7 = r7 + 1;
        Throwable r11 = (Throwable) r10;
        if (r11 == r8) goto L21;
        if ((r11 instanceof TimeoutCancellationException) == false) goto L21;
        r1 = r10;
    L27:
        Throwable r12 = (Throwable) r1;
        if (r12 == null) goto L30;
        return r12;
    L30:
        return r8;
    L14:
        r2 = null;
        goto L15
    L5:
        if (r5.f() == true) goto L7;
        return null;
    L7:
        return new JobCancellationException(x(), null, this);
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return this instanceof x60;
    }

    public final h63 F(mx1 r3) {
        h63 r0 = r3.d();
        if (r0 == null) goto L5;
        return r0;
    L5:
        if ((r3 instanceof n01) == false) goto L9;
        return new h63();
    L9:
        if ((r3 instanceof u22) == false) goto L12;
        a0((u22) r3);
        return null;
    L12:
        mj0.g(r3, "State should have list: ");
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

    public boolean I(Throwable r1) {
        return false;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r1) {
        return ya4.F(this, r1);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r1) {
        return ya4.r(this, r1);
    }

    public void L(CompletionHandlerException r1) {
        throw r1;
    }

    @Override // defpackage.s22
    public final as0 M(if1 r2) {
        return O(true, new v12(r2));
    }

    public final void N(s22 r3) {
        k63 r0 = k63.n;
        if (r3 != null) goto L6;
        c0(r0);
        return;
    L6:
        r3.start();
        c20 r4 = r3.j(this);
        c0(r4);
        if ((H() instanceof mx1) == true) goto L10;
        r4.a();
        c0(r0);
        return;
    }

    public final as0 O(boolean r7, u22 r8) {
        r8.t = this;
    L3:
        Object r4 = this.H();
        if ((r4 instanceof n01) == false) goto L15;
        n01 r0 = (n01) r4;
        if (r0.n == false) goto L14;
    L7:
        n.getClass();
        Unsafe r1 = dz.a;
        long r2 = q;
        a32 r3 = this;
        u22 r5 = r8;
        if (r1.compareAndSwapObject(r3, r2, r4, r5) == true) goto L35;
        if (r1.getObjectVolatile(r3, r2) != r4) goto L36;
        a32 this = r3;
        r8 = r5;
    L36:
        this = r3;
        r8 = r5;
    L35:
        return r5;
    L14:
        r3 = this;
        r5 = r8;
        r3.Z(r0);
        goto L36
    L15:
        r3 = this;
        r5 = r8;
        boolean r6 = r4 instanceof mx1;
        k63 r9 = k63.n;
        Throwable r10 = null;
        if (r6 == false) goto L37;
        mx1 r11 = (mx1) r4;
        h63 r12 = r11.d();
        if (r12 != null) goto L21;
        r3.a0((u22) r4);
        goto L36
    L21:
        if (r5.r() == true) goto L23;
        boolean r13 = r12.e(r5, 1);
    L34:
        if (r13 == false) goto L36;
    L23:
        if ((r11 instanceof z22) == false) goto L25;
        z22 r14 = (z22) r11;
    L26:
        if (r14 == null) goto L28;
        r10 = r14.e();
    L28:
        if (r10 != null) goto L30;
        r13 = r12.e(r5, 5);
        goto L34
    L30:
        if (r7 == false) goto L45;
        r5.s(r10);
        return r9;
    L45:
        return r9;
    L25:
        r14 = null;
        goto L26
    L37:
        if (r7 == false) goto L45;
        Object r15 = r3.H();
        if ((r15 instanceof a70) == false) goto L41;
        a70 r16 = (a70) r15;
    L42:
        if (r16 == null) goto L44;
        r10 = r16.a;
    L44:
        r5.s(r10);
        goto L45
    L41:
        r16 = null;
        goto L42
    }

    public boolean P() {
        return this instanceof ht;
    }

    public final boolean Q(Object r4) {
    L2:
        Object r0 = h0(H(), r4);
        if (r0 == zz1.d) goto L4;
        if (r0 == zz1.e) goto L8;
        if (r0 == zz1.f) goto L2;
        l(r0);
        return true;
    L8:
        return true;
    L4:
        return false;
    }

    @Override // defpackage.s22
    public final Object R(wd0 r4) {
    L2:
        Object r0 = H();
        boolean r1 = r0 instanceof mx1;
        j15 r2 = j15.a;
        if (r1 == false) goto L4;
        if (d0(r0) < 0) goto L2;
        cz r3 = new cz(1, ya4.x(r4));
        r3.u();
        int r5 = 2;
        r3.x(new wy(r5, gb.K(this, true, new x14(r3))));
        Object r6 = r3.q();
        xe0 r7 = xe0.n;
        if (r6 == r7) goto L12;
        r6 = r2;
    L12:
        if (r6 != r7) goto L14;
        return r6;
    L14:
        return r2;
    L4:
        gb.u(r4.getContext());
        return r2;
    }

    public final Object S(Object r4) {
    L2:
        Object r0 = h0(H(), r4);
        if (r0 == zz1.d) goto L4;
        if (r0 == zz1.f) goto L2;
        return r0;
    L4:
        String r3 = "Job " + this + " is already complete or completing, but is being completed with " + r4;
        Throwable r2 = null;
        if ((r4 instanceof a70) == false) goto L7;
        a70 r5 = (a70) r4;
    L8:
        if (r5 == null) goto L11;
        r2 = r5.a;
    L11:
        throw new IllegalStateException(r3, r2);
    L7:
        r5 = null;
        goto L8
    }

    @Override // defpackage.s22
    public final as0 T(boolean r1, boolean r2, q r3) {
        if (r1 == false) goto L4;
        u22 r4 = new u12(r3);
    L6:
        return O(r2, r4);
    L4:
        r4 = new v12(r3);
        goto L6
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(h63 r6, Throwable r7) {
        r6.e(new sb2(4), 4);
        Object r0 = r6.k();
        r0.getClass();
        zd2 r1 = (zd2) r0;
        CompletionHandlerException r2 = null;
    L4:
        if (r1.equals(r6) == true) goto L16;
        if ((r1 instanceof u22) == false) goto L15;
        if (((u22) r1).r() == false) goto L15;
        ((u22) r1).s(r7);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        if (r2 == null) goto L14;
        j51.d(r2, th);
        goto L15
    L14:
        r2 = new CompletionHandlerException("Exception in completion handler " + r1 + " for " + this, th);
    L15:
        r1 = r1.l();
        goto L4
    L16:
        if (r2 == null) goto L18;
        L(r2);
    L18:
        w(r7);
    }

    public void X(Object r1) {
    }

    public void Y() {
    }

    public final void Z(n01 r9) {
        h63 r0 = new h63();
        if (r9.n == false) goto L5;
        Object r7 = r0;
    L6:
        n.getClass();
        Unsafe r2 = dz.a;
        long r4 = q;
        a32 r3 = this;
        n01 r6 = r9;
        if (r2.compareAndSwapObject(r3, r4, r6, r7) == true) goto L11;
        if (r2.getObjectVolatile(r3, r4) != r6) goto L16;
        a32 this = r3;
        r9 = r6;
        goto L6
    L16:
        return;
    L11:
        return;
    L5:
        r7 = new lx1(r0);
        goto L6
    }

    public final void a0(u22 r8) {
        r8.g(new h63());
        zd2 r6 = r8.l();
    L3:
        n.getClass();
        Unsafe r1 = dz.a;
        long r3 = q;
        a32 r2 = this;
        u22 r5 = r8;
        if (r1.compareAndSwapObject(r2, r3, r5, r6) == true) goto L8;
        if (r1.getObjectVolatile(r2, r3) != r5) goto L12;
        a32 this = r2;
        r8 = r5;
        goto L3
    L12:
        return;
    }

    @Override // defpackage.s22
    public boolean b() {
        Object r1 = H();
        if ((r1 instanceof mx1) == true) goto L5;
        return false;
    L5:
        if (((mx1) r1).b() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void b0(u22 r7) {
    L2:
        Object r4 = this.H();
        if ((r4 instanceof u22) == false) goto L15;
        if (r4 != r7) goto L26;
        n01 r5 = zz1.j;
    L7:
        n.getClass();
        Unsafe r0 = dz.a;
        long r2 = q;
        a32 r1 = this;
        if (r0.compareAndSwapObject(r1, r2, r4, r5) == true) goto L27;
        if (r0.getObjectVolatile(r1, r2) != r4) goto L12;
        a32 this = r1;
        goto L7
    L12:
        this = r1;
        goto L2
    L27:
        return;
    L26:
        return;
    L15:
        if ((r4 instanceof mx1) == true) goto L17;
        return;
    L17:
        if (((mx1) r4).d() == null) goto L25;
        r7.o();
        return;
    }

    public final void c0(c20 r4) {
        o.getClass();
        dz.a.putObjectVolatile(this, p, r4);
    }

    public final int d0(Object r11) {
        boolean r0 = r11 instanceof n01;
        long r6 = q;
        AtomicReferenceFieldUpdater r9 = n;
        if (r0 == false) goto L16;
        if (((n01) r11).n == true) goto L35;
        n01 r5 = zz1.j;
    L8:
        r9.getClass();
        Unsafe r1 = dz.a;
        if (r1.compareAndSwapObject(this, q, r11, r5) == true) goto L10;
        if (r1.getObjectVolatile(this, r6) == r11) goto L8;
        return -1;
    L10:
        Y();
        return 1;
    L35:
        return 0;
    L16:
        if ((r11 instanceof lx1) == false) goto L26;
        h63 r7 = ((lx1) r11).n;
    L18:
        r9.getClass();
        Unsafe r2 = dz.a;
        if (r2.compareAndSwapObject(this, q, r11, r7) == true) goto L20;
        if (r2.getObjectVolatile(this, r6) == r11) goto L18;
        return -1;
    L20:
        Y();
        return 1;
    L26:
        return 0;
    }

    @Override // defpackage.s22
    public void f(CancellationException r3) {
        if (r3 != null) goto L4;
        r3 = new JobCancellationException(x(), null, this);
    L4:
        p(r3);
    }

    public final boolean f0(mx1 r9, Object r10) {
        if ((r10 instanceof mx1) == false) goto L5;
        Object r7 = new nx1((mx1) r10);
    L6:
        n.getClass();
        Unsafe r2 = dz.a;
        long r4 = q;
        a32 r3 = this;
        mx1 r6 = r9;
        if (r2.compareAndSwapObject(r3, r4, r6, r7) == true) goto L8;
        if (r2.getObjectVolatile(r3, r4) != r6) goto L12;
        a32 this = r3;
        r9 = r6;
        goto L6
    L12:
        return false;
    L8:
        r3.X(r10);
        r3.z(r6, r10);
        return true;
    L5:
        r7 = r10;
        goto L6
    }

    public final boolean g0(mx1 r8, Throwable r9) {
        h63 r0 = F(r8);
        if (r0 == null) goto L12;
        z22 r6 = new z22(r0, r9);
    L6:
        n.getClass();
        Unsafe r1 = dz.a;
        long r3 = q;
        a32 r2 = this;
        mx1 r5 = r8;
        if (r1.compareAndSwapObject(r2, r3, r5, r6) == true) goto L8;
        if (r1.getObjectVolatile(r2, r3) != r5) goto L17;
        a32 this = r2;
        r8 = r5;
        goto L6
    L17:
        return false;
    L8:
        r2.W(r0, r9);
        return true;
    L12:
        return false;
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return fz0.h0;
    }

    public final Object h0(Object r7, Object r8) {
        if ((r7 instanceof mx1) == true) goto L7;
        return zz1.d;
    L7:
        if ((r7 instanceof n01) == true) goto L11;
        if ((r7 instanceof u22) == true) goto L11;
    L19:
        mx1 r9 = (mx1) r7;
        h63 r0 = F(r9);
        if (r0 == null) goto L22;
        Throwable r2 = null;
        if ((r9 instanceof z22) == false) goto L26;
        z22 r1 = (z22) r9;
    L27:
        if (r1 != null) goto L29;
        r1 = new z22(r0, null);
    L29:
        monitor-enter(r1);
        AtomicIntegerFieldUpdater r3 = z22.o;     // Catch: Throwable -> L38
        if (r3.get(r1) == 0) goto L33;
        boolean r4 = true;
    L34:
        if (r4 == false) goto L40;
        f01 r6 = zz1.d;     // Catch: Throwable -> L38
        monitor-exit(r1);
        return r6;
    L40:
        r3.set(r1, 1);     // Catch: Throwable -> L38
        if (r1 == r9) goto L51;
        AtomicReferenceFieldUpdater r5 = n;     // Catch: Throwable -> L38
    L44:
        if (r5.compareAndSet(this, r9, r1) == true) goto L51;
        if (r5.get(this) == r9) goto L44;
        f01 r10 = zz1.f;     // Catch: Throwable -> L38
        monitor-exit(r1);
        return r10;
    L51:
        boolean r11 = r1.f();     // Catch: Throwable -> L38
        if ((r8 instanceof a70) == false) goto L54;
        a70 r12 = (a70) r8;     // Catch: Throwable -> L38
    L55:
        if (r12 == null) goto L57;
        r1.a(r12.a);     // Catch: Throwable -> L38
    L57:
        Throwable r13 = r1.e();     // Catch: Throwable -> L38
        if (r11 == true) goto L60;
        r2 = r13;
    L60:
        monitor-exit(r1);
        if (r2 == null) goto L63;
        W(r0, r2);
    L63:
        d20 r14 = V(r0);
        if (r14 != null) goto L66;
    L69:
        r0.e(new sb2(2), 2);
        d20 r15 = V(r0);
        if (r15 == null) goto L76;
        if (i0(r1, r15, r8) == false) goto L76;
        return zz1.e;
    L76:
        return B(r1, r8);
    L66:
        if (i0(r1, r14, r8) == false) goto L69;
        return zz1.e;
    L54:
        r12 = null;
        goto L55
    L33:
        r4 = false;
    L38:
        th = move-exception;
        throw th;
    L26:
        r1 = null;
        goto L27
    L22:
        return zz1.f;
    L11:
        if ((r7 instanceof d20) == true) goto L19;
        if ((r8 instanceof a70) == true) goto L19;
        if (f0((mx1) r7, r8) == false) goto L18;
        return r8;
    L18:
        return zz1.f;
    }

    public final boolean i0(z22 r4, d20 r5, Object r6) {
    L3:
        if (gb.K(r5.u, false, new y22(this, r4, r5, r6)) != k63.n) goto L4;
        r5 = V(r5);
        if (r5 != null) goto L3;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.s22
    public final boolean isCancelled() {
        Object r1 = H();
        if ((r1 instanceof a70) == false) goto L5;
        return true;
    L5:
        if ((r1 instanceof z22) == true) goto L7;
        return false;
    L7:
        if (((z22) r1).f() == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // defpackage.s22
    public final c20 j(a32 r7) {
        d20 r5 = new d20(r7);
        r5.t = this;
    L3:
        Object r4 = this.H();
        if ((r4 instanceof n01) == false) goto L15;
        n01 r8 = (n01) r4;
        if (r8.n == false) goto L14;
    L7:
        n.getClass();
        Unsafe r0 = dz.a;
        long r2 = q;
        a32 r1 = this;
        if (r0.compareAndSwapObject(r1, r2, r4, r5) == true) goto L35;
        if (r0.getObjectVolatile(r1, r2) != r4) goto L20;
        a32 this = r1;
    L20:
        this = r1;
    L35:
        return r5;
    L14:
        r1 = this;
        r1.Z(r8);
        goto L20
    L15:
        r1 = this;
        boolean r6 = r4 instanceof mx1;
        k63 r9 = k63.n;
        Throwable r3 = null;
        if (r6 == false) goto L37;
        h63 r10 = ((mx1) r4).d();
        if (r10 != null) goto L22;
        r1.a0((u22) r4);
        goto L20
    L22:
        if (r10.e(r5, 7) == true) goto L35;
        boolean r11 = r10.e(r5, 3);
        Object r12 = r1.H();
        if ((r12 instanceof z22) == false) goto L28;
        r3 = ((z22) r12).e();
    L33:
        r5.s(r3);
        if (r11 == true) goto L35;
        return r9;
    L28:
        if ((r12 instanceof a70) == false) goto L30;
        a70 r13 = (a70) r12;
    L31:
        if (r13 == null) goto L33;
        r3 = r13.a;
        goto L33
    L30:
        r13 = null;
        goto L31
    L37:
        Object r14 = r1.H();
        if ((r14 instanceof a70) == false) goto L40;
        a70 r15 = (a70) r14;
    L41:
        if (r15 == null) goto L43;
        r3 = r15.a;
    L43:
        r5.s(r3);
        return r9;
    L40:
        r15 = null;
        goto L41
    }

    public void l(Object r1) {
    }

    public void m(Object r1) {
        l(r1);
    }

    public final boolean o(Object r8) {
        Object r0 = zz1.d;
        if (E() == false) goto L19;
    L4:
        Object r1 = H();
        if ((r1 instanceof mx1) == false) goto L14;
        if ((r1 instanceof z22) == true) goto L9;
    L11:
        r0 = h0(r1, new a70(A(r8), false));
        if (r0 == zz1.f) goto L4;
    L16:
        if (r0 != zz1.e) goto L19;
    L65:
        return true;
    L9:
        if (z22.o.get((z22) r1) == 0) goto L11;
    L14:
        r0 = zz1.d;
    L19:
        if (r0 != zz1.d) goto L61;
        Throwable r2 = null;
        Throwable r3 = null;
    L21:
        Object r4 = H();
        if ((r4 instanceof z22) == true) goto L23;
        if ((r4 instanceof mx1) == false) goto L59;
        if (r3 != null) goto L47;
        r3 = A(r8);
    L47:
        mx1 r5 = (mx1) r4;
        if (r5.b() == true) goto L50;
        Object r6 = h0(r4, new a70(r3, false));
        if (r6 == zz1.d) goto L57;
        if (r6 == zz1.f) goto L21;
        r0 = r6;
        goto L61
    L57:
        mj0.g(r4, "Cannot happen in ");
        return false;
    L50:
        if (g0(r5, r3) == false) goto L21;
        f01 r9 = zz1.d;
    L28:
        r0 = r9;
        goto L61
    L59:
        r9 = zz1.g;
        goto L28
    L23:
        monitor-enter(r4);
    L29:
        th = move-exception;
        throw th;
    L25:
        if (((z22) r4).c() != zz1.h) goto L31;
        r9 = zz1.g;     // Catch: Throwable -> L29
        monitor-exit(r4);
        goto L28
    L31:
        boolean r7 = ((z22) r4).f();     // Catch: Throwable -> L29
        if (r3 != null) goto L34;
        r3 = A(r8);     // Catch: Throwable -> L29
    L34:
        ((z22) r4).a(r3);     // Catch: Throwable -> L29
        Throwable r10 = ((z22) r4).e();     // Catch: Throwable -> L29
        if (r7 == true) goto L37;
        r2 = r10;
    L37:
        monitor-exit(r4);
        if (r2 == null) goto L40;
        W(((z22) r4).n, r2);
    L40:
        r9 = zz1.d;
    L61:
        if (r0 == zz1.d) goto L65;
        if (r0 == zz1.e) goto L65;
        if (r0 != zz1.g) goto L69;
        return false;
    L69:
        l(r0);
        return true;
    }

    public void p(CancellationException r1) {
        o(r1);
    }

    @Override // defpackage.s22
    public final CancellationException q() {
        Object r0 = H();
        CancellationException r3 = null;
        if ((r0 instanceof z22) == false) goto L16;
        Throwable r1 = ((z22) r0).e();
        if (r1 == null) goto L13;
        String r2 = getClass().getSimpleName().concat(" is cancelling");
        if ((r1 instanceof CancellationException) == false) goto L9;
        r3 = (CancellationException) r1;
    L9:
        if (r3 == null) goto L11;
        return r3;
    L11:
        return new JobCancellationException(r2, r1, this);
    L13:
        mj0.g(this, "Job is still new or active: ");
        return null;
    L16:
        if ((r0 instanceof mx1) == false) goto L18;
        mj0.g(this, "Job is still new or active: ");
        return null;
    L18:
        if ((r0 instanceof a70) == false) goto L27;
        Throwable r4 = ((a70) r0).a;
        if ((r4 instanceof CancellationException) == false) goto L22;
        r3 = (CancellationException) r4;
    L22:
        if (r3 == null) goto L24;
        return r3;
    L24:
        return new JobCancellationException(x(), r4, this);
    L27:
        return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r1, Object r2) {
        return r1.invoke(r2, this);
    }

    @Override // defpackage.s22
    public final boolean start() {
    L2:
        int r0 = d0(H());
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L2;
        return true;
    L8:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(U() + '{' + e0(H()) + '}');
        r0.append('@');
        r0.append(si0.x(this));
        return r0.toString();
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r1) {
        return ya4.C(this, r1);
    }

    public final boolean w(Throwable r3) {
        if (P() == true) goto L19;
        boolean r0 = r3 instanceof CancellationException;
        c20 r2 = G();
        if (r2 != null) goto L8;
    L18:
        return r0;
    L8:
        if (r2 == k63.n) goto L18;
        if (r2.c(r3) == true) goto L16;
        if (r0 == true) goto L20;
        return false;
    L20:
        return true;
    L16:
        return true;
    L19:
        return true;
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable r2) {
        if ((r2 instanceof CancellationException) == false) goto L6;
        return true;
    L6:
        if (o(r2) == true) goto L8;
        return false;
    L8:
        if (D() == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final void z(mx1 r7, Object r8) {
        c20 r0 = G();
        if (r0 == null) goto L5;
        r0.a();
        c0(k63.n);
    L5:
        CompletionHandlerException r1 = null;
        if ((r8 instanceof a70) == false) goto L8;
        a70 r9 = (a70) r8;
    L9:
        if (r9 == null) goto L11;
        Throwable r10 = r9.a;
    L13:
        if ((r7 instanceof u22) == true) goto L37;
        h63 r11 = r7.d();
        if (r11 == null) goto L45;
        r11.e(new sb2(1), 1);
        Object r2 = r11.k();
        r2.getClass();
        zd2 r3 = (zd2) r2;
    L22:
        if (r3.equals(r11) == true) goto L32;
        if ((r3 instanceof u22) == false) goto L31;
        ((u22) r3).s(r10);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        if (r1 == null) goto L30;
        j51.d(r1, th);
        goto L31
    L30:
        r1 = new CompletionHandlerException("Exception in completion handler " + r3 + " for " + this, th);
    L31:
        r3 = r3.l();
        goto L22
    L32:
        if (r1 == null) goto L46;
        L(r1);
        return;
    L46:
        return;
    L45:
        return;
    L37:
        ((u22) r7).s(r10);     // Catch: Throwable -> L16
        return;
    L16:
        th = move-exception;
        L(new CompletionHandlerException("Exception in completion handler " + r7 + " for " + this, th));
        return;
    L11:
        r10 = null;
        goto L13
    L8:
        r9 = null;
        goto L9
    }
}
