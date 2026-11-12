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

    public vm(AudioTrack r2, d34 r3) {
        this.a = new um(r2);
        this.b = r2.getSampleRate();
        this.c = r3;
        a(0);
    }

    public final void a(int r7) {
        this.d = r7;
        if (r7 != 0) goto L5;
        this.g = 0;
        this.h = -1;
        this.i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f = 10000;
        return;
    L5:
        if (r7 != 1) goto L7;
        this.f = 10000;
        return;
    L7:
        if (r7 != 2) goto L9;
    L16:
        this.f = 10000000;
        return;
    L9:
        if (r7 == 3) goto L16;
        if (r7 != 4) goto L14;
        this.f = 500000;
        return;
    L14:
        tb4.a();
    }
}
