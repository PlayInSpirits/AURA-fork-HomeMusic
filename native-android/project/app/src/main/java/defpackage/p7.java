package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p7 extends cx3 {
    public final ss0 u;
    public final /* synthetic */ q7 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public p7(q7 q7Var, ss0 ss0Var) {
        this.v = q7Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) ss0Var.n;
        super(constraintLayout);
        this.u = ss0Var;
        ((TextView) ss0Var.p).setSelected(true);
        ((TextView) ss0Var.q).setSelected(true);
        constraintLayout.setOnClickListener(new p6(2, this));
        constraintLayout.setOnLongClickListener(new q6(2, this));
    }
}
