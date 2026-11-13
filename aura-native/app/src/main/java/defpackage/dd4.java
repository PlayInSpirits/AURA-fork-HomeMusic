package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dd4 extends n2 {
    public long a;
    public cz b;

    @Override // defpackage.n2
    public final boolean a(m2 m2Var) {
        cd4 cd4Var = (cd4) m2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = cd4Var.v;
        if (j < cd4Var.w) {
            cd4Var.w = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.n2
    public final vd0[] b(m2 m2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((cd4) m2Var).v(j);
    }
}
