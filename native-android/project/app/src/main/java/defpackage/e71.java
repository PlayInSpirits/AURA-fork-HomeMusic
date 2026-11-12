package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 extends cx2 implements u62 {
    public lq0 B;
    public float C;

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!nc0.d(j) || this.B == lq0.n) {
            iJ = nc0.j(j);
            iH = nc0.h(j);
        } else {
            int iRound = Math.round(nc0.h(j) * this.C);
            int iJ2 = nc0.j(j);
            iJ = nc0.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!nc0.c(j) || this.B == lq0.o) {
            int i2 = nc0.i(j);
            int iG2 = nc0.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(nc0.g(j) * this.C);
            int i3 = nc0.i(j);
            iG = nc0.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        jg3 jg3VarR = pi2Var.r(qc0.a(iJ, iH, iG, i));
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new la(jg3VarR, 1));
    }
}
