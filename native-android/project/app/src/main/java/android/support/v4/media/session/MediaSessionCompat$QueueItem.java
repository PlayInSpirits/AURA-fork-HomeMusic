package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.b11;
import defpackage.hz0;
import defpackage.kf2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new hz0(24);
    public final MediaDescriptionCompat n;
    public final long o;

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            kf2.n("Description cannot be null");
            throw null;
        }
        if (j == -1) {
            kf2.n("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.n = mediaDescriptionCompat;
        this.o = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.n);
        sb.append(", Id=");
        return b11.p(sb, this.o, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.n.writeToParcel(parcel, i);
        parcel.writeLong(this.o);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.n = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.o = parcel.readLong();
    }
}
