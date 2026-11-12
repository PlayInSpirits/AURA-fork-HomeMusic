package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih5 implements IInterface {
    public final IBinder e;

    public ih5(IBinder r1) {
        this.e = r1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    public final void m(ui5 r4, sh1 r5) {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");     // Catch: Throwable -> L6
        r0.writeStrongBinder(r4);     // Catch: Throwable -> L6
        r0.writeInt(1);     // Catch: Throwable -> L6
        rh5.a(r5, r0, 0);     // Catch: Throwable -> L6
        this.e.transact(46, r0, r1, 0);     // Catch: Throwable -> L6
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
