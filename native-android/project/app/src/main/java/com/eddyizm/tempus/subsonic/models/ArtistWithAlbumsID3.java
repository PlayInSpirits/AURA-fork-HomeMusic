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
    public static final Parcelable.Creator<ArtistWithAlbumsID3> CREATOR = null;

    @ka4("album")
    private List<? extends AlbumID3> albums;

    @ka4("appearsOn")
    private List<? extends AlbumID3> appearsOn;

    static {
        CREATOR = new w4(7);
    }

    public ArtistWithAlbumsID3(List<? extends AlbumID3> r9, List<? extends AlbumID3> r10) {
        super(null, null, null, 0, null, 31, null);
        this.albums = r9;
        this.appearsOn = r10;
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

    public final void setAlbums(List<? extends AlbumID3> r1) {
        this.albums = r1;
    }

    public final void setAppearsOn(List<? extends AlbumID3> r1) {
        this.appearsOn = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.ArtistID3, android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        r5.getClass();
        List<? extends AlbumID3> r0 = this.albums;
        if (r0 != null) goto L5;
        r5.writeInt(0);
    L9:
        List<? extends AlbumID3> r4 = this.appearsOn;
        if (r4 != null) goto L13;
        r5.writeInt(0);
        return;
    L13:
        r5.writeInt(1);
        r5.writeInt(r4.size());
        Iterator<? extends AlbumID3> r7 = r4.iterator();
    L15:
        if (r7.hasNext() == false) goto L17;
        r5.writeParcelable(r7.next(), r6);
        goto L15
    L17:
        return;
    L5:
        r5.writeInt(1);
        r5.writeInt(r0.size());
        Iterator<? extends AlbumID3> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        r5.writeParcelable(r1.next(), r6);
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArtistWithAlbumsID3() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ArtistWithAlbumsID3(List r2, List r3, int r4, xj0 r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
