package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af5 implements IInterface {
    public final /* synthetic */ int e;
    public final IBinder f;
    public final String g;

    public /* synthetic */ af5(IBinder iBinder, String str, int i) {
        this.e = i;
        this.f = iBinder;
        this.g = str;
    }

    public void U(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.f;
    }

    public Parcel m() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.g);
        return parcelObtain;
    }
}
