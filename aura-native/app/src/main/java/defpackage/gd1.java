package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gd1 implements Parcelable {
    public gd1() {
        super();
    }

    public static final Parcelable.Creator<gd1> CREATOR = new hz0(2);
    public String n;
    public int o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
    }
}
