package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d15 implements bi {
    public final Object n;
    public final ArrayList o;
    public Object p;

    public d15(c72 r2) {
        this.n = r2;
        this.o = new ArrayList();
        this.p = r2;
    }

    @Override // defpackage.bi
    public final void a(int r1, Object r2) {
        c72 r0 = (c72) this.p;
        r0.A(r1, (c72) r2);
    }

    @Override // defpackage.bi
    public final void b(Object r3) {
        this.o.add(this.p);
        this.p = r3;
    }

    @Override // defpackage.bi
    public final void c() {
        c72 r7 = (c72) this.p;
        w12 r0 = r7.Q;
        if (r7.G() == true) goto L5;
        cz1.a("onReuse is only expected on attached node");
    L5:
        o72 r1 = r7.S;
        if (r1 == null) goto L8;
        r1.i(false);
    L8:
        r7.F = false;
        if (r7.Z == false) goto L11;
        r7.Z = false;
    L28:
        int r2 = r7.o;
        ub3 r3 = r7.A;
        if (r3 == null) goto L33;
        yv3 r4 = ((ra) r3).getRectManager();
        if (r4 == null) goto L33;
        r4.i(r7);
    L33:
        r7.o = f94.a.addAndGet(1);
        ub3 r5 = r7.A;
        if (r5 == null) goto L36;
        ra r6 = (ra) r5;
        r6.m74getLayoutNodes().g(r2);
        r6.m74getLayoutNodes().i(r7.o, r7);
    L36:
        cx2 r8 = (cx2) r0.g;
    L37:
        if (r8 == null) goto L39;
        r8.g0();
        r8 = r8.s;
        goto L37
    L39:
        r0.e();
        if (r0.d(8) == false) goto L42;
        r7.E();
    L42:
        c72.X(r7);
        ub3 r9 = r7.A;
        if (r9 == null) goto L56;
        ra r10 = (ra) r9;
        if (ra.d() == false) goto L56;
        y9 r11 = r10.m71getAutofillManager();
        if (r11 == null) goto L56;
        ra r12 = r11.p;
        qr2 r13 = r11.n;
        j03 r14 = r11.t;
        if (r14.f(r2) == false) goto L51;
        r13.p(r12, r2, false);
    L51:
        e94 r15 = r7.v();
        if (r15 == null) goto L56;
        if (r15.n.b(n94.q) != true) goto L56;
        r14.a(r7.o);
        r13.p(r12, r7.o, true);
    L56:
        ub3 r16 = r7.A;
        if (r16 == null) goto L72;
        yv3 r17 = ((ra) r16).getRectManager();
        if (r17 == null) goto L73;
        r17.h(r7);
        return;
    L73:
        return;
    L72:
        return;
    L11:
        cx2 r18 = (sq4) r7.Q.f;
        cx2 r19 = r18;
    L12:
        if (r19 == null) goto L17;
        if (r19.A == false) goto L16;
        r19.l0();
    L16:
        r19 = r19.r;
        goto L12
    L17:
        cx2 r20 = r18;
    L18:
        if (r20 == null) goto L23;
        if (r20.A == false) goto L22;
        r20.n0();
    L22:
        r20 = r20.r;
    L23:
        if (r18 == null) goto L28;
        if (r18.A == false) goto L27;
        r18.h0();
    L27:
        r18 = r18.r;
        goto L23
    }

    @Override // defpackage.bi
    public final void d(int r1, int r2, int r3) {
        ((c72) this.p).K(r1, r2, r3);
    }

    @Override // defpackage.bi
    public final void e(int r1, int r2) {
        ((c72) this.p).R(r1, r2);
    }

    public final void f() {
        this.o.clear();
        this.p = this.n;
        ((c72) this.n).Q();
    }

    @Override // defpackage.bi
    public final void g() {
        ArrayList r0 = this.o;
        this.p = r0.remove(r0.size() - 1);
    }

    @Override // defpackage.bi
    public final /* bridge */ /* synthetic */ void h(int r1, Object r2) {
        c72 r3 = (c72) r2;
    }

    @Override // defpackage.bi
    public final void i() {
        ub3 r0 = ((c72) this.n).A;
        if (r0 == null) goto L6;
        ((ra) r0).s();
        return;
    }

    @Override // defpackage.bi
    public final Object j() {
        return this.p;
    }
}
