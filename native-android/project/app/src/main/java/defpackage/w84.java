package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w84 implements tx {
    public final kt0 n;
    public final long o;
    public final int p;
    public long q;
    public int r;

    public w84(kt0 kt0Var, long j, int i, long j2, int i2) {
        this.n = kt0Var;
        this.o = j;
        this.p = i;
        this.q = j2;
        this.r = i2;
    }

    public final float a() {
        long j = this.o;
        if (j != -1 && j != 0) {
            return f35.U(this.q, j);
        }
        int i = this.p;
        if (i != 0) {
            return f35.U(this.r, i);
        }
        return -1.0f;
    }

    @Override // defpackage.tx
    public final void b(long j, long j2, long j3) {
        long j4 = this.q + j3;
        this.q = j4;
        this.n.b(this.o, j4, a());
    }
}
