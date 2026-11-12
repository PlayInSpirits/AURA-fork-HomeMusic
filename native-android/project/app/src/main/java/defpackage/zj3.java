package defpackage;

import android.widget.LinearLayout;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj3 implements oi3 {
    public final /* synthetic */ bj2 n;
    public final /* synthetic */ PlayerControllerFragment o;

    public zj3(PlayerControllerFragment playerControllerFragment, bj2 bj2Var) {
        this.o = playerControllerFragment;
        this.n = bj2Var;
    }

    @Override // defpackage.oi3
    public final void A(jw4 jw4Var) {
        this.o.o0();
    }

    @Override // defpackage.oi3
    public final void B(qi3 qi3Var, ni3 ni3Var) {
        i61 i61Var = this.o.l0;
        if (i61Var != null) {
            fu.K((LinearLayout) i61Var.o, qi3Var);
        }
    }

    @Override // defpackage.oi3
    public final void F(do2 do2Var) {
        bj2 bj2Var = this.n;
        PlayerControllerFragment playerControllerFragment = this.o;
        playerControllerFragment.n0(bj2Var);
        playerControllerFragment.q0(do2Var);
        playerControllerFragment.p0(do2Var);
    }

    @Override // defpackage.oi3
    public final void f(int i) {
        ud3.t0(i);
    }

    @Override // defpackage.oi3
    public final void v(int i) {
        if (i == 3) {
            this.o.o0();
        }
    }

    @Override // defpackage.oi3
    public final void x(boolean z) {
        ud3.x0(z);
    }
}
