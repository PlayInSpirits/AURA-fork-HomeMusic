package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ pq o;

    public /* synthetic */ mq(pq r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        pq r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Handler r1 = r2.q;
        mq r3 = r2.r;
        r1.removeCallbacks(r3);
        r2.q.post(r3);
        return;
    L6:
        kn2 r4 = r2.p;
        if (r4 == null) goto L10;
        r2.f(r4, false);
        return;
    }
}
