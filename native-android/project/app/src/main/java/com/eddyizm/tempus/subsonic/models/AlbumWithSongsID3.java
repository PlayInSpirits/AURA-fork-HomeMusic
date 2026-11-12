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
    public static final Parcelable.Creator<AlbumWithSongsID3> CREATOR = new w4(3);

    @ka4("song")
    private List<? extends Child> songs;

    public AlbumWithSongsID3(List<? extends Child> list) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        this.songs = list;
    }

    @Override // com.eddyizm.tempus.subsonic.models.AlbumID3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setSongs(List<? extends Child> list) {
        this.songs = list;
    }

    @Override // com.eddyizm.tempus.subsonic.models.AlbumID3, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<? extends Child> list = this.songs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<? extends Child> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlbumWithSongsID3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AlbumWithSongsID3(List list, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : list);
    }
}
