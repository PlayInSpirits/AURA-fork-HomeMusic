package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ui5 extends ef5 {
    public a f;
    public final int g;

    public ui5(a aVar, int i) {
        super(3, "com.google.android.gms.common.internal.IGmsCallbacks");
        this.f = aVar;
        this.g = i;
    }

    @Override // defpackage.ef5
    public final boolean O0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zh5.a(parcel, Bundle.CREATOR);
            zh5.b(parcel);
            ji2.n(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.f;
            int i3 = this.g;
            aVar.getClass();
            xi5 xi5Var = new xi5(aVar, i2, strongBinder, bundle);
            qh5 qh5Var = aVar.r;
            qh5Var.sendMessage(qh5Var.obtainMessage(1, i3, -1, xi5Var));
            this.f = null;
        } else if (i == 2) {
            parcel.readInt();
            zh5.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            jk5 jk5Var = (jk5) zh5.a(parcel, jk5.CREATOR);
            zh5.b(parcel);
            a aVar2 = this.f;
            ji2.n(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ji2.m(jk5Var);
            aVar2.H = jk5Var;
            if (aVar2.i()) {
                pa0 pa0Var = jk5Var.q;
                d34 d34VarE = d34.E();
                e34 e34Var = pa0Var == null ? null : pa0Var.n;
                synchronized (d34VarE) {
                    try {
                        if (e34Var == null) {
                            e34Var = d34.q;
                        } else {
                            e34 e34Var2 = (e34) d34VarE.o;
                            if (e34Var2 == null || e34Var2.n < e34Var.n) {
                            }
                        }
                        d34VarE.o = e34Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = jk5Var.n;
            ji2.n(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.f;
            int i5 = this.g;
            aVar3.getClass();
            xi5 xi5Var2 = new xi5(aVar3, i4, strongBinder2, bundle2);
            qh5 qh5Var2 = aVar3.r;
            qh5Var2.sendMessage(qh5Var2.obtainMessage(1, i5, -1, xi5Var2));
            this.f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
