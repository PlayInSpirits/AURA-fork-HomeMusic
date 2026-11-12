package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Index {
    public static final int $stable = 8;

    @ka4("artist")
    private List<Artist> artists;
    private String name;

    public Index() {
    }

    public final List<Artist> getArtists() {
        return this.artists;
    }

    public final String getName() {
        return this.name;
    }

    public final void setArtists(List<Artist> r1) {
        this.artists = r1;
    }

    public final void setName(String r1) {
        this.name = r1;
    }
}
