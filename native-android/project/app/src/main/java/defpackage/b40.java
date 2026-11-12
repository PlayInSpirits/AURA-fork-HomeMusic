package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 implements no2, mo2 {
    public final no2 n;
    public mo2 o;
    public a40[] p;
    public long q;
    public long r;
    public long s;
    public long t;
    public ClippingMediaSource$IllegalClippingException u;

    public b40(no2 r3, boolean r4, long r5, long r7) {
        this.n = r3;
        this.p = new a40[0];
        if (r4 == false) goto L5;
        long r6 = r5;
    L6:
        this.q = r6;
        this.r = -9223372036854775807L;
        this.s = r5;
        this.t = r7;
        return;
    L5:
        r6 = -9223372036854775807L;
        goto L6
    }

    public final boolean a() {
        if (this.q == (-9223372036854775807L)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.mo2
    public final void b(no2 r1) {
        if (this.u == null) goto L5;
        return;
    L5:
        mo2 r2 = this.o;
        r2.getClass();
        r2.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] r18, boolean[] r19, q44[] r20, boolean[] r21, long r22) {
        this.p = new a40[r20.length];
        q44[] r4 = new q44[r20.length];
        int r1 = 0;
    L4:
        if (r1 >= r20.length) goto L10;
        a40[] r2 = this.p;
        a40 r3 = (a40) r20[r1];
        r2[r1] = r3;
        if (r3 == null) goto L8;
        q44 r10 = r3.n;
    L9:
        r4[r1] = r10;
        r1 = r1 + 1;
        goto L4
    L8:
        r10 = null;
        goto L9
    L10:
        long r11 = this.n.c(r18, r19, r4, r21, r22);
        long r13 = this.t;
        long r9 = Math.max(r11, r22);
        if (r13 == Long.MIN_VALUE) goto L14;
        r9 = Math.min(r9, r13);
    L14:
        if (a() == true) goto L16;
    L28:
        long r5 = -9223372036854775807L;
    L29:
        this.q = r5;
        int r6 = 0;
    L31:
        if (r6 >= r20.length) goto L41;
        q44 r7 = r4[r6];
        a40[] r8 = this.p;
        if (r7 != null) goto L35;
        r8[r6] = null;
    L40:
        r20[r6] = r8[r6];
        r6 = r6 + 1;
        goto L31
    L35:
        a40 r12 = r8[r6];
        if (r12 != null) goto L38;
    L39:
        r8[r6] = new a40(this, r7);
        goto L40
    L38:
        if (r12.n == r7) goto L40;
    L41:
        return r9;
    L16:
        if (r11 >= r22) goto L19;
    L26:
        r5 = r9;
        goto L29
    L19:
        if (r11 == 0) goto L28;
        int r14 = r18.length;
        int r15 = 0;
    L21:
        if (r15 >= r14) goto L28;
        t41 r16 = r18[r15];
        if (r16 == null) goto L27;
        tb1 r17 = r16.m();
        if (lw2.a(r17.n, r17.k) == false) goto L26;
    L27:
        r15 = r15 + 1;
        goto L21
    }

    @Override // defpackage.da4
    public final long d() {
        long r0 = this.n.d();
        if (r0 == Long.MIN_VALUE) goto L10;
        long r4 = this.t;
        if (r4 != Long.MIN_VALUE) goto L7;
    L9:
        return r0;
    L7:
        if (r0 < r4) goto L9;
    L10:
        return Long.MIN_VALUE;
    }

    @Override // defpackage.no2
    public final long e(long r10, n84 r12) {
        long r0 = this.s;
        if (r10 != r0) goto L5;
        return r0;
    L5:
        long r1 = f35.k(r12.a, 0, r10 - r0);
        long r2 = r12.b;
        long r4 = this.t;
        if (r4 != Long.MIN_VALUE) goto L9;
        long r5 = Long.MAX_VALUE;
    L10:
        long r3 = f35.k(r2, 0, r5);
        if (r1 == r12.a) goto L13;
    L15:
        r12 = new n84(r1, r3);
    L17:
        return this.n.e(r10, r12);
    L13:
        if (r3 != r12.b) goto L15;
    L9:
        r5 = r4 - r10;
        goto L10
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.n.f();
    }

    @Override // defpackage.no2
    public final void h() {
        ClippingMediaSource$IllegalClippingException r0 = this.u;
        if (r0 != null) goto L6;
        this.n.h();
        return;
    L6:
        throw r0;
    }

    @Override // defpackage.no2
    public final long i(long r6) {
        this.q = -9223372036854775807L;
        a40[] r0 = this.p;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        a40 r4 = r0[r3];
        if (r4 == null) goto L7;
        r4.o = false;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        long r7 = this.n.i(r6);
        long r2 = this.s;
        long r5 = this.t;
        long r8 = Math.max(r7, r2);
        if (r5 != Long.MIN_VALUE) goto L11;
        return r8;
    L11:
        return Math.min(r8, r5);
    }

    @Override // defpackage.ca4
    public final void j(da4 r1) {
        no2 r2 = (no2) r1;
        mo2 r3 = this.o;
        r3.getClass();
        r3.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean r1, long r2) {
        this.n.k(r1, r2);
    }

    @Override // defpackage.no2
    public final long l() {
        if (a() == false) goto L8;
        long r3 = this.q;
        this.q = -9223372036854775807L;
        this.r = r3;
        long r5 = l();
        if (r5 == (-9223372036854775807L)) goto L7;
        return r5;
    L7:
        return r3;
    L8:
        long r4 = this.n.l();
        if (r4 == (-9223372036854775807L)) goto L16;
        long r6 = this.s;
        long r7 = this.t;
        long r8 = Math.max(r4, r6);
        if (r7 == Long.MIN_VALUE) goto L15;
        r8 = Math.min(r8, r7);
    L15:
        if (r8 == this.r) goto L16;
        this.r = r8;
        return r8;
    L16:
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 r1, long r2) {
        this.o = r1;
        this.n.m(this, r2);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.n.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r1) {
        return this.n.o(r1);
    }

    @Override // defpackage.da4
    public final long q() {
        long r0 = this.n.q();
        if (r0 == Long.MIN_VALUE) goto L10;
        long r4 = this.t;
        if (r4 != Long.MIN_VALUE) goto L7;
    L9:
        return r0;
    L7:
        if (r0 < r4) goto L9;
    L10:
        return Long.MIN_VALUE;
    }

    @Override // defpackage.da4
    public final void u(long r1) {
        this.n.u(r1);
    }
}
