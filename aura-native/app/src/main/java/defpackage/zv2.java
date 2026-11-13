package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zv2 {
    public final SparseArray a;
    public k05 b;

    public zv2(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(k05 k05Var, int i, int i2) {
        int a = k05Var.a(i);
        SparseArray sparseArray = this.a;
        zv2 zv2Var = sparseArray == null ? null : (zv2) sparseArray.get(a);
        if (zv2Var == null) {
            zv2Var = new zv2(1);
            sparseArray.put(k05Var.a(i), zv2Var);
        }
        if (i2 > i) {
            zv2Var.a(k05Var, i + 1, i2);
        } else {
            zv2Var.b = k05Var;
        }
    }
}
