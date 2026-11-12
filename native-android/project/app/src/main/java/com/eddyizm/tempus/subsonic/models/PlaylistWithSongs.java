package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaylistWithSongs extends Playlist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlaylistWithSongs> CREATOR = new b23(15);

    @ka4("entry")
    private List<? extends Child> entries;

    public PlaylistWithSongs(List<? extends Child> list) {
        super("", null, 0L, null, 14, null);
        this.entries = list;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Playlist, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Child> getEntries() {
        return this.entries;
    }

    public final void setEntries(List<? extends Child> list) {
        this.entries = list;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Playlist, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List<? extends Child> list = this.entries;
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
    public PlaylistWithSongs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PlaylistWithSongs(List list, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaylistWithSongs(String str, List<? extends Child> list) {
        this(list);
        str.getClass();
        setId(str);
    }
}
