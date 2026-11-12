package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import app.homemusic.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa5 implements View.OnApplyWindowInsetsListener {
    public final ma5 a;
    public pb5 b;

    public oa5(View view, ma5 ma5Var) {
        pb5 pb5VarB;
        this.a = ma5Var;
        WeakHashMap weakHashMap = j65.a;
        pb5 pb5VarA = b65.a(view);
        if (pb5VarA != null) {
            int i = Build.VERSION.SDK_INT;
            pb5VarB = (i >= 36 ? new ab5(pb5VarA) : i >= 35 ? new za5(pb5VarA) : i >= 34 ? new ya5(pb5VarA) : i >= 31 ? new xa5(pb5VarA) : i >= 30 ? new wa5(pb5VarA) : i >= 29 ? new va5(pb5VarA) : new ua5(pb5VarA)).b();
        } else {
            pb5VarB = null;
        }
        this.b = pb5VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = pb5.g(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        pb5 pb5VarG = pb5.g(windowInsets, view);
        mb5 mb5Var = pb5VarG.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = j65.a;
            this.b = b65.a(view);
        }
        if (this.b == null) {
            this.b = pb5VarG;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ma5 ma5VarJ = pa5.j(view);
            if (ma5VarJ == null || !Objects.equals(ma5VarJ.n, pb5VarG)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                pb5 pb5Var = this.b;
                int i = 1;
                while (i <= 512) {
                    vz1 vz1VarH = mb5Var.h(i);
                    vz1 vz1VarH2 = pb5Var.a.h(i);
                    int i2 = vz1VarH.a;
                    int i3 = vz1VarH.d;
                    int i4 = vz1VarH.c;
                    int i5 = vz1VarH.b;
                    int i6 = vz1VarH2.a;
                    int i7 = vz1VarH2.d;
                    int[] iArr3 = iArr;
                    int i8 = vz1VarH2.c;
                    int i9 = vz1VarH2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                boolean z2 = false;
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = pb5VarG;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    pb5 pb5Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = pa5.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = pa5.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = pa5.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? pa5.h : null;
                    }
                    ta5 ta5Var = new ta5(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    ta5Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ta5Var.a.b());
                    vz1 vz1VarH3 = mb5Var.h(i12);
                    vz1 vz1VarH4 = pb5Var2.a.h(i12);
                    int iMin = Math.min(vz1VarH3.a, vz1VarH4.a);
                    int i13 = vz1VarH3.b;
                    int i14 = vz1VarH4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = vz1VarH3.c;
                    int i16 = vz1VarH4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = vz1VarH3.d;
                    int i18 = vz1VarH4.d;
                    qr2 qr2Var = new qr2(vz1.b(iMin, iMin2, iMin3, Math.min(i17, i18)), vz1.b(Math.max(vz1VarH3.a, vz1VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), z2, 21);
                    pa5.g(view, ta5Var, pb5VarG, false);
                    duration.addUpdateListener(new na5(ta5Var, pb5VarG, pb5Var2, i12, view));
                    duration.addListener(new kw0(3, view, ta5Var));
                    h93.a(view, new sz(view, ta5Var, qr2Var, duration));
                    this.b = pb5VarG;
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
