package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View n;
    public final /* synthetic */ j71 o;

    public i71(j71 r1, View r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean r2 = false;
        lg1 r0 = new lg1(this, this, r2, 13);
        e35.C().post(r0);
    }
}
