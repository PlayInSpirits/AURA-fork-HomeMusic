package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = null;
    public final int n;
    public final MediaDescriptionCompat o;

    static {
        CREATOR = new hz0(18);
    }

    public MediaBrowserCompat$MediaItem(Parcel r2) {
        this.n = r2.readInt();
        this.o = MediaDescriptionCompat.CREATOR.createFromParcel(r2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.n + ", mDescription=" + this.o + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.n);
        this.o.writeToParcel(r2, r3);
    }
}
