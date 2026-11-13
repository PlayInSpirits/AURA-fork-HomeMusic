package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class an4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ w12 h;

    public an4(w12 w12Var, int i) {
        this.h = w12Var;
        this.a = i;
    }

    public final void a() {
        w12 w12Var = this.h;
        yp4 yp4Var = (yp4) w12Var.g;
        i41 i41Var = (i41) w12Var.b;
        if (!i41Var.h0()) {
            if (this.f) {
                yp4Var.f(2);
            }
            this.f = false;
            return;
        }
        cu4 x0 = i41Var.x0();
        Object l = x0.p() ? null : x0.l(i41Var.y());
        int n0 = i41Var.n0();
        int K = i41Var.K();
        long M0 = i41Var.M0();
        if (l != null && n0 == -1) {
            M0 -= f35.i0(x0.g(l, (zt4) w12Var.f).e);
        }
        ((vp4) w12Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && n0 == this.c && K == this.d && M0 == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = n0;
        this.d = K;
        this.e = M0;
        yp4Var.f(2);
        yp4Var.h(2, i);
    }
}
