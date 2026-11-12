package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends dq {
    public final f51 g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    public c51(ExtendedFloatingActionButton r1, d34 r2, f51 r3, boolean r4) {
        this.i = r1;
        super(r1, r2);
        this.g = r3;
        this.h = r4;
    }

    @Override // defpackage.dq
    public final AnimatorSet a() {
        zx2 r0 = this.f;
        if (r0 == null) goto L6;
    L9:
        boolean r2 = r0.g("width");
        f51 r5 = this.g;
        ExtendedFloatingActionButton r6 = this.i;
        if (r2 == false) goto L13;
        PropertyValuesHolder[] r3 = r0.e("width");
        r3[0].setFloatValues(new float[]{r6.getWidth(), r5.d()});
        r0.h("width", r3);
    L13:
        if (r0.g("height") == false) goto L16;
        PropertyValuesHolder[] r4 = r0.e("height");
        r4[0].setFloatValues(new float[]{r6.getHeight(), r5.b()});
        r0.h("height", r4);
    L16:
        if (r0.g("paddingStart") == false) goto L19;
        PropertyValuesHolder[] r7 = r0.e("paddingStart");
        PropertyValuesHolder r8 = r7[0];
        WeakHashMap r9 = j65.a;
        r8.setFloatValues(new float[]{r6.getPaddingStart(), r5.s()});
        r0.h("paddingStart", r7);
    L19:
        if (r0.g("paddingEnd") == false) goto L22;
        PropertyValuesHolder[] r10 = r0.e("paddingEnd");
        PropertyValuesHolder r11 = r10[0];
        WeakHashMap r12 = j65.a;
        r11.setFloatValues(new float[]{r6.getPaddingEnd(), r5.j()});
        r0.h("paddingEnd", r10);
    L22:
        if (r0.g("labelOpacity") == false) goto L32;
        PropertyValuesHolder[] r13 = r0.e("labelOpacity");
        float r14 = 1.0f;
        boolean r15 = this.h;
        if (r15 == false) goto L26;
        float r16 = 0.0f;
    L27:
        if (r15 == true) goto L30;
        r14 = 0.0f;
    L30:
        r13[0].setFloatValues(new float[]{r16, r14});
        r0.h("labelOpacity", r13);
        goto L32
    L26:
        r16 = 1.0f;
    L32:
        return b(r0);
    L6:
        if (this.e != null) goto L8;
        this.e = zx2.b(this.a, c());
    L8:
        r0 = this.e;
        r0.getClass();
        goto L9
    }

    @Override // defpackage.dq
    public final int c() {
        if (this.h == false) goto L6;
        return R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
    L6:
        return R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.dq
    public final void e() {
        this.d.o = null;
        ExtendedFloatingActionButton r0 = this.i;
        r0.Q = false;
        r0.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams r1 = r0.getLayoutParams();
        if (r1 != null) goto L5;
        return;
    L5:
        f51 r2 = this.g;
        r1.width = r2.o().width;
        r1.height = r2.o().height;
    }

    @Override // defpackage.dq
    public final void f(Animator r3) {
        d34 r0 = this.d;
        Animator r1 = (Animator) r0.o;
        if (r1 == null) goto L5;
        r1.cancel();
    L5:
        r0.o = r3;
        boolean r4 = this.h;
        ExtendedFloatingActionButton r2 = this.i;
        r2.P = r4;
        r2.Q = true;
        r2.setHorizontallyScrolling(true);
    }

    @Override // defpackage.dq
    public final void g() {
        ExtendedFloatingActionButton r0 = this.i;
        boolean r1 = this.h;
        r0.P = r1;
        ViewGroup.LayoutParams r2 = r0.getLayoutParams();
        if (r2 != null) goto L5;
        return;
    L5:
        if (r1 == true) goto L7;
        r0.T = r2.width;
        r0.U = r2.height;
    L7:
        f51 r5 = this.g;
        r2.width = r5.o().width;
        r2.height = r5.o().height;
        int r3 = r5.s();
        int r4 = r0.getPaddingTop();
        int r6 = r5.j();
        int r7 = r0.getPaddingBottom();
        WeakHashMap r8 = j65.a;
        r0.setPaddingRelative(r3, r4, r6, r7);
        r0.requestLayout();
    }

    @Override // defpackage.dq
    public final boolean h() {
        ExtendedFloatingActionButton r0 = this.i;
        boolean r1 = r0.P;
        if (this.h != r1) goto L5;
        return true;
    L5:
        if (r0.getIcon() != null) goto L7;
        return true;
    L7:
        if (TextUtils.isEmpty(r0.getText()) == true) goto L14;
        return false;
    L14:
        return true;
    }
}
