package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cv extends cx2 implements zu, o62 {
    public gd0 B;
    public boolean C;

    public static final wv3 q0(cv cvVar, f63 f63Var, fa faVar) {
        wv3 wv3Var;
        if (cvVar.A && cvVar.C) {
            f63 f63VarN = j51.N(cvVar);
            if (!f63Var.A0().A) {
                f63Var = null;
            }
            if (f63Var != null && (wv3Var = (wv3) faVar.invoke()) != null) {
                wv3 wv3VarC = f63VarN.C(f63Var, false);
                return wv3Var.f((((long) Float.floatToRawIntBits(wv3VarC.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(wv3VarC.a)) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.o62
    public final void e(q62 q62Var) {
        this.C = true;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.zu
    public final Object k(f63 f63Var, fa faVar, ep4 ep4Var) {
        Object objJ = te5.j(new bv(this, f63Var, faVar, new jo(this, f63Var, faVar, 1), null), ep4Var);
        return objJ == xe0.n ? objJ : j15.a;
    }
}
