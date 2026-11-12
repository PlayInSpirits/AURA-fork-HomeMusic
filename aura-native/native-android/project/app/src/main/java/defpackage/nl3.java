package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nl3 extends cx3 {
    public final z05 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public nl3(zd0 zd0Var, z05 z05Var) {
        this.v = zd0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) z05Var.o;
        super(constraintLayout);
        this.u = z05Var;
        ((TextView) z05Var.q).setSelected(true);
        constraintLayout.setOnClickListener(new bj3(5, this));
    }
}
