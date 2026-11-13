/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import defpackage.al3;
import defpackage.bm2;
import defpackage.eg1;
import defpackage.fr2;
import defpackage.ho2;
import defpackage.it2;
import defpackage.jn2;
import defpackage.kf2;
import defpackage.lm2;
import defpackage.m92;
import defpackage.mw1;
import defpackage.oi3;
import defpackage.pi3;
import defpackage.q9;
import defpackage.qc2;
import defpackage.qn2;
import defpackage.rn2;
import defpackage.tn2;
import defpackage.va4;
import defpackage.wc0;

public final class ij0
implements qc2,
eg1,
lm2,
wc0,
it2 {
    public final int n;
    public final int o;

    public ij0(int n16, int n17) {
        this.n = n17;
        this.o = n16;
    }

    public ij0(int n16, va4 va42, Bundle bundle, Bundle bundle2) {
        this.n = 5;
        this.o = n16;
    }

    public ij0(q9 q96, int n16, pi3 pi32, pi3 pi33) {
        this.n = 0;
        this.o = n16;
    }

    public ij0(String string, int n16, int n17, jn2 jn22) {
        this.n = 9;
        this.o = n17;
    }

    @Override
    public void accept(Object object) {
        int n16 = this.n;
        int n17 = this.o;
        object = (al3)object;
        switch (n16) {
            default: {
                ((al3)object).G0(n17);
                return;
            }
            case 8: {
                ((al3)object).p0(n17);
                return;
            }
            case 7: {
                ((al3)object).J(n17);
                return;
            }
            case 6: 
        }
        ((al3)object).d0(n17);
    }

    @Override
    public Object apply(Object object) {
        object = (Integer)object;
        return this.o;
    }

    @Override
    public void c(bm2 bm22) {
        if (!bm22.Y() || bm22.l.get(this.o) == null) {
            return;
        }
        kf2.k();
    }

    @Override
    public Object h(tn2 tn22, fr2 fr22, int n16) {
        Object object = tn22.D;
        tn22.B(fr22);
        object.getClass();
        object = new mw1(m92.b(-6));
        ((mw1)object).f(new qn2(tn22, (mw1)object, fr22, this.o, 1), new rn2(tn22, 0));
        return object;
    }

    @Override
    public void invoke(Object object) {
        int n16 = this.n;
        int n17 = this.o;
        switch (n16) {
            default: {
                ((oi3)object).f(n17);
                return;
            }
            case 2: {
                ((oi3)object).b(n17);
                return;
            }
            case 1: {
                ((oi3)object).f(n17);
                return;
            }
            case 0: 
        }
        object = (ho2)object;
        object.getClass();
        if (n17 == 1) {
            ((ho2)object).v = true;
        }
        ((ho2)object).l = n17;
    }
}

