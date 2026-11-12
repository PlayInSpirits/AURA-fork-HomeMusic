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
    public static final Handler c = null;

    static {
        c = new Handler(Looper.getMainLooper());
    }

    public static final boolean a(KeyEvent r4) {
        r4.getClass();
        if (u52.c().a == true) goto L5;
        return false;
    L5:
        int r0 = r4.getKeyCode();
        if (r0 != 24) goto L8;
        int r1 = 1;
    L13:
        if (r4.getAction() != 0) goto L19;
        MediaSession r5 = a;
        if (r5 == null) goto L19;
        MediaController r6 = r5.getController();
        if (r6 == null) goto L19;
        r6.adjustVolume(r1, 1);
    L19:
        return true;
    L8:
        if (r0 == 25) goto L10;
        return false;
    L10:
        r1 = -1;
        goto L13
    }

    public static void b() {
        MediaSession r0 = a;
        if (r0 == null) goto L5;
        r0.setActive(false);
    L5:
        MediaSession r1 = a;
        if (r1 == null) goto L8;
        r1.release();
    L8:
        a = null;
        b = null;
    }

    public static void c(Context r7, v52 r8) {
        r7.getClass();
        int r0 = r8.m;
        int r1 = r8.n;
        if (r8.b == false) goto L32;
        if (r1 <= 0) goto L32;
        MediaSession r2 = a;
        int r3 = 0;
        if (r2 != null) goto L9;
        r2 = new MediaSession(r7.getApplicationContext(), "Tempus LAN");
        r2.setCallback(new y52(r3, r2), c);
        a = r2;
    L9:
        x52 r9 = b;
        if (r9 != null) goto L12;
    L14:
        x52 r4 = new x52(r2, r1, gb.m(r0, 0, r1));
        b = r4;
        r2.setPlaybackToRemote(r4);
    L15:
        x52 r10 = b;
        r10.getClass();
        r10.setCurrentVolume(gb.m(r0, 0, r1));
        r2.setMetadata(new MediaMetadata.Builder().putString("android.media.metadata.TITLE", r8.d).putString("android.media.metadata.ARTIST", r8.e).putString("android.media.metadata.DISPLAY_SUBTITLE", r8.c).putLong("android.media.metadata.DURATION", r8.i).build());
        PlaybackState.Builder r11 = new PlaybackState.Builder();
        long r5 = 0;
        if (r8.v == false) goto L18;
        long r6 = 32;
    L19:
        long r12 = r6 | 775;
        if (r8.w == false) goto L22;
        r5 = 16;
    L22:
        PlaybackState.Builder r13 = r11.setActions(r12 | r5);
        boolean r14 = r8.j;
        if (r14 == false) goto L25;
        int r15 = 3;
    L26:
        long r16 = r8.h;
        if (r14 == false) goto L29;
        float r17 = r8.y;
    L30:
        r2.setPlaybackState(r13.setState(r15, r16, r17).build());
        r2.setActive(true);
        return;
    L29:
        r17 = 0.0f;
        goto L30
    L25:
        r15 = 2;
        goto L26
    L18:
        r6 = 0;
        goto L19
    L12:
        if (r9.getMaxVolume() != r1) goto L14;
    L32:
        b();
    }
}
