package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ ns3 a;

    public jf2(ns3 ns3Var) {
        this.a = ns3Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((kf2) this.a.p).getClass();
        return bundle;
    }
}
