package com.eddyizm.tempus.model;

import defpackage.b11;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ReplayGain {
    public static final int $stable = 8;
    private float albumGain;
    private float albumPeak;
    private float trackGain;
    private float trackPeak;

    public /* synthetic */ ReplayGain(float r2, float r3, float r4, float r5, int r6, xj0 r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0.0f;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0.0f;
    L14:
        this(r2, r3, r4, r5);
    }

    public static /* synthetic */ ReplayGain copy$default(ReplayGain r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.trackGain;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.albumGain;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.trackPeak;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.albumPeak;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final float component1() {
        return this.trackGain;
    }

    public final float component2() {
        return this.albumGain;
    }

    public final float component3() {
        return this.trackPeak;
    }

    public final float component4() {
        return this.albumPeak;
    }

    public final ReplayGain copy(float r1, float r2, float r3, float r4) {
        return new ReplayGain(r1, r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReplayGain) == true) goto L8;
        return false;
    L8:
        ReplayGain r6 = (ReplayGain) r5;
        if (Float.compare(this.trackGain, r6.trackGain) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.albumGain, r6.albumGain) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.trackPeak, r6.trackPeak) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.albumPeak, r6.albumPeak) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public final float getAlbumGain() {
        return this.albumGain;
    }

    public final float getAlbumPeak() {
        return this.albumPeak;
    }

    public final float getTrackGain() {
        return this.trackGain;
    }

    public final float getTrackPeak() {
        return this.trackPeak;
    }

    public int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(this.trackGain) * 31, this.albumGain, 31), this.trackPeak, 31);
        return Float.hashCode(this.albumPeak) + r0;
    }

    public final void setAlbumGain(float r1) {
        this.albumGain = r1;
    }

    public final void setAlbumPeak(float r1) {
        this.albumPeak = r1;
    }

    public final void setTrackGain(float r1) {
        this.trackGain = r1;
    }

    public final void setTrackPeak(float r1) {
        this.trackPeak = r1;
    }

    public String toString() {
        float r0 = this.trackGain;
        float r1 = this.albumGain;
        float r2 = this.trackPeak;
        float r6 = this.albumPeak;
        StringBuilder r3 = b11.r("ReplayGain(trackGain=", r0, ", albumGain=", r1, ", trackPeak=");
        r3.append(r2);
        r3.append(", albumPeak=");
        r3.append(r6);
        r3.append(")");
        return r3.toString();
    }

    public ReplayGain(float r1, float r2, float r3, float r4) {
        this.trackGain = r1;
        this.albumGain = r2;
        this.trackPeak = r3;
        this.albumPeak = r4;
    }

    public ReplayGain() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        float r3 = 0.0f;
        float r4 = 0.0f;
        this(r1, r2, r3, r4, 15, null);
    }
}
