package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DiscTitle implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DiscTitle> CREATOR = null;
    private Integer disc;
    private String title;

    static {
        CREATOR = new w4(23);
    }

    public /* synthetic */ DiscTitle(Integer r2, String r3, int r4, xj0 r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getDisc() {
        return this.disc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDisc(Integer r1) {
        this.disc = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.getClass();
        Integer r4 = this.disc;
        if (r4 != null) goto L5;
        r2.writeInt(0);
    L6:
        r2.writeString(this.title);
        return;
    L5:
        xa3.q(r2, 1, r4);
        goto L6
    }

    public DiscTitle(Integer r1, String r2) {
        this.disc = r1;
        this.title = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscTitle() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }
}
