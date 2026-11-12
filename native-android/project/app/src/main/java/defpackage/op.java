package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class op {
    public static final mp d;
    public final lp a;
    public final Character b;
    public volatile op c;

    static {
        new np("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new np("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new op("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new op("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new mp(new lp("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public op(lp lpVar, Character ch) {
        boolean z;
        this.a = lpVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = lpVar.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        rr2.o(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final void a(StringBuilder sb, byte[] bArr, int i, int i2) {
        rr2.u(i, i + i2, bArr.length);
        lp lpVar = this.a;
        int i3 = lpVar.f;
        int i4 = lpVar.d;
        int i5 = 0;
        rr2.l(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(lpVar.b[((int) (j >>> (i7 - i5))) & lpVar.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < lpVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        rr2.u(0, i, bArr.length);
        while (i2 < i) {
            lp lpVar = this.a;
            a(sb, bArr, i2, Math.min(lpVar.f, i - i2));
            i2 += lpVar.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof op) {
            op opVar = (op) obj;
            if (this.a.equals(opVar.a) && Objects.equals(this.b, opVar.b)) {
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
        lp lpVar = this.a;
        sb.append(lpVar);
        if (8 % lpVar.d != 0) {
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

    public op(String str, String str2) {
        this(new lp(str, str2.toCharArray()), (Character) '=');
    }
}
