package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xg implements PopupWindow.OnDismissListener {
    public final /* synthetic */ sg n;
    public final /* synthetic */ yg o;

    public xg(yg r1, sg r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver r0 = this.o.T.getViewTreeObserver();
        if (r0 == null) goto L6;
        r0.removeGlobalOnLayoutListener(this.n);
        return;
    }
}
