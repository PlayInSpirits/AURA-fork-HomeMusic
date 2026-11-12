package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ac0;
import defpackage.bc0;
import defpackage.bf0;
import defpackage.c52;
import defpackage.cc0;
import defpackage.cx;
import defpackage.dc0;
import defpackage.dd5;
import defpackage.fd5;
import defpackage.fu;
import defpackage.fz0;
import defpackage.ic0;
import defpackage.kb4;
import defpackage.kc2;
import defpackage.kf2;
import defpackage.lc2;
import defpackage.nc2;
import defpackage.oc2;
import defpackage.oh0;
import defpackage.pe0;
import defpackage.sc5;
import defpackage.te5;
import defpackage.vc5;
import defpackage.wd0;
import defpackage.x70;
import defpackage.xe0;
import defpackage.z40;
import defpackage.zb0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, oc2 oc2Var, c52 c52Var, dd5 dd5Var, wd0 wd0Var) {
        bc0 bc0Var;
        constraintTrackingWorker.getClass();
        if (wd0Var instanceof bc0) {
            bc0Var = (bc0) wd0Var;
            int i = bc0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc0Var.p = i - Integer.MIN_VALUE;
            } else {
                bc0Var = new bc0(constraintTrackingWorker, wd0Var);
            }
        } else {
            bc0Var = new bc0(constraintTrackingWorker, wd0Var);
        }
        Object objJ = bc0Var.n;
        int i2 = bc0Var.p;
        if (i2 == 0) {
            kb4.X(objJ);
            cc0 cc0Var = new cc0(oc2Var, c52Var, dd5Var, null);
            bc0Var.p = 1;
            objJ = te5.j(cc0Var, bc0Var);
            xe0 xe0Var = xe0.n;
            if (objJ == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(objJ);
        }
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public static final Object f(ConstraintTrackingWorker constraintTrackingWorker, wd0 wd0Var) {
        dc0 dc0Var;
        oc2 oc2Var;
        int i;
        ConstraintTrackingWorker constraintTrackingWorker2 = constraintTrackingWorker;
        WorkerParameters workerParameters = constraintTrackingWorker2.g;
        Context context = constraintTrackingWorker2.a;
        WorkerParameters workerParameters2 = constraintTrackingWorker2.b;
        if (wd0Var instanceof dc0) {
            dc0Var = (dc0) wd0Var;
            int i2 = dc0Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dc0Var.r = i2 - Integer.MIN_VALUE;
            } else {
                dc0Var = new dc0(constraintTrackingWorker2, wd0Var);
            }
        } else {
            dc0Var = new dc0(constraintTrackingWorker2, wd0Var);
        }
        dc0 dc0Var2 = dc0Var;
        Object objP = dc0Var2.p;
        int i3 = dc0Var2.r;
        if (i3 != 0) {
            if (i3 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oc2 oc2Var2 = dc0Var2.o;
            ConstraintTrackingWorker constraintTrackingWorker3 = dc0Var2.n;
            try {
                kb4.X(objP);
                oc2Var = oc2Var2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                return (nc2) objP;
            } catch (CancellationException e) {
                e = e;
                oc2Var = oc2Var2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                if (constraintTrackingWorker2.b()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.b()) {
                        i = constraintTrackingWorker2.c.get();
                    } else {
                        if (!(e instanceof zb0)) {
                            kf2.o("Unreachable");
                            return null;
                        }
                        i = ((zb0) e).n;
                    }
                    oc2Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.b()) {
                        i = constraintTrackingWorker2.c.get();
                    } else {
                        if (!(e instanceof zb0)) {
                            kf2.o("Unreachable");
                            return null;
                        }
                        i = ((zb0) e).n;
                    }
                    oc2Var.c.compareAndSet(-256, i);
                }
                if (e instanceof zb0) {
                    return new lc2();
                }
                throw e;
            }
        }
        kb4.X(objP);
        oh0 oh0Var = workerParameters2.b;
        oh0Var.getClass();
        Object obj = oh0Var.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            cx.f().d(ic0.a, "No worker to delegate to.");
            return new kc2();
        }
        sc5 sc5VarB = sc5.b(context);
        fd5 fd5VarA = sc5VarB.c.A();
        String string = workerParameters2.a.toString();
        string.getClass();
        dd5 dd5VarH = fd5VarA.h(string);
        if (dd5VarH == null) {
            return new kc2();
        }
        z40 z40Var = sc5VarB.j;
        z40Var.getClass();
        c52 c52Var = new c52(z40Var);
        if (!c52Var.c(dd5VarH)) {
            String str2 = ic0.a;
            cx.f().b(str2, "Constraints not met for delegate " + str + ". Requesting retry.");
            return new lc2();
        }
        cx.f().b(ic0.a, "Constraints met for delegate ".concat(str));
        try {
            fz0 fz0Var = workerParameters2.f;
            context.getClass();
            oc2 oc2VarG = fz0Var.g(context, str, workerParameters);
            vc5 vc5Var = (vc5) workerParameters.e.q;
            vc5Var.getClass();
            try {
                pe0 pe0VarW = kb4.w(vc5Var);
                oc2Var = oc2VarG;
                try {
                    x70 x70Var = new x70(constraintTrackingWorker2, oc2Var, c52Var, dd5VarH, null, 2);
                    dc0Var2.n = constraintTrackingWorker2;
                    dc0Var2.o = oc2Var;
                    dc0Var2.r = 1;
                    objP = fu.P(pe0VarW, x70Var, dc0Var2);
                    xe0 xe0Var = xe0.n;
                    if (objP == xe0Var) {
                        return xe0Var;
                    }
                    return (nc2) objP;
                } catch (CancellationException e2) {
                    e = e2;
                    if (constraintTrackingWorker2.b() || (e instanceof zb0)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            i = -512;
                        } else if (constraintTrackingWorker2.b()) {
                            i = constraintTrackingWorker2.c.get();
                        } else {
                            if (!(e instanceof zb0)) {
                                kf2.o("Unreachable");
                                return null;
                            }
                            i = ((zb0) e).n;
                        }
                        oc2Var.c.compareAndSet(-256, i);
                    }
                    if (e instanceof zb0) {
                        return new lc2();
                    }
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
                oc2Var = oc2VarG;
                if (constraintTrackingWorker2.b()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.b()) {
                        i = constraintTrackingWorker2.c.get();
                    } else {
                        if (!(e instanceof zb0)) {
                            kf2.o("Unreachable");
                            return null;
                        }
                        i = ((zb0) e).n;
                    }
                    oc2Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (constraintTrackingWorker2.b()) {
                        i = constraintTrackingWorker2.c.get();
                    } else {
                        if (!(e instanceof zb0)) {
                            kf2.o("Unreachable");
                            return null;
                        }
                        i = ((zb0) e).n;
                    }
                    oc2Var.c.compareAndSet(-256, i);
                }
                if (e instanceof zb0) {
                    return new lc2();
                }
                throw e;
            }
        } catch (Throwable unused) {
            cx.f().b(ic0.a, "No worker to delegate to.");
            sc5VarB.b.getClass();
            return new kc2();
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d(bf0 bf0Var) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return fu.P(kb4.w(executorService), new ac0(this, null, 0), bf0Var);
    }
}
