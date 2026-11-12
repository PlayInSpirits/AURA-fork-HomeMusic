package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hz0;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicFolder implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MusicFolder> CREATOR = null;
    private String id;
    private String name;

    static {
        CREATOR = new hz0(29);
    }

    public /* synthetic */ MusicFolder(String r2, String r3, int r4, xj0 r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.getClass();
        r1.writeString(this.id);
        r1.writeString(this.name);
    }

    public MusicFolder(String r1, String r2) {
        this.id = r1;
        this.name = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicFolder() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }
}
