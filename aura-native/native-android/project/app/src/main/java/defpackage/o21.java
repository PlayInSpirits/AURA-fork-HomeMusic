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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o21(y10 y10Var, of4 of4Var, long j) {
        super(of4Var);
        of4Var.getClass();
        this.s = y10Var;
        this.o = j;
    }

    @Override // defpackage.zb1, defpackage.of4
    public final void L(tv tvVar, long j) throws IOException {
        if (this.r) {
            kf2.o("closed");
            return;
        }
        long j2 = this.o;
        if (j2 == -1 || this.q + j <= j2) {
            try {
                this.n.L(tvVar, j);
                this.q += j;
                return;
            } catch (IOException e) {
                throw b(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.q + j));
    }

    public final IOException b(IOException iOException) {
        if (this.p) {
            return iOException;
        }
        this.p = true;
        return this.s.a(false, true, iOException);
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.r) {
            return;
        }
        this.r = true;
        long j = this.o;
        if (j != -1 && this.q != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw b(e);
        }
    }
}
