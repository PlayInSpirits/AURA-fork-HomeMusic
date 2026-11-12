package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements ln4, wi2 {
    public final /* synthetic */ j72 n;
    public final /* synthetic */ o72 o;

    public g72(o72 o72Var) {
        this.o = o72Var;
        this.n = o72Var.u;
    }

    @Override // defpackage.oo0
    public final float B(int i) {
        return this.n.B(i);
    }

    @Override // defpackage.oo0
    public final float D(float f) {
        return f / this.n.g();
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.p;
    }

    @Override // defpackage.wi2
    public final boolean K() {
        return this.n.K();
    }

    @Override // defpackage.oo0
    public final float M(float f) {
        return this.n.g() * f;
    }

    @Override // defpackage.wi2
    public final vi2 T(int i, int i2, Map map, if1 if1Var, if1 if1Var2) {
        return this.n.T(i, i2, map, if1Var, if1Var2);
    }

    @Override // defpackage.oo0
    public final int V(float f) {
        return this.n.V(f);
    }

    @Override // defpackage.oo0
    public final long Y(long j) {
        return this.n.Y(j);
    }

    @Override // defpackage.oo0
    public final float a0(long j) {
        return this.n.a0(j);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.o;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.n.n;
    }

    @Override // defpackage.oo0
    public final long h(float f) {
        return this.n.h(f);
    }

    @Override // defpackage.oo0
    public final long i(long j) {
        return this.n.i(j);
    }

    @Override // defpackage.ln4
    public final List m(wf1 wf1Var, Object obj) throws IOException {
        o72 o72Var = this.o;
        c72 c72Var = o72Var.n;
        w03 w03Var = o72Var.t;
        c72 c72Var2 = (c72) w03Var.g(obj);
        if (c72Var2 != null && ((c13) c72Var.o()).n.i(c72Var2) < o72Var.q) {
            return c72Var2.R.p.S();
        }
        w03 w03Var2 = o72Var.y;
        w03 w03Var3 = o72Var.w;
        f13 f13Var = o72Var.z;
        if (f13Var.p < o72Var.r) {
            cz1.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        c72 c72Var3 = (c72) w03Var.g(obj);
        int i = f13Var.p;
        int i2 = o72Var.r;
        if (i == i2) {
            f13Var.b(obj);
        } else {
            Object[] objArr = f13Var.n;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        o72Var.r++;
        boolean zB = w03Var3.b(obj);
        if (zB || c72Var3 != null) {
            if (!zB && c72Var3 != null) {
                o72Var.j(((c13) c72Var.o()).n.i(c72Var3), ((c13) c72Var.o()).n.p);
                o72Var.B++;
                w03Var.j(obj);
                w03Var3.l(obj, c72Var3);
                w03Var2.l(obj, o72Var.f(obj));
                if (c72Var.G()) {
                    o72Var.h();
                }
            }
            c72 c72Var4 = (c72) w03Var3.g(obj);
            h72 h72Var = c72Var4 != null ? (h72) o72Var.s.g(c72Var4) : null;
            if (h72Var != null && h72Var.d) {
                o72Var.m(c72Var4, obj, false, wf1Var);
            }
            if ((h72Var != null ? h72Var.f : null) != null) {
                o72Var.d(h72Var, true);
            }
        } else {
            o72Var.k(obj, wf1Var, false);
            w03Var2.l(obj, o72Var.f(obj));
        }
        c72 c72Var5 = (c72) w03Var3.g(obj);
        if (c72Var5 == null) {
            return u01.n;
        }
        List listS = c72Var5.R.p.S();
        c13 c13Var = (c13) listS;
        int i3 = c13Var.n.p;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ti2) c13Var.get(i4)).s.b = true;
        }
        return listS;
    }

    @Override // defpackage.oo0
    public final float o(long j) {
        return this.n.o(j);
    }

    @Override // defpackage.wi2
    public final vi2 v(int i, int i2, Map map, if1 if1Var) {
        return this.n.T(i, i2, map, null, if1Var);
    }

    @Override // defpackage.oo0
    public final long w(float f) {
        return this.n.w(f);
    }
}
