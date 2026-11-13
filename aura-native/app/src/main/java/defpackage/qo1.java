package defpackage;

import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qo1 extends cx3 {
    public final rf2 u;
    public final /* synthetic */ ro1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo1(ro1 ro1Var, rf2 rf2Var) {
        super((ConstraintLayout) rf2Var.n);
        this.v = ro1Var;
        this.u = rf2Var;
        ((CheckBox) rf2Var.o).setOnCheckedChangeListener(new g20(1, this));
    }
}
