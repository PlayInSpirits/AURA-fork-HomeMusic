package defpackage;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 extends ya4 {
    public final nc f;

    public mb3(nc ncVar) {
        this.f = ncVar;
    }

    @Override // defpackage.ya4
    public final wv3 s() {
        nc ncVar = this.f;
        if (ncVar.b == null) {
            ncVar.b = new RectF();
        }
        RectF rectF = ncVar.b;
        rectF.getClass();
        ncVar.a.computeBounds(rectF, true);
        return new wv3(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
