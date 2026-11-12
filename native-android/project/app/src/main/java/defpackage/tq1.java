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

    public tq1(fw fwVar) {
        fwVar.getClass();
        this.n = fwVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        int i;
        int i2;
        tvVar.getClass();
        do {
            int i3 = this.r;
            fw fwVar = this.n;
            if (i3 == 0) {
                fwVar.skip(this.s);
                this.s = 0;
                if ((this.p & 4) == 0) {
                    i = this.q;
                    int iN = xe5.n(fwVar);
                    this.r = iN;
                    this.o = iN;
                    int i4 = fwVar.readByte() & 255;
                    this.p = fwVar.readByte() & 255;
                    Logger logger = uq1.q;
                    if (logger.isLoggable(Level.FINE)) {
                        yw ywVar = iq1.a;
                        logger.fine(iq1.b(true, this.q, this.o, i4, this.p));
                    }
                    i2 = fwVar.readInt() & Integer.MAX_VALUE;
                    this.q = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j2 = fwVar.read(tvVar, Math.min(j, i3));
                if (j2 != -1) {
                    this.r -= (int) j2;
                    return j2;
                }
            }
            return -1L;
        } while (i2 == i);
        mj0.i("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.timeout();
    }
}
