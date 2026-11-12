package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements IBinder.DeathRecipient {
    public final uk2 a;
    public gk0 b;
    public tk2 c;
    public final Handler d;
    public final /* synthetic */ im2 e;

    public gm2(im2 r3, Looper r4) {
        this.e = r3;
        this.a = new uk2(this);
        this.d = new Handler(r4, new gt0(3, this));
    }

    public final void a(boolean r3) {
        sk2 r2 = this.e.a1();
        r2.getClass();
        if (Looper.myLooper() != r2.f.getLooper()) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        qk2 r4 = r2.e;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", r3);
        r4.y(new va4("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void b(ei3 r12) {
        im2 r0 = this.e;
        hm2 r1 = r0.n;
        ei3 r4 = im2.Y0(r12);
        r0.n = new hm2((fg4) r1.d, r4, (eo2) r1.f, r1.a, (CharSequence) r1.g, r1.b, r1.c, (Bundle) r1.h);
        e();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        c(8, null);
    }

    public final void c(int r1, Object r2) {
        gk0 r0 = this.b;
        if (r0 == null) goto L6;
        r0.obtainMessage(r1, r2).sendToTarget();
        return;
    }

    public final void d(Handler r2) {
        if (r2 != null) goto L7;
        gk0 r3 = this.b;
        if (r3 == null) goto L9;
        r3.b = false;
        r3.removeCallbacksAndMessages(null);
        this.b = null;
        return;
    L9:
        return;
    L7:
        gk0 r0 = new gk0(this, r2.getLooper());
        this.b = r0;
        r0.b = true;
    }

    public final void e() {
        Handler r0 = this.d;
        if (r0.hasMessages(1) == false) goto L5;
        return;
    L5:
        r0.sendEmptyMessageDelayed(1, this.e.h);
    }
}
