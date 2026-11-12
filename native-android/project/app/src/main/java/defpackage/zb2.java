package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 implements AbsListView.OnScrollListener {
    public final /* synthetic */ bc2 a;

    public zb2(bc2 bc2Var) {
        this.a = bc2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        bc2 bc2Var = this.a;
        yb2 yb2Var = bc2Var.E;
        lg lgVar = bc2Var.M;
        if (i != 1 || lgVar.getInputMethodMode() == 2 || lgVar.getContentView() == null) {
            return;
        }
        bc2Var.I.removeCallbacks(yb2Var);
        yb2Var.run();
    }
}
