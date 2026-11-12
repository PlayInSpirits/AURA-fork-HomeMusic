package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface sv0 extends oo0 {
    static /* synthetic */ void I(sv0 r0, nc r1, uo r2, float r3, ym4 r4, int r5) {
        q05 r6 = r4;
        if ((r5 & 8) == 0) goto L5;
        r6 = c71.d;
    L5:
        r0.d(r1, r2, r3, r6);
    }

    static void l(sv0 r13, long r14, long r16, int r18) {
        int r1 = 0;
        if ((r18 & 4) == 0) goto L5;
        long r2 = r13.P();
        float r4 = Float.intBitsToFloat((int) (r2 >> 32)) - Float.intBitsToFloat(0);
        float r3 = Float.intBitsToFloat((int) (r2 & 4294967295L)) - Float.intBitsToFloat(0);
        long r9 = (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r3) & 4294967295L);
    L6:
        c71 r11 = c71.d;
        if ((r18 & 64) == 0) goto L9;
        r1 = 3;
    L9:
        r13.H(r14, 0, r9, r11, r1);
        return;
    L5:
        r9 = r16;
        goto L6
    }

    static void p(sv0 r13, cc r14, long r15, long r17, float r19, dt r20, int r21, int r22) {
        if ((r22 & 16) == 0) goto L5;
        long r8 = r15;
    L7:
        if ((r22 & 512) == 0) goto L9;
        int r12 = 1;
    L10:
        r13.U(r14, 0, r15, r8, r19, r20, r12);
        return;
    L9:
        r12 = r21;
        goto L10
    L5:
        r8 = r17;
        goto L7
    }

    void H(long r1, long r3, long r5, q05 r7, int r8);

    i61 O();

    default long P() {
        return O().j();
    }

    void U(cc r1, long r2, long r4, long r6, float r8, dt r9, int r10);

    default long W() {
        return h12.q(O().j());
    }

    void d(nc r1, uo r2, float r3, q05 r4);

    r62 getLayoutDirection();
}
