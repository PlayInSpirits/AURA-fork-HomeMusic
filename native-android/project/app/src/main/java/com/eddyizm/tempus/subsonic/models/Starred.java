package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Starred {
    public static final int $stable = 8;
    private List<? extends Child> albums;
    private List<Artist> artists;
    private List<? extends Child> songs;

    public Starred() {
    }

    public final List<Child> getAlbums() {
        return this.albums;
    }

    public final List<Artist> getArtists() {
        return this.artists;
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setAlbums(List<? extends Child> r1) {
        this.albums = r1;
    }

    public final void setArtists(List<Artist> r1) {
        this.artists = r1;
    }

    public final void setSongs(List<? extends Child> r1) {
        this.songs = r1;
    }
}
