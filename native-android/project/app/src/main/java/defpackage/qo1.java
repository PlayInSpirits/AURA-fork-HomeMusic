package defpackage;

import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 extends cx3 {
    public final rf2 u;
    public final /* synthetic */ ro1 v;

    public qo1(ro1 r2, rf2 r3) {
        this.v = r2;
        super((ConstraintLayout) r3.n);
        this.u = r3;
        ((CheckBox) r3.o).setOnCheckedChangeListener(new g20(1, this));
    }
}
