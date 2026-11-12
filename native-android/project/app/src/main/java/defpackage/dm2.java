package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ im2 o;

    public /* synthetic */ dm2(im2 r1, ml3 r2) {
        this.n = 2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        im2 r5 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        sk2 r6 = r5.a1();
        r6.getClass();
        if (Looper.myLooper() != r6.f.getLooper()) goto L7;
        boolean r1 = true;
    L8:
        rr2.w(r1);
        qk2 r7 = r6.e;
        r7.getClass();
        new mw1(new ab4(-6));
        r7.u();
        return;
    L7:
        r1 = false;
        goto L8
    L10:
        jj2 r2 = new jj2(r5.a, r5.c.a.b(), new z05(r5), r5.b.d.S0());
        r5.j = r2;
        l93.A("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        r2.a.b.connect();
        return;
    L13:
        if (r5.k == false) goto L15;
        return;
    L15:
        if (((xk2) r5.i.n).e.a() != null) goto L20;
        r5.e1();
        return;
    }

    public /* synthetic */ dm2(im2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }
}
