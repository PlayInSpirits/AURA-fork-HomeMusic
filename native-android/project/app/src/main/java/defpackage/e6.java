package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 extends vq {
    public final cp g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final yw1 o;
    public final vp4 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public nm1 u;

    public e6(sv4 r2, int[] r3, cp r4, yw1 r5) {
        super(0, r2, r3);
        this.g = r4;
        this.h = 10000000;
        this.i = 25000000;
        this.j = 25000000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = yw1.k(r5);
        this.p = vp4.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void u(ArrayList r7, long[] r8) {
        long r0 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= r8.length) goto L7;
        r0 = r0 + r8[r3];
        r3 = r3 + 1;
    L7:
        if (r2 >= r7.size()) goto L13;
        uw1 r4 = (uw1) r7.get(r2);
        if (r4 == null) goto L12;
        r4.c(new d6(r0, r8[r2]));
    L12:
        r2 = r2 + 1;
        goto L7
    }

    public static long w(List r7) {
        if (r7.isEmpty() == true) goto L11;
        nm1 r8 = (nm1) te5.w(r7);
        long r3 = r8.g;
        if (r3 == (-9223372036854775807L)) goto L11;
        long r5 = r8.h;
        if (r5 == (-9223372036854775807L)) goto L11;
        return r5 - r3;
    L11:
        return -9223372036854775807L;
    }

    @Override // defpackage.t41
    public final void b(long r11, long r13, long r15, List r17, xj2[] r18) {
        this.p.getClass();
        long r0 = SystemClock.elapsedRealtime();
        int r12 = this.r;
        int r3 = 0;
        if (r12 < r18.length) goto L5;
    L7:
        int r14 = r18.length;
        int r2 = 0;
    L8:
        if (r2 >= r14) goto L13;
        xj2 r4 = r18[r2];
        if (r4.next() == true) goto L11;
        r2 = r2 + 1;
        goto L8
    L11:
        long r5 = r4.n() - r4.j();
    L14:
        int r16 = this.s;
        if (r16 != 0) goto L18;
        this.s = 1;
        this.r = v(r0);
        return;
    L18:
        int r19 = this.r;
        boolean r6 = r17.isEmpty();
        tb1[] r7 = this.d;
        if (r6 == false) goto L21;
    L20:
        r3 = -1;
    L28:
        if (r3 == (-1)) goto L30;
        r16 = ((nm1) te5.w(r17)).e;
        r19 = r3;
    L30:
        int r8 = v(r0);
        if (r8 != r19) goto L33;
    L51:
        if (r8 == r19) goto L54;
        r16 = 3;
    L54:
        this.s = r16;
        this.r = r8;
        return;
    L33:
        if (a(r19, r0) == true) goto L51;
        tb1 r1 = r7[r19];
        tb1 r9 = r7[r8];
        long r10 = this.h;
        if (r15 != (-9223372036854775807L)) goto L38;
    L42:
        int r20 = r9.j;
        int r21 = r1.j;
        if (r20 > r21) goto L45;
    L47:
        if (r20 >= r21) goto L51;
        if (r13 < this.i) goto L51;
    L50:
        r8 = r19;
        goto L51
    L45:
        if (r13 >= r10) goto L47;
    L38:
        if (r5 == (-9223372036854775807L)) goto L40;
        long r22 = r15 - r5;
    L41:
        r10 = Math.min((long) (r22 * this.n), r10);
        goto L42
    L40:
        r22 = r15;
        goto L41
    L21:
        tb1 r23 = ((nm1) te5.w(r17)).d;
    L23:
        if (r3 >= this.b) goto L20;
        if (r7[r3] == r23) goto L28;
        r3 = r3 + 1;
        goto L23
    L13:
        r5 = w(r17);
        goto L14
    L5:
        if (r18[r12].next() == false) goto L7;
        xj2 r110 = r18[this.r];
        r5 = r110.n() - r110.j();
        goto L14
    }

    @Override // defpackage.t41
    public final int d() {
        return this.r;
    }

    @Override // defpackage.vq, defpackage.t41
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.vq, defpackage.t41
    public final int j(long r11, List r13) {
        this.p.getClass();
        long r0 = SystemClock.elapsedRealtime();
        long r2 = this.t;
        if (r2 != (-9223372036854775807L)) goto L5;
    L13:
        this.t = r0;
        if (r13.isEmpty() == false) goto L16;
        nm1 r3 = null;
    L17:
        this.u = r3;
        int r4 = 0;
        if (r13.isEmpty() == false) goto L20;
        return 0;
    L20:
        int r5 = r13.size();
        long r6 = f35.E(((nm1) r13.get(r5 - 1)).g - r11, this.q);
        long r7 = this.j;
        if (r6 < r7) goto L41;
        w(r13);
        tb1 r1 = this.d[v(r0)];
    L24:
        if (r4 >= r5) goto L41;
        nm1 r8 = (nm1) r13.get(r4);
        tb1 r9 = r8.d;
        if (f35.E(r8.g - r11, this.q) < r7) goto L40;
        if (r9.j >= r1.j) goto L40;
        int r10 = r9.v;
        if (r10 == (-1)) goto L40;
        if (r10 > this.l) goto L40;
        int r12 = r9.u;
        if (r12 == (-1)) goto L40;
        if (r12 > this.k) goto L40;
        if (r10 >= r1.v) goto L40;
        return r4;
    L40:
        r4 = r4 + 1;
    L41:
        return r5;
    L16:
        r3 = (nm1) te5.w(r13);
        goto L17
    L5:
        if ((r0 - r2) >= 1000) goto L13;
        if (r13.isEmpty() == true) goto L12;
        if (((nm1) te5.w(r13)).equals(this.u) == false) goto L13;
    L12:
        return r13.size();
    }

    @Override // defpackage.vq, defpackage.t41
    public final void k() {
        this.u = null;
    }

    @Override // defpackage.t41
    public final int n() {
        return this.s;
    }

    @Override // defpackage.vq, defpackage.t41
    public final void p(float r1) {
        this.q = r1;
    }

    @Override // defpackage.t41
    public final Object q() {
        return null;
    }

    public final int v(long r9) {
        long r0 = (long) (((long) (this.g.J() * this.m)) / this.q);
        yw1 r2 = this.o;
        if (r2.isEmpty() == true) goto L12;
        int r4 = 1;
    L7:
        if (r4 >= (r2.size() - 1)) goto L11;
        if (((d6) r2.get(r4)).a >= r0) goto L11;
        r4 = r4 + 1;
    L11:
        d6 r3 = (d6) r2.get(r4 - 1);
        d6 r5 = (d6) r2.get(r4);
        long r6 = r3.a;
        float r1 = (r0 - r6) / (r5.a - r6);
        long r7 = r3.b;
        r0 = ((long) (r1 * (r5.b - r7))) + r7;
    L12:
        int r8 = 0;
        int r10 = 0;
    L14:
        if (r8 >= this.b) goto L24;
        if (r9 == Long.MIN_VALUE) goto L20;
        if (a(r8, r9) == false) goto L20;
    L23:
        r8 = r8 + 1;
    L20:
        if (this.d[r8].j <= r0) goto L21;
        r10 = r8;
        goto L23
    L21:
        return r8;
    L24:
        return r10;
    }
}
