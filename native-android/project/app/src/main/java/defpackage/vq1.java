package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 implements of4 {
    public final boolean n;
    public final tv o = new tv();
    public boolean p;
    public final /* synthetic */ yq1 q;

    public vq1(yq1 yq1Var, boolean z) {
        this.q = yq1Var;
        this.n = z;
    }

    @Override // defpackage.of4
    public final void L(tv tvVar, long j) {
        tl1 tl1Var = ze5.a;
        tv tvVar2 = this.o;
        tvVar2.L(tvVar, j);
        while (tvVar2.o >= 16384) {
            b(false);
        }
    }

    public final void b(boolean z) {
        long jMin;
        boolean z2;
        yq1 yq1Var = this.q;
        synchronized (yq1Var) {
            yq1Var.k.h();
            while (yq1Var.d >= yq1Var.e && !this.n && !this.p) {
                try {
                    synchronized (yq1Var) {
                        b21 b21Var = yq1Var.l;
                        if (b21Var != null) {
                            break;
                        }
                        try {
                            yq1Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    yq1Var.k.k();
                    throw th;
                }
            }
            yq1Var.k.k();
            yq1Var.b();
            jMin = Math.min(yq1Var.e - yq1Var.d, this.o.o);
            yq1Var.d += jMin;
            z2 = z && jMin == this.o.o;
        }
        this.q.k.h();
        try {
            yq1 yq1Var2 = this.q;
            yq1Var2.b.u(yq1Var2.a, z2, this.o, jMin);
        } finally {
            this.q.k.k();
        }
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        yq1 yq1Var = this.q;
        tl1 tl1Var = ze5.a;
        synchronized (yq1Var) {
            if (this.p) {
                return;
            }
            synchronized (yq1Var) {
                z = yq1Var.l == null;
            }
            yq1 yq1Var2 = this.q;
            if (!yq1Var2.i.n) {
                if (this.o.o > 0) {
                    while (this.o.o > 0) {
                        b(true);
                    }
                } else if (z) {
                    yq1Var2.b.u(yq1Var2.a, true, null, 0L);
                }
            }
            yq1 yq1Var3 = this.q;
            synchronized (yq1Var3) {
                this.p = true;
                yq1Var3.notifyAll();
            }
            this.q.b.flush();
            this.q.a();
        }
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() {
        yq1 yq1Var = this.q;
        tl1 tl1Var = ze5.a;
        synchronized (yq1Var) {
            yq1Var.b();
        }
        while (this.o.o > 0) {
            b(false);
            this.q.b.flush();
        }
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.q.k;
    }
}
