/*
 * Decompiled with CFR 0.152.
 */
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
import defpackage.kd4;
import defpackage.qq;
import defpackage.xa3;

public final class ld4
extends Drawable {
    public final qq a = new qq(5, this);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public kd4 f;

    public ld4() {
        Paint paint;
        this.b = paint = new Paint();
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        Object object = this.e;
        if (object != null && !((ValueAnimator)object).isStarted() && (object = this.f) != null && ((kd4)object).o && this.getCallback() != null) {
            this.e.start();
        }
    }

    public final void b() {
        Object object = this.getBounds();
        int n16 = ((Rect)object).width();
        int n17 = ((Rect)object).height();
        if (n16 != 0 && n17 != 0 && (object = this.f) != null) {
            int n18 = ((kd4)object).g;
            if (n18 <= 0) {
                n18 = Math.round(((kd4)object).i * (float)n16);
            }
            object = this.f;
            n16 = ((kd4)object).h;
            if (n16 <= 0) {
                n16 = Math.round(((kd4)object).j * (float)n17);
            }
            object = this.f;
            n17 = ((kd4)object).f;
            int n19 = 1;
            if (n17 != 1) {
                int n26 = ((kd4)object).c;
                n17 = n19;
                if (n26 != 1) {
                    n17 = n26 == 3 ? n19 : 0;
                }
                if (n17 != 0) {
                    n18 = 0;
                }
                if (n17 == 0) {
                    n16 = 0;
                }
                float f16 = n18;
                float f17 = n16;
                object = this.f;
                object = new LinearGradient(0.0f, 0.0f, f16, f17, ((kd4)object).b, ((kd4)object).a, Shader.TileMode.CLAMP);
            } else {
                float f18 = (float)n18 / 2.0f;
                float f19 = (float)n16 / 2.0f;
                float f26 = (float)((double)Math.max(n18, n16) / Math.sqrt(2.0));
                object = this.f;
                object = new RadialGradient(f18, f19, f26, ((kd4)object).b, ((kd4)object).a, Shader.TileMode.CLAMP);
            }
            this.b.setShader((Shader)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void draw(Canvas canvas) {
        Object object;
        float f16;
        Rect rect;
        float f17;
        Paint paint;
        block5: {
            float f18;
            float f19;
            block1: {
                block4: {
                    block2: {
                        block3: {
                            if (this.f == null) return;
                            paint = this.b;
                            if (paint.getShader() == null) {
                                return;
                            }
                            f17 = (float)Math.tan(Math.toRadians(this.f.m));
                            rect = this.c;
                            f16 = rect.height();
                            f19 = (float)rect.width() * f17 + f16;
                            f16 = rect.width();
                            f18 = f17 * (float)rect.height() + f16;
                            object = this.e;
                            f16 = 0.0f;
                            f17 = object != null ? ((ValueAnimator)object).getAnimatedFraction() : 0.0f;
                            int n16 = this.f.c;
                            if (n16 == 1) break block1;
                            if (n16 == 2) break block2;
                            if (n16 == 3) break block3;
                            f16 = -f18;
                            f17 = xa3.a(f18, f16, f17, f16);
                            break block4;
                        }
                        f17 = xa3.a(-f19, f19, f17, f19);
                        break block5;
                    }
                    f17 = xa3.a(-f18, f18, f17, f18);
                }
                f16 = f17;
                f17 = 0.0f;
                break block5;
            }
            f18 = -f19;
            f17 = xa3.a(f19, f18, f17, f18);
        }
        object = this.d;
        ((Matrix)object).reset();
        ((Matrix)object).setRotate(this.f.m, (float)rect.width() / 2.0f, (float)rect.height() / 2.0f);
        ((Matrix)object).postTranslate(f16, f17);
        paint.getShader().setLocalMatrix((Matrix)object);
        canvas.drawRect(rect, paint);
    }

    @Override
    public final int getOpacity() {
        kd4 kd42 = this.f;
        if (kd42 != null && (kd42.n || kd42.p)) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int n16 = rect.width();
        int n17 = rect.height();
        this.c.set(0, 0, n16, n17);
        this.b();
        this.a();
    }

    @Override
    public final void setAlpha(int n16) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

