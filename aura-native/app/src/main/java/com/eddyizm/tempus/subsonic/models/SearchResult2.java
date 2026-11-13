package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class SearchResult2 {
    public static final int $stable = 8;

    @ka4("album")
    private List<Child> albums;

    @ka4("artist")
    private List<Artist> artists;

    @ka4("song")
    private List<Child> songs;

    public final List<Child> getAlbums() {
        return this.albums;
    }

    public final List<Artist> getArtists() {
        return this.artists;
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setAlbums(List<Child> list) {
        this.albums = list;
    }

    public final void setArtists(List<Artist> list) {
        this.artists = list;
    }

    public final void setSongs(List<Child> list) {
        this.songs = list;
    }
}
