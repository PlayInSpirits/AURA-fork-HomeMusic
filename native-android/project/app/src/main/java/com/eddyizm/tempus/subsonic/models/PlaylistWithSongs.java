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
    public static final Parcelable.Creator<PlaylistWithSongs> CREATOR = null;

    @ka4("entry")
    private List<? extends Child> entries;

    static {
        CREATOR = new b23(15);
    }

    public PlaylistWithSongs(List<? extends Child> r9) {
        super("", null, 0, null, 14, null);
        this.entries = r9;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Playlist, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Child> getEntries() {
        return this.entries;
    }

    public final void setEntries(List<? extends Child> r1) {
        this.entries = r1;
    }

    @Override // com.eddyizm.tempus.subsonic.models.Playlist, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        List<? extends Child> r1 = this.entries;
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
    public PlaylistWithSongs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PlaylistWithSongs(List r1, int r2, xj0 r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public PlaylistWithSongs(String r1, List<? extends Child> r2) {
        r1.getClass();
        this(r2);
        setId(r1);
    }
}
