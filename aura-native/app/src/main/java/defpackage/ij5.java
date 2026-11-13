package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ij5 extends kj5 {
    public final char[] e;

    public ij5(hj5 hj5Var) {
        super(hj5Var, (Character) null);
        this.e = new char[512];
        char[] cArr = hj5Var.b;
        if (cArr.length != 16) {
            nz2.c();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.kj5
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        fu.R(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
