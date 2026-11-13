package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qd5 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public final /* synthetic */ td5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd5(td5 td5Var, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = td5Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        td5 td5Var = this.q;
        switch (i) {
            case 0:
                return new qd5(td5Var, vd0Var, 0);
            default:
                return new qd5(td5Var, vd0Var, 1);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        we0 we0Var = (we0) obj;
        vd0 vd0Var = (vd0) obj2;
        switch (i) {
        }
        return ((qd5) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) {
        Object md5Var;
        int i = this.o;
        xe0 xe0Var = xe0.n;
        td5 td5Var = this.q;
        vd0 vd0Var = null;
        switch (i) {
            case 0:
                int i2 = this.p;
                if (i2 == 0) {
                    kb4.X(obj);
                    this.p = 1;
                    Object a = td5.a(td5Var, this);
                    return a == xe0Var ? xe0Var : a;
                }
                if (i2 == 1) {
                    kb4.X(obj);
                    return obj;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.p;
                try {
                    if (i3 == 0) {
                        kb4.X(obj);
                        t22 t22Var = td5Var.m;
                        qd5 qd5Var = new qd5(td5Var, vd0Var, 0);
                        this.p = 1;
                        obj = fu.P(t22Var, qd5Var, this);
                        if (obj == xe0Var) {
                            return xe0Var;
                        }
                    } else {
                        if (i3 != 1) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kb4.X(obj);
                    }
                    md5Var = (pd5) obj;
                } catch (WorkerStoppedException e) {
                    md5Var = new od5(e.n);
                } catch (CancellationException unused) {
                    md5Var = new md5();
                } catch (Throwable th) {
                    cx.f().e(ud5.a, "Unexpected error in WorkerWrapper", th);
                    md5Var = new md5();
                }
                Object r = td5Var.h.r(new ei0(4, md5Var, td5Var));
                r.getClass();
                return r;
        }
    }
}
