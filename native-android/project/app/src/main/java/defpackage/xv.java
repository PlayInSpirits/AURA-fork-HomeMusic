package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv implements t85 {
    public Object n = cw.p;
    public cz o;
    public final /* synthetic */ aw p;

    public xv(aw awVar) {
        this.p = awVar;
    }

    @Override // defpackage.t85
    public final void a(u84 u84Var, int i) {
        cz czVar = this.o;
        if (czVar != null) {
            czVar.a(u84Var, i);
        }
    }

    public final Object b(wd0 wd0Var) throws Throwable {
        k10 k10VarQ;
        Object obj = this.n;
        boolean z = true;
        if (obj == cw.p || obj == cw.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = aw.t;
            aw awVar = this.p;
            k10 k10Var = (k10) atomicReferenceFieldUpdater.get(awVar);
            while (!awVar.B()) {
                long andIncrement = aw.p.getAndIncrement(awVar);
                long j = cw.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (k10Var.e != j2) {
                    k10VarQ = awVar.q(j2, k10Var);
                    if (k10VarQ == null) {
                        continue;
                    }
                } else {
                    k10VarQ = k10Var;
                }
                Object objP = awVar.P(k10VarQ, i, andIncrement, null);
                f01 f01Var = cw.m;
                if (objP == f01Var) {
                    kf2.o("unreachable");
                    return null;
                }
                f01 f01Var2 = cw.o;
                if (objP == f01Var2) {
                    if (andIncrement < awVar.v()) {
                        k10VarQ.a();
                    }
                    k10Var = k10VarQ;
                } else {
                    if (objP == cw.n) {
                        aw awVar2 = this.p;
                        cz czVarS = zz1.s(ya4.x(wd0Var));
                        try {
                            this.o = czVarS;
                            Object objP2 = awVar2.P(k10VarQ, i, andIncrement, this);
                            if (objP2 != f01Var) {
                                if (objP2 == f01Var2) {
                                    if (andIncrement < awVar2.v()) {
                                        k10VarQ.a();
                                    }
                                    k10 k10Var2 = (k10) aw.t.get(awVar2);
                                    while (true) {
                                        if (awVar2.B()) {
                                            cz czVar = this.o;
                                            czVar.getClass();
                                            this.o = null;
                                            this.n = cw.l;
                                            Throwable thS = awVar.s();
                                            if (thS != null) {
                                                czVar.resumeWith(new s14(thS));
                                                break;
                                            }
                                            czVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = aw.p.getAndIncrement(awVar2);
                                        long j3 = cw.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (k10Var2.e != j4) {
                                            k10 k10VarQ2 = awVar2.q(j4, k10Var2);
                                            if (k10VarQ2 != null) {
                                                k10Var2 = k10VarQ2;
                                            }
                                        }
                                        Object objP3 = awVar2.P(k10Var2, i2, andIncrement2, this);
                                        if (objP3 == cw.m) {
                                            a(k10Var2, i2);
                                            break;
                                        }
                                        if (objP3 == cw.o) {
                                            if (andIncrement2 < awVar2.v()) {
                                                k10Var2.a();
                                            }
                                        } else {
                                            if (objP3 == cw.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            k10Var2.a();
                                            this.n = objP3;
                                            this.o = null;
                                        }
                                    }
                                } else {
                                    k10VarQ.a();
                                    this.n = objP2;
                                    this.o = null;
                                }
                                czVarS.k(Boolean.TRUE, null);
                                break;
                            }
                            a(k10VarQ, i);
                            return czVarS.q();
                        } catch (Throwable th) {
                            czVarS.B();
                            throw th;
                        }
                    }
                    k10VarQ.a();
                    this.n = objP;
                }
            }
            this.n = cw.l;
            Throwable thS2 = awVar.s();
            if (thS2 != null) {
                int i3 = mk4.a;
                throw thS2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.n;
        f01 f01Var = cw.p;
        if (obj == f01Var) {
            kf2.o("`hasNext()` has not been invoked");
            return null;
        }
        this.n = f01Var;
        if (obj != cw.l) {
            return obj;
        }
        Throwable thT = this.p.t();
        int i = mk4.a;
        throw thT;
    }
}
