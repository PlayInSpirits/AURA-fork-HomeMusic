package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class cr0 extends ac1 {
    public boolean n;
    public final /* synthetic */ jr0 o;
    public final /* synthetic */ dr0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(ej4 ej4Var, jr0 jr0Var, dr0 dr0Var) {
        super(ej4Var);
        this.o = jr0Var;
        this.p = dr0Var;
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.n) {
            return;
        }
        this.n = true;
        jr0 jr0Var = this.o;
        dr0 dr0Var = this.p;
        synchronized (jr0Var) {
            int i = dr0Var.h - 1;
            dr0Var.h = i;
            if (i == 0 && dr0Var.f) {
                jr0Var.K(dr0Var);
            }
        }
    }
}
