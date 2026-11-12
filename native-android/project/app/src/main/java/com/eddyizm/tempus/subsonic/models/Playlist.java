package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.ka4;
import defpackage.xj0;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Playlist implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Playlist> CREATOR = null;
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

    static {
        CREATOR = new b23(14);
    }

    public Playlist(String r7, String r8, String r9, String r10, Boolean r11, int r12, long r13, Date r15, Date r16, String r17, List<String> r18) {
        r7.getClass();
        this(r7, r8, r13, r17);
        this.comment = r9;
        this.owner = r10;
        this.isUniversal = r11;
        this.songCount = r12;
        this.created = r15;
        this.changed = r16;
        this.lastPlayed = 0;
        this.allowedUsers = r18;
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

    public final void setAllowedUsers(List<String> r1) {
        this.allowedUsers = r1;
    }

    public final void setChanged(Date r1) {
        this.changed = r1;
    }

    public final void setComment(String r1) {
        this.comment = r1;
    }

    public final void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public final void setCreated(Date r1) {
        this.created = r1;
    }

    public final void setDuration(long r1) {
        this.duration = r1;
    }

    public void setId(String r1) {
        r1.getClass();
        this.id = r1;
    }

    public final void setLastPlayed(long r1) {
        this.lastPlayed = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    public final void setOwner(String r1) {
        this.owner = r1;
    }

    public final void setSongCount(int r1) {
        this.songCount = r1;
    }

    public final void setUniversal(Boolean r1) {
        this.isUniversal = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.id);
        r3.writeString(this.name);
        r3.writeLong(this.duration);
        r3.writeString(this.coverArtId);
    }

    public /* synthetic */ Playlist(String r2, String r3, long r4, String r6, int r7, xj0 r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r7 & 8) == 0) goto L11;
        r6 = null;
    L11:
        this(r2, r3, r4, r6);
    }

    public Playlist(String r1, String r2, long r3, String r5) {
        r1.getClass();
        this.id = r1;
        this.name = r2;
        this.duration = r3;
        this.coverArtId = r5;
    }
}
