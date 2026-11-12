package defpackage;

import android.widget.ImageButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ xi3 o;

    public /* synthetic */ ri3(xi3 xi3Var, int i) {
        this.n = i;
        this.o = xi3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        xi3 xi3Var = this.o;
        switch (i) {
            case 0:
                try {
                    bj2 bj2Var = (bj2) xi3Var.q0.get();
                    App.b().getClass();
                    bj2Var.s(App.c().getBoolean("shuffle_mode", false));
                    App.b().getClass();
                    bj2Var.p0(App.c().getInt("repeat_mode", 0));
                    xi3Var.j0(bj2Var);
                    a.f.e(xi3Var.v(), new si3(xi3Var, 1));
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                ns3 ns3Var = xi3Var.o0;
                if (ns3Var != null) {
                    ((ImageButton) ((ae1) ns3Var.q).e).setVisibility(8);
                }
                break;
        }
    }
}
