package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb1 implements of4 {
    public final of4 n;

    public zb1(of4 r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // defpackage.of4
    public void L(tv r1, long r2) {
        this.n.L(r1, r2);
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.n.close();
    }

    @Override // defpackage.of4, java.io.Flushable
    public void flush() {
        this.n.flush();
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.n + ')';
    }
}
