/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ay0;
import defpackage.by0;
import defpackage.d64;
import defpackage.gy0;
import defpackage.m7;
import defpackage.ol1;
import defpackage.tu4;
import defpackage.tv1;
import defpackage.zx0;
import java.util.function.Function;

public final class zh2
implements Function {
    public final int a;

    public zh2(int n16) {
        this.a = n16;
    }

    public zh2(tv1 tv12) {
        this.a = 26;
    }

    public final Object apply(Object object) {
        int n16 = this.a;
        double d16 = 100.0;
        double d17 = 85.0;
        double d18 = 98.0;
        double d19 = 10.0;
        double d26 = 80.0;
        double d27 = 6.0;
        double d28 = 90.0;
        switch (n16) {
            default: {
                return ((d64)object).h;
            }
            case 28: {
                if (((d64)object).c) {
                    d26 = 30.0;
                }
                return d26;
            }
            case 27: {
                return ((d64)object).i;
            }
            case 26: {
                object = (d64)object;
                return gy0.c(new zh2(19), new zh2(20), null, null);
            }
            case 25: {
                if (((d64)object).c) {
                    d19 = 90.0;
                }
                return d19;
            }
            case 24: {
                return ((d64)object).h;
            }
            case 23: {
                d28 = ((d64)object).c ? 17.0 : 92.0;
                return d28;
            }
            case 22: {
                return ((d64)object).h;
            }
            case 21: {
                return ((d64)object).h;
            }
            case 20: {
                if (((d64)object).c) {
                    d18 = 6.0;
                }
                return d18;
            }
            case 19: {
                return ((d64)object).h;
            }
            case 18: {
                object = (d64)object;
                if (tv1.B((d64)object)) {
                    object = tv1.D(((d64)object).a, (d64)object);
                } else {
                    n16 = ((d64)object).b;
                    boolean bl5 = ((d64)object).c;
                    if (n16 == 1) {
                        if (!bl5) {
                            d17 = 25.0;
                        }
                        object = d17;
                    } else {
                        if (bl5) {
                            d28 = 30.0;
                        }
                        object = d28;
                    }
                }
                return object;
            }
            case 17: {
                return ((d64)object).e;
            }
            case 16: {
                object = (d64)object;
                return gy0.a((d64)object, new m7(29), new zx0((d64)object, 2), new ay0(null, (d64)object), null, null, null, null);
            }
            case 15: {
                object = (d64)object;
                zh2 zh22 = new zh2(0);
                return gy0.a((d64)object, zh22, new zx0((d64)object, 1), new by0(zh22, (d64)object, null), null, null, null, new m7(23));
            }
            case 14: {
                d28 = ((d64)object).c ? 0.2 : 0.12;
                return d28;
            }
            case 13: {
                if (!((d64)object).c) {
                    d16 = 0.0;
                }
                return d16;
            }
            case 12: {
                object = (d64)object;
                return 0.0;
            }
            case 11: {
                if (((d64)object).c) {
                    d18 = 6.0;
                }
                return d18;
            }
            case 10: {
                d64 d642 = (d64)object;
                boolean bl6 = tv1.C(d642);
                tu4 tu42 = d642.f;
                boolean bl7 = d642.c;
                if (bl6) {
                    if (bl7) {
                        d17 = 30.0;
                    }
                    object = d17;
                } else {
                    d28 = bl7 ? 30.0 : 90.0;
                    if (!tv1.B(d642)) {
                        object = d28;
                    } else {
                        d16 = tu42.a;
                        d19 = tu42.b;
                        Object object2 = ol1.a(d16, d19, d28);
                        d26 = ((ol1)object2).b;
                        d18 = d28;
                        if (d26 < d19) {
                            while (true) {
                                d18 = d28;
                                if (!(((ol1)object2).b < d19)) break;
                                d18 = !bl7 ? -1.0 : 1.0;
                                ol1 ol12 = ol1.a(d16, d19, d28 += d18);
                                d18 = ol12.b;
                                if (d26 > d18) {
                                    d18 = d28;
                                    break;
                                }
                                if (Math.abs(d18 - d19) < 0.4) {
                                    d18 = d28;
                                    break;
                                }
                                object = object2;
                                if (Math.abs(ol12.b - d19) < Math.abs(((ol1)object2).b - d19)) {
                                    object = ol12;
                                }
                                d26 = Math.max(d26, ol12.b);
                                object2 = object;
                            }
                        }
                        object = tv1.D(ol1.a(tu42.a, tu42.b, d18), d642);
                    }
                }
                return object;
            }
            case 9: {
                return ((d64)object).f;
            }
            case 8: {
                if (!((d64)object).c) {
                    d19 = 96.0;
                }
                return d19;
            }
            case 7: {
                return ((d64)object).h;
            }
            case 6: {
                if (((d64)object).c) {
                    d28 = 30.0;
                }
                return d28;
            }
            case 5: {
                return ((d64)object).e;
            }
            case 4: {
                if (!((d64)object).c) {
                    d26 = 30.0;
                }
                return d26;
            }
            case 3: {
                return ((d64)object).i;
            }
            case 2: {
                d28 = ((d64)object).c ? d27 : 87.0;
                return d28;
            }
            case 1: {
                return ((d64)object).h;
            }
            case 0: 
        }
        if (!((d64)object).c) {
            d16 = 0.0;
        }
        return d16;
    }
}

