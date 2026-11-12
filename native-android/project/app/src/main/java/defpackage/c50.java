package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c50 {
    public static final c50 h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        h = new c50(1, 2, 3, null, -1, -1);
        String r0 = f35.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public c50(int r1, int r2, int r3, byte[] r4, int r5, int r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public static String a(int r1) {
        if (r1 != (-1)) goto L5;
        return "Unset color range";
    L5:
        if (r1 != 1) goto L7;
        return "Full range";
    L7:
        if (r1 != 2) goto L9;
        return "Limited range";
    L9:
        return f34.f(r1, "Undefined color range ");
    }

    public static String b(int r1) {
        if (r1 != (-1)) goto L5;
        return "Unset color space";
    L5:
        if (r1 != 6) goto L7;
        return "BT2020";
    L7:
        if (r1 != 1) goto L9;
        return "BT709";
    L9:
        if (r1 != 2) goto L11;
        return "BT601";
    L11:
        return f34.f(r1, "Undefined color space ");
    }

    public static String c(int r1) {
        if (r1 != (-1)) goto L5;
        return "Unset color transfer";
    L5:
        if (r1 != 10) goto L7;
        return "Gamma 2.2";
    L7:
        if (r1 != 1) goto L9;
        return "Linear";
    L9:
        if (r1 != 2) goto L11;
        return "sRGB";
    L11:
        if (r1 != 3) goto L13;
        return "SDR SMPTE 170M";
    L13:
        if (r1 != 6) goto L15;
        return "ST2084 PQ";
    L15:
        if (r1 != 7) goto L17;
        return "HLG";
    L17:
        return f34.f(r1, "Undefined color transfer ");
    }

    public static boolean e(c50 r4) {
        if (r4 != null) goto L5;
        return true;
    L5:
        int r1 = r4.a;
        if (r1 == (-1)) goto L9;
        if (r1 == 1) goto L9;
        if (r1 == 2) goto L9;
        return false;
    L9:
        int r2 = r4.b;
        if (r2 == (-1)) goto L12;
        if (r2 == 2) goto L12;
        return false;
    L12:
        int r3 = r4.c;
        if (r3 == (-1)) goto L17;
        if (r3 == 3) goto L17;
        return false;
    L17:
        if (r4.d != null) goto L29;
        int r5 = r4.f;
        if (r5 == (-1)) goto L21;
        if (r5 == 8) goto L21;
        return false;
    L21:
        int r6 = r4.e;
        if (r6 == (-1)) goto L24;
        if (r6 == 8) goto L24;
        return false;
    L24:
        return true;
    L29:
        return false;
    }

    public static int f(int r2) {
        if (r2 != 1) goto L5;
        return 1;
    L5:
        if (r2 != 9) goto L7;
        return 6;
    L7:
        if (r2 != 4) goto L9;
        return 2;
    L9:
        if (r2 == 5) goto L19;
        if (r2 != 6) goto L12;
        return 2;
    L12:
        if (r2 == 7) goto L21;
        return -1;
    L21:
        return 2;
    L19:
        return 2;
    }

    public static int g(int r3) {
        if (r3 != 1) goto L5;
        return 3;
    L5:
        if (r3 != 4) goto L7;
        return 10;
    L7:
        if (r3 != 13) goto L9;
        return 2;
    L9:
        if (r3 != 16) goto L11;
        return 6;
    L11:
        if (r3 == 18) goto L16;
        if (r3 == 6) goto L24;
        if (r3 == 7) goto L25;
        return -1;
    L25:
        return 3;
    L24:
        return 3;
    L16:
        return 7;
    }

    public final boolean d() {
        if (this.a != (-1)) goto L5;
        return false;
    L5:
        if (this.b != (-1)) goto L7;
        return false;
    L7:
        if (this.c == (-1)) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (c50.class != r5.getClass()) goto L23;
        c50 r6 = (c50) r5;
        if (this.a != r6.a) goto L23;
        if (this.b != r6.b) goto L23;
        if (this.c != r6.c) goto L23;
        if (Arrays.equals(this.d, r6.d) == false) goto L23;
        if (this.e != r6.e) goto L23;
        if (this.f != r6.f) goto L23;
        return true;
    }

    public final int hashCode() {
        if (this.g != 0) goto L6;
        int r0 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        this.g = ((((Arrays.hashCode(this.d) + r0) * 31) + this.e) * 31) + this.f;
    L6:
        return this.g;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ColorInfo(");
        r0.append(b(this.a));
        r0.append(", ");
        r0.append(a(this.b));
        r0.append(", ");
        r0.append(c(this.c));
        r0.append(", ");
        if (this.d == null) goto L5;
        boolean r2 = true;
    L6:
        r0.append(r2);
        r0.append(", ");
        String r3 = "NA";
        int r4 = this.e;
        if (r4 == (-1)) goto L9;
        String r5 = r4 + "bit Luma";
    L10:
        r0.append(r5);
        r0.append(", ");
        int r6 = this.f;
        if (r6 == (-1)) goto L14;
        r3 = r6 + "bit Chroma";
    L14:
        return b11.q(r0, r3, ")");
    L9:
        r5 = "NA";
        goto L10
    L5:
        r2 = false;
        goto L6
    }
}
