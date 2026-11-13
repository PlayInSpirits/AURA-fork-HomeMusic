/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.j15;
import defpackage.jz4;
import defpackage.n82;
import defpackage.r70;
import defpackage.rg1;
import defpackage.wf1;
import defpackage.xl;

public final class m82
implements wf1 {
    public final Object n;
    public final int o;
    public final n82 p;
    public final r70 q;
    public final int r;

    public m82(Object object, int n16, n82 n822, r70 r702, int n17) {
        this.n = object;
        this.o = n16;
        this.p = n822;
        this.q = r702;
        this.r = n17;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        object = (rg1)object;
        ((Integer)object2).getClass();
        int n16 = xl.O(this.r | 1);
        jz4.b(this.n, this.o, this.p, this.q, (rg1)object, n16);
        return j15.a;
    }
}

