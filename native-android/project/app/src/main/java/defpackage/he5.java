package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he5 extends cx3 {
    public final wo0 u;
    public final /* synthetic */ uc4 v;

    public he5(uc4 r2, wo0 r3) {
        this.v = r2;
        LinearLayout r4 = (LinearLayout) r3.n;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new bj3(17, this));
    }
}
