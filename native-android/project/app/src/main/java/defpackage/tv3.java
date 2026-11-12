package defpackage;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv3 extends u80 {
    public static final AtomicReference A = null;
    public static final nl4 z = null;
    public final ed a;
    public final jv3 b;
    public final Object c;
    public s22 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public x03 h;
    public final f13 i;
    public final ArrayList j;
    public final ArrayList k;
    public final w03 l;
    public final rf2 m;
    public final w03 n;
    public final w03 o;
    public ArrayList p;
    public x03 q;
    public cz r;
    public final nl4 s;
    public boolean t;
    public final nl4 u;
    public final z05 v;
    public final t22 w;
    public final ne0 x;
    public final hh3 y;

    static {
        z = ya4.a(vf3.q);
        A = new AtomicReference(Boolean.FALSE);
    }

    public tv3(ne0 r6) {
        ed r0 = new ed(new mv3(this, 0));
        this.a = r0;
        mv3 r3 = new mv3(this, 1);
        jv3 r1 = new jv3();
        r1.n = new fl(0);
        r1.o = new z40();
        r1.p = new fa(14, r1, r3);
        this.b = r1;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new x03();
        this.i = new f13(new z80[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new w03();
        this.m = new rf2(16);
        this.n = new w03();
        this.o = new w03();
        this.s = ya4.a(null);
        this.u = ya4.a(ov3.p);
        this.v = new z05(9);
        t22 r2 = new t22((s22) r6.K(fz0.h0));
        r2.M(new kl3(2, this));
        this.w = r2;
        this.x = r6.J(r0).J(r2);
        this.y = new hh3(12);
    }

    public static final void G(ArrayList r0, tv3 r1, z80 r2) {
        r0.clear();
        Object r3 = r1.c;
        monitor-enter(r3);
        Iterator r4 = r1.k.iterator();     // Catch: Throwable -> L10
        if (r4.hasNext() == true) goto L8;
        monitor-exit(r3);
        return;
    L8:
        ((jy2) r4.next()).getClass();     // Catch: Throwable -> L10
        throw null;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public static void w(a13 r2) {
    L8:
        th = move-exception;
        r2.c();
        throw th;
    L3:
        if ((r2.w() instanceof dh4) == true) goto L7;
        r2.c();
        return;
    L7:
        throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");     // Catch: Throwable -> L8
    }

    public final boolean A() {
        if (this.i.p == 0) goto L6;
        return true;
    L6:
        if (z() == false) goto L8;
        return true;
    L8:
        if (B() == false) goto L10;
        return true;
    L10:
        if (this.l.e != 0) goto L18;
        return false;
    L18:
        return true;
    }

    public final boolean B() {
        if (this.t == false) goto L5;
        return false;
    L5:
        if ((((fl) ((z40) this.b.o).p).get() & 134217727) <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean C() {
        Object r0 = this.c;
        monitor-enter(r0);
    L15:
        th = move-exception;
        throw th;
    L5:
        if (this.h.h() == false) goto L7;
    L17:
        boolean r2 = true;
    L18:
        monitor-exit(r0);
        return r2;
    L7:
        if (this.i.p != 0) goto L17;
        if (z() == true) goto L17;
        if (B() == true) goto L17;
        r2 = false;
        goto L18
    }

    public final List D() {
        List r0 = this.g;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ArrayList r1 = this.f;
        if (r1.isEmpty() == false) goto L8;
        List r2 = u01.n;
    L9:
        this.g = r2;
        return r2;
    L8:
        r2 = new ArrayList(r1);
        goto L9
    }

    public final void E() {
        Object r0 = this.c;
        monitor-enter(r0);
        az r1 = y();     // Catch: Throwable -> L12
        if (((ov3) this.u.getValue()).compareTo(ov3.o) <= 0) goto L10;
        monitor-exit(r0);
        if (r1 == null) goto L17;
        cz r2 = (cz) r1;
        r2.resumeWith(j15.a);
        return;
    L17:
        return;
    L10:
        Throwable r4 = this.e;     // Catch: Throwable -> L12
        CancellationException r3 = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");     // Catch: Throwable -> L12
        r3.initCause(r4);     // Catch: Throwable -> L12
        throw r3;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    public final void F(z80 r2) {
        Object r3 = this.c;
        monitor-enter(r3);
        ArrayList r1 = this.k;     // Catch: Throwable -> L11
        if (r1.size() > 0) goto L9;
        monitor-exit(r3);
        return;
    L9:
        ((jy2) r1.get(0)).getClass();     // Catch: Throwable -> L11
        throw null;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final List H(List r19, x03 r20) {
        HashMap r1 = new HashMap(r19.size());
        int r2 = r19.size();
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L9;
        Object r7 = r19.get(r4);
        ((jy2) r7).getClass();
        Object r8 = r1.get(null);
        if (r8 != null) goto L8;
        r8 = new ArrayList();
        r1.put(null, r8);
    L8:
        ((ArrayList) r8).add(r7);
        r4 = r4 + 1;
        goto L4
    L9:
        Iterator r3 = r1.entrySet().iterator();
    L11:
        if (r3.hasNext() == false) goto L94;
        Map.Entry r5 = (Map.Entry) r3.next();
        z80 r6 = (z80) r5.getKey();
        List r9 = (List) r5.getValue();
        if (r6.I.F == false) goto L15;
        l80.a("Check failed");
    L15:
        kl3 r10 = new kl3(1, r6);
        o r11 = new o(25, r6, r20);
        ch4 r12 = jh4.j();
        if ((r12 instanceof a13) == false) goto L18;
        a13 r13 = (a13) r12;
    L19:
        if (r13 == null) goto L91;
        a13 r14 = r13.C(r10, r11);
        if (r14 == null) goto L91;
        ch4 r15 = r14.j();     // Catch: Throwable -> L83
        Object r16 = this.c;     // Catch: Throwable -> L63
        monitor-enter(r16);     // Catch: Throwable -> L63
        ArrayList r17 = new ArrayList(r9.size());     // Catch: Throwable -> L28
        int r18 = r9.size();     // Catch: Throwable -> L28
        int r110 = 0;
    L26:
        if (r110 >= r18) goto L30;
        jy2 r111 = (jy2) r9.get(r110);     // Catch: Throwable -> L28
        w03 r112 = this.l;     // Catch: Throwable -> L28
        r111.getClass();     // Catch: Throwable -> L28
        Object r113 = mz2.a(r112);     // Catch: Throwable -> L28
        jy2 r114 = (jy2) r113;     // Catch: Throwable -> L28
        r17.add(new kd3(r111, r113));     // Catch: Throwable -> L28
        r110 = r110 + 1;     // Catch: Throwable -> L28
        goto L26
    L30:
        int r21 = r17.size();     // Catch: Throwable -> L28
        int r22 = 0;
    L31:
        if (r22 >= r21) goto L47;
        kd3 r115 = (kd3) r17.get(r22);     // Catch: Throwable -> L28
        if (r115.o != null) goto L46;
        rf2 r116 = this.m;     // Catch: Throwable -> L28
        ((jy2) r115.n).getClass();     // Catch: Throwable -> L28
        if (((w03) r116.n).b(null) == false) goto L46;
        ArrayList r23 = new ArrayList(r17.size());     // Catch: Throwable -> L28
        int r24 = r17.size();     // Catch: Throwable -> L28
        int r117 = 0;
    L37:
        if (r117 >= r24) goto L45;
        kd3 r118 = (kd3) r17.get(r117);     // Catch: Throwable -> L28
        if (r118.o != null) goto L43;
        rf2 r119 = this.m;     // Catch: Throwable -> L28
        ((jy2) r118.n).getClass();     // Catch: Throwable -> L28
        w03 r120 = (w03) r119.n;     // Catch: Throwable -> L28
        v43 r121 = (v43) mz2.a(r120);     // Catch: Throwable -> L28
        if (r120.i() == false) goto L43;
        ((w03) r119.o).a();     // Catch: Throwable -> L28
    L43:
        r23.add(r118);     // Catch: Throwable -> L28
        r117 = r117 + 1;
        goto L37
    L45:
        r17 = r23;
    L46:
        r22 = r22 + 1;
    L47:
        monitor-exit(r16);     // Catch: Throwable -> L63
        int r25 = r17.size();     // Catch: Throwable -> L63
        int r26 = 0;
    L49:
        if (r26 >= r25) goto L80;
        if (((kd3) r17.get(r26)).o != null) goto L53;
        r26 = r26 + 1;     // Catch: Throwable -> L63
        goto L49
    L53:
        int r27 = r17.size();     // Catch: Throwable -> L63
        int r28 = 0;
    L54:
        if (r28 >= r27) goto L80;
        if (((kd3) r17.get(r28)).o == null) goto L58;
        r28 = r28 + 1;     // Catch: Throwable -> L63
        goto L54
    L58:
        ArrayList r29 = new ArrayList(r17.size());     // Catch: Throwable -> L63
        int r30 = r17.size();     // Catch: Throwable -> L63
        int r31 = 0;
    L59:
        if (r31 >= r30) goto L66;
        kd3 r122 = (kd3) r17.get(r31);     // Catch: Throwable -> L63
        if (r122.o != null) goto L65;
        jy2 r123 = (jy2) r122.n;     // Catch: Throwable -> L63
    L65:
        r31 = r31 + 1;     // Catch: Throwable -> L63
        goto L59
    L66:
        Object r32 = this.c;     // Catch: Throwable -> L63
        monitor-enter(r32);     // Catch: Throwable -> L63
        v40.n0(r29, this.k);     // Catch: Throwable -> L77
        monitor-exit(r32);     // Catch: Throwable -> L63
        ArrayList r33 = new ArrayList(r17.size());     // Catch: Throwable -> L63
        int r34 = r17.size();     // Catch: Throwable -> L63
        int r35 = 0;
    L71:
        if (r35 >= r34) goto L76;
        Object r124 = r17.get(r35);     // Catch: Throwable -> L63
        if (((kd3) r124).o == null) goto L75;
        r33.add(r124);     // Catch: Throwable -> L63
    L75:
        r35 = r35 + 1;     // Catch: Throwable -> L63
        goto L71
    L76:
        r17 = r33;
        goto L80
    L77:
        th = move-exception;
        throw th;     // Catch: Throwable -> L63
    L80:
        r6.r(r17);     // Catch: Throwable -> L63
        ch4.q(r15);     // Catch: Throwable -> L83
        w(r14);
        goto L11
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L63
    L63:
        th = move-exception;
        ch4.q(r15);     // Catch: Throwable -> L83
        throw th;     // Catch: Throwable -> L83
    L83:
        th = move-exception;
        w(r14);
        throw th;
    L91:
        kf2.o("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    L18:
        r13 = null;
        goto L19
    L94:
        return q40.Q0(r1.keySet());
    }

    public final z80 I(z80 r6, x03 r7) {
        if (r6.I.F == false) goto L5;
    L47:
        return null;
    L5:
        if (r6.J != 3) goto L7;
        return null;
    L7:
        x03 r5 = this.q;
        int r0 = 1;
        if (r5 != null) goto L10;
    L12:
        kl3 r8 = new kl3(r0, r6);
        o r2 = new o(25, r6, r7);
        ch4 r3 = jh4.j();
        if ((r3 instanceof a13) == false) goto L15;
        a13 r4 = (a13) r3;
    L16:
        if (r4 == null) goto L46;
        a13 r9 = r4.C(r8, r2);
        if (r9 == null) goto L46;
        ch4 r10 = r9.j();     // Catch: Throwable -> L40
        if (r7 != null) goto L51;
    L35:
        boolean r11 = r6.w();     // Catch: Throwable -> L33
        ch4.q(r10);     // Catch: Throwable -> L40
        w(r9);
        if (r11 == false) goto L47;
        return r6;
    L51:
    L33:
        th = move-exception;
        ch4.q(r10);     // Catch: Throwable -> L40
        throw th;     // Catch: Throwable -> L40
    L22:
        if (r7.h() != true) goto L35;
        fa r12 = new fa(15, r7, r6);     // Catch: Throwable -> L33
        rg1 r13 = r6.I;     // Catch: Throwable -> L33
        if (r13.F == false) goto L26;
        l80.a("Preparing a composition while composing is not supported");     // Catch: Throwable -> L33
    L26:
        r13.F = true;     // Catch: Throwable -> L33
        r12.invoke();     // Catch: Throwable -> L30
        r13.F = false;     // Catch: Throwable -> L33
        goto L35
    L30:
        th = move-exception;
        r13.F = false;     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L40:
        th = move-exception;
        w(r9);
        throw th;
    L46:
        kf2.o("Cannot create a mutable snapshot of an read-only snapshot");
        goto L47
    L15:
        r4 = null;
        goto L16
    L10:
        if (r5.c(r6) != true) goto L12;
        goto L12
    }

    public final void J(Throwable r5, z80 r6) {
        if (((Boolean) A.get()).booleanValue() == true) goto L5;
    L20:
        Object r7 = this.c;
        monitor-enter(r7);
        Log.e("ComposeInternal", "Error was captured in composition.", r5);     // Catch: Throwable -> L27
        nv3 r0 = (nv3) this.s.getValue();     // Catch: Throwable -> L27
        if (r0 != null) goto L30;
        nl4 r4 = this.s;     // Catch: Throwable -> L27
        nv3 r1 = new nv3(r5);     // Catch: Throwable -> L27
        r4.getClass();     // Catch: Throwable -> L27
        r4.j(null, r1);     // Catch: Throwable -> L27
        monitor-exit(r7);
        throw r5;
    L30:
        throw r0.a;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;
    L5:
        if ((r5 instanceof ComposeRuntimeError) == true) goto L20;
        Object r2 = this.c;
        monitor-enter(r2);
        Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", r5);     // Catch: Throwable -> L11
        this.j.clear();     // Catch: Throwable -> L11
        this.i.g();     // Catch: Throwable -> L11
        this.h = new x03();     // Catch: Throwable -> L11
        this.k.clear();     // Catch: Throwable -> L11
        this.l.a();     // Catch: Throwable -> L11
        this.n.a();     // Catch: Throwable -> L11
        nl4 r3 = this.s;     // Catch: Throwable -> L11
        nv3 r8 = new nv3(r5);     // Catch: Throwable -> L11
        r3.getClass();     // Catch: Throwable -> L11
        r3.j(null, r8);     // Catch: Throwable -> L11
        if (r6 == null) goto L14;
        L(r6);     // Catch: Throwable -> L11
    L14:
        if (y() == null) goto L16;
        l80.a("expected to go to inactive state due to composition error");     // Catch: Throwable -> L11
    L16:
        monitor-exit(r2);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final boolean K() {
        Object r0 = this.c;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.h.g() == false) goto L11;
        boolean r6 = A();     // Catch: Throwable -> L9
        monitor-exit(r0);
        return r6;
    L11:
        List r1 = D();     // Catch: Throwable -> L9
        x54 r3 = new x54(this.h);     // Catch: Throwable -> L9
        this.h = new x03();     // Catch: Throwable -> L9
        monitor-exit(r0);
        int r2 = r1.size();     // Catch: Throwable -> L18
        int r4 = 0;
    L14:
        if (r4 >= r2) goto L20;
        ((z80) r1.get(r4)).x(r3);     // Catch: Throwable -> L18
        if (((ov3) this.u.getValue()).compareTo(ov3.o) <= 0) goto L20;
        r4 = r4 + 1;
    L20:
        Object r5 = this.c;
        monitor-enter(r5);
    L27:
        th = move-exception;
        throw th;
    L23:
        if (y() != null) goto L30;
        boolean r7 = A();     // Catch: Throwable -> L27
        monitor-exit(r5);
        return r7;
    L30:
        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");     // Catch: Throwable -> L27
    L18:
        th = move-exception;
        monitor-enter(this.c);
        x03 r8 = this.h;     // Catch: Throwable -> L42
        r8.getClass();     // Catch: Throwable -> L42
        Iterator<E> r9 = r3.iterator();     // Catch: Throwable -> L42
    L37:
        if (r9.hasNext() == false) goto L41;
        r8.k(r9.next());     // Catch: Throwable -> L42
        goto L37
    L41:
        throw th;
    L42:
        th = move-exception;
        throw th;
    }

    public final void L(z80 r3) {
        ArrayList r0 = this.p;
        if (r0 != null) goto L6;
        r0 = new ArrayList();
        this.p = r0;
    L6:
        if (r0.contains(r3) == true) goto L9;
        r0.add(r3);
    L9:
        if (this.f.remove(r3) == false) goto L12;
        this.g = null;
        return;
    }

    @Override // defpackage.u80
    public final void a(z80 r9, wf1 r10) {
        boolean r0 = r9.I.F;
        Object r1 = this.c;
        monitor-enter(r1);
        ov3 r2 = (ov3) this.u.getValue();     // Catch: Throwable -> L8
        ov3 r3 = ov3.o;     // Catch: Throwable -> L8
        int r4 = 1;
        if (r2.compareTo(r3) <= 0) goto L10;
        boolean r5 = !D().contains(r9);
    L11:
        monitor-exit(r1);
        kl3 r6 = new kl3(r4, r9);     // Catch: Throwable -> L49
        o r7 = new o(25, r9, null);     // Catch: Throwable -> L49
        ch4 r8 = jh4.j();     // Catch: Throwable -> L49
        if ((r8 instanceof a13) == false) goto L15;
        a13 r11 = (a13) r8;     // Catch: Throwable -> L49
    L16:
        if (r11 == null) goto L59;
        a13 r12 = r11.C(r6, r7);     // Catch: Throwable -> L49
        if (r12 == null) goto L59;
        ch4 r13 = r12.j();     // Catch: Throwable -> L51
        r9.j(r10);     // Catch: Throwable -> L53
        ch4.q(r13);     // Catch: Throwable -> L51
        w(r12);     // Catch: Throwable -> L49
        Object r14 = this.c;
        monitor-enter(r14);
    L31:
        th = move-exception;
        throw th;
    L26:
        if (((ov3) this.u.getValue()).compareTo(r3) > 0) goto L28;
    L33:
        monitor-exit(r14);
        if (r0 == true) goto L78;
        jh4.j().m();
    L78:
        F(r9);     // Catch: Throwable -> L44
        r9.d();     // Catch: Throwable -> L41
        r9.f();     // Catch: Throwable -> L41
        if (r0 == true) goto L80;
        jh4.j().m();
        return;
    L80:
        return;
    L41:
        th = move-exception;
        J(th, null);
        return;
    L44:
        th = move-exception;
        J(th, r9);
        return;
    L28:
        if (D().contains(r9) == true) goto L33;
        this.f.add(r9);     // Catch: Throwable -> L31
        this.g = null;     // Catch: Throwable -> L31
        goto L33
    L53:
        th = move-exception;
        ch4.q(r13);     // Catch: Throwable -> L51
        throw th;     // Catch: Throwable -> L51
    L51:
        th = move-exception;
        w(r12);     // Catch: Throwable -> L49
        throw th;     // Catch: Throwable -> L49
    L59:
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");     // Catch: Throwable -> L49
    L15:
        r11 = null;
    L49:
        th = move-exception;
        if (r5 == true) goto L62;
    L64:
        J(th, r9);
        return;
    L62:
        monitor-enter(this.c);
        goto L64
    L10:
        r5 = true;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.u80
    public final x03 b(z80 r4, md4 r5, wf1 r6) {
        z05 r0 = this.v;
        md4 r2 = r4.C;     // Catch: Throwable -> L11
        r4.C = r5;     // Catch: Throwable -> L11
        a(r4, r6);     // Catch: Throwable -> L13
        x03 r3 = (x03) r0.f();     // Catch: Throwable -> L13
        if (r3 != null) goto L8;
        r3 = w54.a;     // Catch: Throwable -> L13
        r3.getClass();     // Catch: Throwable -> L13
    L8:
        r4.C = r2;     // Catch: Throwable -> L11
        r0.n(null);
        return r3;
    L13:
        th = move-exception;
        r4.C = r2;     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        r0.n(null);
        throw th;
    }

    @Override // defpackage.u80
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.u80
    public final boolean e() {
        return false;
    }

    @Override // defpackage.u80
    public final boolean f() {
        return false;
    }

    @Override // defpackage.u80
    public final long g() {
        return 1000;
    }

    @Override // defpackage.u80
    public final t80 h() {
        return null;
    }

    @Override // defpackage.u80
    public final ne0 j() {
        return this.x;
    }

    @Override // defpackage.u80
    public final boolean k() {
        return false;
    }

    @Override // defpackage.u80
    public final void l(z80 r3) {
        Object r0 = this.c;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.i.h(r3) == true) goto L10;
        this.i.b(r3);     // Catch: Throwable -> L8
        az r2 = y();     // Catch: Throwable -> L8
    L11:
        monitor-exit(r0);
        if (r2 == null) goto L19;
        cz r4 = (cz) r2;
        r4.resumeWith(j15.a);
        return;
    L19:
        return;
    L10:
        r2 = null;
        goto L11
    }

    @Override // defpackage.u80
    public final iy2 m(jy2 r2) {
        Object r0 = this.c;
        monitor-enter(r0);
        iy2 r1 = (iy2) this.n.j(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.u80
    public final x03 n(z80 r4, md4 r5, x03 r6) {
        z05 r0 = this.v;
        K();     // Catch: Throwable -> L16
        r4.x(new x54(r6));     // Catch: Throwable -> L16
        md4 r7 = r4.C;     // Catch: Throwable -> L16
        r4.C = r5;     // Catch: Throwable -> L16
        z80 r8 = I(r4, null);     // Catch: Throwable -> L7
        if (r8 == null) goto L9;
        F(r4);     // Catch: Throwable -> L7
        r8.d();     // Catch: Throwable -> L7
        r8.f();     // Catch: Throwable -> L7
    L9:
        x03 r3 = (x03) r0.f();     // Catch: Throwable -> L7
        if (r3 != null) goto L13;
        r3 = w54.a;     // Catch: Throwable -> L7
        r3.getClass();     // Catch: Throwable -> L7
    L13:
        r4.C = r7;     // Catch: Throwable -> L16
        r0.n(null);
        return r3;
    L7:
        th = move-exception;
        r4.C = r7;     // Catch: Throwable -> L16
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r0.n(null);
        throw th;
    }

    @Override // defpackage.u80
    public final void o(Set r1) {
    }

    @Override // defpackage.u80
    public final void q(lv3 r2) {
        z05 r1 = this.v;
        x03 r0 = (x03) r1.f();
        if (r0 != null) goto L5;
        x03 r3 = w54.a;
        r0 = new x03();
        r1.n(r0);
    L5:
        r0.a(r2);
    }

    @Override // defpackage.u80
    public final void r(z80 r3) {
        Object r0 = this.c;
        monitor-enter(r0);
        x03 r1 = this.q;     // Catch: Throwable -> L7
        if (r1 != null) goto L9;
        x03 r2 = w54.a;     // Catch: Throwable -> L7
        r1 = new x03();     // Catch: Throwable -> L7
        this.q = r1;     // Catch: Throwable -> L7
    L9:
        r1.a(r3);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.u80
    public final ez s(wc r3) {
        jv3 r2 = this.b;
        z40 r0 = (z40) r2.o;
        w53 r1 = new w53();
        r1.a = r3;
        return r0.a(r1, (fa) r2.p);
    }

    @Override // defpackage.u80
    public final void v(z80 r3) {
        Object r0 = this.c;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.f.remove(r3) == false) goto L7;
        this.g = null;     // Catch: Throwable -> L10
    L7:
        this.i.j(r3);     // Catch: Throwable -> L10
        this.j.remove(r3);     // Catch: Throwable -> L10
        monitor-exit(r0);
    }

    public final void x() {
        Object r0 = this.c;
        monitor-enter(r0);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (((ov3) this.u.getValue()).compareTo(ov3.r) < 0) goto L10;
        nl4 r1 = this.u;     // Catch: Throwable -> L8
        ov3 r3 = ov3.o;     // Catch: Throwable -> L8
        r1.getClass();     // Catch: Throwable -> L8
        r1.j(null, r3);     // Catch: Throwable -> L8
    L10:
        monitor-exit(r0);
        this.w.f(null);
    }

    public final az y() {
        nl4 r0 = this.u;
        int r1 = ((ov3) r0.getValue()).compareTo(ov3.o);
        nl4 r2 = this.s;
        ArrayList r3 = this.k;
        ArrayList r4 = this.j;
        f13 r5 = this.i;
        if (r1 > 0) goto L12;
        List r6 = D();
        int r7 = r6.size();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L7;
        z80 r9 = (z80) r6.get(r8);
        r8 = r8 + 1;
        goto L5
    L7:
        this.f.clear();
        this.g = u01.n;
        this.h = new x03();
        r5.g();
        r4.clear();
        r3.clear();
        this.p = null;
        cz r10 = this.r;
        if (r10 == null) goto L10;
        r10.r(null);
    L10:
        this.r = null;
        r2.i(null);
        return null;
    L12:
        Object r11 = r2.getValue();
        ov3 r12 = ov3.s;
        ov3 r13 = ov3.p;
        if (r11 == null) goto L16;
    L40:
        r0.j(null, r13);
        if (r13 != r12) goto L44;
        cz r14 = this.r;
        this.r = null;
        return r14;
    L44:
        return null;
    L16:
        if (this.d != null) goto L23;
        this.h = new x03();
        r5.g();
        if (z() == false) goto L20;
    L21:
        r13 = ov3.q;
        goto L40
    L20:
        if (B() == false) goto L40;
    L23:
        if (r5.p == 0) goto L26;
    L39:
        r13 = r12;
        goto L40
    L26:
        if (this.h.h() == true) goto L39;
        if (r4.isEmpty() == false) goto L39;
        if (r3.isEmpty() == false) goto L39;
        if (z() == true) goto L39;
        if (B() == true) goto L39;
        if (this.l.e != 0) goto L39;
        r13 = ov3.r;
        goto L40
    }

    public final boolean z() {
        if (this.t == false) goto L5;
        return false;
    L5:
        if ((((fl) ((z40) this.a.p).p).get() & 134217727) <= 0) goto L10;
        return true;
    L10:
        return false;
    }
}
