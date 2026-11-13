package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class VideoInfo {
    public static final int $stable = 8;
    private List<AudioTrack> audioTracks;
    private List<Captions> captions;
    private List<VideoConversion> conversions;
    private String id;

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

    public final void setAudioTracks(List<AudioTrack> list) {
        this.audioTracks = list;
    }

    public final void setCaptions(List<Captions> list) {
        this.captions = list;
    }

    public final void setConversions(List<VideoConversion> list) {
        this.conversions = list;
    }

    public final void setId(String str) {
        this.id = str;
    }
}
