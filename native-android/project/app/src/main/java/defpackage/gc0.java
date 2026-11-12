package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements p81 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ gc0(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Override // defpackage.p81
    public final Object a(q81 q81Var, vd0 vd0Var) {
        e0 e0Var;
        a44 a44Var;
        Throwable th;
        int i = this.n;
        xe0 xe0Var = xe0.n;
        Object obj = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                Object objA = ((x81) obj).a(new fc0(0, q81Var), vd0Var);
                return objA == xe0Var ? objA : j15Var;
            case 1:
                if (vd0Var instanceof e0) {
                    e0Var = (e0) vd0Var;
                    int i2 = e0Var.q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        e0Var.q = i2 - Integer.MIN_VALUE;
                    } else {
                        e0Var = new e0(this, vd0Var);
                    }
                } else {
                    e0Var = new e0(this, vd0Var);
                }
                Object obj2 = e0Var.o;
                int i3 = e0Var.q;
                if (i3 != 0) {
                    if (i3 != 1) {
                        kf2.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a44Var = e0Var.n;
                    try {
                        kb4.X(obj2);
                        a44Var.releaseIntercepted();
                        return j15Var;
                    } catch (Throwable th2) {
                        th = th2;
                        a44Var.releaseIntercepted();
                        throw th;
                    }
                }
                kb4.X(obj2);
                a44 a44Var2 = new a44(q81Var, e0Var.getContext());
                try {
                    e0Var.n = a44Var2;
                    e0Var.q = 1;
                    Object objInvoke = ((wf1) obj).invoke(a44Var2, e0Var);
                    if (objInvoke != xe0Var) {
                        objInvoke = j15Var;
                    }
                    if (objInvoke == xe0Var) {
                        return xe0Var;
                    }
                    a44Var = a44Var2;
                    a44Var.releaseIntercepted();
                    return j15Var;
                } catch (Throwable th3) {
                    a44Var = a44Var2;
                    th = th3;
                    a44Var.releaseIntercepted();
                    throw th;
                }
            default:
                p81[] p81VarArr = (p81[]) obj;
                c60 c60Var = new c60(p81VarArr, new zf0(8, p81VarArr), new kc5(3, null), q81Var, null);
                s81 s81Var = new s81(vd0Var, vd0Var.getContext());
                Object objO = h12.O(s81Var, s81Var, c60Var);
                if (objO != xe0Var) {
                    objO = j15Var;
                }
                return objO == xe0Var ? objO : j15Var;
        }
    }
}
