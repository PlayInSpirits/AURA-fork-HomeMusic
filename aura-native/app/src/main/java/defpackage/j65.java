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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class j65 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final v55 e = new v55();
    public static final x55 f = new x55();

    public static s75 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        s75 s75Var = (s75) a.get(view);
        if (s75Var != null) {
            return s75Var;
        }
        s75 s75Var2 = new s75(view);
        a.put(view, s75Var2);
        return s75Var2;
    }

    public static void b(View view, pb5 pb5Var) {
        WindowInsets f2 = pb5Var.f();
        if (f2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? g65.a(view, f2) : y55.a(view, f2);
            if (a2.equals(f2)) {
                return;
            }
            pb5.g(a2, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = i65.d;
        i65 i65Var = (i65) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (i65Var == null) {
            i65Var = new i65();
            i65Var.a = null;
            i65Var.b = null;
            i65Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, i65Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = i65Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = i65.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (i65Var.a == null) {
                            i65Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = i65.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                i65Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    i65Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = i65Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (i65Var.b == null) {
                    i65Var.b = new SparseArray();
                }
                i65Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f65.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = e65.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(hg hgVar) {
        return Build.VERSION.SDK_INT >= 31 ? h65.a(hgVar) : (String[]) hgVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ub5 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return g65.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new ub5(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ld0 j(View view, ld0 ld0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ld0Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return h65.b(view, ld0Var);
        }
        et4 et4Var = (et4) view.getTag(R.id.tag_on_receive_content_listener);
        g93 g93Var = e;
        if (et4Var == null) {
            if (view instanceof g93) {
                g93Var = (g93) view;
            }
            return g93Var.a(ld0Var);
        }
        ld0 a2 = et4.a(view, ld0Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof g93) {
            g93Var = (g93) view;
        }
        return g93Var.a(a2);
    }

    public static void k(View view, int i) {
        l(view, i);
        i(view, 0);
    }

    public static void l(View view, int i) {
        ArrayList f2 = f(view);
        for (int i2 = 0; i2 < f2.size(); i2++) {
            if (((o3) f2.get(i2)).a() == i) {
                f2.remove(i2);
                return;
            }
        }
    }

    public static void m(View view, o3 o3Var, f4 f4Var) {
        if (f4Var == null) {
            k(view, o3Var.a());
            return;
        }
        o3 o3Var2 = new o3(null, o3Var.b, null, f4Var, o3Var.c);
        View.AccessibilityDelegate d2 = d(view);
        z2 z2Var = d2 == null ? null : d2 instanceof y2 ? ((y2) d2).a : new z2(d2);
        if (z2Var == null) {
            z2Var = new z2();
        }
        o(view, z2Var);
        l(view, o3Var2.a());
        f(view).add(o3Var2);
        i(view, 0);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            f65.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void o(View view, z2 z2Var) {
        if (z2Var == null && (d(view) instanceof y2)) {
            z2Var = new z2();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(z2Var == null ? null : z2Var.o);
    }

    public static void p(View view, CharSequence charSequence) {
        new w55(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        x55 x55Var = f;
        if (charSequence == null) {
            x55Var.n.remove(view);
            view.removeOnAttachStateChangeListener(x55Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(x55Var);
        } else {
            x55Var.n.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(x55Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(x55Var);
            }
        }
    }

    public static void q(View view, ma5 ma5Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(ma5Var != null ? new qa5(ma5Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = pa5.e;
        View.OnApplyWindowInsetsListener oa5Var = ma5Var != null ? new oa5(view, ma5Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, oa5Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(oa5Var);
        }
    }
}
