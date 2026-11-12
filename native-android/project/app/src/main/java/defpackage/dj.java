package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dj extends cx3 {
    public final r20 u;
    public final /* synthetic */ ej v;

    /* JADX WARN: Illegal instructions before constructor call */
    public dj(ej ejVar, r20 r20Var) {
        this.v = ejVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) r20Var.o;
        super(constraintLayout);
        this.u = r20Var;
        ((TextView) r20Var.q).setSelected(true);
        constraintLayout.setOnClickListener(new p6(6, this));
        constraintLayout.setOnLongClickListener(new q6(6, this));
    }
}
