package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yl2 implements ServiceConnection {
    public final Bundle n;
    public final /* synthetic */ bm2 o;

    public yl2(bm2 r1, Bundle r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName r3) {
        bm2 r2 = this.o;
        sk2 r4 = r2.f1();
        sk2 r5 = r2.f1();
        Objects.requireNonNull(r5);
        r4.a1(new qa1(18, r5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r9, IBinder r10) {
        bm2 r1 = this.o;
        cb4 r2 = r1.e;
        int r5 = 18;
    L17:
        l93.q0("MCImplBase", "Service " + r9 + " has died prematurely");     // Catch: Throwable -> L9
        sk2 r8 = r1.f1();
        sk2 r11 = r1.f1();
        Objects.requireNonNull(r11);
        qa1 r12 = new qa1(r5, r11);
    L7:
        r8.a1(r12);
        return;
    L4:
        if (r2.a.g().equals(r9.getPackageName()) == true) goto L11;
        l93.F("MCImplBase", "Expected connection to " + r2.a.g() + " but is connected to " + r9);     // Catch: Throwable -> L9 RemoteException -> L17
        r8 = r1.f1();
        sk2 r13 = r1.f1();
        Objects.requireNonNull(r13);
        r12 = new qa1(r5, r13);
        goto L7
    L11:
        su1 r14 = qs2.m(r10);     // Catch: Throwable -> L9 RemoteException -> L17
        if (r14 != null) goto L15;
        l93.F("MCImplBase", "Service interface is missing.");     // Catch: Throwable -> L9 RemoteException -> L17
        r8 = r1.f1();
        sk2 r15 = r1.f1();
        Objects.requireNonNull(r15);
        r12 = new qa1(r5, r15);
        goto L7
    L15:
        String r4 = r1.d.getPackageName();     // Catch: Throwable -> L9 RemoteException -> L17
        int r6 = Process.myPid();     // Catch: Throwable -> L9 RemoteException -> L17
        Bundle r16 = this.n;     // Catch: Throwable -> L9 RemoteException -> L17
        r1.a.getClass();     // Catch: Throwable -> L9 RemoteException -> L17
        r14.k0(r1.c, new ja0(r4, r6, r16).b());     // Catch: Throwable -> L9 RemoteException -> L17
        return;
    L9:
        th = move-exception;
        sk2 r17 = r1.f1();
        sk2 r18 = r1.f1();
        Objects.requireNonNull(r18);
        r17.a1(new qa1(r5, r18));
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r3) {
        bm2 r2 = this.o;
        sk2 r4 = r2.f1();
        sk2 r5 = r2.f1();
        Objects.requireNonNull(r5);
        r4.a1(new qa1(18, r5));
    }
}
