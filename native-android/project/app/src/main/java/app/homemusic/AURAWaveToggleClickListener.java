package app.homemusic;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.eddyizm.tempus.service.MediaService;
import defpackage.is3;
import defpackage.qi3;

/* JADX INFO: loaded from: classes.dex */
public final class AURAWaveToggleClickListener implements View.OnClickListener {
    private final View.OnClickListener delegate;

    public AURAWaveToggleClickListener(View.OnClickListener onClickListener) {
        this.delegate = onClickListener;
    }

    private static void dispatchPlaybackKey(View view, boolean z) {
        Object systemService = view.getContext().getSystemService("audio");
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            int i = z ? 126 : 127;
            audioManager.dispatchMediaKeyEvent(new KeyEvent(0, i));
            audioManager.dispatchMediaKeyEvent(new KeyEvent(1, i));
        }
    }

    private static void pressAnimation(View view) {
        Context context = view.getContext();
        int identifier = context.getResources().getIdentifier("aura_wave_button_press", "anim", context.getPackageName());
        if (identifier != 0) {
            view.startAnimation(AnimationUtils.loadAnimation(context, identifier));
        }
    }

    public static void syncIcon(View view) {
        if (view != null) {
            Context context = view.getContext();
            int identifier = context.getResources().getIdentifier(AURAVersion.wavePlaying ? "aura_wave_pause_icon" : "aura_wave_play_icon", "drawable", context.getPackageName());
            if (identifier != 0) {
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt instanceof ImageView) {
                    ((ImageView) childAt).setImageResource(identifier);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        qi3 qi3VarB;
        pressAnimation(view);
        if (AURAVersion.waveStarted) {
            MediaService mediaService = is3.c;
            if (mediaService != null && (qi3VarB = mediaService.b()) != null && qi3VarB.a() != null) {
                boolean z = !qi3VarB.h0();
                AURAVersion.wavePlaying = z;
                syncIcon(view);
                dispatchPlaybackKey(view, z);
                return;
            }
            if (AURAVersion.wavePending) {
                return;
            }
            AURAVersion.waveStarted = false;
            AURAVersion.wavePlaying = false;
        }
        AURAVersion.waveStarted = true;
        AURAVersion.wavePending = true;
        AURAVersion.wavePlaying = true;
        syncIcon(view);
        View.OnClickListener onClickListener = this.delegate;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
