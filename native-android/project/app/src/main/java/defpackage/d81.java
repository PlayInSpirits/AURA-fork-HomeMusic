package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements c81 {
    public final float a;
    public final bk4 b;

    public d81(float r3, float r4) {
        this.a = r4;
        bk4 r5 = new bk4();
        r5.a = 1.0f;
        double r0 = Math.sqrt(50.0d);
        r5.b = r0;
        if (((float) (r0 * r0)) > 0.0f) goto L5;
        qo3.a("Spring stiffness constant must be positive.");
    L5:
        r5.b = Math.sqrt(r3);
        this.b = r5;
    }

    @Override // defpackage.c81
    public final float b(long r3, float r5, float r6, float r7) {
        bk4 r2 = this.b;
        r2.a = r6;
        return Float.intBitsToFloat((int) (r2.a(r5, r7, r3 / 1000000) & 4294967295L));
    }

    @Override // defpackage.c81
    public final long c(float r26, float r27, float r28) {
        double r1 = this.b.b;
        float r0 = this.a;
        float r2 = (r26 - r27) / r0;
        double r3 = (float) (r1 * r1);
        double r4 = r28 / r0;
        double r5 = r2;
        double r7 = Math.sqrt(r3) * 2.0d;
        double r11 = (r7 * r7) - (r3 * 4.0d);
        if (r11 >= 0.0d) goto L5;
        double r13 = 0.0d;
    L6:
        if (r11 >= 0.0d) goto L8;
        Math.sqrt(Math.abs(r11));
    L8:
        double r8 = ((-r7) + r13) * 0.5d;
        if (r5 == 0.0d) goto L11;
    L13:
        if (r5 >= 0.0d) goto L15;
        r4 = -r4;
    L15:
        double r6 = Math.abs(r5);
        double r12 = r8 * r6;
        double r9 = r4 - r12;
        double r10 = Math.log(Math.abs(1.0d / r6)) / r8;
        double r15 = Math.log(Math.abs(1.0d / r9));
        double r17 = r15;
        int r14 = 0;
    L17:
        if (r14 >= 6) goto L19;
        r17 = r15 - Math.log(Math.abs(r17 / r8));
        r14 = r14 + 1;
        goto L17
    L19:
        double r16 = r17 / r8;
        if ((Double.doubleToRawLongBits(r10) & Long.MAX_VALUE) < 9218868437227405312L) goto L22;
        r10 = r16;
    L25:
        double r18 = (-(r12 + r9)) / (r8 * r9);
        double r19 = r8 * r18;
        double r110 = (Math.exp(r19) * (r9 * r18)) + (Math.exp(r19) * r6);
        double r111 = -1.0d;
        if (Double.isNaN(r18) == false) goto L28;
    L40:
        double r20 = Double.MAX_VALUE;
        int r21 = 0;
    L42:
        if (r20 <= 0.001d) goto L46;
        if (r21 >= 100) goto L46;
        r21 = r21 + 1;
        double r112 = r8 * r10;
        double r22 = r10 - (((Math.exp(r112) * ((r9 * r10) + r6)) + r111) / (Math.exp(r112) * (((r112 + 1.0d) * r9) + r12)));
        r20 = Math.abs(r10 - r22);
        r10 = r22;
    L46:
        long r23 = (long) (r10 * 1000.0d);
    L48:
        return r23 * 1000000;
    L28:
        if (r18 <= 0.0d) goto L40;
        if (r18 > 0.0d) goto L33;
    L39:
        r10 = (-(2.0d / r8)) - (r6 / r9);
        r111 = 1.0d;
        goto L40
    L33:
        if ((-r110) >= 1.0d) goto L39;
        if (r9 >= 0.0d) goto L40;
        if (r6 <= 0.0d) goto L40;
        r10 = 0.0d;
        goto L40
    L22:
        if ((Double.doubleToRawLongBits(r16) & Long.MAX_VALUE) >= 9218868437227405312L) goto L25;
        r10 = Math.max(r10, r16);
        goto L25
    L11:
        if (r4 != 0.0d) goto L13;
        r23 = 0;
        goto L48
    L5:
        r13 = Math.sqrt(r11);
        goto L6
    }

    @Override // defpackage.c81
    public final float d(float r1, float r2, float r3) {
        return 0.0f;
    }

    @Override // defpackage.c81
    public final float e(long r3, float r5, float r6, float r7) {
        bk4 r2 = this.b;
        r2.a = r6;
        return Float.intBitsToFloat((int) (r2.a(r5, r7, r3 / 1000000) >> 32));
    }

    public /* synthetic */ d81(float r2) {
        this(r2, 0.01f);
    }
}
