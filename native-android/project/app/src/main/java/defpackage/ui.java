package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ui extends cx3 {
    public final yc5 u;
    public final /* synthetic */ vi v;

    /* JADX WARN: Illegal instructions before constructor call */
    public ui(vi viVar, yc5 yc5Var) {
        this.v = viVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) yc5Var.n;
        super(constraintLayout);
        this.u = yc5Var;
        ((TextView) yc5Var.p).setSelected(true);
        constraintLayout.setOnClickListener(new p6(4, this));
        constraintLayout.setOnLongClickListener(new q6(4, this));
    }
}
