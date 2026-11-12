package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dx extends ac1 {
    public final /* synthetic */ ex n;

    public dx(ej4 r1, ex r2) {
        this.n = r2;
        super(r1);
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.n.close();
        super.close();
    }
}
