package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e74 {
    public final /* synthetic */ g74 a;

    public e74(g74 r1) {
        this.a = r1;
    }

    public final long a(int r20, long r21) {
        g74 r1 = this.a;
        r1.j = r20;
        tb r4 = r1.b;
        if (r4 == null) goto L197;
        if (r1.b() == false) goto L197;
        int r0 = r1.j;
        kl3 r2 = r1.m;
        vy0 r5 = r4.c;
        if (qf4.b(r4.g) == false) goto L11;
        g74 r3 = (g74) r2.o;
        return new g83(r3.d(r3.k, r21, r3.j)).a;
    L11:
        if (r4.f == false) goto L13;
    L25:
        int r6 = fc.a;
        if (r0 != 2) goto L28;
        float r7 = 4.0f;
    L29:
        long r10 = g83.f(r21, r7);
        int r14 = (int) (r21 & 4294967295L);
        if (Float.intBitsToFloat(r14) != 0.0f) goto L34;
        long r19 = 4294967295L;
    L32:
        float r12 = 0.0f;
    L55:
        int r8 = (int) (r21 >> 32);
        if (Float.intBitsToFloat(r8) != 0.0f) goto L59;
    L57:
        float r9 = 0.0f;
    L79:
        long r11 = (Float.floatToRawIntBits(r9) << 32) | (((long) Float.floatToRawIntBits(r12)) & r19);
        if (g83.b(r11, 0) == true) goto L82;
        r4.d();
    L82:
        long r13 = g83.d(r21, r11);
        g74 r15 = (g74) r2.o;
        long r16 = new g83(r15.d(r15.k, r13, r15.j)).a;
        long r17 = g83.d(r13, r16);
        if (Float.intBitsToFloat((int) (r13 >> 32)) != 0.0f) goto L88;
        if (Float.intBitsToFloat((int) (r13 & r19)) != 0.0f) goto L88;
    L102:
        if (r0 != 1) goto L123;
        int r18 = (int) (r17 >> 32);
        if (Float.intBitsToFloat(r18) <= 0.5f) goto L108;
        r4.g(r17);
    L106:
        boolean r22 = true;
    L111:
        int r23 = (int) (r17 & r19);
        if (Float.intBitsToFloat(r23) <= 0.5f) goto L116;
        r4.i(r17);
    L114:
        boolean r24 = true;
    L119:
        if (r22 == true) goto L121;
        if (r24 == false) goto L123;
    L121:
        boolean r25 = true;
    L125:
        if (g83.b(r13, 0) == false) goto L127;
    L192:
        if (r25 == false) goto L195;
        r4.d();
    L195:
        return g83.e(r11, r16);
    L127:
        if (vy0.f(r5.f) == true) goto L129;
    L137:
        boolean r26 = false;
    L139:
        if (vy0.f(r5.g) == false) goto L155;
        if (Float.intBitsToFloat(r8) <= 0.0f) goto L155;
        EdgeEffect r27 = r5.d();
        float r28 = Float.intBitsToFloat(r8);
        if ((r27 instanceof aj1) == false) goto L147;
        aj1 r29 = (aj1) r27;
        float r30 = r29.b + r28;
        r29.b = r30;
        if (Math.abs(r30) <= r29.a) goto L148;
        r29.onRelease();
    L148:
        if (r26 == false) goto L150;
    L153:
        r26 = true;
        goto L155
    L150:
        if (vy0.f(r5.g) == true) goto L153;
        r26 = false;
        goto L155
    L147:
        r27.onRelease();
    L155:
        if (vy0.f(r5.d) == false) goto L171;
        if (Float.intBitsToFloat(r14) >= 0.0f) goto L171;
        EdgeEffect r31 = r5.e();
        float r32 = Float.intBitsToFloat(r14);
        if ((r31 instanceof aj1) == false) goto L163;
        aj1 r33 = (aj1) r31;
        float r34 = r33.b + r32;
        r33.b = r34;
        if (Math.abs(r34) <= r33.a) goto L164;
        r33.onRelease();
    L164:
        if (r26 == false) goto L166;
    L169:
        r26 = true;
        goto L171
    L166:
        if (vy0.f(r5.d) == true) goto L169;
        r26 = false;
        goto L171
    L163:
        r31.onRelease();
    L171:
        if (vy0.f(r5.e) == true) goto L173;
    L186:
        if (r26 == true) goto L190;
        if (r25 == true) goto L190;
        boolean r35 = false;
    L191:
        r25 = r35;
    L190:
        r35 = true;
        goto L191
    L173:
        if (Float.intBitsToFloat(r14) <= 0.0f) goto L186;
        EdgeEffect r36 = r5.b();
        float r37 = Float.intBitsToFloat(r14);
        if ((r36 instanceof aj1) == false) goto L179;
        aj1 r38 = (aj1) r36;
        float r39 = r38.b + r37;
        r38.b = r39;
        if (Math.abs(r39) <= r38.a) goto L180;
        r38.onRelease();
    L180:
        if (r26 == false) goto L182;
    L185:
        r26 = true;
        goto L186
    L182:
        if (vy0.f(r5.e) == true) goto L185;
        r26 = false;
        goto L186
    L179:
        r36.onRelease();
        goto L180
    L129:
        if (Float.intBitsToFloat(r8) >= 0.0f) goto L137;
        EdgeEffect r40 = r5.c();
        float r41 = Float.intBitsToFloat(r8);
        if ((r40 instanceof aj1) == false) goto L135;
        aj1 r42 = (aj1) r40;
        float r43 = r42.b + r41;
        r42.b = r43;
        if (Math.abs(r43) <= r42.a) goto L136;
        r42.onRelease();
    L136:
        r26 = vy0.f(r5.f);
        goto L139
    L135:
        r40.onRelease();
        goto L136
    L116:
        if (Float.intBitsToFloat(r23) >= (-0.5f)) goto L118;
        r4.f(r17);
        goto L114
    L118:
        r24 = false;
        goto L119
    L108:
        if (Float.intBitsToFloat(r18) >= (-0.5f)) goto L110;
        r4.h(r17);
        goto L106
    L110:
        r22 = false;
    L123:
        r25 = false;
    L88:
        if (Float.intBitsToFloat((int) (r16 >> 32)) != 0.0f) goto L93;
        if (Float.intBitsToFloat((int) (r16 & r19)) == 0.0f) goto L102;
    L93:
        if (vy0.g(r5.f) == false) goto L95;
    L100:
        r4.a();
        goto L102
    L95:
        if (vy0.g(r5.d) == true) goto L100;
        if (vy0.g(r5.g) == true) goto L100;
        if (vy0.g(r5.e) == false) goto L102;
    L59:
        if (vy0.g(r5.f) == false) goto L70;
        if (Float.intBitsToFloat(r8) >= 0.0f) goto L70;
        float r44 = r4.g(r10);
        if (vy0.g(r5.f) == true) goto L66;
        r5.c().finish();
    L66:
        if (r44 != Float.intBitsToFloat((int) (r10 >> 32))) goto L68;
        r9 = Float.intBitsToFloat(r8);
    L68:
        r9 = r44 / r7;
    L70:
        if (vy0.g(r5.g) == false) goto L57;
        if (Float.intBitsToFloat(r8) <= 0.0f) goto L57;
        r44 = r4.h(r10);
        if (vy0.g(r5.g) == true) goto L77;
        r5.d().finish();
    L77:
        if (r44 != Float.intBitsToFloat((int) (r10 >> 32))) goto L68;
        r9 = Float.intBitsToFloat(r8);
        goto L79
    L34:
        if (vy0.g(r5.d) == true) goto L36;
    L44:
        r19 = 4294967295L;
        if (vy0.g(r5.e) == false) goto L32;
        if (Float.intBitsToFloat(r14) <= 0.0f) goto L32;
        float r110 = r4.f(r10);
        if (vy0.g(r5.e) == true) goto L52;
        r5.b().finish();
    L52:
        if (r110 != Float.intBitsToFloat((int) (r10 & 4294967295L))) goto L54;
        r12 = Float.intBitsToFloat(r14);
        goto L55
    L54:
        r12 = r110 / r7;
        goto L55
    L36:
        if (Float.intBitsToFloat(r14) >= 0.0f) goto L44;
        float r111 = r4.i(r10);
        r19 = 4294967295L;
        if (vy0.g(r5.d) == true) goto L41;
        r5.e().finish();
    L41:
        if (r111 != Float.intBitsToFloat((int) (r10 & 4294967295L))) goto L43;
        r12 = Float.intBitsToFloat(r14);
        goto L55
    L43:
        r12 = r111 / r7;
        goto L55
    L28:
        r7 = 1.0f;
        goto L29
    L13:
        if (vy0.g(r5.f) == false) goto L16;
        r4.g(0);
    L16:
        if (vy0.g(r5.g) == false) goto L19;
        r4.h(0);
    L19:
        if (vy0.g(r5.d) == false) goto L22;
        r4.i(0);
    L22:
        if (vy0.g(r5.e) == false) goto L24;
        r4.f(0);
    L24:
        r4.f = true;
    L197:
        return r1.d(r1.k, r21, r20);
    }
}
