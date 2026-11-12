package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements ju1 {
    public IBinder e;

    @Override // defpackage.ju1
    public final void C(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        this.e.transact(3008, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void E(int r3, Bundle r4, Bundle r5) {
        Bundle r6 = Bundle.EMPTY;
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        gh0.L(r0, r6);     // Catch: Throwable -> L6
        this.e.transact(3005, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void I(int r3, Bundle r4, Bundle r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        gh0.L(r0, r5);     // Catch: Throwable -> L6
        this.e.transact(3013, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void I0(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        this.e.transact(3002, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void O(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        this.e.transact(3003, r0, null, 1);     // Catch: Throwable -> L6
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

    @Override // defpackage.ju1
    public final void c() {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(0);     // Catch: Throwable -> L6
        this.e.transact(3006, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void e(int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        this.e.transact(3011, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void i(int r3, int r4, int r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.e.transact(3018, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void n(List r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        gh0.b(r0, r3);     // Catch: Throwable -> L6
        this.e.transact(3016, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void r(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        this.e.transact(3001, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void s0(List r3, int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        gh0.b(r0, r3);     // Catch: Throwable -> L6
        this.e.transact(3004, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void u0(int r3, Bundle r4, boolean r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        r0.writeInt(r5 ? 1 : 0);     // Catch: Throwable -> L6
        this.e.transact(3007, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void w0(int r2, String r3, int r4, Bundle r5) {
        Parcel r6 = Parcel.obtain();
        r6.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r6.writeInt(r2);     // Catch: Throwable -> L6
        r6.writeString(r3);     // Catch: Throwable -> L6
        r6.writeInt(Integer.MAX_VALUE);     // Catch: Throwable -> L6
        gh0.L(r6, r5);     // Catch: Throwable -> L6
        this.e.transact(4001, r6, null, 1);     // Catch: Throwable -> L6
        r6.recycle();
        return;
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    @Override // defpackage.ju1
    public final void z(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaController");     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        gh0.L(r0, r4);     // Catch: Throwable -> L6
        this.e.transact(3009, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
