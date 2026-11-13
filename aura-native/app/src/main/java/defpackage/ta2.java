package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ta2 extends mw0 {
    public float c;
    public float d;
    public float e;
    public Path f;

    public ta2(cb2 cb2Var) {
        super(cb2Var);
        this.c = 300.0f;
    }

    @Override // defpackage.mw0
    public final void a(Canvas canvas, Rect rect, float f) {
        this.c = rect.width();
        cb2 cb2Var = (cb2) this.a;
        float f2 = cb2Var.a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - cb2Var.a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (cb2Var.i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.d() && cb2Var.e == 1) || (this.b.c() && cb2Var.f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.d() || this.b.c()) {
            canvas.translate(0.0f, ((f - 1.0f) * cb2Var.a) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.d = cb2Var.a * f;
        this.e = cb2Var.b * f;
    }

    @Override // defpackage.mw0
    public final void b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.c;
        float f4 = (-f3) / 2.0f;
        float f5 = ((f * f3) + f4) - (this.e * 2.0f);
        float f6 = (f2 * f3) + f4;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f);
        float f7 = this.d;
        RectF rectF = new RectF(f5, (-f7) / 2.0f, f6, f7 / 2.0f);
        float f8 = this.e;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        canvas.restore();
    }

    @Override // defpackage.mw0
    public final void c(Canvas canvas, Paint paint) {
        int l = g12.l(((cb2) this.a).d, this.b.w);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(l);
        Path path = new Path();
        this.f = path;
        float f = this.c;
        float f2 = this.d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.e;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f, paint);
    }

    @Override // defpackage.mw0
    public final int d() {
        return ((cb2) this.a).a;
    }

    @Override // defpackage.mw0
    public final int e() {
        return -1;
    }
}
