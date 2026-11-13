package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import app.homemusic.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oa5 implements View.OnApplyWindowInsetsListener {
    public final ma5 a;
    public pb5 b;

    public oa5(View view, ma5 ma5Var) {
        pb5 pb5Var;
        this.a = ma5Var;
        WeakHashMap weakHashMap = j65.a;
        pb5 a = b65.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            pb5Var = (i >= 36 ? new ab5(a) : i >= 35 ? new za5(a) : i >= 34 ? new ya5(a) : i >= 31 ? new xa5(a) : i >= 30 ? new wa5(a) : i >= 29 ? new va5(a) : new ua5(a)).b();
        } else {
            pb5Var = null;
        }
        this.b = pb5Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = pb5.g(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        pb5 g = pb5.g(windowInsets, view);
        mb5 mb5Var = g.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = j65.a;
            this.b = b65.a(view);
        }
        if (this.b == null) {
            this.b = g;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ma5 j = pa5.j(view);
            if (j == null || !Objects.equals(j.n, g)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                pb5 pb5Var = this.b;
                int i = 1;
                while (i <= 512) {
                    vz1 h = mb5Var.h(i);
                    vz1 h2 = pb5Var.a.h(i);
                    int i2 = h.a;
                    int i3 = h.d;
                    int i4 = h.c;
                    int i5 = h.b;
                    int i6 = h2.a;
                    int i7 = h2.d;
                    int[] iArr4 = iArr2;
                    int i8 = h2.c;
                    int i9 = h2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                boolean z2 = false;
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = g;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    pb5 pb5Var2 = this.b;
                    ta5 ta5Var = new ta5(i12, (i10 & 8) != 0 ? pa5.e : (i11 & 8) != 0 ? pa5.f : (i10 & 519) != 0 ? pa5.g : (i11 & 519) != 0 ? pa5.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    ta5Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ta5Var.a.b());
                    vz1 h3 = mb5Var.h(i12);
                    vz1 h4 = pb5Var2.a.h(i12);
                    int min = Math.min(h3.a, h4.a);
                    int i13 = h3.b;
                    int i14 = h4.b;
                    int min2 = Math.min(i13, i14);
                    int i15 = h3.c;
                    int i16 = h4.c;
                    int min3 = Math.min(i15, i16);
                    int i17 = h3.d;
                    int i18 = h4.d;
                    qr2 qr2Var = new qr2(vz1.b(min, min2, min3, Math.min(i17, i18)), vz1.b(Math.max(h3.a, h4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), z2, 21);
                    pa5.g(view, ta5Var, g, false);
                    duration.addUpdateListener(new na5(ta5Var, g, pb5Var2, i12, view));
                    duration.addListener(new kw0(3, view, ta5Var));
                    h93.a(view, new sz(view, ta5Var, qr2Var, duration));
                    this.b = g;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
