package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uq0 extends cx3 {
    public final na4 u;
    public final /* synthetic */ vq0 v;

    public uq0(vq0 r2, na4 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.n;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new p6(12, this));
        r4.setOnLongClickListener(new q6(8, this));
    }
}
