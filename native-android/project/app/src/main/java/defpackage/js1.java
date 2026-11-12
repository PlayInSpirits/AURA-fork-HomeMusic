package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class js1 {
    public static final k03 a = new k03(null);

    public static final void a(MainActivity mainActivity, String str) {
        int i;
        str.getClass();
        a.k(str);
        qp4 qp4Var = mainActivity.R;
        if (qp4Var != null) {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) qp4Var.a;
            r23 r23VarG = mainActivity.T.g();
            if (r23VarG == null || r23VarG.u != R.id.hubFragment) {
                bottomNavigationView.setSelectedItemId(R.id.hubFragment);
            }
            zg5 zg5Var = mainActivity.V;
            if (zg5Var != null) {
                au auVar = (au) zg5Var.n;
                if (auVar.a || (i = ((BottomSheetBehavior) auVar.b).Y) == 3 || i == 2) {
                    mainActivity.q();
                }
            }
        }
    }
}
