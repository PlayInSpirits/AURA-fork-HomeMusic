package defpackage;

import android.view.ViewGroup;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements u70 {
    public int A;
    public int B;
    public final c72 n;
    public u80 o;
    public wo0 p;
    public int q;
    public int r;
    public final w03 s;
    public final w03 t;
    public final j72 u;
    public final g72 v;
    public final w03 w;
    public final mn4 x;
    public final w03 y;
    public final f13 z;

    public o72(c72 r1, wo0 r2) {
        this.n = r1;
        this.p = r2;
        long[] r3 = v54.a;
        this.s = new w03();
        this.t = new w03();
        this.u = new j72(this);
        this.v = new g72(this);
        this.w = new w03();
        this.x = new mn4();
        this.y = new w03();
        this.z = new f13(new Object[16]);
    }

    public static final void c(o72 r6, Object r7) {
        c72 r0 = r6.n;
        r6.h();
        c72 r1 = (c72) r6.w.j(r7);
        if (r1 == null) goto L17;
        if (r6.B > 0) goto L8;
        cz1.b("No pre-composed items to dispose");
    L8:
        int r3 = ((c13) r0.o()).n.i(r1);
        if (r3 >= (((c13) r0.o()).n.p - r6.B)) goto L12;
        cz1.b("Item is not in pre-composed item range");
    L12:
        r6.A++;
        r6.B--;
        h72 r2 = (h72) r6.s.g(r1);
        if (r2 == null) goto L15;
        e(r2);
    L15:
        int r4 = (((c13) r0.o()).n.p - r6.B) - r6.A;
        r6.j(r3, r4);
        r6.g(r4);
    L17:
        if (r6.z.h(r7) == false) goto L20;
        c72.W(r0, true, 6);
        return;
    }

    public static void e(h72 r5) {
        ef3 r0 = r5.f;
        if (r0 == null) goto L16;
        r0.h.set(gf3.o);
        uy3 r1 = r0.k;
        if (r1.d.h() == false) goto L7;
        x03 r2 = r1.d;
        x03 r4 = w54.a;
        r1.d = new x03();
        r1.c.g();
    L8:
        r1.b();
        z80 r3 = r0.a;
        r3.D = null;
        if (r2 == null) goto L11;
        r3.H.k = r2;
        r3.J = 2;
    L11:
        r5.f = null;
        z80 r6 = r5.c;
        if (r6 == null) goto L14;
        r6.m();
    L14:
        r5.c = null;
        return;
    L7:
        r2 = null;
        goto L8
    }

    @Override // defpackage.u70
    public final void a() {
        c72 r2 = this.n;
        r2.C = true;
        w03 r1 = this.s;
        Object[] r3 = r1.c;
        long[] r4 = r1.a;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L18;
        int r7 = 0;
    L5:
        long r8 = r4[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r10 = 8 - ((~(r7 - r5)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L15;
        if ((255 & r8) >= 128) goto L14;
        z80 r13 = ((h72) r3[(r7 << 3) + r12]).c;
        if (r13 == null) goto L14;
        r13.m();
    L14:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L15:
        if (r10 != 8) goto L18;
    L16:
        if (r7 == r5) goto L18;
        r7 = r7 + 1;
    L18:
        r2.Q();
        r2.C = false;
        r1.a();
        this.t.a();
        this.B = 0;
        this.A = 0;
        this.w.a();
        h();
    }

    @Override // defpackage.u70
    public final void b() {
        i(true);
    }

    public final void d(h72 r7, boolean r8) {
        ef3 r0 = r7.f;
        if (r0 == null) goto L25;
        ch4 r1 = ya4.t();
        if (r1 == null) goto L7;
        if1 r3 = r1.e();
    L8:
        ch4 r4 = ya4.z(r1);
        c72 r6 = this.n;     // Catch: Throwable -> L20
        r6.C = true;     // Catch: Throwable -> L20
        if (r8 == true) goto L27;
    L16:
        r0.a();     // Catch: Throwable -> L14
        r7.f = null;     // Catch: Throwable -> L20
        r6.C = false;     // Catch: Throwable -> L20
        ya4.H(r1, r4, r3);
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L27:
        if (r0.c() == true) goto L16;
        r0.e(new er1(12));     // Catch: Throwable -> L14
    L20:
        th = move-exception;
        ya4.H(r1, r4, r3);
        throw th;
    L7:
        r3 = null;
        goto L8
    }

    public final jn4 f(Object r2) {
        if (this.n.G() == true) goto L7;
        return new m72();
    L7:
        return new n72(this, r2);
    }

    public final void g(int r19) {
        boolean r2 = false;
        this.A = 0;
        List r3 = this.n.o();
        c13 r4 = (c13) r3;
        int r5 = (r4.n.p - this.B) - 1;
        if (r19 > r5) goto L48;
        this.x.clear();
        if (r19 > r5) goto L10;
        int r7 = r19;
    L7:
        Object r8 = this.s.g((c72) r4.get(r7));
        r8.getClass();
        ((r03) this.x.o).a(((h72) r8).a);
        if (r7 == r5) goto L10;
        r7 = r7 + 1;
    L10:
        wo0 r6 = this.p;
        mn4 r9 = this.x;
        p03 r10 = (p03) r6.o;
        r10.a();
        r03 r11 = (r03) r9.o;
        Object[] r12 = r11.b;
        long[] r13 = r11.c;
        int r14 = r11.e;
    L11:
        if1 r15 = null;
        if (r14 == Integer.MAX_VALUE) goto L22;
        int r16 = (int) ((r13[r14] >> 31) & 2147483647L);
        Object r17 = r12[r14];
        ((c82) r6.n).b(r17);
        int r18 = r10.d(null);
        if (r18 < 0) goto L16;
        int r110 = r10.c[r18];
    L18:
        if (r110 != 7) goto L20;
        r9.remove(r17);
    L21:
        r14 = r16;
        goto L11
    L20:
        r10.g(r110 + 1, null);
        goto L21
    L16:
        r110 = 0;
        goto L18
    L22:
        ch4 r20 = ya4.t();
        if (r20 == null) goto L25;
        r15 = r20.e();
    L25:
        ch4 r21 = ya4.z(r20);
        boolean r22 = false;
    L26:
        if (r5 < r19) goto L47;
        c72 r23 = (c72) ((c13) r3).get(r5);     // Catch: Throwable -> L37
        Object r111 = this.s.g(r23);     // Catch: Throwable -> L37
        r111.getClass();     // Catch: Throwable -> L37
        h72 r112 = (h72) r111;     // Catch: Throwable -> L37
        Object r113 = r112.a;     // Catch: Throwable -> L37
        if (((r03) this.x.o).c(r113) == false) goto L39;
        this.A++;     // Catch: Throwable -> L37
        if (((Boolean) r112.g.getValue()).booleanValue() == false) goto L43;
        f72 r24 = r23.R;     // Catch: Throwable -> L37
        ti2 r114 = r24.p;     // Catch: Throwable -> L37
        a72 r115 = a72.p;     // Catch: Throwable -> L37
        r114.y = r115;     // Catch: Throwable -> L37
        if2 r25 = r24.q;     // Catch: Throwable -> L37
        if (r25 == null) goto L34;
        r25.w = r115;     // Catch: Throwable -> L37
    L34:
        l(r112, false);     // Catch: Throwable -> L37
        if (r112.h == false) goto L43;
        r22 = true;
    L43:
        this.t.j(r113);     // Catch: Throwable -> L37
        r5 = r5 - 1;
        goto L26
    L39:
        c72 r116 = this.n;     // Catch: Throwable -> L37
        r116.C = true;     // Catch: Throwable -> L37
        this.s.j(r23);     // Catch: Throwable -> L37
        z80 r26 = r112.c;     // Catch: Throwable -> L37
        if (r26 == null) goto L42;
        r26.m();     // Catch: Throwable -> L37
    L42:
        this.n.R(r5, 1);     // Catch: Throwable -> L37
        r116.C = false;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        ya4.H(r20, r21, r15);
        throw th;
    L47:
        ya4.H(r20, r21, r15);
    L49:
        if (r22 == false) goto L63;
        Object r1 = jh4.c;
        monitor-enter(r1);
        x03 r27 = jh4.j.h;     // Catch: Throwable -> L60
        if (r27 == null) goto L57;
        if (r27.h() != true) goto L57;
        r2 = true;
    L57:
        monitor-exit(r1);
        if (r2 == false) goto L63;
        jh4.a();
    L60:
        th = move-exception;
        throw th;
    L63:
        h();
        return;
    L48:
        r22 = false;
        goto L49
    }

    public final void h() {
        int r0 = ((c13) this.n.o()).n.p;
        int r1 = this.s.e;
        if (r1 == r0) goto L6;
        cz1.a("Inconsistency between the count of nodes tracked by the state (" + r1 + ") and the children count on the SubcomposeLayout (" + r0 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
    L6:
        int r2 = this.A;
        int r3 = this.B;
        if (((r0 - r2) - r3) >= 0) goto L10;
        StringBuilder r4 = b11.t("Incorrect state. Total children ", ". Reusable children ", r0, r2, ". Precomposed children ");
        r4.append(r3);
        cz1.a(r4.toString());
    L10:
        int r5 = this.w.e;
        int r6 = this.B;
        if (r5 != r6) goto L13;
        return;
    L13:
        cz1.a("Incorrect state. Precomposed children " + r6 + ". Map size " + r5);
    }

    public final void i(boolean r11) {
        int r0 = 0;
        this.B = 0;
        this.w.a();
        List r1 = this.n.o();
        int r2 = ((c13) r1).n.p;
        if (this.A == r2) goto L25;
        this.A = r2;
        ch4 r3 = ya4.t();
        if (r3 == null) goto L7;
        if1 r4 = r3.e();
    L8:
        ch4 r5 = ya4.z(r3);
    L9:
        if (r0 >= r2) goto L24;
        c72 r6 = (c72) ((c13) r1).get(r0);     // Catch: Throwable -> L19
        h72 r7 = (h72) this.s.g(r6);     // Catch: Throwable -> L19
        if (r7 == null) goto L21;
        if (((Boolean) r7.g.getValue()).booleanValue() == false) goto L21;
        f72 r8 = r6.R;     // Catch: Throwable -> L19
        ti2 r9 = r8.p;     // Catch: Throwable -> L19
        a72 r10 = a72.p;     // Catch: Throwable -> L19
        r9.y = r10;     // Catch: Throwable -> L19
        if2 r12 = r8.q;     // Catch: Throwable -> L19
        if (r12 == null) goto L17;
        r12.w = r10;     // Catch: Throwable -> L19
    L17:
        l(r7, r11);     // Catch: Throwable -> L19
        r7.a = gn4.a;     // Catch: Throwable -> L19
    L21:
        r0 = r0 + 1;
    L19:
        th = move-exception;
        ya4.H(r3, r5, r4);
        throw th;
    L24:
        ya4.H(r3, r5, r4);
        this.t.a();
        goto L25
    L7:
        r4 = null;
    L25:
        h();
    }

    public final void j(int r2, int r3) {
        c72 r1 = this.n;
        r1.C = true;
        r1.K(r2, r3, 1);
        r1.C = false;
    }

    public final void k(Object r7, wf1 r8, boolean r9) {
        c72 r0 = this.n;
        if (r0.G() == false) goto L17;
        h();
        if (this.t.c(r7) == true) goto L16;
        this.y.j(r7);
        w03 r1 = this.w;
        Object r2 = r1.g(r7);
        if (r2 != null) goto L14;
        r2 = n(r7);
        if (r2 == null) goto L12;
        j(((c13) r0.o()).n.i(r2), ((c13) r0.o()).n.p);
        this.B++;
    L13:
        r1.l(r7, r2);
        goto L14
    L12:
        int r3 = ((c13) r0.o()).n.p;
        c72 r4 = new c72(2);
        r0.C = true;
        r0.A(r3, r4);
        r0.C = false;
        this.B++;
        r2 = r4;
    L14:
        m((c72) r2, r7, r9, r8);
        return;
    L16:
        return;
    }

    public final void l(h72 r3, boolean r4) {
        if (r4 == false) goto L4;
    L6:
        r3.g = uc5.B(Boolean.FALSE);
    L8:
        if (r3.f == null) goto L11;
        e(r3);
        return;
    L11:
        if (r4 == false) goto L16;
        z80 r2 = r3.c;
        if (r2 == null) goto L26;
        r2.l();
        return;
    L26:
        return;
    L16:
        lb3 r5 = ((ra) h12.L(this.n)).getOutOfFrameExecutor();
        if (r5 == null) goto L21;
        ra r6 = (ra) r5;
        r6.C(new wc(11, r3));
        return;
    L21:
        if (r3.h == true) goto L27;
        z80 r7 = r3.c;
        if (r7 == null) goto L28;
        r7.l();
        return;
    L28:
        return;
    L27:
        return;
    L4:
        if (r3.h == false) goto L6;
        r3.g.setValue(Boolean.FALSE);
        goto L8
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(c72 r10, Object r11, boolean r12, wf1 r13) {
        w03 r0 = this.s;
        Object r1 = r0.g(r10);
        if1 r2 = null;
        Object r3 = r1;
        if (r1 != null) goto L5;
        r70 r4 = ji2.a;
        h72 r5 = new h72();
        r5.a = r11;
        r5.b = r4;
        r5.c = null;
        r5.g = uc5.B(Boolean.TRUE);
        r0.l(r10, r5);
        r3 = r5;
    L5:
        h72 r6 = (h72) r3;
        if (r6.b == r13) goto L8;
        boolean r14 = true;
    L10:
        if (r6.f == null) goto L16;
        if (r14 == false) goto L13;
        e(r6);
        goto L16
    L13:
        if (r12 == true) goto L88;
        d(r6, true);
        goto L16
    L88:
        return;
    L16:
        z80 r7 = r6.c;
        if (r7 == null) goto L29;
        Object r8 = r7.q;
        monitor-enter(r8);
        if (r7.A.e <= 0) goto L23;
        boolean r9 = true;
    L24:
        monitor-exit(r8);
    L30:
        if (r14 == true) goto L36;
        if (r9 == true) goto L36;
        if (r6.d == true) goto L36;
        return;
    L36:
        r6.b = r13;
        if (r6.f == null) goto L40;
        cz1.a("new subcompose call while paused composition is still active");
    L40:
        ch4 r15 = ya4.t();
        if (r15 == null) goto L43;
        r2 = r15.e();
    L43:
        ch4 r16 = ya4.z(r15);
        c72 r17 = this.n;     // Catch: Throwable -> L53
        r17.C = true;     // Catch: Throwable -> L53
        z80 r18 = r6.c;     // Catch: Throwable -> L53
        u80 r19 = this.o;     // Catch: Throwable -> L53
        if (r19 == null) goto L81;
        if (r18 != null) goto L48;
    L55:
        if (r12 == false) goto L58;
        ViewGroup.LayoutParams r20 = zd5.a;     // Catch: Throwable -> L53
        z80 r110 = new z80(r19, new d15(r10));     // Catch: Throwable -> L53
    L57:
        r18 = r110;
    L59:
        r6.c = r18;     // Catch: Throwable -> L53
        wf1 r111 = r6.b;     // Catch: Throwable -> L53
        if (((ra) h12.L(this.n)).getOutOfFrameExecutor() == null) goto L62;
        r6.h = false;     // Catch: Throwable -> L53
    L63:
        if (r12 == false) goto L69;
        if (r6.e == false) goto L67;
        r18.i();     // Catch: Throwable -> L53
        r18.q();     // Catch: Throwable -> L53
        r6.f = r18.k(true, r111);     // Catch: Throwable -> L53
    L78:
        r6.e = false;     // Catch: Throwable -> L53
        r17.C = false;     // Catch: Throwable -> L53
        ya4.H(r15, r16, r2);
        r6.d = false;
        return;
    L67:
        r6.f = r18.k(r18.i(), r111);     // Catch: Throwable -> L53
        goto L78
    L69:
        if (r6.e == false) goto L77;
        r18.i();     // Catch: Throwable -> L53
        r18.q();     // Catch: Throwable -> L53
        rg1 r21 = r18.I;     // Catch: Throwable -> L53
        r21.z = 0;     // Catch: Throwable -> L53
        r21.y = true;     // Catch: Throwable -> L53
        r18.n.a(r18, r111);     // Catch: Throwable -> L53
        if (r21.F == false) goto L73;
    L75:
        oo3.a("Cannot disable reuse from root if it was caused by other groups");     // Catch: Throwable -> L53
    L76:
        r21.z = -1;     // Catch: Throwable -> L53
        r21.y = false;     // Catch: Throwable -> L53
        goto L78
    L73:
        if (r21.z != 0) goto L75;
    L77:
        r18.A(r111);     // Catch: Throwable -> L53
        goto L78
    L62:
        r6.h = true;     // Catch: Throwable -> L53
        r111 = new r70(1524156494, true, new ib(2, r6, r111));     // Catch: Throwable -> L53
        goto L63
    L58:
        ViewGroup.LayoutParams r22 = zd5.a;     // Catch: Throwable -> L53
        r110 = new z80(r19, new d15(r10));     // Catch: Throwable -> L53
        goto L57
    L48:
        if (r18.J != 3) goto L50;
        boolean r23 = true;
    L51:
        if (r23 == false) goto L59;
    L50:
        r23 = false;
        goto L51
    L81:
        cz1.c("parent composition reference not set");     // Catch: Throwable -> L53
        throw new KotlinNothingValueException();     // Catch: Throwable -> L53
    L53:
        th = move-exception;
        ya4.H(r15, r16, r2);
        throw th;
    L23:
        r9 = false;
    L26:
        th = move-exception;
        throw th;
    L29:
        r9 = true;
        goto L30
    L8:
        r14 = false;
        goto L10
    }

    public final c72 n(Object r10) {
        if (this.A == 0) goto L30;
        c13 r0 = (c13) this.n.o();
        int r1 = r0.n.p - this.B;
        int r2 = r1 - this.A;
        int r3 = r1 - 1;
        int r4 = r3;
    L6:
        w03 r5 = this.s;
        if (r4 < r2) goto L12;
        Object r7 = r5.g((c72) r0.get(r4));
        r7.getClass();
        if (((h72) r7).a.equals(r10) == true) goto L10;
        r4 = r4 - 1;
        goto L6
    L10:
        int r8 = r4;
    L13:
        if (r8 != (-1)) goto L20;
        if (r3 < r2) goto L19;
        Object r6 = r5.g((c72) r0.get(r3));
        r6.getClass();
        h72 r9 = (h72) r6;
        Object r11 = r9.a;
        if (r11 == gn4.a) goto L18;
        c82 r12 = (c82) this.p.n;
        r12.b(r10);
        r12.b(r11);
    L18:
        r9.a = r10;
        r4 = r3;
    L21:
        if (r3 != (-1)) goto L24;
        return null;
    L24:
        if (r4 == r2) goto L26;
        j(r4, r2);
    L26:
        this.A--;
        c72 r13 = (c72) r0.get(r2);
        Object r14 = r5.g(r13);
        r14.getClass();
        h72 r15 = (h72) r14;
        r15.g = uc5.B(Boolean.TRUE);
        r15.e = true;
        r15.d = true;
        return r13;
    L19:
        r4 = r3;
    L20:
        r3 = r8;
        goto L21
    L12:
        r8 = -1;
        goto L13
    L30:
        return null;
    }
}
