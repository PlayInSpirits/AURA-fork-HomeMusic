package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vm3 extends cx3 {
    public final jv3 u;
    public final /* synthetic */ ej v;

    public vm3(ej r2, jv3 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.n;
        super(r4);
        this.u = r3;
        ((TextView) r3.p).setSelected(true);
        r4.setOnClickListener(new bj3(10, this));
        r4.setOnLongClickListener(new q6(16, this));
    }
}
