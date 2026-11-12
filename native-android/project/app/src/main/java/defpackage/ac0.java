package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac0(Object obj, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = obj;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = 2;
        switch (this.o) {
            case 0:
                return new ac0((ConstraintTrackingWorker) this.q, vd0Var, 0);
            case 1:
                return new ac0((ck0) this.q, vd0Var, 1);
            case 2:
                return new ac0((x81) this.q, vd0Var, i);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new ac0((ea1) this.q, vd0Var, 3);
            case 4:
                return new ac0((hy2) this.q, vd0Var, 4);
            case 5:
                ac0 ac0Var = new ac0(i, vd0Var);
                ac0Var.q = obj;
                return ac0Var;
            case 6:
                return new ac0((x60) this.q, vd0Var, 6);
            case 7:
                return new ac0((ip4) this.q, vd0Var, 7);
            default:
                return new ac0((jy4) this.q, vd0Var, 8);
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
                break;
            case 1:
                break;
            case 2:
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((ac0) create(we0Var, vd0Var)).invokeSuspend(j15Var);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object obj) throws Throwable {
        we0 we0Var;
        int i = this.o;
        int i2 = 15;
        j15 j15Var = j15.a;
        xe0 xe0Var = xe0.n;
        vd0 vd0Var = null;
        switch (i) {
            case 0:
                int i3 = this.p;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.q;
                this.p = 1;
                Object objF = ConstraintTrackingWorker.f(constraintTrackingWorker, this);
                return objF == xe0Var ? xe0Var : objF;
            case 1:
                int i4 = this.p;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                hx3 hx3Var = new hx3();
                hx3 hx3Var2 = new hx3();
                hx3 hx3Var3 = new hx3();
                ck0 ck0Var = (ck0) this.q;
                cd4 cd4Var = (cd4) ck0Var.B.o;
                e10 e10Var = new e10(hx3Var, hx3Var2, hx3Var3, ck0Var, 1);
                this.p = 1;
                cd4Var.getClass();
                cd4.k(cd4Var, e10Var, this);
                return xe0Var;
            case 2:
                int i5 = this.p;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kb4.X(obj);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                x81 x81Var = (x81) this.q;
                this.p = 1;
                Object objA = x81Var.a(n63.n, this);
                if (objA != xe0Var) {
                    objA = j15Var;
                }
                return objA == xe0Var ? xe0Var : j15Var;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int i6 = this.p;
                if (i6 == 0) {
                    kb4.X(obj);
                    ea1 ea1Var = (ea1) this.q;
                    this.p = 1;
                    return xl.h(ea1Var, null, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i6 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i7 = this.p;
                if (i7 != 0) {
                    if (i7 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                aw awVar = ((hy2) this.q).g;
                this.p = 1;
                Object objJ = te5.j(new p(awVar, vd0Var, i2), this);
                return objJ == xe0Var ? xe0Var : objJ;
            case 5:
                int i8 = this.p;
                if (i8 == 0) {
                    kb4.X(obj);
                    we0Var = (we0) this.q;
                } else {
                    if (i8 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    we0Var = (we0) this.q;
                    kb4.X(obj);
                }
                while (gb.L(we0Var.e())) {
                    k52 k52Var = new k52(15);
                    this.q = we0Var;
                    this.p = 1;
                    if (vr1.x(getContext()).a(k52Var, this) == xe0Var) {
                        return xe0Var;
                    }
                }
                return j15Var;
            case 6:
                int i9 = this.p;
                if (i9 != 0) {
                    if (i9 == 1) {
                        kb4.X(obj);
                        return obj;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
                x60 x60Var = (x60) this.q;
                this.p = 1;
                Object objJ0 = x60Var.j0(this);
                return objJ0 == xe0Var ? xe0Var : objJ0;
            case 7:
                ip4 ip4Var = (ip4) this.q;
                int i10 = this.p;
                if (i10 == 0) {
                    kb4.X(obj);
                    PointerInputEventHandler pointerInputEventHandler = ip4Var.D;
                    this.p = 2;
                    return pointerInputEventHandler.invoke(ip4Var, this) == xe0Var ? xe0Var : j15Var;
                }
                if (i10 == 1 || i10 == 2) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i11 = this.p;
                if (i11 == 0) {
                    kb4.X(obj);
                    jy4 jy4Var = (jy4) this.q;
                    this.p = 1;
                    return jy4Var.f(this) == xe0Var ? xe0Var : j15Var;
                }
                if (i11 == 1) {
                    kb4.X(obj);
                    return j15Var;
                }
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac0(int i, vd0 vd0Var) {
        super(i, vd0Var);
        this.o = 5;
    }
}
