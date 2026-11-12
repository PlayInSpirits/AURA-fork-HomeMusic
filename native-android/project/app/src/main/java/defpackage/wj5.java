package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wj5 extends ak5 {
    public final rj5 n;

    public wj5(rj5 rj5Var) {
        this.n = rj5Var;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ak5 ak5Var = (ak5) obj;
        int iA = ak5Var.a();
        int iD = ak5.d((byte) 64);
        if (iD != iA) {
            return iD - ak5Var.a();
        }
        rj5 rj5Var = ((wj5) ak5Var).n;
        rj5 rj5Var2 = this.n;
        byte[] bArr = rj5Var2.o;
        int length = bArr.length;
        byte[] bArr2 = rj5Var.o;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return nj5.a.compare(rj5Var2.j(), rj5Var.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj5.class == obj.getClass()) {
            return this.n.equals(((wj5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) 64)), this.n});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        hj5 hj5Var;
        int i;
        boolean z;
        ij5 ij5Var = kj5.d;
        kj5 ij5Var2 = ij5Var.c;
        if (ij5Var2 == null) {
            hj5 hj5Var2 = ij5Var.a;
            char[] cArr = hj5Var2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    hj5Var = hj5Var2;
                    break;
                }
                char c = cArr[i2];
                if (c >= 'a' && c <= 'z') {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 97 && c3 <= 122) {
                                c3 ^= 32;
                            }
                            cArr2[i4] = (char) c3;
                        }
                        hj5Var = new hj5(hj5Var2.a.concat(".upperCase()"), cArr2);
                        byte[] bArr = hj5Var.g;
                        if (!hj5Var2.h || hj5Var.h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    kf2.o(hw.S("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        hj5Var = new hj5(hj5Var.a.concat(".ignoreCase()"), hj5Var.b, bArrCopyOf, true);
                        break;
                    }
                    kf2.o("Cannot call upperCase() on a mixed-case alphabet");
                    return null;
                }
                i2++;
            }
            ij5Var2 = hj5Var == hj5Var2 ? ij5Var : new ij5(hj5Var);
            ij5Var.c = ij5Var2;
        }
        byte[] bArrJ = this.n.j();
        return xa3.h("h'", ij5Var2.c(bArrJ.length, bArrJ), "'");
    }
}
