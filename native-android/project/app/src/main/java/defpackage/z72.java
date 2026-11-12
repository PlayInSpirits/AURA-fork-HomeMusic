package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 extends cx2 implements u62 {
    public static final x72 E = new x72();
    public dc3 B;
    public hg3 C;
    public hb3 D;

    public final boolean q0(v72 v72Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.D != hb3.n) {
                }
            } else if (i != 1 && i != 2) {
                kf2.o("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (r0(i) ? v72Var.a > 0 : v72Var.b < this.B.a.n() - 1) {
                return true;
            }
        } else if (this.D != hb3.o) {
            if (r0(i)) {
            }
        }
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        jg3 jg3VarR = pi2Var.r(j);
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new la(jg3VarR, 2));
    }

    public final boolean r0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = j51.O(this).K.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            er1.n();
            return false;
        }
        if (i != 4) {
            kf2.o("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = j51.O(this).K.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        er1.n();
        return false;
    }
}
