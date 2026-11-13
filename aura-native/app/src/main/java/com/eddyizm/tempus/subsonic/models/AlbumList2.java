package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class AlbumList2 {
    public static final int $stable = 8;

    @ka4("album")
    private List<AlbumID3> albums;

    public final List<AlbumID3> getAlbums() {
        return this.albums;
    }

    public final void setAlbums(List<AlbumID3> list) {
        this.albums = list;
    }
}
