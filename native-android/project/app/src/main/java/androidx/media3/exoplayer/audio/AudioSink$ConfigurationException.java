package androidx.media3.exoplayer.audio;

import defpackage.tb1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final tb1 n;

    public AudioSink$ConfigurationException(Exception exc, tb1 tb1Var) {
        super(exc);
        this.n = tb1Var;
    }

    public AudioSink$ConfigurationException(String str, tb1 tb1Var) {
        super(str);
        this.n = tb1Var;
    }
}
