package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.eddyizm.tempus.model.Server;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o54 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ o54(m24 r1) {
        this.n = 12;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r33) {
        int r0 = this.n;
        j15 r8 = j15.a;
        boolean r9 = true;
        switch(r0) {
            case 0: goto L260;
            case 1: goto L255;
            case 2: goto L249;
            case 3: goto L205;
            case 4: goto L137;
            case 5: goto L126;
            case 6: goto L124;
            case 7: goto L122;
            case 8: goto L111;
            case 9: goto L109;
            case 10: goto L108;
            case 11: goto L105;
            case 12: goto L103;
            case 13: goto L98;
            case 14: goto L54;
            case 15: goto L52;
            case 16: goto L46;
            case 17: goto L44;
            case 18: goto L42;
            case 19: goto L40;
            case 20: goto L38;
            case 21: goto L32;
            case 22: goto L30;
            case 23: goto L16;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L4;
        };
    L4:
        mu0 r1 = (mu0) r33;
        return new ae(Float.intBitsToFloat((int) (r1.a >> 32)), Float.intBitsToFloat((int) (r1.a & 4294967295L)));
    L16:
        gn2 r2 = (gn2) r33;
        r2.getClass();
        Bundle r3 = r2.d.I;
        if (r3 == null) goto L19;
        String r4 = r3.getString("type");
    L21:
        if (h12.c(r4, "music") == true) goto L268;
        bn2 r5 = r2.b;
        if (r5 == null) goto L28;
        Uri r6 = r5.a;
        if (r6 == null) goto L28;
        return r6.toString();
    L28:
        return null;
    L268:
        return e03.j(0, r2.a).toString();
    L19:
        r4 = null;
        goto L21
    L30:
        kd3 r7 = (kd3) r33;
        r7.getClass();
        String r10 = (String) r7.n;
        String r11 = (String) r7.o;
        List r12 = f25.c;
        return b11.q(b11.u("<", r10, ">", ud3.h(r11), "</"), r10, ">");
    L32:
        z34 r13 = (z34) r33;
        r13.getClass();
        fb4 r14 = new fb4();
    L34:
        if (r13.O() == false) goto L37;
        r14.add(Integer.valueOf((int) r13.getLong(0)));
        goto L34
    L37:
        return kb4.l(r14);
    L38:
        z34 r15 = (z34) r33;
        r15.getClass();
        return Boolean.valueOf(r15.O());
    L40:
        jw1 r16 = (jw1) r33;
        return r8;
    L42:
        List r17 = (List) r33;
        return r8;
    L44:
        ((Float) r33).getClass();
        return r8;
    L46:
        Resources r18 = (Resources) r33;
        r18.getClass();
        if ((r18.getConfiguration().uiMode & 48) == 32) goto L51;
        r9 = false;
    L51:
        return Boolean.valueOf(r9);
    L52:
        gh4 r19 = (gh4) r33;
        o54 r20 = jh4.a;
        return r8;
    L54:
        z34 r21 = ((x34) r33).U("SELECT * FROM server");
        int r22 = rr2.E(r21, "id");     // Catch: Throwable -> L92
        int r23 = rr2.E(r21, "server_name");     // Catch: Throwable -> L92
        int r24 = rr2.E(r21, "username");     // Catch: Throwable -> L92
        int r25 = rr2.E(r21, "password");     // Catch: Throwable -> L92
        int r26 = rr2.E(r21, "address");     // Catch: Throwable -> L92
        int r27 = rr2.E(r21, "local_address");     // Catch: Throwable -> L92
        int r28 = rr2.E(r21, "timestamp");     // Catch: Throwable -> L92
        int r29 = rr2.E(r21, "low_security");     // Catch: Throwable -> L92
        int r110 = rr2.E(r21, "client_cert");     // Catch: Throwable -> L92
        ArrayList r111 = new ArrayList();     // Catch: Throwable -> L92
    L56:
        if (r21.O() == false) goto L94;
        if (r21.isNull(r22) == false) goto L61;
        String r112 = null;
    L63:
        if (r21.isNull(r23) == false) goto L65;
        String r113 = null;
    L67:
        if (r21.isNull(r24) == false) goto L69;
        String r114 = null;
    L71:
        if (r21.isNull(r25) == false) goto L73;
        String r115 = null;
    L75:
        if (r21.isNull(r26) == false) goto L77;
        String r210 = null;
    L79:
        if (r21.isNull(r27) == false) goto L81;
        String r211 = null;
    L82:
        long r212 = r21.getLong(r28);     // Catch: Throwable -> L92
        if (((int) r21.getLong(r29)) == 0) goto L85;
        boolean r213 = true;
    L87:
        if (r21.isNull(r110) == false) goto L89;
        String r214 = null;
    L90:
        r111.add(new Server(r112, r113, r114, r115, r210, r211, r212, r213, r214));     // Catch: Throwable -> L92
        goto L56
    L89:
        r214 = r21.D(r110);     // Catch: Throwable -> L92
        goto L90
    L85:
        r213 = false;
        goto L87
    L81:
        r211 = r21.D(r27);     // Catch: Throwable -> L92
        goto L82
    L77:
        r210 = r21.D(r26);     // Catch: Throwable -> L92
        goto L79
    L73:
        r115 = r21.D(r25);     // Catch: Throwable -> L92
        goto L75
    L69:
        r114 = r21.D(r24);     // Catch: Throwable -> L92
        goto L71
    L65:
        r113 = r21.D(r23);     // Catch: Throwable -> L92
        goto L67
    L61:
        r112 = r21.D(r22);     // Catch: Throwable -> L92
        goto L63
    L94:
        r21.close();
        return r111;
    L92:
        th = move-exception;
        r21.close();
        throw th;
    L98:
        if (r33 == null) goto L102;
        r9 = false;
    L102:
        return Boolean.valueOf(r9);
    L103:
        o94.a((q94) r33);
        return r8;
    L105:
        k02 r30 = ((j64) r33).c;
        return Integer.valueOf(r30.d - r30.b);
    L109:
        r33.getClass();
        return new ps4(((Integer) r33).intValue());
    L111:
        r33.getClass();
        List r31 = (List) r33;
        Object r32 = r31.get(0);
        boolean r34 = h12.c(r32, Boolean.FALSE);
        xc5 r35 = t54.e;
        if (r34 == false) goto L114;
    L113:
        ps4 r36 = null;
    L116:
        r36.getClass();
        int r37 = r36.a;
        Object r38 = r31.get(1);
        if (r38 == null) goto L119;
        Boolean r116 = (Boolean) r38;
    L120:
        r116.getClass();
        return new qs4(r37, r116.booleanValue());
    L119:
        r116 = null;
        goto L120
    L114:
        if (r32 == null) goto L113;
        r36 = (ps4) ((if1) r35.p).invoke(r32);
        goto L116
    L122:
        r33.getClass();
        return new ma2(((Integer) r33).intValue());
    L124:
        r33.getClass();
        return new h01(((Integer) r33).intValue());
    L126:
        r33.getClass();
        List r39 = (List) r33;
        Object r40 = r39.get(0);
        if (r40 == null) goto L129;
        Boolean r41 = (Boolean) r40;
    L130:
        r41.getClass();
        boolean r42 = r41.booleanValue();
        Object r43 = r39.get(1);
        boolean r44 = h12.c(r43, Boolean.FALSE);
        xc5 r45 = t54.b;
        if (r44 == false) goto L133;
    L132:
        h01 r117 = null;
    L135:
        r117.getClass();
        return new zg3(r117.a, r42);
    L133:
        if (r43 == null) goto L132;
        r117 = (h01) ((if1) r45.p).invoke(r43);
        goto L135
    L129:
        r41 = null;
        goto L130
    L137:
        r33.getClass();
        List r46 = (List) r33;
        Object r47 = r46.get(0);
        int r48 = x40.h;
        Boolean r49 = Boolean.FALSE;
        h12.c(r47, r49);
        if (r47 != null) goto L140;
        x40 r50 = null;
    L144:
        r50.getClass();
        long r118 = r50.a;
        Object r51 = r46.get(1);
        ct4[] r52 = bt4.b;
        if1 r53 = s54.v.o;
        h12.c(r51, r49);
        if (r51 == null) goto L147;
        bt4 r54 = (bt4) r53.invoke(r51);
    L148:
        r54.getClass();
        long r119 = r54.a;
        Object r55 = r46.get(2);
        gb1 r56 = gb1.o;
        xc5 r57 = s54.m;
        if (h12.c(r55, r49) == false) goto L151;
    L150:
        gb1 r120 = null;
    L153:
        Object r58 = r46.get(3);
        xc5 r59 = s54.t;
        if (h12.c(r58, r49) == false) goto L156;
    L155:
        eb1 r121 = null;
    L158:
        Object r60 = r46.get(4);
        xc5 r61 = s54.u;
        if (h12.c(r60, r49) == false) goto L161;
    L160:
        fb1 r122 = null;
    L163:
        Object r62 = r46.get(6);
        if (r62 == null) goto L166;
        String r215 = (String) r62;
    L167:
        Object r63 = r46.get(7);
        h12.c(r63, r49);
        if (r63 == null) goto L170;
        bt4 r64 = (bt4) r53.invoke(r63);
    L171:
        r64.getClass();
        long r65 = r64.a;
        Object r66 = r46.get(8);
        xc5 r67 = s54.n;
        if (h12.c(r66, r49) == false) goto L174;
    L173:
        hr r216 = null;
    L176:
        Object r68 = r46.get(9);
        xc5 r69 = s54.k;
        if (h12.c(r68, r49) == false) goto L179;
    L178:
        bs4 r217 = null;
    L181:
        Object r70 = r46.get(10);
        vd2 r71 = vd2.p;
        xc5 r72 = s54.y;
        if (h12.c(r70, r49) == false) goto L184;
    L183:
        vd2 r218 = null;
    L186:
        Object r73 = r46.get(11);
        h12.c(r73, r49);
        if (r73 != null) goto L189;
        x40 r74 = null;
    L193:
        r74.getClass();
        long r75 = r74.a;
        Object r76 = r46.get(12);
        xc5 r77 = s54.j;
        if (h12.c(r76, r49) == false) goto L196;
    L195:
        sr4 r219 = null;
    L198:
        Object r78 = r46.get(13);
        xb4 r79 = xb4.d;
        xc5 r80 = s54.o;
        if (h12.c(r78, r49) == false) goto L201;
    L200:
        xb4 r310 = null;
    L204:
        return new ij4(r118, r119, r120, r121, r122, null, r215, r65, r216, r217, r218, r75, r219, r310, 49184);
    L201:
        if (r78 == null) goto L200;
        r310 = (xb4) ((if1) r80.p).invoke(r78);
        goto L204
    L196:
        if (r76 == null) goto L195;
        r219 = (sr4) ((if1) r77.p).invoke(r76);
        goto L198
    L189:
        if (r73.equals(r49) == false) goto L191;
        r74 = new x40(x40.g);
        goto L193
    L191:
        r74 = new x40(e35.b(((Integer) r73).intValue()));
        goto L193
    L184:
        if (r70 == null) goto L183;
        r218 = (vd2) ((if1) r72.p).invoke(r70);
        goto L186
    L179:
        if (r68 == null) goto L178;
        r217 = (bs4) ((if1) r69.p).invoke(r68);
        goto L181
    L174:
        if (r66 == null) goto L173;
        r216 = (hr) ((if1) r67.p).invoke(r66);
        goto L176
    L170:
        r64 = null;
        goto L171
    L166:
        r215 = null;
        goto L167
    L161:
        if (r60 == null) goto L160;
        r122 = (fb1) ((if1) r61.p).invoke(r60);
        goto L163
    L156:
        if (r58 == null) goto L155;
        r121 = (eb1) ((if1) r59.p).invoke(r58);
        goto L158
    L151:
        if (r55 == null) goto L150;
        r120 = (gb1) ((if1) r57.p).invoke(r55);
        goto L153
    L147:
        r54 = null;
        goto L148
    L140:
        if (r47.equals(r49) == false) goto L142;
        r50 = new x40(x40.g);
        goto L144
    L142:
        r50 = new x40(e35.b(((Integer) r47).intValue()));
        goto L144
    L205:
        r33.getClass();
        List r81 = (List) r33;
        Object r82 = r81.get(0);
        r54 r83 = s54.q;
        Boolean r123 = Boolean.FALSE;
        h12.c(r82, r123);
        if (r82 == null) goto L208;
        mr4 r84 = (mr4) r83.o.invoke(r82);
    L209:
        r84.getClass();
        int r124 = r84.a;
        Object r85 = r81.get(1);
        r54 r86 = s54.r;
        h12.c(r85, r123);
        if (r85 == null) goto L212;
        ur4 r87 = (ur4) r86.o.invoke(r85);
    L213:
        r87.getClass();
        int r125 = r87.a;
        Object r88 = r81.get(2);
        ct4[] r89 = bt4.b;
        r54 r90 = s54.v;
        h12.c(r88, r123);
        if (r88 == null) goto L216;
        bt4 r91 = (bt4) r90.o.invoke(r88);
    L217:
        r91.getClass();
        long r92 = r91.a;
        Object r93 = r81.get(3);
        cs4 r94 = cs4.c;
        xc5 r95 = s54.l;
        if (h12.c(r93, r123) == false) goto L220;
    L219:
        cs4 r126 = null;
    L222:
        Object r96 = r81.get(4);
        boolean r97 = h12.c(r96, r123);
        xc5 r98 = t54.a;
        if (r97 == false) goto L225;
    L224:
        zg3 r127 = null;
    L227:
        Object r99 = r81.get(5);
        ra2 r100 = ra2.d;
        xc5 r101 = s54.A;
        if (h12.c(r99, r123) == false) goto L230;
    L229:
        ra2 r128 = null;
    L232:
        Object r102 = r81.get(6);
        boolean r103 = h12.c(r102, r123);
        xc5 r104 = t54.c;
        if (r103 == false) goto L235;
    L234:
        ma2 r105 = null;
    L237:
        r105.getClass();
        int r106 = r105.a;
        Object r107 = r81.get(7);
        r54 r108 = s54.s;
        h12.c(r107, r123);
        if (r107 == null) goto L240;
        du1 r109 = (du1) r108.o.invoke(r107);
    L241:
        r109.getClass();
        int r129 = r109.a;
        Object r130 = r81.get(8);
        boolean r131 = h12.c(r130, r123);
        xc5 r132 = t54.d;
        if (r131 == false) goto L244;
    L243:
        qs4 r220 = null;
    L247:
        return new sd3(r124, r125, r92, r126, r127, r128, r106, r129, r220);
    L244:
        if (r130 == null) goto L243;
        r220 = (qs4) ((if1) r132.p).invoke(r130);
        goto L247
    L240:
        r109 = null;
        goto L241
    L235:
        if (r102 == null) goto L234;
        r105 = (ma2) ((if1) r104.p).invoke(r102);
        goto L237
    L230:
        if (r99 == null) goto L229;
        r128 = (ra2) ((if1) r101.p).invoke(r99);
        goto L232
    L225:
        if (r96 == null) goto L224;
        r127 = (zg3) ((if1) r98.p).invoke(r96);
        goto L227
    L220:
        if (r93 == null) goto L219;
        r126 = (cs4) ((if1) r95.p).invoke(r93);
        goto L222
    L216:
        r91 = null;
        goto L217
    L212:
        r87 = null;
        goto L213
    L208:
        r84 = null;
        goto L209
    L260:
        r33.getClass();
        return new pa2(((Integer) r33).intValue());
    L7:
        return new ku0(((zd) r33).a);
    L9:
        return new zd(((ku0) r33).n);
    L11:
        return Integer.valueOf((int) ((zd) r33).a);
    L13:
        return new zd(((Integer) r33).intValue());
    L15:
        return new zd(((Float) r33).floatValue());
    L108:
        return Integer.valueOf(((j64) r33).b);
    L249:
        if (r33 == null) goto L251;
        String r133 = (String) r33;
    L252:
        r133.getClass();
        return new v25(r133);
    L251:
        r133 = null;
        goto L252
    L255:
        if (r33 == null) goto L257;
        String r134 = (String) r33;
    L258:
        r134.getClass();
        return new p45(r134);
    L257:
        r134 = null;
        goto L258
    }

    public /* synthetic */ o54(int r1) {
        this.n = r1;
    }
}
