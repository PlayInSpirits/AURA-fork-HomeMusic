package defpackage;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 extends ya4 {
    public final nc f;

    public mb3(nc r1) {
        this.f = r1;
    }

    @Override // defpackage.ya4
    public final wv3 s() {
        nc r4 = this.f;
        if (r4.b != null) goto L5;
        r4.b = new RectF();
    L5:
        RectF r0 = r4.b;
        r0.getClass();
        r4.a.computeBounds(r0, true);
        return new wv3(r0.left, r0.top, r0.right, r0.bottom);
    }
}
