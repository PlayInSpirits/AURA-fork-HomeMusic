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

    public x2(int i, v3 v3Var, int i2) {
        this.n = i;
        this.o = v3Var;
        this.p = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.n);
        this.o.a.performAction(this.p, bundle);
    }
}
