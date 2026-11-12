package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w84 implements tx {
    public final kt0 n;
    public final long o;
    public final int p;
    public long q;
    public int r;

    public w84(kt0 r1, long r2, int r4, long r5, int r7) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r5;
        this.r = r7;
    }

    public final float a() {
        long r2 = this.o;
        if (r2 != (-1)) goto L5;
    L8:
        int r0 = this.p;
        if (r0 != 0) goto L11;
        return -1.0f;
    L11:
        return f35.U(this.r, r0);
    L5:
        if (r2 == 0) goto L8;
        return f35.U(this.q, r2);
    }

    @Override // defpackage.tx
    public final void b(long r7, long r9, long r11) {
        long r3 = this.q + r11;
        this.q = r3;
        long r1 = this.o;
        float r5 = a();
        this.n.b(r1, r3, r5);
    }
}
