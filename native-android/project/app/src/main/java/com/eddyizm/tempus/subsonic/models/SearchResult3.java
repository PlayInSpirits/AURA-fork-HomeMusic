package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SearchResult3 {
    public static final int $stable = 8;

    @ka4("album")
    private List<? extends AlbumID3> albums;

    @ka4("artist")
    private List<? extends ArtistID3> artists;

    @ka4("song")
    private List<? extends Child> songs;

    public SearchResult3() {
    }

    public final List<AlbumID3> getAlbums() {
        return this.albums;
    }

    public final List<ArtistID3> getArtists() {
        return this.artists;
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setAlbums(List<? extends AlbumID3> r1) {
        this.albums = r1;
    }

    public final void setArtists(List<? extends ArtistID3> r1) {
        this.artists = r1;
    }

    public final void setSongs(List<? extends Child> r1) {
        this.songs = r1;
    }
}
