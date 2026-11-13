package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c50 {
    public static final c50 h = new c50(1, 2, 3, null, -1, -1);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = f35.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public c50(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String a(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? f34.f(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? f34.f(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? f34.f(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(c50 c50Var) {
        if (c50Var == null) {
            return true;
        }
        int i2 = c50Var.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = c50Var.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = c50Var.c;
        if ((i4 != -1 && i4 != 3) || c50Var.d != null) {
            return false;
        }
        int i5 = c50Var.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = c50Var.e;
        return i6 == -1 || i6 == 8;
    }

    public static int f(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c50.class == obj.getClass()) {
            c50 c50Var = (c50) obj;
            if (this.a == c50Var.a && this.b == c50Var.b && this.c == c50Var.c && Arrays.equals(this.d, c50Var.d) && this.e == c50Var.e && this.f == c50Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return b11.q(sb, str2, ")");
    }
}
