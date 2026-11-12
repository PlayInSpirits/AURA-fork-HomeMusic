package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ad3 o;

    public /* synthetic */ uc3(ad3 ad3Var, int i) {
        this.n = i;
        this.o = ad3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        qc3 qc3Var;
        int i = this.n;
        j15 j15Var = j15.a;
        qc3 qc3Var2 = null;
        ad3 ad3Var = this.o;
        switch (i) {
            case 0:
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                long jT = e35.t(ad3Var);
                float f = ad3Var.i + fFloatValue;
                long jM = ji2.M(f);
                ad3Var.i = f - jM;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jT + jM;
                    long jN = gb.n(j, ad3Var.h, ad3Var.g);
                    boolean z = j != jN;
                    long j2 = jN - jT;
                    float f2 = j2;
                    ad3Var.j = f2;
                    if (Math.abs(j2) != 0) {
                        ad3Var.E.setValue(Boolean.valueOf(f2 > 0.0f));
                        ad3Var.F.setValue(Boolean.valueOf(f2 < 0.0f));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    qc3 qc3VarH = ((qc3) ad3Var.m.getValue()).h(i3);
                    if (qc3VarH == null || (qc3Var = ad3Var.b) == null) {
                        qc3Var2 = qc3VarH;
                    } else {
                        qc3 qc3VarH2 = qc3Var.h(i3);
                        if (qc3VarH2 != null) {
                            ad3Var.b = qc3VarH2;
                            qc3Var2 = qc3VarH;
                        }
                    }
                    if (qc3Var2 != null) {
                        ad3Var.h(qc3Var2, ad3Var.a, true);
                        ad3Var.A.setValue(j15Var);
                    } else {
                        nq nqVar = ad3Var.d;
                        ad3 ad3Var2 = (ad3) nqVar.o;
                        vd3 vd3Var = (vd3) nqVar.q;
                        vd3Var.h(vd3Var.g() + (ad3Var2.p() != 0 ? i2 / ad3Var2.p() : 0.0f));
                        c72 c72Var = (c72) ad3Var.x.getValue();
                        if (c72Var != null) {
                            c72Var.l();
                        }
                    }
                    if (z) {
                        ValueOf = Long.valueOf(j2);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            default:
                o82 o82Var = (o82) obj;
                ch4 ch4VarT = ya4.t();
                if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
                ch4 ch4VarZ = ya4.z(ch4VarT);
                try {
                    int i4 = ad3Var.e;
                    q82 q82Var = o82Var.b;
                    ll llVar = q82Var.c;
                    if (llVar != null) {
                        o82Var.a.add(new vp3(llVar, i4, q82Var.b, null));
                        break;
                    }
                    return j15Var;
                } finally {
                    ya4.H(ch4VarT, ch4VarZ, if1VarE);
                }
        }
    }
}
