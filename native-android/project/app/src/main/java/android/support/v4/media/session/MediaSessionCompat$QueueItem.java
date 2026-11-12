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
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = null;
    public final MediaDescriptionCompat n;
    public final long o;

    static {
        CREATOR = new hz0(24);
    }

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat r4, long r5) {
        if (r4 != null) goto L5;
        kf2.n("Description cannot be null");
        throw null;
    L5:
        if (r5 == (-1)) goto L8;
        this.n = r4;
        this.o = r5;
        return;
    L8:
        kf2.n("Id cannot be QueueItem.UNKNOWN_ID");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MediaSession.QueueItem {Description=");
        r0.append(this.n);
        r0.append(", Id=");
        return b11.p(r0, this.o, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        this.n.writeToParcel(r3, r4);
        r3.writeLong(this.o);
    }

    public MediaSessionCompat$QueueItem(Parcel r3) {
        this.n = MediaDescriptionCompat.CREATOR.createFromParcel(r3);
        this.o = r3.readLong();
    }
}
