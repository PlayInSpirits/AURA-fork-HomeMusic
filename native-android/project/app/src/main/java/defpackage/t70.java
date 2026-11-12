package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t70 extends View.DragShadowBuilder {
    public final ro0 a;
    public final long b;
    public final if1 c;

    public t70(ro0 ro0Var, long j, if1 if1Var) {
        this.a = ro0Var;
        this.b = j;
        this.c = if1Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        mz mzVar = new mz();
        Canvas canvas2 = ba.a;
        aa aaVar = new aa();
        aaVar.a = canvas;
        lz lzVar = mzVar.n;
        oo0 oo0Var = lzVar.a;
        r62 r62Var = lzVar.b;
        jz jzVar = lzVar.c;
        long j = lzVar.d;
        lzVar.a = this.a;
        lzVar.b = r62.n;
        lzVar.c = aaVar;
        lzVar.d = this.b;
        aaVar.e();
        this.c.invoke(mzVar);
        aaVar.k();
        lzVar.a = oo0Var;
        lzVar.b = r62Var;
        lzVar.c = jzVar;
        lzVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        ro0 ro0Var = this.a;
        point.set(ro0Var.V(fIntBitsToFloat / ro0Var.g()), ro0Var.V(Float.intBitsToFloat((int) (j & 4294967295L)) / ro0Var.g()));
        point2.set(point.x / 2, point.y / 2);
    }
}
