package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import app.homemusic.AURAWavePlaybackListener;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ xi3 o;

    public /* synthetic */ ti3(xi3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r3) {
        int r4 = this.n;
        xi3 r2 = this.o;
        switch(r4) {
            case 0: goto L17;
            case 1: goto L13;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        ((MainActivity) r2.X()).t();
        return;
    L6:
        gh0.G(r2.X());
        return;
    L8:
        ((FrameLayout) r2.o0.o).findViewById(R.id.exo_ffwd).performClick();
        return;
    L10:
        ((FrameLayout) r2.o0.o).findViewById(R.id.exo_rew).performClick();
        return;
    L17:
        AURAWavePlaybackListener.markBottomPlaybackInteraction();
        if (u52.c().a == true) goto L20;
        ((FrameLayout) r2.o0.o).findViewById(R.id.exo_play_pause).performClick();
        return;
    L20:
        if (u52.c().k == false) goto L22;
        String r5 = "pause";
    L23:
        u52.a(r5, 0);
        return;
    L22:
        r5 = "play";
        goto L23
    L13:
        if (u52.c().a == false) goto L15;
        u52.a("next", 0);
        return;
    L15:
        ((FrameLayout) r2.o0.o).findViewById(R.id.exo_next).performClick();
    }
}
