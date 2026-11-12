package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends cx3 {
    public final lo u;
    public final /* synthetic */ yk3 v;

    public xk3(yk3 r3, lo r4) {
        this.v = r3;
        ConstraintLayout r5 = (ConstraintLayout) r4.a;
        super(r5);
        this.u = r4;
        ((TextView) r4.k).setSelected(true);
        ((TextView) r4.j).setSelected(true);
        r5.setOnClickListener(new bj3(4, this));
    }
}
