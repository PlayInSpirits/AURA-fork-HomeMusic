package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends ViewGroup implements ub3, b34, rl0, lb3, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, t91 {
    public static Class U0;
    public static Method V0;
    public static Method W0;
    public static final q03 X0 = null;
    public static u6 Y0;
    public static Method Z0;
    public static Method a1;
    public ne0 A;
    public long A0;
    public final qb B;
    public final hd5 B0;
    public final zd3 C;
    public final q03 C0;
    public final dp0 D;
    public float D0;
    public final xz1 E;
    public float E0;
    public final c72 F;
    public float F0;
    public final i03 G;
    public float G0;
    public final yv3 H;
    public final g5 H0;
    public final l94 I;
    public final ia I0;
    public final ya J;
    public boolean J0;
    public lb K;
    public wf1 K0;
    public final jw L;
    public final bk L0;
    public final wn M;
    public final da M0;
    public final q03 N;
    public final da N0;
    public q03 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public final tx2 Q;
    public boolean Q0;
    public final jw R;
    public final rm2 R0;
    public final zd3 S;
    public View S0;
    public final dp0 T;
    public final pa T0;
    public final x9 U;
    public final y9 V;
    public boolean W;
    public final wb3 a0;
    public boolean b0;
    public id c0;
    public nc0 d0;
    public boolean e0;
    public final ri2 f0;
    public long g0;
    public final int[] h0;
    public final float[] i0;
    public final Matrix j0;
    public final float[] k0;
    public final float[] l0;
    public long m0;
    public final zd3 n;
    public boolean n0;
    public long o;
    public long o0;
    public final boolean p;
    public if1 p0;
    public dy1 q;
    public js4 q0;
    public ga2 r;
    public is4 r0;
    public ha2 s;
    public final AtomicReference s0;
    public bs0 t;
    public om0 t0;
    public y14 u;
    public final b13 u0;
    public final ii v;
    public final zd3 v0;
    public final ia w;
    public sz1 w0;
    public final zd3 x;
    public final ex2 x0;
    public final View y;
    public pa y0;
    public final ey z;
    public MotionEvent z0;

    static {
        X0 = new q03();
    }

    public ra(Context r17, h80 r18) {
        ra r2 = this;
        super(r17);
        r2.n = uc5.B(r18);
        r2.o = 9205357640488583168L;
        int r9 = 1;
        r2.p = true;
        r2.u = fz0.b0;
        r2.v = new ii();
        int r10 = 0;
        r2.w = new ia(r2, r10);
        r2.x = new zd3(bu.a(r17), rv2.A);
        r2.z = new ey(r2, r2);
        r2.A = r18.c().j();
        r2.B = new qb();
        r2.C = uc5.B(Boolean.FALSE);
        int r11 = 2;
        da r0 = new da(r2, r11);
        z05 r1 = ph4.a;
        rm2 r12 = null;
        r2.D = new dp0(r0, null);
        r2.E = new xz1();
        int r13 = 3;
        c72 r3 = new c72(3);
        ui2 r4 = r3.I;
        c34 r5 = c34.b;
        if (h12.c(r4, r5) == true) goto L5;
        r3.I = r5;
        r3.D();
    L5:
        r3.a0(r2.getDensity());
        r3.e0(r2.getViewConfiguration());
        r3.d0(new qa(r2).c((w91) ((ey) r2.getFocusOwner()).e).c(r2.m72getDragAndDropManager().c));
        r2.F = r3;
        i03 r6 = f02.a;
        r2.G = new i03();
        r2.H = new yv3(r2.m74getLayoutNodes(), r2);
        r2.I = new l94(r2.getRoot(), new x01(), r2.m74getLayoutNodes());
        ya r14 = new ya(r2);
        r2.J = r14;
        r2.K = new lb(r2, new na(0, r2, gb.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        jw r7 = new jw();
        r7.o = r2;
        r7.p = new Object();
        ac r8 = new ac();
        r7.r = r8;
        if (r2.isAttachedToWindow() == false) goto L10;
        Context r15 = r2.getContext();
        if (r7.n == true) goto L10;
        r15.getApplicationContext().registerComponentCallbacks(r8);
        r7.n = true;
    L10:
        r2.addOnAttachStateChangeListener(new bc(r10, r7));
        r2.L = r7;
        r2.M = new wn();
        r2.N = new q03();
        r2.Q = new tx2();
        c72 r16 = r2.getRoot();
        jw r19 = new jw();
        r19.o = r16;
        r19.p = new cm1((iz1) r16.Q.d);
        int r20 = 15;
        r19.q = new pz1(15);
        r19.r = new fm1();
        r2.R = r19;
        r2.S = uc5.B(new Configuration(r17.getResources().getConfiguration()));
        r2.T = new dp0(new da(r2, r13), null);
        if (d() == false) goto L13;
        x9 r21 = new x9(r2, r2.getAutofillTree());
    L14:
        r2.U = r21;
        if (d() == false) goto L17;
        y9 r22 = new y9(new qr2(r20, r17), getSemanticsOwner(), this, getRectManager(), r17.getPackageName());
        r2 = this;
    L18:
        r2.V = r22;
        r2.a0 = new wb3(new ja(r2, r10));
        r2.f0 = new ri2(r2.getRoot());
        r2.g0 = 9223372034707292159L;
        r2.h0 = new int[]{0, 0};
        r2.i0 = ya4.h();
        r2.j0 = new Matrix();
        r2.k0 = ya4.h();
        r2.l0 = ya4.h();
        r2.m0 = -1;
        r2.o0 = 9187343241974906880L;
        r2.s0 = new AtomicReference(null);
        r2.u0 = r18.p;
        int r23 = r17.getResources().getConfiguration().getLayoutDirection();
        int[] r24 = r91.a;
        r62 r25 = r62.n;
        if (r23 == 0) goto L23;
        if (r23 == 1) goto L22;
        r62 r26 = null;
    L24:
        if (r26 == null) goto L27;
        r25 = r26;
    L27:
        r2.v0 = uc5.B(r25);
        r2.x0 = new ex2();
        r2.B0 = new hd5(22);
        r2.C0 = new q03();
        r2.D0 = Float.NaN;
        r2.E0 = Float.NaN;
        r2.F0 = Float.NaN;
        r2.G0 = Float.NaN;
        r2.H0 = new g5(r11, r2);
        r2.I0 = new ia(r2, r9);
        r2.K0 = new ka(r2);
        r2.L0 = new bk(r17, new ja(r2, r9));
        r2.M0 = new da(r2, 4);
        r2.N0 = new da(r2, r10);
        r2.addOnAttachStateChangeListener(r2.K);
        r2.setWillNotDraw(false);
        r2.setFocusable(true);
        int r27 = Build.VERSION.SDK_INT;
        if (r27 < 26) goto L30;
        fb.a.a(r2, 1, false);
    L30:
        r2.setFocusableInTouchMode(true);
        r2.setClipChildren(false);
        j65.o(r2, r14);
        r2.setOnDragListener(r2.m72getDragAndDropManager());
        if (r27 < 29) goto L34;
        ab.a.a(r2);
    L34:
        if (l() == false) goto L37;
        View r28 = new View(r17);
        r28.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        r28.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
        r2.y = r28;
        r2.addView(r28, -1);
    L37:
        if (r27 < 31) goto L39;
        r12 = new rm2(15);
    L39:
        r2.R0 = r12;
        r2.T0 = new pa(r2);
        return;
    L22:
        r26 = r62.o;
        goto L24
    L23:
        r26 = r25;
        goto L24
    L17:
        r22 = null;
        goto L18
    L13:
        r21 = null;
        goto L14
    }

    public static boolean c(ra r0, KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        return true;
    L6:
        return false;
    }

    public static void e(ViewGroup r4) {
        int r0 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof ra) == false) goto L8;
        ((ra) r2).s();
    L10:
        r1 = r1 + 1;
        goto L3
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L10;
        e((ViewGroup) r2);
        goto L10
    }

    public static long f(int r4) {
        int r0 = View.MeasureSpec.getMode(r4);
        int r5 = View.MeasureSpec.getSize(r4);
        if (r0 == Integer.MIN_VALUE) goto L14;
        if (r0 != 0) goto L6;
        return 2147483647L;
    L6:
        if (r0 != 1073741824) goto L9;
        long r1 = r5;
        return r1 | (r1 << 32);
    L9:
        tb4.a();
        return 0;
    L14:
        return r5;
    }

    private final nz getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @zo0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final js4 getLegacyTextInputServiceAndroid() {
        js4 r0 = this.q0;
        if (r0 != null) goto L6;
        js4 r1 = new js4(getView(), this);
        this.q0 = r1;
        return r1;
    L6:
        return r0;
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m67getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @zo0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final h80 get_composeViewContext() {
        return (h80) this.n.getValue();
    }

    public static void i(c72 r3) {
        r3.C();
        f13 r4 = r3.y();
        Object[] r0 = r4.n;
        int r5 = r4.p;
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L5;
        i((c72) r0[r1]);
        r1 = r1 + 1;
        goto L3
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean m(MotionEvent r8) {
        if ((Float.floatToRawIntBits(r8.getX()) & Integer.MAX_VALUE) < 2139095040) goto L5;
    L11:
        boolean r0 = true;
    L12:
        if (r0 == true) goto L28;
        int r5 = r8.getPointerCount();
        int r6 = 1;
    L14:
        if (r6 >= r5) goto L28;
        if ((Float.floatToRawIntBits(r8.getX(r6)) & Integer.MAX_VALUE) < 2139095040) goto L18;
    L25:
        r0 = true;
    L26:
        if (r0 == true) goto L28;
        r6 = r6 + 1;
        goto L14
    L18:
        if ((Float.floatToRawIntBits(r8.getY(r6)) & Integer.MAX_VALUE) >= 2139095040) goto L25;
        if (Build.VERSION.SDK_INT >= 29) goto L22;
    L24:
        r0 = false;
        goto L26
    L22:
        if (ux2.a.a(r8, r6) == true) goto L24;
    L28:
        return r0;
    L5:
        if ((Float.floatToRawIntBits(r8.getY()) & Integer.MAX_VALUE) >= 2139095040) goto L11;
        if ((Float.floatToRawIntBits(r8.getRawX()) & Integer.MAX_VALUE) >= 2139095040) goto L11;
        if ((Float.floatToRawIntBits(r8.getRawY()) & Integer.MAX_VALUE) >= 2139095040) goto L11;
        r0 = false;
        goto L12
    }

    private final void setAttached(boolean r1) {
        this.C.setValue(Boolean.valueOf(r1));
    }

    private void setDensity(oo0 r1) {
        this.x.setValue(r1);
    }

    private void setLayoutDirection(r62 r1) {
        this.v0.setValue(r1);
    }

    private final void set_composeViewContext(h80 r1) {
        this.n.setValue(r1);
    }

    public final void A() {
        int r0 = Build.VERSION.SDK_INT;
        float[] r2 = this.k0;
        int[] r3 = this.h0;
        if (r0 < 29) goto L5;
        ay.a.a(this, r2, this.j0, r3);
    L6:
        q05.q(r2, this.l0);
        return;
    L5:
        ya4.G(r2);
        gi1.Y(this, r2, this.i0, r3);
        goto L6
    }

    public final boolean B() {
        if (isFocused() == false) goto L7;
        return true;
    L7:
        return super.requestFocus(130, null);
    }

    public final void C(gf1 r3) {
        ii r0 = this.v;
        boolean r1 = r0.isEmpty();
        r0.addLast(r3);
        if (r1 == false) goto L10;
        Handler r4 = getHandler();
        if (r4 == null) goto L8;
        r4.postAtFrontOfQueue(this.w);
        return;
    L8:
        kf2.n("schedule is called when outOfFrameExecutor is not available (view is detached)");
        return;
    }

    public final void D(c72 r4) {
        if (isLayoutRequested() == false) goto L5;
        return;
    L5:
        if (isAttachedToWindow() == false) goto L41;
        if (r4 == null) goto L25;
    L7:
        if (r4 == null) goto L21;
        if (r4.r() != a72.n) goto L21;
        if (this.e0 == true) goto L19;
        c72 r0 = r4.t();
        if (r0 == null) goto L21;
        long r1 = ((iz1) r0.Q.d).q;
        if (nc0.f(r1) == false) goto L19;
        if (nc0.e(r1) == true) goto L21;
    L19:
        r4 = r4.t();
    L21:
        if (r4 != getRoot()) goto L25;
        requestLayout();
        return;
    L25:
        if (getWidth() != 0) goto L27;
    L31:
        requestLayout();
        return;
    L27:
        if (getHeight() == 0) goto L31;
        invalidate();
        return;
    }

    public final long E(long r7) {
        y();
        float r1 = Float.intBitsToFloat((int) (r7 >> 32)) - Float.intBitsToFloat((int) (this.o0 >> 32));
        float r8 = Float.intBitsToFloat((int) (r7 & 4294967295L)) - Float.intBitsToFloat((int) (this.o0 & 4294967295L));
        long r4 = Float.floatToRawIntBits(r1);
        return ya4.A((((long) Float.floatToRawIntBits(r8)) & 4294967295L) | (r4 << 32), this.l0);
    }

    public final int F(MotionEvent r11) {
        if (this.O0 == false) goto L5;
        this.O0 = false;
        om1 r0 = getComposeViewContext().t;
        int r2 = r11.getMetaState();
        r0.getClass();
        la5.n.setValue(new tn3(r2));
    L5:
        tx2 r1 = this.Q;
        rf2 r3 = r1.c(r11, this);
        int r4 = r11.getActionMasked();
        jw r5 = this.R;
        if (r3 == null) goto L30;
        List r6 = (List) r3.n;
        int r7 = r6.size() - 1;
        if (r7 < 0) goto L17;
    L9:
        int r8 = r7 - 1;
        Object r9 = r6.get(r7);
        if (((qn3) r9).e == false) goto L14;
        if (r4 == 0) goto L18;
        if (r4 != 5) goto L14;
    L18:
        qn3 r10 = (qn3) r9;
        if (r10 == null) goto L21;
        this.o = r10.d;
    L21:
        int r12 = r5.s(r3, this, n(r11));
        r3.o = null;
        if (r4 == 0) goto L25;
        if (r4 == 5) goto L25;
    L26:
        return r12;
    L25:
        if ((r12 & 1) != 0) goto L26;
        int r13 = r11.getPointerId(r11.getActionIndex());
        r1.c.delete(r13);
        r1.b.delete(r13);
        return r12;
    L14:
        if (r8 < 0) goto L17;
        r7 = r8;
    L17:
        r9 = null;
        goto L18
    L30:
        if (r5.n == true) goto L32;
        ((xe2) ((pz1) r5.q).o).a();
        ((cm1) r5.p).c();
    L32:
        return 0;
    }

    public final void G(MotionEvent r18, int r19, long r20, boolean r22) {
        int r2 = r18.getActionMasked();
        int r3 = -1;
        if (r2 == 1) goto L9;
        if (r2 != 6) goto L13;
        r3 = r18.getActionIndex();
    L13:
        int r4 = r18.getPointerCount();
        if (r3 < 0) goto L16;
        int r7 = 1;
    L17:
        int r5 = r4 - r7;
        if (r5 != 0) goto L20;
        return;
    L20:
        MotionEvent.PointerProperties[] r8 = new MotionEvent.PointerProperties[r5];
        int r9 = 0;
    L21:
        if (r9 >= r5) goto L23;
        r8[r9] = new MotionEvent.PointerProperties();
        r9 = r9 + 1;
        goto L21
    L23:
        MotionEvent.PointerCoords[] r10 = new MotionEvent.PointerCoords[r5];
        int r11 = 0;
    L24:
        if (r11 >= r5) goto L26;
        r10[r11] = new MotionEvent.PointerCoords();
        r11 = r11 + 1;
        goto L24
    L26:
        int r12 = 0;
    L27:
        if (r12 >= r5) goto L33;
        if (r3 < 0) goto L31;
        if (r3 > r12) goto L31;
        int r13 = 1;
    L32:
        int r14 = r13 + r12;
        r18.getPointerProperties(r14, r8[r12]);
        MotionEvent.PointerCoords r15 = r10[r12];
        r18.getPointerCoords(r14, r15);
        float r16 = r15.x;
        float r17 = r15.y;
        long r110 = Float.floatToRawIntBits(r16);
        long r6 = p((((long) Float.floatToRawIntBits(r17)) & 4294967295L) | (r110 << 32));
        r15.x = Float.intBitsToFloat((int) (r6 >> 32));
        r15.y = Float.intBitsToFloat((int) (r6 & 4294967295L));
        r12 = r12 + 1;
    L31:
        r13 = 0;
        goto L32
    L33:
        if (r22 == false) goto L35;
        int r111 = 0;
    L37:
        if (r18.getDownTime() != r18.getEventTime()) goto L39;
        long r21 = r20;
    L40:
        MotionEvent r1 = MotionEvent.obtain(r21, r20, r19, r5, r8, r10, r18.getMetaState(), r111, r18.getXPrecision(), r18.getYPrecision(), r18.getDeviceId(), r18.getEdgeFlags(), r18.getSource(), r18.getFlags());
        rf2 r23 = this.Q.c(r1, this);
        r23.getClass();
        this.R.s(r23, this, true);
        r1.recycle();
        return;
    L39:
        r21 = r18.getDownTime();
        goto L40
    L35:
        r111 = r18.getButtonState();
        goto L37
    L16:
        r7 = 0;
        goto L17
    L9:
        if (r19 == 9) goto L13;
        if (r19 == 10) goto L13;
        r3 = 0;
        goto L13
    }

    public final void H(Configuration r4) {
        Configuration r0 = getConfiguration();
        if (h12.c(r0, r4) == true) goto L10;
        setConfiguration(new Configuration(r4));
        if (r0.fontScale == r4.fontScale) goto L7;
    L8:
        setDensity(bu.a(getContext()));
        return;
    L7:
        if (r0.densityDpi != r4.densityDpi) goto L8;
        return;
    }

    public final void I() {
        int[] r1 = this.h0;
        getLocationOnScreen(r1);
        long r2 = this.g0;
        int r5 = (int) (r2 >> 32);
        int r3 = (int) (r2 & 4294967295L);
        boolean r4 = false;
        int r8 = r1[0];
        if (r5 == r8) goto L5;
    L8:
        this.g0 = (4294967295L & ((long) r1[1])) | (((long) r8) << 32);
        if (r5 == Integer.MAX_VALUE) goto L15;
        if (r3 == Integer.MAX_VALUE) goto L15;
        f13 r6 = getRoot().y();
        Object[] r7 = r6.n;
        int r9 = r6.p;
        int r10 = 0;
    L12:
        if (r10 >= r9) goto L14;
        ((c72) r7[r10]).R.p.e0();
        r10 = r10 + 1;
        goto L12
    L14:
        boolean r11 = true;
    L16:
        y();
        View r12 = this.S0;
        if (r12 != null) goto L19;
        r12 = getRootView();
        this.S0 = r12;
    L19:
        yv3 r13 = getRectManager();
        long r14 = this.g0;
        long r15 = ji2.K(this.o0);
        int r16 = r12.getWidth();
        int r17 = r12.getHeight();
        r13.getClass();
        float[] r18 = this.k0;
        if (r18.length >= 16) goto L23;
        int r19 = 0;
    L75:
        pt4 r110 = r13.d;
        if ((r19 & 2) == 0) goto L80;
        r18 = null;
    L80:
        if (r110.b(r14, r15, r18, r16, r17) == false) goto L82;
    L83:
        r4 = true;
    L84:
        r13.g = r4;
        this.f0.b(r11);
        getRectManager().a();
        return;
    L82:
        if (r13.g == false) goto L84;
    L23:
        if (r18[0] != 1.0f) goto L25;
        int r20 = 1;
    L27:
        if (r18[1] != 0.0f) goto L29;
        int r21 = 1;
    L30:
        int r22 = r20 & r21;
        if (r18[2] != 0.0f) goto L33;
        int r23 = 1;
    L34:
        int r24 = r22 & r23;
        if (r18[4] != 0.0f) goto L37;
        int r25 = 1;
    L38:
        int r26 = r24 & r25;
        if (r18[5] != 1.0f) goto L41;
        int r27 = 1;
    L42:
        int r28 = r26 & r27;
        if (r18[6] != 0.0f) goto L45;
        int r29 = 1;
    L46:
        int r30 = r28 & r29;
        if (r18[8] != 0.0f) goto L49;
        int r31 = 1;
    L50:
        int r32 = r30 & r31;
        if (r18[9] != 0.0f) goto L53;
        int r33 = 1;
    L54:
        int r34 = r32 & r33;
        if (r18[10] != 1.0f) goto L57;
        int r35 = 1;
    L58:
        int r36 = r34 & r35;
        if (r18[12] != 0.0f) goto L61;
        int r37 = 1;
    L63:
        if (r18[13] != 0.0f) goto L65;
        int r111 = 1;
    L66:
        int r38 = r37 & r111;
        if (r18[14] != 0.0f) goto L69;
        int r112 = 1;
    L70:
        int r39 = r38 & r112;
        if (r18[15] != 1.0f) goto L73;
        int r40 = 1;
    L74:
        r19 = (r36 << 1) | (r40 & r39);
        goto L75
    L73:
        r40 = 0;
        goto L74
    L69:
        r112 = 0;
        goto L70
    L65:
        r111 = 0;
        goto L66
    L61:
        r37 = 0;
        goto L63
    L57:
        r35 = 0;
        goto L58
    L53:
        r33 = 0;
        goto L54
    L49:
        r31 = 0;
        goto L50
    L45:
        r29 = 0;
        goto L46
    L41:
        r27 = 0;
        goto L42
    L37:
        r25 = 0;
        goto L38
    L33:
        r23 = 0;
        goto L34
    L29:
        r21 = 0;
        goto L30
    L25:
        r20 = 0;
    L15:
        r11 = false;
        goto L16
    L5:
        if (r3 != r1[1]) goto L8;
        if (this.m0 >= 0) goto L15;
        goto L8
    }

    public final void J(float r3) {
        if (l() == true) goto L5;
        return;
    L5:
        if (r3 <= 0.0f) goto L13;
        if (Float.isNaN(this.D0) == false) goto L9;
    L10:
        this.D0 = r3;
        return;
    L9:
        if (r3 > this.D0) goto L10;
        return;
    L13:
        if (r3 < 0.0f) goto L15;
        return;
    L15:
        if (Float.isNaN(this.E0) == false) goto L17;
    L18:
        this.E0 = r3;
        return;
    L17:
        if (r3 < this.E0) goto L18;
    }

    @Override // defpackage.t91
    public final void a(ba1 r13, ba1 r14) {
        if (r13 == null) goto L109;
        ba1 r12 = r13;
        if (r12.n.A == true) goto L6;
        cz1.b("visitAncestors called on an unattached node");
    L6:
        cx2 r15 = r12.n;
        c72 r16 = j51.O(r13);
        x03 r0 = null;
        ArrayList r2 = null;
    L8:
        if (r16 == null) goto L50;
        if ((((cx2) r16.Q.g).q & 2097152) == 0) goto L44;
    L11:
        if (r15 == null) goto L44;
        if ((r15.p & 2097152) == 0) goto L43;
        cx2 r7 = r15;
        f13 r8 = null;
    L15:
        if (r7 == null) goto L43;
        if ((r7 instanceof my1) == false) goto L21;
        if (r2 != null) goto L20;
        r2 = new ArrayList();
    L20:
        r2.add(r7);
        boolean r9 = false;
    L22:
        if (r9 == false) goto L42;
        if ((r7.p & 2097152) == 0) goto L42;
        if ((r7 instanceof fo0) == false) goto L42;
        cx2 r10 = ((fo0) r7).C;
        int r11 = 0;
    L28:
        if (r10 == null) goto L40;
        if ((r10.p & 2097152) == 0) goto L39;
        r11 = r11 + 1;
        if (r11 != 1) goto L34;
        r7 = r10;
        goto L39
    L34:
        if (r8 != null) goto L36;
        r8 = new f13(new cx2[16]);
    L36:
        if (r7 == null) goto L38;
        r8.b(r7);
        r7 = null;
    L38:
        r8.b(r10);
    L39:
        r10 = r10.s;
        goto L28
    L40:
        if (r11 == 1) goto L15;
    L42:
        r7 = j51.c(r8);
        goto L15
    L21:
        r9 = true;
    L43:
        r15 = r15.r;
    L44:
        r16 = r16.t();
        if (r16 == null) goto L49;
        w12 r17 = r16.Q;
        if (r17 == null) goto L49;
        r15 = (sq4) r17.f;
    L49:
        r15 = null;
        goto L8
    L50:
        if (r2 == null) goto L155;
        if (r14 != null) goto L54;
    L100:
        int r18 = r2.size();
        int r19 = 0;
    L101:
        if (r19 >= r18) goto L156;
        my1 r110 = (my1) r2.get(r19);
        if (r0 == null) goto L105;
        boolean r1 = r0.c(r110);
    L106:
        if (r1 == true) goto L108;
        r110.N();
    L108:
        r19 = r19 + 1;
        goto L101
    L105:
        r1 = false;
        goto L106
    L156:
        return;
    L54:
        if (r14.n.A == true) goto L56;
        cz1.b("visitAncestors called on an unattached node");
    L56:
        cx2 r111 = r14.n;
        c72 r112 = j51.O(r14);
        x03 r113 = null;
    L57:
        if (r112 == null) goto L99;
        if ((((cx2) r112.Q.g).q & 2097152) == 0) goto L93;
    L60:
        if (r111 == null) goto L93;
        if ((r111.p & 2097152) == 0) goto L92;
        cx2 r3 = r111;
        f13 r20 = null;
    L64:
        if (r3 == null) goto L92;
        if ((r3 instanceof my1) == false) goto L70;
        if (r113 != null) goto L69;
        x03 r114 = w54.a;
        r113 = new x03();
    L69:
        r113.a(r3);
        boolean r21 = false;
    L71:
        if (r21 == false) goto L91;
        if ((r3.p & 2097152) == 0) goto L91;
        if ((r3 instanceof fo0) == false) goto L91;
        cx2 r22 = ((fo0) r3).C;
        int r23 = 0;
    L77:
        if (r22 == null) goto L89;
        if ((r22.p & 2097152) == 0) goto L88;
        r23 = r23 + 1;
        if (r23 != 1) goto L83;
        r3 = r22;
        goto L88
    L83:
        if (r20 != null) goto L85;
        r20 = new f13(new cx2[16]);
    L85:
        if (r3 == null) goto L87;
        r20.b(r3);
        r3 = null;
    L87:
        r20.b(r22);
    L88:
        r22 = r22.s;
        goto L77
    L89:
        if (r23 == 1) goto L64;
    L91:
        r3 = j51.c(r20);
        goto L64
    L70:
        r21 = true;
    L92:
        r111 = r111.r;
    L93:
        r112 = r112.t();
        if (r112 == null) goto L98;
        w12 r115 = r112.Q;
        if (r115 == null) goto L98;
        r111 = (sq4) r115.f;
    L98:
        r111 = null;
        goto L57
    L99:
        r0 = r113;
        goto L100
    L155:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList r13, int r14, int r15) {
        ba1 r0 = (ba1) ((ey) getFocusOwner()).c;
        if (r0.A == true) goto L6;
        return;
    L6:
        if (r0.n.A == true) goto L8;
        cz1.b("visitSubtreeIf called on an unattached node");
    L8:
        f13 r1 = new f13(new cx2[16]);
        cx2 r2 = r0.n;
        cx2 r4 = r2.s;
        if (r4 != null) goto L11;
        j51.b(r1, r2);
    L12:
        int r3 = r1.p;
        if (r3 == 0) goto L149;
        cx2 r5 = (cx2) r1.k(r3 - 1);
        if ((r5.q & 1024) == 0) goto L108;
        cx2 r6 = r5;
    L17:
        if (r6 == null) goto L108;
        if (r6.A == false) goto L108;
        if ((r6.p & 1024) == 0) goto L107;
        cx2 r7 = r6;
        f13 r8 = null;
    L23:
        if (r7 == null) goto L107;
        int r10 = 0;
        if ((r7 instanceof ba1) == true) goto L26;
        if ((r7.p & 1024) == 0) goto L106;
        if ((r7 instanceof fo0) == false) goto L106;
        cx2 r9 = ((fo0) r7).C;
    L92:
        if (r9 == null) goto L104;
        if ((r9.p & 1024) == 0) goto L103;
        r10 = r10 + 1;
        if (r10 != 1) goto L98;
        r7 = r9;
        goto L103
    L98:
        if (r8 != null) goto L100;
        r8 = new f13(new cx2[16]);
    L100:
        if (r7 == null) goto L102;
        r8.b(r7);
        r7 = null;
    L102:
        r8.b(r9);
    L103:
        r9 = r9.s;
        goto L92
    L104:
        if (r10 == 1) goto L23;
    L106:
        r7 = j51.c(r8);
        goto L23
    L26:
        ba1 r11 = (ba1) r7;
        if (r11.A == false) goto L106;
        if (r11.s0().a == false) goto L106;
        super.addFocusables(r13, r14, r15);
        ba1 r16 = (ba1) ((ey) getFocusOwner()).c;
        if (r16.A == true) goto L34;
    L84:
        if (r13 == null) goto L109;
        r13.remove(this);
        return;
    L109:
        return;
    L34:
        if (r16.n.A == true) goto L36;
        cz1.b("visitSubtreeIf called on an unattached node");
    L36:
        f13 r17 = new f13(new cx2[16]);
        cx2 r18 = r16.n;
        cx2 r12 = r18.s;
        if (r12 != null) goto L39;
        j51.b(r17, r18);
    L40:
        int r19 = r17.p;
        if (r19 == 0) goto L84;
        cx2 r110 = (cx2) r17.k(r19 - 1);
        if ((r110.q & 1024) == 0) goto L83;
        cx2 r20 = r110;
    L45:
        if (r20 == null) goto L83;
        if (r20.A == false) goto L83;
        if ((r20.p & 1024) == 0) goto L82;
        cx2 r21 = r20;
        f13 r22 = null;
    L51:
        if (r21 == null) goto L82;
        if ((r21 instanceof ba1) == true) goto L54;
        if ((r21.p & 1024) == 0) goto L81;
        if ((r21 instanceof fo0) == false) goto L81;
        cx2 r23 = ((fo0) r21).C;
        int r24 = 0;
    L67:
        if (r23 == null) goto L79;
        if ((r23.p & 1024) == 0) goto L78;
        r24 = r24 + 1;
        if (r24 != 1) goto L73;
        r21 = r23;
        goto L78
    L73:
        if (r22 != null) goto L75;
        r22 = new f13(new cx2[16]);
    L75:
        if (r21 == null) goto L77;
        r22.b(r21);
        r21 = null;
    L77:
        r22.b(r23);
    L78:
        r23 = r23.s;
        goto L67
    L79:
        if (r24 == 1) goto L51;
    L81:
        r21 = j51.c(r22);
        goto L51
    L54:
        ba1 r25 = (ba1) r21;
        if (r25.A == false) goto L81;
        x91 r26 = r25.s0();
        if (r25.A == false) goto L81;
        if (r26.a == false) goto L81;
        return;
    L82:
        r20 = r20.s;
    L83:
        j51.b(r17, r110);
        goto L40
    L39:
        r17.b(r12);
    L107:
        r6 = r6.s;
    L108:
        j51.b(r1, r5);
        goto L12
    L149:
        return;
    L11:
        r1.b(r4);
        goto L12
    }

    @Override // android.view.ViewGroup
    public final void addView(View r3, int r4) {
        r3.getClass();
        ViewGroup.LayoutParams r0 = r3.getLayoutParams();
        if (r0 != null) goto L5;
        r0 = generateDefaultLayoutParams();
    L5:
        addViewInLayout(r3, r4, r0, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray r11) {
        if (d() == false) goto L57;
        y9 r0 = m71getAutofillManager();
        int r1 = 0;
        if (r0 == null) goto L30;
        int r2 = r11.size();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L30;
        int r4 = r11.keyAt(r3);
        AutofillValue r5 = j3.n(r11.get(r4));
        c72 r6 = (c72) r0.o.c.b(r4);
        if (r6 == null) goto L29;
        e94 r7 = r6.v();
        if (r7 == null) goto L29;
        w03 r8 = r7.n;
        Object r9 = r8.g(d94.g);
        Object r10 = null;
        if (r9 != null) goto L15;
        r9 = null;
    L15:
        w2 r12 = (w2) r9;
        if (r12 == null) goto L20;
        if1 r13 = (if1) r12.b;
        if (r13 == null) goto L20;
        Boolean r14 = (Boolean) r13.invoke(new he(tn.i(r5).toString()));
    L20:
        Object r15 = r8.g(d94.h);
        if (r15 == null) goto L24;
        r10 = r15;
    L24:
        w2 r16 = (w2) r10;
        if (r16 == null) goto L29;
        if1 r17 = (if1) r16.b;
        if (r17 == null) goto L29;
        Boolean r18 = (Boolean) r17.invoke(new wb(r5));
    L29:
        r3 = r3 + 1;
    L30:
        x9 r19 = m70getAutofill();
        if (r19 == null) goto L71;
        wn r110 = r19.b;
        if (r110.a.isEmpty() == true) goto L72;
        int r20 = r11.size();
    L36:
        if (r1 >= r20) goto L73;
        int r21 = r11.keyAt(r1);
        AutofillValue r22 = j3.n(r11.get(r21));
        if (tn.C(r22) == false) goto L45;
        tn.i(r22).toString();
        if (r110.a.get(Integer.valueOf(r21)) == null) goto L50;
        kf2.k();
        return;
    L50:
        r1 = r1 + 1;
        goto L36
    L45:
        if (tn.D(r22) == true) goto L56;
        if (tn.B(r22) == true) goto L54;
        if (tn.z(r22) == false) goto L50;
        throw new p63("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
    L54:
        throw new p63("An operation is not implemented: b/138604541: Add onFill() callback for list");
    L56:
        throw new p63("An operation is not implemented: b/138604541: Add onFill() callback for date");
    L73:
        return;
    L72:
        return;
    L71:
        return;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int r4) {
        long r1 = this.o;
        return this.J.m(r4, r1, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int r4) {
        long r1 = this.o;
        return this.J.m(r4, r1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r7) {
        q03 r0 = this.N;
        if (isAttachedToWindow() == true) goto L5;
        i(getRoot());
    L5:
        q(true);
        jh4.j().m();
        this.P = true;
        Trace.beginSection("AndroidOwner:draw");
        nz r1 = getCanvasHolder();     // Catch: Throwable -> L30
        aa r2 = r1.a;     // Catch: Throwable -> L30
        Canvas r3 = r2.a;     // Catch: Throwable -> L30
        r2.a = r7;     // Catch: Throwable -> L30
        getRoot().i(r2, null);     // Catch: Throwable -> L30
        r1.a.a = r3;     // Catch: Throwable -> L30
        if (r0.i() == false) goto L11;
        int r4 = r0.b;     // Catch: Throwable -> L30
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L11;
        ((vj1) ((tb3) r0.f(r5))).g();     // Catch: Throwable -> L30
        r5 = r5 + 1;     // Catch: Throwable -> L30
    L11:
        int r6 = u65.n;     // Catch: Throwable -> L30
        r0.d();     // Catch: Throwable -> L30
        this.P = false;     // Catch: Throwable -> L30
        Trace.endSection();
        q03 r8 = this.O;
        if (r8 == null) goto L16;
        r0.b(r8);
        r8.d();
    L16:
        if (l() == true) goto L18;
        return;
    L18:
        if (Float.compare(this.D0, this.F0) == 0) goto L20;
        float r9 = this.D0;
        this.F0 = r9;
        re.a(this, r9);
    L20:
        View r10 = this.y;
        if (r10 != null) goto L23;
    L28:
        this.D0 = Float.NaN;
        this.E0 = Float.NaN;
        return;
    L23:
        if (Float.compare(this.E0, this.G0) == 0) goto L26;
        float r11 = this.E0;
        this.G0 = r11;
        re.a(r10, r11);
    L26:
        if (Float.isNaN(this.E0) == true) goto L28;
        r10.invalidate();
        drawChild(r7, r10, getDrawingTime());
    L30:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014d: MOVE (r13v12 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DECLARE_VAR] (LINE:334) in method: ra.dispatchGenericMotionEvent(android.view.MotionEvent):boolean, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent r25) {
        boolean r2 = this.J0;
        ia r3 = this.I0;
        if (r2 == false) goto L6;
        removeCallbacks(r3);
        r3.run();
    L6:
        if (m(r25) == false) goto L8;
    L78:
        return false;
    L8:
        if (isAttachedToWindow() == false) goto L78;
        ya r4 = this.J;
        ra r5 = r4.q;
        AccessibilityManager r6 = r4.t;
        if (r6.isEnabled() == true) goto L13;
    L52:
        int r23 = 1;
        boolean r7 = false;
    L53:
        int r8 = r25.getActionMasked();
        if (r8 == 7) goto L71;
        if (r8 == 10) goto L59;
    L74:
        if ((h(r25) & r23) != 0) goto L77;
        if (r7 == false) goto L78;
    L77:
        return r23;
    L59:
        if (n(r25) == false) goto L74;
        if (r25.getToolType(0) == 3) goto L63;
    L65:
        MotionEvent r9 = this.z0;
        if (r9 == null) goto L68;
        r9.recycle();
    L68:
        this.z0 = MotionEvent.obtainNoHistory(r25);
        this.J0 = r23;
        postDelayed(r3, 8);
        return r7;
    L63:
        if (r25.getButtonState() == 0) goto L65;
    L72:
        return r7;
    L71:
        if (o(r25) == true) goto L74;
    L13:
        if (r6.isTouchExplorationEnabled() == false) goto L52;
        int r10 = r25.getAction();
        if (r10 != 7) goto L17;
    L28:
        float r11 = r25.getX();
        float r15 = r25.getY();
        r5.q(true);
        fm1 r20 = new fm1();
        r23 = 1;
        c72 r12 = r5.getRoot();
        long r13 = (Float.floatToRawIntBits(r11) << 32) | (((long) Float.floatToRawIntBits(r15)) & 4294967295L);
        w12 r14 = r12.Q;
        f63 r16 = (f63) r14.e;
        k52 r17 = f63.h0;
        ((f63) r14.e).G0(f63.m0, r16.x0(r13), r20, 1, true);
        q03 r18 = r20.n;
        int r19 = r18.b;
    L29:
        r19 = r19 - 1;
        if ((-1) >= r19) goto L44;
        Object r21 = r18.f(r19);
        r21.getClass();
        c72 r22 = j51.O((cx2) r21);
        if (r5.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(r22) != null) goto L42;
        if (r22.Q.d(8) == false) goto L29;
        int r110 = r4.A(r22.o);
        i94 r24 = hw.a(r22, false);
        if (wr1.I(r24) == false) goto L29;
        if (fh0.p(r24) == true) goto L29;
    L45:
        boolean r26 = r5.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(r25);
        int r27 = r4.r;
        if (r27 == r110) goto L49;
        r4.r = r110;
        ya.E(r4, r110, 128, null, 12);
        ya.E(r4, r27, 256, null, 12);
    L49:
        if (r110 != Integer.MIN_VALUE) goto L51;
        r7 = r26;
        goto L53
    L51:
        r7 = true;
        goto L53
    L42:
        kf2.k();
        return false;
    L44:
        r110 = Integer.MIN_VALUE;
        goto L45
    L17:
        if (r10 == 9) goto L28;
        if (r10 == 10) goto L21;
        r7 = false;
    L20:
        r23 = 1;
        goto L53
    L21:
        int r28 = r4.r;
        if (r28 == Integer.MIN_VALUE) goto L27;
        if (r28 == Integer.MIN_VALUE) goto L26;
        r4.r = Integer.MIN_VALUE;
        ya.E(r4, Integer.MIN_VALUE, 128, null, 12);
        ya.E(r4, r28, 256, null, 12);
    L26:
        r7 = true;
        r23 = 1;
        goto L53
    L27:
        r7 = r5.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(r25);
        goto L20
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent r5) {
        int r1 = 0;
        if (isFocused() == false) goto L12;
        om1 r0 = getComposeViewContext().t;
        int r2 = r5.getMetaState();
        r0.getClass();
        la5.n.setValue(new tn3(r2));
        u91 r3 = getFocusOwner();
        ey r4 = (ey) r3;
        if (r4.d(r5, new e90(4)) == false) goto L7;
        return true;
    L7:
        if (super.dispatchKeyEvent(r5) == true) goto L14;
        return false;
    L14:
        return true;
    L12:
        u91 r6 = getFocusOwner();
        ey r7 = (ey) r6;
        return r7.d(r5, new fa(r1, this, r5));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent r12) {
        if (isFocused() == false) goto L49;
        ey r0 = (ey) getFocusOwner();
        if (((s91) r0.d).e == false) goto L7;
        System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
        goto L49
    L7:
        ba1 r1 = te5.p((ba1) r0.c);
        if (r1 == null) goto L49;
        if (r1.n.A == true) goto L12;
        cz1.b("visitAncestors called on an unattached node");
    L12:
        cx2 r3 = r1.n;
        c72 r2 = j51.O(r1);
    L13:
        if (r2 == null) goto L49;
        if ((((cx2) r2.Q.g).q & 131072) == 0) goto L42;
    L16:
        if (r3 == null) goto L42;
        if ((r3.p & 131072) == 0) goto L41;
        cx2 r4 = r3;
        f13 r7 = null;
    L20:
        if (r4 == null) goto L41;
        if ((r4.p & 131072) == 0) goto L40;
        if ((r4 instanceof fo0) == false) goto L40;
        cx2 r8 = ((fo0) r4).C;
        int r9 = 0;
    L26:
        if (r8 == null) goto L38;
        if ((r8.p & 131072) == 0) goto L37;
        r9 = r9 + 1;
        if (r9 != 1) goto L32;
        r4 = r8;
        goto L37
    L32:
        if (r7 != null) goto L34;
        r7 = new f13(new cx2[16]);
    L34:
        if (r4 == null) goto L36;
        r7.b(r4);
        r4 = null;
    L36:
        r7.b(r8);
    L37:
        r8 = r8.s;
        goto L26
    L38:
        if (r9 == 1) goto L20;
    L40:
        r4 = j51.c(r7);
    L41:
        r3 = r3.r;
    L42:
        r2 = r2.t();
        if (r2 == null) goto L47;
        w12 r5 = r2.Q;
        if (r5 == null) goto L47;
        r3 = (sq4) r5.f;
    L47:
        r3 = null;
    L49:
        if (super.dispatchKeyEventPreIme(r12) == false) goto L51;
        return true;
    L51:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure r2, int r3) {
        if (d() == true) goto L5;
        return;
    L5:
        this.Q0 = true;
        super.dispatchProvideAutofillStructure(r2, r3);     // Catch: Throwable -> L9
        this.Q0 = false;
        x(r2);
        return;
    L9:
        th = move-exception;
        this.Q0 = false;
        throw th;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure r3) {
        if (Build.VERSION.SDK_INT >= 28) goto L6;
        za.a.a(r3, getView());
        return;
    L6:
        super.dispatchProvideStructure(r3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent r11) {
        if (this.J0 == false) goto L14;
        ia r0 = this.I0;
        removeCallbacks(r0);
        MotionEvent r2 = this.z0;
        r2.getClass();
        if (r11.getActionMasked() == 0) goto L7;
    L12:
        r0.run();
        goto L14
    L7:
        if (r2.getSource() != r11.getSource()) goto L12;
        if (r2.getToolType(0) != r11.getToolType(0)) goto L12;
        this.J0 = false;
    L14:
        if (m(r11) == false) goto L16;
    L76:
        return false;
    L16:
        if (isAttachedToWindow() == false) goto L76;
        if (r11.getActionMasked() == 2) goto L21;
    L23:
        int r1 = h(r11);
        int r3 = 1;
        if ((r1 & 2) == 0) goto L27;
        getParent().requestDisallowInterceptTouchEvent(true);
    L27:
        if (r11.getActionMasked() != 0) goto L29;
    L32:
        boolean r4 = true;
    L34:
        if (r11.isFromSource(8194) == false) goto L36;
    L39:
        boolean r5 = true;
    L40:
        if (r4 == false) goto L74;
        if (r5 == false) goto L74;
        Object r6 = getParent();
        if ((r6 instanceof View) == false) goto L45;
        View r7 = (View) r6;
    L46:
        if (r7 == null) goto L49;
        Object r8 = r7.getTag(R.id.auto_clear_focus_behavior_tag);
        if (r8 == null) goto L49;
    L51:
        if (r8.equals(new on(r3)) == false) goto L74;
        ba1 r9 = ((ey) getFocusOwner()).f();
        if (r9 == null) goto L74;
        f63 r10 = j51.N(r9);
        wv3 r12 = wr1.n(r10).C(r10, true);
        float r13 = r11.getX();
        float r14 = r11.getY();
        long r15 = (Float.floatToRawIntBits(r13) << 32) | (((long) Float.floatToRawIntBits(r14)) & 4294967295L);
        float r16 = Float.intBitsToFloat((int) (r15 >> 32));
        float r17 = Float.intBitsToFloat((int) (r15 & 4294967295L));
        if (r16 < r12.a) goto L57;
        boolean r18 = true;
    L59:
        if (r16 >= r12.c) goto L61;
        boolean r19 = true;
    L62:
        boolean r110 = r19 & r18;
        if (r17 < r12.b) goto L65;
        boolean r20 = true;
    L66:
        boolean r111 = r110 & r20;
        if (r17 >= r12.d) goto L69;
        boolean r21 = true;
    L71:
        if ((r111 & r21) == true) goto L74;
        ((ey) getFocusOwner()).b(8, false, true);
        goto L74
    L69:
        r21 = false;
        goto L71
    L65:
        r20 = false;
        goto L66
    L61:
        r19 = false;
        goto L62
    L57:
        r18 = false;
    L49:
        r8 = new on(r3);
        goto L51
    L45:
        r7 = null;
    L74:
        if ((r1 & 1) == 0) goto L76;
        return true;
    L36:
        if (r11.isFromSource(1048584) == true) goto L39;
        r5 = false;
        goto L40
    L29:
        if (r11.getActionMasked() == 5) goto L32;
        r4 = false;
        goto L34
    L21:
        if (o(r11) == true) goto L23;
        goto L23
    }

    public final View findViewByAccessibilityIdTraversal(int r7) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        Method r0 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});     // Catch: NoSuchMethodException -> L12
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L12
        Object r6 = r0.invoke(this, new Object[]{Integer.valueOf(r7)});     // Catch: NoSuchMethodException -> L12
        if ((r6 instanceof View) == true) goto L7;
        return null;
    L7:
        return (View) r6;
    L9:
        return te5.q(this, r7);
    L14:
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r8, int r9) {
        if (r8 == null) goto L49;
        if (this.f0.c == true) goto L49;
        View r0 = getRootView();
        r0.getClass();
        View r1 = FocusFinder.getInstance().findNextFocus((ViewGroup) r0, r8, r9);
        wv3 r2 = null;
        if (r1 != null) goto L9;
    L16:
        r1 = null;
    L17:
        if (r8 != this) goto L23;
        ba1 r3 = te5.p((ba1) ((ey) getFocusOwner()).c);
        if (r3 == null) goto L21;
        r2 = te5.r(r3);
    L21:
        if (r2 != null) goto L24;
        r2 = r91.a(r8, this);
    L24:
        o91 r4 = r91.c(r9);
        if (r4 == null) goto L27;
        int r5 = r4.a;
    L28:
        jx3 r6 = new jx3();
        if (((ey) getFocusOwner()).e(r5, r2, new ea(0, r6)) != null) goto L31;
        return r8;
    L31:
        Object r7 = r6.n;
        if (r7 != null) goto L36;
        if (r1 == null) goto L35;
    L47:
        return r1;
    L35:
        return super.focusSearch(r8, r9);
    L36:
        if (r1 != null) goto L39;
    L46:
        return this;
    L39:
        if (r5 == 1) goto L46;
        if (r5 == 2) goto L46;
        if (kb4.F(te5.r((ba1) r7), r91.a(r1, this), r2, r5) == false) goto L47;
    L27:
        r5 = 6;
        goto L28
    L23:
        r2 = r91.a(r8, this);
        goto L24
    L9:
        if (r1.equals(this) == true) goto L16;
        ViewParent r10 = r1.getParent();
    L12:
        if (r10 == null) goto L16;
        if (r10 == this) goto L17;
        r10 = r10.getParent();
    L49:
        return super.focusSearch(r8, r9);
    }

    public final void g(c72 r1, boolean r2) {
        this.f0.g(r1, r2);
    }

    public f3 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final id getAndroidViewsHandler$ui() {
        if (this.c0 != null) goto L5;
        id r0 = new id(getContext());
        this.c0 = r0;
        addView(r0, -1);
        requestLayout();
    L5:
        id r2 = this.c0;
        r2.getClass();
        return r2;
    }

    public /* bridge */ /* synthetic */ sn getAutofill() {
        return m70getAutofill();
    }

    public /* bridge */ /* synthetic */ vn getAutofillManager() {
        return m71getAutofillManager();
    }

    public wn getAutofillTree() {
        return this.M;
    }

    public y30 getClipboard() {
        return getComposeViewContext().n;
    }

    public z30 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final h80 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.P0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.S.getValue();
    }

    public final lb getContentCaptureManager$ui() {
        return this.K;
    }

    public ne0 getCoroutineContext() {
        return this.A;
    }

    public oo0 getDensity() {
        return (oo0) this.x.getValue();
    }

    public /* bridge */ /* synthetic */ nu0 getDragAndDropManager() {
        return m72getDragAndDropManager();
    }

    public wv3 getEmbeddedViewFocusRect() {
        if (isFocused() == false) goto L9;
        ba1 r2 = te5.p((ba1) ((ey) getFocusOwner()).c);
        if (r2 != null) goto L7;
        return null;
    L7:
        return te5.r(r2);
    L9:
        View r0 = findFocus();
        if (r0 != null) goto L12;
        return null;
    L12:
        return r91.a(r0, this);
    }

    public u91 getFocusOwner() {
        return this.z;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect r5) {
        wv3 r0 = getEmbeddedViewFocusRect();
        if (r0 == null) goto L6;
        r5.left = Math.round(r0.a);
        r5.top = Math.round(r0.b);
        r5.right = Math.round(r0.c);
        r5.bottom = Math.round(r0.d);
        return;
    L6:
        u91 r1 = getFocusOwner();
        ey r2 = (ey) r1;
        if (h12.c(r2.e(6, null, new k2(1, 0)), Boolean.TRUE) == true) goto L10;
        r5.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        return;
    L10:
        super.getFocusedRect(r5);
    }

    public ha1 getFontFamilyResolver() {
        return (ha1) this.u0.getValue();
    }

    public ga1 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final ga2 getFrameEndScheduler$ui() {
        return this.r;
    }

    public rj1 getGraphicsContext() {
        return this.L;
    }

    public kl1 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        if (this.f0.b.o() == false) goto L5;
        return true;
    L5:
        if (this.v.isEmpty() == false) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX INFO: renamed from: getInputModeManager, reason: collision with other method in class */
    public sz1 m73getInputModeManager() {
        sz1 r0 = this.w0;
        if (r0 == null) goto L5;
    L9:
        return r0;
    L5:
        if (isInTouchMode() == false) goto L7;
        int r1 = 1;
    L8:
        r0 = new sz1(r1);
        this.w0 = r0;
        goto L9
    L7:
        r1 = 2;
        goto L8
    }

    public final xz1 getInsetsListener() {
        return this.E;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.m0;
    }

    @Override // android.view.View, android.view.ViewParent
    public r62 getLayoutDirection() {
        return (r62) this.v0.getValue();
    }

    public /* bridge */ /* synthetic */ e02 getLayoutNodes() {
        return m74getLayoutNodes();
    }

    public vd2 getLocaleList() {
        return (vd2) this.T.getValue();
    }

    public long getMeasureIteration() {
        ri2 r2 = this.f0;
        if (r2.c == true) goto L6;
        cz1.a("measureIteration should be only used during the measure/layout pass");
    L6:
        return r2.g;
    }

    public ex2 getModifierLocalManager() {
        return this.x0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: collision with other method in class */
    public ra m75getOutOfFrameExecutor() {
        if (isAttachedToWindow() == false) goto L5;
        return this;
    L5:
        return null;
    }

    public ig3 getPlacementScope() {
        k52 r0 = kg3.a;
        return new df2(1, this);
    }

    public final wf1 getPlayNavigationSoundEffect$ui() {
        return this.K0;
    }

    public nn3 getPointerIconService() {
        return this.T0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final dy1 m68getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.q;
    }

    public yv3 getRectManager() {
        return this.H;
    }

    public y14 getRetainedValuesStore() {
        return this.u;
    }

    public c72 getRoot() {
        return this.F;
    }

    public b34 getRootForTest() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bs0 getSavedStateRegistry() {
        bs0 r0 = this.t;
        if (r0 != null) goto L23;
        h80 r1 = getComposeViewContext();
        r1.g();
        j54 r2 = r1.e;
        r2.getClass();
        ViewParent r3 = getParent();
        r3.getClass();
        View r4 = (View) r3;
        Object r5 = r4.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap r6 = null;
        if ((r5 instanceof String) == false) goto L7;
        String r7 = (String) r5;
    L8:
        if (r7 != null) goto L10;
        r7 = String.valueOf(r4.getId());
    L10:
        String r8 = xa3.g("SaveableStateRegistry:", r7);
        rm3 r9 = r2.f();
        Bundle r10 = r9.A(r8);
        if (r10 == null) goto L16;
        r6 = new LinkedHashMap();
        Iterator<T> r11 = r10.keySet().iterator();
    L14:
        if (r11.hasNext() == false) goto L16;
        String r12 = (String) r11.next();
        ArrayList r13 = r10.getParcelableArrayList(r12);
        r13.getClass();
        r6.put(r12, r13);
    L16:
        boolean r14 = false;
        r14 = false;
        k2 r15 = new k2(13, r14 ? 1 : 0);
        wl4 r16 = z44.a;
        y44 r17 = new y44(r6, r15);
        if (r9.G(r8) == null) goto L25;
    L21:
        bs0 r18 = new bs0(r17, new ds0(r14, r9, r8));
        this.t = r18;
        return r18;
    L25:
        r9.L(r8, new cs0(r14 ? 1 : 0, r17));     // Catch: IllegalArgumentException -> L24
        r14 = true;
        goto L21
    L7:
        r7 = null;
        goto L8
    L23:
        return r0;
    }

    public final boolean getScrollCaptureInProgress() {
        if (Build.VERSION.SDK_INT < 31) goto L9;
        rm2 r0 = this.R0;
        if (r0 == null) goto L9;
        if (((Boolean) ((zd3) r0.o).getValue()).booleanValue() != true) goto L9;
        return true;
    L9:
        ViewParent r2 = getParent();
    L10:
        if (r2 == null) goto L16;
        if ((r2 instanceof ra) == true) goto L14;
        r2 = r2.getParent();
        goto L10
    L14:
        return ((ra) r2).getScrollCaptureInProgress();
    L16:
        return false;
    }

    public l94 getSemanticsOwner() {
        return this.I;
    }

    public e72 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT < 30) goto L7;
        return oe.a.a(this);
    L7:
        return this.b0;
    }

    public wb3 getSnapshotObserver() {
        return this.a0;
    }

    public wh4 getSoftwareKeyboardController() {
        om0 r0 = this.t0;
        if (r0 != null) goto L6;
        getTextInputService();
        om0 r1 = new om0(4);
        this.t0 = r1;
        return r1;
    L6:
        return r0;
    }

    public is4 getTextInputService() {
        is4 r0 = this.r0;
        if (r0 != null) goto L6;
        getLegacyTextInputServiceAndroid();
        is4 r1 = new is4();
        new AtomicReference(null);
        this.r0 = r1;
        return r1;
    L6:
        return r0;
    }

    public at4 getTextToolbar() {
        pa r0 = this.y0;
        if (r0 != null) goto L6;
        pa r1 = new pa(4);
        this.y0 = r1;
        return r1;
    L6:
        return r0;
    }

    public final a34 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    public m65 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public ka5 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final int h(MotionEvent r17) {
        ra r1 = this;
        r1.removeCallbacks(r1.H0);
        z(r17);     // Catch: Throwable -> L134
        r1.n0 = true;     // Catch: Throwable -> L134
        r1.q(false);     // Catch: Throwable -> L134
        Trace.beginSection("AndroidOwner:onTouch");     // Catch: Throwable -> L134
        int r9 = r17.getActionMasked();     // Catch: Throwable -> L10
        MotionEvent r2 = r1.z0;     // Catch: Throwable -> L10
        if (r2 != null) goto L7;
    L9:
        boolean r11 = false;
    L12:
        jw r13 = r1.R;
        if (r2 != null) goto L144;
    L37:
        MotionEvent r14 = r2;
    L42:
        if (r17.getToolType(0) != 3) goto L44;
        boolean r3 = true;
    L46:
        if (r11 == true) goto L55;
        if (r3 == false) goto L55;
        if (r9 == 3) goto L55;
        if (r9 == 9) goto L55;
        if (n(r17) == false) goto L55;
        ra r4 = this;
        r4.G(r17, 9, r17.getEventTime(), true);     // Catch: Throwable -> L10
    L57:
        if (r17.getButtonState() == 0) goto L59;
        boolean r0 = true;
    L61:
        if (r9 != 8) goto L67;
        if (r0 == true) goto L67;
        if (r14 == null) goto L67;
        if (r14.isFromSource(4098) == true) goto L67;
        boolean r5 = true;
    L68:
        if (r14 == null) goto L70;
        r14.recycle();     // Catch: Throwable -> L10
    L70:
        MotionEvent r6 = r4.z0;     // Catch: Throwable -> L10
        if (r6 != null) goto L73;
    L118:
        r4.z0 = MotionEvent.obtainNoHistory(r17);     // Catch: Throwable -> L10
        if (r5 == false) goto L121;
        r4.G(r17, 10, r17.getEventTime(), true);     // Catch: Throwable -> L35
    L121:
        int r10 = F(r17);     // Catch: Throwable -> L35
        Trace.endSection();     // Catch: Throwable -> L136
        if ((r10 & 4) == 0) goto L125;
    L124:
        ra r7 = this;
    L138:
        r7.n0 = false;
        return r10;
    L125:
        if (r5 == false) goto L124;
        cm1 r8 = (cm1) r13.p;     // Catch: Throwable -> L136
        if (r8.d == false) goto L129;
        r8.d = true;     // Catch: Throwable -> L136
    L130:
        r7 = this;
        r7.G(r17, 9, r17.getEventTime(), true);     // Catch: Throwable -> L134
        goto L138
    L129:
        r8.g.a.g();     // Catch: Throwable -> L136
    L136:
        th = th;
        r1 = this;
    L142:
        r1.n0 = false;
        throw th;
    L35:
        th = th;
    L140:
        Trace.endSection();     // Catch: Throwable -> L134
        throw th;     // Catch: Throwable -> L134
    L73:
        if (r6.getAction() != 10) goto L118;
        MotionEvent r12 = r4.z0;     // Catch: Throwable -> L10
        if (r12 == null) goto L77;
        int r15 = r12.getPointerId(0);     // Catch: Throwable -> L10
    L78:
        int r16 = r17.getAction();     // Catch: Throwable -> L10
        tx2 r18 = r4.Q;
        if (r16 != 9) goto L86;
        if (r17.getHistorySize() != 0) goto L86;
        if (r15 < 0) goto L118;
        r18.c.delete(r15);     // Catch: Throwable -> L10
        r18.b.delete(r15);     // Catch: Throwable -> L10
    L86:
        if (r17.getAction() != 0) goto L118;
        if (r17.getHistorySize() != 0) goto L118;
        MotionEvent r19 = r4.z0;     // Catch: Throwable -> L10
        float r20 = Float.NaN;
        if (r19 == null) goto L92;
        float r21 = r19.getX();     // Catch: Throwable -> L10
    L93:
        MotionEvent r22 = r4.z0;     // Catch: Throwable -> L10
        if (r22 == null) goto L96;
        r20 = r22.getY();     // Catch: Throwable -> L10
    L96:
        float r23 = r17.getX();     // Catch: Throwable -> L10
        float r24 = r17.getY();     // Catch: Throwable -> L10
        if (r21 == r23) goto L99;
    L101:
        boolean r25 = true;
    L102:
        MotionEvent r26 = r4.z0;     // Catch: Throwable -> L10
        if (r26 == null) goto L105;
        long r27 = r26.getEventTime();     // Catch: Throwable -> L10
    L107:
        if (r27 == r17.getEventTime()) goto L109;
        boolean r28 = true;
    L110:
        if (r25 == true) goto L112;
        if (r28 == false) goto L118;
    L112:
        if (r15 < 0) goto L114;
        r18.c.delete(r15);     // Catch: Throwable -> L10
        r18.b.delete(r15);     // Catch: Throwable -> L10
    L114:
        cm1 r29 = (cm1) r13.p;     // Catch: Throwable -> L10
        if (r29.d == false) goto L117;
        r29.d = true;     // Catch: Throwable -> L10
        goto L118
    L117:
        r29.g.a.g();     // Catch: Throwable -> L10
        goto L118
    L109:
        r28 = false;
        goto L110
    L105:
        r27 = -1;
        goto L107
    L99:
        if (r20 != r24) goto L101;
        r25 = false;
        goto L102
    L92:
        r21 = Float.NaN;
        goto L93
    L77:
        r15 = -1;
    L67:
        r5 = false;
        goto L68
    L59:
        r0 = false;
    L55:
        r4 = this;
        goto L57
    L44:
        r3 = false;
        goto L46
    L144:
        if (r2.getSource() == r17.getSource()) goto L17;
    L20:
        boolean r30 = true;
    L21:
        if (r30 == false) goto L37;
        if (r2.getButtonState() == 0) goto L25;
    L24:
        r14 = r2;
        if (r13.n == true) goto L42;
        ((xe2) ((pz1) r13.q).o).a();     // Catch: Throwable -> L35
        ((cm1) r13.p).c();     // Catch: Throwable -> L35
        goto L42
    L25:
        int r31 = r2.getActionMasked();     // Catch: Throwable -> L35
        if (r31 == 0) goto L24;
        if (r31 == 2) goto L24;
        if (r31 == 6) goto L24;
        if (r2.getActionMasked() == 10) goto L37;
        if (r11 == false) goto L37;
        r1.G(r2, 10, r2.getEventTime(), true);     // Catch: Throwable -> L35
        r14 = r2;
        goto L42
    L17:
        if (r2.getToolType(0) != r17.getToolType(0)) goto L20;
        r30 = false;
        goto L21
    L7:
        if (r2.getToolType(0) != 3) goto L9;
        r11 = true;
    L10:
        th = th;
    L134:
        th = th;
        goto L142
    }

    @Override // defpackage.rl0
    public final void j(ba2 r4) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        setShowLayoutBounds(te5.v());
    L5:
        ha2 r5 = this.s;
        if (r5 == null) goto L28;
        ga2 r3 = this.r;
        r3.getClass();
        pz1 r0 = r5.a;
        wf2 r1 = (wf2) r0.o;
        if (r1.n == true) goto L10;
        return;
    L10:
        if (r1.p == true) goto L30;
        wc r2 = new wc(13, r5);     // Catch: CancellationException -> L13
        ez r6 = ((yd5) r3).a.s(r2);     // Catch: CancellationException -> L13
    L21:
        ez r7 = r5.d;
        if (r7 == null) goto L24;
        r7.cancel();
    L24:
        r5.d = r6;
        return;
    L13:
        wf2 r8 = (wf2) r0.o;
        if (r8.o == false) goto L17;
    L20:
        r6 = null;
        goto L21
    L17:
        if (r8.p == false) goto L19;
        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
    L19:
        r8.a();
        r8.p = true;
        goto L20
    L30:
        return;
    }

    public final void k(c72 r4) {
        int r1 = 0;
        this.f0.r(r4, false);
        f13 r5 = r4.y();
        Object[] r0 = r5.n;
        int r6 = r5.p;
    L3:
        if (r1 >= r6) goto L5;
        k((c72) r0[r1]);
        r1 = r1 + 1;
        goto L3
    }

    public final boolean n(MotionEvent r4) {
        float r0 = r4.getX();
        float r5 = r4.getY();
        if (0.0f <= r0) goto L5;
        return false;
    L5:
        if (r0 <= getWidth()) goto L7;
        return false;
    L7:
        if (0.0f <= r5) goto L9;
        return false;
    L9:
        if (r5 > getHeight()) goto L16;
        return true;
    L16:
        return false;
    }

    public final boolean o(MotionEvent r4) {
        if (r4.getPointerCount() != 1) goto L15;
        MotionEvent r3 = this.z0;
        if (r3 == null) goto L15;
        if (r3.getPointerCount() != r4.getPointerCount()) goto L15;
        if (r4.getRawX() != r3.getRawX()) goto L15;
        if (r4.getRawY() != r3.getRawY()) goto L15;
        return false;
    L15:
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getRoot().G() == true) goto L5;
        getRoot().d(this);
    L5:
        int r0 = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT >= 30) goto L8;
        setShowLayoutBounds(te5.v());
    L8:
        this.E.onViewAttachedToWindow(this);
        if (this.P0 == true) goto L11;
        getComposeViewContext().e();
    L11:
        int r1 = 0;
        this.P0 = false;
        k(getRoot());
        i(getRoot());
        pp3 r2 = getSnapshotObserver().a;
        z r3 = (z) r2.e;
        jh4.e(jh4.a);
        Object r4 = jh4.c;
        monitor-enter(r4);
        jh4.h = q40.F0(r3, jh4.h);     // Catch: Throwable -> L59
        monitor-exit(r4);
        r2.i = new ss2(18, r3);
        ra r5 = m75getOutOfFrameExecutor();
        if (r5 == null) goto L57;
        r5.C(new da(this, r0));
        getComposeViewContext().d();
        h80 r6 = getComposeViewContext();
        r6.g();
        f75 r7 = r6.f;
        ga2 r8 = this.r;
        if (r7 == null) goto L39;
        if (r8 == null) goto L39;
        e75 r9 = r7.d();
        c75 r10 = new c75();
        sf0 r11 = sf0.b;
        r9.getClass();
        r11.getClass();
        bq4 r12 = new bq4(r9, r10, r11);
        i30 r13 = kx3.a(ia2.class);
        String r14 = r13.b();
        if (r14 == null) goto L37;
        ia2 r15 = (ia2) r12.l(r13, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r14));
        Object r16 = getParent();
        r16.getClass();
        int r17 = ((View) r16).getId();
        i03 r18 = r15.b;
        Object r19 = r18.b(r17);
        if (r19 != null) goto L26;
        r19 = new q03(1);
        r18.i(r17, r19);
    L26:
        q03 r20 = (q03) r19;
        Object[] r21 = r20.a;
        int r22 = r20.b;
    L27:
        if (r1 >= r22) goto L32;
        Object r23 = r21[r1];
        if (((ha2) r23).c == false) goto L33;
        r1 = r1 + 1;
    L33:
        ha2 r24 = (ha2) r23;
        if (r24 != null) goto L36;
        r24 = new ha2();
        r20.a(r24);
    L36:
        r24.c = true;
        this.s = r24;
        y14 r25 = r24.b;
    L40:
        if (r25 != null) goto L42;
        r25 = fz0.b0;
    L42:
        this.u = r25;
        if1 r26 = this.p0;
        if (r26 == null) goto L45;
        r26.invoke(getComposeViewContext());
        this.p0 = null;
    L45:
        ea2 r27 = getComposeViewContext().d().h();
        r27.a(this);
        r27.a(this.K);
        sz1 r28 = m73getInputModeManager();
        if (isInTouchMode() == true) goto L49;
        r0 = 2;
    L49:
        r28.a.setValue(new qz1(r0));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT < 31) goto L52;
        eb.a.b(this);
    L52:
        y9 r29 = m71getAutofillManager();
        if (r29 == null) goto L55;
        ((q03) ((ey) getFocusOwner()).g).a(r29);
        getSemanticsOwner().d.a(r29);
    L55:
        ((q03) ((ey) getFocusOwner()).g).a(this);
        return;
    L32:
        r23 = null;
        goto L33
    L37:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return;
    L39:
        r25 = null;
        goto L40
    L57:
        kf2.o("Expected the view to be attached to window.");
        return;
    L59:
        th = move-exception;
        throw th;
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.s0.get() != null) goto L7;
        getLegacyTextInputServiceAndroid().getClass();
        return false;
    L7:
        kf2.k();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration r1) {
        super.onConfigurationChanged(r1);
        H(r1);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r1) {
        if (this.s0.get() != null) goto L7;
        getLegacyTextInputServiceAndroid().getClass();
        return null;
    L7:
        kf2.k();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] r7, int[] r8, Consumer r9) {
        lb r6 = this.K;
        r6.getClass();
        int r10 = r7.length;
        int r0 = 0;
    L3:
        if (r0 >= r10) goto L16;
        k94 r1 = (k94) r6.d().b((int) r7[r0]);
        if (r1 == null) goto L15;
        i94 r2 = r1.a;
        if (r2 == null) goto L15;
        db.p();
        ViewTranslationRequest.Builder r3 = db.l(j3.m(r6.n), r2.f);
        e94 r4 = r2.d;
        Object r5 = r4.n.g(n94.z);
        if (r5 != null) goto L12;
        r5 = null;
    L12:
        List r11 = (List) r5;
        if (r11 == null) goto L15;
        db.y(r3, db.j(new he(gc2.a(r11, "\n", null, 62))));
        r9.accept(db.m(r3));
    L15:
        r0 = r0 + 1;
        goto L3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.E.onViewDetachedFromWindow(this);
        View r1 = this.y;
        if (l() == false) goto L7;
        if (r1 == null) goto L7;
        removeView(r1);
    L7:
        if (Build.VERSION.SDK_INT <= 28) goto L17;
        q03 r2 = X0;
        monitor-enter(r2);
        r2.j(this);     // Catch: Throwable -> L13
        monitor-exit(r2);
    L13:
        th = move-exception;
        throw th;
    L17:
        getComposeViewContext().b();
        wb3 r3 = getSnapshotObserver();
        ss2 r4 = (ss2) r3.a.i;
        if (r4 == null) goto L20;
        r4.d();
    L20:
        pp3 r5 = r3.a;
        Object r6 = r5.h;
        monitor-enter(r6);
        f13 r7 = (f13) r5.g;     // Catch: Throwable -> L26
        Object[] r8 = r7.n;     // Catch: Throwable -> L26
        int r9 = r7.p;     // Catch: Throwable -> L26
        int r10 = 0;
    L23:
        if (r10 >= r9) goto L28;
        sh4 r11 = (sh4) r8[r10];     // Catch: Throwable -> L26
        r11.e.a();     // Catch: Throwable -> L26
        r11.f.a();     // Catch: Throwable -> L26
        r11.l.a();     // Catch: Throwable -> L26
        r11.m.clear();     // Catch: Throwable -> L26
        r10 = r10 + 1;
        goto L23
    L28:
        monitor-exit(r6);
        ea2 r12 = getComposeViewContext().d().h();
        r12.f(this.K);
        r12.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ha2 r13 = this.s;
        if (r13 == null) goto L32;
        r13.c = false;
    L32:
        this.s = null;
        if (Build.VERSION.SDK_INT < 31) goto L35;
        eb.a.a(this);
    L35:
        y9 r14 = m71getAutofillManager();
        if (r14 == null) goto L38;
        getSemanticsOwner().d.j(r14);
        ((q03) ((ey) getFocusOwner()).g).j(r14);
    L38:
        yv3 r15 = getRectManager();
        r15.g = r15.d.b(0, 0, null, 0, 0);
        getRectManager().a();
        yv3 r16 = getRectManager();
        ga r17 = r16.i;
        if (r17 == null) goto L41;
        r16.b.removeCallbacks(r17);
        r16.i = null;
    L41:
        ((q03) ((ey) getFocusOwner()).g).j(this);
        return;
    L26:
        th = move-exception;
        throw th;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r1) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        super.onFocusChanged(r1, r2, r3);
        if (r1 == false) goto L5;
        return;
    L5:
        if (hasFocus() == true) goto L13;
        ey r0 = (ey) getFocusOwner();
        uc5.P((ba1) r0.c, true);
        if (r0.f() == null) goto L14;
        ba1 r4 = r0.f();
        r0.h(null);
        if (r4 == null) goto L15;
        r4.r0(z91.n, z91.p);
        return;
    L15:
        return;
    L14:
        return;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.m0 = 0;
        I();
        int r0 = Build.VERSION.SDK_INT;
        if (32 <= r0) goto L5;
        return;
    L5:
        if (r0 >= 34) goto L9;
        H(getResources().getConfiguration());
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        Trace.beginSection("AndroidOwner:onLayout");
        this.m0 = 0;     // Catch: Throwable -> L13
        this.f0.l(this.M0);     // Catch: Throwable -> L13
        this.d0 = null;     // Catch: Throwable -> L13
        I();     // Catch: Throwable -> L13
        if (this.c0 == null) goto L11;
        Trace.beginSection("AndroidOwner:viewLayout");     // Catch: Throwable -> L13
        getAndroidViewsHandler$ui().layout(0, 0, r6 - r4, r7 - r5);     // Catch: Throwable -> L8
        Trace.endSection();     // Catch: Throwable -> L13
        goto L11
    L8:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L13
        throw th;     // Catch: Throwable -> L13
    L11:
        Trace.endSection();
        return;
    L13:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    @Override // android.view.View
    public final void onMeasure(int r9, int r10) {
        ri2 r0 = this.f0;
        Trace.beginSection("AndroidOwner:onMeasure");
    L25:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        if (getRoot().G() == true) goto L7;
        getRoot().d(this);     // Catch: Throwable -> L25
    L7:
        if (isAttachedToWindow() == true) goto L9;
        k(getRoot());     // Catch: Throwable -> L25
    L9:
        long r1 = f(r9);     // Catch: Throwable -> L25
        long r6 = f(r10);     // Catch: Throwable -> L25
        long r11 = zz1.l((int) (r1 >>> 32), (int) (r1 & 4294967295L), (int) (r6 >>> 32), (int) (4294967295L & r6));     // Catch: Throwable -> L25
        nc0 r2 = this.d0;     // Catch: Throwable -> L25
        if (r2 != null) goto L13;
        this.d0 = new nc0(r11);     // Catch: Throwable -> L25
        this.e0 = false;     // Catch: Throwable -> L25
    L15:
        r0.s(r11);     // Catch: Throwable -> L25
        r0.n();     // Catch: Throwable -> L25
        setMeasuredDimension(getRoot().R.p.n, getRoot().R.p.o);     // Catch: Throwable -> L25
        if (this.c0 == null) goto L23;
        Trace.beginSection("AndroidOwner:androidViewMeasure");     // Catch: Throwable -> L25
        getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().R.p.n, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().R.p.o, 1073741824));     // Catch: Throwable -> L20
        Trace.endSection();     // Catch: Throwable -> L25
        goto L23
    L20:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L25
        throw th;     // Catch: Throwable -> L25
    L23:
        Trace.endSection();
        return;
    L13:
        if (nc0.b(r2.a, r11) == true) goto L15;
        this.e0 = true;     // Catch: Throwable -> L25
        goto L15
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure r1, int r2) {
        if (d() == false) goto L9;
        if (r1 != null) goto L6;
        return;
    L6:
        if (this.Q0 == true) goto L11;
        x(r1);
        return;
    L11:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent r3, int r4) {
        int r0 = r3.getToolType(r4);
        if (r3.isFromSource(8194) == true) goto L12;
        if (r3.isFromSource(16386) == false) goto L12;
        if (r0 != 2) goto L9;
    L10:
        getPointerIconService().getClass();
        goto L12
    L9:
        if (r0 == 4) goto L10;
    L12:
        return super.onResolvePointerIcon(r3, r4);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
        if (this.p == false) goto L16;
        int[] r0 = r91.a;
        r62 r1 = r62.n;
        if (r3 != 0) goto L7;
        r62 r4 = r1;
    L11:
        if (r4 == null) goto L14;
        r1 = r4;
    L14:
        setLayoutDirection(r1);
        return;
    L7:
        if (r3 == 1) goto L9;
        r4 = null;
        goto L11
    L9:
        r4 = r62.o;
        goto L11
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect r13, Point r14, Consumer r15) {
        if (Build.VERSION.SDK_INT < 31) goto L15;
        rm2 r4 = this.R0;
        if (r4 == null) goto L16;
        l94 r16 = getSemanticsOwner();
        ne0 r17 = getCoroutineContext();
        f13 r9 = new f13(new j64[16]);
        gb.h0(r16.a(), 0, new i64(1, 8, f13.class, r9, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(r9.n, 0, r9.p, new w60(1, new if1[]{new o54(10), new o54(11)}));
        int r0 = r9.p;
        if (r0 != 0) goto L9;
        Object r1 = null;
    L10:
        j64 r6 = (j64) r1;
        if (r6 == null) goto L17;
        k02 r2 = r6.c;
        a80 r3 = new a80(r6.a, r2, te5.a(r17), r4, this);
        f63 r12 = r6.d;
        wv3 r18 = wr1.n(r12).C(r12, true);
        long r5 = (((long) r2.a) << 32) | (((long) r2.b) & 4294967295L);
        ScrollCaptureTarget r19 = go2.h(this, uo.U(rr2.Q(r18)), new Point((int) (r5 >> 32), (int) (r5 & 4294967295L)), r3);
        go2.u(r19, uo.U(r2));
        r15.accept(r19);
        return;
    L17:
        return;
    L9:
        r1 = r9.n[r0 - 1];
        goto L10
    L16:
        return;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        I();
    }

    @Override // defpackage.rl0
    public final void onStop(ba2 r2) {
        ha2 r1 = this.s;
        if (r1 == null) goto L24;
        wf2 r3 = (wf2) r1.a.o;
        if (r3.n == false) goto L14;
        if (r3.p == true) goto L14;
        ez r4 = r1.d;
        if (r4 == null) goto L11;
        r4.cancel();
    L11:
        r1.d = null;
        return;
    L14:
        if (r3.o == false) goto L17;
        return;
    L17:
        if (r3.p == true) goto L20;
        po3.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
    L20:
        if (r3.q.i() == true) goto L22;
        po3.a("Attempted to start retaining exited values with pending exited values");
    L22:
        r3.p = false;
        return;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean r2) {
        sz1 r1 = m73getInputModeManager();
        if (r2 == false) goto L5;
        int r3 = 1;
    L6:
        r1.a.setValue(new qz1(r3));
        return;
    L5:
        r3 = 2;
        goto L6
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray r4) {
        lb r3 = this.K;
        r3.getClass();
        if (Build.VERSION.SDK_INT >= 31) goto L6;
        return;
    L6:
        if (h12.c(Looper.getMainLooper().getThread(), Thread.currentThread()) == false) goto L9;
        uo.p(r3, r4);
        return;
    L9:
        r3.n.post(new k6(1, r3, r4));
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r2) {
        this.O0 = true;
        super.onWindowFocusChanged(r2);
        if (r2 == true) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 30) goto L11;
        boolean r3 = te5.v();
        if (getShowLayoutBounds() == r3) goto L12;
        setShowLayoutBounds(r3);
        i(getRoot());
        return;
    L12:
        return;
    }

    public final long p(long r8) {
        y();
        long r9 = ya4.A(r8, this.k0);
        float r2 = Float.intBitsToFloat((int) (this.o0 >> 32)) + Float.intBitsToFloat((int) (r9 >> 32));
        float r7 = Float.intBitsToFloat((int) (this.o0 & 4294967295L)) + Float.intBitsToFloat((int) (r9 & 4294967295L));
        return (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(r7) & 4294967295L);
    }

    public final void q(boolean r3) {
        ri2 r0 = this.f0;
        if (r0.b.o() == false) goto L5;
    L8:
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (r3 == false) goto L11;
        da r4 = this.M0;     // Catch: Throwable -> L18
    L13:
        if (r0.l(r4) == false) goto L15;
        requestLayout();     // Catch: Throwable -> L18
    L15:
        r0.b(false);     // Catch: Throwable -> L18
        getRectManager().a();     // Catch: Throwable -> L18
        Trace.endSection();
        return;
    L11:
        r4 = this.N0;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        Trace.endSection();
        throw th;
    L5:
        if (((f13) r0.e.n).p != 0) goto L8;
    }

    public final void r(c72 r3, long r4) {
        ri2 r0 = this.f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        r0.m(r3, r4);     // Catch: Throwable -> L8
        if (r0.b.o() == true) goto L6;
        r0.b(false);     // Catch: Throwable -> L8
        getRectManager().a();     // Catch: Throwable -> L8
        this.N0.invoke();     // Catch: Throwable -> L8
    L6:
        Trace.endSection();
        return;
    L8:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r8, Rect r9) {
        int r1 = 1;
        if (isFocused() == true) goto L18;
        o91 r10 = r91.c(r8);
        if (r10 == null) goto L8;
        int r11 = r10.a;
    L9:
        u91 r0 = getFocusOwner();
        if (r9 == null) goto L12;
        wv3 r3 = new wv3(r9.left, r9.top, r9.right, r9.bottom);
    L13:
        Boolean r12 = ((ey) r0).e(r11, r3, new ha(r11, 0));
        Boolean r2 = Boolean.TRUE;
        if (h12.c(r12, r2) == true) goto L18;
        if (h12.c(((ey) getFocusOwner()).e(r11, null, new ha(r11, r1)), r2) == true) goto L18;
        if (hasFocus() == false) goto L27;
        if (r11 == 1) goto L26;
        if (r11 != 2) goto L27;
    L26:
        return ((ey) getFocusOwner()).g(r11);
    L27:
        return false;
    L12:
        r3 = null;
        goto L13
    L8:
        r11 = 7;
    L18:
        return true;
    }

    public final void s() {
        if (this.W == false) goto L26;
        pp3 r0 = getSnapshotObserver().a;
        k52 r4 = new k52(25);
        Object r5 = r0.h;
        monitor-enter(r5);
        f13 r1 = (f13) r0.g;     // Catch: Throwable -> L18
        int r6 = r1.p;     // Catch: Throwable -> L18
        int r7 = 0;
        int r8 = 0;
    L8:
        Object[] r9 = r1.n;
        if (r7 >= r6) goto L21;
        sh4 r10 = (sh4) r9[r7];     // Catch: Throwable -> L18
        r10.c(r4);     // Catch: Throwable -> L18
        if (r10.f.e == 0) goto L13;
        boolean r11 = true;
    L14:
        if (r11 == true) goto L16;
        r8 = r8 + 1;     // Catch: Throwable -> L18
    L20:
        r7 = r7 + 1;     // Catch: Throwable -> L18
        goto L8
    L16:
        if (r8 <= 0) goto L20;
        Object[] r12 = r1.n;     // Catch: Throwable -> L18
        r12[r7 - r8] = r12[r7];     // Catch: Throwable -> L18
        goto L20
    L13:
        r11 = false;
        goto L14
    L21:
        int r13 = r6 - r8;     // Catch: Throwable -> L18
        Arrays.fill(r9, r13, r6, null);     // Catch: Throwable -> L18
        r1.p = r13;     // Catch: Throwable -> L18
        monitor-exit(r5);
        this.W = false;
    L18:
        th = move-exception;
        throw th;
    L26:
        id r2 = this.c0;
        if (r2 == null) goto L30;
        e(r2);
    L30:
        if (d() == false) goto L42;
        y9 r3 = m71getAutofillManager();
        if (r3 == null) goto L42;
        j03 r14 = r3.t;
        if (r14.d != 0) goto L39;
        if (r3.u == false) goto L39;
        gm0.t(r3.n.k());
        r3.u = false;
    L39:
        if (r14.d == 0) goto L42;
        r3.u = true;
    L42:
        if (this.C0.i() == false) goto L53;
        if (this.C0.f(0) == null) goto L66;
        int r15 = this.C0.b;
        int r16 = 0;
    L46:
        q03 r17 = this.C0;
        if (r16 >= r15) goto L52;
        gf1 r18 = (gf1) r17.f(r16);
        this.C0.n(r16, null);
        if (r18 == null) goto L51;
        r18.invoke();
    L51:
        r16 = r16 + 1;
        goto L46
    L52:
        r17.l(0, r15);
        goto L42
    L66:
        return;
    }

    public void setAccessibilityEventBatchIntervalMillis(long r1) {
        this.J.u = r1;
    }

    public final void setComposeViewContext(h80 r5) {
        if (getCoroutineContext() != r5.c().j()) goto L5;
    L8:
        ch4 r0 = ya4.t();
        if (r0 == null) goto L11;
        if1 r1 = r0.e();
    L12:
        ch4 r2 = ya4.z(r0);
        h80 r3 = get_composeViewContext();     // Catch: Throwable -> L21
        ya4.H(r0, r2, r1);
        if (r5 != r3) goto L17;
        return;
    L17:
        if (isAttachedToWindow() == false) goto L19;
        r3.b();
        r5.e();
    L19:
        set_composeViewContext(r5);
        setCoroutineContext(r5.c().j());
        return;
    L21:
        th = move-exception;
        ya4.H(r0, r2, r1);
        throw th;
    L11:
        r1 = null;
        goto L12
    L5:
        if (((c13) getRoot().n()).isEmpty() == true) goto L8;
        cz1.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        goto L8
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean r1) {
        this.P0 = r1;
    }

    public final void setConfiguration(Configuration r1) {
        this.S.setValue(r1);
    }

    public final void setContentCaptureManager$ui(lb r1) {
        this.K = r1;
    }

    public void setCoroutineContext(ne0 r1) {
        this.A = r1;
    }

    public final void setFrameEndScheduler$ui(ga2 r1) {
        this.r = r1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long r1) {
        this.m0 = r1;
    }

    public final void setOnReadyForComposition(if1 r2) {
        getDerivedIsAttached();
        if (isAttachedToWindow() == false) goto L5;
    L9:
        r2.invoke(getComposeViewContext());
        return;
    L5:
        if (this.P0 == true) goto L9;
        this.p0 = r2;
    }

    public final void setPlayNavigationSoundEffect$ui(wf1 r1) {
        this.K0 = r1;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m69setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(dy1 r1) {
        this.q = r1;
    }

    public void setShowLayoutBounds(boolean r1) {
        this.b0 = r1;
    }

    public void setUncaughtExceptionHandler(a34 r1) {
        this.f0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(a34 r1) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(c72 r4) {
        ya r0 = this.J;
        r0.K = true;
        if (r0.v() == false) goto L6;
        r0.w(r4);
    L6:
        lb r3 = this.K;
        r3.t = true;
        if (r3.e() == false) goto L10;
        r3.u.d(j15.a);
        return;
    }

    public final void u(c72 r6, boolean r7, boolean r8, boolean r9) {
        ri2 r0 = this.f0;
        if (r7 == false) goto L53;
        i61 r10 = r0.b;
        c72 r1 = r6.u;
        f72 r2 = r6.R;
        if (r1 != null) goto L8;
        cz1.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
    L8:
        int r3 = r2.d.ordinal();
        if (r3 == 0) goto L50;
        if (r3 != 1) goto L12;
        return;
    L12:
        if (r3 == 2) goto L50;
        if (r3 == 3) goto L50;
        if (r3 == 4) goto L18;
        er1.n();
        return;
    L18:
        if (r2.e == false) goto L21;
        if (r8 == true) goto L21;
        return;
    L21:
        r2.e = true;
        r2.p.E = true;
        if (r6.Z == false) goto L25;
        return;
    L25:
        if (h12.c(r6.I(), Boolean.TRUE) == false) goto L27;
    L28:
        c72 r11 = r6.t();
        if (r11 != null) goto L31;
    L42:
        r10.c(r6, n12.n);
    L44:
        if (r0.d == true) goto L58;
        if (r9 == false) goto L59;
        D(r6);
        return;
    L59:
        return;
    L58:
        return;
    L31:
        if (r11.R.e != true) goto L42;
    L33:
        if (r6.H() == false) goto L35;
    L36:
        c72 r12 = r6.t();
        if (r12 != null) goto L39;
    L41:
        r10.c(r6, n12.p);
        goto L44
    L39:
        if (r12.q() != true) goto L41;
    L35:
        if (ri2.j(r6) == false) goto L44;
    L27:
        if (ri2.i(r6) == false) goto L33;
    L50:
        r0.h.b(new qi2(r6, true, r8));
        return;
    L53:
        if (r0.r(r6, r8) == false) goto L60;
        if (r9 == false) goto L61;
        D(r6);
        return;
    L61:
        return;
    }

    public final void v(c72 r10, boolean r11, boolean r12) {
        f72 r0 = r10.R;
        n12 r2 = n12.q;
        ri2 r7 = this.f0;
        if (r11 == false) goto L48;
        i61 r13 = r7.b;
        int r8 = r0.d.ordinal();
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L92;
        if (r8 == 2) goto L14;
        if (r8 == 3) goto L93;
        if (r8 == 4) goto L14;
        er1.n();
        return;
    L93:
        return;
    L92:
        return;
    L14:
        if (r0.e == false) goto L16;
    L17:
        if (r12 == false) goto L103;
    L19:
        r0.f = true;
        r0.g = true;
        ti2 r14 = r0.p;
        r14.F = true;
        r14.G = true;
        if (r10.Z == true) goto L104;
        c72 r15 = r10.t();
        if (h12.c(r10.I(), Boolean.TRUE) == false) goto L34;
        if (r15 != null) goto L26;
    L28:
        if (r15 != null) goto L30;
    L32:
        r13.c(r10, n12.o);
    L45:
        if (r7.d == true) goto L94;
        D(null);
        return;
    L94:
        return;
    L30:
        if (r15.R.f != true) goto L32;
    L26:
        if (r15.R.e != true) goto L28;
    L34:
        if (r10.H() == false) goto L45;
        if (r15 != null) goto L37;
    L39:
        if (r15 != null) goto L41;
    L43:
        r13.c(r10, r2);
        goto L45
    L41:
        if (r15.q() != true) goto L43;
    L37:
        if (r15.p() != true) goto L39;
    L104:
        return;
    L103:
        return;
    L16:
        if (r0.f == false) goto L19;
    L48:
        r7.getClass();
        int r16 = r0.d.ordinal();
        if (r16 == 0) goto L95;
        if (r16 == 1) goto L96;
        if (r16 == 2) goto L97;
        if (r16 == 3) goto L98;
        if (r16 != 4) goto L90;
        c72 r17 = r10.t();
        if (r17 != null) goto L57;
    L60:
        boolean r3 = true;
    L61:
        if (r12 == false) goto L63;
    L71:
        ti2 r18 = r0.p;
        r18.F = true;
        r18.G = true;
        if (r10.Z == false) goto L75;
        return;
    L75:
        if (r18.D == false) goto L100;
        if (r3 == false) goto L101;
        if (r17 != null) goto L79;
    L81:
        if (r17 != null) goto L83;
    L85:
        r7.b.c(r10, r2);
    L87:
        if (r7.d == true) goto L102;
        D(null);
        return;
    L102:
        return;
    L83:
        if (r17.q() != true) goto L85;
    L79:
        if (r17.p() != true) goto L81;
    L101:
        return;
    L100:
        return;
    L63:
        if (r10.q() == false) goto L65;
        return;
    L65:
        if (r10.p() == false) goto L71;
        if (r10.H() != r3) goto L71;
        if (r10.H() != r0.p.D) goto L71;
        return;
    L57:
        if (r17.H() == true) goto L60;
        r3 = false;
        goto L61
    L90:
        er1.n();
        return;
    L98:
        return;
    L97:
        return;
    L96:
        return;
    }

    public final void w() {
        ya r0 = this.J;
        r0.K = true;
        Handler r2 = r0.q.getHandler();
        if (r0.v() == true) goto L5;
    L8:
        lb r4 = this.K;
        r4.t = true;
        Handler r1 = r4.n.getHandler();
        if (r4.e() == true) goto L11;
        return;
    L11:
        if (r4.z == true) goto L16;
        if (r1 == null) goto L17;
        r4.z = true;
        r1.post(r4.A);
        return;
    L17:
        return;
    L16:
        return;
    L5:
        if (r0.V == true) goto L8;
        if (r2 == null) goto L8;
        r0.V = true;
        r2.post(r0.X);
        goto L8
    }

    public final void x(ViewStructure r14) {
        y9 r0 = m71getAutofillManager();
        if (r0 == null) goto L33;
        c72 r2 = r0.o.a;
        AutofillId r3 = r0.s;
        String r4 = r0.r;
        yv3 r5 = r0.q;
        zz1.z(r14, r2, r3, r4, r5);
        Object[] r6 = t73.a;
        q03 r7 = new q03(2);
        r7.a(r2);
        r7.a(r14);
    L6:
        if (r7.i() == false) goto L33;
        Object r8 = r7.k(r7.b - 1);
        r8.getClass();
        ViewStructure r9 = (ViewStructure) r8;
        Object r10 = r7.k(r7.b - 1);
        r10.getClass();
        c13 r11 = (c13) ((c72) r10).n();
        int r12 = r11.n.p;
        int r13 = 0;
    L8:
        if (r13 >= r12) goto L6;
        c72 r15 = (c72) r11.get(r13);
        if (r15.Z == false) goto L12;
    L32:
        r13 = r13 + 1;
        goto L8
    L12:
        if (r15.G() == false) goto L32;
        if (r15.H() == false) goto L32;
        e94 r16 = r15.v();
        if (r16 == null) goto L31;
        w03 r17 = r16.n;
        if (r17.b(d94.g) == false) goto L21;
    L30:
        ViewStructure r18 = r9.newChild(r9.addChildCount(1));
        zz1.z(r18, r15, r0.s, r4, r5);
        r7.a(r15);
        r7.a(r18);
        goto L32
    L21:
        if (r17.b(d94.h) == true) goto L30;
        if (r17.b(n94.q) == true) goto L30;
        if (r17.b(n94.r) == true) goto L30;
        if (Build.VERSION.SDK_INT < 34) goto L31;
        if (r17.b(zz1.m) == true) goto L30;
    L31:
        r7.a(r15);
        r7.a(r9);
    L33:
        x9 r19 = m70getAutofill();
        if (r19 == null) goto L47;
        wn r1 = r19.b;
        LinkedHashMap r20 = r1.a;
        LinkedHashMap r21 = r1.a;
        if (r20.isEmpty() == true) goto L52;
        int r22 = r14.addChildCount(r21.size());
        Iterator r23 = r21.entrySet().iterator();
        if (r23.hasNext() == false) goto L53;
        Map.Entry r24 = (Map.Entry) r23.next();
        int r25 = ((Number) r24.getKey()).intValue();
        if (r24.getValue() == null) goto L45;
        kf2.k();
        return;
    L45:
        ViewStructure r110 = r14.newChild(r22);
        j3.u(r110, r19.c, r25);
        r110.setId(r25, r19.a.getContext().getPackageName(), null, null);
        tn.r(r110, 1);
        throw null;
    L53:
        return;
    L52:
        return;
    }

    public final void y() {
        if (this.n0 == true) goto L13;
        long r0 = AnimationUtils.currentAnimationTimeMillis();
        if (r0 == this.m0) goto L14;
        this.m0 = r0;
        A();
        ViewParent r1 = getParent();
        View r2 = this;
    L8:
        if ((r1 instanceof ViewGroup) == false) goto L10;
        r2 = (View) r1;
        r1 = ((ViewGroup) r2).getParent();
        goto L8
    L10:
        int[] r3 = this.h0;
        r2.getLocationOnScreen(r3);
        float r4 = r3[0];
        float r5 = r3[1];
        r2.getLocationInWindow(r3);
        float r6 = r3[0];
        float r7 = r5 - r3[1];
        this.o0 = (Float.floatToRawIntBits(r4 - r6) << 32) | (((long) Float.floatToRawIntBits(r7)) & 4294967295L);
        return;
    L14:
        return;
    }

    public final void z(MotionEvent r10) {
        this.m0 = AnimationUtils.currentAnimationTimeMillis();
        A();
        float r0 = r10.getX();
        float r1 = r10.getY();
        long r2 = Float.floatToRawIntBits(r0);
        long r3 = ya4.A((((long) Float.floatToRawIntBits(r1)) & 4294967295L) | (r2 << 32), this.k0);
        float r4 = r10.getRawX() - Float.intBitsToFloat((int) (r3 >> 32));
        float r11 = r10.getRawY() - Float.intBitsToFloat((int) (r3 & 4294967295L));
        this.o0 = (Float.floatToRawIntBits(r4) << 32) | (((long) Float.floatToRawIntBits(r11)) & 4294967295L);
    }

    /* JADX INFO: renamed from: getAutofill, reason: collision with other method in class */
    public x9 m70getAutofill() {
        return this.U;
    }

    /* JADX INFO: renamed from: getAutofillManager, reason: collision with other method in class */
    public y9 m71getAutofillManager() {
        return this.V;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: collision with other method in class */
    public qb m72getDragAndDropManager() {
        return this.B;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: collision with other method in class */
    public i03 m74getLayoutNodes() {
        return this.G;
    }

    public /* bridge */ /* synthetic */ lb3 getOutOfFrameExecutor() {
        return m75getOutOfFrameExecutor();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2) {
        addView(r2, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, int r4) {
        ViewGroup.LayoutParams r0 = generateDefaultLayoutParams();
        r0.width = r3;
        r0.height = r4;
        addViewInLayout(r2, -1, r0, true);
    }

    public /* bridge */ /* synthetic */ rz1 getInputModeManager() {
        return m73getInputModeManager();
    }

    @Override // android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        addViewInLayout(r2, r3, r4, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View r3, ViewGroup.LayoutParams r4) {
        addViewInLayout(r3, -1, r4, true);
    }
}
