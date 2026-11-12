package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bv extends ep4 implements wf1 {
    public /* synthetic */ Object o;
    public final /* synthetic */ cv p;
    public final /* synthetic */ f63 q;
    public final /* synthetic */ fa r;
    public final /* synthetic */ jo s;

    public bv(cv r1, f63 r2, fa r3, jo r4, vd0 r5) {
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        super(2, r5);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r7, vd0 r8) {
        fa r3 = this.r;
        jo r4 = this.s;
        bv r0 = new bv(this.p, this.q, r3, r4, r8);
        r0.o = r7;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((bv) create((we0) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r7) {
        kb4.X(r7);
        we0 r8 = (we0) this.o;
        fa r3 = this.r;
        cv r1 = this.p;
        fu.G(r8, null, null, new r(r1, this.q, r3, null, 1), 3);
        return fu.G(r8, null, null, new p(r1, this.s, null, 3), 3);
    }
}
