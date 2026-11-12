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

    public PlayQueue() {
    }

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

    public final void setChanged(Date r1) {
        this.changed = r1;
    }

    public final void setChangedBy(String r1) {
        this.changedBy = r1;
    }

    public final void setCurrent(String r1) {
        this.current = r1;
    }

    public final void setEntries(List<? extends Child> r1) {
        this.entries = r1;
    }

    public final void setPosition(Long r1) {
        this.position = r1;
    }

    public final void setUsername(String r1) {
        this.username = r1;
    }
}
