package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class os3 implements cd2 {
    public final wl0 a;

    public os3(wl0 r1) {
        this.a = r1;
    }

    @Override // defpackage.cd2
    public final boolean a(ik3 r1, cu4 r2, mt2 r3, long r4) {
        r2.getClass();
        r3.getClass();
        return this.a.a(r1, r2, r3, r4);
    }

    @Override // defpackage.cd2
    public final void b(ik3 r1) {
        this.a.b(r1);
    }

    @Override // defpackage.cd2
    public final void c(ik3 r1) {
        this.a.m(r1);
    }

    @Override // defpackage.cd2
    public final boolean d(ik3 r1) {
        return false;
    }

    @Override // defpackage.cd2
    public final void e(ik3 r1) {
        this.a.e(r1);
    }

    @Override // defpackage.cd2
    public final void f(bd2 r1, tv4 r2, t41[] r3) {
        r2.getClass();
        r3.getClass();
        this.a.f(r1, r2, r3);
    }

    @Override // defpackage.cd2
    public final r20 g(ik3 r2) {
        return new r20(this.a, r2);
    }

    @Override // defpackage.cd2
    public final boolean h(bd2 r8) {
        long r0 = r8.d;
        long r2 = r8.e;
        boolean r4 = jp1.a();
        if (r0 < (-20000000)) goto L17;
        if (r4 == false) goto L11;
        if (r0 >= 30000000) goto L11;
        if (r2 < 40000000) goto L11;
        return false;
    L11:
        if (this.a.h(r8) == false) goto L16;
        return true;
    L16:
        return false;
    L17:
        return false;
    }

    @Override // defpackage.cd2
    public final long i(ik3 r1) {
        return this.a.n;
    }

    @Override // defpackage.cd2
    public final boolean j(bd2 r1) {
        return this.a.j(r1);
    }
}
