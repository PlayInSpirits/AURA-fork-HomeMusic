package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
final class b53 extends gx2 {
    public final y43 a;

    public b53(y43 y43Var) {
        this.a = y43Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new e53(this.a, null);
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        e53 e53Var = (e53) cx2Var;
        e53Var.B = this.a;
        na4 na4Var = e53Var.C;
        if (((e53) na4Var.n) == e53Var) {
            na4Var.n = null;
            na4Var.q = null;
            na4Var.p = gb.c;
        }
        na4 na4Var2 = new na4(10);
        e53Var.C = na4Var2;
        if (e53Var.A) {
            na4Var2.n = e53Var;
            na4Var2.o = null;
            e53Var.D = null;
            na4Var2.p = new wc(15, e53Var);
            na4Var2.q = e53Var.e0();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b53) && h12.c(((b53) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
