package com.eddyizm.tempus.homemusic;

import com.eddyizm.tempus.subsonic.models.Child;
import defpackage.ka4;
import defpackage.ot1;
import defpackage.qm4;
import defpackage.xm4;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubLikedSong {
    public static final int $stable = 8;

    @ka4("album_title")
    private String album;

    @ka4("nd_album_id")
    private String albumId;
    private String artist;

    @ka4("nd_artist_id")
    private String artistId;

    @ka4("cover_url")
    private String coverUrl;

    @ka4("disc_no")
    private Integer disc;

    @ka4("duration_s")
    private Double duration;
    private String ref;

    @ka4("nd_song_id")
    private String songId;
    private String title;

    @ka4("track_no")
    private Integer track;

    public HubLikedSong() {
    }

    public final Child child(String r46, long r47) {
        r46.getClass();
        String r1 = this.songId;
        if (r1 != null) goto L5;
    L7:
        String r5 = null;
    L8:
        String r2 = this.coverUrl;
        if (r2 != null) goto L11;
        r2 = null;
    L14:
        if (r5 == null) goto L16;
        boolean r3 = false;
        Integer r44 = null;
        Child r4 = new Child(r5, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
    L19:
        r4.setTitle(this.title);
        r4.setArtist(this.artist);
        r4.setAlbum(this.album);
        r4.setAlbumId(this.albumId);
        r4.setArtistId(this.artistId);
        if (r5 == null) goto L26;
        String r6 = this.coverUrl;
        if (r6 == null) goto L26;
        if (xm4.k0(r6, "/api/nd/cover/", r3) != true) goto L26;
        String r7 = this.coverUrl;
        r7.getClass();
        r2 = URLDecoder.decode(qm4.H0(qm4.F0(r7, "/api/nd/cover/"), '?'), StandardCharsets.UTF_8.name());
    L26:
        r4.setCoverArtId(r2);
        Double r8 = this.duration;
        if (r8 == null) goto L29;
        Integer r9 = Integer.valueOf((int) r8.doubleValue());
    L30:
        r4.setDuration(r9);
        r4.setTrack(this.track);
        r4.setDiscNumber(this.disc);
        r4.setStarred(new Date(r47));
        return r4;
    L29:
        r9 = r44;
        goto L30
    L16:
        r3 = false;
        r44 = null;
        ConcurrentHashMap r10 = ot1.a;
        HubTracks$Item r11 = new HubTracks$Item();
        r11.setRef(this.ref);
        r11.setTitle(this.title);
        r11.setArtist(this.artist);
        r11.setAlbum(this.album);
        r11.setCoverUrl(r2);
        r11.setDurationS(this.duration);
        r4 = ot1.b(r11);
        if (r4 != null) goto L19;
        return null;
    L11:
        if (xm4.k0(r2, "/", false) == false) goto L14;
        r2 = qm4.L0(r46, new char[]{'/'}) + r2;
        goto L14
    L5:
        if (qm4.u0(r1) == true) goto L7;
        r5 = r1;
        goto L8
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getArtistId() {
        return this.artistId;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Integer getDisc() {
        return this.disc;
    }

    public final Double getDuration() {
        return this.duration;
    }

    public final String getRef() {
        return this.ref;
    }

    public final String getSongId() {
        return this.songId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTrack() {
        return this.track;
    }

    public final void setAlbum(String r1) {
        this.album = r1;
    }

    public final void setAlbumId(String r1) {
        this.albumId = r1;
    }

    public final void setArtist(String r1) {
        this.artist = r1;
    }

    public final void setArtistId(String r1) {
        this.artistId = r1;
    }

    public final void setCoverUrl(String r1) {
        this.coverUrl = r1;
    }

    public final void setDisc(Integer r1) {
        this.disc = r1;
    }

    public final void setDuration(Double r1) {
        this.duration = r1;
    }

    public final void setRef(String r1) {
        this.ref = r1;
    }

    public final void setSongId(String r1) {
        this.songId = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setTrack(Integer r1) {
        this.track = r1;
    }
}
