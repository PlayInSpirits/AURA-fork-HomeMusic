package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.gt3;
import defpackage.jd4;
import defpackage.kd4;
import defpackage.ld4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint n;
    public final ld4 o;
    public final boolean p;

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        jd4 jd4Var;
        setWillNotDraw(false);
        this.o.setCallback(this);
        if (attributeSet == null) {
            b(new jd4(0).d());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gt3.a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                jd4Var = new jd4(1);
                ((kd4) jd4Var.a).p = false;
            } else {
                jd4Var = new jd4(0);
            }
            b(jd4Var.g(obtainStyledAttributes).d());
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(kd4 kd4Var) {
        boolean z;
        ld4 ld4Var = this.o;
        ld4Var.f = kd4Var;
        if (kd4Var != null) {
            ld4Var.b.setXfermode(new PorterDuffXfermode(ld4Var.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        ld4Var.b();
        if (ld4Var.f != null) {
            ValueAnimator valueAnimator = ld4Var.e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                ld4Var.e.cancel();
                ld4Var.e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            kd4 kd4Var2 = ld4Var.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (kd4Var2.t / kd4Var2.s) + 1.0f);
            ld4Var.e = ofFloat;
            ofFloat.setRepeatMode(ld4Var.f.r);
            ld4Var.e.setRepeatCount(ld4Var.f.q);
            ValueAnimator valueAnimator2 = ld4Var.e;
            kd4 kd4Var3 = ld4Var.f;
            valueAnimator2.setDuration(kd4Var3.s + kd4Var3.t);
            ld4Var.e.addUpdateListener(ld4Var.a);
            if (z) {
                ld4Var.e.start();
            }
        }
        ld4Var.invalidateSelf();
        if (kd4Var == null || !kd4Var.n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.n);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.p) {
            this.o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ld4 ld4Var = this.o;
        ValueAnimator valueAnimator = ld4Var.e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        ld4Var.e.cancel();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(context, attributeSet);
    }
}
