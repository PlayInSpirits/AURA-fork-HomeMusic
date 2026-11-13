package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ho extends cx2 {
    public ot4 B;
    public final /* synthetic */ io C;

    public ho(io ioVar) {
        this.C = ioVar;
    }

    @Override // defpackage.cx2
    public final void i0() {
        io ioVar = this.C;
        ioVar.a = this;
        if (ioVar.b != null) {
            o oVar = new o(1, this, ioVar);
            c72 O = j51.O(this);
            int i = O.o;
            yv3 rectManager = ((ra) h12.L(O)).getRectManager();
            pt4 pt4Var = rectManager.d;
            pt4Var.getClass();
            i03 i03Var = pt4Var.a;
            ot4 ot4Var = new ot4(pt4Var, i, this, oVar);
            Object b = i03Var.b(i);
            if (b == null) {
                i03Var.i(i, ot4Var);
                b = ot4Var;
            }
            ot4 ot4Var2 = (ot4) b;
            if (ot4Var2 != ot4Var) {
                while (true) {
                    ot4 ot4Var3 = ot4Var2.d;
                    if (ot4Var3 == null) {
                        break;
                    } else {
                        ot4Var2 = ot4Var3;
                    }
                }
                ot4Var2.d = ot4Var;
            }
            c72 O2 = j51.O(this.n);
            if (yv3.d(O2)) {
                ue1 ue1Var = rectManager.c;
                int e = rectManager.e(O2);
                long[] jArr = (long[]) ue1Var.p;
                int i2 = e + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.k();
            this.B = ot4Var;
        }
    }

    @Override // defpackage.cx2
    public final void j0() {
        io ioVar = this.C;
        if (ioVar.a == this) {
            ioVar.a = null;
        }
        ot4 ot4Var = this.B;
        if (ot4Var != null) {
            ot4Var.b();
        }
        this.B = null;
    }
}
