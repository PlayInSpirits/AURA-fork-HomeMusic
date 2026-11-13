/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f12;
import defpackage.j15;
import defpackage.nc3;
import defpackage.rc3;
import defpackage.rg1;
import defpackage.ue1;
import defpackage.wf1;
import defpackage.yf1;

public final class mc3
implements wf1 {
    public final nc3 n;
    public final int o;

    public mc3(nc3 nc32, int n16) {
        this.n = nc32;
        this.o = n16;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        int n16;
        boolean bl5 = ((n16 = ((Integer)object2).intValue()) & 3) != 2;
        if (((rg1)(object = (rg1)object)).K(n16 & 1, bl5)) {
            object2 = this.n.b.a;
            int n17 = this.o;
            object2 = ((ue1)object2).j(n17);
            n16 = ((f12)object2).a;
            ((yf1)((f12)object2).c.o).d(rc3.a, n17 - n16, object, 0);
        } else {
            ((rg1)object).N();
        }
        return j15.a;
    }
}

