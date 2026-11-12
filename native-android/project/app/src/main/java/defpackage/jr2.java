package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 extends Binder implements qu1 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference e;

    public jr2(kr2 r2) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.e = new WeakReference(r2);
    }

    @Override // defpackage.qu1
    public final int V() {
        kr2 r0 = (kr2) this.e.get();
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.k;
    }

    @Override // defpackage.qu1
    public final boolean Y() {
        kr2 r0 = (kr2) this.e.get();
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.qu1
    public final void b0(lu1 r2) {
        kr2 r1 = (kr2) this.e.get();
        if (r1 == null) goto L13;
        if (r2 == null) goto L16;
        r1.f.unregister(r2);
        Binder.getCallingPid();
        Binder.getCallingUid();
        Object r3 = r1.d;
        monitor-enter(r3);
        monitor-exit(r3);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    L16:
        return;
    }

    @Override // defpackage.qu1
    public final ei3 g() {
        kr2 r0 = (kr2) this.e.get();
        if (r0 == null) goto L37;
        ei3 r1 = r0.g;
        eo2 r2 = r0.i;
        if (r1 == null) goto L36;
        float r3 = r1.q;
        long r4 = r1.u;
        int r5 = r1.n;
        long r6 = r1.o;
        long r8 = -1;
        if (r6 == (-1)) goto L36;
        if (r5 == 3) goto L16;
        if (r5 == 4) goto L16;
        if (r5 != 5) goto L36;
    L16:
        if (r4 <= 0) goto L36;
        long r23 = SystemClock.elapsedRealtime();
        long r7 = ((long) (r3 * (r23 - r4))) + r6;
        if (r2 == null) goto L23;
        if (r2.n.containsKey("android.media.metadata.DURATION") == false) goto L23;
        r8 = r2.a("android.media.metadata.DURATION");
    L23:
        if (r8 < 0) goto L28;
        if (r7 <= r8) goto L28;
        long r14 = r8;
    L31:
        ArrayList r9 = new ArrayList();
        long r10 = r1.p;
        long r11 = r1.r;
        int r12 = r1.s;
        CharSequence r13 = r1.t;
        List r15 = r1.v;
        if (r15 == null) goto L35;
        r9.addAll(r15);
    L35:
        return new ei3(r1.n, r14, r10, r1.q, r11, r12, r13, r23, r9, r1.w, r1.x);
    L28:
        if (r7 >= 0) goto L30;
        r14 = 0;
        goto L31
    L30:
        r14 = r7;
    L36:
        return r1;
    L37:
        return null;
    }

    @Override // defpackage.qu1
    public final int h() {
        kr2 r0 = (kr2) this.e.get();
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.j;
    }

    @Override // defpackage.qu1
    public final void l0(lu1 r5) {
        kr2 r4 = (kr2) this.e.get();
        if (r4 == null) goto L13;
        if (r5 == null) goto L16;
        ms2 r2 = new ms2("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
        r4.f.register(r5, r2);
        Object r6 = r4.d;
        monitor-enter(r6);
        monitor-exit(r6);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    L16:
        return;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r6, Parcel r7, Parcel r8, int r9) {
        lu1 r2 = null;
        Bundle r3 = null;
        r3 = null;
        lu1 r4 = null;
        if (r6 != 3) goto L5;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        IBinder r10 = r7.readStrongBinder();
        if (r10 == null) goto L65;
        IInterface r11 = r10.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (r11 != null) goto L62;
    L64:
        ku1 r5 = new ku1();
        r5.e = r10;
        r2 = r5;
        goto L65
    L62:
        if ((r11 instanceof lu1) == false) goto L64;
        r2 = (lu1) r11;
    L65:
        l0(r2);
        r8.getClass();
        r8.writeNoException();
        return true;
    L5:
        if (r6 != 4) goto L7;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        IBinder r12 = r7.readStrongBinder();
        if (r12 == null) goto L54;
        IInterface r13 = r12.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (r13 != null) goto L51;
    L53:
        ku1 r14 = new ku1();
        r14.e = r12;
        r4 = r14;
        goto L54
    L51:
        if ((r13 instanceof lu1) == false) goto L53;
        r4 = (lu1) r13;
    L54:
        b0(r4);
        r8.getClass();
        r8.writeNoException();
        return true;
    L7:
        if (r6 != 28) goto L9;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        ei3 r15 = g();
        r8.getClass();
        r8.writeNoException();
        if (r15 == null) goto L43;
        r8.writeInt(1);
        r15.writeToParcel(r8, 1);
        return true;
    L43:
        r8.writeInt(0);
        return true;
    L9:
        if (r6 != 37) goto L11;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        int r16 = h();
        r8.getClass();
        r8.writeNoException();
        r8.writeInt(r16);
        return true;
    L11:
        if (r6 != 45) goto L13;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        Y();
        r8.getClass();
        r8.writeNoException();
        r8.writeInt(0);
        return true;
    L13:
        if (r6 != 47) goto L15;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        int r17 = V();
        r8.getClass();
        r8.writeNoException();
        r8.writeInt(r17);
        return true;
    L15:
        if (r6 != 50) goto L17;
        r7.enforceInterface("android.support.v4.media.session.IMediaSession");
        kr2 r18 = (kr2) this.e.get();
        if (r18 == null) goto L27;
        Bundle r19 = r18.e;
        if (r19 == null) goto L27;
        r3 = new Bundle(r19);
    L27:
        r8.getClass();
        r8.writeNoException();
        if (r3 == null) goto L31;
        r8.writeInt(1);
        r3.writeToParcel(r8, 1);
        return true;
    L31:
        r8.writeInt(0);
        return true;
    L17:
        if (r6 != 1598968902) goto L19;
        r8.getClass();
        r8.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    L19:
        return super.onTransact(r6, r7, r8, r9);
    }
}
