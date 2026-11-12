package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends FilterOutputStream {
    public InputStream n;
    public final Object o;

    public kx1(ByteArrayOutputStream r1) {
        super(r1);
        this.o = new Object();
    }

    public final InputStream b() {
        Object r0 = this.o;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.n != null) goto L9;
        this.n = new ByteArrayInputStream(((ByteArrayOutputStream) ((FilterOutputStream) this).out).toByteArray());     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return this.n;
    }
}
