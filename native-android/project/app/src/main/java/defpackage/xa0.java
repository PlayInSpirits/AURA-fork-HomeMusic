package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xa0 {
    public final p50 a;
    public final p50 b;
    public final p50 c;
    public final float[] d;

    public xa0(p50 r9, p50 r10, int r11) {
        if (xl.m(r9.b, 12884901888L) == false) goto L5;
        p50 r0 = uo.b(r9);
    L7:
        if (xl.m(r10.b, 12884901888L) == false) goto L9;
        p50 r1 = uo.b(r10);
    L10:
        float[] r4 = wr1.e;
        if (r11 != 3) goto L28;
        boolean r12 = xl.m(r9.b, 12884901888L);
        boolean r2 = xl.m(r10.b, 12884901888L);
        if (r12 == false) goto L16;
        if (r2 == true) goto L28;
    L16:
        if (r12 == true) goto L18;
        if (r2 == false) goto L28;
    L18:
        if (r12 == true) goto L21;
        r9 = r10;
    L21:
        z95 r13 = ((k24) r9).d;
        if (r12 == false) goto L24;
        float[] r14 = r13.a();
    L25:
        if (r2 == false) goto L27;
        r4 = r13.a();
    L27:
        float[] r5 = {r14[0] / r4[0], r14[1] / r4[1], r14[2] / r4[2]};
    L29:
        this(r10, r0, r1, r5);
        return;
    L24:
        r14 = r4;
    L28:
        r5 = null;
        goto L29
    L9:
        r1 = r10;
        goto L10
    L5:
        r0 = r9;
        goto L7
    }

    public long a(long r10) {
        float r0 = x40.g(r10);
        float r1 = x40.f(r10);
        float r2 = x40.e(r10);
        float r7 = x40.d(r10);
        p50 r11 = this.b;
        long r3 = r11.d(r0, r1, r2);
        float r12 = Float.intBitsToFloat((int) (r3 >> 32));
        float r4 = Float.intBitsToFloat((int) (r3 & 4294967295L));
        float r13 = r11.e(r0, r1, r2);
        float[] r5 = this.d;
        if (r5 == null) goto L5;
        r12 = r12 * r5[0];
        r4 = r4 * r5[1];
        r13 = r13 * r5[2];
    L5:
        float r6 = r12;
        float r8 = r4;
        p50 r9 = this.c;
        return r9.f(r6, r8, r13, r7, this.a);
    }

    public xa0(p50 r1, p50 r2, p50 r3, float[] r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }
}
