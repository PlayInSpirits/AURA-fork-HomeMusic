package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import defpackage.qm4;
import defpackage.xj0;
import defpackage.xm4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class WaveTrack {
    public static final String SEED = "seed";
    private String album;
    private String artist;

    @ka4("cover_url")
    private String coverUrl;

    @ka4("duration_s")
    private Double durationS;
    private String generator;

    @ka4("nd_song_id")
    private String ndSongId;
    private boolean owned;
    private String ref;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final String getAlbum() {
        return this.album;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Double getDurationS() {
        return this.durationS;
    }

    public final String getGenerator() {
        return this.generator;
    }

    public final String getNdSongId() {
        return this.ndSongId;
    }

    public final boolean getOwned() {
        return this.owned;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getSongId() {
        String str = this.ndSongId;
        if (str == null || !this.owned || qm4.u0(str)) {
            return null;
        }
        return str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HubTracks$Item item(String str) {
        HubTracks$Item hubTracks$Item = new HubTracks$Item();
        hubTracks$Item.setSongId(getSongId());
        hubTracks$Item.setRef(this.ref);
        hubTracks$Item.setTitle(this.title);
        hubTracks$Item.setArtist(this.artist);
        hubTracks$Item.setAlbum(this.album);
        hubTracks$Item.setCoverUrl(this.coverUrl);
        hubTracks$Item.setDurationS(this.durationS);
        hubTracks$Item.setContext(str);
        if (str != null && xm4.k0(str, WaveSession.CONTEXT_PREFIX, false)) {
            hubTracks$Item.setLaunchId(str);
            hubTracks$Item.setLaunchOrigin(WaveOrigin.WAVE);
        }
        return hubTracks$Item;
    }

    public final void setAlbum(String str) {
        this.album = str;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDurationS(Double d) {
        this.durationS = d;
    }

    public final void setGenerator(String str) {
        this.generator = str;
    }

    public final void setNdSongId(String str) {
        this.ndSongId = str;
    }

    public final void setOwned(boolean z) {
        this.owned = z;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 xj0Var) {
            this();
        }

        private Companion() {
        }
    }
}
