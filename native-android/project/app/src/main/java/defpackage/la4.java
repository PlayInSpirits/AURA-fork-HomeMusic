package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la4 extends cx3 {
    public final i61 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public la4(zd0 zd0Var, i61 i61Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) i61Var.o;
        super(constraintLayout);
        this.u = i61Var;
        ((TextView) i61Var.q).setSelected(true);
        constraintLayout.setOnClickListener(new bj3(13, this));
        constraintLayout.setOnLongClickListener(new q6(19, this));
    }
}
