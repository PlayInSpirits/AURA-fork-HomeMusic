package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kn4 {
    public final wo0 a;
    public o72 b;
    public final hn4 c;
    public final hn4 d;
    public final hn4 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [hn4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hn4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hn4] */
    public kn4(wo0 r2) {
        this.a = r2;
        final int r0 = 0;
        this.c = new hn4(this, r0);
        final int r1 = 1;
        this.d = new hn4(this, r1);
        final int r3 = 2;
        this.e = new hn4(this, r3);
    }

    public final o72 a() {
        o72 r0 = this.b;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.n("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
