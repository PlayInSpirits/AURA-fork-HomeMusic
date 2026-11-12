package com.eddyizm.tempus.homemusic;

import defpackage.ka4;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveOut {
    public static final int $stable = 8;
    private String mode;
    private boolean pending;
    private Map<String, ? extends Object> seed;

    @ka4("session_id")
    private String sessionId;
    private String title;
    private List<? extends WaveTrack> tracks;

    public WaveOut() {
    }

    public final String getMode() {
        return this.mode;
    }

    public final boolean getPending() {
        return this.pending;
    }

    public final Map<String, Object> getSeed() {
        return this.seed;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<WaveTrack> getTracks() {
        return this.tracks;
    }

    public final void setMode(String r1) {
        this.mode = r1;
    }

    public final void setPending(boolean r1) {
        this.pending = r1;
    }

    public final void setSeed(Map<String, ? extends Object> r1) {
        this.seed = r1;
    }

    public final void setSessionId(String r1) {
        this.sessionId = r1;
    }

    public final void setTitle(String r1) {
        this.title = r1;
    }

    public final void setTracks(List<? extends WaveTrack> r1) {
        this.tracks = r1;
    }
}
