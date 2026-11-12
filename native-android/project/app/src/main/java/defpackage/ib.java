package defpackage;

import android.net.Uri;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ib(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r9v3, types: [wf1] */
    @Override // defpackage.wf1
    public final Object invoke(Object r56, Object r57) {
        int r2 = this.n;
        j15 r8 = j15.a;
        Object r9 = this.p;
        Object r0 = this.o;
        switch(r2) {
            case 0: goto L485;
            case 1: goto L473;
            case 2: goto L445;
            case 3: goto L414;
            case 4: goto L24;
            case 5: goto L15;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        gx3 r1 = (gx3) r0;
        float r3 = ((Float) r56).floatValue();
        ((Float) r57).getClass();
        r1.n += ((q64) ((sm0) r9).b).a(r3 - r1.n);
        return r8;
    L6:
        ((Integer) r57).getClass();
        e35.g((String) r0, (String) r9, (rg1) r56, xl.O(1));
        return r8;
    L8:
        ((Integer) r57).getClass();
        e35.f((Uri) r0, (String) r9, (rg1) r56, xl.O(1));
        return r8;
    L10:
        f63 r4 = (f63) r0;
        c63 r10 = (c63) r9;
        jz r5 = (jz) r56;
        sj1 r6 = (sj1) r57;
        c72 r7 = r4.H;
        if (r7.H() == false) goto L13;
        r4.c0 = r5;
        r4.b0 = r6;
        wb3 r11 = ((ra) h12.L(r7)).getSnapshotObserver();
        r11.a.e(r4, f63.i0, r10);
        r4.f0 = false;
    L14:
        return r8;
    L13:
        r4.f0 = true;
        goto L14
    L15:
        r70 r12 = (r70) r0;
        z82 r13 = (z82) r9;
        rg1 r14 = (rg1) r56;
        int r15 = ((Integer) r57).intValue();
        if ((r15 & 3) == 2) goto L18;
        boolean r16 = true;
    L20:
        if (r14.K(r15 & 1, r16) == false) goto L22;
        r12.a(r13, r14, 0);
    L23:
        return r8;
    L22:
        r14.N();
        goto L23
    L18:
        r16 = false;
        goto L20
    L24:
        pc3 r17 = (pc3) r9;
        ln4 r18 = (ln4) r56;
        f82 r19 = new f82((c82) r0, r18);
        long r20 = ((nc0) r57).a;
        r17.getClass();
        ac3 r21 = r17.b;
        float r22 = r21.b;
        float r23 = r21.a;
        lm0 r110 = r17.a;
        r110.B.getValue();
        if (nc0.h(r20) != Integer.MAX_VALUE) goto L28;
        fz1.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
    L28:
        r62 r111 = r18.getLayoutDirection();
        r62 r112 = r62.n;
        if (r111 != r112) goto L33;
        if (r111 != r112) goto L32;
    L31:
        float r113 = r23;
    L35:
        int r114 = r18.V(r113);
        r62 r115 = r18.getLayoutDirection();
        if (r115 != r112) goto L40;
        if (r115 == r112) goto L42;
    L39:
        r22 = r23;
    L42:
        int r24 = r18.V(r22);
        int r116 = r18.V(0.0f);
        int r117 = r18.V(0.0f) + r116;
        int r25 = r24 + r114;
        int r118 = r25 - r114;
        int r26 = -r25;
        int r27 = -r117;
        int r119 = nc0.j(r20) + r26;
        if (r119 >= 0) goto L46;
        int r28 = 0;
    L47:
        int r29 = nc0.h(r20);
        if (r29 == Integer.MAX_VALUE) goto L53;
        r29 = r29 + r26;
        if (r29 >= 0) goto L53;
        r29 = 0;
    L53:
        int r30 = nc0.i(r20) + r27;
        if (r30 >= 0) goto L56;
        r30 = 0;
    L56:
        int r31 = nc0.g(r20);
        if (r31 != Integer.MAX_VALUE) goto L59;
        int r32 = r31;
    L62:
        long r33 = qc0.a(r28, r29, r30, r32);
        r110.n = r19;
        int r34 = r18.V(r17.c);
        int r35 = nc0.h(r20) - r25;
        long r36 = (((long) r116) & 4294967295L) | (((long) r114) << 32);
        r17.d.getClass();
        if (r35 >= 0) goto L65;
        int r37 = 0;
    L66:
        qc0.b(r37, nc0.g(r33), 5);
        nc3 r120 = (nc3) r17.e.invoke();
        rv2 r121 = r17.h;
        long r210 = r36;
        ch4 r38 = ya4.t();
        if (r38 == null) goto L70;
        if1 r39 = r38.e();
    L71:
        ch4 r122 = ya4.z(r38);
        int r123 = r110.k();     // Catch: Throwable -> L411
        nq r124 = r110.d;     // Catch: Throwable -> L411
        int r40 = ud3.i(r123, r120, r124.r);     // Catch: Throwable -> L411
        if (r123 == r40) goto L78;
        ((wd3) r124.p).h(r40);     // Catch: Throwable -> L411
        g82 r41 = (g82) r124.s;     // Catch: Throwable -> L411
        if (r123 == r41.o) goto L78;
        r41.o = r123;     // Catch: Throwable -> L411
        int r125 = (r123 / 30) * 30;     // Catch: Throwable -> L411
        r41.n.setValue(gb.g0(Math.max(r125 - 100, 0), r125 + 130));     // Catch: Throwable -> L411
    L78:
        r110.k();     // Catch: Throwable -> L411
        float r42 = r110.l();     // Catch: Throwable -> L411
        r110.n();     // Catch: Throwable -> L411
        r121.getClass();     // Catch: Throwable -> L411
        int r43 = r37 + r34;     // Catch: Throwable -> L411
        int r44 = ji2.L(0.0f - (r42 * r43));     // Catch: Throwable -> L411
        ya4.H(r38, r122, r39);
        n82 r45 = r110.z;
        hg3 r46 = r110.v;
        rh4 r47 = r45.n;
        r47.getClass();
        y1 r48 = rr2.F(r47).c;
        f13 r126 = (f13) r46.o;
        if (r126.p == 0) goto L82;
        boolean r127 = true;
    L83:
        if (r127 == false) goto L85;
    L88:
        h03 r128 = new h03();
        if (((f13) r46.o).p == 0) goto L113;
        int r49 = r126.p;
        if (r49 == 0) goto L112;
        Object[] r50 = r126.n;
        int r51 = ((v72) r50[0]).a;
        int r52 = 0;
    L93:
        if (r52 >= r49) goto L98;
        int r310 = r52;
        int r53 = ((v72) r50[r52]).a;
        if (r53 >= r51) goto L97;
        r51 = r53;
    L97:
        r52 = r310 + 1;
        goto L93
    L98:
        if (r51 >= 0) goto L101;
        fz1.a("negative minIndex");
    L101:
        int r54 = r126.p;
        if (r54 == 0) goto L110;
        Object[] r55 = r126.n;
        int r129 = ((v72) r55[0]).b;
        int r130 = 0;
    L104:
        if (r130 >= r54) goto L109;
        int r311 = r51;
        int r58 = ((v72) r55[r130]).b;
        if (r58 <= r129) goto L108;
        r129 = r58;
    L108:
        r130 = r130 + 1;
        r51 = r311;
        goto L104
    L109:
        int r59 = Math.min(r129, r120.b() - 1);
        int r60 = r51;
    L114:
        int r61 = r48.a();
        int r131 = 0;
    L115:
        if (r131 >= r61) goto L125;
        l82 r132 = (l82) r48.get(r131);
        y1 r312 = r48;
        int r62 = ud3.i(r132.c, r120, r132.a);
        if (r60 > r62) goto L120;
        if (r62 > r59) goto L120;
    L124:
        r131 = r131 + 1;
        r48 = r312;
    L120:
        if (r62 < 0) goto L124;
        if (r62 >= r120.b()) goto L124;
        r128.a(r62);
        goto L124
    L125:
        if (r60 > r59) goto L129;
    L126:
        r128.a(r60);
        if (r60 == r59) goto L129;
        r60 = r60 + 1;
    L129:
        int r63 = r128.b;
        if (r63 != 0) goto L132;
    L131:
        h03 r64 = r128;
    L87:
        int r133 = r117;
        i03 r211 = new i03();
        int r65 = ((Number) r17.f.invoke()).intValue();
        b13 r66 = r110.A;
        gs r67 = r17.g;
        fs r134 = fz0.z;
        rv2 r135 = r17.h;
        we0 r68 = r17.i;
        if (r114 >= 0) goto L137;
        fz1.a("negative beforeContentPadding");
    L137:
        if (r118 >= 0) goto L140;
        fz1.a("negative afterContentPadding");
    L140:
        gs r313 = r67;
        if (r43 >= 0) goto L143;
        int r69 = 0;
    L145:
        if (r65 >= 0) goto L148;
        int r136 = r65;
    L149:
        long r70 = qc0.b(r37, nc0.g(r33), 5);
        int r137 = r37;
        v01 r71 = v01.n;
        if (r65 > 0) goto L153;
        int r72 = nc0.j(r33);
        int r73 = nc0.i(r33);
        qc3 r74 = new qc3(r137, r34, r118, -r114, r35 + r118, r136, r135, r18.v(qc0.f(r72 + r25, r20), qc0.e(r73 + r133, r20), r71, new or1(24)), r68, r19, r70);
        ln4 r75 = r18;
        lm0 r314 = r110;
        f82 r138 = r19;
    L152:
        qc3 r76 = r74;
        lm0 r77 = r314;
        r77.h(r76, r75.K(), false);
        fc3 r78 = r77.u;
        List r79 = r76.a;
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
    L405:
        th = move-exception;
        Trace.endSection();
        throw th;
    L392:
        if (r78.h != Integer.MAX_VALUE) goto L394;
    L407:
        Trace.endSection();
        return r76;
    L394:
        if (r78.i == Integer.MIN_VALUE) goto L407;
        if (r79.isEmpty() == true) goto L407;
        int r80 = ((xi2) q40.w0(r79)).a;     // Catch: Throwable -> L405
        int r81 = ((xi2) q40.C0(r79)).a;     // Catch: Throwable -> L405
        int r82 = r78.h;     // Catch: Throwable -> L405
    L398:
        if (r82 >= r80) goto L400;
        r138.a(r82);     // Catch: Throwable -> L405
        r82 = r82 + 1;     // Catch: Throwable -> L405
        goto L398
    L400:
        int r83 = r81 + 1;     // Catch: Throwable -> L405
        int r84 = r78.i;     // Catch: Throwable -> L405
        if (r83 > r84) goto L407;
    L402:
        r138.a(r83);     // Catch: Throwable -> L405
        if (r83 == r84) goto L407;
        r83 = r83 + 1;
        goto L402
    L153:
        int r139 = r34;
        long r315 = r70;
        f82 r140 = r19;
        int r316 = 21;
        int r141 = r40;
    L154:
        if (r141 <= 0) goto L157;
        if (r44 <= 0) goto L157;
        r141 = r141 - 1;
        r44 = r44 - r69;
    L157:
        int r142 = r44 * (-1);
        if (r141 < r65) goto L160;
        r141 = r65 - 1;
        r142 = 0;
    L160:
        r314 = r110;
        ii r85 = new ii();
        int r86 = -r114;
        if (r139 >= 0) goto L164;
        int r212 = r139;
    L165:
        int r87 = r86 + r212;
        int r88 = r142 + r87;
        int r89 = 0;
    L166:
        hb3 r143 = hb3.o;
        int r213 = r136;
        long r510 = r210;
        int r214 = r133;
        if (r88 >= 0) goto L170;
        if (r141 <= 0) goto L170;
        r141 = r141 - 1;
        int r215 = r137;
        gs r144 = r313;
        ln4 r511 = r18;
        long r512 = r315;
        xi2 r90 = gb.z(r140, r141, r512, r120, r510, r143, r134, r144, r18.getLayoutDirection(), false, r215, r211);
        r85.add(0, r90);
        r89 = Math.max(r89, r90.j);
        r88 = r88 + r69;
        r139 = r139;
        r315 = r512;
        r18 = r511;
        r114 = r114;
        r140 = r140;
        r66 = r66;
        r210 = r510;
        r136 = r213;
        r133 = r214;
        r313 = r144;
        r137 = r215;
    L170:
        int r216 = r137;
        gs r145 = r313;
        ln4 r513 = r18;
        b13 r410 = r66;
        int r91 = r114;
        f82 r217 = r140;
        long r514 = r315;
        int r317 = r139;
        if (r88 >= r87) goto L173;
        r88 = r87;
    L173:
        int r92 = r88 - r87;
        int r93 = r35 + r118;
        if (r93 >= 0) goto L177;
        int r146 = 0;
    L176:
        int r318 = r89;
        int r94 = -r92;
        int r411 = r92;
        int r412 = r141;
        int r95 = 0;
        boolean r413 = false;
    L180:
        if (r95 >= r85.p) goto L184;
        if (r94 >= r146) goto L182;
        r412 = r412 + 1;
        r94 = r94 + r69;
        r95 = r95 + 1;
        goto L180
    L182:
        r85.b(r95);
        r413 = true;
        goto L180
    L184:
        int r96 = r141;
        int r97 = r318;
        int r147 = r412;
    L185:
        if (r147 >= r65) goto L191;
        if (r94 < r146) goto L190;
        if (r94 <= 0) goto L190;
        if (r85.isEmpty() == false) goto L191;
    L190:
        int r319 = r146;
        f82 r148 = r217;
        int r414 = r96;
        xi2 r98 = gb.z(r148, r147, r514, r120, r510, r143, r134, r145, r513.getLayoutDirection(), false, r216, r211);
        r217 = r148;
        int r149 = r65 - 1;
        if (r147 != r149) goto L195;
        int r415 = r216;
    L196:
        r94 = r94 + r415;
        if (r94 > r87) goto L200;
        if (r147 == r149) goto L200;
        r96 = r147 + 1;
        r411 = r411 - r69;
        r413 = true;
    L201:
        r147 = r147 + 1;
        r146 = r319;
    L200:
        r97 = Math.max(r97, r98.j);
        r85.addLast(r98);
        r96 = r414;
        goto L201
    L195:
        r415 = r69;
    L191:
        int r416 = r96;
        if (r94 >= r35) goto L211;
        int r99 = r35 - r94;
        int r100 = r94 + r99;
        int r101 = r411 - r99;
        int r102 = r416;
    L204:
        if (r101 >= r91) goto L207;
        if (r102 <= 0) goto L207;
        int r103 = r102 - 1;
        f82 r150 = r217;
        xi2 r104 = gb.z(r150, r103, r514, r120, r510, r143, r134, r145, r513.getLayoutDirection(), false, r216, r211);
        hb3 r218 = r143;
        r85.add(0, r104);
        r97 = Math.max(r97, r104.j);
        r101 = r101 + r69;
        r102 = r103;
        r100 = r100;
        r143 = r218;
        r147 = r147;
        r217 = r150;
    L207:
        f82 r151 = r217;
        hb3 r219 = r143;
        int r152 = r100;
        if (r101 >= 0) goto L210;
        r94 = r152 + r101;
        r101 = 0;
    L212:
        if (r101 < 0) goto L214;
    L213:
        int r320 = r97;
        int r105 = -r101;
        xi2 r153 = (xi2) r85.first();
        if (r91 > 0) goto L221;
        if (r317 < 0) goto L221;
        int r417 = r102;
    L220:
        xi2 r106 = r153;
        int r418 = r101;
        int r107 = Math.max(0, r417 - r213);
        int r108 = r417 - 1;
        if (r107 > r108) goto L236;
        List r154 = null;
    L231:
        if (r154 != null) goto L233;
        r154 = new ArrayList();
    L233:
        int r419 = r108;
        List r109 = r154;
        hb3 r155 = r219;
        int r420 = r147;
        int r421 = r69;
        r109.add(gb.z(r151, r419, r514, r120, r510, r155, r134, r145, r513.getLayoutDirection(), false, r216, r211));
        if (r419 == r107) goto L237;
        r219 = r155;
        r147 = r420;
        r154 = r109;
        r108 = r419 - 1;
        r69 = r421;
    L237:
        int[] r156 = r64.a;
        int r157 = r64.b;
        int r158 = 0;
    L238:
        if (r158 >= r157) goto L246;
        int r220 = r157;
        int r159 = r156[r158];
        if (r159 >= r107) goto L245;
        if (r109 != null) goto L243;
        r109 = new ArrayList();
    L243:
        r109.add(gb.z(r151, r159, r514, r120, r510, r155, r134, r145, r513.getLayoutDirection(), false, r216, r211));
    L245:
        r158 = r158 + 1;
        r157 = r220;
        goto L238
    L246:
        u01 r160 = u01.n;
        if (r109 != null) goto L249;
        r109 = r160;
    L249:
        int r161 = r109.size();
        int r162 = r320;
        int r163 = 0;
    L250:
        if (r163 >= r161) goto L252;
        r162 = Math.max(r162, ((xi2) r109.get(r163)).j);
        r163 = r163 + 1;
        goto L250
    L252:
        int r164 = ((xi2) r85.last()).a;
        int r165 = Math.min(r213, (r65 - r164) - 1) + r164;
        int r166 = r164 + 1;
        if (r166 > r165) goto L260;
        ArrayList r221 = null;
    L255:
        if (r221 != null) goto L257;
        r221 = new ArrayList();
    L257:
        int r422 = r166;
        ArrayList r167 = r221;
        int r423 = r162;
        List r515 = r109;
        r167.add(gb.z(r151, r422, r514, r120, r510, r155, r134, r145, r513.getLayoutDirection(), false, r216, r211));
        if (r422 == r165) goto L261;
        r221 = r167;
        r166 = r422 + 1;
        r162 = r423;
        r109 = r515;
    L261:
        int[] r168 = r64.a;
        int r169 = r64.b;
        int r170 = 0;
    L262:
        if (r170 >= r169) goto L273;
        int r222 = r170;
        int r171 = r168[r222];
        ArrayList r516 = r167;
        if ((r165 + 1) > r171) goto L271;
        if (r171 >= r65) goto L271;
        if (r516 != null) goto L269;
        r167 = new ArrayList();
    L270:
        int r517 = r222;
        r167.add(gb.z(r151, r171, r514, r120, r510, r155, r134, r145, r513.getLayoutDirection(), false, r216, r211));
    L272:
        r170 = r517 + 1;
        goto L262
    L269:
        r167 = r516;
    L271:
        r517 = r222;
        r167 = r516;
        goto L272
    L273:
        ArrayList r518 = r167;
        if (r518 != null) goto L276;
        List r172 = r160;
    L277:
        int r173 = r172.size();
        int r174 = r423;
        int r175 = 0;
    L278:
        if (r175 >= r173) goto L281;
        r174 = Math.max(r174, ((xi2) r172.get(r175)).j);
        r175 = r175 + 1;
        goto L278
    L281:
        if (h12.c(r106, r85.first()) == true) goto L283;
    L288:
        boolean r176 = false;
    L289:
        int r177 = qc0.f(r94, r33);
        int r178 = qc0.e(r174, r33);
        if (r94 >= Math.min(r177, r35)) goto L292;
        boolean r179 = true;
    L293:
        if (r179 == false) goto L297;
        if (r105 == 0) goto L297;
        fz1.c("non-zero pagesScrollOffset=" + r105);
    L297:
        ArrayList r180 = new ArrayList(r172.size() + (r515.size() + r85.a()));
        if (r179 == true) goto L300;
        r151 = r151;
        int r181 = r105;
        r75 = r513;
        long r321 = r514;
        int r182 = r317;
        int r183 = r515.size();
        int r184 = r181;
        int r185 = 0;
    L325:
        if (r185 >= r183) goto L327;
        int r223 = r181;
        xi2 r186 = (xi2) r515.get(r185);
        r184 = r184 - r43;
        r186.b(r184, r177, r178);
        r180.add(r186);
        r185 = r185 + 1;
        r181 = r223;
        goto L325
    L327:
        int r224 = r181;
        int r187 = r85.a();
        int r188 = r224;
        int r189 = 0;
    L328:
        if (r189 >= r187) goto L330;
        xi2 r190 = (xi2) r85.get(r189);
        r190.b(r188, r177, r178);
        r180.add(r190);
        r188 = r188 + r43;
        r189 = r189 + 1;
        goto L328
    L330:
        int r191 = r172.size();
        int r192 = 0;
    L331:
        if (r192 >= r191) goto L333;
        xi2 r193 = (xi2) r172.get(r192);
        r193.b(r188, r177, r178);
        r180.add(r193);
        r188 = r188 + r43;
        r192 = r192 + 1;
    L333:
        if (r176 == false) goto L336;
        ArrayList r194 = r180;
    L335:
        List r519 = r172;
        int r225 = r177;
        if (r515.isEmpty() == false) goto L348;
        List r226 = r160;
    L356:
        if (r519.isEmpty() == false) goto L358;
        ?? r195 = r160;
    L365:
        if (r194.isEmpty() == false) goto L367;
        Object r196 = null;
    L376:
        xi2 r197 = (xi2) r196;
        r135.getClass();
        if (r197 == null) goto L379;
        int r198 = r197.l;
    L380:
        if (r421 != 0) goto L382;
        float r227 = 0.0f;
    L383:
        vi2 r228 = r75.v(qc0.f(r225 + r25, r20), qc0.e(r178 + r214, r20), r71, new o(r316, r410, r180));
        if (r420 < r65) goto L388;
        if (r94 > r35) goto L388;
        boolean r229 = false;
    L389:
        f82 r322 = r151;
        r74 = new qc3(r194, r216, r182, r118, r155, r86, r93, r213, r106, r197, r227, r418, r229, r135, r228, r413, r226, r195, r68, r322, r321);
        r138 = r322;
    L388:
        r229 = true;
        goto L389
    L382:
        r227 = gb.l((0 - r198) / r421, -0.5f, 0.5f);
        goto L383
    L379:
        r198 = 0;
        goto L380
    L367:
        Object r199 = r194.get(0);
        int r200 = ((xi2) r199).l;
        r135.getClass();
        float r201 = -Math.abs(r200 - 0.0f);
        int r202 = r194.size() - 1;
        if (1 > r202) goto L375;
        int r203 = 1;
    L370:
        Object r1100 = r194.get(r203);
        float r1101 = -Math.abs(((xi2) r1100).l - 0.0f);
        if (Float.compare(r201, r1101) >= 0) goto L373;
        r199 = r1100;
        r201 = r1101;
    L373:
        if (r203 == r202) goto L375;
        r203 = r203 + 1;
    L375:
        r196 = r199;
        goto L376
    L358:
        r195 = new ArrayList(r180.size());
        int r204 = r180.size();
        int r205 = 0;
    L359:
        if (r205 >= r204) goto L365;
        Object r206 = r180.get(r205);
        if (((xi2) r206).a <= ((xi2) r85.last()).a) goto L363;
        r195.add(r206);
    L363:
        r205 = r205 + 1;
        goto L359
    L348:
        ArrayList r207 = new ArrayList(r180.size());
        int r208 = r180.size();
        int r209 = 0;
    L349:
        if (r209 >= r208) goto L354;
        Object r230 = r180.get(r209);
        if (((xi2) r230).a >= ((xi2) r85.first()).a) goto L353;
        r207.add(r230);
    L353:
        r209 = r209 + 1;
        goto L349
    L354:
        r226 = r207;
        goto L356
    L336:
        ArrayList r231 = new ArrayList(r180.size());
        int r232 = r180.size();
        int r1102 = 0;
    L337:
        if (r1102 >= r232) goto L344;
        Object r1103 = r180.get(r1102);
        List r520 = r172;
        xi2 r233 = (xi2) r1103;
        int r1104 = r232;
        int r234 = r177;
        if (r233.a < ((xi2) r85.first()).a) goto L343;
        if (r233.a > ((xi2) r85.last()).a) goto L343;
        r231.add(r1103);
    L343:
        r1102 = r1102 + 1;
        r172 = r520;
        r232 = r1104;
        r177 = r234;
        goto L337
    L344:
        r194 = r231;
        goto L335
    L300:
        if (r515.isEmpty() == true) goto L302;
    L304:
        fz1.a("No extra pages");
    L305:
        int r235 = r85.a();
        int[] r1105 = new int[r235];
        int r1106 = 0;
    L306:
        if (r1106 >= r235) goto L308;
        r1105[r1106] = r216;
        r1106 = r1106 + 1;
        goto L306
    L308:
        int[] r1107 = new int[r235];
        r75 = r513;
        r321 = r514;
        r182 = r317;
        float r236 = r75.B(r182);
        if (r1105.length == 0) goto L314;
        int r237 = r151.V(r236);
        int r238 = r1105.length;
        int r1108 = 0;
        int r1109 = 0;
        int r239 = 0;
    L312:
        if (r1108 >= r238) goto L314;
        int r240 = r1105[r1108];
        int r241 = r238;
        int r242 = Math.min(r1109, r177 - r240);
        r1107[r239] = r242;
        r1109 = (r1107[r239] + r240) + Math.min(r237, (r177 - r242) - r240);
        r1108 = r1108 + 1;
        r239 = r239 + 1;
        r238 = r241;
    L314:
        j02 r243 = new j02(0, r235 - 1, 1);
        int r244 = r243.o;
        int r245 = r243.p;
        if (r245 <= 0) goto L317;
        if (r244 < 0) goto L317;
    L319:
        int r1110 = 0;
    L320:
        int r1111 = r1107[r1110];
        int r246 = r245;
        xi2 r247 = (xi2) r85.get(r1110);
        r247.b(r1111, r177, r178);
        r180.add(r247);
        if (r1110 == r244) goto L333;
        r1110 = r1110 + r246;
        r245 = r246;
    L317:
        if (r245 >= 0) goto L333;
        if (r244 > 0) goto L333;
    L302:
        if (r172.isEmpty() == false) goto L304;
    L292:
        r179 = false;
        goto L293
    L283:
        if (r515.isEmpty() == false) goto L288;
        if (r172.isEmpty() == false) goto L288;
        r176 = true;
        goto L289
    L276:
        r172 = r518;
        goto L277
    L260:
        r515 = r109;
        r423 = r162;
        r167 = null;
        goto L261
    L236:
        r421 = r69;
        r420 = r147;
        r155 = r219;
        r109 = null;
    L221:
        int r248 = r85.a();
        r417 = r102;
        int r249 = 0;
    L222:
        if (r249 >= r248) goto L220;
        if (r101 == 0) goto L220;
        if (r69 > r101) goto L220;
        int r424 = r248;
        if (r249 == (r85.a() - 1)) goto L220;
        r101 = r101 - r69;
        r249 = r249 + 1;
        r153 = (xi2) r85.get(r249);
        r248 = r424;
        goto L222
    L214:
        fz1.a("invalid currentFirstPageScrollOffset");
        goto L213
    L210:
        r94 = r152;
        goto L212
    L211:
        r151 = r217;
        r219 = r143;
        r101 = r411;
        r102 = r416;
        goto L212
    L177:
        r146 = r93;
        goto L176
    L164:
        r212 = 0;
        goto L165
    L148:
        r136 = 0;
        goto L149
    L143:
        r69 = r43;
        goto L145
    L132:
        int[] r250 = r128.a;
        r250.getClass();
        Arrays.sort(r250, 0, r63);
        goto L131
    L110:
        kf2.m("MutableVector is empty.");
    L111:
        return null;
    L112:
        kf2.m("MutableVector is empty.");
        goto L111
    L113:
        r60 = 1;
        r59 = 0;
        goto L114
    L85:
        if (r48.isEmpty() == false) goto L88;
        r64 = c02.a;
        r44 = r44;
        r43 = r43;
        goto L87
    L82:
        r127 = false;
    L411:
        th = move-exception;
        ya4.H(r38, r122, r39);
        throw th;
    L70:
        r39 = null;
        goto L71
    L65:
        r37 = r35;
        goto L66
    L59:
        r32 = r27 + r31;
        if (r32 >= 0) goto L62;
        r32 = 0;
        goto L62
    L46:
        r28 = r119;
        goto L47
    L40:
        if (r115 != r112) goto L42;
    L32:
        r113 = r22;
        goto L35
    L33:
        if (r111 != r112) goto L31;
    L414:
        c82 r251 = (c82) r0;
        b82 r252 = (b82) r9;
        Object r1112 = r252.a;
        rg1 r1113 = (rg1) r56;
        int r253 = ((Integer) r57).intValue();
        if ((r253 & 3) == 2) goto L418;
        boolean r254 = true;
    L420:
        if (r1113.K(r253 & 1, r254) == false) goto L443;
        nc3 r1114 = (nc3) r251.b.invoke();
        int r255 = r252.b;
        if (r255 < r1114.b()) goto L424;
    L428:
        p03 r256 = (p03) r1114.c.p;
        int r257 = r256.d(r1112);
        if (r257 < 0) goto L431;
        r255 = r256.c[r257];
        int r258 = -1;
    L432:
        if (r255 != r258) goto L433;
    L427:
        int r1115 = r255;
        if (r1115 == r258) goto L436;
        r1113.R(-1664741271);
        l93.b(r1114, r251.a, r1115, r1112, r1113, 0);
        r1113.o(false);
    L437:
        boolean r259 = r1113.g(r252);
        Object r260 = r1113.H();
        if (r259 == false) goto L440;
    L441:
        r260 = new x(21, r252);
        r1113.b0(r260);
    L442:
        bu.b(r1112, (if1) r260, r1113);
    L444:
        return r8;
    L440:
        if (r260 != j80.a) goto L442;
    L436:
        r1113.R(-1664505826);
        r1113.o(false);
        goto L437
    L433:
        r252.b = r255;
        goto L427
    L431:
        r255 = -1;
        r258 = -1;
        goto L432
    L424:
        if (r1114.c(r255).equals(r1112) == false) goto L428;
        r258 = -1;
        goto L427
    L443:
        r1113.N();
        goto L444
    L418:
        r254 = false;
        goto L420
    L445:
        h72 r261 = (h72) r0;
        ?? r262 = (wf1) r9;
        rg1 r263 = (rg1) r56;
        int r264 = ((Integer) r57).intValue();
        if ((r264 & 3) == 2) goto L449;
        boolean r265 = true;
    L451:
        if (r263.K(r264 & 1, r265) == false) goto L471;
        Boolean r266 = (Boolean) r261.g.getValue();
        boolean r267 = r266.booleanValue();
        r263.T(r266);
        boolean r268 = r263.f(r267);
        if (r267 == false) goto L456;
        r262.invoke(r263, 0);
    L465:
        if (r263.y == true) goto L467;
    L469:
        boolean r1116 = false;
    L470:
        r263.o(r1116);
    L472:
        return r8;
    L467:
        if (r263.G.i != r263.z) goto L469;
        r263.z = -1;
        r1116 = false;
        r263.y = false;
        goto L470
    L456:
        if (r263.l == 0) goto L460;
        l80.a("No nodes can be emitted before calling deactivateToEndGroup");
    L460:
        if (r263.S == true) goto L465;
        if (r268 == true) goto L463;
        r263.M();
        goto L465
    L463:
        hg4 r269 = r263.G;
        int r270 = r269.g;
        int r271 = r269.h;
        k80 r272 = r263.M;
        r272.getClass();
        r272.d(false);
        r272.b.n.x0(t93.f);
        si0.i(r270, r271, r263.s);
        r263.G.t();
        goto L465
    L471:
        r263.N();
        goto L472
    L449:
        r265 = false;
        goto L451
    L473:
        uy3 r273 = (uy3) r0;
        lg4 r274 = (lg4) r9;
        int r275 = ((Integer) r56).intValue();
        if ((r57 instanceof u70) == false) goto L477;
        r273.f.b((u70) r57);
    L484:
        return r8;
    L477:
        if ((r57 instanceof a24) == true) goto L484;
        if ((r57 instanceof wg1) == false) goto L482;
        si0.O(r274, r275, r57);
        r273.e((wg1) r57);
        goto L484
    L482:
        if ((r57 instanceof lv3) == false) goto L484;
        si0.O(r274, r275, r57);
        ((lv3) r57).c();
        goto L484
    L485:
        lb r276 = (lb) r9;
        int r277 = ((Integer) r56).intValue();
        i94 r278 = (i94) r57;
        if (((j94) r0).b.c(r278.f) == true) goto L488;
        r276.i(r277, r278);
        r276.u.d(r8);
    L488:
        return r8;
    }

    public /* synthetic */ ib(Comparable r1, String r2, int r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
    }
}
