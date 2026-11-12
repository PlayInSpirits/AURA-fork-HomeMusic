package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new hz0(18);
    public final int n;
    public final MediaDescriptionCompat o;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.n = parcel.readInt();
        this.o = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.n + ", mDescription=" + this.o + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        this.o.writeToParcel(parcel, i);
    }
}
