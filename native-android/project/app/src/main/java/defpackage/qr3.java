package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qr3 {
    public final c92 a;

    public qr3(gf1 gf1Var) {
        this.a = new c92(gf1Var);
    }

    public abstract rr3 a(Object obj);

    public j35 b() {
        return this.a;
    }

    public final rr3 c(if1 if1Var) {
        return new rr3(this, null, false, null, if1Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[PHI: r7
  0x0034: PHI (r7v2 java.lang.Object) = (r7v6 java.lang.Object), (r7v7 java.lang.Object) binds: [B:18:0x003e, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final j35 d(rr3 rr3Var, j35 j35Var) {
        m90 m90Var;
        Object obj;
        xl4 xl4Var;
        if1 if1Var = rr3Var.d;
        Object obj2 = rr3Var.f;
        boolean z = rr3Var.e;
        ny0 ny0Var = 0;
        ny0Var = 0;
        ny0Var = 0;
        ny0Var = 0;
        ny0Var = 0;
        ny0Var = 0;
        if (j35Var instanceof ny0) {
            if (z) {
                ny0Var = (ny0) j35Var;
                ny0Var.a.setValue(rr3Var.a());
            }
        } else if (j35Var instanceof xl4) {
            if ((rr3Var.b || obj2 != null) && !z) {
                xl4Var = (xl4) j35Var;
                if (h12.c(rr3Var.a(), xl4Var.a)) {
                    obj = m90Var;
                    obj = xl4Var;
                    ny0Var = obj;
                }
            }
        } else if (j35Var instanceof m90) {
            m90Var = (m90) j35Var;
            if (if1Var == m90Var.a) {
                obj = m90Var;
                obj = xl4Var;
                ny0Var = obj;
            }
        }
        if (ny0Var != 0) {
            return ny0Var;
        }
        if (!z) {
            return if1Var != null ? new m90(if1Var) : new xl4(rr3Var.a());
        }
        rv2 rv2Var = rr3Var.c;
        if (rv2Var == null) {
            rv2Var = rv2.D;
        }
        return new ny0(new zd3(obj2, rv2Var));
    }
}
