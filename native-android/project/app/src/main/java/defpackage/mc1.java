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

    public mc1(nc1 r3) {
        this.E = r3;
        Handler r0 = new Handler();
        this.D = new md1();
        this.A = r3;
        this.B = r3;
        this.C = r0;
    }

    @Override // defpackage.fu
    public final View H(int r1) {
        return this.E.findViewById(r1);
    }

    @Override // defpackage.fu
    public final boolean I() {
        Window r0 = this.E.getWindow();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.peekDecorView() == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.xd1
    public final void a(ld1 r1, kc1 r2) {
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
