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
    public jv4(View r4, CharSequence r5) {
        final int r1 = 0;
        this.q = new iv4(this, r1);
        final int r2 = 1;
        this.r = new iv4(this, r2);
        this.n = r4;
        this.o = r5;
        ViewConfiguration r6 = ViewConfiguration.get(r4.getContext());
        Method r0 = n65.a;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        int r7 = ne.n(r6);
    L6:
        this.p = r7;
        this.w = true;
        r4.setOnLongClickListener(this);
        r4.setOnHoverListener(this);
        return;
    L5:
        r7 = r6.getScaledTouchSlop() / 2;
        goto L6
    }

    public static void b(jv4 r3) {
        jv4 r0 = x;
        if (r0 == null) goto L5;
        r0.n.removeCallbacks(r0.q);
    L5:
        x = r3;
        if (r3 == null) goto L9;
        r3.n.postDelayed(r3.q, ViewConfiguration.getLongPressTimeout());
        return;
    }

    public final void a() {
        jv4 r0 = y;
        View r1 = this.n;
        if (r0 != this) goto L12;
        y = null;
        lv4 r2 = this.u;
        if (r2 == null) goto L10;
        View r3 = (View) r2.o;
        if (r3.getParent() == null) goto L9;
        ((WindowManager) ((Context) r2.n).getSystemService("window")).removeView(r3);
    L9:
        this.u = null;
        this.w = true;
        r1.removeOnAttachStateChangeListener(this);
        goto L12
    L10:
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
    L12:
        if (x != this) goto L14;
        b(null);
    L14:
        r1.removeCallbacks(this.r);
    }

    public final void c(boolean r22) {
        View r1 = this.n;
        if (r1.isAttachedToWindow() == true) goto L5;
        return;
    L5:
        b(null);
        jv4 r2 = y;
        if (r2 == null) goto L8;
        r2.a();
    L8:
        y = this;
        this.v = r22;
        lv4 r3 = new lv4(r1.getContext());
        View r4 = (View) r3.o;
        Context r5 = (Context) r3.n;
        this.u = r3;
        int r6 = this.s;
        int r7 = this.t;
        boolean r8 = this.v;
        WindowManager.LayoutParams r9 = (WindowManager.LayoutParams) r3.q;
        if (r4.getParent() != null) goto L11;
    L13:
        ((TextView) r3.p).setText(this.o);
        int[] r10 = (int[]) r3.t;
        int[] r11 = (int[]) r3.s;
        Rect r12 = (Rect) r3.r;
        r9.token = r1.getApplicationWindowToken();
        int r13 = r5.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (r1.getWidth() >= r13) goto L18;
        r6 = r1.getWidth() / 2;
    L18:
        if (r1.getHeight() < r13) goto L20;
        int r14 = r5.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
        int r15 = r7 + r14;
        int r16 = r7 - r14;
    L21:
        r9.gravity = 49;
        Resources r17 = r5.getResources();
        if (r8 == false) goto L25;
        int r18 = R.dimen.tooltip_y_offset_touch;
    L26:
        int r19 = r17.getDimensionPixelOffset(r18);
        View r110 = r1.getRootView();
        ViewGroup.LayoutParams r111 = r110.getLayoutParams();
        int r112 = r6;
        if ((r111 instanceof WindowManager.LayoutParams) == true) goto L29;
    L31:
        Context r20 = r1.getContext();
    L33:
        if ((r20 instanceof ContextWrapper) == false) goto L38;
        if ((r20 instanceof Activity) == true) goto L36;
        r20 = ((ContextWrapper) r20).getBaseContext();
        goto L33
    L36:
        r110 = ((Activity) r20).getWindow().getDecorView();
    L38:
        if (r110 != null) goto L40;
        Log.e("TooltipPopup", "Cannot find app view");
        int r113 = 1;
    L59:
        ((WindowManager) r5.getSystemService("window")).addView(r4, r9);
        r1.addOnAttachStateChangeListener(this);
        if (this.v == false) goto L62;
        long r21 = 2500;
    L67:
        iv4 r0 = this.r;
        r1.removeCallbacks(r0);
        r1.postDelayed(r0, r21);
        return;
    L62:
        WeakHashMap r23 = j65.a;
        if ((r1.getWindowSystemUiVisibility() & 1) != r113) goto L66;
        long r24 = ViewConfiguration.getLongPressTimeout();
        long r25 = 3000;
    L65:
        r21 = r25 - r24;
        goto L67
    L66:
        r24 = ViewConfiguration.getLongPressTimeout();
        r25 = 15000;
        goto L65
    L40:
        r110.getWindowVisibleDisplayFrame(r12);
        if (r12.left < 0) goto L43;
    L49:
        int r114 = 0;
        r113 = 1;
    L50:
        r110.getLocationOnScreen(r10);
        r1.getLocationOnScreen(r11);
        int r26 = r11[r114] - r10[r114];
        r11[r114] = r26;
        r11[r113] = r11[r113] - r10[r113];
        r9.x = (r26 + r112) - (r110.getWidth() / 2);
        int r27 = View.MeasureSpec.makeMeasureSpec(r114, r114);
        r4.measure(r27, r27);
        int r28 = r4.getMeasuredHeight();
        int r29 = r11[r113];
        int r30 = ((r29 + r16) - r19) - r28;
        int r31 = (r29 + r15) + r19;
        if (r8 == false) goto L56;
        if (r30 < 0) goto L54;
        r9.y = r30;
        goto L59
    L54:
        r9.y = r31;
        goto L59
    L56:
        if ((r28 + r31) > r12.height()) goto L58;
        r9.y = r31;
        goto L59
    L58:
        r9.y = r30;
        goto L59
    L43:
        if (r12.top >= 0) goto L49;
        Resources r115 = r5.getResources();
        r113 = 1;
        int r32 = r115.getIdentifier("status_bar_height", "dimen", "android");
        if (r32 == 0) goto L47;
        int r33 = r115.getDimensionPixelSize(r32);
    L48:
        DisplayMetrics r34 = r115.getDisplayMetrics();
        r114 = 0;
        r12.set(0, r33, r34.widthPixels, r34.heightPixels);
        goto L50
    L47:
        r33 = 0;
        goto L48
    L29:
        if (((WindowManager.LayoutParams) r111).type != 2) goto L31;
    L25:
        r18 = R.dimen.tooltip_y_offset_non_touch;
        goto L26
    L20:
        r15 = r1.getHeight();
        r16 = 0;
        goto L21
    L11:
        if (r4.getParent() == null) goto L13;
        ((WindowManager) r5.getSystemService("window")).removeView(r4);
        goto L13
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View r4, MotionEvent r5) {
        if (this.u != null) goto L5;
    L7:
        View r6 = this.n;
        AccessibilityManager r1 = (AccessibilityManager) r6.getContext().getSystemService("accessibility");
        if (r1.isEnabled() == true) goto L10;
    L12:
        int r2 = r5.getAction();
        if (r2 == 7) goto L20;
        if (r2 != 10) goto L30;
        this.w = true;
        a();
        return false;
    L30:
        return false;
    L20:
        if (r6.isEnabled() == false) goto L30;
        if (this.u != null) goto L30;
        int r7 = (int) r5.getX();
        int r8 = (int) r5.getY();
        if (this.w == true) goto L29;
        int r3 = Math.abs(r7 - this.s);
        int r9 = this.p;
        if (r3 > r9) goto L29;
        if (Math.abs(r8 - this.t) <= r9) goto L30;
    L29:
        this.s = r7;
        this.t = r8;
        this.w = false;
        b(this);
        goto L30
    L10:
        if (r1.isTouchExplorationEnabled() == false) goto L12;
    L5:
        if (this.v == false) goto L7;
        goto L7
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View r2) {
        this.s = r2.getWidth() / 2;
        this.t = r2.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
        a();
    }
}
