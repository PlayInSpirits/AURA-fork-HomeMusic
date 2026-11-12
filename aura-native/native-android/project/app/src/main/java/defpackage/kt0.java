package defpackage;

import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends Thread {
    public final tt0 n;
    public final du0 o;
    public final mt0 p;
    public final boolean q;
    public final int r;
    public volatile it0 s;
    public volatile boolean t;
    public Exception u;
    public long v = -1;

    public kt0(tt0 tt0Var, du0 du0Var, mt0 mt0Var, boolean z, int i, it0 it0Var) {
        this.n = tt0Var;
        this.o = du0Var;
        this.p = mt0Var;
        this.q = z;
        this.r = i;
        this.s = it0Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.s = null;
        }
        if (this.t) {
            return;
        }
        this.t = true;
        this.o.cancel();
        interrupt();
    }

    public final void b(long j, long j2, float f) {
        this.p.a = j2;
        this.p.b = f;
        if (j != this.v) {
            this.v = j;
            it0 it0Var = this.s;
            if (it0Var != null) {
                it0Var.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.q) {
                this.o.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.t) {
                    try {
                        this.o.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.t) {
                            long j2 = this.p.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.r) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, SmartSession.MAX_SONGS));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.u = e2;
        }
        it0 it0Var = this.s;
        if (it0Var != null) {
            it0Var.obtainMessage(10, this).sendToTarget();
        }
    }
}
