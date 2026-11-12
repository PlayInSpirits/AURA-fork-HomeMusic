package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ gx3 p;
    public final /* synthetic */ q64 q;
    public final /* synthetic */ if1 r;

    public /* synthetic */ xg4(float f, gx3 gx3Var, q64 q64Var, if1 if1Var, int i) {
        this.n = i;
        this.o = f;
        this.p = gx3Var;
        this.q = q64Var;
        this.r = if1Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        float fA;
        int i = this.n;
        j15 j15Var = j15.a;
        if1 if1Var = this.r;
        q64 q64Var = this.q;
        gx3 gx3Var = this.p;
        float f = this.o;
        vd vdVar = (vd) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) vdVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                zd3 zd3Var = vdVar.e;
                if (fAbs < fAbs2) {
                    su3.g(vdVar, q64Var, if1Var, ((Number) zd3Var.getValue()).floatValue() - gx3Var.n);
                    gx3Var.n = ((Number) zd3Var.getValue()).floatValue();
                } else {
                    float fM = su3.m(((Number) zd3Var.getValue()).floatValue(), f);
                    su3.g(vdVar, q64Var, if1Var, fM - gx3Var.n);
                    vdVar.a();
                    gx3Var.n = fM;
                }
                break;
            default:
                float fM2 = su3.m(((Number) vdVar.e.getValue()).floatValue(), f);
                float f2 = fM2 - gx3Var.n;
                try {
                    fA = q64Var.a(f2);
                } catch (CancellationException unused) {
                    vdVar.a();
                    fA = 0.0f;
                }
                if1Var.invoke(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fM2 != ((Number) vdVar.e.getValue()).floatValue()) {
                    vdVar.a();
                }
                gx3Var.n += fA;
                break;
        }
        return j15Var;
    }
}
