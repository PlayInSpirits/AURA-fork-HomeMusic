package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class VideoInfo {
    public static final int $stable = 8;
    private List<AudioTrack> audioTracks;
    private List<Captions> captions;
    private List<VideoConversion> conversions;
    private String id;

    public VideoInfo() {
    }

    public final List<AudioTrack> getAudioTracks() {
        return this.audioTracks;
    }

    public final List<Captions> getCaptions() {
        return this.captions;
    }

    public final List<VideoConversion> getConversions() {
        return this.conversions;
    }

    public final String getId() {
        return this.id;
    }

    public final void setAudioTracks(List<AudioTrack> r1) {
        this.audioTracks = r1;
    }

    public final void setCaptions(List<Captions> r1) {
        this.captions = r1;
    }

    public final void setConversions(List<VideoConversion> r1) {
        this.conversions = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }
}
