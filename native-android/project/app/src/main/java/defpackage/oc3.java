package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArrayList o;

    public /* synthetic */ oc3(int r1, ArrayList r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r20) {
        int r1 = this.n;
        j15 r2 = j15.a;
        ArrayList r0 = this.o;
        switch(r1) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        ig3 r3 = (ig3) r20;
        int r4 = r0.size();
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L7;
        ig3.n(r3, (jg3) r0.get(r5));
        r5 = r5 + 1;
        goto L5
    L7:
        return r2;
    L8:
        ig3 r6 = (ig3) r20;
        int r7 = r0.size();
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L45;
        xi2 r9 = (xi2) r0.get(r8);
        List r10 = r9.b;
        boolean r11 = r9.i;
        if (r9.m != Integer.MIN_VALUE) goto L14;
        fz1.a("position() should be called first");
    L14:
        int r12 = r10.size();
        int r13 = 0;
    L15:
        if (r13 >= r12) goto L44;
        jg3 r14 = (jg3) r10.get(r13);
        int[] r15 = r9.k;
        int r16 = r13 * 2;
        int r17 = r15[r16];
        int r18 = r15[r16 + 1];
        int r19 = r7;
        long r21 = ((long) r18) & 4294967295L;
        long r22 = r21 | (((long) r17) << 32);
        if (r9.h == false) goto L33;
        if (r11 == false) goto L20;
        int r110 = (int) (r22 >> 32);
    L25:
        if (r11 == false) goto L31;
        int r23 = r9.m;
        int r24 = r23 - ((int) (r22 & 4294967295L));
        if (r11 == false) goto L29;
        int r25 = r14.o;
    L30:
        int r26 = r24 - r25;
    L32:
        long r27 = ((long) r26) & 4294967295L;
        r22 = r27 | (((long) r110) << 32);
        goto L33
    L29:
        r25 = r14.n;
        goto L30
    L31:
        r26 = (int) (r22 & 4294967295L);
        goto L32
    L20:
        int r111 = r9.m;
        int r112 = r111 - ((int) (r22 >> 32));
        if (r11 == false) goto L23;
        int r113 = r14.o;
    L24:
        r110 = r112 - r113;
        goto L25
    L23:
        r113 = r14.n;
    L33:
        long r28 = g02.c(r22, r9.c);
        if (r11 == false) goto L36;
        k52 r114 = kg3.a;
        r6.getClass();
        ig3.a(r6, r14);
        r14.N(g02.c(r28, r14.r), 0.0f, r114);
    L43:
        r13 = r13 + 1;
        r7 = r19;
        goto L15
    L36:
        k52 r115 = kg3.a;
        if (r6.c() == r62.n) goto L42;
        if (r6.e() == 0) goto L42;
        int r116 = (r6.e() - r14.n) - ((int) (r28 >> 32));
        long r29 = ((long) ((int) (r28 & 4294967295L))) & 4294967295L;
        ig3.a(r6, r14);
        r14.N(g02.c(r29 | (((long) r116) << 32), r14.r), 0.0f, r115);
    L42:
        ig3.a(r6, r14);
        r14.N(g02.c(r28, r14.r), 0.0f, r115);
        goto L43
    L44:
        r8 = r8 + 1;
        goto L9
    L45:
        return r2;
    }
}
