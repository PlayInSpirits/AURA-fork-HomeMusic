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
        int i = this.p;
        if (i == 0) {
            tb4.k();
            return 0L;
        }
        long[] jArr = (long[]) this.r;
        int i2 = this.n;
        long j = jArr[i2];
        this.n = this.q & (i2 + 1);
        this.p = i - 1;
        return j;
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
        be3 be3Var = (be3) this.r;
        int i = this.o;
        if (i == 8) {
            return be3Var.A();
        }
        if (i == 16) {
            return be3Var.H();
        }
        int i2 = this.p;
        this.p = i2 + 1;
        if (i2 % 2 != 0) {
            return this.q & 15;
        }
        int iA = be3Var.A();
        this.q = iA;
        return (iA & 240) >> 4;
    }
}
