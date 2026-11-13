package com.eddyizm.tempus.model;

import com.eddyizm.tempus.subsonic.models.Child;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public PlaylistSong(String str, Child child) {
        this.playlistId = str;
        this.id = child.getId();
        this.title = child.getTitle();
        this.artist = child.getArtist();
        this.album = child.getAlbum();
        this.track = child.getTrack();
        this.coverArtId = child.getCoverArtId();
        this.duration = child.getDuration();
        this.albumId = child.getAlbumId();
        this.artistId = child.getArtistId();
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

    public void setAlbum(String str) {
        this.album = str;
    }

    public void setAlbumId(String str) {
        this.albumId = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setArtistId(String str) {
        this.artistId = str;
    }

    public void setCoverArtId(String str) {
        this.coverArtId = str;
    }

    public void setDuration(Integer num) {
        this.duration = num;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setPlaylistId(String str) {
        this.playlistId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrack(Integer num) {
        this.track = num;
    }

    public PlaylistSong(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7, String str8) {
        this.playlistId = str;
        this.id = str2;
        this.title = str3;
        this.artist = str4;
        this.album = str5;
        this.track = num;
        this.coverArtId = str6;
        this.duration = num2;
        this.albumId = str7;
        this.artistId = str8;
    }
}
