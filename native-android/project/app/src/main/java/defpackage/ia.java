package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ ia(ra r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        ra r3 = this.o;
        switch(r0) {
            case 0: goto L13;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ra.i(r3.getRoot());
        return;
    L6:
        ra.i(r3.getRoot());
        return;
    L8:
        r3.J0 = false;
        MotionEvent r1 = r3.z0;
        r1.getClass();
        if (r1.getActionMasked() != 10) goto L11;
        r3.F(r1);
        return;
    L11:
        kf2.o("The ACTION_HOVER_EXIT event was not cleared.");
        return;
    L13:
        ii r4 = r3.v;
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
    L23:
    L20:
        th = move-exception;
        Trace.endSection();
        throw th;
    L15:
        if (r4.isEmpty() == true) goto L18;
        ((gf1) r4.removeLast()).invoke();     // Catch: Throwable -> L20
        goto L23
    L18:
        Trace.endSection();
    }
}
