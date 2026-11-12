package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements ej4 {
    public final long n;
    public boolean o;
    public final tv p = new tv();
    public final tv q = new tv();
    public tl1 r;
    public boolean s;
    public final /* synthetic */ yq1 t;

    public wq1(yq1 yq1Var, long j, boolean z) {
        this.t = yq1Var;
        this.n = j;
        this.o = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        yq1 yq1Var = this.t;
        synchronized (yq1Var) {
            this.s = true;
            tv tvVar = this.q;
            j = tvVar.o;
            tvVar.b();
            yq1Var.notifyAll();
        }
        if (j > 0) {
            yq1 yq1Var2 = this.t;
            tl1 tl1Var = ze5.a;
            yq1Var2.b.s(j);
        }
        this.t.a();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d9 A[LOOP:0: B:4:0x000d->B:62:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00dd A[SYNTHETIC] */
    @Override // defpackage.ej4
    public final long read(tv tvVar, long j) throws Throwable {
        boolean z;
        boolean z2;
        b21 b21Var;
        Throwable streamResetException;
        long j2;
        long j3;
        tvVar.getClass();
        long j4 = 0;
        if (j < 0) {
            kf2.e(b11.k("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            yq1 yq1Var = this.t;
            synchronized (yq1Var) {
                yq1Var.b.getClass();
                vq1 vq1Var = yq1Var.i;
                z = true;
                z2 = vq1Var.p || vq1Var.n;
                if (z2) {
                    yq1Var.j.h();
                }
                try {
                    synchronized (yq1Var) {
                        b21Var = yq1Var.l;
                    }
                    this.t.b.C.getClass();
                    if (z) {
                        if (j3 != -1) {
                            return j3;
                        }
                        if (streamResetException == null) {
                            return -1L;
                        }
                        throw streamResetException;
                    }
                    j4 = j2;
                } catch (Throwable th) {
                    if (z2) {
                        yq1Var.j.k();
                    }
                    throw th;
                }
            }
            if (b21Var != null && !this.o) {
                streamResetException = yq1Var.m;
                if (streamResetException == null) {
                    synchronized (yq1Var) {
                        b21 b21Var2 = yq1Var.l;
                        b21Var2.getClass();
                        streamResetException = new StreamResetException(b21Var2);
                    }
                }
                throw th;
            }
            streamResetException = null;
            if (this.s) {
                throw new IOException("stream closed");
            }
            tv tvVar2 = this.q;
            long j5 = tvVar2.o;
            if (j5 > j4) {
                j3 = tvVar2.read(tvVar, Math.min(j, j5));
                os.c(yq1Var.c, j3, 0L, 2);
                long jB = yq1Var.c.b();
                if (streamResetException == null) {
                    j2 = j4;
                    if (jB >= yq1Var.b.D.a() / 2) {
                        yq1Var.b.F(yq1Var.a, jB);
                        os.c(yq1Var.c, 0L, jB, 1);
                    }
                } else {
                    j2 = j4;
                }
                z = false;
            } else {
                j2 = j4;
                if (this.o || streamResetException != null) {
                    z = false;
                } else {
                    try {
                        yq1Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j3 = -1;
            }
            if (z2) {
                yq1Var.j.k();
            }
            this.t.b.C.getClass();
            if (z) {
                if (j3 != -1) {
                    return j3;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j4 = j2;
        }
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.t.j;
    }
}
