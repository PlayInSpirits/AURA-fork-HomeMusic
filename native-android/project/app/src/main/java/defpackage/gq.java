package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ iq o;

    public /* synthetic */ gq(iq r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        iq r3 = this.o;
        switch(r0) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        ((cw0) r3.getCurrentDrawable()).e(false, false, true);
        if (r3.getProgressDrawable() == null) goto L9;
        if (r3.getProgressDrawable().isVisible() == false) goto L9;
        return;
    L9:
        if (r3.getIndeterminateDrawable() != null) goto L11;
    L12:
        r3.setVisibility(4);
        return;
    L11:
        if (r3.getIndeterminateDrawable().isVisible() == false) goto L12;
        return;
    L15:
        if (r3.r <= 0) goto L17;
        SystemClock.uptimeMillis();
    L17:
        r3.setVisibility(0);
    }
}
