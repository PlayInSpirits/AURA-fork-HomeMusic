package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public ParcelableVolumeInfo() {
        super();
    }

    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new b23(8);
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.o);
    }
}
