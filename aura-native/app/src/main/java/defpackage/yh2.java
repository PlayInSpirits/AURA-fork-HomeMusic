/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ai2;
import defpackage.bi2;
import defpackage.d64;
import defpackage.gy0;
import defpackage.m7;
import defpackage.tv1;
import defpackage.uu4;
import java.util.function.Function;

public final class yh2
implements Function {
    public final int a;
    public final tv1 b;

    public yh2(tv1 tv12, int n16) {
        this.a = n16;
        this.b = tv12;
    }

    public final Object apply(Object object) {
        int n16 = this.a;
        double d16 = 10.0;
        int n17 = 1;
        int n18 = 1;
        int n19 = 1;
        int n26 = 1;
        Object object2 = this.b;
        switch (n16) {
            default: {
                object = (d64)object;
                return ((tv1)object2).x();
            }
            case 13: {
                object = (d64)object;
                object2 = ((tv1)object2).x();
                if (!((d64)object).c) {
                    n26 = 2;
                }
                return new uu4((gy0)object2, n26);
            }
            case 12: {
                object = (d64)object;
                return ((tv1)object2).F();
            }
            case 11: {
                object = (d64)object;
                if (!tv1.B((d64)object)) {
                    if (((d64)object).c) {
                        d16 = 90.0;
                    }
                    object = d16;
                } else {
                    object = gy0.b((Double)((tv1)object2).F().c.apply(object), 4.5);
                }
                return object;
            }
            case 10: {
                object = (d64)object;
                return ((tv1)object2).G();
            }
            case 9: {
                object = (d64)object;
                boolean bl5 = tv1.C((d64)object);
                boolean bl6 = ((d64)object).c;
                if (bl5) {
                    d16 = bl6 ? 0.0 : 100.0;
                    object = d16;
                } else if (!tv1.B((d64)object)) {
                    if (bl6) {
                        d16 = 90.0;
                    }
                    object = d16;
                } else {
                    object = gy0.b((Double)((tv1)object2).G().c.apply(object), 4.5);
                }
                return object;
            }
            case 8: {
                object = (d64)object;
                return gy0.c(new m7(27), new m7(28), new bi2((tv1)object2, 26), new yh2((tv1)object2, 1));
            }
            case 7: {
                object = (d64)object;
                object2 = ((tv1)object2).F();
                n26 = ((d64)object).c ? n17 : 2;
                return new uu4((gy0)object2, n26);
            }
            case 6: {
                object = (d64)object;
                return gy0.c(new ai2(24), new ai2(25), new bi2((tv1)object2, 26), new yh2((tv1)object2, 7));
            }
            case 5: {
                object = (d64)object;
                return ((tv1)object2).E();
            }
            case 4: {
                object = (d64)object;
                if (tv1.B((d64)object)) {
                    object = gy0.b((Double)((tv1)object2).E().c.apply(object), 4.5);
                } else {
                    n26 = ((d64)object).b;
                    boolean bl7 = ((d64)object).c;
                    if (n26 == 1) {
                        d16 = bl7 ? 0.0 : 100.0;
                        object = d16;
                    } else {
                        if (bl7) {
                            d16 = 90.0;
                        }
                        object = d16;
                    }
                }
                return object;
            }
            case 3: {
                object = (d64)object;
                return gy0.c(new bi2(5), new bi2(7), new bi2((tv1)object2, 26), new yh2((tv1)object2, 13));
            }
            case 2: {
                object = (d64)object;
                return gy0.c(new bi2(24), new bi2(25), new bi2((tv1)object2, 26), new yh2((tv1)object2, 0));
            }
            case 1: {
                object = (d64)object;
                object2 = ((tv1)object2).G();
                n26 = ((d64)object).c ? n18 : 2;
                return new uu4((gy0)object2, n26);
            }
            case 0: 
        }
        object = (d64)object;
        object2 = ((tv1)object2).E();
        n26 = ((d64)object).c ? n19 : 2;
        return new uu4((gy0)object2, n26);
    }
}

