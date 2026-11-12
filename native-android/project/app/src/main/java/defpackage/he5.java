package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he5 extends cx3 {
    public final wo0 u;
    public final /* synthetic */ uc4 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public he5(uc4 uc4Var, wo0 wo0Var) {
        this.v = uc4Var;
        LinearLayout linearLayout = (LinearLayout) wo0Var.n;
        super(linearLayout);
        this.u = wo0Var;
        linearLayout.setOnClickListener(new bj3(17, this));
    }
}
