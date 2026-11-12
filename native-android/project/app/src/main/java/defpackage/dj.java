package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dj extends cx3 {
    public final r20 u;
    public final /* synthetic */ ej v;

    public dj(ej r2, r20 r3) {
        this.v = r2;
        ConstraintLayout r4 = (ConstraintLayout) r3.o;
        super(r4);
        this.u = r3;
        ((TextView) r3.q).setSelected(true);
        r4.setOnClickListener(new p6(6, this));
        r4.setOnLongClickListener(new q6(6, this));
    }
}
