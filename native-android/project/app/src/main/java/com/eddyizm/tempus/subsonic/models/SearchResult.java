package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SearchResult {
    public static final int $stable = 8;
    private List<? extends Child> matches;
    private int offset;
    private int totalHits;

    public SearchResult() {
    }

    public final List<Child> getMatches() {
        return this.matches;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotalHits() {
        return this.totalHits;
    }

    public final void setMatches(List<? extends Child> r1) {
        this.matches = r1;
    }

    public final void setOffset(int r1) {
        this.offset = r1;
    }

    public final void setTotalHits(int r1) {
        this.totalHits = r1;
    }
}
