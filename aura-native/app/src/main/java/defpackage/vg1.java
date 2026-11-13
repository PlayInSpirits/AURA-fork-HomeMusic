package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vg1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final i03 e;
    public final rp4 f;

    public vg1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            oo3.a("Invalid start index");
        }
        this.d = new ArrayList();
        i03 i03Var = new i03();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i42 i42Var = (i42) this.a.get(i3);
            int i4 = i42Var.c;
            int i5 = i42Var.d;
            i03Var.i(i4, new hk1(i3, i2, i5));
            i2 += i5;
        }
        this.e = i03Var;
        this.f = new rp4(new ug1(this));
    }

    public final boolean a(int i, int i2) {
        hk1 hk1Var;
        int i3;
        int i4;
        i03 i03Var = this.e;
        hk1 hk1Var2 = (hk1) i03Var.b(i);
        if (hk1Var2 == null) {
            return false;
        }
        int i5 = hk1Var2.b;
        int i6 = i2 - hk1Var2.c;
        hk1Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = i03Var.c;
        long[] jArr = i03Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (hk1Var = (hk1) objArr[(i7 << 3) + i9]).b) >= i5 && hk1Var != hk1Var2 && (i4 = i3 + i6) >= 0) {
                        hk1Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
