package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.h12;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class RecentSearch implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecentSearch> CREATOR = new b23(23);
    private String search;
    private long timestamp;

    public RecentSearch(String str, long j) {
        str.getClass();
        this.search = str;
        this.timestamp = j;
    }

    public static /* synthetic */ RecentSearch copy$default(RecentSearch recentSearch, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentSearch.search;
        }
        if ((i & 2) != 0) {
            j = recentSearch.timestamp;
        }
        return recentSearch.copy(str, j);
    }

    public final String component1() {
        return this.search;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final RecentSearch copy(String str, long j) {
        str.getClass();
        return new RecentSearch(str, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearch)) {
            return false;
        }
        RecentSearch recentSearch = (RecentSearch) obj;
        return h12.c(this.search, recentSearch.search) && this.timestamp == recentSearch.timestamp;
    }

    public final String getSearch() {
        return this.search;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + (this.search.hashCode() * 31);
    }

    public final void setSearch(String str) {
        str.getClass();
        this.search = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String toString() {
        return "RecentSearch(search=" + this.search + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.search);
        parcel.writeLong(this.timestamp);
    }
}
