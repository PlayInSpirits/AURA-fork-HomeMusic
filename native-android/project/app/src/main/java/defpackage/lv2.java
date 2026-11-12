package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lv2 implements t41 {
    public final t41 a;
    public final sv4 b;

    public lv2(t41 r1, sv4 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.t41
    public final boolean a(int r1, long r2) {
        return this.a.a(r1, r2);
    }

    @Override // defpackage.t41
    public final void b(long r1, long r3, long r5, List r7, xj2[] r8) {
        this.a.b(r1, r3, r5, r7, r8);
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
    public final boolean e(long r1, s20 r3, List r4) {
        return this.a.e(r1, r3, r4);
    }

    public final boolean equals(Object r2) {
        if (u(r2) == true) goto L5;
        return false;
    L5:
        if ((r2 instanceof lv2) == true) goto L8;
        return false;
    L8:
        return this.b.equals(((lv2) r2).b);
    }

    @Override // defpackage.t41
    public final void f(boolean r1) {
        this.a.f(r1);
    }

    @Override // defpackage.t41
    public final tb1 g(int r2) {
        int r3 = this.a.i(r2);
        return this.b.d[r3];
    }

    @Override // defpackage.t41
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    @Override // defpackage.t41
    public final int i(int r1) {
        return this.a.i(r1);
    }

    @Override // defpackage.t41
    public final int j(long r1, List r3) {
        return this.a.j(r1, r3);
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
        int r0 = this.a.l();
        return this.b.d[r0];
    }

    @Override // defpackage.t41
    public final int n() {
        return this.a.n();
    }

    @Override // defpackage.t41
    public final boolean o(int r1, long r2) {
        return this.a.o(r1, r2);
    }

    @Override // defpackage.t41
    public final void p(float r1) {
        this.a.p(r1);
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
    public final int t(int r1) {
        return this.a.t(r1);
    }

    public final boolean u(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof lv2) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((lv2) r2).a);
    }
}
