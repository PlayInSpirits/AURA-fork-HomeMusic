package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u8 extends cx3 {
    public final ss0 u;
    public final /* synthetic */ v8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(v8 v8Var, ss0 ss0Var) {
        super((ConstraintLayout) ss0Var.n);
        this.v = v8Var;
        this.u = ss0Var;
        ((TextView) ss0Var.p).setOnClickListener(new p6(3, this));
    }
}
