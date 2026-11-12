package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends h2 {
    public final String A;
    public final int n;
    public final int o;
    public final int p;
    public String q;
    public IBinder r;
    public Scope[] s;
    public Bundle t;
    public Account u;
    public p61[] v;
    public p61[] w;
    public final boolean x;
    public final int y;
    public boolean z;
    public static final Parcelable.Creator<sh1> CREATOR = new rh5(13);
    public static final Scope[] B = new Scope[0];
    public static final p61[] C = new p61[0];

    public sh1(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, p61[] p61VarArr, p61[] p61VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? B : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        p61[] p61VarArr3 = C;
        p61VarArr = p61VarArr == null ? p61VarArr3 : p61VarArr;
        p61VarArr2 = p61VarArr2 == null ? p61VarArr3 : p61VarArr2;
        this.n = i;
        this.o = i2;
        this.p = i3;
        if ("com.google.android.gms".equals(str)) {
            this.q = "com.google.android.gms";
        } else {
            this.q = str;
        }
        if (i < 2) {
            Account accountM = null;
            if (iBinder != null) {
                int i5 = g4.f;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                eu1 vk5Var = iInterfaceQueryLocalInterface instanceof eu1 ? (eu1) iInterfaceQueryLocalInterface : new vk5(iBinder);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountM = ((vk5) vk5Var).m();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.u = accountM;
        } else {
            this.r = iBinder;
            this.u = account;
        }
        this.s = scopeArr;
        this.t = bundle;
        this.v = p61VarArr;
        this.w = p61VarArr2;
        this.x = z;
        this.y = i4;
        this.z = z2;
        this.A = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rh5.a(this, parcel, i);
    }
}
