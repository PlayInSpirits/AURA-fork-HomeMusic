package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wi5 implements ServiceConnection {
    public final int n;
    public final /* synthetic */ a o;

    public wi5(a r1, int r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r4, IBinder r5) {
        a r6 = this.o;
        if (r5 != null) goto L17;
        Object r0 = r6.s;
        monitor-enter(r0);
        int r3 = r6.z;     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        if (r3 != 3) goto L11;
        r6.G = true;
        int r7 = 5;
    L12:
        qh5 r8 = r6.r;
        r8.sendMessage(r8.obtainMessage(r7, r6.I.get(), 16));
        return;
    L11:
        r7 = 4;
    L14:
        th = move-exception;
        throw th;
    L17:
        Object r9 = r6.t;
        monitor-enter(r9);
        a r1 = this.o;     // Catch: Throwable -> L24
        IInterface r2 = r5.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");     // Catch: Throwable -> L24
        if (r2 != null) goto L22;
    L26:
        ih5 r10 = new ih5(r5);     // Catch: Throwable -> L24
    L27:
        r1.u = r10;     // Catch: Throwable -> L24
        monitor-exit(r9);     // Catch: Throwable -> L24
        a r11 = this.o;
        int r12 = this.n;
        fj5 r13 = new fj5(r11, 0);
        qh5 r14 = r11.r;
        r14.sendMessage(r14.obtainMessage(7, r12, -1, r13));
        return;
    L22:
        if ((r2 instanceof ih5) == false) goto L26;
        r10 = (ih5) r2;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r3) {
        Object r4 = this.o.t;
        monitor-enter(r4);
        a r0 = this.o;     // Catch: Throwable -> L8
        r0.u = null;     // Catch: Throwable -> L8
        monitor-exit(r4);     // Catch: Throwable -> L8
        int r2 = this.n;
        qh5 r5 = r0.r;
        r5.sendMessage(r5.obtainMessage(6, r2, 1));
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
