package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ iq o;

    public /* synthetic */ gq(iq iqVar, int i) {
        this.n = i;
        this.o = iqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        iq iqVar = this.o;
        switch (i) {
            case 0:
                if (iqVar.r > 0) {
                    SystemClock.uptimeMillis();
                }
                iqVar.setVisibility(0);
                break;
            default:
                ((cw0) iqVar.getCurrentDrawable()).e(false, false, true);
                if (iqVar.getProgressDrawable() == null || !iqVar.getProgressDrawable().isVisible()) {
                    if (iqVar.getIndeterminateDrawable() == null || !iqVar.getIndeterminateDrawable().isVisible()) {
                        iqVar.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
