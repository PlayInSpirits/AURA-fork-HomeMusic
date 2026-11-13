package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        float f;
        int i = this.n;
        j15 j15Var = j15.a;
        if1 if1Var = this.r;
        q64 q64Var = this.q;
        gx3 gx3Var = this.p;
        float f2 = this.o;
        vd vdVar = (vd) obj;
        switch (i) {
            case 0:
                float abs = Math.abs(((Number) vdVar.e.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                zd3 zd3Var = vdVar.e;
                if (abs < abs2) {
                    su3.g(vdVar, q64Var, if1Var, ((Number) zd3Var.getValue()).floatValue() - gx3Var.n);
                    gx3Var.n = ((Number) zd3Var.getValue()).floatValue();
                    break;
                } else {
                    float m = su3.m(((Number) zd3Var.getValue()).floatValue(), f2);
                    su3.g(vdVar, q64Var, if1Var, m - gx3Var.n);
                    vdVar.a();
                    gx3Var.n = m;
                    break;
                }
            default:
                float m2 = su3.m(((Number) vdVar.e.getValue()).floatValue(), f2);
                float f3 = m2 - gx3Var.n;
                try {
                    f = q64Var.a(f3);
                } catch (CancellationException unused) {
                    vdVar.a();
                    f = 0.0f;
                }
                if1Var.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || m2 != ((Number) vdVar.e.getValue()).floatValue()) {
                    vdVar.a();
                }
                gx3Var.n += f;
                break;
        }
        return j15Var;
    }
}
