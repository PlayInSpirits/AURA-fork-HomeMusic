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

    public y20(g30 g30Var) {
        super(g30Var);
        this.c = 1;
    }

    @Override // defpackage.mw0
    public final void a(Canvas canvas, Rect rect, float f) {
        float fWidth = rect.width() / g();
        float fHeight = rect.height() / g();
        g30 g30Var = (g30) this.a;
        float f2 = (g30Var.g / 2.0f) + g30Var.h;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.c = g30Var.i == 0 ? 1 : -1;
        int i = g30Var.a;
        this.d = i * f;
        this.e = g30Var.b * f;
        this.f = (g30Var.g - i) / 2.0f;
        if ((this.b.d() && g30Var.e == 2) || (this.b.c() && g30Var.f == 1)) {
            this.f = (((1.0f - f) * g30Var.a) / 2.0f) + this.f;
        } else if ((this.b.d() && g30Var.e == 1) || (this.b.c() && g30Var.f == 2)) {
            this.f -= ((1.0f - f) * g30Var.a) / 2.0f;
        }
    }

    @Override // defpackage.mw0
    public final void b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.d);
        float f3 = this.c;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        f(canvas, paint, this.d, this.e, f4);
        f(canvas, paint, this.d, this.e, f4 + f5);
    }

    @Override // defpackage.mw0
    public final void c(Canvas canvas, Paint paint) {
        int iL = g12.l(((g30) this.a).d, this.b.w);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iL);
        paint.setStrokeWidth(this.d);
        float f = this.f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // defpackage.mw0
    public final int d() {
        return g();
    }

    @Override // defpackage.mw0
    public final int e() {
        return g();
    }

    public final void f(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    public final int g() {
        jq jqVar = this.a;
        return (((g30) jqVar).h * 2) + ((g30) jqVar).g;
    }
}
