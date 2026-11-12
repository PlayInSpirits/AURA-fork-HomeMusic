package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk5 {
    public static final Object g = null;
    public static tk5 h;
    public static HandlerThread i;
    public final HashMap a;
    public final Context b;
    public volatile zw2 c;
    public final fz0 d;
    public final long e;
    public final long f;

    static {
        g = new Object();
    }

    public tk5(Context r3, Looper r4) {
        this.a = new HashMap();
        ai1 r0 = new ai1(2, this);
        this.b = r3.getApplicationContext();
        zw2 r5 = new zw2(r4, r0, 4);
        Looper.getMainLooper();
        this.c = r5;
        if (fz0.N != null) goto L15;
        Object r6 = fz0.M;
        monitor-enter(r6);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (fz0.N != null) goto L11;
        fz0.N = new fz0();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r6);     // Catch: Throwable -> L9
    L15:
        fz0 r7 = fz0.N;
        ji2.m(r7);
        this.d = r7;
        this.e = 5000;
        this.f = 300000;
    }

    public final void a(String r5, ServiceConnection r6, boolean r7) {
        nk5 r0 = new nk5(r5, r7);
        ji2.n(r6, "ServiceConnection must not be null");
        HashMap r1 = this.a;
        monitor-enter(r1);
        pk5 r2 = (pk5) this.a.get(r0);     // Catch: Throwable -> L11
        if (r2 == null) goto L18;
        if (r2.n.containsKey(r6) == false) goto L16;
        r2.n.remove(r6);     // Catch: Throwable -> L11
        if (r2.n.isEmpty() == false) goto L13;
        Message r8 = this.c.obtainMessage(0, r0);     // Catch: Throwable -> L11
        this.c.sendMessageDelayed(r8, this.e);     // Catch: Throwable -> L11
    L13:
        monitor-exit(r1);     // Catch: Throwable -> L11
        return;
    L16:
        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(r0.toString()));     // Catch: Throwable -> L11
    L18:
        throw new IllegalStateException("Nonexistent connection status for service config: ".concat(r0.toString()));     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public final boolean b(nk5 r6, wi5 r7, String r8) {
        HashMap r1 = this.a;
        monitor-enter(r1);
        pk5 r2 = (pk5) this.a.get(r6);     // Catch: Throwable -> L7
        if (r2 != null) goto L9;
        r2 = new pk5(this, r6);     // Catch: Throwable -> L7
        r2.n.put(r7, r7);     // Catch: Throwable -> L7
        r2.a(r8, null);     // Catch: Throwable -> L7
        this.a.put(r6, r2);     // Catch: Throwable -> L7
    L18:
        boolean r5 = r2.p;     // Catch: Throwable -> L7
        monitor-exit(r1);     // Catch: Throwable -> L7
        return r5;
    L9:
        this.c.removeMessages(0, r6);     // Catch: Throwable -> L7
        if (r2.n.containsKey(r7) == true) goto L22;
        r2.n.put(r7, r7);     // Catch: Throwable -> L7
        int r9 = r2.o;     // Catch: Throwable -> L7
        if (r9 != 1) goto L14;
        r7.onServiceConnected(r2.s, r2.q);     // Catch: Throwable -> L7
        goto L18
    L14:
        if (r9 != 2) goto L18;
        r2.a(r8, null);     // Catch: Throwable -> L7
        goto L18
    L22:
        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(r6.toString()));     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }
}
