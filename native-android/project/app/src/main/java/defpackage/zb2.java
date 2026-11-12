package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ bc2 a;

    public zb2(bc2 r1) {
        this.a = r1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView r1, int r2, int r3, int r4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView r3, int r4) {
        bc2 r2 = this.a;
        yb2 r5 = r2.E;
        lg r0 = r2.M;
        if (r4 == 1) goto L5;
        return;
    L5:
        if (r0.getInputMethodMode() != 2) goto L8;
        return;
    L8:
        if (r0.getContentView() == null) goto L12;
        r2.I.removeCallbacks(r5);
        r5.run();
        return;
    }
}
