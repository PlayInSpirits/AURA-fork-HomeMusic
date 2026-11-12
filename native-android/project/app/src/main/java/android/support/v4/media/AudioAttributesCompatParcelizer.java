package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import defpackage.s45;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
    }

    public static AudioAttributesCompat read(s45 r0) {
        return androidx.media.AudioAttributesCompatParcelizer.read(r0);
    }

    public static void write(AudioAttributesCompat r0, s45 r1) {
        androidx.media.AudioAttributesCompatParcelizer.write(r0, r1);
    }
}
