package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vk5 implements eu1, IInterface {
    public final IBinder e;

    public vk5(IBinder r1) {
        this.e = r1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    public final Account m() {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel r1 = Parcel.obtain();
        this.e.transact(2, r0, r1, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r1.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r0.recycle();
        Account r4 = (Account) zh5.a(r1, Account.CREATOR);
        r1.recycle();
        return r4;
    L8:
        e = move-exception;
        r1.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
