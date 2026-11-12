package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 extends Binder implements lu1 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference e;

    public tk2(gm2 gm2Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.e = new WeakReference(gm2Var);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.lu1
    public final void c0(int i) {
        gm2 gm2Var = (gm2) this.e.get();
        if (gm2Var != null) {
            gm2Var.c(12, Integer.valueOf(i));
        }
    }

    @Override // defpackage.lu1
    public final void f(int i) {
        gm2 gm2Var = (gm2) this.e.get();
        if (gm2Var != null) {
            gm2Var.c(9, Integer.valueOf(i));
        }
    }

    @Override // defpackage.lu1
    public final void j(ei3 ei3Var) {
        gm2 gm2Var = (gm2) this.e.get();
        if (gm2Var != null) {
            gm2Var.c(2, ei3Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            j(parcel.readInt() != 0 ? ei3.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            f(parcel.readInt());
            return true;
        }
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.e;
        switch (i) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                gm2 gm2Var = (gm2) weakReference.get();
                if (gm2Var != null) {
                    gm2Var.c(11, Boolean.valueOf(z));
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                c0(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                gm2 gm2Var2 = (gm2) weakReference.get();
                if (gm2Var2 != null) {
                    gm2Var2.c(13, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
