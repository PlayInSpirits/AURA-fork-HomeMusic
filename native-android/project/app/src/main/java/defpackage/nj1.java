package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 extends h2 {
    public static final Parcelable.Creator<nj1> CREATOR = new j84(10);
    public final int n;
    public final int o;
    public final Bundle p;

    public nj1(int i, int i2, Bundle bundle) {
        this.n = i;
        this.o = i2;
        this.p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        ud3.K0(parcel, 3, this.p);
        ud3.S0(parcel, iR0);
    }
}
