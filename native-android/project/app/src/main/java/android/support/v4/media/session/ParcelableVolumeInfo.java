package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = null;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    static {
        CREATOR = new b23(8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.n);
        r1.writeInt(this.p);
        r1.writeInt(this.q);
        r1.writeInt(this.r);
        r1.writeInt(this.o);
    }
}
