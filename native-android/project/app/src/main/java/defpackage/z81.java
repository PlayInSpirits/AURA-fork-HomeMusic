package defpackage;

import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 implements q81 {
    public final /* synthetic */ int n = 0;
    public final Object o;
    public final Object p;
    public final sf1 q;

    public z81(q81 q81Var, ne0 ne0Var) {
        this.p = ne0Var;
        this.o = te5.O(ne0Var);
        this.q = new p(q81Var, null, 18);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) throws Throwable {
        y81 y81Var;
        i91 i91Var;
        q81 q81Var;
        z81 z81Var = this;
        Object obj2 = obj;
        int i = z81Var.n;
        j15 j15Var = j15.a;
        xe0 xe0Var = xe0.n;
        sf1 sf1Var = z81Var.q;
        Object obj3 = z81Var.o;
        Object obj4 = z81Var.p;
        switch (i) {
            case 0:
                if (vd0Var instanceof y81) {
                    y81Var = (y81) vd0Var;
                    int i2 = y81Var.r;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        y81Var.r = i2 - Integer.MIN_VALUE;
                    } else {
                        y81Var = new y81(z81Var, vd0Var);
                    }
                } else {
                    y81Var = new y81(z81Var, vd0Var);
                }
                Object objInvoke = y81Var.p;
                int i3 = y81Var.r;
                if (i3 == 0) {
                    kb4.X(objInvoke);
                    if (((fx3) obj4).n) {
                        y81Var.r = 1;
                        if (((q81) obj3).b(obj2, y81Var) != xe0Var) {
                            return j15Var;
                        }
                    } else {
                        y81Var.n = z81Var;
                        y81Var.o = obj2;
                        y81Var.r = 2;
                        objInvoke = ((pv3) sf1Var).invoke(obj2, y81Var);
                        if (objInvoke != xe0Var) {
                        }
                    }
                    return xe0Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        Object obj5 = y81Var.o;
                        z81 z81Var2 = y81Var.n;
                        kb4.X(objInvoke);
                        obj2 = obj5;
                        z81Var = z81Var2;
                    } else if (i3 != 3) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kb4.X(objInvoke);
                return j15Var;
                if (((Boolean) objInvoke).booleanValue()) {
                    return j15Var;
                }
                ((fx3) z81Var.p).n = true;
                q81 q81Var2 = (q81) z81Var.o;
                y81Var.n = null;
                y81Var.o = null;
                y81Var.r = 3;
                if (q81Var2.b(obj2, y81Var) != xe0Var) {
                    return j15Var;
                }
                return xe0Var;
            case 1:
                if (vd0Var instanceof i91) {
                    i91Var = (i91) vd0Var;
                    int i4 = i91Var.o;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        i91Var.o = i4 - Integer.MIN_VALUE;
                    } else {
                        i91Var = new i91(z81Var, vd0Var);
                    }
                } else {
                    i91Var = new i91(z81Var, vd0Var);
                }
                Object obj6 = i91Var.n;
                int i5 = i91Var.o;
                if (i5 == 0) {
                    kb4.X(obj6);
                    q81 q81Var3 = (q81) obj3;
                    i91Var.p = q81Var3;
                    i91Var.o = 1;
                    Object objF = xl.F((WorkDatabase_Impl) obj4, true, (x) sf1Var, i91Var);
                    if (objF != xe0Var) {
                        q81Var = q81Var3;
                        obj6 = objF;
                    }
                    return xe0Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        kb4.X(obj6);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q81Var = i91Var.p;
                kb4.X(obj6);
                i91Var.p = null;
                i91Var.o = 2;
                if (q81Var.b(obj6, i91Var) != xe0Var) {
                    return j15Var;
                }
                return xe0Var;
            default:
                Object objJ0 = ud3.J0((ne0) obj4, obj2, obj3, (p) sf1Var, vd0Var);
                return objJ0 == xe0Var ? objJ0 : j15Var;
        }
    }

    public z81(fx3 fx3Var, q81 q81Var, pv3 pv3Var) {
        this.p = fx3Var;
        this.o = q81Var;
        this.q = pv3Var;
    }

    public z81(q81 q81Var, WorkDatabase_Impl workDatabase_Impl, x xVar) {
        this.o = q81Var;
        this.p = workDatabase_Impl;
        this.q = xVar;
    }
}
