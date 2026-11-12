package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ lv0(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        c91 c91Var;
        g91 g91Var;
        Object obj2;
        q81 q81Var;
        int i = this.n;
        xe0 xe0Var = xe0.n;
        Object obj3 = this.p;
        j15 j15Var = j15.a;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                q02 q02Var = (q02) obj;
                ArrayList arrayList = (ArrayList) obj4;
                if (q02Var instanceof jv0) {
                    arrayList.add(q02Var);
                } else if (q02Var instanceof kv0) {
                    arrayList.remove(((kv0) q02Var).a);
                } else if (q02Var instanceof iv0) {
                    arrayList.remove(((iv0) q02Var).a);
                }
                ((b13) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return j15Var;
            case 1:
                if (vd0Var instanceof c91) {
                    c91Var = (c91) vd0Var;
                    int i2 = c91Var.p;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c91Var.p = i2 - Integer.MIN_VALUE;
                    } else {
                        c91Var = new c91(this, vd0Var);
                    }
                } else {
                    c91Var = new c91(this, vd0Var);
                }
                Object objInvoke = c91Var.o;
                int i3 = c91Var.p;
                if (i3 == 0) {
                    kb4.X(objInvoke);
                    c91Var.n = this;
                    c91Var.r = obj;
                    c91Var.p = 1;
                    objInvoke = ((wf1) obj4).invoke(obj, c91Var);
                    if (objInvoke == xe0Var) {
                        return xe0Var;
                    }
                } else {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c91Var.r;
                    this = c91Var.n;
                    kb4.X(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return j15Var;
                }
                ((jx3) this.p).n = obj;
                throw new AbortFlowException(this);
            case 2:
                if (vd0Var instanceof g91) {
                    g91Var = (g91) vd0Var;
                    int i4 = g91Var.o;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        g91Var.o = i4 - Integer.MIN_VALUE;
                    } else {
                        g91Var = new g91(this, vd0Var);
                    }
                } else {
                    g91Var = new g91(this, vd0Var);
                }
                Object obj5 = g91Var.n;
                int i5 = g91Var.o;
                if (i5 != 0) {
                    if (i5 == 1) {
                        q81Var = g91Var.r;
                        obj2 = g91Var.q;
                        kb4.X(obj5);
                    } else {
                        if (i5 != 2) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kb4.X(obj5);
                    }
                    return j15Var;
                }
                kb4.X(obj5);
                q81 q81Var2 = (q81) obj4;
                g91Var.q = obj;
                g91Var.r = q81Var2;
                g91Var.o = 1;
                if (((wf1) obj3).invoke(obj, g91Var) == xe0Var) {
                    return xe0Var;
                }
                obj2 = obj;
                q81Var = q81Var2;
                g91Var.q = null;
                g91Var.r = null;
                g91Var.o = 2;
                if (q81Var.b(obj2, g91Var) == xe0Var) {
                    return xe0Var;
                }
                return j15Var;
            default:
                ((c93) obj4).a((dd5) obj3, (tc0) obj);
                return j15Var;
        }
    }
}
