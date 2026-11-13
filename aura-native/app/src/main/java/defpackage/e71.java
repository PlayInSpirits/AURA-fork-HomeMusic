package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e71 extends cx2 implements u62 {
    public e71() {
        super();
    }

    public lq0 B;
    public float C;

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (!nc0.d(j) || this.B == lq0.n) {
            j2 = nc0.j(j);
            h = nc0.h(j);
        } else {
            int round = Math.round(nc0.h(j) * this.C);
            int j3 = nc0.j(j);
            j2 = nc0.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        }
        if (!nc0.c(j) || this.B == lq0.o) {
            int i3 = nc0.i(j);
            int g = nc0.g(j);
            i = i3;
            i2 = g;
        } else {
            int round2 = Math.round(nc0.g(j) * this.C);
            int i4 = nc0.i(j);
            i = nc0.g(j);
            if (round2 < i4) {
                round2 = i4;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        jg3 r = pi2Var.r(qc0.a(j2, h, i, i2));
        return cf2Var.v(r.n, r.o, v01.n, new la(r, 1));
    }
}
