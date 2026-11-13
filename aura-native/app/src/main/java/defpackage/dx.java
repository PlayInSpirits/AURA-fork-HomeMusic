package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dx extends ac1 {
    public final /* synthetic */ ex n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(ej4 ej4Var, ex exVar) {
        super(ej4Var);
        this.n = exVar;
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.n.close();
        super.close();
    }
}
