package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd4 extends cx3 {
    public final qp4 u;
    public final /* synthetic */ s6 v;

    public xd4(s6 r2, qp4 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.a;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new bj3(15, this));
        r4.setOnLongClickListener(new q6(22, this));
    }
}
