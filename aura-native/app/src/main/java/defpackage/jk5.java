package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jk5 extends h2 {
    public static final Parcelable.Creator<jk5> CREATOR = new rh5(9);
    public Bundle n;
    public p61[] o;
    public int p;
    public pa0 q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.K0(parcel, 1, this.n);
        ud3.P0(parcel, 2, this.o, i);
        int i2 = this.p;
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(i2);
        ud3.M0(parcel, 4, this.q, i);
        ud3.S0(parcel, R0);
    }
}
