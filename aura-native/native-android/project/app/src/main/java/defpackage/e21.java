package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class e21
implements wz3,
pz3 {
    public final Object a;
    public final wz3 b;
    public volatile pz3 c;
    public volatile pz3 d;
    public int e = 3;
    public int f = 3;

    public e21(Object object, wz3 wz32) {
        this.a = object;
        this.b = wz32;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a() {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.c.a()) return true;
                if (!this.d.a()) return false;
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
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block4: {
                    block5: {
                        try {
                            if (object.equals(this.d)) break block4;
                            this.e = 5;
                            if (this.f == 1) break block5;
                            this.f = 1;
                            this.d.k();
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    return;
                }
                this.f = 5;
                object = this.b;
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
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.e != 1) break block4;
                        this.e = 2;
                        this.c.c();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.c();
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
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.e = 3;
                        this.c.clear();
                        if (this.f == 3) break block3;
                        this.f = 3;
                        this.d.clear();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
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
    public final boolean d() {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.e == 4) return true;
                if (this.f != 4) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final boolean e(pz3 pz32) {
        if (pz32 instanceof e21) {
            pz32 = (e21)pz32;
            if (this.c.e(((e21)pz32).c) && this.d.e(((e21)pz32).d)) {
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
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                block6: {
                    block5: {
                        try {
                            if (!object.equals(this.c)) break block5;
                            this.e = 4;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (object.equals(this.d)) {
                        this.f = 4;
                    }
                }
                object = this.b;
                if (object != null) {
                    object.f(this);
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
        Object object = this.a;
        synchronized (object) {
            wz3 wz32 = this.b;
            if (wz32 != null) {
                if (!wz32.g(this)) return false;
            }
            if (!pz32.equals(this.c)) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final wz3 getRoot() {
        Object object = this.a;
        synchronized (object) {
            try {
                wz3 wz32 = this.b;
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
        Object object = this.a;
        synchronized (object) {
            int n16;
            boolean bl5;
            wz3 wz32 = this.b;
            boolean bl6 = false;
            if (wz32 != null) {
                bl5 = bl6;
                if (!wz32.h(this)) return bl5;
            }
            boolean bl7 = this.e != 5 ? pz32.equals(this.c) : pz32.equals(this.d) && ((n16 = this.f) == 4 || n16 == 5);
            bl5 = bl6;
            if (!bl7) return bl5;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean i(pz3 object) {
        object = this.a;
        synchronized (object) {
            wz3 wz32 = this.b;
            if (wz32 == null) return true;
            if (!wz32.i(this)) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean isRunning() {
        Object object = this.a;
        synchronized (object) {
            try {
                boolean bl5;
                int n16 = this.e;
                boolean bl6 = bl5 = true;
                if (n16 == 1) return bl6;
                if (this.f != 1) return false;
                return bl5;
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
    public final boolean j() {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.e != 3) return false;
                if (this.f != 3) return false;
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
    public final void k() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.e == 1) break block3;
                        this.e = 1;
                        this.c.k();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

