package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 extends cx3 {
    public final bq4 u;
    public final /* synthetic */ s6 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public r6(s6 s6Var, bq4 bq4Var) {
        this.v = s6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) bq4Var.n;
        super(constraintLayout);
        this.u = bq4Var;
        ((TextView) bq4Var.p).setSelected(true);
        ((TextView) bq4Var.q).setSelected(true);
        constraintLayout.setOnClickListener(new p6(0, this));
        constraintLayout.setOnLongClickListener(new q6(0, this));
    }
}
