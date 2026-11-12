package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ArtistsID3 {
    public static final int $stable = 8;
    private String ignoredArticles;

    @ka4("index")
    private List<IndexID3> indices;

    public ArtistsID3() {
    }

    public final String getIgnoredArticles() {
        return this.ignoredArticles;
    }

    public final List<IndexID3> getIndices() {
        return this.indices;
    }

    public final void setIgnoredArticles(String r1) {
        this.ignoredArticles = r1;
    }

    public final void setIndices(List<IndexID3> r1) {
        this.indices = r1;
    }
}
