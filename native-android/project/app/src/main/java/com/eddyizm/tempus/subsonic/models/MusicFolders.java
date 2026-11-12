package com.eddyizm.tempus.subsonic.models;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicFolders {
    public static final int $stable = 8;

    @ka4("musicFolder")
    private List<MusicFolder> musicFolders;

    public MusicFolders() {
    }

    public final List<MusicFolder> getMusicFolders() {
        return this.musicFolders;
    }

    public final void setMusicFolders(List<MusicFolder> r1) {
        this.musicFolders = r1;
    }
}
