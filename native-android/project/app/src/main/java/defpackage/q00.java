package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends ba5 {
    public final ArrayList k;
    public int l;

    public q00(jc0 r6, int r7) {
        super(r6);
        ArrayList r8 = new ArrayList();
        this.k = r8;
        this.f = r7;
        jc0 r0 = this.b;
        jc0 r9 = r0.k(r7);
    L3:
        jc0 r4 = r0;
        r0 = r9;
        if (r0 == null) goto L6;
        r9 = r0.k(this.f);
        goto L3
    L6:
        this.b = r4;
        int r1 = this.f;
        if (r1 != 0) goto L9;
        ba5 r2 = r4.d;
    L12:
        r8.add(r2);
        jc0 r10 = r4.j(this.f);
    L13:
        if (r10 == null) goto L21;
        int r3 = this.f;
        if (r3 != 0) goto L17;
        ba5 r5 = r10.d;
    L20:
        r8.add(r5);
        r10 = r10.j(this.f);
        goto L13
    L17:
        if (r3 != 1) goto L19;
        r5 = r10.e;
        goto L20
    L19:
        r5 = null;
        goto L20
    L21:
        int r11 = r8.size();
        int r12 = 0;
    L22:
        if (r12 >= r11) goto L29;
        Object r13 = r8.get(r12);
        r12 = r12 + 1;
        ba5 r14 = (ba5) r13;
        int r15 = this.f;
        if (r15 == 0) goto L25;
        if (r15 != 1) goto L22;
        r14.b.c = this;
        goto L22
    L25:
        r14.b.b = this;
        goto L22
    L29:
        if (this.f == 0) goto L31;
    L35:
        int r16 = this.f;
        jc0 r17 = this.b;
        if (r16 != 0) goto L38;
        int r18 = r17.h0;
    L39:
        this.l = r18;
        return;
    L38:
        r18 = r17.i0;
        goto L39
    L31:
        if (((kc0) this.b.S).u0 == false) goto L35;
        if (r8.size() <= 1) goto L35;
        this.b = ((ba5) r8.get(r8.size() - 1)).b;
        goto L35
    L9:
        if (r1 != 1) goto L11;
        r2 = r4.e;
        goto L12
    L11:
        r2 = null;
        goto L12
    }

    @Override // defpackage.uo0
    public final void a(uo0 r28) {
        yo0 r1 = this.h;
        if (r1.j == false) goto L280;
        yo0 r2 = this.i;
        if (r2.j == false) goto L322;
        jc0 r3 = this.b.S;
        if ((r3 instanceof kc0) == false) goto L10;
        boolean r4 = ((kc0) r3).u0;
    L11:
        int r5 = r2.g - r1.g;
        ArrayList r6 = this.k;
        int r7 = r6.size();
        int r8 = 0;
    L12:
        int r9 = -1;
        int r10 = 8;
        if (r8 >= r7) goto L17;
        if (((ba5) r6.get(r8)).b.f0 != 8) goto L18;
        r8 = r8 + 1;
    L18:
        int r11 = r7 - 1;
        int r12 = r11;
    L19:
        if (r12 < 0) goto L24;
        if (((ba5) r6.get(r12)).b.f0 != 8) goto L23;
        r12 = r12 - 1;
        goto L19
    L23:
        r9 = r12;
    L24:
        int r13 = 0;
    L26:
        if (r13 >= 2) goto L76;
        float r19 = 0.0f;
        int r14 = 0;
        int r15 = 0;
        int r17 = 0;
        int r18 = 0;
    L28:
        if (r14 >= r7) goto L70;
        ba5 r16 = (ba5) r6.get(r14);
        jc0 r110 = r16.b;
        boolean r22 = r4;
        if (r110.f0 != r10) goto L32;
        int r24 = r13;
    L69:
        r14 = r14 + 1;
        r4 = r22;
        r13 = r24;
        r10 = 8;
        goto L28
    L32:
        r18 = r18 + 1;
        if (r14 <= 0) goto L36;
        if (r14 < r8) goto L36;
        r15 = r15 + r16.h.f;
    L36:
        eq0 r20 = r16.e;
        int r111 = r20.g;
        r24 = r13;
        if (r16.d == 3) goto L39;
        boolean r112 = true;
    L40:
        if (r112 == false) goto L53;
        int r21 = this.f;
        if (r21 != 0) goto L47;
        if (r110.d.e.j == true) goto L47;
        return;
    L47:
        if (r21 != 1) goto L60;
        if (r110.e.e.j == true) goto L60;
        return;
    L60:
        int r113 = r111;
    L61:
        if (r112 == true) goto L65;
        r17 = r17 + 1;
        float r23 = r110.j0[this.f];
        if (r23 < 0.0f) goto L66;
        r19 = r19 + r23;
    L66:
        if (r14 >= r11) goto L69;
        if (r14 >= r9) goto L69;
        r15 = r15 + (-r16.i.f);
        goto L69
    L65:
        r15 = r15 + r113;
        goto L66
    L53:
        if (r16.a != 1) goto L58;
        if (r24 != 0) goto L58;
        r113 = r20.m;
        r17 = r17 + 1;
    L56:
        r112 = true;
    L58:
        if (r20.j == false) goto L60;
        r113 = r111;
        goto L56
    L39:
        r112 = false;
        goto L40
    L70:
        boolean r25 = r4;
        int r26 = r13;
        if (r15 < r5) goto L75;
        if (r17 == 0) goto L75;
        r13 = r26 + 1;
        r4 = r25;
        r10 = 8;
    L75:
        int r27 = r17;
        int r29 = r18;
    L77:
        int r30 = r1.g;
        if (r25 == false) goto L80;
        r30 = r2.g;
    L80:
        float r31 = 0.5f;
        if (r15 > r5) goto L83;
    L86:
        if (r27 <= 0) goto L136;
        float r114 = r5 - r15;
        int r115 = (int) ((r114 / r27) + 0.5f);
        int r116 = 0;
        int r117 = 0;
    L88:
        if (r116 >= r7) goto L115;
        float r118 = r31;
        ba5 r32 = (ba5) r6.get(r116);
        int r119 = r30;
        jc0 r33 = r32.b;
        int r210 = r27;
        eq0 r34 = r32.e;
        float r211 = r114;
        int r212 = r115;
        if (r33.f0 != 8) goto L93;
    L114:
        r116 = r116 + 1;
        r30 = r119;
        r31 = r118;
        r27 = r210;
        r114 = r211;
        r115 = r212;
        goto L88
    L93:
        if (r32.d != 3) goto L114;
        if (r34.j == true) goto L114;
        if (r19 <= 0.0f) goto L99;
        int r120 = (int) (((r33.j0[this.f] * r211) / r19) + r118);
    L101:
        if (this.f != 0) goto L103;
        int r121 = r33.v;
        int r35 = r33.u;
    L105:
        if (r32.a != 1) goto L107;
        int r36 = Math.min(r120, r34.m);
    L108:
        int r37 = Math.max(r35, r36);
        if (r121 <= 0) goto L111;
        r37 = Math.min(r121, r37);
    L111:
        if (r37 == r120) goto L113;
        r117 = r117 + 1;
        r120 = r37;
    L113:
        r34.d(r120);
        goto L114
    L107:
        r36 = r120;
        goto L108
    L103:
        r121 = r33.y;
        r35 = r33.x;
        goto L105
    L99:
        r120 = r212;
        goto L101
    L115:
        int r122 = r30;
        float r123 = r31;
        int r213 = r27;
        if (r117 <= 0) goto L130;
        r27 = r213 - r117;
        int r38 = 0;
        r15 = 0;
    L118:
        if (r38 >= r7) goto L131;
        ba5 r39 = (ba5) r6.get(r38);
        if (r39.b.f0 == 8) goto L129;
        if (r38 <= 0) goto L125;
        if (r38 < r8) goto L125;
        r15 = r15 + r39.h.f;
    L125:
        r15 = r15 + r39.e.g;
        if (r38 >= r11) goto L129;
        if (r38 >= r9) goto L129;
        r15 = r15 + (-r39.i.f);
    L129:
        r38 = r38 + 1;
    L131:
        int r40 = 2;
        if (this.l != 2) goto L135;
        if (r117 != 0) goto L135;
        int r41 = 0;
        this.l = 0;
    L137:
        if (r15 <= r5) goto L139;
        this.l = r40;
    L139:
        if (r29 <= 0) goto L143;
        if (r27 != 0) goto L143;
        if (r8 != r9) goto L143;
        this.l = r40;
    L143:
        int r42 = this.l;
        if (r42 != 1) goto L191;
        if (r29 <= 1) goto L147;
        int r43 = (r5 - r15) / (r29 - 1);
    L150:
        if (r27 <= 0) goto L152;
        r43 = r41;
    L152:
        int r44 = r41;
        int r45 = r122;
    L153:
        if (r44 >= r7) goto L325;
        if (r25 == false) goto L156;
        int r0 = r7 - (r44 + 1);
    L157:
        ba5 r46 = (ba5) r6.get(r0);
        jc0 r47 = r46.b;
        yo0 r48 = r46.i;
        yo0 r124 = r46.h;
        if (r47.f0 != 8) goto L160;
        r124.d(r45);
        r48.d(r45);
    L190:
        r44 = r44 + 1;
        goto L153
    L160:
        if (r44 <= 0) goto L164;
        if (r25 == false) goto L163;
        r45 = r45 - r43;
        goto L164
    L163:
        r45 = r45 + r43;
    L164:
        if (r44 <= 0) goto L169;
        if (r44 < r8) goto L169;
        if (r25 == false) goto L168;
        r45 = r45 - r124.f;
        goto L169
    L168:
        r45 = r45 + r124.f;
    L169:
        if (r25 == false) goto L171;
        r48.d(r45);
    L172:
        eq0 r49 = r46.e;
        int r125 = r49.g;
        if (r46.d == 3) goto L175;
    L177:
        if (r25 == false) goto L179;
        r45 = r45 - r125;
    L180:
        if (r25 == false) goto L183;
        r124.d(r45);
    L184:
        r46.g = true;
        if (r44 >= r11) goto L190;
        if (r44 >= r9) goto L190;
        if (r25 == false) goto L189;
        r45 = r45 - (-r48.f);
        goto L190
    L189:
        r45 = r45 + (-r48.f);
        goto L190
    L183:
        r48.d(r45);
        goto L184
    L179:
        r45 = r45 + r125;
        goto L180
    L175:
        if (r46.a != 1) goto L177;
        r125 = r49.m;
        goto L177
    L171:
        r124.d(r45);
        goto L172
    L156:
        r0 = r44;
        goto L157
    L325:
        return;
    L147:
        if (r29 != 1) goto L149;
        r43 = (r5 - r15) / 2;
        goto L150
    L149:
        r43 = r41;
        goto L150
    L191:
        if (r42 != 0) goto L232;
        int r50 = (r5 - r15) / (r29 + 1);
        if (r27 <= 0) goto L195;
        r50 = r41;
    L195:
        int r51 = r41;
        int r52 = r122;
    L196:
        if (r51 >= r7) goto L326;
        if (r25 == false) goto L199;
        int r53 = r7 - (r51 + 1);
    L200:
        ba5 r54 = (ba5) r6.get(r53);
        jc0 r55 = r54.b;
        yo0 r56 = r54.i;
        yo0 r126 = r54.h;
        if (r55.f0 != 8) goto L203;
        r126.d(r52);
        r56.d(r52);
    L230:
        r51 = r51 + 1;
        goto L196
    L203:
        if (r25 == false) goto L205;
        int r57 = r52 - r50;
    L206:
        if (r51 <= 0) goto L211;
        if (r51 < r8) goto L211;
        if (r25 == false) goto L210;
        r57 = r57 - r126.f;
        goto L211
    L210:
        r57 = r57 + r126.f;
    L211:
        if (r25 == false) goto L213;
        r56.d(r57);
    L214:
        eq0 r58 = r54.e;
        int r127 = r58.g;
        if (r54.d == 3) goto L217;
    L219:
        if (r25 == false) goto L221;
        r52 = r57 - r127;
    L222:
        if (r25 == false) goto L224;
        r126.d(r52);
    L225:
        if (r51 >= r11) goto L230;
        if (r51 >= r9) goto L230;
        if (r25 == false) goto L229;
        r52 = r52 - (-r56.f);
        goto L230
    L229:
        r52 = r52 + (-r56.f);
        goto L230
    L224:
        r56.d(r52);
        goto L225
    L221:
        r52 = r57 + r127;
        goto L222
    L217:
        if (r54.a != 1) goto L219;
        r127 = Math.min(r127, r58.m);
        goto L219
    L213:
        r126.d(r57);
        goto L214
    L205:
        r57 = r52 + r50;
        goto L206
    L199:
        r53 = r51;
        goto L200
    L326:
        return;
    L232:
        if (r42 != 2) goto L321;
        int r59 = this.f;
        jc0 r60 = this.b;
        if (r59 != 0) goto L236;
        float r61 = r60.c0;
    L237:
        if (r25 == false) goto L239;
        r61 = 1.0f - r61;
    L239:
        int r62 = (int) (((r5 - r15) * r61) + r123);
        if (r62 < 0) goto L242;
        if (r27 > 0) goto L242;
    L243:
        if (r25 == false) goto L245;
        int r63 = r122 - r62;
    L246:
        int r64 = r41;
    L247:
        if (r64 >= r7) goto L327;
        if (r25 == false) goto L250;
        int r65 = r7 - (r64 + 1);
    L251:
        ba5 r66 = (ba5) r6.get(r65);
        jc0 r67 = r66.b;
        yo0 r68 = r66.i;
        yo0 r69 = r66.h;
        if (r67.f0 != 8) goto L254;
        r69.d(r63);
        r68.d(r63);
    L279:
        r64 = r64 + 1;
        goto L247
    L254:
        if (r64 <= 0) goto L259;
        if (r64 < r8) goto L259;
        if (r25 == false) goto L258;
        r63 = r63 - r69.f;
        goto L259
    L258:
        r63 = r63 + r69.f;
    L259:
        if (r25 == false) goto L261;
        r68.d(r63);
    L262:
        eq0 r70 = r66.e;
        int r128 = r70.g;
        if (r66.d != 3) goto L268;
        if (r66.a != 1) goto L268;
        r128 = r70.m;
    L268:
        if (r25 == false) goto L270;
        r63 = r63 - r128;
    L271:
        if (r25 == false) goto L273;
        r69.d(r63);
    L274:
        if (r64 >= r11) goto L279;
        if (r64 >= r9) goto L279;
        if (r25 == false) goto L278;
        r63 = r63 - (-r68.f);
        goto L279
    L278:
        r63 = r63 + (-r68.f);
        goto L279
    L273:
        r68.d(r63);
        goto L274
    L270:
        r63 = r63 + r128;
        goto L271
    L261:
        r69.d(r63);
        goto L262
    L250:
        r65 = r64;
        goto L251
    L327:
        return;
    L245:
        r63 = r122 + r62;
    L242:
        r62 = r41;
        goto L243
    L236:
        r61 = r60.d0;
        goto L237
    L321:
        return;
    L135:
        r41 = 0;
        goto L137
    L130:
        r27 = r213;
        goto L131
    L136:
        r122 = r30;
        r123 = 0.5f;
        r41 = 0;
        r40 = 2;
        goto L137
    L83:
        if (r25 == false) goto L85;
        r30 = r30 + ((int) (((r15 - r5) / 2.0f) + 0.5f));
        goto L86
    L85:
        r30 = r30 - ((int) (((r15 - r5) / 2.0f) + 0.5f));
        goto L86
    L76:
        r25 = r4;
        r19 = 0.0f;
        r27 = 0;
        r29 = 0;
        r15 = 0;
        goto L77
    L17:
        r8 = -1;
        goto L18
    L10:
        r4 = false;
        goto L11
    L322:
        return;
    }

    @Override // defpackage.ba5
    public final void d() {
        ArrayList r0 = this.k;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ((ba5) r4).d();
        goto L3
    L5:
        int r2 = r0.size();
        if (r2 >= 1) goto L8;
        return;
    L8:
        jc0 r5 = ((ba5) r0.get(0)).b;
        jc0 r6 = ((ba5) r0.get(r2 - 1)).b;
        int r7 = this.f;
        yo0 r8 = this.i;
        yo0 r9 = this.h;
        if (r7 != 0) goto L20;
        hb0 r10 = r5.H;
        hb0 r11 = r6.J;
        yo0 r12 = ba5.i(r10, 0);
        int r13 = r10.d();
        jc0 r14 = m();
        if (r14 == null) goto L13;
        r13 = r14.H.d();
    L13:
        if (r12 == null) goto L15;
        ba5.b(r9, r12, r13);
    L15:
        yo0 r15 = ba5.i(r11, 0);
        int r16 = r11.d();
        jc0 r17 = n();
        if (r17 == null) goto L18;
        r16 = r17.J.d();
    L18:
        if (r15 == null) goto L30;
        ba5.b(r8, r15, -r16);
    L30:
        r9.a = this;
        r8.a = this;
        return;
    L20:
        hb0 r18 = r5.I;
        hb0 r19 = r6.K;
        yo0 r20 = ba5.i(r18, 1);
        int r21 = r18.d();
        jc0 r22 = m();
        if (r22 == null) goto L23;
        r21 = r22.I.d();
    L23:
        if (r20 == null) goto L25;
        ba5.b(r9, r20, r21);
    L25:
        yo0 r23 = ba5.i(r19, 1);
        int r24 = r19.d();
        jc0 r25 = n();
        if (r25 == null) goto L28;
        r24 = r25.K.d();
    L28:
        if (r23 == null) goto L30;
        ba5.b(r8, r23, -r24);
        goto L30
    }

    @Override // defpackage.ba5
    public final void e() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.k;
        if (r0 >= r1.size()) goto L6;
        ((ba5) r1.get(r0)).e();
        r0 = r0 + 1;
        goto L3
    }

    @Override // defpackage.ba5
    public final void f() {
        this.c = null;
        ArrayList r3 = this.k;
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r3.get(r1);
        r1 = r1 + 1;
        ((ba5) r2).f();
        goto L3
    }

    @Override // defpackage.ba5
    public final long j() {
        ArrayList r7 = this.k;
        int r0 = r7.size();
        long r1 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        ba5 r4 = (ba5) r7.get(r3);
        long r2 = r1 + ((long) r4.h.f);
        long r5 = r4.j() + r2;
        r1 = ((long) r4.i.f) + r5;
        r3 = r3 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // defpackage.ba5
    public final boolean k() {
        ArrayList r4 = this.k;
        int r0 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        if (((ba5) r4.get(r2)).k() == false) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    public final jc0 m() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.k;
        if (r0 >= r1.size()) goto L9;
        jc0 r2 = ((ba5) r1.get(r0)).b;
        if (r2.f0 != 8) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r2;
    L9:
        return null;
    }

    public final jc0 n() {
        ArrayList r4 = this.k;
        int r0 = r4.size() - 1;
    L3:
        if (r0 < 0) goto L8;
        jc0 r1 = ((ba5) r4.get(r0)).b;
        if (r1.f0 != 8) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r1;
    L8:
        return null;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ChainRun ");
        if (this.f != 0) goto L5;
        String r1 = "horizontal : ";
    L6:
        r0.append(r1);
        ArrayList r5 = this.k;
        int r2 = r5.size();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L10;
        Object r4 = r5.get(r3);
        r3 = r3 + 1;
        r0.append("<");
        r0.append((ba5) r4);
        r0.append("> ");
        goto L7
    L10:
        return r0.toString();
    L5:
        r1 = "vertical : ";
        goto L6
    }
}
