package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld2 extends k03 {
    public final og5 l;
    public ba2 m;
    public md2 n;

    public ld2(og5 og5Var) {
        this.l = og5Var;
        if (og5Var.a == null) {
            og5Var.a = this;
        } else {
            kf2.o("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.ad2
    public final void g() {
        og5 og5Var = this.l;
        og5Var.b = true;
        og5Var.d = false;
        og5Var.c = false;
        og5Var.i.drainPermits();
        og5Var.a();
        og5Var.g = new qk(og5Var);
        og5Var.b();
    }

    @Override // defpackage.ad2
    public final void h() {
        this.l.b = false;
    }

    @Override // defpackage.ad2
    public final void j(a83 a83Var) {
        super.j(a83Var);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        ba2 ba2Var = this.m;
        md2 md2Var = this.n;
        if (ba2Var == null || md2Var == null) {
            return;
        }
        super.j(md2Var);
        e(ba2Var, md2Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        gh0.c(this.l, sb);
        sb.append("}}");
        return sb.toString();
    }
}
