package defpackage;

import android.view.Surface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kk2 implements q55 {
    public final /* synthetic */ ok2 b;

    public kk2(ok2 ok2Var) {
        this.b = ok2Var;
    }

    @Override // defpackage.q55
    public final void b() {
        ok2 ok2Var = this.b;
        Surface surface = ok2Var.l1;
        if (surface != null) {
            ok2Var.W0.j(surface);
            ok2Var.o1 = true;
        }
    }

    @Override // defpackage.q55
    public final void c() {
        ok2 ok2Var = this.b;
        if (ok2Var.l1 != null) {
            ok2Var.S0(0, 1);
        }
    }

    @Override // defpackage.q55
    public final void d() {
        k41 k41Var = this.b.V;
        if (k41Var != null) {
            k41Var.a();
        }
    }

    @Override // defpackage.q55
    public final void a(s55 s55Var) {
    }
}
