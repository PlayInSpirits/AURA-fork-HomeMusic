package androidx.media3.exoplayer.audio;

import defpackage.b11;
import defpackage.tb1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean n;
    public final tb1 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, tb1 tb1Var, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbT = b11.t("AudioTrack init failed 0 Config(", ", ", i, i2, ", ");
        sbT.append(i3);
        sbT.append(", ");
        sbT.append(i4);
        sbT.append(") ");
        sbT.append(tb1Var);
        sbT.append(z ? " (recoverable)" : "");
        super(sbT.toString(), audioOutputProvider$InitializationException);
        this.n = z;
        this.o = tb1Var;
    }
}
