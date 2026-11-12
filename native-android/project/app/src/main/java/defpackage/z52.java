package defpackage;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z52 {
    public static MediaSession a;
    public static x52 b;
    public static final Handler c = new Handler(Looper.getMainLooper());

    public static final boolean a(KeyEvent keyEvent) {
        int i;
        MediaSession mediaSession;
        MediaController controller;
        keyEvent.getClass();
        if (!u52.c().a) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 24) {
            i = 1;
        } else {
            if (keyCode != 25) {
                return false;
            }
            i = -1;
        }
        if (keyEvent.getAction() == 0 && (mediaSession = a) != null && (controller = mediaSession.getController()) != null) {
            controller.adjustVolume(i, 1);
        }
        return true;
    }

    public static void b() {
        MediaSession mediaSession = a;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = a;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        a = null;
        b = null;
    }

    public static void c(Context context, v52 v52Var) {
        context.getClass();
        int i = v52Var.m;
        int i2 = v52Var.n;
        if (!v52Var.b || i2 <= 0) {
            b();
            return;
        }
        MediaSession mediaSession = a;
        int i3 = 0;
        if (mediaSession == null) {
            mediaSession = new MediaSession(context.getApplicationContext(), "Tempus LAN");
            mediaSession.setCallback(new y52(i3, mediaSession), c);
            a = mediaSession;
        }
        x52 x52Var = b;
        if (x52Var == null || x52Var.getMaxVolume() != i2) {
            x52 x52Var2 = new x52(mediaSession, i2, gb.m(i, 0, i2));
            b = x52Var2;
            mediaSession.setPlaybackToRemote(x52Var2);
        }
        x52 x52Var3 = b;
        x52Var3.getClass();
        x52Var3.setCurrentVolume(gb.m(i, 0, i2));
        mediaSession.setMetadata(new MediaMetadata.Builder().putString("android.media.metadata.TITLE", v52Var.d).putString("android.media.metadata.ARTIST", v52Var.e).putString("android.media.metadata.DISPLAY_SUBTITLE", v52Var.c).putLong("android.media.metadata.DURATION", v52Var.i).build());
        PlaybackState.Builder actions = new PlaybackState.Builder().setActions((v52Var.v ? 32L : 0L) | 775 | (v52Var.w ? 16L : 0L));
        boolean z = v52Var.j;
        mediaSession.setPlaybackState(actions.setState(z ? 3 : 2, v52Var.h, z ? v52Var.y : 0.0f).build());
        mediaSession.setActive(true);
    }
}
