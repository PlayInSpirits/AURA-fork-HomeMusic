package androidx.media3.exoplayer.audio;

import defpackage.f34;
import defpackage.tb1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int n;
    public final boolean o;
    public final tb1 p;

    public AudioSink$WriteException(int i, tb1 tb1Var, boolean z) {
        super(f34.f(i, "AudioTrack write failed: "));
        this.o = z;
        this.n = i;
        this.p = tb1Var;
    }
}
