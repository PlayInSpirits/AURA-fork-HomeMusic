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

    public final Child child(String str, long j) {
        boolean z;
        Integer num;
        Child childB;
        String str2;
        str.getClass();
        String str3 = this.songId;
        String str4 = (str3 == null || qm4.u0(str3)) ? null : str3;
        String strDecode = this.coverUrl;
        if (strDecode == null) {
            strDecode = null;
        } else if (xm4.k0(strDecode, "/", false)) {
            strDecode = qm4.L0(str, '/') + strDecode;
        }
        if (str4 != null) {
            z = false;
            num = null;
            childB = new Child(str4, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null);
        } else {
            z = false;
            num = null;
            ConcurrentHashMap concurrentHashMap = ot1.a;
            HubTracks$Item hubTracks$Item = new HubTracks$Item();
            hubTracks$Item.setRef(this.ref);
            hubTracks$Item.setTitle(this.title);
            hubTracks$Item.setArtist(this.artist);
            hubTracks$Item.setAlbum(this.album);
            hubTracks$Item.setCoverUrl(strDecode);
            hubTracks$Item.setDurationS(this.duration);
            childB = ot1.b(hubTracks$Item);
            if (childB == null) {
                return null;
            }
        }
        childB.setTitle(this.title);
        childB.setArtist(this.artist);
        childB.setAlbum(this.album);
        childB.setAlbumId(this.albumId);
        childB.setArtistId(this.artistId);
        if (str4 != null && (str2 = this.coverUrl) != null && xm4.k0(str2, "/api/nd/cover/", z)) {
            String str5 = this.coverUrl;
            str5.getClass();
            strDecode = URLDecoder.decode(qm4.H0(qm4.F0(str5, "/api/nd/cover/"), '?'), StandardCharsets.UTF_8.name());
        }
        childB.setCoverArtId(strDecode);
        Double d = this.duration;
        childB.setDuration(d != null ? Integer.valueOf((int) d.doubleValue()) : num);
        childB.setTrack(this.track);
        childB.setDiscNumber(this.disc);
        childB.setStarred(new Date(j));
        return childB;
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

    public final void setAlbum(String str) {
        this.album = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setArtistId(String str) {
        this.artistId = str;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDisc(Integer num) {
        this.disc = num;
    }

    public final void setDuration(Double d) {
        this.duration = d;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final void setSongId(String str) {
        this.songId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrack(Integer num) {
        this.track = num;
    }
}
