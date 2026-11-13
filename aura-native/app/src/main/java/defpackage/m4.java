package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ActionBarOverlayLayout o;

    public /* synthetic */ m4(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.n = i;
        this.o = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        ActionBarOverlayLayout actionBarOverlayLayout = this.o;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.J = actionBarOverlayLayout.q.animate().translationY(0.0f).setListener(actionBarOverlayLayout.K);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.J = actionBarOverlayLayout.q.animate().translationY(-actionBarOverlayLayout.q.getHeight()).setListener(actionBarOverlayLayout.K);
                break;
        }
    }
}
