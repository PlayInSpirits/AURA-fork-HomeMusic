package com.eddyizm.tempus.subsonic.models;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class JukeboxStatus {
    public static final int $stable = 8;
    private int currentIndex;
    private float gain;
    private boolean isPlaying;
    private Integer position;

    public JukeboxStatus() {
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final float getGain() {
        return this.gain;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final void setCurrentIndex(int r1) {
        this.currentIndex = r1;
    }

    public final void setGain(float r1) {
        this.gain = r1;
    }

    public final void setPlaying(boolean r1) {
        this.isPlaying = r1;
    }

    public final void setPosition(Integer r1) {
        this.position = r1;
    }
}
