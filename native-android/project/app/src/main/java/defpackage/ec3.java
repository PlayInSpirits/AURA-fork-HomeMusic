package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 implements fv {
    public final lm0 b;
    public final fv c;
    public final r62 d;

    public ec3(lm0 lm0Var, fv fvVar, r62 r62Var) {
        this.b = lm0Var;
        this.c = fvVar;
        this.d = r62Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // defpackage.fv
    public final float a(float f, float f2, float f3) {
        int iP;
        int iP2;
        int iP3;
        lm0 lm0Var = this.b;
        zd3 zd3Var = lm0Var.E;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            int i = n85.a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        r62 r62Var = r62.o;
        hb3 hb3Var = hb3.o;
        r62 r62Var2 = this.d;
        if (fAbs != 0.0f && z) {
            if (r62Var2 == r62Var && lm0Var.m().e == hb3Var) {
                iP3 = lm0Var.p() + (-lm0Var.f);
            } else {
                iP3 = lm0Var.f;
            }
            float fP = iP3 * (-1.0f);
            while (fA > 0.0f && fP < fA) {
                fP += lm0Var.p();
            }
            while (fA < 0.0f && fP > fA) {
                fP -= lm0Var.p();
            }
            return fP;
        }
        if (Math.abs(lm0Var.f) < 1.0E-6d) {
            return 0.0f;
        }
        if (r62Var2 == r62Var && lm0Var.m().e == hb3Var) {
            iP = lm0Var.p() + (-lm0Var.f);
        } else {
            iP = lm0Var.f;
        }
        float f5 = iP * (-1.0f);
        if (r62Var2 == r62Var && lm0Var.m().e == hb3Var) {
            if (!((Boolean) zd3Var.getValue()).booleanValue()) {
                iP2 = lm0Var.p();
                f5 += iP2;
            }
        } else if (((Boolean) zd3Var.getValue()).booleanValue()) {
            iP2 = lm0Var.p();
            f5 += iP2;
        }
        return gb.l(f5, -f3, f3);
    }
}
