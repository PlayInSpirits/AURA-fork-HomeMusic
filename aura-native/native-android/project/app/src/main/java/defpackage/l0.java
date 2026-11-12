package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends g12 {
    @Override // defpackage.g12
    public final void K(t0 t0Var, t0 t0Var2) {
        t0Var.b = t0Var2;
    }

    @Override // defpackage.g12
    public final void L(t0 t0Var, Thread thread) {
        t0Var.a = thread;
    }

    @Override // defpackage.g12
    public final boolean g(u0 u0Var, i0 i0Var, i0 i0Var2) {
        synchronized (u0Var) {
            try {
                if (u0Var.o != i0Var) {
                    return false;
                }
                u0Var.o = i0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g12
    public final boolean h(u0 u0Var, Object obj, Object obj2) {
        synchronized (u0Var) {
            try {
                if (u0Var.n != obj) {
                    return false;
                }
                u0Var.n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g12
    public final boolean i(u0 u0Var, t0 t0Var, t0 t0Var2) {
        synchronized (u0Var) {
            try {
                if (u0Var.p != t0Var) {
                    return false;
                }
                u0Var.p = t0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.g12
    public final i0 p(u0 u0Var) {
        i0 i0Var;
        i0 i0Var2 = i0.d;
        synchronized (u0Var) {
            try {
                i0Var = u0Var.o;
                if (i0Var != i0Var2) {
                    u0Var.o = i0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i0Var;
    }

    @Override // defpackage.g12
    public final t0 q(u0 u0Var) {
        t0 t0Var;
        t0 t0Var2 = t0.c;
        synchronized (u0Var) {
            try {
                t0Var = u0Var.p;
                if (t0Var != t0Var2) {
                    u0Var.p = t0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0Var;
    }
}
