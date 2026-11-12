package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class IndexID3 {
    public static final int $stable = 8;

    @ka4("artist")
    private List<? extends ArtistID3> artists;
    private String name;

    public IndexID3() {
    }

    public final List<ArtistID3> getArtists() {
        return this.artists;
    }

    public final String getName() {
        return this.name;
    }

    public final void setArtists(List<? extends ArtistID3> r1) {
        this.artists = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }
}
