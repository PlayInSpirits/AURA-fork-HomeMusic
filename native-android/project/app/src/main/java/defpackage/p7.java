package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p7 extends cx3 {
    public final ss0 u;
    public final /* synthetic */ q7 v;

    public p7(q7 r3, ss0 r4) {
        this.v = r3;
        ConstraintLayout r5 = (ConstraintLayout) r4.n;
        super(r5);
        this.u = r4;
        ((TextView) r4.p).setSelected(true);
        ((TextView) r4.q).setSelected(true);
        r5.setOnClickListener(new p6(2, this));
        r5.setOnLongClickListener(new q6(2, this));
    }
}
