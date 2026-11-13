package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public Path n;
    public float o;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public final void a(float f, float f2, float f3, float f4, float f5) {
        RectF rectF = new RectF(f, f2, f3, f4);
        if (this.n == null) {
            this.n = new Path();
        }
        this.o = f5;
        this.n.reset();
        this.n.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        this.n.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.n == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.n);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.o;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
