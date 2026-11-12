package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 extends ir2 {
    public final zh0 f;
    public final aw g;
    public sk4 h;

    public hy2(g74 r1, zh0 r2, q70 r3, oo0 r4) {
        super(r1, r3, r4);
        this.f = r2;
        this.g = su3.a(Integer.MAX_VALUE, 6, null);
    }

    public static final Object E(hy2 r19, g74 r20, cy2 r21, float r22, float r23, wd0 r24) {
        rf2 r9 = (rf2) r19.e;
        if ((r24 instanceof dy2) == false) goto L8;
        dy2 r2 = (dy2) r24;
        int r3 = r2.s;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L8;
        r2.s = r3 - Integer.MIN_VALUE;
    L7:
        dy2 r10 = r2;
        Object r1 = r10.q;
        int r4 = r10.s;
        j15 r13 = j15.a;
        Object r5 = xe0.n;
        if (r4 == 0) goto L18;
        if (r4 == 1) goto L17;
        if (r4 != 2) goto L15;
        kb4.X(r1);
        return r13;
    L15:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L17:
        float r0 = r10.p;
        gx3 r6 = r10.o;
        g74 r7 = r10.n;
        kb4.X(r1);
        Object r12 = r5;
        j15 r16 = r13;
    L30:
        long r8 = e35.h(((m45) r9.n).b(Float.MAX_VALUE), ((m45) r9.o).b(Float.MAX_VALUE));
        if (r8 != 0) goto L40;
        float r11 = (r7.e(Math.signum(r6.n)) * Math.min(Math.abs(r6.n) / 100.0f, r0)) * 1000.0f;
        if (r11 != 0.0f) goto L36;
        r8 = 0;
        goto L40
    L36:
        if (r7.d != hb3.o) goto L39;
        long r14 = e35.h(r11, 0.0f);
    L38:
        r8 = r14;
        goto L40
    L39:
        r14 = e35.h(0.0f, r11);
    L40:
        wf1 r15 = (wf1) r19.c;
        k45 r17 = new k45(r8);
        r10.n = null;
        r10.o = null;
        r10.s = 2;
        if (r15.invoke(r17, r10) != r12) goto L43;
    L42:
        return r12;
    L43:
        return r16;
    L18:
        kb4.X(r1);
        jx3 r18 = new jx3();
        r18.n = r21;
        r16 = r13;
        long r110 = r21.b;
        long r111 = r21.a;
        ((m45) r9.n).a(r110, Float.intBitsToFloat((int) (r111 >> 32)));
        ((m45) r9.o).a(r110, Float.intBitsToFloat((int) (r111 & 4294967295L)));
        cy2 r25 = I(r19.g);
        if (r25 == null) goto L22;
        long r112 = r25.b;
        long r113 = r25.a;
        ((m45) r9.n).a(r112, Float.intBitsToFloat((int) (r113 >> 32)));
        ((m45) r9.o).a(r112, Float.intBitsToFloat((int) (r113 & 4294967295L)));
        jx3 r26 = r18;
        r26.n = ((cy2) r26.n).a(r25);
    L23:
        gx3 r27 = new gx3();
        float r28 = r20.h(r20.f(((cy2) r26.n).a));
        r27.n = r28;
        if (h12.b(r28) == true) goto L43;
        jx3 r29 = new jx3();
        r29.n = j51.a(0.0f, 0.0f, 30);
        r12 = r5;
        wf1 r30 = new fy2(r27, r29, r26, r22, r19, r23, r20, null);
        r10.n = r20;
        r10.o = r27;
        r10.p = r23;
        r10.s = 1;
        if (r19.D(r30, r10) == r12) goto L42;
        r6 = r27;
        r0 = r23;
        r7 = r20;
        goto L30
    L22:
        r26 = r18;
    L8:
        r2 = new dy2(r19, r24);
        goto L7
    }

    public static final Object F(hy2 r11, jx3 r12, gx3 r13, g74 r14, jx3 r15, long r16, wd0 r18) {
        if ((r18 instanceof gy2) == false) goto L7;
        gy2 r3 = (gy2) r18;
        int r4 = r3.t;
        if ((r4 & Integer.MIN_VALUE) == 0) goto L7;
        r3.t = r4 - Integer.MIN_VALUE;
    L8:
        Object r2 = r3.s;
        int r5 = r3.t;
        vd0 r6 = null;
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L12;
        jx3 r17 = r3.r;
        g74 r19 = r3.q;
        gx3 r0 = r3.p;
        jx3 r1 = r3.o;
        hy2 r7 = r3.n;
        kb4.X(r2);
        jx3 r8 = r17;
        g74 r9 = r19;
        r12 = r1;
        r11 = r7;
    L22:
        cy2 r10 = (cy2) r2;
        if (r10 == null) goto L25;
        boolean r20 = ((cy2) r12.n).c;
        long r21 = r10.a;
        r12.n = new cy2(r21, r10.b, r20);
        r0.n = r9.j(r9.f(r21));
        r8.n = j51.a(0.0f, 0.0f, 30);
        rf2 r110 = (rf2) r11.e;
        long r22 = r10.b;
        long r23 = r10.a;
        ((m45) r110.n).a(r22, Float.intBitsToFloat((int) (r23 >> 32)));
        ((m45) r110.o).a(r22, Float.intBitsToFloat((int) (r23 & 4294967295L)));
        boolean r111 = !h12.b(r0.n);
    L27:
        return Boolean.valueOf(r111);
    L25:
        r111 = false;
        goto L27
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r2);
        if (r16 < 0) goto L17;
        ac0 r24 = new ac0(r11, r6, 4);
        r3.n = r11;
        r3.o = r12;
        r3.p = r13;
        r3.q = r14;
        r3.r = r15;
        r3.t = 1;
        r2 = gb.j0(r16, r24, r3);
        xe0 r25 = xe0.n;
        if (r2 != r25) goto L21;
        return r25;
    L21:
        r0 = r13;
        r9 = r14;
        r8 = r15;
        goto L22
    L17:
        return Boolean.FALSE;
    L7:
        r3 = new gy2(r18);
        goto L8
    }

    public static cy2 I(aw r2) {
        cy2 r1 = null;
        ba4 r3 = si0.C(new kb1(new by2(r2, 0), null));
    L4:
        if (r3.hasNext() == false) goto L9;
        cy2 r0 = (cy2) r3.next();
        if (r1 == null) goto L7;
        r0 = r1.a(r0);
    L7:
        r1 = r0;
        goto L4
    L9:
        return r1;
    }

    public final float G(e74 r4, float r5) {
        g74 r3 = (g74) this.b;
        long r0 = r3.i(r3.e(r5));
        g74 r6 = r4.a;
        return r3.h(r3.f(r6.d(r6.k, r0, 1)));
    }

    public final boolean H(kn3 r12) {
        oo0 r0 = (oo0) this.d;
        ViewConfiguration r1 = (ViewConfiguration) this.f.o;
        int r2 = Build.VERSION.SDK_INT;
        if (r2 <= 26) goto L5;
        float r5 = r50.h(r1);
    L6:
        float r6 = -r5;
        if (r2 <= 26) goto L9;
        float r3 = r50.e(r1);
    L10:
        float r4 = -r3;
        List r7 = r12.a;
        g83 r8 = new g83(0);
        int r9 = r7.size();
        boolean r10 = false;
        int r11 = 0;
    L11:
        long r13 = r8.a;
        if (r11 >= r9) goto L14;
        r8 = new g83(g83.e(r13, ((on3) r7.get(r11)).j));
        r11 = r11 + 1;
        goto L11
    L14:
        float r14 = Float.intBitsToFloat((int) (r13 >> 32)) * r4;
        float r15 = Float.intBitsToFloat((int) (r13 & 4294967295L)) * r6;
        long r16 = (Float.floatToRawIntBits(r14) << 32) | (Float.floatToRawIntBits(r15) & 4294967295L);
        g74 r17 = (g74) this.b;
        float r18 = r17.j(r17.f(r16));
        if (r18 == 0.0f) goto L21;
        a74 r19 = r17.a;
        if (r18 <= 0.0f) goto L20;
        r10 = r19.c();
        goto L21
    L20:
        r10 = r19.b();
    L21:
        if (r10 == false) goto L25;
        return !(this.g.d(new cy2(r16, ((on3) q40.w0(r12.a)).b, false)) instanceof i10);
    L25:
        return this.a;
    L9:
        r3 = r0.M(64.0f);
        goto L10
    L5:
        r5 = r0.M(64.0f);
        goto L6
    }
}
