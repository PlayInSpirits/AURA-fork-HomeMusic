package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n54 implements wf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ n54(int r1) {
        this.n = r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r20, Object r21) {
        boolean r1 = false;
        int r2 = 0;
        boolean r3 = false;
        switch(this.n) {
            case 0: goto L120;
            case 1: goto L118;
            case 2: goto L116;
            case 3: goto L108;
            case 4: goto L106;
            case 5: goto L98;
            case 6: goto L90;
            case 7: goto L55;
            case 8: goto L51;
            case 9: goto L49;
            case 10: goto L47;
            case 11: goto L45;
            case 12: goto L43;
            case 13: goto L41;
            case 14: goto L39;
            case 15: goto L37;
            case 16: goto L35;
            case 17: goto L33;
            case 18: goto L31;
            case 19: goto L29;
            case 20: goto L27;
            case 21: goto L25;
            case 22: goto L23;
            case 23: goto L21;
            case 24: goto L16;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        j15 r4 = (j15) r21;
        return (j15) r20;
    L6:
        String r5 = (String) r21;
        return (String) r20;
    L8:
        m24 r6 = (m24) r21;
        return (m24) r20;
    L10:
        Float r0 = (Float) r20;
        ((Float) r21).floatValue();
        return r0;
    L12:
        List r7 = (List) r20;
        List r8 = (List) r21;
        if (r7 == null) goto L123;
        ArrayList r9 = new ArrayList(r7);
        r9.addAll(r8);
        return r9;
    L123:
        return r8;
    L16:
        Collection r10 = (List) r20;
        List r11 = (List) r21;
        if (r10 != null) goto L20;
        r10 = u01.n;
    L20:
        return q40.G0(r10, r11);
    L21:
        t44 r12 = (t44) r20;
        return Integer.valueOf(((ps4) r21).a);
    L23:
        qs4 r13 = (qs4) r21;
        ps4 r14 = new ps4(r13.a);
        xc5 r15 = t54.e;
        return gb.d(new Object[]{s54.a(r14, r15, (t44) r20), Boolean.valueOf(r13.b)});
    L25:
        t44 r16 = (t44) r20;
        return Integer.valueOf(((ma2) r21).a);
    L27:
        t44 r17 = (t44) r20;
        return Integer.valueOf(((h01) r21).a);
    L29:
        zg3 r18 = (zg3) r21;
        Boolean r19 = Boolean.valueOf(r18.a);
        xc5 r22 = s54.a;
        h01 r23 = new h01(r18.b);
        xc5 r24 = t54.b;
        return gb.d(new Object[]{r19, s54.a(r23, r24, (t44) r20)});
    L31:
        t44 r25 = (t44) r20;
        os4 r26 = (os4) r21;
        ij4 r27 = r26.a;
        xc5 r28 = s54.h;
        return gb.d(new Object[]{s54.a(r27, r28, r25), s54.a(r26.b, r28, r25), s54.a(r26.c, r28, r25), s54.a(r26.d, r28, r25)});
    L33:
        t44 r29 = (t44) r20;
        ij4 r30 = (ij4) r21;
        x40 r31 = new x40(r30.a.c());
        r54 r32 = s54.p;
        Object r33 = s54.a(r31, r32, r29);
        bt4 r34 = new bt4(r30.b);
        r54 r35 = s54.v;
        Object r36 = s54.a(r34, r35, r29);
        gb1 r37 = r30.c;
        gb1 r38 = gb1.o;
        Object r39 = s54.a(r37, s54.m, r29);
        Object r40 = s54.a(r30.d, s54.t, r29);
        Object r41 = s54.a(r30.e, s54.u, r29);
        String r110 = r30.g;
        Object r111 = s54.a(new bt4(r30.h), r35, r29);
        Object r112 = s54.a(r30.i, s54.n, r29);
        Object r113 = s54.a(r30.j, s54.k, r29);
        vd2 r42 = r30.k;
        vd2 r43 = vd2.p;
        Object r114 = s54.a(r42, s54.y, r29);
        Object r115 = s54.a(new x40(r30.l), r32, r29);
        Object r116 = s54.a(r30.m, s54.j, r29);
        xb4 r44 = r30.n;
        xb4 r45 = xb4.d;
        return gb.d(new Object[]{r33, r36, r39, r40, r41, -1, r110, r111, r112, r113, r114, r115, r116, s54.a(r44, s54.o, r29)});
    L35:
        t44 r46 = (t44) r20;
        return ((v25) r21).a;
    L37:
        t44 r47 = (t44) r20;
        sd3 r48 = (sd3) r21;
        Object r49 = s54.a(new mr4(r48.a), s54.q, r47);
        Object r50 = s54.a(new ur4(r48.b), s54.r, r47);
        Object r51 = s54.a(new bt4(r48.c), s54.v, r47);
        cs4 r52 = r48.d;
        cs4 r53 = cs4.c;
        Object r54 = s54.a(r52, s54.l, r47);
        Object r55 = s54.a(r48.e, t54.a, r47);
        ra2 r56 = r48.f;
        ra2 r57 = ra2.d;
        return gb.d(new Object[]{r49, r50, r51, r54, r55, s54.a(r56, s54.A, r47), s54.a(new ma2(r48.g), t54.c, r47), s54.a(new du1(r48.h), s54.s, r47), s54.a(r48.i, t54.d, r47)});
    L39:
        t44 r58 = (t44) r20;
        return ((p45) r21).a;
    L41:
        t44 r59 = (t44) r20;
        return Integer.valueOf(((pa2) r21).a);
    L43:
        t44 r60 = (t44) r20;
        return Integer.valueOf(((qa2) r21).a);
    L45:
        t44 r61 = (t44) r20;
        return Float.valueOf(((oa2) r21).a);
    L47:
        t44 r62 = (t44) r20;
        ra2 r63 = (ra2) r21;
        return gb.d(new Object[]{s54.a(new oa2(r63.a), s54.B, r62), s54.a(new qa2(r63.b), s54.C, r62), s54.a(new pa2(r63.c), s54.D, r62)});
    L49:
        t44 r64 = (t44) r20;
        return ((ud2) r21).a.toLanguageTag();
    L51:
        t44 r65 = (t44) r20;
        List r66 = ((vd2) r21).n;
        ArrayList r67 = new ArrayList(r66.size());
        int r68 = r66.size();
    L52:
        if (r2 >= r68) goto L54;
        r67.add(s54.a((ud2) r66.get(r2), s54.z, r65));
        r2 = r2 + 1;
        goto L52
    L54:
        return r67;
    L55:
        t44 r69 = (t44) r20;
        ge r70 = (ge) r21;
        Object r71 = r70.a;
        if ((r71 instanceof sd3) == false) goto L59;
        je r72 = je.n;
    L77:
        switch(r72.ordinal()) {
            case 0: goto L85;
            case 1: goto L84;
            case 2: goto L83;
            case 3: goto L82;
            case 4: goto L81;
            case 5: goto L80;
            case 6: goto L79;
            default: goto L78;
        };
    L78:
        er1.n();
        return null;
    L79:
        r71.getClass();
        Object r73 = ((om4) r71).a;
    L87:
        return gb.d(new Object[]{r72, r73, Integer.valueOf(r70.b), Integer.valueOf(r70.c), r70.d});
    L80:
        r71.getClass();
        r73 = s54.a((gb2) r71, s54.f, r69);
        goto L87
    L81:
        r71.getClass();
        r73 = s54.a((hb2) r71, s54.e, r69);
        goto L87
    L82:
        r71.getClass();
        r73 = s54.a((v25) r71, s54.d, r69);
        goto L87
    L83:
        r71.getClass();
        r73 = s54.a((p45) r71, s54.c, r69);
        goto L87
    L84:
        r71.getClass();
        r73 = s54.a((ij4) r71, s54.h, r69);
        goto L87
    L85:
        r71.getClass();
        r73 = s54.a((sd3) r71, s54.g, r69);
        goto L87
    L59:
        if ((r71 instanceof ij4) == false) goto L62;
        r72 = je.o;
        goto L77
    L62:
        if ((r71 instanceof p45) == false) goto L65;
        r72 = je.p;
        goto L77
    L65:
        if ((r71 instanceof v25) == false) goto L68;
        r72 = je.q;
        goto L77
    L68:
        if ((r71 instanceof hb2) == false) goto L71;
        r72 = je.r;
        goto L77
    L71:
        if ((r71 instanceof gb2) == false) goto L74;
        r72 = je.s;
        goto L77
    L74:
        if ((r71 instanceof om4) == false) goto L89;
        r72 = je.t;
        goto L77
    L89:
        throw new UnsupportedOperationException();
    L90:
        t44 r74 = (t44) r20;
        g83 r75 = (g83) r21;
        if (r75 == null) goto L94;
        r3 = g83.b(r75.a, 9205357640488583168L);
    L94:
        if (r3 == false) goto L97;
        return Boolean.FALSE;
    L97:
        return gb.d(new Float[]{Float.valueOf(Float.intBitsToFloat((int) (r75.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (r75.a & 4294967295L)))});
    L98:
        t44 r76 = (t44) r20;
        long r77 = ((ct4) r21).a;
        if (ct4.a(r77, 8589934592L) == false) goto L102;
        return 0;
    L102:
        if (ct4.a(r77, 4294967296L) == false) goto L105;
        return 1;
    L105:
        return Boolean.FALSE;
    L106:
        gb2 r78 = (gb2) r21;
        String r79 = r78.a;
        os4 r80 = r78.b;
        xc5 r81 = s54.i;
        return gb.d(new Object[]{r79, s54.a(r80, r81, (t44) r20)});
    L108:
        t44 r82 = (t44) r20;
        bt4 r83 = (bt4) r21;
        long r84 = bt4.c;
        if (r83 == null) goto L112;
        r1 = bt4.a(r83.a, r84);
    L112:
        if (r1 == false) goto L115;
        return Boolean.FALSE;
    L115:
        return gb.d(new Object[]{Float.valueOf(bt4.c(r83.a)), s54.a(new ct4(bt4.b(r83.a)), s54.w, r82)});
    L116:
        t44 r85 = (t44) r20;
        return Integer.valueOf(((fb1) r21).a);
    L118:
        t44 r86 = (t44) r20;
        return Integer.valueOf(((eb1) r21).a);
    L120:
        t44 r87 = (t44) r20;
        return Integer.valueOf(((du1) r21).a);
    }
}
