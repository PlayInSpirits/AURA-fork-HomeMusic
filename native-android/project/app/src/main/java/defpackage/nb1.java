package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb1 extends za2 {
    public Drawable C;
    public final Rect D;
    public final Rect E;
    public int F;
    public final boolean G;
    public boolean H;

    public nb1(Context r9, AttributeSet r10, int r11) {
        super(r9, r10, r11);
        this.D = new Rect();
        this.E = new Rect();
        this.F = 119;
        this.G = true;
        this.H = false;
        uc5.c(r9, r10, r11, 0);
        int[] r4 = ht3.r;
        uc5.g(r9, r10, r4, r11, 0, new int[0]);
        TypedArray r12 = r9.obtainStyledAttributes(r10, r4, r11, 0);
        this.F = r12.getInt(1, this.F);
        Drawable r13 = r12.getDrawable(0);
        if (r13 == null) goto L5;
        setForeground(r13);
    L5:
        this.G = r12.getBoolean(2, true);
        r12.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas r8) {
        super.draw(r8);
        Drawable r0 = this.C;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.H == false) goto L11;
        this.H = false;
        int r2 = getRight() - getLeft();
        int r3 = getBottom() - getTop();
        boolean r4 = this.G;
        Rect r5 = this.D;
        if (r4 == false) goto L9;
        r5.set(0, 0, r2, r3);
    L10:
        int r1 = this.F;
        int r6 = r0.getIntrinsicWidth();
        int r7 = r0.getIntrinsicHeight();
        Rect r9 = this.E;
        Gravity.apply(r1, r6, r7, r5, r9);
        r0.setBounds(r9);
        goto L11
    L9:
        r5.set(getPaddingLeft(), getPaddingTop(), r2 - getPaddingRight(), r3 - getPaddingBottom());
    L11:
        r0.draw(r8);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float r1, float r2) {
        super.drawableHotspotChanged(r1, r2);
        Drawable r0 = this.C;
        if (r0 == null) goto L6;
        r0.setHotspot(r1, r2);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable r0 = this.C;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isStateful() == false) goto L9;
        this.C.setState(getDrawableState());
        return;
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.C;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r0 = this.C;
        if (r0 == null) goto L6;
        r0.jumpToCurrentState();
        return;
    }

    @Override // defpackage.za2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        this.H = r1 | this.H;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.H = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable r3) {
        Drawable r0 = this.C;
        if (r0 == r3) goto L17;
        if (r0 == null) goto L6;
        r0.setCallback(null);
        unscheduleDrawable(this.C);
    L6:
        this.C = r3;
        this.H = true;
        if (r3 == null) goto L14;
        setWillNotDraw(false);
        r3.setCallback(this);
        if (r3.isStateful() == false) goto L12;
        r3.setState(getDrawableState());
    L12:
        if (this.F != 119) goto L15;
        r3.getPadding(new Rect());
    L15:
        requestLayout();
        invalidate();
        return;
    L14:
        setWillNotDraw(true);
        goto L15
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
        if (this.F != r2) goto L5;
        return;
    L5:
        if ((8388615 & r2) != 0) goto L8;
        r2 = r2 | 8388611;
    L8:
        if ((r2 & 112) != 0) goto L10;
        r2 = r2 | 48;
    L10:
        this.F = r2;
        if (r2 == 119) goto L13;
    L15:
        requestLayout();
        return;
    L13:
        if (this.C == null) goto L15;
        Rect r3 = new Rect();
        this.C.getPadding(r3);
        goto L15
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.C) goto L11;
        return false;
    L11:
        return true;
    }
}
