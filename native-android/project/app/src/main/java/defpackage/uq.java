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

    public uq(Context r11, AttributeSet r12, int r13) {
        super(su3.H(r11, r12, r13, R.style.Widget_MaterialComponents_Slider), r12, r13);
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
        fi2 r2 = new fi2();
        this.r0 = r2;
        this.t0 = Collections.EMPTY_LIST;
        this.v0 = 0;
        Context r4 = getContext();
        Paint r3 = new Paint();
        this.n = r3;
        Paint.Style r5 = Paint.Style.STROKE;
        r3.setStyle(r5);
        Paint.Cap r6 = Paint.Cap.ROUND;
        r3.setStrokeCap(r6);
        Paint r7 = new Paint();
        this.o = r7;
        r7.setStyle(r5);
        r7.setStrokeCap(r6);
        Paint r8 = new Paint(1);
        this.p = r8;
        Paint.Style r9 = Paint.Style.FILL;
        r8.setStyle(r9);
        r8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint r10 = new Paint(1);
        this.q = r10;
        r10.setStyle(r9);
        Paint r14 = new Paint();
        this.r = r14;
        r14.setStyle(r5);
        r14.setStrokeCap(r6);
        Paint r15 = new Paint();
        this.s = r15;
        r15.setStyle(r5);
        r15.setStrokeCap(r6);
        Resources r16 = r4.getResources();
        this.K = r16.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int r17 = r16.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.E = r17;
        this.O = r17;
        this.F = r16.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.G = r16.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.H = r16.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.I = r16.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.R = r16.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        uc5.c(r4, r12, r13, R.style.Widget_MaterialComponents_Slider);
        int[] r18 = ht3.S;
        uc5.g(r4, r12, r18, r13, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray r19 = r4.obtainStyledAttributes(r12, r18, r13, R.style.Widget_MaterialComponents_Slider);
        this.w = r19.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.W = r19.getFloat(3, 0.0f);
        this.a0 = r19.getFloat(4, 1.0f);
        setValues(new Float[]{Float.valueOf(this.W)});
        this.e0 = r19.getFloat(2, 0.0f);
        this.J = (int) Math.ceil(r19.getDimension(9, (float) Math.ceil(vr1.l(getContext(), 48))));
        int r110 = 21;
        boolean r20 = r19.hasValue(21);
        if (r20 == false) goto L5;
        int r21 = 21;
    L6:
        if (r20 == true) goto L9;
        r110 = 22;
    L9:
        ColorStateList r22 = h12.s(r4, r19, r21);
        if (r22 != null) goto L13;
        r22 = ud3.n(r4, R.color.material_slider_inactive_track_color);
    L13:
        setTrackInactiveTintList(r22);
        ColorStateList r111 = h12.s(r4, r19, r110);
        if (r111 != null) goto L17;
        r111 = ud3.n(r4, R.color.material_slider_active_track_color);
    L17:
        setTrackActiveTintList(r111);
        r2.m(h12.s(r4, r19, 10));
        if (r19.hasValue(13) == false) goto L20;
        setThumbStrokeColor(h12.s(r4, r19, 13));
    L20:
        setThumbStrokeWidth(r19.getDimension(14, 0.0f));
        ColorStateList r112 = h12.s(r4, r19, 5);
        if (r112 != null) goto L24;
        r112 = ud3.n(r4, R.color.material_slider_halo_color);
    L24:
        setHaloTintList(r112);
        this.g0 = r19.getBoolean(20, true);
        int r113 = 15;
        boolean r23 = r19.hasValue(15);
        if (r23 == false) goto L27;
        int r24 = 15;
    L28:
        if (r23 == true) goto L31;
        r113 = 16;
    L31:
        ColorStateList r25 = h12.s(r4, r19, r24);
        if (r25 != null) goto L35;
        r25 = ud3.n(r4, R.color.material_slider_inactive_tick_marks_color);
    L35:
        setTickInactiveTintList(r25);
        ColorStateList r114 = h12.s(r4, r19, r113);
        if (r114 != null) goto L39;
        r114 = ud3.n(r4, R.color.material_slider_active_tick_marks_color);
    L39:
        setTickActiveTintList(r114);
        setThumbRadius(r19.getDimensionPixelSize(12, 0));
        setHaloRadius(r19.getDimensionPixelSize(6, 0));
        setThumbElevation(r19.getDimension(11, 0.0f));
        setTrackHeight(r19.getDimensionPixelSize(24, 0));
        setTickActiveRadius(r19.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(r19.getDimensionPixelSize(19, 0));
        setLabelBehavior(r19.getInt(7, 0));
        if (r19.getBoolean(0, true) == true) goto L42;
        setEnabled(false);
    L42:
        r19.recycle();
        setFocusable(true);
        setClickable(true);
        r2.p();
        this.D = ViewConfiguration.get(r4).getScaledTouchSlop();
        sq r115 = new sq((Slider) this);
        this.t = r115;
        j65.o(this, r115);
        this.u = (AccessibilityManager) getContext().getSystemService("accessibility");
        return;
    L27:
        r24 = 17;
        goto L28
    L5:
        r21 = 23;
        goto L6
    }

    public final void a(Drawable r5) {
        int r4 = this.P * 2;
        int r0 = r5.getIntrinsicWidth();
        int r1 = r5.getIntrinsicHeight();
        if (r0 != (-1)) goto L7;
        if (r1 != (-1)) goto L7;
        r5.setBounds(0, 0, r4, r4);
        return;
    L7:
        float r6 = r4 / Math.max(r0, r1);
        r5.setBounds(0, 0, (int) (r0 * r6), (int) (r1 * r6));
    }

    public final int b() {
        int r0 = this.L / 2;
        int r1 = this.M;
        int r3 = 0;
        if (r1 != 1) goto L5;
    L6:
        r3 = ((kv4) this.x.get(0)).getIntrinsicHeight();
    L8:
        return r0 + r3;
    L5:
        if (r1 != 3) goto L8;
        goto L6
    }

    public final ValueAnimator c(boolean r7) {
        float r0 = 1.0f;
        if (r7 == false) goto L5;
        float r2 = 0.0f;
    L6:
        if (r7 == false) goto L8;
        ValueAnimator r3 = this.C;
    L9:
        if (r3 != null) goto L11;
    L13:
        if (r7 == true) goto L16;
        r0 = 0.0f;
    L16:
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{r2, r0});
        if (r7 == false) goto L19;
        int r8 = g12.N(getContext(), R.attr.motionDurationMedium4, 83);
        TimeInterpolator r4 = g12.O(getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.e);
    L20:
        r1.setDuration(r8);
        r1.setInterpolator(r4);
        r1.addUpdateListener(new qq(0, this));
        return r1;
    L19:
        r8 = g12.N(getContext(), R.attr.motionDurationShort3, 117);
        r4 = g12.O(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, yd.c);
        goto L20
    L11:
        if (r3.isRunning() == false) goto L13;
        r2 = ((Float) r3.getAnimatedValue()).floatValue();
        r3.cancel();
        goto L13
    L8:
        r3 = this.B;
        goto L9
    L5:
        r2 = 1.0f;
        goto L6
    }

    public final void d(Canvas r2, int r3, int r4, float r5, Drawable r6) {
        r2.save();
        r2.translate((this.O + ((int) (n(r5) * r3))) - (r6.getBounds().width() / 2.0f), r4 - (r6.getBounds().height() / 2.0f));
        r6.draw(r2);
        r2.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent r2) {
        if (this.t.m(r2) == false) goto L5;
        return true;
    L5:
        if (super.dispatchHoverEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int r0 = g(this.q0);
        this.n.setColor(r0);
        int r1 = g(this.p0);
        this.o.setColor(r1);
        int r2 = g(this.o0);
        this.r.setColor(r2);
        int r3 = g(this.n0);
        this.s.setColor(r3);
        ArrayList r4 = this.x;
        int r5 = r4.size();
        int r6 = 0;
    L3:
        if (r6 >= r5) goto L7;
        Object r7 = r4.get(r6);
        r6 = r6 + 1;
        kv4 r8 = (kv4) r7;
        if (r8.isStateful() == false) goto L3;
        r8.setState(getDrawableState());
        goto L3
    L7:
        fi2 r9 = this.r0;
        if (r9.isStateful() == false) goto L10;
        r9.setState(getDrawableState());
    L10:
        int r10 = g(this.m0);
        Paint r11 = this.q;
        r11.setColor(r10);
        r11.setAlpha(63);
    }

    public final String e(float r1) {
        p42 r0 = this.U;
        if (r0 == null) goto L7;
        return r0.a(r1);
    L7:
        if (((int) r1) != r1) goto L9;
        String r2 = "%.0f";
    L11:
        return String.format(r2, new Object[]{Float.valueOf(r1)});
    L9:
        r2 = "%.2f";
        goto L11
    }

    public final float[] f() {
        float r0 = ((Float) Collections.max(getValues())).floatValue();
        float r1 = ((Float) Collections.min(getValues())).floatValue();
        if (this.b0.size() != 1) goto L5;
        r1 = this.W;
    L5:
        float r2 = n(r1);
        float r3 = n(r0);
        if (j() == false) goto L10;
        return new float[]{r3, r2};
    L10:
        return new float[]{r2, r3};
    }

    public final int g(ColorStateList r2) {
        return r2.getColorForState(getDrawableState(), r2.getDefaultColor());
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

    public final boolean h(float r3) {
        double r2 = new BigDecimal(Float.toString(r3)).divide(new BigDecimal(Float.toString(this.e0)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(r2) - r2) >= 1.0E-4d) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean i(MotionEvent r4) {
        if (r4.getToolType(0) == 3) goto L16;
        ViewParent r3 = getParent();
    L7:
        if ((r3 instanceof ViewGroup) == false) goto L16;
        ViewGroup r5 = (ViewGroup) r3;
        if (r5.canScrollVertically(1) == true) goto L13;
        if (r5.canScrollVertically(-1) == true) goto L13;
    L15:
        r3 = r3.getParent();
    L13:
        if (r5.shouldDelayChildPressedState() == false) goto L15;
        return true;
    L16:
        return false;
    }

    public final boolean j() {
        WeakHashMap r0 = j65.a;
        if (getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public final void k() {
        if (this.e0 <= 0.0f) goto L14;
        w();
        int r0 = Math.min((int) (((this.a0 - this.W) / this.e0) + 1.0f), (this.j0 / (this.N * 2)) + 1);
        float[] r1 = this.f0;
        if (r1 != null) goto L8;
    L9:
        this.f0 = new float[r0 * 2];
    L10:
        float r2 = this.j0 / (r0 - 1);
        int r3 = 0;
    L12:
        if (r3 >= (r0 * 2)) goto L16;
        float[] r4 = this.f0;
        r4[r3] = ((r3 / 2.0f) * r2) + this.O;
        r4[r3 + 1] = b();
        r3 = r3 + 2;
        goto L12
    L16:
        return;
    L8:
        if (r1.length == (r0 * 2)) goto L10;
    }

    public final boolean l(int r9) {
        int r0 = this.d0;
        long r1 = ((long) r0) + ((long) r9);
        long r4 = this.b0.size() - 1;
        if (r1 >= 0) goto L6;
        r1 = 0;
    L8:
        int r10 = (int) r1;
        this.d0 = r10;
        if (r10 != r0) goto L13;
        return false;
    L13:
        if (this.c0 == (-1)) goto L15;
        this.c0 = r10;
    L15:
        u();
        postInvalidate();
        return true;
    L6:
        if (r1 <= r4) goto L8;
        r1 = r4;
        goto L8
    }

    public final void m(int r2) {
        if (j() == true) goto L5;
    L8:
        l(r2);
        return;
    L5:
        if (r2 != Integer.MIN_VALUE) goto L7;
        r2 = Integer.MAX_VALUE;
        goto L8
    L7:
        r2 = -r2;
        goto L8
    }

    public final float n(float r3) {
        float r0 = this.W;
        float r4 = (r3 - r0) / (this.a0 - r0);
        if (j() == true) goto L5;
        return r4;
    L5:
        return 1.0f - r4;
    }

    public final void o() {
        Iterator r1 = this.z.iterator();
        if (r1.hasNext() == true) goto L6;
        return;
    L6:
        throw xa3.d(r1);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList r0 = this.x;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        kv4 r5 = (kv4) r4;
        ViewGroup r6 = vr1.s(this);
        if (r6 == null) goto L6;
        r5.getClass();
        int[] r7 = new int[2];
        r6.getLocationOnScreen(r7);
        r5.V = r7[0];
        r6.getWindowVisibleDisplayFrame(r5.P);
        r6.addOnLayoutChangeListener(r5.O);
        goto L3
    L6:
        r5.getClass();
        goto L3
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        rq r0 = this.v;
        if (r0 == null) goto L5;
        removeCallbacks(r0);
    L5:
        int r1 = 0;
        this.A = false;
        ArrayList r2 = this.x;
        int r3 = r2.size();
    L6:
        if (r1 >= r3) goto L16;
        Object r4 = r2.get(r1);
        r1 = r1 + 1;
        kv4 r5 = (kv4) r4;
        ViewGroup r6 = vr1.s(this);
        if (r6 != null) goto L10;
        c05 r7 = null;
    L11:
        if (r7 == null) goto L6;
        ((ViewOverlay) r7.n).remove(r5);
        ViewGroup r8 = vr1.s(this);
        if (r8 == null) goto L14;
        r8.removeOnLayoutChangeListener(r5.O);
        goto L6
    L14:
        r5.getClass();
        goto L6
    L10:
        r7 = new c05(r6);
        goto L11
    L16:
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas r13) {
        if (this.l0 == false) goto L5;
        w();
        k();
    L5:
        super.onDraw(r13);
        int r7 = b();
        int r1 = this.j0;
        float[] r8 = f();
        int r2 = this.O;
        float r10 = r1;
        float r4 = (r8[1] * r10) + r2;
        float r3 = r2 + r1;
        Paint r6 = this.n;
        if (r4 >= r3) goto L8;
        float r5 = r7;
        r13.drawLine(r4, r5, r3, r5, r6);
    L8:
        float r9 = this.O;
        int r11 = 0;
        float r12 = (r8[0] * r10) + r9;
        if (r12 <= r9) goto L12;
        float r14 = r7;
        r13.drawLine(r9, r14, r12, r14, r6);
    L12:
        if (((Float) Collections.max(getValues())).floatValue() <= this.W) goto L15;
        int r15 = this.j0;
        float[] r16 = f();
        float r17 = this.O;
        float r18 = r15;
        float r19 = (r16[1] * r18) + r17;
        float r20 = (r16[0] * r18) + r17;
        float r21 = r7;
        r13.drawLine(r20, r21, r19, r21, this.o);
    L15:
        if (this.g0 == false) goto L21;
        if (this.e0 <= 0.0f) goto L21;
        float[] r22 = f();
        int r23 = Math.round(r22[0] * ((this.f0.length / 2) - 1));
        int r24 = Math.round(r22[1] * ((this.f0.length / 2) - 1));
        float[] r25 = this.f0;
        int r26 = r23 * 2;
        Paint r27 = this.r;
        r13.drawPoints(r25, 0, r26, r27);
        int r28 = r24 * 2;
        r13.drawPoints(this.f0, r26, r28 - r26, this.s);
        float[] r29 = this.f0;
        r13.drawPoints(r29, r28, r29.length - r28, r27);
    L21:
        if (this.V == true) goto L25;
        if (isFocused() == true) goto L25;
    L33:
        if (this.c0 != (-1)) goto L37;
        if (this.M == 3) goto L37;
    L60:
        if (this.A == false) goto L62;
        this.A = false;
        ValueAnimator r30 = c(false);
        this.C = r30;
        this.B = null;
        r30.addListener(new l4(2, this));
        this.C.start();
    L62:
        int r31 = this.j0;
    L64:
        if (r11 >= this.b0.size()) goto L76;
        float r32 = ((Float) this.b0.get(r11)).floatValue();
        Drawable r33 = this.s0;
        if (r33 == null) goto L68;
        int r34 = r7;
        d(r13, r31, r34, r32, r33);
    L75:
        r11 = r11 + 1;
        r7 = r34;
        goto L64
    L68:
        r34 = r7;
        if (r11 >= this.t0.size()) goto L72;
        d(r13, r31, r34, r32, (Drawable) this.t0.get(r11));
        goto L75
    L72:
        if (isEnabled() == true) goto L74;
        r13.drawCircle((n(r32) * r31) + this.O, r34, this.P, this.p);
    L74:
        d(r13, r31, r34, r32, this.r0);
        goto L75
    L76:
        return;
    L37:
        if (isEnabled() == false) goto L60;
        if (this.M == 2) goto L62;
        if (this.A == true) goto L44;
        this.A = true;
        ValueAnimator r35 = c(true);
        this.B = r35;
        this.C = null;
        r35.start();
    L44:
        ArrayList r36 = this.x;
        Iterator r37 = r36.iterator();
        int r38 = 0;
    L46:
        if (r38 >= this.b0.size()) goto L55;
        if (r37.hasNext() == false) goto L55;
        if (r38 == this.d0) goto L53;
        p((kv4) r37.next(), ((Float) this.b0.get(r38)).floatValue());
    L53:
        r38 = r38 + 1;
    L55:
        if (r37.hasNext() == false) goto L58;
        p((kv4) r37.next(), ((Float) this.b0.get(this.d0)).floatValue());
        goto L62
    L58:
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(r36.size()), Integer.valueOf(this.b0.size())}));
    L25:
        if (isEnabled() == false) goto L33;
        int r39 = this.j0;
        if ((getBackground() instanceof RippleDrawable) == true) goto L33;
        int r110 = (int) ((n(((Float) this.b0.get(this.d0)).floatValue()) * r39) + this.O);
        if (Build.VERSION.SDK_INT >= 28) goto L31;
        int r40 = this.Q;
        r13.clipRect(r110 - r40, r7 - r40, r110 + r40, r40 + r7, Region.Op.UNION);
    L31:
        r13.drawCircle(r110, r7, this.Q, this.q);
        goto L33
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r3, int r4, Rect r5) {
        super.onFocusChanged(r3, r4, r5);
        sq r6 = this.t;
        if (r3 == true) goto L7;
        this.c0 = -1;
        r6.j(this.d0);
        return;
    L7:
        if (r4 != 1) goto L9;
        l(Integer.MAX_VALUE);
    L19:
        r6.w(this.d0);
        return;
    L9:
        if (r4 != 2) goto L11;
        l(Integer.MIN_VALUE);
        goto L19
    L11:
        if (r4 != 17) goto L13;
        m(Integer.MAX_VALUE);
        goto L19
    L13:
        if (r4 != 66) goto L19;
        m(Integer.MIN_VALUE);
        goto L19
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r14, KeyEvent r15) {
        if (isEnabled() == true) goto L7;
        return super.onKeyDown(r14, r15);
    L7:
        if (this.b0.size() != 1) goto L9;
        this.c0 = 0;
    L9:
        Float r3 = null;
        Boolean r4 = null;
        if (this.c0 != (-1)) goto L35;
        if (r14 == 61) goto L24;
        if (r14 == 66) goto L22;
        if (r14 == 81) goto L21;
        if (r14 == 69) goto L20;
        if (r14 == 70) goto L21;
        switch(r14) {
            case 21: goto L19;
            case 22: goto L18;
            case 23: goto L22;
            default: goto L30;
        };
    L18:
        m(1);
        r4 = Boolean.TRUE;
        goto L30
    L19:
        m(-1);
        r4 = Boolean.TRUE;
    L30:
        if (r4 == null) goto L34;
        return r4.booleanValue();
    L34:
        return super.onKeyDown(r14, r15);
    L20:
        l(-1);
        r4 = Boolean.TRUE;
    L21:
        l(1);
        r4 = Boolean.TRUE;
    L22:
        this.c0 = this.d0;
        postInvalidate();
        r4 = Boolean.TRUE;
        goto L30
    L24:
        if (r15.hasNoModifiers() == false) goto L27;
        r4 = Boolean.valueOf(l(1));
        goto L30
    L27:
        if (r15.isShiftPressed() == false) goto L29;
        r4 = Boolean.valueOf(l(-1));
        goto L30
    L29:
        r4 = Boolean.FALSE;
        goto L30
    L35:
        boolean r0 = this.k0 | r15.isLongPress();
        this.k0 = r0;
        float r10 = this.e0;
        if (r0 == false) goto L45;
        if (r10 != 0.0f) goto L40;
        r10 = 1.0f;
    L40:
        float r1 = (this.a0 - this.W) / r10;
        if (r1 <= 20.0f) goto L48;
        r10 = r10 * Math.round(r1 / 20.0f);
    L48:
        if (r14 == 21) goto L62;
        if (r14 == 22) goto L58;
        if (r14 == 69) goto L56;
        if (r14 == 70) goto L55;
        if (r14 == 81) goto L55;
    L66:
        if (r3 == null) goto L72;
        if (r(this.c0, r3.floatValue() + ((Float) this.b0.get(this.c0)).floatValue()) == false) goto L70;
        u();
        postInvalidate();
    L70:
        return true;
    L72:
        if (r14 == 23) goto L86;
        if (r14 == 61) goto L78;
        if (r14 == 66) goto L86;
        return super.onKeyDown(r14, r15);
    L78:
        if (r15.hasNoModifiers() == false) goto L82;
        return l(1);
    L82:
        if (r15.isShiftPressed() == true) goto L84;
        return false;
    L84:
        return l(-1);
    L86:
        this.c0 = -1;
        postInvalidate();
        return true;
    L55:
        r3 = Float.valueOf(r10);
        goto L66
    L56:
        r3 = Float.valueOf(-r10);
        goto L66
    L58:
        if (j() == false) goto L60;
        r10 = -r10;
    L60:
        r3 = Float.valueOf(r10);
        goto L66
    L62:
        if (j() == true) goto L65;
        r10 = -r10;
    L65:
        r3 = Float.valueOf(r10);
        goto L66
    L45:
        if (r10 != 0.0f) goto L48;
        r10 = 1.0f;
        goto L48
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, KeyEvent r3) {
        this.k0 = false;
        return super.onKeyUp(r2, r3);
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
        int r6 = this.L;
        int r0 = this.M;
        int r2 = 0;
        if (r0 != 1) goto L5;
    L6:
        r2 = ((kv4) this.x.get(0)).getIntrinsicHeight();
    L7:
        super.onMeasure(r4, View.MeasureSpec.makeMeasureSpec(r6 + r2, 1073741824));
        return;
    L5:
        if (r0 != 3) goto L7;
        goto L6
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        tq r3 = (tq) r2;
        super.onRestoreInstanceState(r3.getSuperState());
        this.W = r3.n;
        this.a0 = r3.o;
        q(r3.p);
        this.e0 = r3.q;
        if (r3.r == false) goto L6;
        requestFocus();
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        tq r1 = new tq(super.onSaveInstanceState());
        r1.n = this.W;
        r1.o = this.a0;
        r1.p = new ArrayList(this.b0);
        r1.q = this.e0;
        r1.r = hasFocus();
        return r1;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        this.j0 = Math.max(r1 - (this.O * 2), 0);
        k();
        u();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r8) {
        if (isEnabled() == false) goto L20;
        float r0 = r8.getX();
        float r2 = (r0 - this.O) / this.j0;
        this.u0 = r2;
        float r3 = Math.max(0.0f, r2);
        this.u0 = r3;
        this.u0 = Math.min(1.0f, r3);
        int r4 = r8.getActionMasked();
        if (r4 == 0) goto L48;
        int r5 = this.D;
        if (r4 != 1) goto L10;
    L27:
        this.V = false;
        MotionEvent r1 = this.T;
        if (r1 == null) goto L41;
        if (r1.getActionMasked() != 0) goto L41;
        float r6 = r5;
        if (Math.abs(this.T.getX() - r8.getX()) > r6) goto L41;
        if (Math.abs(this.T.getY() - r8.getY()) > r6) goto L41;
        Slider r7 = (Slider) this;
        if (r7.getActiveThumbIndex() != (-1)) goto L39;
        r7.setActiveThumbIndex(0);
    L39:
        o();
    L41:
        if (this.c0 == (-1)) goto L47;
        s();
        u();
        this.c0 = -1;
        Iterator r9 = this.z.iterator();
        if (r9.hasNext() == false) goto L47;
        throw xa3.d(r9);
    L47:
        invalidate();
    L56:
        setPressed(this.V);
        this.T = MotionEvent.obtain(r8);
        return true;
    L10:
        if (r4 == 2) goto L15;
        if (r4 == 3) goto L27;
    L15:
        if (this.V == false) goto L17;
    L22:
        Slider r10 = (Slider) this;
        if (r10.getActiveThumbIndex() != (-1)) goto L26;
        r10.setActiveThumbIndex(0);
    L26:
        this.V = true;
        s();
        u();
        invalidate();
        goto L56
    L17:
        if (i(r8) == true) goto L19;
    L21:
        getParent().requestDisallowInterceptTouchEvent(true);
        o();
        goto L22
    L19:
        if (Math.abs(r0 - this.S) >= r5) goto L21;
    L48:
        this.S = r0;
        if (i(r8) == true) goto L56;
        getParent().requestDisallowInterceptTouchEvent(true);
        Slider r11 = (Slider) this;
        if (r11.getActiveThumbIndex() != (-1)) goto L55;
        r11.setActiveThumbIndex(0);
    L55:
        requestFocus();
        this.V = true;
        s();
        u();
        invalidate();
        o();
    L20:
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View r4, int r5) {
        super.onVisibilityChanged(r4, r5);
        if (r5 == 0) goto L13;
        ViewGroup r6 = vr1.s(this);
        if (r6 != null) goto L7;
        c05 r7 = null;
    L8:
        if (r7 == null) goto L15;
        ArrayList r3 = this.x;
        int r8 = r3.size();
        int r0 = 0;
    L11:
        if (r0 >= r8) goto L16;
        Object r1 = r3.get(r0);
        r0 = r0 + 1;
        ViewOverlay r2 = (ViewOverlay) r7.n;
        r2.remove((kv4) r1);
        goto L11
    L16:
        return;
    L15:
        return;
    L7:
        r7 = new c05(r6);
        goto L8
    }

    public final void p(kv4 r4, float r5) {
        String r0 = e(r5);
        if (TextUtils.equals(r4.K, r0) == true) goto L5;
        r4.K = r0;
        r4.N.e = true;
        r4.invalidateSelf();
    L5:
        int r1 = (this.O + ((int) (n(r5) * this.j0))) - (r4.getIntrinsicWidth() / 2);
        int r6 = b() - (this.R + this.P);
        r4.setBounds(r1, r6 - r4.getIntrinsicHeight(), r4.getIntrinsicWidth() + r1, r6);
        Rect r7 = new Rect(r4.getBounds());
        ep0.c(vr1.s(this), this, r7);
        r4.setBounds(r7);
        ViewGroup r3 = vr1.s(this);
        if (r3 != null) goto L8;
        c05 r8 = null;
    L9:
        ((ViewOverlay) r8.n).add(r4);
        return;
    L8:
        r8 = new c05(r3);
        goto L9
    }

    public final void q(ArrayList r12) {
        if (r12.isEmpty() == true) goto L60;
        Collections.sort(r12);
        if (this.b0.size() == r12.size()) goto L7;
    L9:
        this.b0 = r12;
        int r13 = 1;
        this.l0 = true;
        this.d0 = 0;
        u();
        ArrayList r1 = this.x;
        if (r1.size() <= this.b0.size()) goto L27;
        List r2 = r1.subList(this.b0.size(), r1.size());
        Iterator r3 = r2.iterator();
    L13:
        if (r3.hasNext() == false) goto L25;
        kv4 r5 = (kv4) r3.next();
        WeakHashMap r6 = j65.a;
        if (isAttachedToWindow() == false) goto L13;
        ViewGroup r7 = vr1.s(this);
        if (r7 != null) goto L19;
        c05 r8 = null;
    L20:
        if (r8 == null) goto L13;
        ((ViewOverlay) r8.n).remove(r5);
        ViewGroup r9 = vr1.s(this);
        if (r9 == null) goto L23;
        r9.removeOnLayoutChangeListener(r5.O);
        goto L13
    L23:
        r5.getClass();
        goto L13
    L19:
        r8 = new c05(r7);
        goto L20
    L25:
        r2.clear();
    L27:
        if (r1.size() >= this.b0.size()) goto L48;
        Context r4 = getContext();
        int r10 = this.w;
        kv4 r11 = new kv4(r4, r10);
        TypedArray r14 = uc5.D(r11.L, null, ht3.Z, 0, r10, new int[0]);
        Context r15 = r11.L;
        r11.U = r15.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        zc1 r16 = r11.n.a.g();
        r16.k = r11.w();
        r11.setShapeAppearanceModel(r16.a());
        CharSequence r17 = r14.getText(6);
        boolean r18 = TextUtils.equals(r11.K, r17);
        xr4 r19 = r11.N;
        if (r18 == true) goto L32;
        r11.K = r17;
        r19.e = true;
        r11.invalidateSelf();
    L32:
        if (r14.hasValue(0) == false) goto L36;
        int r20 = r14.getResourceId(0, 0);
        if (r20 == 0) goto L36;
        rr4 r21 = new rr4(r15, r20);
    L37:
        if (r21 != null) goto L39;
    L41:
        r19.c(r21, r15);
        int r22 = g12.r(R.attr.colorOnBackground, r15, kv4.class.getCanonicalName());
        r11.m(ColorStateList.valueOf(r14.getColor(7, v50.g(v50.i(r22, 153), v50.i(g12.r(android.R.attr.colorBackground, r15, kv4.class.getCanonicalName()), 229)))));
        r11.q(ColorStateList.valueOf(g12.r(R.attr.colorSurface, r15, kv4.class.getCanonicalName())));
        r11.Q = r14.getDimensionPixelSize(2, 0);
        r11.R = r14.getDimensionPixelSize(4, 0);
        r11.S = r14.getDimensionPixelSize(5, 0);
        r11.T = r14.getDimensionPixelSize(3, 0);
        r14.recycle();
        r1.add(r11);
        WeakHashMap r23 = j65.a;
        if (isAttachedToWindow() == false) goto L27;
        ViewGroup r24 = vr1.s(this);
        if (r24 == null) goto L27;
        int[] r25 = new int[2];
        r24.getLocationOnScreen(r25);
        r11.V = r25[0];
        r24.getWindowVisibleDisplayFrame(r11.P);
        r24.addOnLayoutChangeListener(r11.O);
        goto L27
    L39:
        if (r14.hasValue(1) == false) goto L41;
        r21.j = h12.s(r15, r14, 1);
    L36:
        r21 = null;
        goto L37
    L48:
        if (r1.size() != 1) goto L50;
        r13 = 0;
    L50:
        int r26 = r1.size();
        int r27 = 0;
    L51:
        if (r27 >= r26) goto L53;
        Object r28 = r1.get(r27);
        r27 = r27 + 1;
        ((kv4) r28).r(r13);
        goto L51
    L53:
        ArrayList r110 = this.y;
        int r29 = r110.size();
        int r30 = 0;
    L54:
        if (r30 >= r29) goto L58;
        Object r31 = r110.get(r30);
        r30 = r30 + 1;
        dg4 r32 = (dg4) r31;
        ArrayList r33 = this.b0;
        int r34 = r33.size();
        int r35 = 0;
    L56:
        if (r35 >= r34) goto L54;
        Object r36 = r33.get(r35);
        r35 = r35 + 1;
        float r37 = ((Float) r36).floatValue();
        r32.getClass();
        Slider r38 = (Slider) this;
        r32.a(r37, false);
        goto L56
    L58:
        postInvalidate();
        return;
    L7:
        if (this.b0.equals(r12) == false) goto L9;
        return;
    L60:
        kf2.n("At least one value must be set");
    }

    public final boolean r(int r7, float r8) {
        this.d0 = r7;
        int r1 = 0;
        if (Math.abs(r8 - ((Float) this.b0.get(r7)).floatValue()) >= 1.0E-4d) goto L5;
        return false;
    L5:
        float r0 = getMinSeparation();
        if (this.v0 != 0) goto L12;
        if (r0 != 0.0f) goto L10;
        r0 = 0.0f;
        goto L12
    L10:
        float r2 = (r0 - this.O) / this.j0;
        float r3 = this.W;
        r0 = xa3.a(r3, this.a0, r2, r3);
    L12:
        if (j() == false) goto L14;
        r0 = -r0;
    L14:
        int r4 = r7 + 1;
        if (r4 < this.b0.size()) goto L17;
        float r5 = this.a0;
    L18:
        int r6 = r7 - 1;
        if (r6 >= 0) goto L21;
        float r9 = this.W;
    L22:
        this.b0.set(r7, Float.valueOf(su3.k(r8, r9, r5)));
        ArrayList r10 = this.y;
        int r11 = r10.size();
    L24:
        if (r1 >= r11) goto L26;
        Object r12 = r10.get(r1);
        r1 = r1 + 1;
        dg4 r13 = (dg4) r12;
        float r14 = ((Float) this.b0.get(r7)).floatValue();
        r13.getClass();
        Slider r15 = (Slider) this;
        r13.a(r14, true);
        goto L24
    L26:
        AccessibilityManager r16 = this.u;
        if (r16 != null) goto L29;
    L35:
        return true;
    L29:
        if (r16.isEnabled() == false) goto L35;
        Runnable r17 = this.v;
        if (r17 != null) goto L33;
        this.v = new rq(this);
    L34:
        rq r18 = this.v;
        r18.o = r7;
        postDelayed(r18, 200);
        goto L35
    L33:
        removeCallbacks(r17);
        goto L34
    L21:
        r9 = r0 + ((Float) this.b0.get(r6)).floatValue();
        goto L22
    L17:
        r5 = ((Float) this.b0.get(r4)).floatValue() - r0;
        goto L18
    }

    public final void s() {
        float r0 = this.u0;
        float r1 = this.e0;
        if (r1 <= 0.0f) goto L5;
        int r2 = (int) ((this.a0 - this.W) / r1);
        double r3 = ((double) Math.round(r0 * r2)) / ((double) r2);
    L7:
        if (j() == false) goto L9;
        r3 = 1.0d - r3;
    L9:
        float r4 = this.a0;
        float r5 = this.W;
        r(this.c0, (float) ((r3 * ((double) (r4 - r5))) + ((double) r5)));
        return;
    L5:
        r3 = r0;
        goto L7
    }

    public void setActiveThumbIndex(int r1) {
        this.c0 = r1;
    }

    public void setCustomThumbDrawablesForValues(Drawable... r5) {
        this.s0 = null;
        this.t0 = new ArrayList();
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Drawable r2 = r5[r1];
        List r3 = this.t0;
        Drawable r4 = r2.mutate().getConstantState().newDrawable();
        a(r4);
        r3.add(r4);
        r1 = r1 + 1;
        goto L3
    L5:
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
        super.setEnabled(r2);
        if (r2 == false) goto L5;
        int r3 = 0;
    L6:
        setLayerType(r3, null);
        return;
    L5:
        r3 = 2;
        goto L6
    }

    public abstract void setHaloRadius(int r1);

    public abstract void setHaloTintList(ColorStateList r1);

    public abstract void setLabelBehavior(int r1);

    public void setSeparationUnit(int r1) {
        this.v0 = r1;
        this.l0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float r1);

    public abstract void setThumbRadius(int r1);

    public abstract void setThumbStrokeColor(ColorStateList r1);

    public abstract void setThumbStrokeWidth(float r1);

    public abstract void setTickActiveRadius(int r1);

    public abstract void setTickActiveTintList(ColorStateList r1);

    public abstract void setTickInactiveRadius(int r1);

    public abstract void setTickInactiveTintList(ColorStateList r1);

    public abstract void setTrackActiveTintList(ColorStateList r1);

    public abstract void setTrackHeight(int r1);

    public abstract void setTrackInactiveTintList(ColorStateList r1);

    public void setValues(Float... r2) {
        ArrayList r0 = new ArrayList();
        Collections.addAll(r0, r2);
        q(r0);
    }

    public final void t(int r4, Rect r5) {
        int r0 = this.O + ((int) (n(getValues().get(r4).floatValue()) * this.j0));
        int r6 = b();
        int r1 = this.P;
        int r3 = this.J;
        if (r1 > r3) goto L6;
        r1 = r3;
    L6:
        int r2 = r1 / 2;
        r5.set(r0 - r2, r6 - r2, r0 + r2, r6 + r2);
    }

    public final void u() {
        if ((getBackground() instanceof RippleDrawable) == true) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= 0) goto L11;
        Drawable r0 = getBackground();
        if ((r0 instanceof RippleDrawable) == false) goto L12;
        int r1 = (int) ((n(((Float) this.b0.get(this.d0)).floatValue()) * this.j0) + this.O);
        int r2 = b();
        int r5 = this.Q;
        r0.setHotspotBounds(r1 - r5, r2 - r5, r1 + r5, r2 + r5);
        return;
    L12:
        return;
    }

    public final void v() {
        int r0 = Math.max(this.K, Math.max(this.N + (getPaddingBottom() + getPaddingTop()), getPaddingBottom() + (getPaddingTop() + (this.P * 2))));
        boolean r2 = true;
        if (r0 != this.L) goto L5;
        boolean r1 = false;
    L6:
        int r3 = Math.max(Math.max(Math.max(this.P - this.F, 0), Math.max((this.N - this.G) / 2, 0)), Math.max(Math.max(this.h0 - this.H, 0), Math.max(this.i0 - this.I, 0))) + this.E;
        if (this.O != r3) goto L9;
        r2 = false;
    L12:
        if (r1 == false) goto L15;
        requestLayout();
        return;
    L15:
        if (r2 == false) goto L18;
        postInvalidate();
        return;
    L18:
        return;
    L9:
        this.O = r3;
        WeakHashMap r4 = j65.a;
        if (isLaidOut() == false) goto L12;
        this.j0 = Math.max(getWidth() - (this.O * 2), 0);
        k();
        goto L12
    L5:
        this.L = r0;
        r1 = true;
        goto L6
    }

    public final void w() {
        if (this.l0 == false) goto L76;
        float r0 = this.W;
        float r1 = this.a0;
        if (r0 < r1) goto L7;
        kf2.o(xa3.f("valueFrom(", r0, ") must be smaller than valueTo(", r1, ")"));
        return;
    L7:
        if (r1 > r0) goto L9;
        kf2.o(xa3.f("valueTo(", r1, ") must be greater than valueFrom(", r0, ")"));
        return;
    L9:
        if (this.e0 > 0.0f) goto L11;
    L15:
        ArrayList r2 = this.b0;
        int r3 = r2.size();
        int r5 = 0;
    L17:
        if (r5 >= r3) goto L31;
        Object r7 = r2.get(r5);
        r5 = r5 + 1;
        Float r8 = (Float) r7;
        if (r8.floatValue() < this.W) goto L30;
        if (r8.floatValue() > this.a0) goto L30;
        if (this.e0 <= 0.0f) goto L17;
        if (h(r8.floatValue() - this.W) == true) goto L17;
        float r4 = this.W;
        float r10 = this.e0;
        throw new IllegalStateException("Value(" + r8 + ") must be equal to valueFrom(" + r4 + ") plus a multiple of stepSize(" + r10 + ") when using stepSize(" + r10 + ")");
    L30:
        throw new IllegalStateException("Slider value(" + r8 + ") must be greater or equal to valueFrom(" + this.W + "), and lower or equal to valueTo(" + this.a0 + ")");
    L31:
        float r6 = getMinSeparation();
        if (r6 < 0.0f) goto L63;
        float r9 = this.e0;
        if (r9 > 0.0f) goto L36;
    L48:
        float r11 = this.e0;
        if (r11 != 0.0f) goto L52;
    L60:
        this.l0 = false;
        return;
    L52:
        if (((int) r11) == r11) goto L54;
        Log.w("uq", "Floating point value used for stepSize(" + r11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
    L54:
        float r12 = this.W;
        if (((int) r12) == r12) goto L57;
        Log.w("uq", "Floating point value used for valueFrom(" + r12 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
    L57:
        float r13 = this.a0;
        if (((int) r13) == r13) goto L60;
        Log.w("uq", "Floating point value used for valueTo(" + r13 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        goto L60
    L36:
        if (r6 <= 0.0f) goto L48;
        if (this.v0 == 1) goto L40;
        kf2.o(xa3.f("minSeparation(", r6, ") cannot be set as a dimension when using stepSize(", r9, ")"));
        return;
    L40:
        if (r6 >= r9) goto L42;
    L44:
        float r14 = this.e0;
        StringBuilder r15 = b11.r("minSeparation(", r6, ") must be greater or equal and a multiple of stepSize(", r14, ") when using stepSize(");
        r15.append(r14);
        r15.append(")");
        throw new IllegalStateException(r15.toString());
    L42:
        if (h(r6) == false) goto L44;
    L63:
        throw new IllegalStateException("minSeparation(" + r6 + ") must be greater or equal to 0");
    L11:
        if (h(r1 - r0) == true) goto L15;
        float r16 = this.e0;
        float r17 = this.W;
        float r18 = this.a0;
        StringBuilder r19 = b11.r("The stepSize(", r16, ") must be 0, or a factor of the valueFrom(", r17, ")-valueTo(");
        r19.append(r18);
        r19.append(") range");
        throw new IllegalStateException(r19.toString());
    }

    public void setValues(List<Float> r2) {
        q(new ArrayList(r2));
    }

    public void setCustomThumbDrawablesForValues(int... r5) {
        Drawable[] r0 = new Drawable[r5.length];
        int r1 = 0;
    L4:
        if (r1 >= r5.length) goto L6;
        r0[r1] = getResources().getDrawable(r5[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        setCustomThumbDrawablesForValues(r0);
    }
}
