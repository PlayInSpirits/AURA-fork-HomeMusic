package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u8 extends cx3 {
    public final ss0 u;
    public final /* synthetic */ v8 v;

    public u8(v8 r2, ss0 r3) {
        this.v = r2;
        super((ConstraintLayout) r3.n);
        this.u = r3;
        ((TextView) r3.p).setOnClickListener(new p6(3, this));
    }
}
