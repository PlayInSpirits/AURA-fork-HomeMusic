package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oo {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public oo(BackEvent backEvent) {
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        long frameTimeMillis = Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L;
        this.a = touchX;
        this.b = touchY;
        this.c = progress;
        this.d = swipeEdge;
        this.e = frameTimeMillis;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
