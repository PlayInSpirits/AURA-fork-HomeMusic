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
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import app.homemusic.R;
import java.lang.reflect.InvocationTargetException;
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
    public static final q03 X0 = new q03();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(Context context, h80 h80Var) {
        y9 y9Var;
        r62 r62Var;
        super(context);
        ra raVar = this;
        raVar.n = uc5.B(h80Var);
        raVar.o = 9205357640488583168L;
        int i = 1;
        raVar.p = true;
        raVar.u = fz0.b0;
        raVar.v = new ii();
        int i2 = 0;
        raVar.w = new ia(raVar, i2);
        raVar.x = new zd3(bu.a(context), rv2.A);
        raVar.z = new ey(raVar, raVar);
        raVar.A = h80Var.c().j();
        raVar.B = new qb();
        raVar.C = uc5.B(Boolean.FALSE);
        int i3 = 2;
        da daVar = new da(raVar, i3);
        z05 z05Var = ph4.a;
        raVar.D = new dp0(daVar, null);
        raVar.E = new xz1();
        int i4 = 3;
        c72 c72Var = new c72(3);
        ui2 ui2Var = c72Var.I;
        c34 c34Var = c34.b;
        if (!h12.c(ui2Var, c34Var)) {
            c72Var.I = c34Var;
            c72Var.D();
        }
        c72Var.a0(raVar.getDensity());
        c72Var.e0(raVar.getViewConfiguration());
        c72Var.d0(new qa(raVar).c((w91) ((ey) raVar.getFocusOwner()).e).c(raVar.getDragAndDropManager().c));
        raVar.F = c72Var;
        i03 i03Var = f02.a;
        raVar.G = new i03();
        raVar.H = new yv3(raVar.getLayoutNodes(), raVar);
        raVar.I = new l94(raVar.getRoot(), new x01(), raVar.getLayoutNodes());
        ya yaVar = new ya(raVar);
        raVar.J = yaVar;
        raVar.K = new lb(raVar, new na(0, raVar, gb.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        jw jwVar = new jw();
        jwVar.o = raVar;
        jwVar.p = new Object();
        ac acVar = new ac();
        jwVar.r = acVar;
        if (raVar.isAttachedToWindow()) {
            Context context2 = raVar.getContext();
            if (!jwVar.n) {
                context2.getApplicationContext().registerComponentCallbacks(acVar);
                jwVar.n = true;
            }
        }
        raVar.addOnAttachStateChangeListener(new bc(i2, jwVar));
        raVar.L = jwVar;
        raVar.M = new wn();
        raVar.N = new q03();
        raVar.Q = new tx2();
        c72 root = raVar.getRoot();
        jw jwVar2 = new jw();
        jwVar2.o = root;
        jwVar2.p = new cm1((iz1) root.Q.d);
        int i5 = 15;
        jwVar2.q = new pz1(15);
        jwVar2.r = new fm1();
        raVar.R = jwVar2;
        raVar.S = uc5.B(new Configuration(context.getResources().getConfiguration()));
        raVar.T = new dp0(new da(raVar, i4), null);
        raVar.U = d() ? new x9(raVar, raVar.getAutofillTree()) : null;
        if (d()) {
            y9Var = new y9(new qr2(i5, context), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            raVar = this;
        } else {
            y9Var = null;
        }
        raVar.V = y9Var;
        raVar.a0 = new wb3(new ja(raVar, i2));
        raVar.f0 = new ri2(raVar.getRoot());
        raVar.g0 = 9223372034707292159L;
        raVar.h0 = new int[]{0, 0};
        raVar.i0 = ya4.h();
        raVar.j0 = new Matrix();
        raVar.k0 = ya4.h();
        raVar.l0 = ya4.h();
        raVar.m0 = -1L;
        raVar.o0 = 9187343241974906880L;
        raVar.s0 = new AtomicReference(null);
        raVar.u0 = h80Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = r91.a;
        r62 r62Var2 = r62.n;
        if (layoutDirection != 0) {
            r62Var = layoutDirection != 1 ? null : r62.o;
        } else {
            r62Var = r62Var2;
        }
        raVar.v0 = uc5.B(r62Var != null ? r62Var : r62Var2);
        raVar.x0 = new ex2();
        raVar.B0 = new hd5(22);
        raVar.C0 = new q03();
        raVar.D0 = Float.NaN;
        raVar.E0 = Float.NaN;
        raVar.F0 = Float.NaN;
        raVar.G0 = Float.NaN;
        raVar.H0 = new g5(i3, raVar);
        raVar.I0 = new ia(raVar, i);
        raVar.K0 = new ka(raVar);
        raVar.L0 = new bk(context, new ja(raVar, i));
        raVar.M0 = new da(raVar, 4);
        raVar.N0 = new da(raVar, i2);
        raVar.addOnAttachStateChangeListener(raVar.K);
        raVar.setWillNotDraw(false);
        raVar.setFocusable(true);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            fb.a.a(raVar, 1, false);
        }
        raVar.setFocusableInTouchMode(true);
        raVar.setClipChildren(false);
        j65.o(raVar, yaVar);
        raVar.setOnDragListener(raVar.getDragAndDropManager());
        if (i6 >= 29) {
            ab.a.a(raVar);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            raVar.y = view;
            raVar.addView(view, -1);
        }
        raVar.R0 = i6 >= 31 ? new rm2(15) : null;
        raVar.T0 = new pa(raVar);
    }

    public static boolean c(ra raVar, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ra) {
                ((ra) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public static long f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        tb4.a();
        return 0L;
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
        js4 js4Var = this.q0;
        if (js4Var != null) {
            return js4Var;
        }
        js4 js4Var2 = new js4(getView(), this);
        this.q0 = js4Var2;
        return js4Var2;
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

    public static void i(c72 c72Var) {
        c72Var.C();
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            i((c72) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ux2.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.C.setValue(Boolean.valueOf(z));
    }

    private void setDensity(oo0 oo0Var) {
        this.x.setValue(oo0Var);
    }

    private void setLayoutDirection(r62 r62Var) {
        this.v0.setValue(r62Var);
    }

    private final void set_composeViewContext(h80 h80Var) {
        this.n.setValue(h80Var);
    }

    public final void A() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.k0;
        int[] iArr = this.h0;
        if (i >= 29) {
            ay.a.a(this, fArr, this.j0, iArr);
        } else {
            ya4.G(fArr);
            gi1.Y(this, fArr, this.i0, iArr);
        }
        q05.q(fArr, this.l0);
    }

    public final boolean B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void C(gf1 gf1Var) {
        ii iiVar = this.v;
        boolean zIsEmpty = iiVar.isEmpty();
        iiVar.addLast(gf1Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.w);
            } else {
                kf2.n("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void D(c72 c72Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c72Var != null) {
            while (c72Var != null && c72Var.r() == a72.n) {
                if (!this.e0) {
                    c72 c72VarT = c72Var.t();
                    if (c72VarT == null) {
                        break;
                    }
                    long j = ((iz1) c72VarT.Q.d).q;
                    if (nc0.f(j) && nc0.e(j)) {
                        break;
                    }
                }
                c72Var = c72Var.t();
            }
            if (c72Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long E(long j) {
        y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.o0 >> 32));
        return ya4.A((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.o0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.l0);
    }

    public final int F(MotionEvent motionEvent) {
        Object obj;
        if (this.O0) {
            this.O0 = false;
            om1 om1Var = getComposeViewContext().t;
            int metaState = motionEvent.getMetaState();
            om1Var.getClass();
            la5.n.setValue(new tn3(metaState));
        }
        tx2 tx2Var = this.Q;
        rf2 rf2VarC = tx2Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        jw jwVar = this.R;
        if (rf2VarC == null) {
            if (!jwVar.n) {
                ((xe2) ((pz1) jwVar.q).o).a();
                ((cm1) jwVar.p).c();
            }
            return 0;
        }
        List list = (List) rf2VarC.n;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((qn3) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        qn3 qn3Var = (qn3) obj;
        if (qn3Var != null) {
            this.o = qn3Var.d;
        }
        int iS = jwVar.s(rf2VarC, this, n(motionEvent));
        rf2VarC.o = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iS & 1) != 0) {
            return iS;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        tx2Var.c.delete(pointerId);
        tx2Var.b.delete(pointerId);
        return iS;
    }

    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jP = p((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jP >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jP & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        rf2 rf2VarC = this.Q.c(motionEventObtain, this);
        rf2VarC.getClass();
        this.R.s(rf2VarC, this, true);
        motionEventObtain.recycle();
    }

    public final void H(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (h12.c(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(bu.a(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void I() {
        boolean z;
        int i;
        int[] iArr = this.h0;
        getLocationOnScreen(iArr);
        long j = this.g0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.m0 >= 0) {
            z = false;
        } else {
            this.g0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                f13 f13VarY = getRoot().y();
                Object[] objArr = f13VarY.n;
                int i5 = f13VarY.p;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((c72) objArr[i6]).R.p.e0();
                }
                z = true;
            }
        }
        y();
        View rootView = this.S0;
        if (rootView == null) {
            rootView = getRootView();
            this.S0 = rootView;
        }
        yv3 rectManager = getRectManager();
        long j2 = this.g0;
        long jK = ji2.K(this.o0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.k0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        pt4 pt4Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = pt4Var.b(j2, jK, fArr, width, height) || rectManager.g;
        this.f0.b(z);
        getRectManager().a();
    }

    public final void J(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.D0) || f > this.D0) {
                    this.D0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.E0) || f < this.E0) {
                    this.E0 = f;
                }
            }
        }
    }

    @Override // defpackage.t91
    public final void a(ba1 ba1Var, ba1 ba1Var2) {
        w12 w12Var;
        boolean z;
        w12 w12Var2;
        boolean z2;
        if (ba1Var != null) {
            ba1 ba1Var3 = ba1Var;
            if (!ba1Var3.n.A) {
                cz1.b("visitAncestors called on an unattached node");
            }
            cx2 cx2Var = ba1Var3.n;
            c72 c72VarO = j51.O(ba1Var);
            x03 x03Var = null;
            ArrayList arrayList = null;
            while (c72VarO != null) {
                if ((((cx2) c72VarO.Q.g).q & 2097152) != 0) {
                    while (cx2Var != null) {
                        if ((cx2Var.p & 2097152) != 0) {
                            cx2 cx2VarC = cx2Var;
                            f13 f13Var = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof my1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cx2VarC);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cx2VarC.p & 2097152) != 0 && (cx2VarC instanceof fo0)) {
                                    int i = 0;
                                    for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                        if ((cx2Var2.p & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cx2VarC = cx2Var2;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var.b(cx2Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var);
                            }
                        }
                        cx2Var = cx2Var.r;
                    }
                }
                c72VarO = c72VarO.t();
                cx2Var = (c72VarO == null || (w12Var2 = c72VarO.Q) == null) ? null : (sq4) w12Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (ba1Var2 != null) {
                if (!ba1Var2.n.A) {
                    cz1.b("visitAncestors called on an unattached node");
                }
                cx2 cx2Var3 = ba1Var2.n;
                c72 c72VarO2 = j51.O(ba1Var2);
                x03 x03Var2 = null;
                while (c72VarO2 != null) {
                    if ((((cx2) c72VarO2.Q.g).q & 2097152) != 0) {
                        while (cx2Var3 != null) {
                            if ((cx2Var3.p & 2097152) != 0) {
                                cx2 cx2VarC2 = cx2Var3;
                                f13 f13Var2 = null;
                                while (cx2VarC2 != null) {
                                    if (cx2VarC2 instanceof my1) {
                                        if (x03Var2 == null) {
                                            x03 x03Var3 = w54.a;
                                            x03Var2 = new x03();
                                        }
                                        x03Var2.a(cx2VarC2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cx2VarC2.p & 2097152) != 0 && (cx2VarC2 instanceof fo0)) {
                                        int i2 = 0;
                                        for (cx2 cx2Var4 = ((fo0) cx2VarC2).C; cx2Var4 != null; cx2Var4 = cx2Var4.s) {
                                            if ((cx2Var4.p & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cx2VarC2 = cx2Var4;
                                                } else {
                                                    if (f13Var2 == null) {
                                                        f13Var2 = new f13(new cx2[16]);
                                                    }
                                                    if (cx2VarC2 != null) {
                                                        f13Var2.b(cx2VarC2);
                                                        cx2VarC2 = null;
                                                    }
                                                    f13Var2.b(cx2Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cx2VarC2 = j51.c(f13Var2);
                                }
                            }
                            cx2Var3 = cx2Var3.r;
                        }
                    }
                    c72VarO2 = c72VarO2.t();
                    cx2Var3 = (c72VarO2 == null || (w12Var = c72VarO2.Q) == null) ? null : (sq4) w12Var.f;
                }
                x03Var = x03Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                my1 my1Var = (my1) arrayList.get(i3);
                if (!(x03Var != null ? x03Var.c(my1Var) : false)) {
                    my1Var.N();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ba1 ba1Var = (ba1) ((ey) getFocusOwner()).c;
        if (!ba1Var.A) {
            return;
        }
        if (!ba1Var.n.A) {
            cz1.b("visitSubtreeIf called on an unattached node");
        }
        f13 f13Var = new f13(new cx2[16]);
        cx2 cx2Var = ba1Var.n;
        cx2 cx2Var2 = cx2Var.s;
        if (cx2Var2 == null) {
            j51.b(f13Var, cx2Var);
        } else {
            f13Var.b(cx2Var2);
        }
        while (true) {
            int i3 = f13Var.p;
            if (i3 == 0) {
                return;
            }
            cx2 cx2Var3 = (cx2) f13Var.k(i3 - 1);
            if ((cx2Var3.q & 1024) != 0) {
                for (cx2 cx2Var4 = cx2Var3; cx2Var4 != null && cx2Var4.A; cx2Var4 = cx2Var4.s) {
                    if ((cx2Var4.p & 1024) != 0) {
                        cx2 cx2VarC = cx2Var4;
                        f13 f13Var2 = null;
                        while (cx2VarC != null) {
                            int i4 = 0;
                            if (cx2VarC instanceof ba1) {
                                ba1 ba1Var2 = (ba1) cx2VarC;
                                if (ba1Var2.A && ba1Var2.s0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    ba1 ba1Var3 = (ba1) ((ey) getFocusOwner()).c;
                                    if (ba1Var3.A) {
                                        if (!ba1Var3.n.A) {
                                            cz1.b("visitSubtreeIf called on an unattached node");
                                        }
                                        f13 f13Var3 = new f13(new cx2[16]);
                                        cx2 cx2Var5 = ba1Var3.n;
                                        cx2 cx2Var6 = cx2Var5.s;
                                        if (cx2Var6 == null) {
                                            j51.b(f13Var3, cx2Var5);
                                        } else {
                                            f13Var3.b(cx2Var6);
                                        }
                                        while (true) {
                                            int i5 = f13Var3.p;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            cx2 cx2Var7 = (cx2) f13Var3.k(i5 - 1);
                                            if ((cx2Var7.q & 1024) != 0) {
                                                for (cx2 cx2Var8 = cx2Var7; cx2Var8 != null && cx2Var8.A; cx2Var8 = cx2Var8.s) {
                                                    if ((cx2Var8.p & 1024) != 0) {
                                                        cx2 cx2VarC2 = cx2Var8;
                                                        f13 f13Var4 = null;
                                                        while (cx2VarC2 != null) {
                                                            if (cx2VarC2 instanceof ba1) {
                                                                ba1 ba1Var4 = (ba1) cx2VarC2;
                                                                if (ba1Var4.A) {
                                                                    x91 x91VarS0 = ba1Var4.s0();
                                                                    if (ba1Var4.A && x91VarS0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((cx2VarC2.p & 1024) != 0 && (cx2VarC2 instanceof fo0)) {
                                                                int i6 = 0;
                                                                for (cx2 cx2Var9 = ((fo0) cx2VarC2).C; cx2Var9 != null; cx2Var9 = cx2Var9.s) {
                                                                    if ((cx2Var9.p & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            cx2VarC2 = cx2Var9;
                                                                        } else {
                                                                            if (f13Var4 == null) {
                                                                                f13Var4 = new f13(new cx2[16]);
                                                                            }
                                                                            if (cx2VarC2 != null) {
                                                                                f13Var4.b(cx2VarC2);
                                                                                cx2VarC2 = null;
                                                                            }
                                                                            f13Var4.b(cx2Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            cx2VarC2 = j51.c(f13Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            j51.b(f13Var3, cx2Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((cx2VarC.p & 1024) != 0 && (cx2VarC instanceof fo0)) {
                                for (cx2 cx2Var10 = ((fo0) cx2VarC).C; cx2Var10 != null; cx2Var10 = cx2Var10.s) {
                                    if ((cx2Var10.p & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cx2VarC = cx2Var10;
                                        } else {
                                            if (f13Var2 == null) {
                                                f13Var2 = new f13(new cx2[16]);
                                            }
                                            if (cx2VarC != null) {
                                                f13Var2.b(cx2VarC);
                                                cx2VarC = null;
                                            }
                                            f13Var2.b(cx2Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cx2VarC = j51.c(f13Var2);
                        }
                    }
                }
            }
            j51.b(f13Var, cx2Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        e94 e94VarV;
        if1 if1Var;
        if1 if1Var2;
        if (d()) {
            y9 autofillManager = getAutofillManager();
            if (autofillManager != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueN = j3.n(sparseArray.get(iKeyAt));
                    c72 c72Var = (c72) autofillManager.o.c.b(iKeyAt);
                    if (c72Var != null && (e94VarV = c72Var.v()) != null) {
                        w03 w03Var = e94VarV.n;
                        Object objG = w03Var.g(d94.g);
                        if (objG == null) {
                            objG = null;
                        }
                        w2 w2Var = (w2) objG;
                        if (w2Var != null && (if1Var2 = (if1) w2Var.b) != null) {
                        }
                        Object objG2 = w03Var.g(d94.h);
                        w2 w2Var2 = (w2) (objG2 != null ? objG2 : null);
                        if (w2Var2 != null && (if1Var = (if1) w2Var2.b) != null) {
                        }
                    }
                }
            }
            x9 autofill = getAutofill();
            if (autofill != null) {
                wn wnVar = autofill.b;
                if (wnVar.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueN2 = j3.n(sparseArray.get(iKeyAt2));
                    if (autofillValueN2.isText()) {
                        autofillValueN2.getTextValue().toString();
                        if (wnVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                            kf2.k();
                            return;
                        }
                    } else {
                        if (autofillValueN2.isDate()) {
                            throw new p63("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueN2.isList()) {
                            throw new p63("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueN2.isToggle()) {
                            throw new p63("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.J.m(i, this.o, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.J.m(i, this.o, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        q03 q03Var = this.N;
        if (!isAttachedToWindow()) {
            i(getRoot());
        }
        q(true);
        jh4.j().m();
        this.P = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            nz canvasHolder = getCanvasHolder();
            aa aaVar = canvasHolder.a;
            Canvas canvas2 = aaVar.a;
            aaVar.a = canvas;
            getRoot().i(aaVar, null);
            canvasHolder.a.a = canvas2;
            if (q03Var.i()) {
                int i = q03Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((vj1) ((tb3) q03Var.f(i2))).g();
                }
            }
            int i3 = u65.n;
            q03Var.d();
            this.P = false;
            Trace.endSection();
            q03 q03Var2 = this.O;
            if (q03Var2 != null) {
                q03Var.b(q03Var2);
                q03Var2.d();
            }
            if (l()) {
                if (Float.compare(this.D0, this.F0) != 0) {
                    float f = this.D0;
                    this.F0 = f;
                    re.a(this, f);
                }
                View view = this.y;
                if (view != null) {
                    if (Float.compare(this.E0, this.G0) != 0) {
                        float f2 = this.E0;
                        this.G0 = f2;
                        re.a(view, f2);
                    }
                    if (!Float.isNaN(this.E0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.D0 = Float.NaN;
                this.E0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
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
        /*
            Method dump skipped, instruction units count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
    
        if (o(r25) == false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean zDispatchGenericMotionEvent;
        int iA;
        boolean z = this.J0;
        ia iaVar = this.I0;
        if (z) {
            removeCallbacks(iaVar);
            iaVar.run();
        }
        if (!m(motionEvent) && isAttachedToWindow()) {
            ya yaVar = this.J;
            ra raVar = yaVar.q;
            AccessibilityManager accessibilityManager = yaVar.t;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    raVar.q(true);
                    fm1 fm1Var = new fm1();
                    i = 1;
                    c72 root = raVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    w12 w12Var = root.Q;
                    f63 f63Var = (f63) w12Var.e;
                    k52 k52Var = f63.h0;
                    ((f63) w12Var.e).G0(f63.m0, f63Var.x0(jFloatToRawIntBits), fm1Var, 1, true);
                    q03 q03Var = fm1Var.n;
                    int i2 = q03Var.b;
                    while (true) {
                        i2--;
                        if (-1 >= i2) {
                            iA = Integer.MIN_VALUE;
                            break;
                        }
                        Object objF = q03Var.f(i2);
                        objF.getClass();
                        c72 c72VarO = j51.O((cx2) objF);
                        if (raVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c72VarO) != null) {
                            kf2.k();
                            return false;
                        }
                        if (c72VarO.Q.d(8)) {
                            iA = yaVar.A(c72VarO.o);
                            i94 i94VarA = hw.a(c72VarO, false);
                            if (wr1.I(i94VarA) && !fh0.p(i94VarA)) {
                                break;
                            }
                        }
                    }
                    boolean zDispatchGenericMotionEvent2 = raVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = yaVar.r;
                    if (i3 != iA) {
                        yaVar.r = iA;
                        ya.E(yaVar, iA, 128, null, 12);
                        ya.E(yaVar, i3, 256, null, 12);
                    }
                    zDispatchGenericMotionEvent = iA == Integer.MIN_VALUE ? zDispatchGenericMotionEvent2 : true;
                } else {
                    if (action != 10) {
                        zDispatchGenericMotionEvent = false;
                    } else {
                        int i4 = yaVar.r;
                        if (i4 != Integer.MIN_VALUE) {
                            if (i4 != Integer.MIN_VALUE) {
                                yaVar.r = Integer.MIN_VALUE;
                                ya.E(yaVar, Integer.MIN_VALUE, 128, null, 12);
                                ya.E(yaVar, i4, 256, null, 12);
                            }
                            zDispatchGenericMotionEvent = true;
                            i = 1;
                        } else {
                            zDispatchGenericMotionEvent = raVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                    i = 1;
                }
            } else {
                i = 1;
                zDispatchGenericMotionEvent = false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && n(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.z0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.z0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.J0 = i;
                        postDelayed(iaVar, 8L);
                        return zDispatchGenericMotionEvent;
                    }
                    return zDispatchGenericMotionEvent;
                }
                if ((h(motionEvent) & i) != 0 || zDispatchGenericMotionEvent) {
                    return i;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((ey) getFocusOwner()).d(keyEvent, new fa(i, this, keyEvent));
        }
        om1 om1Var = getComposeViewContext().t;
        int metaState = keyEvent.getMetaState();
        om1Var.getClass();
        la5.n.setValue(new tn3(metaState));
        return ((ey) getFocusOwner()).d(keyEvent, new e90(4)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        w12 w12Var;
        if (isFocused()) {
            ey eyVar = (ey) getFocusOwner();
            if (((s91) eyVar.d).e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ba1 ba1VarP = te5.p((ba1) eyVar.c);
                if (ba1VarP != null) {
                    if (!ba1VarP.n.A) {
                        cz1.b("visitAncestors called on an unattached node");
                    }
                    cx2 cx2Var = ba1VarP.n;
                    c72 c72VarO = j51.O(ba1VarP);
                    while (c72VarO != null) {
                        if ((((cx2) c72VarO.Q.g).q & 131072) != 0) {
                            while (cx2Var != null) {
                                if ((cx2Var.p & 131072) != 0) {
                                    cx2 cx2VarC = cx2Var;
                                    f13 f13Var = null;
                                    while (cx2VarC != null) {
                                        if ((cx2VarC.p & 131072) != 0 && (cx2VarC instanceof fo0)) {
                                            int i = 0;
                                            for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                                if ((cx2Var2.p & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        cx2VarC = cx2Var2;
                                                    } else {
                                                        if (f13Var == null) {
                                                            f13Var = new f13(new cx2[16]);
                                                        }
                                                        if (cx2VarC != null) {
                                                            f13Var.b(cx2VarC);
                                                            cx2VarC = null;
                                                        }
                                                        f13Var.b(cx2Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        cx2VarC = j51.c(f13Var);
                                    }
                                }
                                cx2Var = cx2Var.r;
                            }
                        }
                        c72VarO = c72VarO.t();
                        cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (d()) {
            this.Q0 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.Q0 = false;
                x(viewStructure);
            } catch (Throwable th) {
                this.Q0 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            za.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object onVar;
        ba1 ba1VarF;
        if (this.J0) {
            ia iaVar = this.I0;
            removeCallbacks(iaVar);
            MotionEvent motionEvent2 = this.z0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.J0 = false;
            } else {
                iaVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int iH = h(motionEvent);
            int i = 1;
            if ((iH & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (onVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    onVar = new on(i);
                }
                if (onVar.equals(new on(i)) && (ba1VarF = ((ey) getFocusOwner()).f()) != null) {
                    f63 f63VarN = j51.N(ba1VarF);
                    wv3 wv3VarC = wr1.n(f63VarN).C(f63VarN, true);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (!((fIntBitsToFloat < wv3VarC.c) & (fIntBitsToFloat >= wv3VarC.a) & (fIntBitsToFloat2 >= wv3VarC.b) & (fIntBitsToFloat2 < wv3VarC.d))) {
                        ((ey) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iH & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return te5.q(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        wv3 wv3VarA;
        if (view == null || this.f0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.equals(this)) {
            ViewParent parent = viewFindNextFocus.getParent();
            while (true) {
                if (parent == null) {
                    viewFindNextFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        } else {
            viewFindNextFocus = null;
            break;
        }
        if (view == this) {
            ba1 ba1VarP = te5.p((ba1) ((ey) getFocusOwner()).c);
            wv3VarA = ba1VarP != null ? te5.r(ba1VarP) : null;
            if (wv3VarA == null) {
                wv3VarA = r91.a(view, this);
            }
        } else {
            wv3VarA = r91.a(view, this);
        }
        o91 o91VarC = r91.c(i);
        int i2 = o91VarC != null ? o91VarC.a : 6;
        jx3 jx3Var = new jx3();
        if (((ey) getFocusOwner()).e(i2, wv3VarA, new ea(0, jx3Var)) == null) {
            return view;
        }
        Object obj = jx3Var.n;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || kb4.F(te5.r((ba1) obj), r91.a(viewFindNextFocus, this), wv3VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final void g(c72 c72Var, boolean z) {
        this.f0.g(c72Var, z);
    }

    public f3 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final id getAndroidViewsHandler$ui() {
        if (this.c0 == null) {
            id idVar = new id(getContext());
            this.c0 = idVar;
            addView(idVar, -1);
            requestLayout();
        }
        id idVar2 = this.c0;
        idVar2.getClass();
        return idVar2;
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

    public wv3 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ba1 ba1VarP = te5.p((ba1) ((ey) getFocusOwner()).c);
            if (ba1VarP != null) {
                return te5.r(ba1VarP);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return r91.a(viewFindFocus, this);
        }
        return null;
    }

    public u91 getFocusOwner() {
        return this.z;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        wv3 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (h12.c(((ey) getFocusOwner()).e(6, null, new k2(1, (byte) 0)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
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
        return this.f0.b.o() || !this.v.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public sz1 getInputModeManager() {
        sz1 sz1Var = this.w0;
        if (sz1Var == null) {
            sz1Var = new sz1(isInTouchMode() ? 1 : 2);
            this.w0 = sz1Var;
        }
        return sz1Var;
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

    public vd2 getLocaleList() {
        return (vd2) this.T.getValue();
    }

    public long getMeasureIteration() {
        ri2 ri2Var = this.f0;
        if (!ri2Var.c) {
            cz1.a("measureIteration should be only used during the measure/layout pass");
        }
        return ri2Var.g;
    }

    public ex2 getModifierLocalManager() {
        return this.x0;
    }

    public ra getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public ig3 getPlacementScope() {
        k52 k52Var = kg3.a;
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
        bs0 bs0Var = this.t;
        if (bs0Var != null) {
            return bs0Var;
        }
        h80 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        j54 j54Var = composeViewContext.e;
        j54Var.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strG = xa3.g("SaveableStateRegistry:", strValueOf);
        rm3 rm3VarF = j54Var.f();
        Bundle bundleA = rm3VarF.A(strG);
        if (bundleA != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleA.keySet()) {
                ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        boolean z = false;
        z = false;
        k2 k2Var = new k2(13, z ? (byte) 1 : (byte) 0);
        wl4 wl4Var = z44.a;
        y44 y44Var = new y44(linkedHashMap, k2Var);
        if (rm3VarF.G(strG) == null) {
            try {
                rm3VarF.L(strG, new cs0(z ? 1 : 0, y44Var));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        bs0 bs0Var2 = new bs0(y44Var, new ds0(z, rm3VarF, strG));
        this.t = bs0Var2;
        return bs0Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        rm2 rm2Var;
        if (Build.VERSION.SDK_INT >= 31 && (rm2Var = this.R0) != null && ((Boolean) ((zd3) rm2Var.o).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ra) {
                return ((ra) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public l94 getSemanticsOwner() {
        return this.I;
    }

    public e72 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? oe.a.a(this) : this.b0;
    }

    public wb3 getSnapshotObserver() {
        return this.a0;
    }

    public wh4 getSoftwareKeyboardController() {
        om0 om0Var = this.t0;
        if (om0Var != null) {
            return om0Var;
        }
        getTextInputService();
        om0 om0Var2 = new om0(4);
        this.t0 = om0Var2;
        return om0Var2;
    }

    public is4 getTextInputService() {
        is4 is4Var = this.r0;
        if (is4Var != null) {
            return is4Var;
        }
        getLegacyTextInputServiceAndroid();
        is4 is4Var2 = new is4();
        new AtomicReference(null);
        this.r0 = is4Var2;
        return is4Var2;
    }

    public at4 getTextToolbar() {
        pa paVar = this.y0;
        if (paVar != null) {
            return paVar;
        }
        pa paVar2 = new pa(4);
        this.y0 = paVar2;
        return paVar2;
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

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int h(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        ra raVar;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iF;
        cm1 cm1Var;
        ra raVar2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        tx2 tx2Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        cm1 cm1Var2;
        ra raVar3 = this;
        raVar3.removeCallbacks(raVar3.H0);
        try {
            z(motionEvent);
            raVar3.n0 = true;
            raVar3.q(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = raVar3.z0;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                jw jwVar = raVar3.R;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        raVar = this;
                    } else {
                        raVar = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = raVar.z0;
                    if (motionEvent3 != null) {
                        motionEvent4 = raVar.z0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        tx2Var = raVar.Q;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = raVar.z0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = raVar.z0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = raVar.z0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        tx2Var.c.delete(pointerId);
                                        tx2Var.b.delete(pointerId);
                                    }
                                    cm1Var2 = (cm1) jwVar.p;
                                    if (cm1Var2.d) {
                                        cm1Var2.d = true;
                                    } else {
                                        cm1Var2.g.a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        tx2Var.c.delete(pointerId);
                                        tx2Var.b.delete(pointerId);
                                    }
                                    cm1Var2 = (cm1) jwVar.p;
                                    if (cm1Var2.d) {
                                        cm1Var2.d = true;
                                    } else {
                                        cm1Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = raVar.z0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = raVar.z0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = raVar.z0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    tx2Var.c.delete(pointerId);
                                    tx2Var.b.delete(pointerId);
                                }
                                cm1Var2 = (cm1) jwVar.p;
                                if (cm1Var2.d) {
                                    cm1Var2.d = true;
                                } else {
                                    cm1Var2.g.a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    tx2Var.c.delete(pointerId);
                                    tx2Var.b.delete(pointerId);
                                }
                                cm1Var2 = (cm1) jwVar.p;
                                if (cm1Var2.d) {
                                    cm1Var2.d = true;
                                } else {
                                    cm1Var2.g.a.g();
                                }
                            }
                        }
                    }
                    raVar.z0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        raVar.G(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iF = F(motionEvent);
                    Trace.endSection();
                    if ((iF & 4) != 0) {
                        raVar2 = this;
                    } else {
                        cm1Var = (cm1) jwVar.p;
                        if (cm1Var.d) {
                            cm1Var.d = true;
                        } else {
                            cm1Var.g.a.g();
                        }
                        raVar2 = this;
                        raVar2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    raVar2.n0 = false;
                    return iF;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!jwVar.n) {
                            ((xe2) ((pz1) jwVar.q).o).a();
                            ((cm1) jwVar.p).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        raVar3.G(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !n(motionEvent)) {
                        raVar = this;
                    } else {
                        raVar = this;
                        raVar.G(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = raVar.z0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = raVar.z0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        tx2Var = raVar.Q;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = raVar.z0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = raVar.z0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = raVar.z0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        tx2Var.c.delete(pointerId);
                                        tx2Var.b.delete(pointerId);
                                    }
                                    cm1Var2 = (cm1) jwVar.p;
                                    if (cm1Var2.d) {
                                        cm1Var2.d = true;
                                    } else {
                                        cm1Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            tx2Var.c.delete(pointerId);
                            tx2Var.b.delete(pointerId);
                        }
                    }
                    raVar.z0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        raVar.G(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iF = F(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iF & 4) != 0 && z3) {
                            cm1Var = (cm1) jwVar.p;
                            if (cm1Var.d) {
                                cm1Var.d = true;
                            } else {
                                cm1Var.g.a.g();
                            }
                            raVar2 = this;
                            raVar2.G(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            raVar2 = this;
                        }
                        raVar2.n0 = false;
                        return iF;
                    } catch (Throwable th) {
                        th = th;
                        raVar3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        raVar3.n0 = false;
        throw th;
    }

    @Override // defpackage.rl0
    public final void j(ba2 ba2Var) {
        ez ezVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(te5.v());
        }
        ha2 ha2Var = this.s;
        if (ha2Var != null) {
            ga2 ga2Var = this.r;
            ga2Var.getClass();
            pz1 pz1Var = ha2Var.a;
            wf2 wf2Var = (wf2) pz1Var.o;
            if (!wf2Var.n || wf2Var.p) {
                return;
            }
            try {
                ezVarS = ((yd5) ga2Var).a.s(new wc(13, ha2Var));
            } catch (CancellationException unused) {
                wf2 wf2Var2 = (wf2) pz1Var.o;
                if (!wf2Var2.o) {
                    if (wf2Var2.p) {
                        po3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wf2Var2.a();
                    wf2Var2.p = true;
                }
                ezVarS = null;
            }
            ez ezVar = ha2Var.d;
            if (ezVar != null) {
                ezVar.cancel();
            }
            ha2Var.d = ezVarS;
        }
    }

    public final void k(c72 c72Var) {
        this.f0.r(c72Var, false);
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            k((c72) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.z0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        y14 y14Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().G()) {
            getRoot().d(this);
        }
        int i = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(te5.v());
        }
        this.E.onViewAttachedToWindow(this);
        if (!this.P0) {
            getComposeViewContext().e();
        }
        int i2 = 0;
        this.P0 = false;
        k(getRoot());
        i(getRoot());
        pp3 pp3Var = getSnapshotObserver().a;
        z zVar = (z) pp3Var.e;
        jh4.e(jh4.a);
        synchronized (jh4.c) {
            jh4.h = q40.F0(zVar, jh4.h);
        }
        pp3Var.i = new ss2(18, zVar);
        ra outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            kf2.o("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.C(new da(this, i));
        getComposeViewContext().d();
        h80 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        f75 f75Var = composeViewContext.f;
        ga2 ga2Var = this.r;
        if (f75Var == null || ga2Var == null) {
            y14Var = null;
        } else {
            e75 e75VarD = f75Var.d();
            c75 c75Var = new c75();
            sf0 sf0Var = sf0.b;
            e75VarD.getClass();
            sf0Var.getClass();
            bq4 bq4Var = new bq4(e75VarD, c75Var, sf0Var);
            i30 i30VarA = kx3.a(ia2.class);
            String strB = i30VarA.b();
            if (strB == null) {
                kf2.n("Local and anonymous classes can not be ViewModels");
                return;
            }
            ia2 ia2Var = (ia2) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            i03 i03Var = ia2Var.b;
            Object objB = i03Var.b(id);
            if (objB == null) {
                objB = new q03(1);
                i03Var.i(id, objB);
            }
            q03 q03Var = (q03) objB;
            Object[] objArr = q03Var.a;
            int i3 = q03Var.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((ha2) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            ha2 ha2Var = (ha2) obj;
            if (ha2Var == null) {
                ha2Var = new ha2();
                q03Var.a(ha2Var);
            }
            ha2Var.c = true;
            this.s = ha2Var;
            y14Var = ha2Var.b;
        }
        if (y14Var == null) {
            y14Var = fz0.b0;
        }
        this.u = y14Var;
        if1 if1Var = this.p0;
        if (if1Var != null) {
            if1Var.invoke(getComposeViewContext());
            this.p0 = null;
        }
        ea2 ea2VarH = getComposeViewContext().d().h();
        ea2VarH.a(this);
        ea2VarH.a(this.K);
        getInputModeManager().a.setValue(new qz1(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            eb.a.b(this);
        }
        y9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((q03) ((ey) getFocusOwner()).g).a(autofillManager);
            getSemanticsOwner().d.a(autofillManager);
        }
        ((q03) ((ey) getFocusOwner()).g).a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.s0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return false;
        }
        kf2.k();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.s0.get() == null) {
            getLegacyTextInputServiceAndroid().getClass();
            return null;
        }
        kf2.k();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        i94 i94Var;
        lb lbVar = this.K;
        lbVar.getClass();
        for (long j : jArr) {
            k94 k94Var = (k94) lbVar.d().b((int) j);
            if (k94Var != null && (i94Var = k94Var.a) != null) {
                db.p();
                ViewTranslationRequest.Builder builderL = db.l(lbVar.n.getAutofillId(), i94Var.f);
                Object objG = i94Var.d.n.g(n94.z);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderL.setValue("android:text", TranslationRequestValue.forText(new he(gc2.a(list, "\n", null, 62))));
                    consumer.accept(builderL.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.E.onViewDetachedFromWindow(this);
        View view = this.y;
        if (l() && view != null) {
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            q03 q03Var = X0;
            synchronized (q03Var) {
                q03Var.j(this);
            }
        }
        getComposeViewContext().b();
        wb3 snapshotObserver = getSnapshotObserver();
        ss2 ss2Var = (ss2) snapshotObserver.a.i;
        if (ss2Var != null) {
            ss2Var.d();
        }
        pp3 pp3Var = snapshotObserver.a;
        synchronized (pp3Var.h) {
            f13 f13Var = (f13) pp3Var.g;
            Object[] objArr = f13Var.n;
            int i = f13Var.p;
            for (int i2 = 0; i2 < i; i2++) {
                sh4 sh4Var = (sh4) objArr[i2];
                sh4Var.e.a();
                sh4Var.f.a();
                sh4Var.l.a();
                sh4Var.m.clear();
            }
        }
        ea2 ea2VarH = getComposeViewContext().d().h();
        ea2VarH.f(this.K);
        ea2VarH.f(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ha2 ha2Var = this.s;
        if (ha2Var != null) {
            ha2Var.c = false;
        }
        this.s = null;
        if (Build.VERSION.SDK_INT >= 31) {
            eb.a.a(this);
        }
        y9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.j(autofillManager);
            ((q03) ((ey) getFocusOwner()).g).j(autofillManager);
        }
        yv3 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        yv3 rectManager2 = getRectManager();
        ga gaVar = rectManager2.i;
        if (gaVar != null) {
            rectManager2.b.removeCallbacks(gaVar);
            rectManager2.i = null;
        }
        ((q03) ((ey) getFocusOwner()).g).j(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        ey eyVar = (ey) getFocusOwner();
        uc5.P((ba1) eyVar.c, true);
        if (eyVar.f() != null) {
            ba1 ba1VarF = eyVar.f();
            eyVar.h(null);
            if (ba1VarF != null) {
                ba1VarF.r0(z91.n, z91.p);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.m0 = 0L;
        I();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        H(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.m0 = 0L;
            this.f0.l(this.M0);
            this.d0 = null;
            I();
            if (this.c0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ri2 ri2Var = this.f0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().G()) {
                getRoot().d(this);
            }
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jF = f(i);
            long jF2 = f(i2);
            long jL = zz1.l((int) (jF >>> 32), (int) (jF & 4294967295L), (int) (jF2 >>> 32), (int) (4294967295L & jF2));
            nc0 nc0Var = this.d0;
            if (nc0Var == null) {
                this.d0 = new nc0(jL);
                this.e0 = false;
            } else if (!nc0.b(nc0Var.a, jL)) {
                this.e0 = true;
            }
            ri2Var.s(jL);
            ri2Var.n();
            setMeasuredDimension(getRoot().R.p.n, getRoot().R.p.o);
            if (this.c0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().R.p.n, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().R.p.o, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!d() || viewStructure == null || this.Q0) {
            return;
        }
        x(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        r62 r62Var;
        if (this.p) {
            int[] iArr = r91.a;
            r62 r62Var2 = r62.n;
            if (i != 0) {
                r62Var = i != 1 ? null : r62.o;
            } else {
                r62Var = r62Var2;
            }
            if (r62Var != null) {
                r62Var2 = r62Var;
            }
            setLayoutDirection(r62Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        rm2 rm2Var;
        if (Build.VERSION.SDK_INT < 31 || (rm2Var = this.R0) == null) {
            return;
        }
        l94 semanticsOwner = getSemanticsOwner();
        ne0 coroutineContext = getCoroutineContext();
        f13 f13Var = new f13(new j64[16]);
        gb.h0(semanticsOwner.a(), 0, new i64(1, 8, f13.class, f13Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(f13Var.n, 0, f13Var.p, new w60(1, new if1[]{new o54(10), new o54(11)}));
        int i = f13Var.p;
        j64 j64Var = (j64) (i == 0 ? null : f13Var.n[i - 1]);
        if (j64Var == null) {
            return;
        }
        k02 k02Var = j64Var.c;
        a80 a80Var = new a80(j64Var.a, k02Var, te5.a(coroutineContext), rm2Var, this);
        f63 f63Var = j64Var.d;
        wv3 wv3VarC = wr1.n(f63Var).C(f63Var, true);
        long j = (((long) k02Var.a) << 32) | (((long) k02Var.b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetH = go2.h(this, uo.U(rr2.Q(wv3VarC)), new Point((int) (j >> 32), (int) (j & 4294967295L)), a80Var);
        scrollCaptureTargetH.setScrollBounds(uo.U(k02Var));
        consumer.accept(scrollCaptureTargetH);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        I();
    }

    @Override // defpackage.rl0
    public final void onStop(ba2 ba2Var) {
        ha2 ha2Var = this.s;
        if (ha2Var != null) {
            wf2 wf2Var = (wf2) ha2Var.a.o;
            if (wf2Var.n && !wf2Var.p) {
                ez ezVar = ha2Var.d;
                if (ezVar != null) {
                    ezVar.cancel();
                }
                ha2Var.d = null;
                return;
            }
            if (wf2Var.o) {
                return;
            }
            if (!wf2Var.p) {
                po3.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!wf2Var.q.i()) {
                po3.a("Attempted to start retaining exited values with pending exited values");
            }
            wf2Var.p = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new qz1(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        lb lbVar = this.K;
        lbVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (h12.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            uo.p(lbVar, longSparseArray);
        } else {
            lbVar.n.post(new k6(1, lbVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zV;
        this.O0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zV = te5.v())) {
            return;
        }
        setShowLayoutBounds(zV);
        i(getRoot());
    }

    public final long p(long j) {
        y();
        long jA = ya4.A(j, this.k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o0 >> 32)) + Float.intBitsToFloat((int) (jA >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.o0 & 4294967295L)) + Float.intBitsToFloat((int) (jA & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void q(boolean z) {
        ri2 ri2Var = this.f0;
        if (ri2Var.b.o() || ((f13) ri2Var.e.n).p != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (ri2Var.l(z ? this.M0 : this.N0)) {
                    requestLayout();
                }
                ri2Var.b(false);
                getRectManager().a();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void r(c72 c72Var, long j) {
        ri2 ri2Var = this.f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ri2Var.m(c72Var, j);
            if (!ri2Var.b.o()) {
                ri2Var.b(false);
                getRectManager().a();
                this.N0.invoke();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            o91 o91VarC = r91.c(i);
            int i3 = o91VarC != null ? o91VarC.a : 7;
            Boolean boolE = ((ey) getFocusOwner()).e(i3, rect != null ? new wv3(rect.left, rect.top, rect.right, rect.bottom) : null, new ha(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!h12.c(boolE, bool)) {
                if (!h12.c(((ey) getFocusOwner()).e(i3, null, new ha(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((ey) getFocusOwner()).g(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s() {
        q03 q03Var;
        y9 autofillManager;
        Object[] objArr;
        if (this.W) {
            pp3 pp3Var = getSnapshotObserver().a;
            k52 k52Var = new k52(25);
            synchronized (pp3Var.h) {
                try {
                    f13 f13Var = (f13) pp3Var.g;
                    int i = f13Var.p;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = f13Var.n;
                        if (i2 >= i) {
                            break;
                        }
                        sh4 sh4Var = (sh4) objArr[i2];
                        sh4Var.c(k52Var);
                        if (!(sh4Var.f.e != 0)) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = f13Var.n;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    f13Var.p = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.W = false;
        }
        id idVar = this.c0;
        if (idVar != null) {
            e(idVar);
        }
        if (d() && (autofillManager = getAutofillManager()) != null) {
            j03 j03Var = autofillManager.t;
            if (j03Var.d == 0 && autofillManager.u) {
                autofillManager.n.k().commit();
                autofillManager.u = false;
            }
            if (j03Var.d != 0) {
                autofillManager.u = true;
            }
        }
        while (this.C0.i() && this.C0.f(0) != null) {
            int i5 = this.C0.b;
            int i6 = 0;
            while (true) {
                q03Var = this.C0;
                if (i6 < i5) {
                    gf1 gf1Var = (gf1) q03Var.f(i6);
                    this.C0.n(i6, null);
                    if (gf1Var != null) {
                        gf1Var.invoke();
                    }
                    i6++;
                }
            }
            q03Var.l(0, i5);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.J.u = j;
    }

    public final void setComposeViewContext(h80 h80Var) {
        if (getCoroutineContext() != h80Var.c().j() && !((c13) getRoot().n()).isEmpty()) {
            cz1.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ch4 ch4VarT = ya4.t();
        if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
        ch4 ch4VarZ = ya4.z(ch4VarT);
        try {
            h80 h80Var2 = get_composeViewContext();
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            if (h80Var != h80Var2) {
                if (isAttachedToWindow()) {
                    h80Var2.b();
                    h80Var.e();
                }
                set_composeViewContext(h80Var);
                setCoroutineContext(h80Var.c().j());
            }
        } catch (Throwable th) {
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.P0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.S.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(lb lbVar) {
        this.K = lbVar;
    }

    public void setCoroutineContext(ne0 ne0Var) {
        this.A = ne0Var;
    }

    public final void setFrameEndScheduler$ui(ga2 ga2Var) {
        this.r = ga2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.m0 = j;
    }

    public final void setOnReadyForComposition(if1 if1Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.P0) {
            if1Var.invoke(getComposeViewContext());
        } else {
            this.p0 = if1Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(wf1 wf1Var) {
        this.K0 = wf1Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m69setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(dy1 dy1Var) {
        this.q = dy1Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.b0 = z;
    }

    public void setUncaughtExceptionHandler(a34 a34Var) {
        this.f0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(a34 a34Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(c72 c72Var) {
        ya yaVar = this.J;
        yaVar.K = true;
        if (yaVar.v()) {
            yaVar.w(c72Var);
        }
        lb lbVar = this.K;
        lbVar.t = true;
        if (lbVar.e()) {
            lbVar.u.d(j15.a);
        }
    }

    public final void u(c72 c72Var, boolean z, boolean z2, boolean z3) {
        c72 c72VarT;
        c72 c72VarT2;
        ri2 ri2Var = this.f0;
        if (!z) {
            if (ri2Var.r(c72Var, z2) && z3) {
                D(c72Var);
                return;
            }
            return;
        }
        i61 i61Var = ri2Var.b;
        c72 c72Var2 = c72Var.u;
        f72 f72Var = c72Var.R;
        if (c72Var2 == null) {
            cz1.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = f72Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    er1.n();
                    return;
                }
                if (!f72Var.e || z2) {
                    f72Var.e = true;
                    f72Var.p.E = true;
                    if (c72Var.Z) {
                        return;
                    }
                    if ((h12.c(c72Var.I(), Boolean.TRUE) || ri2.i(c72Var)) && ((c72VarT = c72Var.t()) == null || !c72VarT.R.e)) {
                        i61Var.c(c72Var, n12.n);
                    } else if ((c72Var.H() || ri2.j(c72Var)) && ((c72VarT2 = c72Var.t()) == null || !c72VarT2.q())) {
                        i61Var.c(c72Var, n12.p);
                    }
                    if (ri2Var.d || !z3) {
                        return;
                    }
                    D(c72Var);
                    return;
                }
                return;
            }
        }
        ri2Var.h.b(new qi2(c72Var, true, z2));
    }

    public final void v(c72 c72Var, boolean z, boolean z2) {
        f72 f72Var = c72Var.R;
        n12 n12Var = n12.q;
        ri2 ri2Var = this.f0;
        if (!z) {
            ri2Var.getClass();
            int iOrdinal = f72Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                er1.n();
                return;
            }
            c72 c72VarT = c72Var.t();
            boolean z3 = c72VarT == null || c72VarT.H();
            if (!z2) {
                if (c72Var.q()) {
                    return;
                }
                if (c72Var.p() && c72Var.H() == z3 && c72Var.H() == f72Var.p.D) {
                    return;
                }
            }
            ti2 ti2Var = f72Var.p;
            ti2Var.F = true;
            ti2Var.G = true;
            if (!c72Var.Z && ti2Var.D && z3) {
                if ((c72VarT == null || !c72VarT.p()) && (c72VarT == null || !c72VarT.q())) {
                    ri2Var.b.c(c72Var, n12Var);
                }
                if (ri2Var.d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        i61 i61Var = ri2Var.b;
        int iOrdinal2 = f72Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    er1.n();
                    return;
                }
            }
        }
        if ((f72Var.e || f72Var.f) && !z2) {
            return;
        }
        f72Var.f = true;
        f72Var.g = true;
        ti2 ti2Var2 = f72Var.p;
        ti2Var2.F = true;
        ti2Var2.G = true;
        if (c72Var.Z) {
            return;
        }
        c72 c72VarT2 = c72Var.t();
        if (h12.c(c72Var.I(), Boolean.TRUE) && ((c72VarT2 == null || !c72VarT2.R.e) && (c72VarT2 == null || !c72VarT2.R.f))) {
            i61Var.c(c72Var, n12.o);
        } else if (c72Var.H() && ((c72VarT2 == null || !c72VarT2.p()) && (c72VarT2 == null || !c72VarT2.q()))) {
            i61Var.c(c72Var, n12Var);
        }
        if (ri2Var.d) {
            return;
        }
        D(null);
    }

    public final void w() {
        ya yaVar = this.J;
        yaVar.K = true;
        Handler handler = yaVar.q.getHandler();
        if (yaVar.v() && !yaVar.V && handler != null) {
            yaVar.V = true;
            handler.post(yaVar.X);
        }
        lb lbVar = this.K;
        lbVar.t = true;
        Handler handler2 = lbVar.n.getHandler();
        if (!lbVar.e() || lbVar.z || handler2 == null) {
            return;
        }
        lbVar.z = true;
        handler2.post(lbVar.A);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    public final void x(ViewStructure viewStructure) {
        y9 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            c72 c72Var = autofillManager.o.a;
            AutofillId autofillId = autofillManager.s;
            String str = autofillManager.r;
            yv3 yv3Var = autofillManager.q;
            zz1.z(viewStructure, c72Var, autofillId, str, yv3Var);
            Object[] objArr = t73.a;
            q03 q03Var = new q03(2);
            q03Var.a(c72Var);
            q03Var.a(viewStructure);
            while (q03Var.i()) {
                Object objK = q03Var.k(q03Var.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = q03Var.k(q03Var.b - 1);
                objK2.getClass();
                c13 c13Var = (c13) ((c72) objK2).n();
                int i = c13Var.n.p;
                for (int i2 = 0; i2 < i; i2++) {
                    c72 c72Var2 = (c72) c13Var.get(i2);
                    if (!c72Var2.Z && c72Var2.G() && c72Var2.H()) {
                        e94 e94VarV = c72Var2.v();
                        if (e94VarV != null) {
                            w03 w03Var = e94VarV.n;
                            if (w03Var.b(d94.g) || w03Var.b(d94.h) || w03Var.b(n94.q) || w03Var.b(n94.r) || (Build.VERSION.SDK_INT >= 34 && w03Var.b(zz1.m))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                zz1.z(viewStructureNewChild, c72Var2, autofillManager.s, str, yv3Var);
                                q03Var.a(c72Var2);
                                q03Var.a(viewStructureNewChild);
                            } else {
                                q03Var.a(c72Var2);
                                q03Var.a(viewStructure2);
                            }
                        } else {
                            q03Var.a(c72Var2);
                            q03Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        x9 autofill = getAutofill();
        if (autofill != null) {
            wn wnVar = autofill.b;
            LinkedHashMap linkedHashMap = wnVar.a;
            LinkedHashMap linkedHashMap2 = wnVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    kf2.k();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    public final void y() {
        if (this.n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.m0) {
            this.m0 = jCurrentAnimationTimeMillis;
            A();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.h0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.o0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.m0 = AnimationUtils.currentAnimationTimeMillis();
        A();
        float x = motionEvent.getX();
        long jA = ya4.A((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.k0);
        this.o0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
    }

    public x9 getAutofill() {
        return this.U;
    }

    public y9 getAutofillManager() {
        return this.V;
    }

    public qb getDragAndDropManager() {
        return this.B;
    }

    public i03 getLayoutNodes() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
