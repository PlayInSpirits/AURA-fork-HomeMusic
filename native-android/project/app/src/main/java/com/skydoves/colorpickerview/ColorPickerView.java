package com.skydoves.colorpickerview;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import app.homemusic.R;
import defpackage.a0;
import defpackage.a50;
import defpackage.aa2;
import defpackage.b50;
import defpackage.ba2;
import defpackage.c5;
import defpackage.e50;
import defpackage.f93;
import defpackage.g50;
import defpackage.h50;
import defpackage.hg3;
import defpackage.it3;
import defpackage.jx3;
import defpackage.kb4;
import defpackage.o9;
import defpackage.q92;
import defpackage.sg;
import defpackage.x71;
import defpackage.yu;
import defpackage.zz1;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ColorPickerView extends FrameLayout implements aa2 {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public int B;
    public boolean C;
    public String D;
    public boolean E;
    public boolean F;
    public final hg3 G;
    public int n;
    public int o;
    public Point p;
    public ImageView q;
    public ImageView r;
    public Drawable s;
    public Drawable t;
    public h50 u;
    public long v;
    public final Handler w;
    public c5 x;
    public float y;
    public float z;

    public ColorPickerView(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.v = 0;
        this.w = new Handler();
        this.x = c5.n;
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = true;
        this.B = 0;
        this.C = false;
        this.E = true;
        this.F = true;
        this.G = hg3.C(getContext());
        c(r4);
        g();
    }

    public final void a(int r6) {
        this.o = r6;
        getAlphaSlideBar();
        getBrightnessSlider();
        h50 r7 = this.u;
        if (r7 == null) goto L8;
        if ((r7 instanceof e50) == false) goto L8;
        int r8 = this.o;
        int r0 = Color.alpha(r8);
        int r1 = Color.red(r8);
        int r2 = Color.green(r8);
        int r3 = Color.blue(r8);
        String r4 = String.format(Locale.getDefault(), "%02X%02X%02X%02X", new Object[]{Integer.valueOf(r0), Integer.valueOf(r1), Integer.valueOf(r2), Integer.valueOf(r3)});
        Color.alpha(r8);
        Color.red(r8);
        Color.green(r8);
        Color.blue(r8);
        jx3 r9 = ((e50) this.u).a;
        r9.n = "HEX:#".concat(r4);
    L8:
        if (this.C == false) goto L13;
        this.C = false;
        ImageView r10 = this.r;
        if (r10 == null) goto L14;
        r10.setAlpha(this.y);
        return;
    L14:
        return;
    }

    public final void c(AttributeSet r5) {
        TypedArray r6 = getContext().obtainStyledAttributes(r5, it3.a);
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    L4:
        if (r6.hasValue(5) == false) goto L9;
        this.s = r6.getDrawable(5);     // Catch: Throwable -> L6
    L9:
        if (r6.hasValue(8) == false) goto L14;
        int r0 = r6.getResourceId(8, -1);     // Catch: Throwable -> L6
        if (r0 == (-1)) goto L14;
        this.t = zz1.r(getContext(), r0);     // Catch: Throwable -> L6
    L14:
        if (r6.hasValue(10) == false) goto L17;
        this.y = r6.getFloat(10, this.y);     // Catch: Throwable -> L6
    L17:
        if (r6.hasValue(11) == false) goto L20;
        this.B = r6.getDimensionPixelSize(11, this.B);     // Catch: Throwable -> L6
    L20:
        if (r6.hasValue(2) == false) goto L23;
        this.z = r6.getFloat(2, this.z);     // Catch: Throwable -> L6
    L23:
        if (r6.hasValue(3) == false) goto L26;
        this.A = r6.getBoolean(3, this.A);     // Catch: Throwable -> L6
    L26:
        if (r6.hasValue(0) == false) goto L33;
        int r1 = r6.getInteger(0, 0);     // Catch: Throwable -> L6
        if (r1 != 0) goto L30;
        this.x = c5.n;     // Catch: Throwable -> L6
        goto L33
    L30:
        if (r1 != 1) goto L33;
        this.x = c5.o;     // Catch: Throwable -> L6
    L33:
        if (r6.hasValue(1) == false) goto L36;
        this.v = r6.getInteger(1, (int) this.v);     // Catch: Throwable -> L6
    L36:
        if (r6.hasValue(6) == false) goto L39;
        this.D = r6.getString(6);     // Catch: Throwable -> L6
    L39:
        if (r6.hasValue(4) == false) goto L42;
        setInitialColor(r6.getColor(4, -1));     // Catch: Throwable -> L6
    L42:
        if (r6.hasValue(9) == false) goto L45;
        this.E = r6.getBoolean(9, this.E);     // Catch: Throwable -> L6
    L45:
        if (r6.hasValue(7) == false) goto L47;
        this.F = r6.getBoolean(7, this.F);     // Catch: Throwable -> L6
    L47:
        r6.recycle();
    }

    public final int d(float r11, float r12) {
        Matrix r0 = new Matrix();
        this.q.getImageMatrix().invert(r0);
        float[] r2 = {r11, r12};
        r0.mapPoints(r2);
        if (this.q.getDrawable() != null) goto L5;
    L20:
        return 0;
    L5:
        if ((this.q.getDrawable() instanceof BitmapDrawable) == false) goto L20;
        float r1 = r2[0];
        if (r1 < 0.0f) goto L20;
        if (r2[1] < 0.0f) goto L20;
        if (r1 >= this.q.getDrawable().getIntrinsicWidth()) goto L20;
        if (r2[1] >= this.q.getDrawable().getIntrinsicHeight()) goto L20;
        invalidate();
        if ((this.q.getDrawable() instanceof b50) == false) goto L18;
        float r13 = r11 - (getWidth() * 0.5f);
        float r14 = r12 - (getHeight() * 0.5f);
        double r6 = Math.sqrt((r14 * r14) + (r13 * r13));
        float r10 = Math.min(getWidth(), getHeight()) * 0.5f;
        float[] r3 = {0.0f, 0.0f, 1.0f};
        r3[0] = ((float) ((Math.atan2(r14, -r13) / 3.141592653589793d) * 180.0d)) + 180.0f;
        r3[1] = Math.max(0.0f, Math.min(1.0f, (float) (r6 / ((double) r10))));
        return Color.HSVToColor(r3);
    L18:
        Rect r15 = this.q.getDrawable().getBounds();
        return ((BitmapDrawable) this.q.getDrawable()).getBitmap().getPixel((int) ((r2[0] / r15.width()) * ((BitmapDrawable) this.q.getDrawable()).getBitmap().getWidth()), (int) ((r2[1] / r15.height()) * ((BitmapDrawable) this.q.getDrawable()).getBitmap().getHeight()));
    }

    public final boolean e() {
        if (this.q.getDrawable() != null) goto L5;
        return false;
    L5:
        if ((this.q.getDrawable() instanceof b50) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void f(Point r4) {
        int r0 = r4.x;
        int r5 = r4.y;
        new Point(r0 - (this.r.getWidth() / 2), r5 - (this.r.getMeasuredHeight() / 2));
    }

    public final void g() {
        setPadding(0, 0, 0, 0);
        ImageView r0 = new ImageView(getContext());
        this.q = r0;
        Drawable r1 = this.s;
        if (r1 == null) goto L5;
        r0.setImageDrawable(r1);
    L5:
        FrameLayout.LayoutParams r2 = new FrameLayout.LayoutParams(-1, -1);
        r2.gravity = 17;
        addView(this.q, r2);
        ImageView r3 = new ImageView(getContext());
        this.r = r3;
        Drawable r4 = this.t;
        if (r4 == null) goto L8;
        r3.setImageDrawable(r4);
    L9:
        FrameLayout.LayoutParams r5 = new FrameLayout.LayoutParams(-2, -2);
        if (this.B == 0) goto L12;
        Context r6 = getContext();
        r5.width = (int) ((this.B * r6.getResources().getDisplayMetrics().density) + 0.5f);
        Context r7 = getContext();
        r5.height = (int) ((this.B * r7.getResources().getDisplayMetrics().density) + 0.5f);
    L12:
        r5.gravity = 17;
        addView(this.r, r5);
        this.r.setAlpha(this.y);
        getViewTreeObserver().addOnGlobalLayoutListener(new sg(3, this));
        return;
    L8:
        r3.setImageDrawable(getContext().getDrawable(R.drawable.colorpickerview_wheel));
        goto L9
    }

    public c5 getActionMode() {
        return this.x;
    }

    @Override // android.view.View
    public float getAlpha() {
        return Color.alpha(getColor()) / 255.0f;
    }

    public o9 getAlphaSlideBar() {
        return null;
    }

    public yu getBrightnessSlider() {
        return null;
    }

    public int getColor() {
        return this.o;
    }

    public a50 getColorEnvelope() {
        int r6 = getColor();
        a50 r0 = new a50();
        int r1 = Color.alpha(r6);
        int r2 = Color.red(r6);
        int r3 = Color.green(r6);
        int r4 = Color.blue(r6);
        String.format(Locale.getDefault(), "%02X%02X%02X%02X", new Object[]{Integer.valueOf(r1), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4)});
        Color.alpha(r6);
        Color.red(r6);
        Color.green(r6);
        Color.blue(r6);
        return r0;
    }

    public long getDebounceDuration() {
        return this.v;
    }

    public x71 getFlagView() {
        return null;
    }

    public String getPreferenceName() {
        return this.D;
    }

    public int getPureColor() {
        return this.n;
    }

    public Point getSelectedPoint() {
        return this.p;
    }

    public ImageView getSelector() {
        return this.r;
    }

    public float getSelectorX() {
        return this.r.getX() - (this.r.getWidth() * 0.5f);
    }

    public float getSelectorY() {
        return this.r.getY() - (this.r.getMeasuredHeight() * 0.5f);
    }

    public final void h(int r10) {
        if ((this.q.getDrawable() instanceof b50) == false) goto L7;
        float[] r0 = new float[3];
        Color.colorToHSV(r10, r0);
        float r1 = getWidth() * 0.5f;
        float r3 = getHeight() * 0.5f;
        float r4 = Math.min(r1, r3) * r0[1];
        Point r2 = kb4.z(this, new Point((int) ((Math.cos(Math.toRadians(r0[0])) * ((double) r4)) + ((double) r1)), (int) ((Math.sin(Math.toRadians(r0[0])) * ((double) (-r4))) + ((double) r3))));
        this.n = r10;
        this.o = r10;
        this.p = new Point(r2.x, r2.y);
        getAlphaSlideBar();
        getBrightnessSlider();
        i(r2.x, r2.y);
        a(getColor());
        f(this.p);
        return;
    L7:
        throw new IllegalAccessException("selectByHsvColor(@ColorInt int color) can be called only when the palette is an instance of ColorHsvPalette. Use setHsvPaletteDrawable();");
    }

    public final void i(int r4, int r5) {
        ImageView r0 = this.r;
        r0.setX(r4 - (r0.getWidth() * 0.5f));
        ImageView r3 = this.r;
        r3.setY(r5 - (r3.getMeasuredHeight() * 0.5f));
    }

    @f93(q92.ON_DESTROY)
    public void onDestroy() {
        SharedPreferences r0 = (SharedPreferences) this.G.o;
        if (getPreferenceName() == null) goto L10;
        String r1 = getPreferenceName();
        int r2 = getColor();
        r0.edit().putInt(r1 + "_COLOR", r2).apply();
        Point r3 = getSelectedPoint();
        if (r3 == null) goto L8;
        r0.edit().putInt(r1 + "_SELECTOR_X", r3.x).apply();
        r0.edit().putInt(r1 + "_SELECTOR_Y", r3.y).apply();
    L8:
        getAlphaSlideBar();
        getBrightnessSlider();
        return;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (this.q.getDrawable() != null) goto L6;
        Bitmap r5 = Bitmap.createBitmap(r1, r2, Bitmap.Config.ARGB_8888);
        this.q.setImageDrawable(new b50(getResources(), r5));
        return;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r7) {
        if (isEnabled() == true) goto L5;
        return false;
    L5:
        int r0 = r7.getActionMasked();
        if (r0 == 0) goto L12;
        if (r0 == 1) goto L12;
        if (r0 == 2) goto L12;
        this.r.setPressed(false);
        return false;
    L12:
        getFlagView();
        this.r.setPressed(true);
        Point r1 = kb4.z(this, new Point((int) r7.getX(), (int) r7.getY()));
        int r2 = d(r1.x, r1.y);
        this.n = r2;
        this.o = r2;
        this.p = kb4.z(this, new Point(r1.x, r1.y));
        i(r1.x, r1.y);
        if (this.F == false) goto L15;
        e();
    L15:
        c5 r3 = this.x;
        c5 r4 = c5.o;
        int r5 = 12;
        Handler r6 = this.w;
        if (r3 != r4) goto L21;
        f(this.p);
        if (r7.getAction() != 1) goto L20;
        r6.removeCallbacksAndMessages(null);
        r6.postDelayed(new a0(r5, this), this.v);
    L20:
        return true;
    L21:
        r6.removeCallbacksAndMessages(null);
        r6.postDelayed(new a0(r5, this), this.v);
        return true;
    }

    public void setActionMode(c5 r1) {
        this.x = r1;
    }

    public void setColorListener(h50 r1) {
        this.u = r1;
    }

    public void setDebounceDuration(long r1) {
        this.v = r1;
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
        super.setEnabled(r3);
        ImageView r0 = this.r;
        if (r3 == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        getAlphaSlideBar();
        getBrightnessSlider();
        if (r3 == false) goto L10;
        this.q.clearColorFilter();
        return;
    L10:
        int r4 = Color.argb(70, 255, 255, 255);
        this.q.setColorFilter(r4);
        return;
    L5:
        r1 = 4;
        goto L6
    }

    public void setFlagView(x71 r1) {
        throw null;
    }

    public void setInitialColor(int r4) {
        if (getPreferenceName() != null) goto L5;
    L10:
        post(new g50(this, r4, 0));
        return;
    L5:
        if (getPreferenceName() == null) goto L9;
        String r0 = getPreferenceName();
        if (((SharedPreferences) this.G.o).getInt(r0 + "_COLOR", -1) == (-1)) goto L10;
        return;
    }

    public void setInitialColorRes(int r2) {
        setInitialColor(getContext().getColor(r2));
    }

    public void setLifecycleOwner(ba2 r1) {
        r1.h().a(this);
    }

    public void setPaletteDrawable(Drawable r3) {
        removeView(this.q);
        ImageView r0 = new ImageView(getContext());
        this.q = r0;
        this.s = r3;
        r0.setImageDrawable(r3);
        addView(this.q);
        removeView(this.r);
        addView(this.r);
        this.n = -1;
        if (this.C == true) goto L8;
        this.C = true;
        ImageView r4 = this.r;
        if (r4 == null) goto L9;
        this.y = r4.getAlpha();
        this.r.setAlpha(0.0f);
        return;
    L9:
        return;
    }

    public void setPreferenceName(String r1) {
        this.D = r1;
    }

    public void setPureColor(int r1) {
        this.n = r1;
    }

    public void setResetBrightnessOnLowSaturation(boolean r1) {
        this.F = r1;
    }

    public void setSelectorDrawable(Drawable r1) {
        this.r.setImageDrawable(r1);
    }

    public void setSelectorPointValidation(boolean r1) {
        this.E = r1;
    }

    public ColorPickerView(Context r3) {
        super(r3);
        this.v = 0;
        this.w = new Handler();
        this.x = c5.n;
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = true;
        this.B = 0;
        this.C = false;
        this.E = true;
        this.F = true;
        this.G = hg3.C(getContext());
    }

    public ColorPickerView(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        this.v = 0;
        this.w = new Handler();
        this.x = c5.n;
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = true;
        this.B = 0;
        this.C = false;
        this.E = true;
        this.F = true;
        this.G = hg3.C(getContext());
        c(r4);
        g();
    }

    public ColorPickerView(Context r1, AttributeSet r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.v = 0;
        this.w = new Handler();
        this.x = c5.n;
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = true;
        this.B = 0;
        this.C = false;
        this.E = true;
        this.F = true;
        this.G = hg3.C(getContext());
        c(r2);
        g();
    }
}
