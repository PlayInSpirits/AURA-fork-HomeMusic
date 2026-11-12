package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq0 extends cx3 {
    public final na4 u;
    public final /* synthetic */ vq0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public uq0(vq0 vq0Var, na4 na4Var) {
        this.v = vq0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) na4Var.n;
        super(constraintLayout);
        this.u = na4Var;
        constraintLayout.setOnClickListener(new p6(12, this));
        constraintLayout.setOnLongClickListener(new q6(8, this));
    }
}
