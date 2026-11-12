package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk2 implements Handler.Callback {
    public final Handler n;
    public final /* synthetic */ ok2 o;

    public nk2(ok2 ok2Var, ak2 ak2Var) {
        this.o = ok2Var;
        Handler handlerP = f35.p(this);
        this.n = handlerP;
        ak2Var.v(this, handlerP);
    }

    public final void a(long j) {
        Surface surface;
        ok2 ok2Var = this.o;
        rf2 rf2Var = ok2Var.W0;
        if (this != ok2Var.G1 || ok2Var.a0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            ok2Var.H0 = true;
            return;
        }
        try {
            ok2Var.D0(j);
            s55 s55Var = ok2Var.B1;
            if (!s55Var.equals(s55.d) && !s55Var.equals(ok2Var.C1)) {
                ok2Var.C1 = s55Var;
                rf2Var.o(s55Var);
            }
            ok2Var.J0.e++;
            e55 e55Var = ok2Var.Z0;
            boolean z = e55Var.e != 3;
            e55Var.e = 3;
            e55Var.l.getClass();
            e55Var.g = f35.Q(SystemClock.elapsedRealtime());
            if (z && (surface = ok2Var.l1) != null) {
                rf2Var.j(surface);
                ok2Var.o1 = true;
            }
            ok2Var.i0(j);
        } catch (ExoPlaybackException e) {
            ok2Var.I0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = f35.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
