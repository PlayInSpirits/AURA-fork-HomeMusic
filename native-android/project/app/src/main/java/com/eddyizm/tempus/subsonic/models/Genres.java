package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Genres {
    public static final int $stable = 8;

    @ka4("genre")
    private List<Genre> genres;

    public Genres() {
    }

    public final List<Genre> getGenres() {
        return this.genres;
    }

    public final void setGenres(List<Genre> r1) {
        this.genres = r1;
    }
}
