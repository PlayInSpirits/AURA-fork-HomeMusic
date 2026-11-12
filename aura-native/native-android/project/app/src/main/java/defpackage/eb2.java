package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eb2 {
    public static boolean q;
    public final fq3 d;
    public final yc5 m;
    public pi p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ai4[] n = new ai4[1000];
    public int o = 0;
    public pi[] g = new pi[32];

    public eb2() {
        s();
        yc5 yc5Var = new yc5();
        yc5Var.n = new jo3();
        yc5Var.o = new jo3();
        yc5Var.p = new ai4[32];
        this.m = yc5Var;
        fq3 fq3Var = new fq3(yc5Var);
        fq3Var.f = new ai4[128];
        fq3Var.g = new ai4[128];
        fq3Var.h = 0;
        fq3Var.i = new gp3(18, fq3Var);
        this.d = fq3Var;
        this.p = new pi(yc5Var);
    }

    public static int n(Object obj) {
        ai4 ai4Var = ((hb0) obj).i;
        if (ai4Var != null) {
            return (int) (ai4Var.r + 0.5f);
        }
        return 0;
    }

    public final ai4 a(int i) {
        jo3 jo3Var = (jo3) this.m.o;
        int i2 = jo3Var.o;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = jo3Var.n;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            jo3Var.o = i3;
            obj = obj2;
        }
        ai4 ai4Var = (ai4) obj;
        if (ai4Var == null) {
            ai4Var = new ai4(i);
            ai4Var.y = i;
        } else {
            ai4Var.c();
            ai4Var.y = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (ai4[]) Arrays.copyOf(this.n, i6);
        }
        ai4[] ai4VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        ai4VarArr[i7] = ai4Var;
        return ai4Var;
    }

    public final void b(ai4 ai4Var, ai4 ai4Var2, int i, float f, ai4 ai4Var3, ai4 ai4Var4, int i2, int i3) {
        pi piVarL = l();
        if (ai4Var2 == ai4Var3) {
            piVarL.d.g(ai4Var, 1.0f);
            piVarL.d.g(ai4Var4, 1.0f);
            piVarL.d.g(ai4Var2, -2.0f);
        } else {
            ji jiVar = piVarL.d;
            if (f == 0.5f) {
                jiVar.g(ai4Var, 1.0f);
                piVarL.d.g(ai4Var2, -1.0f);
                piVarL.d.g(ai4Var3, -1.0f);
                piVarL.d.g(ai4Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    piVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                jiVar.g(ai4Var, -1.0f);
                piVarL.d.g(ai4Var2, 1.0f);
                piVarL.b = i;
            } else if (f >= 1.0f) {
                jiVar.g(ai4Var4, -1.0f);
                piVarL.d.g(ai4Var3, 1.0f);
                piVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                jiVar.g(ai4Var, f2 * 1.0f);
                piVarL.d.g(ai4Var2, f2 * (-1.0f));
                piVarL.d.g(ai4Var3, (-1.0f) * f);
                piVarL.d.g(ai4Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    piVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            piVarL.a(this, i3);
        }
        c(piVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(pi piVar) {
        boolean z;
        boolean z2;
        ai4 ai4VarF;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (piVar.e) {
            z = false;
        } else {
            ArrayList arrayList = piVar.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = piVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        ai4 ai4VarE = piVar.d.e(i);
                        if (ai4VarE.p != -1 || ai4VarE.s) {
                            arrayList.add(ai4VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            ai4 ai4Var = (ai4) arrayList.get(i2);
                            if (ai4Var.s) {
                                piVar.h(this, ai4Var, true);
                            } else {
                                piVar.i(this, this.g[ai4Var.p], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (piVar.a != null && piVar.d.d() == 0) {
                    piVar.e = true;
                    this.b = true;
                }
            }
            if (piVar.e()) {
                return;
            }
            float f = piVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                piVar.b = f * (-1.0f);
                ji jiVar = piVar.d;
                int i3 = jiVar.h;
                for (int i4 = 0; i3 != -1 && i4 < jiVar.a; i4++) {
                    float[] fArr = jiVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = jiVar.f[i3];
                }
            }
            int iD2 = piVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            ai4 ai4Var2 = null;
            ai4 ai4Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = piVar.d.f(i5);
                ai4 ai4VarE2 = piVar.d.e(i5);
                float f6 = f2;
                if (ai4VarE2.y == 1) {
                    if (ai4Var2 == null) {
                        if (ai4VarE2.x <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ai4Var2 = ai4VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (ai4VarE2.x > 1) {
                                z4 = false;
                            }
                            ai4Var2 = ai4VarE2;
                            f3 = f5;
                        } else if (z4 || ai4VarE2.x > 1) {
                        }
                        z4 = true;
                        ai4Var2 = ai4VarE2;
                        f3 = f5;
                    }
                } else if (ai4Var2 == null && f5 < f6) {
                    if (ai4Var3 == null) {
                        if (ai4VarE2.x <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ai4Var3 = ai4VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (ai4VarE2.x > 1) {
                                z5 = false;
                            }
                            ai4Var3 = ai4VarE2;
                            f4 = f5;
                        } else if (z5 || ai4VarE2.x > 1) {
                        }
                        z5 = true;
                        ai4Var3 = ai4VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (ai4Var2 == null) {
                ai4Var2 = ai4Var3;
            }
            if (ai4Var2 == null) {
                z2 = true;
            } else {
                piVar.g(ai4Var2);
                z2 = false;
            }
            if (piVar.d.d() == 0) {
                piVar.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                ai4 ai4VarA = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                ai4VarA.o = i6;
                yc5 yc5Var = this.m;
                ((ai4[]) yc5Var.p)[i6] = ai4VarA;
                piVar.a = ai4VarA;
                int i7 = this.k;
                h(piVar);
                if (this.k == i7 + 1) {
                    pi piVar2 = this.p;
                    piVar2.a = null;
                    piVar2.d.b();
                    for (int i8 = 0; i8 < piVar.d.d(); i8++) {
                        piVar2.d.a(piVar.d.e(i8), piVar.d.f(i8), true);
                    }
                    r(this.p);
                    if (ai4VarA.p == -1) {
                        if (piVar.a == ai4VarA && (ai4VarF = piVar.f(null, ai4VarA)) != null) {
                            piVar.g(ai4VarF);
                        }
                        if (!piVar.e) {
                            piVar.a.e(this, piVar);
                        }
                        ((jo3) yc5Var.n).c(piVar);
                        this.k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ai4 ai4Var4 = piVar.a;
            if (ai4Var4 == null) {
                return;
            }
            if (ai4Var4.y != 1 && piVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(piVar);
    }

    public final void d(ai4 ai4Var, int i) {
        int i2 = ai4Var.p;
        if (i2 == -1) {
            ai4Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ai4 ai4Var2 = ((ai4[]) this.m.p)[i3];
            }
            return;
        }
        if (i2 == -1) {
            pi piVarL = l();
            piVarL.a = ai4Var;
            float f = i;
            ai4Var.r = f;
            piVarL.b = f;
            piVarL.e = true;
            c(piVarL);
            return;
        }
        pi piVar = this.g[i2];
        if (piVar.e) {
            piVar.b = i;
            return;
        }
        if (piVar.d.d() == 0) {
            piVar.e = true;
            piVar.b = i;
            return;
        }
        pi piVarL2 = l();
        if (i < 0) {
            piVarL2.b = i * (-1);
            piVarL2.d.g(ai4Var, 1.0f);
        } else {
            piVarL2.b = i;
            piVarL2.d.g(ai4Var, -1.0f);
        }
        c(piVarL2);
    }

    public final void e(ai4 ai4Var, ai4 ai4Var2, int i, int i2) {
        if (i2 == 8 && ai4Var2.s && ai4Var.p == -1) {
            ai4Var.d(this, ai4Var2.r + i);
            return;
        }
        pi piVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            piVarL.b = i;
        }
        ji jiVar = piVarL.d;
        if (z) {
            jiVar.g(ai4Var, 1.0f);
            piVarL.d.g(ai4Var2, -1.0f);
        } else {
            jiVar.g(ai4Var, -1.0f);
            piVarL.d.g(ai4Var2, 1.0f);
        }
        if (i2 != 8) {
            piVarL.a(this, i2);
        }
        c(piVarL);
    }

    public final void f(ai4 ai4Var, ai4 ai4Var2, int i, int i2) {
        pi piVarL = l();
        ai4 ai4VarM = m();
        ai4VarM.q = 0;
        piVarL.b(ai4Var, ai4Var2, ai4VarM, i);
        if (i2 != 8) {
            piVarL.d.g(j(i2), (int) (piVarL.d.c(ai4VarM) * (-1.0f)));
        }
        c(piVarL);
    }

    public final void g(ai4 ai4Var, ai4 ai4Var2, int i, int i2) {
        pi piVarL = l();
        ai4 ai4VarM = m();
        ai4VarM.q = 0;
        piVarL.c(ai4Var, ai4Var2, ai4VarM, i);
        if (i2 != 8) {
            piVarL.d.g(j(i2), (int) (piVarL.d.c(ai4VarM) * (-1.0f)));
        }
        c(piVarL);
    }

    public final void h(pi piVar) {
        int i;
        if (piVar.e) {
            piVar.a.d(this, piVar.b);
        } else {
            pi[] piVarArr = this.g;
            int i2 = this.k;
            piVarArr[i2] = piVar;
            ai4 ai4Var = piVar.a;
            ai4Var.p = i2;
            this.k = i2 + 1;
            ai4Var.e(this, piVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                pi piVar2 = this.g[i3];
                if (piVar2 != null && piVar2.e) {
                    piVar2.a.d(this, piVar2.b);
                    ((jo3) this.m.n).c(piVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        pi[] piVarArr2 = this.g;
                        int i6 = i4 - 1;
                        pi piVar3 = piVarArr2[i4];
                        piVarArr2[i6] = piVar3;
                        ai4 ai4Var2 = piVar3.a;
                        if (ai4Var2.p == i4) {
                            ai4Var2.p = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            pi piVar = this.g[i];
            piVar.a.r = piVar.b;
        }
    }

    public final ai4 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ai4 ai4VarA = a(4);
        float[] fArr = ai4VarA.u;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ai4VarA.o = i2;
        ai4VarA.q = i;
        ((ai4[]) this.m.p)[i2] = ai4VarA;
        fq3 fq3Var = this.d;
        fq3Var.i.o = ai4VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[ai4VarA.q] = 1.0f;
        fq3Var.j(ai4VarA);
        return ai4VarA;
    }

    public final ai4 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof hb0)) {
            return null;
        }
        hb0 hb0Var = (hb0) obj;
        ai4 ai4Var = hb0Var.i;
        if (ai4Var == null) {
            hb0Var.h();
            ai4Var = hb0Var.i;
        }
        int i = ai4Var.o;
        yc5 yc5Var = this.m;
        if (i != -1 && i <= this.c && ((ai4[]) yc5Var.p)[i] != null) {
            return ai4Var;
        }
        if (i != -1) {
            ai4Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ai4Var.o = i2;
        ai4Var.y = 1;
        ((ai4[]) yc5Var.p)[i2] = ai4Var;
        return ai4Var;
    }

    public final pi l() {
        Object obj;
        yc5 yc5Var = this.m;
        jo3 jo3Var = (jo3) yc5Var.n;
        int i = jo3Var.o;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = jo3Var.n;
            obj = objArr[i2];
            objArr[i2] = null;
            jo3Var.o = i2;
        } else {
            obj = null;
        }
        pi piVar = (pi) obj;
        if (piVar == null) {
            return new pi(yc5Var);
        }
        piVar.a = null;
        piVar.d.b();
        piVar.b = 0.0f;
        piVar.e = false;
        return piVar;
    }

    public final ai4 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ai4 ai4VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        ai4VarA.o = i;
        ((ai4[]) this.m.p)[i] = ai4VarA;
        return ai4VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (pi[]) Arrays.copyOf(this.g, i);
        yc5 yc5Var = this.m;
        yc5Var.p = (ai4[]) Arrays.copyOf((ai4[]) yc5Var.p, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        fq3 fq3Var = this.d;
        if (fq3Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(fq3Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(fq3Var);
                return;
            }
        }
        i();
    }

    public final void q(fq3 fq3Var) {
        for (int i = 0; i < this.k; i++) {
            pi piVar = this.g[i];
            int i2 = 1;
            if (piVar.a.y != 1) {
                float f = 0.0f;
                if (piVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            pi piVar2 = this.g[i6];
                            if (piVar2.a.y != i2 && !piVar2.e && piVar2.b < f) {
                                int iD = piVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    ai4 ai4VarE = piVar2.d.e(i8);
                                    float fC = piVar2.d.c(ai4VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = ai4VarE.t[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = ai4VarE.o;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            pi piVar3 = this.g[i4];
                            piVar3.a.p = -1;
                            piVar3.g(((ai4[]) this.m.p)[i5]);
                            ai4 ai4Var = piVar3.a;
                            ai4Var.p = i4;
                            ai4Var.e(this, piVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(fq3Var);
        i();
    }

    public final void r(pi piVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            ai4 ai4Var = piVar.a;
            if (ai4Var != null) {
                this.i[ai4Var.o] = true;
            }
            ai4 ai4VarD = piVar.d(this.i);
            if (ai4VarD != null) {
                boolean[] zArr = this.i;
                int i4 = ai4VarD.o;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (ai4VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    pi piVar2 = this.g[i5];
                    if (piVar2.a.y != 1 && !piVar2.e) {
                        ji jiVar = piVar2.d;
                        int i7 = jiVar.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= jiVar.a) {
                                z = false;
                                break;
                            } else if (jiVar.e[i7] == ai4VarD.o) {
                                z = true;
                                break;
                            } else {
                                i7 = jiVar.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = piVar2.d.c(ai4VarD);
                            if (fC < 0.0f) {
                                float f2 = (-piVar2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    pi piVar3 = this.g[i6];
                    piVar3.a.p = -1;
                    piVar3.g(ai4VarD);
                    ai4 ai4Var2 = piVar3.a;
                    ai4Var2.p = i6;
                    ai4Var2.e(this, piVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            pi piVar = this.g[i];
            if (piVar != null) {
                ((jo3) this.m.n).c(piVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        yc5 yc5Var;
        int i = 0;
        while (true) {
            yc5Var = this.m;
            ai4[] ai4VarArr = (ai4[]) yc5Var.p;
            if (i >= ai4VarArr.length) {
                break;
            }
            ai4 ai4Var = ai4VarArr[i];
            if (ai4Var != null) {
                ai4Var.c();
            }
            i++;
        }
        jo3 jo3Var = (jo3) yc5Var.o;
        ai4[] ai4VarArr2 = this.n;
        int length = this.o;
        jo3Var.getClass();
        if (length > ai4VarArr2.length) {
            length = ai4VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            ai4 ai4Var2 = ai4VarArr2[i2];
            int i3 = jo3Var.o;
            Object[] objArr = jo3Var.n;
            if (i3 < objArr.length) {
                objArr[i3] = ai4Var2;
                jo3Var.o = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ai4[]) yc5Var.p, (Object) null);
        this.c = 0;
        fq3 fq3Var = this.d;
        fq3Var.h = 0;
        fq3Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            pi piVar = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new pi(yc5Var);
    }
}
