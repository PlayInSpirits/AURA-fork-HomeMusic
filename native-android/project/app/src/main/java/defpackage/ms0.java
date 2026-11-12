package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ms0 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double r2) {
        if (rr2.I(r2) == true) goto L5;
        return false;
    L5:
        if (r2 != 0.0d) goto L7;
        return true;
    L7:
        if ((52 - Long.numberOfTrailingZeros(rr2.G(r2))) > Math.getExponent(r2)) goto L13;
        return true;
    L13:
        return false;
    }

    public static boolean b(double r4) {
        if (r4 > 0.0d) goto L5;
    L10:
        return false;
    L5:
        if (rr2.I(r4) == false) goto L10;
        long r5 = rr2.G(r4);
        if ((r5 & (r5 - 1)) != 0) goto L10;
        return true;
    }

    public static int c(double r6) {
        RoundingMode r0 = RoundingMode.CEILING;
        boolean r2 = false;
        if (r6 > 0.0d) goto L5;
    L7:
        boolean r1 = false;
    L8:
        rr2.k("x must be positive and finite", r1);
        int r3 = Math.getExponent(r6);
        if (Math.getExponent(r6) < (-1022)) goto L30;
        switch(ls0.a[r0.ordinal()]) {
            case 1: goto L25;
            case 2: goto L26;
            case 3: goto L24;
            case 4: goto L21;
            case 5: goto L17;
            case 6: goto L14;
            case 7: goto L14;
            case 8: goto L14;
            default: goto L13;
        };
    L14:
        double r7 = Double.longBitsToDouble((Double.doubleToRawLongBits(r6) & 4503599627370495L) | 4607182418800017408L);
        if ((r7 * r7) <= 2.0d) goto L26;
        r2 = true;
        goto L26
    L17:
        if (r3 < 0) goto L19;
        r2 = true;
    L19:
        boolean r8 = b(r6);
    L20:
        r2 = r2 & (!r8);
        goto L26
    L21:
        if (r3 >= 0) goto L23;
        r2 = true;
    L23:
        r8 = b(r6);
        goto L20
    L24:
        r2 = !b(r6);
        goto L26
    L25:
        l93.n(b(r6));
    L26:
        if (r2 == true) goto L28;
        return r3;
    L28:
        return r3 + 1;
    L13:
        throw new AssertionError();
    L30:
        return c(r6 * 4.503599627370496E15d) - 52;
    L5:
        if (rr2.I(r6) == false) goto L7;
        r1 = true;
        goto L8
    }
}
