package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    public static final o3 e = null;
    public static final o3 f = null;
    public static final o3 g = null;
    public static final o3 h = null;
    public static final o3 i = null;
    public static final o3 j = null;
    public static final o3 k = null;
    public static final o3 l = null;
    public static final o3 m = null;
    public static final o3 n = null;
    public static final o3 o = null;
    public static final o3 p = null;
    public static final o3 q = null;
    public static final o3 r = null;
    public static final o3 s = null;
    public static final o3 t = null;
    public static final o3 u = null;
    public final Object a;
    public final int b;
    public final Class c;
    public final f4 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction r2 = null;
        e = new o3(1, null);
        f = new o3(2, null);
        new o3(4, null);
        new o3(8, null);
        g = new o3(16, null);
        new o3(32, null);
        h = new o3(64, null);
        i = new o3(128, null);
        new o3(256, y3.class);
        new o3(512, y3.class);
        new o3(1024, z3.class);
        new o3(2048, z3.class);
        j = new o3(4096, null);
        k = new o3(8192, null);
        new o3(16384, null);
        new o3(32768, null);
        new o3(65536, null);
        new o3(131072, d4.class);
        l = new o3(262144, null);
        m = new o3(524288, null);
        n = new o3(1048576, null);
        new o3(2097152, e4.class);
        new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        o = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, b4.class);
        p = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        q = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        r = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        s = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L5;
        AccessibilityNodeInfo.AccessibilityAction r8 = k3.b();
    L6:
        new o3(r8, R.id.accessibilityActionPageUp, null, null, null);
        if (r0 < 29) goto L9;
        AccessibilityNodeInfo.AccessibilityAction r14 = k3.g();
    L10:
        new o3(r14, R.id.accessibilityActionPageDown, null, null, null);
        if (r0 < 29) goto L13;
        AccessibilityNodeInfo.AccessibilityAction r5 = k3.s();
    L14:
        new o3(r5, R.id.accessibilityActionPageLeft, null, null, null);
        if (r0 < 29) goto L17;
        AccessibilityNodeInfo.AccessibilityAction r11 = k3.x();
    L18:
        new o3(r11, R.id.accessibilityActionPageRight, null, null, null);
        new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        t = new o3(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, c4.class);
        if (r0 < 26) goto L21;
        AccessibilityNodeInfo.AccessibilityAction r4 = j3.l();
    L22:
        new o3(r4, R.id.accessibilityActionMoveWindow, null, null, a4.class);
        if (r0 < 28) goto L25;
        AccessibilityNodeInfo.AccessibilityAction r10 = i3.k();
    L26:
        new o3(r10, R.id.accessibilityActionShowTooltip, null, null, null);
        if (r0 < 28) goto L29;
        AccessibilityNodeInfo.AccessibilityAction r16 = i3.z();
    L30:
        new o3(r16, R.id.accessibilityActionHideTooltip, null, null, null);
        if (r0 < 30) goto L33;
        AccessibilityNodeInfo.AccessibilityAction r6 = l3.m();
    L34:
        new o3(r6, R.id.accessibilityActionPressAndHold, null, null, null);
        if (r0 < 30) goto L37;
        AccessibilityNodeInfo.AccessibilityAction r12 = l3.B();
    L38:
        new o3(r12, R.id.accessibilityActionImeEnter, null, null, null);
        if (r0 < 32) goto L41;
        AccessibilityNodeInfo.AccessibilityAction r7 = m3.e();
    L42:
        new o3(r7, R.id.accessibilityActionDragStart, null, null, null);
        if (r0 < 32) goto L45;
        AccessibilityNodeInfo.AccessibilityAction r13 = m3.m();
    L46:
        new o3(r13, R.id.accessibilityActionDragDrop, null, null, null);
        if (r0 < 32) goto L49;
        AccessibilityNodeInfo.AccessibilityAction r9 = m3.o();
    L50:
        new o3(r9, R.id.accessibilityActionDragCancel, null, null, null);
        if (r0 < 33) goto L53;
        AccessibilityNodeInfo.AccessibilityAction r15 = n3.h();
    L54:
        new o3(r15, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        if (r0 < 34) goto L57;
        AccessibilityNodeInfo.AccessibilityAction r17 = a3.c();
    L58:
        u = new o3(r17, R.id.accessibilityActionScrollInDirection, null, null, null);
        int r1 = gw.a;
        if (r0 < 36) goto L66;
        if (r0 >= 36) goto L62;
        int r3 = r0 * 100000;
    L64:
        if (r3 < 3600001) goto L66;
        r2 = s3.a();
        goto L66
    L62:
        r3 = no.a();
    L66:
        new o3(r2, R.id.ALT, null, null, null);
        return;
    L57:
        r17 = null;
        goto L58
    L53:
        r15 = null;
        goto L54
    L49:
        r9 = null;
        goto L50
    L45:
        r13 = null;
        goto L46
    L41:
        r7 = null;
        goto L42
    L37:
        r12 = null;
        goto L38
    L33:
        r6 = null;
        goto L34
    L29:
        r16 = null;
        goto L30
    L25:
        r10 = null;
        goto L26
    L21:
        r4 = null;
        goto L22
    L17:
        r11 = null;
        goto L18
    L13:
        r5 = null;
        goto L14
    L9:
        r14 = null;
        goto L10
    L5:
        r8 = null;
        goto L6
    }

    public o3(Object r1, int r2, CharSequence r3, f4 r4, Class r5) {
        this.b = r2;
        this.d = r4;
        if (r1 != null) goto L5;
        this.a = new AccessibilityNodeInfo.AccessibilityAction(r2, r3);
    L6:
        this.c = r5;
        return;
    L5:
        this.a = r1;
        goto L6
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof o3) == true) goto L8;
        return false;
    L8:
        Object r4 = ((o3) r3).a;
        Object r2 = this.a;
        if (r2 != null) goto L13;
        if (r4 == null) goto L15;
        return false;
    L15:
        return true;
    L13:
        if (r2.equals(r4) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AccessibilityActionCompat: ");
        String r1 = v3.d(this.b);
        if (r1.equals("ACTION_UNKNOWN") == false) goto L7;
        Object r3 = this.a;
        if (((AccessibilityNodeInfo.AccessibilityAction) r3).getLabel() == null) goto L7;
        r1 = ((AccessibilityNodeInfo.AccessibilityAction) r3).getLabel().toString();
    L7:
        r0.append(r1);
        return r0.toString();
    }

    public o3(int r7, Class r8) {
        this(null, r7, null, null, r8);
    }

    public o3(int r7, String r8) {
        this(null, r7, r8, null, null);
    }
}
