package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ol3 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ zd0 v;

    public ol3(zd0 r3, lv4 r4) {
        this.v = r3;
        super((ConstraintLayout) r4.n);
        this.u = r4;
        ((TextView) r4.t).setSelected(true);
        ((ImageView) r4.s).setOnClickListener(new bj3(6, this));
        ((ImageView) r4.r).setOnTouchListener(new s7(7, this));
    }
}
