package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import app.homemusic.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fr {
    public static final int[] A = null;
    public static final String B = null;
    public static final a61 w = null;
    public static final LinearInterpolator x = null;
    public static final a61 y = null;
    public static final Handler z = null;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final er i;
    public final SnackbarContentLayout j;
    public int k;
    public cr l;
    public final zq m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public final AccessibilityManager u;
    public final br v;

    static {
        w = yd.b;
        x = yd.a;
        y = yd.d;
        A = new int[]{R.attr.snackbarStyle};
        B = fr.class.getSimpleName();
        z = new Handler(Looper.getMainLooper(), new yq(0));
    }

    public fr(Context r5, ViewGroup r6, View r7, SnackbarContentLayout r8) {
        int r1 = 0;
        this.m = new zq(this, r1);
        this.v = new br(this);
        if (r7 == null) goto L19;
        if (r8 == null) goto L17;
        this.g = r6;
        this.j = r8;
        this.h = r5;
        uc5.h(r5, uc5.g, "Theme.AppCompat");
        LayoutInflater r9 = LayoutInflater.from(r5);
        TypedArray r0 = r5.obtainStyledAttributes(A);
        int r3 = r0.getResourceId(0, -1);
        r0.recycle();
        if (r3 == (-1)) goto L8;
        int r2 = R.layout.mtrl_layout_snackbar;
    L9:
        er r10 = (er) r9.inflate(r2, r6, false);
        this.i = r10;
        er.a(r10, this);
        if ((r7 instanceof SnackbarContentLayout) == false) goto L15;
        SnackbarContentLayout r11 = (SnackbarContentLayout) r7;
        float r4 = r10.getActionTextColorAlpha();
        if (r4 == 1.0f) goto L14;
        int r12 = r11.o.getCurrentTextColor();
        int r13 = g12.H(g12.t(r11, R.attr.colorSurface), r4, r12);
        r11.o.setTextColor(r13);
    L14:
        r11.setMaxInlineActionWidth(r10.getMaxInlineActionWidth());
    L15:
        r10.addView(r7);
        WeakHashMap r14 = j65.a;
        r10.setAccessibilityLiveRegion(1);
        r10.setImportantForAccessibility(1);
        r10.setFitsSystemWindows(true);
        a65.c(r10, new hg3(7, this));
        j65.o(r10, new ar(r1, this));
        this.u = (AccessibilityManager) r5.getSystemService("accessibility");
        this.c = g12.N(r5, R.attr.motionDurationLong2, 250);
        this.a = g12.N(r5, R.attr.motionDurationLong2, 150);
        this.b = g12.N(r5, R.attr.motionDurationMedium1, 75);
        this.d = g12.O(r5, R.attr.motionEasingEmphasizedInterpolator, x);
        this.f = g12.O(r5, R.attr.motionEasingEmphasizedInterpolator, y);
        this.e = g12.O(r5, R.attr.motionEasingEmphasizedInterpolator, w);
        return;
    L8:
        r2 = R.layout.design_layout_snackbar;
        goto L9
    L17:
        kf2.n("Transient bottom bar must have non-null callback");
        throw null;
    L19:
        kf2.n("Transient bottom bar must have non-null content");
        throw null;
    }

    public final void a(int r4) {
        na4 r0 = na4.z();
        br r3 = this.v;
        Object r1 = r0.n;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.G(r3) == false) goto L9;
        r0.j((rg4) r0.p, r4);     // Catch: Throwable -> L7
    L17:
        monitor-exit(r1);     // Catch: Throwable -> L7
        return;
    L9:
        rg4 r2 = (rg4) r0.q;     // Catch: Throwable -> L7
        if (r2 != null) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == false) goto L17;
        r0.j((rg4) r0.q, r4);     // Catch: Throwable -> L7
        goto L17
    L12:
        if (r2.a.get() != r3) goto L14;
        r5 = true;
        goto L15
    }

    public final View b() {
        cr r0 = this.l;
        if (r0 != null) goto L7;
        return null;
    L7:
        return (View) r0.o.get();
    }

    public final void c() {
        na4 r0 = na4.z();
        br r1 = this.v;
        Object r2 = r0.n;
        monitor-enter(r2);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r0.G(r1) == false) goto L11;
        r0.p = null;     // Catch: Throwable -> L9
        if (((rg4) r0.q) == null) goto L11;
        r0.Q();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L9
        ViewParent r3 = this.i.getParent();
        if ((r3 instanceof ViewGroup) == false) goto L20;
        ((ViewGroup) r3).removeView(this.i);
        return;
    }

    public final void d() {
        na4 r0 = na4.z();
        br r2 = this.v;
        Object r1 = r0.n;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.G(r2) == false) goto L9;
        r0.P((rg4) r0.p);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
    }

    public final void e(FrameLayout r3) {
        cr r0 = this.l;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        if (r3 != null) goto L7;
        cr r4 = null;
    L11:
        this.l = r4;
        return;
    L7:
        cr r1 = new cr(this, r3);
        WeakHashMap r2 = j65.a;
        if (r3.isAttachedToWindow() == false) goto L10;
        r3.getViewTreeObserver().addOnGlobalLayoutListener(r1);
    L10:
        r3.addOnAttachStateChangeListener(r1);
        r4 = r1;
        goto L11
    }

    public final void f() {
        boolean r1 = true;
        AccessibilityManager r2 = this.u;
        if (r2 == null) goto L11;
        List<AccessibilityServiceInfo> r3 = r2.getEnabledAccessibilityServiceList(1);
        if (r3 != null) goto L8;
    L10:
        r1 = false;
        goto L11
    L8:
        if (r3.isEmpty() == false) goto L10;
    L11:
        er r4 = this.i;
        if (r1 == false) goto L16;
        r4.post(new zq(this, 2));
        return;
    L16:
        if (r4.getParent() == null) goto L18;
        r4.setVisibility(0);
    L18:
        d();
    }

    public final void g() {
        er r0 = this.i;
        ViewGroup.LayoutParams r1 = r0.getLayoutParams();
        boolean r2 = r1 instanceof ViewGroup.MarginLayoutParams;
        String r3 = B;
        if (r2 == true) goto L7;
        Log.w(r3, "Unable to update margins because layout params are not MarginLayoutParams");
        return;
    L7:
        if (r0.w != null) goto L11;
        Log.w(r3, "Unable to update margins because original view margins are not set");
        return;
    L11:
        if (r0.getParent() != null) goto L14;
        return;
    L14:
        if (b() == null) goto L16;
        int r4 = this.q;
    L17:
        ViewGroup.MarginLayoutParams r5 = (ViewGroup.MarginLayoutParams) r1;
        Rect r6 = r0.w;
        int r7 = r6.bottom + r4;
        int r8 = r6.left + this.o;
        int r9 = r6.right + this.p;
        int r10 = r6.top;
        if (r5.bottomMargin == r7) goto L20;
    L27:
        boolean r11 = true;
    L28:
        if (r11 == false) goto L30;
        r5.bottomMargin = r7;
        r5.leftMargin = r8;
        r5.rightMargin = r9;
        r5.topMargin = r10;
        r0.requestLayout();
    L30:
        if (r11 == true) goto L34;
        if (this.s != this.r) goto L34;
        return;
    L34:
        if (Build.VERSION.SDK_INT >= 29) goto L36;
        return;
    L36:
        if (this.r <= 0) goto L45;
        ViewGroup.LayoutParams r12 = r0.getLayoutParams();
        if ((r12 instanceof ge0) == true) goto L40;
        return;
    L40:
        if ((((ge0) r12).a instanceof SwipeDismissBehavior) == false) goto L47;
        zq r13 = this.m;
        r0.removeCallbacks(r13);
        r0.post(r13);
        return;
    L47:
        return;
    L45:
        return;
    L20:
        if (r5.leftMargin != r8) goto L27;
        if (r5.rightMargin != r9) goto L27;
        if (r5.topMargin != r10) goto L27;
        r11 = false;
        goto L28
    L16:
        r4 = this.n;
        goto L17
    }
}
