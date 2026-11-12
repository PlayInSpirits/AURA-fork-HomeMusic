package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uu implements su {
    public int n;
    public int o;
    public int p;
    public int q;
    public Object r;

    public long a() {
        int r0 = this.p;
        if (r0 == 0) goto L6;
        long[] r1 = (long[]) this.r;
        int r2 = this.n;
        long r3 = r1[r2];
        this.n = this.q & (r2 + 1);
        this.p = r0 - 1;
        return r3;
    L6:
        tb4.k();
        return 0;
    }

    @Override // defpackage.su
    public int f() {
        return -1;
    }

    @Override // defpackage.su
    public int k() {
        return this.n;
    }

    @Override // defpackage.su
    public int l() {
        be3 r0 = (be3) this.r;
        int r1 = this.o;
        if (r1 != 8) goto L7;
        return r0.A();
    L7:
        if (r1 == 16) goto L9;
        int r2 = this.p;
        this.p = r2 + 1;
        if ((r2 % 2) != 0) goto L15;
        int r3 = r0.A();
        this.q = r3;
        return (r3 & 240) >> 4;
    L15:
        return this.q & 15;
    L9:
        return r0.H();
    }
}
