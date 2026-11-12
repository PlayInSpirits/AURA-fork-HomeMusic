package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ru implements l83, g45 {
    public long n;
    public long o;
    public Object p;
    public Object q;

    public ru(int r3, long r4) {
        if (((m9) this.p) != null) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        this.n = r4;
        this.o = r4 + ((long) r3);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.g45
    public boolean a() {
        return true;
    }

    @Override // defpackage.l83
    public long b(l51 r7) {
        long r0 = this.o;
        if (r0 < 0) goto L6;
        long r1 = -(r0 + 2);
        this.o = -1;
        return r1;
    L6:
        return -1;
    }

    public long c(long r9) {
        long r0 = this.o;
        if ((r9 + r0) > 0) goto L5;
        return 0;
    L5:
        long r10 = r9 + r0;
        long r1 = this.n;
        long r2 = r10 / r1;
        if (((hz3) this.q) == hz3.n) goto L13;
        if ((r2 % 2) == 0) goto L13;
        return ((r2 + 1) * r1) - r10;
    L13:
        return r10 - (r2 * r1);
    }

    @Override // defpackage.g45
    public ce d(long r8, ce r10, ce r11, ce r12) {
        x7 r0 = (x7) this.p;
        long r9 = c(r8);
        ce r13 = f(r8, r10, r12, r11);
        return ((ss0) r0.p).d(r9, r10, r11, r13);
    }

    @Override // defpackage.l83
    public m84 e() {
        if (this.n == (-1)) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        return new bo((v71) this.p, this.n, 1);
    L5:
        r0 = false;
        goto L6
    }

    public ce f(long r11, ce r13, ce r14, ce r15) {
        long r0 = this.o;
        long r12 = r11 + r0;
        long r2 = this.n;
        if (r12 <= r2) goto L7;
        ss0 r4 = (ss0) ((x7) this.p).p;
        return r4.d(r2 - r0, r13, r15, r14);
    L7:
        return r14;
    }

    @Override // defpackage.l83
    public void g(long r3) {
        long[] r0 = (long[]) ((rm3) this.q).n;
        this.o = r0[f35.f(r0, r3, true)];
    }

    @Override // defpackage.g45
    public ce k(long r8, ce r10, ce r11, ce r12) {
        x7 r0 = (x7) this.p;
        long r9 = c(r8);
        ce r13 = f(r8, r10, r12, r11);
        return ((ss0) r0.p).k(r9, r10, r11, r13);
    }

    @Override // defpackage.g45
    public long m(ce r1, ce r2, ce r3) {
        return Long.MAX_VALUE;
    }

    public ru(String r1, byte[] r2, long r3, long r5) {
        this.p = r1;
        this.q = r2;
        this.n = r3;
        this.o = r5;
    }
}
