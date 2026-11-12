package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends cx3 {
    public final lo u;
    public final /* synthetic */ yk3 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public xk3(yk3 yk3Var, lo loVar) {
        this.v = yk3Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) loVar.a;
        super(constraintLayout);
        this.u = loVar;
        ((TextView) loVar.k).setSelected(true);
        ((TextView) loVar.j).setSelected(true);
        constraintLayout.setOnClickListener(new bj3(4, this));
    }
}
