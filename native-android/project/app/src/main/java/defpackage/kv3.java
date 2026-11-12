package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ kv3(int r2, List r3, q25 r4) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r19) {
        int r1 = this.n;
        j15 r2 = j15.a;
        Object r3 = this.q;
        Object r4 = this.p;
        int r0 = this.o;
        switch(r1) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        List r5 = (List) r4;
        q25 r6 = (q25) r3;
        List r7 = (List) r19;
        r7.getClass();
        ArrayList r8 = new ArrayList(r40.k0(r5, 10));
        Iterator r9 = r5.iterator();
    L6:
        if (r9.hasNext() == false) goto L8;
        gn2 r10 = (gn2) r9.next();
        long r11 = r6.N;
        r6.N = 1 + r11;
        r8.add(new p25(r11, r10, (String) r6.m.invoke(r10)));
        goto L6
    L8:
        r7.addAll(r0, r8);
        return r2;
    L10:
        lv3 r12 = (lv3) r4;
        p03 r13 = (p03) r3;
        t80 r14 = (t80) r19;
        if (r12.e == r0) goto L13;
    L49:
        return r2;
    L13:
        if (h12.c(r13, r12.f) == false) goto L49;
        if ((r14 instanceof z80) == false) goto L49;
        long[] r15 = r13.a;
        int r16 = r15.length - 2;
        if (r16 < 0) goto L49;
        int r17 = 0;
    L19:
        long r18 = r15[r17];
        if (((((~r18) << 7) & r18) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
        int r110 = 8;
        int r111 = 8 - ((~(r17 - r16)) >>> 31);
        int r112 = 0;
    L22:
        if (r112 >= r111) goto L43;
        if ((255 & r18) >= 128) goto L41;
        int r113 = (r17 << 3) + r112;
        Object r114 = r13.b[r113];
        if (r13.c[r113] == r0) goto L28;
        boolean r20 = true;
    L29:
        if (r20 == false) goto L38;
        int r115 = r110;
        z80 r116 = (z80) r14;
        int r117 = r0;
        w03 r21 = r116.t;
        te5.I(r21, r114, r12);
        t80 r118 = r14;
        if ((r114 instanceof dp0) == false) goto L39;
        dp0 r22 = (dp0) r114;
        if (r21.c(r22) == true) goto L35;
        te5.J(r116.w, r22);
    L35:
        w03 r23 = r12.g;
        if (r23 == null) goto L39;
        r23.j(r114);
    L39:
        if (r20 == false) goto L42;
        r13.f(r113);
    L42:
        r18 = r18 >> r115;
        r112 = r112 + 1;
        r110 = r115;
        r0 = r117;
        r14 = r118;
        goto L22
    L38:
        r117 = r0;
        r118 = r14;
        r115 = r110;
        goto L39
    L28:
        r20 = false;
        goto L29
    L41:
        r117 = r0;
        r118 = r14;
        r115 = r110;
        goto L42
    L43:
        int r119 = r0;
        t80 r120 = r14;
        if (r111 != r110) goto L49;
    L47:
        if (r17 == r16) goto L49;
        r17 = r17 + 1;
        r0 = r119;
        r14 = r120;
        goto L19
    L46:
        r119 = r0;
        r120 = r14;
        goto L47
    }

    public /* synthetic */ kv3(lv3 r2, int r3, p03 r4) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
        this.q = r4;
    }
}
