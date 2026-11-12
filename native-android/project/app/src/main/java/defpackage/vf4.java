package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vf4 extends cx2 implements u62 {
    public float B;
    public float C;
    public float D;
    public float E;
    public boolean F;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        int iV;
        int iV2;
        int iV3;
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        int i2 = 0;
        if (Float.isNaN(this.D)) {
            iV = Integer.MAX_VALUE;
        } else {
            iV = cf2Var.V(this.D);
            if (iV < 0) {
                iV = 0;
            }
        }
        if (Float.isNaN(this.E)) {
            iV2 = Integer.MAX_VALUE;
        } else {
            iV2 = cf2Var.V(this.E);
            if (iV2 < 0) {
                iV2 = 0;
            }
        }
        if (Float.isNaN(this.B)) {
            iV3 = 0;
        } else {
            iV3 = cf2Var.V(this.B);
            if (iV3 < 0) {
                iV3 = 0;
            }
            if (iV3 > iV) {
                iV3 = iV;
            }
            if (iV3 == Integer.MAX_VALUE) {
                iV3 = 0;
            }
        }
        if (!Float.isNaN(this.C)) {
            int iV4 = cf2Var.V(this.C);
            if (iV4 < 0) {
                iV4 = 0;
            }
            if (iV4 > iV2) {
                iV4 = iV2;
            }
            if (iV4 != Integer.MAX_VALUE) {
                i2 = iV4;
            }
        }
        long jA2 = qc0.a(iV3, iV, i2, iV2);
        if (this.F) {
            int iJ2 = nc0.j(j);
            int iH2 = nc0.h(j);
            int i3 = nc0.i(j);
            int iG2 = nc0.g(j);
            int iJ3 = nc0.j(jA2);
            if (iJ3 < iJ2) {
                iJ3 = iJ2;
            }
            if (iJ3 > iH2) {
                iJ3 = iH2;
            }
            int iH3 = nc0.h(jA2);
            if (iH3 >= iJ2) {
                iJ2 = iH3;
            }
            if (iJ2 <= iH2) {
                iH2 = iJ2;
            }
            int i4 = nc0.i(jA2);
            if (i4 < i3) {
                i4 = i3;
            }
            if (i4 > iG2) {
                i4 = iG2;
            }
            int iG3 = nc0.g(jA2);
            if (iG3 >= i3) {
                i3 = iG3;
            }
            if (i3 <= iG2) {
                iG2 = i3;
            }
            jA = qc0.a(iJ3, iH2, i4, iG2);
        } else {
            if (Float.isNaN(this.B)) {
                iJ = nc0.j(j);
                int iH4 = nc0.h(jA2);
                if (iJ > iH4) {
                    iJ = iH4;
                }
            } else {
                iJ = nc0.j(jA2);
            }
            if (Float.isNaN(this.D)) {
                iH = nc0.h(j);
                int iJ4 = nc0.j(jA2);
                if (iH < iJ4) {
                    iH = iJ4;
                }
            } else {
                iH = nc0.h(jA2);
            }
            if (Float.isNaN(this.C)) {
                i = nc0.i(j);
                int iG4 = nc0.g(jA2);
                if (i > iG4) {
                    i = iG4;
                }
            } else {
                i = nc0.i(jA2);
            }
            if (Float.isNaN(this.E)) {
                iG = nc0.g(j);
                int i5 = nc0.i(jA2);
                if (iG < i5) {
                    iG = i5;
                }
            } else {
                iG = nc0.g(jA2);
            }
            jA = qc0.a(iJ, iH, i, iG);
        }
        jg3 jg3VarR = pi2Var.r(jA);
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new la(jg3VarR, 5));
    }
}
