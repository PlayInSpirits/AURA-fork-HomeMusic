package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xj0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ArtistWithAlbumsID3 extends ArtistID3 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArtistWithAlbumsID3> CREATOR = new w4(7);

    @ka4("album")
    private List<? extends AlbumID3> albums;

    @ka4("appearsOn")
    private List<? extends AlbumID3> appearsOn;

    public ArtistWithAlbumsID3(List<? extends AlbumID3> list, List<? extends AlbumID3> list2) {
        super(null, null, null, 0, null, 31, null);
        this.albums = list;
        this.appearsOn = list2;
    }

    @Override // com.eddyizm.tempus.subsonic.models.ArtistID3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AlbumID3> getAlbums() {
        return this.albums;
    }

    public final List<AlbumID3> getAppearsOn() {
        return this.appearsOn;
    }

    public final void setAlbums(List<? extends AlbumID3> list) {
        this.albums = list;
    }

    public final void setAppearsOn(List<? extends AlbumID3> list) {
        this.appearsOn = list;
    }

    @Override // com.eddyizm.tempus.subsonic.models.ArtistID3, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<? extends AlbumID3> list = this.albums;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends AlbumID3> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        List<? extends AlbumID3> list2 = this.appearsOn;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<? extends AlbumID3> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArtistWithAlbumsID3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ArtistWithAlbumsID3(List list, List list2, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
