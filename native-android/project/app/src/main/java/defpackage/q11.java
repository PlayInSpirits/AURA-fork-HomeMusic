package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 extends r14 implements wf1 {
    public final /* synthetic */ int o;
    public long[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ q11(Object r1, vd0 r2, int r3) {
        this.o = r3;
        this.y = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        Object r2 = this.y;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        q11 r1 = new q11((mn4) r2, r4, 3);
        r1.w = r3;
        return r1;
    L6:
        q11 r5 = new q11((x54) r2, r4, 2);
        r5.w = r3;
        return r5;
    L8:
        q11 r6 = new q11((r11) r2, r4, 1);
        r6.w = r3;
        return r6;
    L10:
        q11 r7 = new q11((r11) r2, r4, 0);
        r7.w = r3;
        return r7;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        ba4 r5 = (ba4) r3;
        vd0 r6 = (vd0) r4;
        switch(r0) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return ((q11) create(r5, r6)).invokeSuspend(r1);
    L7:
        return ((q11) create(r5, r6)).invokeSuspend(r1);
    L9:
        return ((q11) create(r5, r6)).invokeSuspend(r1);
    L11:
        return ((q11) create(r5, r6)).invokeSuspend(r1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:43:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0100 -> B:36:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:40:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0190 -> B:64:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0192 -> B:57:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01a9 -> B:61:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0221 -> B:85:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0223 -> B:78:0x0235). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x023b -> B:82:0x0266). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r26) {
        int r1 = this.o;
        j15 r2 = j15.a;
        Object r8 = this.y;
        xe0 r11 = xe0.n;
        switch(r1) {
            case 0: goto L67;
            case 1: goto L46;
            case 2: goto L25;
            default: goto L4;
        };
    L4:
        int r3 = this.v;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        int r4 = this.t;
        int r5 = this.s;
        long r9 = this.u;
        int r10 = this.r;
        long r18 = 255;
        int r6 = this.q;
        long[] r7 = this.p;
        char r20 = 7;
        Object[] r12 = (Object[]) this.x;
        ba4 r13 = (ba4) this.w;
        kb4.X(r26);
    L19:
        r9 = r9 >> 8;
        r4 = r4 + 1;
    L15:
        if (r4 < r5) goto L17;
        if (r5 != 8) goto L90;
        long[] r14 = r7;
        ba4 r15 = r13;
        int r16 = r6;
        Object[] r17 = r12;
        int r19 = r10;
    L22:
        if (r19 == r16) goto L91;
        r19 = r19 + 1;
    L12:
        r9 = r14[r19];
        if (((((~r9) << r20) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r110 = 8 - ((~(r19 - r16)) >>> 31);
        int r111 = r16;
        r7 = r14;
        r5 = r110;
        r10 = r19;
        r12 = r17;
        r6 = r111;
        r13 = r15;
        r4 = 0;
        goto L15
    L91:
        return r2;
    L90:
        return r2;
    L17:
        if ((r9 & r18) >= 128) goto L19;
        Object r21 = r12[(r10 << 3) + r4];
        this.w = r13;
        this.x = r12;
        this.p = r7;
        this.q = r6;
        this.r = r10;
        this.u = r9;
        this.s = r5;
        this.t = r4;
        this.v = 1;
        r13.b(this, r21);
        return r11;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        r18 = 255;
        r20 = 7;
        kb4.X(r26);
        r15 = (ba4) this.w;
        w03 r22 = (w03) ((mn4) r8).o;
        r17 = r22.c;
        r14 = r22.a;
        r16 = r14.length - 2;
        if (r16 < 0) goto L88;
        r19 = 0;
        goto L12
    L88:
        return r2;
    L25:
        int r23 = this.v;
        if (r23 == 0) goto L30;
        if (r23 != 1) goto L29;
        int r24 = this.t;
        int r25 = this.s;
        long r27 = this.u;
        int r28 = this.r;
        int r29 = this.q;
        long[] r30 = this.p;
        Object[] r112 = (Object[]) this.x;
        ba4 r113 = (ba4) this.w;
        kb4.X(r26);
    L40:
        r27 = r27 >> 8;
        r24 = r24 + 1;
    L36:
        if (r24 < r25) goto L38;
        if (r25 != 8) goto L94;
        int r31 = r29;
        long[] r32 = r30;
        Object[] r33 = r112;
        ba4 r34 = r113;
    L43:
        if (r28 == r31) goto L95;
        r28 = r28 + 1;
    L33:
        long r35 = r32[r28];
        if (((((~r35) << 7) & r35) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L43;
        r113 = r34;
        r24 = 0;
        r30 = r32;
        r29 = r31;
        r25 = 8 - ((~(r28 - r31)) >>> 31);
        r112 = r33;
        r27 = r35;
        goto L36
    L95:
        return r2;
    L94:
        return r2;
    L38:
        if ((r27 & 255) >= 128) goto L40;
        Object r36 = r112[(r28 << 3) + r24];
        this.w = r113;
        this.x = r112;
        this.p = r30;
        this.q = r29;
        this.r = r28;
        this.u = r27;
        this.s = r25;
        this.t = r24;
        this.v = 1;
        r113.b(this, r36);
        return r11;
    L29:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L30:
        kb4.X(r26);
        r34 = (ba4) this.w;
        x03 r37 = ((x54) r8).n;
        r33 = r37.b;
        r32 = r37.a;
        r31 = r32.length - 2;
        if (r31 < 0) goto L92;
        r28 = 0;
        goto L33
    L92:
        return r2;
    L46:
        int r38 = this.v;
        if (r38 == 0) goto L51;
        if (r38 != 1) goto L50;
        int r39 = this.t;
        int r40 = this.s;
        long r41 = this.u;
        int r42 = this.r;
        int r43 = this.q;
        long[] r44 = this.p;
        Object[] r114 = (Object[]) this.x;
        ba4 r115 = (ba4) this.w;
        kb4.X(r26);
    L61:
        r41 = r41 >> 8;
        r39 = r39 + 1;
    L57:
        if (r39 < r40) goto L59;
        if (r40 != 8) goto L98;
        int r45 = r43;
        long[] r46 = r44;
        Object[] r47 = r114;
        ba4 r48 = r115;
    L64:
        if (r42 == r45) goto L99;
        r42 = r42 + 1;
    L54:
        long r49 = r46[r42];
        if (((((~r49) << 7) & r49) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L64;
        r115 = r48;
        r39 = 0;
        r44 = r46;
        r43 = r45;
        r40 = 8 - ((~(r42 - r45)) >>> 31);
        r114 = r47;
        r41 = r49;
        goto L57
    L99:
        return r2;
    L98:
        return r2;
    L59:
        if ((r41 & 255) >= 128) goto L61;
        Object r50 = r114[(r42 << 3) + r39];
        this.w = r115;
        this.x = r114;
        this.p = r44;
        this.q = r43;
        this.r = r42;
        this.u = r41;
        this.s = r40;
        this.t = r39;
        this.v = 1;
        r115.b(this, r50);
        return r11;
    L50:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L51:
        kb4.X(r26);
        r48 = (ba4) this.w;
        w03 r51 = ((r11) r8).o;
        r47 = r51.b;
        r46 = r51.a;
        r45 = r46.length - 2;
        if (r45 < 0) goto L96;
        r42 = 0;
        goto L54
    L96:
        return r2;
    L67:
        int r52 = this.v;
        if (r52 == 0) goto L72;
        if (r52 != 1) goto L71;
        int r53 = this.t;
        int r54 = this.s;
        long r55 = this.u;
        int r56 = this.r;
        int r57 = this.q;
        long[] r58 = this.p;
        r11 r116 = (r11) this.x;
        ba4 r117 = (ba4) this.w;
        kb4.X(r26);
    L82:
        r55 = r55 >> 8;
        r53 = r53 + 1;
    L78:
        if (r53 < r54) goto L80;
        if (r54 != 8) goto L102;
        int r59 = r56;
        int r60 = r57;
        long[] r61 = r58;
        r11 r62 = r116;
        ba4 r63 = r117;
    L85:
        if (r59 == r60) goto L103;
        r59 = r59 + 1;
    L75:
        long r64 = r61[r59];
        if (((((~r64) << 7) & r64) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L85;
        r117 = r63;
        r53 = 0;
        r58 = r61;
        r54 = 8 - ((~(r59 - r60)) >>> 31);
        r116 = r62;
        r57 = r60;
        r56 = r59;
        r55 = r64;
        goto L78
    L103:
        return r2;
    L102:
        return r2;
    L80:
        if ((r55 & 255) >= 128) goto L82;
        int r65 = (r56 << 3) + r53;
        w03 r118 = r116.o;
        dg2 r119 = new dg2(1, r118.b[r65], r118.c[r65]);
        this.w = r117;
        this.x = r116;
        this.p = r58;
        this.q = r57;
        this.r = r56;
        this.u = r55;
        this.s = r54;
        this.t = r53;
        this.v = 1;
        r117.b(this, r119);
        return r11;
    L71:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L72:
        kb4.X(r26);
        r63 = (ba4) this.w;
        r62 = (r11) r8;
        r61 = r62.o.a;
        r60 = r61.length - 2;
        if (r60 < 0) goto L100;
        r59 = 0;
        goto L75
    L100:
        return r2;
    }
}
