package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j72 implements ln4 {
    public r62 n = r62.o;
    public float o;
    public float p;
    public final /* synthetic */ o72 q;

    public j72(o72 o72Var) {
        this.q = o72Var;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.p;
    }

    @Override // defpackage.wi2
    public final boolean K() {
        y62 y62Var = this.q.n.R.d;
        return y62Var == y62.q || y62Var == y62.o;
    }

    @Override // defpackage.wi2
    public final vi2 T(int i, int i2, Map map, if1 if1Var, if1 if1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cz1.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new i72(i, i2, map, if1Var, this, this.q, if1Var2);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.o;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.n;
    }

    @Override // defpackage.ln4
    public final List m(wf1 wf1Var, Object obj) throws IOException {
        o72 o72Var = this.q;
        o72Var.h();
        c72 c72Var = o72Var.n;
        y62 y62Var = c72Var.R.d;
        y62 y62Var2 = y62.p;
        y62 y62Var3 = y62.n;
        if (y62Var != y62Var3 && y62Var != y62Var2 && y62Var != y62.o && y62Var != y62.q) {
            cz1.b("subcompose can only be used inside the measure or layout blocks");
        }
        w03 w03Var = o72Var.t;
        Object objG = w03Var.g(obj);
        if (objG == null) {
            objG = (c72) o72Var.w.j(obj);
            if (objG != null) {
                if (o72Var.B <= 0) {
                    cz1.b("Check failed.");
                }
                o72Var.B--;
            } else {
                objG = o72Var.n(obj);
                if (objG == null) {
                    int i = o72Var.q;
                    c72 c72Var2 = new c72(2);
                    c72Var.C = true;
                    c72Var.A(i, c72Var2);
                    c72Var.C = false;
                    objG = c72Var2;
                }
            }
            w03Var.l(obj, objG);
        }
        c72 c72Var3 = (c72) objG;
        if (q40.y0(c72Var.o(), o72Var.q) != c72Var3) {
            int i2 = ((c13) c72Var.o()).n.i(c72Var3);
            if (i2 < o72Var.q) {
                cz1.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = o72Var.q;
            if (i3 != i2) {
                o72Var.j(i2, i3);
            }
        }
        o72Var.q++;
        o72Var.m(c72Var3, obj, false, wf1Var);
        return (y62Var == y62Var3 || y62Var == y62Var2) ? c72Var3.R.p.S() : c72Var3.m();
    }
}
