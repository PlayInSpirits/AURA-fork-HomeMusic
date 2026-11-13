package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.f34;
import defpackage.hm2;
import defpackage.k42;
import defpackage.kf2;
import defpackage.mw3;
import defpackage.nw3;
import defpackage.pa;
import defpackage.pz;
import defpackage.qz;
import defpackage.rz;
import defpackage.uv;
import defpackage.xw3;
import defpackage.yw3;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends mw3 implements xw3 {
    public int p;
    public uv q;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new qz();
        J0(mw3.J(context, attributeSet, i, i2).a);
        q0();
    }

    public static pa F0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((k42) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (0.0f <= f5) {
                i2 = i5;
                f5 = 0.0f;
            }
            if (0.0f > f3) {
                i4 = i5;
                f3 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new pa((k42) list.get(i), (k42) list.get(i3));
    }

    @Override // defpackage.mw3
    public final void C0(RecyclerView recyclerView, int i) {
        pz pzVar = new pz(this, recyclerView.getContext());
        pzVar.a = i;
        D0(pzVar);
    }

    public final boolean G0() {
        return this.q.o == 0;
    }

    public final boolean H0() {
        return G0() && this.b.getLayoutDirection() == 1;
    }

    public final int I0(int i, hm2 hm2Var, yw3 yw3Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.p;
        int i3 = i2 + i;
        if (i3 < 0 || i3 > 0) {
            i = 0 - i2;
        }
        this.p = i2 + i;
        H0();
        throw null;
    }

    public final void J0(int i) {
        rz rzVar;
        if (i != 0 && i != 1) {
            kf2.n(f34.f(i, "invalid orientation:"));
            return;
        }
        c(null);
        uv uvVar = this.q;
        if (uvVar == null || i != uvVar.o) {
            if (i == 0) {
                rzVar = new rz(this, 1);
            } else {
                if (i != 1) {
                    kf2.n("invalid orientation");
                    return;
                }
                rzVar = new rz(this, 0);
            }
            this.q = rzVar;
            q0();
        }
    }

    @Override // defpackage.mw3
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(mw3.I(u(0)));
            accessibilityEvent.setToIndex(mw3.I(u(v() - 1)));
        }
    }

    @Override // defpackage.xw3
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.mw3
    public final boolean d() {
        return G0();
    }

    @Override // defpackage.mw3
    public final boolean e() {
        return !G0();
    }

    @Override // defpackage.mw3
    public final void e0(hm2 hm2Var, yw3 yw3Var) {
        if (yw3Var.b() <= 0) {
            l0(hm2Var);
            return;
        }
        H0();
        View view = hm2Var.k(0, Long.MAX_VALUE).a;
        kf2.o("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.mw3
    public final void f0(yw3 yw3Var) {
        if (v() == 0) {
            return;
        }
        mw3.I(u(0));
    }

    @Override // defpackage.mw3
    public final int j(yw3 yw3Var) {
        throw null;
    }

    @Override // defpackage.mw3
    public final int k(yw3 yw3Var) {
        return this.p;
    }

    @Override // defpackage.mw3
    public final int l(yw3 yw3Var) {
        return 0 - 0;
    }

    @Override // defpackage.mw3
    public final int m(yw3 yw3Var) {
        throw null;
    }

    @Override // defpackage.mw3
    public final int n(yw3 yw3Var) {
        return this.p;
    }

    @Override // defpackage.mw3
    public final int o(yw3 yw3Var) {
        return 0 - 0;
    }

    @Override // defpackage.mw3
    public final boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.mw3
    public final nw3 r() {
        return new nw3(-2, -2);
    }

    @Override // defpackage.mw3
    public final int r0(int i, hm2 hm2Var, yw3 yw3Var) {
        if (G0()) {
            I0(i, hm2Var, yw3Var);
        }
        return 0;
    }

    @Override // defpackage.mw3
    public final int t0(int i, hm2 hm2Var, yw3 yw3Var) {
        if (e()) {
            I0(i, hm2Var, yw3Var);
        }
        return 0;
    }

    @Override // defpackage.mw3
    public final void z(View view, Rect rect) {
        RecyclerView.O(view, rect);
        rect.centerX();
        throw null;
    }

    public CarouselLayoutManager() {
        new qz();
        q0();
        J0(0);
    }

    @Override // defpackage.mw3
    public final void s0(int i) {
    }
}
