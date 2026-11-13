/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.g12;
import defpackage.g30;
import defpackage.jq;
import defpackage.mw0;

public final class y20
extends mw0 {
    public int c = 1;
    public float d;
    public float e;
    public float f;

    public y20(g30 g302) {
        super(g302);
    }

    @Override
    public final void a(Canvas canvas, Rect rect, float f16) {
        float f17 = (float)rect.width() / (float)this.g();
        float f18 = (float)rect.height() / (float)this.g();
        g30 g302 = (g30)this.a;
        float f19 = (float)g302.g / 2.0f + (float)g302.h;
        canvas.translate(f19 * f17 + (float)rect.left, f19 * f18 + (float)rect.top);
        canvas.scale(f17, f18);
        canvas.rotate(-90.0f);
        f17 = -f19;
        canvas.clipRect(f17, f17, f19, f19);
        int n16 = g302.i == 0 ? 1 : -1;
        this.c = n16;
        n16 = g302.a;
        this.d = (float)n16 * f16;
        this.e = (float)g302.b * f16;
        this.f = (float)(g302.g - n16) / 2.0f;
        if (this.b.d() && g302.e == 2 || this.b.c() && g302.f == 1) {
            f19 = this.f;
            this.f = (1.0f - f16) * (float)g302.a / 2.0f + f19;
            return;
        }
        if (this.b.d() && g302.e == 1 || this.b.c() && g302.f == 2) {
            this.f -= (1.0f - f16) * (float)g302.a / 2.0f;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(Canvas canvas, Paint paint, float f16, float f17, int n16) {
        if (f16 == f17) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(n16);
        paint.setStrokeWidth(this.d);
        float f18 = this.c;
        float f19 = f16 * 360.0f * f18;
        f16 = f17 >= f16 ? f17 - f16 : 1.0f + f17 - f16;
        f18 = f16 * 360.0f * f18;
        f16 = this.f;
        f17 = -f16;
        canvas.drawArc(new RectF(f17, f17, f16, f16), f19, f18, false, paint);
        if (!(this.e > 0.0f)) return;
        if (!(Math.abs(f18) < 360.0f)) return;
        paint.setStyle(Paint.Style.FILL);
        this.f(canvas, paint, this.d, this.e, f19);
        this.f(canvas, paint, this.d, this.e, f19 + f18);
    }

    @Override
    public final void c(Canvas canvas, Paint paint) {
        int n16 = g12.l(((g30)this.a).d, this.b.w);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(n16);
        paint.setStrokeWidth(this.d);
        float f16 = this.f;
        float f17 = -f16;
        canvas.drawArc(new RectF(f17, f17, f16, f16), 0.0f, 360.0f, false, paint);
    }

    @Override
    public final int d() {
        return this.g();
    }

    @Override
    public final int e() {
        return this.g();
    }

    public final void f(Canvas canvas, Paint paint, float f16, float f17, float f18) {
        canvas.save();
        canvas.rotate(f18);
        f18 = this.f;
        canvas.drawRoundRect(new RectF(f18 - (f16 /= 2.0f), f17, f18 + f16, -f17), f17, f17, paint);
        canvas.restore();
    }

    public final int g() {
        jq jq5 = this.a;
        int n16 = ((g30)jq5).g;
        return ((g30)jq5).h * 2 + n16;
    }
}

