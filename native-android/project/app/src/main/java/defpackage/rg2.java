package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 extends be5 {
    public final boolean l;
    public final bu4 m;
    public final zt4 n;
    public pg2 o;
    public og2 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public rg2(bq r3, boolean r4) {
        super(r3);
        if (r4 == true) goto L5;
    L7:
        boolean r5 = false;
    L8:
        this.l = r5;
        this.m = new bu4();
        this.n = new zt4();
        cu4 r6 = r3.g();
        if (r6 == null) goto L12;
        this.o = new pg2(r6, null, null);
        this.s = true;
        return;
    L12:
        this.o = new pg2(new qg2(r3.h()), bu4.p, pg2.h);
        return;
    L5:
        if (r3.i() == false) goto L7;
        r5 = true;
        goto L8
    }

    @Override // defpackage.be5
    public final void A(cu4 r13) {
        if (this.r == false) goto L8;
        pg2 r2 = this.o;
        this.o = new pg2(r13, r2.f, r2.g);
        og2 r1 = this.p;
        if (r1 == null) goto L34;
        E(r1.t);
    L34:
        mt2 r3 = null;
    L35:
        this.s = true;
        this.r = true;
        m(this.o);
        if (r3 == null) goto L39;
        og2 r0 = this.p;
        r0.getClass();
        r0.a(r3);
        return;
    L39:
        return;
    L8:
        if (r13.p() == true) goto L10;
        bu4 r4 = this.m;
        r13.n(0, r4);
        long r5 = r4.k;
        Object r7 = r4.a;
        og2 r6 = this.p;
        if (r6 == null) goto L19;
        long r8 = r6.o;
        pg2 r10 = this.o;
        Object r9 = r6.n.a;
        zt4 r11 = this.n;
        r10.g(r9, r11);
        long r12 = r11.e + r8;
        this.o.m(0, r4, 0);
        if (r12 == r4.k) goto L19;
        long r14 = r12;
    L20:
        zt4 r15 = this.n;
        Pair r16 = r13.i(this.m, r15, 0, r14);
        Object r17 = r16.first;
        long r18 = ((Long) r16.second).longValue();
        if (this.s == false) goto L23;
        pg2 r19 = this.o;
        pg2 r20 = new pg2(r13, r19.f, r19.g);
    L24:
        this.o = r20;
        og2 r21 = this.p;
        if (r21 == null) goto L34;
        if (E(r18) == false) goto L34;
        mt2 r22 = r21.n;
        Object r23 = r22.a;
        if (this.o.g != null) goto L31;
    L33:
        r3 = r22.a(r23);
        goto L35
    L31:
        if (r23.equals(pg2.h) == false) goto L33;
        r23 = this.o.g;
        goto L33
    L23:
        r20 = new pg2(r13, r7, r17);
    L19:
        r14 = r5;
        goto L20
    L10:
        if (this.s == false) goto L12;
        pg2 r24 = this.o;
        pg2 r25 = new pg2(r13, r24.f, r24.g);
    L13:
        this.o = r25;
        goto L34
    L12:
        r25 = new pg2(r13, bu4.p, pg2.h);
        goto L13
    }

    @Override // defpackage.be5
    public final void C() {
        if (this.l == true) goto L6;
        this.q = true;
        B();
        return;
    }

    public final og2 D(mt2 r2, n9 r3, long r4) {
        og2 r0 = new og2(r2, r3, r4);
        if (r0.q != null) goto L5;
        boolean r5 = true;
    L6:
        rr2.w(r5);
        r0.q = this.k;
        if (this.r == false) goto L15;
        Object r6 = r2.a;
        if (this.o.g != null) goto L11;
    L13:
        r0.a(r2.a(r6));
        return r0;
    L11:
        if (r6.equals(pg2.h) == false) goto L13;
        r6 = this.o.g;
        goto L13
    L15:
        this.p = r0;
        if (this.q == true) goto L18;
        this.q = true;
        B();
    L18:
        return r0;
    L5:
        r5 = false;
        goto L6
    }

    public final boolean E(long r6) {
        og2 r0 = this.p;
        int r1 = this.o.b(r0.n.a);
        if (r1 != (-1)) goto L5;
        return false;
    L5:
        pg2 r2 = this.o;
        zt4 r5 = this.n;
        r2.f(r1, r5, false);
        long r3 = r5.d;
        if (r3 != (-9223372036854775807L)) goto L8;
    L10:
        r0.t = r6;
        return true;
    L8:
        if (r6 < r3) goto L10;
        r6 = Math.max(0, r3 - 1);
        goto L10
    }

    @Override // defpackage.be5, defpackage.bq
    public final boolean a(gn2 r1) {
        return this.k.a(r1);
    }

    @Override // defpackage.be5, defpackage.bq
    public final /* bridge */ /* synthetic */ no2 b(mt2 r1, n9 r2, long r3) {
        return D(r1, r2, r3);
    }

    @Override // defpackage.be5, defpackage.bq
    public final void n(no2 r3) {
        og2 r0 = (og2) r3;
        if (r0.r == null) goto L6;
        bq r1 = r0.q;
        r1.getClass();
        r1.n(r0.r);
    L6:
        if (r3 != this.p) goto L9;
        this.p = null;
        return;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // defpackage.be5, defpackage.bq
    public final void s(gn2 r5) {
        if (this.s == false) goto L9;
        pg2 r0 = this.o;
        cu4 r1 = r0.e;
        if ((r1 instanceof du4) == false) goto L7;
        du4 r2 = new du4(((du4) r1).e, r5);
    L8:
        this.o = new pg2(r2, r0.f, r0.g);
    L10:
        this.k.s(r5);
        return;
    L7:
        r2 = new du4(r1, r5);
        goto L8
    L9:
        this.o = new pg2(new qg2(r5), bu4.p, pg2.h);
        goto L10
    }

    @Override // defpackage.be5
    public final mt2 z(mt2 r2) {
        Object r0 = r2.a;
        Object r1 = this.o.g;
        if (r1 == null) goto L8;
        if (r1.equals(r0) == false) goto L8;
        r0 = pg2.h;
    L8:
        return r2.a(r0);
    }
}
