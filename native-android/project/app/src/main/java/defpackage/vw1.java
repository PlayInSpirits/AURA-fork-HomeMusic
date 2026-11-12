package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends v0 {
    public final yw1 q;

    public vw1(yw1 r2, int r3) {
        super(r2.size(), r3);
        this.q = r2;
    }

    @Override // defpackage.v0
    public final Object a(int r1) {
        return this.q.get(r1);
    }
}
