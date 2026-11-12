package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j65 {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final int[] d = null;
    public static final v55 e = null;
    public static final x55 f = null;

    static {
        d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        e = new v55();
        f = new x55();
    }

    public static s75 a(View r2) {
        if (a != null) goto L5;
        a = new WeakHashMap();
    L5:
        s75 r0 = (s75) a.get(r2);
        if (r0 != null) goto L9;
        s75 r1 = new s75(r2);
        a.put(r2, r1);
        return r1;
    L9:
        return r0;
    }

    public static void b(View r2, pb5 r3) {
        WindowInsets r4 = r3.f();
        if (r4 != null) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L7;
        WindowInsets r0 = g65.a(r2, r4);
    L9:
        if (r0.equals(r4) == true) goto L13;
        pb5.g(r0, r2);
        return;
    L13:
        return;
    L7:
        r0 = y55.a(r2, r4);
        goto L9
    }

    public static boolean c(View r8, KeyEvent r9) {
        if (Build.VERSION.SDK_INT >= 28) goto L55;
        ArrayList r0 = i65.d;
        i65 r1 = (i65) r8.getTag(R.id.tag_unhandled_key_event_manager);
        if (r1 != null) goto L9;
        r1 = new i65();
        r1.a = null;
        r1.b = null;
        r1.c = null;
        r8.setTag(R.id.tag_unhandled_key_event_manager, r1);
    L9:
        if (r9.getAction() != 0) goto L36;
        WeakHashMap r2 = r1.a;
        if (r2 == null) goto L13;
        r2.clear();
    L13:
        ArrayList r3 = i65.d;
        if (r3.isEmpty() == true) goto L36;
        monitor-enter(r3);
    L20:
        th = move-exception;
        throw th;
    L18:
        if (r1.a != null) goto L22;
        r1.a = new WeakHashMap();     // Catch: Throwable -> L20
    L22:
        int r4 = r3.size() - 1;     // Catch: Throwable -> L20
    L23:
        if (r4 < 0) goto L32;
        ArrayList r5 = i65.d;     // Catch: Throwable -> L20
        View r6 = (View) ((WeakReference) r5.get(r4)).get();     // Catch: Throwable -> L20
        if (r6 != null) goto L27;
        r5.remove(r4);     // Catch: Throwable -> L20
    L31:
        r4 = r4 - 1;     // Catch: Throwable -> L20
        goto L23
    L27:
        r1.a.put(r6, Boolean.TRUE);     // Catch: Throwable -> L20
        ViewParent r7 = r6.getParent();     // Catch: Throwable -> L20
    L29:
        if ((r7 instanceof View) == false) goto L31;
        r1.a.put((View) r7, Boolean.TRUE);     // Catch: Throwable -> L20
        r7 = r7.getParent();     // Catch: Throwable -> L20
        goto L29
    L32:
        monitor-exit(r3);     // Catch: Throwable -> L20
    L36:
        View r10 = r1.a(r8);
        if (r9.getAction() != 0) goto L46;
        int r11 = r9.getKeyCode();
        if (r10 == null) goto L46;
        if (KeyEvent.isModifierKey(r11) == true) goto L46;
        if (r1.b != null) goto L45;
        r1.b = new SparseArray();
    L45:
        r1.b.put(r11, new WeakReference(r10));
    L46:
        if (r10 == null) goto L48;
        return true;
    L48:
        return false;
    L55:
        return false;
    }

    public static View.AccessibilityDelegate d(View r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return f65.a(r3);
    L7:
        if (c == false) goto L10;
        return null;
    L10:
        if (b == null) goto L23;
    L21:
        Object r4 = b.get(r3);     // Catch: Throwable -> L18
        if ((r4 instanceof View.AccessibilityDelegate) == false) goto L26;
        return (View.AccessibilityDelegate) r4;
    L26:
        return null;
    L18:
        c = true;
        return null;
    L23:
        Field r0 = View.class.getDeclaredField("mAccessibilityDelegate");     // Catch: Throwable -> L13
        b = r0;     // Catch: Throwable -> L13
        r0.setAccessible(true);     // Catch: Throwable -> L13
    L13:
        c = true;
        return null;
    }

    public static CharSequence e(View r2) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Object r3 = e65.a(r2);
    L10:
        return (CharSequence) r3;
    L5:
        r3 = r2.getTag(R.id.tag_accessibility_pane_title);
        if (CharSequence.class.isInstance(r3) == true) goto L10;
        r3 = null;
        goto L10
    }

    public static ArrayList f(View r2) {
        ArrayList r1 = (ArrayList) r2.getTag(R.id.tag_accessibility_actions);
        if (r1 != null) goto L6;
        ArrayList r3 = new ArrayList();
        r2.setTag(R.id.tag_accessibility_actions, r3);
        return r3;
    L6:
        return r1;
    }

    public static String[] g(hg r2) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return h65.a(r2);
    L7:
        return (String[]) r2.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ub5 h(View r3) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        Context r0 = r3.getContext();
    L8:
        if ((r0 instanceof ContextWrapper) == false) goto L17;
        if ((r0 instanceof Activity) == true) goto L11;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L8
    L11:
        Window r1 = ((Activity) r0).getWindow();
        if (r1 != null) goto L14;
        return null;
    L14:
        return new ub5(r1, r3);
    L17:
        return null;
    L5:
        return g65.c(r3);
    }

    public static void i(View r5, int r6) {
        AccessibilityManager r0 = (AccessibilityManager) r5.getContext().getSystemService("accessibility");
        if (r0.isEnabled() == true) goto L6;
        return;
    L6:
        if (e(r5) != null) goto L8;
    L12:
        boolean r1 = false;
    L13:
        int r4 = 32;
        if (r5.getAccessibilityLiveRegion() != 0) goto L28;
        if (r1 == true) goto L28;
        if (r6 != 32) goto L21;
        AccessibilityEvent r2 = AccessibilityEvent.obtain();
        r5.onInitializeAccessibilityEvent(r2);
        r2.setEventType(32);
        r2.setContentChangeTypes(r6);
        r2.setSource(r5);
        r5.onPopulateAccessibilityEvent(r2);
        r2.getText().add(e(r5));
        r0.sendAccessibilityEvent(r2);
        return;
    L21:
        if (r5.getParent() != null) goto L39;
        return;
    L39:
        r5.getParent().notifySubtreeAccessibilityStateChanged(r5, r5, r6);     // Catch: AbstractMethodError -> L25
        return;
    L25:
        e = move-exception;
        Log.e("ViewCompat", r5.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
        return;
    L28:
        AccessibilityEvent r3 = AccessibilityEvent.obtain();
        if (r1 == true) goto L32;
        r4 = 2048;
    L32:
        r3.setEventType(r4);
        r3.setContentChangeTypes(r6);
        if (r1 == false) goto L37;
        r3.getText().add(e(r5));
        if (r5.getImportantForAccessibility() != 0) goto L37;
        r5.setImportantForAccessibility(1);
    L37:
        r5.sendAccessibilityEventUnchecked(r3);
        return;
    L8:
        if (r5.isShown() == false) goto L12;
        if (r5.getWindowVisibility() != 0) goto L12;
        r1 = true;
        goto L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ld0 j(View r3, ld0 r4) {
        if (Log.isLoggable("ViewCompat", 3) == false) goto L6;
        Log.d("ViewCompat", "performReceiveContent: " + r4 + ", view=" + r3.getClass().getSimpleName() + "[" + r3.getId() + "]");
    L6:
        if (Build.VERSION.SDK_INT >= 31) goto L8;
        et4 r0 = (et4) r3.getTag(R.id.tag_on_receive_content_listener);
        g93 r1 = e;
        if (r0 == null) goto L21;
        ld0 r5 = et4.a(r3, r4);
        if (r5 != null) goto L16;
        return null;
    L16:
        if ((r3 instanceof g93) == false) goto L19;
        r1 = (g93) r3;
    L19:
        return r1.a(r5);
    L21:
        if ((r3 instanceof g93) == false) goto L24;
        r1 = (g93) r3;
    L24:
        return r1.a(r4);
    L8:
        return h65.b(r3, r4);
    }

    public static void k(View r0, int r1) {
        l(r0, r1);
        i(r0, 0);
    }

    public static void l(View r2, int r3) {
        ArrayList r4 = f(r2);
        int r0 = 0;
    L4:
        if (r0 >= r4.size()) goto L10;
        if (((o3) r4.get(r0)).a() == r3) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        r4.remove(r0);
        return;
    }

    public static void m(View r6, o3 r7, f4 r8) {
        if (r8 != null) goto L5;
        k(r6, r7.a());
        return;
    L5:
        o3 r0 = new o3(null, r7.b, null, r8, r7.c);
        View.AccessibilityDelegate r9 = d(r6);
        if (r9 != null) goto L9;
        z2 r10 = null;
    L12:
        if (r10 != null) goto L14;
        r10 = new z2();
    L14:
        o(r6, r10);
        l(r6, r0.a());
        f(r6).add(r0);
        i(r6, 0);
        return;
    L9:
        if ((r9 instanceof y2) == false) goto L11;
        r10 = ((y2) r9).a;
        goto L12
    L11:
        r10 = new z2(r9);
        goto L12
    }

    public static void n(View r2, Context r3, int[] r4, AttributeSet r5, TypedArray r6, int r7, int r8) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        f65.b(r2, r3, r4, r5, r6, r7, r8);
        return;
    }

    public static void o(View r1, z2 r2) {
        if (r2 != null) goto L7;
        if ((d(r1) instanceof y2) == false) goto L7;
        r2 = new z2();
    L7:
        if (r1.getImportantForAccessibility() != 0) goto L9;
        r1.setImportantForAccessibility(1);
    L9:
        if (r2 != null) goto L11;
        y2 r3 = null;
    L12:
        r1.setAccessibilityDelegate(r3);
        return;
    L11:
        r3 = r2.o;
        goto L12
    }

    public static void p(View r6, CharSequence r7) {
        new w55(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(r6, r7);
        x55 r0 = f;
        if (r7 == null) goto L14;
        WeakHashMap r8 = r0.n;
        if (r6.isShown() == true) goto L7;
    L9:
        boolean r1 = false;
    L10:
        r8.put(r6, Boolean.valueOf(r1));
        r6.addOnAttachStateChangeListener(r0);
        if (r6.isAttachedToWindow() == false) goto L16;
        r6.getViewTreeObserver().addOnGlobalLayoutListener(r0);
        return;
    L16:
        return;
    L7:
        if (r6.getWindowVisibility() != 0) goto L9;
        r1 = true;
        goto L10
    L14:
        r0.n.remove(r6);
        r6.removeOnAttachStateChangeListener(r0);
        r6.getViewTreeObserver().removeOnGlobalLayoutListener(r0);
    }

    public static void q(View r3, ma5 r4) {
        View.OnApplyWindowInsetsListener r2 = null;
        qa5 r5 = null;
        if (Build.VERSION.SDK_INT < 30) goto L8;
        if (r4 == null) goto L6;
        r5 = new qa5(r4);
    L6:
        xq2.s(r3, r5);
        return;
    L8:
        PathInterpolator r0 = pa5.e;
        if (r4 == null) goto L11;
        r2 = new oa5(r3, r4);
    L11:
        r3.setTag(R.id.tag_window_insets_animation_callback, r2);
        if (r3.getTag(R.id.tag_compat_insets_dispatch) == null) goto L14;
        return;
    L14:
        if (r3.getTag(R.id.tag_on_apply_window_listener) != null) goto L18;
        r3.setOnApplyWindowInsetsListener(r2);
        return;
    }
}
