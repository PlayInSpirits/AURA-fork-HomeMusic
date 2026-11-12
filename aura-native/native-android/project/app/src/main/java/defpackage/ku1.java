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
    public final void c0(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.e.transact(12, parcelObtain, null, 1)) {
                int i2 = tk2.f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.lu1
    public final void f(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i);
            if (!this.e.transact(9, parcelObtain, null, 1)) {
                int i2 = tk2.f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.lu1
    public final void j(ei3 ei3Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            ei3Var.writeToParcel(parcelObtain, 0);
            if (!this.e.transact(3, parcelObtain, null, 1)) {
                int i = tk2.f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
