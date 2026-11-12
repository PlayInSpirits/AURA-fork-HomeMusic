package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 extends ResultReceiver {
    public final WeakReference n;

    public wk2(xk2 r2) {
        super(null);
        this.n = new WeakReference(r2);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r5, Bundle r6) {
        xk2 r4 = (xk2) this.n.get();
        if (r4 == null) goto L38;
        if (r6 == null) goto L44;
        Object r7 = r4.b;
        monitor-enter(r7);
        pr2 r0 = r4.e;     // Catch: Throwable -> L28
        IBinder r1 = r6.getBinder("android.support.v4.media.session.EXTRA_BINDER");     // Catch: Throwable -> L28
        int r2 = jr2.f;     // Catch: Throwable -> L28
        if (r1 != null) goto L11;
        qu1 r3 = null;
    L17:
        Object r8 = r0.n;     // Catch: Throwable -> L28
        monitor-enter(r8);     // Catch: Throwable -> L28
        r0.p = r3;     // Catch: Throwable -> L33
        monitor-exit(r8);     // Catch: Throwable -> L33
        pr2 r9 = r4.e;     // Catch: Throwable -> L28
        u45 r10 = ud3.L(r6);     // Catch: Throwable -> L28
        Object r11 = r9.n;     // Catch: Throwable -> L28
        monitor-enter(r11);     // Catch: Throwable -> L28
        r9.q = r10;     // Catch: Throwable -> L30
        monitor-exit(r11);     // Catch: Throwable -> L30
        r4.a();     // Catch: Throwable -> L28
        monitor-exit(r7);     // Catch: Throwable -> L28
        return;
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L11:
        IInterface r12 = r1.queryLocalInterface("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L28
        if (r12 != null) goto L14;
    L16:
        mu1 r13 = new mu1();     // Catch: Throwable -> L28
        r13.e = r1;     // Catch: Throwable -> L28
        r3 = r13;
        goto L17
    L14:
        if ((r12 instanceof qu1) == false) goto L16;
        r3 = (qu1) r12;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    L44:
        return;
    }
}
