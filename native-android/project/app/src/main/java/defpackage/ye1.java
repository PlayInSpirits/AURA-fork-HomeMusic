package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends RuntimeException {
    public final ze1 n;
    public final Throwable o;

    public ye1(ze1 r1, Throwable r2) {
        super(r2);
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.o;
    }
}
