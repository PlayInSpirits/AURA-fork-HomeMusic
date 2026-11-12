package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class zf3
extends b1 {
    public final xf3 p;
    public int q;
    public wx4 r;
    public int s;

    public zf3(xf3 xf32, int n16) {
        super(n16, xf32.u);
        this.p = xf32;
        this.q = xf32.f();
        this.s = -1;
        this.b();
    }

    public final void a() {
        if (this.q == this.p.f()) {
            return;
        }
        kf2.c();
    }

    @Override
    public final void add(Object object) {
        this.a();
        int n16 = this.n++;
        xf3 xf32 = this.p;
        xf32.add(n16, object);
        this.o = xf32.a();
        this.q = xf32.f();
        this.s = -1;
        this.b();
    }

    public final void b() {
        int n16;
        x32 x322 = this.p;
        Object[] objectArray = ((xf3)x322).s;
        if (objectArray == null) {
            this.r = null;
            return;
        }
        int n17 = ((xf3)x322).u - 1 & 0xFFFFFFE0;
        int n18 = n16 = this.n;
        if (n16 > n17) {
            n18 = n17;
        }
        n16 = ((xf3)x322).q / 5 + 1;
        x322 = this.r;
        if (x322 == null) {
            this.r = new wx4(objectArray, n18, n17, n16);
            return;
        }
        ((b1)x322).n = n18;
        ((b1)x322).o = n17;
        ((wx4)x322).p = n16;
        if (((wx4)x322).q.length < n16) {
            ((wx4)x322).q = new Object[n16];
        }
        Object[] objectArray2 = ((wx4)x322).q;
        n16 = 0;
        objectArray2[0] = objectArray;
        if (n18 == n17) {
            n16 = 1;
        }
        ((wx4)x322).r = n16;
        ((wx4)x322).b(n18 - n16, 1);
    }

    @Override
    public final Object next() {
        this.a();
        if (this.hasNext()) {
            int n16;
            this.s = n16 = this.n++;
            Object[] objectArray = this.r;
            Object[] objectArray2 = this.p;
            if (objectArray == null) {
                objectArray = objectArray2.t;
                this.n = n16 + 1;
                return objectArray[n16];
            }
            if (objectArray.hasNext()) {
                return objectArray.next();
            }
            objectArray2 = objectArray2.t;
            n16 = this.n;
            this.n = n16 + 1;
            return objectArray2[n16 - objectArray.o];
        }
        tb4.k();
        return null;
    }

    public final Object previous() {
        this.a();
        if (this.hasPrevious()) {
            int n16 = this.n;
            this.s = n16 - 1;
            Object[] objectArray = this.r;
            xf3 xf32 = this.p;
            if (objectArray == null) {
                int n17;
                objectArray = xf32.t;
                this.n = n17 = n16 - 1;
                return objectArray[n17];
            }
            int n18 = objectArray.o;
            if (n16 > n18) {
                objectArray = xf32.t;
                this.n = --n16;
                return objectArray[n16 - n18];
            }
            this.n = n16 - 1;
            return objectArray.previous();
        }
        tb4.k();
        return null;
    }

    @Override
    public final void remove() {
        this.a();
        int n16 = this.s;
        if (n16 != -1) {
            xf3 xf32 = this.p;
            xf32.b(n16);
            n16 = this.s;
            if (n16 < this.n) {
                this.n = n16;
            }
            this.o = xf32.a();
            this.q = xf32.f();
            this.s = -1;
            this.b();
            return;
        }
        tb4.a();
    }

    @Override
    public final void set(Object object) {
        this.a();
        int n16 = this.s;
        if (n16 != -1) {
            xf3 xf32 = this.p;
            xf32.set(n16, object);
            this.q = xf32.f();
            this.b();
            return;
        }
        tb4.a();
    }
}

