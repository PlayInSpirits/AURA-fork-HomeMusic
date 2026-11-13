/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.cf2;
import defpackage.hx3;
import defpackage.if1;
import defpackage.ig3;
import defpackage.j15;
import defpackage.jg3;
import defpackage.lu;
import defpackage.ou;
import defpackage.pi2;
import java.util.List;

public final class nu
implements if1 {
    public final jg3[] n;
    public final List o;
    public final cf2 p;
    public final hx3 q;
    public final hx3 r;
    public final ou s;

    public nu(jg3[] jg3Array, List list, cf2 cf22, hx3 hx32, hx3 hx33, ou ou5) {
        this.n = jg3Array;
        this.o = list;
        this.p = cf22;
        this.q = hx32;
        this.r = hx33;
        this.s = ou5;
    }

    @Override
    public final Object invoke(Object object) {
        ig3 ig32 = (ig3)object;
        jg3[] jg3Array = this.n;
        int n16 = jg3Array.length;
        int n17 = 0;
        int n18 = 0;
        while (n18 < n16) {
            object = jg3Array[n18];
            object.getClass();
            lu.a(ig32, (jg3)object, (pi2)this.o.get(n17), this.p.getLayoutDirection(), this.q.n, this.r.n, this.s.a);
            ++n18;
            ++n17;
        }
        return j15.a;
    }
}

