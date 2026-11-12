package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 extends i35 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = x40.g;
    public List f;
    public boolean g;
    public nc h;
    public if1 i;
    public final x j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public gk1() {
        int i = c45.a;
        this.f = u01.n;
        this.g = true;
        this.j = new x(15, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.i35
    public final void a(sv0 sv0Var) {
        if (this.s) {
            float[] fArrH = this.b;
            if (fArrH == null) {
                fArrH = ya4.h();
                this.b = fArrH;
            } else {
                ya4.G(fArrH);
            }
            ya4.N(fArrH, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrH.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrH[0];
                float f3 = fArrH[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrH[1];
                float f8 = fArrH[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrH[2];
                float f12 = fArrH[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrH[3];
                float f16 = fArrH[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrH[0] = f4;
                fArrH[1] = f9;
                fArrH[2] = f13;
                fArrH[3] = f17;
                fArrH[4] = f6;
                fArrH[5] = f10;
                fArrH[6] = f14;
                fArrH[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrH.length >= 16) {
                fArrH[0] = fArrH[0] * f18;
                fArrH[1] = fArrH[1] * f18;
                fArrH[2] = fArrH[2] * f18;
                fArrH[3] = fArrH[3] * f18;
                fArrH[4] = fArrH[4] * f19;
                fArrH[5] = fArrH[5] * f19;
                fArrH[6] = fArrH[6] * f19;
                fArrH[7] = fArrH[7] * f19;
                fArrH[8] = fArrH[8] * 1.0f;
                fArrH[9] = fArrH[9] * 1.0f;
                fArrH[10] = fArrH[10] * 1.0f;
                fArrH[11] = fArrH[11] * 1.0f;
            }
            ya4.N(fArrH, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                nc ncVarA = this.h;
                if (ncVarA == null) {
                    ncVarA = pc.a();
                    this.h = ncVarA;
                }
                gh0.E(this.f, ncVarA);
            }
            this.g = false;
        }
        i61 i61VarO = sv0Var.O();
        long j = i61VarO.j();
        i61VarO.g().e();
        try {
            i61 i61Var = (i61) ((zg5) i61VarO.o).n;
            float[] fArr = this.b;
            if (fArr != null) {
                i61Var.g().h(fArr);
            }
            nc ncVar = this.h;
            if (!this.f.isEmpty() && ncVar != null) {
                i61Var.g().i(ncVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((i35) arrayList.get(i)).a(sv0Var);
            }
        } finally {
            i61VarO.g().k();
            i61VarO.t(j);
        }
    }

    @Override // defpackage.i35
    public final if1 b() {
        return this.i;
    }

    @Override // defpackage.i35
    public final void d(x xVar) {
        this.i = xVar;
    }

    public final void e(int i, i35 i35Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, i35Var);
        } else {
            arrayList.add(i35Var);
        }
        g(i35Var);
        i35Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = c45.a;
            if (x40.g(j2) == x40.g(j) && x40.f(j2) == x40.f(j) && x40.e(j2) == x40.e(j)) {
                return;
            }
            this.d = false;
            this.e = x40.g;
        }
    }

    public final void g(i35 i35Var) {
        if (!(i35Var instanceof he3)) {
            if (i35Var instanceof gk1) {
                gk1 gk1Var = (gk1) i35Var;
                if (gk1Var.d && this.d) {
                    f(gk1Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = x40.g;
                    return;
                }
            }
            return;
        }
        he3 he3Var = (he3) i35Var;
        uo uoVar = he3Var.b;
        if (this.d && uoVar != null) {
            if (uoVar instanceof zh4) {
                f(((zh4) uoVar).u);
            } else {
                this.d = false;
                this.e = x40.g;
            }
        }
        uo uoVar2 = he3Var.g;
        if (this.d && uoVar2 != null) {
            if (uoVar2 instanceof zh4) {
                f(((zh4) uoVar2).u);
            } else {
                this.d = false;
                this.e = x40.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i35 i35Var = (i35) arrayList.get(i);
            sb.append("\t");
            sb.append(i35Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
