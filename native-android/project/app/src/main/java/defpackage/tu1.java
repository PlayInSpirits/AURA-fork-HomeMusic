package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 implements uu1 {
    public IBinder e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.uu1
    public final void o(String[] r3) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(uu1.a);     // Catch: Throwable -> L6
        r0.writeStringArray(r3);     // Catch: Throwable -> L6
        this.e.transact(1, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
