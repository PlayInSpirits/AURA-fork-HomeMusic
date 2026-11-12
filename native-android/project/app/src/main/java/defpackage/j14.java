package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j14 {
    public oz3 a;
    public pr3 b;
    public int c;
    public String d;
    public jl1 e;
    public sl1 f;
    public n14 g;
    public k14 h;
    public k14 i;
    public k14 j;
    public long k;
    public long l;
    public y10 m;
    public gf1 n;

    public j14() {
        this.c = -1;
        this.g = xe5.e;
        this.n = gq1.q;
        this.f = new sl1();
    }

    public final k14 a() {
        int r4 = this.c;
        if (r4 < 0) goto L18;
        oz3 r1 = this.a;
        if (r1 == null) goto L16;
        pr3 r2 = this.b;
        if (r2 == null) goto L14;
        String r3 = this.d;
        if (r3 != null) goto L11;
        kf2.o("message == null");
        return null;
    L11:
        return new k14(r1, r2, r3, r4, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    L14:
        kf2.o("protocol == null");
        return null;
    L16:
        kf2.o("request == null");
        return null;
    L18:
        nz2.e(this.c, "code < 0: ");
        return null;
    }
}
