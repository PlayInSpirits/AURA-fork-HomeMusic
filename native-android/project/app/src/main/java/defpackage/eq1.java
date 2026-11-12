package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 extends bq1 {
    public long q;
    public final /* synthetic */ hq1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(hq1 hq1Var, long j) {
        super(hq1Var);
        this.r = hq1Var;
        this.q = j;
        if (j == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zH;
        if (this.o) {
            return;
        }
        if (this.q != 0) {
            tl1 tl1Var = ze5.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = ze5.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                ((q21) this.r.c).a();
                b();
            }
        }
        this.o = true;
    }

    @Override // defpackage.bq1, defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tvVar.getClass();
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        if (this.o) {
            kf2.o("closed");
            return 0L;
        }
        long j2 = this.q;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = super.read(tvVar, Math.min(j2, j));
        if (j3 == -1) {
            ((q21) this.r.c).a();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j4 = this.q - j3;
        this.q = j4;
        if (j4 == 0) {
            b();
        }
        return j3;
    }
}
