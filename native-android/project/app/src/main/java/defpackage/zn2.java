package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zn2 implements oi3 {
    public final /* synthetic */ bj2 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;

    public zn2(bj2 bj2Var, int i, long j) {
        this.n = bj2Var;
        this.o = i;
        this.p = j;
    }

    @Override // defpackage.oi3
    public final void I(cu4 cu4Var, int i) {
        bj2 bj2Var = this.n;
        int iQ0 = bj2Var.Q0();
        int i2 = this.o;
        if (iQ0 <= 0 || i2 < 0 || i2 >= iQ0) {
            Log.d("MediaManager", "Cannot start playback: itemCount=" + iQ0 + ", startIndex=" + i2);
            return;
        }
        if (u52.c().a) {
            bj2Var.r0(this);
            return;
        }
        bj2Var.n(i2, this.p);
        bj2Var.m0();
        bj2Var.r0(this);
    }
}
