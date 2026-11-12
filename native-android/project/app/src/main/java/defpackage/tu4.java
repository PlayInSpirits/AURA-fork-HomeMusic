package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu4 {
    public final double a;
    public final double b;

    public tu4(double r2, double r4) {
        new HashMap();
        this.a = r2;
        this.b = r4;
    }

    public static tu4 a(double r16, double r18) {
        ol1 r7 = ol1.a(r16, r18, 50.0d);
        double r12 = Math.abs(r7.b - r18);
        double r14 = 1.0d;
    L4:
        if (r14 >= 50.0d) goto L17;
        if (Math.round(r18) == Math.round(r7.b)) goto L17;
        ol1 r4 = ol1.a(r16, r18, 50.0d + r14);
        double r0 = Math.abs(r4.b - r18);
        if (r0 >= r12) goto L11;
        r12 = r0;
        r7 = r4;
    L11:
        ol1 r5 = ol1.a(r16, r18, 50.0d - r14);
        double r1 = Math.abs(r5.b - r18);
        if (r1 >= r12) goto L14;
        r12 = r1;
        r7 = r5;
    L14:
        r14 = r14 + 1.0d;
    L17:
        return new tu4(r16, r18);
    }
}
