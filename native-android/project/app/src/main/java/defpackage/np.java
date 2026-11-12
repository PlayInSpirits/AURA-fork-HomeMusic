package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np extends op {
    /* JADX WARN: Illegal instructions before constructor call */
    public np(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new lp(str, charArray), (Character) '=');
        rr2.l(charArray.length == 64);
    }

    @Override // defpackage.op
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        rr2.u(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            lp lpVar = this.a;
            char[] cArr = lpVar.b;
            char[] cArr2 = lpVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            a(sb, bArr, i2, i - i2);
        }
    }
}
