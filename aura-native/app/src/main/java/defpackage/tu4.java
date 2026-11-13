package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tu4 {
    public final double a;
    public final double b;

    public tu4(double d, double d2) {
        new HashMap();
        this.a = d;
        this.b = d2;
    }

    public static tu4 a(double d, double d2) {
        double d3;
        double d4;
        ol1 a = ol1.a(d, d2, 50.0d);
        double abs = Math.abs(a.b - d2);
        double d5 = 1.0d;
        while (true) {
            if (d5 >= 50.0d) {
                d3 = d2;
                d4 = d;
                break;
            }
            if (Math.round(d2) == Math.round(a.b)) {
                d4 = d;
                d3 = d2;
                break;
            }
            ol1 a2 = ol1.a(d, d2, 50.0d + d5);
            double abs2 = Math.abs(a2.b - d2);
            if (abs2 < abs) {
                abs = abs2;
                a = a2;
            }
            ol1 a3 = ol1.a(d, d2, 50.0d - d5);
            double abs3 = Math.abs(a3.b - d2);
            if (abs3 < abs) {
                abs = abs3;
                a = a3;
            }
            d5 += 1.0d;
        }
        return new tu4(d4, d3);
    }
}
