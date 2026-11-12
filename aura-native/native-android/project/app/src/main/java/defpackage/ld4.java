package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld4 extends Drawable {
    public final qq a = new qq(5, this);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public kd4 f;

    public ld4() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        kd4 kd4Var;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (kd4Var = this.f) == null || !kd4Var.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        kd4 kd4Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (kd4Var = this.f) == null) {
            return;
        }
        int iRound = kd4Var.g;
        if (iRound <= 0) {
            iRound = Math.round(kd4Var.i * iWidth);
        }
        kd4 kd4Var2 = this.f;
        int iRound2 = kd4Var2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(kd4Var2.j * iHeight);
        }
        kd4 kd4Var3 = this.f;
        boolean z = true;
        if (kd4Var3.f != 1) {
            int i = kd4Var3.c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            kd4 kd4Var4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, kd4Var4.b, kd4Var4.a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            kd4 kd4Var5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, kd4Var5.b, kd4Var5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fA;
        float fA2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    fA2 = xa3.a(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fA2 = xa3.a(fHeight, f2, animatedFraction, f2);
                } else {
                    fA = xa3.a(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fA2;
                fA = 0.0f;
            } else {
                float f3 = -fWidth;
                fA = xa3.a(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fA);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        kd4 kd4Var = this.f;
        if (kd4Var != null) {
            return (kd4Var.n || kd4Var.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
