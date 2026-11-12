package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ep4 extends wd0 implements gg1 {
    public final int n;

    public ep4(int i, vd0 vd0Var) {
        super(vd0Var);
        this.n = i;
    }

    @Override // defpackage.gg1
    public final int getArity() {
        return this.n;
    }

    @Override // defpackage.jp
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kx3.a.getClass();
        return lx3.a(this);
    }
}
