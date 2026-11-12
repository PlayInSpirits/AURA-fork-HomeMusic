package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk5 implements ServiceConnection {
    public final HashMap n;
    public int o;
    public boolean p;
    public IBinder q;
    public final nk5 r;
    public ComponentName s;
    public final /* synthetic */ tk5 t;

    public pk5(tk5 r1, nk5 r2) {
        this.t = r1;
        this.r = r2;
        this.n = new HashMap();
        this.o = 2;
    }

    public final void a(String r9, Executor r10) {
        this.o = 3;
        StrictMode.VmPolicy r1 = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT < 31) goto L19;
        StrictMode.setVmPolicy(b05.e(new StrictMode.VmPolicy.Builder(r1)).build());
    L19:
        tk5 r0 = this.t;     // Catch: Throwable -> L8
        fz0 r2 = r0.d;     // Catch: Throwable -> L8
        Context r3 = r0.b;     // Catch: Throwable -> L8
        boolean r8 = r2.q(r3, r9, this.r.a(r3), this, r10);     // Catch: Throwable -> L8
        this.p = r8;     // Catch: Throwable -> L8
        if (r8 == false) goto L10;
        Message r11 = this.t.c.obtainMessage(1, this.r);     // Catch: Throwable -> L8
        this.t.c.sendMessageDelayed(r11, this.t.f);     // Catch: Throwable -> L8
    L12:
        StrictMode.setVmPolicy(r1);
        return;
    L10:
        this.o = 2;     // Catch: Throwable -> L8
        tk5 r12 = this.t;     // Catch: Throwable -> L8 IllegalArgumentException -> L16
        r12.d.o(r12.b, this);     // Catch: Throwable -> L8 IllegalArgumentException -> L16
    L8:
        th = move-exception;
        StrictMode.setVmPolicy(r1);
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName r1) {
        onServiceDisconnected(r1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r5, IBinder r6) {
        HashMap r0 = this.t.a;
        monitor-enter(r0);
        this.t.c.removeMessages(1, this.r);     // Catch: Throwable -> L8
        this.q = r6;     // Catch: Throwable -> L8
        this.s = r5;     // Catch: Throwable -> L8
        Iterator r1 = this.n.values().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        ((ServiceConnection) r1.next()).onServiceConnected(r5, r6);     // Catch: Throwable -> L8
        goto L6
    L10:
        this.o = 1;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r5) {
        HashMap r0 = this.t.a;
        monitor-enter(r0);
        this.t.c.removeMessages(1, this.r);     // Catch: Throwable -> L8
        this.q = null;     // Catch: Throwable -> L8
        this.s = r5;     // Catch: Throwable -> L8
        Iterator r1 = this.n.values().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        ((ServiceConnection) r1.next()).onServiceDisconnected(r5);     // Catch: Throwable -> L8
        goto L6
    L10:
        this.o = 2;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
