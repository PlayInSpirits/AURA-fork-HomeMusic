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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class z41 extends z2 {
    public static final Rect A = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final om0 B = new om0(29);
    public static final y41 C = new y41(0);
    public final AccessibilityManager u;
    public final View v;
    public ua w;
    public final Rect q = new Rect();
    public final Rect r = new Rect();
    public final Rect s = new Rect();
    public final int[] t = new int[2];
    public int x = Integer.MIN_VALUE;
    public int y = Integer.MIN_VALUE;
    public int z = Integer.MIN_VALUE;

    public z41(View view) {
        this.v = view;
        this.u = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = j65.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.z2
    public final zh0 b(View view) {
        if (this.w == null) {
            this.w = new ua(this, 1);
        }
        return this.w;
    }

    @Override // defpackage.z2
    public final void d(View view, v3 v3Var) {
        this.n.onInitializeAccessibilityNodeInfo(view, v3Var.a);
        t(v3Var);
    }

    public final boolean j(int i) {
        if (this.y != i) {
            return false;
        }
        this.y = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.v;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        v3 r = r(i);
        obtain2.getText().add(r.g());
        AccessibilityNodeInfo accessibilityNodeInfo = r.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            tb4.e("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final v3 l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        v3 v3Var = new v3(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        v3Var.i("android.view.View");
        Rect rect = A;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        v3Var.b = -1;
        View view = this.v;
        obtain.setParent(view);
        u(i, v3Var);
        if (v3Var.g() == null && obtain.getContentDescription() == null) {
            tb4.e("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.r;
        v3Var.f(rect2);
        if (rect2.equals(rect)) {
            tb4.e("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            tb4.e("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            tb4.e("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain.setPackageName(view.getContext().getPackageName());
        v3Var.c = i;
        obtain.setSource(view, i);
        if (this.x == i) {
            obtain.setAccessibilityFocused(true);
            v3Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            v3Var.a(64);
        }
        boolean z = this.y == i;
        if (z) {
            v3Var.a(2);
        } else if (obtain.isFocusable()) {
            v3Var.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.t;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.q;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            v3Var.f(rect3);
            if (v3Var.b != -1) {
                v3 v3Var2 = new v3(AccessibilityNodeInfo.obtain());
                for (int i2 = v3Var.b; i2 != -1; i2 = v3Var2.b) {
                    v3Var2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = v3Var2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i2, v3Var2);
                    v3Var2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.s;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = v3Var.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return v3Var;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.u;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.z;
            if (i2 != n) {
                this.z = n;
                x(n, 128);
                x(i2, 256);
            }
            if (n == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.z) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.z = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.u.isEnabled() || (parent = (view = this.v).getParent()) == null) {
            return;
        }
        AccessibilityEvent k = k(i, 2048);
        k.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, k);
    }

    public final boolean q(int i, Rect rect) {
        int i2;
        Object obj;
        v3 v3Var;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        mj4 mj4Var = new mj4(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mj4Var.d(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.y;
        int i5 = Integer.MIN_VALUE;
        v3 v3Var2 = i4 == Integer.MIN_VALUE ? null : (v3) mj4Var.b(i4);
        om0 om0Var = B;
        y41 y41Var = C;
        View view = this.v;
        int i6 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = j65.a;
            boolean z = view.getLayoutDirection() == 1;
            y41Var.getClass();
            int e = mj4Var.e();
            ArrayList arrayList2 = new ArrayList(e);
            for (int i7 = 0; i7 < e; i7++) {
                arrayList2.add((v3) mj4Var.f(i7));
            }
            Collections.sort(arrayList2, new aa1(z, om0Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (v3Var2 != null) {
                    size = arrayList2.indexOf(v3Var2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    kf2.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (v3Var2 == null ? -1 : arrayList2.lastIndexOf(v3Var2)) + 1;
                i2 = 0;
                obj = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            v3Var = (v3) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                kf2.n("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.y;
            if (i9 != Integer.MIN_VALUE) {
                r(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    kf2.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            y41Var.getClass();
            int e2 = mj4Var.e();
            Rect rect4 = new Rect();
            v3Var = null;
            for (int i10 = 0; i10 < e2; i10++) {
                v3 v3Var3 = (v3) mj4Var.f(i10);
                if (v3Var3 != v3Var2) {
                    om0Var.getClass();
                    v3Var3.f(rect4);
                    if (q05.r(i, rect2, rect4)) {
                        if (q05.r(i, rect2, rect3) && !q05.d(i, rect2, rect4, rect3)) {
                            if (!q05.d(i, rect2, rect3, rect4)) {
                                int s = q05.s(i, rect2, rect4);
                                int t = q05.t(i, rect2, rect4);
                                int i11 = (t * t) + (s * 13 * s);
                                int s2 = q05.s(i, rect2, rect3);
                                int t2 = q05.t(i, rect2, rect3);
                                if (i11 >= (t2 * t2) + (s2 * 13 * s2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        v3Var = v3Var3;
                    }
                }
            }
            i2 = 0;
        }
        v3 v3Var4 = v3Var;
        if (v3Var4 != null) {
            if (mj4Var.n) {
                su3.f(mj4Var);
            }
            int i12 = mj4Var.q;
            int i13 = i2;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (mj4Var.p[i13] == v3Var4) {
                    i6 = i13;
                    break;
                }
                i13++;
            }
            i5 = mj4Var.c(i6);
        }
        return w(i5);
    }

    public final v3 r(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.v;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        v3 v3Var = new v3(obtain);
        WeakHashMap weakHashMap = j65.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            tb4.e("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            v3Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return v3Var;
    }

    public abstract boolean s(int i, int i2, Bundle bundle);

    public abstract void u(int i, v3 v3Var);

    public final boolean w(int i) {
        int i2;
        View view = this.v;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.y) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.y = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.u.isEnabled() || (parent = (view = this.v).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public void t(v3 v3Var) {
    }

    public void v(int i, boolean z) {
    }
}
