package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ip implements jb0 {
    public final xb0 a;

    public ip(xb0 xb0Var) {
        xb0Var.getClass();
        this.a = xb0Var;
    }

    @Override // defpackage.jb0
    public final boolean a(dd5 dd5Var) {
        return c(dd5Var) && e(this.a.a());
    }

    @Override // defpackage.jb0
    public final ny b(mc0 mc0Var) {
        mc0Var.getClass();
        return new ny(new p(this, null, 2), q01.n, -2, wv.n);
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
