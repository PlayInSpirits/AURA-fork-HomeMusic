package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 implements vy3, qe0 {
    public final ne0 n;
    public final wf1 o;
    public final we0 p;
    public sk4 q;

    public l62(ne0 r1, wf1 r2) {
        this.n = r1;
        this.o = r2;
        this.p = te5.a(r1.J(this));
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 r1) {
        return ya4.F(this, r1);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 r1) {
        return ya4.r(this, r1);
    }

    @Override // defpackage.vy3
    public final void a() {
        sk4 r0 = this.q;
        if (r0 == null) goto L5;
        r0.p(new pb1(1));
    L5:
        this.q = null;
    }

    @Override // defpackage.vy3
    public final void c() {
        sk4 r0 = this.q;
        if (r0 == null) goto L5;
        r0.p(new pb1(1));
    L5:
        this.q = null;
    }

    @Override // defpackage.vy3
    public final void d() {
        sk4 r0 = this.q;
        if (r0 == null) goto L5;
        CancellationException r2 = new CancellationException("Old job was still running!");
        r2.initCause(null);
        r0.f(r2);
    L5:
        wf1 r1 = this.o;
        this.q = fu.G(this.p, null, null, r1, 3);
    }

    @Override // defpackage.le0
    public final me0 getKey() {
        return fz0.S;
    }

    @Override // defpackage.qe0
    public final void n(ne0 r4, Throwable r5) {
        x80 r0 = (x80) r4.K(x80.o);
        if (r0 == null) goto L5;
        si0.T(r5, new fa(4, r0, this));
    L5:
        qe0 r3 = (qe0) this.n.K(fz0.S);
        if (r3 == null) goto L9;
        r3.n(r4, r5);
        return;
    L9:
        throw r5;
    }

    @Override // defpackage.ne0
    public final Object s(wf1 r1, Object r2) {
        return r1.invoke(r2, this);
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 r1) {
        return ya4.C(this, r1);
    }
}
