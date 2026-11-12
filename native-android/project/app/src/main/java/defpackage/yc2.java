package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yc2 extends zc2 implements w92 {
    public final ba2 r;
    public final /* synthetic */ ad2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc2(ad2 ad2Var, ba2 ba2Var, a83 a83Var) {
        super(ad2Var, a83Var);
        this.s = ad2Var;
        this.r = ba2Var;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        ba2 ba2Var2 = this.r;
        r92 r92Var = ba2Var2.h().h;
        if (r92Var == r92.n) {
            this.s.j(this.n);
            return;
        }
        r92 r92Var2 = null;
        while (r92Var2 != r92Var) {
            a(e());
            r92Var2 = r92Var;
            r92Var = ba2Var2.h().h;
        }
    }

    @Override // defpackage.zc2
    public final void c() {
        this.r.h().f(this);
    }

    @Override // defpackage.zc2
    public final boolean d(ba2 ba2Var) {
        return this.r == ba2Var;
    }

    @Override // defpackage.zc2
    public final boolean e() {
        return this.r.h().h.compareTo(r92.q) >= 0;
    }
}
