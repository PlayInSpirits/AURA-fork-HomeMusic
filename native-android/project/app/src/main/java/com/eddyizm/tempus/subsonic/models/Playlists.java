package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import defpackage.xj0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Playlists {
    public static final int $stable = 8;

    @ka4("playlist")
    private List<? extends Playlist> playlists;

    public /* synthetic */ Playlists(List r1, int r2, xj0 r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public final List<Playlist> getPlaylists() {
        return this.playlists;
    }

    public final void setPlaylists(List<? extends Playlist> r1) {
        this.playlists = r1;
    }

    public Playlists(List<? extends Playlist> r1) {
        this.playlists = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Playlists() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
