package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends ClickableSpan {
    public final int n;
    public final v3 o;
    public final int p;

    public x2(int r1, v3 r2, int r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r3) {
        Bundle r4 = new Bundle();
        r4.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.n);
        int r0 = this.p;
        this.o.a.performAction(r0, r4);
    }
}
