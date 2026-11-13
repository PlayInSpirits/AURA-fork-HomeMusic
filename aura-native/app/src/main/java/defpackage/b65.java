package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class b65 {
    public static pb5 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        pb5 g = pb5.g(rootWindowInsets, null);
        mb5 mb5Var = g.a;
        mb5Var.w(g);
        View rootView = view.getRootView();
        mb5Var.d(rootView);
        mb5Var.o(rootView);
        mb5Var.p();
        return g;
    }
}
