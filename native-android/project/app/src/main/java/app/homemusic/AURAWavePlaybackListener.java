package app.homemusic;

import android.view.View;
import com.eddyizm.tempus.service.MediaService;
import defpackage.gn2;
import defpackage.is3;
import defpackage.oi3;
import defpackage.qi3;

/* JADX INFO: loaded from: classes.dex */
public final class AURAWavePlaybackListener implements oi3 {
    private static oi3 observer;
    private static qi3 trackedPlayer;
    private final qi3 player;

    public AURAWavePlaybackListener(qi3 r1) {
        this.player = r1;
    }

    public static void attach(qi3 r3) {
        if (r3 == null) goto L13;
        qi3 r0 = trackedPlayer;
        if (r0 != r3) goto L7;
        syncFromPlayer(r3);
        return;
    L7:
        if (r0 == null) goto L11;
        oi3 r1 = observer;
        if (r1 == null) goto L11;
        r0.r0(r1);
    L11:
        AURAWavePlaybackListener r2 = new AURAWavePlaybackListener(r3);
        observer = r2;
        trackedPlayer = r3;
        r3.v(r2);
        syncFromPlayer(r3);
        return;
    }

    public static void markBottomPlaybackInteraction() {
        AURAVersion.waveStarted = true;
    }

    public static void resetWaveState() {
        AURAVersion.waveStarted = false;
        AURAVersion.wavePending = false;
        AURAVersion.wavePlaying = false;
        View r0 = AURAVersion.waveButton;
        if (r0 == null) goto L6;
        AURAWaveToggleClickListener.syncIcon(r0);
        return;
    }

    public static void syncCurrent() {
        MediaService r0 = is3.c;
        if (r0 == null) goto L8;
        qi3 r1 = r0.b();
        if (r1 == null) goto L9;
        syncFromPlayer(r1);
        return;
    L9:
        return;
    }

    public static void syncFromPlayer(qi3 r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.a() == null) goto L7;
        AURAVersion.wavePlaying = r3.h0();
    L10:
        View r2 = AURAVersion.waveButton;
        if (r2 == null) goto L15;
        AURAWaveToggleClickListener.syncIcon(r2);
        return;
    L15:
        return;
    L7:
        if (AURAVersion.wavePending == false) goto L9;
        AURAVersion.wavePlaying = true;
        goto L10
    L9:
        AURAVersion.wavePlaying = false;
        AURAVersion.waveStarted = false;
        goto L10
    }

    @Override // defpackage.oi3
    public void V(boolean r2) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void q(boolean r2) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void t(int r2, gn2 r3) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void v(int r2) {
        syncFromPlayer(this.player);
    }
}
