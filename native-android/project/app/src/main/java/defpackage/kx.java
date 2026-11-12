package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kx implements bi0 {
    public se4 n;
    public final y41 o = new y41(6);
    public px p = px.c;
    public boolean q;
    public bi0 r;
    public int s;

    @Override // defpackage.bi0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lx m() {
        bi0 bi0Var = this.r;
        return c(bi0Var != null ? bi0Var.m() : null, this.s);
    }

    public final lx b() {
        bi0 bi0Var = this.r;
        return c(bi0Var != null ? bi0Var.m() : null, this.s | 1);
    }

    public final lx c(ci0 ci0Var, int i) {
        se4 se4Var = this.n;
        se4Var.getClass();
        return new lx(se4Var, ci0Var, this.o.m(), (this.q || ci0Var == null) ? null : new jx(se4Var), this.p, i);
    }
}
