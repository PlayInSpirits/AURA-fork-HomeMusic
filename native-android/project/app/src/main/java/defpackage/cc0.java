package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends ep4 implements wf1 {
    public ic2 o;
    public sk4 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ oc2 s;
    public final /* synthetic */ c52 t;
    public final /* synthetic */ dd5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(oc2 oc2Var, c52 c52Var, dd5 dd5Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.s = oc2Var;
        this.t = c52Var;
        this.u = dd5Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        cc0 cc0Var = new cc0(this.s, this.t, this.u, vd0Var);
        cc0Var.r = obj;
        return cc0Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((cc0) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        sk4 sk4VarG;
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        ic2 ic2Var;
        int i = this.q;
        oc2 oc2Var = this.s;
        boolean z = true;
        try {
            try {
                if (i == 0) {
                    kb4.X(obj);
                    we0 we0Var = (we0) this.r;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    ry ryVarC = oc2Var.c();
                    sk4VarG = fu.G(we0Var, null, null, new x70(this.t, this.u, atomicInteger2, ryVarC, null, 1), 3);
                    try {
                        this.r = atomicInteger2;
                        this.o = ryVarC;
                        this.p = sk4VarG;
                        this.q = 1;
                        obj = fu.e(ryVarC, this);
                        xe0 xe0Var = xe0.n;
                        if (obj == xe0Var) {
                            return xe0Var;
                        }
                        atomicInteger = atomicInteger2;
                        ic2Var = ryVarC;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        atomicInteger = atomicInteger2;
                        ic2Var = ryVarC;
                        String str = ic0.a;
                        cx.f().c(str, "Delegated worker " + oc2Var.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = false;
                        }
                        if (ic2Var.isCancelled() || !z) {
                            throw cancellationException;
                        }
                        throw new zb0(atomicInteger.get());
                    }
                } else {
                    if (i != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sk4VarG = this.p;
                    ic2Var = this.o;
                    atomicInteger = (AtomicInteger) this.r;
                    try {
                        kb4.X(obj);
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        String str2 = ic0.a;
                        cx.f().c(str2, "Delegated worker " + oc2Var.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = false;
                        }
                        if (ic2Var.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                }
                nc2 nc2Var = (nc2) obj;
                sk4VarG.f(null);
                return nc2Var;
            } catch (Throwable th) {
                sk4VarG.f(null);
                throw th;
            }
        } catch (Throwable th2) {
            String str3 = ic0.a;
            cx.f().c(str3, "Delegated worker " + oc2Var.getClass() + " threw exception in startWork.", th2);
            throw th2;
        }
    }
}
