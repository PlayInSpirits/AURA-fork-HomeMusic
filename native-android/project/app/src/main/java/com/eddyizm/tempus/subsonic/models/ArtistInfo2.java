package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import defpackage.u01;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ArtistInfo2 extends ArtistInfoBase {
    public static final int $stable = 8;

    @ka4("similarArtist")
    private List<SimilarArtistID3> similarArtists;

    public ArtistInfo2() {
        this.similarArtists = u01.n;
    }

    public final List<SimilarArtistID3> getSimilarArtists() {
        return this.similarArtists;
    }

    public final void setSimilarArtists(List<SimilarArtistID3> r1) {
        this.similarArtists = r1;
    }
}
