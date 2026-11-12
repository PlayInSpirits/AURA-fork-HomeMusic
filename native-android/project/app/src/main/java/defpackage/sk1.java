package defpackage;

import java.io.IOException;
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

    public sk1(ew ewVar) {
        ewVar.getClass();
        wu3 wu3Var = new wu3(ewVar);
        this.n = wu3Var;
        Deflater deflater = new Deflater(-1, true);
        this.o = deflater;
        this.p = new zn0(wu3Var, deflater);
        this.r = new CRC32();
        tv tvVar = wu3Var.o;
        tvVar.c0(8075);
        tvVar.Y(8);
        tvVar.Y(0);
        tvVar.b0(0);
        tvVar.Y(0);
        tvVar.Y(0);
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) throws IOException {
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return;
        }
        if (j == 0) {
            return;
        }
        t84 t84Var = tvVar.n;
        t84Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, t84Var.c - t84Var.b);
            this.r.update(t84Var.a, t84Var.b, iMin);
            j2 -= (long) iMin;
            t84Var = t84Var.f;
            t84Var.getClass();
        }
        this.p.L(tvVar, j);
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.o;
        wu3 wu3Var = this.n;
        if (this.q) {
            return;
        }
        try {
            zn0 zn0Var = this.p;
            ((Deflater) zn0Var.q).finish();
            zn0Var.b(false);
            int value = (int) this.r.getValue();
            boolean z = wu3Var.p;
            tv tvVar = wu3Var.o;
            if (z) {
                throw new IllegalStateException("closed");
            }
            tvVar.b0(zz1.G(value));
            wu3Var.b();
            int bytesRead = (int) deflater.getBytesRead();
            if (wu3Var.p) {
                throw new IllegalStateException("closed");
            }
            tvVar.b0(zz1.G(bytesRead));
            wu3Var.b();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                wu3Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.q = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() throws IOException {
        this.p.flush();
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.n.n.timeout();
    }
}
