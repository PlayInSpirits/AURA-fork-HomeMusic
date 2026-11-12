package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 implements gf1 {
    public final /* synthetic */ vg1 n;

    public ug1(vg1 vg1Var) {
        this.n = vg1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [i42, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [q03] */
    /* JADX WARN: Type inference failed for: r9v2, types: [q03] */
    @Override // defpackage.gf1
    public final Object invoke() {
        ArrayList arrayList = this.n.a;
        w03 w03Var = new w03(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r4 = (i42) arrayList.get(i);
            Object obj = r4.b;
            int i2 = r4.a;
            Object b32Var = obj != null ? new b32(Integer.valueOf(i2), r4.b) : Integer.valueOf(i2);
            int iF = w03Var.f(b32Var);
            boolean z = iF < 0;
            Object obj2 = z ? null : w03Var.c[iF];
            if (obj2 != null) {
                if (obj2 instanceof q03) {
                    ?? r8 = (q03) obj2;
                    r8.a(r4);
                    r4 = r8;
                } else {
                    Object[] objArr = t73.a;
                    ?? q03Var = new q03(2);
                    q03Var.a(obj2);
                    q03Var.a(r4);
                    r4 = q03Var;
                }
            }
            if (z) {
                int i3 = ~iF;
                w03Var.b[i3] = b32Var;
                w03Var.c[i3] = r4;
            } else {
                w03Var.c[iF] = r4;
            }
        }
        return new mz2(w03Var);
    }
}
