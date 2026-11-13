package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nd1 implements Parcelable {
    public nd1() {
        super();
    }

    public static final Parcelable.Creator<nd1> CREATOR = new hz0(3);
    public ArrayList n;
    public ArrayList o;
    public qo[] p;
    public int q;
    public String r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeTypedArray(this.p, i);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeStringList(this.s);
        parcel.writeTypedList(this.t);
        parcel.writeTypedList(this.u);
    }
}
