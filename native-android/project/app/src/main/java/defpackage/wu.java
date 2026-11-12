package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu {
    public static final byte[] a = null;

    static {
        String r0 = f35.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(be3 r3) {
        int r0 = r3.b;
        r3.O(4);
        if (r3.m() == 1751411826) goto L5;
        r0 = r0 + 4;
    L5:
        r3.N(r0);
    }

    public static void b(be3 r49, int r50, int r51, int r52, int r53, String r54, boolean r55, ow0 r56, tu r57, int r58) {
        be3 r0 = r49;
        int r1 = r50;
        int r3 = r52;
        int[] r7 = fu.q;
        int[] r8 = fu.o;
        r0.N(r51 + 16);
        if (r55 == false) goto L5;
        int r12 = r0.H();
        r0.O(6);
    L7:
        if (r12 == 0) goto L9;
        if (r12 == 1) goto L9;
        if (r12 != 2) goto L650;
        r0.O(16);
        int r22 = 2;
        int r11 = (int) Math.round(Double.longBitsToDouble(r0.u()));
        int r13 = r0.E();
        r0.O(4);
        int r20 = 4;
        int r14 = r0.E();
        int r21 = r0.E();
        if ((r21 & 1) == 0) goto L14;
        boolean r23 = true;
    L16:
        if ((r21 & 2) == 0) goto L18;
        boolean r24 = true;
    L19:
        if (r23 == true) goto L36;
        if (r14 != 8) goto L22;
        int r15 = 3;
    L39:
        r0.O(8);
        int r16 = r11;
        int r17 = r13;
        int r18 = 0;
    L45:
        if (r1 != 1767992678) goto L47;
        r17 = -1;
        r16 = -1;
    L52:
        int r9 = r0.b;
        if (r1 != 1701733217) goto L63;
        Pair r19 = h(r0, r51, r3);
        if (r19 == null) goto L61;
        r1 = ((Integer) r19.first).intValue();
        if (r56 != null) goto L59;
        ow0 r10 = null;
    L60:
        ((qv4[]) r57.c)[r58] = (qv4) r19.second;
    L62:
        r0.N(r9);
    L64:
        String r110 = "audio/mhm1";
        if (r1 != 1633889587) goto L68;
        String r5 = "audio/ac3";
    L140:
        ru r59 = null;
        String r2 = null;
        List r25 = null;
        pu r33 = null;
    L142:
        if ((r9 - r51) >= r3) goto L594;
        r0.N(r9);
        int r26 = r0.m();
        if (r26 <= 0) goto L147;
        boolean r4 = true;
    L146:
        int r27 = r15;
        wr1.i("childAtomSize must be positive", r4);
        int r6 = r0.m();
        r2 = r2;
        if (r6 != 1835557187) goto L161;
        r0.N(r9 + 8);
        r0.O(1);
        int r28 = r0.A();
        r0.O(1);
        if (Objects.equals(r5, r110) == false) goto L153;
        String r29 = String.format("mhm1.%02X", new Object[]{Integer.valueOf(r28)});
    L154:
        int r30 = r0.H();
        byte[] r111 = new byte[r30];
        String r510 = r29;
        r0.k(r111, 0, r30);
        if (r25 != null) goto L157;
        gy3 r31 = yw1.o(r111);
    L158:
        r2 = r510;
        r25 = r31;
    L159:
        r59 = r59;
        int r32 = r1;
    L593:
        r9 = r9 + r26;
        r20 = 4;
        r22 = 2;
        r0 = r49;
        r3 = r52;
        r1 = r32;
        r59 = r59;
        r15 = r27;
        r110 = r110;
        r25 = r25;
        goto L142
    L157:
        r31 = yw1.p(r111, (byte[]) r25.get(0));
        goto L158
    L153:
        r29 = String.format("mha1.%02X", new Object[]{Integer.valueOf(r28)});
        goto L154
    L161:
        if (r6 != 1835557200) goto L170;
        r0.N(r9 + 8);
        int r34 = r0.A();
        if (r34 <= 0) goto L168;
        byte[] r35 = new byte[r34];
        r0.k(r35, 0, r34);
        if (r25 != null) goto L167;
        r25 = yw1.o(r35);
        goto L168
    L167:
        r25 = yw1.p((byte[]) r25.get(0), r35);
    L168:
        r25 = r25;
        r2 = r2;
        goto L159
    L170:
        if (r6 == 1702061171) goto L174;
        if (r55 == false) goto L176;
        if (r6 == 2002876005) goto L174;
    L176:
        if (r6 != 1651798644) goto L178;
        r0.N(r9 + 8);
        r0.O(r20);
        r33 = new pu(r0.C(), r0.C());
        r25 = r25;
        r2 = r2;
        r5 = r5;
        goto L159
    L178:
        r5 = r5;
        r110 = r110;
        if (r6 != 1684103987) goto L185;
        r0.N(r9 + 8);
        String r36 = Integer.toString(r53);
        h00 r37 = new h00();
        r37.p(r0);
        int r112 = r8[r37.i(r22)];
        r37.t(8);
        int r113 = r7[r37.i(3)];
        if (r37.i(1) == 0) goto L183;
        r113 = r113 + 1;
    L183:
        int r38 = fu.r[r37.i(5)] * 1000;
        r37.c();
        r0.N(r37.f());
        sb1 r39 = new sb1();
        r39.a = r36;
        r39.m = lw2.m("audio/ac3");
        r39.E = r113;
        r39.F = r112;
        r39.q = r10;
        r39.d = r54;
        r39.h = r38;
        r39.i = r38;
        r57.d = new tb1(r39);
        r25 = r25;
        r26 = r26;
        r9 = r9;
        int r40 = r17;
        r32 = r1;
    L544:
        r59 = r59;
        r17 = r40;
        r2 = r2;
        r5 = r5;
        r9 = r9;
        goto L593
    L185:
        if (r6 != 1684366131) goto L205;
        r0.N(r9 + 8);
        String r41 = Integer.toString(r53);
        h00 r42 = new h00();
        r42.p(r0);
        int r114 = r42.i(13) * 1000;
        r42.t(3);
        int r115 = r8[r42.i(2)];
        r42.t(10);
        int r116 = r7[r42.i(3)];
        if (r42.i(1) == 0) goto L189;
        r116 = r116 + 1;
    L189:
        int r210 = r116;
        r42.t(3);
        int r310 = r42.i(4);
        r42.t(1);
        if (r310 <= 0) goto L195;
        r42.t(6);
        if (r42.i(1) == 0) goto L194;
        r210 = r210 + 2;
    L194:
        r42.t(1);
    L195:
        int r43 = r210;
        r26 = r26;
        if (r42.b() <= 7) goto L202;
        r42.t(7);
        if (r42.i(1) == 0) goto L202;
        String r44 = "audio/eac3-joc";
    L203:
        r42.c();
        r0.N(r42.f());
        sb1 r45 = new sb1();
        r45.a = r41;
        r45.m = lw2.m(r44);
        r45.E = r43;
        r45.F = r115;
        r45.q = r10;
        r45.d = r54;
        r45.i = r114;
        r57.d = new tb1(r45);
        r32 = r1;
        r40 = r17;
    L202:
        r44 = "audio/eac3";
        goto L203
    L205:
        r25 = r25;
        r26 = r26;
        if (r6 != 1684103988) goto L442;
        r0.N(r9 + 8);
        String r46 = Integer.toString(r53);
        h00 r47 = new h00();
        r47.p(r0);
        int r48 = r47.b();
        int r60 = r47.i(3);
        if (r60 > 1) goto L441;
        int r61 = r47.i(7);
        if (r47.h() == false) goto L213;
        int r62 = 48000;
    L214:
        r47.t(4);
        int r117 = r47.i(9);
        if (r61 <= 1) goto L225;
        if (r60 == 0) goto L223;
        if (r47.h() == false) goto L225;
        r47.t(16);
        if (r47.h() == false) goto L225;
        r47.t(128);
        goto L225
    L223:
        throw ParserException.c("Invalid AC-4 DSI version: " + r60);
    L225:
        if (r60 != 1) goto L232;
        if (r47.b() < 66) goto L230;
        r47.t(66);
        r47.c();
        goto L232
    L230:
        throw ParserException.c("Invalid AC-4 DSI bitrate.");
    L232:
        u2 r63 = new u2();
        r63.a = true;
        r63.b = -1;
        r63.c = -1;
        r63.d = true;
        r63.e = 2;
        r63.f = 1;
        r63.g = 0;
        int r64 = 0;
    L233:
        if (r64 >= r117) goto L380;
        if (r60 == 0) goto L235;
        int r410 = r117;
        int r118 = r47.i(8);
        int r411 = r16;
        int r119 = r47.i(8);
        if (r119 != 255) goto L240;
        int r412 = r47.i(16) + r119;
    L241:
        if (r118 <= 2) goto L243;
        r47.t(r412 * 8);
        r64 = r64 + 1;
        r117 = r410;
        r16 = r411;
        goto L233
    L243:
        int r120 = (r48 - r47.b()) / 8;
        int r121 = r47.i(5);
        if (r121 != 31) goto L246;
        boolean r122 = true;
    L247:
        int r413 = r120;
        boolean r414 = r122;
        boolean r511 = false;
        int r123 = r118;
        int r124 = r121;
        int r125 = r412;
    L248:
        r63.f = r123;
        int r415 = r17;
        if (r511 == true) goto L254;
        if (r414 == true) goto L254;
        if (r124 != 6) goto L254;
        r123 = r123;
        boolean r65 = true;
    L346:
        if (r65 == false) goto L351;
        int r126 = r47.i(7);
        int r127 = 0;
    L348:
        if (r127 >= r126) goto L351;
        r47.t(15);
        r127 = r127 + 1;
    L351:
        if (r123 > 0) goto L353;
    L365:
        int r66 = 8;
    L366:
        r47.c();
        if (r60 != 1) goto L374;
        int r67 = ((r48 - r47.b()) / 8) - r413;
        if (r125 < r67) goto L372;
        r47.u(r125 - r67);
        goto L374
    L372:
        throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
    L374:
        if (r63.a == false) goto L382;
        if (r63.b != (-1)) goto L382;
        throw ParserException.c("Can't determine channel mode of presentation " + r64);
    L382:
        if (r63.a == false) goto L414;
        int r68 = r63.b;
        boolean r69 = r63.d;
        int r128 = r63.e;
        switch(r68) {
            case 0: goto L398;
            case 1: goto L397;
            case 2: goto L396;
            case 3: goto L395;
            case 4: goto L394;
            case 5: goto L393;
            case 6: goto L392;
            case 7: goto L393;
            case 8: goto L392;
            case 9: goto L393;
            case 10: goto L392;
            case 11: goto L391;
            case 12: goto L389;
            case 13: goto L388;
            case 14: goto L387;
            case 15: goto L386;
            default: goto L385;
        };
    L385:
        int r129 = 11;
        int r311 = -1;
    L399:
        if (r68 == r129) goto L405;
        if (r68 == 12) goto L405;
        if (r68 == 13) goto L405;
        if (r68 == 14) goto L405;
    L413:
        int r70 = r311;
    L436:
        if (r70 <= 0) goto L439;
        Object[] r71 = {Integer.valueOf(r61), Integer.valueOf(r63.f), Integer.valueOf(r63.g)};
        String r72 = f35.a;
        String r73 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", r71);
        sb1 r74 = new sb1();
        r74.a = r46;
        r74.m = lw2.m("audio/ac4");
        r74.E = r70;
        r74.F = r62;
        r74.q = r10;
        r74.d = r54;
        r74.j = r73;
        r57.d = new tb1(r74);
        r16 = r411;
        r40 = r415;
        r32 = r1;
        goto L544
    L439:
        throw ParserException.c("Cannot determine channel count of presentation.");
    L405:
        if (r69 == true) goto L407;
        r311 = r311 - 2;
    L407:
        if (r128 != 0) goto L409;
        r311 = r311 - 4;
        goto L413
    L409:
        if (r128 != 1) goto L413;
        r311 = r311 - 2;
        goto L413
    L386:
        r129 = 11;
        r311 = 24;
        goto L399
    L387:
        r129 = 11;
        r311 = 14;
        goto L399
    L388:
        r129 = 11;
        r311 = 13;
        goto L399
    L389:
        r311 = 12;
    L390:
        r129 = 11;
        goto L399
    L391:
        r129 = 11;
        r311 = 11;
        goto L399
    L392:
        r311 = r66;
        goto L390
    L393:
        r129 = 11;
        r311 = 7;
        goto L399
    L394:
        r129 = 11;
        r311 = 6;
        goto L399
    L395:
        r129 = 11;
        r311 = 5;
        goto L399
    L396:
        r129 = 11;
        r311 = 3;
        goto L399
    L397:
        r129 = 11;
        r311 = 2;
        goto L399
    L398:
        r129 = 11;
        r311 = 1;
        goto L399
    L414:
        int r75 = r63.c;
        int r76 = r63.g;
        if (r75 <= 0) goto L421;
        r70 = r75 + 1;
        if (r76 != 4) goto L436;
        if (r70 != 17) goto L436;
        r70 = 21;
        goto L436
    L421:
        if (r76 != 0) goto L423;
    L431:
        r70 = 2;
        goto L436
    L423:
        if (r76 != 1) goto L425;
        r70 = 6;
        goto L436
    L425:
        if (r76 != 2) goto L427;
        r70 = r66;
        goto L436
    L427:
        if (r76 != 3) goto L429;
        r70 = 10;
        goto L436
    L429:
        if (r76 == 4) goto L432;
        l93.q0("Ac4Util", "AC-4 level " + r63.g + " has not been defined.");
        goto L431
    L432:
        r70 = 12;
        goto L436
    L353:
        if (r47.h() == false) goto L360;
        if (r47.b() < 66) goto L358;
        r47.t(66);
        goto L360
    L358:
        throw ParserException.c("Can't parse bitrate DSI.");
    L360:
        if (r47.h() == false) goto L365;
        r47.c();
        r47.u(r47.i(16));
        int r130 = r47.i(5);
        int r131 = 0;
    L362:
        if (r131 >= r130) goto L364;
        r47.t(3);
        r47.t(8);
        r131 = r131 + 1;
        goto L362
    L364:
        r66 = 8;
    L254:
        r63.g = r47.i(3);
        if (r47.h() == false) goto L257;
        r47.t(5);
    L257:
        r47.t(2);
        int r132 = 1;
        if (r60 != 1) goto L264;
        if (r123 == 1) goto L263;
        if (r123 != 2) goto L264;
    L263:
        r47.t(2);
    L264:
        r47.t(5);
        r47.t(10);
        if (r60 != 1) goto L302;
        if (r123 <= 0) goto L269;
        r63.a = r47.h();
    L269:
        if (r63.a == false) goto L287;
        if (r123 == 1) goto L275;
        int r77 = 2;
        if (r123 == 2) goto L275;
    L286:
        r47.t(24);
        r132 = 1;
    L288:
        if (r123 == r132) goto L293;
        if (r123 != r77) goto L302;
    L293:
        if (r47.h() == false) goto L298;
        if (r47.h() == false) goto L298;
        r47.t(r77);
    L298:
        if (r47.h() == false) goto L302;
        r47.s();
        int r78 = 8;
        int r133 = r47.i(8);
        int r134 = 0;
    L300:
        if (r134 >= r133) goto L302;
        r47.t(r78);
        r134 = r134 + 1;
        r78 = 8;
    L275:
        int r135 = r47.i(5);
        if (r135 < 0) goto L281;
        if (r135 > 15) goto L281;
        r63.b = r135;
    L281:
        if (r135 >= 11) goto L283;
    L285:
        r77 = 2;
        goto L286
    L283:
        if (r135 > 14) goto L285;
        r63.d = r47.h();
        r77 = 2;
        r63.e = r47.i(2);
        goto L286
    L287:
        r77 = 2;
    L302:
        if (r511 == true) goto L342;
        if (r414 == true) goto L342;
        r47.s();
        if (r124 != 0) goto L308;
    L334:
        if (r123 != 0) goto L338;
        int r79 = 0;
    L336:
        if (r79 >= 2) goto L345;
        hw.E(r47, r63);
        r79 = r79 + 1;
    L345:
        r47.s();
        r65 = r47.h();
        goto L346
    L338:
        int r80 = 0;
    L340:
        if (r80 >= 2) goto L345;
        hw.F(r47, r63);
        r80 = r80 + 1;
        goto L340
    L308:
        if (r124 == 1) goto L334;
        if (r124 == 2) goto L334;
        if (r124 != 3) goto L314;
    L326:
        if (r123 != 0) goto L330;
        int r81 = 0;
    L328:
        if (r81 >= 3) goto L345;
        hw.E(r47, r63);
        r81 = r81 + 1;
        goto L328
    L330:
        int r82 = 0;
    L332:
        if (r82 >= 3) goto L345;
        hw.F(r47, r63);
        r82 = r82 + 1;
        goto L332
    L314:
        if (r124 == 4) goto L326;
        if (r124 == 5) goto L320;
        int r136 = r47.i(7);
        int r83 = 0;
    L318:
        if (r83 >= r136) goto L345;
        r47.t(8);
        r83 = r83 + 1;
        goto L318
    L320:
        if (r123 != 0) goto L322;
        hw.E(r47, r63);
        goto L345
    L322:
        int r84 = r47.i(3);
        int r137 = 0;
    L324:
        if (r137 >= (r84 + 2)) goto L345;
        hw.F(r47, r63);
        r137 = r137 + 1;
    L342:
        if (r123 != 0) goto L344;
        hw.E(r47, r63);
        goto L345
    L344:
        hw.F(r47, r63);
        goto L345
    L246:
        r122 = false;
        goto L247
    L240:
        r412 = r119;
        goto L241
    L235:
        boolean r138 = r47.h();
        r411 = r16;
        r511 = r138;
        r124 = r47.i(5);
        r123 = r47.i(5);
        r125 = 0;
        r413 = 0;
        r414 = false;
        goto L248
    L380:
        r1 = r1;
        r415 = r17;
        r411 = r16;
        r66 = 8;
        goto L382
    L213:
        r62 = 44100;
        goto L214
    L441:
        throw ParserException.c("Unsupported AC-4 DSI version: " + r60);
    L442:
        r32 = r1;
        r9 = r9;
        int r416 = r17;
        int r417 = r16;
        if (r6 != 1684892784) goto L450;
        if (r18 <= 0) goto L448;
        r16 = r18;
        r17 = 2;
        goto L593
    L448:
        throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + r18);
    L450:
        if (r6 != 1684305011) goto L452;
    L453:
        r32 = r32;
        sb1 r85 = new sb1();
        r85.a = Integer.toString(r53);
        r85.m = lw2.m(r5);
        r40 = r416;
        r85.E = r40;
        r16 = r417;
        r85.F = r16;
        r85.q = r10;
        r85.d = r54;
        r57.d = new tb1(r85);
        goto L544
    L452:
        if (r6 == 1969517683) goto L453;
        if (r6 != 1682927731) goto L458;
        int r86 = r26 - 8;
        byte[] r87 = a;
        byte[] r88 = Arrays.copyOf(r87, r87.length + r86);
        r0.N(r9 + 8);
        r0.k(r88, r87.length, r86);
        r25 = su3.j(r88);
        r16 = r417;
        r17 = r416;
        goto L593
    L458:
        if (r6 != 1684425825) goto L463;
        byte[] r89 = new byte[r26 - 8];
        r89[0] = 102;
        r89[1] = 76;
        r89[2] = 97;
        r89[3] = 67;
        r0.N(r9 + 12);
        r0.k(r89, 4, r26 - 12);
        r25 = yw1.o(r89);
        r2 = r2;
    L460:
        r5 = r5;
        r9 = r9;
        r16 = r417;
        r17 = r416;
        r32 = r32;
        goto L593
    L463:
        if (r6 != 1634492771) goto L466;
        int r90 = r26 - 12;
        byte[] r91 = new byte[r90];
        r0.N(r9 + 12);
        r0.k(r91, 0, r90);
        byte[] r92 = i40.a;
        be3 r93 = new be3(r91);
        r93.N(5);
        int r94 = r93.A();
        r93.N(9);
        int r95 = r93.A();
        r93.N(20);
        int[] r96 = {r93.E(), r95, r94};
        int r97 = r96[0];
        int r98 = r96[1];
        int r99 = r96[2];
        String r100 = f35.a;
        int r101 = f35.C(r99, ByteOrder.LITTLE_ENDIAN);
        r25 = yw1.o(r91);
        r27 = r101;
        r16 = r97;
        r17 = r98;
        r2 = r2;
        r5 = r5;
        r9 = r9;
        r32 = r32;
        r59 = r59;
        goto L593
    L466:
        if (r6 != 1767990114) goto L521;
        r0.N(r9 + 9);
        int r102 = r0.F();
        byte[] r103 = new byte[r102];
        r0.k(r103, 0, r102);
        byte[] r104 = i40.a;
        be3 r105 = new be3(r103);
        String r106 = null;
        String r107 = null;
    L469:
        if (r105.a() <= 0) goto L515;
        if (r106 == null) goto L474;
        if (r107 != null) goto L515;
    L474:
        int r108 = r105.A();
        int r139 = r108 >> 3;
        if ((r108 & 2) == 0) goto L477;
        boolean r140 = true;
    L479:
        if ((r108 & 1) == 0) goto L481;
        boolean r109 = true;
    L482:
        int r141 = r105.F();
        if (r139 > 4) goto L485;
    L493:
        if (r109 == false) goto L495;
        r105.O(r105.F());
    L495:
        int r142 = r105.b + r141;
        if (r139 != 31) goto L499;
        r105.O(4);
        Object[] r143 = {Integer.valueOf(r105.A()), Integer.valueOf(r105.A())};
        String r144 = f35.a;
        r106 = String.format(Locale.US, "iamf.%03X.%03X", r143);
    L514:
        r105.N(r142);
        goto L469
    L499:
        if (r139 != 0) goto L514;
    L501:
        if ((r105.A() & 128) != 0) goto L501;
        r107 = r105.y(4, StandardCharsets.UTF_8);
        if (r107.equals("mp4a") == false) goto L514;
    L506:
        if ((r105.A() & 128) != 0) goto L506;
        r105.O(2);
        h00 r145 = new h00();
        r145.p(r105);
        int r146 = r145.i(5);
        if (r146 != 31) goto L512;
        r146 = r145.i(6) + 32;
    L512:
        r107 = r107 + ".40." + r146;
        goto L514
    L485:
        if (r139 >= 24) goto L493;
        if (r140 == false) goto L493;
    L487:
        int r147 = 128;
        if ((r105.A() & 128) != 0) goto L487;
    L491:
        if ((r105.A() & r147) == 0) goto L493;
        r147 = 128;
        goto L491
    L481:
        r109 = false;
        goto L482
    L477:
        r140 = false;
    L515:
        if (r106 == null) goto L518;
        if (r107 == null) goto L518;
        r2 = b11.o(r106, ".", r107);
    L519:
        r25 = yw1.o(r103);
    L518:
        r2 = null;
        goto L519
    L521:
        if (r6 != 1885564227) goto L542;
        r0.N(r9 + 12);
        if ((r0.A() & 1) == 0) goto L525;
        ByteOrder r148 = ByteOrder.LITTLE_ENDIAN;
    L526:
        int r149 = r0.A();
        r32 = r32;
        if (r32 != 1768973165) goto L530;
        int r150 = f35.C(r149, r148);
        int r151 = -1;
    L537:
        r59 = r59;
        r27 = r150;
        r2 = r2;
        if (r150 == r151) goto L541;
        r5 = "audio/raw";
    L540:
        r9 = r9;
        r16 = r417;
        r17 = r416;
        goto L593
    L541:
        r5 = r5;
        goto L540
    L530:
        if (r32 != 1718641517) goto L536;
        if (r149 != 32) goto L536;
        if (r148.equals(ByteOrder.LITTLE_ENDIAN) == false) goto L536;
        r150 = 4;
    L535:
        r151 = -1;
    L536:
        r150 = r27;
        goto L535
    L525:
        r148 = ByteOrder.BIG_ENDIAN;
        goto L526
    L542:
        r32 = r32;
        r16 = r417;
        r40 = r416;
    L174:
        String r312 = r5;
        r25 = r25;
        int r313 = r26;
        int r418 = r9;
        int r152 = r17;
        r110 = r110;
        r32 = r1;
        if (r6 != 1702061171) goto L548;
        int r153 = r313;
        int r154 = r418;
        r9 = r154;
    L565:
        if (r154 == (-1)) goto L592;
        r59 = c(r154, r0);
        String r155 = (String) r59.p;
        byte[] r156 = (byte[]) r59.q;
        if (r156 != null) goto L569;
        r26 = r153;
    L585:
        r5 = r155;
        r17 = r152;
        r2 = r2;
        goto L593
    L569:
        if ("audio/vorbis".equals(r155) == false) goto L586;
        be3 r157 = new be3(r156);
        r157.O(1);
        int r158 = 0;
    L572:
        if (r157.a() <= 0) goto L576;
        if (r157.j() != 255) goto L576;
        r158 = r158 + 255;
        r157.O(1);
    L576:
        int r159 = r157.A() + r158;
        int r160 = 0;
    L578:
        if (r157.a() <= 0) goto L583;
        r26 = r153;
        if (r157.j() != 255) goto L584;
        r160 = r160 + 255;
        r157.O(1);
        r153 = r26;
    L584:
        int r161 = r157.A() + r160;
        byte[] r162 = new byte[r159];
        int r163 = r157.b;
        System.arraycopy(r156, r163, r162, 0, r159);
        int r164 = (r163 + r159) + r161;
        int r165 = r156.length - r164;
        byte[] r166 = new byte[r165];
        System.arraycopy(r156, r164, r166, 0, r165);
        r25 = yw1.p(r162, r166);
        goto L585
    L583:
        r26 = r153;
        goto L584
    L586:
        r26 = r153;
        if ("audio/mp4a-latm".equals(r155) == false) goto L589;
        g r167 = xl.D(new h00(r156.length, r156), false);
        r16 = r167.b;
        r17 = r167.c;
        r2 = r167.a;
    L590:
        r25 = yw1.o(r156);
        r5 = r155;
        goto L593
    L589:
        r17 = r152;
        r2 = r2;
        goto L590
    L592:
        r26 = r153;
        r59 = r59;
        r17 = r152;
        r2 = r2;
        r5 = r312;
        goto L593
    L548:
        r154 = r0.b;
        r9 = r418;
        if (r154 < r9) goto L552;
        boolean r168 = true;
    L553:
        wr1.i(null, r168);
    L554:
        r153 = r313;
        if ((r154 - r9) >= r153) goto L564;
        r0.N(r154);
        int r169 = r0.m();
        if (r169 <= 0) goto L559;
        boolean r170 = true;
    L560:
        wr1.i("childAtomSize must be positive", r170);
        if (r0.m() == 1702061171) goto L565;
        r154 = r154 + r169;
        r313 = r153;
        goto L554
    L559:
        r170 = false;
        goto L560
    L564:
        r154 = -1;
        goto L565
    L552:
        r168 = false;
        goto L553
    L147:
        r4 = false;
        goto L146
    L594:
        String r211 = r2;
        String r314 = r5;
        List r315 = r25;
        int r171 = r17;
        int r212 = r15;
        if (((tb1) r57.d) != null) goto L651;
        if (r314 == null) goto L652;
        sb1 r172 = new sb1();
        r172.a = Integer.toString(r53);
        r172.m = lw2.m(r314);
        r172.j = r211;
        r172.E = r171;
        r172.F = r16;
        r172.G = r212;
        r172.p = r315;
        r172.q = r10;
        r172.d = r54;
        if (r59 == null) goto L600;
        ru r173 = r59;
        r172.h = jz4.I(r173.n);
        r172.i = jz4.I(r173.o);
    L603:
        r57.d = new tb1(r172);
        return;
    L600:
        pu r174 = r33;
        if (r174 == null) goto L603;
        r172.h = jz4.I(r174.a);
        r172.i = jz4.I(r174.b);
        goto L603
    L652:
        return;
    L651:
        return;
    L68:
        if (r1 != 1700998451) goto L71;
        r5 = "audio/eac3";
        goto L140
    L71:
        if (r1 != 1633889588) goto L74;
        r5 = "audio/ac4";
        goto L140
    L74:
        if (r1 != 1685353315) goto L77;
        r5 = "audio/vnd.dts";
        goto L140
    L77:
        if (r1 != 1685353320) goto L79;
    L139:
        r5 = "audio/vnd.dts.hd";
        goto L140
    L79:
        if (r1 == 1685353324) goto L139;
        if (r1 != 1685353317) goto L85;
        r5 = "audio/vnd.dts.hd;profile=lbr";
        goto L140
    L85:
        if (r1 != 1685353336) goto L88;
        r5 = "audio/vnd.dts.uhd;profile=p2";
        goto L140
    L88:
        if (r1 != 1935764850) goto L91;
        r5 = "audio/3gpp";
        goto L140
    L91:
        if (r1 != 1935767394) goto L94;
        r5 = "audio/amr-wb";
        goto L140
    L94:
        if (r1 != 1936684916) goto L98;
    L95:
        r15 = r22;
    L96:
        r5 = "audio/raw";
        goto L140
    L98:
        if (r1 != 1953984371) goto L101;
        r5 = "audio/raw";
        r15 = 268435456;
        goto L140
    L101:
        if (r1 != 1819304813) goto L106;
        if (r15 != (-1)) goto L96;
    L106:
        if (r1 != 778924082) goto L108;
    L138:
        r5 = "audio/mpeg";
        goto L140
    L108:
        if (r1 == 778924083) goto L138;
        if (r1 != 1835557169) goto L114;
        r5 = "audio/mha1";
        goto L140
    L114:
        if (r1 != 1835560241) goto L117;
        r5 = "audio/mhm1";
        goto L140
    L117:
        if (r1 != 1634492771) goto L120;
        r5 = "audio/alac";
        goto L140
    L120:
        if (r1 != 1634492791) goto L123;
        r5 = "audio/g711-alaw";
        goto L140
    L123:
        if (r1 != 1970037111) goto L126;
        r5 = "audio/g711-mlaw";
        goto L140
    L126:
        if (r1 != 1332770163) goto L129;
        r5 = "audio/opus";
        goto L140
    L129:
        if (r1 != 1716281667) goto L132;
        r5 = "audio/flac";
        goto L140
    L132:
        if (r1 != 1835823201) goto L135;
        r5 = "audio/true-hd";
        goto L140
    L135:
        if (r1 != 1767992678) goto L137;
        r5 = "audio/iamf";
        goto L140
    L137:
        r5 = null;
        goto L140
    L59:
        r10 = r56.a(((qv4) r19.second).b);
        goto L60
    L61:
        r10 = r56;
        goto L62
    L63:
        r10 = r56;
        goto L64
    L47:
        if (r1 != 1935764850) goto L50;
        int r175 = 8000;
    L49:
        r16 = r175;
        r17 = 1;
        goto L52
    L50:
        if (r1 != 1935767394) goto L52;
        r175 = 16000;
        goto L49
    L22:
        if (r14 != 16) goto L26;
        if (r24 == false) goto L25;
        r15 = 268435456;
        goto L39
    L25:
        r15 = 2;
        goto L39
    L26:
        if (r14 != 24) goto L31;
        if (r24 == false) goto L29;
        r15 = 1342177280;
        goto L39
    L29:
        r15 = 21;
        goto L39
    L31:
        if (r14 != 32) goto L38;
        if (r24 == false) goto L34;
        r15 = 1610612736;
        goto L39
    L34:
        r15 = 22;
    L38:
        r15 = -1;
        goto L39
    L36:
        if (r14 != 32) goto L38;
        r15 = 4;
        goto L39
    L18:
        r24 = false;
        goto L19
    L14:
        r23 = false;
        goto L16
    L650:
        return;
    L9:
        r22 = 2;
        r20 = 4;
        r17 = r0.H();
        r0.O(6);
        int r176 = r0.B();
        r0.N(r0.b - 4);
        r18 = r0.m();
        if (r12 != 1) goto L43;
        r0.O(16);
    L43:
        r16 = r176;
        r15 = -1;
        goto L45
    L5:
        r0.O(8);
        r12 = 0;
        goto L7
    }

    public static ru c(int r10, be3 r11) {
        r11.N(r10 + 12);
        r11.O(1);
        d(r11);
        r11.O(2);
        int r1 = r11.A();
        if ((r1 & 128) == 0) goto L6;
        r11.O(2);
    L6:
        if ((r1 & 64) == 0) goto L9;
        r11.O(r11.A());
    L9:
        if ((r1 & 32) == 0) goto L11;
        r11.O(2);
    L11:
        r11.O(1);
        d(r11);
        String r2 = lw2.e(r11.A());
        if ("audio/mpeg".equals(r2) == true) goto L29;
        if ("audio/vnd.dts".equals(r2) == true) goto L29;
        if ("audio/vnd.dts.hd".equals(r2) == true) goto L29;
        r11.O(4);
        long r0 = r11.C();
        long r3 = r11.C();
        r11.O(1);
        int r12 = d(r11);
        long r4 = r3;
        byte[] r5 = new byte[r12];
        r11.k(r5, 0, r12);
        if (r4 > 0) goto L23;
        r4 = -1;
    L23:
        if (r0 <= 0) goto L25;
        long r6 = r0;
    L27:
        return new ru(r2, r5, r4, r6);
    L25:
        r6 = -1;
    L29:
        return new ru(r2, null, -1, -1);
    }

    public static int d(be3 r3) {
        int r0 = r3.A();
        int r1 = r0 & 127;
    L4:
        if ((r0 & 128) != 128) goto L6;
        r0 = r3.A();
        r1 = (r1 << 7) | (r0 & 127);
        goto L4
    L6:
        return r1;
    }

    public static int e(int r0) {
        return (r0 >> 24) & 255;
    }

    public static qv2 f(oy2 r14) {
        py2 r0 = r14.s(1751411826);
        py2 r1 = r14.s(1801812339);
        py2 r15 = r14.s(1768715124);
        if (r0 == null) goto L36;
        if (r1 == null) goto L36;
        if (r15 == null) goto L36;
        be3 r2 = r0.p;
        r2.N(16);
        if (r2.m() != 1835299937) goto L36;
        be3 r3 = r1.p;
        r3.N(12);
        int r4 = r3.m();
        String[] r5 = new String[r4];
        int r6 = 0;
    L11:
        if (r6 >= r4) goto L13;
        int r7 = r3.m();
        r3.O(4);
        r5[r6] = r3.y(r7 - 8, StandardCharsets.UTF_8);
        r6 = r6 + 1;
        goto L11
    L13:
        be3 r16 = r15.p;
        r16.N(8);
        ArrayList r8 = new ArrayList();
    L15:
        if (r16.a() <= 8) goto L32;
        int r9 = r16.b;
        int r10 = r16.m();
        int r11 = r16.m() - 1;
        if (r11 < 0) goto L29;
        if (r11 >= r4) goto L29;
        String r12 = r5[r11];
        int r13 = r9 + r10;
    L20:
        int r17 = r16.b;
        if (r17 >= r13) goto L26;
        int r18 = r16.m();
        if (r16.m() == 1684108385) goto L24;
        r16.N(r17 + r18);
        goto L20
    L24:
        int r19 = r16.m();
        int r110 = r16.m();
        int r111 = r18 - 16;
        byte[] r112 = new byte[r111];
        r16.k(r112, 0, r111);
        oi2 r113 = new oi2(r12, r112, r110, r19);
    L27:
        if (r113 == null) goto L30;
        r8.add(r113);
    L30:
        r16.N(r9 + r10);
        goto L15
    L26:
        r113 = null;
    L29:
        xa3.m(r11, "Skipped metadata with unknown key index: ", "BoxParsers");
        goto L30
    L32:
        if (r8.isEmpty() == true) goto L36;
        return new qv2(r8);
    L36:
        return null;
    }

    public static uy2 g(be3 r11) {
        r11.N(8);
        if (e(r11.m()) != 0) goto L6;
        long r0 = r11.C();
        long r2 = r11.C();
    L5:
        long r5 = r0;
        long r7 = r2;
        return new uy2(r5, r7, r11.C());
    L6:
        r0 = r11.u();
        r2 = r11.u();
        goto L5
    }

    public static Pair h(be3 r17, int r18, int r19) {
        int r1 = r17.b;
    L4:
        if ((r1 - r18) >= r19) goto L67;
        r17.N(r1);
        int r2 = r17.m();
        boolean r5 = false;
        if (r2 <= 0) goto L8;
        boolean r7 = true;
    L9:
        wr1.i("childAtomSize must be positive", r7);
        if (r17.m() != 1936289382) goto L66;
        int r8 = r1 + 8;
        int r12 = 0;
        int r9 = -1;
        Integer r10 = null;
        String r11 = null;
    L13:
        if ((r8 - r1) >= r2) goto L24;
        r17.N(r8);
        int r13 = r17.m();
        int r15 = r17.m();
        if (r15 != 1718775137) goto L18;
        r10 = Integer.valueOf(r17.m());
    L23:
        r8 = r8 + r13;
        goto L13
    L18:
        if (r15 != 1935894637) goto L21;
        r17.O(4);
        r11 = r17.y(4, StandardCharsets.UTF_8);
        goto L23
    L21:
        if (r15 != 1935894633) goto L23;
        r9 = r8;
        r12 = r13;
        goto L23
    L24:
        byte[] r16 = null;
        if ("cenc".equals(r11) == false) goto L27;
    L34:
        if (r10 == null) goto L36;
        boolean r3 = true;
    L37:
        wr1.i("frma atom is mandatory", r3);
        if (r9 == (-1)) goto L40;
        boolean r4 = true;
    L41:
        wr1.i("schi atom is mandatory", r4);
        int r6 = r9 + 8;
    L43:
        if ((r6 - r9) >= r12) goto L60;
        r17.N(r6);
        int r14 = r17.m();
        if (r17.m() == 1952804451) goto L46;
        r6 = r6 + r14;
        goto L43
    L46:
        int r20 = e(r17.m());
        r17.O(1);
        if (r20 != 0) goto L49;
        r17.O(1);
        int r110 = 0;
        int r111 = 0;
    L51:
        if (r17.A() != 1) goto L53;
        boolean r112 = true;
    L54:
        int r113 = r17.A();
        byte[] r114 = new byte[16];
        r17.k(r114, 0, 16);
        if (r112 == false) goto L58;
        if (r113 != 0) goto L58;
        int r21 = r17.A();
        byte[] r22 = new byte[r21];
        r17.k(r22, 0, r21);
        r16 = r22;
    L58:
        qv4 r23 = new qv4(r112, r11, r113, r114, r110, r111, r16);
    L61:
        if (r23 == null) goto L63;
        r5 = true;
    L63:
        wr1.i("tenc atom is mandatory", r5);
        String r24 = f35.a;
        Pair r25 = Pair.create(r10, r23);
    L64:
        if (r25 == null) goto L66;
        return r25;
    L53:
        r112 = false;
        goto L54
    L49:
        int r26 = r17.A();
        r111 = r26 & 15;
        r110 = (r26 & 240) >> 4;
        goto L51
    L60:
        r23 = null;
        goto L61
    L40:
        r4 = false;
        goto L41
    L36:
        r3 = false;
        goto L37
    L27:
        if ("cbc1".equals(r11) == true) goto L34;
        if ("cens".equals(r11) == true) goto L34;
        if ("cbcs".equals(r11) == true) goto L34;
        r25 = null;
    L66:
        r1 = r1 + r2;
        goto L4
    L8:
        r7 = false;
        goto L9
    L67:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tu i(be3 r66, vu r67, String r68, ow0 r69, boolean r70) {
        be3 r0 = r66;
        vu r10 = r67;
        String r5 = r68;
        int r11 = r10.a;
        r0.N(12);
        int r13 = r0.m();
        boolean r14 = false;
        tu r8 = new tu(r13, 0);
        int r9 = 0;
    L3:
        if (r9 >= r13) goto L574;
        int r2 = r0.b;
        int r3 = r0.m();
        if (r3 <= 0) goto L7;
        boolean r4 = true;
    L8:
        String r6 = "childAtomSize must be positive";
        wr1.i("childAtomSize must be positive", r4);
        int r7 = r0.m();
        byte r17 = 3;
        int r18 = 8;
        byte[] r19 = null;
        if (r7 == 1635148593) goto L156;
        if (r7 == 1635148595) goto L156;
        if (r7 == 1701733238) goto L156;
        if (r7 == 1831958048) goto L156;
        if (r7 == 1836070006) goto L156;
        if (r7 == 1752589105) goto L156;
        if (r7 == 1751479857) goto L156;
        if (r7 == 1932670515) goto L156;
        if (r7 == 1211250227) goto L156;
        if (r7 == 1748121139) goto L156;
        if (r7 == 1987063864) goto L156;
        if (r7 == 1987063865) goto L156;
        if (r7 == 1635135537) goto L156;
        if (r7 == 1685479798) goto L156;
        if (r7 == 1685479729) goto L156;
        if (r7 == 1685481573) goto L156;
        if (r7 == 1685481521) goto L156;
        if (r7 == 1634760241) goto L156;
        if (r7 == 1836069985) goto L155;
        if (r7 == 1701733217) goto L155;
        if (r7 == 1633889587) goto L155;
        if (r7 == 1700998451) goto L155;
        if (r7 == 1633889588) goto L155;
        if (r7 == 1835823201) goto L155;
        if (r7 == 1685353315) goto L155;
        if (r7 == 1685353317) goto L155;
        if (r7 == 1685353320) goto L155;
        if (r7 == 1685353324) goto L155;
        if (r7 == 1685353336) goto L155;
        if (r7 == 1935764850) goto L155;
        if (r7 == 1935767394) goto L155;
        if (r7 == 1819304813) goto L155;
        if (r7 == 1936684916) goto L155;
        if (r7 == 1953984371) goto L155;
        if (r7 == 778924082) goto L155;
        if (r7 == 778924083) goto L155;
        if (r7 == 1835557169) goto L155;
        if (r7 == 1835560241) goto L155;
        if (r7 == 1634492771) goto L155;
        if (r7 == 1634492791) goto L155;
        if (r7 == 1970037111) goto L155;
        if (r7 == 1332770163) goto L155;
        if (r7 == 1716281667) goto L155;
        if (r7 == 1767992678) goto L155;
        if (r7 == 1768973165) goto L155;
        if (r7 == 1718641517) goto L155;
        if (r7 == 1414810956) goto L118;
        if (r7 == 1954034535) goto L118;
        if (r7 == 2004251764) goto L118;
        if (r7 == 1937010800) goto L118;
        if (r7 == 1664495672) goto L118;
        if (r7 == 1836070003) goto L118;
        if (r7 != 1835365492) goto L116;
        r0.N(r2 + 16);
        if (r7 != 1835365492) goto L114;
        r0.v();
        String r1 = r0.v();
        if (r1 == null) goto L114;
        sb1 r12 = new sb1();
        r12.a = Integer.toString(r11);
        r12.m = lw2.m(r1);
        r8.d = new tb1(r12);
    L114:
        r2 = r2;
        int r49 = r3;
        int r28 = r9;
        int r30 = r11;
        int r31 = r13;
        boolean r15 = false;
        char r16 = '\f';
    L573:
        r0.N(r2 + r49);
        r9 = r28 + 1;
        r10 = r67;
        r14 = r15;
        r11 = r30;
        r13 = r31;
        goto L3
    L116:
        if (r7 != 1667329389) goto L114;
        sb1 r20 = new sb1();
        r20.a = Integer.toString(r11);
        r20.m = lw2.m("application/x-camera-motion");
        r8.d = new tb1(r20);
    L118:
        r0.N(r2 + 16);
        String r21 = "application/ttml+xml";
        long r26 = Long.MAX_VALUE;
        if (r7 != 1414810956) goto L122;
    L120:
        int r22 = r2;
        gy3 r110 = null;
    L121:
        long r23 = r26;
        if (r21 == null) goto L152;
        sb1 r24 = new sb1();
        r24.a = Integer.toString(r11);
        r24.m = lw2.m(r21);
        r24.d = r5;
        r24.r = r23;
        r24.p = r110;
        r8.d = new tb1(r24);
    L152:
        r15 = false;
        r16 = '\f';
        r0 = r66;
        r49 = r3;
        r28 = r9;
        r30 = r11;
        r31 = r13;
        r2 = r22;
        goto L573
    L122:
        if (r7 != 1954034535) goto L124;
        int r25 = r3 - 16;
        byte[] r27 = new byte[r25];
        r0.k(r27, 0, r25);
        r110 = yw1.o(r27);
        r21 = "application/x-quicktime-tx3g";
        r22 = r2;
        goto L121
    L124:
        if (r7 != 2004251764) goto L126;
        r21 = "application/x-mp4-vtt";
        goto L120
    L126:
        if (r7 != 1937010800) goto L128;
        r26 = 0;
        goto L120
    L128:
        if (r7 != 1664495672) goto L131;
        r8.b = 1;
        r21 = "application/x-mp4-cea-608";
        goto L120
    L131:
        if (r7 != 1836070003) goto L153;
        int r29 = r0.b;
        r0.O(4);
        if (r0.m() != 1702061171) goto L148;
        byte[] r32 = (byte[]) c(r29, r0).q;
        if (r32 != null) goto L137;
    L138:
        r22 = r2;
        goto L152
    L137:
        if (r32.length != 64) goto L138;
        int r33 = r10.d;
        int r34 = r10.e;
        if (r32.length != 64) goto L142;
        boolean r210 = true;
    L143:
        rr2.w(r210);
        ArrayList r35 = new ArrayList(16);
        int r111 = 0;
    L145:
        if (r111 >= (r32.length - 3)) goto L147;
        byte[] r211 = r32;
        int r36 = jz4.u(r32[r111], r32[r111 + 1], r32[r111 + 2], r211[r111 + 3]);
        int r37 = (r36 >> 16) & 255;
        int r112 = ((r36 >> 8) & 255) - 128;
        int r113 = ((r112 * 14075) / 10000) + r37;
        int r38 = (r36 & 255) - 128;
        int r39 = (r37 - ((r38 * 3455) / 10000)) - ((r112 * 7169) / 10000);
        int r40 = ((r38 * 17790) / 10000) + r37;
        r35.add(String.format("%06x", new Object[]{Integer.valueOf(f35.j(r40, 0, 255) | ((f35.j(r39, 0, 255) << 8) | (f35.j(r113, 0, 255) << 16)))}));
        r111 = r111 + 4;
        r32 = r211;
        r2 = r2;
        goto L145
    L147:
        r22 = r2;
        StringBuilder r41 = b11.t("size: ", "x", r33, r34, "\npalette: ");
        r41.append(new uc0(", ").b(r35));
        r41.append("\n");
        String r42 = r41.toString();
        String r43 = f35.a;
        r110 = yw1.o(r42.getBytes(StandardCharsets.UTF_8));
        String r44 = "application/vobsub";
    L149:
        r21 = r44;
        goto L121
    L142:
        r210 = false;
        goto L143
    L148:
        r22 = r2;
        r44 = null;
        r110 = null;
        goto L149
    L153:
        tb4.a();
        return null;
    L155:
        r0 = r66;
        r2 = r2;
        b(r0, r7, r2, r3, r10.a, r5, r70, r69, r8, r9);
        r5 = r68;
    L156:
        int r114 = r10.c;
        r0.N(r2 + 16);
        r0.O(16);
        int r115 = r0.H();
        int r45 = r0.H();
        r0.O(50);
        int r116 = r0.b;
        r28 = r9;
        if (r7 != 1701733238) goto L167;
        Pair r46 = h(r0, r2, r3);
        if (r46 == null) goto L165;
        r7 = ((Integer) r46.first).intValue();
        if (r69 != null) goto L163;
        ow0 r212 = null;
    L164:
        ((qv4[]) r8.c)[r28] = (qv4) r46.second;
    L166:
        r0.N(r116);
        ow0 r47 = r212;
    L169:
        if (r7 != 1831958048) goto L172;
        String r213 = "video/mpeg";
    L175:
        ow0 r310 = r47;
        r30 = r11;
        r31 = r13;
        int r48 = 8;
        int r50 = 8;
        List r117 = null;
        ss0 r118 = null;
        ByteBuffer r214 = null;
        String r311 = null;
        byte[] r312 = null;
        zh0 r410 = null;
        pu r411 = null;
        ru r412 = null;
        String r51 = r213;
        float r313 = 1.0f;
        int r52 = -1;
        int r119 = -1;
        int r120 = -1;
        boolean r314 = false;
        int r315 = -1;
        int r316 = -1;
        int r413 = -1;
        int r414 = -1;
        int r53 = r116;
        int r121 = -1;
    L177:
        if ((r53 - r2) >= r3) goto L182;
        r0.N(r53);
        int r122 = r0.b;
        int r415 = r53;
        int r54 = r0.m();
        if (r54 == 0) goto L181;
    L183:
        if (r54 <= 0) goto L185;
        boolean r123 = true;
    L186:
        wr1.i(r6, r123);
        int r124 = r0.m();
        int r416 = r3;
        if (r124 != 1635148611) goto L198;
        if (r51 != null) goto L191;
        boolean r55 = true;
    L192:
        wr1.i(r19, r55);
        r0.N(r122 + 8);
        yn r56 = yn.a(r0);
        r117 = r56.a;
        r8.a = r56.b;
        if (r314 == true) goto L195;
        float r125 = r56.k;
    L196:
        String r57 = r56.l;
        int r58 = r56.j;
        r120 = r56.g;
        int r59 = r56.h;
        r121 = r56.i;
        int r126 = r56.e;
        r48 = r56.f;
        r316 = r58;
        int r510 = r7;
        int r60 = r52;
        r313 = r125;
        int r511 = r126;
        r118 = r118;
        int r61 = r18;
        r51 = "video/avc";
        r311 = r57;
        r119 = r59;
    L197:
        byte[] r62 = null;
    L555:
        r53 = r415 + r54;
        r52 = r60;
        r19 = r62;
        r18 = r61;
        r3 = r416;
        r7 = r510;
        r6 = r6;
        r50 = r511;
        r51 = r51;
        r118 = r118;
        r8 = r8;
        r17 = 3;
        goto L177
    L195:
        r125 = r313;
        goto L196
    L191:
        r55 = false;
        goto L192
    L198:
        r510 = r7;
        if (r124 != 1752589123) goto L212;
        if (r51 != null) goto L203;
        boolean r63 = true;
    L204:
        wr1.i(null, r63);
        r0.N(r122 + 8);
        zl1 r64 = zl1.a(r0, false, null);
        r117 = r64.a;
        r8.a = r64.b;
        if (r314 == true) goto L207;
        float r127 = r64.l;
    L208:
        int r65 = r64.m;
        int r71 = r64.c;
        String r72 = r64.n;
        int r128 = r64.k;
        if (r128 == (-1)) goto L211;
        r52 = r128;
    L211:
        int r129 = r64.d;
        int r130 = r64.e;
        r120 = r64.h;
        int r131 = r64.i;
        int r73 = r64.j;
        int r74 = r64.f;
        int r75 = r64.g;
        r118 = r64.o;
        r48 = r75;
        r51 = "video/hevc";
        r313 = r127;
        r414 = r129;
        r413 = r130;
        r119 = r131;
        r61 = r18;
        r121 = r73;
        r511 = r74;
        r315 = r71;
        r60 = r52;
        r316 = r65;
        r311 = r72;
        goto L197
    L207:
        r127 = r313;
        goto L208
    L203:
        r63 = false;
        goto L204
    L212:
        int r512 = r52;
        if (r124 != 1818785347) goto L255;
        wr1.i("lhvC must follow hvcC atom", "video/hevc".equals(r51));
        if (r118 != null) goto L217;
    L219:
        boolean r76 = false;
    L220:
        wr1.i("must have at least two layers", r76);
        r0.N(r122 + 8);
        r118.getClass();
        zl1 r77 = zl1.a(r0, true, r118);
        if (r8.a != r77.b) goto L223;
        boolean r78 = true;
    L224:
        wr1.i("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", r78);
        int r79 = r77.h;
        if (r79 == (-1)) goto L230;
        if (r120 != r79) goto L228;
        boolean r80 = true;
    L229:
        wr1.i("colorSpace must be the same for both views", r80);
        goto L230
    L228:
        r80 = false;
    L230:
        int r81 = r77.i;
        if (r81 == (-1)) goto L236;
        if (r119 != r81) goto L234;
        boolean r82 = true;
    L235:
        wr1.i("colorRange must be the same for both views", r82);
        goto L236
    L234:
        r82 = false;
    L236:
        int r83 = r77.j;
        if (r83 == (-1)) goto L243;
        if (r121 != r83) goto L240;
        boolean r84 = true;
    L241:
        wr1.i("colorTransfer must be the same for both views", r84);
        goto L243
    L240:
        r84 = false;
    L243:
        if (r50 != r77.f) goto L245;
        boolean r85 = true;
    L246:
        wr1.i("bitdepthLuma must be the same for both views", r85);
        if (r48 != r77.g) goto L249;
        boolean r86 = true;
    L250:
        wr1.i("bitdepthChroma must be the same for both views", r86);
        if (r117 == null) goto L253;
        uw1 r87 = yw1.j();
        r87.d(r117);
        r87.d(r77.a);
        r117 = r87.f();
    L254:
        r511 = r50;
        r311 = r77.n;
        r51 = "video/mv-hevc";
        r8 = r8;
        r118 = r118;
        r61 = r18;
        r60 = r512;
        r62 = null;
        r6 = r6;
        goto L555
    L253:
        wr1.i("initializationData must be already set from hvcC atom", false);
        goto L254
    L249:
        r86 = false;
        goto L250
    L245:
        r85 = false;
        goto L246
    L223:
        r78 = false;
        goto L224
    L217:
        if (((yw1) r118.n).size() < 2) goto L219;
        r76 = true;
        goto L220
    L255:
        int r513 = 5;
        if (r124 != 1986361461) goto L318;
        r0.N(r122 + 8);
        int r88 = r0.b;
        zh0 r132 = null;
    L259:
        if ((r88 - r122) >= r54) goto L293;
        r0.N(r88);
        int r89 = r0.m();
        if (r89 <= 0) goto L263;
        boolean r90 = true;
    L264:
        wr1.i(r6, r90);
        int r514 = r48;
        if (r0.m() != 1702454643) goto L291;
        r0.N(r88 + 8);
        int r91 = r0.b;
    L268:
        if ((r91 - r88) >= r89) goto L289;
        r0.N(r91);
        int r92 = r0.m();
        if (r92 <= 0) goto L272;
        boolean r133 = true;
    L273:
        wr1.i(r6, r133);
        int r515 = r91;
        if (r0.m() == 1937011305) goto L275;
        r91 = r515 + r92;
        r18 = 8;
        goto L268
    L275:
        r0.O(4);
        int r93 = r0.A();
        if ((r93 & 1) != 1) goto L278;
        boolean r94 = true;
    L280:
        if ((r93 & 2) != 2) goto L282;
        boolean r95 = true;
    L284:
        if ((r93 & 8) != r18) goto L286;
        boolean r96 = true;
    L287:
        yl r134 = new yl();
        r134.a = r94;
        r134.b = r95;
        r134.c = r96;
        zh0 r97 = new zh0(11, r134);
    L290:
        r132 = r97;
    L292:
        r88 = r88 + r89;
        r48 = r514;
        r50 = r50;
        r18 = 8;
        goto L259
    L286:
        r96 = false;
        goto L287
    L282:
        r95 = false;
        goto L284
    L278:
        r94 = false;
        goto L280
    L272:
        r133 = false;
        goto L273
    L289:
        r97 = null;
        goto L290
    L291:
        r50 = r50;
        r88 = r88;
        r89 = r89;
        goto L292
    L263:
        r90 = false;
        goto L264
    L293:
        int r516 = r48;
        r511 = r50;
        if (r132 != null) goto L296;
        hg3 r98 = null;
    L297:
        if (r98 == null) goto L309;
        yl r99 = (yl) ((zh0) r98.o).o;
        boolean r100 = r99.c;
        if (r118 != null) goto L301;
    L310:
        int r101 = r512;
        if (r101 != (-1)) goto L316;
        if (r100 == true) goto L315;
        r513 = 4;
    L315:
        int r102 = r513;
    L317:
        r60 = r102;
        r6 = r6;
        r51 = r51;
        r8 = r8;
        r118 = r118;
        r48 = r516;
        r62 = null;
        r61 = 8;
    L316:
        r102 = r101;
        goto L317
    L301:
        if (((yw1) r118.n).size() < 2) goto L310;
        if (r99.a == true) goto L305;
    L307:
        boolean r103 = false;
    L308:
        wr1.i("both eye views must be marked as available", r103);
        wr1.i("for MV-HEVC, eye_views_reversed must be set to false", !r100);
        goto L309
    L305:
        if (r99.b == false) goto L307;
        r103 = true;
    L309:
        r101 = r512;
        goto L316
    L296:
        r98 = new hg3(8, r132);
        goto L297
    L318:
        r48 = r48;
        r511 = r50;
        r60 = r512;
        if (r124 != 1685480259) goto L321;
    L324:
        r6 = r6;
        r51 = r51;
        r8 = r8;
        int r517 = r119;
        r118 = r118;
        r62 = null;
        r61 = 8;
        r410 = zh0.E(r0);
    L553:
        r48 = r48;
        r119 = r517;
        goto L555
    L321:
        if (r124 == 1685485123) goto L324;
        if (r124 == 1685485379) goto L324;
        int r104 = 6;
        if (r124 != 1987076931) goto L347;
        if (r51 != null) goto L330;
        boolean r105 = true;
    L331:
        wr1.i(null, r105);
        if (r510 != 1987063864) goto L334;
        String r135 = "video/x-vnd.on2.vp8";
    L335:
        r0.N(r122 + 12);
        byte r136 = (byte) r0.A();
        byte r137 = (byte) r0.A();
        int r215 = r0.A();
        int r106 = r215 >> 4;
        byte r138 = (byte) ((r215 >> 1) & 7);
        if (r135.equals("video/x-vnd.on2.vp9") == false) goto L339;
        byte[] r139 = i40.a;
        byte[] r107 = new byte[12];
        r107[0] = 1;
        r107[1] = 1;
        r107[2] = r136;
        r107[r17] = 2;
        r107[4] = 1;
        r107[5] = r137;
        r107[6] = r17;
        r107[7] = 1;
        r107[8] = (byte) r106;
        r107[9] = 4;
        r107[10] = 1;
        r107[11] = r138;
        r117 = yw1.o(r107);
    L339:
        if ((r215 & 1) == 0) goto L341;
        boolean r108 = true;
    L342:
        int r109 = r0.A();
        int r140 = r0.A();
        r120 = c50.f(r109);
        if (r108 == false) goto L345;
        int r518 = 1;
    L346:
        r121 = c50.g(r140);
        r511 = r106;
        r6 = r6;
        r510 = r510;
        r8 = r8;
        r51 = r135;
        r118 = r118;
        r119 = r518;
        r62 = null;
        r61 = 8;
        r60 = r60;
        r48 = r511;
        goto L555
    L345:
        r518 = 2;
        goto L346
    L341:
        r108 = false;
        goto L342
    L334:
        r135 = "video/x-vnd.on2.vp9";
        goto L335
    L330:
        r105 = false;
        goto L331
    L347:
        int r519 = 7;
        r510 = r510;
        int r520 = 10;
        if (r124 != 1635135811) goto L441;
        int r141 = r54 - 8;
        byte[] r142 = new byte[r141];
        r0.k(r142, 0, r141);
        r117 = yw1.o(r142);
        r0.N(r122 + 8);
        byte[] r143 = r0.a;
        h00 r144 = new h00(r143.length, r143);
        r144.q(r0.b * 8);
        r144.u(1);
        int r145 = r144.i(r17);
        r144.t(6);
        boolean r146 = r144.h();
        boolean r147 = r144.h();
        int r521 = -1;
        if (r145 != 2) goto L359;
        if (r146 == false) goto L359;
        if (r147 == false) goto L354;
        int r148 = 12;
    L355:
        if (r147 == false) goto L357;
        r520 = 12;
    L357:
        int r610 = r148;
    L358:
        int r611 = r520;
    L368:
        r144.t(13);
        r144.s();
        int r149 = r144.i(4);
        if (r149 == 1) goto L373;
        l93.K("BoxParsers", "Unsupported obu_type: " + r149);
        c50 r522 = new c50(-1, -1, -1, null, r610, r611);
    L371:
        c50 r150 = r522;
        char r151 = '\f';
    L439:
        int r152 = r150.e;
        int r153 = r150.f;
        int r154 = r150.a;
        int r155 = r150.b;
        r121 = r150.c;
        r51 = "video/av01";
        r510 = r510;
        r511 = r152;
        r118 = r118;
        r61 = 8;
        r60 = r60;
        r48 = r153;
        r120 = r154;
        r119 = r155;
        goto L197
    L373:
        if (r144.h() == false) goto L375;
        l93.K("BoxParsers", "Unsupported obu_extension_flag");
        r522 = new c50(-1, -1, -1, null, r610, r611);
        goto L371
    L375:
        boolean r156 = r144.h();
        r144.s();
        if (r156 == true) goto L378;
    L380:
        int r157 = r144.i(3);
        r144.s();
        if (r144.h() == false) goto L384;
        l93.K("BoxParsers", "Unsupported reduced_still_picture_header");
        r522 = new c50(-1, -1, -1, null, r610, r611);
        goto L371
    L384:
        if (r144.h() == false) goto L387;
        l93.K("BoxParsers", "Unsupported timing_info_present_flag");
        r522 = new c50(-1, -1, -1, null, r610, r611);
        goto L371
    L387:
        if (r144.h() == false) goto L389;
        l93.K("BoxParsers", "Unsupported initial_display_delay_present_flag");
        r522 = new c50(-1, -1, -1, null, r610, r611);
        goto L371
    L389:
        int r158 = 5;
        int r159 = r144.i(5);
        int r160 = 0;
    L390:
        if (r160 > r159) goto L395;
        r144.t(12);
        if (r144.i(r158) <= r519) goto L394;
        r144.s();
    L394:
        r160 = r160 + 1;
        r158 = 5;
        r519 = 7;
        goto L390
    L395:
        r151 = '\f';
        int r161 = r144.i(4);
        int r162 = r144.i(4);
        r144.t(r161 + 1);
        r144.t(r162 + 1);
        if (r144.h() == false) goto L398;
        int r163 = 7;
        r144.t(7);
    L399:
        r144.t(r163);
        boolean r164 = r144.h();
        if (r164 == false) goto L403;
        r144.t(2);
    L403:
        if (r144.h() == false) goto L405;
        int r165 = 1;
        int r166 = 2;
    L406:
        if (r166 <= 0) goto L411;
        if (r144.h() == true) goto L411;
        r144.t(r165);
    L411:
        if (r164 == false) goto L413;
        r144.t(3);
    L413:
        r144.t(3);
        boolean r167 = r144.h();
        if (r157 != 2) goto L418;
        if (r167 == false) goto L418;
        r144.s();
    L418:
        if (r157 != 1) goto L420;
    L422:
        boolean r168 = false;
    L424:
        if (r144.h() == false) goto L437;
        int r169 = r144.i(8);
        int r170 = r144.i(8);
        int r171 = r144.i(8);
        if (r168 == true) goto L431;
        if (r169 != 1) goto L431;
        if (r170 != 13) goto L431;
        if (r171 != 0) goto L431;
        int r172 = 1;
    L432:
        int r523 = c50.f(r169);
        if (r172 != 1) goto L435;
        int r524 = 1;
    L436:
        int r612 = r523;
        int r613 = c50.g(r170);
        r521 = r524;
    L438:
        r150 = new c50(r612, r521, r613, null, r610, r611);
        goto L439
    L435:
        r524 = 2;
    L431:
        r172 = r144.i(1);
        goto L432
    L437:
        r612 = -1;
        r613 = -1;
        goto L438
    L420:
        if (r144.h() == false) goto L422;
        r168 = true;
        goto L424
    L405:
        r165 = 1;
        r166 = r144.i(1);
        goto L406
    L398:
        r163 = 7;
        goto L399
    L378:
        if (r144.i(8) <= 127) goto L380;
        l93.K("BoxParsers", "Excessive obu_size");
        r522 = new c50(-1, -1, -1, null, r610, r611);
        goto L371
    L354:
        r148 = 10;
    L359:
        if (r145 > 2) goto L367;
        if (r146 == false) goto L362;
        int r173 = 10;
    L363:
        if (r146 == true) goto L366;
        r520 = 8;
    L366:
        r610 = r173;
        goto L358
    L362:
        r173 = 8;
        goto L363
    L367:
        r610 = -1;
        r611 = -1;
        goto L368
    L441:
        if (r124 != 1668050025) goto L449;
        if (r214 != null) goto L444;
        ByteBuffer r174 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    L445:
        r174.position(21);
        r174.putShort(r0.x());
        r174.putShort(r0.x());
        r214 = r174;
    L446:
        r62 = null;
    L447:
        r61 = 8;
        goto L555
    L444:
        r174 = r214;
        goto L445
    L449:
        if (r124 != 1835295606) goto L454;
        if (r214 != null) goto L452;
        ByteBuffer r175 = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    L453:
        short r176 = r0.x();
        short r177 = r0.x();
        short r178 = r0.x();
        short r179 = r0.x();
        short r180 = r0.x();
        short r181 = r0.x();
        int r525 = r119;
        short r182 = r0.x();
        short r183 = r0.x();
        long r526 = r0.C();
        long r614 = r0.C();
        r175.position(1);
        r175.putShort(r180);
        r175.putShort(r181);
        r175.putShort(r176);
        r175.putShort(r177);
        r175.putShort(r178);
        r175.putShort(r179);
        r175.putShort(r182);
        r175.putShort(r183);
        r175.putShort((short) (r526 / 10000));
        r175.putShort((short) (r614 / 10000));
        r214 = r175;
        r119 = r525;
        goto L446
    L452:
        r175 = r214;
        goto L453
    L454:
        r510 = r510;
        r6 = r6;
        r51 = r51;
        r8 = r8;
        r517 = r119;
        r118 = r118;
        if (r124 != 1681012275) goto L461;
        if (r51 != null) goto L459;
        boolean r184 = true;
    L458:
        r62 = null;
        wr1.i(null, r184);
        r60 = r60;
        r51 = "video/3gpp";
        r48 = r48;
        r119 = r517;
        goto L447
    L459:
        r184 = false;
        goto L458
    L461:
        r62 = null;
        if (r124 != 1702061171) goto L472;
        if (r51 != null) goto L465;
        boolean r185 = true;
    L466:
        wr1.i(null, r185);
        ru r186 = c(r122, r0);
        String r187 = (String) r186.p;
        byte[] r188 = (byte[]) r186.q;
        if (r188 == null) goto L469;
        r117 = yw1.o(r188);
    L469:
        r412 = r186;
        r51 = r187;
        r119 = r517;
        r61 = 8;
    L470:
        r60 = r60;
        r48 = r48;
        goto L555
    L465:
        r185 = false;
        goto L466
    L472:
        if (r124 != 1651798644) goto L476;
        r0.N(r122 + 8);
        r0.O(4);
        r60 = r60;
        r411 = new pu(r0.C(), r0.C());
    L474:
        r48 = r48;
        r119 = r517;
        goto L447
    L476:
        if (r124 != 1885434736) goto L479;
        r0.N(r122 + 8);
        r60 = r60;
        r313 = r0.E() / r0.E();
        r48 = r48;
        r119 = r517;
        r61 = 8;
        r314 = true;
        goto L555
    L479:
        if (r124 != 1937126244) goto L490;
        int r189 = r122 + 8;
    L482:
        if ((r189 - r122) >= r54) goto L487;
        r0.N(r189);
        int r190 = r0.m();
        if (r0.m() == 1886547818) goto L485;
        r189 = r189 + r190;
        goto L482
    L485:
        byte[] r191 = Arrays.copyOfRange(r0.a, r189, r190 + r189);
    L488:
        r60 = r60;
        r312 = r191;
        goto L474
    L487:
        r191 = null;
        goto L488
    L490:
        if (r124 != 1936995172) goto L507;
        int r192 = r0.A();
        r0.O(3);
        if (r192 != 0) goto L505;
        int r193 = r0.A();
        if (r193 != 0) goto L496;
        r60 = 0;
        goto L505
    L496:
        if (r193 != 1) goto L498;
        r60 = 1;
        goto L505
    L498:
        if (r193 == 2) goto L502;
        if (r193 != 3) goto L505;
        r60 = 3;
        goto L505
    L502:
        r60 = 2;
    L505:
        r60 = r60;
        goto L474
    L507:
        if (r124 != 1634760259) goto L530;
        int r194 = r54 - 12;
        byte[] r195 = new byte[r194];
        r0.N(r122 + 12);
        r0.k(r195, 0, r194);
        byte[] r196 = i40.a;
        if (r194 < 17) goto L511;
        boolean r197 = true;
    L512:
        rr2.j(r194, "Invalid APV CSD length: %s", r197);
        byte r198 = r195[0];
        if (r198 != 1) goto L515;
        boolean r199 = true;
    L516:
        rr2.j(r198, "Invalid APV CSD version: %s", r199);
        byte r200 = r195[5];
        byte r1100 = r195[6];
        byte r1101 = r195[7];
        String r1102 = f35.a;
        Locale r1103 = Locale.US;
        StringBuilder r201 = b11.t("apv1.apvf", ".apvl", r200, r1100, ".apvb");
        r201.append(r1101);
        r311 = r201.toString();
        r117 = yw1.o(r195);
        be3 r202 = new be3(r195);
        h00 r1104 = new h00(r194, r195);
        r61 = 8;
        r1104.q(r202.b * 8);
        r1104.u(1);
        int r203 = r1104.i(8);
        int r1105 = 0;
        int r1106 = -1;
        int r1107 = -1;
        int r1108 = -1;
        int r1109 = -1;
        int r1110 = -1;
    L517:
        if (r1105 >= r203) goto L529;
        r1104.u(1);
        int r204 = r1104.i(8);
        int r216 = r1110;
        int r1111 = r1109;
        int r1112 = r1108;
        int r1113 = r1107;
        int r1114 = r1106;
        int r1115 = 0;
    L519:
        if (r1115 >= r204) goto L528;
        r1104.t(r104);
        boolean r1116 = r1104.h();
        r1104.s();
        r1104.u(11);
        r1104.t(4);
        r1113 = r1104.i(4) + 8;
        r1104.u(1);
        if (r1116 == false) goto L527;
        int r1117 = r1104.i(8);
        int r1118 = r1104.i(8);
        r1104.u(1);
        boolean r1119 = r1104.h();
        int r1120 = c50.f(r1117);
        if (r1119 == false) goto L525;
        int r1121 = 1;
    L526:
        r216 = c50.g(r1118);
        r1112 = r1121;
        r1111 = r1120;
        goto L527
    L525:
        r1121 = 2;
    L527:
        r1115 = r1115 + 1;
        r1114 = r1113;
        r104 = 6;
        goto L519
    L528:
        r1105 = r1105 + 1;
        r1106 = r1114;
        r1107 = r1113;
        r1108 = r1112;
        r1109 = r1111;
        r1110 = r216;
        r104 = 6;
        goto L517
    L529:
        r51 = "video/apv";
        r511 = r1107;
        r119 = r1108;
        r120 = r1109;
        r121 = r1110;
        r60 = r60;
        r48 = r1106;
        goto L555
    L515:
        r199 = false;
        goto L516
    L511:
        r197 = false;
        goto L512
    L530:
        r61 = 8;
        if (r124 != 1668246642) goto L553;
        if (r120 != (-1)) goto L553;
        if (r121 != (-1)) goto L553;
        int r1122 = r0.m();
        if (r1122 != 1852009592) goto L538;
    L541:
        int r205 = r0.H();
        int r1123 = r0.H();
        int r1124 = 2;
        r0.O(2);
        if (r54 == 19) goto L544;
    L546:
        boolean r1125 = false;
    L547:
        int r206 = c50.f(r205);
        if (r1125 == false) goto L550;
        r1124 = 1;
    L550:
        r121 = c50.g(r1123);
        r120 = r206;
        r119 = r1124;
        goto L470
    L544:
        if ((r0.A() & 128) == 0) goto L546;
        r1125 = true;
        goto L547
    L538:
        if (r1122 == 1852009571) goto L541;
        l93.q0("BoxParsers", "Unsupported color type: ".concat(uv.c(r1122)));
        goto L553
    L185:
        r123 = false;
        goto L186
    L181:
        if ((r0.b - r2) != r3) goto L183;
    L182:
        int r527 = r48;
        int r528 = r50;
        r49 = r3;
        int r207 = r52;
        String r529 = r51;
        tu r615 = r8;
        int r530 = r119;
        byte[] r208 = r19;
        r15 = false;
        r16 = '\f';
        if (r410 == null) goto L559;
        r311 = (String) r410.o;
        String r209 = "video/dolby-vision";
    L558:
        String r217 = r311;
        if (r209 != null) goto L562;
        r5 = r68;
        r8 = r615;
        goto L573
    L562:
        sb1 r218 = new sb1();
        r218.a = Integer.toString(r30);
        r218.m = lw2.m(r209);
        r218.j = r217;
        r218.t = r115;
        r218.u = r45;
        r218.v = r414;
        r218.w = r413;
        r218.z = r313;
        r218.y = r114;
        r218.A = r312;
        r218.B = r207;
        r218.p = r117;
        r218.o = r316;
        r218.D = r315;
        r218.q = r310;
        r5 = r68;
        r218.d = r5;
        if (r214 == null) goto L565;
        byte[] r417 = r214.array();
    L566:
        r218.C = new c50(r120, r530, r121, r417, r528, r527);
        pu r219 = r411;
        if (r219 == null) goto L569;
        r218.h = jz4.I(r219.a);
        r218.i = jz4.I(r219.b);
    L572:
        r8 = r615;
        r8.d = new tb1(r218);
        goto L573
    L569:
        ru r220 = r412;
        if (r220 == null) goto L572;
        r218.h = jz4.I(r220.n);
        r218.i = jz4.I(r220.o);
        goto L572
    L565:
        r417 = r208;
        goto L566
    L559:
        r209 = r529;
        goto L558
    L172:
        if (r7 != 1211250227) goto L174;
        r213 = "video/3gpp";
        goto L175
    L174:
        r213 = null;
        goto L175
    L163:
        r212 = r69.a(((qv4) r46.second).b);
        goto L164
    L165:
        r2 = r2;
        r212 = r69;
        goto L166
    L167:
        r2 = r2;
        r47 = r69;
        goto L169
    L7:
        r4 = r14;
        goto L8
    L574:
        return r8;
    }

    public static ArrayList j(oy2 r54, zg1 r55, long r56, ow0 r58, boolean r59, boolean r60, eg1 r61, boolean r62) {
        oy2 r0 = r54;
        ArrayList r2 = r0.r;
        ArrayList r3 = new ArrayList();
        int r5 = 0;
    L4:
        if (r5 >= r2.size()) goto L487;
        oy2 r6 = (oy2) r2.get(r5);
        if (r6.o == 1953653099) goto L8;
        ArrayList r45 = r2;
        r3 = r3;
        int r37 = r5;
    L483:
        r5 = r37 + 1;
        r0 = r54;
        r3 = r3;
        r2 = r45;
        goto L4
    L8:
        py2 r7 = r0.s(1836476516);
        r7.getClass();
        oy2 r9 = r6.r(1835297121);
        r9.getClass();
        py2 r10 = r9.s(1751411826);
        r10.getClass();
        be3 r11 = r10.p;
        r11.N(16);
        int r12 = r11.m();
        if (r12 != 1936684398) goto L12;
        int r13 = 1;
    L30:
        int r35 = 1;
        r37 = r5;
        if (r13 != (-1)) goto L33;
        r45 = r2;
        pv4 r1 = null;
        long r39 = 0;
    L161:
        pv4 r4 = (pv4) r61.mo77apply(r1);
        if (r4 != null) goto L164;
        r3 = r3;
        goto L483
    L164:
        tb1 r8 = r4.g;
        oy2 r14 = r6.r(1835297121);
        r14.getClass();
        oy2 r15 = r14.r(1835626086);
        r15.getClass();
        oy2 r16 = r15.r(1937007212);
        r16.getClass();
        py2 r17 = r16.s(1937011578);
        if (r17 == null) goto L174;
        j83 r18 = new j83();
        be3 r19 = r17.p;
        r18.p = r19;
        r19.N(12);
        int r110 = r19.E();
        if ("audio/raw".equals(r8.n) == false) goto L171;
        int r111 = f35.t(r8.H) * r8.F;
        if ((r110 % r111) == 0) goto L171;
        l93.q0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + r111 + ", stsz sample size: " + r110);
        r110 = r111;
    L171:
        if (r110 != 0) goto L173;
        r110 = -1;
    L173:
        r18.n = r110;
        r18.o = r19.E();
        su r20 = r18;
    L177:
        int r21 = r20.k();
        if (r21 != 0) goto L182;
        xv4 r22 = new xv4(r4, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0, 0);
    L482:
        r3.add(r22);
        goto L483
    L182:
        if (r4.b != 2) goto L186;
        long r112 = r4.f;
        if (r112 <= r39) goto L186;
        sb1 r23 = r8.a();
        r23.x = r21 / (r112 / 1000000.0f);
        r4 = r4.a(new tb1(r23));
    L186:
        tb1 r24 = r4.g;
        py2 r113 = r16.s(1937007471);
        if (r113 != null) goto L189;
        r113 = r16.s(1668232756);
        r113.getClass();
        boolean r114 = true;
    L190:
        be3 r115 = r113.p;
        py2 r116 = r16.s(1937011555);
        r116.getClass();
        be3 r117 = r116.p;
        py2 r118 = r16.s(1937011827);
        r118.getClass();
        be3 r119 = r118.p;
        py2 r120 = r16.s(1937011571);
        if (r120 == null) goto L193;
        be3 r121 = r120.p;
    L194:
        py2 r25 = r16.s(1668576371);
        if (r25 == null) goto L197;
        be3 r26 = r25.p;
    L198:
        qu r27 = new qu(r117, r115, r114);
        r119.N(12);
        int r122 = r119.E() - 1;
        int r123 = r119.E();
        int r28 = r119.E();
        if (r26 == null) goto L201;
        r26.N(12);
        int r124 = r26.E();
    L202:
        if (r121 == null) goto L208;
        r121.N(12);
        int r125 = r121.E();
        if (r125 <= 0) goto L206;
        int r126 = r121.E() - 1;
        r26 = r26;
    L209:
        int r29 = r20.f();
        su r210 = r20;
        String r30 = r24.n;
        if (r29 != (-1)) goto L212;
    L221:
        boolean r31 = false;
    L222:
        ArrayList r32 = new ArrayList();
        if (r121 != null) goto L225;
        boolean r33 = true;
    L226:
        if (r31 == false) goto L253;
        int r34 = r27.a;
        long[] r36 = new long[r34];
        int[] r38 = new int[r34];
    L229:
        if (r27.a() == false) goto L231;
        int r127 = r27.b;
        r36[r127] = r27.d;
        r38[r127] = r27.c;
        goto L229
    L231:
        long r128 = r28;
        int r40 = 8192 / r29;
        int r41 = 0;
        int r129 = 0;
    L232:
        if (r41 >= r34) goto L234;
        r129 = r129 + f35.g(r38[r41], r40);
        r41 = r41 + 1;
        goto L232
    L234:
        long[] r42 = new long[r129];
        int[] r130 = new int[r129];
        long[] r131 = new long[r129];
        int[] r132 = new int[r129];
        int r43 = 0;
        int r44 = 0;
        int r46 = 0;
        int r133 = 0;
        int r211 = 0;
    L235:
        if (r43 >= r34) goto L240;
        int r212 = r38[r43];
        long r213 = r36[r43];
        int r53 = r211;
        int r214 = r34;
        int r47 = r133;
        int r134 = r53;
        int r215 = r43;
        int r48 = r212;
    L237:
        if (r48 <= 0) goto L239;
        int r216 = Math.min(r40, r48);
        r42[r134] = r213;
        int r217 = r40;
        int r49 = r29 * r216;
        r130[r134] = r49;
        r46 = r46 + r49;
        int r50 = Math.max(r47, r49);
        r131[r134] = ((long) r44) * r128;
        r132[r134] = 1;
        r213 = r213 + ((long) r130[r134]);
        r44 = r44 + r216;
        r48 = r48 - r216;
        r134 = r134 + 1;
        r40 = r217;
        r47 = r50;
        goto L237
    L239:
        int r218 = r40;
        r43 = r215 + 1;
        int r51 = r134;
        r133 = r47;
        r34 = r214;
        r211 = r51;
        r40 = r218;
        goto L235
    L240:
        long r135 = r128 * ((long) r44);
        long r52 = r46;
        if (r62 == false) goto L243;
        long[] r57 = new long[0];
    L244:
        if (r62 == false) goto L246;
        r130 = new int[0];
    L246:
        if (r62 == false) goto L248;
        r131 = new long[0];
    L248:
        if (r62 == false) goto L250;
        r132 = new int[0];
    L250:
        ArrayList r310 = r32;
        long r63 = r135;
        int r311 = r129;
        int r219 = r133;
    L251:
        long[] r220 = r57;
        int[] r221 = r130;
        int[] r222 = r132;
        long r64 = r4.f;
        if (r64 <= r39) goto L336;
        long r65 = f35.a0(r52 * 8, 1000000, r64, RoundingMode.HALF_DOWN);
        if (r65 <= r39) goto L336;
        if (r65 >= 2147483647L) goto L336;
        sb1 r66 = r24.a();
        r66.h = (int) r65;
        r4 = r4.a(new tb1(r66));
    L336:
        int r67 = r4.b;
        long r136 = r4.c;
        tb1 r68 = r4.g;
        long[] r69 = r4.j;
        long[] r70 = r4.i;
        RoundingMode r510 = RoundingMode.DOWN;
        long r312 = f35.a0(r63, 1000000, r136, r510);
        int[] r223 = jz4.N(r310);
        if (r70 != null) goto L342;
        if (r62 == true) goto L340;
        f35.Z(r131, r136);
    L340:
        xv4 r224 = new xv4(r4, r220, r221, r219, r131, r222, r223, r33, r312, r311);
    L341:
        r22 = r224;
        goto L482
    L342:
        long[] r225 = r131;
        if (r62 == false) goto L360;
        r69.getClass();
        if (r70.length == 1) goto L347;
    L350:
        int r71 = 0;
    L352:
        if (r71 >= r70.length) goto L357;
        if (r69[r71] == (-1)) goto L356;
        r39 = r39 + r70[r71];
    L356:
        r71 = r71 + 1;
        goto L352
    L357:
        long r72 = f35.a0(r39, 1000000, r4.d, RoundingMode.DOWN);
    L358:
        r224 = new xv4(r4, r220, r221, r219, r225, r222, r223, r33, r72, r311);
        goto L341
    L347:
        if (r70[0] != r39) goto L350;
        r72 = f35.a0(r63 - r69[0], 1000000, r4.c, r510);
        goto L358
    L360:
        if (r70.length != 1) goto L383;
        if (r67 != 1) goto L383;
        if (r225.length < 2) goto L383;
        r69.getClass();
        long r137 = r69[0];
        long r138 = -1;
        long r226 = r63;
        long r73 = f35.a0(r70[0], r4.c, r4.d, r510) + r137;
        int r74 = r225.length - 1;
        int r139 = f35.j(4, 0, r74);
        int r75 = f35.j(r225.length - 4, 0, r74);
        if (r225[0] > r137) goto L385;
        if (r137 >= r225[r139]) goto L385;
        if (r225[r75] >= r73) goto L385;
        if (r73 > (r226 + 2)) goto L385;
        long r76 = Math.max(r39, r226 - r73);
        long r77 = f35.a0(r137 - r225[0], r68.G, r4.c, r510);
        long r78 = f35.a0(r76, r68.G, r4.c, r510);
        if (r77 != r39) goto L379;
        if (r78 == r39) goto L385;
    L379:
        if (r77 > 2147483647L) goto L385;
        if (r78 > 2147483647L) goto L385;
        r55.a = (int) r77;
        r55.b = (int) r78;
        f35.Z(r225, r136);
        r224 = new xv4(r4, r220, r221, r219, r225, r222, r223, r33, f35.a0(r70[0], 1000000, r4.d, r510), r311);
    L385:
        if (r70.length == 1) goto L387;
    L393:
        int r140 = r311;
        if (r67 != 1) goto L396;
        boolean r79 = true;
    L397:
        int[] r80 = new int[r70.length];
        int[] r81 = new int[r70.length];
        r69.getClass();
        int r82 = 0;
        int r83 = 0;
        boolean r141 = false;
        int r142 = 0;
    L399:
        if (r83 >= r70.length) goto L436;
        int[] r227 = r81;
        long r84 = r69[r83];
        if (r84 == r138) goto L434;
        int r228 = r83;
        boolean r229 = r141;
        long r85 = f35.a0(r70[r83], r4.c, r4.d, RoundingMode.DOWN) + r84;
        r80[r228] = f35.f(r225, r84, true);
        int r86 = f35.b(r225, r85, r79);
        int r87 = r86 - 1;
        int r88 = r86;
        int r89 = 0;
    L404:
        if (r88 >= r225.length) goto L412;
        if (r225[r88] >= r85) goto L408;
        r87 = r88;
    L411:
        r88 = r88 + 1;
        goto L404
    L408:
        r89 = r89 + 1;
        if (r89 <= r68.p) goto L411;
    L412:
        r227[r228] = r87 + 1;
        int r90 = r80[r228];
    L413:
        int r91 = r80[r228];
        if (r91 <= 0) goto L420;
        if ((r222[r91] & 1) != 0) goto L420;
        r80[r228] = r91 - 1;
    L420:
        if (r91 == 0) goto L422;
    L429:
        int r92 = r227[r228];
        int r93 = r80[r228];
        int r94 = (r92 - r93) + r142;
        if (r82 == r93) goto L432;
        boolean r95 = true;
    L433:
        r141 = r229 | r95;
        r142 = r94;
        r82 = r92;
    L435:
        r83 = r228 + 1;
        r81 = r227;
        r79 = r79;
        goto L399
    L432:
        r95 = false;
        goto L433
    L422:
        if ((r222[0] & 1) != 0) goto L429;
        r80[r228] = r90;
    L424:
        int r96 = r80[r228];
        if (r96 >= r227[r228]) goto L429;
        if ((r222[r96] & 1) != 0) goto L429;
        r80[r228] = r96 + 1;
        goto L424
    L434:
        r228 = r83;
        goto L435
    L436:
        int[] r230 = r81;
        boolean r231 = r141;
        if (r142 == r140) goto L439;
        boolean r97 = true;
    L440:
        boolean r98 = r231 | r97;
        if (r98 == false) goto L443;
        long[] r99 = new long[r142];
    L444:
        if (r98 == false) goto L446;
        int[] r100 = new int[r142];
    L447:
        if (r98 == false) goto L449;
        r219 = 0;
    L449:
        if (r98 == false) goto L451;
        int[] r101 = new int[r142];
    L452:
        if (r98 == false) goto L454;
        ArrayList r102 = new ArrayList();
    L455:
        long[] r103 = new long[r142];
        int r143 = 0;
        boolean r144 = false;
        int r145 = 0;
        int r146 = r219;
        long r232 = 0;
    L457:
        if (r143 >= r70.length) goto L478;
        long r313 = r69[r143];
        int r104 = r80[r143];
        tb1 r233 = r68;
        int r105 = r230[r143];
        long[] r314 = r70;
        if (r98 == false) goto L461;
        int r106 = r105 - r104;
        System.arraycopy(r220, r104, r99, r145, r106);
        System.arraycopy(r221, r104, r100, r145, r106);
        System.arraycopy(r222, r104, r101, r145, r106);
    L461:
        int r107 = r146;
    L462:
        if (r104 >= r105) goto L477;
        int r147 = r104;
        int r315 = r105;
        long r108 = r4.d;
        RoundingMode r234 = RoundingMode.DOWN;
        long r109 = f35.a0(r232, 1000000, r108, r234);
        long r148 = f35.a0(r225[r147] - r313, 1000000, r4.c, r234);
        if (r148 >= 0) goto L466;
        r144 = true;
    L466:
        r103[r145] = r109 + r148;
        if (r98 == true) goto L469;
    L471:
        if (r98 == false) goto L476;
        if (r33 == true) goto L476;
        if ((r101[r145] & 1) == 0) goto L476;
        r102.add(Integer.valueOf(r145));
    L476:
        r145 = r145 + 1;
        r104 = r147 + 1;
        r105 = r315;
        goto L462
    L469:
        if (r100[r145] <= r107) goto L471;
        r107 = r221[r147];
        goto L471
    L477:
        r232 = r232 + r314[r143];
        r143 = r143 + 1;
        r146 = r107;
        r68 = r233;
        r70 = r314;
        goto L457
    L478:
        tb1 r235 = r68;
        long r316 = f35.a0(r232, 1000000, r4.d, RoundingMode.DOWN);
        if (r144 == false) goto L481;
        sb1 r149 = r235.a();
        r149.s = true;
        r4 = r4.a(new tb1(r149));
    L481:
        r22 = new xv4(r4, r99, r100, r146, r103, r101, jz4.N(r102), r33, r316, r99.length);
        r3 = r3;
        goto L482
    L454:
        r102 = r310;
        goto L455
    L451:
        r101 = r222;
        goto L452
    L446:
        r100 = r221;
        goto L447
    L443:
        r99 = r220;
        goto L444
    L439:
        r97 = false;
        goto L440
    L396:
        r79 = false;
        goto L397
    L387:
        if (r70[0] != 0) goto L393;
        r69.getClass();
        long r150 = r69[0];
        int r151 = 0;
    L390:
        if (r151 >= r225.length) goto L392;
        r225[r151] = f35.a0(r225[r151] - r150, 1000000, r4.c, RoundingMode.DOWN);
        r151 = r151 + 1;
        goto L390
    L392:
        r224 = new xv4(r4, r220, r221, r219, r225, r222, r223, r33, f35.a0(r226 - r150, 1000000, r4.c, RoundingMode.DOWN), r311);
    L383:
        r226 = r63;
        r138 = -1;
        goto L385
    L243:
        r57 = r42;
        goto L244
    L253:
        if (r62 == false) goto L255;
        long[] r152 = new long[0];
    L256:
        if (r62 == false) goto L258;
        int[] r153 = new int[0];
    L260:
        if (r62 == false) goto L262;
        long[] r154 = new long[0];
    L263:
        int r236 = r125;
        if (r62 == false) goto L266;
        int[] r155 = new int[0];
    L267:
        int r237 = r122;
        int r238 = r124;
        int r156 = r28;
        int r157 = r236;
        long r239 = r39;
        long r240 = r239;
        long r317 = r240;
        int r158 = 0;
        int r159 = 0;
        int r241 = 0;
        int r242 = 0;
        int r160 = r123;
        int r161 = r126;
        be3 r162 = r121;
        int r163 = 0;
    L268:
        if (r163 >= r21) goto L308;
        boolean r318 = true;
    L270:
        if (r241 != 0) goto L274;
        r318 = r27.a();
        if (r318 == false) goto L274;
        r317 = r27.d;
        r241 = r27.c;
        r32 = r32;
        r21 = r21;
    L274:
        int r319 = r21;
        r310 = r32;
        if (r318 == false) goto L276;
        if (r26 == null) goto L285;
    L281:
        if (r242 != 0) goto L284;
        if (r238 <= 0) goto L284;
        r242 = r26.E();
        r159 = r26.m();
        r238 = r238 - 1;
    L284:
        r242 = r242 - 1;
    L285:
        int r164 = r210.l();
        long[] r165 = r152;
        int[] r320 = r153;
        long r166 = r164;
        r240 = r240 + r166;
        if (r164 <= r158) goto L288;
        r158 = r164;
    L288:
        if (r62 == true) goto L297;
        r165[r163] = r317;
        r320[r163] = r164;
        int r410 = r158;
        long[] r167 = r154;
        r167[r163] = r239 + ((long) r159);
        if (r162 != null) goto L292;
        int r168 = 1;
    L293:
        r155[r163] = r168;
        if (r163 != r161) goto L296;
        r155[r163] = 1;
        ArrayList r169 = r310;
        r169.add(Integer.valueOf(r163));
    L298:
        if (r162 == null) goto L303;
        if (r163 != r161) goto L303;
        r157 = r157 - 1;
        if (r157 <= 0) goto L303;
        r161 = r162.E() - 1;
    L303:
        ArrayList r321 = r169;
        r239 = r239 + ((long) r156);
        r160 = r160 - 1;
        if (r160 != 0) goto L307;
        if (r237 <= 0) goto L307;
        int r170 = r119.E();
        int r171 = r119.m();
        r237 = r237 - 1;
        r160 = r170;
        r156 = r171;
    L307:
        r317 = r317 + r166;
        r241 = r241 - 1;
        r163 = r163 + 1;
        r154 = r167;
        r152 = r165;
        r153 = r320;
        r32 = r321;
        r21 = r319;
        r158 = r410;
    L296:
        r169 = r310;
        goto L298
    L292:
        r168 = 0;
        goto L293
    L297:
        r410 = r158;
        r167 = r154;
        goto L296
    L276:
        l93.q0("BoxParsers", "Unexpected end of chunk data");
        if (r62 == true) goto L279;
        long[] r172 = Arrays.copyOf(r152, r163);
        int[] r173 = Arrays.copyOf(r153, r163);
        r154 = Arrays.copyOf(r154, r163);
        int r174 = r163;
        r132 = Arrays.copyOf(r155, r163);
        int r175 = r174;
        r57 = r172;
        r130 = r173;
        int r176 = r241;
    L309:
        long r177 = r239 + ((long) r159);
        if (r26 == null) goto L316;
    L311:
        if (r238 <= 0) goto L316;
        if (r26.E() != 0) goto L314;
        r26.m();
        r238 = r238 - 1;
        goto L311
    L314:
        boolean r178 = false;
    L317:
        if (r157 != 0) goto L323;
        if (r160 != 0) goto L323;
        if (r176 != 0) goto L323;
        if (r237 != 0) goto L323;
        if (r242 != 0) goto L323;
        if (r178 == false) goto L323;
    L328:
        r219 = r158;
        r131 = r154;
        r311 = r175;
        r63 = r177;
        r52 = r240;
    L323:
        StringBuilder r179 = new StringBuilder("Inconsistent stbl box for track ");
        r179.append(r4.a);
        r179.append(": remainingSynchronizationSamples ");
        r179.append(r157);
        r179.append(", remainingSamplesAtTimestampDelta ");
        r179.append(r160);
        r179.append(", remainingSamplesInChunk ");
        r179.append(r176);
        r179.append(", remainingTimestampDeltaChanges ");
        r179.append(r237);
        r179.append(", remainingSamplesAtTimestampOffset ");
        r179.append(r242);
        if (r178 == true) goto L326;
        String r180 = ", ctts invalid";
    L327:
        r179.append(r180);
        l93.q0("BoxParsers", r179.toString());
        goto L328
    L326:
        r180 = "";
    L316:
        r178 = true;
        goto L317
    L279:
        r57 = r152;
        r130 = r153;
        r175 = r163;
        r176 = r241;
        r132 = r155;
        goto L309
    L308:
        r310 = r32;
        r57 = r152;
        r132 = r155;
        r176 = r241;
        r130 = r153;
        r175 = r21;
        goto L309
    L266:
        r155 = new int[r21];
        goto L267
    L262:
        r154 = new long[r21];
        goto L263
    L258:
        r153 = new int[r21];
        goto L260
    L255:
        r152 = new long[r21];
        goto L256
    L225:
        r33 = false;
        goto L226
    L212:
        if ("audio/raw".equals(r30) == false) goto L214;
    L217:
        if (r122 != 0) goto L221;
        if (r124 != 0) goto L221;
        if (r125 != 0) goto L221;
        r31 = true;
        goto L222
    L214:
        if ("audio/g711-mlaw".equals(r30) == true) goto L217;
        if ("audio/g711-alaw".equals(r30) == false) goto L221;
    L206:
        r121 = null;
    L207:
        r126 = -1;
        goto L209
    L208:
        r125 = 0;
        goto L207
    L201:
        r124 = 0;
        goto L202
    L197:
        r26 = null;
        goto L198
    L193:
        r121 = null;
        goto L194
    L189:
        r114 = false;
        goto L190
    L174:
        py2 r181 = r16.s(1937013298);
        if (r181 == null) goto L485;
        uu r182 = new uu();
        be3 r183 = r181.p;
        r182.r = r183;
        r183.N(12);
        r182.o = r183.E() & 255;
        r182.n = r183.E();
        r20 = r182;
        goto L177
    L485:
        throw ParserException.a(null, "Track has no sample table size information");
    L33:
        r39 = 0;
        py2 r184 = r6.s(1953196132);
        r184.getClass();
        be3 r185 = r184.p;
        int r186 = 8;
        r185.N(8);
        int r187 = e(r185.m());
        if (r187 == 0) goto L37;
        r186 = 16;
    L37:
        r185.O(r186);
        int r188 = r185.m();
        r185.O(4);
        int r189 = r185.b;
        if (r187 != 0) goto L40;
        int r190 = 4;
    L41:
        int r191 = 0;
    L42:
        long r243 = -9223372036854775807L;
        if (r191 >= r190) goto L53;
        if (r185.a[r189 + r191] != (-1)) goto L46;
        r191 = r191 + 1;
        goto L42
    L46:
        if (r187 != 0) goto L48;
        long r244 = r185.C();
    L50:
        if (r244 != 0) goto L54;
    L51:
        r244 = -9223372036854775807L;
    L54:
        r185.O(10);
        int r192 = r185.H();
        r185.O(4);
        int r193 = r185.m();
        int r194 = r185.m();
        r185.O(4);
        int r195 = r185.m();
        int r196 = r185.m();
        if (r193 != 0) goto L63;
        if (r194 != 65536) goto L63;
        r45 = r2;
        if (r195 == (-65536)) goto L60;
        if (r195 == 65536) goto L60;
    L65:
        if (r193 != 0) goto L71;
        if (r194 != (-65536)) goto L71;
        if (r195 == 65536) goto L69;
        if (r195 != (-65536)) goto L71;
    L69:
        if (r196 != 0) goto L71;
        int r197 = 270;
    L78:
        r185.O(16);
        short r198 = r185.x();
        r185.O(2);
        short r199 = r185.x();
        vu r1100 = new vu();
        r1100.a = r188;
        r1100.b = r192;
        r1100.c = r197;
        r1100.d = r198;
        r1100.e = r199;
        if (r56 != (-9223372036854775807L)) goto L81;
        long r245 = r244;
    L82:
        long r200 = g(r7.p).c;
        if (r245 != (-9223372036854775807L)) goto L86;
        long r246 = r200;
        long r247 = -9223372036854775807L;
    L87:
        oy2 r201 = r9.r(1835626086);
        r201.getClass();
        oy2 r202 = r201.r(1937007212);
        r202.getClass();
        py2 r203 = r9.s(1835296868);
        r203.getClass();
        be3 r204 = r203.p;
        r204.N(8);
        int r205 = e(r204.m());
        if (r205 != 0) goto L90;
        int r1101 = 8;
    L91:
        r204.O(r1101);
        long r511 = r204.C();
        int r206 = r204.b;
        if (r205 != 0) goto L94;
        int r1102 = 4;
    L95:
        int r207 = 0;
    L96:
        if (r207 >= r1102) goto L108;
        if (r204.a[r206 + r207] != (-1)) goto L99;
        r207 = r207 + 1;
        goto L96
    L99:
        if (r205 != 0) goto L102;
        long r208 = r204.C();
    L101:
        long r411 = r208;
        if (r411 != 0) goto L106;
    L105:
        long r248 = r243;
        int r209 = r204.H();
        char[] r249 = {(char) (((r209 >> 10) & 31) + 96), (char) (((r209 >> 5) & 31) + 96), (char) ((r209 & 31) + 96)};
        int r250 = 0;
    L110:
        if (r250 >= 3) goto L118;
        char r251 = r249[r250];
        if (r251 < 'a') goto L117;
        if (r251 > 'z') goto L117;
        r250 = r250 + 1;
    L117:
        String r252 = null;
    L119:
        py2 r253 = r202.s(1937011556);
        if (r253 != null) goto L123;
        l93.q0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
    L122:
        r1 = null;
        goto L161
    L123:
        tu r254 = i(r253.p, r1100, r252, r58, r60);
        if (r59 == true) goto L148;
        oy2 r255 = r6.r(1701082227);
        if (r255 == null) goto L148;
        py2 r256 = r255.s(1701606260);
        if (r256 != null) goto L130;
        Pair r257 = null;
    L146:
        if (r257 == null) goto L148;
        long[] r258 = (long[]) r257.first;
        long[] r322 = (long[]) r257.second;
        long[] r323 = r258;
    L149:
        tb1 r259 = (tb1) r254.d;
        if (r259 == null) goto L122;
        int r260 = r1100.b;
        if (r260 == 0) goto L159;
        ny2 r261 = new ny2(r260);
        sb1 r262 = r259.a();
        qv2 r263 = ((tb1) r254.d).l;
        if (r263 == null) goto L157;
        qv2 r264 = r263.a(new pv2[]{r261});
    L158:
        r262.k = r264;
        tb1 r265 = new tb1(r262);
    L160:
        r1 = new pv4(r1100.a, r13, r511, r246, r247, r248, r265, r254.b, (qv4[]) r254.c, r254.a, r323, r322);
        goto L161
    L157:
        r264 = new qv2(new pv2[]{r261});
        goto L158
    L159:
        r265 = r259;
        goto L160
    L130:
        be3 r266 = r256.p;
        r266.N(8);
        int r267 = e(r266.m());
        int r268 = r266.E();
        long[] r269 = new long[r268];
        long[] r1103 = new long[r268];
        int r1104 = 0;
    L131:
        if (r1104 >= r268) goto L145;
        int r1105 = r35;
        if (r267 != r1105) goto L135;
        long r1106 = r266.G();
    L136:
        r269[r1104] = r1106;
        if (r267 != r1105) goto L139;
        long r1107 = r266.u();
    L140:
        r1103[r1104] = r1107;
        if (r266.x() != 1) goto L143;
        r266.O(2);
        r1104 = r1104 + 1;
        r35 = 1;
        goto L131
    L143:
        kf2.n("Unsupported media rate.");
        return null;
    L139:
        r1107 = r266.m();
        goto L140
    L135:
        r1106 = r266.C();
        goto L136
    L145:
        r257 = Pair.create(r269, r1103);
    L148:
        r323 = null;
        r322 = null;
        goto L149
    L118:
        r252 = new String(r249);
        goto L119
    L106:
        String r270 = f35.a;
        r243 = f35.a0(r411, 1000000, r511, RoundingMode.DOWN);
        goto L105
    L102:
        r208 = r204.G();
        goto L101
    L108:
        r204.O(r1102);
        goto L105
    L94:
        r1102 = 8;
        goto L95
    L90:
        r1101 = 16;
        goto L91
    L86:
        String r271 = f35.a;
        r246 = r200;
        r247 = f35.a0(r245, 1000000, r246, RoundingMode.DOWN);
        goto L87
    L81:
        r245 = r56;
    L71:
        if (r193 == (-65536)) goto L73;
        if (r193 == 65536) goto L73;
    L77:
        r197 = 0;
    L73:
        if (r194 != 0) goto L77;
        if (r195 != 0) goto L77;
        if (r196 != (-65536)) goto L77;
        r197 = 180;
    L60:
        if (r196 != 0) goto L65;
        r197 = 90;
    L63:
        r45 = r2;
        goto L65
    L48:
        r244 = r185.G();
        goto L50
    L53:
        r185.O(r190);
        goto L51
    L40:
        r190 = 8;
        goto L41
    L12:
        if (r12 != 1986618469) goto L15;
        r13 = 2;
        goto L30
    L15:
        if (r12 != 1952807028) goto L17;
    L29:
        r13 = 3;
        goto L30
    L17:
        if (r12 == 1935832172) goto L29;
        if (r12 == 1937072756) goto L29;
        if (r12 == 1668047728) goto L29;
        if (r12 == 1937072752) goto L29;
        if (r12 != 1835365473) goto L28;
        r13 = 5;
        goto L30
    L28:
        r13 = -1;
        goto L30
    L487:
        return r3;
    }

    public static qv2 k(py2 r18) {
        be3 r1 = r18.p;
        int r0 = 8;
        r1.N(8);
        boolean r3 = false;
        qv2 r2 = new qv2(new pv2[0]);
    L4:
        if (r1.a() < r0) goto L222;
        int r4 = r1.b;
        int r5 = r1.m();
        int r6 = r1.m();
        String r12 = null;
        if (r6 != 1835365473) goto L164;
        r1.N(r4);
        int r7 = r4 + r5;
        r1.O(r0);
        a(r1);
    L8:
        int r8 = r1.b;
        if (r8 >= r7) goto L158;
        int r13 = r1.m();
        if (r1.m() == 1768715124) goto L12;
        r1.N(r8 + r13);
        r0 = 8;
        r3 = false;
        r12 = null;
        goto L8
    L12:
        r1.N(r8);
        int r9 = r8 + r13;
        r1.O(r0);
        ArrayList r10 = new ArrayList();
    L13:
        int r14 = r1.b;
        if (r14 >= r9) goto L157;
        int r15 = r1.m() + r14;
        int r16 = r1.m();
        int r11 = (r16 >> 24) & 255;
        if (r11 == 169) goto L102;
        if (r11 == 253) goto L102;
        if (r16 != 1735291493) goto L29;
        String r17 = pv1.a(gh0.w(r1) - 1);     // Catch: Throwable -> L31
        if (r17 == null) goto L25;
        Object r19 = new ds4("TCON", r12, yw1.o(r17));     // Catch: Throwable -> L31
    L27:
        r1.N(r15);
    L151:
        if (r19 == null) goto L153;
        r10.add(r19);
    L153:
        r3 = false;
        r12 = null;
        goto L13
    L25:
        l93.q0("MetadataUtil", "Failed to parse standard genre code");     // Catch: Throwable -> L31
        r19 = r12;
    L31:
        th = move-exception;
        r1.N(r15);
        throw th;
    L29:
        if (r16 != 1684632427) goto L34;
        r19 = gh0.v(r16, r1, "TPOS");     // Catch: Throwable -> L31
        goto L27
    L34:
        if (r16 != 1953655662) goto L37;
        r19 = gh0.v(r16, r1, "TRCK");     // Catch: Throwable -> L31
        goto L27
    L37:
        if (r16 != 1953329263) goto L40;
        r19 = gh0.x(r16, "TBPM", r1, true, r3);     // Catch: Throwable -> L31
        goto L27
    L40:
        if (r16 != 1668311404) goto L43;
        r19 = gh0.x(r16, "TCMP", r1, true, true);     // Catch: Throwable -> L31
        goto L27
    L43:
        if (r16 != 1668249202) goto L46;
        r19 = gh0.u(r1);     // Catch: Throwable -> L31
        goto L27
    L46:
        if (r16 != 1631670868) goto L49;
        r19 = gh0.y(r16, r1, "TPE2");     // Catch: Throwable -> L31
        goto L27
    L49:
        if (r16 != 1936682605) goto L52;
        r19 = gh0.y(r16, r1, "TSOT");     // Catch: Throwable -> L31
        goto L27
    L52:
        if (r16 != 1936679276) goto L55;
        r19 = gh0.y(r16, r1, "TSOA");     // Catch: Throwable -> L31
        goto L27
    L55:
        if (r16 != 1936679282) goto L58;
        r19 = gh0.y(r16, r1, "TSOP");     // Catch: Throwable -> L31
        goto L27
    L58:
        if (r16 != 1936679265) goto L61;
        r19 = gh0.y(r16, r1, "TSO2");     // Catch: Throwable -> L31
        goto L27
    L61:
        if (r16 != 1936679791) goto L64;
        r19 = gh0.y(r16, r1, "TSOC");     // Catch: Throwable -> L31
        goto L27
    L64:
        if (r16 != 1920233063) goto L67;
        r19 = gh0.x(r16, "ITUNESADVISORY", r1, r3, r3);     // Catch: Throwable -> L31
        goto L27
    L67:
        if (r16 != 1885823344) goto L70;
        r19 = gh0.x(r16, "ITUNESGAPLESS", r1, r3, true);     // Catch: Throwable -> L31
        goto L27
    L70:
        if (r16 != 1936683886) goto L73;
        r19 = gh0.y(r16, r1, "TVSHOWSORT");     // Catch: Throwable -> L31
        goto L27
    L73:
        if (r16 != 1953919848) goto L76;
        r19 = gh0.y(r16, r1, "TVSHOW");     // Catch: Throwable -> L31
        goto L27
    L76:
        if (r16 != 757935405) goto L146;
        String r20 = r12;
        String r21 = r20;
        int r22 = -1;
        int r110 = -1;
    L78:
        int r111 = r1.b;     // Catch: Throwable -> L31
        if (r111 >= r15) goto L91;
        int r112 = r1.m();     // Catch: Throwable -> L31
        int r113 = r1.m();     // Catch: Throwable -> L31
        r1.O(4);     // Catch: Throwable -> L31
        if (r113 != 1835360622) goto L84;
        r20 = r1.w(r112 - 12);     // Catch: Throwable -> L31
        goto L78
    L84:
        if (r113 != 1851878757) goto L87;
        r21 = r1.w(r112 - 12);     // Catch: Throwable -> L31
        goto L78
    L87:
        if (r113 != 1684108385) goto L89;
        r22 = r111;
        r110 = r112;
    L89:
        r1.O(r112 - 12);     // Catch: Throwable -> L31
        goto L78
    L91:
        if (r20 == null) goto L99;
        if (r21 == null) goto L99;
        if (r22 == (-1)) goto L99;
        r1.N(r22);     // Catch: Throwable -> L31
        r1.O(16);     // Catch: Throwable -> L31
        r19 = new s02(r20, r21, r1.w(r110 - 16));     // Catch: Throwable -> L31
    L100:
        r1.N(r15);
    L99:
        r19 = null;
    L146:
        l93.A("MetadataUtil", "Skipped unknown metadata entry: ".concat(uv.c(r16)));     // Catch: Throwable -> L31
        r1.N(r15);
        r19 = null;
    L102:
        int r23 = 16777215 & r16;
        if (r23 != 6516084) goto L109;
        int r24 = r1.m();     // Catch: Throwable -> L31
        if (r1.m() != 1684108385) goto L107;
        r1.O(8);     // Catch: Throwable -> L31
        String r25 = r1.w(r24 - 16);     // Catch: Throwable -> L31
        r19 = new l60("und", r25, r25);     // Catch: Throwable -> L31
        goto L100
    L107:
        l93.q0("MetadataUtil", "Failed to parse comment attribute: ".concat(uv.c(r16)));     // Catch: Throwable -> L31
        goto L99
    L109:
        if (r23 != 7233901) goto L111;
    L149:
        r19 = gh0.y(r16, r1, "TIT2");     // Catch: Throwable -> L31
        goto L100
    L111:
        if (r23 == 7631467) goto L149;
        if (r23 != 6516589) goto L116;
    L148:
        r19 = gh0.y(r16, r1, "TCOM");     // Catch: Throwable -> L31
        goto L100
    L116:
        if (r23 == 7828084) goto L148;
        if (r23 != 6578553) goto L122;
        r19 = gh0.y(r16, r1, "TDRC");     // Catch: Throwable -> L31
        goto L100
    L122:
        if (r23 != 4280916) goto L125;
        r19 = gh0.y(r16, r1, "TPE1");     // Catch: Throwable -> L31
        goto L100
    L125:
        if (r23 != 7630703) goto L128;
        r19 = gh0.y(r16, r1, "TSSE");     // Catch: Throwable -> L31
        goto L100
    L128:
        if (r23 != 6384738) goto L131;
        r19 = gh0.y(r16, r1, "TALB");     // Catch: Throwable -> L31
        goto L100
    L131:
        if (r23 != 7108978) goto L134;
        r19 = gh0.y(r16, r1, "USLT");     // Catch: Throwable -> L31
        goto L100
    L134:
        if (r23 != 6776174) goto L137;
        r19 = gh0.y(r16, r1, "TCON");     // Catch: Throwable -> L31
        goto L100
    L137:
        if (r23 != 6779504) goto L140;
        r19 = gh0.y(r16, r1, "TIT1");     // Catch: Throwable -> L31
        goto L100
    L140:
        if (r23 != 7173742) goto L143;
        r19 = gh0.y(r16, r1, "MVNM");     // Catch: Throwable -> L31
        goto L100
    L143:
        if (r23 != 7173737) goto L146;
        Object r26 = gh0.x(r16, "MVIN", r1, true, false);     // Catch: Throwable -> L31
        r1.N(r15);
        r19 = r26;
        goto L151
    L157:
        if (r10.isEmpty() == true) goto L158;
        qv2 r114 = new qv2(r10);
    L161:
        r2 = r2.b(r114);
        int r115 = 8;
    L162:
        boolean r116 = false;
    L221:
        r1.N(r4 + r5);
        r0 = r115;
        r3 = r116;
    L158:
        r114 = null;
        goto L161
    L164:
        if (r6 != 1936553057) goto L209;
        r1.N(r4);
        int r27 = r4 + r5;
        r1.O(12);
    L166:
        int r28 = r1.b;
        if (r28 >= r27) goto L207;
        int r29 = r1.m();
        if (r1.m() == 1935766900) goto L171;
        r1.N(r28 + r29);
        goto L166
    L171:
        if (r29 >= 16) goto L173;
        qv2 r117 = null;
        r115 = 8;
    L208:
        r2 = r2.b(r117);
        goto L162
    L173:
        r1.O(4);
        int r30 = -1;
        int r31 = 0;
        int r32 = 0;
    L174:
        if (r31 >= 2) goto L182;
        int r118 = r1.A();
        int r119 = r1.A();
        if (r118 != 0) goto L178;
        r30 = r119;
    L180:
        r31 = r31 + 1;
        goto L174
    L178:
        if (r118 != 1) goto L180;
        r32 = r119;
        goto L180
    L182:
        if (r30 != 12) goto L186;
        int r33 = 240;
    L184:
        r115 = 8;
    L203:
        if (r33 != (-2147483647)) goto L205;
    L204:
        r117 = null;
        goto L208
    L205:
        r117 = new qv2(new pv2[]{new pg4(r32, r33)});
        goto L208
    L186:
        if (r30 != 13) goto L189;
        r33 = 120;
        goto L184
    L189:
        if (r30 == 21) goto L191;
        r33 = -2147483647;
        goto L184
    L191:
        r115 = 8;
        if (r1.a() >= 8) goto L194;
    L202:
        r33 = -2147483647;
        goto L203
    L194:
        if ((r1.b + 8) > r27) goto L202;
        int r34 = r1.m();
        int r35 = r1.m();
        if (r34 < 12) goto L202;
        if (r35 != 1936877170) goto L202;
        r33 = r1.B();
        goto L203
    L207:
        r115 = 8;
        goto L204
    L209:
        r115 = 8;
        if (r6 != (-1451722374)) goto L162;
        short r36 = r1.x();
        r1.O(2);
        String r37 = r1.y(r36, StandardCharsets.UTF_8);
        int r38 = Math.max(r37.lastIndexOf(43), r37.lastIndexOf(45));
        ty2 r39 = new ty2(Float.parseFloat(r37.substring(0, r38)), Float.parseFloat(r37.substring(r38, r37.length() - 1)));     // Catch: Throwable -> L217
        pv2[] r40 = new pv2[1];     // Catch: Throwable -> L217
        r116 = false;
        r40[0] = r39;     // Catch: Throwable -> L223
        qv2 r120 = new qv2(r40);     // Catch: Throwable -> L223
    L220:
        r2 = r2.b(r120);
    L219:
        r120 = null;
    L217:
        r116 = false;
    L218:
        r116 = false;
        goto L219
    L222:
        return r2;
    }
}
