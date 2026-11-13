package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class z55 implements View.OnApplyWindowInsetsListener {
    public pb5 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ r83 c;

    public z55(View view, r83 r83Var) {
        this.b = view;
        this.c = r83Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        pb5 g = pb5.g(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        r83 r83Var = this.c;
        if (i < 30) {
            a65.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return r83Var.x(view, g).f();
            }
        }
        this.a = g;
        pb5 x = r83Var.x(view, g);
        if (i >= 30) {
            return x.f();
        }
        WeakHashMap weakHashMap = j65.a;
        view.requestApplyInsets();
        return x.f();
    }
}
