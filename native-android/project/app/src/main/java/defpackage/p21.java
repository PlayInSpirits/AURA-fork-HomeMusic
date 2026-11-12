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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(y10 y10Var, ej4 ej4Var, long j) {
        super(ej4Var);
        ej4Var.getClass();
        this.s = y10Var;
        this.n = j;
        this.p = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.q) {
            return iOException;
        }
        this.q = true;
        if (iOException == null && this.p) {
            this.p = false;
        }
        return this.s.a(true, false, iOException);
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.r) {
            return;
        }
        this.r = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            throw b(e);
        }
    }

    @Override // defpackage.ac1, defpackage.ej4
    public final long read(tv tvVar, long j) throws IOException {
        tvVar.getClass();
        if (this.r) {
            kf2.o("closed");
            return 0L;
        }
        try {
            long j2 = delegate().read(tvVar, j);
            if (this.p) {
                this.p = false;
            }
            if (j2 == -1) {
                b(null);
                return -1L;
            }
            long j3 = this.o + j2;
            long j4 = this.n;
            if (j4 == -1 || j3 <= j4) {
                this.o = j3;
                if (j3 == j4) {
                    b(null);
                }
                return j2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e) {
            throw b(e);
        }
    }
}
