package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class am4 implements Runnable {
    public final pq3 n;
    public final gl4 o;
    public final boolean p;
    public final int q;

    public am4(pq3 pq3Var, gl4 gl4Var, boolean z, int i) {
        pq3Var.getClass();
        gl4Var.getClass();
        this.n = pq3Var;
        this.o = gl4Var;
        this.p = z;
        this.q = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        td5 b;
        boolean z = this.p;
        pq3 pq3Var = this.n;
        gl4 gl4Var = this.o;
        if (z) {
            int i = this.q;
            pq3Var.getClass();
            String str = gl4Var.a.a;
            synchronized (pq3Var.k) {
                b = pq3Var.b(str);
            }
            d = pq3.d(str, b, i);
        } else {
            int i2 = this.q;
            pq3Var.getClass();
            String str2 = gl4Var.a.a;
            synchronized (pq3Var.k) {
                try {
                    if (pq3Var.f.get(str2) != null) {
                        cx.f().b(pq3.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) pq3Var.h.get(str2);
                        if (set != null && set.contains(gl4Var)) {
                            d = pq3.d(str2, pq3Var.b(str2), i2);
                        }
                    }
                    d = false;
                } finally {
                }
            }
        }
        cx.f().b(cx.i("StopWorkRunnable"), "StopWorkRunnable for " + this.o.a.a + "; Processor.stopWork = " + d);
    }
}
