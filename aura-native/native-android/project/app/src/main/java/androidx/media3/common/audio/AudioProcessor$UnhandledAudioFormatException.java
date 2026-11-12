package androidx.media3.common.audio;

import defpackage.gm;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(String str, gm gmVar) {
        super(str + " " + gmVar);
    }

    public AudioProcessor$UnhandledAudioFormatException(gm gmVar) {
        this("Unhandled input format:", gmVar);
    }
}
