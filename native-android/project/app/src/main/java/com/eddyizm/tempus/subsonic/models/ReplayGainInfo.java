package com.eddyizm.tempus.subsonic.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b23;
import defpackage.h12;
import defpackage.xj0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ReplayGainInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReplayGainInfo> CREATOR = null;
    private Float albumGain;
    private Float albumPeak;
    private Float baseGain;
    private Float fallbackGain;
    private Float trackGain;
    private Float trackPeak;

    static {
        CREATOR = new b23(27);
    }

    public /* synthetic */ ReplayGainInfo(Float r2, Float r3, Float r4, Float r5, Float r6, Float r7, int r8, xj0 r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = null;
    L20:
        this(r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ ReplayGainInfo copy$default(ReplayGainInfo r0, Float r1, Float r2, Float r3, Float r4, Float r5, Float r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.trackGain;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.albumGain;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.trackPeak;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.albumPeak;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.baseGain;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.fallbackGain;
    L20:
        Float r9 = r5;
        Float r10 = r6;
        Float r11 = r3;
        Float r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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

    public final ReplayGainInfo copy(Float r1, Float r2, Float r3, Float r4, Float r5, Float r6) {
        return new ReplayGainInfo(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReplayGainInfo) == true) goto L8;
        return false;
    L8:
        ReplayGainInfo r6 = (ReplayGainInfo) r5;
        if (h12.c(this.trackGain, r6.trackGain) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.albumGain, r6.albumGain) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.trackPeak, r6.trackPeak) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.albumPeak, r6.albumPeak) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.baseGain, r6.baseGain) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.fallbackGain, r6.fallbackGain) == true) goto L26;
        return false;
    L26:
        return true;
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
        if (this.trackGain == null) goto L5;
        return true;
    L5:
        if (this.albumGain == null) goto L7;
        return true;
    L7:
        if (this.trackPeak == null) goto L9;
        return true;
    L9:
        if (this.albumPeak == null) goto L11;
        return true;
    L11:
        if (this.baseGain == null) goto L13;
        return true;
    L13:
        if (this.fallbackGain != null) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Float r0 = this.trackGain;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Float r4 = this.albumGain;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        Float r7 = this.trackPeak;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Float r10 = this.albumPeak;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Float r13 = this.baseGain;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Float r16 = this.fallbackGain;
        if (r16 == null) goto L27;
        r1 = r16.hashCode();
    L27:
        return r15 + r1;
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setAlbumGain(Float r1) {
        this.albumGain = r1;
    }

    public final void setAlbumPeak(Float r1) {
        this.albumPeak = r1;
    }

    public final void setBaseGain(Float r1) {
        this.baseGain = r1;
    }

    public final void setFallbackGain(Float r1) {
        this.fallbackGain = r1;
    }

    public final void setTrackGain(Float r1) {
        this.trackGain = r1;
    }

    public final void setTrackPeak(Float r1) {
        this.trackPeak = r1;
    }

    public String toString() {
        return "ReplayGainInfo(trackGain=" + this.trackGain + ", albumGain=" + this.albumGain + ", trackPeak=" + this.trackPeak + ", albumPeak=" + this.albumPeak + ", baseGain=" + this.baseGain + ", fallbackGain=" + this.fallbackGain + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        Float r5 = this.trackGain;
        if (r5 != null) goto L5;
        r3.writeInt(0);
    L6:
        Float r6 = this.albumGain;
        if (r6 != null) goto L9;
        r3.writeInt(0);
    L10:
        Float r7 = this.trackPeak;
        if (r7 != null) goto L13;
        r3.writeInt(0);
    L14:
        Float r8 = this.albumPeak;
        if (r8 != null) goto L17;
        r3.writeInt(0);
    L18:
        Float r9 = this.baseGain;
        if (r9 != null) goto L21;
        r3.writeInt(0);
    L22:
        Float r2 = this.fallbackGain;
        if (r2 != null) goto L26;
        r3.writeInt(0);
        return;
    L26:
        r3.writeInt(1);
        r3.writeFloat(r2.floatValue());
        return;
    L21:
        r3.writeInt(1);
        r3.writeFloat(r9.floatValue());
        goto L22
    L17:
        r3.writeInt(1);
        r3.writeFloat(r8.floatValue());
        goto L18
    L13:
        r3.writeInt(1);
        r3.writeFloat(r7.floatValue());
        goto L14
    L9:
        r3.writeInt(1);
        r3.writeFloat(r6.floatValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeFloat(r5.floatValue());
        goto L6
    }

    public ReplayGainInfo(Float r1, Float r2, Float r3, Float r4, Float r5, Float r6) {
        this.trackGain = r1;
        this.albumGain = r2;
        this.trackPeak = r3;
        this.albumPeak = r4;
        this.baseGain = r5;
        this.fallbackGain = r6;
    }

    public ReplayGainInfo() {
        Float r1 = null;
        Float r2 = null;
        Float r3 = null;
        Float r4 = null;
        Float r5 = null;
        Float r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }
}
