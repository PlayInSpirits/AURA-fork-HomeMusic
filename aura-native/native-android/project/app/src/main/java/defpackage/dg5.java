package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dg5 extends h2 {
    public static final Parcelable.Creator<dg5> CREATOR = new j84(16);
    public final int n;
    public final ka0 o;
    public final ig5 p;

    public dg5(int i, ka0 ka0Var, ig5 ig5Var) {
        this.n = i;
        this.o = ka0Var;
        this.p = ig5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.M0(parcel, 2, this.o, i);
        ud3.M0(parcel, 3, this.p, i);
        ud3.S0(parcel, iR0);
    }
}
