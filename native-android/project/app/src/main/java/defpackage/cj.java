package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cj extends cx3 {
    public final ns3 u;
    public final /* synthetic */ s6 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public cj(s6 s6Var, ns3 ns3Var) {
        this.v = s6Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) ns3Var.o;
        super(constraintLayout);
        this.u = ns3Var;
        constraintLayout.setOnClickListener(new p6(5, this));
        constraintLayout.setOnLongClickListener(new q6(5, this));
        ((TextView) ns3Var.q).setSelected(true);
    }
}
