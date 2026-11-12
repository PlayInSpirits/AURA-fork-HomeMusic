package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa3 extends e22 {
    public static final oa3 f = new oa3(0, 1, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        lv3 lv3Var = (lv3) x20Var.d(0);
        w03 w03Var = uy3Var.i;
        ff3 ff3Var = w03Var != null ? (ff3) w03Var.g(lv3Var) : null;
        if (ff3Var != null) {
            ArrayList arrayList = uy3Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                uy3Var.j = arrayList;
            }
            arrayList.add(uy3Var.e);
            uy3Var.e = ff3Var.o;
        }
    }
}
