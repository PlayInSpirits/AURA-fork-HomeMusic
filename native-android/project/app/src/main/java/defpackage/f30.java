package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends Drawable implements Animatable {
    public static final LinearInterpolator t = new LinearInterpolator();
    public static final a61 u = new a61(1);
    public static final int[] v = {-16777216};
    public final e30 n;
    public float o;
    public final Resources p;
    public final ValueAnimator q;
    public float r;
    public boolean s;

    public f30(Context context) {
        context.getClass();
        this.p = context.getResources();
        e30 e30Var = new e30();
        this.n = e30Var;
        e30Var.i = v;
        e30Var.a(0);
        e30Var.h = 2.5f;
        e30Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new c30(this, e30Var));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(t);
        valueAnimatorOfFloat.addListener(new d30(this, e30Var));
        this.q = valueAnimatorOfFloat;
    }

    public static void d(float f, e30 e30Var) {
        if (f <= 0.75f) {
            e30Var.u = e30Var.i[e30Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = e30Var.i;
        int i = e30Var.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        e30Var.u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    public final void a(float f, e30 e30Var, boolean z) {
        float interpolation;
        if (this.s) {
            d(f, e30Var);
            float fFloor = (float) (Math.floor(e30Var.m / 0.8f) + 1.0d);
            float f2 = e30Var.k;
            float f3 = e30Var.l;
            e30Var.e = (((f3 - 0.01f) - f2) * f) + f2;
            e30Var.f = f3;
            float f4 = e30Var.m;
            e30Var.g = xa3.a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = e30Var.m;
            float interpolation2 = e30Var.k;
            a61 a61Var = u;
            if (f < 0.5f) {
                interpolation = (a61Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - a61Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.r) * 216.0f;
            e30Var.e = interpolation2;
            e30Var.f = interpolation;
            e30Var.g = f7;
            this.o = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.p.getDisplayMetrics().density;
        float f6 = f2 * f5;
        e30 e30Var = this.n;
        e30Var.h = f6;
        e30Var.b.setStrokeWidth(f6);
        e30Var.q = f * f5;
        e30Var.a(0);
        e30Var.r = (int) (f3 * f5);
        e30Var.s = (int) (f4 * f5);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.o, bounds.exactCenterX(), bounds.exactCenterY());
        e30 e30Var = this.n;
        Paint paint = e30Var.b;
        RectF rectF = e30Var.a;
        float f = e30Var.q;
        float fMin = (e30Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((e30Var.r * e30Var.p) / 2.0f, e30Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = e30Var.e;
        float f3 = e30Var.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((e30Var.f + f3) * 360.0f) - f4;
        paint.setColor(e30Var.u);
        paint.setAlpha(e30Var.t);
        float f6 = e30Var.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, e30Var.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = e30Var.c;
        if (e30Var.n) {
            Path path = e30Var.o;
            if (path == null) {
                Path path2 = new Path();
                e30Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (e30Var.r * e30Var.p) / 2.0f;
            e30Var.o.moveTo(0.0f, 0.0f);
            e30Var.o.lineTo(e30Var.r * e30Var.p, 0.0f);
            Path path3 = e30Var.o;
            float f9 = e30Var.r;
            float f10 = e30Var.p;
            path3.lineTo((f9 * f10) / 2.0f, e30Var.s * f10);
            e30Var.o.offset((rectF.centerX() + fMin2) - f8, (e30Var.h / 2.0f) + rectF.centerY());
            e30Var.o.close();
            paint2.setColor(e30Var.u);
            paint2.setAlpha(e30Var.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(e30Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.q.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.q;
        valueAnimator.cancel();
        e30 e30Var = this.n;
        float f = e30Var.e;
        e30Var.k = f;
        float f2 = e30Var.f;
        e30Var.l = f2;
        e30Var.m = e30Var.g;
        if (f2 != f) {
            this.s = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        e30Var.a(0);
        e30Var.k = 0.0f;
        e30Var.l = 0.0f;
        e30Var.m = 0.0f;
        e30Var.e = 0.0f;
        e30Var.f = 0.0f;
        e30Var.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.q.cancel();
        this.o = 0.0f;
        e30 e30Var = this.n;
        if (e30Var.n) {
            e30Var.n = false;
        }
        e30Var.a(0);
        e30Var.k = 0.0f;
        e30Var.l = 0.0f;
        e30Var.m = 0.0f;
        e30Var.e = 0.0f;
        e30Var.f = 0.0f;
        e30Var.g = 0.0f;
        invalidateSelf();
    }
}
