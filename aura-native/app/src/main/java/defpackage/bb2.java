package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bb2 implements Parcelable {
    public bb2() {
        super();
    }

    public static final Parcelable.Creator<bb2> CREATOR = new hz0(14);
    public int n;
    public int o;
    public boolean p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
