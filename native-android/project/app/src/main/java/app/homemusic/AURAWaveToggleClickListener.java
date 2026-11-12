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

    public AURAWaveToggleClickListener(View.OnClickListener r1) {
        this.delegate = r1;
    }

    private static void dispatchPlaybackKey(View r4, boolean r5) {
        Object r0 = r4.getContext().getSystemService("audio");
        if (r0 == null) goto L9;
        AudioManager r1 = (AudioManager) r0;
        int r2 = 127;
        if (r5 == false) goto L7;
        r2 = 126;
    L7:
        r1.dispatchMediaKeyEvent(new KeyEvent(0, r2));
        r1.dispatchMediaKeyEvent(new KeyEvent(1, r2));
        return;
    }

    private static void pressAnimation(View r5) {
        Context r0 = r5.getContext();
        String r1 = r0.getPackageName();
        int r4 = r0.getResources().getIdentifier("aura_wave_button_press", "anim", r1);
        if (r4 == 0) goto L6;
        r5.startAnimation(AnimationUtils.loadAnimation(r0, r4));
        return;
    }

    public static void syncIcon(View r5) {
        if (r5 == null) goto L13;
        Context r0 = r5.getContext();
        String r1 = r0.getPackageName();
        if (AURAVersion.wavePlaying == false) goto L6;
        String r2 = "aura_wave_pause_icon";
    L7:
        int r4 = r0.getResources().getIdentifier(r2, "drawable", r1);
        if (r4 == 0) goto L14;
        View r3 = ((ViewGroup) r5).getChildAt(0);
        if ((r3 instanceof ImageView) == false) goto L15;
        ((ImageView) r3).setImageResource(r4);
        return;
    L15:
        return;
    L14:
        return;
    L6:
        r2 = "aura_wave_play_icon";
        goto L7
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r5) {
        pressAnimation(r5);
        if (AURAVersion.waveStarted == true) goto L8;
    L4:
        AURAVersion.waveStarted = true;
        AURAVersion.wavePending = true;
        AURAVersion.wavePlaying = true;
        syncIcon(r5);
        View.OnClickListener r1 = this.delegate;
        if (r1 == null) goto L23;
        r1.onClick(r5);
        return;
    L23:
        return;
    L8:
        MediaService r0 = is3.c;
        if (r0 == null) goto L21;
        qi3 r2 = r0.b();
        if (r2 == null) goto L21;
        if (r2.a() == null) goto L21;
        if (r2.h0() == false) goto L17;
        boolean r3 = false;
    L18:
        AURAVersion.wavePlaying = r3;
        syncIcon(r5);
        dispatchPlaybackKey(r5, r3);
        return;
    L17:
        r3 = true;
    L21:
        if (AURAVersion.wavePending == true) goto L24;
        AURAVersion.waveStarted = false;
        AURAVersion.wavePlaying = false;
        goto L4
    }
}
