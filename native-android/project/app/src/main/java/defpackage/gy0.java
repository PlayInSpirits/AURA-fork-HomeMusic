package defpackage;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 {
    public final Function a;
    public final Function b;
    public final Function c;
    public final Function d;
    public final Function e;
    public final Function f;
    public final Function g;
    public final Function h;
    public final HashMap i = new HashMap();

    public gy0(Function function, Function function2, Function function3, zh2 zh2Var, Function function4, Function function5, Function function6, Function function7) {
        this.a = function;
        this.b = function2;
        this.c = function3;
        this.d = zh2Var;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = function7;
    }

    public static double a(d64 d64Var, Function function, Function function2, BiFunction biFunction, Function function3, Function function4, dy0 dy0Var, Function function5) {
        double dDoubleValue = ((Double) function.apply(d64Var)).doubleValue();
        gy0 gy0Var = function3 == null ? null : (gy0) function3.apply(d64Var);
        if (gy0Var == null) {
            return dDoubleValue;
        }
        double D = ji2.D(dDoubleValue, ((Double) gy0Var.c.apply(d64Var)).doubleValue());
        Double d = (Double) function2.apply(gy0Var);
        double dDoubleValue2 = d.doubleValue();
        double dDoubleValue3 = ((Double) biFunction.apply(Double.valueOf(D), d)).doubleValue();
        double D2 = ji2.D(dDoubleValue2, dDoubleValue3);
        double dDoubleValue4 = dy0Var == null ? 1.0d : Double.valueOf(dy0Var.b).doubleValue();
        double dDoubleValue5 = 21.0d;
        if (function5 != null && function5.apply(Double.valueOf(D)) != null) {
            dDoubleValue5 = ((Double) function5.apply(Double.valueOf(D))).doubleValue();
        }
        if (D2 < dDoubleValue4) {
            dDoubleValue5 = dDoubleValue4;
        } else if (D2 <= dDoubleValue5) {
            dDoubleValue5 = D2;
        }
        if (dDoubleValue5 != D2) {
            dDoubleValue3 = b(dDoubleValue2, dDoubleValue5);
        }
        Function function6 = gy0Var.e;
        if ((function6 == null || function6.apply(d64Var) == null) && Math.round(dDoubleValue3) < 60 && Math.round(dDoubleValue3) > 49) {
            dDoubleValue3 = 49.0d;
        }
        uu4 uu4Var = function4 == null ? null : (uu4) function4.apply(d64Var);
        if (uu4Var != null) {
            gy0 gy0Var2 = uu4Var.a;
            double dDoubleValue6 = ((Double) function2.apply(gy0Var2)).doubleValue();
            double dAbs = Math.abs(dDoubleValue3 - dDoubleValue6);
            if (dAbs < 15.0d) {
                int iW = xa3.w(uu4Var.b);
                if (iW == 0) {
                    double d2 = dDoubleValue6 + 15.0d;
                    if (d2 < 0.0d) {
                        return 0.0d;
                    }
                    if (d2 > 100.0d) {
                        return 100.0d;
                    }
                    return d2;
                }
                if (iW == 1) {
                    double d3 = dDoubleValue6 - 15.0d;
                    if (d3 < 0.0d) {
                        return 0.0d;
                    }
                    if (d3 > 100.0d) {
                        return 100.0d;
                    }
                    return d3;
                }
                if (iW == 2) {
                    boolean z = dDoubleValue > ((Double) gy0Var2.c.apply(d64Var)).doubleValue();
                    double dAbs2 = Math.abs(dAbs - 15.0d);
                    return (!z ? dDoubleValue3 < dAbs2 : dDoubleValue3 + dAbs2 <= 100.0d) ? dDoubleValue3 - dAbs2 : dDoubleValue3 + dAbs2;
                }
            }
        }
        return dDoubleValue3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[RETURN] */
    public static double b(double d, double d2) {
        double d3;
        double d4;
        double dB;
        double dB2;
        double dMax;
        double D;
        double D2;
        boolean z;
        if (d >= 0.0d && d <= 100.0d) {
            d3 = 16.0d;
            double dR = h12.R(d);
            d4 = 116.0d;
            double d5 = ((dR + 5.0d) * d2) - 5.0d;
            if (d5 >= 0.0d && d5 <= 100.0d) {
                double dE = ji2.E(d5, dR);
                double dAbs = Math.abs(dE - d2);
                if (dE >= d2 || dAbs <= 0.04d) {
                    dB = ((h12.B(d5 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
                    if (dB < 0.0d || dB > 100.0d) {
                    }
                }
            }
            if (dB < 0.0d) {
                dB = 100.0d;
            }
            if (d >= 0.0d || d > 100.0d) {
                dB2 = -1.0d;
            } else {
                double dR2 = h12.R(d);
                double d6 = ((dR2 + 5.0d) / d2) - 5.0d;
                if (d6 < 0.0d || d6 > 100.0d) {
                    dB2 = -1.0d;
                } else {
                    double dE2 = ji2.E(dR2, d6);
                    double dAbs2 = Math.abs(dE2 - d2);
                    if (dE2 >= d2 || dAbs2 <= 0.04d) {
                        dB2 = ((h12.B(d6 / 100.0d) * d4) - d3) - 0.4d;
                        if (dB2 < 0.0d || dB2 > 100.0d) {
                            dB2 = -1.0d;
                        }
                    } else {
                        dB2 = -1.0d;
                    }
                }
            }
            dMax = Math.max(0.0d, dB2);
            D = ji2.D(dB, d);
            D2 = ji2.D(dMax, d);
            if (Math.round(d) < 60) {
                if (D2 < d2 || D2 >= D) {
                    return dMax;
                }
                return dB;
            }
            if (Math.abs(D - D2) < 0.1d || D >= d2 || D2 >= d2) {
                z = false;
            } else {
                z = true;
            }
            if (D < d2 || D >= D2 || z) {
                return dB;
            }
            return dMax;
        }
        d3 = 16.0d;
        d4 = 116.0d;
        dB = -1.0d;
        if (dB < 0.0d) {
            dB = 100.0d;
        }
        if (d >= 0.0d) {
            dB2 = -1.0d;
        } else {
            dB2 = -1.0d;
        }
        dMax = Math.max(0.0d, dB2);
        D = ji2.D(dB, d);
        D2 = ji2.D(dMax, d);
        if (Math.round(d) < 60) {
            if (D2 < d2) {
            }
            return dMax;
        }
        if (Math.abs(D - D2) < 0.1d) {
            z = false;
        } else {
            z = false;
        }
        if (D < d2) {
        }
        return dB;
    }

    public static gy0 c(final Function function, final Function function2, final Function function3, final Function function4) {
        final int i = 0;
        final int i2 = 1;
        return new gy0(new Function() { // from class: ey0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i3 = i;
                Function function5 = function;
                d64 d64Var = (d64) obj;
                switch (i3) {
                    case 0:
                        return Double.valueOf(((tu4) function5.apply(d64Var)).a);
                    default:
                        return Double.valueOf(((tu4) function5.apply(d64Var)).b);
                }
            }
        }, new Function() { // from class: ey0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i3 = i2;
                Function function5 = function;
                d64 d64Var = (d64) obj;
                switch (i3) {
                    case 0:
                        return Double.valueOf(((tu4) function5.apply(d64Var)).a);
                    default:
                        return Double.valueOf(((tu4) function5.apply(d64Var)).b);
                }
            }
        }, function2, null, function3, new Function() { // from class: fy0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        d64 d64Var = (d64) obj;
                        zx0 zx0Var = new zx0(d64Var, 1);
                        Function function5 = function2;
                        Function function6 = function3;
                        return Double.valueOf(gy0.a(d64Var, function5, zx0Var, new by0(function5, d64Var, function6), function6, function4, null, new m7(23)));
                    default:
                        d64 d64Var2 = (d64) obj;
                        zx0 zx0Var2 = new zx0(d64Var2, 2);
                        Function function7 = function3;
                        return Double.valueOf(gy0.a(d64Var2, function2, zx0Var2, new ay0(function7, d64Var2), function7, function4, null, null));
                }
            }
        }, new Function() { // from class: fy0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i2) {
                    case 0:
                        d64 d64Var = (d64) obj;
                        zx0 zx0Var = new zx0(d64Var, 1);
                        Function function5 = function2;
                        Function function6 = function3;
                        return Double.valueOf(gy0.a(d64Var, function5, zx0Var, new by0(function5, d64Var, function6), function6, function4, null, new m7(23)));
                    default:
                        d64 d64Var2 = (d64) obj;
                        zx0 zx0Var2 = new zx0(d64Var2, 2);
                        Function function7 = function3;
                        return Double.valueOf(gy0.a(d64Var2, function2, zx0Var2, new ay0(function7, d64Var2), function7, function4, null, null));
                }
            }
        }, function4);
    }

    public final double d(d64 d64Var) {
        double D;
        double dMin;
        Function function = this.c;
        final double dDoubleValue = ((Double) function.apply(d64Var)).doubleValue();
        double d = d64Var.d;
        int i = 1;
        boolean z = d < 0.0d;
        Function function2 = this.g;
        Function function3 = this.f;
        if (d != 0.0d) {
            double dDoubleValue2 = ((Double) function.apply(d64Var)).doubleValue();
            dDoubleValue = dDoubleValue2 + (Math.abs(d) * (((Double) (z ? function3.apply(d64Var) : function2.apply(d64Var))).doubleValue() - dDoubleValue2));
        }
        Function function4 = this.e;
        gy0 gy0Var = function4 == null ? null : (gy0) function4.apply(d64Var);
        if (gy0Var != null) {
            Function function5 = gy0Var.e;
            boolean z2 = (function5 == null || function5.apply(d64Var) == null) ? false : true;
            D = ji2.D(((Double) function.apply(d64Var)).doubleValue(), ((Double) gy0Var.c.apply(d64Var)).doubleValue());
            if (z) {
                double D2 = ji2.D(((Double) function3.apply(d64Var)).doubleValue(), ((Double) gy0Var.f.apply(d64Var)).doubleValue());
                if (z2) {
                    dMin = D2;
                }
            } else {
                double D3 = ji2.D(((Double) function2.apply(d64Var)).doubleValue(), ((Double) gy0Var.g.apply(d64Var)).doubleValue());
                dMin = z2 ? Math.min(D3, D) : 1.0d;
                D = z2 ? Math.max(D3, D) : 21.0d;
            }
            return a(d64Var, this.c, new zx0(d64Var, 0), new BiFunction() { // from class: cy0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return Double.valueOf(dDoubleValue);
                }
            }, new t8(i, gy0Var), this.h, new dy0(dMin, 0), new dy0(D, 1));
        }
        D = 21.0d;
        dMin = 1.0d;
        return a(d64Var, this.c, new zx0(d64Var, 0), new BiFunction() { // from class: cy0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(dDoubleValue);
            }
        }, new t8(i, gy0Var), this.h, new dy0(dMin, 0), new dy0(D, 1));
    }
}
