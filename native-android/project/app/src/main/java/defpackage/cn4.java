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

    public cn4(w12 w12Var, int i) {
        this.e = w12Var;
        this.a = i;
    }

    public final void a() {
        w12 w12Var = this.e;
        yp4 yp4Var = (yp4) w12Var.g;
        i41 i41Var = (i41) w12Var.b;
        int iV0 = i41Var.v0();
        if (!i41Var.q() || i41Var.g() == 1 || i41Var.g() == 4 || iV0 == 0 || iV0 == 1) {
            if (this.c) {
                yp4Var.f(4);
            }
            this.c = false;
            return;
        }
        ((vp4) w12Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iV0) {
            if (jElapsedRealtime - this.d >= i) {
                ((d41) w12Var.d).n.u1(new ExoPlaybackException(2, new StuckPlayerException(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iV0;
        yp4Var.f(4);
        yp4Var.h(4, i);
    }
}
