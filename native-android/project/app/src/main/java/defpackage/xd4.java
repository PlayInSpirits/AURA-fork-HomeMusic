package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd4 extends cx3 {
    public final qp4 u;
    public final /* synthetic */ s6 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public xd4(s6 s6Var, qp4 qp4Var) {
        this.v = s6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) qp4Var.a;
        super(constraintLayout);
        this.u = qp4Var;
        constraintLayout.setOnClickListener(new bj3(15, this));
        constraintLayout.setOnLongClickListener(new q6(22, this));
    }
}
