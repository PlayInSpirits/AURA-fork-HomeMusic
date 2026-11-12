package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia3 extends e22 {
    public static final ia3 f = new ia3(0, 1, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        lv3 lv3Var = (lv3) x20Var.d(0);
        Set set = uy3Var.a;
        if (set == null) {
            return;
        }
        ff3 ff3Var = new ff3(set);
        w03 w03Var = uy3Var.i;
        if (w03Var == null) {
            long[] jArr = v54.a;
            w03Var = new w03();
            uy3Var.i = w03Var;
        }
        w03Var.l(lv3Var, ff3Var);
        uy3Var.e.b(new wg1(ff3Var, -1));
    }
}
