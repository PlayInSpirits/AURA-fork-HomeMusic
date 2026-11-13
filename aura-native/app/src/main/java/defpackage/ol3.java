package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ol3 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ zd0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol3(zd0 zd0Var, lv4 lv4Var) {
        super((ConstraintLayout) lv4Var.n);
        this.v = zd0Var;
        this.u = lv4Var;
        ((TextView) lv4Var.t).setSelected(true);
        ((ImageView) lv4Var.s).setOnClickListener(new bj3(6, this));
        ((ImageView) lv4Var.r).setOnTouchListener(new s7(7, this));
    }
}
