package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx1 extends yw1 {
    public final /* synthetic */ gx1 p;

    public xx1(gx1 gx1Var) {
        this.p = gx1Var;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return this.p.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        gx1 gx1Var = this.p;
        switch (gx1Var.q) {
            case 0:
                q73 q73Var = ((my3) gx1Var.r).r;
                rr2.q(i, q73Var.c);
                return new p73(q73Var, i);
            default:
                q73 q73Var2 = ((my3) gx1Var.r).r;
                rr2.q(i, q73Var2.c);
                return q73Var2.a[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }
}
