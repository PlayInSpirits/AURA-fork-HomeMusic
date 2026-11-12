package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z41 extends z2 {
    public static final Rect A = null;
    public static final om0 B = null;
    public static final y41 C = null;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final int[] t;
    public final AccessibilityManager u;
    public final View v;
    public ua w;
    public int x;
    public int y;
    public int z;

    static {
        A = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        B = new om0(29);
        C = new y41(0);
    }

    public z41(View r3) {
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new int[2];
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.v = r3;
        this.u = (AccessibilityManager) r3.getContext().getSystemService("accessibility");
        r3.setFocusable(true);
        WeakHashMap r0 = j65.a;
        if (r3.getImportantForAccessibility() != 0) goto L6;
        r3.setImportantForAccessibility(1);
        return;
    }

    @Override // defpackage.z2
    public final zh0 b(View r2) {
        if (this.w != null) goto L6;
        this.w = new ua(this, 1);
    L6:
        return this.w;
    }

    @Override // defpackage.z2
    public final void d(View r3, v3 r4) {
        this.n.onInitializeAccessibilityNodeInfo(r3, r4.a);
        t(r4);
    }

    public final boolean j(int r3) {
        if (this.y == r3) goto L5;
        return false;
    L5:
        this.y = Integer.MIN_VALUE;
        v(r3, false);
        x(r3, 8);
        return true;
    }

    public final AccessibilityEvent k(int r4, int r5) {
        View r1 = this.v;
        if (r4 == (-1)) goto L13;
        AccessibilityEvent r6 = AccessibilityEvent.obtain(r5);
        v3 r3 = r(r4);
        r6.getText().add(r3.g());
        AccessibilityNodeInfo r7 = r3.a;
        r6.setContentDescription(r7.getContentDescription());
        r6.setScrollable(r7.isScrollable());
        r6.setPassword(r7.isPassword());
        r6.setEnabled(r7.isEnabled());
        r6.setChecked(r7.isChecked());
        if (r6.getText().isEmpty() == true) goto L7;
    L11:
        r6.setClassName(r7.getClassName());
        r6.setSource(r1, r4);
        r6.setPackageName(r1.getContext().getPackageName());
        return r6;
    L7:
        if (r6.getContentDescription() != null) goto L11;
        tb4.e("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        return null;
    L13:
        AccessibilityEvent r8 = AccessibilityEvent.obtain(r5);
        r1.onInitializeAccessibilityEvent(r8);
        return r8;
    }

    public final v3 l(int r12) {
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain();
        v3 r1 = new v3(r0);
        r0.setEnabled(true);
        r0.setFocusable(true);
        r1.i("android.view.View");
        Rect r3 = A;
        r0.setBoundsInParent(r3);
        r0.setBoundsInScreen(r3);
        r1.b = -1;
        View r5 = this.v;
        r0.setParent(r5);
        u(r12, r1);
        if (r1.g() == null) goto L5;
    L9:
        Rect r6 = this.r;
        r1.f(r6);
        if (r6.equals(r3) == true) goto L62;
        int r8 = r0.getActions();
        if ((r8 & 64) == 0) goto L14;
        tb4.e("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        return null;
    L14:
        if ((r8 & 128) != 0) goto L58;
        r0.setPackageName(r5.getContext().getPackageName());
        r1.c = r12;
        r0.setSource(r5, r12);
        if (this.x != r12) goto L18;
        r0.setAccessibilityFocused(true);
        r1.a(128);
    L20:
        if (this.y != r12) goto L22;
        boolean r13 = true;
    L23:
        if (r13 == false) goto L26;
        r1.a(2);
    L28:
        r0.setFocused(r13);
        int[] r14 = this.t;
        r5.getLocationOnScreen(r14);
        Rect r7 = this.q;
        r0.getBoundsInScreen(r7);
        if (r7.equals(r3) == false) goto L36;
        r1.f(r7);
        if (r1.b == (-1)) goto L35;
        v3 r9 = new v3(AccessibilityNodeInfo.obtain());
        int r2 = r1.b;
    L33:
        if (r2 == (-1)) goto L35;
        r9.b = -1;
        AccessibilityNodeInfo r10 = r9.a;
        r10.setParent(r5, -1);
        r10.setBoundsInParent(r3);
        u(r2, r9);
        r9.f(r6);
        r7.offset(r6.left, r6.top);
        r2 = r9.b;
    L35:
        r7.offset(r14[0] - r5.getScrollX(), r14[1] - r5.getScrollY());
    L36:
        Rect r11 = this.s;
        if (r5.getLocalVisibleRect(r11) == false) goto L57;
        r11.offset(r14[0] - r5.getScrollX(), r14[1] - r5.getScrollY());
        if (r7.intersect(r11) == false) goto L57;
        AccessibilityNodeInfo r15 = r1.a;
        r15.setBoundsInScreen(r7);
        if (r7.isEmpty() == true) goto L57;
        if (r5.getWindowVisibility() != 0) goto L57;
        Object r16 = r5.getParent();
    L48:
        if ((r16 instanceof View) == false) goto L55;
        View r17 = (View) r16;
        if (r17.getAlpha() <= 0.0f) goto L57;
        if (r17.getVisibility() != 0) goto L57;
        r16 = r17.getParent();
        goto L48
    L55:
        if (r16 == null) goto L57;
        r15.setVisibleToUser(true);
    L57:
        return r1;
    L26:
        if (r0.isFocusable() == false) goto L28;
        r1.a(1);
        goto L28
    L22:
        r13 = false;
        goto L23
    L18:
        r0.setAccessibilityFocused(false);
        r1.a(64);
        goto L20
    L58:
        tb4.e("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        return null;
    L62:
        tb4.e("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        return null;
    L5:
        if (r0.getContentDescription() != null) goto L9;
        tb4.e("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        return null;
    }

    public final boolean m(MotionEvent r7) {
        AccessibilityManager r0 = this.u;
        if (r0.isEnabled() == true) goto L5;
        return false;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L30;
        int r1 = r7.getAction();
        if (r1 != 7) goto L10;
    L20:
        int r8 = n(r7.getX(), r7.getY());
        int r2 = this.z;
        if (r2 == r8) goto L24;
        this.z = r8;
        x(r8, 128);
        x(r2, 256);
    L24:
        if (r8 == Integer.MIN_VALUE) goto L29;
    L25:
        return true;
    L29:
        return false;
    L10:
        if (r1 == 9) goto L20;
        if (r1 != 10) goto L31;
        int r9 = this.z;
        if (r9 == Integer.MIN_VALUE) goto L28;
        if (r9 == Integer.MIN_VALUE) goto L25;
        this.z = Integer.MIN_VALUE;
        x(Integer.MIN_VALUE, 128);
        x(r9, 256);
        return true;
    L28:
        return false;
    L31:
        return false;
    L30:
        return false;
    }

    public abstract int n(float r1, float r2);

    public abstract void o(ArrayList r1);

    public final void p(int r4) {
        if (r4 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.u.isEnabled() == false) goto L11;
        View r0 = this.v;
        ViewParent r1 = r0.getParent();
        if (r1 == null) goto L12;
        AccessibilityEvent r3 = k(r4, 2048);
        r3.setContentChangeTypes(0);
        r1.requestSendAccessibilityEvent(r0, r3);
        return;
    L12:
        return;
    }

    public final boolean q(int r21, Rect r22) {
        ArrayList r3 = new ArrayList();
        o(r3);
        mj4 r4 = new mj4(0);
        int r6 = 0;
    L4:
        if (r6 >= r3.size()) goto L6;
        r4.d(((Integer) r3.get(r6)).intValue(), l(((Integer) r3.get(r6)).intValue()));
        r6 = r6 + 1;
        goto L4
    L6:
        int r5 = this.y;
        int r7 = Integer.MIN_VALUE;
        if (r5 != Integer.MIN_VALUE) goto L9;
        v3 r8 = null;
    L10:
        om0 r9 = B;
        y41 r10 = C;
        View r11 = this.v;
        int r12 = -1;
        if (r21 == 1) goto L71;
        if (r21 == 2) goto L71;
        if (r21 == 17) goto L21;
        if (r21 == 33) goto L21;
        if (r21 == 66) goto L21;
        if (r21 == 130) goto L21;
        kf2.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L21:
        Rect r13 = new Rect();
        int r14 = this.y;
        if (r14 == Integer.MIN_VALUE) goto L24;
        r(r14).f(r13);
    L37:
        Rect r2 = new Rect(r13);
        if (r21 == 17) goto L47;
        if (r21 == 33) goto L46;
        if (r21 == 66) goto L45;
        if (r21 != 130) goto L43;
        r2.offset(0, -(r13.height() + 1));
    L48:
        r10.getClass();
        int r15 = r4.e();
        Rect r16 = new Rect();
        int r17 = 0;
        v3 r18 = null;
    L49:
        if (r17 >= r15) goto L69;
        v3 r19 = (v3) r4.f(r17);
        if (r19 == r8) goto L68;
        r9.getClass();
        r19.f(r16);
        if (q05.r(r21, r13, r16) == false) goto L68;
        if (q05.r(r21, r13, r2) == true) goto L60;
    L67:
        r2.set(r16);
        r18 = r19;
        goto L68
    L60:
        if (q05.d(r21, r13, r16, r2) == true) goto L67;
        if (q05.d(r21, r13, r2, r16) == true) goto L68;
        int r110 = q05.s(r21, r13, r16);
        int r111 = q05.t(r21, r13, r16);
        int r112 = (r111 * r111) + ((r110 * 13) * r110);
        int r113 = q05.s(r21, r13, r2);
        int r114 = q05.t(r21, r13, r2);
        if (r112 < ((r114 * r114) + ((r113 * 13) * r113))) goto L67;
    L68:
        r17 = r17 + 1;
        goto L49
    L69:
        int r115 = 0;
    L70:
        v3 r1 = r18;
        if (r1 == null) goto L114;
        if (r4.n == false) goto L106;
        su3.f(r4);
    L106:
        int r20 = r4.q;
        int r23 = r115;
    L107:
        if (r23 >= r20) goto L112;
        if (r4.p[r23] == r1) goto L110;
        r23 = r23 + 1;
        goto L107
    L110:
        r12 = r23;
    L112:
        r7 = r4.c(r12);
    L114:
        return w(r7);
    L43:
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L45:
        r2.offset(-(r13.width() + 1), 0);
        goto L48
    L46:
        r2.offset(0, r13.height() + 1);
        goto L48
    L47:
        r2.offset(r13.width() + 1, 0);
        goto L48
    L24:
        if (r22 == null) goto L26;
        r13.set(r22);
        goto L37
    L26:
        int r24 = r11.getWidth();
        int r25 = r11.getHeight();
        if (r21 == 17) goto L36;
        if (r21 == 33) goto L35;
        if (r21 == 66) goto L34;
        if (r21 != 130) goto L32;
        r13.set(0, -1, r24, -1);
        goto L37
    L32:
        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    L34:
        r13.set(-1, 0, -1, r25);
        goto L37
    L35:
        r13.set(0, r25, r24, r25);
        goto L37
    L36:
        r13.set(r24, 0, r24, r25);
    L71:
        WeakHashMap r26 = j65.a;
        if (r11.getLayoutDirection() != 1) goto L74;
        boolean r27 = true;
    L75:
        r10.getClass();
        int r28 = r4.e();
        ArrayList r29 = new ArrayList(r28);
        int r116 = 0;
    L76:
        if (r116 >= r28) goto L78;
        r29.add((v3) r4.f(r116));
        r116 = r116 + 1;
        goto L76
    L78:
        Collections.sort(r29, new aa1(r27, r9));
        if (r21 == 1) goto L92;
        if (r21 != 2) goto L90;
        int r30 = r29.size();
        if (r8 != null) goto L84;
        int r31 = -1;
    L85:
        int r32 = r31 + 1;
        if (r32 >= r30) goto L89;
        Object r33 = r29.get(r32);
    L88:
        r115 = 0;
    L100:
        r18 = (v3) r33;
        goto L70
    L89:
        r33 = null;
        goto L88
    L84:
        r31 = r29.lastIndexOf(r8);
        goto L85
    L90:
        kf2.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        return false;
    L92:
        r115 = 0;
        int r34 = r29.size();
        if (r8 == null) goto L96;
        r34 = r29.indexOf(r8);
    L96:
        int r35 = r34 - 1;
        if (r35 < 0) goto L99;
        r33 = r29.get(r35);
        goto L100
    L99:
        r33 = null;
        goto L100
    L74:
        r27 = false;
        goto L75
    L9:
        r8 = (v3) r4.b(r5);
        goto L10
    }

    public final v3 r(int r6) {
        if (r6 != (-1)) goto L16;
        View r7 = this.v;
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain(r7);
        v3 r1 = new v3(r0);
        WeakHashMap r2 = j65.a;
        r7.onInitializeAccessibilityNodeInfo(r0);
        ArrayList r3 = new ArrayList();
        o(r3);
        if (r0.getChildCount() > 0) goto L7;
    L11:
        int r5 = r3.size();
        int r4 = 0;
    L12:
        if (r4 >= r5) goto L14;
        int r8 = ((Integer) r3.get(r4)).intValue();
        r1.a.addChild(r7, r8);
        r4 = r4 + 1;
        goto L12
    L14:
        return r1;
    L7:
        if (r3.size() <= 0) goto L11;
        tb4.e("Views cannot have both real and virtual children");
        return null;
    L16:
        return l(r6);
    }

    public abstract boolean s(int r1, int r2, Bundle r3);

    public void t(v3 r1) {
    }

    public abstract void u(int r1, v3 r2);

    public void v(int r1, boolean r2) {
    }

    public final boolean w(int r3) {
        View r0 = this.v;
        if (r0.isFocused() == false) goto L5;
    L7:
        int r1 = this.y;
        if (r1 != r3) goto L11;
        return false;
    L11:
        if (r1 == Integer.MIN_VALUE) goto L13;
        j(r1);
    L13:
        if (r3 != Integer.MIN_VALUE) goto L16;
        return false;
    L16:
        this.y = r3;
        v(r3, true);
        x(r3, 8);
        return true;
    L5:
        if (r0.requestFocus() == true) goto L7;
        return false;
    }

    public final void x(int r3, int r4) {
        if (r3 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.u.isEnabled() == false) goto L13;
        View r0 = this.v;
        ViewParent r1 = r0.getParent();
        if (r1 == null) goto L14;
        r1.requestSendAccessibilityEvent(r0, k(r3, r4));
        return;
    L14:
        return;
    }
}
