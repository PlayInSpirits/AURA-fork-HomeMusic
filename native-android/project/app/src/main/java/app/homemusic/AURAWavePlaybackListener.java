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

    public AURAWavePlaybackListener(qi3 qi3Var) {
        this.player = qi3Var;
    }

    public static void attach(qi3 qi3Var) {
        oi3 oi3Var;
        if (qi3Var != null) {
            qi3 qi3Var2 = trackedPlayer;
            if (qi3Var2 == qi3Var) {
                syncFromPlayer(qi3Var);
                return;
            }
            if (qi3Var2 != null && (oi3Var = observer) != null) {
                qi3Var2.r0(oi3Var);
            }
            AURAWavePlaybackListener aURAWavePlaybackListener = new AURAWavePlaybackListener(qi3Var);
            observer = aURAWavePlaybackListener;
            trackedPlayer = qi3Var;
            qi3Var.v(aURAWavePlaybackListener);
            syncFromPlayer(qi3Var);
        }
    }

    public static void markBottomPlaybackInteraction() {
        AURAVersion.waveStarted = true;
    }

    public static void resetWaveState() {
        AURAVersion.waveStarted = false;
        AURAVersion.wavePending = false;
        AURAVersion.wavePlaying = false;
        View view = AURAVersion.waveButton;
        if (view != null) {
            AURAWaveToggleClickListener.syncIcon(view);
        }
    }

    public static void syncCurrent() {
        qi3 qi3VarB;
        MediaService mediaService = is3.c;
        if (mediaService == null || (qi3VarB = mediaService.b()) == null) {
            return;
        }
        syncFromPlayer(qi3VarB);
    }

    public static void syncFromPlayer(qi3 qi3Var) {
        if (qi3Var != null) {
            if (qi3Var.a() != null) {
                AURAVersion.wavePlaying = qi3Var.h0();
            } else if (AURAVersion.wavePending) {
                AURAVersion.wavePlaying = true;
            } else {
                AURAVersion.wavePlaying = false;
                AURAVersion.waveStarted = false;
            }
            View view = AURAVersion.waveButton;
            if (view != null) {
                AURAWaveToggleClickListener.syncIcon(view);
            }
        }
    }

    @Override // defpackage.oi3
    public void V(boolean z) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void q(boolean z) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void t(int i, gn2 gn2Var) {
        syncFromPlayer(this.player);
    }

    @Override // defpackage.oi3
    public void v(int i) {
        syncFromPlayer(this.player);
    }
}
