package com.eddyizm.tempus.model;

import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaylistSong {
    private String album;
    private String albumId;
    private String artist;
    private String artistId;
    private String coverArtId;
    private Integer duration;
    private String id;
    private String playlistId;
    private String title;
    private Integer track;

    public PlaylistSong(String r1, Child r2) {
        this.playlistId = r1;
        this.id = r2.getId();
        this.title = r2.getTitle();
        this.artist = r2.getArtist();
        this.album = r2.getAlbum();
        this.track = r2.getTrack();
        this.coverArtId = r2.getCoverArtId();
        this.duration = r2.getDuration();
        this.albumId = r2.getAlbumId();
        this.artistId = r2.getArtistId();
    }

    public String getAlbum() {
        return this.album;
    }

    public String getAlbumId() {
        return this.albumId;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getArtistId() {
        return this.artistId;
    }

    public String getCoverArtId() {
        return this.coverArtId;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public String getId() {
        return this.id;
    }

    public String getPlaylistId() {
        return this.playlistId;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getTrack() {
        return this.track;
    }

    public void setAlbum(String r1) {
        this.album = r1;
    }

    public void setAlbumId(String r1) {
        this.albumId = r1;
    }

    public void setArtist(String r1) {
        this.artist = r1;
    }

    public void setArtistId(String r1) {
        this.artistId = r1;
    }

    public void setCoverArtId(String r1) {
        this.coverArtId = r1;
    }

    public void setDuration(Integer r1) {
        this.duration = r1;
    }

    public void setId(String r1) {
        this.id = r1;
    }

    public void setPlaylistId(String r1) {
        this.playlistId = r1;
    }

    public void setTitle(String r1) {
        this.title = r1;
    }

    public void setTrack(Integer r1) {
        this.track = r1;
    }

    public PlaylistSong(String r1, String r2, String r3, String r4, String r5, Integer r6, String r7, Integer r8, String r9, String r10) {
        this.playlistId = r1;
        this.id = r2;
        this.title = r3;
        this.artist = r4;
        this.album = r5;
        this.track = r6;
        this.coverArtId = r7;
        this.duration = r8;
        this.albumId = r9;
        this.artistId = r10;
    }
}
