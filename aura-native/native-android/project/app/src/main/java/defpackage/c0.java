package defpackage;

import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends a32 implements vd0, we0 {
    public final ne0 r;

    public c0(ne0 ne0Var, boolean z) {
        super(z);
        N((s22) ne0Var.K(fz0.h0));
        this.r = ne0Var.J(this);
    }

    @Override // defpackage.a32
    public final void L(CompletionHandlerException completionHandlerException) {
        uc5.s(this.r, completionHandlerException);
    }

    @Override // defpackage.a32
    public final void X(Object obj) {
        if (!(obj instanceof a70)) {
            k0(obj);
        } else {
            a70 a70Var = (a70) obj;
            j0(a70Var.a, a70.b.get(a70Var) != 0);
        }
    }

    @Override // defpackage.we0
    public final ne0 e() {
        return this.r;
    }

    @Override // defpackage.vd0
    public final ne0 getContext() {
        return this.r;
    }

    public void j0(Throwable th, boolean z) {
    }

    public void k0(Object obj) {
    }

    public final void l0(ze0 ze0Var, c0 c0Var, wf1 wf1Var) {
        Object objInvoke;
        int iOrdinal = ze0Var.ordinal();
        j15 j15Var = j15.a;
        if (iOrdinal == 0) {
            try {
                uc5.T(ya4.x(ya4.i(c0Var, this, wf1Var)), j15Var);
                return;
            } catch (Throwable th) {
                resumeWith(new s14(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                wf1Var.getClass();
                ya4.x(ya4.i(c0Var, this, wf1Var)).resumeWith(j15Var);
                return;
            }
            if (iOrdinal != 3) {
                er1.n();
                return;
            }
            try {
                ne0 ne0Var = this.r;
                Object objR = te5.R(ne0Var, null);
                try {
                    if (wf1Var instanceof jp) {
                        jz4.j(2, wf1Var);
                        objInvoke = wf1Var.invoke(c0Var, this);
                    } else {
                        objInvoke = ya4.Q(wf1Var, c0Var, this);
                    }
                    te5.K(ne0Var, objR);
                    if (objInvoke != xe0.n) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    te5.K(ne0Var, objR);
                    throw th2;
                }
            } catch (Throwable th3) {
                resumeWith(new s14(th3));
            }
        }
    }

    @Override // defpackage.vd0
    public final void resumeWith(Object obj) {
        Throwable thA = bb3.a(obj);
        if (thA != null) {
            obj = new a70(thA, false);
        }
        Object objS = S(obj);
        if (objS == zz1.e) {
            return;
        }
        m(objS);
    }

    @Override // defpackage.a32
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
