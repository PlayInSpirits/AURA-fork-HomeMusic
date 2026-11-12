package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import app.homemusic.R;
import com.google.android.material.slider.Slider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uq extends View {
    public boolean A;
    public ValueAnimator B;
    public ValueAnimator C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final int R;
    public float S;
    public MotionEvent T;
    public p42 U;
    public boolean V;
    public float W;
    public float a0;
    public ArrayList b0;
    public int c0;
    public int d0;
    public float e0;
    public float[] f0;
    public boolean g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public ColorStateList m0;
    public final Paint n;
    public ColorStateList n0;
    public final Paint o;
    public ColorStateList o0;
    public final Paint p;
    public ColorStateList p0;
    public final Paint q;
    public ColorStateList q0;
    public final Paint r;
    public final fi2 r0;
    public final Paint s;
    public Drawable s0;
    public final sq t;
    public List t0;
    public final AccessibilityManager u;
    public float u0;
    public rq v;
    public int v0;
    public final int w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

    public uq(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_Slider), attributeSet, i);
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = false;
        this.V = false;
        this.b0 = new ArrayList();
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = 0.0f;
        this.g0 = true;
        this.k0 = false;
        fi2 fi2Var = new fi2();
        this.r0 = fi2Var;
        this.t0 = Collections.EMPTY_LIST;
        this.v0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.n = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.p = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.q = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.r = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.s = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.E = dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.F = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.G = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.H = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.R = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        uc5.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = ht3.S;
        uc5.g(context2, attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider);
        this.w = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.W = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.a0 = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.W));
        this.e0 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.J = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(vr1.l(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(21);
        int i2 = zHasValue ? 21 : 23;
        int i3 = zHasValue ? 21 : 22;
        ColorStateList colorStateListS = h12.s(context2, typedArrayObtainStyledAttributes, i2);
        setTrackInactiveTintList(colorStateListS == null ? ud3.n(context2, R.color.material_slider_inactive_track_color) : colorStateListS);
        ColorStateList colorStateListS2 = h12.s(context2, typedArrayObtainStyledAttributes, i3);
        setTrackActiveTintList(colorStateListS2 == null ? ud3.n(context2, R.color.material_slider_active_track_color) : colorStateListS2);
        fi2Var.m(h12.s(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setThumbStrokeColor(h12.s(context2, typedArrayObtainStyledAttributes, 13));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(14, 0.0f));
        ColorStateList colorStateListS3 = h12.s(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListS3 == null ? ud3.n(context2, R.color.material_slider_halo_color) : colorStateListS3);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(15);
        int i4 = zHasValue2 ? 15 : 17;
        int i5 = zHasValue2 ? 15 : 16;
        ColorStateList colorStateListS4 = h12.s(context2, typedArrayObtainStyledAttributes, i4);
        setTickInactiveTintList(colorStateListS4 == null ? ud3.n(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListS4);
        ColorStateList colorStateListS5 = h12.s(context2, typedArrayObtainStyledAttributes, i5);
        setTickActiveTintList(colorStateListS5 == null ? ud3.n(context2, R.color.material_slider_active_tick_marks_color) : colorStateListS5);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0));
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(24, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        fi2Var.p();
        this.D = ViewConfiguration.get(context2).getScaledTouchSlop();
        sq sqVar = new sq((Slider) this);
        this.t = sqVar;
        j65.o(this, sqVar);
        this.u = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void a(Drawable drawable) {
        int i = this.P * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i = this.L / 2;
        int i2 = this.M;
        return i + ((i2 == 1 || i2 == 3) ? ((kv4) this.x.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z) {
        int iN;
        TimeInterpolator timeInterpolatorO;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.C : this.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iN = g12.N(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorO = g12.O(getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.e);
        } else {
            iN = g12.N(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorO = g12.O(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, yd.c);
        }
        valueAnimatorOfFloat.setDuration(iN);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorO);
        valueAnimatorOfFloat.addUpdateListener(new qq(0, this));
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.O + ((int) (n(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.t.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.n.setColor(g(this.q0));
        this.o.setColor(g(this.p0));
        this.r.setColor(g(this.o0));
        this.s.setColor(g(this.n0));
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kv4 kv4Var = (kv4) obj;
            if (kv4Var.isStateful()) {
                kv4Var.setState(getDrawableState());
            }
        }
        fi2 fi2Var = this.r0;
        if (fi2Var.isStateful()) {
            fi2Var.setState(getDrawableState());
        }
        int iG = g(this.m0);
        Paint paint = this.q;
        paint.setColor(iG);
        paint.setAlpha(63);
    }

    public final String e(float f) {
        p42 p42Var = this.U;
        if (p42Var != null) {
            return p42Var.a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final float[] f() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.b0.size() == 1) {
            fFloatValue2 = this.W;
        }
        float fN = n(fFloatValue2);
        float fN2 = n(fFloatValue);
        return j() ? new float[]{fN2, fN} : new float[]{fN, fN2};
    }

    public final int g(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.t.x;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public List<Float> getValues() {
        return new ArrayList(this.b0);
    }

    public final boolean h(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.e0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        WeakHashMap weakHashMap = j65.a;
        return getLayoutDirection() == 1;
    }

    public final void k() {
        if (this.e0 <= 0.0f) {
            return;
        }
        w();
        int iMin = Math.min((int) (((this.a0 - this.W) / this.e0) + 1.0f), (this.j0 / (this.N * 2)) + 1);
        float[] fArr = this.f0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f0 = new float[iMin * 2];
        }
        float f = this.j0 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f0;
            fArr2[i] = ((i / 2.0f) * f) + this.O;
            fArr2[i + 1] = b();
        }
    }

    public final boolean l(int i) {
        int i2 = this.d0;
        long j = ((long) i2) + ((long) i);
        long size = this.b0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.d0 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.c0 != -1) {
            this.c0 = i3;
        }
        u();
        postInvalidate();
        return true;
    }

    public final void m(int i) {
        if (j()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        l(i);
    }

    public final float n(float f) {
        float f2 = this.W;
        float f3 = (f - f2) / (this.a0 - f2);
        return j() ? 1.0f - f3 : f3;
    }

    public final void o() {
        Iterator it = this.z.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kv4 kv4Var = (kv4) obj;
            ViewGroup viewGroupS = vr1.s(this);
            if (viewGroupS == null) {
                kv4Var.getClass();
            } else {
                kv4Var.getClass();
                int[] iArr = new int[2];
                viewGroupS.getLocationOnScreen(iArr);
                kv4Var.V = iArr[0];
                viewGroupS.getWindowVisibleDisplayFrame(kv4Var.P);
                viewGroupS.addOnLayoutChangeListener(kv4Var.O);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        rq rqVar = this.v;
        if (rqVar != null) {
            removeCallbacks(rqVar);
        }
        int i = 0;
        this.A = false;
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kv4 kv4Var = (kv4) obj;
            ViewGroup viewGroupS = vr1.s(this);
            c05 c05Var = viewGroupS == null ? null : new c05(viewGroupS);
            if (c05Var != null) {
                ((ViewOverlay) c05Var.n).remove(kv4Var);
                ViewGroup viewGroupS2 = vr1.s(this);
                if (viewGroupS2 == null) {
                    kv4Var.getClass();
                } else {
                    viewGroupS2.removeOnLayoutChangeListener(kv4Var.O);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.l0) {
            w();
            k();
        }
        super.onDraw(canvas);
        int iB = b();
        int i2 = this.j0;
        float[] fArrF = f();
        int i3 = this.O;
        float f = i2;
        float f2 = (fArrF[1] * f) + i3;
        float f3 = i3 + i2;
        Paint paint = this.n;
        if (f2 < f3) {
            float f4 = iB;
            canvas.drawLine(f2, f4, f3, f4, paint);
        }
        float f5 = this.O;
        int i4 = 0;
        float f6 = (fArrF[0] * f) + f5;
        if (f6 > f5) {
            float f7 = iB;
            canvas.drawLine(f5, f7, f6, f7, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.W) {
            int i5 = this.j0;
            float[] fArrF2 = f();
            float f8 = this.O;
            float f9 = i5;
            float f10 = (fArrF2[1] * f9) + f8;
            float f11 = (fArrF2[0] * f9) + f8;
            float f12 = iB;
            canvas.drawLine(f11, f12, f10, f12, this.o);
        }
        if (this.g0 && this.e0 > 0.0f) {
            float[] fArrF3 = f();
            int iRound = Math.round(fArrF3[0] * ((this.f0.length / 2) - 1));
            int iRound2 = Math.round(fArrF3[1] * ((this.f0.length / 2) - 1));
            float[] fArr = this.f0;
            int i6 = iRound * 2;
            Paint paint2 = this.r;
            canvas.drawPoints(fArr, 0, i6, paint2);
            int i7 = iRound2 * 2;
            canvas.drawPoints(this.f0, i6, i7 - i6, this.s);
            float[] fArr2 = this.f0;
            canvas.drawPoints(fArr2, i7, fArr2.length - i7, paint2);
        }
        if ((this.V || isFocused()) && isEnabled()) {
            int i8 = this.j0;
            if (!(getBackground() instanceof RippleDrawable)) {
                int iN = (int) ((n(((Float) this.b0.get(this.d0)).floatValue()) * i8) + this.O);
                if (Build.VERSION.SDK_INT < 28) {
                    int i9 = this.Q;
                    canvas.clipRect(iN - i9, iB - i9, iN + i9, i9 + iB, Region.Op.UNION);
                }
                canvas.drawCircle(iN, iB, this.Q, this.q);
            }
        }
        if ((this.c0 != -1 || this.M == 3) && isEnabled()) {
            if (this.M != 2) {
                if (!this.A) {
                    this.A = true;
                    ValueAnimator valueAnimatorC = c(true);
                    this.B = valueAnimatorC;
                    this.C = null;
                    valueAnimatorC.start();
                }
                ArrayList arrayList = this.x;
                Iterator it = arrayList.iterator();
                for (int i10 = 0; i10 < this.b0.size() && it.hasNext(); i10++) {
                    if (i10 != this.d0) {
                        p((kv4) it.next(), ((Float) this.b0.get(i10)).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.b0.size())));
                }
                p((kv4) it.next(), ((Float) this.b0.get(this.d0)).floatValue());
            }
        } else if (this.A) {
            this.A = false;
            ValueAnimator valueAnimatorC2 = c(false);
            this.C = valueAnimatorC2;
            this.B = null;
            valueAnimatorC2.addListener(new l4(2, this));
            this.C.start();
        }
        int i11 = this.j0;
        while (i4 < this.b0.size()) {
            float fFloatValue = ((Float) this.b0.get(i4)).floatValue();
            Drawable drawable = this.s0;
            if (drawable != null) {
                i = iB;
                d(canvas, i11, i, fFloatValue, drawable);
            } else {
                i = iB;
                if (i4 < this.t0.size()) {
                    d(canvas, i11, i, fFloatValue, (Drawable) this.t0.get(i4));
                } else {
                    if (!isEnabled()) {
                        canvas.drawCircle((n(fFloatValue) * i11) + this.O, i, this.P, this.p);
                    }
                    d(canvas, i11, i, fFloatValue, this.r0);
                }
            }
            i4++;
            iB = i;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        sq sqVar = this.t;
        if (!z) {
            this.c0 = -1;
            sqVar.j(this.d0);
            return;
        }
        if (i == 1) {
            l(Integer.MAX_VALUE);
        } else if (i == 2) {
            l(Integer.MIN_VALUE);
        } else if (i == 17) {
            m(Integer.MAX_VALUE);
        } else if (i == 66) {
            m(Integer.MIN_VALUE);
        }
        sqVar.w(this.d0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.b0.size() == 1) {
            this.c0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.c0 == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.c0 = this.d0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    l(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    l(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            m(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            m(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.c0 = this.d0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    l(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(l(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(l(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.k0 | keyEvent.isLongPress();
        this.k0 = zIsLongPress;
        float fRound = this.e0;
        if (zIsLongPress) {
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f = (this.a0 - this.W) / fRound;
            if (f > 20.0f) {
                fRound *= Math.round(f / 20.0f);
            }
        } else if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if (i == 21) {
            if (!j()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (j()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (r(this.c0, fValueOf.floatValue() + ((Float) this.b0.get(this.c0)).floatValue())) {
                u();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return l(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return l(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.c0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.k0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.L;
        int i4 = this.M;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((kv4) this.x.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        tq tqVar = (tq) parcelable;
        super.onRestoreInstanceState(tqVar.getSuperState());
        this.W = tqVar.n;
        this.a0 = tqVar.o;
        q(tqVar.p);
        this.e0 = tqVar.q;
        if (tqVar.r) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        tq tqVar = new tq(super.onSaveInstanceState());
        tqVar.n = this.W;
        tqVar.o = this.a0;
        tqVar.p = new ArrayList(this.b0);
        tqVar.q = this.e0;
        tqVar.r = hasFocus();
        return tqVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.j0 = Math.max(i - (this.O * 2), 0);
        k();
        u();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        float f;
        Slider slider;
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f2 = (x - this.O) / this.j0;
            this.u0 = f2;
            float fMax = Math.max(0.0f, f2);
            this.u0 = fMax;
            this.u0 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i = this.D;
                if (actionMasked == 1) {
                    this.V = false;
                    motionEvent2 = this.T;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f = i;
                        if (Math.abs(this.T.getX() - motionEvent.getX()) <= f && Math.abs(this.T.getY() - motionEvent.getY()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            o();
                        }
                    }
                    if (this.c0 != -1) {
                        s();
                        u();
                        this.c0 = -1;
                        it = this.z.iterator();
                        if (it.hasNext()) {
                            throw xa3.d(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.V) {
                        if (!i(motionEvent) || Math.abs(x - this.S) >= i) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            o();
                        }
                    }
                    Slider slider2 = (Slider) this;
                    if (slider2.getActiveThumbIndex() == -1) {
                        slider2.setActiveThumbIndex(0);
                    }
                    this.V = true;
                    s();
                    u();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.V = false;
                    motionEvent2 = this.T;
                    if (motionEvent2 != null) {
                        f = i;
                        if (Math.abs(this.T.getX() - motionEvent.getX()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            o();
                        }
                    }
                    if (this.c0 != -1) {
                        s();
                        u();
                        this.c0 = -1;
                        it = this.z.iterator();
                        if (it.hasNext()) {
                            throw xa3.d(it);
                        }
                    }
                    invalidate();
                }
            } else {
                this.S = x;
                if (!i(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.V = true;
                    s();
                    u();
                    invalidate();
                    o();
                }
            }
            setPressed(this.V);
            this.T = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupS = vr1.s(this);
            c05 c05Var = viewGroupS == null ? null : new c05(viewGroupS);
            if (c05Var == null) {
                return;
            }
            ArrayList arrayList = this.x;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ViewOverlay) c05Var.n).remove((kv4) obj);
            }
        }
    }

    public final void p(kv4 kv4Var, float f) {
        String strE = e(f);
        if (!TextUtils.equals(kv4Var.K, strE)) {
            kv4Var.K = strE;
            kv4Var.N.e = true;
            kv4Var.invalidateSelf();
        }
        int iN = (this.O + ((int) (n(f) * this.j0))) - (kv4Var.getIntrinsicWidth() / 2);
        int iB = b() - (this.R + this.P);
        kv4Var.setBounds(iN, iB - kv4Var.getIntrinsicHeight(), kv4Var.getIntrinsicWidth() + iN, iB);
        Rect rect = new Rect(kv4Var.getBounds());
        ep0.c(vr1.s(this), this, rect);
        kv4Var.setBounds(rect);
        ViewGroup viewGroupS = vr1.s(this);
        ((ViewOverlay) (viewGroupS == null ? null : new c05(viewGroupS)).n).add(kv4Var);
    }

    public final void q(ArrayList arrayList) {
        ViewGroup viewGroupS;
        int resourceId;
        if (arrayList.isEmpty()) {
            kf2.n("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.b0.size() == arrayList.size() && this.b0.equals(arrayList)) {
            return;
        }
        this.b0 = arrayList;
        this.l0 = true;
        this.d0 = 0;
        u();
        ArrayList arrayList2 = this.x;
        if (arrayList2.size() > this.b0.size()) {
            List<kv4> listSubList = arrayList2.subList(this.b0.size(), arrayList2.size());
            for (kv4 kv4Var : listSubList) {
                WeakHashMap weakHashMap = j65.a;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupS2 = vr1.s(this);
                    c05 c05Var = viewGroupS2 == null ? null : new c05(viewGroupS2);
                    if (c05Var != null) {
                        ((ViewOverlay) c05Var.n).remove(kv4Var);
                        ViewGroup viewGroupS3 = vr1.s(this);
                        if (viewGroupS3 == null) {
                            kv4Var.getClass();
                        } else {
                            viewGroupS3.removeOnLayoutChangeListener(kv4Var.O);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.b0.size()) {
            Context context = getContext();
            int i = this.w;
            kv4 kv4Var2 = new kv4(context, i);
            TypedArray typedArrayD = uc5.D(kv4Var2.L, null, ht3.Z, 0, i, new int[0]);
            Context context2 = kv4Var2.L;
            kv4Var2.U = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            zc1 zc1VarG = kv4Var2.n.a.g();
            zc1VarG.k = kv4Var2.w();
            kv4Var2.setShapeAppearanceModel(zc1VarG.a());
            CharSequence text = typedArrayD.getText(6);
            boolean zEquals = TextUtils.equals(kv4Var2.K, text);
            xr4 xr4Var = kv4Var2.N;
            if (!zEquals) {
                kv4Var2.K = text;
                xr4Var.e = true;
                kv4Var2.invalidateSelf();
            }
            rr4 rr4Var = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new rr4(context2, resourceId);
            if (rr4Var != null && typedArrayD.hasValue(1)) {
                rr4Var.j = h12.s(context2, typedArrayD, 1);
            }
            xr4Var.c(rr4Var, context2);
            kv4Var2.m(ColorStateList.valueOf(typedArrayD.getColor(7, v50.g(v50.i(g12.r(R.attr.colorOnBackground, context2, kv4.class.getCanonicalName()), 153), v50.i(g12.r(android.R.attr.colorBackground, context2, kv4.class.getCanonicalName()), 229)))));
            kv4Var2.q(ColorStateList.valueOf(g12.r(R.attr.colorSurface, context2, kv4.class.getCanonicalName())));
            kv4Var2.Q = typedArrayD.getDimensionPixelSize(2, 0);
            kv4Var2.R = typedArrayD.getDimensionPixelSize(4, 0);
            kv4Var2.S = typedArrayD.getDimensionPixelSize(5, 0);
            kv4Var2.T = typedArrayD.getDimensionPixelSize(3, 0);
            typedArrayD.recycle();
            arrayList2.add(kv4Var2);
            WeakHashMap weakHashMap2 = j65.a;
            if (isAttachedToWindow() && (viewGroupS = vr1.s(this)) != null) {
                int[] iArr = new int[2];
                viewGroupS.getLocationOnScreen(iArr);
                kv4Var2.V = iArr[0];
                viewGroupS.getWindowVisibleDisplayFrame(kv4Var2.P);
                viewGroupS.addOnLayoutChangeListener(kv4Var2.O);
            }
        }
        int i2 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ((kv4) obj).r(i2);
        }
        ArrayList arrayList3 = this.y;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            dg4 dg4Var = (dg4) obj2;
            ArrayList arrayList4 = this.b0;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList4.get(i5);
                i5++;
                float fFloatValue = ((Float) obj3).floatValue();
                dg4Var.getClass();
                dg4Var.a(fFloatValue, false);
            }
        }
        postInvalidate();
    }

    public final boolean r(int i, float f) {
        this.d0 = i;
        int i2 = 0;
        if (Math.abs(f - ((Float) this.b0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.v0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.O) / this.j0;
                float f3 = this.W;
                minSeparation = xa3.a(f3, this.a0, f2, f3);
            }
        }
        if (j()) {
            minSeparation = -minSeparation;
        }
        int i3 = i + 1;
        int i4 = i - 1;
        this.b0.set(i, Float.valueOf(su3.k(f, i4 < 0 ? this.W : minSeparation + ((Float) this.b0.get(i4)).floatValue(), i3 >= this.b0.size() ? this.a0 : ((Float) this.b0.get(i3)).floatValue() - minSeparation)));
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dg4 dg4Var = (dg4) obj;
            float fFloatValue = ((Float) this.b0.get(i)).floatValue();
            dg4Var.getClass();
            dg4Var.a(fFloatValue, true);
        }
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.v;
            if (runnable == null) {
                this.v = new rq(this);
            } else {
                removeCallbacks(runnable);
            }
            rq rqVar = this.v;
            rqVar.o = i;
            postDelayed(rqVar, 200L);
        }
        return true;
    }

    public final void s() {
        double dRound;
        float f = this.u0;
        float f2 = this.e0;
        if (f2 > 0.0f) {
            int i = (int) ((this.a0 - this.W) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (j()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.a0;
        float f4 = this.W;
        r(this.c0, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    public void setActiveThumbIndex(int i) {
        this.c0 = i;
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.s0 = null;
        this.t0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.t0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.v0 = i;
        this.l0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbRadius(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        q(arrayList);
    }

    public final void t(int i, Rect rect) {
        int iN = this.O + ((int) (n(getValues().get(i).floatValue()) * this.j0));
        int iB = b();
        int i2 = this.P;
        int i3 = this.J;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(iN - i4, iB - i4, iN + i4, iB + i4);
    }

    public final void u() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iN = (int) ((n(((Float) this.b0.get(this.d0)).floatValue()) * this.j0) + this.O);
            int iB = b();
            int i = this.Q;
            background.setHotspotBounds(iN - i, iB - i, iN + i, iB + i);
        }
    }

    public final void v() {
        boolean z;
        int iMax = Math.max(this.K, Math.max(this.N + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.P * 2)));
        boolean z2 = true;
        if (iMax == this.L) {
            z = false;
        } else {
            this.L = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max(this.P - this.F, 0), Math.max((this.N - this.G) / 2, 0)), Math.max(Math.max(this.h0 - this.H, 0), Math.max(this.i0 - this.I, 0))) + this.E;
        if (this.O == iMax2) {
            z2 = false;
        } else {
            this.O = iMax2;
            WeakHashMap weakHashMap = j65.a;
            if (isLaidOut()) {
                this.j0 = Math.max(getWidth() - (this.O * 2), 0);
                k();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void w() {
        if (this.l0) {
            float f = this.W;
            float f2 = this.a0;
            if (f >= f2) {
                kf2.o(xa3.f("valueFrom(", f, ") must be smaller than valueTo(", f2, ")"));
                return;
            }
            if (f2 <= f) {
                kf2.o(xa3.f("valueTo(", f2, ") must be greater than valueFrom(", f, ")"));
                return;
            }
            if (this.e0 > 0.0f && !h(f2 - f)) {
                float f3 = this.e0;
                float f4 = this.W;
                float f5 = this.a0;
                StringBuilder sbR = b11.r("The stepSize(", f3, ") must be 0, or a factor of the valueFrom(", f4, ")-valueTo(");
                sbR.append(f5);
                sbR.append(") range");
                throw new IllegalStateException(sbR.toString());
            }
            ArrayList arrayList = this.b0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Float f6 = (Float) obj;
                if (f6.floatValue() < this.W || f6.floatValue() > this.a0) {
                    throw new IllegalStateException("Slider value(" + f6 + ") must be greater or equal to valueFrom(" + this.W + "), and lower or equal to valueTo(" + this.a0 + ")");
                }
                if (this.e0 > 0.0f && !h(f6.floatValue() - this.W)) {
                    float f7 = this.W;
                    float f8 = this.e0;
                    throw new IllegalStateException("Value(" + f6 + ") must be equal to valueFrom(" + f7 + ") plus a multiple of stepSize(" + f8 + ") when using stepSize(" + f8 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f9 = this.e0;
            if (f9 > 0.0f && minSeparation > 0.0f) {
                if (this.v0 != 1) {
                    kf2.o(xa3.f("minSeparation(", minSeparation, ") cannot be set as a dimension when using stepSize(", f9, ")"));
                    return;
                } else if (minSeparation < f9 || !h(minSeparation)) {
                    float f10 = this.e0;
                    StringBuilder sbR2 = b11.r("minSeparation(", minSeparation, ") must be greater or equal and a multiple of stepSize(", f10, ") when using stepSize(");
                    sbR2.append(f10);
                    sbR2.append(")");
                    throw new IllegalStateException(sbR2.toString());
                }
            }
            float f11 = this.e0;
            if (f11 != 0.0f) {
                if (((int) f11) != f11) {
                    Log.w("uq", "Floating point value used for stepSize(" + f11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f12 = this.W;
                if (((int) f12) != f12) {
                    Log.w("uq", "Floating point value used for valueFrom(" + f12 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f13 = this.a0;
                if (((int) f13) != f13) {
                    Log.w("uq", "Floating point value used for valueTo(" + f13 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.l0 = false;
        }
    }

    public void setValues(List<Float> list) {
        q(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }
}
