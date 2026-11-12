package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vl implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public vl(AudioManager.OnAudioFocusChangeListener r2, Handler r3) {
        this.b = r2;
        Looper r4 = r3.getLooper();
        String r5 = f35.a;
        this.a = new Handler(r4, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int r3) {
        ul r0 = new ul(r3, 0, this);
        f35.W(this.a, r0);
    }
}
