package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m13 implements az, t85 {
    public final cz n;
    public final /* synthetic */ n13 o;

    public m13(n13 n13Var, cz czVar) {
        this.o = n13Var;
        this.n = czVar;
    }

    @Override // defpackage.t85
    public final void a(u84 u84Var, int i) {
        this.n.a(u84Var, i);
    }

    @Override // defpackage.az
    public final f01 c(Object obj, xf1 xf1Var) {
        n13 n13Var = this.o;
        bz bzVar = new bz(n13Var, this);
        f01 f01VarG = this.n.G((j15) obj, bzVar);
        if (f01VarG != null) {
            n13.w.set(n13Var, null);
        }
        return f01VarG;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.n.r;
    }

    @Override // defpackage.az
    public final void k(Object obj, xf1 xf1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n13.w;
        n13 n13Var = this.o;
        atomicReferenceFieldUpdater.set(n13Var, null);
        x xVar = new x(25, n13Var, this);
        cz czVar = this.n;
        czVar.D(j15.a, czVar.p, new bz(0, xVar));
    }

    @Override // defpackage.az
    public final boolean r(Throwable th) {
        return this.n.r(th);
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        this.n.resumeWith(obj);
    }

    @Override // defpackage.az
    public final void t(Object obj) {
        this.n.t(obj);
    }
}
