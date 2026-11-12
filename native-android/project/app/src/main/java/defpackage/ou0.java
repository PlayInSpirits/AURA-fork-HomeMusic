package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 implements if1 {
    public final /* synthetic */ jx3 n;
    public final /* synthetic */ pu0 o;
    public final /* synthetic */ zg5 p;

    public ou0(jx3 r1, pu0 r2, zg5 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        rx4 r5 = (rx4) r4;
        pu0 r0 = (pu0) r5;
        if (((qb) ((ra) j51.P(this.o)).getDragAndDropManager()).b.contains(r0) == false) goto L9;
        if (ud3.a(r0, su3.u(this.p)) == false) goto L9;
        this.n.n = r5;
        return qx4.p;
    L9:
        return qx4.n;
    }
}
