package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bn4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ w12 g;

    public bn4(w12 r1, int r2) {
        this.g = r1;
        this.a = r2;
    }

    public final void a() {
        w12 r0 = this.g;
        zt4 r1 = (zt4) r0.f;
        yp4 r2 = (yp4) r0.g;
        i41 r3 = (i41) r0.b;
        cu4 r4 = r3.x0();
        if (r4.p() == false) goto L5;
        Object r5 = null;
    L6:
        int r6 = r3.n0();
        int r7 = r3.K();
        long r8 = r3.M0();
        if (r5 == null) goto L10;
        if (r6 != (-1)) goto L10;
        r4.g(r5, r1);
        r8 = r8 - f35.i0(r1.e);
        long r13 = f35.i0(r1.d);
    L13:
        boolean r9 = r3.h0();
        if (r9 == true) goto L16;
    L34:
        r2.f(3);
        if (r9 == true) goto L37;
    L39:
        this.e = false;
        return;
    L37:
        if (r13 == (-9223372036854775807L)) goto L39;
        r2.h(3, (int) Math.ceil((r13 - r8) / r3.i().a));
        goto L39
    L16:
        if (r13 == (-9223372036854775807L)) goto L34;
        if (r8 < r13) goto L34;
        ((vp4) r0.e).getClass();
        long r10 = SystemClock.elapsedRealtime();
        boolean r11 = this.e;
        int r12 = this.a;
        if (r11 == true) goto L23;
    L32:
        this.e = true;
        this.f = r10;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        r2.f(3);
        r2.h(3, r12);
        return;
    L23:
        if (Objects.equals(r5, this.b) == false) goto L32;
        if (r6 != this.c) goto L32;
        if (r7 != this.d) goto L32;
        if ((r10 - this.f) < r12) goto L41;
        ((d41) r0.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(3, r12), 1003));
        return;
    L41:
        return;
    L10:
        if (r6 == (-1)) goto L12;
        r13 = r3.getDuration();
        goto L13
    L12:
        r13 = -9223372036854775807L;
        goto L13
    L5:
        r5 = r4.l(r3.y());
        goto L6
    }
}
