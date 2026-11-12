package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zy2 extends Binder implements vu1 {
    public final /* synthetic */ MultiInstanceInvalidationService e;

    public zy2(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.e = multiInstanceInvalidationService;
        attachInterface(this, vu1.b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        az2 az2Var;
        String str = vu1.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        uu1 uu1Var = null;
        uu1 uu1Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(uu1.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof uu1)) {
                    tu1 tu1Var = new tu1();
                    tu1Var.e = strongBinder;
                    uu1Var = tu1Var;
                } else {
                    uu1Var = (uu1) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            uu1Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
                synchronized (multiInstanceInvalidationService.p) {
                    try {
                        int i4 = multiInstanceInvalidationService.n + 1;
                        multiInstanceInvalidationService.n = i4;
                        if (multiInstanceInvalidationService.p.register(uu1Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.o.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.n--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(uu1.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof uu1)) {
                    tu1 tu1Var2 = new tu1();
                    tu1Var2.e = strongBinder2;
                    uu1Var2 = tu1Var2;
                } else {
                    uu1Var2 = (uu1) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            uu1Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.e;
            synchronized (multiInstanceInvalidationService2.p) {
                multiInstanceInvalidationService2.p.unregister(uu1Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.e;
        synchronized (multiInstanceInvalidationService3.p) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.o.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.p.beginBroadcast();
                    while (true) {
                        az2Var = multiInstanceInvalidationService3.p;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = az2Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.o.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((uu1) multiInstanceInvalidationService3.p.getBroadcastItem(i3)).o(strArrCreateStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.p.finishBroadcast();
                            throw th2;
                        }
                    }
                    az2Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }
}
