package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vm3 extends cx3 {
    public final jv3 u;
    public final /* synthetic */ ej v;

    /* JADX WARN: Illegal instructions before constructor call */
    public vm3(ej ejVar, jv3 jv3Var) {
        this.v = ejVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) jv3Var.n;
        super(constraintLayout);
        this.u = jv3Var;
        ((TextView) jv3Var.p).setSelected(true);
        constraintLayout.setOnClickListener(new bj3(10, this));
        constraintLayout.setOnLongClickListener(new q6(16, this));
    }
}
