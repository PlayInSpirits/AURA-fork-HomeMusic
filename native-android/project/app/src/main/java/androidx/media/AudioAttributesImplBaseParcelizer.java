package androidx.media;

import defpackage.s45;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(s45 s45Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = s45Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = s45Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = s45Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = s45Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, s45 s45Var) {
        s45Var.getClass();
        s45Var.j(audioAttributesImplBase.a, 1);
        s45Var.j(audioAttributesImplBase.b, 2);
        s45Var.j(audioAttributesImplBase.c, 3);
        s45Var.j(audioAttributesImplBase.d, 4);
    }
}
