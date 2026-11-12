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

    public oo(BackEvent r7) {
        r7.getClass();
        float r0 = bn.b(r7);
        float r1 = bn.z(r7);
        float r2 = bn.D(r7);
        int r3 = bn.d(r7);
        if (Build.VERSION.SDK_INT < 36) goto L5;
        long r4 = no.b(r7);
    L6:
        this.a = r0;
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        return;
    L5:
        r4 = 0;
        goto L6
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
