package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sv2 extends bc1 {
    public final /* synthetic */ int f;
    public final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(int i, long j, cu4 cu4Var) {
        super(cu4Var);
        this.f = i;
        cu4Var.getClass();
        switch (i) {
            case 1:
                super(cu4Var);
                this.g = j;
                break;
            default:
                this.g = j;
                break;
        }
    }

    @Override // defpackage.bc1, defpackage.cu4
    public zt4 f(int i, zt4 zt4Var, boolean z) {
        switch (this.f) {
            case 1:
                zt4Var.getClass();
                super.f(i, zt4Var, z);
                zt4Var.d = this.g;
                return zt4Var;
            default:
                return super.f(i, zt4Var, z);
        }
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        int i2 = this.f;
        long j2 = this.g;
        bu4Var.getClass();
        switch (i2) {
            case 0:
                super.m(i, bu4Var, j);
                bu4Var.l = j2;
                break;
            default:
                super.m(i, bu4Var, j);
                bu4Var.l = j2;
                bu4Var.g = true;
                bu4Var.h = false;
                bu4Var.i = null;
                break;
        }
        return bu4Var;
    }
}
