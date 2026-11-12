package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import app.homemusic.AURAWavePlaybackListener;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ xi3 o;

    public /* synthetic */ ti3(xi3 xi3Var, int i) {
        this.n = i;
        this.o = xi3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        xi3 xi3Var = this.o;
        switch (i) {
            case 0:
                AURAWavePlaybackListener.markBottomPlaybackInteraction();
                if (!u52.c().a) {
                    ((FrameLayout) xi3Var.o0.o).findViewById(R.id.exo_play_pause).performClick();
                } else {
                    u52.a(u52.c().k ? "pause" : "play", 0L);
                }
                break;
            case 1:
                if (!u52.c().a) {
                    ((FrameLayout) xi3Var.o0.o).findViewById(R.id.exo_next).performClick();
                } else {
                    u52.a("next", 0L);
                }
                break;
            case 2:
                ((FrameLayout) xi3Var.o0.o).findViewById(R.id.exo_rew).performClick();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((FrameLayout) xi3Var.o0.o).findViewById(R.id.exo_ffwd).performClick();
                break;
            case 4:
                gh0.G(xi3Var.X());
                break;
            default:
                ((MainActivity) xi3Var.X()).t();
                break;
        }
    }
}
