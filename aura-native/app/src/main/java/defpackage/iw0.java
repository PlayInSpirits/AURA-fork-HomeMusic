package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class iw0 extends k {
    public iw0(android.os.Parcelable a0) {
        super(a0);
    }

    public static final Parcelable.Creator<iw0> CREATOR = new yd3(3);
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;

    public iw0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.p = 0;
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
    }
}
