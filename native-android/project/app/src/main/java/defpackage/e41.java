package defpackage;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e41 implements c55, uy, rk3 {
    public c55 n;
    public uy o;
    public c55 p;
    public uy q;

    @Override // defpackage.uy
    public final void a(long r2, float[] r4) {
        uy r0 = this.q;
        if (r0 == null) goto L5;
        r0.a(r2, r4);
    L5:
        uy r1 = this.o;
        if (r1 == null) goto L9;
        r1.a(r2, r4);
        return;
    }

    @Override // defpackage.uy
    public final void b() {
        uy r0 = this.q;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        uy r1 = this.o;
        if (r1 == null) goto L9;
        r1.b();
        return;
    }

    @Override // defpackage.rk3
    public final void c(int r2, Object r3) {
        if (r2 != 7) goto L5;
        this.n = (c55) r3;
        return;
    L5:
        if (r2 != 8) goto L7;
        this.o = (uy) r3;
        return;
    L7:
        if (r2 == 10000) goto L9;
        return;
    L9:
        sj4 r4 = (sj4) r3;
        if (r4 != null) goto L13;
        this.p = null;
        this.q = null;
        return;
    L13:
        this.p = r4.getVideoFrameMetadataListener();
        this.q = r4.getCameraMotionListener();
    }

    @Override // defpackage.c55
    public final void d(long r8, long r10, tb1 r12, MediaFormat r13) {
        c55 r0 = this.p;
        if (r0 == null) goto L5;
        r0.d(r8, r10, r12, r13);
    L5:
        c55 r7 = this.n;
        if (r7 == null) goto L9;
        r7.d(r8, r10, r12, r13);
        return;
    }
}
