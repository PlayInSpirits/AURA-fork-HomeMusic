package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jv4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static jv4 x;
    public static jv4 y;
    public final View n;
    public final CharSequence o;
    public final int p;
    public final iv4 q;
    public final iv4 r;
    public int s;
    public int t;
    public lv4 u;
    public boolean v;
    public boolean w;

    /* JADX WARN: Type inference failed for: r0v0, types: [iv4] */
    /* JADX WARN: Type inference failed for: r0v1, types: [iv4] */
    public jv4(View view, CharSequence charSequence) {
        final int i = 0;
        this.q = new Runnable(this) { // from class: iv4
            public final /* synthetic */ jv4 o;

            {
                this.o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                jv4 jv4Var = this.o;
                switch (i2) {
                    case 0:
                        jv4Var.c(false);
                        break;
                    default:
                        jv4Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new Runnable(this) { // from class: iv4
            public final /* synthetic */ jv4 o;

            {
                this.o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                jv4 jv4Var = this.o;
                switch (i3) {
                    case 0:
                        jv4Var.c(false);
                        break;
                    default:
                        jv4Var.a();
                        break;
                }
            }
        };
        this.n = view;
        this.o = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = n65.a;
        this.p = Build.VERSION.SDK_INT >= 28 ? ne.n(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.w = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(jv4 jv4Var) {
        jv4 jv4Var2 = x;
        if (jv4Var2 != null) {
            jv4Var2.n.removeCallbacks(jv4Var2.q);
        }
        x = jv4Var;
        if (jv4Var != null) {
            jv4Var.n.postDelayed(jv4Var.q, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        jv4 jv4Var = y;
        View view = this.n;
        if (jv4Var == this) {
            y = null;
            lv4 lv4Var = this.u;
            if (lv4Var != null) {
                View view2 = (View) lv4Var.o;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) lv4Var.n).getSystemService("window")).removeView(view2);
                }
                this.u = null;
                this.w = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (x == this) {
            b(null);
        }
        view.removeCallbacks(this.r);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.n;
        if (view.isAttachedToWindow()) {
            b(null);
            jv4 jv4Var = y;
            if (jv4Var != null) {
                jv4Var.a();
            }
            y = this;
            this.v = z;
            lv4 lv4Var = new lv4(view.getContext());
            View view2 = (View) lv4Var.o;
            Context context = (Context) lv4Var.n;
            this.u = lv4Var;
            int width = this.s;
            int i4 = this.t;
            boolean z2 = this.v;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) lv4Var.q;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) lv4Var.p).setText(this.o);
            int[] iArr = (int[]) lv4Var.t;
            int[] iArr2 = (int[]) lv4Var.s;
            Rect rect = (Rect) lv4Var.r;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.v) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = j65.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            iv4 iv4Var = this.r;
            view.removeCallbacks(iv4Var);
            view.postDelayed(iv4Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.u == null || !this.v) {
            View view2 = this.n;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.w = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.u == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (this.w) {
                        this.s = x2;
                        this.t = y2;
                        this.w = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x2 - this.s);
                        int i = this.p;
                        if (iAbs > i || Math.abs(y2 - this.t) > i) {
                            this.s = x2;
                            this.t = y2;
                            this.w = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.s = view.getWidth() / 2;
        this.t = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
