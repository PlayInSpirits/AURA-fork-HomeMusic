package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class er extends FrameLayout {
    public static final dr y = null;
    public fr n;
    public final bc4 o;
    public int p;
    public final float q;
    public final float r;
    public final int s;
    public final int t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public Rect w;
    public boolean x;

    static {
        y = new dr(0);
    }

    public er(Context r5, AttributeSet r6) {
        super(su3.H(r5, r6, 0, 0), r6);
        Context r7 = getContext();
        TypedArray r1 = r7.obtainStyledAttributes(r6, ht3.T);
        if (r1.hasValue(6) == false) goto L5;
        float r2 = r1.getDimensionPixelSize(6, 0);
        WeakHashMap r3 = j65.a;
        setElevation(r2);
    L5:
        this.p = r1.getInt(2, 0);
        if (r1.hasValue(8) == false) goto L8;
    L9:
        this.o = bc4.c(r7, r6, 0, 0).a();
    L10:
        this.q = r1.getFloat(3, 1.0f);
        setBackgroundTintList(h12.s(r7, r1, 4));
        setBackgroundTintMode(vr1.B(r1.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.r = r1.getFloat(1, 1.0f);
        this.s = r1.getDimensionPixelSize(0, -1);
        this.t = r1.getDimensionPixelSize(7, -1);
        r1.recycle();
        setOnTouchListener(y);
        setFocusable(true);
        if (getBackground() != null) goto L21;
        int r8 = g12.H(g12.t(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), g12.t(this, R.attr.colorOnSurface));
        bc4 r9 = this.o;
        if (r9 == null) goto L15;
        a61 r0 = fr.w;
        fi2 r4 = new fi2(r9);
        r4.m(ColorStateList.valueOf(r8));
        Drawable r10 = r4;
    L16:
        ColorStateList r11 = this.u;
        if (r11 == null) goto L19;
        r10.setTintList(r11);
    L19:
        WeakHashMap r12 = j65.a;
        setBackground(r10);
        return;
    L15:
        Resources r13 = getResources();
        a61 r14 = fr.w;
        float r15 = r13.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable r16 = new GradientDrawable();
        r16.setShape(0);
        r16.setCornerRadius(r15);
        r16.setColor(r8);
        r10 = r16;
        goto L16
    L21:
        return;
    L8:
        if (r1.hasValue(9) == false) goto L10;
        goto L9
    }

    public static /* synthetic */ void a(er r0, fr r1) {
        r0.setBaseTransientBottomBar(r1);
    }

    private void setBaseTransientBottomBar(fr r1) {
        this.n = r1;
    }

    public float getActionTextColorAlpha() {
        return this.r;
    }

    public int getAnimationMode() {
        return this.p;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.q;
    }

    public int getMaxInlineActionWidth() {
        return this.t;
    }

    public int getMaxWidth() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fr r0 = this.n;
        if (r0 != null) goto L5;
    L9:
        WeakHashMap r1 = j65.a;
        requestApplyInsets();
        return;
    L5:
        if (Build.VERSION.SDK_INT < 29) goto L9;
        WindowInsets r2 = r0.i.getRootWindowInsets();
        if (r2 == null) goto L9;
        r0.r = yj1.v(z9.f(r2));
        r0.g();
        goto L9
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fr r5 = this.n;
        if (r5 == null) goto L23;
        na4 r0 = na4.z();
        br r1 = r5.v;
        Object r2 = r0.n;
        monitor-enter(r2);
        int r4 = 1;
        if (r0.G(r1) == true) goto L15;
        rg4 r3 = (rg4) r0.q;     // Catch: Throwable -> L20
        boolean r6 = false;
        if (r3 != null) goto L11;
    L13:
        boolean r7 = false;
    L14:
        if (r7 == true) goto L15;
    L16:
        monitor-exit(r2);     // Catch: Throwable -> L20
        if (r6 == false) goto L26;
        fr.z.post(new zq(r5, r4));
        return;
    L26:
        return;
    L11:
        if (r3.a.get() != r1) goto L13;
        r7 = true;
    L15:
        r6 = true;
    L20:
        th = move-exception;
        throw th;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        fr r0 = this.n;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.t == false) goto L9;
        r0.f();
        r0.t = false;
        return;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r4 = this.s;
        if (r4 > 0) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= r4) goto L9;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r4, 1073741824), r3);
        return;
    }

    public void setAnimationMode(int r1) {
        this.p = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        super.setBackgroundDrawable(r2);
        return;
    L4:
        if (this.u == null) goto L6;
        r2 = r2.mutate();
        r2.setTintList(this.u);
        r2.setTintMode(this.v);
        goto L6
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        this.u = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintList(r2);
        r0.setTintMode(this.v);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        this.v = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintMode(r2);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams r5) {
        super.setLayoutParams(r5);
        if (this.x == false) goto L5;
        return;
    L5:
        if ((r5 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        ViewGroup.MarginLayoutParams r6 = (ViewGroup.MarginLayoutParams) r5;
        this.w = new Rect(r6.leftMargin, r6.topMargin, r6.rightMargin, r6.bottomMargin);
        fr r4 = this.n;
        if (r4 == null) goto L12;
        a61 r7 = fr.w;
        r4.g();
        return;
    L12:
        return;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener r2) {
        if (r2 == null) goto L4;
        dr r0 = null;
    L5:
        setOnTouchListener(r0);
        super.setOnClickListener(r2);
        return;
    L4:
        r0 = y;
        goto L5
    }
}
