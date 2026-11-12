package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac1 implements ej4 {
    private final ej4 delegate;

    public ac1(ej4 r1) {
        r1.getClass();
        this.delegate = r1;
    }

    @zo0
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final ej4 m0deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final ej4 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ej4
    public long read(tv r1, long r2) {
        r1.getClass();
        return this.delegate.read(r1, r2);
    }

    @Override // defpackage.ej4
    public fu4 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
