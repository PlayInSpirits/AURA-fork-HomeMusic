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

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = 0L;
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
        c(attributeSet);
        g();
    }

    public final void a(int i) {
        this.o = i;
        getAlphaSlideBar();
        getBrightnessSlider();
        h50 h50Var = this.u;
        if (h50Var != null && (h50Var instanceof e50)) {
            int i2 = this.o;
            String str = String.format(Locale.getDefault(), "%02X%02X%02X%02X", Integer.valueOf(Color.alpha(i2)), Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)));
            Color.alpha(i2);
            Color.red(i2);
            Color.green(i2);
            Color.blue(i2);
            ((e50) this.u).a.n = "HEX:#".concat(str);
        }
        if (this.C) {
            this.C = false;
            ImageView imageView = this.r;
            if (imageView != null) {
                imageView.setAlpha(this.y);
            }
        }
    }

    public final void c(AttributeSet attributeSet) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, it3.a);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                this.s = typedArrayObtainStyledAttributes.getDrawable(5);
            }
            if (typedArrayObtainStyledAttributes.hasValue(8) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(8, -1)) != -1) {
                this.t = zz1.r(getContext(), resourceId);
            }
            if (typedArrayObtainStyledAttributes.hasValue(10)) {
                this.y = typedArrayObtainStyledAttributes.getFloat(10, this.y);
            }
            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, this.B);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                this.z = typedArrayObtainStyledAttributes.getFloat(2, this.z);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.A = typedArrayObtainStyledAttributes.getBoolean(3, this.A);
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
                if (integer == 0) {
                    this.x = c5.n;
                } else if (integer == 1) {
                    this.x = c5.o;
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.v = typedArrayObtainStyledAttributes.getInteger(1, (int) this.v);
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                this.D = typedArrayObtainStyledAttributes.getString(6);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                setInitialColor(typedArrayObtainStyledAttributes.getColor(4, -1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(9)) {
                this.E = typedArrayObtainStyledAttributes.getBoolean(9, this.E);
            }
            if (typedArrayObtainStyledAttributes.hasValue(7)) {
                this.F = typedArrayObtainStyledAttributes.getBoolean(7, this.F);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int d(float f, float f2) {
        Matrix matrix = new Matrix();
        this.q.getImageMatrix().invert(matrix);
        float[] fArr = {f, f2};
        matrix.mapPoints(fArr);
        if (this.q.getDrawable() != null && (this.q.getDrawable() instanceof BitmapDrawable)) {
            float f3 = fArr[0];
            if (f3 >= 0.0f && fArr[1] >= 0.0f && f3 < this.q.getDrawable().getIntrinsicWidth() && fArr[1] < this.q.getDrawable().getIntrinsicHeight()) {
                invalidate();
                if (!(this.q.getDrawable() instanceof b50)) {
                    Rect bounds = this.q.getDrawable().getBounds();
                    return ((BitmapDrawable) this.q.getDrawable()).getBitmap().getPixel((int) ((fArr[0] / bounds.width()) * ((BitmapDrawable) this.q.getDrawable()).getBitmap().getWidth()), (int) ((fArr[1] / bounds.height()) * ((BitmapDrawable) this.q.getDrawable()).getBitmap().getHeight()));
                }
                float width = f - (getWidth() * 0.5f);
                float height = f2 - (getHeight() * 0.5f);
                double dSqrt = Math.sqrt((height * height) + (width * width));
                float fMin = Math.min(getWidth(), getHeight()) * 0.5f;
                float[] fArr2 = {0.0f, 0.0f, 1.0f};
                fArr2[0] = ((float) ((Math.atan2(height, -width) / 3.141592653589793d) * 180.0d)) + 180.0f;
                fArr2[1] = Math.max(0.0f, Math.min(1.0f, (float) (dSqrt / ((double) fMin))));
                return Color.HSVToColor(fArr2);
            }
        }
        return 0;
    }

    public final boolean e() {
        return this.q.getDrawable() != null && (this.q.getDrawable() instanceof b50);
    }

    public final void f(Point point) {
        new Point(point.x - (this.r.getWidth() / 2), point.y - (this.r.getMeasuredHeight() / 2));
    }

    public final void g() {
        setPadding(0, 0, 0, 0);
        ImageView imageView = new ImageView(getContext());
        this.q = imageView;
        Drawable drawable = this.s;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.q, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.r = imageView2;
        Drawable drawable2 = this.t;
        if (drawable2 != null) {
            imageView2.setImageDrawable(drawable2);
        } else {
            imageView2.setImageDrawable(getContext().getDrawable(R.drawable.colorpickerview_wheel));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (this.B != 0) {
            layoutParams2.width = (int) ((this.B * getContext().getResources().getDisplayMetrics().density) + 0.5f);
            layoutParams2.height = (int) ((this.B * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        }
        layoutParams2.gravity = 17;
        addView(this.r, layoutParams2);
        this.r.setAlpha(this.y);
        getViewTreeObserver().addOnGlobalLayoutListener(new sg(3, this));
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
        int color = getColor();
        a50 a50Var = new a50();
        String.format(Locale.getDefault(), "%02X%02X%02X%02X", Integer.valueOf(Color.alpha(color)), Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color)));
        Color.alpha(color);
        Color.red(color);
        Color.green(color);
        Color.blue(color);
        return a50Var;
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

    public final void h(int i) {
        if (!(this.q.getDrawable() instanceof b50)) {
            throw new IllegalAccessException("selectByHsvColor(@ColorInt int color) can be called only when the palette is an instance of ColorHsvPalette. Use setHsvPaletteDrawable();");
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float width = getWidth() * 0.5f;
        float height = getHeight() * 0.5f;
        float fMin = Math.min(width, height) * fArr[1];
        Point pointZ = kb4.z(this, new Point((int) ((Math.cos(Math.toRadians(fArr[0])) * ((double) fMin)) + ((double) width)), (int) ((Math.sin(Math.toRadians(fArr[0])) * ((double) (-fMin))) + ((double) height))));
        this.n = i;
        this.o = i;
        this.p = new Point(pointZ.x, pointZ.y);
        getAlphaSlideBar();
        getBrightnessSlider();
        i(pointZ.x, pointZ.y);
        a(getColor());
        f(this.p);
    }

    public final void i(int i, int i2) {
        ImageView imageView = this.r;
        imageView.setX(i - (imageView.getWidth() * 0.5f));
        ImageView imageView2 = this.r;
        imageView2.setY(i2 - (imageView2.getMeasuredHeight() * 0.5f));
    }

    @f93(q92.ON_DESTROY)
    public void onDestroy() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.G.o;
        if (getPreferenceName() != null) {
            String preferenceName = getPreferenceName();
            int color = getColor();
            sharedPreferences.edit().putInt(preferenceName + "_COLOR", color).apply();
            Point selectedPoint = getSelectedPoint();
            if (selectedPoint != null) {
                sharedPreferences.edit().putInt(preferenceName + "_SELECTOR_X", selectedPoint.x).apply();
                sharedPreferences.edit().putInt(preferenceName + "_SELECTOR_Y", selectedPoint.y).apply();
            }
            getAlphaSlideBar();
            getBrightnessSlider();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.q.getDrawable() == null) {
            this.q.setImageDrawable(new b50(getResources(), Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 2) {
            this.r.setPressed(false);
            return false;
        }
        getFlagView();
        this.r.setPressed(true);
        Point pointZ = kb4.z(this, new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
        int iD = d(pointZ.x, pointZ.y);
        this.n = iD;
        this.o = iD;
        this.p = kb4.z(this, new Point(pointZ.x, pointZ.y));
        i(pointZ.x, pointZ.y);
        if (this.F) {
            e();
        }
        c5 c5Var = this.x;
        c5 c5Var2 = c5.o;
        int i = 12;
        Handler handler = this.w;
        if (c5Var != c5Var2) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new a0(i, this), this.v);
            return true;
        }
        f(this.p);
        if (motionEvent.getAction() == 1) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new a0(i, this), this.v);
        }
        return true;
    }

    public void setActionMode(c5 c5Var) {
        this.x = c5Var;
    }

    public void setColorListener(h50 h50Var) {
        this.u = h50Var;
    }

    public void setDebounceDuration(long j) {
        this.v = j;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.r.setVisibility(z ? 0 : 4);
        getAlphaSlideBar();
        getBrightnessSlider();
        if (z) {
            this.q.clearColorFilter();
        } else {
            this.q.setColorFilter(Color.argb(70, 255, 255, 255));
        }
    }

    public void setFlagView(x71 x71Var) {
        throw null;
    }

    public void setInitialColor(int i) {
        if (getPreferenceName() != null) {
            if (getPreferenceName() == null) {
                return;
            }
            String preferenceName = getPreferenceName();
            if (((SharedPreferences) this.G.o).getInt(preferenceName + "_COLOR", -1) != -1) {
                return;
            }
        }
        post(new g50(this, i, 0));
    }

    public void setInitialColorRes(int i) {
        setInitialColor(getContext().getColor(i));
    }

    public void setLifecycleOwner(ba2 ba2Var) {
        ba2Var.h().a(this);
    }

    public void setPaletteDrawable(Drawable drawable) {
        removeView(this.q);
        ImageView imageView = new ImageView(getContext());
        this.q = imageView;
        this.s = drawable;
        imageView.setImageDrawable(drawable);
        addView(this.q);
        removeView(this.r);
        addView(this.r);
        this.n = -1;
        if (this.C) {
            return;
        }
        this.C = true;
        ImageView imageView2 = this.r;
        if (imageView2 != null) {
            this.y = imageView2.getAlpha();
            this.r.setAlpha(0.0f);
        }
    }

    public void setPreferenceName(String str) {
        this.D = str;
    }

    public void setPureColor(int i) {
        this.n = i;
    }

    public void setResetBrightnessOnLowSaturation(boolean z) {
        this.F = z;
    }

    public void setSelectorDrawable(Drawable drawable) {
        this.r.setImageDrawable(drawable);
    }

    public void setSelectorPointValidation(boolean z) {
        this.E = z;
    }

    public ColorPickerView(Context context) {
        super(context);
        this.v = 0L;
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

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = 0L;
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
        c(attributeSet);
        g();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.v = 0L;
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
        c(attributeSet);
        g();
    }
}
