package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class PlayQueue {
    public static final int $stable = 8;
    private Date changed;
    private String changedBy;
    private String current;

    @ka4("entry")
    private List<? extends Child> entries;
    private Long position;
    private String username;

    public final Date getChanged() {
        return this.changed;
    }

    public final String getChangedBy() {
        return this.changedBy;
    }

    public final String getCurrent() {
        return this.current;
    }

    public final List<Child> getEntries() {
        return this.entries;
    }

    public final Long getPosition() {
        return this.position;
    }

    public final String getUsername() {
        return this.username;
    }

    public final void setChanged(Date date) {
        this.changed = date;
    }

    public final void setChangedBy(String str) {
        this.changedBy = str;
    }

    public final void setCurrent(String str) {
        this.current = str;
    }

    public final void setEntries(List<? extends Child> list) {
        this.entries = list;
    }

    public final void setPosition(Long l) {
        this.position = l;
    }

    public final void setUsername(String str) {
        this.username = str;
    }
}
