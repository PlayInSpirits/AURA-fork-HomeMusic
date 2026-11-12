package com.eddyizm.tempus.subsonic.models;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Bookmark {
    public static final int $stable = 8;
    private Date changed;
    private String comment;
    private Date created;
    private Child entry;
    private long position;
    private String username;

    public Bookmark() {
    }

    public final Date getChanged() {
        return this.changed;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Date getCreated() {
        return this.created;
    }

    public final Child getEntry() {
        return this.entry;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setChanged(Date r1) {
        this.changed = r1;
    }

    public final void setComment(String r1) {
        this.comment = r1;
    }

    public final void setCreated(Date r1) {
        this.created = r1;
    }

    public final void setEntry(Child r1) {
        this.entry = r1;
    }

    public final void setPosition(long r1) {
        this.position = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }
}
