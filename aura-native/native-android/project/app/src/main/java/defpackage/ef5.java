package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef5 extends Binder implements IInterface {
    public final /* synthetic */ int e;

    public ef5(int i, String str) {
        this.e = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public static void L0(Parcel parcel) {
        int i = bi5.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(f34.f(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public abstract boolean K0(Parcel parcel, int i);

    public abstract boolean M0(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean N0(int i, Parcel parcel, Parcel parcel2);

    public boolean O0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.e;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        boolean zOnTransact2 = false;
        switch (this.e) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return M0(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return N0(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    zOnTransact2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return K0(parcel, i);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return O0(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (!zOnTransact) {
                    t02 t02Var = (t02) this;
                    if (i != 1) {
                        if (i == 2) {
                            Status status = (Status) bi5.a(parcel, Status.CREATOR);
                            L0(parcel);
                            status.getClass();
                            throw new UnsupportedOperationException();
                        }
                        if (i == 3) {
                            Status status2 = (Status) bi5.a(parcel, Status.CREATOR);
                            L0(parcel);
                            status2.getClass();
                            throw new UnsupportedOperationException();
                        }
                        if (i == 4) {
                            Status status3 = (Status) bi5.a(parcel, Status.CREATOR);
                            L0(parcel);
                            status3.getClass();
                            throw new UnsupportedOperationException();
                        }
                        if (i != 5) {
                            return false;
                        }
                        Status status4 = (Status) bi5.a(parcel, Status.CREATOR);
                        L0(parcel);
                        status4.getClass();
                        throw new UnsupportedOperationException();
                    }
                    Status status5 = (Status) bi5.a(parcel, Status.CREATOR);
                    hf3 hf3Var = (hf3) bi5.a(parcel, hf3.CREATOR);
                    L0(parcel);
                    status5.getClass();
                    g12.R(status5, hf3Var, t02Var.f);
                }
                return true;
        }
    }
}
