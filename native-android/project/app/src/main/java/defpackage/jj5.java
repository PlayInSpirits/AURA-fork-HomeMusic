package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj5 extends kj5 {
    /* JADX WARN: Illegal instructions before constructor call */
    public jj5(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new hj5(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        nz2.c();
        throw null;
    }

    @Override // defpackage.kj5
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fu.R(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            hj5 hj5Var = this.a;
            char[] cArr = hj5Var.b;
            char[] cArr2 = hj5Var.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
