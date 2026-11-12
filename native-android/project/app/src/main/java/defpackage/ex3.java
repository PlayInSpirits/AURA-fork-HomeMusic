package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ex3 extends z2 {
    public final RecyclerView q;
    public final dx3 r;

    public ex3(RecyclerView recyclerView) {
        this.q = recyclerView;
        z2 z2VarJ = j();
        if (z2VarJ == null || !(z2VarJ instanceof dx3)) {
            this.r = new dx3(this);
        } else {
            this.r = (dx3) z2VarJ;
        }
    }

    @Override // defpackage.z2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.q.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().V(accessibilityEvent);
        }
    }

    @Override // defpackage.z2
    public void d(View view, v3 v3Var) {
        this.n.onInitializeAccessibilityNodeInfo(view, v3Var.a);
        RecyclerView recyclerView = this.q;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        mw3 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.W(recyclerView2.p, recyclerView2.u0, v3Var);
    }

    @Override // defpackage.z2
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().j0(i, bundle);
    }

    public z2 j() {
        return this.r;
    }
}
