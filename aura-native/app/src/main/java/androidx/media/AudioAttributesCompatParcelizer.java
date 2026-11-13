package androidx.media;

import defpackage.s45;
import defpackage.u45;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(s45 s45Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        u45 u45Var = audioAttributesCompat.a;
        if (s45Var.e(1)) {
            u45Var = s45Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) u45Var;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, s45 s45Var) {
        s45Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        s45Var.i(1);
        s45Var.l(audioAttributesImpl);
    }
}
