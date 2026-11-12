package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class v14 implements Parcelable {
    public static final Parcelable.Creator<v14> CREATOR = new b23(29);
    public final boolean n;
    public final Handler o;
    public ev1 p;

    public v14(Parcel parcel) {
        this.n = false;
        ev1 ev1Var = null;
        this.o = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = u14.f;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ev1.d);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ev1)) {
                dv1 dv1Var = new dv1();
                dv1Var.e = strongBinder;
                ev1Var = dv1Var;
            } else {
                ev1Var = (ev1) iInterfaceQueryLocalInterface;
            }
        }
        this.p = ev1Var;
    }

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        if (this.n) {
            Handler handler = this.o;
            if (handler != null) {
                handler.post(new eh(this, i, bundle));
                return;
            } else {
                a(i, bundle);
                return;
            }
        }
        ev1 ev1Var = this.p;
        if (ev1Var != null) {
            try {
                ev1Var.J0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new u14(this);
                }
                parcel.writeStrongBinder(this.p.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public v14(Handler handler) {
        this.n = true;
        this.o = handler;
    }
}
