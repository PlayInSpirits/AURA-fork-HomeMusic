package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface oo0 {
    default float B(int r1) {
        return r1 / g();
    }

    default float D(float r1) {
        return r1 / g();
    }

    float J();

    default float M(float r1) {
        return g() * r1;
    }

    default int V(float r1) {
        float r0 = M(r1);
        if (Float.isInfinite(r0) == false) goto L7;
        return Integer.MAX_VALUE;
    L7:
        return Math.round(r0);
    }

    default long Y(long r7) {
        if (r7 == 9205357640488583168L) goto L6;
        float r1 = M(Float.intBitsToFloat((int) (r7 >> 32)));
        float r6 = M(Float.intBitsToFloat((int) (r7 & 4294967295L)));
        return (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r6) & 4294967295L);
    L6:
        return 9205357640488583168L;
    }

    default float a0(long r5) {
        if (ct4.a(bt4.b(r5), 4294967296L) == true) goto L6;
        ez1.b("Only Sp can convert to Px");
    L6:
        return M(o(r5));
    }

    float g();

    default long h(float r4) {
        float[] r0 = cb1.a;
        if (J() < 1.03f) goto L11;
        bb1 r1 = cb1.a(J());
        if (r1 == null) goto L7;
        float r3 = r1.a(r4);
    L9:
        return su3.z(4294967296L, r3);
    L7:
        r3 = r4 / J();
        goto L9
    L11:
        return su3.z(4294967296L, r4 / J());
    }

    default long i(long r4) {
        if (r4 != 9205357640488583168L) goto L5;
        return 9205357640488583168L;
    L5:
        return l93.a(D(Float.intBitsToFloat((int) (r4 >> 32))), D(Float.intBitsToFloat((int) (r4 & 4294967295L))));
    }

    default float o(long r5) {
        if (ct4.a(bt4.b(r5), 4294967296L) == true) goto L5;
        ez1.b("Only Sp can convert to Px");
    L5:
        float[] r0 = cb1.a;
        if (J() < 1.03f) goto L13;
        bb1 r1 = cb1.a(J());
        if (r1 != null) goto L12;
        float r6 = bt4.c(r5);
        return J() * r6;
    L12:
        return r1.b(bt4.c(r5));
    L13:
        float r7 = bt4.c(r5);
        return J() * r7;
    }

    default long w(float r1) {
        return h(D(r1));
    }
}
