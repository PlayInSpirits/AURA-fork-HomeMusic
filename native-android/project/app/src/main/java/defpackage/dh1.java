package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 extends cx3 {
    public final rm3 u;
    public final /* synthetic */ zd0 v;

    public dh1(zd0 r2, rm3 r3) {
        this.v = r2;
        LinearLayout r4 = (LinearLayout) r3.n;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new p6(15, this));
    }
}
