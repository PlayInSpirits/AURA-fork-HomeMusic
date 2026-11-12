package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class NowPlaying {
    public static final int $stable = 8;
    private List<NowPlayingEntry> entries;

    public final List<NowPlayingEntry> getEntries() {
        return this.entries;
    }

    public final void setEntries(List<NowPlayingEntry> list) {
        this.entries = list;
    }
}
