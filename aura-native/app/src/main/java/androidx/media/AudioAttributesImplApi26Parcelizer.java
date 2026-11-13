package androidx.media;

import android.media.AudioAttributes;
import defpackage.s45;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(s45 s45Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) s45Var.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = s45Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, s45 s45Var) {
        s45Var.getClass();
        s45Var.k(audioAttributesImplApi26.a, 1);
        s45Var.j(audioAttributesImplApi26.b, 2);
    }
}
