package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class wx4
extends b1 {
    public int p;
    public Object[] q;
    public boolean r;

    public wx4(Object[] objectArray, int n16, int n17, int n18) {
        super(n16, n17);
        this.p = n18;
        Object[] objectArray2 = new Object[n18];
        this.q = objectArray2;
        n17 = n16 == n17 ? 1 : 0;
        this.r = n17;
        objectArray2[0] = objectArray;
        this.b(n16 - n17, 1);
    }

    public final Object a() {
        int n16 = this.n;
        Object object = this.q[this.p - 1];
        object.getClass();
        return ((Object[])object)[n16 & 0x1F];
    }

    public final void b(int n16, int n17) {
        int n18 = (this.p - n17) * 5;
        while (n17 < this.p) {
            Object[] objectArray = this.q;
            Object object = objectArray[n17 - 1];
            object.getClass();
            objectArray[n17] = ((Object[])object)[uc5.t(n16, n18)];
            n18 -= 5;
            ++n17;
        }
    }

    public final void c(int n16) {
        int n17 = 0;
        while (uc5.t(this.n, n17) == n16) {
            n17 += 5;
        }
        if (n17 > 0) {
            n16 = this.p;
            this.b(this.n, n16 - 1 - (n17 /= 5) + 1);
        }
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            int n16;
            Object object = this.a();
            this.n = n16 = this.n + 1;
            if (n16 == this.o) {
                this.r = true;
                return object;
            }
            this.c(0);
            return object;
        }
        tb4.k();
        return null;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            --this.n;
            if (this.r) {
                this.r = false;
                return this.a();
            }
            this.c(31);
            return this.a();
        }
        tb4.k();
        return null;
    }
}

