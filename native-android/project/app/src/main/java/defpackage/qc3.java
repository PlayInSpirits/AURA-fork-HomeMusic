package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 implements vi2 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final hb3 e;
    public final int f;
    public final int g;
    public final int h;
    public final xi2 i;
    public final xi2 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final rv2 n;
    public final vi2 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final we0 s;
    public final oo0 t;
    public final long u;

    public qc3(List list, int i, int i2, int i3, hb3 hb3Var, int i4, int i5, int i6, xi2 xi2Var, xi2 xi2Var2, float f, int i7, boolean z, rv2 rv2Var, vi2 vi2Var, boolean z2, List list2, List list3, we0 we0Var, oo0 oo0Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = hb3Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = xi2Var;
        this.j = xi2Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = rv2Var;
        this.o = vi2Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = we0Var;
        this.t = oo0Var;
        this.u = j;
    }

    @Override // defpackage.vi2
    public final Map a() {
        return this.o.a();
    }

    @Override // defpackage.vi2
    public final int b() {
        return this.o.b();
    }

    @Override // defpackage.vi2
    public final void c() {
        this.o.c();
    }

    @Override // defpackage.vi2
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.vi2
    public final if1 e() {
        return this.o.e();
    }

    @Override // defpackage.vi2
    public final wf1 f() {
        return this.o.f();
    }

    @Override // defpackage.vi2
    public final if1 g() {
        return this.o.g();
    }

    public final qc3 h(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        xi2 xi2Var = (xi2) q40.w0(list);
        xi2 xi2Var2 = (xi2) q40.C0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((xi2Var.l + i3) - i5, (xi2Var2.l + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - xi2Var.l, i4 - xi2Var2.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((xi2) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((xi2) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((xi2) list3.get(i8)).a(i);
        }
        return new qc3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long i() {
        vi2 vi2Var = this.o;
        return (((long) vi2Var.d()) << 32) | (((long) vi2Var.b()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qc3(int i, int i2, int i3, int i4, int i5, int i6, rv2 rv2Var, vi2 vi2Var, we0 we0Var, oo0 oo0Var, long j) {
        u01 u01Var = u01.n;
        this(u01Var, i, i2, i3, hb3.o, i4, i5, i6, null, null, 0.0f, 0, false, rv2Var, vi2Var, false, u01Var, u01Var, we0Var, oo0Var, j);
    }
}
