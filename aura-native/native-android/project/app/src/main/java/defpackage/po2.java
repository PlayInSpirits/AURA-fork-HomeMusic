package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 {
    public final mt2 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public po2(mt2 mt2Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        rr2.l(!z5 || z3);
        rr2.l(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        rr2.l(z6);
        this.a = mt2Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final po2 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new po2(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final po2 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new po2(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && po2.class == obj.getClass()) {
            po2 po2Var = (po2) obj;
            if (this.b == po2Var.b && this.c == po2Var.c && this.d == po2Var.d && this.e == po2Var.e && this.f == po2Var.f && this.g == po2Var.g && this.h == po2Var.h && this.i == po2Var.i && this.j == po2Var.j && Objects.equals(this.a, po2Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
