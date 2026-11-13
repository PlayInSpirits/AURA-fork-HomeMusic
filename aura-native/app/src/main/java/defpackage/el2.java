/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bm2;
import defpackage.gn2;
import defpackage.pu1;
import defpackage.xl2;

public final class el2
implements xl2 {
    public final bm2 n;
    public final gn2 o;
    public final long p;

    public el2(bm2 bm22, gn2 gn22, long l16) {
        this.n = bm22;
        this.o = gn22;
        this.p = l16;
    }

    @Override
    public final void d(pu1 pu12, int n16) {
        pu12.l(this.n.c, n16, this.o.c(true), this.p);
    }
}

