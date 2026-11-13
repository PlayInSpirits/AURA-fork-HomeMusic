package com.eddyizm.tempus.model;

import defpackage.b11;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ReplayGain {
    public static final int $stable = 8;
    private float albumGain;
    private float albumPeak;
    private float trackGain;
    private float trackPeak;

    public /* synthetic */ ReplayGain(float f, float f2, float f3, float f4, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public static /* synthetic */ ReplayGain copy$default(ReplayGain replayGain, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = replayGain.trackGain;
        }
        if ((i & 2) != 0) {
            f2 = replayGain.albumGain;
        }
        if ((i & 4) != 0) {
            f3 = replayGain.trackPeak;
        }
        if ((i & 8) != 0) {
            f4 = replayGain.albumPeak;
        }
        return replayGain.copy(f, f2, f3, f4);
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

    public final ReplayGain copy(float f, float f2, float f3, float f4) {
        return new ReplayGain(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplayGain)) {
            return false;
        }
        ReplayGain replayGain = (ReplayGain) obj;
        return Float.compare(this.trackGain, replayGain.trackGain) == 0 && Float.compare(this.albumGain, replayGain.albumGain) == 0 && Float.compare(this.trackPeak, replayGain.trackPeak) == 0 && Float.compare(this.albumPeak, replayGain.albumPeak) == 0;
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
        return Float.hashCode(this.albumPeak) + b11.d(b11.d(Float.hashCode(this.trackGain) * 31, this.albumGain, 31), this.trackPeak, 31);
    }

    public final void setAlbumGain(float f) {
        this.albumGain = f;
    }

    public final void setAlbumPeak(float f) {
        this.albumPeak = f;
    }

    public final void setTrackGain(float f) {
        this.trackGain = f;
    }

    public final void setTrackPeak(float f) {
        this.trackPeak = f;
    }

    public String toString() {
        float f = this.trackGain;
        float f2 = this.albumGain;
        float f3 = this.trackPeak;
        float f4 = this.albumPeak;
        StringBuilder r = b11.r("ReplayGain(trackGain=", f, ", albumGain=", f2, ", trackPeak=");
        r.append(f3);
        r.append(", albumPeak=");
        r.append(f4);
        r.append(")");
        return r.toString();
    }

    public ReplayGain(float f, float f2, float f3, float f4) {
        this.trackGain = f;
        this.albumGain = f2;
        this.trackPeak = f3;
        this.albumPeak = f4;
    }

    public ReplayGain() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
}
