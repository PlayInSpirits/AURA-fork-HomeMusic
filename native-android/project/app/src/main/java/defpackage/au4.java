package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class au4 extends cu4 {
    public final yw1 e;
    public final yw1 f;
    public final int[] g;
    public final int[] h;

    public au4(gy3 r4, gy3 r5, int[] r6) {
        int r2 = 0;
        if (r4.q != r6.length) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = new int[r6.length];
    L8:
        if (r2 >= r6.length) goto L10;
        this.h[r6[r2]] = r2;
        r2 = r2 + 1;
        goto L8
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.cu4
    public final int a(boolean r2) {
        if (p() == false) goto L7;
        return -1;
    L7:
        if (r2 == true) goto L9;
        return 0;
    L9:
        return this.g[0];
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final int c(boolean r2) {
        if (p() == false) goto L6;
        return -1;
    L6:
        yw1 r0 = this.e;
        if (r2 == false) goto L11;
        return this.g[r0.size() - 1];
    L11:
        return r0.size() - 1;
    }

    @Override // defpackage.cu4
    public final int e(int r3, int r4, boolean r5) {
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r3 == c(r5)) goto L8;
        if (r5 == false) goto L17;
        int r6 = this.h[r3] + 1;
        return this.g[r6];
    L17:
        return r3 + 1;
    L8:
        if (r4 == 2) goto L10;
        return -1;
    L10:
        return a(r5);
    }

    @Override // defpackage.cu4
    public final zt4 f(int r11, zt4 r12, boolean r13) {
        zt4 r10 = (zt4) this.f.get(r11);
        r12.i(r10.a, r10.b, r10.c, r10.d, r10.e, r10.g, r10.f);
        return r12;
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.cu4
    public final int k(int r3, int r4, boolean r5) {
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r3 == a(r5)) goto L8;
        if (r5 == false) goto L17;
        int r6 = this.h[r3] - 1;
        return this.g[r6];
    L17:
        return r3 - 1;
    L8:
        if (r4 == 2) goto L10;
        return -1;
    L10:
        return c(r5);
    }

    @Override // defpackage.cu4
    public final Object l(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final bu4 m(int r25, bu4 r26, long r27) {
        bu4 r0 = (bu4) this.e.get(r25);
        r26.b(r0.a, r0.b, r0.c, r0.d, r0.e, r0.f, r0.g, r0.h, r0.i, r0.k, r0.l, r0.m, r0.n, r0.o);
        r26.j = r0.j;
        return r26;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.e.size();
    }
}
