package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 implements ev1 {
    public IBinder e;

    @Override // defpackage.ev1
    public final void J0(int r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(ev1.d);     // Catch: Throwable -> L6
        r0.writeInt(r3);     // Catch: Throwable -> L6
        r0.writeTypedObject(r4, 0);     // Catch: Throwable -> L6
        this.e.transact(1, r0, null, 1);     // Catch: Throwable -> L6
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
}
