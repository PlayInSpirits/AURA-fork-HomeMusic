package androidx.media;

import android.media.AudioAttributes;
import defpackage.s45;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(s45 s45Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) s45Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = s45Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, s45 s45Var) {
        s45Var.getClass();
        s45Var.k(audioAttributesImplApi21.a, 1);
        s45Var.j(audioAttributesImplApi21.b, 2);
    }
}
