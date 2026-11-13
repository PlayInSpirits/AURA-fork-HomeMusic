package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vw1 extends v0 {
    public final yw1 q;

    public vw1(yw1 yw1Var, int i) {
        super(yw1Var.size(), i);
        this.q = yw1Var;
    }

    @Override // defpackage.v0
    public final Object a(int i) {
        return this.q.get(i);
    }
}
