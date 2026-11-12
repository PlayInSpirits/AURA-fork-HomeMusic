package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ru1 implements su1 {
    public IBinder e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.su1
    public final void k0(ju1 r3, Bundle r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("androidx.media3.session.IMediaSessionService");     // Catch: Throwable -> L6
        r0.writeStrongInterface(r3);     // Catch: Throwable -> L6
        r0.writeInt(1);     // Catch: Throwable -> L6
        r4.writeToParcel(r0, 0);     // Catch: Throwable -> L6
        this.e.transact(3001, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
