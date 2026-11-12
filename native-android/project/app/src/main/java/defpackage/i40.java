package defpackage;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i40 {
    public static final byte[] a = null;
    public static final String[] b = null;
    public static final Pattern c = null;

    static {
        a = new byte[]{0, 0, 0, 1};
        b = new String[]{"", "A", "B", "C"};
        c = Pattern.compile("^\\D?(\\d+)$");
    }

    public static String a(int r2, boolean r3, int r4, int r5, int[] r6, int r7) {
        String r8 = b[r2];
        Integer r9 = Integer.valueOf(r4);
        Integer r10 = Integer.valueOf(r5);
        if (r3 == false) goto L5;
        char r11 = 'H';
    L6:
        Object[] r12 = {r8, r9, r10, Character.valueOf(r11), Integer.valueOf(r7)};
        String r13 = f35.a;
        StringBuilder r0 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", r12));
        int r14 = r6.length;
    L7:
        if (r14 <= 0) goto L11;
        if (r6[r14 - 1] != 0) goto L11;
        r14 = r14 - 1;
    L11:
        int r15 = 0;
    L12:
        if (r15 >= r14) goto L15;
        r0.append(String.format(".%02X", new Object[]{Integer.valueOf(r6[r15])}));
        r15 = r15 + 1;
        goto L12
    L15:
        return r0.toString();
    L5:
        r11 = 'L';
        goto L6
    }

    public static Pair b(tb1 r33) {
        Integer r4 = 1;
        String r5 = r33.k;
        String r6 = r33.k;
        if (r5 != null) goto L5;
        return null;
    L5:
        String[] r7 = r5.split("\\.");
        if ("video/dolby-vision".equals(r33.n) == true) goto L8;
        String r1 = r7[0];
        r1.getClass();
        switch(r1.hashCode()) {
            case 2986313: goto L205;
            case 3001066: goto L201;
            case 3004662: goto L197;
            case 3006243: goto L193;
            case 3006244: goto L189;
            case 3199032: goto L185;
            case 3214780: goto L181;
            case 3224753: goto L177;
            case 3356560: goto L173;
            case 3475740: goto L169;
            case 3624515: goto L165;
            default: goto L163;
        };
    L163:
        byte r9 = -1;
    L208:
        int r2 = 8192;
        switch(r9) {
            case 0: goto L506;
            case 1: goto L485;
            case 2: goto L424;
            case 3: goto L356;
            case 4: goto L356;
            case 5: goto L354;
            case 6: goto L354;
            case 7: goto L317;
            case 8: goto L284;
            case 9: goto L274;
            case 10: goto L212;
            default: goto L210;
        };
    L210:
        return null;
    L274:
        Pair r0 = new Pair(r4, r4);
        if (r7.length >= 3) goto L567;
        xa3.s("Ignoring malformed H263 codec string: ", r6, "CodecSpecificDataUtil");
        return r0;
    L567:
        return new Pair(Integer.valueOf(Integer.parseInt(r7[1])), Integer.valueOf(Integer.parseInt(r7[2])));
    L281:
        xa3.s("Ignoring malformed H263 codec string: ", r6, "CodecSpecificDataUtil");
        return r0;
    L424:
        c50 r3 = r33.D;
        if (r7.length >= 4) goto L554;
        xa3.s("Ignoring malformed AV1 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L554:
        int r8 = Integer.parseInt(r7[1]);     // Catch: NumberFormatException -> L482
        int r10 = Integer.parseInt(r7[2].substring(0, 2));     // Catch: NumberFormatException -> L482
        int r11 = Integer.parseInt(r7[3]);     // Catch: NumberFormatException -> L482
        if (r8 == 0) goto L434;
        xa3.m(r8, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
        return null;
    L434:
        if (r11 != 8) goto L436;
    L439:
        if (r11 != 8) goto L441;
        int r12 = 1;
    L450:
        switch(r10) {
            case 0: goto L476;
            case 1: goto L475;
            case 2: goto L474;
            case 3: goto L473;
            case 4: goto L472;
            case 5: goto L471;
            case 6: goto L470;
            case 7: goto L469;
            case 8: goto L468;
            case 9: goto L467;
            case 10: goto L466;
            case 11: goto L465;
            case 12: goto L464;
            case 13: goto L463;
            case 14: goto L462;
            case 15: goto L461;
            case 16: goto L460;
            case 17: goto L459;
            case 18: goto L458;
            case 19: goto L457;
            case 20: goto L456;
            case 21: goto L455;
            case 22: goto L454;
            case 23: goto L452;
            default: goto L451;
        };
    L451:
        int r13 = -1;
        int r14 = -1;
    L477:
        if (r14 != r13) goto L481;
        xa3.m(r10, "Unknown AV1 level: ", "CodecSpecificDataUtil");
        return null;
    L481:
        return new Pair(Integer.valueOf(r12), Integer.valueOf(r14));
    L452:
        r14 = 8388608;
    L453:
        r13 = -1;
        goto L477
    L454:
        r14 = 4194304;
        goto L453
    L455:
        r14 = 2097152;
        goto L453
    L456:
        r14 = 1048576;
        goto L453
    L457:
        r14 = 524288;
        goto L453
    L458:
        r14 = 262144;
        goto L453
    L459:
        r14 = 131072;
        goto L453
    L460:
        r14 = 65536;
        goto L453
    L461:
        r14 = 32768;
        goto L453
    L462:
        r14 = 16384;
        goto L453
    L463:
        r14 = 8192;
        goto L453
    L464:
        r14 = 4096;
        goto L453
    L465:
        r14 = 2048;
        goto L453
    L466:
        r14 = 1024;
        goto L453
    L467:
        r14 = 512;
        goto L453
    L468:
        r14 = 256;
        goto L453
    L469:
        r14 = 128;
        goto L453
    L470:
        r14 = 64;
        goto L453
    L471:
        r14 = 32;
        goto L453
    L472:
        r14 = 16;
        goto L453
    L473:
        r14 = 8;
        goto L453
    L474:
        r13 = -1;
        r14 = 4;
        goto L477
    L475:
        r13 = -1;
        r14 = 2;
        goto L477
    L476:
        r13 = -1;
        r14 = 1;
        goto L477
    L441:
        if (r3 != null) goto L443;
    L449:
        r12 = 2;
        goto L450
    L443:
        if (r3.d != null) goto L448;
        int r15 = r3.c;
        if (r15 == 7) goto L448;
        if (r15 != 6) goto L449;
    L448:
        r12 = 4096;
        goto L450
    L436:
        if (r11 == 10) goto L439;
        xa3.m(r11, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
        return null;
    L482:
        xa3.s("Ignoring malformed AV1 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L212:
        if (r7.length >= 3) goto L563;
        xa3.s("Ignoring malformed VP9 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L563:
        int r16 = Integer.parseInt(r7[1]);     // Catch: NumberFormatException -> L272
        int r17 = Integer.parseInt(r7[2]);     // Catch: NumberFormatException -> L272
        if (r16 != 0) goto L218;
        int r18 = 1;
    L229:
        if (r18 != (-1)) goto L233;
        xa3.m(r16, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
        return null;
    L233:
        if (r17 != 10) goto L235;
        r2 = 1;
    L267:
        if (r2 != (-1)) goto L271;
        xa3.m(r17, "Unknown VP9 level: ", "CodecSpecificDataUtil");
        return null;
    L271:
        return new Pair(Integer.valueOf(r18), Integer.valueOf(r2));
    L235:
        if (r17 != 11) goto L237;
        r2 = 2;
        goto L267
    L237:
        if (r17 != 20) goto L239;
        r2 = 4;
        goto L267
    L239:
        if (r17 != 21) goto L241;
        r2 = 8;
        goto L267
    L241:
        if (r17 != 30) goto L243;
        r2 = 16;
        goto L267
    L243:
        if (r17 != 31) goto L245;
        r2 = 32;
        goto L267
    L245:
        if (r17 != 40) goto L247;
        r2 = 64;
        goto L267
    L247:
        if (r17 != 41) goto L249;
        r2 = 128;
        goto L267
    L249:
        if (r17 != 50) goto L251;
        r2 = 256;
        goto L267
    L251:
        if (r17 == 51) goto L257;
        switch(r17) {
            case 60: goto L256;
            case 61: goto L255;
            case 62: goto L267;
            default: goto L253;
        };
    L253:
        r2 = -1;
        goto L267
    L255:
        r2 = 4096;
        goto L267
    L256:
        r2 = 2048;
        goto L267
    L257:
        r2 = 512;
        goto L267
    L218:
        if (r16 != 1) goto L220;
        r18 = 2;
        goto L229
    L220:
        if (r16 != 2) goto L222;
        r18 = 4;
        goto L229
    L222:
        if (r16 == 3) goto L225;
        r18 = -1;
        goto L229
    L225:
        r18 = 8;
    L272:
        xa3.s("Ignoring malformed VP9 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L284:
        if (r7.length == 3) goto L565;
        xa3.s("Ignoring malformed MP4A codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L565:
    L314:
        xa3.s("Ignoring malformed MP4A codec string: ", r6, "CodecSpecificDataUtil");
    L315:
        return null;
    L289:
        if ("audio/mp4a-latm".equals(lw2.e(Integer.parseInt(r7[1], 16))) == false) goto L315;
        int r19 = Integer.parseInt(r7[2]);     // Catch: NumberFormatException -> L314
        int r20 = 17;
        if (r19 == 17) goto L311;
        r20 = 20;
        if (r19 == 20) goto L311;
        r20 = 23;
        if (r19 == 23) goto L311;
        r20 = 29;
        if (r19 == 29) goto L311;
        r20 = 39;
        if (r19 == 39) goto L311;
        r20 = 42;
        if (r19 == 42) goto L311;
        switch(r19) {
            case 1: goto L310;
            case 2: goto L309;
            case 3: goto L308;
            case 4: goto L307;
            case 5: goto L306;
            case 6: goto L305;
            default: goto L303;
        };     // Catch: NumberFormatException -> L314
    L303:
        r20 = -1;
        goto L311
    L305:
        r20 = 6;
        goto L311
    L306:
        r20 = 5;
        goto L311
    L307:
        r20 = 4;
        goto L311
    L308:
        r20 = 3;
        goto L311
    L309:
        r20 = 2;
        goto L311
    L310:
        r20 = 1;
    L311:
        if (r20 == (-1)) goto L315;
        return new Pair(Integer.valueOf(r20), 0);
    L317:
        if (r7.length >= 4) goto L561;
        xa3.s("Ignoring malformed IAMF codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L561:
        int r21 = 1 << (Integer.parseInt(r7[1]) + 16);
        String r22 = r7[3];
        r22.getClass();
        switch(r22.hashCode()) {
            case 2464863: goto L338;
            case 3114792: goto L334;
            case 3238865: goto L330;
            case 3356560: goto L326;
            default: goto L324;
        };
    L324:
        byte r23 = -1;
    L341:
        switch(r23) {
            case 0: goto L347;
            case 1: goto L346;
            case 2: goto L345;
            case 3: goto L344;
            default: goto L342;
        };
    L342:
        l93.q0("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + r7[3]);
        return null;
    L344:
        int r24 = 2;
    L349:
        return new Pair(Integer.valueOf((r21 | 16777216) | r24), 0);
    L345:
        r24 = 8;
        goto L349
    L346:
        r24 = 4;
        goto L349
    L347:
        r24 = 1;
        goto L349
    L326:
        if (r22.equals("mp4a") == false) goto L324;
        r23 = 3;
        goto L341
    L330:
        if (r22.equals("ipcm") == false) goto L324;
        r23 = 2;
        goto L341
    L334:
        if (r22.equals("fLaC") == false) goto L324;
        r23 = 1;
        goto L341
    L338:
        if (r22.equals("Opus") == false) goto L324;
        r23 = 0;
    L350:
        e = move-exception;
        l93.r0("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + r7[1], e);
        return null;
    L354:
        return c(r6, r7, r33.D);
    L356:
        if (r7.length >= 2) goto L560;
        xa3.s("Ignoring malformed AVC codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L560:
    L422:
        xa3.s("Ignoring malformed AVC codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L361:
        if (r7[1].length() != 6) goto L364;
        int r25 = Integer.parseInt(r7[1].substring(0, 2), 16);     // Catch: NumberFormatException -> L422
        int r26 = Integer.parseInt(r7[1].substring(4), 16);     // Catch: NumberFormatException -> L422
    L367:
        if (r25 != 66) goto L369;
        int r27 = -1;
        int r28 = 1;
    L389:
        if (r28 != r27) goto L392;
        xa3.m(r25, "Unknown AVC profile: ", "CodecSpecificDataUtil");
        return null;
    L392:
        switch(r26) {
            case 10: goto L414;
            case 11: goto L413;
            case 12: goto L412;
            case 13: goto L411;
            default: goto L393;
        };
    L393:
        switch(r26) {
            case 20: goto L410;
            case 21: goto L409;
            case 22: goto L408;
            default: goto L394;
        };
    L394:
        switch(r26) {
            case 30: goto L407;
            case 31: goto L406;
            case 32: goto L405;
            default: goto L395;
        };
    L395:
        switch(r26) {
            case 40: goto L404;
            case 41: goto L403;
            case 42: goto L402;
            default: goto L396;
        };
    L396:
        switch(r26) {
            case 50: goto L401;
            case 51: goto L400;
            case 52: goto L399;
            default: goto L397;
        };
    L397:
        int r29 = -1;
    L415:
        if (r29 != (-1)) goto L419;
        xa3.m(r26, "Unknown AVC level: ", "CodecSpecificDataUtil");
        return null;
    L419:
        return new Pair(Integer.valueOf(r28), Integer.valueOf(r29));
    L399:
        r29 = 65536;
        goto L415
    L400:
        r29 = 32768;
        goto L415
    L401:
        r29 = 16384;
        goto L415
    L402:
        r29 = 8192;
        goto L415
    L403:
        r29 = 4096;
        goto L415
    L404:
        r29 = 2048;
        goto L415
    L405:
        r29 = 1024;
        goto L415
    L406:
        r29 = 512;
        goto L415
    L407:
        r29 = 256;
        goto L415
    L408:
        r29 = 128;
        goto L415
    L409:
        r29 = 64;
        goto L415
    L410:
        r29 = 32;
        goto L415
    L411:
        r29 = 16;
        goto L415
    L412:
        r29 = 8;
        goto L415
    L413:
        r29 = 4;
        goto L415
    L414:
        r29 = 1;
        goto L415
    L369:
        if (r25 != 77) goto L371;
        r27 = -1;
        r28 = 2;
        goto L389
    L371:
        if (r25 != 88) goto L373;
        r27 = -1;
        r28 = 4;
        goto L389
    L373:
        if (r25 != 100) goto L375;
        r28 = 8;
    L382:
        r27 = -1;
        goto L389
    L375:
        if (r25 != 110) goto L377;
        r28 = 16;
        goto L382
    L377:
        if (r25 != 122) goto L379;
        r28 = 32;
        goto L382
    L379:
        if (r25 == 244) goto L381;
        r27 = -1;
        r28 = -1;
        goto L389
    L381:
        r28 = 64;
        goto L382
    L364:
        if (r7.length < 3) goto L420;
        r25 = Integer.parseInt(r7[1]);     // Catch: NumberFormatException -> L422
        r26 = Integer.parseInt(r7[2]);     // Catch: NumberFormatException -> L422
        goto L367
    L420:
        l93.q0("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + r6);     // Catch: NumberFormatException -> L422
        return null;
    L485:
        if (r7.length >= 4) goto L558;
        xa3.s("Ignoring malformed APV codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L558:
        int r30 = Integer.parseInt(r7[1].substring(4));     // Catch: NumberFormatException -> L502
        int r31 = Integer.parseInt(r7[2].substring(4));     // Catch: NumberFormatException -> L502
        int r32 = Integer.parseInt(r7[3].substring(4));     // Catch: NumberFormatException -> L502
        if (r30 != 33) goto L494;
        r2 = 1;
    L495:
        int r34 = (r31 / 30) * 2;
        if ((r31 % 30) != 0) goto L499;
        r34 = r34 - 1;
    L499:
        return new Pair(Integer.valueOf(r2), Integer.valueOf((256 << (r34 - 1)) | (1 << r32)));
    L494:
        if (r30 == 44) goto L495;
        xa3.m(r30, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
        return null;
    L502:
        e = move-exception;
        l93.r0("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + r6, e);
        return null;
    L506:
        if (r7.length == 4) goto L556;
        xa3.s("Ignoring malformed AC-4 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L556:
        int r35 = Integer.parseInt(r7[1]);     // Catch: NumberFormatException -> L552
        int r36 = Integer.parseInt(r7[2]);     // Catch: NumberFormatException -> L552
        int r37 = Integer.parseInt(r7[3]);     // Catch: NumberFormatException -> L552
        if (r35 != 0) goto L513;
        if (r36 != 0) goto L527;
        int r38 = 257;
    L528:
        if (r38 != (-1)) goto L531;
        l93.q0("CodecSpecificDataUtil", "Unknown AC-4 profile: " + r35 + "." + r36);
        return null;
    L531:
        if (r37 != 0) goto L533;
        int r39 = 1;
    L547:
        if (r39 != (-1)) goto L551;
        xa3.m(r37, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
        return null;
    L551:
        return new Pair(Integer.valueOf(r38), Integer.valueOf(r39));
    L533:
        if (r37 != 1) goto L535;
        r39 = 2;
        goto L547
    L535:
        if (r37 != 2) goto L537;
        r39 = 4;
        goto L547
    L537:
        if (r37 != 3) goto L539;
        r39 = 8;
        goto L547
    L539:
        if (r37 == 4) goto L542;
        r39 = -1;
        goto L547
    L542:
        r39 = 16;
    L527:
        r38 = -1;
        goto L528
    L513:
        if (r35 == 1) goto L521;
        if (r35 != 2) goto L527;
        if (r36 != 1) goto L519;
        r38 = 1026;
        goto L528
    L519:
        if (r36 != 2) goto L527;
        r38 = 1028;
        goto L528
    L521:
        if (r36 != 0) goto L523;
        r38 = 513;
        goto L528
    L523:
        if (r36 != 1) goto L527;
        r38 = 514;
    L552:
        xa3.s("Ignoring malformed AC-4 codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L165:
        if (r1.equals("vp09") == false) goto L163;
        r9 = 10;
        goto L208
    L169:
        if (r1.equals("s263") == false) goto L163;
        r9 = 9;
        goto L208
    L173:
        if (r1.equals("mp4a") == false) goto L163;
        r9 = 8;
        goto L208
    L177:
        if (r1.equals("iamf") == false) goto L163;
        r9 = 7;
        goto L208
    L181:
        if (r1.equals("hvc1") == false) goto L163;
        r9 = 6;
        goto L208
    L185:
        if (r1.equals("hev1") == false) goto L163;
        r9 = 5;
        goto L208
    L189:
        if (r1.equals("avc2") == false) goto L163;
        r9 = 4;
        goto L208
    L193:
        if (r1.equals("avc1") == false) goto L163;
        r9 = 3;
        goto L208
    L197:
        if (r1.equals("av01") == false) goto L163;
        r9 = 2;
        goto L208
    L201:
        if (r1.equals("apv1") == false) goto L163;
        r9 = 1;
        goto L208
    L205:
        if (r1.equals("ac-4") == false) goto L163;
        r9 = 0;
        goto L208
    L8:
        if (r7.length >= 3) goto L11;
        xa3.s("Ignoring malformed Dolby Vision codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L11:
        Matcher r40 = c.matcher(r7[1]);
        if (r40.matches() == true) goto L15;
        xa3.s("Ignoring malformed Dolby Vision codec string: ", r6, "CodecSpecificDataUtil");
        return null;
    L15:
        String r41 = r40.group(1);
        if (r41 != null) goto L20;
        Integer r310 = 16;
    L18:
        Integer r42 = null;
    L80:
        if (r42 != null) goto L83;
        xa3.s("Unknown Dolby Vision profile string: ", r41, "CodecSpecificDataUtil");
        return null;
    L83:
        String r43 = r7[2];
        if (r43 != null) goto L87;
    L85:
        r4 = null;
    L156:
        if (r4 != null) goto L160;
        xa3.s("Unknown Dolby Vision level string: ", r43, "CodecSpecificDataUtil");
        return null;
    L160:
        return new Pair(r42, r4);
    L87:
        switch(r43.hashCode()) {
            case 1537: goto L139;
            case 1538: goto L135;
            case 1539: goto L131;
            case 1540: goto L127;
            case 1541: goto L123;
            case 1542: goto L119;
            case 1543: goto L115;
            case 1544: goto L111;
            case 1545: goto L107;
            case 1567: goto L103;
            case 1568: goto L99;
            case 1569: goto L94;
            case 1570: goto L90;
            default: goto L88;
        };
    L88:
        byte r210 = -1;
    L142:
        switch(r210) {
            case 0: goto L156;
            case 1: goto L155;
            case 2: goto L154;
            case 3: goto L153;
            case 4: goto L152;
            case 5: goto L151;
            case 6: goto L150;
            case 7: goto L149;
            case 8: goto L148;
            case 9: goto L147;
            case 10: goto L146;
            case 11: goto L145;
            case 12: goto L144;
            default: goto L85;
        };
    L144:
        r4 = 4096;
        goto L156
    L145:
        r4 = 2048;
        goto L156
    L146:
        r4 = 1024;
        goto L156
    L147:
        r4 = 512;
        goto L156
    L148:
        r4 = 256;
        goto L156
    L149:
        r4 = 128;
        goto L156
    L150:
        r4 = 64;
        goto L156
    L151:
        r4 = 32;
        goto L156
    L152:
        r4 = r310;
        goto L156
    L153:
        r4 = 8;
        goto L156
    L154:
        r4 = 4;
        goto L156
    L155:
        r4 = 2;
        goto L156
    L90:
        if (r43.equals("13") == false) goto L88;
        byte r44 = 12;
    L97:
        r210 = r44;
        goto L142
    L94:
        if (r43.equals("12") == false) goto L88;
        r44 = 11;
        goto L97
    L99:
        if (r43.equals("11") == false) goto L88;
        r210 = 10;
        goto L142
    L103:
        if (r43.equals("10") == false) goto L88;
        r210 = 9;
        goto L142
    L107:
        if (r43.equals("09") == false) goto L88;
        r210 = 8;
        goto L142
    L111:
        if (r43.equals("08") == false) goto L88;
        r210 = 7;
        goto L142
    L115:
        if (r43.equals("07") == false) goto L88;
        r210 = 6;
        goto L142
    L119:
        if (r43.equals("06") == false) goto L88;
        r210 = 5;
        goto L142
    L123:
        if (r43.equals("05") == false) goto L88;
        r210 = 4;
        goto L142
    L127:
        if (r43.equals("04") == false) goto L88;
        r210 = 3;
        goto L142
    L131:
        if (r43.equals("03") == false) goto L88;
        r210 = 2;
        goto L142
    L135:
        if (r43.equals("02") == false) goto L88;
        r210 = 1;
        goto L142
    L139:
        if (r43.equals("01") == false) goto L88;
        r210 = 0;
        goto L142
    L20:
        switch(r41.hashCode()) {
            case 1536: goto L63;
            case 1537: goto L60;
            case 1538: goto L56;
            case 1539: goto L52;
            case 1540: goto L48;
            case 1541: goto L44;
            case 1542: goto L40;
            case 1543: goto L36;
            case 1544: goto L32;
            case 1545: goto L28;
            case 1567: goto L24;
            default: goto L21;
        };
    L21:
        r310 = 16;
    L22:
        byte r45 = -1;
    L67:
        switch(r45) {
            case 0: goto L79;
            case 1: goto L78;
            case 2: goto L77;
            case 3: goto L76;
            case 4: goto L75;
            case 5: goto L74;
            case 6: goto L73;
            case 7: goto L72;
            case 8: goto L71;
            case 9: goto L70;
            case 10: goto L69;
            default: goto L18;
        };
    L69:
        r42 = 1024;
        goto L80
    L70:
        r42 = 512;
        goto L80
    L71:
        r42 = 256;
        goto L80
    L72:
        r42 = 128;
        goto L80
    L73:
        r42 = 64;
        goto L80
    L74:
        r42 = 32;
        goto L80
    L75:
        r42 = r310;
        goto L80
    L76:
        r42 = 8;
        goto L80
    L77:
        r42 = 4;
        goto L80
    L78:
        r42 = 2;
        goto L80
    L79:
        r42 = r4;
        goto L80
    L63:
        r310 = 16;
        if (r41.equals("00") == false) goto L22;
        r45 = 0;
        goto L67
    L24:
        if (r41.equals("10") == false) goto L569;
        r310 = 16;
        r45 = 10;
        goto L67
    L569:
        r310 = 16;
        goto L22
    L28:
        if (r41.equals("09") == false) goto L570;
        r310 = 16;
        r45 = 9;
        goto L67
    L570:
        r310 = 16;
        goto L22
    L32:
        if (r41.equals("08") == false) goto L571;
        r310 = 16;
        r45 = 8;
        goto L67
    L571:
        r310 = 16;
        goto L22
    L36:
        if (r41.equals("07") == false) goto L572;
        r310 = 16;
        r45 = 7;
        goto L67
    L572:
        r310 = 16;
        goto L22
    L40:
        if (r41.equals("06") == false) goto L573;
        r310 = 16;
        r45 = 6;
        goto L67
    L573:
        r310 = 16;
        goto L22
    L44:
        if (r41.equals("05") == false) goto L574;
        r310 = 16;
        r45 = 5;
        goto L67
    L574:
        r310 = 16;
        goto L22
    L48:
        if (r41.equals("04") == false) goto L575;
        r310 = 16;
        r45 = 4;
        goto L67
    L575:
        r310 = 16;
        goto L22
    L52:
        if (r41.equals("03") == false) goto L576;
        r310 = 16;
        r45 = 3;
        goto L67
    L576:
        r310 = 16;
        goto L22
    L56:
        if (r41.equals("02") == false) goto L577;
        r310 = 16;
        r45 = 2;
        goto L67
    L577:
        r310 = 16;
        goto L22
    L60:
        if (r41.equals("01") == false) goto L578;
        r310 = 16;
        r45 = 1;
        goto L67
    L578:
        r310 = 16;
        goto L22
    }

    public static Pair c(String r11, String[] r12, c50 r13) {
        if (r12.length >= 4) goto L6;
        xa3.s("Ignoring malformed HEVC codec string: ", r11, "CodecSpecificDataUtil");
        return null;
    L6:
        Matcher r0 = c.matcher(r12[1]);
        if (r0.matches() == true) goto L10;
        xa3.s("Ignoring malformed HEVC codec string: ", r11, "CodecSpecificDataUtil");
        return null;
    L10:
        String r14 = r0.group(1);
        byte r7 = 6;
        if ("1".equals(r14) == false) goto L14;
        int r15 = 1;
    L23:
        String r16 = r12[3];
        if (r16 != null) goto L27;
    L25:
        Integer r17 = null;
    L160:
        if (r17 != null) goto L164;
        xa3.s("Unknown HEVC level string: ", r16, "CodecSpecificDataUtil");
        return null;
    L164:
        return new Pair(Integer.valueOf(r15), r17);
    L27:
        switch(r16.hashCode()) {
            case 70821: goto L129;
            case 70914: goto L125;
            case 70917: goto L121;
            case 71007: goto L117;
            case 71010: goto L113;
            case 74665: goto L109;
            case 74758: goto L106;
            case 74761: goto L102;
            case 74851: goto L98;
            case 74854: goto L94;
            case 2193639: goto L90;
            case 2193642: goto L86;
            case 2193732: goto L82;
            case 2193735: goto L78;
            case 2193738: goto L74;
            case 2193825: goto L70;
            case 2193828: goto L66;
            case 2193831: goto L62;
            case 2312803: goto L58;
            case 2312806: goto L54;
            case 2312896: goto L50;
            case 2312899: goto L46;
            case 2312902: goto L42;
            case 2312989: goto L38;
            case 2312992: goto L34;
            case 2312995: goto L30;
            default: goto L28;
        };
    L28:
        r7 = -1;
    L132:
        switch(r7) {
            case 0: goto L159;
            case 1: goto L158;
            case 2: goto L157;
            case 3: goto L156;
            case 4: goto L155;
            case 5: goto L154;
            case 6: goto L153;
            case 7: goto L152;
            case 8: goto L151;
            case 9: goto L150;
            case 10: goto L149;
            case 11: goto L148;
            case 12: goto L147;
            case 13: goto L146;
            case 14: goto L145;
            case 15: goto L144;
            case 16: goto L143;
            case 17: goto L142;
            case 18: goto L141;
            case 19: goto L140;
            case 20: goto L139;
            case 21: goto L138;
            case 22: goto L137;
            case 23: goto L136;
            case 24: goto L135;
            case 25: goto L134;
            default: goto L25;
        };
    L134:
        r17 = 16777216;
        goto L160
    L135:
        r17 = 4194304;
        goto L160
    L136:
        r17 = 1048576;
        goto L160
    L137:
        r17 = 262144;
        goto L160
    L138:
        r17 = 65536;
        goto L160
    L139:
        r17 = 16384;
        goto L160
    L140:
        r17 = 4096;
        goto L160
    L141:
        r17 = 1024;
        goto L160
    L142:
        r17 = 33554432;
        goto L160
    L143:
        r17 = 8388608;
        goto L160
    L144:
        r17 = 2097152;
        goto L160
    L145:
        r17 = 524288;
        goto L160
    L146:
        r17 = 131072;
        goto L160
    L147:
        r17 = 32768;
        goto L160
    L148:
        r17 = 8192;
        goto L160
    L149:
        r17 = 2048;
        goto L160
    L150:
        r17 = 256;
        goto L160
    L151:
        r17 = 64;
        goto L160
    L152:
        r17 = 16;
        goto L160
    L153:
        r17 = 4;
        goto L160
    L154:
        r17 = 1;
        goto L160
    L155:
        r17 = 512;
        goto L160
    L156:
        r17 = 128;
        goto L160
    L157:
        r17 = 32;
        goto L160
    L158:
        r17 = 8;
        goto L160
    L159:
        r17 = 2;
        goto L160
    L30:
        if (r16.equals("L186") == false) goto L167;
        r7 = 25;
        goto L132
    L167:
        r7 = -1;
        goto L132
    L34:
        if (r16.equals("L183") == false) goto L168;
        r7 = 24;
        goto L132
    L168:
        r7 = -1;
        goto L132
    L38:
        if (r16.equals("L180") == false) goto L169;
        r7 = 23;
        goto L132
    L169:
        r7 = -1;
        goto L132
    L42:
        if (r16.equals("L156") == false) goto L170;
        r7 = 22;
        goto L132
    L170:
        r7 = -1;
        goto L132
    L46:
        if (r16.equals("L153") == false) goto L171;
        r7 = 21;
        goto L132
    L171:
        r7 = -1;
        goto L132
    L50:
        if (r16.equals("L150") == false) goto L172;
        r7 = 20;
        goto L132
    L172:
        r7 = -1;
        goto L132
    L54:
        if (r16.equals("L123") == false) goto L173;
        r7 = 19;
        goto L132
    L173:
        r7 = -1;
        goto L132
    L58:
        if (r16.equals("L120") == false) goto L174;
        r7 = 18;
        goto L132
    L174:
        r7 = -1;
        goto L132
    L62:
        if (r16.equals("H186") == false) goto L175;
        r7 = 17;
        goto L132
    L175:
        r7 = -1;
        goto L132
    L66:
        if (r16.equals("H183") == false) goto L176;
        r7 = 16;
        goto L132
    L176:
        r7 = -1;
        goto L132
    L70:
        if (r16.equals("H180") == false) goto L177;
        r7 = 15;
        goto L132
    L177:
        r7 = -1;
        goto L132
    L74:
        if (r16.equals("H156") == false) goto L178;
        r7 = 14;
        goto L132
    L178:
        r7 = -1;
        goto L132
    L78:
        if (r16.equals("H153") == false) goto L179;
        r7 = 13;
        goto L132
    L179:
        r7 = -1;
        goto L132
    L82:
        if (r16.equals("H150") == false) goto L180;
        r7 = 12;
        goto L132
    L180:
        r7 = -1;
        goto L132
    L86:
        if (r16.equals("H123") == false) goto L181;
        r7 = 11;
        goto L132
    L181:
        r7 = -1;
        goto L132
    L90:
        if (r16.equals("H120") == false) goto L182;
        r7 = 10;
        goto L132
    L182:
        r7 = -1;
        goto L132
    L94:
        if (r16.equals("L93") == false) goto L183;
        r7 = 9;
        goto L132
    L183:
        r7 = -1;
        goto L132
    L98:
        if (r16.equals("L90") == false) goto L184;
        r7 = 8;
        goto L132
    L184:
        r7 = -1;
        goto L132
    L102:
        if (r16.equals("L63") == false) goto L185;
        r7 = 7;
        goto L132
    L185:
        r7 = -1;
        goto L132
    L106:
        if (r16.equals("L60") == true) goto L132;
        r7 = -1;
        goto L132
    L109:
        if (r16.equals("L30") == false) goto L187;
        r7 = 5;
        goto L132
    L187:
        r7 = -1;
        goto L132
    L113:
        if (r16.equals("H93") == false) goto L188;
        r7 = 4;
        goto L132
    L188:
        r7 = -1;
        goto L132
    L117:
        if (r16.equals("H90") == false) goto L189;
        r7 = 3;
        goto L132
    L189:
        r7 = -1;
        goto L132
    L121:
        if (r16.equals("H63") == false) goto L190;
        r7 = 2;
        goto L132
    L190:
        r7 = -1;
        goto L132
    L125:
        if (r16.equals("H60") == false) goto L191;
        r7 = 1;
        goto L132
    L191:
        r7 = -1;
        goto L132
    L129:
        if (r16.equals("H30") == false) goto L192;
        r7 = 0;
        goto L132
    L192:
        r7 = -1;
        goto L132
    L14:
        if ("2".equals(r14) == false) goto L21;
        if (r13 != null) goto L17;
    L19:
        r15 = 2;
        goto L23
    L17:
        if (r13.c != 6) goto L19;
        r15 = 4096;
        goto L23
    L21:
        if ("6".equals(r14) == false) goto L165;
        r15 = 6;
        goto L23
    L165:
        xa3.s("Unknown HEVC profile string: ", r14, "CodecSpecificDataUtil");
        return null;
    }
}
