package defpackage;

import android.animation.Animator;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e51 extends dq {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(ExtendedFloatingActionButton extendedFloatingActionButton, d34 d34Var) {
        super(extendedFloatingActionButton, d34Var);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.dq
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.dq
    public final void e() {
        this.d.o = null;
        this.g.G = 0;
    }

    @Override // defpackage.dq
    public final void f(Animator animator) {
        d34 d34Var = this.d;
        Animator animator2 = (Animator) d34Var.o;
        if (animator2 != null) {
            animator2.cancel();
        }
        d34Var.o = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.G = 2;
    }

    @Override // defpackage.dq
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.dq
    public final boolean h() {
        r00 r00Var = ExtendedFloatingActionButton.V;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.G;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }
}
