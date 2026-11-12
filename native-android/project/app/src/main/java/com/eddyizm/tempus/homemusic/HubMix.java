package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubMix {
    public static final int $stable = 8;
    private String description;
    private long id;

    @ka4("nd_playlist_id")
    private String ndPlaylistId;
    private int ready;
    private String title;
    private int total;
    private List<? extends WaveTrack> tracks;

    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    public final String getNdPlaylistId() {
        return this.ndPlaylistId;
    }

    public final int getReady() {
        return this.ready;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<WaveTrack> getTracks() {
        return this.tracks;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setNdPlaylistId(String str) {
        this.ndPlaylistId = str;
    }

    public final void setReady(int i) {
        this.ready = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public final void setTracks(List<? extends WaveTrack> list) {
        this.tracks = list;
    }
}
