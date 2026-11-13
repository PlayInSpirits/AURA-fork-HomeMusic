/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.er2;
import defpackage.fr2;
import defpackage.jx1;
import defpackage.kt2;
import defpackage.nl1;
import defpackage.o15;
import defpackage.tn2;
import defpackage.zr2;

public final class y90
implements Runnable {
    public final int n;
    public final tn2 o;
    public final fr2 p;

    public y90(tn2 tn22, fr2 fr22, int n16) {
        this.n = n16;
        this.o = tn22;
        this.p = fr22;
    }

    @Override
    public final void run() {
        block16: {
            tn2 tn22;
            block17: {
                int n16 = this.n;
                fr2 fr22 = this.p;
                tn22 = this.o;
                switch (n16) {
                    default: {
                        tn22.g.M0(fr22, Integer.MIN_VALUE);
                        return;
                    }
                    case 8: {
                        tn22.g.M0(fr22, Integer.MIN_VALUE);
                        return;
                    }
                    case 7: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
                        return;
                    }
                    case 6: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 3, kt2.Q0(new zr2(14)));
                        return;
                    }
                    case 5: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 11, kt2.Q0(new zr2(5)));
                        return;
                    }
                    case 4: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 12, kt2.Q0(new zr2(9)));
                        return;
                    }
                    case 3: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 7, kt2.Q0(new zr2(6)));
                        return;
                    }
                    case 2: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 9, kt2.Q0(new zr2(10)));
                        return;
                    }
                    case 1: {
                        tn22.g.O0(fr22, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
                        return;
                    }
                    case 0: 
                }
                if (tn22.l()) break block16;
                nl1 nl12 = tn22.F;
                Object object = fr22.d;
                object.getClass();
                o15 o152 = jx1.k(nl12.l(object)).h();
                while (o152.hasNext()) {
                    object = (String)o152.next();
                    er2 er22 = fr22.d;
                    er22.getClass();
                    tn22.E.remove(object, fr22);
                    nl12.remove(er22, object);
                }
                if (!tn22.y) break block17;
                if (tn2.m(fr22)) break block16;
                if (tn22.k(fr22)) {
                    tn22.y = false;
                }
            }
            tn22.e.getClass();
        }
    }
}

