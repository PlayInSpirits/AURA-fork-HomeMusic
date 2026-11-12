package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zu2 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ av2 n;

    public zu2(av2 r1) {
        this.n = r1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.n.c();
    }
}
