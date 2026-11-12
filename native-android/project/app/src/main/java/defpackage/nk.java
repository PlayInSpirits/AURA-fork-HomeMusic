package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nk implements Runnable {
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Runnable q;
    public final /* synthetic */ pk r;

    public nk(pk r1, List r2, List r3, int r4, Runnable r5) {
        this.r = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zg5 r1 = new zg5(this);
        int r2 = r1.u();
        int r3 = r1.t();
        ArrayList r4 = new ArrayList();
        ArrayList r5 = new ArrayList();
        zp0 r6 = new zp0();
        int r7 = 0;
        r6.a = 0;
        r6.b = r2;
        r6.c = 0;
        r6.d = r3;
        r5.add(r6);
        int r8 = r2 + r3;
        int r9 = 1;
        int r10 = (((r8 + 1) / 2) * 2) + 1;
        int[] r11 = new int[r10];
        int r12 = r10 / 2;
        int[] r13 = new int[r10];
        ArrayList r14 = new ArrayList();
    L4:
        if (r5.isEmpty() == true) goto L118;
        zp0 r15 = (zp0) r5.remove(r5.size() - r9);
        if (r15.b() >= r9) goto L8;
    L97:
        int r18 = r12;
        aq0 r16 = null;
    L98:
        if (r16 != null) goto L100;
        int r17 = 1;
        r14.add(r15);
    L117:
        r9 = r17;
        r12 = r18;
        r7 = 0;
        goto L4
    L100:
        if (r16.a() <= 0) goto L112;
        int r19 = r16.d;
        int r20 = r16.b;
        int r21 = r19 - r20;
        int r22 = r16.c;
        int r110 = r16.a;
        int r23 = r22 - r110;
        if (r21 != r23) goto L104;
        wp0 r24 = new wp0(r110, r20, r23);
    L110:
        r4.add(r24);
        goto L112
    L104:
        if (r16.e == false) goto L106;
        r24 = new wp0(r110, r20, r16.a());
        goto L110
    L106:
        if (r21 <= r23) goto L108;
        r24 = new wp0(r110, r20 + 1, r16.a());
        goto L110
    L108:
        r24 = new wp0(r110 + 1, r20, r16.a());
    L112:
        if (r14.isEmpty() == false) goto L114;
        zp0 r25 = new zp0();
        r17 = 1;
    L115:
        r25.a = r15.a;
        r25.c = r15.c;
        r25.b = r16.a;
        r25.d = r16.b;
        r5.add(r25);
        r15.b = r15.b;
        r15.d = r15.d;
        r15.a = r16.c;
        r15.c = r16.d;
        r5.add(r15);
        goto L117
    L114:
        r17 = 1;
        r25 = (zp0) r14.remove(r14.size() - 1);
        goto L115
    L8:
        if (r15.a() < r9) goto L97;
        int r111 = ((r15.a() + r15.b()) + r9) / 2;
        int r112 = r9 + r12;
        r11[r112] = r15.a;
        r13[r112] = r15.b;
        int r113 = r7;
    L11:
        if (r113 >= r111) goto L97;
        if ((Math.abs(r15.b() - r15.a()) % 2) != r9) goto L15;
        int r114 = r9;
    L16:
        int r115 = r15.b() - r15.a();
        int r116 = -r113;
        int r26 = r116;
    L17:
        if (r26 > r113) goto L53;
        if (r26 == r116) goto L26;
        if (r26 == r113) goto L23;
        int r117 = r26;
        if (r11[(r26 + 1) + r12] > r11[(r26 - 1) + r12]) goto L27;
    L24:
        int r27 = r11[(r117 - 1) + r12];
        int r28 = r27 + 1;
    L25:
        r18 = r12;
        int r29 = ((r28 - r15.a) + r15.c) - r117;
        if (r113 == 0) goto L33;
        if (r28 != r27) goto L33;
        int r30 = r29 - 1;
    L34:
        int r210 = r111;
        int r118 = r29;
        int r31 = r28;
        int r211 = r210;
        int r212 = r114;
    L36:
        if (r31 >= r15.b) goto L42;
        if (r118 >= r15.d) goto L42;
        if (r1.m(r31, r118) == false) goto L42;
        r31 = r31 + 1;
        r118 = r118 + 1;
    L42:
        r11[r117 + r18] = r31;
        if (r212 == 0) goto L51;
        int r119 = r115 - r117;
        int r213 = r115;
        if (r119 < (r116 + 1)) goto L52;
        if (r119 > (r113 - 1)) goto L52;
        if (r13[r119 + r18] > r31) goto L52;
        aq0 r120 = new aq0();
        r120.a = r27;
        r120.b = r30;
        r120.c = r31;
        r120.d = r118;
        r120.e = false;
    L54:
        if (r120 != null) goto L55;
        if (((r15.b() - r15.a()) % 2) != 0) goto L59;
        boolean r32 = true;
    L60:
        int r33 = r15.b() - r15.a();
        int r34 = r116;
    L61:
        if (r34 > r113) goto L93;
        if (r34 == r116) goto L68;
        if (r34 != r113) goto L65;
    L67:
        int r121 = r13[(r34 - 1) + r18];
        int r122 = r121 - 1;
    L69:
        boolean r123 = r32;
        int r124 = r15.d - ((r15.b - r122) - r34);
        if (r113 == 0) goto L74;
        if (r122 != r121) goto L74;
        int r35 = r124 + 1;
    L75:
        int r214 = r33;
    L77:
        if (r122 <= r15.a) goto L83;
        if (r124 <= r15.c) goto L83;
        int r215 = r34;
        if (r1.m(r122 - 1, r124 - 1) == false) goto L84;
        r122 = r122 - 1;
        r124 = r124 - 1;
        r34 = r215;
    L84:
        r13[r215 + r18] = r122;
        if (r123 == false) goto L92;
        int r36 = r214 - r215;
        if (r36 < r116) goto L92;
        if (r36 > r113) goto L92;
        if (r11[r36 + r18] < r122) goto L92;
        aq0 r37 = new aq0();
        r37.a = r122;
        r37.b = r124;
        r37.c = r121;
        r37.d = r35;
        r37.e = true;
    L94:
        if (r37 != null) goto L95;
        r113 = r113 + 1;
        r12 = r18;
        r111 = r211;
        r9 = 1;
        r7 = 0;
        goto L11
    L95:
        r16 = r37;
    L92:
        r34 = r215 + 2;
        r32 = r123;
        r33 = r214;
    L83:
        r215 = r34;
    L74:
        r35 = r124;
        goto L75
    L65:
        if (r13[(r34 + 1) + r18] >= r13[(r34 - 1) + r18]) goto L67;
    L68:
        r121 = r13[(r34 + 1) + r18];
        r122 = r121;
        goto L69
    L93:
        r37 = null;
        goto L94
    L59:
        r32 = false;
        goto L60
    L55:
        r16 = r120;
    L52:
        r26 = r117 + 2;
        r12 = r18;
        r111 = r211;
        r114 = r212;
        r115 = r213;
        goto L17
    L51:
        r213 = r115;
    L33:
        r30 = r29;
    L27:
        r27 = r11[(r117 + 1) + r12];
        r28 = r27;
        goto L25
    L23:
        r117 = r26;
        goto L24
    L26:
        r117 = r26;
        goto L27
    L53:
        r18 = r12;
        r211 = r111;
        r120 = null;
        goto L54
    L15:
        r114 = r7;
        goto L16
    L118:
        Collections.sort(r4, jz4.a);
        this.r.c.execute(new lg1(this, new xp0(r1, r4, r11, r13), false, 5));
    }
}
