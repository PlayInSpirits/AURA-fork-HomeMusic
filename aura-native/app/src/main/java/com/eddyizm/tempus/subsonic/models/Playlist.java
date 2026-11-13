package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class Playlist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Playlist> CREATOR = new b23(14);
    private List<String> allowedUsers;
    private Date changed;
    private String comment;

    @ka4("coverArt")
    private String coverArtId;
    private Date created;
    private long duration;
    private String id;

    @ka4("public")
    private Boolean isUniversal;
    private long lastPlayed;
    private String name;
    private String owner;
    private int songCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Playlist(String str, String str2, String str3, String str4, Boolean bool, int i, long j, Date date, Date date2, String str5, List<String> list) {
        this(str, str2, j, str5);
        str.getClass();
        this.comment = str3;
        this.owner = str4;
        this.isUniversal = bool;
        this.songCount = i;
        this.created = date;
        this.changed = date2;
        this.lastPlayed = 0L;
        this.allowedUsers = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> getAllowedUsers() {
        return this.allowedUsers;
    }

    public final Date getChanged() {
        return this.changed;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCoverArtId() {
        return this.coverArtId;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getId() {
        return this.id;
    }

    public final long getLastPlayed() {
        return this.lastPlayed;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final Boolean isUniversal() {
        return this.isUniversal;
    }

    public final void setAllowedUsers(List<String> list) {
        this.allowedUsers = list;
    }

    public final void setChanged(Date date) {
        this.changed = date;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public final void setCreated(Date date) {
        this.created = date;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public void setId(String str) {
        str.getClass();
        this.id = str;
    }

    public final void setLastPlayed(long j) {
        this.lastPlayed = j;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwner(String str) {
        this.owner = str;
    }

    public final void setSongCount(int i) {
        this.songCount = i;
    }

    public final void setUniversal(Boolean bool) {
        this.isUniversal = bool;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeLong(this.duration);
        parcel.writeString(this.coverArtId);
    }

    public /* synthetic */ Playlist(String str, String str2, long j, String str3, int i, xj0 xj0Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3);
    }

    public Playlist(String str, String str2, long j, String str3) {
        str.getClass();
        this.id = str;
        this.name = str2;
        this.duration = j;
        this.coverArtId = str3;
    }
}
