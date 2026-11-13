package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        int j2 = nc0.j(j);
        int g = nc0.g(j);
        int h = nc0.h(j);
        int V = cf2Var.V(0.0f);
        jg3[] jg3VarArr = new jg3[list.size()];
        int size = list.size();
        int[] iArr2 = new int[size];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            pi2 pi2Var = (pi2) list.get(i4);
            pi2Var.t();
            int i8 = g - i5;
            jg3 jg3Var = jg3VarArr[i4];
            if (jg3Var == null) {
                int i9 = Integer.MAX_VALUE;
                if (g == Integer.MAX_VALUE) {
                    i = g;
                    iArr = iArr2;
                } else {
                    i = g;
                    iArr = iArr2;
                    if (i8 < 0) {
                        i2 = 0;
                        i9 = 0;
                        jg3Var = pi2Var.r(qc0.a(i2, h, i2, i9));
                    } else {
                        i9 = i8;
                    }
                }
                i2 = 0;
                jg3Var = pi2Var.r(qc0.a(i2, h, i2, i9));
            } else {
                i = g;
                iArr = iArr2;
            }
            jg3 jg3Var2 = jg3Var;
            int i10 = jg3Var2.o;
            int i11 = jg3Var2.n;
            iArr[i4] = i10;
            int i12 = i8 - i10;
            if (i12 < 0) {
                i12 = 0;
            }
            i6 = Math.min(V, i12);
            i5 += i10 + i6;
            i7 = Math.max(i7, i11);
            jg3VarArr[i4] = jg3Var2;
            i4++;
            iArr2 = iArr;
            g = i;
        }
        int[] iArr3 = iArr2;
        int i13 = i5 - i6;
        if (i13 < 0) {
            i13 = 0;
        }
        int max = Math.max(i13, i3);
        int i14 = 0;
        int max2 = Math.max(i7, Math.max(j2, 0));
        int[] iArr4 = new int[size];
        int i15 = 0;
        int i16 = 0;
        while (i16 < size) {
            int i17 = iArr3[i16];
            iArr4[i14] = i15;
            i15 += i17;
            i16++;
            i14++;
        }
        return cf2Var.v(max2, max, v01.n, new x50(jg3VarArr, this, max2, cf2Var, iArr4));
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
