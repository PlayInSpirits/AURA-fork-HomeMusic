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
    public final br v = new br(this);
    public static final a61 w = yd.b;
    public static final LinearInterpolator x = yd.a;
    public static final a61 y = yd.d;
    public static final int[] A = {R.attr.snackbarStyle};
    public static final String B = fr.class.getSimpleName();
    public static final Handler z = new Handler(Looper.getMainLooper(), new yq(0));

    public fr(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.m = new zq(this, i);
        if (view == null) {
            kf2.n("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            kf2.n("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        uc5.h(context, uc5.g, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        er erVar = (er) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = erVar;
        erVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = erVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.o.setTextColor(g12.H(g12.t(snackbarContentLayout2, R.attr.colorSurface), actionTextColorAlpha, snackbarContentLayout2.o.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(erVar.getMaxInlineActionWidth());
        }
        erVar.addView(view);
        WeakHashMap weakHashMap = j65.a;
        erVar.setAccessibilityLiveRegion(1);
        erVar.setImportantForAccessibility(1);
        erVar.setFitsSystemWindows(true);
        a65.c(erVar, new hg3(7, this));
        j65.o(erVar, new ar(i, this));
        this.u = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = g12.N(context, R.attr.motionDurationLong2, 250);
        this.a = g12.N(context, R.attr.motionDurationLong2, 150);
        this.b = g12.N(context, R.attr.motionDurationMedium1, 75);
        this.d = g12.O(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.f = g12.O(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.e = g12.O(context, R.attr.motionEasingEmphasizedInterpolator, w);
    }

    public final void a(int i) {
        na4 na4VarZ = na4.z();
        br brVar = this.v;
        synchronized (na4VarZ.n) {
            try {
                if (na4VarZ.G(brVar)) {
                    na4VarZ.j((rg4) na4VarZ.p, i);
                } else {
                    rg4 rg4Var = (rg4) na4VarZ.q;
                    if (rg4Var != null && rg4Var.a.get() == brVar) {
                        na4VarZ.j((rg4) na4VarZ.q, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final View b() {
        cr crVar = this.l;
        if (crVar == null) {
            return null;
        }
        return (View) crVar.o.get();
    }

    public final void c() {
        na4 na4VarZ = na4.z();
        br brVar = this.v;
        synchronized (na4VarZ.n) {
            try {
                if (na4VarZ.G(brVar)) {
                    na4VarZ.p = null;
                    if (((rg4) na4VarZ.q) != null) {
                        na4VarZ.Q();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        na4 na4VarZ = na4.z();
        br brVar = this.v;
        synchronized (na4VarZ.n) {
            try {
                if (na4VarZ.G(brVar)) {
                    na4VarZ.P((rg4) na4VarZ.p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(FrameLayout frameLayout) {
        cr crVar;
        cr crVar2 = this.l;
        if (crVar2 != null) {
            crVar2.a();
        }
        if (frameLayout == null) {
            crVar = null;
        } else {
            cr crVar3 = new cr(this, frameLayout);
            WeakHashMap weakHashMap = j65.a;
            if (frameLayout.isAttachedToWindow()) {
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(crVar3);
            }
            frameLayout.addOnAttachStateChangeListener(crVar3);
            crVar = crVar3;
        }
        this.l = crVar;
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        er erVar = this.i;
        if (z2) {
            erVar.post(new zq(this, 2));
            return;
        }
        if (erVar.getParent() != null) {
            erVar.setVisibility(0);
        }
        d();
    }

    public final void g() {
        er erVar = this.i;
        ViewGroup.LayoutParams layoutParams = erVar.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = B;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (erVar.w == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (erVar.getParent() == null) {
            return;
        }
        int i = b() != null ? this.q : this.n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = erVar.w;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.o;
        int i4 = rect.right + this.p;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            erVar.requestLayout();
        }
        if ((z3 || this.s != this.r) && Build.VERSION.SDK_INT >= 29 && this.r > 0) {
            ViewGroup.LayoutParams layoutParams2 = erVar.getLayoutParams();
            if ((layoutParams2 instanceof ge0) && (((ge0) layoutParams2).a instanceof SwipeDismissBehavior)) {
                zq zqVar = this.m;
                erVar.removeCallbacks(zqVar);
                erVar.post(zqVar);
            }
        }
    }
}
