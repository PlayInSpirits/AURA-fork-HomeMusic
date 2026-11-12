package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hy {
    public final bv3 a;
    public final ev3 b;

    public hy(bv3 r1, fz0 r2, ev3 r3) {
        this.a = r1;
        this.b = r3;
    }

    public final void a(cv3 r3) {
        r3.getClass();
        tl1 r0 = ze5.a;
        bv3 r2 = this.a;
        if (r2.u != null) goto L6;
        r2.u = r3;
        r3.s.add(new zu3(r2, r2.s));
        return;
    L6:
        kf2.o("Check failed.");
    }

    public final void b(x90 r1) {
        this.a.C.add(r1);
    }

    public final cv3 c() {
        return this.a.u;
    }

    public final void d(o34 r1, IOException r2) {
        r1.getClass();
        r1.c.getClass();
    }

    public final void e(cv3 r1) {
        r1.getClass();
    }

    public final void f(cv3 r1) {
        r1.getClass();
    }

    public final void g(cv3 r1) {
    }

    public final void h(cv3 r1) {
    }

    public final void i(cv3 r1) {
    }

    public final void j(String r1, List r2) {
    }

    public final void k(String r1) {
    }

    public final boolean l() {
        return !h12.c(this.b.e.b, "GET");
    }

    public final boolean m() {
        return this.a.A;
    }

    public final void n(cv3 r1) {
    }

    public final Socket o() {
        return this.a.h();
    }

    public final void p(x90 r1) {
        this.a.C.remove(r1);
    }

    public final void q() {
    }

    public final void r() {
    }
}
