package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh2 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ zh2(tv1 r1) {
        this.a = 26;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r23) {
        double r1 = 100.0d;
        double r3 = 85.0d;
        double r6 = 98.0d;
        double r8 = 10.0d;
        double r10 = 80.0d;
        double r14 = 6.0d;
        double r16 = 90.0d;
        switch(this.a) {
            case 0: goto L141;
            case 1: goto L139;
            case 2: goto L133;
            case 3: goto L131;
            case 4: goto L125;
            case 5: goto L123;
            case 6: goto L118;
            case 7: goto L116;
            case 8: goto L110;
            case 9: goto L108;
            case 10: goto L77;
            case 11: goto L73;
            case 12: goto L70;
            case 13: goto L65;
            case 14: goto L59;
            case 15: goto L56;
            case 16: goto L54;
            case 17: goto L53;
            case 18: goto L39;
            case 19: goto L38;
            case 20: goto L33;
            case 21: goto L31;
            case 22: goto L29;
            case 23: goto L23;
            case 24: goto L21;
            case 25: goto L16;
            case 26: goto L13;
            case 27: goto L12;
            case 28: goto L7;
            default: goto L5;
        };
    L13:
        d64 r0 = (d64) r23;
        return gy0.c(new zh2(19), new zh2(20), null, null);
    L39:
        d64 r2 = (d64) r23;
        if (tv1.B(r2) == true) goto L151;
        int r4 = r2.b;
        boolean r5 = r2.c;
        if (r4 != 1) goto L48;
        if (r5 == true) goto L152;
        r3 = 25.0d;
    L152:
        return Double.valueOf(r3);
    L48:
        if (r5 == false) goto L51;
        r16 = 30.0d;
    L51:
        return Double.valueOf(r16);
    L151:
        return Double.valueOf(tv1.D(r2.a, r2));
    L54:
        d64 r7 = (d64) r23;
        return Double.valueOf(gy0.a(r7, new m7(29), new zx0(r7, 2), new ay0(null, r7), null, null, null, null));
    L56:
        d64 r9 = (d64) r23;
        zh2 r11 = new zh2(0);
        return Double.valueOf(gy0.a(r9, r11, new zx0(r9, 1), new by0(r11, r9, null), null, null, null, new m7(23)));
    L70:
        d64 r12 = (d64) r23;
        return Double.valueOf(0.0d);
    L77:
        d64 r13 = (d64) r23;
        boolean r15 = tv1.C(r13);
        tu4 r17 = r13.f;
        boolean r18 = r13.c;
        if (r15 == false) goto L82;
        if (r18 == false) goto L153;
        r3 = 30.0d;
    L153:
        return Double.valueOf(r3);
    L82:
        if (r18 == false) goto L84;
        double r19 = 30.0d;
    L86:
        if (tv1.B(r13) == false) goto L154;
        double r20 = r17.a;
        double r21 = r17.b;
        ol1 r22 = ol1.a(r20, r21, r19);
        double r24 = r22.b;
        if (r24 >= r21) goto L106;
    L91:
        if (r22.b >= r21) goto L106;
        if (r18 == true) goto L94;
        double r110 = -1.0d;
    L95:
        r19 = r19 + r110;
        ol1 r111 = ol1.a(r20, r21, r19);
        double r112 = r111.b;
        if (r24 > r112) goto L106;
        if (Math.abs(r112 - r21) < 0.4d) goto L106;
        boolean r113 = r18;
        double r25 = r20;
        if (Math.abs(r111.b - r21) >= Math.abs(r22.b - r21)) goto L104;
        r22 = r111;
    L104:
        r24 = Math.max(r24, r111.b);
        r20 = r25;
        r18 = r113;
        goto L91
    L94:
        r110 = 1.0d;
    L106:
        return Double.valueOf(tv1.D(ol1.a(r17.a, r17.b, r19), r13));
    L154:
        return Double.valueOf(r19);
    L84:
        r19 = 90.0d;
        goto L86
    L5:
        return ((d64) r23).h;
    L7:
        if (((d64) r23).c == false) goto L10;
        r10 = 30.0d;
    L10:
        return Double.valueOf(r10);
    L12:
        return ((d64) r23).i;
    L16:
        if (((d64) r23).c == false) goto L19;
        r8 = 90.0d;
    L19:
        return Double.valueOf(r8);
    L21:
        return ((d64) r23).h;
    L23:
        if (((d64) r23).c == false) goto L25;
        double r26 = 17.0d;
    L27:
        return Double.valueOf(r26);
    L25:
        r26 = 92.0d;
        goto L27
    L29:
        return ((d64) r23).h;
    L31:
        return ((d64) r23).h;
    L33:
        if (((d64) r23).c == false) goto L36;
        r6 = 6.0d;
    L36:
        return Double.valueOf(r6);
    L38:
        return ((d64) r23).h;
    L53:
        return ((d64) r23).e;
    L59:
        if (((d64) r23).c == false) goto L61;
        double r27 = 0.2d;
    L63:
        return Double.valueOf(r27);
    L61:
        r27 = 0.12d;
        goto L63
    L65:
        if (((d64) r23).c == true) goto L69;
        r1 = 0.0d;
    L69:
        return Double.valueOf(r1);
    L73:
        if (((d64) r23).c == false) goto L76;
        r6 = 6.0d;
    L76:
        return Double.valueOf(r6);
    L108:
        return ((d64) r23).f;
    L110:
        if (((d64) r23).c == true) goto L114;
        r8 = 96.0d;
    L114:
        return Double.valueOf(r8);
    L116:
        return ((d64) r23).h;
    L118:
        if (((d64) r23).c == false) goto L121;
        r16 = 30.0d;
    L121:
        return Double.valueOf(r16);
    L123:
        return ((d64) r23).e;
    L125:
        if (((d64) r23).c == true) goto L129;
        r10 = 30.0d;
    L129:
        return Double.valueOf(r10);
    L131:
        return ((d64) r23).i;
    L133:
        if (((d64) r23).c == true) goto L137;
        r14 = 87.0d;
    L137:
        return Double.valueOf(r14);
    L139:
        return ((d64) r23).h;
    L141:
        if (((d64) r23).c == true) goto L145;
        r1 = 0.0d;
    L145:
        return Double.valueOf(r1);
    }

    public /* synthetic */ zh2(int r1) {
        this.a = r1;
    }
}
