package defpackage;

import android.animation.Animator;
import app.homemusic.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 extends dq {
    public boolean g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    public d51(ExtendedFloatingActionButton r1, d34 r2) {
        this.h = r1;
        super(r1, r2);
    }

    @Override // defpackage.dq
    public final int c() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.dq
    public final void d() {
        super.d();
        this.g = true;
    }

    @Override // defpackage.dq
    public final void e() {
        this.d.o = null;
        ExtendedFloatingActionButton r1 = this.h;
        r1.G = 0;
        if (this.g == true) goto L6;
        r1.setVisibility(8);
        return;
    }

    @Override // defpackage.dq
    public final void f(Animator r3) {
        d34 r0 = this.d;
        Animator r1 = (Animator) r0.o;
        if (r1 == null) goto L5;
        r1.cancel();
    L5:
        r0.o = r3;
        this.g = false;
        ExtendedFloatingActionButton r2 = this.h;
        r2.setVisibility(0);
        r2.G = 1;
    }

    @Override // defpackage.dq
    public final void g() {
        this.h.setVisibility(8);
    }

    @Override // defpackage.dq
    public final boolean h() {
        r00 r0 = ExtendedFloatingActionButton.V;
        ExtendedFloatingActionButton r2 = this.h;
        int r1 = r2.getVisibility();
        int r3 = r2.G;
        if (r1 != 0) goto L7;
        if (r3 == 1) goto L8;
        return false;
    L8:
        return true;
    L7:
        if (r3 != 2) goto L8;
        return false;
    }
}
