package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y84 extends w34 {
    public final x84 u;
    public final lx v;
    public final w84 w;
    public final byte[] x;
    public final ux y;

    public y84(x84 r2, lx r3, w84 r4, byte[] r5) {
        this.u = r2;
        this.v = r3;
        this.w = r4;
        this.x = r5;
        this.y = new ux(r3, r2.o, r5, r4);
    }

    @Override // defpackage.w34
    public final void b() {
        this.y.j = true;
    }

    @Override // defpackage.w34
    public final Object c() {
        this.y.a();
        w84 r7 = this.w;
        if (r7 == null) goto L7;
        r7.r++;
        r7.n.b(r7.o, r7.q, r7.a());
        return null;
    L7:
        return null;
    }
}
