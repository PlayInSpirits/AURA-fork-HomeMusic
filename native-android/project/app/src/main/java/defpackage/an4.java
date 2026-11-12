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
        cu4 cu4VarX0 = i41Var.x0();
        Object objL = cu4VarX0.p() ? null : cu4VarX0.l(i41Var.y());
        int iN0 = i41Var.n0();
        int iK = i41Var.K();
        long jM0 = i41Var.M0();
        if (objL != null && iN0 == -1) {
            jM0 -= f35.i0(cu4VarX0.g(objL, (zt4) w12Var.f).e);
        }
        ((vp4) w12Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iN0 == this.c && iK == this.d && jM0 == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iN0;
        this.d = iK;
        this.e = jM0;
        yp4Var.f(2);
        yp4Var.h(2, i);
    }
}
