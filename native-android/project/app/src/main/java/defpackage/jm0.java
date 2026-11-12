package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 implements y43 {
    public final lm0 n;
    public final r62 o;

    public jm0(lm0 r1, r62 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.y43
    public final long R(int r1, long r2, long r4) {
        if (r1 == 2) goto L5;
        return 0;
    L5:
        if (Float.intBitsToFloat((int) (r4 >> 32)) != 0.0f) goto L8;
        return 0;
    L8:
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.y43
    public final Object b0(long r1, long r3, vd0 r5) {
        return new k45(k45.a(r3, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.y43
    public final long x(int r9, long r10) {
        boolean r0 = true;
        if (r9 != 1) goto L21;
        lm0 r11 = this.n;
        if (Math.abs(r11.l()) <= 1.0E-6d) goto L23;
        int r2 = (int) (r10 >> 32);
        if (Math.abs(Float.intBitsToFloat(r2)) <= 0.0f) goto L24;
        qc3 r3 = r11.m();
        float r5 = r11.l() * r11.o();
        float r4 = ((r3.b + r3.c) * (-Math.signum(r11.l()))) + r5;
        if (r11.l() <= 0.0f) goto L11;
        r5 = r4;
        r4 = r5;
    L11:
        float r6 = gb.l(Float.intBitsToFloat(r2), r5, r4);
        if (this.o == r62.o) goto L15;
        r0 = false;
    L15:
        ml3 r8 = r11.k;
        if (r0 == false) goto L18;
        float r12 = r8.d(r6);
    L19:
        float r13 = Float.intBitsToFloat((int) (r10 & 4294967295L));
        long r14 = Float.floatToRawIntBits(r12);
        return (((long) Float.floatToRawIntBits(r13)) & 4294967295L) | (r14 << 32);
    L18:
        r12 = -r8.d(-r6);
        goto L19
    L24:
        return 0;
    L23:
        return 0;
    L21:
        return 0;
    }
}
