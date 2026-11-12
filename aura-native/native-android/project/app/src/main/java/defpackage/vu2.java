package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 extends FrameLayout implements j40 {
    public final CollapsibleActionView n;

    /* JADX WARN: Multi-variable type inference failed */
    public vu2(View view) {
        super(view.getContext());
        this.n = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.j40
    public final void onActionViewCollapsed() {
        this.n.onActionViewCollapsed();
    }

    @Override // defpackage.j40
    public final void onActionViewExpanded() {
        this.n.onActionViewExpanded();
    }
}
