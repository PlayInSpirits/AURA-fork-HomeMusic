package defpackage;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vm {
    public final um a;
    public final int b;
    public final d34 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public vm(AudioTrack audioTrack, d34 d34Var) {
        this.a = new um(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = d34Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            tb4.a();
        }
    }
}
