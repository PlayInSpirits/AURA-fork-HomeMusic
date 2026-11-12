package defpackage;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ic2 o;
    public final /* synthetic */ List p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ vn2(bl2 r2, List r3, int r4, int r5) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        List r4 = this.p;
        int r5 = this.r;
        int r6 = this.q;
        ic2 r7 = this.o;
        switch(r0) {
            case 0: goto L38;
            case 1: goto L34;
            default: goto L33;
        };
    L33:
    L11:
        e = e;
    L12:
        e.printStackTrace();
        return;
    L5:
        if (r7.isDone() == false) goto L39;
        Log.e("MediaManager", "swap");     // Catch: Throwable -> L11
        ((bj2) r7.get()).t0(r6, r5);     // Catch: Throwable -> L11
        new vs3().c(r4, true, 0);     // Catch: InterruptedException -> L9 Throwable -> L11
    L40:
        return;
    L9:
        e = e;
        goto L12
    L39:
        return;
    L34:
    L18:
        e = move-exception;
        e.printStackTrace();
        return;
    L15:
        if (r7.isDone() == false) goto L41;
        Log.e("MediaManager", "shuffle");     // Catch: Throwable -> L18
        bj2 r8 = (bj2) r7.get();     // Catch: Throwable -> L18
        bo2.d.execute(new xn2(r4, r8, r6, r5));     // Catch: Throwable -> L18
        return;
    L41:
        return;
    L38:
    L28:
        e = e;
    L29:
        e.printStackTrace();
        return;
    L22:
        if (r7.isDone() == false) goto L43;
        Log.e("MediaManager", "remove range");     // Catch: Throwable -> L28
        ((bj2) r7.get()).P(r6, r5);     // Catch: Throwable -> L28
        r4.removeAll(r4.subList(r6, r5));     // Catch: InterruptedException -> L26 Throwable -> L28
        new vs3().c(r4, true, 0);     // Catch: InterruptedException -> L26 Throwable -> L28
    L44:
        return;
    L26:
        e = e;
        goto L29
    }

    public /* synthetic */ vn2(bl2 r1, int r2, int r3, List r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.q = r2;
        this.r = r3;
        this.p = r4;
    }
}
