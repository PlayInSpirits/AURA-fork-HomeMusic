package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ fc0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        ec0 ec0Var;
        int i = this.n;
        j15 j15Var = j15.a;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                if (vd0Var instanceof ec0) {
                    ec0Var = (ec0) vd0Var;
                    int i2 = ec0Var.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ec0Var.o = i2 - Integer.MIN_VALUE;
                    } else {
                        ec0Var = new ec0(this, vd0Var);
                    }
                } else {
                    ec0Var = new ec0(this, vd0Var);
                }
                Object obj3 = ec0Var.n;
                int i3 = ec0Var.o;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kb4.X(obj3);
                        return j15Var;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj3);
                q81 q81Var = (q81) obj2;
                if (!(obj instanceof sc0)) {
                    return j15Var;
                }
                ec0Var.o = 1;
                Object objB = q81Var.b(obj, ec0Var);
                xe0 xe0Var = xe0.n;
                return objB == xe0Var ? xe0Var : j15Var;
            case 1:
                ((jx3) obj2).n = obj;
                throw new AbortFlowException(this);
            default:
                ((rx2) obj2).p.h(((Number) obj).floatValue());
                return j15Var;
        }
    }
}
