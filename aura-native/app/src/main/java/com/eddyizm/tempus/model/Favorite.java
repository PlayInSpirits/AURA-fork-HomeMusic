package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b11;
import defpackage.h12;
import defpackage.hz0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Favorite implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Favorite> CREATOR = new hz0(1);
    private final String albumId;
    private final String artistId;
    private final String songId;
    private long timestamp;
    private final boolean toStar;

    public Favorite(long j, String str, String str2, String str3, boolean z) {
        this.timestamp = j;
        this.songId = str;
        this.albumId = str2;
        this.artistId = str3;
        this.toStar = z;
    }

    public static /* synthetic */ Favorite copy$default(Favorite favorite, long j, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = favorite.timestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = favorite.songId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = favorite.albumId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = favorite.artistId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = favorite.toStar;
        }
        return favorite.copy(j2, str4, str5, str6, z);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.songId;
    }

    public final String component3() {
        return this.albumId;
    }

    public final String component4() {
        return this.artistId;
    }

    public final boolean component5() {
        return this.toStar;
    }

    public final Favorite copy(long j, String str, String str2, String str3, boolean z) {
        return new Favorite(j, str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Favorite)) {
            return false;
        }
        Favorite favorite = (Favorite) obj;
        return this.timestamp == favorite.timestamp && h12.c(this.songId, favorite.songId) && h12.c(this.albumId, favorite.albumId) && h12.c(this.artistId, favorite.artistId) && this.toStar == favorite.toStar;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getArtistId() {
        return this.artistId;
    }

    public final String getSongId() {
        return this.songId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean getToStar() {
        return this.toStar;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.songId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.albumId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.artistId;
        return Boolean.hashCode(this.toStar) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String toString() {
        String str = this.songId;
        if (str == null) {
            str = "null";
        }
        String str2 = this.albumId;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = this.artistId;
        return b11.o(str, str2, str3 != null ? str3 : "null");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.songId);
        parcel.writeString(this.albumId);
        parcel.writeString(this.artistId);
        parcel.writeInt(this.toStar ? 1 : 0);
    }
}
