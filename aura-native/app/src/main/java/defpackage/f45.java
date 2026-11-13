package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f45 extends d45 {
    public final float A;
    public final String n;
    public final List o;
    public final int p;
    public final uo q;
    public final float r;
    public final uo s;
    public final float t;
    public final float u;
    public final int v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public f45(String str, List list, int i, uo uoVar, float f, uo uoVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.n = str;
        this.o = list;
        this.p = i;
        this.q = uoVar;
        this.r = f;
        this.s = uoVar2;
        this.t = f2;
        this.u = f3;
        this.v = i2;
        this.w = i3;
        this.x = f4;
        this.y = f5;
        this.z = f6;
        this.A = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f45.class != obj.getClass()) {
            return false;
        }
        f45 f45Var = (f45) obj;
        return this.n.equals(f45Var.n) && h12.c(this.q, f45Var.q) && this.r == f45Var.r && h12.c(this.s, f45Var.s) && this.t == f45Var.t && this.u == f45Var.u && this.v == f45Var.v && this.w == f45Var.w && this.x == f45Var.x && this.y == f45Var.y && this.z == f45Var.z && this.A == f45Var.A && this.p == f45Var.p && h12.c(this.o, f45Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + (this.n.hashCode() * 31)) * 31;
        uo uoVar = this.q;
        int d = b11.d((hashCode + (uoVar != null ? uoVar.hashCode() : 0)) * 31, this.r, 31);
        uo uoVar2 = this.s;
        return Integer.hashCode(this.p) + b11.d(b11.d(b11.d(b11.d(f34.d(this.w, f34.d(this.v, b11.d(b11.d((d + (uoVar2 != null ? uoVar2.hashCode() : 0)) * 31, this.t, 31), this.u, 31), 31), 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31);
    }
}
