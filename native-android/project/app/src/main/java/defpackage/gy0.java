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
    public final HashMap i;

    public gy0(Function r2, Function r3, Function r4, zh2 r5, Function r6, Function r7, Function r8, Function r9) {
        this.i = new HashMap();
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
    }

    public static double a(d64 r20, Function r21, Function r22, BiFunction r23, Function r24, Function r25, dy0 r26, Function r27) {
        double r7 = ((Double) r21.apply(r20)).doubleValue();
        if (r24 != null) goto L5;
        gy0 r2 = null;
    L6:
        if (r2 != null) goto L8;
        return r7;
    L8:
        double r9 = ji2.D(r7, ((Double) r2.c.apply(r20)).doubleValue());
        Double r11 = (Double) r22.apply(r2);
        double r12 = r11.doubleValue();
        double r14 = ((Double) r23.apply(Double.valueOf(r9), r11)).doubleValue();
        double r16 = ji2.D(r12, r14);
        if (r26 != null) goto L11;
        double r18 = 1.0d;
    L12:
        double r4 = 21.0d;
        if (r27 == null) goto L20;
        if (r27.apply(Double.valueOf(r9)) == null) goto L20;
        r4 = ((Double) r27.apply(Double.valueOf(r9))).doubleValue();
    L20:
        if (r16 >= r18) goto L23;
        r4 = r18;
    L27:
        if (r4 == r16) goto L30;
        r14 = b(r12, r4);
    L30:
        Function r3 = r2.e;
        if (r3 == null) goto L35;
        if (r3.apply(r20) == null) goto L35;
    L40:
        if (r25 != null) goto L42;
        uu4 r5 = null;
    L43:
        if (r5 == null) goto L54;
        gy0 r6 = r5.a;
        double r8 = ((Double) r22.apply(r6)).doubleValue();
        double r10 = Math.abs(r14 - r8);
        if (r10 >= 15.0d) goto L54;
        int r1 = xa3.w(r5.b);
        if (r1 == 0) goto L77;
        boolean r13 = true;
        if (r1 != 1) goto L53;
        double r15 = r8 - 15.0d;
        if (r15 >= 0.0d) goto L74;
        return 0.0d;
    L74:
        if (r15 <= 100.0d) goto L76;
        return 100.0d;
    L76:
        return r15;
    L53:
        if (r1 != 2) goto L54;
        if (r7 > ((Double) r6.c.apply(r20)).doubleValue()) goto L59;
        r13 = false;
    L59:
        double r0 = Math.abs(r10 - 15.0d);
        if (r13 == false) goto L65;
        if ((r14 + r0) <= 100.0d) goto L67;
    L69:
        return r14 - r0;
    L67:
        return r14 + r0;
    L65:
        if (r14 >= r0) goto L69;
    L77:
        double r17 = r8 + 15.0d;
        if (r17 >= 0.0d) goto L81;
        return 0.0d;
    L81:
        if (r17 <= 100.0d) goto L83;
        return 100.0d;
    L83:
        return r17;
    L54:
        return r14;
    L42:
        r5 = (uu4) r25.apply(r20);
    L35:
        if (Math.round(r14) >= 60) goto L40;
        if (Math.round(r14) <= 49) goto L40;
        r14 = 49.0d;
        goto L40
    L23:
        if (r16 > r4) goto L27;
        r4 = r16;
        goto L27
    L11:
        r18 = Double.valueOf(r26.b).doubleValue();
        goto L12
    L5:
        r2 = (gy0) r24.apply(r20);
        goto L6
    }

    public static double b(double r25, double r27) {
        if (r25 >= 0.0d) goto L5;
    L6:
        double r19 = 16.0d;
        double r23 = 116.0d;
    L16:
        double r5 = -1.0d;
    L23:
        if (r5 >= 0.0d) goto L25;
        r5 = 100.0d;
    L25:
        if (r25 >= 0.0d) goto L27;
    L38:
        double r7 = -1.0d;
    L44:
        double r2 = Math.max(0.0d, r7);
        double r8 = ji2.D(r5, r25);
        double r9 = ji2.D(r2, r25);
        if (Math.round(r25) >= 60) goto L61;
        if (Math.abs(r8 - r9) < 0.1d) goto L49;
    L53:
        boolean r0 = false;
    L55:
        if (r8 < r27) goto L57;
    L65:
        return r5;
    L57:
        if (r8 >= r9) goto L65;
        if (r0 == true) goto L65;
    L66:
        return r2;
    L49:
        if (r8 >= r27) goto L53;
        if (r9 >= r27) goto L53;
        r0 = true;
        goto L55
    L61:
        if (r9 >= r27) goto L66;
        if (r9 < r8) goto L65;
    L27:
        if (r25 > 100.0d) goto L38;
        double r10 = h12.R(r25);
        double r13 = ((r10 + 5.0d) / r27) - 5.0d;
        if (r13 < 0.0d) goto L38;
        if (r13 > 100.0d) goto L38;
        double r11 = ji2.E(r10, r13);
        double r21 = Math.abs(r11 - r27);
        if (r11 < r27) goto L37;
    L39:
        r7 = ((h12.B(r13 / 100.0d) * r23) - r19) - 0.4d;
        if (r7 < 0.0d) goto L38;
        if (r7 <= 100.0d) goto L44;
    L37:
        if (r21 <= 0.04d) goto L39;
    L5:
        if (r25 > 100.0d) goto L6;
        r19 = 16.0d;
        double r6 = h12.R(r25);
        r23 = 116.0d;
        double r12 = ((r6 + 5.0d) * r27) - 5.0d;
        if (r12 < 0.0d) goto L16;
        if (r12 > 100.0d) goto L16;
        double r14 = ji2.E(r12, r6);
        double r22 = Math.abs(r14 - r27);
        if (r14 < r27) goto L15;
    L17:
        r5 = ((h12.B(r12 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (r5 < 0.0d) goto L16;
        if (r5 <= 100.0d) goto L23;
    L15:
        if (r22 <= 0.04d) goto L17;
        goto L16
    }

    public static gy0 c(final Function r9, final Function r10, final Function r11, final Function r12) {
        final int r2 = 0;
        final int r4 = 1;
        return new gy0(new ey0(r9, r2), new ey0(r9, r4), r10, null, r11, new fy0(r10, r11, r12, r2), new fy0(r10, r11, r12, r4), r12);
    }

    public final double d(d64 r17) {
        Function r2 = this.c;
        final double r3 = ((Double) r2.apply(r17)).doubleValue();
        double r5 = r17.d;
        int r11 = 1;
        if (r5 >= 0.0d) goto L5;
        boolean r9 = true;
    L6:
        Function r8 = this.g;
        Function r12 = this.f;
        if (r5 == 0.0d) goto L14;
        double r4 = ((Double) r2.apply(r17)).doubleValue();
        if (r9 == false) goto L12;
        Object r7 = r12.apply(r17);
    L13:
        r3 = r4 + (Math.abs(r5) * (((Double) r7).doubleValue() - r4));
        goto L14
    L12:
        r7 = r8.apply(r17);
    L14:
        Function r6 = this.e;
        if (r6 != null) goto L17;
        gy0 r10 = null;
    L18:
        if (r10 == null) goto L37;
        Function r15 = r10.e;
        if (r15 != null) goto L22;
    L24:
        boolean r16 = false;
    L25:
        double r13 = ji2.D(((Double) r2.apply(r17)).doubleValue(), ((Double) r10.c.apply(r17)).doubleValue());
        if (r9 == false) goto L30;
        double r14 = ji2.D(((Double) r12.apply(r17)).doubleValue(), ((Double) r10.f.apply(r17)).doubleValue());
        if (r16 == false) goto L38;
        double r18 = r14;
    L40:
        return a(r17, this.c, new zx0(r17, 0), new cy0(r3), new t8(r11, r10), this.h, new dy0(r18, 0), new dy0(r13, 1));
    L38:
        r18 = 1.0d;
        goto L40
    L30:
        double r19 = ji2.D(((Double) r8.apply(r17)).doubleValue(), ((Double) r10.g.apply(r17)).doubleValue());
        if (r16 == false) goto L33;
        r18 = Math.min(r19, r13);
    L34:
        if (r16 == false) goto L36;
        r13 = Math.max(r19, r13);
        goto L40
    L36:
        r13 = 21.0d;
        goto L40
    L33:
        r18 = 1.0d;
        goto L34
    L22:
        if (r15.apply(r17) == null) goto L24;
        r16 = true;
        goto L25
    L37:
        r13 = 21.0d;
        goto L38
    L17:
        r10 = (gy0) r6.apply(r17);
        goto L18
    L5:
        r9 = false;
        goto L6
    }
}
