package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc1 extends fu implements f75, ba2, j54, xd1 {
    public final nc1 A;
    public final nc1 B;
    public final Handler C;
    public final md1 D;
    public final /* synthetic */ nc1 E;

    public mc1(nc1 nc1Var) {
        this.E = nc1Var;
        Handler handler = new Handler();
        this.D = new md1();
        this.A = nc1Var;
        this.B = nc1Var;
        this.C = handler;
    }

    @Override // defpackage.fu
    public final View H(int i) {
        return this.E.findViewById(i);
    }

    @Override // defpackage.fu
    public final boolean I() {
        Window window = this.E.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.xd1
    public final void a(ld1 ld1Var, kc1 kc1Var) {
    }

    @Override // defpackage.f75
    public final e75 d() {
        return this.E.d();
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.E.q.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.E.I;
    }
}
