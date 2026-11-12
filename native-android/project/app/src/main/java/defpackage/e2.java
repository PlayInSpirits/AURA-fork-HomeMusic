package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends ji2 {
    @Override // defpackage.ji2
    public final void B(f2 f2Var, f2 f2Var2) {
        f2Var.b = f2Var2;
    }

    @Override // defpackage.ji2
    public final void C(f2 f2Var, Thread thread) {
        f2Var.a = thread;
    }

    @Override // defpackage.ji2
    public final boolean d(g2 g2Var, c2 c2Var, c2 c2Var2) {
        synchronized (g2Var) {
            try {
                if (g2Var.o != c2Var) {
                    return false;
                }
                g2Var.o = c2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ji2
    public final boolean e(g2 g2Var, Object obj, Object obj2) {
        synchronized (g2Var) {
            try {
                if (g2Var.n != obj) {
                    return false;
                }
                g2Var.n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ji2
    public final boolean f(g2 g2Var, f2 f2Var, f2 f2Var2) {
        synchronized (g2Var) {
            try {
                if (g2Var.p != f2Var) {
                    return false;
                }
                g2Var.p = f2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
