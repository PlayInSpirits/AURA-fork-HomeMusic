package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements of4 {
    public final wu3 n;
    public final Deflater o;
    public final zn0 p;
    public boolean q;
    public final CRC32 r;

    public sk1(ew r4) {
        r4.getClass();
        wu3 r0 = new wu3(r4);
        this.n = r0;
        Deflater r5 = new Deflater(-1, true);
        this.o = r5;
        this.p = new zn0(r0, r5);
        this.r = new CRC32();
        tv r6 = r0.o;
        r6.c0(8075);
        r6.Y(8);
        r6.Y(0);
        r6.b0(0);
        r6.Y(0);
        r6.Y(0);
    }

    @Override // defpackage.of4
    public final void L(tv r10, long r11) {
        if (r11 < 0) goto L12;
        if (r11 != 0) goto L6;
        return;
    L6:
        t84 r2 = r10.n;
        r2.getClass();
        long r3 = r11;
    L8:
        if (r3 <= 0) goto L10;
        int r5 = (int) Math.min(r3, r2.c - r2.b);
        this.r.update(r2.a, r2.b, r5);
        r3 = r3 - ((long) r5);
        r2 = r2.f;
        r2.getClass();
        goto L8
    L10:
        this.p.L(r10, r11);
        return;
    L12:
        kf2.e(b11.k("byteCount < 0: ", r11));
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater r0 = this.o;
        wu3 r1 = this.n;
        if (this.q == true) goto L36;
        zn0 r2 = this.p;     // Catch: Throwable -> L13
        ((Deflater) r2.q).finish();     // Catch: Throwable -> L13
        r2.b(false);     // Catch: Throwable -> L13
        int r3 = (int) this.r.getValue();     // Catch: Throwable -> L13
        boolean r4 = r1.p;     // Catch: Throwable -> L13
        tv r5 = r1.o;
        if (r4 == true) goto L16;
        r5.b0(zz1.G(r3));     // Catch: Throwable -> L13
        r1.b();     // Catch: Throwable -> L13
        int r6 = (int) r0.getBytesRead();     // Catch: Throwable -> L13
        if (r1.p == true) goto L12;
        r5.b0(zz1.G(r6));     // Catch: Throwable -> L13
        r1.b();     // Catch: Throwable -> L13
        th = null;
    L31:
        r0.end();     // Catch: Throwable -> L19
    L34:
        r1.close();     // Catch: Throwable -> L24
    L27:
        this.q = true;
        if (th != null) goto L30;
        return;
    L30:
        throw th;
    L24:
        th = move-exception;
        if (th != null) goto L27;
        th = th;
    L19:
        th = move-exception;
        if (th != null) goto L34;
        th = th;
        goto L34
    L12:
        throw new IllegalStateException("closed");     // Catch: Throwable -> L13
    L16:
        throw new IllegalStateException("closed");     // Catch: Throwable -> L13
    L13:
        th = th;
        goto L31
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() {
        this.p.flush();
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n.n.timeout();
    }
}
