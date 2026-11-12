package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 implements ej4 {
    public final fw n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;

    public tq1(fw r1) {
        r1.getClass();
        this.n = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ej4
    public final long read(tv r9, long r10) {
        r9.getClass();
    L3:
        int r0 = this.r;
        fw r1 = this.n;
        if (r0 != 0) goto L19;
        r1.skip(this.s);
        this.s = 0;
        if ((this.p & 4) != 0) goto L21;
        int r2 = this.q;
        int r3 = xe5.n(r1);
        this.r = r3;
        this.o = r3;
        int r4 = r1.readByte() & 255;
        this.p = r1.readByte() & 255;
        Logger r5 = uq1.q;
        if (r5.isLoggable(Level.FINE) == false) goto L11;
        yw r6 = iq1.a;
        r5.fine(iq1.b(true, this.q, this.o, r4, this.p));
    L11:
        int r7 = r1.readInt() & Integer.MAX_VALUE;
        this.q = r7;
        if (r4 != 9) goto L18;
        if (r7 == r2) goto L3;
        mj0.i("TYPE_CONTINUATION streamId changed");
        return 0;
    L18:
        throw new IOException(r4 + " != TYPE_CONTINUATION");
    L21:
        return -1;
    L19:
        long r11 = r1.read(r9, Math.min(r10, r0));
        if (r11 == (-1)) goto L21;
        this.r -= (int) r11;
        return r11;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.timeout();
    }
}
