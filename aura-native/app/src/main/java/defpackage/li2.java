package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class li2 implements m84 {
    public final t20 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public li2(SparseArray sparseArray, long j, int i, long j2, long j3) {
        t20 t20Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            t20Var = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                ki2 ki2Var = (ki2) list.get(i4);
                jArr3[i4] = ki2Var.n;
                jArr[i4] = ki2Var.o;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                l93.q0("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            t20Var = new t20(iArr, jArr, jArr2, jArr3);
        }
        this.a = t20Var;
    }

    @Override // defpackage.m84
    public final boolean b() {
        List list = (List) this.b.get(this.d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        t20 t20Var = this.a;
        if (t20Var != null) {
            return t20Var.e(j);
        }
        o84 o84Var = o84.c;
        return new l84(o84Var, o84Var);
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
