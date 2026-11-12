package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og2 implements no2, mo2 {
    public final mt2 n;
    public final long o;
    public final n9 p;
    public bq q;
    public no2 r;
    public mo2 s;
    public long t;

    public og2(mt2 r1, n9 r2, long r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
        this.t = -9223372036854775807L;
    }

    public final void a(mt2 r5) {
        long r0 = this.t;
        if (r0 != (-9223372036854775807L)) goto L6;
        r0 = this.o;
    L6:
        bq r2 = this.q;
        r2.getClass();
        no2 r6 = r2.b(r5, this.p, r0);
        this.r = r6;
        if (this.s == null) goto L10;
        r6.m(this, r0);
        return;
    }

    @Override // defpackage.mo2
    public final void b(no2 r2) {
        mo2 r3 = this.s;
        String r0 = f35.a;
        r3.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] r7, boolean[] r8, q44[] r9, boolean[] r10, long r11) {
        long r0 = this.t;
        if (r0 != (-9223372036854775807L)) goto L5;
    L7:
        this.t = -9223372036854775807L;
        no2 r6 = this.r;
        String r1 = f35.a;
        return r6.c(r7, r8, r9, r10, r11);
    L5:
        if (r11 != this.o) goto L7;
        r11 = r0;
        goto L7
    }

    @Override // defpackage.da4
    public final long d() {
        no2 r2 = this.r;
        String r0 = f35.a;
        return r2.d();
    }

    @Override // defpackage.no2
    public final long e(long r2, n84 r4) {
        no2 r1 = this.r;
        String r0 = f35.a;
        return r1.e(r2, r4);
    }

    @Override // defpackage.da4
    public final boolean f() {
        no2 r0 = this.r;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.f() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.no2
    public final void h() {
        no2 r0 = this.r;
        if (r0 == null) goto L6;
        r0.h();
        return;
    L6:
        bq r1 = this.q;
        if (r1 == null) goto L10;
        r1.j();
        return;
    }

    @Override // defpackage.no2
    public final long i(long r2) {
        no2 r1 = this.r;
        String r0 = f35.a;
        return r1.i(r2);
    }

    @Override // defpackage.ca4
    public final void j(da4 r2) {
        no2 r3 = (no2) r2;
        mo2 r4 = this.s;
        String r0 = f35.a;
        r4.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean r2, long r3) {
        no2 r1 = this.r;
        String r0 = f35.a;
        r1.k(r2, r3);
    }

    @Override // defpackage.no2
    public final long l() {
        no2 r2 = this.r;
        String r0 = f35.a;
        return r2.l();
    }

    @Override // defpackage.no2
    public final void m(mo2 r3, long r4) {
        this.s = r3;
        no2 r5 = this.r;
        if (r5 == null) goto L10;
        long r6 = this.t;
        if (r6 != (-9223372036854775807L)) goto L8;
        r6 = this.o;
    L8:
        r5.m(this, r6);
        return;
    }

    @Override // defpackage.no2
    public final tv4 n() {
        no2 r1 = this.r;
        String r0 = f35.a;
        return r1.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r1) {
        no2 r0 = this.r;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.o(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.da4
    public final long q() {
        no2 r2 = this.r;
        String r0 = f35.a;
        return r2.q();
    }

    @Override // defpackage.da4
    public final void u(long r2) {
        no2 r1 = this.r;
        String r0 = f35.a;
        r1.u(r2);
    }
}
