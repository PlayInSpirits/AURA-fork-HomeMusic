package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc implements qd3 {
    public final String n;
    public final zs4 o;
    public final List p;
    public final List q;
    public final ha1 r;
    public final oo0 s;
    public final xc t;
    public final CharSequence u;
    public final t62 v;
    public z05 w;
    public final boolean x;
    public final int y;
    public final int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mc] */
    public mc(String r41, zs4 r42, List r43, List r44, ha1 r45, oo0 r46, boolean r47) {
        ?? r0 = new Object();
        r0.n = r41;
        r0.o = r42;
        r0.p = r43;
        r0.q = r44;
        r0.r = r45;
        r0.s = r46;
        float r5 = r46.g();
        int r6 = 1;
        xc r4 = new xc(1);
        ((TextPaint) r4).density = r5;
        r4.b = sr4.b;
        r4.c = 3;
        r4.d = xb4.d;
        r0.t = r4;
        boolean r7 = fu.b(r42);
        ij4 r8 = r42.a;
        sd3 r1 = r42.b;
        int r9 = 0;
        if (r7 == true) goto L5;
        boolean r10 = false;
    L13:
        r0.x = r10;
        int r11 = r1.b;
        vd2 r12 = r8.k;
        if (r11 != 4) goto L17;
    L15:
        int r13 = 2;
    L34:
        r0.y = r13;
        r0.z = -1;
        lc r14 = new lc(r9, r0);
        qs4 r2 = r1.i;
        if (r2 != null) goto L38;
        r2 = qs4.c;
    L38:
        if (r2.b == false) goto L40;
        int r15 = r4.getFlags() | 128;
    L41:
        r4.setFlags(r15);
        int r3 = r2.a;
        if (r3 != 1) goto L44;
        r4.setFlags(r4.getFlags() | 64);
        r4.setHinting(0);
    L49:
        int r16 = r43.size();
        int r17 = 0;
    L50:
        if (r17 >= r16) goto L55;
        Object r18 = r43.get(r17);
        if ((((ge) r18).a instanceof ij4) == true) goto L56;
        r17 = r17 + 1;
    L56:
        if (r18 == null) goto L58;
        boolean r19 = true;
    L59:
        long r110 = r8.b;
        gb1 r20 = r8.c;
        eb1 r21 = r8.d;
        String r111 = r8.g;
        vd2 r112 = r8.k;
        as4 r22 = r8.a;
        bs4 r113 = r8.j;
        long r23 = r8.h;
        long r24 = bt4.b(r110);
        boolean r48 = r19;
        if (ct4.a(r24, 4294967296L) == false) goto L64;
        r4.setTextSize(r46.a0(r110));
    L66:
        vk0 r25 = r8.f;
        if (r25 != null) goto L72;
        if (r21 != null) goto L72;
        if (r20 != null) goto L72;
        lc r26 = r14;
    L89:
        if (r112 == null) goto L97;
        vd2 r27 = vd2.p;
        if (r112.equals(fh0.m()) == true) goto L97;
        ArrayList r28 = new ArrayList(r40.k0(r112, 10));
        Iterator r29 = r112.n.iterator();
    L94:
        if (r29.hasNext() == false) goto L96;
        r28.add(((ud2) r29.next()).a);
        goto L94
    L96:
        Locale[] r30 = (Locale[]) r28.toArray(new Locale[0]);
        r4.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(r30, r30.length)));
    L97:
        if (r111 != null) goto L99;
    L101:
        if (r113 != null) goto L103;
    L105:
        r4.d(r22.c());
        r4.c(r22.f(), 9205357640488583168L, r22.b());
        r4.f(r8.n);
        r4.g(r8.m);
        r4.e(r8.o);
        if (ct4.a(bt4.b(r23), 4294967296L) == false) goto L115;
        if (bt4.c(r23) == 0.0f) goto L115;
        float r31 = r4.getTextScaleX() * r4.getTextSize();
        float r32 = r46.a0(r23);
        if (r31 == 0.0f) goto L117;
        r4.setLetterSpacing(r32 / r31);
    L117:
        long r33 = r8.l;
        hr r34 = r8.i;
        if (r48 == true) goto L120;
    L125:
        boolean r35 = false;
    L126:
        long r114 = x40.g;
        if (x40.c(r33, r114) == false) goto L129;
    L131:
        boolean r36 = false;
    L132:
        if (r34 != null) goto L134;
    L137:
        boolean r115 = false;
    L138:
        if (r35 == true) goto L142;
        if (r36 == true) goto L142;
        if (r115 == true) goto L142;
        ij4 r37 = null;
    L152:
        List r38 = r0.p;
        if (r37 == null) goto L161;
        int r39 = r38.size() + 1;
        ArrayList r40 = new ArrayList(r39);
        int r49 = 0;
    L155:
        if (r49 >= r39) goto L160;
        if (r49 != 0) goto L158;
        ge r50 = new ge(0, r0.n.length(), r37);
    L159:
        r40.add(r50);
        r49 = r49 + 1;
        goto L155
    L158:
        r50 = (ge) r0.p.get(r49 - 1);
        goto L159
    L160:
        r38 = r40;
    L161:
        String r51 = r0.n;
        float r52 = r0.t.getTextSize();
        zs4 r53 = r0.o;
        List r54 = r0.q;
        oo0 r116 = r0.s;
        boolean r55 = r0.x;
        String r117 = r0.n;
        if (r0.z == (-1)) goto L164;
    L171:
        jc r118 = kc.a;
        if (r55 == true) goto L174;
    L187:
        CharSequence r56 = r51;
    L189:
        if (r38.isEmpty() == false) goto L198;
        if (r54.isEmpty() == false) goto L198;
        if (h12.c(r53.b.d, cs4.c) == false) goto L198;
        mc r57 = r0;
        CharSequence r58 = r56;
        if ((r53.b.c & 1095216660480L) != 0) goto L198;
    L438:
        r57.u = r58;
        r57.v = new t62(r58, r57.t, r57.y);
        return;
    L198:
        if ((r56 instanceof Spannable) == false) goto L200;
        Spannable r59 = (Spannable) r56;
    L201:
        ij4 r119 = r53.a;
        sd3 r120 = r53.b;
        if (h12.c(r119.m, sr4.c) == false) goto L204;
        r59.setSpan(kc.a, 0, r51.length(), 33);
    L204:
        eh3 r60 = r53.c;
        if (r60 == null) goto L209;
        zg3 r61 = r60.a;
        if (r61 == null) goto L209;
        boolean r62 = r61.a;
    L210:
        if (r62 == true) goto L212;
    L217:
        ra2 r63 = r120.f;
        if (r63 != null) goto L220;
        r63 = ra2.d;
    L220:
        float r210 = uo.O(r120.c, r52, r116);
        if (Float.isNaN(r210) == false) goto L223;
    L216:
        int r121 = 0;
    L243:
        cs4 r64 = r120.d;
        if (r64 == null) goto L270;
        long r65 = r64.a;
        long r66 = r64.b;
        int r410 = r121;
        if (bt4.a(r65, su3.v(r410)) == false) goto L250;
        if (bt4.a(r66, su3.v(r410)) == true) goto L270;
    L250:
        if ((r65 & 1095216660480L) == 0) goto L270;
        if ((r66 & 1095216660480L) == 0) goto L270;
        long r122 = bt4.b(r65);
        if (ct4.a(r122, 4294967296L) == false) goto L259;
        float r67 = r116.a0(r65);
    L262:
        long r123 = bt4.b(r66);
        if (ct4.a(r123, 4294967296L) == false) goto L266;
        float r68 = r116.a0(r66);
    L269:
        r59.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(r67), (int) Math.ceil(r68)), 0, r59.length(), 33);
        goto L270
    L266:
        if (ct4.a(r123, 8589934592L) == false) goto L268;
        r68 = bt4.c(r66) * r52;
        goto L269
    L268:
        r68 = 0.0f;
        goto L269
    L259:
        if (ct4.a(r122, 8589934592L) == false) goto L261;
        r67 = bt4.c(r65) * r52;
        goto L262
    L261:
        r67 = 0.0f;
    L270:
        ArrayList r69 = new ArrayList(r38.size());
        int r70 = r38.size();
        int r71 = 0;
    L271:
        if (r71 >= r70) goto L285;
        ge r72 = (ge) r38.get(r71);
        Object r73 = r72.a;
        if ((r73 instanceof ij4) == false) goto L284;
        ij4 r74 = (ij4) r73;
        if (r74.f == null) goto L277;
    L283:
        r69.add(r72);
        goto L284
    L277:
        if (r74.d != null) goto L283;
        if (r74.c != null) goto L283;
        if (((ij4) r73).e != null) goto L283;
    L284:
        r71 = r71 + 1;
        goto L271
    L285:
        vk0 r75 = r119.f;
        if (r75 == null) goto L288;
    L296:
        ij4 r76 = new ij4(0, 0, r119.c, r119.d, r119.e, r75, null, 0, null, null, null, 0, null, null, 65475);
    L297:
        gc3 r77 = new gc3(r6, r59, r26);
        if (r69.size() <= 1) goto L300;
        int r78 = r69.size();
        int r79 = r78 * 2;
        int[] r80 = new int[r79];
        int r81 = r69.size();
        int r124 = 0;
    L303:
        if (r124 >= r81) goto L306;
        ge r125 = (ge) r69.get(r124);
        r80[r124] = r125.b;
        r80[r124 + r78] = r125.c;
        r124 = r124 + 1;
        goto L303
    L306:
        if (r79 <= 1) goto L308;
        Arrays.sort(r80);
    L308:
        if (r79 == 0) goto L440;
        int r82 = r80[0];
        int r83 = 0;
    L310:
        if (r83 >= r79) goto L327;
        int r126 = r80[r83];
        if (r126 != r82) goto L314;
        ArrayList r411 = r69;
        ij4 r127 = r76;
        int r128 = r83;
    L326:
        r83 = r128 + 1;
        r69 = r411;
        r76 = r127;
        goto L310
    L314:
        int r129 = r69.size();
        ij4 r130 = r76;
        int r131 = 0;
    L315:
        if (r131 >= r129) goto L322;
        ArrayList r412 = r69;
        ge r84 = (ge) r69.get(r131);
        ij4 r132 = r76;
        int r85 = r84.b;
        int r133 = r83;
        int r86 = r84.c;
        if (r85 == r86) goto L321;
        if (ie.a(r82, r126, r85, r86) == false) goto L321;
        r130 = uo.z(r130, (ij4) r84.a);
    L321:
        r131 = r131 + 1;
        r69 = r412;
        r76 = r132;
        r83 = r133;
        goto L315
    L322:
        r411 = r69;
        r127 = r76;
        r128 = r83;
        if (r130 == null) goto L325;
        r77.a(r130, Integer.valueOf(r82), Integer.valueOf(r126));
    L325:
        r82 = r126;
    L327:
        int r87 = r38.size();
        int r88 = 0;
        boolean r89 = false;
    L328:
        if (r88 >= r87) goto L391;
        ge r90 = (ge) r38.get(r88);
        Object r91 = r90.a;
        if ((r91 instanceof ij4) == false) goto L338;
        int r134 = r90.b;
        int r135 = r90.c;
        if (r134 < 0) goto L338;
        if (r134 >= r59.length()) goto L338;
        if (r135 <= r134) goto L338;
        if (r135 > r59.length()) goto L338;
        ij4 r92 = (ij4) r91;
        long r93 = r92.h;
        hr r94 = r92.i;
        as4 r136 = r92.a;
        if (r94 == null) goto L344;
        r59.setSpan(new ir(0, r94.a), r134, r135, 33);
    L344:
        uo.P(r59, r136.c(), r134, r135);
        uo r95 = r136.f();
        float r96 = r136.b();
        if (r95 != null) goto L347;
    L350:
        sr4 r97 = r92.m;
        if (r97 == null) goto L362;
        int r98 = r97.a;
        if ((r98 | 1) != r98) goto L355;
        boolean r137 = true;
    L357:
        if ((r98 | 2) != r98) goto L359;
        boolean r99 = true;
    L360:
        tr4 r100 = new tr4(r137, r99);
        int r101 = 33;
        r59.setSpan(r100, r134, r135, 33);
    L361:
        r120 = r120;
        uo.Q(r59, r92.b, r116, r134, r135);
        String r138 = r92.g;
        if (r138 == null) goto L366;
        r59.setSpan(new ka1(0, r138), r134, r135, r101);
    L366:
        bs4 r139 = r92.j;
        if (r139 == null) goto L370;
        r59.setSpan(new ScaleXSpan(r139.a), r134, r135, r101);
        r59.setSpan(new ir(1, r139.b), r134, r135, r101);
    L370:
        uo.R(r59, r92.k, r134, r135);
        long r140 = r92.l;
        if (r140 == 16) goto L373;
        r59.setSpan(new BackgroundColorSpan(e35.U(r140)), r134, r135, r101);
    L373:
        xb4 r141 = r92.n;
        if (r141 == null) goto L380;
        long r102 = r141.b;
        int r103 = e35.U(r141.a);
        float r104 = Float.intBitsToFloat((int) (r102 >> 32));
        float r105 = Float.intBitsToFloat((int) (r102 & 4294967295L));
        float r106 = r141.c;
        if (r106 != 0.0f) goto L378;
        r106 = Float.MIN_VALUE;
    L378:
        zb4 r142 = new zb4(r103, r104, r105, r106);
        r101 = 33;
        r59.setSpan(r142, r134, r135, 33);
    L380:
        q05 r107 = r92.o;
        if (r107 == null) goto L384;
        r59.setSpan(new tv0(r107), r134, r135, r101);
    L384:
        if (ct4.a(bt4.b(r93), 4294967296L) == false) goto L386;
    L387:
        r89 = true;
    L389:
        r88 = r88 + 1;
        r87 = r87;
        goto L328
    L386:
        if (ct4.a(bt4.b(r93), 8589934592L) == true) goto L387;
    L388:
        r89 = r89;
        goto L389
    L359:
        r99 = false;
        goto L360
    L355:
        r137 = false;
        goto L357
    L362:
        r101 = 33;
        goto L361
    L347:
        if ((r95 instanceof zh4) == false) goto L349;
        uo.P(r59, ((zh4) r95).u, r134, r135);
        goto L350
    L349:
        r59.setSpan(new wb4((pv) r95, r96), r134, r135, 33);
    L338:
        r87 = r87;
        r89 = r89;
        goto L388
    L391:
        if (r89 == false) goto L415;
        int r108 = r38.size();
        int r109 = 0;
    L393:
        if (r109 >= r108) goto L415;
        ge r143 = (ge) r38.get(r109);
        fe r144 = (fe) r143.a;
        if ((r144 instanceof ij4) == false) goto L403;
        int r145 = r143.b;
        int r146 = r143.c;
        if (r145 < 0) goto L403;
        if (r145 >= r59.length()) goto L403;
        if (r146 <= r145) goto L403;
        if (r146 > r59.length()) goto L403;
        long r147 = ((ij4) r144).h;
        long r148 = bt4.b(r147);
        int r413 = r108;
        int r149 = r109;
        if (ct4.a(r148, 4294967296L) == false) goto L408;
        Object r150 = new i92(r116.a0(r147));
    L412:
        if (r150 == null) goto L414;
        r59.setSpan(r150, r145, r146, 33);
    L414:
        r109 = r149 + 1;
        r108 = r413;
        goto L393
    L408:
        if (ct4.a(r148, 8589934592L) == false) goto L410;
        r150 = new h92(bt4.c(r147));
        goto L412
    L410:
        r150 = null;
    L403:
        r413 = r108;
        r149 = r109;
    L415:
        cs4 r151 = r120.d;
        if (r151 == null) goto L423;
        long r152 = r151.a;
        long r153 = bt4.b(r152);
        if (ct4.a(r153, 4294967296L) == false) goto L421;
        r116.a0(r152);
        goto L423
    L421:
        if (ct4.a(r153, 8589934592L) == false) goto L423;
        bt4.c(r152);
    L423:
        int r154 = r38.size();
        int r155 = 0;
    L424:
        if (r155 >= r154) goto L427;
        Object r156 = ((ge) r38.get(r155)).a;
        r155 = r155 + 1;
        goto L424
    L427:
        if (r54.size() <= 0) goto L437;
        int r157 = 0;
        ge r158 = (ge) r54.get(0);
        if (r158.a != null) goto L435;
        Object[] r159 = r59.getSpans(r158.b, r158.c, l05.class);
        int r160 = r159.length;
    L431:
        if (r157 >= r160) goto L434;
        r59.removeSpan((l05) r159[r157]);
        r157 = r157 + 1;
        goto L431
    L434:
        throw null;
    L435:
        kf2.k();
        throw null;
    L437:
        r57 = this;
        r58 = r59;
        goto L438
    L440:
        kf2.m("Array is empty.");
        throw null;
    L300:
        if (r69.isEmpty() == true) goto L327;
        r77.a(uo.z(r76, (ij4) ((ge) r69.get(0)).a), Integer.valueOf(((ge) r69.get(0)).b), Integer.valueOf(((ge) r69.get(0)).c));
        goto L327
    L288:
        if (r119.d != null) goto L296;
        if (r119.c != null) goto L296;
        if (r119.e != null) goto L296;
        r76 = null;
        goto L297
    L223:
        if (r59.length() != 0) goto L226;
    L229:
        int r161 = r59.length() + 1;
    L230:
        int r211 = r161;
        int r162 = r63.b;
        if ((r162 & 1) <= 0) goto L235;
        boolean r212 = true;
    L237:
        if ((r162 & 16) <= 0) goto L239;
        boolean r213 = true;
    L240:
        r121 = 0;
        r59.setSpan(new sa2(r210, r211, r212, r213, r63.a, r63.c), 0, r59.length(), 33);
        goto L243
    L239:
        r213 = false;
        goto L240
    L235:
        r212 = false;
        goto L237
    L226:
        if (r59.length() != 0) goto L228;
        kf2.m("Char sequence is empty.");
        throw null;
    L228:
        if (r59.charAt(r59.length() - 1) == '\n') goto L229;
        r161 = r59.length();
        goto L230
    L212:
        if (r120.f != null) goto L217;
        float r163 = uo.O(r120.c, r52, r116);
        if (Float.isNaN(r163) == true) goto L216;
        r59.setSpan(new na2(r163), 0, r59.length(), 33);
    L209:
        r62 = false;
        goto L210
    L200:
        r59 = new SpannableString(r56);
        goto L201
    L174:
        if (tz0.c() == false) goto L187;
        eh3 r164 = r53.c;
        if (r164 == null) goto L180;
        zg3 r165 = r164.a;
        if (r165 == null) goto L180;
        h01 r166 = new h01(r165.b);
    L181:
        if (r166 != null) goto L184;
    L182:
        int r167 = 0;
    L186:
        CharSequence r168 = tz0.a().f(0, r51.length(), r167, r51);
        r168.getClass();
        r56 = r168;
        goto L189
    L184:
        if (r166.a != 2) goto L182;
        r167 = 1;
    L180:
        r166 = null;
        goto L181
    L164:
        if (r117.length() <= 512) goto L166;
    L169:
        int r169 = 1;
    L170:
        r0.z = r169;
        goto L171
    L166:
        if (qm4.n0(r117, '\n') == true) goto L169;
        r169 = 0;
    L142:
        if (r35 == false) goto L144;
    L143:
        long r310 = r23;
        if (r36 == false) goto L147;
        long r311 = r33;
    L148:
        if (r115 == false) goto L150;
        hr r312 = r34;
    L151:
        r37 = new ij4(0, 0, null, null, null, null, null, r310, r312, null, null, r311, null, null, 63103);
        goto L152
    L150:
        r312 = null;
        goto L151
    L147:
        r311 = r114;
        goto L148
    L144:
        r23 = bt4.c;
        goto L143
    L134:
        if (Float.compare(r34.a, 0.0f) == 0) goto L137;
        r115 = true;
        goto L138
    L129:
        if (x40.c(r33, x40.f) == true) goto L131;
        r36 = true;
        goto L132
    L120:
        if (ct4.a(bt4.b(r23), 4294967296L) == false) goto L125;
        if (bt4.c(r23) == 0.0f) goto L125;
        r35 = true;
    L115:
        if (ct4.a(bt4.b(r23), 8589934592L) == false) goto L117;
        r4.setLetterSpacing(bt4.c(r23));
        goto L117
    L103:
        if (r113.equals(bs4.c) == true) goto L105;
        r4.setTextScaleX(r4.getTextScaleX() * r113.a);
        r4.setTextSkewX(r4.getTextSkewX() + r113.b);
        goto L105
    L99:
        if (r111.equals("") == true) goto L101;
        r4.setFontFeatureSettings(r111);
    L72:
        if (r20 != null) goto L74;
        gb1 r170 = gb1.p;
    L75:
        if (r21 == null) goto L77;
        int r171 = r21.a;
    L78:
        fb1 r172 = r8.e;
        if (r172 == null) goto L82;
        int r173 = r172.a;
    L81:
        r26 = r14;
        mc r174 = (mc) r26.o;
        n05 r175 = ((ia1) r174.r).b(r25, r170, r171, r173);
        if ((r175 instanceof n05) == true) goto L86;
        z05 r176 = new z05(r175, r174.w);
        r174.w = r176;
        Object r177 = r176.q;
        r177.getClass();
        Typeface r178 = (Typeface) r177;
    L87:
        r4.setTypeface(r178);
        goto L89
    L86:
        Object r179 = r175.n;
        r179.getClass();
        r178 = (Typeface) r179;
        goto L87
    L82:
        r173 = 65535;
        goto L81
    L77:
        r171 = 0;
        goto L78
    L74:
        r170 = r20;
        goto L75
    L64:
        if (ct4.a(r24, 8589934592L) == false) goto L66;
        r4.setTextSize(bt4.c(r110) * r4.getTextSize());
        goto L66
    L58:
        r19 = false;
        goto L59
    L55:
        r18 = null;
        goto L56
    L44:
        if (r3 != 2) goto L46;
        r4.getFlags();
        r4.setHinting(1);
        goto L49
    L46:
        if (r3 != 3) goto L48;
        r4.getFlags();
        r4.setHinting(0);
        goto L49
    L48:
        r4.getFlags();
        goto L49
    L40:
        r15 = r4.getFlags() & (-129);
        goto L41
    L17:
        if (r11 != 5) goto L19;
    L18:
        r13 = 3;
        goto L34
    L19:
        if (r11 != 1) goto L21;
        r13 = 0;
        goto L34
    L21:
        if (r11 != 2) goto L23;
        r13 = 1;
        goto L34
    L23:
        if (r11 == 3) goto L26;
        if (r11 == 0) goto L26;
        kf2.o("Invalid TextDirection.");
        throw null;
    L26:
        if (r12 == null) goto L29;
        Locale r180 = ((ud2) r12.n.get(0)).a;
        if (r180 == null) goto L29;
    L30:
        int r181 = TextUtils.getLayoutDirectionFromLocale(r180);
        if (r181 == 0) goto L15;
        if (r181 == 1) goto L18;
    L29:
        r180 = Locale.getDefault();
        goto L30
    L5:
        d34 r182 = xz0.a;
        d34 r183 = xz0.a;
        kl4 r184 = (kl4) r183.o;
        if (r184 == null) goto L9;
    L12:
        r10 = ((Boolean) r184.getValue()).booleanValue();
        goto L13
    L9:
        if (tz0.c() == false) goto L11;
        r184 = r183.D();
        r183.o = r184;
        goto L12
    L11:
        r184 = fu.t;
        goto L12
    }

    @Override // defpackage.qd3
    public final boolean a() {
        z05 r0 = this.w;
        if (r0 == null) goto L5;
        boolean r1 = r0.j();
    L6:
        if (r1 == false) goto L8;
        return true;
    L8:
        if (this.x == false) goto L10;
    L21:
        return false;
    L10:
        if (fu.b(this.o) == false) goto L21;
        d34 r2 = xz0.a;
        d34 r3 = xz0.a;
        kl4 r4 = (kl4) r3.o;
        if (r4 != null) goto L19;
        if (tz0.c() == false) goto L17;
        r4 = r3.D();
        r3.o = r4;
        goto L19
    L17:
        r4 = fu.t;
    L19:
        if (((Boolean) r4.getValue()).booleanValue() == false) goto L21;
        return true;
    L5:
        r1 = false;
        goto L6
    }

    public final float b() {
        t62 r10 = this.v;
        float r0 = r10.e;
        TextPaint r1 = r10.b;
        if (Float.isNaN(r0) == false) goto L5;
        BreakIterator r2 = BreakIterator.getLineInstance(r1.getTextLocale());
        CharSequence r3 = r10.a;
        r2.setText(new v10(r3, r3.length()));
        PriorityQueue r4 = new PriorityQueue(10, g12.d);
        int r5 = r2.next();
        int r6 = 0;
    L8:
        if (r5 == (-1)) goto L18;
        if (r4.size() >= 10) goto L12;
        r4.add(new j02(r6, r5, 1));
    L17:
        r6 = r5;
        r5 = r2.next();
        goto L8
    L12:
        j02 r7 = (j02) r4.peek();
        if (r7 == null) goto L17;
        if ((r7.o - r7.n) >= (r5 - r6)) goto L17;
        r4.poll();
        r4.add(new j02(r6, r5, 1));
        goto L17
    L18:
        float r8 = 0.0f;
        if (r4.isEmpty() == true) goto L27;
        Iterator r9 = r4.iterator();
        if (r9.hasNext() == false) goto L29;
        j02 r11 = (j02) r9.next();
        int r12 = r11.n;
        int r13 = r11.o;
        r8 = Layout.getDesiredWidth(r10.b(), r12, r13, r1);
    L25:
        if (r9.hasNext() == false) goto L27;
        j02 r14 = (j02) r9.next();
        int r15 = r14.n;
        int r16 = r14.o;
        r8 = Math.max(r8, Layout.getDesiredWidth(r10.b(), r15, r16, r1));
        goto L25
    L29:
        tb4.k();
        return 0.0f;
    L27:
        r10.e = r8;
        return r8;
    L5:
        return r10.e;
    }

    @Override // defpackage.qd3
    public final float d() {
        return this.v.c();
    }
}
