package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r1) {
        return new PlaybackStateCompat.CustomAction(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new PlaybackStateCompat.CustomAction[r1];
    }
}
