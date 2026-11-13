package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class c51 extends dq {
    public final f51 g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(ExtendedFloatingActionButton extendedFloatingActionButton, d34 d34Var, f51 f51Var, boolean z) {
        super(extendedFloatingActionButton, d34Var);
        this.i = extendedFloatingActionButton;
        this.g = f51Var;
        this.h = z;
    }

    @Override // defpackage.dq
    public final AnimatorSet a() {
        zx2 zx2Var = this.f;
        if (zx2Var == null) {
            if (this.e == null) {
                this.e = zx2.b(this.a, c());
            }
            zx2Var = this.e;
            zx2Var.getClass();
        }
        boolean g = zx2Var.g("width");
        f51 f51Var = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (g) {
            PropertyValuesHolder[] e = zx2Var.e("width");
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), f51Var.d());
            zx2Var.h("width", e);
        }
        if (zx2Var.g("height")) {
            PropertyValuesHolder[] e2 = zx2Var.e("height");
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), f51Var.b());
            zx2Var.h("height", e2);
        }
        if (zx2Var.g("paddingStart")) {
            PropertyValuesHolder[] e3 = zx2Var.e("paddingStart");
            PropertyValuesHolder propertyValuesHolder = e3[0];
            WeakHashMap weakHashMap = j65.a;
            propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), f51Var.s());
            zx2Var.h("paddingStart", e3);
        }
        if (zx2Var.g("paddingEnd")) {
            PropertyValuesHolder[] e4 = zx2Var.e("paddingEnd");
            PropertyValuesHolder propertyValuesHolder2 = e4[0];
            WeakHashMap weakHashMap2 = j65.a;
            propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), f51Var.j());
            zx2Var.h("paddingEnd", e4);
        }
        if (zx2Var.g("labelOpacity")) {
            PropertyValuesHolder[] e5 = zx2Var.e("labelOpacity");
            boolean z = this.h;
            e5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            zx2Var.h("labelOpacity", e5);
        }
        return b(zx2Var);
    }

    @Override // defpackage.dq
    public final int c() {
        return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.dq
    public final void e() {
        this.d.o = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.Q = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        f51 f51Var = this.g;
        layoutParams.width = f51Var.o().width;
        layoutParams.height = f51Var.o().height;
    }

    @Override // defpackage.dq
    public final void f(Animator animator) {
        d34 d34Var = this.d;
        Animator animator2 = (Animator) d34Var.o;
        if (animator2 != null) {
            animator2.cancel();
        }
        d34Var.o = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.P = z;
        extendedFloatingActionButton.Q = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.dq
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.P = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.T = layoutParams.width;
            extendedFloatingActionButton.U = layoutParams.height;
        }
        f51 f51Var = this.g;
        layoutParams.width = f51Var.o().width;
        layoutParams.height = f51Var.o().height;
        int s = f51Var.s();
        int paddingTop = extendedFloatingActionButton.getPaddingTop();
        int j = f51Var.j();
        int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
        WeakHashMap weakHashMap = j65.a;
        extendedFloatingActionButton.setPaddingRelative(s, paddingTop, j, paddingBottom);
        extendedFloatingActionButton.requestLayout();
    }

    @Override // defpackage.dq
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.P || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
