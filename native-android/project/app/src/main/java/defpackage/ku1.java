package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 implements lu1 {
    public IBinder e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.lu1
    public final void c0(int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");     // Catch: Throwable -> L7
        r0.writeInt(r4);     // Catch: Throwable -> L7
        if (this.e.transact(12, r0, null, 1) == true) goto L9;
        int r3 = tk2.f;     // Catch: Throwable -> L7
    L9:
        r0.recycle();
        return;
    L7:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.lu1
    public final void f(int r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");     // Catch: Throwable -> L7
        r0.writeInt(r4);     // Catch: Throwable -> L7
        if (this.e.transact(9, r0, null, 1) == true) goto L9;
        int r3 = tk2.f;     // Catch: Throwable -> L7
    L9:
        r0.recycle();
        return;
    L7:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    @Override // defpackage.lu1
    public final void j(ei3 r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");     // Catch: Throwable -> L7
        r0.writeInt(1);     // Catch: Throwable -> L7
        r4.writeToParcel(r0, 0);     // Catch: Throwable -> L7
        if (this.e.transact(3, r0, null, 1) == true) goto L9;
        int r3 = tk2.f;     // Catch: Throwable -> L7
    L9:
        r0.recycle();
        return;
    L7:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
