package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ig5 extends h2 {
    public static final Parcelable.Creator<ig5> CREATOR = new j84(19);
    public final int n;
    public final IBinder o;
    public final ka0 p;
    public final boolean q;
    public final boolean r;

    public ig5(int i, IBinder iBinder, ka0 ka0Var, boolean z, boolean z2) {
        this.n = i;
        this.o = iBinder;
        this.p = ka0Var;
        this.q = z;
        this.r = z2;
    }

    public final boolean equals(Object obj) {
        Object vk5Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig5)) {
            return false;
        }
        ig5 ig5Var = (ig5) obj;
        if (!this.p.equals(ig5Var.p)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.o;
        if (iBinder == null) {
            vk5Var = null;
        } else {
            int i = g4.f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            vk5Var = queryLocalInterface instanceof eu1 ? (eu1) queryLocalInterface : new vk5(iBinder);
        }
        IBinder iBinder2 = ig5Var.o;
        if (iBinder2 != null) {
            int i2 = g4.f;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof eu1 ? (eu1) queryLocalInterface2 : new vk5(iBinder2);
        }
        return au0.n(vk5Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        IBinder iBinder = this.o;
        if (iBinder != null) {
            int R02 = ud3.R0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            ud3.S0(parcel, R02);
        }
        ud3.M0(parcel, 3, this.p, i);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r ? 1 : 0);
        ud3.S0(parcel, R0);
    }
}
