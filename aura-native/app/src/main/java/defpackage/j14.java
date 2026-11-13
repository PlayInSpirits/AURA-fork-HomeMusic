package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class j14 {
    public oz3 a;
    public pr3 b;
    public String d;
    public jl1 e;
    public k14 h;
    public k14 i;
    public k14 j;
    public long k;
    public long l;
    public y10 m;
    public int c = -1;
    public n14 g = xe5.e;
    public gf1 n = gq1.q;
    public sl1 f = new sl1();

    public final k14 a() {
        int i = this.c;
        if (i < 0) {
            nz2.e(this.c, "code < 0: ");
            return null;
        }
        oz3 oz3Var = this.a;
        if (oz3Var == null) {
            kf2.o("request == null");
            return null;
        }
        pr3 pr3Var = this.b;
        if (pr3Var == null) {
            kf2.o("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new k14(oz3Var, pr3Var, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }
        kf2.o("message == null");
        return null;
    }
}
