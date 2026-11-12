package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn2 implements oi3 {
    public final /* synthetic */ bj2 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    public zn2(bj2 r1, int r2, long r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.oi3
    public final void I(cu4 r4, int r5) {
        bj2 r6 = this.n;
        int r7 = r6.Q0();
        int r0 = this.o;
        if (r7 <= 0) goto L12;
        if (r0 < 0) goto L12;
        if (r0 >= r7) goto L12;
        if (u52.c().a == false) goto L10;
        r6.r0(this);
        return;
    L10:
        r6.n(r0, this.p);
        r6.m0();
        r6.r0(this);
        return;
    L12:
        Log.d("MediaManager", "Cannot start playback: itemCount=" + r7 + ", startIndex=" + r0);
    }
}
