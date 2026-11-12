package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements ry0 {
    public final float n;
    public final float o;
    public final float p;
    public final float q;

    public gg0(float r12, float r13) {
        this.n = r12;
        this.o = r13;
        if (Float.isNaN(r12) == false) goto L5;
    L11:
        qo3.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + r12 + ", 0.0, " + r13 + ", 1.0.");
    L12:
        float[] r14 = new float[5];
        double r3 = -Math.sqrt(9.0d);
        int r0 = 0;
        int r15 = te5.S((float) ((-(r3 + 3.0d)) / (-6.0d)), r14, 0);
        int r4 = te5.S((float) ((r3 - 3.0d) / (-6.0d)), r14, r15) + r15;
        if (r4 <= 1) goto L20;
        float r5 = r14[0];
        float r6 = r14[1];
        if (r5 <= r6) goto L18;
        r14[0] = r6;
        r14[1] = r5;
        goto L20
    L18:
        if (r5 != r6) goto L20;
        r4 = r4 - 1;
    L20:
        int r16 = te5.S(0.5f, r14, r4) + r4;
        float r7 = Math.min(0.0f, 1.0f);
        float r2 = Math.max(0.0f, 1.0f);
    L21:
        if (r0 >= r16) goto L23;
        float r8 = r14[r0];
        float r9 = ((((((-2.0f) * r8) + 3.0f) * r8) + 0.0f) * r8) + 0.0f;
        r7 = Math.min(r7, r9);
        r2 = Math.max(r2, r9);
        r0 = r0 + 1;
        goto L21
    L23:
        long r17 = (Float.floatToRawIntBits(r7) << 32) | (((long) Float.floatToRawIntBits(r2)) & 4294967295L);
        this.p = Float.intBitsToFloat((int) (r17 >> 32));
        this.q = Float.intBitsToFloat((int) (r17 & 4294967295L));
        return;
    L5:
        if (Float.isNaN(0.0f) == true) goto L11;
        if (Float.isNaN(r13) == true) goto L11;
        if (Float.isNaN(1.0f) == true) goto L11;
        goto L11
    }

    @Override // defpackage.ry0
    public final float b(float r27) {
        if (r27 > 0.0f) goto L5;
    L135:
        return r27;
    L5:
        if (r27 >= 1.0f) goto L135;
        float r4 = Math.max(r27, 1.1920929E-7f);
        float r5 = 0.0f - r4;
        float r6 = this.n;
        float r7 = r6 - r4;
        float r8 = this.o;
        float r9 = r8 - r4;
        double r10 = r5;
        double r12 = ((r10 - (((double) r7) * 2.0d)) + ((double) r9)) * 3.0d;
        double r2 = ((double) (r7 - r5)) * 3.0d;
        double r13 = ((((double) (r7 - r9)) * 3.0d) + ((double) (-r5))) + ((double) (1.0f - r4));
        float r14 = Float.NaN;
        if (Math.abs(r13 - 0.0d) < 1.0E-7d) goto L9;
        double r22 = r12 / r13;
        double r3 = r2 / r13;
        double r11 = r10 / r13;
        double r15 = ((r3 * 3.0d) - (r22 * r22)) / 9.0d;
        double r16 = ((r11 * 27.0d) + ((((2.0d * r22) * r22) * r22) - ((9.0d * r22) * r3))) / 54.0d;
        double r17 = r15 * (r15 * r15);
        double r18 = (r16 * r16) + r17;
        double r19 = r22 / 3.0d;
        if (r18 >= 0.0d) goto L91;
        double r20 = Math.sqrt(-r17);
        double r110 = (-r16) / r20;
        if (r110 >= (-1.0d)) goto L53;
        r110 = -1.0d;
    L53:
        if (r110 <= 1.0d) goto L55;
        r110 = 1.0d;
    L55:
        double r111 = Math.acos(r110);
        double r21 = rr2.B((float) r20) * 2.0f;
        float r23 = (float) ((Math.cos(r111 / 3.0d) * r21) - r19);
        if (r23 >= 0.0f) goto L58;
        float r112 = 0.0f;
    L60:
        if (r112 <= 1.0f) goto L63;
        r112 = 1.0f;
    L63:
        if (Math.abs(r112 - r23) <= 1.05E-6f) goto L66;
        r112 = Float.NaN;
    L66:
        if (Float.isNaN(r112) == true) goto L68;
    L67:
        r14 = r112;
    L125:
        if (Float.isNaN(r14) == true) goto L133;
        float r1 = ((((((-0.6666666f) * r14) + 1.0f) * r14) + 0.0f) * 3.0f) * r14;
        float r24 = this.p;
        if (r1 >= r24) goto L129;
        r1 = r24;
    L129:
        float r0 = this.q;
        if (r1 <= r0) goto L132;
        return r0;
    L132:
        return r1;
    L133:
        StringBuilder r25 = b11.r("The cubic curve with parameters (", r6, ", 0.0, ", r8, ", 1.0) has no solution at ");
        r25.append(r27);
        throw new IllegalArgumentException(r25.toString());
    L68:
        float r26 = (float) ((Math.cos((6.283185307179586d + r111) / 3.0d) * r21) - r19);
        if (r26 >= 0.0f) goto L71;
        r112 = 0.0f;
    L73:
        if (r112 <= 1.0f) goto L76;
        r112 = 1.0f;
    L76:
        if (Math.abs(r112 - r26) <= 1.05E-6f) goto L79;
        r112 = Float.NaN;
    L79:
        if (Float.isNaN(r112) == false) goto L67;
        float r28 = (float) ((Math.cos((r111 + 12.566370614359172d) / 3.0d) * r21) - r19);
        if (r28 >= 0.0f) goto L84;
        float r29 = 0.0f;
    L86:
        if (r29 <= 1.0f) goto L89;
        r29 = 1.0f;
    L89:
        if (Math.abs(r29 - r28) > 1.05E-6f) goto L125;
    L23:
        r14 = r29;
        goto L125
    L84:
        r29 = r28;
        goto L86
    L71:
        r112 = r26;
        goto L73
    L58:
        r112 = r23;
        goto L60
    L91:
        if (r18 != 0.0d) goto L115;
        float r30 = -rr2.B((float) r16);
        float r31 = (float) r19;
        float r113 = (2.0f * r30) - r31;
        if (r113 >= 0.0f) goto L95;
        float r32 = 0.0f;
    L97:
        if (r32 <= 1.0f) goto L100;
        r32 = 1.0f;
    L100:
        if (Math.abs(r32 - r113) <= 1.05E-6f) goto L103;
        r32 = Float.NaN;
    L103:
        if (Float.isNaN(r32) == true) goto L105;
        r14 = r32;
        goto L125
    L105:
        float r33 = (-r30) - r31;
        if (r33 >= 0.0f) goto L108;
        r29 = 0.0f;
    L110:
        if (r29 <= 1.0f) goto L113;
        r29 = 1.0f;
    L113:
        if (Math.abs(r29 - r33) <= 1.05E-6f) goto L23;
    L108:
        r29 = r33;
        goto L110
    L95:
        r32 = r113;
        goto L97
    L115:
        double r34 = Math.sqrt(r18);
        float r35 = (float) (((double) (rr2.B((float) ((-r16) + r34)) - rr2.B((float) (r16 + r34)))) - r19);
        if (r35 >= 0.0f) goto L118;
        r29 = 0.0f;
    L120:
        if (r29 <= 1.0f) goto L123;
        r29 = 1.0f;
    L123:
        if (Math.abs(r29 - r35) <= 1.05E-6f) goto L23;
    L118:
        r29 = r35;
        goto L120
    L9:
        if (Math.abs(r12 - 0.0d) < 1.0E-7d) goto L11;
        double r36 = Math.sqrt((r2 * r2) - ((4.0d * r12) * r10));
        double r114 = r12 * 2.0d;
        float r37 = (float) ((r36 - r2) / r114);
        if (r37 >= 0.0f) goto L27;
        float r115 = 0.0f;
    L29:
        if (r115 <= 1.0f) goto L32;
        r115 = 1.0f;
    L32:
        if (Math.abs(r115 - r37) <= 1.05E-6f) goto L35;
        r115 = Float.NaN;
    L35:
        if (Float.isNaN(r115) == true) goto L37;
        r14 = r115;
        goto L125
    L37:
        float r38 = (float) (((-r2) - r36) / r114);
        if (r38 >= 0.0f) goto L40;
        r29 = 0.0f;
    L42:
        if (r29 <= 1.0f) goto L45;
        r29 = 1.0f;
    L45:
        if (Math.abs(r29 - r38) <= 1.05E-6f) goto L23;
    L40:
        r29 = r38;
        goto L42
    L27:
        r115 = r37;
        goto L29
    L11:
        if (Math.abs(r2 - 0.0d) < 1.0E-7d) goto L125;
        float r39 = (float) ((-r10) / r2);
        if (r39 >= 0.0f) goto L16;
        r29 = 0.0f;
    L18:
        if (r29 <= 1.0f) goto L21;
        r29 = 1.0f;
    L21:
        if (Math.abs(r29 - r39) <= 1.05E-6f) goto L23;
    L16:
        r29 = r39;
        goto L18
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof gg0) == false) goto L10;
        gg0 r4 = (gg0) r3;
        float r0 = r4.n;
        if (this.n == r0) goto L7;
        return false;
    L7:
        if (this.o != r4.o) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r3 = b11.d(b11.d(Float.hashCode(this.n) * 31, 0.0f, 31), this.o, 31);
        return Float.hashCode(1.0f) + r3;
    }

    public final String toString() {
        return xa3.f("CubicBezierEasing(a=", this.n, ", b=0.0, c=", this.o, ", d=1.0)");
    }
}
