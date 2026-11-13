package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = ya4.h();
                this.b = fArr;
            } else {
                ya4.G(fArr);
            }
            ya4.N(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            ya4.N(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                nc ncVar = this.h;
                if (ncVar == null) {
                    ncVar = pc.a();
                    this.h = ncVar;
                }
                gh0.E(this.f, ncVar);
            }
            this.g = false;
        }
        i61 O = sv0Var.O();
        long j = O.j();
        O.g().e();
        try {
            i61 i61Var = (i61) ((zg5) O.o).n;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                i61Var.g().h(fArr2);
            }
            nc ncVar2 = this.h;
            if (!this.f.isEmpty() && ncVar2 != null) {
                i61Var.g().i(ncVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((i35) arrayList.get(i)).a(sv0Var);
            }
        } finally {
            O.g().k();
            O.t(j);
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
