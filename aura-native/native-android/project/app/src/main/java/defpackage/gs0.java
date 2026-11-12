package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 implements q81 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ q81 o;
    public final /* synthetic */ jx3 p;

    public gs0(hs0 hs0Var, jx3 jx3Var, q81 q81Var) {
        this.p = jx3Var;
        this.o = q81Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q81
    public final Object b(Object obj, vd0 vd0Var) {
        fs0 fs0Var;
        v81 v81Var;
        int i = this.n;
        Object obj2 = j15.a;
        q81 q81Var = this.o;
        xe0 xe0Var = xe0.n;
        switch (i) {
            case 0:
                if (vd0Var instanceof fs0) {
                    fs0Var = (fs0) vd0Var;
                    int i2 = fs0Var.p;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fs0Var.p = i2 - Integer.MIN_VALUE;
                    } else {
                        fs0Var = new fs0(this, vd0Var);
                    }
                } else {
                    fs0Var = new fs0(this, vd0Var);
                }
                Object obj3 = fs0Var.n;
                int i3 = fs0Var.p;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kb4.X(obj3);
                        return obj2;
                    }
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj3);
                jx3 jx3Var = this.p;
                Object obj4 = jx3Var.n;
                if (obj4 != xl.e && h12.c(obj4, obj)) {
                    return obj2;
                }
                jx3Var.n = obj;
                fs0Var.p = 1;
                return q81Var.b(obj, fs0Var) == xe0Var ? xe0Var : obj2;
            default:
                if (vd0Var instanceof v81) {
                    v81Var = (v81) vd0Var;
                    int i4 = v81Var.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        v81Var.q = i4 - Integer.MIN_VALUE;
                    } else {
                        v81Var = new v81(this, vd0Var);
                    }
                } else {
                    v81Var = new v81(this, vd0Var);
                }
                Object obj5 = v81Var.o;
                int i5 = v81Var.q;
                try {
                    if (i5 == 0) {
                        kb4.X(obj5);
                        v81Var.n = this;
                        v81Var.q = 1;
                        Object objB = q81Var.b(obj, v81Var);
                        this = objB;
                        if (objB == xe0Var) {
                            obj2 = xe0Var;
                            this = objB;
                        }
                    } else {
                        if (i5 != 1) {
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gs0 gs0Var = v81Var.n;
                        kb4.X(obj5);
                        this = gs0Var;
                    }
                    return obj2;
                } catch (Throwable th) {
                    this.p.n = th;
                    throw th;
                }
        }
    }

    public gs0(q81 q81Var, jx3 jx3Var) {
        this.o = q81Var;
        this.p = jx3Var;
    }
}
