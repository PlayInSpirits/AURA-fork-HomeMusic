package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends fo0 implements rv0 {
    public final /* synthetic */ int D;
    public final tb E;
    public final vy0 F;
    public Object G;

    public bj1(ip4 r2, tb r3, vy0 r4, ac3 r5) {
        this.D = 0;
        this.E = r3;
        this.F = r4;
        this.G = r5;
        q0(r2);
    }

    public static boolean t0(float r1, EdgeEffect r2, Canvas r3) {
        if (r1 == 0.0f) goto L5;
        int r0 = r3.save();
        r3.rotate(r1);
        boolean r4 = r2.draw(r3);
        r3.restoreToCount(r0);
        return r4;
    L5:
        return r2.draw(r3);
    }

    public static boolean u0(float r3, long r4, EdgeEffect r6, Canvas r7) {
        int r0 = r7.save();
        r7.rotate(r3);
        r7.translate(Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r4 & 4294967295L)));
        boolean r5 = r6.draw(r7);
        r7.restoreToCount(r0);
        return r5;
    }

    @Override // defpackage.rv0
    public final void S(e72 r26) {
        int r2 = this.D;
        tb r3 = this.E;
        vy0 r7 = this.F;
        switch(r2) {
            case 0: goto L189;
            default: goto L4;
        };
    L4:
        mz r4 = r26.n;
        r3.j(r4.P());
        Canvas r14 = ba.a(r4.o.g());
        r3.d.getValue();
        if (qf4.b(r4.P()) == false) goto L8;
        r26.a();
        return;
    L8:
        if (r14.isHardwareAccelerated() == true) goto L34;
        EdgeEffect r0 = r7.d;
        if (r0 == null) goto L12;
        r0.finish();
    L12:
        EdgeEffect r1 = r7.e;
        if (r1 == null) goto L15;
        r1.finish();
    L15:
        EdgeEffect r5 = r7.f;
        if (r5 == null) goto L18;
        r5.finish();
    L18:
        EdgeEffect r6 = r7.g;
        if (r6 == null) goto L21;
        r6.finish();
    L21:
        EdgeEffect r8 = r7.h;
        if (r8 == null) goto L24;
        r8.finish();
    L24:
        EdgeEffect r9 = r7.i;
        if (r9 == null) goto L27;
        r9.finish();
    L27:
        EdgeEffect r10 = r7.j;
        if (r10 == null) goto L30;
        r10.finish();
    L30:
        EdgeEffect r11 = r7.k;
        if (r11 == null) goto L33;
        r11.finish();
    L33:
        r26.a();
        return;
    L34:
        float r15 = r26.M(30.0f);
        if (vy0.f(r7.d) == false) goto L37;
    L44:
        boolean r12 = true;
    L46:
        if (vy0.f(r7.f) == false) goto L48;
    L55:
        boolean r13 = true;
    L56:
        if (r12 == false) goto L59;
        if (r13 == false) goto L59;
        long r17 = 4294967295L;
        char r19 = ' ';
        ek2.q(v0(), r14.getWidth(), r14.getHeight());
    L64:
        RecordingCanvas r16 = ek2.e(v0());
        boolean r18 = vy0.g(r7.j);
        hb3 r110 = hb3.o;
        if (r18 == false) goto L71;
        EdgeEffect r20 = r7.j;
        if (r20 != null) goto L69;
        r20 = r7.a(r110);
        r7.j = r20;
    L69:
        t0(90.0f, r20, r16);
        r20.finish();
    L71:
        if (vy0.f(r7.f) == false) goto L86;
        EdgeEffect r21 = r7.c();
        boolean r22 = t0(270.0f, r21, r16);
        if (vy0.g(r7.f) == false) goto L85;
        boolean r24 = r13;
        float r23 = Float.intBitsToFloat((int) (r3.c() & r17));
        EdgeEffect r25 = r7.j;
        if (r25 != null) goto L77;
        r25 = r7.a(r110);
        r7.j = r25;
    L77:
        int r111 = Build.VERSION.SDK_INT;
        if (r111 < 31) goto L80;
        float r27 = qe.b(r21);
    L81:
        float r28 = 1.0f - r23;
        if (r111 < 31) goto L84;
        qe.d(r25, r27, r28);
    L87:
        boolean r29 = vy0.g(r7.h);
        hb3 r30 = hb3.n;
        if (r29 == false) goto L94;
        EdgeEffect r31 = r7.h;
        if (r31 != null) goto L92;
        r31 = r7.a(r30);
        r7.h = r31;
    L92:
        t0(180.0f, r31, r16);
        r31.finish();
    L94:
        if (vy0.f(r7.d) == false) goto L114;
        EdgeEffect r32 = r7.e();
        if (t0(0.0f, r32, r16) == true) goto L100;
        if (r22 == true) goto L100;
        r22 = false;
    L102:
        if (vy0.g(r7.d) == false) goto L114;
        float r112 = Float.intBitsToFloat((int) (r3.c() >> r19));
        EdgeEffect r113 = r7.h;
        if (r113 != null) goto L106;
        r113 = r7.a(r30);
        r7.h = r113;
    L106:
        int r33 = Build.VERSION.SDK_INT;
        if (r33 < 31) goto L109;
        float r34 = qe.b(r32);
    L110:
        if (r33 < 31) goto L112;
        qe.d(r113, r34, r112);
        goto L114
    L112:
        r113.onPull(r34, r112);
        goto L114
    L109:
        r34 = 0.0f;
    L100:
        r22 = true;
    L114:
        if (vy0.g(r7.k) == false) goto L120;
        EdgeEffect r35 = r7.k;
        if (r35 != null) goto L118;
        r35 = r7.a(r110);
        r7.k = r35;
    L118:
        t0(270.0f, r35, r16);
        r35.finish();
    L120:
        if (vy0.f(r7.g) == false) goto L140;
        EdgeEffect r36 = r7.d();
        if (t0(90.0f, r36, r16) == true) goto L126;
        if (r22 == true) goto L126;
        r22 = false;
    L128:
        if (vy0.g(r7.g) == false) goto L140;
        float r37 = Float.intBitsToFloat((int) (r3.c() & r17));
        EdgeEffect r114 = r7.k;
        if (r114 != null) goto L132;
        r114 = r7.a(r110);
        r7.k = r114;
    L132:
        int r115 = Build.VERSION.SDK_INT;
        if (r115 < 31) goto L135;
        float r38 = qe.b(r36);
    L136:
        if (r115 < 31) goto L138;
        qe.d(r114, r38, r37);
        goto L140
    L138:
        r114.onPull(r38, r37);
        goto L140
    L135:
        r38 = 0.0f;
    L126:
        r22 = true;
    L140:
        if (vy0.g(r7.i) == false) goto L146;
        EdgeEffect r39 = r7.i;
        if (r39 != null) goto L144;
        r39 = r7.a(r30);
        r7.i = r39;
    L144:
        t0(0.0f, r39, r16);
        r39.finish();
    L146:
        if (vy0.f(r7.e) == false) goto L167;
        EdgeEffect r40 = r7.b();
        if (t0(180.0f, r40, r16) == true) goto L152;
        if (r22 == true) goto L152;
        boolean r116 = false;
    L154:
        if (vy0.g(r7.e) == false) goto L166;
        float r41 = Float.intBitsToFloat((int) (r3.c() >> r19));
        EdgeEffect r117 = r7.i;
        if (r117 != null) goto L158;
        r117 = r7.a(r30);
        r7.i = r117;
    L158:
        int r42 = Build.VERSION.SDK_INT;
        if (r42 < 31) goto L161;
        float r43 = qe.b(r40);
    L162:
        float r44 = 1.0f - r41;
        if (r42 < 31) goto L165;
        qe.d(r117, r43, r44);
        goto L166
    L165:
        r117.onPull(r43, r44);
        goto L166
    L161:
        r43 = 0.0f;
    L166:
        r22 = r116;
    L152:
        r116 = true;
    L167:
        if (r22 == false) goto L169;
        r3.d();
    L169:
        if (r24 == false) goto L171;
        float r45 = 0.0f;
    L172:
        if (r12 == false) goto L174;
        float r46 = 0.0f;
    L175:
        r62 r47 = r26.getLayoutDirection();
        aa r48 = new aa();
        r48.a = r16;
        long r49 = r4.P();
        oo0 r50 = r4.o.h();
        r62 r118 = r4.o.i();
        jz r119 = r4.o.g();
        long r120 = r4.o.j();
        i61 r121 = r4.o;
        sj1 r122 = (sj1) r121.p;
        r121.r(r26);
        r121.s(r47);
        r121.q(r48);
        r121.t(r49);
        r121.p = null;
        r48.e();
        ((zg5) r4.o.o).C(r45, r46);     // Catch: Throwable -> L180
        r26.a();     // Catch: Throwable -> L182
        float r51 = -r45;
        float r52 = -r46;
        ((zg5) r4.o.o).C(r51, r52);     // Catch: Throwable -> L180
        r48.k();
        i61 r53 = r4.o;
        r53.r(r50);
        r53.s(r118);
        r53.q(r119);
        r53.t(r120);
        r53.p = r122;
        ek2.p(v0());
        int r54 = r14.save();
        r14.translate(r51, r52);
        lm4.o(r14, v0());
        r14.restoreToCount(r54);
        return;
    L182:
        th = move-exception;
        ((zg5) r4.o.o).C(-r45, -r46);     // Catch: Throwable -> L180
        throw th;     // Catch: Throwable -> L180
    L180:
        th = move-exception;
        r48.k();
        i61 r55 = r4.o;
        r55.r(r50);
        r55.s(r118);
        r55.q(r119);
        r55.t(r120);
        r55.p = r122;
        throw th;
    L174:
        r46 = r15;
        goto L175
    L171:
        r45 = r15;
        goto L172
    L84:
        r25.onPull(r27, r28);
        goto L87
    L80:
        r27 = 0.0f;
        goto L81
    L85:
        r24 = r13;
        goto L87
    L86:
        r24 = r13;
        r22 = false;
    L59:
        r17 = 4294967295L;
        r19 = ' ';
        if (r12 == false) goto L62;
        ek2.q(v0(), (ji2.L(r15) * 2) + r14.getWidth(), r14.getHeight());
        goto L64
    L62:
        if (r13 == false) goto L187;
        ek2.q(v0(), r14.getWidth(), (ji2.L(r15) * 2) + r14.getHeight());
        goto L64
    L187:
        r26.a();
        return;
    L48:
        if (vy0.g(r7.j) == true) goto L55;
        if (vy0.f(r7.g) == true) goto L55;
        if (vy0.g(r7.k) == true) goto L55;
        r13 = false;
        goto L56
    L37:
        if (vy0.g(r7.h) == true) goto L44;
        if (vy0.f(r7.e) == true) goto L44;
        if (vy0.g(r7.i) == true) goto L44;
        r12 = false;
        goto L46
    L189:
        ac3 r56 = (ac3) this.G;
        mz r57 = r26.n;
        r3.j(r57.P());
        if (qf4.b(r57.P()) == false) goto L192;
        r26.a();
        return;
    L192:
        r26.a();
        r3.d.getValue();
        Canvas r58 = ba.a(r57.o.g());
        boolean r59 = vy0.f(r7.f);
        r62 r60 = r62.n;
        if (r59 == false) goto L199;
        EdgeEffect r61 = r7.c();
        float r62 = -Float.intBitsToFloat((int) (r57.P() & 4294967295L));
        if (r26.getLayoutDirection() != r60) goto L197;
        float r123 = r56.a;
    L198:
        float r124 = r26.M(r123);
        long r125 = Float.floatToRawIntBits(r62);
        boolean r63 = u0(270.0f, (((long) Float.floatToRawIntBits(r124)) & 4294967295L) | (r125 << 32), r61, r58);
    L201:
        if (vy0.f(r7.d) == false) goto L209;
        EdgeEffect r64 = r7.e();
        r56.getClass();
        float r126 = r26.M(0.0f);
        long r127 = Float.floatToRawIntBits(0.0f);
        if (u0(0.0f, (((long) Float.floatToRawIntBits(r126)) & 4294967295L) | (r127 << 32), r64, r58) == true) goto L207;
        if (r63 == true) goto L207;
        r63 = false;
    L207:
        r63 = true;
    L209:
        if (vy0.f(r7.g) == false) goto L221;
        EdgeEffect r65 = r7.d();
        int r128 = ji2.L(Float.intBitsToFloat((int) (r57.P() >> 32)));
        if (r26.getLayoutDirection() != r60) goto L213;
        float r66 = r56.b;
    L214:
        float r67 = r26.M(r66) + (-r128);
        if (u0(90.0f, (Float.floatToRawIntBits(0.0f) << 32) | (((long) Float.floatToRawIntBits(r67)) & 4294967295L), r65, r58) == true) goto L219;
        if (r63 == true) goto L219;
        r63 = false;
    L219:
        r63 = true;
        goto L221
    L213:
        r66 = r56.a;
    L221:
        if (vy0.f(r7.e) == false) goto L229;
        EdgeEffect r68 = r7.b();
        r56.getClass();
        float r69 = r26.M(0.0f);
        float r70 = -Float.intBitsToFloat((int) (r57.P() >> 32));
        float r71 = (-Float.intBitsToFloat((int) (r57.P() & 4294967295L))) + r69;
        if (u0(180.0f, (Float.floatToRawIntBits(r70) << 32) | (((long) Float.floatToRawIntBits(r71)) & 4294967295L), r68, r58) == true) goto L227;
        if (r63 == true) goto L227;
        boolean r72 = false;
    L228:
        r63 = r72;
    L227:
        r72 = true;
    L229:
        if (r63 == false) goto L239;
        r3.d();
        return;
    L239:
        return;
    L197:
        r123 = r56.b;
        goto L198
    L199:
        r63 = false;
        goto L201
    }

    public RenderNode v0() {
        RenderNode r0 = (RenderNode) this.G;
        if (r0 != null) goto L6;
        RenderNode r1 = ek2.f();
        this.G = r1;
        return r1;
    L6:
        return r0;
    }

    public bj1(ip4 r2, tb r3, vy0 r4) {
        this.D = 1;
        this.E = r3;
        this.F = r4;
        q0(r2);
    }
}
