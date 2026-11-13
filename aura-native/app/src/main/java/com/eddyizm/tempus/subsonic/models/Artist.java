package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Artist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Artist> CREATOR = new w4(5);
    private Double averageRating;
    private String id;
    private String name;
    private Date starred;
    private Integer userRating;

    public /* synthetic */ Artist(String str, String str2, Date date, Integer num, Double d, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Date getStarred() {
        return this.starred;
    }

    public final Integer getUserRating() {
        return this.userRating;
    }

    public final void setAverageRating(Double d) {
        this.averageRating = d;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStarred(Date date) {
        this.starred = date;
    }

    public final void setUserRating(Integer num) {
        this.userRating = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.starred);
        Integer num = this.userRating;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            xa3.q(parcel, 1, num);
        }
        Double d = this.averageRating;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public Artist(String str, String str2, Date date, Integer num, Double d) {
        this.id = str;
        this.name = str2;
        this.starred = date;
        this.userRating = num;
        this.averageRating = d;
    }

    public Artist() {
        this(null, null, null, null, null, 31, null);
    }
}
