/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dx2;
import defpackage.j15;
import defpackage.jz4;
import defpackage.rg1;
import defpackage.wf1;
import defpackage.xl;
import defpackage.zs4;

public final class lr
implements wf1 {
    public final String n;
    public final dx2 o;
    public final zs4 p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;

    public lr(String string, dx2 dx22, zs4 zs42, int n16, boolean bl5, int n17, int n18, int n19) {
        this.n = string;
        this.o = dx22;
        this.p = zs42;
        this.q = n16;
        this.r = bl5;
        this.s = n17;
        this.t = n18;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        object = (rg1)object;
        ((Integer)object2).getClass();
        int n16 = xl.O(1);
        jz4.a(this.n, this.o, this.p, this.q, this.r, this.s, this.t, (rg1)object, n16);
        return j15.a;
    }
}

