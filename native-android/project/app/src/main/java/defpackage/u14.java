package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u14 extends Binder implements ev1 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ v14 e;

    public u14(v14 r1) {
        this.e = r1;
        attachInterface(this, ev1.d);
    }

    @Override // defpackage.ev1
    public final void J0(int r3, Bundle r4) {
        v14 r2 = this.e;
        Handler r0 = r2.o;
        if (r0 == null) goto L6;
        r0.post(new eh(r2, r3, r4));
        return;
    L6:
        r2.a(r3, r4);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        String r0 = ev1.d;
        if (r4 < 1) goto L8;
        if (r4 > 16777215) goto L8;
        r5.enforceInterface(r0);
    L8:
        if (r4 != 1598968902) goto L11;
        r6.writeString(r0);
        return true;
    L11:
        if (r4 != 1) goto L13;
        J0(r5.readInt(), (Bundle) r5.readTypedObject(Bundle.CREATOR));
        return true;
    L13:
        return super.onTransact(r4, r5, r6, r7);
    }
}
