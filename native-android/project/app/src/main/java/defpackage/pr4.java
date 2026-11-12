package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends au0 {
    public final /* synthetic */ h12 G;
    public final /* synthetic */ rr4 H;

    public pr4(rr4 r1, h12 r2) {
        this.H = r1;
        this.G = r2;
    }

    @Override // defpackage.au0
    public final void M(int r3) {
        this.H.m = true;
        this.G.H(r3);
    }

    @Override // defpackage.au0
    public final void N(Typeface r3) {
        rr4 r0 = this.H;
        Typeface r4 = Typeface.create(r3, r0.c);
        r0.n = r4;
        r0.m = true;
        this.G.I(r4, false);
    }
}
