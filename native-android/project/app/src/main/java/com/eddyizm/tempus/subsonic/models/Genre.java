package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.ka4;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Genre implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Genre> CREATOR = null;
    private int albumCount;

    @ka4("value")
    private String genre;
    private int songCount;

    static {
        CREATOR = new hz0(5);
    }

    public /* synthetic */ Genre(String r2, int r3, int r4, int r5, xj0 r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getAlbumCount() {
        return this.albumCount;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final void setAlbumCount(int r1) {
        this.albumCount = r1;
    }

    public final void setGenre(String r1) {
        this.genre = r1;
    }

    public final void setSongCount(int r1) {
        this.songCount = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.genre);
        r1.writeInt(this.songCount);
        r1.writeInt(this.albumCount);
    }

    public Genre(String r1, int r2, int r3) {
        this.genre = r1;
        this.songCount = r2;
        this.albumCount = r3;
    }

    public Genre() {
        String r1 = null;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }
}
