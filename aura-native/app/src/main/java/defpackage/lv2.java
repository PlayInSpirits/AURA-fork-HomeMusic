package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lv2 implements t41 {
    public final t41 a;
    public final sv4 b;

    public lv2(t41 t41Var, sv4 sv4Var) {
        this.a = t41Var;
        this.b = sv4Var;
    }

    @Override // defpackage.t41
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.t41
    public final void b(long j, long j2, long j3, List list, xj2[] xj2VarArr) {
        this.a.b(j, j2, j3, list, xj2VarArr);
    }

    @Override // defpackage.t41
    public final sv4 c() {
        return this.b;
    }

    @Override // defpackage.t41
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.t41
    public final boolean e(long j, s20 s20Var, List list) {
        return this.a.e(j, s20Var, list);
    }

    public final boolean equals(Object obj) {
        if (u(obj) && (obj instanceof lv2)) {
            return this.b.equals(((lv2) obj).b);
        }
        return false;
    }

    @Override // defpackage.t41
    public final void f(boolean z) {
        this.a.f(z);
    }

    @Override // defpackage.t41
    public final tb1 g(int i) {
        return this.b.d[this.a.i(i)];
    }

    @Override // defpackage.t41
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.t41
    public final int i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.t41
    public final int j(long j, List list) {
        return this.a.j(j, list);
    }

    @Override // defpackage.t41
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.t41
    public final int l() {
        return this.a.l();
    }

    @Override // defpackage.t41
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.t41
    public final tb1 m() {
        return this.b.d[this.a.l()];
    }

    @Override // defpackage.t41
    public final int n() {
        return this.a.n();
    }

    @Override // defpackage.t41
    public final boolean o(int i, long j) {
        return this.a.o(i, j);
    }

    @Override // defpackage.t41
    public final void p(float f) {
        this.a.p(f);
    }

    @Override // defpackage.t41
    public final Object q() {
        return this.a.q();
    }

    @Override // defpackage.t41
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.t41
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.t41
    public final int t(int i) {
        return this.a.t(i);
    }

    public final boolean u(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lv2) {
            return this.a.equals(((lv2) obj).a);
        }
        return false;
    }
}
