package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b11;
import defpackage.h12;
import defpackage.hz0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Favorite implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Favorite> CREATOR = null;
    private final String albumId;
    private final String artistId;
    private final String songId;
    private long timestamp;
    private final boolean toStar;

    static {
        CREATOR = new hz0(1);
    }

    public Favorite(long r1, String r3, String r4, String r5, boolean r6) {
        this.timestamp = r1;
        this.songId = r3;
        this.albumId = r4;
        this.artistId = r5;
        this.toStar = r6;
    }

    public static /* synthetic */ Favorite copy$default(Favorite r7, long r8, String r10, String r11, String r12, boolean r13, int r14, Object r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = r7.timestamp;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        r10 = r7.songId;
    L8:
        String r3 = r10;
        if ((r14 & 4) == 0) goto L11;
        r11 = r7.albumId;
    L11:
        String r4 = r11;
        if ((r14 & 8) == 0) goto L14;
        r12 = r7.artistId;
    L14:
        String r5 = r12;
        if ((r14 & 16) == 0) goto L18;
        r13 = r7.toStar;
    L18:
        return r7.copy(r1, r3, r4, r5, r13);
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

    public final Favorite copy(long r1, String r3, String r4, String r5, boolean r6) {
        return new Favorite(r1, r3, r4, r5, r6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Favorite) == true) goto L8;
        return false;
    L8:
        Favorite r9 = (Favorite) r8;
        if (this.timestamp == r9.timestamp) goto L12;
        return false;
    L12:
        if (h12.c(this.songId, r9.songId) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.albumId, r9.albumId) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.artistId, r9.artistId) == true) goto L21;
        return false;
    L21:
        if (this.toStar == r9.toStar) goto L23;
        return false;
    L23:
        return true;
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
        int r0 = Long.hashCode(this.timestamp) * 31;
        String r1 = this.songId;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        String r5 = this.albumId;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        String r8 = this.artistId;
        if (r8 == null) goto L15;
        r2 = r8.hashCode();
    L15:
        return Boolean.hashCode(this.toStar) + ((r7 + r2) * 31);
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setTimestamp(long r1) {
        this.timestamp = r1;
    }

    public String toString() {
        String r0 = this.songId;
        String r1 = "null";
        if (r0 != null) goto L5;
        r0 = "null";
    L5:
        String r2 = this.albumId;
        if (r2 != null) goto L8;
        r2 = "null";
    L8:
        String r3 = this.artistId;
        if (r3 == null) goto L13;
        r1 = r3;
    L13:
        return b11.o(r0, r2, r1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeLong(this.timestamp);
        r3.writeString(this.songId);
        r3.writeString(this.albumId);
        r3.writeString(this.artistId);
        r3.writeInt(this.toStar ? 1 : 0);
    }
}
