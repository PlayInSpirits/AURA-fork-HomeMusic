package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 implements uh0, rh0 {
    public final List n;
    public final wi0 o;
    public final th0 p;
    public int q;
    public f42 r;
    public List s;
    public int t;
    public volatile tw2 u;
    public File v;

    public ph0(List r2, wi0 r3, th0 r4) {
        this.q = -1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // defpackage.rh0
    public final void b(Exception r4) {
        this.p.b(this.r, r4, this.u.c, 3);
    }

    @Override // defpackage.uh0
    public final boolean c() {
    L2:
        List r0 = this.s;
        boolean r2 = false;
        if (r0 != null) goto L5;
    L16:
        int r1 = this.q + 1;
        this.q = r1;
        if (r1 >= this.n.size()) goto L18;
        f42 r3 = (f42) this.n.get(this.q);
        wi0 r4 = this.o;
        File r5 = r4.h.a().m(new qh0(r3, r4.n));
        this.v = r5;
        if (r5 == null) goto L2;
        this.r = r3;
        this.s = this.o.c.a().f(r5);
        this.t = 0;
        goto L2
    L18:
        return false;
    L5:
        if (this.t >= r0.size()) goto L16;
        this.u = null;
    L7:
        if (r2 == true) goto L15;
        if (this.t >= this.s.size()) goto L15;
        List r6 = this.s;
        int r7 = this.t;
        this.t = r7 + 1;
        uw2 r8 = (uw2) r6.get(r7);
        File r9 = this.v;
        wi0 r10 = this.o;
        this.u = r8.b(r9, r10.e, r10.f, r10.i);
        if (this.u == null) goto L7;
        if (this.o.c(this.u.c.a()) == null) goto L7;
        this.u.c.d(this.o.o, this);
        r2 = true;
    L15:
        return r2;
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 r0 = this.u;
        if (r0 == null) goto L6;
        r0.c.cancel();
        return;
    }

    @Override // defpackage.rh0
    public final void f(Object r7) {
        this.p.a(this.r, r7, this.u.c, 3, this.r);
    }
}
