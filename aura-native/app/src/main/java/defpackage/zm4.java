package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public zm4(w12 w12Var, int i) {
        this.i = w12Var;
        this.a = i;
    }

    public final void a() {
        Object obj;
        w12 w12Var = this.i;
        yp4 yp4Var = (yp4) w12Var.g;
        i41 i41Var = (i41) w12Var.b;
        if (i41Var.g() != 2 || !i41Var.q() || i41Var.v0() != 0) {
            if (this.g) {
                yp4Var.f(1);
            }
            this.g = false;
            return;
        }
        cu4 x0 = i41Var.x0();
        Object l = x0.p() ? null : x0.l(i41Var.y());
        int n0 = i41Var.n0();
        int K = i41Var.K();
        long b0 = i41Var.b0();
        long max = Math.max(0L, i41Var.m() - Math.max(0L, b0 - i41Var.M0()));
        if (l != null && n0 == -1) {
            b0 -= f35.i0(x0.g(l, (zt4) w12Var.f).e);
        }
        ((vp4) w12Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && n0 == this.c && K == this.d) {
            obj = l;
            if (b0 == this.e && max == this.f) {
                if (elapsedRealtime - this.h >= i) {
                    ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = l;
        }
        this.g = true;
        this.h = elapsedRealtime;
        this.b = obj;
        this.c = n0;
        this.d = K;
        this.e = b0;
        this.f = max;
        yp4Var.f(1);
        yp4Var.h(1, i);
    }
}
