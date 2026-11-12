package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 extends cx3 {
    public final rm3 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public dh1(zd0 zd0Var, rm3 rm3Var) {
        this.v = zd0Var;
        LinearLayout linearLayout = (LinearLayout) rm3Var.n;
        super(linearLayout);
        this.u = rm3Var;
        linearLayout.setOnClickListener(new p6(15, this));
    }
}
