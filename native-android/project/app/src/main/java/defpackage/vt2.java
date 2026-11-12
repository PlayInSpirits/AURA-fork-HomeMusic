package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vt2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ zt2 o;
    public final /* synthetic */ Pair p;
    public final /* synthetic */ un2 q;

    public /* synthetic */ vt2(zt2 r1, Pair r2, un2 r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        un2 r1 = this.q;
        Pair r2 = this.p;
        zt2 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((nj0) r3.o.i).l(((Integer) r2.first).intValue(), (mt2) r2.second, r1);
        return;
    L6:
        nj0 r4 = (nj0) r3.o.i;
        int r5 = ((Integer) r2.first).intValue();
        mt2 r6 = (mt2) r2.second;
        r6.getClass();
        r4.m(r5, r6, r1);
    }
}
