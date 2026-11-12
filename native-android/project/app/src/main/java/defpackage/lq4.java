package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lq4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ mq4 b;

    public lq4(mq4 r1, View r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        View r10 = this.a;
        if (r10.getVisibility() != 0) goto L6;
        this.b.c(r10);
        return;
    }
}
