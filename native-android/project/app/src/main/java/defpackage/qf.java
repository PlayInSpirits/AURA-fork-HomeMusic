package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bg o;

    public /* synthetic */ qf(bg r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        bg r1 = this.o;
        switch(r0) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        r1.I.showAtLocation(r1.H, 55, 0, 0);
        s75 r2 = r1.K;
        if (r2 == null) goto L8;
        r2.b();
    L8:
        if (r1.M == false) goto L14;
        ViewGroup r3 = r1.N;
        if (r3 == null) goto L14;
        if (r3.isLaidOut() == false) goto L14;
        r1.H.setAlpha(0.0f);
        s75 r4 = j65.a(r1.H);
        r4.a(1.0f);
        r1.K = r4;
        r4.d(new sf(0, this));
        return;
    L14:
        r1.H.setAlpha(1.0f);
        r1.H.setVisibility(0);
        return;
    L17:
        if ((r1.m0 & 1) == 0) goto L20;
        r1.A(0);
    L20:
        if ((r1.m0 & 4096) == 0) goto L22;
        r1.A(108);
    L22:
        r1.l0 = false;
        r1.m0 = 0;
    }
}
