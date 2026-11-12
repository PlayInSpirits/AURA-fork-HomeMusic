package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d60 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ d60(int r1) {
        this.n = 15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r7v10, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [f13] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.wf1
    public final Object invoke(Object r18, Object r19) {
        int r0 = this.n;
        boolean r4 = false;
        int r5 = 0;
        boolean r6 = false;
        j15 r7 = j15.a;
        switch(r0) {
            case 0: goto L160;
            case 1: goto L155;
            case 2: goto L147;
            case 3: goto L139;
            case 4: goto L137;
            case 5: goto L89;
            case 6: goto L85;
            case 7: goto L83;
            case 8: goto L82;
            case 9: goto L69;
            case 10: goto L67;
            case 11: goto L66;
            case 12: goto L64;
            case 13: goto L61;
            case 14: goto L56;
            case 15: goto L54;
            case 16: goto L52;
            case 17: goto L30;
            case 18: goto L28;
            case 19: goto L26;
            case 20: goto L24;
            case 21: goto L22;
            case 22: goto L20;
            case 23: goto L18;
            case 24: goto L16;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        t44 r1 = (t44) r18;
        return Integer.valueOf(((ur4) r19).a);
    L6:
        t44 r2 = (t44) r18;
        return Integer.valueOf(((mr4) r19).a);
    L8:
        t44 r3 = (t44) r18;
        xb4 r8 = (xb4) r19;
        return gb.d(new Object[]{s54.a(new x40(r8.a), s54.p, r3), s54.a(new g83(r8.b), s54.x, r3), Float.valueOf(r8.c)});
    L10:
        t44 r9 = (t44) r18;
        ss4 r10 = (ss4) r19;
        return gb.d(new Integer[]{Integer.valueOf((int) (r10.a >> 32)), Integer.valueOf((int) (r10.a & 4294967295L))});
    L12:
        t44 r11 = (t44) r18;
        List r12 = (List) r19;
        ArrayList r13 = new ArrayList(r12.size());
        int r14 = r12.size();
    L13:
        if (r5 >= r14) goto L15;
        r13.add(s54.a((ge) r12.get(r5), s54.b, r11));
        r5 = r5 + 1;
        goto L13
    L15:
        return r13;
    L16:
        t44 r15 = (t44) r18;
        return Float.valueOf(((hr) r19).a);
    L18:
        hb2 r16 = (hb2) r19;
        return gb.d(new Object[]{r16.a, s54.a(r16.b, s54.i, (t44) r18)});
    L20:
        t44 r17 = (t44) r18;
        return Integer.valueOf(((gb1) r19).n);
    L22:
        t44 r20 = (t44) r18;
        cs4 r21 = (cs4) r19;
        bt4 r22 = new bt4(r21.a);
        r54 r23 = s54.v;
        return gb.d(new Object[]{s54.a(r22, r23, r20), s54.a(new bt4(r21.b), r23, r20)});
    L24:
        t44 r24 = (t44) r18;
        bs4 r25 = (bs4) r19;
        return gb.d(new Float[]{Float.valueOf(r25.a), Float.valueOf(r25.b)});
    L26:
        t44 r26 = (t44) r18;
        return Integer.valueOf(((sr4) r19).a);
    L28:
        he r27 = (he) r19;
        return gb.d(new Object[]{r27.o, s54.a(r27.n, s54.a, (t44) r18)});
    L30:
        t44 r28 = (t44) r18;
        w44 r29 = (w44) r19;
        Map r30 = r29.n;
        w03 r31 = r29.o;
        Object[] r32 = r31.b;
        Object[] r33 = r31.c;
        long[] r34 = r31.a;
        int r35 = r34.length - 2;
        if (r35 < 0) goto L48;
        int r36 = 0;
    L33:
        long r37 = r34[r36];
        if (((((~r37) << 7) & r37) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L45;
        int r110 = 8 - ((~(r36 - r35)) >>> 31);
        int r111 = 0;
    L36:
        if (r111 >= r110) goto L44;
        if ((255 & r37) >= 128) goto L43;
        int r112 = (r36 << 3) + r111;
        Object r113 = r32[r112];
        Map r114 = ((x44) r33[r112]).c();
        if (r114.isEmpty() == false) goto L42;
        r30.remove(r113);
        goto L43
    L42:
        r30.put(r113, r114);
    L43:
        r37 = r37 >> 8;
        r111 = r111 + 1;
        goto L36
    L44:
        if (r110 != 8) goto L48;
    L45:
        if (r36 == r35) goto L48;
        r36 = r36 + 1;
    L48:
        if (r30.isEmpty() == false) goto L51;
        return null;
    L51:
        return r30;
    L52:
        le0 r38 = (le0) r19;
        return Integer.valueOf(((Integer) r18).intValue() + 1);
    L54:
        ((Integer) r19).getClass();
        e35.d(xl.O(1), (rg1) r18);
        return r7;
    L56:
        t44 r39 = (t44) r18;
        Map r40 = ((z82) r19).c();
        if (r40.isEmpty() == false) goto L60;
        return null;
    L60:
        return r40;
    L61:
        t44 r41 = (t44) r18;
        lm0 r42 = (lm0) r19;
        return gb.P(new Object[]{Integer.valueOf(r42.k()), Float.valueOf(gb.l(r42.l(), -0.5f, 0.5f)), Integer.valueOf(r42.n())});
    L67:
        Boolean r43 = (Boolean) r18;
        r43.booleanValue();
        le0 r44 = (le0) r19;
        return r43;
    L69:
        ne0 r45 = (ne0) r18;
        le0 r46 = (le0) r19;
        r45.getClass();
        r46.getClass();
        ne0 r47 = r45.u(r46.getKey());
        q01 r48 = q01.n;
        if (r47 == r48) goto L190;
        fz0 r49 = fz0.R;
        pe0 r50 = (pe0) r47.K(r49);
        if (r50 != null) goto L76;
        e60 r51 = new e60(r46, r47);
    L80:
        return r51;
    L76:
        ne0 r52 = r47.u(r49);
        if (r52 == r48) goto L189;
        r51 = new e60(r50, new e60(r46, r52));
        goto L80
    L189:
        return new e60(r50, r46);
    L190:
        return r46;
    L83:
        ((Integer) r19).getClass();
        ((c72) ((e80) r18)).getClass();
        return r7;
    L85:
        ui2 r53 = (ui2) r19;
        c72 r54 = (c72) ((e80) r18);
        if (h12.c(r54.I, r53) == true) goto L88;
        r54.I = r53;
        r54.D();
    L88:
        return r7;
    L89:
        c90 r55 = (c90) r19;
        c72 r56 = (c72) ((e80) r18);
        r56.M = r55;
        w12 r57 = r56.Q;
        wl4 r58 = g90.h;
        mf3 r59 = (mf3) r55;
        r59.getClass();
        r56.a0((oo0) vr1.C(r59, r58));
        mf3 r60 = (mf3) r55;
        r62 r61 = (r62) vr1.C(r60, g90.n);
        if (r56.K == r61) goto L100;
        r56.K = r61;
        r56.D();
        c72 r62 = r56.t();
        if (r62 == null) goto L94;
        r62.B();
    L97:
        r56.C();
        cx2 r63 = (cx2) r57.g;
    L98:
        if (r63 == null) goto L100;
        r63.C();
        r63 = r63.s;
        goto L98
    L94:
        ub3 r64 = r56.A;
        if (r64 == null) goto L97;
        ((ra) r64).invalidate();
    L100:
        r56.e0((m65) vr1.C(r60, g90.t));
        cx2 r65 = (cx2) r57.g;
        if ((r65.q & 32768) == 0) goto L136;
    L102:
        if (r65 == null) goto L136;
        if ((r65.p & 32768) == 0) goto L134;
        ?? r66 = r65;
        ?? r67 = 0;
    L106:
        if (r66 == 0) goto L134;
        if ((r66 instanceof a90) == true) goto L109;
        if ((r66.p & 32768) == 0) goto L132;
        if ((r66 instanceof fo0) == false) goto L132;
        cx2 r68 = ((fo0) r66).C;
        int r69 = 0;
        r66 = r66;
        r67 = r67;
    L118:
        if (r68 == null) goto L130;
        if ((r68.p & 32768) == 0) goto L129;
        r69 = r69 + 1;
        r67 = r67;
        if (r69 != 1) goto L124;
        r66 = r68;
        goto L129
    L124:
        if (r67 != 0) goto L126;
        r67 = new f13(new cx2[16]);
    L126:
        if (r66 == 0) goto L128;
        r67.b(r66);
        r66 = 0;
    L128:
        r67.b(r68);
    L129:
        r68 = r68.s;
        r66 = r66;
        r67 = r67;
        goto L118
    L130:
        if (r69 == 1) goto L106;
    L132:
        r66 = j51.c(r67);
        goto L106
    L109:
        cx2 r70 = ((cx2) ((a90) r66)).n;
        if (r70.A == false) goto L112;
        g63.c(r70);
        goto L132
    L112:
        r70.w = true;
    L134:
        if ((r65.q & 32768) == 0) goto L136;
        r65 = r65.s;
    L136:
        return r7;
    L137:
        ((c72) ((e80) r18)).d0((dx2) r19);
        return r7;
    L139:
        rg1 r71 = (rg1) r18;
        int r72 = ((Integer) r19).intValue();
        if ((r72 & 3) == 2) goto L143;
        r6 = true;
    L143:
        if (r71.K(r72 & 1, r6) == true) goto L146;
        r71.N();
    L146:
        return r7;
    L147:
        rg1 r73 = (rg1) r18;
        int r74 = ((Integer) r19).intValue();
        if ((r74 & 3) == 2) goto L151;
        r4 = true;
    L151:
        if (r73.K(r74 & 1, r4) == true) goto L154;
        r73.N();
    L154:
        return r7;
    L155:
        StringBuilder r75 = (StringBuilder) r18;
        bx2 r76 = (bx2) r19;
        if (r75.length() <= 1) goto L158;
        r75.append(", ");
    L158:
        r75.append(r76);
        return r75;
    L160:
        String r77 = (String) r18;
        le0 r78 = (le0) r19;
        r77.getClass();
        r78.getClass();
        if (r77.length() != 0) goto L164;
        return r78.toString();
    L164:
        return r77 + ", " + r78;
    L64:
        return ((ne0) r18).J((le0) r19);
    L66:
        return ((ne0) r18).J((le0) r19);
    L82:
        return ((dx2) r18).c((bx2) r19);
    }

    public /* synthetic */ d60(int r1, byte r2) {
        this.n = r1;
    }
}
