package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cn4 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ w12 e;

    public cn4(w12 r1, int r2) {
        this.e = r1;
        this.a = r2;
    }

    public final void a() {
        w12 r0 = this.e;
        yp4 r1 = (yp4) r0.g;
        i41 r2 = (i41) r0.b;
        int r3 = r2.v0();
        if (r2.q() == false) goto L22;
        if (r2.g() == 1) goto L22;
        if (r2.g() == 4) goto L22;
        if (r3 == 0) goto L22;
        if (r3 == 1) goto L22;
        ((vp4) r0.e).getClass();
        long r7 = SystemClock.elapsedRealtime();
        boolean r4 = this.c;
        int r5 = this.a;
        if (r4 == true) goto L14;
    L19:
        this.c = true;
        this.d = r7;
        this.b = r3;
        r1.f(4);
        r1.h(4, r5);
        return;
    L14:
        if (this.b != r3) goto L19;
        if ((r7 - this.d) < r5) goto L26;
        ((d41) r0.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(4, r5), 1003));
        return;
    L26:
        return;
    L22:
        if (this.c == false) goto L24;
        r1.f(4);
    L24:
        this.c = false;
    }
}
