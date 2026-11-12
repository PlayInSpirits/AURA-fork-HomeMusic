package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hw4 extends ir2 {
    public final aw f;
    public sk4 g;

    public hw4(g74 r1, q70 r2, oo0 r3) {
        super(r1, r2, r3);
        this.f = su3.a(Integer.MAX_VALUE, 6, null);
    }

    public static final Object E(hw4 r16, g74 r17, fw4 r18, wd0 r19) {
        r16.getClass();
        rf2 r6 = (rf2) r16.e;
        if ((r19 instanceof gw4) == false) goto L8;
        gw4 r3 = (gw4) r19;
        int r4 = r3.p;
        if ((r4 & Integer.MIN_VALUE) == 0) goto L8;
        r3.p = r4 - Integer.MIN_VALUE;
    L7:
        gw4 r7 = r3;
        Object r2 = r7.n;
        int r5 = r7.p;
        Object r10 = xe0.n;
        if (r5 == 0) goto L17;
        if (r5 == 1) goto L16;
        if (r5 != 2) goto L14;
        kb4.X(r2);
    L27:
        return j15.a;
    L14:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        kb4.X(r2);
    L23:
        wf1 r0 = (wf1) r16.c;
        k45 r8 = new k45(e35.h(((m45) r6.n).b(Float.MAX_VALUE), ((m45) r6.o).b(Float.MAX_VALUE)));
        r7.p = 2;
        if (r0.invoke(r8, r7) != r10) goto L27;
    L25:
        return r10;
    L17:
        kb4.X(r2);
        jx3 r9 = new jx3();
        r9.n = r18;
        long r11 = r18.b;
        long r12 = r18.a;
        ((m45) r6.n).a(r11, Float.intBitsToFloat((int) (r12 >> 32)));
        ((m45) r6.o).a(r11, Float.intBitsToFloat((int) (r12 & 4294967295L)));
        fw4 r1 = G(r16.f);
        if (r1 == null) goto L20;
        long r13 = r1.b;
        long r14 = r1.a;
        ((m45) r6.n).a(r13, Float.intBitsToFloat((int) (r14 >> 32)));
        ((m45) r6.o).a(r13, Float.intBitsToFloat((int) (r14 & 4294967295L)));
        r9.n = ((fw4) r9.n).a(r1);
    L20:
        wf1 r15 = new qv3(r16, r17, r9, null, 2);
        r7.p = 1;
        if (r16.D(r15, r7) != r10) goto L23;
    L8:
        r3 = new gw4(r16, r19);
        goto L7
    }

    public static fw4 G(aw r2) {
        fw4 r1 = null;
        ba4 r3 = si0.C(new kb1(new by2(r2, 1), null));
    L4:
        if (r3.hasNext() == false) goto L9;
        fw4 r0 = (fw4) r3.next();
        if (r1 == null) goto L7;
        r0 = r1.a(r0);
    L7:
        r1 = r0;
        goto L4
    L9:
        return r1;
    }

    public final boolean F(kn3 r24) {
        g74 r2 = (g74) this.b;
        on3 r3 = (on3) q40.x0(r24.a);
        if (r3 == null) goto L33;
        List r6 = r3.b();
        int r7 = r6.size();
        int r8 = 0;
        boolean r9 = false;
    L5:
        aw r11 = this.f;
        if (r8 >= r7) goto L19;
        bm1 r14 = (bm1) r6.get(r8);
        long r4 = r14.d ^ (-9223372034707292160L);
        if (r2.j(r2.f(r4)) != 0.0f) goto L10;
        boolean r10 = true;
    L11:
        if (r10 == true) goto L18;
        if ((r11.d(new fw4(r4, r14.a, false)) instanceof i10) == false) goto L17;
        if (r9 == true) goto L17;
        r9 = false;
    L17:
        r9 = true;
    L18:
        r8 = r8 + 1;
        goto L5
    L10:
        r10 = false;
        goto L11
    L19:
        boolean r15 = true;
        boolean r16 = false;
        long r5 = r3.l ^ (-9223372034707292160L);
        if (r24.c != 12) goto L22;
        boolean r22 = true;
    L24:
        if (r2.j(r2.f(r5)) != 0.0f) goto L26;
        boolean r1 = true;
    L27:
        if (r1 == false) goto L30;
        if (r22 == true) goto L30;
    L35:
        if (r9 == false) goto L37;
    L40:
        return r15;
    L37:
        if (this.a == true) goto L40;
        return r16;
    L30:
        if ((r11.d(new fw4(r5, r3.b, r22)) instanceof i10) == false) goto L32;
        if (r9 == true) goto L32;
    L34:
        r9 = r16;
    L32:
        r9 = true;
        goto L35
    L26:
        r1 = false;
        goto L27
    L22:
        r22 = false;
        goto L24
    L33:
        r15 = true;
        r16 = false;
        goto L34
    }
}
