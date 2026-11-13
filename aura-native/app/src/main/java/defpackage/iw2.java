package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class iw2 extends h2 {
    public static final Parcelable.Creator<iw2> CREATOR = new j84(17);
    public final int n;
    public final int o;
    public final int p;
    public final long q;
    public final long r;
    public final String s;
    public final String t;
    public final int u;
    public final int v;

    public iw2(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = j;
        this.r = j2;
        this.s = str;
        this.t = str2;
        this.u = i4;
        this.v = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int R0 = ud3.R0(parcel, 20293);
        ud3.T0(parcel, 1, 4);
        parcel.writeInt(this.n);
        ud3.T0(parcel, 2, 4);
        parcel.writeInt(this.o);
        ud3.T0(parcel, 3, 4);
        parcel.writeInt(this.p);
        ud3.T0(parcel, 4, 8);
        parcel.writeLong(this.q);
        ud3.T0(parcel, 5, 8);
        parcel.writeLong(this.r);
        ud3.O0(parcel, 6, this.s);
        ud3.O0(parcel, 7, this.t);
        ud3.T0(parcel, 8, 4);
        parcel.writeInt(this.u);
        ud3.T0(parcel, 9, 4);
        parcel.writeInt(this.v);
        ud3.S0(parcel, R0);
    }
}
