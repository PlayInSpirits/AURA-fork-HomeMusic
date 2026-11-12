package defpackage;

import java.io.ByteArrayInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends i90 {
    public static final /* synthetic */ int q = 0;
    public final InflaterInputStream o;
    public final Inflater p;

    public yn0(ByteArrayInputStream r4) {
        Inflater r0 = new Inflater(false);
        this.p = r0;
        this.o = new InflaterInputStream(new df0(r4), r0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater r0 = this.p;
        this.o.close();     // Catch: Throwable -> L6
        r0.end();
        return;
    L6:
        th = move-exception;
        r0.end();
        throw th;
    }

    @Override // java.io.InputStream
    public final int read() {
        int r0 = this.o.read();
        if (r0 != (-1)) goto L5;
        int r1 = 0;
    L6:
        b(r1);
        return r0;
    L5:
        r1 = 1;
        goto L6
    }

    @Override // java.io.InputStream
    public final long skip(long r1) {
        return vr1.G(this.o, r1);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r5 = this.o.read(r2, r3, r4);
        b(r5);
        return r5;
    }
}
