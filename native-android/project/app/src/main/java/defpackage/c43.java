package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c43 extends z2 {
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ d43 s;

    public c43(d43 r1, int r2, boolean r3) {
        this.s = r1;
        this.q = r2;
        this.r = r3;
    }

    @Override // defpackage.z2
    public final void d(View r10, v3 r11) {
        this.n.onInitializeAccessibilityNodeInfo(r10, r11.a);
        l43 r0 = this.s.t;
        int r1 = this.q;
        int r2 = 0;
        int r3 = r1;
    L3:
        if (r2 >= r1) goto L10;
        if (r0.r.c(r2) != 2) goto L7;
    L8:
        r3 = r3 - 1;
    L9:
        r2 = r2 + 1;
        goto L3
    L7:
        if (r0.r.c(r2) != 3) goto L9;
    L10:
        r11.k(u3.a(r3, 1, 1, 1, this.r, r10.isSelected()));
    }
}
