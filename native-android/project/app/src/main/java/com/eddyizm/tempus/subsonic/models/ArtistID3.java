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
    public static final Parcelable.Creator<ArtistID3> CREATOR = null;
    private int albumCount;

    @ka4("coverArt")
    private String coverArtId;
    private String id;
    private String name;
    private Date starred;

    static {
        CREATOR = new w4(6);
    }

    public /* synthetic */ ArtistID3(String r2, String r3, String r4, int r5, Date r6, int r7, xj0 r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = null;
    L17:
        this(r2, r3, r4, r5, r6);
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

    public final void setAlbumCount(int r1) {
        this.albumCount = r1;
    }

    public final void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final ArtistID3 strippedForNav() {
        return new ArtistID3(this.id, this.name, this.coverArtId, this.albumCount, this.starred);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.id);
        r1.writeString(this.name);
        r1.writeString(this.coverArtId);
        r1.writeInt(this.albumCount);
        r1.writeSerializable(this.starred);
    }

    public ArtistID3(String r1, String r2, String r3, int r4, Date r5) {
        this.id = r1;
        this.name = r2;
        this.coverArtId = r3;
        this.albumCount = r4;
        this.starred = r5;
    }

    public ArtistID3() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        Date r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }
}
