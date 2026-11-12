package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 extends x21 {
    public static final rm0 q;
    public ve0 p;

    static {
        int i = ir4.c;
        int i2 = ir4.d;
        long j = ir4.e;
        String str = ir4.a;
        rm0 rm0Var = new rm0();
        rm0Var.p = new ve0(i, i2, j, str);
        q = rm0Var;
    }

    @Override // defpackage.pe0
    public final void W(ne0 ne0Var, Runnable runnable) {
        ve0.j(this.p, runnable, 6);
    }

    @Override // defpackage.pe0
    public final void X(ne0 ne0Var, Runnable runnable) {
        ve0.j(this.p, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.pe0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
