package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x60 extends a32 {
    public final Object j0(wd0 r3) {
    L2:
        Object r0 = H();
        if ((r0 instanceof mx1) == false) goto L5;
        if (d0(r0) < 0) goto L2;
        x22 r1 = new x22(ya4.x(r3), this);
        r1.u();
        int r2 = 2;
        r1.x(new wy(r2, gb.K(this, true, new w14(r1))));
        return r1.q();
    L5:
        if ((r0 instanceof a70) == true) goto L8;
        return zz1.M(r0);
    L8:
        throw ((a70) r0).a;
    }
}
