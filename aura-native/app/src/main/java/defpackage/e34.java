package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e34 extends h2 {
    public static final Parcelable.Creator<e34> CREATOR = new ch5(11);
    public final int n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final int r;

    public e34(int i, boolean z, boolean z2, int i2, int i3) {
        this.n = i;
        this.o = z;
        this.p = z2;
        this.q = i2;
        this.r = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p ? 1 : 0);
        ud3.T0(parcel, 4, 4);
        parcel.writeInt(this.q);
        ud3.T0(parcel, 5, 4);
        parcel.writeInt(this.r);
        ud3.S0(parcel, R0);
    }
}
