package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class tt4
implements wz3,
pz3 {
    public final wz3 a;
    public final Object b;
    public volatile cf4 c;
    public volatile pz3 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public tt4(Object object, wz3 wz32) {
        this.b = object;
        this.a = wz32;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a() {
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.d.a()) return true;
                if (!this.c.a()) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(pz3 object) {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                try {
                    if (!object.equals(this.c)) {
                        this.f = 5;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.e = 5;
                object = this.a;
                if (object != null) {
                    object.b(this);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (b11.c(this.f)) break block4;
                        this.f = 2;
                        this.d.c();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (!b11.c(this.e)) {
                    this.e = 2;
                    this.c.c();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void clear() {
        Object object = this.b;
        synchronized (object) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean d() {
        Object object = this.b;
        synchronized (object) {
            if (this.e != 4) return false;
            return true;
        }
    }

    @Override
    public final boolean e(pz3 pz32) {
        if (pz32 instanceof tt4) {
            pz32 = (tt4)pz32;
            if ((this.c == null ? ((tt4)pz32).c == null : this.c.e(((tt4)pz32).c)) && (this.d == null ? ((tt4)pz32).d == null : this.d.e(((tt4)pz32).d))) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f(pz3 object) {
        Object object2 = this.b;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                try {
                    if (object.equals(this.d)) {
                        this.f = 4;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.e = 4;
                object = this.a;
                if (object != null) {
                    object.f(this);
                }
                if (!b11.c(this.f)) {
                    this.d.clear();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean g(pz3 pz32) {
        Object object = this.b;
        synchronized (object) {
            try {
                wz3 wz32 = this.a;
                if (wz32 != null) {
                    if (!wz32.g(this)) return false;
                }
                if (!pz32.equals(this.c)) return false;
                if (this.e == 2) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final wz3 getRoot() {
        Object object = this.b;
        synchronized (object) {
            try {
                wz3 wz32 = this.a;
                wz3 wz33 = this;
                if (wz32 == null) return wz33;
                return wz32.getRoot();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean h(pz3 pz32) {
        Object object = this.b;
        synchronized (object) {
            try {
                wz3 wz32 = this.a;
                if (wz32 != null) {
                    if (!wz32.h(this)) return false;
                }
                if (!pz32.equals(this.c)) return false;
                if (this.a()) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean i(pz3 pz32) {
        Object object = this.b;
        synchronized (object) {
            try {
                wz3 wz32 = this.a;
                if (wz32 != null) {
                    if (!wz32.i(this)) return false;
                }
                if (pz32.equals(this.c)) return true;
                if (this.e == 4) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isRunning() {
        Object object = this.b;
        synchronized (object) {
            int n16 = this.e;
            boolean bl5 = true;
            if (n16 != 1) return false;
            return bl5;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean j() {
        Object object = this.b;
        synchronized (object) {
            if (this.e != 3) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void k() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable3;
            block7: {
                Throwable throwable22;
                block9: {
                    block8: {
                        try {
                            this.g = true;
                        }
                        catch (Throwable throwable3) {
                            break block7;
                        }
                        try {
                            if (this.e == 4 || this.f == 1) break block8;
                            this.f = 1;
                            this.d.k();
                        }
                        catch (Throwable throwable22) {
                            break block9;
                        }
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.k();
                    }
                    this.g = false;
                    return;
                }
                this.g = false;
                throw throwable22;
            }
            throw throwable3;
        }
    }
}

