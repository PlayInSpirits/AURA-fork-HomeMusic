package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y20 extends mw0 {
    public int c;
    public float d;
    public float e;
    public float f;

    public y20(g30 r1) {
        super(r1);
        this.c = 1;
    }

    @Override // defpackage.mw0
    public final void a(Canvas r9, Rect r10, float r11) {
        float r0 = r10.width() / g();
        float r1 = r10.height() / g();
        g30 r2 = (g30) this.a;
        float r3 = (r2.g / 2.0f) + r2.h;
        r9.translate((r3 * r0) + r10.left, (r3 * r1) + r10.top);
        r9.scale(r0, r1);
        r9.rotate(-90.0f);
        float r12 = -r3;
        r9.clipRect(r12, r12, r3, r3);
        if (r2.i != 0) goto L5;
        int r13 = 1;
    L6:
        this.c = r13;
        int r14 = r2.a;
        this.d = r14 * r11;
        this.e = r2.b * r11;
        this.f = (r2.g - r14) / 2.0f;
        if (this.b.d() == false) goto L11;
        if (r2.e != 2) goto L11;
    L14:
        this.f = (((1.0f - r11) * r2.a) / 2.0f) + this.f;
        return;
    L11:
        if (this.b.c() == false) goto L17;
        if (r2.f == 1) goto L14;
    L17:
        if (this.b.d() == false) goto L21;
        if (r2.e != 1) goto L21;
    L24:
        this.f -= ((1.0f - r11) * r2.a) / 2.0f;
        return;
    L21:
        if (this.b.c() == true) goto L23;
        return;
    L23:
        if (r2.f == 2) goto L24;
        return;
    L5:
        r13 = -1;
        goto L6
    }

    @Override // defpackage.mw0
    public final void b(Canvas r9, Paint r10, float r11, float r12, int r13) {
        if (r11 == r12) goto L18;
        r10.setStyle(Paint.Style.STROKE);
        r10.setStrokeCap(Paint.Cap.BUTT);
        r10.setAntiAlias(true);
        r10.setColor(r13);
        r10.setStrokeWidth(this.d);
        float r3 = this.c;
        float r5 = (r11 * 360.0f) * r3;
        if (r12 < r11) goto L9;
        float r1 = r12 - r11;
    L8:
        float r2 = (r1 * 360.0f) * r3;
        float r4 = this.f;
        float r6 = -r4;
        r9.drawArc(new RectF(r6, r6, r4, r4), r5, r2, false, r10);
        if (this.e > 0.0f) goto L13;
        return;
    L13:
        if (Math.abs(r2) >= 360.0f) goto L17;
        r10.setStyle(Paint.Style.FILL);
        f(r9, r10, this.d, this.e, r5);
        f(r9, r10, this.d, this.e, r5 + r2);
        return;
    L17:
        return;
    L9:
        r1 = (1.0f + r12) - r11;
        goto L8
    }

    @Override // defpackage.mw0
    public final void c(Canvas r8, Paint r9) {
        int r0 = g12.l(((g30) this.a).d, this.b.w);
        r9.setStyle(Paint.Style.STROKE);
        r9.setStrokeCap(Paint.Cap.BUTT);
        r9.setAntiAlias(true);
        r9.setColor(r0);
        r9.setStrokeWidth(this.d);
        float r7 = this.f;
        float r1 = -r7;
        r8.drawArc(new RectF(r1, r1, r7, r7), 0.0f, 360.0f, false, r9);
    }

    @Override // defpackage.mw0
    public final int d() {
        return g();
    }

    @Override // defpackage.mw0
    public final int e() {
        return g();
    }

    public final void f(Canvas r2, Paint r3, float r4, float r5, float r6) {
        r2.save();
        r2.rotate(r6);
        float r1 = this.f;
        float r7 = r4 / 2.0f;
        r2.drawRoundRect(new RectF(r1 - r7, r5, r1 + r7, -r5), r5, r5, r3);
        r2.restore();
    }

    public final int g() {
        jq r1 = this.a;
        int r0 = ((g30) r1).g;
        return (((g30) r1).h * 2) + r0;
    }
}
