package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hy {
    public final bv3 a;
    public final ev3 b;

    public hy(bv3 bv3Var, fz0 fz0Var, ev3 ev3Var) {
        this.a = bv3Var;
        this.b = ev3Var;
    }

    public final void a(cv3 cv3Var) {
        cv3Var.getClass();
        tl1 tl1Var = ze5.a;
        bv3 bv3Var = this.a;
        if (bv3Var.u != null) {
            kf2.o("Check failed.");
        } else {
            bv3Var.u = cv3Var;
            cv3Var.s.add(new zu3(bv3Var, bv3Var.s));
        }
    }

    public final void b(x90 x90Var) {
        this.a.C.add(x90Var);
    }

    public final cv3 c() {
        return this.a.u;
    }

    public final void d(o34 o34Var, IOException iOException) {
        o34Var.getClass();
        o34Var.c.getClass();
    }

    public final void e(cv3 cv3Var) {
        cv3Var.getClass();
    }

    public final void f(cv3 cv3Var) {
        cv3Var.getClass();
    }

    public final boolean l() {
        return !h12.c(this.b.e.b, "GET");
    }

    public final boolean m() {
        return this.a.A;
    }

    public final Socket o() {
        return this.a.h();
    }

    public final void p(x90 x90Var) {
        this.a.C.remove(x90Var);
    }

    public final void q() {
    }

    public final void r() {
    }

    public final void g(cv3 cv3Var) {
    }

    public final void h(cv3 cv3Var) {
    }

    public final void i(cv3 cv3Var) {
    }

    public final void k(String str) {
    }

    public final void n(cv3 cv3Var) {
    }

    public final void j(String str, List list) {
    }
}
