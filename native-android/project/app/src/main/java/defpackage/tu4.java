package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu4 {
    public final double a;
    public final double b;

    public tu4(double d, double d2) {
        new HashMap();
        this.a = d;
        this.b = d2;
    }

    public static tu4 a(double d, double d2) {
        ol1 ol1VarA = ol1.a(d, d2, 50.0d);
        double dAbs = Math.abs(ol1VarA.b - d2);
        for (double d3 = 1.0d; d3 < 50.0d && Math.round(d2) != Math.round(ol1VarA.b); d3 += 1.0d) {
            ol1 ol1VarA2 = ol1.a(d, d2, 50.0d + d3);
            double dAbs2 = Math.abs(ol1VarA2.b - d2);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                ol1VarA = ol1VarA2;
            }
            ol1 ol1VarA3 = ol1.a(d, d2, 50.0d - d3);
            double dAbs3 = Math.abs(ol1VarA3.b - d2);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                ol1VarA = ol1VarA3;
            }
        }
        return new tu4(d, d2);
    }
}
