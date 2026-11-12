package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r15 extends n14 implements ej4 {
    public final hu2 n;
    public final long o;

    public r15(hu2 r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.n14, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.n14
    public final long contentLength() {
        return this.o;
    }

    @Override // defpackage.n14
    public final hu2 contentType() {
        return this.n;
    }

    @Override // defpackage.ej4
    public final long read(tv r1, long r2) {
        r1.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.n14
    public final fw source() {
        return new xu3(this);
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return fu4.d;
    }
}
