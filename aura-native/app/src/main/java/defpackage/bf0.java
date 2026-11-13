package defpackage;

import androidx.work.CoroutineWorker;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bf0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ CoroutineWorker q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf0(CoroutineWorker coroutineWorker, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = coroutineWorker;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        CoroutineWorker coroutineWorker = this.q;
        switch (i) {
            case 0:
                return new bf0(coroutineWorker, vd0Var, 0);
            default:
                return new bf0(coroutineWorker, vd0Var, 1);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
            case 0:
                ((bf0) create(we0Var, vd0Var)).invokeSuspend(j15Var);
                return j15Var;
            default:
                return ((bf0) create(we0Var, vd0Var)).invokeSuspend(j15Var);
        }
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        switch (this.o) {
            case 0:
                int i = this.p;
                if (i == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    kf2.o("Not implemented");
                } else {
                    if (i == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.p;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                this.p = 1;
                Object d = this.q.d(this);
                xe0 xe0Var = xe0.n;
                return d == xe0Var ? xe0Var : d;
        }
    }
}
