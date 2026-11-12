package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kj5 {
    public static final ij5 d;
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

    public kj5(hj5 hj5Var, Character ch) {
        this.a = hj5Var;
        if (ch != null) {
            byte[] bArr = hj5Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                kf2.n(hw.S("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fu.R(0, i, bArr.length);
        while (i2 < i) {
            hj5 hj5Var = this.a;
            b(sb, bArr, i2, Math.min(hj5Var.f, i - i2));
            i2 += hj5Var.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        fu.R(i, i + i2, bArr.length);
        hj5 hj5Var = this.a;
        int i3 = hj5Var.f;
        int i4 = hj5Var.d;
        if (i2 > i3) {
            nz2.c();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(hj5Var.b[((int) (j >>> ((i7 - i4) - i5))) & hj5Var.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < hj5Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(int i, byte[] bArr) {
        fu.R(0, i, bArr.length);
        hj5 hj5Var = this.a;
        int i2 = hj5Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(hj5Var.e * j51.V(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kj5) {
            kj5 kj5Var = (kj5) obj;
            if (this.a.equals(kj5Var.a) && Objects.equals(this.b, kj5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        hj5 hj5Var = this.a;
        sb.append(hj5Var);
        if (8 % hj5Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public kj5(String str, String str2) {
        this(new hj5(str, str2.toCharArray()), (Character) '=');
    }
}
