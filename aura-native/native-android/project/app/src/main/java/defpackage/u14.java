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

    public u14(v14 v14Var) {
        this.e = v14Var;
        attachInterface(this, ev1.d);
    }

    @Override // defpackage.ev1
    public final void J0(int i, Bundle bundle) {
        v14 v14Var = this.e;
        Handler handler = v14Var.o;
        if (handler != null) {
            handler.post(new eh(v14Var, i, bundle));
        } else {
            v14Var.a(i, bundle);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ev1.d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        J0(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }
}
