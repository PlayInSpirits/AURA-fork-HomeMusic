package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class IndexID3 {
    public static final int $stable = 8;

    @ka4("artist")
    private List<ArtistID3> artists;
    private String name;

    public final List<ArtistID3> getArtists() {
        return this.artists;
    }

    public final String getName() {
        return this.name;
    }

    public final void setArtists(List<ArtistID3> list) {
        this.artists = list;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
