package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import defpackage.qm4;
import defpackage.xj0;
import defpackage.xm4;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class WaveTrack {
    public static final int $stable = 0;
    public static final Companion Companion = null;
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

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public WaveTrack() {
    }

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
        String r0 = this.ndSongId;
        if (r0 != null) goto L5;
    L9:
        return null;
    L5:
        if (this.owned == false) goto L9;
        if (qm4.u0(r0) == true) goto L9;
        return r0;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HubTracks$Item item(String r3) {
        HubTracks$Item r0 = new HubTracks$Item();
        r0.setSongId(getSongId());
        r0.setRef(this.ref);
        r0.setTitle(this.title);
        r0.setArtist(this.artist);
        r0.setAlbum(this.album);
        r0.setCoverUrl(this.coverUrl);
        r0.setDurationS(this.durationS);
        r0.setContext(r3);
        if (r3 != null) goto L5;
    L7:
        return r0;
    L5:
        if (xm4.k0(r3, WaveSession.CONTEXT_PREFIX, false) != true) goto L7;
        r0.setLaunchId(r3);
        r0.setLaunchOrigin(WaveOrigin.WAVE);
        goto L7
    }

    public final void setAlbum(String r1) {
        this.album = r1;
    }

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setCoverUrl(String r1) {
        this.coverUrl = r1;
    }

    public final void setDurationS(Double r1) {
        this.durationS = r1;
    }

    public final void setGenerator(String r1) {
        this.generator = r1;
    }

    public final void setNdSongId(String r1) {
        this.ndSongId = r1;
    }

    public final void setOwned(boolean r1) {
        this.owned = r1;
    }

    public final void setRef(String r1) {
        this.ref = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }
}
