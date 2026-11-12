package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pw4 implements no2, mo2 {
    public no2 n;
    public bq o;
    public final mt2 p;
    public final n9 q;
    public mo2 r;
    public long s;
    public boolean t;
    public Integer u;
    public t41[] v;
    public boolean[] w;
    public ow4[] x;
    public final /* synthetic */ qw4 y;

    public pw4(qw4 r1, no2 r2, kr3 r3, mt2 r4, n9 r5) {
        r3.getClass();
        r5.getClass();
        this.y = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
        this.x = new ow4[0];
    }

    @Override // defpackage.mo2
    public final void b(no2 r11) {
        if (this.t == true) goto L5;
    L34:
        mo2 r12 = this.r;
        if (r12 == null) goto L42;
        r12.b(this);
        return;
    L42:
        return;
    L5:
        if (r11.equals(this.n) == false) goto L34;
        int r13 = 0;
        this.t = false;
        t41[] r0 = this.v;
        if (r0 == null) goto L30;
        boolean[] r1 = this.w;
        if (r1 == null) goto L30;
        int r2 = Math.min(r0.length, this.x.length);
        if (r2 == 0) goto L30;
        q44[] r6 = new q44[r2];
        boolean[] r7 = new boolean[r2];
        j02 r3 = gb.g0(0, r2);
        r3.getClass();
        if (r3.isEmpty() == false) goto L18;
        Object[] r4 = ti.e0(r0, 0, 0);
    L19:
        t41[] r5 = (t41[]) r4;
        j02 r8 = gb.g0(0, r2);
        r8.getClass();
        if (r8.isEmpty() == false) goto L23;
        boolean[] r9 = new boolean[0];
    L22:
        boolean[] r10 = r9;
        this.n.c(r5, r10, r6, r7, 0);
    L25:
        if (r13 >= r2) goto L30;
        ow4 r14 = this.x[r13];
        if (r14 == null) goto L29;
        r14.n = r6[r13];
    L29:
        r13 = r13 + 1;
        goto L25
    L23:
        int r15 = r8.n;
        int r16 = r8.o + 1;
        ji2.u(r16, r1.length);
        r9 = Arrays.copyOfRange(r1, r15, r16);
        r9.getClass();
        goto L22
    L18:
        r4 = ti.e0(r0, r3.n, r3.o + 1);
    L30:
        mo2 r17 = this.r;
        if (r17 == null) goto L41;
        r17.j(this);
        return;
    }

    @Override // defpackage.no2
    public final long c(t41[] r12, boolean[] r13, q44[] r14, boolean[] r15, long r16) {
        r12.getClass();
        r13.getClass();
        r14.getClass();
        this.v = r12;
        this.w = r13;
        q44[] r5 = new q44[r14.length];
        int r1 = r14.length;
        int r9 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        q44 r10 = null;
        if (r2 >= r1) goto L12;
        q44 r4 = r14[r2];
        int r6 = r3 + 1;
        if ((r4 instanceof ow4) == false) goto L8;
        ow4 r7 = (ow4) r4;
    L9:
        if (r7 == null) goto L11;
        r10 = r7.n;
    L11:
        r5[r3] = r10;
        r2 = r2 + 1;
        r3 = r6;
        goto L3
    L8:
        r7 = null;
        goto L9
    L12:
        long r17 = this.n.c(r12, r13, r5, r15, r16 - this.s);
        ow4[] r8 = new ow4[r14.length];
        int r11 = r14.length;
    L13:
        if (r9 >= r11) goto L27;
        q44 r18 = r5[r9];
        if (r18 != null) goto L17;
        r14[r9] = null;
    L26:
        r9 = r9 + 1;
        goto L13
    L17:
        q44 r19 = r14[r9];
        if ((r19 instanceof ow4) == false) goto L20;
        ow4 r20 = (ow4) r19;
    L21:
        if (r20 != null) goto L23;
    L25:
        ow4 r21 = new ow4(this, r18);
        r8[r9] = r21;
        r14[r9] = r21;
        goto L26
    L23:
        if (r20.n != r18) goto L25;
        r8[r9] = r20;
        goto L26
    L20:
        r20 = null;
        goto L21
    L27:
        this.x = r8;
        return r17 + this.s;
    }

    @Override // defpackage.da4
    public final long d() {
        if (this.t == true) goto L10;
        long r3 = this.n.d();
        if (r3 != Long.MIN_VALUE) goto L9;
        return Long.MIN_VALUE;
    L9:
        if (r3 == (-9223372036854775807L)) goto L10;
        return r3 + this.s;
    L10:
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final long e(long r1, n84 r3) {
        r3.getClass();
        return r1;
    }

    @Override // defpackage.da4
    public final boolean f() {
        if (this.t == false) goto L5;
        return true;
    L5:
        if (this.n.f() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.no2
    public final void h() {
        if (this.t == true) goto L6;
        this.n.h();
        return;
    }

    @Override // defpackage.no2
    public final long i(long r10) {
        if (r10 != 0) goto L9;
        if (this.s != 0) goto L9;
        return this.n.i(r10);
    L9:
        if (this.n.e(r10, n84.d) != 0) goto L11;
        qw4 r2 = this.y;
        gn2 r3 = r2.k;
        this.t = true;
        this.s = r10;
        ow4[] r4 = this.x;
        int r5 = r4.length;
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L18;
        ow4 r7 = r4[r6];
        if (r7 == null) goto L17;
        r7.n = null;
    L17:
        r6 = r6 + 1;
        goto L13
    L18:
        this.o.n(this.n);
        Integer r8 = this.u;
        if (r8 == null) goto L21;
        r2.y(Integer.valueOf(r8.intValue()));
    L21:
        long r9 = f35.i0(r10) / 1000;
        int r11 = (int) r9;
        Uri r12 = e03.j(r11, r3.a);
        tm2 r13 = r3.a();
        r13.b = r12;
        gn2 r14 = r13.a();
        kr3 r15 = r2.l.f(r14);
        int r16 = r2.o;
        r2.o = r16 + 1;
        this.u = Integer.valueOf(r16);
        this.o = r15;
        r2.x(Integer.valueOf(r16), r15);
        no2 r17 = r15.b(this.p, this.q, 0);
        this.n = r17;
        ((hr3) r17).m(this, 0);
        return r10;
    L11:
        return this.n.i(r10);
    }

    @Override // defpackage.ca4
    public final void j(da4 r1) {
        ((no2) r1).getClass();
        if (this.t == true) goto L8;
        mo2 r2 = this.r;
        if (r2 == null) goto L9;
        r2.j(this);
        return;
    L9:
        return;
    }

    @Override // defpackage.no2
    public final void k(boolean r4, long r5) {
        if (this.t == true) goto L6;
        this.n.k(r4, r5 - this.s);
        return;
    }

    @Override // defpackage.no2
    public final long l() {
        if (this.t == true) goto L7;
        long r3 = this.n.l();
        if (r3 == (-9223372036854775807L)) goto L7;
        return r3 + this.s;
    L7:
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 r1, long r2) {
        this.r = r1;
        this.n.m(this, r2);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 r0 = this.n.n();
        r0.getClass();
        return r0;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r6) {
        if (this.t == false) goto L6;
        return false;
    L6:
        od2 r0 = new od2();
        long r1 = r6.a;
        r0.b = r6.b;
        r0.c = r6.c;
        r0.a = r1 - this.s;
        return this.n.o(new pd2(r0));
    }

    @Override // defpackage.da4
    public final long q() {
        if (this.t == true) goto L5;
        long r0 = this.n.q();
        if (r0 != Long.MIN_VALUE) goto L10;
        return Long.MIN_VALUE;
    L10:
        if (r0 != (-9223372036854775807L)) goto L13;
        return -9223372036854775807L;
    L13:
        return r0 + this.s;
    L5:
        return this.s;
    }

    @Override // defpackage.da4
    public final void u(long r4) {
        if (this.t == true) goto L6;
        this.n.u(r4 - this.s);
        return;
    }
}
