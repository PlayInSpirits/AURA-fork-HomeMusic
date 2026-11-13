package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SearchResult {
    public static final int $stable = 8;
    private List<Child> matches;
    private int offset;
    private int totalHits;

    public final List<Child> getMatches() {
        return this.matches;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotalHits() {
        return this.totalHits;
    }

    public final void setMatches(List<Child> list) {
        this.matches = list;
    }

    public final void setOffset(int i) {
        this.offset = i;
    }

    public final void setTotalHits(int i) {
        this.totalHits = i;
    }
}
