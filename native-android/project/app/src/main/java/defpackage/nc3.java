package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc3 {
    public final lm0 a;
    public final lc3 b;
    public final ue1 c;

    public nc3(lm0 lm0Var, lc3 lc3Var, ue1 ue1Var) {
        this.a = lm0Var;
        this.b = lc3Var;
        this.c = ue1Var;
    }

    public final void a(final int i, Object obj, rg1 rg1Var, int i2) {
        int i3;
        Object obj2;
        rg1 rg1Var2;
        rg1Var.S(-1201380429);
        int i4 = (rg1Var.d(i) ? 4 : 2) | i2 | (rg1Var.g(obj) ? 32 : 16) | (rg1Var.e(this) ? 256 : 128);
        if (rg1Var.K(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            rg1Var2 = rg1Var;
            jz4.b(obj2, i3, this.a.z, fh0.w(1142237095, new wf1() { // from class: mc3
                @Override // defpackage.wf1
                public final Object invoke(Object obj3, Object obj4) {
                    rg1 rg1Var3 = (rg1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (rg1Var3.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ue1 ue1Var = this.n.b.a;
                        int i5 = i;
                        f12 f12VarJ = ue1Var.j(i5);
                        ((yf1) f12VarJ.c.o).d(rc3.a, Integer.valueOf(i5 - f12VarJ.a), rg1Var3, 0);
                    } else {
                        rg1Var3.N();
                    }
                    return j15.a;
                }
            }, rg1Var), rg1Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            rg1Var2 = rg1Var;
            rg1Var2.N();
        }
        lv3 lv3VarP = rg1Var2.p();
        if (lv3VarP != null) {
            lv3VarP.d = new d82(this, i3, obj2, i2);
        }
    }

    public final int b() {
        lc3 lc3Var = this.b;
        lc3Var.getClass();
        return lc3Var.a.o;
    }

    public final Object c(int i) {
        Object objInvoke;
        ue1 ue1Var = this.c;
        Object[] objArr = (Object[]) ue1Var.q;
        int i2 = i - ue1Var.o;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        lc3 lc3Var = this.b;
        lc3Var.getClass();
        f12 f12VarJ = lc3Var.a.j(i);
        int i3 = i - f12VarJ.a;
        if1 if1Var = (if1) f12VarJ.c.n;
        return (if1Var == null || (objInvoke = if1Var.invoke(Integer.valueOf(i3))) == null) ? new ql0(i) : objInvoke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc3)) {
            return false;
        }
        return h12.c(this.b, ((nc3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
