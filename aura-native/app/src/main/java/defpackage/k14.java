package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k14 implements Closeable {
    public final gf1 A;
    public ix B;
    public final boolean C;
    public final oz3 n;
    public final pr3 o;
    public final String p;
    public final int q;
    public final jl1 r;
    public final tl1 s;
    public final n14 t;
    public final k14 u;
    public final k14 v;
    public final k14 w;
    public final long x;
    public final long y;
    public final y10 z;

    public k14(oz3 oz3Var, pr3 pr3Var, String str, int i, jl1 jl1Var, tl1 tl1Var, n14 n14Var, k14 k14Var, k14 k14Var2, k14 k14Var3, long j, long j2, y10 y10Var, gf1 gf1Var) {
        oz3Var.getClass();
        pr3Var.getClass();
        str.getClass();
        n14Var.getClass();
        gf1Var.getClass();
        this.n = oz3Var;
        this.o = pr3Var;
        this.p = str;
        this.q = i;
        this.r = jl1Var;
        this.s = tl1Var;
        this.t = n14Var;
        this.u = k14Var;
        this.v = k14Var2;
        this.w = k14Var3;
        this.x = j;
        this.y = j2;
        this.z = y10Var;
        this.A = gf1Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.C = z;
    }

    public final ix b() {
        ix ixVar = this.B;
        if (ixVar != null) {
            return ixVar;
        }
        int i = ix.n;
        ix O = au0.O(this.s);
        this.B = O;
        return O;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.close();
    }

    public final j14 f() {
        j14 j14Var = new j14();
        j14Var.c = -1;
        j14Var.g = xe5.e;
        j14Var.n = gq1.q;
        j14Var.a = this.n;
        j14Var.b = this.o;
        j14Var.c = this.q;
        j14Var.d = this.p;
        j14Var.e = this.r;
        j14Var.f = this.s.d();
        j14Var.g = this.t;
        j14Var.h = this.u;
        j14Var.i = this.v;
        j14Var.j = this.w;
        j14Var.k = this.x;
        j14Var.l = this.y;
        j14Var.m = this.z;
        j14Var.n = this.A;
        return j14Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.o + ", code=" + this.q + ", message=" + this.p + ", url=" + this.n.a + '}';
    }
}
