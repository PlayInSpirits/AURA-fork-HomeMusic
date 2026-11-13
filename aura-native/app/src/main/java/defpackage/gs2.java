/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.util.SparseBooleanArray;
import defpackage.al3;
import defpackage.fr2;
import defpackage.gr2;
import defpackage.ju2;
import defpackage.la0;
import defpackage.ls2;
import defpackage.mi3;
import defpackage.qi3;
import defpackage.rr2;
import defpackage.tn2;
import defpackage.w71;

public final class gs2
implements Runnable {
    public final la0 n;
    public final gr2 o;
    public final boolean p;
    public final boolean q;
    public final fr2 r;

    public gs2(la0 la02, gr2 gr22, boolean bl5, boolean bl6, fr2 fr22) {
        this.n = la02;
        this.o = gr22;
        this.p = bl5;
        this.q = bl6;
        this.r = fr22;
    }

    @Override
    public final void run() {
        boolean bl5;
        tn2 tn22 = ((ls2)this.n.q).g;
        Object object = tn22.s;
        ju2.f((qi3)object, this.o);
        int n16 = ((al3)object).g();
        if (this.p) {
            if (n16 == 1) {
                if (((al3)object).S0(2)) {
                    ((al3)object).b();
                }
            } else if (n16 == 4 && ((al3)object).S0(4)) {
                ((al3)object).C();
            }
        }
        if ((bl5 = this.q) && ((al3)object).S0(1)) {
            ((al3)object).m0();
        }
        object = new SparseBooleanArray();
        for (int n17 : new int[]{31, 2}) {
            rr2.w(false ^ true);
            ((SparseBooleanArray)object).append(n17, true);
        }
        if (bl5) {
            rr2.w(false ^ true);
            ((SparseBooleanArray)object).append(1, true);
        }
        rr2.w(false ^ true);
        object = new mi3(new w71((SparseBooleanArray)object));
        tn22.v(this.r, (mi3)object);
    }
}

