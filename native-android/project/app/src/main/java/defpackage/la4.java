package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class la4 extends cx3 {
    public final i61 u;
    public final /* synthetic */ zd0 v;

    public la4(zd0 r2, i61 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.o;
        super(r4);
        this.u = r3;
        ((TextView) r3.q).setSelected(true);
        r4.setOnClickListener(new bj3(13, this));
        r4.setOnLongClickListener(new q6(19, this));
    }
}
