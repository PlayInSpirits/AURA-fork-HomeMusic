package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.h12;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class RecentSearch implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecentSearch> CREATOR = null;
    private String search;
    private long timestamp;

    static {
        CREATOR = new b23(23);
    }

    public RecentSearch(String r1, long r2) {
        r1.getClass();
        this.search = r1;
        this.timestamp = r2;
    }

    public static /* synthetic */ RecentSearch copy$default(RecentSearch r0, String r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.search;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.timestamp;
    L9:
        return r0.copy(r1, r2);
    }

    public final String component1() {
        return this.search;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final RecentSearch copy(String r1, long r2) {
        r1.getClass();
        return new RecentSearch(r1, r2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof RecentSearch) == true) goto L8;
        return false;
    L8:
        RecentSearch r7 = (RecentSearch) r6;
        if (h12.c(this.search, r7.search) == true) goto L12;
        return false;
    L12:
        if (this.timestamp == r7.timestamp) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getSearch() {
        return this.search;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int r0 = this.search.hashCode() * 31;
        return Long.hashCode(this.timestamp) + r0;
    }

    public final void setSearch(String r1) {
        r1.getClass();
        this.search = r1;
    }

    public final void setTimestamp(long r1) {
        this.timestamp = r1;
    }

    public String toString() {
        return "RecentSearch(search=" + this.search + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.search);
        r3.writeLong(this.timestamp);
    }
}
