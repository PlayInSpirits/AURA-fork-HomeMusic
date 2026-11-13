package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ad4 implements as0 {
    public final cd4 n;
    public final long o;
    public final Object p;
    public final cz q;

    public ad4(cd4 cd4Var, long j, Object obj, cz czVar) {
        this.n = cd4Var;
        this.o = j;
        this.p = obj;
        this.q = czVar;
    }

    @Override // defpackage.as0
    public final void a() {
        cd4 cd4Var = this.n;
        synchronized (cd4Var) {
            if (this.o < cd4Var.o()) {
                return;
            }
            Object[] objArr = cd4Var.u;
            objArr.getClass();
            long j = this.o;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            g12.d(objArr, j, g12.e);
            cd4Var.j();
        }
    }
}
