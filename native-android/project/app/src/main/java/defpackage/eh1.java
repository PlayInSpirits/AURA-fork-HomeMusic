package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends cx3 {
    public final ie1 u;
    public final /* synthetic */ ej v;

    public eh1(ej r2, ie1 r3) {
        this.v = r2;
        LinearLayout r4 = r3.a;
        super(r4);
        this.u = r3;
        r4.setOnClickListener(new p6(16, this));
    }
}
