package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cj extends cx3 {
    public final ns3 u;
    public final /* synthetic */ s6 v;

    public cj(s6 r3, ns3 r4) {
        this.v = r3;
        ConstraintLayout r5 = (ConstraintLayout) r4.o;
        super(r5);
        this.u = r4;
        r5.setOnClickListener(new p6(5, this));
        r5.setOnLongClickListener(new q6(5, this));
        ((TextView) r4.q).setSelected(true);
    }
}
