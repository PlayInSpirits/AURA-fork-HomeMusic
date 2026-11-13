/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bm2;
import defpackage.gn2;
import defpackage.iw;
import defpackage.mm2;
import defpackage.pu1;
import defpackage.uw1;
import defpackage.xl2;
import defpackage.yw1;
import java.util.List;

public final class ml2
implements xl2 {
    public final bm2 n;
    public final List o;
    public final int p;
    public final long q;

    public ml2(bm2 bm22, List list, int n16, long l16) {
        this.n = bm22;
        this.o = list;
        this.p = n16;
        this.q = l16;
    }

    @Override
    public final void d(pu1 pu12, int n16) {
        List list;
        mm2 mm22 = this.n.c;
        uw1 uw12 = yw1.j();
        for (int i16 = 0; i16 < (list = this.o).size(); ++i16) {
            uw12.c(((gn2)list.get(i16)).c(true));
        }
        pu12.u(mm22, n16, new iw(uw12.f()), this.p, this.q);
    }
}

