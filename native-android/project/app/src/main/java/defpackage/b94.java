package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b94 extends yw {
    public final transient byte[][] r;
    public final transient int[] s;

    public b94(byte[][] bArr, int[] iArr) {
        super(yw.q.n);
        this.r = bArr;
        this.s = iArr;
    }

    @Override // defpackage.yw
    public final String a() {
        throw null;
    }

    @Override // defpackage.yw
    public final yw c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.r;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.s;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new yw(bArrDigest);
    }

    @Override // defpackage.yw
    public final int d() {
        return this.s[this.r.length - 1];
    }

    @Override // defpackage.yw
    public final String e() {
        return t().e();
    }

    @Override // defpackage.yw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yw) {
            yw ywVar = (yw) obj;
            if (ywVar.d() == d() && m(0, ywVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yw
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return t().f(i, bArr);
    }

    @Override // defpackage.yw
    public final byte[] h() {
        return s();
    }

    @Override // defpackage.yw
    public final int hashCode() {
        int i = this.o;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.r;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.s;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.o = i3;
        return i3;
    }

    @Override // defpackage.yw
    public final byte i(int i) {
        byte[][] bArr = this.r;
        int length = bArr.length - 1;
        int[] iArr = this.s;
        zz1.i(iArr[length], i, 1L);
        int iQ = wr1.Q(this, i);
        return bArr[iQ][(i - (iQ == 0 ? 0 : iArr[iQ - 1])) + iArr[bArr.length + iQ]];
    }

    @Override // defpackage.yw
    public final int j(byte[] bArr) {
        bArr.getClass();
        return t().j(bArr);
    }

    @Override // defpackage.yw
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iQ = wr1.Q(this, i);
        while (i < i4) {
            int[] iArr = this.s;
            int i5 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i6 = iArr[iQ] - i5;
            byte[][] bArr2 = this.r;
            int i7 = iArr[bArr2.length + iQ];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!zz1.e((i - i5) + i7, i2, iMin, bArr2[iQ], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iQ++;
        }
        return true;
    }

    @Override // defpackage.yw
    public final boolean m(int i, yw ywVar, int i2) {
        ywVar.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iQ = wr1.Q(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.s;
                int i5 = iQ == 0 ? 0 : iArr[iQ - 1];
                int i6 = iArr[iQ] - i5;
                byte[][] bArr = this.r;
                int i7 = iArr[bArr.length + iQ];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (ywVar.l(i4, (i - i5) + i7, iMin, bArr[iQ])) {
                    i4 += iMin;
                    i += iMin;
                    iQ++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.yw
    public final yw n(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            kf2.e(b11.j(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder sbJ = f34.j(i2, "endIndex=", " > length(");
            sbJ.append(d());
            sbJ.append(')');
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            kf2.e(xa3.e(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return yw.q;
        }
        int iQ = wr1.Q(this, i);
        int iQ2 = wr1.Q(this, i2 - 1);
        byte[][] bArr = this.r;
        byte[][] bArr2 = (byte[][]) ti.e0(bArr, iQ, iQ2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.s;
        if (iQ <= iQ2) {
            int i4 = iQ;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iQ2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iQ != 0 ? iArr2[iQ - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new b94(bArr2, iArr);
    }

    @Override // defpackage.yw
    public final yw p() {
        return t().p();
    }

    @Override // defpackage.yw
    public final void r(tv tvVar, int i) {
        int iQ = wr1.Q(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.s;
            int i3 = iQ == 0 ? 0 : iArr[iQ - 1];
            int i4 = iArr[iQ] - i3;
            byte[][] bArr = this.r;
            int i5 = iArr[bArr.length + iQ];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            t84 t84Var = new t84(bArr[iQ], i6, i6 + iMin, true);
            t84 t84Var2 = tvVar.n;
            if (t84Var2 == null) {
                t84Var.g = t84Var;
                t84Var.f = t84Var;
                tvVar.n = t84Var;
            } else {
                t84 t84Var3 = t84Var2.g;
                t84Var3.getClass();
                t84Var3.b(t84Var);
            }
            i2 += iMin;
            iQ++;
        }
        tvVar.o += (long) i;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.r;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.s;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ti.X(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final yw t() {
        return new yw(s());
    }

    @Override // defpackage.yw
    public final String toString() {
        return t().toString();
    }
}
