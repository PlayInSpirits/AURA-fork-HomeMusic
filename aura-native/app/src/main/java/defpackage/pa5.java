package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import app.homemusic.R;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pa5 extends sa5 {
    public pa5(int a0, android.view.animation.Interpolator a1, long a2) {
        super(a0, a1, a2);
    }

    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final a61 f = new a61(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, ta5 ta5Var) {
        ma5 j = j(view);
        if (j != null) {
            j.a(ta5Var);
            if (j.o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ta5Var);
            }
        }
    }

    public static void g(View view, ta5 ta5Var, pb5 pb5Var, boolean z) {
        ma5 j = j(view);
        if (j != null) {
            j.n = pb5Var;
            if (!z) {
                j.b(ta5Var);
                z = j.o == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ta5Var, pb5Var, z);
            }
        }
    }

    public static void h(View view, pb5 pb5Var, List list) {
        ma5 j = j(view);
        if (j != null) {
            pb5Var = j.c(pb5Var, list);
            if (j.o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), pb5Var, list);
            }
        }
    }

    public static void i(View view, ta5 ta5Var, qr2 qr2Var) {
        ma5 j = j(view);
        if (j != null) {
            j.d(ta5Var, qr2Var);
            if (j.o == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ta5Var, qr2Var);
            }
        }
    }

    public static ma5 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof oa5) {
            return ((oa5) tag).a;
        }
        return null;
    }
}
