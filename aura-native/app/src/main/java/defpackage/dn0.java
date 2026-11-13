/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.en0;
import defpackage.fn0;
import defpackage.gy3;
import defpackage.jn0;
import defpackage.mn0;
import defpackage.pn0;
import defpackage.sv4;
import defpackage.uw1;
import defpackage.yw1;

public final class dn0
implements mn0 {
    public final pn0 n;
    public final jn0 o;
    public final boolean p;
    public final int[] q;

    public dn0(pn0 pn02, jn0 jn02, boolean bl5, int[] nArray) {
        this.n = pn02;
        this.o = jn02;
        this.p = bl5;
        this.q = nArray;
    }

    @Override
    public final gy3 g(int n16, sv4 sv42, int[] nArray) {
        Object object = this.n;
        object.getClass();
        jn0 jn02 = this.o;
        object = new en0((pn0)object, jn02);
        int n17 = this.q[n16];
        uw1 uw12 = yw1.j();
        for (int i16 = 0; i16 < sv42.a; ++i16) {
            uw12.c(new fn0(n16, sv42, i16, jn02, nArray[i16], this.p, (en0)object, n17));
        }
        return uw12.f();
    }
}

