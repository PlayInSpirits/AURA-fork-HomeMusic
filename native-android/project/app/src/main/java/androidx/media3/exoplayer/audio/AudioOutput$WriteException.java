package androidx.media3.exoplayer.audio;

import defpackage.f34;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioOutput$WriteException extends Exception {
    public final int n;
    public final boolean o;

    public AudioOutput$WriteException(int i, boolean z) {
        super(f34.f(i, "AudioOutput write failed: "));
        this.o = z;
        this.n = i;
    }
}
