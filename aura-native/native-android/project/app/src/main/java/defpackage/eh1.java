package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends cx3 {
    public final ie1 u;
    public final /* synthetic */ ej v;

    /* JADX WARN: Illegal instructions before constructor call */
    public eh1(ej ejVar, ie1 ie1Var) {
        this.v = ejVar;
        LinearLayout linearLayout = ie1Var.a;
        super(linearLayout);
        this.u = ie1Var;
        linearLayout.setOnClickListener(new p6(16, this));
    }
}
