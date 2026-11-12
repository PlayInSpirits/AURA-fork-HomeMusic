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

    public final void setChanged(Date date) {
        this.changed = date;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setCreated(Date date) {
        this.created = date;
    }

    public final void setEntry(Child child) {
        this.entry = child;
    }

    public final void setPosition(long j) {
        this.position = j;
    }

    public final void setUsername(String str) {
        this.username = str;
    }
}
