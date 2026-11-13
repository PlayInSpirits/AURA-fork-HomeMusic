package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bn4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ w12 g;

    public bn4(w12 w12Var, int i) {
        this.g = w12Var;
        this.a = i;
    }

    public final void a() {
        long duration;
        w12 w12Var = this.g;
        zt4 zt4Var = (zt4) w12Var.f;
        yp4 yp4Var = (yp4) w12Var.g;
        i41 i41Var = (i41) w12Var.b;
        cu4 x0 = i41Var.x0();
        Object l = x0.p() ? null : x0.l(i41Var.y());
        int n0 = i41Var.n0();
        int K = i41Var.K();
        long M0 = i41Var.M0();
        if (l == null || n0 != -1) {
            duration = n0 != -1 ? i41Var.getDuration() : -9223372036854775807L;
        } else {
            x0.g(l, zt4Var);
            M0 -= f35.i0(zt4Var.e);
            duration = f35.i0(zt4Var.d);
        }
        boolean h0 = i41Var.h0();
        if (!h0 || duration == -9223372036854775807L || M0 < duration) {
            yp4Var.f(3);
            if (h0 && duration != -9223372036854775807L) {
                yp4Var.h(3, (int) Math.ceil((duration - M0) / i41Var.i().a));
            }
            this.e = false;
            return;
        }
        ((vp4) w12Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && n0 == this.c && K == this.d) {
            if (elapsedRealtime - this.f >= i) {
                ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l;
        this.c = n0;
        this.d = K;
        yp4Var.f(3);
        yp4Var.h(3, i);
    }
}
