package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j84;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SimilarArtistID3 extends ArtistID3 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimilarArtistID3> CREATOR = new j84(3);

    public SimilarArtistID3() {
        super(null, null, null, 0, null, 31, null);
    }

    @Override // com.eddyizm.tempus.subsonic.models.ArtistID3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.eddyizm.tempus.subsonic.models.ArtistID3, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
