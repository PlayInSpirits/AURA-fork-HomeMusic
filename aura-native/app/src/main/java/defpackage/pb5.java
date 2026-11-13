package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pb5 {
    public static final pb5 b;
    public final mb5 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = kb5.w;
        } else if (i >= 30) {
            b = ib5.v;
        } else {
            b = mb5.b;
        }
    }

    public pb5(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new lb5(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new kb5(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new jb5(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ib5(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new gb5(this, windowInsets);
        } else if (i >= 28) {
            this.a = new eb5(this, windowInsets);
        } else {
            this.a = new db5(this, windowInsets);
        }
    }

    public static vz1 e(vz1 vz1Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, vz1Var.a - i);
        int max2 = Math.max(0, vz1Var.b - i2);
        int max3 = Math.max(0, vz1Var.c - i3);
        int max4 = Math.max(0, vz1Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? vz1Var : vz1.b(max, max2, max3, max4);
    }

    public static pb5 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        pb5 pb5Var = new pb5(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = j65.a;
            pb5 a = b65.a(view);
            mb5 mb5Var = pb5Var.a;
            mb5Var.w(a);
            View rootView = view.getRootView();
            mb5Var.d(rootView);
            mb5Var.o(rootView);
            mb5Var.p();
            mb5Var.y(view.getWindowSystemUiVisibility());
        }
        return pb5Var;
    }

    public final int a() {
        return this.a.m().d;
    }

    public final int b() {
        return this.a.m().a;
    }

    public final int c() {
        return this.a.m().c;
    }

    public final int d() {
        return this.a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb5) {
            return Objects.equals(this.a, ((pb5) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        mb5 mb5Var = this.a;
        if (mb5Var instanceof cb5) {
            return ((cb5) mb5Var).c;
        }
        return null;
    }

    public final int hashCode() {
        mb5 mb5Var = this.a;
        if (mb5Var == null) {
            return 0;
        }
        return mb5Var.hashCode();
    }

    public pb5() {
        this.a = new mb5(this);
    }
}
