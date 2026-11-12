package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s70 extends ClickableSpan {
    public final ib2 n;

    public s70(ib2 r1) {
        this.n = r1;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r1) {
        this.n.getClass();
    }
}
