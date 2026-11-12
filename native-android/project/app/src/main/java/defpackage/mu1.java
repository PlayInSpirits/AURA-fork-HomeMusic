package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements qu1 {
    public IBinder e;

    @Override // defpackage.qu1
    public final int V() {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        if (this.e.transact(47, r0, r1, 0) == true) goto L8;
        int r4 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        int r5 = r1.readInt();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return r5;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // defpackage.qu1
    public final boolean Y() {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        boolean r3 = false;
        if (this.e.transact(45, r0, r1, 0) == true) goto L8;
        int r4 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        if (r1.readInt() == 0) goto L11;
        r3 = true;
    L11:
        r1.recycle();
        r0.recycle();
        return r3;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.qu1
    public final void b0(lu1 r4) {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongBinder((tk2) r4);     // Catch: Throwable -> L6
        if (this.e.transact(4, r0, r1, 0) == true) goto L8;
        int r3 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // defpackage.qu1
    public final ei3 g() {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        if (this.e.transact(28, r0, r1, 0) == true) goto L8;
        int r4 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        if (r1.readInt() == 0) goto L12;
        ei3 r5 = ei3.CREATOR.createFromParcel(r1);     // Catch: Throwable -> L6
    L13:
        r1.recycle();
        r0.recycle();
        return r5;
    L12:
        r5 = null;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // defpackage.qu1
    public final int h() {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        if (this.e.transact(37, r0, r1, 0) == true) goto L8;
        int r4 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        int r5 = r1.readInt();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return r5;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // defpackage.qu1
    public final void l0(lu1 r4) {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");     // Catch: Throwable -> L6
        r0.writeStrongBinder((tk2) r4);     // Catch: Throwable -> L6
        if (this.e.transact(3, r0, r1, 0) == true) goto L8;
        int r3 = jr2.f;     // Catch: Throwable -> L6
    L8:
        r1.readException();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }
}
