package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 implements wz3, pz3 {
    public final Object a;
    public final wz3 b;
    public volatile pz3 c;
    public volatile pz3 d;
    public int e = 3;
    public int f = 3;

    public e21(Object obj, wz3 wz3Var) {
        this.a = obj;
        this.b = wz3Var;
    }

    @Override // defpackage.wz3, defpackage.pz3
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.wz3
    public final void b(pz3 pz3Var) {
        synchronized (this.a) {
            try {
                if (pz3Var.equals(this.d)) {
                    this.f = 5;
                    wz3 wz3Var = this.b;
                    if (wz3Var != null) {
                        wz3Var.b(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final void c() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.c();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 pz3Var) {
        if (pz3Var instanceof e21) {
            e21 e21Var = (e21) pz3Var;
            if (this.c.e(e21Var.c) && this.d.e(e21Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wz3
    public final void f(pz3 pz3Var) {
        synchronized (this.a) {
            try {
                if (pz3Var.equals(this.c)) {
                    this.e = 4;
                } else if (pz3Var.equals(this.d)) {
                    this.f = 4;
                }
                wz3 wz3Var = this.b;
                if (wz3Var != null) {
                    wz3Var.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz3
    public final boolean g(pz3 pz3Var) {
        boolean z;
        synchronized (this.a) {
            wz3 wz3Var = this.b;
            z = (wz3Var == null || wz3Var.g(this)) && pz3Var.equals(this.c);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [wz3] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.wz3
    public final wz3 getRoot() {
        ?? root;
        synchronized (this.a) {
            try {
                wz3 wz3Var = this.b;
                this = this;
                if (wz3Var != null) {
                    root = wz3Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.wz3
    public final boolean h(pz3 pz3Var) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            wz3 wz3Var = this.b;
            z = false;
            if (wz3Var == null || wz3Var.h(this)) {
                if (this.e != 5) {
                    zEquals = pz3Var.equals(this.c);
                } else {
                    zEquals = pz3Var.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.wz3
    public final boolean i(pz3 pz3Var) {
        boolean z;
        synchronized (this.a) {
            wz3 wz3Var = this.b;
            z = wz3Var == null || wz3Var.i(this);
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.pz3
    public final void k() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
