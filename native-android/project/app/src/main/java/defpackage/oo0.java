package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface oo0 {
    default float B(int i) {
        return i / g();
    }

    default float D(float f) {
        return f / g();
    }

    float J();

    default float M(float f) {
        return g() * f;
    }

    default int V(float f) {
        float fM = M(f);
        if (Float.isInfinite(fM)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fM);
    }

    default long Y(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fM = M(Float.intBitsToFloat((int) (j >> 32)));
        float fM2 = M(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM2)) & 4294967295L);
    }

    default float a0(long j) {
        if (!ct4.a(bt4.b(j), 4294967296L)) {
            ez1.b("Only Sp can convert to Px");
        }
        return M(o(j));
    }

    float g();

    default long h(float f) {
        float[] fArr = cb1.a;
        if (J() < 1.03f) {
            return su3.z(4294967296L, f / J());
        }
        bb1 bb1VarA = cb1.a(J());
        return su3.z(4294967296L, bb1VarA != null ? bb1VarA.a(f) : f / J());
    }

    default long i(long j) {
        if (j != 9205357640488583168L) {
            return l93.a(D(Float.intBitsToFloat((int) (j >> 32))), D(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float o(long j) {
        if (!ct4.a(bt4.b(j), 4294967296L)) {
            ez1.b("Only Sp can convert to Px");
        }
        float[] fArr = cb1.a;
        if (J() < 1.03f) {
            return J() * bt4.c(j);
        }
        bb1 bb1VarA = cb1.a(J());
        if (bb1VarA != null) {
            return bb1VarA.b(bt4.c(j));
        }
        return J() * bt4.c(j);
    }

    default long w(float f) {
        return h(D(f));
    }
}
