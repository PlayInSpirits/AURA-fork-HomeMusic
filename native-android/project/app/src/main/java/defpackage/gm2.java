package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements IBinder.DeathRecipient {
    public final uk2 a = new uk2(this);
    public gk0 b;
    public tk2 c;
    public final Handler d;
    public final /* synthetic */ im2 e;

    public gm2(im2 im2Var, Looper looper) {
        this.e = im2Var;
        this.d = new Handler(looper, new gt0(3, this));
    }

    public final void a(boolean z) {
        sk2 sk2VarA1 = this.e.a1();
        sk2VarA1.getClass();
        rr2.w(Looper.myLooper() == sk2VarA1.f.getLooper());
        qk2 qk2Var = sk2VarA1.e;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        qk2Var.y(new va4("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
    }

    public final void b(ei3 ei3Var) {
        im2 im2Var = this.e;
        hm2 hm2Var = im2Var.n;
        im2Var.n = new hm2((fg4) hm2Var.d, im2.Y0(ei3Var), (eo2) hm2Var.f, hm2Var.a, (CharSequence) hm2Var.g, hm2Var.b, hm2Var.c, (Bundle) hm2Var.h);
        e();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        c(8, null);
    }

    public final void c(int i, Object obj) {
        gk0 gk0Var = this.b;
        if (gk0Var != null) {
            gk0Var.obtainMessage(i, obj).sendToTarget();
        }
    }

    public final void d(Handler handler) {
        if (handler != null) {
            gk0 gk0Var = new gk0(this, handler.getLooper());
            this.b = gk0Var;
            gk0Var.b = true;
        } else {
            gk0 gk0Var2 = this.b;
            if (gk0Var2 != null) {
                gk0Var2.b = false;
                gk0Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void e() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.e.h);
    }
}
