package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (this.h) {
                    case 0:
                        tb3 tb3Var = f63Var.g0;
                        if (tb3Var != null) {
                            vj1 vj1Var = (vj1) tb3Var;
                            float[] b = vj1Var.b();
                            if (!vj1Var.F) {
                                j = ya4.A(j, b);
                            }
                        }
                        j = ji2.z(j, f63Var.S);
                        break;
                    default:
                        ef2 y0 = f63Var.y0();
                        y0.getClass();
                        long j2 = y0.I;
                        j = g83.e((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                f63Var = f63Var.J;
                f63Var.getClass();
                if (f63Var.equals(this.a.c())) {
                    int round = Math.round(pp1Var instanceof pp1 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    HashMap hashMap = this.g;
                    if (hashMap.containsKey(pp1Var)) {
                        int intValue = ((Number) lg2.V(pp1Var, hashMap)).intValue();
                        pp1 pp1Var2 = j9.a;
                        round = ((Number) pp1Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(pp1Var, Integer.valueOf(round));
                    return;
                }
            } while (!b(f63Var).containsKey(pp1Var));
            float c = c(f63Var, pp1Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f63 f63Var) {
        switch (this.h) {
            case 0:
                return f63Var.h0().a();
            default:
                ef2 y0 = f63Var.y0();
                y0.getClass();
                return y0.h0().a();
        }
    }

    public final int c(f63 f63Var, pp1 pp1Var) {
        switch (this.h) {
            case 0:
                return f63Var.c0(pp1Var);
            default:
                ef2 y0 = f63Var.y0();
                y0.getClass();
                return y0.c0(pp1Var);
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
        k9 e = k9Var.e();
        if (e == null) {
            return;
        }
        if (this.c) {
            e.requestLayout();
        }
        if (this.d) {
            k9Var.E();
        }
        if (this.e) {
            k9Var.requestLayout();
        }
        e.a().f();
    }

    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        x xVar = new x(2, this);
        k9 k9Var = this.a;
        k9Var.s(xVar);
        hashMap.putAll(b(k9Var.c()));
        this.b = false;
    }

    public final void h() {
        d72 a;
        d72 a2;
        boolean d = d();
        k9 k9Var = this.a;
        if (!d) {
            k9 e = k9Var.e();
            if (e == null) {
                return;
            }
            k9Var = e.a().f;
            if (k9Var == null || !k9Var.a().d()) {
                k9 k9Var2 = this.f;
                if (k9Var2 == null || k9Var2.a().d()) {
                    return;
                }
                k9 e2 = k9Var2.e();
                if (e2 != null && (a2 = e2.a()) != null) {
                    a2.h();
                }
                k9 e3 = k9Var2.e();
                k9Var = (e3 == null || (a = e3.a()) == null) ? null : a.f;
            }
        }
        this.f = k9Var;
    }
}
