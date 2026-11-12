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
    public static final Parcelable.Creator<Directory> CREATOR = new w4(22);
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

    public /* synthetic */ Directory(List list, String str, String str2, String str3, Date date, Integer num, Double d, Long l, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : l);
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

    public final void setAverageRating(Double d) {
        this.averageRating = d;
    }

    public final void setChildren(List<? extends Child> list) {
        this.children = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
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
        List<? extends Child> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends Child> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(this.id);
        parcel.writeString(this.parentId);
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
        Long l = this.playCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public Directory(List<? extends Child> list, String str, String str2, String str3, Date date, Integer num, Double d, Long l) {
        this.children = list;
        this.id = str;
        this.parentId = str2;
        this.name = str3;
        this.starred = date;
        this.userRating = num;
        this.averageRating = d;
        this.playCount = l;
    }

    public Directory() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
