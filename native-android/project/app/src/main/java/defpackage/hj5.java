package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hj5 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public hj5(String r4, char[] r5, byte[] r6, boolean r7) {
        this.a = r4;
        r5.getClass();
        this.b = r5;
        int r8 = r5.length;     // Catch: ArithmeticException -> L21
        RoundingMode r0 = RoundingMode.UNNECESSARY;     // Catch: ArithmeticException -> L21
        if (r8 <= 0) goto L26;
        switch(lj5.a[r0.ordinal()]) {
            case 1: goto L12;
            case 2: goto L13;
            case 3: goto L13;
            case 4: goto L10;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L9;
            case 8: goto L9;
            default: goto L8;
        };     // Catch: ArithmeticException -> L21
    L9:
        int r1 = Integer.numberOfLeadingZeros(r8);     // Catch: ArithmeticException -> L21
        int r2 = (31 - r1) + ((((-1257966797) >>> r1) - r8) >>> 31);     // Catch: ArithmeticException -> L21
    L14:
        this.d = r2;     // Catch: ArithmeticException -> L21
        int r9 = Integer.numberOfTrailingZeros(r2);
        int r3 = 1 << (3 - r9);
        this.e = r3;
        this.f = r2 >> r9;
        this.c = r8 - 1;
        this.g = r6;
        boolean[] r10 = new boolean[r3];
        int r11 = 0;
    L17:
        if (r11 >= this.f) goto L19;
        int r12 = this.d;
        RoundingMode r13 = RoundingMode.CEILING;
        r10[j51.V(r11 * 8, r12)] = true;
        r11 = r11 + 1;
        goto L17
    L19:
        this.h = r7;
        return;
    L10:
        r2 = 32 - Integer.numberOfLeadingZeros(r8 - 1);     // Catch: ArithmeticException -> L21
    L13:
        r2 = 31 - Integer.numberOfLeadingZeros(r8);     // Catch: ArithmeticException -> L21
        goto L14
    L8:
        throw new AssertionError();     // Catch: ArithmeticException -> L21
    L12:
        if (((r8 - 1) & r8) == 0) goto L13;
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");     // Catch: ArithmeticException -> L21
    L26:
        throw new IllegalArgumentException("x (0) must be > 0");     // Catch: ArithmeticException -> L21
    L21:
        e = move-exception;
        throw new IllegalArgumentException(f34.f(r5.length, "Illegal alphabet length "), e);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof hj5) == false) goto L10;
        hj5 r4 = (hj5) r3;
        if (this.h == r4.h) goto L7;
        return false;
    L7:
        if (Arrays.equals(this.b, r4.b) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = Arrays.hashCode(this.b);
        if (true == this.h) goto L5;
        int r2 = 1237;
    L7:
        return r0 + r2;
    L5:
        r2 = 1231;
        goto L7
    }

    public final String toString() {
        return this.a;
    }

    public hj5(String r10, char[] r11) {
        byte[] r1 = new byte[128];
        Arrays.fill(r1, (byte) -1);
        int r4 = 0;
    L4:
        if (r4 >= r11.length) goto L21;
        char r5 = r11[r4];
        boolean r6 = true;
        if (r5 >= 128) goto L8;
        boolean r7 = true;
    L10:
        if (r7 == false) goto L19;
        if (r1[r5] == (-1)) goto L15;
        r6 = false;
    L15:
        if (r6 == false) goto L17;
        r1[r5] = (byte) r4;
        r4 = r4 + 1;
        goto L4
    L17:
        kf2.n(hw.S("Duplicate character: %s", new Object[]{Character.valueOf(r5)}));
        throw null;
    L19:
        kf2.n(hw.S("Non-ASCII character: %s", new Object[]{Character.valueOf(r5)}));
        throw null;
    L8:
        r7 = false;
        goto L10
    L21:
        this(r10, r11, r1, false);
    }
}
