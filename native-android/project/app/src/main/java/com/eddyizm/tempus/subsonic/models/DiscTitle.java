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
    public static final Parcelable.Creator<DiscTitle> CREATOR = new w4(23);
    private Integer disc;
    private String title;

    public /* synthetic */ DiscTitle(Integer num, String str, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
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

    public final void setDisc(Integer num) {
        this.disc = num;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.disc;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        parcel.writeString(this.title);
    }

    public DiscTitle(Integer num, String str) {
        this.disc = num;
        this.title = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscTitle() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
