package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ka4;
import defpackage.w4;
import defpackage.xa3;
import defpackage.xj0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Directory implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Directory> CREATOR = null;
    private Double averageRating;

    @ka4("child")
    private List<? extends Child> children;
    private String id;
    private String name;

    @ka4("parent")
    private String parentId;
    private Long playCount;
    private Date starred;
    private Integer userRating;

    static {
        CREATOR = new w4(22);
    }

    public /* synthetic */ Directory(List r2, String r3, String r4, String r5, Date r6, Integer r7, Double r8, Long r9, int r10, xj0 r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = null;
    L26:
        this(r2, r3, r4, r5, r6, r7, r8, r9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Double getAverageRating() {
        return this.averageRating;
    }

    public final List<Child> getChildren() {
        return this.children;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Long getPlayCount() {
        return this.playCount;
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

    public final void setChildren(List<? extends Child> r1) {
        this.children = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setParentId(String r1) {
        this.parentId = r1;
    }

    public final void setPlayCount(Long r1) {
        this.playCount = r1;
    }

    public final void setStarred(Date r1) {
        this.starred = r1;
    }

    public final void setUserRating(Integer r1) {
        this.userRating = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        r6.getClass();
        List<? extends Child> r0 = this.children;
        if (r0 != null) goto L5;
        r6.writeInt(0);
    L9:
        r6.writeString(this.id);
        r6.writeString(this.parentId);
        r6.writeString(this.name);
        r6.writeSerializable(this.starred);
        Integer r8 = this.userRating;
        if (r8 != null) goto L12;
        r6.writeInt(0);
    L13:
        Double r9 = this.averageRating;
        if (r9 != null) goto L16;
        r6.writeInt(0);
    L17:
        Long r5 = this.playCount;
        if (r5 != null) goto L21;
        r6.writeInt(0);
        return;
    L21:
        r6.writeInt(1);
        r6.writeLong(r5.longValue());
        return;
    L16:
        r6.writeInt(1);
        r6.writeDouble(r9.doubleValue());
        goto L17
    L12:
        xa3.q(r6, 1, r8);
        goto L13
    L5:
        r6.writeInt(1);
        r6.writeInt(r0.size());
        Iterator<? extends Child> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        r6.writeParcelable(r1.next(), r7);
        goto L7
    }

    public Directory(List<? extends Child> r1, String r2, String r3, String r4, Date r5, Integer r6, Double r7, Long r8) {
        this.children = r1;
        this.id = r2;
        this.parentId = r3;
        this.name = r4;
        this.starred = r5;
        this.userRating = r6;
        this.averageRating = r7;
        this.playCount = r8;
    }

    public Directory() {
        List r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Date r5 = null;
        Integer r6 = null;
        Double r7 = null;
        Long r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }
}
