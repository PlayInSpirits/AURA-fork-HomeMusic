package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AlbumList2 {
    public static final int $stable = 8;

    @ka4("album")
    private List<? extends AlbumID3> albums;

    public AlbumList2() {
    }

    public final List<AlbumID3> getAlbums() {
        return this.albums;
    }

    public final void setAlbums(List<? extends AlbumID3> r1) {
        this.albums = r1;
    }
}
