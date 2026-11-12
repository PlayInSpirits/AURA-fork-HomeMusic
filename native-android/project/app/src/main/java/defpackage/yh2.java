package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh2 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv1 b;

    public /* synthetic */ yh2(tv1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object r18) {
        int r1 = this.a;
        int r2 = 7;
        double r11 = 10.0d;
        int r5 = 1;
        tv1 r0 = this.b;
        switch(r1) {
            case 0: goto L72;
            case 1: goto L66;
            case 2: goto L64;
            case 3: goto L62;
            case 4: goto L49;
            case 5: goto L47;
            case 6: goto L45;
            case 7: goto L39;
            case 8: goto L37;
            case 9: goto L24;
            case 10: goto L22;
            case 11: goto L14;
            case 12: goto L12;
            case 13: goto L6;
            default: goto L4;
        };
    L4:
        d64 r3 = (d64) r18;
        return r0.x();
    L6:
        gy0 r4 = r0.x();
        if (((d64) r18).c == true) goto L11;
        r5 = 2;
    L11:
        return new uu4(r4, r5);
    L12:
        d64 r6 = (d64) r18;
        return r0.F();
    L14:
        d64 r7 = (d64) r18;
        if (tv1.B(r7) == true) goto L21;
        if (r7.c == false) goto L78;
        r11 = 90.0d;
    L78:
        return Double.valueOf(r11);
    L21:
        return Double.valueOf(gy0.b(((Double) r0.F().c.apply(r7)).doubleValue(), 4.5d));
    L22:
        d64 r8 = (d64) r18;
        return r0.G();
    L24:
        d64 r9 = (d64) r18;
        boolean r10 = tv1.C(r9);
        boolean r12 = r9.c;
        if (r10 == false) goto L31;
        if (r12 == false) goto L28;
        double r13 = 0.0d;
    L79:
        return Double.valueOf(r13);
    L28:
        r13 = 100.0d;
        goto L79
    L31:
        if (tv1.B(r9) == true) goto L36;
        if (r12 == false) goto L80;
        r11 = 90.0d;
    L80:
        return Double.valueOf(r11);
    L36:
        return Double.valueOf(gy0.b(((Double) r0.G().c.apply(r9)).doubleValue(), 4.5d));
    L37:
        d64 r14 = (d64) r18;
        return gy0.c(new m7(27), new m7(28), new bi2(r0, 26), new yh2(r0, r5));
    L39:
        gy0 r15 = r0.F();
        if (((d64) r18).c == true) goto L44;
        r5 = 2;
    L44:
        return new uu4(r15, r5);
    L45:
        d64 r16 = (d64) r18;
        return gy0.c(new ai2(24), new ai2(25), new bi2(r0, 26), new yh2(r0, r2));
    L47:
        d64 r17 = (d64) r18;
        return r0.E();
    L49:
        d64 r19 = (d64) r18;
        if (tv1.B(r19) == true) goto L81;
        int r20 = r19.b;
        boolean r21 = r19.c;
        if (r20 != 1) goto L58;
        if (r21 == false) goto L56;
        double r22 = 0.0d;
    L82:
        return Double.valueOf(r22);
    L56:
        r22 = 100.0d;
        goto L82
    L58:
        if (r21 == false) goto L61;
        r11 = 90.0d;
    L61:
        return Double.valueOf(r11);
    L81:
        return Double.valueOf(gy0.b(((Double) r0.E().c.apply(r19)).doubleValue(), 4.5d));
    L62:
        d64 r23 = (d64) r18;
        return gy0.c(new bi2(5), new bi2(7), new bi2(r0, 26), new yh2(r0, 13));
    L64:
        d64 r24 = (d64) r18;
        return gy0.c(new bi2(24), new bi2(25), new bi2(r0, 26), new yh2(r0, 0));
    L66:
        gy0 r25 = r0.G();
        if (((d64) r18).c == true) goto L71;
        r5 = 2;
    L71:
        return new uu4(r25, r5);
    L72:
        gy0 r26 = r0.E();
        if (((d64) r18).c == true) goto L77;
        r5 = 2;
    L77:
        return new uu4(r26, r5);
    }
}
