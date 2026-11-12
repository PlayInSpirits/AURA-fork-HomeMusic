package defpackage;

import android.os.Handler;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import com.google.android.material.button.MaterialButton;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mk3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk3 b;

    public /* synthetic */ mk3(qk3 qk3Var, int i) {
        this.a = i;
        this.b = qk3Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        qk3 qk3Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                ml3 ml3Var = qk3Var.l0;
                if (ml3Var != null) {
                    MaterialButton materialButton = (MaterialButton) ml3Var.a;
                    if (bool != null && bool.booleanValue()) {
                        materialButton.setIconResource(R.drawable.ic_done);
                        materialButton.setContentDescription(qk3Var.s(R.string.player_lyrics_downloaded_content_description));
                    } else {
                        materialButton.setIconResource(R.drawable.ic_download);
                        materialButton.setContentDescription(qk3Var.s(R.string.player_lyrics_download_content_description));
                    }
                }
                break;
            case 1:
                qk3Var.r0 = (String) obj;
                qk3Var.i0();
                break;
            case 2:
                qk3Var.s0 = (LyricsList) obj;
                qk3Var.t0 = null;
                qk3Var.i0();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qk3Var.u0 = (String) obj;
                qk3Var.i0();
                break;
            default:
                LyricsList lyricsList = (LyricsList) obj;
                if (!qk3.h0(lyricsList)) {
                    Handler handler = qk3Var.p0;
                    if (handler != null) {
                        handler.removeCallbacks(qk3Var.q0);
                        qk3Var.p0 = null;
                    }
                } else if (!lyricsList.getStructuredLyrics().get(0).getSynced()) {
                    Handler handler2 = qk3Var.p0;
                    if (handler2 != null) {
                        handler2.removeCallbacks(qk3Var.q0);
                        qk3Var.p0 = null;
                    }
                } else {
                    Handler handler3 = new Handler();
                    qk3Var.p0 = handler3;
                    nk3 nk3Var = new nk3(qk3Var, 1);
                    qk3Var.q0 = nk3Var;
                    handler3.postDelayed(nk3Var, 250L);
                }
                break;
        }
    }
}
