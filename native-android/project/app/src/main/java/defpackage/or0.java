package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class or0 extends br4 {
    public int p;

    public or0(int i) {
        super(false, 0L);
        this.p = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract vd0 d();

    public Throwable e(Object obj) {
        a70 a70Var = obj instanceof a70 ? (a70) obj : null;
        if (a70Var != null) {
            return a70Var.a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th) {
        uc5.s(d().getContext(), new cf0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            vd0 vd0VarD = d();
            vd0VarD.getClass();
            mr0 mr0Var = (mr0) vd0VarD;
            wd0 wd0Var = mr0Var.r;
            Object obj = mr0Var.t;
            ne0 context = wd0Var.getContext();
            Object objR = te5.R(context, obj);
            s22 s22Var = null;
            f15 f15VarQ = objR != te5.b ? jz4.Q(wd0Var, context, objR) : null;
            try {
                ne0 context2 = wd0Var.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null) {
                    int i = this.p;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        s22Var = (s22) context2.K(fz0.h0);
                    }
                }
                if (s22Var != null && !s22Var.b()) {
                    CancellationException cancellationExceptionQ = s22Var.q();
                    b(cancellationExceptionQ);
                    wd0Var.resumeWith(kb4.o(cancellationExceptionQ));
                } else if (thE != null) {
                    wd0Var.resumeWith(new s14(thE));
                } else {
                    wd0Var.resumeWith(f(objH));
                }
            } finally {
                if (f15VarQ == null || f15VarQ.m0()) {
                    te5.K(context, objR);
                }
            }
        } catch (Throwable th) {
            g(th);
        }
    }
}
