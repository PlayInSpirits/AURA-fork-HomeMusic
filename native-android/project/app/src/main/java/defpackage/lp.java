package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public lp(String r4, char[] r5, byte[] r6, boolean r7) {
        this.a = r4;
        r5.getClass();
        this.b = r5;
        int r8 = r5.length;     // Catch: ArithmeticException -> L10
        RoundingMode r0 = RoundingMode.UNNECESSARY;     // Catch: ArithmeticException -> L10
        int r9 = h12.F(r8);     // Catch: ArithmeticException -> L10
        this.d = r9;     // Catch: ArithmeticException -> L10
        int r1 = Integer.numberOfTrailingZeros(r9);
        int r2 = 1 << (3 - r1);
        this.e = r2;
        this.f = r9 >> r1;
        this.c = r5.length - 1;
        this.g = r6;
        boolean[] r10 = new boolean[r2];
        int r11 = 0;
    L6:
        if (r11 >= this.f) goto L8;
        int r3 = this.d;
        RoundingMode r12 = RoundingMode.CEILING;
        r10[h12.m(r11 * 8, r3)] = true;
        r11 = r11 + 1;
        goto L6
    L8:
        this.h = r7;
        return;
    L10:
        e = move-exception;
        throw new IllegalArgumentException("Illegal alphabet length " + r5.length, e);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof lp) == false) goto L10;
        lp r4 = (lp) r3;
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
        if (this.h == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 + r1;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        return this.a;
    }

    public lp(String r10, char[] r11) {
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
        kf2.n(gh0.s("Duplicate character: %s", new Object[]{Character.valueOf(r5)}));
        throw null;
    L19:
        kf2.n(gh0.s("Non-ASCII character: %s", new Object[]{Character.valueOf(r5)}));
        throw null;
    L8:
        r7 = false;
        goto L10
    L21:
        this(r10, r11, r1, false);
    }
}
