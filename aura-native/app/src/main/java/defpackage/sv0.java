package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface sv0 extends oo0 {
    static /* synthetic */ void I(sv0 sv0Var, nc ncVar, uo uoVar, float f, ym4 ym4Var, int i) {
        q05 q05Var = ym4Var;
        if ((i & 8) != 0) {
            q05Var = c71.d;
        }
        sv0Var.d(ncVar, uoVar, f, q05Var);
    }

    static void l(sv0 sv0Var, long j, long j2, int i) {
        long j3;
        if ((i & 4) != 0) {
            long P = sv0Var.P();
            j3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (P >> 32)) - Float.intBitsToFloat(0)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (P & 4294967295L)) - Float.intBitsToFloat(0)) & 4294967295L);
        } else {
            j3 = j2;
        }
        sv0Var.H(j, 0L, j3, c71.d, (i & 64) != 0 ? 3 : 0);
    }

    static void p(sv0 sv0Var, cc ccVar, long j, long j2, float f, dt dtVar, int i, int i2) {
        sv0Var.U(ccVar, 0L, j, (i2 & 16) != 0 ? j : j2, f, dtVar, (i2 & 512) != 0 ? 1 : i);
    }

    void H(long j, long j2, long j3, q05 q05Var, int i);

    i61 O();

    default long P() {
        return O().j();
    }

    void U(cc ccVar, long j, long j2, long j3, float f, dt dtVar, int i);

    default long W() {
        return h12.q(O().j());
    }

    void d(nc ncVar, uo uoVar, float f, q05 q05Var);

    r62 getLayoutDirection();
}
