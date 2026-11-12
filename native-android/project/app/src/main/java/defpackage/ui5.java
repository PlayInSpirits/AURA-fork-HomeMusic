package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ui5 extends ef5 {
    public a f;
    public final int g;

    public ui5(a r3, int r4) {
        super(3, "com.google.android.gms.common.internal.IGmsCallbacks");
        this.f = r3;
        this.g = r4;
    }

    @Override // defpackage.ef5
    public final boolean O0(int r9, Parcel r10, Parcel r11) {
        if (r9 != 1) goto L5;
        int r12 = r10.readInt();
        IBinder r3 = r10.readStrongBinder();
        Bundle r4 = (Bundle) zh5.a(r10, Bundle.CREATOR);
        zh5.b(r10);
        ji2.n(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
        a r13 = this.f;
        int r5 = this.g;
        r13.getClass();
        xi5 r6 = new xi5(r13, r12, r3, r4);
        qh5 r14 = r13.r;
        r14.sendMessage(r14.obtainMessage(1, r5, -1, r6));
        this.f = null;
    L34:
        r11.writeNoException();
        return true;
    L5:
        if (r9 != 2) goto L7;
        r10.readInt();
        Bundle r8 = (Bundle) zh5.a(r10, Bundle.CREATOR);
        zh5.b(r10);
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        goto L34
    L7:
        if (r9 == 3) goto L10;
        return false;
    L10:
        int r15 = r10.readInt();
        IBinder r7 = r10.readStrongBinder();
        jk5 r16 = (jk5) zh5.a(r10, jk5.CREATOR);
        zh5.b(r10);
        a r17 = this.f;
        ji2.n(r17, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        ji2.m(r16);
        r17.H = r16;
        if (r17.i() == false) goto L31;
        pa0 r18 = r16.q;
        d34 r19 = d34.E();
        if (r18 != null) goto L15;
        e34 r110 = null;
    L16:
        monitor-enter(r19);
        if (r110 != null) goto L24;
        r110 = d34.q;     // Catch: Throwable -> L22
    L19:
        r19.o = r110;     // Catch: Throwable -> L22
    L20:
        monitor-exit(r19);
        goto L31
    L24:
        e34 r20 = (e34) r19.o;     // Catch: Throwable -> L22
        if (r20 == null) goto L19;
        if (r20.n >= r110.n) goto L20;
    L22:
        th = move-exception;
        throw th;
    L15:
        r110 = r18.n;
    L31:
        Bundle r111 = r16.n;
        ji2.n(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
        a r21 = this.f;
        int r22 = this.g;
        r21.getClass();
        xi5 r23 = new xi5(r21, r15, r7, r111);
        qh5 r24 = r21.r;
        r24.sendMessage(r24.obtainMessage(1, r22, -1, r23));
        this.f = null;
        goto L34
    }
}
