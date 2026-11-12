package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq3 extends c0 implements y00, y94 {
    public final aw s;

    public rq3(ne0 r2, aw r3) {
        super(r2, true);
        this.s = r3;
    }

    @Override // defpackage.y94
    public final Object a(vd0 r1, Object r2) {
        return this.s.a(r1, r2);
    }

    @Override // defpackage.y94
    public final Object d(Object r1) {
        return this.s.d(r1);
    }

    @Override // defpackage.a32, defpackage.s22
    public final void f(CancellationException r3) {
        if (isCancelled() == false) goto L5;
        return;
    L5:
        if (r3 != null) goto L7;
        r3 = new JobCancellationException(x(), null, this);
    L7:
        p(r3);
    }

    @Override // defpackage.y00
    public final Object g() {
        return this.s.g();
    }

    @Override // defpackage.y00
    public final Object h(ep4 r1) {
        aw r0 = this.s;
        r0.getClass();
        return aw.H(r0, r1);
    }

    @Override // defpackage.y00
    public final Object i(c60 r1) {
        aw r0 = this.s;
        r0.getClass();
        return aw.I(r0, r1);
    }

    @Override // defpackage.y00
    public final xv iterator() {
        aw r1 = this.s;
        r1.getClass();
        return new xv(r1);
    }

    @Override // defpackage.c0
    public final void j0(Throwable r3, boolean r4) {
        if (this.s.l(r3, false) == true) goto L7;
        if (r4 == true) goto L8;
        uc5.s(this.r, r3);
        return;
    L8:
        return;
    }

    @Override // defpackage.c0
    public final void k0(Object r1) {
        j15 r2 = (j15) r1;
        this.s.j(null);
    }

    @Override // defpackage.a32
    public final void p(CancellationException r3) {
        this.s.l(r3, true);
        o(r3);
    }
}
