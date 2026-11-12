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

    public t70(ro0 r1, long r2, if1 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas r10) {
        mz r0 = new mz();
        Canvas r1 = ba.a;
        aa r2 = new aa();
        r2.a = r10;
        lz r11 = r0.n;
        oo0 r3 = r11.a;
        r62 r4 = r11.b;
        jz r5 = r11.c;
        long r6 = r11.d;
        r11.a = this.a;
        r11.b = r62.n;
        r11.c = r2;
        r11.d = this.b;
        r2.e();
        this.c.invoke(r0);
        r2.k();
        r11.a = r3;
        r11.b = r4;
        r11.c = r5;
        r11.d = r6;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point r6, Point r7) {
        long r1 = this.b;
        float r0 = Float.intBitsToFloat((int) (r1 >> 32));
        ro0 r5 = this.a;
        r6.set(r5.V(r0 / r5.g()), r5.V(Float.intBitsToFloat((int) (r1 & 4294967295L)) / r5.g()));
        r7.set(r6.x / 2, r6.y / 2);
    }
}
