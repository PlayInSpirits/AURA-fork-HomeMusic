package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.h12;
import defpackage.xj0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ReplayGainInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReplayGainInfo> CREATOR = new b23(27);
    private Float albumGain;
    private Float albumPeak;
    private Float baseGain;
    private Float fallbackGain;
    private Float trackGain;
    private Float trackPeak;

    public /* synthetic */ ReplayGainInfo(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, int i, xj0 xj0Var) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4, (i & 16) != 0 ? null : f5, (i & 32) != 0 ? null : f6);
    }

    public static /* synthetic */ ReplayGainInfo copy$default(ReplayGainInfo replayGainInfo, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = replayGainInfo.trackGain;
        }
        if ((i & 2) != 0) {
            f2 = replayGainInfo.albumGain;
        }
        if ((i & 4) != 0) {
            f3 = replayGainInfo.trackPeak;
        }
        if ((i & 8) != 0) {
            f4 = replayGainInfo.albumPeak;
        }
        if ((i & 16) != 0) {
            f5 = replayGainInfo.baseGain;
        }
        if ((i & 32) != 0) {
            f6 = replayGainInfo.fallbackGain;
        }
        Float f7 = f5;
        Float f8 = f6;
        return replayGainInfo.copy(f, f2, f3, f4, f7, f8);
    }

    public final Float component1() {
        return this.trackGain;
    }

    public final Float component2() {
        return this.albumGain;
    }

    public final Float component3() {
        return this.trackPeak;
    }

    public final Float component4() {
        return this.albumPeak;
    }

    public final Float component5() {
        return this.baseGain;
    }

    public final Float component6() {
        return this.fallbackGain;
    }

    public final ReplayGainInfo copy(Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        return new ReplayGainInfo(f, f2, f3, f4, f5, f6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplayGainInfo)) {
            return false;
        }
        ReplayGainInfo replayGainInfo = (ReplayGainInfo) obj;
        return h12.c(this.trackGain, replayGainInfo.trackGain) && h12.c(this.albumGain, replayGainInfo.albumGain) && h12.c(this.trackPeak, replayGainInfo.trackPeak) && h12.c(this.albumPeak, replayGainInfo.albumPeak) && h12.c(this.baseGain, replayGainInfo.baseGain) && h12.c(this.fallbackGain, replayGainInfo.fallbackGain);
    }

    public final Float getAlbumGain() {
        return this.albumGain;
    }

    public final Float getAlbumPeak() {
        return this.albumPeak;
    }

    public final Float getBaseGain() {
        return this.baseGain;
    }

    public final Float getFallbackGain() {
        return this.fallbackGain;
    }

    public final Float getTrackGain() {
        return this.trackGain;
    }

    public final Float getTrackPeak() {
        return this.trackPeak;
    }

    public final boolean hasAnyValue() {
        return (this.trackGain == null && this.albumGain == null && this.trackPeak == null && this.albumPeak == null && this.baseGain == null && this.fallbackGain == null) ? false : true;
    }

    public int hashCode() {
        Float f = this.trackGain;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.albumGain;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.trackPeak;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.albumPeak;
        int hashCode4 = (hashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.baseGain;
        int hashCode5 = (hashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.fallbackGain;
        return hashCode5 + (f6 != null ? f6.hashCode() : 0);
    }

    public final void setAlbumGain(Float f) {
        this.albumGain = f;
    }

    public final void setAlbumPeak(Float f) {
        this.albumPeak = f;
    }

    public final void setBaseGain(Float f) {
        this.baseGain = f;
    }

    public final void setFallbackGain(Float f) {
        this.fallbackGain = f;
    }

    public final void setTrackGain(Float f) {
        this.trackGain = f;
    }

    public final void setTrackPeak(Float f) {
        this.trackPeak = f;
    }

    public String toString() {
        return "ReplayGainInfo(trackGain=" + this.trackGain + ", albumGain=" + this.albumGain + ", trackPeak=" + this.trackPeak + ", albumPeak=" + this.albumPeak + ", baseGain=" + this.baseGain + ", fallbackGain=" + this.fallbackGain + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Float f = this.trackGain;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.albumGain;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.trackPeak;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.albumPeak;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        Float f5 = this.baseGain;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f5.floatValue());
        }
        Float f6 = this.fallbackGain;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f6.floatValue());
        }
    }

    public ReplayGainInfo(Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        this.trackGain = f;
        this.albumGain = f2;
        this.trackPeak = f3;
        this.albumPeak = f4;
        this.baseGain = f5;
        this.fallbackGain = f6;
    }

    public ReplayGainInfo() {
        this(null, null, null, null, null, null, 63, null);
    }
}
