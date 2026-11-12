package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 extends ac1 {
    public final long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final /* synthetic */ y10 s;

    public p21(y10 r1, ej4 r2, long r3) {
        r2.getClass();
        this.s = r1;
        super(r2);
        this.n = r3;
        this.p = true;
        if (r3 != 0) goto L6;
        b(null);
        return;
    }

    public final IOException b(IOException r4) {
        if (this.q == false) goto L5;
        return r4;
    L5:
        this.q = true;
        if (r4 != null) goto L11;
        if (this.p == false) goto L11;
        this.p = false;
    L11:
        return this.s.a(true, false, r4);
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r == false) goto L5;
        return;
    L5:
        this.r = true;
        super.close();     // Catch: IOException -> L8
        b(null);     // Catch: IOException -> L8
        return;
    L8:
        e = move-exception;
        throw b(e);
    }

    @Override // defpackage.ac1, defpackage.ej4
    public final long read(tv r9, long r10) {
        r9.getClass();
        if (this.r == false) goto L29;
        kf2.o("closed");
        return 0;
    L29:
        long r11 = delegate().read(r9, r10);     // Catch: IOException -> L7
        if (this.p == false) goto L10;
        this.p = false;     // Catch: IOException -> L7
    L10:
        if (r11 != (-1)) goto L14;
        b(null);     // Catch: IOException -> L7
        return -1;
    L14:
        long r4 = this.o + r11;
        long r6 = this.n;
        if (r6 != (-1)) goto L17;
    L21:
        this.o = r4;     // Catch: IOException -> L7
        if (r4 != r6) goto L24;
        b(null);     // Catch: IOException -> L7
    L24:
        return r11;
    L17:
        if (r4 <= r6) goto L21;
        throw new ProtocolException("expected " + r6 + " bytes but received " + r4);     // Catch: IOException -> L7
    L7:
        e = move-exception;
        throw b(e);
    }
}
