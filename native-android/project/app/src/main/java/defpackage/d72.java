package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d72 {
    public final k9 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public k9 f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    public d72(k9 k9Var, int i) {
        this.h = i;
        this.a = k9Var;
    }

    public final void a(pp1 pp1Var, int i, f63 f63Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jZ = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.h) {
                    case 0:
                        tb3 tb3Var = f63Var.g0;
                        if (tb3Var != null) {
                            vj1 vj1Var = (vj1) tb3Var;
                            float[] fArrB = vj1Var.b();
                            if (!vj1Var.F) {
                                jZ = ya4.A(jZ, fArrB);
                            }
                        }
                        jZ = ji2.z(jZ, f63Var.S);
                        break;
                    default:
                        ef2 ef2VarY0 = f63Var.y0();
                        ef2VarY0.getClass();
                        long j = ef2VarY0.I;
                        jZ = g83.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jZ);
                        break;
                }
                f63Var = f63Var.J;
                f63Var.getClass();
                if (f63Var.equals(this.a.c())) {
                    int iRound = Math.round(pp1Var instanceof pp1 ? Float.intBitsToFloat((int) (jZ & 4294967295L)) : Float.intBitsToFloat((int) (jZ >> 32)));
                    HashMap map = this.g;
                    if (map.containsKey(pp1Var)) {
                        int iIntValue = ((Number) lg2.V(pp1Var, map)).intValue();
                        pp1 pp1Var2 = j9.a;
                        iRound = ((Number) pp1Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(pp1Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(f63Var).containsKey(pp1Var));
            float fC = c(f63Var, pp1Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f63 f63Var) {
        switch (this.h) {
            case 0:
                return f63Var.h0().a();
            default:
                ef2 ef2VarY0 = f63Var.y0();
                ef2VarY0.getClass();
                return ef2VarY0.h0().a();
        }
    }

    public final int c(f63 f63Var, pp1 pp1Var) {
        switch (this.h) {
            case 0:
                return f63Var.c0(pp1Var);
            default:
                ef2 ef2VarY0 = f63Var.y0();
                ef2VarY0.getClass();
                return ef2VarY0.c0(pp1Var);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    public final void f() {
        this.b = true;
        k9 k9Var = this.a;
        k9 k9VarE = k9Var.e();
        if (k9VarE == null) {
            return;
        }
        if (this.c) {
            k9VarE.requestLayout();
        }
        if (this.d) {
            k9Var.E();
        }
        if (this.e) {
            k9Var.requestLayout();
        }
        k9VarE.a().f();
    }

    public final void g() {
        HashMap map = this.g;
        map.clear();
        x xVar = new x(2, this);
        k9 k9Var = this.a;
        k9Var.s(xVar);
        map.putAll(b(k9Var.c()));
        this.b = false;
    }

    public final void h() {
        d72 d72VarA;
        d72 d72VarA2;
        boolean zD = d();
        k9 k9Var = this.a;
        if (!zD) {
            k9 k9VarE = k9Var.e();
            if (k9VarE == null) {
                return;
            }
            k9Var = k9VarE.a().f;
            if (k9Var == null || !k9Var.a().d()) {
                k9 k9Var2 = this.f;
                if (k9Var2 == null || k9Var2.a().d()) {
                    return;
                }
                k9 k9VarE2 = k9Var2.e();
                if (k9VarE2 != null && (d72VarA2 = k9VarE2.a()) != null) {
                    d72VarA2.h();
                }
                k9 k9VarE3 = k9Var2.e();
                k9Var = (k9VarE3 == null || (d72VarA = k9VarE3.a()) == null) ? null : d72VarA.f;
            }
        }
        this.f = k9Var;
    }
}
