package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Artist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Artist> CREATOR = null;
    private Double averageRating;
    private String id;
    private String name;
    private Date starred;
    private Integer userRating;

    static {
        CREATOR = new w4(5);
    }

    public /* synthetic */ Artist(String r2, String r3, Date r4, Integer r5, Double r6, int r7, xj0 r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = null;
    L17:
        this(r2, r3, r4, r5, r6);
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

    public final void setAverageRating(Double r1) {
        this.averageRating = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final void setUserRating(Integer r1) {
        this.userRating = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.id);
        r3.writeString(this.name);
        r3.writeSerializable(this.starred);
        Integer r5 = this.userRating;
        if (r5 != null) goto L5;
        r3.writeInt(0);
    L6:
        Double r2 = this.averageRating;
        if (r2 != null) goto L10;
        r3.writeInt(0);
        return;
    L10:
        r3.writeInt(1);
        r3.writeDouble(r2.doubleValue());
        return;
    L5:
        xa3.q(r3, 1, r5);
        goto L6
    }

    public Artist(String r1, String r2, Date r3, Integer r4, Double r5) {
        this.id = r1;
        this.name = r2;
        this.starred = r3;
        this.userRating = r4;
        this.averageRating = r5;
    }

    public Artist() {
        String r1 = null;
        String r2 = null;
        Date r3 = null;
        Integer r4 = null;
        Double r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }
}
