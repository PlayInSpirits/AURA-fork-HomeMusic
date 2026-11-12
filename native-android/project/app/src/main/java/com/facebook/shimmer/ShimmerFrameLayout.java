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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public final Paint n;
    public final ld4 o;
    public final boolean p;

    public ShimmerFrameLayout(Context r2) {
        super(r2);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(r2, null);
    }

    public final void a(Context r3, AttributeSet r4) {
        setWillNotDraw(false);
        this.o.setCallback(this);
        if (r4 != null) goto L6;
        b(new jd4(0).d());
        return;
    L6:
        TypedArray r5 = r3.obtainStyledAttributes(r4, gt3.a, 0, 0);
    L12:
        th = move-exception;
        r5.recycle();
        throw th;
    L8:
        if (r5.hasValue(4) == true) goto L10;
    L14:
        jd4 r6 = new jd4(0);     // Catch: Throwable -> L12
    L15:
        b(r6.g(r5).d());     // Catch: Throwable -> L12
        r5.recycle();
        return;
    L10:
        if (r5.getBoolean(4, false) == false) goto L14;
        r6 = new jd4(1);     // Catch: Throwable -> L12
        ((kd4) r6.a).p = false;     // Catch: Throwable -> L12
        goto L15
    }

    public final void b(kd4 r11) {
        ld4 r0 = this.o;
        r0.f = r11;
        if (r11 == null) goto L9;
        Paint r1 = r0.b;
        if (r0.f.p == false) goto L7;
        PorterDuff.Mode r3 = PorterDuff.Mode.DST_IN;
    L8:
        r1.setXfermode(new PorterDuffXfermode(r3));
        goto L9
    L7:
        r3 = PorterDuff.Mode.SRC_IN;
    L9:
        r0.b();
        if (r0.f == null) goto L19;
        ValueAnimator r2 = r0.e;
        if (r2 == null) goto L15;
        boolean r4 = r2.isStarted();
        r0.e.cancel();
        r0.e.removeAllUpdateListeners();
    L16:
        kd4 r5 = r0.f;
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{0.0f, (r5.t / r5.s) + 1.0f});
        r0.e = r6;
        r6.setRepeatMode(r0.f.r);
        r0.e.setRepeatCount(r0.f.q);
        ValueAnimator r7 = r0.e;
        kd4 r8 = r0.f;
        r7.setDuration(r8.s + r8.t);
        r0.e.addUpdateListener(r0.a);
        if (r4 == false) goto L19;
        r0.e.start();
        goto L19
    L15:
        r4 = false;
    L19:
        r0.invalidateSelf();
        if (r11 != null) goto L22;
    L25:
        setLayerType(0, null);
        return;
    L22:
        if (r11.n == false) goto L25;
        setLayerType(2, this.n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r2) {
        super.dispatchDraw(r2);
        if (this.p == false) goto L6;
        this.o.draw(r2);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ld4 r1 = this.o;
        ValueAnimator r0 = r1.e;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isStarted() == false) goto L9;
        r1.e.cancel();
        return;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        int r6 = getWidth();
        int r7 = getHeight();
        this.o.setBounds(0, 0, r6, r7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.o) goto L11;
        return false;
    L11:
        return true;
    }

    public ShimmerFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(r2, r3);
    }

    public ShimmerFrameLayout(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(r1, r2);
    }

    public ShimmerFrameLayout(Context r1, AttributeSet r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.n = new Paint();
        this.o = new ld4();
        this.p = true;
        a(r1, r2);
    }
}
