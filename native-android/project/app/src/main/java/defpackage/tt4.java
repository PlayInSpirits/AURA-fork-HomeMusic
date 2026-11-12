package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tt4 implements wz3, pz3 {
    public final wz3 a;
    public final Object b;
    public volatile cf4 c;
    public volatile pz3 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public tt4(Object obj, wz3 wz3Var) {
        this.b = obj;
        this.a = wz3Var;
    }

    @Override // defpackage.wz3, defpackage.pz3
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.wz3
    public final void b(pz3 pz3Var) {
        synchronized (this.b) {
            try {
                if (!pz3Var.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                wz3 wz3Var = this.a;
                if (wz3Var != null) {
                    wz3Var.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final void c() {
        synchronized (this.b) {
            try {
                if (!b11.c(this.f)) {
                    this.f = 2;
                    this.d.c();
                }
                if (!b11.c(this.e)) {
                    this.e = 2;
                    this.c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pz3
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.pz3
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 pz3Var) {
        if (!(pz3Var instanceof tt4)) {
            return false;
        }
        tt4 tt4Var = (tt4) pz3Var;
        if (this.c == null) {
            if (tt4Var.c != null) {
                return false;
            }
        } else if (!this.c.e(tt4Var.c)) {
            return false;
        }
        if (this.d == null) {
            return tt4Var.d == null;
        }
        return this.d.e(tt4Var.d);
    }

    @Override // defpackage.wz3
    public final void f(pz3 pz3Var) {
        synchronized (this.b) {
            try {
                if (pz3Var.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                wz3 wz3Var = this.a;
                if (wz3Var != null) {
                    wz3Var.f(this);
                }
                if (!b11.c(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wz3
    public final boolean g(pz3 pz3Var) {
        boolean z;
        synchronized (this.b) {
            try {
                wz3 wz3Var = this.a;
                z = (wz3Var == null || wz3Var.g(this)) && pz3Var.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
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
        synchronized (this.b) {
            try {
                wz3 wz3Var = this.a;
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
        synchronized (this.b) {
            try {
                wz3 wz3Var = this.a;
                z = (wz3Var == null || wz3Var.h(this)) && pz3Var.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.wz3
    public final boolean i(pz3 pz3Var) {
        boolean z;
        synchronized (this.b) {
            try {
                wz3 wz3Var = this.a;
                z = (wz3Var == null || wz3Var.i(this)) && (pz3Var.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.pz3
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.k();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
