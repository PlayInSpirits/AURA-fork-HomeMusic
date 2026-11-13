package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class kg4 {
    public static final int a(ArrayList arrayList, int i, int i2) {
        int e = e(arrayList, i, i2);
        return e >= 0 ? e : -(e + 1);
    }

    public static final int b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void c(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final ig4 d(ig4 ig4Var) {
        if (!(ig4Var instanceof ig4)) {
            ig4Var = null;
        }
        if (ig4Var != null) {
            return ig4Var;
        }
        l80.b("Inconsistent composition");
        er1.a();
        return null;
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((mg1) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int j = h12.j(i5, i);
            if (j < 0) {
                i3 = i4 + 1;
            } else {
                if (j <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
