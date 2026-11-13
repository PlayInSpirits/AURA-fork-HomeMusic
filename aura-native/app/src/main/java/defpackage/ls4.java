package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ls4 {
    public final he a;
    public final zs4 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final oo0 g;
    public final r62 h;
    public final ha1 i;
    public final long j;

    public ls4(he heVar, zs4 zs4Var, List list, int i, boolean z, int i2, oo0 oo0Var, r62 r62Var, ha1 ha1Var, long j) {
        this.a = heVar;
        this.b = zs4Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = oo0Var;
        this.h = r62Var;
        this.i = ha1Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls4)) {
            return false;
        }
        ls4 ls4Var = (ls4) obj;
        return h12.c(this.a, ls4Var.a) && h12.c(this.b, ls4Var.b) && this.c.equals(ls4Var.c) && this.d == ls4Var.d && this.e == ls4Var.e && this.f == ls4Var.f && h12.c(this.g, ls4Var.g) && this.h == ls4Var.h && h12.c(this.i, ls4Var.i) && nc0.b(this.j, ls4Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + f34.d(this.f, xa3.c((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid") + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + nc0.k(this.j) + ")";
    }
}
