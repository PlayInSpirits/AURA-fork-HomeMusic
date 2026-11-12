package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;

    public /* synthetic */ xt2(zt2 r1, Pair r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Pair r1 = this.p;
        zt2 r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((nj0) r2.o.i).z(((Integer) r1.first).intValue(), (mt2) r1.second);
        return;
    L6:
        ((nj0) r2.o.i).M(((Integer) r1.first).intValue(), (mt2) r1.second);
    }
}
