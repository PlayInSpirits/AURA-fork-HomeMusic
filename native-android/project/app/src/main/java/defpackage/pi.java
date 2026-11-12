package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class pi {
    public final ji d;
    public ai4 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public pi(yc5 yc5Var) {
        this.d = new ji(this, yc5Var);
    }

    public final void a(eb2 eb2Var, int i) {
        ai4 ai4VarJ = eb2Var.j(i);
        ji jiVar = this.d;
        jiVar.g(ai4VarJ, 1.0f);
        jiVar.g(eb2Var.j(i), -1.0f);
    }

    public final void b(ai4 ai4Var, ai4 ai4Var2, ai4 ai4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        ji jiVar = this.d;
        if (z) {
            jiVar.g(ai4Var, 1.0f);
            jiVar.g(ai4Var2, -1.0f);
            jiVar.g(ai4Var3, -1.0f);
        } else {
            jiVar.g(ai4Var, -1.0f);
            jiVar.g(ai4Var2, 1.0f);
            jiVar.g(ai4Var3, 1.0f);
        }
    }

    public final void c(ai4 ai4Var, ai4 ai4Var2, ai4 ai4Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        ji jiVar = this.d;
        if (z) {
            jiVar.g(ai4Var, 1.0f);
            jiVar.g(ai4Var2, -1.0f);
            jiVar.g(ai4Var3, 1.0f);
        } else {
            jiVar.g(ai4Var, -1.0f);
            jiVar.g(ai4Var2, 1.0f);
            jiVar.g(ai4Var3, -1.0f);
        }
    }

    public ai4 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final ai4 f(boolean[] zArr, ai4 ai4Var) {
        int i;
        ji jiVar = this.d;
        int iD = jiVar.d();
        ai4 ai4Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = jiVar.f(i2);
            if (f2 < 0.0f) {
                ai4 ai4VarE = jiVar.e(i2);
                if ((zArr == null || !zArr[ai4VarE.o]) && ai4VarE != ai4Var && (((i = ai4VarE.y) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    ai4Var2 = ai4VarE;
                }
            }
        }
        return ai4Var2;
    }

    public final void g(ai4 ai4Var) {
        ai4 ai4Var2 = this.a;
        ji jiVar = this.d;
        if (ai4Var2 != null) {
            jiVar.g(ai4Var2, -1.0f);
            this.a.p = -1;
            this.a = null;
        }
        float fH = jiVar.h(ai4Var, true) * (-1.0f);
        this.a = ai4Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = jiVar.h;
        for (int i2 = 0; i != -1 && i2 < jiVar.a; i2++) {
            float[] fArr = jiVar.g;
            fArr[i] = fArr[i] / fH;
            i = jiVar.f[i];
        }
    }

    public final void h(eb2 eb2Var, ai4 ai4Var, boolean z) {
        if (ai4Var.s) {
            ji jiVar = this.d;
            float fC = jiVar.c(ai4Var);
            this.b = (ai4Var.r * fC) + this.b;
            jiVar.h(ai4Var, z);
            if (z) {
                ai4Var.b(this);
            }
            if (jiVar.d() == 0) {
                this.e = true;
                eb2Var.b = true;
            }
        }
    }

    public void i(eb2 eb2Var, pi piVar, boolean z) {
        ji jiVar = this.d;
        jiVar.getClass();
        float fC = jiVar.c(piVar.a);
        jiVar.h(piVar.a, z);
        ji jiVar2 = piVar.d;
        int iD = jiVar2.d();
        for (int i = 0; i < iD; i++) {
            ai4 ai4VarE = jiVar2.e(i);
            jiVar.a(ai4VarE, jiVar2.c(ai4VarE) * fC, z);
        }
        this.b = (piVar.b * fC) + this.b;
        if (z) {
            piVar.a.b(this);
        }
        if (this.a == null || jiVar.d() != 0) {
            return;
        }
        this.e = true;
        eb2Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder sbI = xa3.i(strConcat);
            sbI.append(this.b);
            strConcat = sbI.toString();
            z = true;
        } else {
            z = false;
        }
        ji jiVar = this.d;
        int iD = jiVar.d();
        for (int i = 0; i < iD; i++) {
            ai4 ai4VarE = jiVar.e(i);
            if (ai4VarE != null) {
                float f = jiVar.f(i);
                if (f != 0.0f) {
                    String string = ai4VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
