package defpackage;

import com.eddyizm.tempus.ui.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MainActivity o;

    public /* synthetic */ xs1(MainActivity r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        MainActivity r2 = this.o;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L17;
            default: goto L4;
        };
    L4:
        int r1 = MainActivity.e0;
        ((bj2) r2.P.get()).v(new tf2(r2));     // Catch: Throwable -> L14
        if (((bj2) r2.P.get()).a() != null) goto L9;
        return;
    L9:
        if (r2.W.Y != 5) goto L29;
        ((au) r2.V.n).d(true);     // Catch: InterruptedException -> L12 Throwable -> L14
    L30:
        return;
    L12:
        e = e;
    L15:
        e.printStackTrace();
        return;
    L29:
        return;
    L14:
        e = e;
        goto L15
    L17:
        r2.t();
        return;
    L20:
        if (r2.isFinishing() == false) goto L22;
        return;
    L22:
        if (r2.isDestroyed() == true) goto L32;
        r2.H();
        return;
    }
}
