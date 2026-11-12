package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z14 extends BufferedOutputStream {
    public boolean n;

    public final void b(OutputStream r2) {
        rr2.w(this.n);
        ((BufferedOutputStream) this).out = r2;
        ((BufferedOutputStream) this).count = 0;
        this.n = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n = true;
        flush();     // Catch: Throwable -> L5
        th = null;
    L17:
        ((BufferedOutputStream) this).out.close();     // Catch: Throwable -> L8
    L11:
        if (th != null) goto L13;
        return;
    L13:
        String r1 = f35.a;
        throw th;
    L8:
        th = move-exception;
        if (th != null) goto L11;
        th = th;
    L5:
        th = th;
        goto L17
    }
}
