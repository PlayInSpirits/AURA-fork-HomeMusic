package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vk5 implements eu1, IInterface {
    public final IBinder e;

    public vk5(IBinder iBinder) {
        this.e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    public final Account m() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.e.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Account account = (Account) zh5.a(parcelObtain2, Account.CREATOR);
                parcelObtain2.recycle();
                return account;
            } catch (RuntimeException e) {
                parcelObtain2.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
