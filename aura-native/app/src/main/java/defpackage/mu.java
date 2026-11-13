/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.cf2;
import defpackage.hs;
import defpackage.if1;
import defpackage.ig3;
import defpackage.j15;
import defpackage.jg3;
import defpackage.lu;
import defpackage.ou;
import defpackage.pi2;
import defpackage.r62;

public final class mu
implements if1 {
    public final jg3 n;
    public final pi2 o;
    public final cf2 p;
    public final int q;
    public final int r;
    public final ou s;

    public mu(jg3 jg32, pi2 pi22, cf2 cf22, int n16, int n17, ou ou5) {
        this.n = jg32;
        this.o = pi22;
        this.p = cf22;
        this.q = n16;
        this.r = n17;
        this.s = ou5;
    }

    @Override
    public final Object invoke(Object object) {
        ig3 ig32 = (ig3)object;
        object = this.p.getLayoutDirection();
        hs hs5 = this.s.a;
        lu.a(ig32, this.n, this.o, (r62)((Object)object), this.q, this.r, hs5);
        return j15.a;
    }
}

