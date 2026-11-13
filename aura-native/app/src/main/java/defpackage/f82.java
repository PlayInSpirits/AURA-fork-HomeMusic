package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f82 implements wi2 {
    public final c82 n;
    public final ln4 o;
    public final nc3 p;
    public final i03 q;

    public f82(c82 c82Var, ln4 ln4Var) {
        this.n = c82Var;
        this.o = ln4Var;
        this.p = (nc3) c82Var.b.invoke();
        f02.a();
        this.q = new i03();
    }

    @Override // defpackage.oo0
    public final float B(int i) {
        throw null;
    }

    @Override // defpackage.oo0
    public final float D(float f) {
        return this.o.D(f);
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.o.J();
    }

    @Override // defpackage.wi2
    public final boolean K() {
        return this.o.K();
    }

    @Override // defpackage.oo0
    public final float M(float f) {
        return this.o.M(f);
    }

    @Override // defpackage.wi2
    public final vi2 T(int i, int i2, Map map, if1 if1Var, if1 if1Var2) {
        return this.o.T(i, i2, map, if1Var, if1Var2);
    }

    @Override // defpackage.oo0
    public final int V(float f) {
        return this.o.V(f);
    }

    @Override // defpackage.oo0
    public final long Y(long j) {
        return this.o.Y(j);
    }

    public final List a(int i) {
        i03 i03Var = this.q;
        List list = (List) i03Var.b(i);
        if (list != null) {
            return list;
        }
        Object c = this.p.c(i);
        List m = this.o.m(this.n.a(i, c), c);
        i03Var.i(i, m);
        return m;
    }

    @Override // defpackage.oo0
    public final float a0(long j) {
        return this.o.a0(j);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.o.g();
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.o.getLayoutDirection();
    }

    @Override // defpackage.oo0
    public final long h(float f) {
        return this.o.h(f);
    }

    @Override // defpackage.oo0
    public final long i(long j) {
        return this.o.i(j);
    }

    @Override // defpackage.oo0
    public final float o(long j) {
        return this.o.o(j);
    }

    @Override // defpackage.wi2
    public final vi2 v(int i, int i2, Map map, if1 if1Var) {
        return this.o.v(i, i2, map, if1Var);
    }

    @Override // defpackage.oo0
    public final long w(float f) {
        return this.o.w(f);
    }
}
