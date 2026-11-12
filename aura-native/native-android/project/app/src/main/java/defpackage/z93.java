package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z93 extends e22 {
    public static final z93 f = new z93(0, 1, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        f13 f13Var;
        lv3 lv3Var = (lv3) x20Var.d(0);
        w03 w03Var = uy3Var.i;
        if (w03Var == null || ((ff3) w03Var.g(lv3Var)) == null) {
            return;
        }
        ArrayList arrayList = uy3Var.j;
        if (arrayList != null && (f13Var = (f13) arrayList.remove(arrayList.size() - 1)) != null) {
            uy3Var.e = f13Var;
        }
        w03Var.j(lv3Var);
    }
}
