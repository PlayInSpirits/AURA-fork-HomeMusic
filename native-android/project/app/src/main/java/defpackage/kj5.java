package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kj5 {
    public static final ij5 d = null;
    public final hj5 a;
    public final Character b;
    public volatile kj5 c;

    static {
        new jj5("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new jj5("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new kj5("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new kj5("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new ij5(new hj5("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public kj5(hj5 r3, Character r4) {
        this.a = r3;
        if (r4 == null) goto L11;
        byte[] r5 = r3.g;
        if (r5.length <= 61) goto L11;
        if (r5[61] == (-1)) goto L11;
        kf2.n(hw.S("Padding character %s was already in alphabet", new Object[]{r4}));
        throw null;
    L11:
        this.b = r4;
    }

    public void a(StringBuilder r5, byte[] r6, int r7) {
        int r1 = 0;
        fu.R(0, r7, r6.length);
    L3:
        if (r1 >= r7) goto L5;
        hj5 r0 = this.a;
        b(r5, r6, r1, Math.min(r0.f, r7 - r1));
        r1 = r1 + r0.f;
        goto L3
    }

    public final void b(StringBuilder r10, byte[] r11, int r12, int r13) {
        fu.R(r12, r12 + r13, r11.length);
        hj5 r0 = this.a;
        int r1 = r0.f;
        int r2 = r0.d;
        if (r13 > r1) goto L18;
        int r3 = 0;
        long r4 = 0;
        int r5 = 0;
    L6:
        if (r5 >= r13) goto L8;
        r4 = (r4 | ((long) (r11[r12 + r5] & 255))) << 8;
        r5 = r5 + 1;
        goto L6
    L8:
        int r14 = (r13 + 1) * 8;
    L10:
        if (r3 >= (r13 * 8)) goto L13;
        r10.append(r0.b[((int) (r4 >>> ((r14 - r2) - r3))) & r0.c]);
        r3 = r3 + r2;
        goto L10
    L13:
        if (this.b != null) goto L15;
        return;
    L15:
        if (r3 >= (r0.f * 8)) goto L23;
        r10.append('=');
        r3 = r3 + r2;
        goto L15
    L23:
        return;
    L18:
        nz2.c();
    }

    public final String c(int r5, byte[] r6) {
        fu.R(0, r5, r6.length);
        hj5 r1 = this.a;
        int r2 = r1.f;
        RoundingMode r3 = RoundingMode.CEILING;
        int r4 = j51.V(r5, r2);
        StringBuilder r0 = new StringBuilder(r1.e * r4);
        a(r0, r6, r5);     // Catch: IOException -> L6
        return r0.toString();
    L6:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof kj5) == false) goto L10;
        kj5 r5 = (kj5) r4;
        if (this.a.equals(r5.a) == false) goto L10;
        if (Objects.equals(this.b, r5.b) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode();
        return Objects.hashCode(this.b) ^ r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("BaseEncoding.");
        hj5 r1 = this.a;
        r0.append(r1);
        if ((8 % r1.d) == 0) goto L9;
        Character r3 = this.b;
        if (r3 != null) goto L7;
        r0.append(".omitPadding()");
        goto L9
    L7:
        r0.append(".withPadChar('");
        r0.append(r3);
        r0.append("')");
    L9:
        return r0.toString();
    }

    public kj5(String r3, String r4) {
        this(new hj5(r3, r4.toCharArray()), '=');
    }
}
