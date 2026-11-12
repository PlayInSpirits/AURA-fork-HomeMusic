package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Indexes {
    public static final int $stable = 8;
    private List<? extends Child> children;
    private String ignoredArticles;

    @ka4("index")
    private List<Index> indices;
    private long lastModified;
    private List<Artist> shortcuts;

    public Indexes() {
    }

    public final List<Child> getChildren() {
        return this.children;
    }

    public final String getIgnoredArticles() {
        return this.ignoredArticles;
    }

    public final List<Index> getIndices() {
        return this.indices;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final List<Artist> getShortcuts() {
        return this.shortcuts;
    }

    public final void setChildren(List<? extends Child> r1) {
        this.children = r1;
    }

    public final void setIgnoredArticles(String r1) {
        this.ignoredArticles = r1;
    }

    public final void setIndices(List<Index> r1) {
        this.indices = r1;
    }

    public final void setLastModified(long r1) {
        this.lastModified = r1;
    }

    public final void setShortcuts(List<Artist> r1) {
        this.shortcuts = r1;
    }
}
