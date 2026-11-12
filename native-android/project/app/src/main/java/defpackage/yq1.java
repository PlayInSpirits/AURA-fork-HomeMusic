package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq1 {
    public final int a;
    public final rq1 b;
    public final os c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final wq1 h;
    public final vq1 i;
    public final xq1 j;
    public final xq1 k;
    public b21 l;
    public IOException m;

    public yq1(int i, rq1 rq1Var, boolean z, boolean z2, tl1 tl1Var) {
        rq1Var.getClass();
        this.a = i;
        this.b = rq1Var;
        this.c = new os(i);
        this.e = rq1Var.E.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new wq1(this, rq1Var.D.a(), z2);
        this.i = new vq1(this, z);
        this.j = new xq1(this);
        this.k = new xq1(this);
        if (tl1Var == null) {
            if (g()) {
                return;
            }
            kf2.o("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            kf2.o("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(tl1Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zH;
        tl1 tl1Var = ze5.a;
        synchronized (this) {
            try {
                wq1 wq1Var = this.h;
                if (wq1Var.o || !wq1Var.s) {
                    z = false;
                } else {
                    vq1 vq1Var = this.i;
                    if (vq1Var.n || vq1Var.p) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(b21.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.b.n(this.a);
        }
    }

    public final void b() throws IOException {
        vq1 vq1Var = this.i;
        if (vq1Var.p) {
            mj0.i("stream closed");
            return;
        }
        if (vq1Var.n) {
            mj0.i("stream finished");
            return;
        }
        b21 b21Var = this.l;
        if (b21Var != null) {
            IOException iOException = this.m;
            if (iOException == null) {
                throw new StreamResetException(b21Var);
            }
        }
    }

    public final void c(b21 b21Var, IOException iOException) {
        if (d(b21Var, iOException)) {
            rq1 rq1Var = this.b;
            rq1Var.getClass();
            rq1Var.J.u(this.a, b21Var);
        }
    }

    public final boolean d(b21 b21Var, IOException iOException) {
        tl1 tl1Var = ze5.a;
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            this.l = b21Var;
            this.m = iOException;
            notifyAll();
            if (this.h.o && this.i.n) {
                return false;
            }
            this.b.n(this.a);
            return true;
        }
    }

    public final void e(b21 b21Var) {
        if (d(b21Var, null)) {
            this.b.v(this.a, b21Var);
        }
    }

    public final vq1 f() {
        synchronized (this) {
            if (!this.g && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.i;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.l != null) {
                return false;
            }
            wq1 wq1Var = this.h;
            if (wq1Var.o || wq1Var.s) {
                vq1 vq1Var = this.i;
                if ((vq1Var.n || vq1Var.p) && this.g) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(tl1 tl1Var, boolean z) {
        boolean zH;
        tl1Var.getClass();
        tl1 tl1Var2 = ze5.a;
        synchronized (this) {
            try {
                if (this.g && tl1Var.a(":status") == null && tl1Var.a(":method") == null) {
                    this.h.r = tl1Var;
                } else {
                    this.g = true;
                    this.f.add(tl1Var);
                }
                if (z) {
                    this.h.o = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.n(this.a);
    }
}
