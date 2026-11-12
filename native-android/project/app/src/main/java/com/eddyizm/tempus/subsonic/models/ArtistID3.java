package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xj0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ArtistID3 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArtistID3> CREATOR = new w4(6);
    private int albumCount;

    @ka4("coverArt")
    private String coverArtId;
    private String id;
    private String name;
    private Date starred;

    public /* synthetic */ ArtistID3(String str, String str2, String str3, int i, Date date, int i2, xj0 xj0Var) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : date);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAlbumCount() {
        return this.albumCount;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Date getStarred() {
        return this.starred;
    }

    public final void setAlbumCount(int i) {
        this.albumCount = i;
    }

    public final void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStarred(Date date) {
        this.starred = date;
    }

    public final ArtistID3 strippedForNav() {
        return new ArtistID3(this.id, this.name, this.coverArtId, this.albumCount, this.starred);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.coverArtId);
        parcel.writeInt(this.albumCount);
        parcel.writeSerializable(this.starred);
    }

    public ArtistID3(String str, String str2, String str3, int i, Date date) {
        this.id = str;
        this.name = str2;
        this.coverArtId = str3;
        this.albumCount = i;
        this.starred = date;
    }

    public ArtistID3() {
        this(null, null, null, 0, null, 31, null);
    }
}
