package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class au4 extends cu4 {
    public final yw1 e;
    public final yw1 f;
    public final int[] g;
    public final int[] h;

    public au4(gy3 gy3Var, gy3 gy3Var2, int[] iArr) {
        rr2.l(gy3Var.q == iArr.length);
        this.e = gy3Var;
        this.f = gy3Var2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.cu4
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.cu4
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        yw1 yw1Var = this.e;
        if (!z) {
            return yw1Var.size() - 1;
        }
        return this.g[yw1Var.size() - 1];
    }

    @Override // defpackage.cu4
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.cu4
    public final zt4 f(int i, zt4 zt4Var, boolean z) {
        zt4 zt4Var2 = (zt4) this.f.get(i);
        zt4Var.i(zt4Var2.a, zt4Var2.b, zt4Var2.c, zt4Var2.d, zt4Var2.e, zt4Var2.g, zt4Var2.f);
        return zt4Var;
    }

    @Override // defpackage.cu4
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.cu4
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.cu4
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cu4
    public final bu4 m(int i, bu4 bu4Var, long j) {
        bu4 bu4Var2 = (bu4) this.e.get(i);
        bu4Var.b(bu4Var2.a, bu4Var2.b, bu4Var2.c, bu4Var2.d, bu4Var2.e, bu4Var2.f, bu4Var2.g, bu4Var2.h, bu4Var2.i, bu4Var2.k, bu4Var2.l, bu4Var2.m, bu4Var2.n, bu4Var2.o);
        bu4Var.j = bu4Var2.j;
        return bu4Var;
    }

    @Override // defpackage.cu4
    public final int o() {
        return this.e.size();
    }
}
