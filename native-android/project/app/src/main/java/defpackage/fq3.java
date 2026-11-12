package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fq3 extends pi {
    public ai4[] f;
    public ai4[] g;
    public int h;
    public gp3 i;

    @Override // defpackage.pi
    public final ai4 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            ai4[] ai4VarArr = this.f;
            ai4 ai4Var = ai4VarArr[i2];
            if (!zArr[ai4Var.o]) {
                gp3 gp3Var = this.i;
                gp3Var.o = ai4Var;
                int i3 = 8;
                if (i != -1) {
                    ai4 ai4Var2 = ai4VarArr[i];
                    while (i3 >= 0) {
                        float f = ai4Var2.u[i3];
                        float f2 = ((ai4) gp3Var.o).u[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((ai4) gp3Var.o).u[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.pi
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.pi
    public final void i(eb2 eb2Var, pi piVar, boolean z) {
        ai4 ai4Var = piVar.a;
        if (ai4Var == null) {
            return;
        }
        float[] fArr = ai4Var.u;
        ji jiVar = piVar.d;
        int iD = jiVar.d();
        for (int i = 0; i < iD; i++) {
            ai4 ai4VarE = jiVar.e(i);
            float f = jiVar.f(i);
            gp3 gp3Var = this.i;
            gp3Var.o = ai4VarE;
            if (ai4VarE.n) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ai4) gp3Var.o).u;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((ai4) gp3Var.o).u[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((fq3) gp3Var.p).k((ai4) gp3Var.o);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((ai4) gp3Var.o).u[i3] = f4;
                    } else {
                        ((ai4) gp3Var.o).u[i3] = 0.0f;
                    }
                }
                j(ai4VarE);
            }
            this.b = (piVar.b * f) + this.b;
        }
        k(ai4Var);
    }

    public final void j(ai4 ai4Var) {
        int i;
        ai4[] ai4VarArr;
        int i2 = this.h + 1;
        ai4[] ai4VarArr2 = this.f;
        if (i2 > ai4VarArr2.length) {
            ai4[] ai4VarArr3 = (ai4[]) Arrays.copyOf(ai4VarArr2, ai4VarArr2.length * 2);
            this.f = ai4VarArr3;
            this.g = (ai4[]) Arrays.copyOf(ai4VarArr3, ai4VarArr3.length * 2);
        }
        ai4[] ai4VarArr4 = this.f;
        int i3 = this.h;
        ai4VarArr4[i3] = ai4Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ai4VarArr4[i3].o > ai4Var.o) {
            int i5 = 0;
            while (true) {
                i = this.h;
                ai4VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                ai4VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(ai4VarArr, 0, i, new jb2(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ai4Var.n = true;
        ai4Var.a(this);
    }

    public final void k(ai4 ai4Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ai4Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        ai4Var.n = false;
                        return;
                    } else {
                        ai4[] ai4VarArr = this.f;
                        int i3 = i + 1;
                        ai4VarArr[i] = ai4VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.pi
    public final String toString() {
        gp3 gp3Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            gp3Var.o = this.f[i];
            str = str + gp3Var + " ";
        }
        return str;
    }
}
