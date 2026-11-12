package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import app.homemusic.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pa5 extends sa5 {
    public static final PathInterpolator e = null;
    public static final a61 f = null;
    public static final DecelerateInterpolator g = null;
    public static final AccelerateInterpolator h = null;

    static {
        e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        f = new a61(0);
        g = new DecelerateInterpolator(1.5f);
        h = new AccelerateInterpolator(1.5f);
    }

    public static void f(View r2, ta5 r3) {
        ma5 r0 = j(r2);
        if (r0 == null) goto L8;
        r0.a(r3);
        if (r0.o != 0) goto L8;
        return;
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r4 = (ViewGroup) r2;
        int r1 = 0;
    L11:
        if (r1 >= r4.getChildCount()) goto L16;
        f(r4.getChildAt(r1), r3);
        r1 = r1 + 1;
        goto L11
    L16:
        return;
    }

    public static void g(View r2, ta5 r3, pb5 r4, boolean r5) {
        ma5 r0 = j(r2);
        int r1 = 0;
        if (r0 == null) goto L11;
        r0.n = r4;
        if (r5 == true) goto L11;
        r0.b(r3);
        if (r0.o != 0) goto L9;
        r5 = true;
        goto L11
    L9:
        r5 = false;
    L11:
        if ((r2 instanceof ViewGroup) == false) goto L16;
        ViewGroup r6 = (ViewGroup) r2;
    L14:
        if (r1 >= r6.getChildCount()) goto L18;
        g(r6.getChildAt(r1), r3, r4, r5);
        r1 = r1 + 1;
        goto L14
    L18:
        return;
    }

    public static void h(View r2, pb5 r3, List r4) {
        ma5 r0 = j(r2);
        if (r0 == null) goto L8;
        r3 = r0.c(r3, r4);
        if (r0.o != 0) goto L8;
        return;
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r5 = (ViewGroup) r2;
        int r1 = 0;
    L11:
        if (r1 >= r5.getChildCount()) goto L16;
        h(r5.getChildAt(r1), r3, r4);
        r1 = r1 + 1;
        goto L11
    L16:
        return;
    }

    public static void i(View r2, ta5 r3, qr2 r4) {
        ma5 r0 = j(r2);
        if (r0 == null) goto L8;
        r0.d(r3, r4);
        if (r0.o != 0) goto L8;
        return;
    L8:
        if ((r2 instanceof ViewGroup) == false) goto L13;
        ViewGroup r5 = (ViewGroup) r2;
        int r1 = 0;
    L11:
        if (r1 >= r5.getChildCount()) goto L16;
        i(r5.getChildAt(r1), r3, r4);
        r1 = r1 + 1;
        goto L11
    L16:
        return;
    }

    public static ma5 j(View r1) {
        Object r2 = r1.getTag(R.id.tag_window_insets_animation_callback);
        if ((r2 instanceof oa5) == true) goto L5;
        return null;
    L5:
        return ((oa5) r2).a;
    }
}
