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
    public static final Parcelable.Creator<Genre> CREATOR = new hz0(5);
    private int albumCount;

    @ka4("value")
    private String genre;
    private int songCount;

    public /* synthetic */ Genre(String str, int i, int i2, int i3, xj0 xj0Var) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
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

    public final void setAlbumCount(int i) {
        this.albumCount = i;
    }

    public final void setGenre(String str) {
        this.genre = str;
    }

    public final void setSongCount(int i) {
        this.songCount = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.genre);
        parcel.writeInt(this.songCount);
        parcel.writeInt(this.albumCount);
    }

    public Genre(String str, int i, int i2) {
        this.genre = str;
        this.songCount = i;
        this.albumCount = i2;
    }

    public Genre() {
        this(null, 0, 0, 7, null);
    }
}
