/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.b11;
import defpackage.ig4;
import defpackage.j80;
import defpackage.kg4;
import defpackage.l80;
import defpackage.mg1;
import defpackage.o02;
import defpackage.oo3;
import java.util.ArrayList;

public final class hg4 {
    public final ig4 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final o02 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public hg4(ig4 ig42) {
        int n16;
        this.a = ig42;
        this.b = ig42.n;
        this.c = n16 = ig42.o;
        this.d = ig42.p;
        this.e = ig42.q;
        this.h = n16;
        this.i = -1;
        this.j = new o02();
    }

    public final mg1 a(int n16) {
        ArrayList arrayList = this.a.v;
        int n17 = kg4.e(arrayList, n16, this.c);
        if (n17 < 0) {
            mg1 mg12 = new mg1(n16);
            arrayList.add(-(n17 + 1), mg12);
            return mg12;
        }
        return (mg1)arrayList.get(n17);
    }

    public final Object b(int[] nArray, int n16) {
        int n17 = n16 * 5;
        if ((0x10000000 & (n16 = nArray[n17 + 1])) != 0) {
            Object[] objectArray = this.d;
            n16 = n17 >= nArray.length ? nArray.length : nArray[n17 + 4] + Integer.bitCount(n16 >> 29);
            return objectArray[n16];
        }
        return j80.a;
    }

    public final void c() {
        this.f = true;
        ig4 ig42 = this.a;
        if (ig42.r <= 0) {
            l80.a("Unexpected reader close()");
        }
        --ig42.r;
        this.d = new Object[0];
    }

    public final boolean d(int n16) {
        return (this.b[n16 * 5 + 1] & 0x4000000) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            int n16;
            if (this.g != this.h) {
                l80.a("endGroup() not called at the end of a group");
            }
            int n17 = this.i;
            int[] nArray = this.b;
            this.i = n16 = nArray[n17 * 5 + 2];
            int n18 = this.c;
            n17 = n16 < 0 ? n18 : nArray[n16 * 5 + 3] + n16;
            this.h = n17;
            n17 = this.j.b();
            if (n17 < 0) {
                this.l = 0;
                this.m = 0;
                return;
            }
            this.l = n17;
            n17 = n16 >= n18 - 1 ? this.e : nArray[(n16 + 1) * 5 + 4];
            this.m = n17;
        }
    }

    public final Object f() {
        int n16 = this.g;
        if (n16 < this.h) {
            return this.b(this.b, n16);
        }
        return 0;
    }

    public final int g() {
        int n16 = this.g;
        if (n16 < this.h) {
            return this.b[n16 * 5];
        }
        return 0;
    }

    public final Object h(int n16, int n17) {
        int[] nArray = this.b;
        int n18 = kg4.b(nArray, n16);
        n17 = n18 + n17;
        if (n17 < (n16 = ++n16 < this.c ? nArray[n16 * 5 + 4] : this.e)) {
            return this.d[n17];
        }
        return j80.a;
    }

    public final int i(int n16) {
        return this.b[n16 * 5];
    }

    public final boolean j(int n16) {
        return (this.b[n16 * 5 + 1] & 0x8000000) != 0;
    }

    public final boolean k(int n16) {
        return (this.b[n16 * 5 + 1] & 0x20000000) != 0;
    }

    public final boolean l(int n16) {
        return (this.b[n16 * 5 + 1] & 0x40000000) != 0;
    }

    public final Object m() {
        int n16;
        if (this.k <= 0 && (n16 = this.l) < this.m) {
            this.n = true;
            Object[] objectArray = this.d;
            this.l = n16 + 1;
            return objectArray[n16];
        }
        this.n = false;
        return j80.a;
    }

    public final Object n(int n16) {
        int[] nArray = this.b;
        int n17 = n16 * 5;
        if ((n16 = nArray[n17 + 1] & 0x40000000) != 0) {
            if (n16 != 0) {
                return this.d[nArray[n17 + 4]];
            }
            return j80.a;
        }
        return null;
    }

    public final int o(int n16) {
        return this.b[n16 * 5 + 1] & 0x3FFFFFF;
    }

    public final Object p(int[] nArray, int n16) {
        int n17 = n16 * 5;
        if ((0x20000000 & (n16 = nArray[n17 + 1])) != 0) {
            Object[] objectArray = this.d;
            n17 = nArray[n17 + 4];
            return objectArray[Integer.bitCount(n16 >> 30) + n17];
        }
        return null;
    }

    public final int q(int n16) {
        return this.b[n16 * 5 + 2];
    }

    public final void r(int n16) {
        if (this.k != 0) {
            l80.a("Cannot reposition while in an empty region");
        }
        this.g = n16;
        int[] nArray = this.b;
        int n17 = this.c;
        n16 = n16 < n17 ? nArray[n16 * 5 + 2] : -1;
        if (n16 != this.i) {
            this.i = n16;
            this.h = n16 < 0 ? n17 : nArray[n16 * 5 + 3] + n16;
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (this.k != 0) {
            l80.a("Cannot skip while in an empty region");
        }
        int n16 = this.g;
        int n17 = n16 * 5;
        int[] nArray = this.b;
        int n18 = nArray[n17 + 1];
        n18 = (0x40000000 & n18) != 0 ? 1 : (n18 &= 0x3FFFFFF);
        this.g = nArray[n17 + 3] + n16;
        return n18;
    }

    public final void t() {
        boolean bl5 = this.k == 0;
        if (!bl5) {
            l80.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        int n16 = this.g;
        int n17 = this.g();
        int n18 = this.i;
        int n19 = this.h;
        StringBuilder stringBuilder = b11.t("SlotReader(current=", ", key=", n16, n17, ", parent=");
        stringBuilder.append(n18);
        stringBuilder.append(", end=");
        stringBuilder.append(n19);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void u() {
        if (this.k <= 0) {
            int[] nArray = this.b;
            int n16 = this.g;
            int n17 = n16 * 5;
            int n18 = this.i;
            if (nArray[n17 + 2] != n18) {
                oo3.a("Invalid slot table detected");
            }
            n18 = this.l;
            int n19 = this.m;
            o02 o022 = this.j;
            if (n18 == 0 && n19 == 0) {
                o022.c(-1);
            } else {
                o022.c(n18);
            }
            this.i = n16;
            this.h = nArray[n17 + 3] + n16;
            this.g = n17 = n16 + 1;
            this.l = kg4.b(nArray, n16);
            n16 = n16 >= this.c - 1 ? this.e : nArray[n17 * 5 + 4];
            this.m = n16;
        }
    }
}

