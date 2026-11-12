package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y64 extends ep4 implements wf1 {
    public /* synthetic */ Object o;
    public final /* synthetic */ long p;

    public y64(long r1, vd0 r3) {
        this.p = r1;
        super(2, r3);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r4, vd0 r5) {
        y64 r0 = new y64(this.p, r5);
        r0.o = r4;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        y64 r0 = (y64) create((e74) r1, (vd0) r2);
        j15 r3 = j15.a;
        r0.invokeSuspend(r3);
        return r3;
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r4) {
        kb4.X(r4);
        g74 r5 = ((e74) this.o).a;
        r5.d(r5.k, this.p, 1);
        return j15.a;
    }
}
