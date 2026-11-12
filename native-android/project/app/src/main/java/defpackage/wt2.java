package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ ed2 q;
    public final /* synthetic */ un2 r;

    public /* synthetic */ wt2(zt2 r1, Pair r2, ed2 r3, un2 r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        un2 r1 = this.r;
        ed2 r2 = this.q;
        Pair r3 = this.p;
        zt2 r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((nj0) r4.o.i).w(((Integer) r3.first).intValue(), (mt2) r3.second, r2, r1);
        return;
    L6:
        ((nj0) r4.o.i).u(((Integer) r3.first).intValue(), (mt2) r3.second, r2, r1);
    }
}
