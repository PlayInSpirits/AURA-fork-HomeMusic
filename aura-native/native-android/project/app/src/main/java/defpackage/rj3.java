package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ PlayerControllerFragment o;

    public /* synthetic */ rj3(PlayerControllerFragment playerControllerFragment, int i) {
        this.n = i;
        this.o = playerControllerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        PlayerControllerFragment playerControllerFragment = this.o;
        switch (i) {
            case 0:
                playerControllerFragment.u0();
                break;
            case 1:
                playerControllerFragment.u0();
                break;
            case 2:
                xi3 xi3Var = (xi3) playerControllerFragment.X().k().D("PlayerBottomSheet");
                if (xi3Var != null && xi3Var.n() != null && xi3Var.y() && xi3Var.T != null) {
                    ((ViewPager2) ((om1) xi3Var.o0.p).o).c(1, true);
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int currentItem = playerControllerFragment.o0.getCurrentItem();
                if (currentItem == 0) {
                    playerControllerFragment.o0.c(1, true);
                } else if (currentItem == 1) {
                    playerControllerFragment.o0.c(0, true);
                }
                break;
            case 4:
                Child child = (Child) playerControllerFragment.L0.n.d();
                if (child != null && playerControllerFragment.K0 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("TRACK_OBJECT", child);
                    bundle.putBoolean("homemusic_song_sheet_from_player", true);
                    playerControllerFragment.K0.T.m(R.id.songBottomSheetDialog, bundle, null);
                    break;
                }
                break;
            case 5:
                gh0.G(playerControllerFragment.X());
                break;
            case 6:
                ai3 ai3Var = new ai3();
                ai3Var.B0 = new vj3(playerControllerFragment);
                ai3Var.m0(playerControllerFragment.X().k(), null);
                break;
            default:
                xa3.t("skip_silence", !playerControllerFragment.w0.isChecked());
                break;
        }
    }
}
