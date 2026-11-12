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
        cu4 cu4VarX0 = i41Var.x0();
        Object objL = cu4VarX0.p() ? null : cu4VarX0.l(i41Var.y());
        int iN0 = i41Var.n0();
        int iK = i41Var.K();
        long jB0 = i41Var.b0();
        long jMax = Math.max(0L, i41Var.m() - Math.max(0L, jB0 - i41Var.M0()));
        if (objL != null && iN0 == -1) {
            jB0 -= f35.i0(cu4VarX0.g(objL, (zt4) w12Var.f).e);
        }
        ((vp4) w12Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iN0 == this.c && iK == this.d) {
            obj = objL;
            if (jB0 == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i) {
                    ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objL;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = obj;
        this.c = iN0;
        this.d = iK;
        this.e = jB0;
        this.f = jMax;
        yp4Var.f(1);
        yp4Var.h(1, i);
    }
}
