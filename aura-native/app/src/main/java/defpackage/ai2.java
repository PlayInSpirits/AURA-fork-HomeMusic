/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bi2;
import defpackage.d64;
import defpackage.gy0;
import defpackage.ol1;
import defpackage.tu4;
import defpackage.tv1;
import defpackage.vr1;
import java.util.function.Function;

public final class ai2
implements Function {
    public final int a;

    public ai2(int n16) {
        this.a = n16;
    }

    public ai2(tv1 tv12) {
        this.a = 6;
    }

    public final Object apply(Object object) {
        int n16 = this.a;
        double d16 = 30.0;
        double d17 = 40.0;
        double d18 = 60.0;
        double d19 = 20.0;
        double d26 = 100.0;
        double d27 = 10.0;
        double d28 = 90.0;
        switch (n16) {
            default: {
                if (!((d64)object).c) {
                    d18 = 50.0;
                }
                return d18;
            }
            case 28: {
                return ((d64)object).i;
            }
            case 27: {
                if (((d64)object).c) {
                    d26 = 4.0;
                }
                return d26;
            }
            case 26: {
                return ((d64)object).h;
            }
            case 25: {
                if (((d64)object).c) {
                    d17 = 80.0;
                }
                return d17;
            }
            case 24: {
                return ((d64)object).f;
            }
            case 23: {
                object = (d64)object;
                boolean bl5 = tv1.C((d64)object);
                boolean bl6 = ((d64)object).c;
                if (bl5) {
                    if (bl6) {
                        d26 = 10.0;
                    }
                    object = d26;
                } else {
                    if (!bl6) {
                        d19 = 100.0;
                    }
                    object = d19;
                }
                return object;
            }
            case 22: {
                return ((d64)object).f;
            }
            case 21: {
                object = (d64)object;
                boolean bl7 = tv1.C((d64)object);
                boolean bl8 = ((d64)object).c;
                if (bl7) {
                    if (!bl8) {
                        d27 = 90.0;
                    }
                    object = d27;
                } else {
                    if (!bl8) {
                        d19 = 100.0;
                    }
                    object = d19;
                }
                return object;
            }
            case 20: {
                d64 d642 = (d64)object;
                boolean bl9 = tv1.C(d642);
                object = d642.g;
                boolean bl10 = d642.c;
                if (bl9) {
                    if (!bl10) {
                        d18 = 49.0;
                    }
                    object = d18;
                } else if (!tv1.B(d642)) {
                    if (!bl10) {
                        d16 = 90.0;
                    }
                    object = d16;
                } else {
                    d27 = d642.a.c;
                    d27 = tv1.D(ol1.a(((tu4)object).a, ((tu4)object).b, d27), d642);
                    object = vr1.q((ol1)ol1.a((double)((tu4)object).a, (double)((tu4)object).b, (double)d27)).c;
                }
                return object;
            }
            case 19: {
                return ((d64)object).g;
            }
            case 18: {
                d27 = d28;
                if (((d64)object).c) {
                    d27 = 22.0;
                }
                return d27;
            }
            case 17: {
                return ((d64)object).h;
            }
            case 16: {
                if (!((d64)object).c) {
                    d27 = 90.0;
                }
                return d27;
            }
            case 15: {
                return ((d64)object).h;
            }
            case 14: {
                if (!((d64)object).c) {
                    d16 = 90.0;
                }
                return d16;
            }
            case 13: {
                return ((d64)object).i;
            }
            case 12: {
                return ((d64)object).g;
            }
            case 11: {
                return ((d64)object).e;
            }
            case 10: {
                if (!((d64)object).c) {
                    d27 = 90.0;
                }
                return d27;
            }
            case 9: {
                return ((d64)object).h;
            }
            case 8: {
                if (!((d64)object).c) {
                    d19 = 100.0;
                }
                return d19;
            }
            case 7: {
                return ((d64)object).j;
            }
            case 6: {
                object = (d64)object;
                return gy0.c(new bi2(15), new bi2(17), null, null);
            }
            case 5: {
                if (!((d64)object).c) {
                    d17 = 80.0;
                }
                return d17;
            }
            case 4: {
                return ((d64)object).e;
            }
            case 3: {
                if (!((d64)object).c) {
                    d27 = 90.0;
                }
                return d27;
            }
            case 2: {
                object = (d64)object;
                boolean bl11 = tv1.C((d64)object);
                boolean bl12 = ((d64)object).c;
                if (bl11) {
                    if (!bl12) {
                        d27 = 90.0;
                    }
                    object = d27;
                } else {
                    if (!bl12) {
                        d19 = 100.0;
                    }
                    object = d19;
                }
                return object;
            }
            case 1: {
                return ((d64)object).e;
            }
            case 0: 
        }
        d27 = ((d64)object).c ? 24.0 : 98.0;
        return d27;
    }
}

