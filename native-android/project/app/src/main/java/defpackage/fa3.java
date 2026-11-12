package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fa3 extends e22 {
    public static final fa3 f = null;

    static {
        f = new fa3(1, 0, 2);
    }

    @Override // defpackage.e22
    public final void d(x20 r18, bi r19, lg4 r20, uy3 r21, wa3 r22) {
        int r2 = r18.c(0);
        if (r20.n == 0) goto L7;
        l80.a("Cannot move a group while inserting");
    L7:
        if (r2 >= 0) goto L10;
        l80.a("Parameter offset is out of bounds");
    L10:
        if (r2 == 0) goto L65;
        int r4 = r20.t;
        int r5 = r20.v;
        int r6 = r20.u;
        int r7 = r4;
    L13:
        int[] r8 = r20.b;
        if (r2 <= 0) goto L20;
        r7 = r7 + r8[(r20.r(r7) * 5) + 3];
        if (r7 <= r6) goto L19;
        l80.a("Parameter offset is out of bounds");
    L19:
        r2 = r2 - 1;
        goto L13
    L20:
        int r3 = r8[(r20.r(r7) * 5) + 3];
        int r9 = r20.g(r20.b, r20.r(r20.t));
        int r10 = r20.g(r20.b, r20.r(r7));
        int r11 = r7 + r3;
        int r12 = r20.g(r20.b, r20.r(r11));
        int r13 = r12 - r10;
        r20.x(r13, Math.max(r20.t - 1, 0));
        r20.w(r3);
        int[] r14 = r20.b;
        int r15 = r20.r(r11) * 5;
        ti.Y(r20.r(r4) * 5, r15, (r3 * 5) + r15, r14, r14);
        if (r13 <= 0) goto L23;
        Object[] r16 = r20.c;
        int r17 = r20.h(r10 + r13);
        System.arraycopy(r16, r17, r16, r9, r20.h(r12 + r13) - r17);
    L23:
        int r23 = r10 + r13;
        int r24 = r23 - r9;
        int r25 = r20.k;
        int r110 = r20.l;
        int r111 = r20.c.length;
        int r112 = r20.m;
        int r113 = r4 + r3;
        int r114 = r4;
    L24:
        if (r114 >= r113) goto L30;
        int r1 = r20.r(r114);
        int r115 = r24;
        int r26 = r20.g(r14, r1) - r115;
        if (r112 >= r1) goto L28;
        int r27 = 0;
    L29:
        int[] r28 = r14;
        r28[(r1 * 5) + 4] = lg4.i(lg4.i(r26, r27, r110, r111), r20.k, r20.l, r20.c.length);
        r114 = r114 + 1;
        r24 = r115;
        r14 = r28;
        r25 = r25;
        goto L24
    L28:
        r27 = r25;
        goto L29
    L30:
        int r29 = r11 + r3;
        int r30 = r20.p();
        int r31 = kg4.a(r20.d, r11, r30);
        ArrayList r116 = new ArrayList();
        if (r31 >= 0) goto L33;
    L38:
        int r32 = r4 - r11;
        int r33 = r116.size();
        int r117 = 0;
    L39:
        if (r117 >= r33) goto L46;
        mg1 r118 = (mg1) r116.get(r117);
        int r119 = r20.c(r118) + r32;
        if (r119 < r20.g) goto L43;
        r118.a = -(r30 - r119);
    L44:
        r20.d.add(kg4.a(r20.d, r119, r30), r118);
        r117 = r117 + 1;
        goto L39
    L43:
        r118.a = r119;
        goto L44
    L46:
        if (r20.I(r11, r3) == false) goto L48;
        l80.a("Unexpectedly removed anchors");
    L48:
        r20.m(r5, r20.u, r4);
        if (r13 <= 0) goto L64;
        r20.J(r23, r13, r11 - 1);
        return;
    L64:
        return;
    L33:
        if (r31 >= r20.d.size()) goto L38;
        mg1 r120 = (mg1) r20.d.get(r31);
        int r121 = r20.c(r120);
        if (r121 < r11) goto L38;
        if (r121 >= r29) goto L38;
        r116.add(r120);
        mg1 r122 = (mg1) r20.d.remove(r31);
        goto L33
    }
}
