package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rq3 extends c0 implements y00, y94 {
    public final aw s;

    public rq3(ne0 ne0Var, aw awVar) {
        super(ne0Var, true);
        this.s = awVar;
    }

    @Override // defpackage.y94
    public final Object a(vd0 vd0Var, Object obj) {
        return this.s.a(vd0Var, obj);
    }

    @Override // defpackage.y94
    public final Object d(Object obj) {
        return this.s.d(obj);
    }

    @Override // defpackage.a32, defpackage.s22
    public final void f(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        p(cancellationException);
    }

    @Override // defpackage.y00
    public final Object g() {
        return this.s.g();
    }

    @Override // defpackage.y00
    public final Object h(ep4 ep4Var) {
        aw awVar = this.s;
        awVar.getClass();
        return aw.H(awVar, ep4Var);
    }

    @Override // defpackage.y00
    public final Object i(c60 c60Var) {
        aw awVar = this.s;
        awVar.getClass();
        return aw.I(awVar, c60Var);
    }

    @Override // defpackage.y00
    public final xv iterator() {
        aw awVar = this.s;
        awVar.getClass();
        return new xv(awVar);
    }

    @Override // defpackage.c0
    public final void j0(Throwable th, boolean z) {
        if (this.s.l(th, false) || z) {
            return;
        }
        uc5.s(this.r, th);
    }

    @Override // defpackage.c0
    public final void k0(Object obj) {
        this.s.j(null);
    }

    @Override // defpackage.a32
    public final void p(CancellationException cancellationException) {
        this.s.l(cancellationException, true);
        o(cancellationException);
    }
}
