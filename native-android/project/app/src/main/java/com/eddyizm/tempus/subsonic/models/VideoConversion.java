package com.eddyizm.tempus.subsonic.models;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class VideoConversion {
    public static final int $stable = 8;
    private Integer audioTrackId;
    private Integer bitRate;
    private String id;

    public VideoConversion() {
    }

    public final Integer getAudioTrackId() {
        return this.audioTrackId;
    }

    public final Integer getBitRate() {
        return this.bitRate;
    }

    public final String getId() {
        return this.id;
    }

    public final void setAudioTrackId(Integer r1) {
        this.audioTrackId = r1;
    }

    public final void setBitRate(Integer r1) {
        this.bitRate = r1;
    }

    public final void setId(String r1) {
        this.id = r1;
    }
}
