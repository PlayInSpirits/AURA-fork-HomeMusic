package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 extends ep4 implements wf1 {
    public int o;
    public final /* synthetic */ p81[] p;
    public final /* synthetic */ int q;
    public final /* synthetic */ AtomicInteger r;
    public final /* synthetic */ aw s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(p81[] p81VarArr, int i, AtomicInteger atomicInteger, aw awVar, vd0 vd0Var) {
        super(2, vd0Var);
        this.p = p81VarArr;
        this.q = i;
        this.r = atomicInteger;
        this.s = awVar;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new b60(this.p, this.q, this.r, this.s, vd0Var);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((b60) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        int i = this.o;
        AtomicInteger atomicInteger = this.r;
        aw awVar = this.s;
        try {
            if (i == 0) {
                kb4.X(obj);
                p81[] p81VarArr = this.p;
                int i2 = this.q;
                p81 p81Var = p81VarArr[i2];
                a60 a60Var = new a60(awVar, i2);
                this.o = 1;
                Object objA = p81Var.a(a60Var, this);
                xe0 xe0Var = xe0.n;
                if (objA == xe0Var) {
                    return xe0Var;
                }
            } else {
                if (i != 1) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                awVar.j(null);
            }
            return j15.a;
        } catch (Throwable th) {
            if (atomicInteger.decrementAndGet() == 0) {
                awVar.j(null);
            }
            throw th;
        }
    }
}
