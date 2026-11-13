package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class Indexes {
    public static final int $stable = 8;
    private List<Child> children;
    private String ignoredArticles;

    @ka4("index")
    private List<Index> indices;
    private long lastModified;
    private List<Artist> shortcuts;

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

    public final void setChildren(List<Child> list) {
        this.children = list;
    }

    public final void setIgnoredArticles(String str) {
        this.ignoredArticles = str;
    }

    public final void setIndices(List<Index> list) {
        this.indices = list;
    }

    public final void setLastModified(long j) {
        this.lastModified = j;
    }

    public final void setShortcuts(List<Artist> list) {
        this.shortcuts = list;
    }
}
