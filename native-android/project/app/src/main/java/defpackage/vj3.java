package defpackage;

import android.util.Log;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj3 {
    public final /* synthetic */ PlayerControllerFragment a;

    public /* synthetic */ vj3(PlayerControllerFragment playerControllerFragment) {
        this.a = playerControllerFragment;
    }

    public void a(final float f) throws JSONException {
        final PlayerControllerFragment playerControllerFragment = this.a;
        playerControllerFragment.v0.setText(playerControllerFragment.t(R.string.player_playback_speed, Float.valueOf(f)));
        if (u52.c().a) {
            u52.j(f, PlayerControllerFragment.l0(f).b);
            return;
        }
        bl2 bl2Var = playerControllerFragment.M0;
        if (bl2Var == null) {
            return;
        }
        bl2Var.f(new Runnable() { // from class: xj3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ((bj2) playerControllerFragment.M0.get()).d(PlayerControllerFragment.l0(f));
                } catch (Exception e) {
                    Log.e("PlayerCoverFragment", "Error applying playback speed", e);
                }
            }
        }, gq0.n);
    }
}
