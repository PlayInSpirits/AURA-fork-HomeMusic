package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zm4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ w12 i;

    public zm4(w12 r1, int r2) {
        this.i = r1;
        this.a = r2;
    }

    public final void a() {
        w12 r1 = this.i;
        yp4 r2 = (yp4) r1.g;
        i41 r3 = (i41) r1.b;
        if (r3.g() != 2) goto L38;
        if (r3.q() == false) goto L38;
        if (r3.v0() != 0) goto L38;
        cu4 r4 = r3.x0();
        if (r4.p() == false) goto L12;
        Object r7 = null;
    L13:
        int r8 = r3.n0();
        int r9 = r3.K();
        long r10 = r3.b0();
        long r12 = Math.max(0, r3.m() - Math.max(0, r10 - r3.M0()));
        if (r7 != null) goto L16;
    L18:
        ((vp4) r1.e).getClass();
        long r5 = SystemClock.elapsedRealtime();
        boolean r14 = this.g;
        int r15 = this.a;
        if (r14 == true) goto L21;
    L34:
        Object r16 = r7;
    L35:
        this.g = true;
        this.h = r5;
        this.b = r16;
        this.c = r8;
        this.d = r9;
        this.e = r10;
        this.f = r12;
        r2.f(1);
        r2.h(1, r15);
        return;
    L21:
        if (Objects.equals(r7, this.b) == false) goto L34;
        if (r8 != this.c) goto L34;
        if (r9 != this.d) goto L34;
        r16 = r7;
        if (r10 != this.e) goto L35;
        if (r12 != this.f) goto L35;
        if ((r5 - this.h) < r15) goto L42;
        ((d41) r1.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(1, r15), 1003));
        return;
    L42:
        return;
    L16:
        if (r8 != (-1)) goto L18;
        r10 = r10 - f35.i0(r4.g(r7, (zt4) r1.f).e);
        goto L18
    L12:
        r7 = r4.l(r3.y());
    L38:
        if (this.g == false) goto L40;
        r2.f(1);
    L40:
        this.g = false;
    }
}
