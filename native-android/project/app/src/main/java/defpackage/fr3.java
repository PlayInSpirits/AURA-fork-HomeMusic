package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fr3 implements q44 {
    public final int n;
    public final /* synthetic */ hr3 o;

    public fr3(hr3 r1, int r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.q44
    public final boolean c() {
        hr3 r0 = this.o;
        if (r0.G() == false) goto L5;
        return false;
    L5:
        if (r0.I[this.n].s(r0.c0) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.q44
    public final void s() {
        int r0 = this.n;
        hr3 r3 = this.o;
        p44 r1 = r3.I[r0];
        pw0 r2 = r1.h;
        if (r2 != null) goto L5;
    L9:
        i61 r4 = r3.z;
        int r5 = r3.q.D(r3.S);
        IOException r6 = (IOException) r4.q;
        if (r6 != null) goto L23;
        id2 r7 = (id2) r4.p;
        if (r7 != null) goto L14;
        return;
    L14:
        if (r5 != Integer.MIN_VALUE) goto L16;
        r5 = r7.n;
    L16:
        IOException r8 = r7.r;
        if (r8 != null) goto L19;
        return;
    L19:
        if (r7.s <= r5) goto L25;
        throw r8;
    L25:
        return;
    L23:
        throw r6;
    L5:
        if (r2.getState() != 1) goto L9;
        DrmSession$DrmSessionException r9 = r1.h.g();
        r9.getClass();
        throw r9;
    }

    @Override // defpackage.q44
    public final int t(gp3 r5, cj0 r6, int r7) {
        hr3 r0 = this.o;
        if (r0.G() == false) goto L5;
        return -3;
    L5:
        int r4 = this.n;
        r0.B(r4);
        int r8 = r0.I[r4].w(r5, r6, r7, r0.c0);
        if (r8 != (-3)) goto L8;
        r0.C(r4);
    L8:
        return r8;
    }

    @Override // defpackage.q44
    public final int u(long r4) {
        hr3 r0 = this.o;
        if (r0.G() == false) goto L6;
        return 0;
    L6:
        int r3 = this.n;
        r0.B(r3);
        p44 r1 = r0.I[r3];
        int r5 = r1.q(r0.c0, r4);
        r1.A(r5);
        if (r5 != 0) goto L9;
        r0.C(r3);
    L9:
        return r5;
    }
}
