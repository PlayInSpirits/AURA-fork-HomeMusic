/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bu4;
import defpackage.go4;
import defpackage.pe4;
import defpackage.qe4;

public final class ee4
implements go4 {
    public final qe4 n;
    public final boolean o;
    public final pe4 p;
    public final int q;
    public final long r;

    public ee4(qe4 qe42, boolean bl5, pe4 pe42, int n16, long l16) {
        this.n = qe42;
        this.o = bl5;
        this.p = pe42;
        this.q = n16;
        this.r = l16;
    }

    @Override
    public final Object get() {
        boolean bl5 = this.o;
        pe4 pe42 = this.p;
        if (bl5) {
            return pe42;
        }
        bu4 bu42 = this.n.b;
        return qe4.k1(pe42, null, this.q, this.r, bu42);
    }
}

