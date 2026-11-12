package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac1 implements ej4 {
    private final ej4 delegate;

    public ac1(ej4 ej4Var) {
        ej4Var.getClass();
        this.delegate = ej4Var;
    }

    @zo0
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final ej4 m0deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final ej4 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ej4
    public long read(tv tvVar, long j) {
        tvVar.getClass();
        return this.delegate.read(tvVar, j);
    }

    @Override // defpackage.ej4
    public fu4 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
