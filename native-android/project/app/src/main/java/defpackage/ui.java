package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ui extends cx3 {
    public final yc5 u;
    public final /* synthetic */ vi v;

    public ui(vi r2, yc5 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.n;
        super(r4);
        this.u = r3;
        ((TextView) r3.p).setSelected(true);
        r4.setOnClickListener(new p6(4, this));
        r4.setOnLongClickListener(new q6(4, this));
    }
}
