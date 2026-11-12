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

    public nk2(ok2 r1, ak2 r2) {
        this.o = r1;
        Handler r3 = f35.p(this);
        this.n = r3;
        r2.v(this, r3);
    }

    public final void a(long r7) {
        ok2 r0 = this.o;
        rf2 r1 = r0.W0;
        if (this == r0.G1) goto L5;
        return;
    L5:
        if (r0.a0 != null) goto L8;
        return;
    L8:
        if (r7 != Long.MAX_VALUE) goto L30;
        r0.H0 = true;
        return;
    L30:
        r0.D0(r7);     // Catch: ExoPlaybackException -> L27
        s55 r6 = r0.B1;     // Catch: ExoPlaybackException -> L27
        if (r6.equals(s55.d) == false) goto L14;
    L16:
        r0.J0.e++;     // Catch: ExoPlaybackException -> L27
        e55 r8 = r0.Z0;     // Catch: ExoPlaybackException -> L27
        if (r8.e == 3) goto L19;
        boolean r3 = true;
    L20:
        r8.e = 3;     // Catch: ExoPlaybackException -> L27
        r8.l.getClass();     // Catch: ExoPlaybackException -> L27
        r8.g = f35.Q(SystemClock.elapsedRealtime());     // Catch: ExoPlaybackException -> L27
        if (r3 == false) goto L25;
        Surface r9 = r0.l1;     // Catch: ExoPlaybackException -> L27
        if (r9 == null) goto L25;
        r1.j(r9);     // Catch: ExoPlaybackException -> L27
        r0.o1 = true;     // Catch: ExoPlaybackException -> L27
    L25:
        r0.i0(r7);     // Catch: ExoPlaybackException -> L27
        return;
    L19:
        r3 = false;
        goto L20
    L14:
        if (r6.equals(r0.C1) == true) goto L16;
        r0.C1 = r6;     // Catch: ExoPlaybackException -> L27
        r1.o(r6);     // Catch: ExoPlaybackException -> L27
    L27:
        e = move-exception;
        r0.I0 = e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r7) {
        if (r7.what == 0) goto L6;
        return false;
    L6:
        int r0 = r7.arg1;
        int r8 = r7.arg2;
        String r1 = f35.a;
        a(((((long) r0) & 4294967295L) << 32) | (4294967295L & ((long) r8)));
        return true;
    }
}
