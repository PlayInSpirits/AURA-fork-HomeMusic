package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 implements pu1 {
    public IBinder e;

    @Override // defpackage.pu1
    public final void A(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3048, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void A0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3046, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void B(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3041, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void B0(ju1 r3, int r4, boolean r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3006, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void C0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3034, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void D(ju1 r3, int r4, int r5, Bundle r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        si0.e(r0, r6);     // Catch: Throwable -> L6
        this.e.transact(3030, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void D0(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3017, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void E0(ju1 r3, int r4, int r5, int r6, int r7) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        r0.writeInt(r7);     // Catch: Throwable -> L6
        this.e.transact(3023, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void F(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3052, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void F0(ju1 r3, int r4, int r5, int r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        this.e.transact(3022, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void G(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3029, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void G0(ju1 r3, int r4, int r5, Bundle r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        si0.e(r0, r6);     // Catch: Throwable -> L6
        this.e.transact(3055, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void H(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3040, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void H0(ju1 r3, int r4, boolean r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3018, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void J(ju1 r3, int r4, iw r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeStrongBinder(r5);     // Catch: Throwable -> L6
        this.e.transact(3010, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void K(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3053, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void L(ju1 r2, int r3, IBinder r4, boolean r5) {
        Parcel r6 = Parcel.obtain();
        r6.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r6.writeStrongInterface(r2);     // Catch: Throwable -> L6
        r6.writeInt(r3);     // Catch: Throwable -> L6
        r6.writeStrongBinder(r4);     // Catch: Throwable -> L6
        r6.writeInt(1);     // Catch: Throwable -> L6
        this.e.transact(3011, r6, null, 1);     // Catch: Throwable -> L6
        r6.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void M(ju1 r3, int r4, int r5, int r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        this.e.transact(3020, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void N(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3019, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void P(ju1 r3, int r4, int r5, int r6, IBinder r7) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        r0.writeStrongBinder(r7);     // Catch: Throwable -> L6
        this.e.transact(3056, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void Q(ju1 r3, int r4, int r5, int r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        this.e.transact(3062, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void R(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3047, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void S(ju1 r3, int r4, int r5, long r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeLong(r6);     // Catch: Throwable -> L6
        this.e.transact(3039, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void T(ju1 r3, int r4, IBinder r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeStrongBinder(r5);     // Catch: Throwable -> L6
        this.e.transact(3031, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void W(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3036, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void Z(ju1 r3, int r4, int r5, IBinder r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeStrongBinder(r6);     // Catch: Throwable -> L6
        this.e.transact(3032, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void a(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3014, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void a0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3042, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.pu1
    public final void b(ju1 r3, int r4, Bundle r5, boolean r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        r0.writeInt(r6 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3057, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void d(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3025, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void d0(ju1 r3, int r4, long r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeLong(r5);     // Catch: Throwable -> L6
        this.e.transact(3038, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void e0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3026, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void f0(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3037, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void g0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3005, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void h0(ju1 r3, int r4, boolean r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3013, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void i0(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3007, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void j0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3035, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void k(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3058, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void l(ju1 r3, int r4, Bundle r5, long r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        r0.writeLong(r6);     // Catch: Throwable -> L6
        this.e.transact(3008, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void m0(ju1 r3, int r4, Surface r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3044, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void n0(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3015, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void o0(ju1 r2, int r3, Bundle r4, boolean r5) {
        Parcel r6 = Parcel.obtain();
        r6.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r6.writeStrongInterface(r2);     // Catch: Throwable -> L6
        r6.writeInt(r3);     // Catch: Throwable -> L6
        si0.e(r6, r4);     // Catch: Throwable -> L6
        r6.writeInt(1);     // Catch: Throwable -> L6
        this.e.transact(3009, r6, null, 1);     // Catch: Throwable -> L6
        r6.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void p(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3059, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void p0(ju1 r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r4);     // Catch: Throwable -> L6
        this.e.transact(3045, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void q(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3024, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void q0(ju1 r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3003, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void r0(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3027, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void s(ju1 r3, int r4, Bundle r5, Bundle r6, boolean r7) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        si0.e(r0, r6);     // Catch: Throwable -> L6
        r0.writeInt(r7 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3060, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void t(ju1 r3, int r4, int r5, int r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        this.e.transact(3051, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void t0(ju1 r3, int r4, Bundle r5, Bundle r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        si0.e(r0, r6);     // Catch: Throwable -> L6
        this.e.transact(3016, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void u(ju1 r3, int r4, IBinder r5, int r6, long r7) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeStrongBinder(r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        r0.writeLong(r7);     // Catch: Throwable -> L6
        this.e.transact(3012, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void v(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3043, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void v0(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3021, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void w(ju1 r3, int r4, float r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeFloat(r5);     // Catch: Throwable -> L6
        this.e.transact(3028, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void x(ju1 r3, int r4, float r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeFloat(r5);     // Catch: Throwable -> L6
        this.e.transact(3002, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void x0(ju1 r3, int r4, boolean r5, int r6) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        this.e.transact(3054, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void y(ju1 r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3004, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void y0(ju1 r3, int r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3033, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.pu1
    public final void z0(ju1 r3, int r4, Surface r5, int r6, int r7) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        si0.e(r0, r5);     // Catch: Throwable -> L6
        r0.writeInt(r6);     // Catch: Throwable -> L6
        r0.writeInt(r7);     // Catch: Throwable -> L6
        this.e.transact(3061, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
