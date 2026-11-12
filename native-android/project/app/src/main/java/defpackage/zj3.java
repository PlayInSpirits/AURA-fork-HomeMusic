package defpackage;

import android.widget.LinearLayout;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj3 implements oi3 {
    public final /* synthetic */ bj2 n;
    public final /* synthetic */ PlayerControllerFragment o;

    public zj3(PlayerControllerFragment r1, bj2 r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.oi3
    public final void A(jw4 r1) {
        this.o.o0();
    }

    @Override // defpackage.oi3
    public final void B(qi3 r1, ni3 r2) {
        i61 r0 = this.o.l0;
        if (r0 == null) goto L6;
        fu.K((LinearLayout) r0.o, r1);
        return;
    }

    @Override // defpackage.oi3
    public final void F(do2 r2) {
        bj2 r0 = this.n;
        PlayerControllerFragment r1 = this.o;
        r1.n0(r0);
        r1.q0(r2);
        r1.p0(r2);
    }

    @Override // defpackage.oi3
    public final void f(int r1) {
        ud3.t0(r1);
    }

    @Override // defpackage.oi3
    public final void v(int r2) {
        if (r2 != 3) goto L6;
        this.o.o0();
        return;
    }

    @Override // defpackage.oi3
    public final void x(boolean r1) {
        ud3.x0(r1);
    }
}
