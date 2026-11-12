package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y50 implements ui2 {
    public final fs a;

    public y50(fs fsVar) {
        this.a = fsVar;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 cf2Var, List list, long j) {
        int i;
        int[] iArr;
        int i2;
        int i3 = nc0.i(j);
        int iJ = nc0.j(j);
        int iG = nc0.g(j);
        int iH = nc0.h(j);
        int iV = cf2Var.V(0.0f);
        jg3[] jg3VarArr = new jg3[list.size()];
        int size = list.size();
        int[] iArr2 = new int[size];
        int i4 = 0;
        int i5 = 0;
        int iMin = 0;
        int iMax = 0;
        while (i4 < size) {
            pi2 pi2Var = (pi2) list.get(i4);
            pi2Var.t();
            int i6 = iG - i5;
            jg3 jg3VarR = jg3VarArr[i4];
            if (jg3VarR == null) {
                int i7 = Integer.MAX_VALUE;
                if (iG == Integer.MAX_VALUE) {
                    i = iG;
                    iArr = iArr2;
                } else {
                    i = iG;
                    iArr = iArr2;
                    if (i6 < 0) {
                        i2 = 0;
                        i7 = 0;
                    } else {
                        i7 = i6;
                    }
                    jg3VarR = pi2Var.r(qc0.a(i2, iH, i2, i7));
                }
                i2 = 0;
                jg3VarR = pi2Var.r(qc0.a(i2, iH, i2, i7));
            } else {
                i = iG;
                iArr = iArr2;
            }
            jg3 jg3Var = jg3VarR;
            int i8 = jg3Var.o;
            int i9 = jg3Var.n;
            iArr[i4] = i8;
            int i10 = i6 - i8;
            if (i10 < 0) {
                i10 = 0;
            }
            iMin = Math.min(iV, i10);
            i5 += i8 + iMin;
            iMax = Math.max(iMax, i9);
            jg3VarArr[i4] = jg3Var;
            i4++;
            iArr2 = iArr;
            iG = i;
        }
        int[] iArr3 = iArr2;
        int i11 = i5 - iMin;
        if (i11 < 0) {
            i11 = 0;
        }
        int iMax2 = Math.max(i11, i3);
        int i12 = 0;
        int iMax3 = Math.max(iMax, Math.max(iJ, 0));
        int[] iArr4 = new int[size];
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            int i15 = iArr3[i14];
            iArr4[i12] = i13;
            i13 += i15;
            i14++;
            i12++;
        }
        return cf2Var.v(iMax3, iMax2, v01.n, new x50(jg3VarArr, this, iMax3, cf2Var, iArr4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y50) && this.a.equals(((y50) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a) + (gi.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + gi.a + ", horizontalAlignment=" + this.a + ")";
    }
}
