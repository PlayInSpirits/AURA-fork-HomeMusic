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
public final class AlbumWithSongsID3 extends AlbumID3 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlbumWithSongsID3> CREATOR = null;

    @ka4("song")
    private List<? extends Child> songs;

    static {
        CREATOR = new w4(3);
    }

    public AlbumWithSongsID3(List<? extends Child> r30) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        this.songs = r30;
    }

    @Override // com.eddyizm.tempus.subsonic.models.AlbumID3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setSongs(List<? extends Child> r1) {
        this.songs = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.AlbumID3, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        List<? extends Child> r1 = this.songs;
        if (r1 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r2.writeInt(r1.size());
        Iterator<? extends Child> r4 = r1.iterator();
    L8:
        if (r4.hasNext() == false) goto L10;
        r2.writeParcelable(r4.next(), r3);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlbumWithSongsID3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AlbumWithSongsID3(List r1, int r2, xj0 r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
