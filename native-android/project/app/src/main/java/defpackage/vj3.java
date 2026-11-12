package defpackage;

import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj3 {
    public final /* synthetic */ PlayerControllerFragment a;

    public /* synthetic */ vj3(PlayerControllerFragment r1) {
        this.a = r1;
    }

    public void a(final float r4) {
        final PlayerControllerFragment r3 = this.a;
        r3.v0.setText(r3.t(R.string.player_playback_speed, new Object[]{Float.valueOf(r4)}));
        if (u52.c().a == false) goto L6;
        u52.j(r4, PlayerControllerFragment.l0(r4).b);
        return;
    L6:
        bl2 r0 = r3.M0;
        if (r0 != null) goto L9;
        return;
    L9:
        r0.f(new xj3(r3, r4), gq0.n);
    }
}
