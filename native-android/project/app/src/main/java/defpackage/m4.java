package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ActionBarOverlayLayout o;

    public /* synthetic */ m4(ActionBarOverlayLayout r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        ActionBarOverlayLayout r2 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r2.h();
        r2.J = r2.q.animate().translationY(-r2.q.getHeight()).setListener(r2.K);
        return;
    L6:
        r2.h();
        r2.J = r2.q.animate().translationY(0.0f).setListener(r2.K);
    }
}
