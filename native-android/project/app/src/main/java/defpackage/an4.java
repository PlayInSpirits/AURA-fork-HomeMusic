package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class an4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ w12 h;

    public an4(w12 r1, int r2) {
        this.h = r1;
        this.a = r2;
    }

    public final void a() {
        w12 r0 = this.h;
        yp4 r1 = (yp4) r0.g;
        i41 r2 = (i41) r0.b;
        if (r2.h0() == false) goto L5;
        cu4 r3 = r2.x0();
        if (r3.p() == false) goto L12;
        Object r5 = null;
    L13:
        int r6 = r2.n0();
        int r7 = r2.K();
        long r8 = r2.M0();
        if (r5 != null) goto L16;
    L18:
        ((vp4) r0.e).getClass();
        long r4 = SystemClock.elapsedRealtime();
        boolean r10 = this.f;
        int r11 = this.a;
        if (r10 == true) goto L21;
    L32:
        this.f = true;
        this.g = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        r1.f(2);
        r1.h(2, r11);
        return;
    L21:
        if (Objects.equals(r5, this.b) == false) goto L32;
        if (r6 != this.c) goto L32;
        if (r7 != this.d) goto L32;
        if (r8 != this.e) goto L32;
        if ((r4 - this.g) < r11) goto L34;
        ((d41) r0.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(2, r11), 1003));
        return;
    L34:
        return;
    L16:
        if (r6 != (-1)) goto L18;
        r8 = r8 - f35.i0(r3.g(r5, (zt4) r0.f).e);
        goto L18
    L12:
        r5 = r3.l(r2.y());
        goto L13
    L5:
        if (this.f == false) goto L7;
        r1.f(2);
    L7:
        this.f = false;
    }
}
