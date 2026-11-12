package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final zg5 d;
    public final int e;
    public final int f;
    public final boolean g;

    public xp0(zg5 zg5Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = zg5Var;
        int iU = zg5Var.u();
        this.e = iU;
        int iT = zg5Var.t();
        this.f = iT;
        this.g = true;
        wp0 wp0Var = arrayList.isEmpty() ? null : (wp0) arrayList.get(0);
        if (wp0Var == null || wp0Var.a != 0 || wp0Var.b != 0) {
            arrayList.add(0, new wp0(0, 0, 0));
        }
        arrayList.add(new wp0(iU, iT, 0));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            wp0 wp0Var2 = (wp0) obj;
            for (int i4 = 0; i4 < wp0Var2.c; i4++) {
                int i5 = wp0Var2.a + i4;
                int i6 = wp0Var2.b + i4;
                int i7 = zg5Var.l(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.g) {
            int size2 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                wp0 wp0Var3 = (wp0) obj2;
                while (true) {
                    i = wp0Var3.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size3 = arrayList.size();
                            int i10 = 0;
                            for (int i11 = 0; i11 < size3; i11++) {
                                wp0 wp0Var4 = (wp0) arrayList.get(i11);
                                while (true) {
                                    i2 = wp0Var4.b;
                                    if (i10 < i2) {
                                        if (iArr2[i10] == 0 && zg5Var.m(i8, i10)) {
                                            int i12 = zg5Var.l(i8, i10) ? 8 : 4;
                                            iArr[i8] = (i10 << 4) | i12;
                                            iArr2[i10] = i12 | (i8 << 4);
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                i10 = wp0Var4.c + i2;
                            }
                        }
                        i8++;
                    }
                }
                i8 = wp0Var3.c + i;
            }
        }
    }

    public static yp0 a(ArrayDeque arrayDeque, int i, boolean z) {
        yp0 yp0Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                yp0Var = null;
                break;
            }
            yp0Var = (yp0) it.next();
            if (yp0Var.a == i && yp0Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            yp0 yp0Var2 = (yp0) it.next();
            if (z) {
                yp0Var2.b--;
            } else {
                yp0Var2.b++;
            }
        }
        return yp0Var;
    }
}
