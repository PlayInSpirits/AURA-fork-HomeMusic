package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SimilarSongs2 {
    public static final int $stable = 8;

    @ka4("song")
    private List<? extends Child> songs;

    public SimilarSongs2() {
    }

    public final List<Child> getSongs() {
        return this.songs;
    }

    public final void setSongs(List<? extends Child> r1) {
        this.songs = r1;
    }
}
