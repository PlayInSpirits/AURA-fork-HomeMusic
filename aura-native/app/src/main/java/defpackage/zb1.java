package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class zb1 implements of4 {
    public final of4 n;

    public zb1(of4 of4Var) {
        of4Var.getClass();
        this.n = of4Var;
    }

    @Override // defpackage.of4
    public void L(tv tvVar, long j) {
        this.n.L(tvVar, j);
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
