/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dx2;
import defpackage.gi1;
import defpackage.hd3;
import defpackage.hs;
import defpackage.i80;
import defpackage.j15;
import defpackage.rg1;
import defpackage.wf1;
import defpackage.xl;

public final class yv1
implements wf1 {
    public final hd3 n;
    public final String o;
    public final dx2 p;
    public final hs q;
    public final i80 r;
    public final float s;
    public final int t;
    public final int u;

    public yv1(hd3 hd32, String string, dx2 dx22, hs hs5, i80 i802, float f16, int n16, int n17) {
        this.n = hd32;
        this.o = string;
        this.p = dx22;
        this.q = hs5;
        this.r = i802;
        this.s = f16;
        this.t = n16;
        this.u = n17;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        object = (rg1)object;
        ((Integer)object2).getClass();
        int n16 = xl.O(this.t | 1);
        gi1.c(this.n, this.o, this.p, this.q, this.r, this.s, (rg1)object, n16, this.u);
        return j15.a;
    }
}

