/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f34;
import defpackage.gg1;
import defpackage.h12;
import defpackage.kx3;
import defpackage.lx3;
import java.io.Serializable;

public abstract class a6
implements gg1,
Serializable {
    public final Object n;
    public final Class o;
    public final String p;
    public final String q;
    public final boolean r;
    public final int s;
    public final int t;

    public a6(int n16, int n17, Class clazz, Object object, String string, String string2) {
        this.n = object;
        this.o = clazz;
        this.p = string;
        this.q = string2;
        this.r = false;
        this.s = n16;
        this.t = n17 >> 1;
    }

    public final boolean equals(Object object) {
        block3: {
            block2: {
                if (this == object) break block2;
                if (!(object instanceof a6)) break block3;
                object = (a6)object;
                if (this.r != ((a6)object).r || this.s != ((a6)object).s || this.t != ((a6)object).t || !h12.c(this.n, ((a6)object).n) || !this.o.equals(((a6)object).o) || !this.p.equals(((a6)object).p) || !this.q.equals(((a6)object).q)) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int getArity() {
        return this.s;
    }

    public final int hashCode() {
        Object object = this.n;
        int n16 = object != null ? object.hashCode() : 0;
        int n17 = this.o.hashCode();
        n16 = f34.e(this.p, (n17 + n16 * 31) * 31, 31);
        n17 = f34.e(this.q, n16, 31);
        n16 = this.r ? 1231 : 1237;
        return ((n17 + n16) * 31 + this.s) * 31 + this.t;
    }

    public final String toString() {
        kx3.a.getClass();
        return lx3.a(this);
    }
}

