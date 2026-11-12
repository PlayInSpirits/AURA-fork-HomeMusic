package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 extends cx3 {
    public final bq4 u;
    public final /* synthetic */ l7 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public k7(l7 l7Var, bq4 bq4Var) {
        this.v = l7Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) bq4Var.n;
        super(constraintLayout);
        this.u = bq4Var;
        constraintLayout.setOnClickListener(new p6(1, this));
        constraintLayout.setOnLongClickListener(new q6(1, this));
        ((TextView) bq4Var.p).setSelected(true);
        ((TextView) bq4Var.q).setSelected(true);
    }
}
