package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o21 extends zb1 {
    public final long o;
    public boolean p;
    public long q;
    public boolean r;
    public final /* synthetic */ y10 s;

    public o21(y10 r1, of4 r2, long r3) {
        r2.getClass();
        this.s = r1;
        super(r2);
        this.o = r3;
    }

    @Override // defpackage.zb1, defpackage.of4
    public final void L(tv r5, long r6) {
        if (this.r == true) goto L16;
        long r2 = this.o;
        if (r2 != (-1)) goto L7;
    L18:
        this.n.L(r5, r6);     // Catch: IOException -> L13
        this.q += r6;     // Catch: IOException -> L13
        return;
    L13:
        e = move-exception;
        throw b(e);
    L7:
        if ((this.q + r6) <= r2) goto L18;
        throw new ProtocolException("expected " + r2 + " bytes but received " + (this.q + r6));
    L16:
        kf2.o("closed");
    }

    public final IOException b(IOException r3) {
        if (this.p == false) goto L5;
        return r3;
    L5:
        this.p = true;
        return this.s.a(false, true, r3);
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.r == false) goto L5;
        return;
    L5:
        this.r = true;
        long r2 = this.o;
        if (r2 != (-1)) goto L8;
    L17:
        super.close();     // Catch: IOException -> L14
        b(null);     // Catch: IOException -> L14
        return;
    L14:
        e = move-exception;
        throw b(e);
    L8:
        if (this.q == r2) goto L17;
        throw new ProtocolException("unexpected end of stream");
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Flushable
    public final void flush() {
        super.flush();     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw b(e);
    }
}
