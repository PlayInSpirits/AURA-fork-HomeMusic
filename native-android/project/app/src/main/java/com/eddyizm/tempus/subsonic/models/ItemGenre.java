package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ItemGenre implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ItemGenre> CREATOR = null;
    private String name;

    static {
        CREATOR = new hz0(13);
    }

    public /* synthetic */ ItemGenre(String r1, int r2, xj0 r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.name);
    }

    public ItemGenre(String r1) {
        this.name = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemGenre() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
