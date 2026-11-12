package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class sx4 extends gx2 {
    public final q82 a;

    public sx4(q82 q82Var) {
        this.a = q82Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        tx4 tx4Var = new tx4();
        tx4Var.B = this.a;
        return tx4Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        ((tx4) cx2Var).B = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx4) && h12.c(this.a, ((sx4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
