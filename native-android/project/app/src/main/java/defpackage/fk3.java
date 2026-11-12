package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ hk3 o;

    public /* synthetic */ fk3(hk3 hk3Var, int i) {
        this.n = i;
        this.o = hk3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ck3 ck3Var;
        PlayerControllerFragment playerControllerFragment;
        int i = this.n;
        hk3 hk3Var = this.o;
        switch (i) {
            case 0:
                aj3 aj3Var = hk3Var.m0;
                if (aj3Var == null) {
                    h12.Q("playerBottomSheetViewModel");
                    throw null;
                }
                vs3 vs3Var = aj3Var.f;
                if (u52.c().a) {
                    v52 v52VarC = u52.c();
                    String str = v52VarC.x;
                    if (!u52.k() || str.isEmpty()) {
                        return;
                    }
                    List list = (List) u52.l().stream().map(new m7(17)).collect(Collectors.toList());
                    long jB = v52VarC.b(SystemClock.elapsedRealtime());
                    vs3Var.getClass();
                    vs3.d(list, str, jB);
                } else {
                    Child child = (Child) aj3Var.n.d();
                    List list2 = (List) vs3Var.b().stream().map(new m7(17)).collect(Collectors.toList());
                    if (child == null) {
                        return;
                    }
                    String id = child.getId();
                    id.getClass();
                    sp3 sp3Var = (sp3) ud3.A().get(id);
                    long j = sp3Var != null ? sp3Var.b : 0L;
                    Log.d("PlayerBottomSheetViewModel", "Saving play queue - Current: " + child.getId() + ", Items: " + list2.size() + ", Position: " + j);
                    vs3.d(list2, child.getId(), j);
                }
                View viewA0 = hk3Var.a0();
                int[] iArr = qg4.E;
                qg4.h(viewA0, viewA0.getResources().getText(R.string.player_queue_save_queue_success), 0).j();
                return;
            case 1:
                kc1 kc1VarD = hk3Var.X().k().D("PlayerBottomSheet");
                xi3 xi3Var = kc1VarD instanceof xi3 ? (xi3) kc1VarD : null;
                if (xi3Var == null || xi3Var.n() == null || !xi3Var.y() || xi3Var.T == null || (ck3Var = (ck3) ((ViewPager2) ((om1) xi3Var.o0.p).o).getAdapter()) == null || (playerControllerFragment = (PlayerControllerFragment) ((kc1) ck3Var.z.get(0))) == null) {
                    return;
                }
                playerControllerFragment.o0.c(1, true);
                return;
            case 2:
                hk3Var.l0(false);
                return;
            default:
                hk3Var.l0(true);
                return;
        }
    }
}
