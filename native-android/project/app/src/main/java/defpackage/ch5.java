package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ch5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ch5(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r24) {
        int r5 = 0;
        boolean r6 = false;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        String r13 = null;
        ArrayList r14 = null;
        PendingIntent r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        byte[] r19 = null;
        String r20 = null;
        String r21 = null;
        rj5 r22 = null;
        String r23 = null;
        String r25 = null;
        String r26 = null;
        switch(this.a) {
            case 0: goto L352;
            case 1: goto L335;
            case 2: goto L324;
            case 3: goto L367;
            case 4: goto L307;
            case 5: goto L298;
            case 6: goto L289;
            case 7: goto L280;
            case 8: goto L271;
            case 9: goto L262;
            case 10: goto L237;
            case 11: goto L220;
            case 12: goto L204;
            case 13: goto L177;
            case 14: goto L160;
            case 15: goto L147;
            case 16: goto L133;
            case 17: goto L120;
            case 18: goto L369;
            case 19: goto L99;
            case 20: goto L90;
            case 21: goto L81;
            case 22: goto L371;
            case 23: goto L64;
            case 24: goto L49;
            case 25: goto L365;
            case 26: goto L28;
            case 27: goto L19;
            case 28: goto L373;
            default: goto L4;
        };
    L4:
        int r0 = l93.p0(r24);
    L6:
        if (r24.dataPosition() >= r0) goto L11;
        int r2 = r24.readInt();
        if (((char) r2) != 1) goto L9;
        r14 = l93.z(r24, r2, h35.CREATOR);
        goto L6
    L9:
        l93.m0(r24, r2);
        goto L6
    L11:
        l93.H(r24, r0);
        return new g35(r14);
    L19:
        int r1 = l93.p0(r24);
    L21:
        if (r24.dataPosition() >= r1) goto L26;
        int r3 = r24.readInt();
        if (((char) r3) != 1) goto L24;
        r6 = l93.V(r24, r3);
        goto L21
    L24:
        l93.m0(r24, r3);
        goto L21
    L26:
        l93.H(r24, r1);
        return new y25(r6);
    L28:
        int r4 = l93.p0(r24);
        int r27 = 0;
        String r28 = null;
    L30:
        if (r24.dataPosition() >= r4) goto L41;
        int r110 = r24.readInt();
        char r111 = (char) r110;
        if (r111 != 1) goto L33;
        r7 = l93.W(r24, r110);
        goto L30
    L33:
        if (r111 != 2) goto L34;
        r27 = l93.W(r24, r110);
        goto L30
    L34:
        if (r111 != 3) goto L35;
        r15 = (PendingIntent) l93.w(r24, r110, PendingIntent.CREATOR);
        goto L30
    L35:
        if (r111 != 4) goto L36;
        r28 = l93.x(r24, r110);
        goto L30
    L36:
        l93.m0(r24, r110);
        goto L30
    L41:
        l93.H(r24, r4);
        return new ka0(r7, r27, r15, r28);
    L49:
        int r29 = l93.p0(r24);
        PendingIntent r30 = null;
        ka0 r31 = null;
    L51:
        if (r24.dataPosition() >= r29) goto L62;
        int r112 = r24.readInt();
        char r113 = (char) r112;
        if (r113 != 1) goto L54;
        r8 = l93.W(r24, r112);
        goto L51
    L54:
        if (r113 != 2) goto L55;
        r16 = l93.x(r24, r112);
        goto L51
    L55:
        if (r113 != 3) goto L56;
        r30 = (PendingIntent) l93.w(r24, r112, PendingIntent.CREATOR);
        goto L51
    L56:
        if (r113 != 4) goto L57;
        r31 = (ka0) l93.w(r24, r112, ka0.CREATOR);
        goto L51
    L57:
        l93.m0(r24, r112);
        goto L51
    L62:
        l93.H(r24, r29);
        return new Status(r8, r16, r30, r31);
    L64:
        int r32 = l93.p0(r24);
        String r33 = null;
    L66:
        if (r24.dataPosition() >= r32) goto L73;
        int r34 = r24.readInt();
        char r35 = (char) r34;
        if (r35 != 2) goto L69;
        r17 = l93.x(r24, r34);
        goto L66
    L69:
        if (r35 != 3) goto L70;
        r33 = l93.x(r24, r34);
        goto L66
    L70:
        l93.m0(r24, r34);
        goto L66
    L73:
        l93.H(r24, r32);
        return new su4(r17, r33);
    L81:
        int r36 = l93.p0(r24);
    L83:
        if (r24.dataPosition() >= r36) goto L88;
        int r37 = r24.readInt();
        if (((char) r37) != 1) goto L86;
        r18 = l93.x(r24, r37);
        goto L83
    L86:
        l93.m0(r24, r37);
        goto L83
    L88:
        l93.H(r24, r36);
        return new nh5(r18);
    L90:
        String r38 = r24.readString();
        if (r38 != null) goto L363;
        r38 = "";
    L363:
        return l04.a(r38);
    L93:
        e = move-exception;
        er1.m(e);
        return null;
    L99:
        int r39 = l93.p0(r24);
        String r40 = null;
        String r41 = null;
        String r42 = null;
    L101:
        if (r24.dataPosition() >= r39) goto L112;
        int r114 = r24.readInt();
        char r115 = (char) r114;
        if (r115 != 2) goto L104;
        r19 = l93.v(r24, r114);
        goto L101
    L104:
        if (r115 != 3) goto L105;
        r40 = l93.x(r24, r114);
        goto L101
    L105:
        if (r115 != 4) goto L106;
        r41 = l93.x(r24, r114);
        goto L101
    L106:
        if (r115 != 5) goto L107;
        r42 = l93.x(r24, r114);
        goto L101
    L107:
        l93.m0(r24, r114);
        goto L101
    L112:
        l93.H(r24, r39);
        return new cs3(r40, r41, r42, r19);
    L120:
        int r43 = l93.p0(r24);
        String r44 = null;
        String r45 = null;
    L122:
        if (r24.dataPosition() >= r43) goto L131;
        int r46 = r24.readInt();
        char r47 = (char) r46;
        if (r47 != 2) goto L125;
        r20 = l93.x(r24, r46);
        goto L122
    L125:
        if (r47 != 3) goto L126;
        r44 = l93.x(r24, r46);
        goto L122
    L126:
        if (r47 != 4) goto L127;
        r45 = l93.x(r24, r46);
        goto L122
    L127:
        l93.m0(r24, r46);
        goto L122
    L131:
        l93.H(r24, r43);
        return new as3(r20, r44, r45);
    L133:
        int r48 = l93.p0(r24);
        String r49 = null;
        Integer r50 = null;
    L135:
        if (r24.dataPosition() >= r48) goto L145;
        int r51 = r24.readInt();
        char r52 = (char) r51;
        if (r52 != 2) goto L138;
        r49 = l93.x(r24, r51);
        goto L135
    L138:
        if (r52 != 3) goto L139;
        int r53 = l93.Z(r24, r51);
        if (r53 == 0) goto L142;
        l93.s0(r24, r53, 4);
        r50 = Integer.valueOf(r24.readInt());
        goto L135
    L142:
        r50 = null;
        goto L135
    L139:
        l93.m0(r24, r51);
        goto L135
    L145:
        l93.H(r24, r48);
        return new zr3(r50.intValue(), r49);
    L147:
        int r54 = l93.p0(r24);
        byte[] r55 = null;
        ArrayList r56 = null;
    L149:
        if (r24.dataPosition() >= r54) goto L158;
        int r57 = r24.readInt();
        char r58 = (char) r57;
        if (r58 != 2) goto L152;
        r21 = l93.x(r24, r57);
        goto L149
    L152:
        if (r58 != 3) goto L153;
        r55 = l93.v(r24, r57);
        goto L149
    L153:
        if (r58 != 4) goto L154;
        r56 = l93.z(r24, r57, Transport.CREATOR);
        goto L149
    L154:
        l93.m0(r24, r57);
        goto L149
    L158:
        l93.H(r24, r54);
        return new yr3(r21, r55, r56);
    L160:
        int r59 = l93.p0(r24);
        String r116 = null;
        String r117 = null;
        byte[] r118 = null;
        kn r119 = null;
        jn r120 = null;
        ln r121 = null;
        hn r122 = null;
        String r123 = null;
    L162:
        if (r24.dataPosition() >= r59) goto L175;
        int r60 = r24.readInt();
        switch(((char) r60)) {
            case 1: goto L174;
            case 2: goto L173;
            case 3: goto L172;
            case 4: goto L171;
            case 5: goto L170;
            case 6: goto L169;
            case 7: goto L168;
            case 8: goto L167;
            case 9: goto L166;
            default: goto L165;
        };
    L166:
        l93.x(r24, r60);
        goto L162
    L167:
        r123 = l93.x(r24, r60);
        goto L162
    L168:
        r122 = (hn) l93.w(r24, r60, hn.CREATOR);
        goto L162
    L169:
        r121 = (ln) l93.w(r24, r60, ln.CREATOR);
        goto L162
    L170:
        r120 = (jn) l93.w(r24, r60, jn.CREATOR);
        goto L162
    L171:
        r119 = (kn) l93.w(r24, r60, kn.CREATOR);
        goto L162
    L172:
        r118 = l93.v(r24, r60);
        goto L162
    L173:
        r117 = l93.x(r24, r60);
        goto L162
    L174:
        r116 = l93.x(r24, r60);
        goto L162
    L165:
        l93.m0(r24, r60);
        goto L162
    L175:
        l93.H(r24, r59);
        return new vr3(r116, r117, r118, r119, r120, r121, r122, r123);
    L177:
        int r61 = l93.p0(r24);
        as3 r124 = null;
        cs3 r125 = null;
        byte[] r126 = null;
        ArrayList r127 = null;
        Double r128 = null;
        ArrayList r129 = null;
        nn r130 = null;
        Integer r131 = null;
        su4 r132 = null;
        String r133 = null;
        gn r210 = null;
        String r211 = null;
        ResultReceiver r212 = null;
    L179:
        if (r24.dataPosition() >= r61) goto L202;
        int r62 = r24.readInt();
        switch(((char) r62)) {
            case 2: goto L201;
            case 3: goto L200;
            case 4: goto L199;
            case 5: goto L198;
            case 6: goto L194;
            case 7: goto L193;
            case 8: goto L192;
            case 9: goto L188;
            case 10: goto L187;
            case 11: goto L186;
            case 12: goto L185;
            case 13: goto L184;
            case 14: goto L183;
            default: goto L182;
        };
    L183:
        r212 = (ResultReceiver) l93.w(r24, r62, ResultReceiver.CREATOR);
        goto L179
    L184:
        r211 = l93.x(r24, r62);
        goto L179
    L185:
        r210 = (gn) l93.w(r24, r62, gn.CREATOR);
        goto L179
    L186:
        r133 = l93.x(r24, r62);
        goto L179
    L187:
        r132 = (su4) l93.w(r24, r62, su4.CREATOR);
        goto L179
    L188:
        int r63 = l93.Z(r24, r62);
        if (r63 == 0) goto L190;
        l93.s0(r24, r63, 4);
        r131 = Integer.valueOf(r24.readInt());
        goto L179
    L190:
        r131 = null;
        goto L179
    L192:
        r130 = (nn) l93.w(r24, r62, nn.CREATOR);
        goto L179
    L193:
        r129 = l93.z(r24, r62, yr3.CREATOR);
        goto L179
    L194:
        int r64 = l93.Z(r24, r62);
        if (r64 == 0) goto L196;
        l93.s0(r24, r64, 8);
        r128 = Double.valueOf(r24.readDouble());
        goto L179
    L196:
        r128 = null;
        goto L179
    L198:
        r127 = l93.z(r24, r62, zr3.CREATOR);
        goto L179
    L199:
        r126 = l93.v(r24, r62);
        goto L179
    L200:
        r125 = (cs3) l93.w(r24, r62, cs3.CREATOR);
        goto L179
    L201:
        r124 = (as3) l93.w(r24, r62, as3.CREATOR);
        goto L179
    L182:
        l93.m0(r24, r62);
        goto L179
    L202:
        l93.H(r24, r61);
        return new xr3(r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r210, r211, r212);
    L204:
        int r65 = l93.p0(r24);
    L205:
        byte[][] r66 = null;
    L207:
        if (r24.dataPosition() >= r65) goto L218;
        int r67 = r24.readInt();
        if (((char) r67) != 1) goto L210;
        int r68 = l93.Z(r24, r67);
        int r69 = r24.dataPosition();
        if (r68 == 0) goto L205;
        int r70 = r24.readInt();
        byte[][] r71 = new byte[r70][];
        int r72 = 0;
    L215:
        if (r72 >= r70) goto L217;
        r71[r72] = r24.createByteArray();
        r72 = r72 + 1;
        goto L215
    L217:
        r24.setDataPosition(r69 + r68);
        r66 = r71;
        goto L207
    L210:
        l93.m0(r24, r67);
        goto L207
    L218:
        l93.H(r24, r65);
        return new mh5(r66);
    L220:
        int r73 = l93.p0(r24);
        int r74 = 0;
        boolean r134 = false;
        boolean r135 = false;
        int r136 = 0;
        int r137 = 0;
    L222:
        if (r24.dataPosition() >= r73) goto L235;
        int r75 = r24.readInt();
        char r76 = (char) r75;
        if (r76 != 1) goto L225;
        r74 = l93.W(r24, r75);
        goto L222
    L225:
        if (r76 != 2) goto L226;
        r134 = l93.V(r24, r75);
        goto L222
    L226:
        if (r76 != 3) goto L227;
        r135 = l93.V(r24, r75);
        goto L222
    L227:
        if (r76 != 4) goto L228;
        r136 = l93.W(r24, r75);
        goto L222
    L228:
        if (r76 != 5) goto L229;
        r137 = l93.W(r24, r75);
        goto L222
    L229:
        l93.m0(r24, r75);
        goto L222
    L235:
        l93.H(r24, r73);
        return new e34(r74, r134, r135, r136, r137);
    L237:
        int r77 = l93.p0(r24);
        byte[] r78 = null;
        byte[] r79 = null;
        byte[] r138 = null;
    L239:
        if (r24.dataPosition() >= r77) goto L250;
        int r139 = r24.readInt();
        char r140 = (char) r139;
        if (r140 != 1) goto L242;
        r78 = l93.v(r24, r139);
        goto L239
    L242:
        if (r140 != 2) goto L243;
        r79 = l93.v(r24, r139);
        goto L239
    L243:
        if (r140 != 3) goto L244;
        r138 = l93.v(r24, r139);
        goto L239
    L244:
        if (r140 != 4) goto L245;
        r9 = l93.W(r24, r139);
        goto L239
    L245:
        l93.m0(r24, r139);
        goto L239
    L250:
        l93.H(r24, r77);
        if (r78 != null) goto L253;
        rj5 r80 = null;
    L254:
        if (r79 != null) goto L256;
        rj5 r81 = null;
    L257:
        if (r138 == null) goto L261;
        r22 = rj5.i(r138.length, r138);
    L261:
        return new lh5(r80, r81, r22, r9);
    L256:
        r81 = rj5.i(r79.length, r79);
        goto L257
    L253:
        r80 = rj5.i(r78.length, r78);
        goto L254
    L262:
        int r82 = l93.p0(r24);
    L264:
        if (r24.dataPosition() >= r82) goto L269;
        int r83 = r24.readInt();
        if (((char) r83) != 1) goto L267;
        r23 = l93.x(r24, r83);
        goto L264
    L267:
        l93.m0(r24, r83);
        goto L264
    L269:
        l93.H(r24, r82);
        return new kh5(r23);
    L271:
        int r84 = l93.p0(r24);
    L273:
        if (r24.dataPosition() >= r84) goto L278;
        int r85 = r24.readInt();
        if (((char) r85) != 1) goto L276;
        r10 = l93.V(r24, r85);
        goto L273
    L276:
        l93.m0(r24, r85);
        goto L273
    L278:
        l93.H(r24, r84);
        return new pj1(r10);
    L280:
        int r86 = l93.p0(r24);
    L282:
        if (r24.dataPosition() >= r86) goto L287;
        int r87 = r24.readInt();
        if (((char) r87) != 1) goto L285;
        r11 = l93.V(r24, r87);
        goto L282
    L285:
        l93.m0(r24, r87);
        goto L282
    L287:
        l93.H(r24, r86);
        return new hh5(r11);
    L289:
        int r88 = l93.p0(r24);
        long r89 = 0;
    L291:
        if (r24.dataPosition() >= r88) goto L296;
        int r90 = r24.readInt();
        if (((char) r90) != 1) goto L294;
        r89 = l93.X(r24, r90);
        goto L291
    L294:
        l93.m0(r24, r90);
        goto L291
    L296:
        l93.H(r24, r88);
        return new gh5(r89);
    L298:
        int r91 = l93.p0(r24);
    L300:
        if (r24.dataPosition() >= r91) goto L305;
        int r92 = r24.readInt();
        if (((char) r92) != 1) goto L303;
        r12 = l93.V(r24, r92);
        goto L300
    L303:
        l93.m0(r24, r92);
        goto L300
    L305:
        l93.H(r24, r91);
        return new wk5(r12);
    L307:
        int r93 = l93.p0(r24);
    L309:
        if (r24.dataPosition() >= r93) goto L316;
        int r94 = r24.readInt();
        char r95 = (char) r94;
        if (r95 != 1) goto L312;
        r5 = l93.W(r24, r94);
        goto L309
    L312:
        if (r95 != 2) goto L313;
        r25 = l93.x(r24, r94);
        goto L309
    L313:
        l93.m0(r24, r94);
        goto L309
    L316:
        l93.H(r24, r93);
        return new Scope(r5, r25);
    L324:
        int r96 = l93.p0(r24);
        String r97 = null;
    L326:
        if (r24.dataPosition() >= r96) goto L333;
        int r98 = r24.readInt();
        char r99 = (char) r98;
        if (r99 != 1) goto L329;
        r26 = l93.x(r24, r98);
        goto L326
    L329:
        if (r99 != 2) goto L330;
        r97 = l93.x(r24, r98);
        goto L326
    L330:
        l93.m0(r24, r98);
        goto L326
    L333:
        l93.H(r24, r96);
        return new vd4(r26, r97);
    L335:
        int r100 = l93.p0(r24);
        String r141 = null;
        String r142 = null;
        String r143 = null;
        String r144 = null;
        Uri r145 = null;
        String r146 = null;
        String r147 = null;
        String r148 = null;
        vr3 r149 = null;
    L337:
        if (r24.dataPosition() >= r100) goto L350;
        int r101 = r24.readInt();
        switch(((char) r101)) {
            case 1: goto L349;
            case 2: goto L348;
            case 3: goto L347;
            case 4: goto L346;
            case 5: goto L345;
            case 6: goto L344;
            case 7: goto L343;
            case 8: goto L342;
            case 9: goto L341;
            default: goto L340;
        };
    L341:
        r149 = (vr3) l93.w(r24, r101, vr3.CREATOR);
        goto L337
    L342:
        r148 = l93.x(r24, r101);
        goto L337
    L343:
        r147 = l93.x(r24, r101);
        goto L337
    L344:
        r146 = l93.x(r24, r101);
        goto L337
    L345:
        r145 = (Uri) l93.w(r24, r101, Uri.CREATOR);
        goto L337
    L346:
        r144 = l93.x(r24, r101);
        goto L337
    L347:
        r143 = l93.x(r24, r101);
        goto L337
    L348:
        r142 = l93.x(r24, r101);
        goto L337
    L349:
        r141 = l93.x(r24, r101);
        goto L337
    L340:
        l93.m0(r24, r101);
        goto L337
    L350:
        l93.H(r24, r100);
        return new td4(r141, r142, r143, r144, r145, r146, r147, r148, r149);
    L352:
        int r102 = l93.p0(r24);
        GoogleSignInOptions r103 = null;
    L354:
        if (r24.dataPosition() >= r102) goto L361;
        int r104 = r24.readInt();
        char r105 = (char) r104;
        if (r105 != 2) goto L357;
        r13 = l93.x(r24, r104);
        goto L354
    L357:
        if (r105 != 5) goto L358;
        r103 = (GoogleSignInOptions) l93.w(r24, r104, GoogleSignInOptions.CREATOR);
        goto L354
    L358:
        l93.m0(r24, r104);
        goto L354
    L361:
        l93.H(r24, r102);
        return new SignInConfiguration(r13, r103);
    L373:
        return z25.a(r24.readString());
    L16:
        e = move-exception;
        er1.m(e);
        return null;
    L365:
        return hl.a(r24.readString());
    L46:
        e = move-exception;
        er1.m(e);
        return null;
    L371:
        return ru4.a(r24.readString());
    L78:
        e = move-exception;
        er1.m(e);
        return null;
    L369:
        return bs3.a(r24.readString());
    L117:
        e = move-exception;
        er1.m(e);
        return null;
    L367:
        return gl.a(r24.readString());
    L321:
        e = move-exception;
        er1.m(e);
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        switch(this.a) {
            case 0: goto L63;
            case 1: goto L61;
            case 2: goto L59;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L43;
            case 11: goto L41;
            case 12: goto L39;
            case 13: goto L37;
            case 14: goto L35;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L5:
        return new g35[r1];
    L7:
        return new z25[r1];
    L9:
        return new y25[r1];
    L11:
        return new ka0[r1];
    L13:
        return new hl[r1];
    L15:
        return new Status[r1];
    L17:
        return new su4[r1];
    L19:
        return new ru4[r1];
    L21:
        return new nh5[r1];
    L23:
        return new l04[r1];
    L25:
        return new cs3[r1];
    L27:
        return new bs3[r1];
    L29:
        return new as3[r1];
    L31:
        return new zr3[r1];
    L33:
        return new yr3[r1];
    L35:
        return new vr3[r1];
    L37:
        return new xr3[r1];
    L39:
        return new mh5[r1];
    L41:
        return new e34[r1];
    L43:
        return new lh5[r1];
    L45:
        return new kh5[r1];
    L47:
        return new pj1[r1];
    L49:
        return new hh5[r1];
    L51:
        return new gh5[r1];
    L53:
        return new wk5[r1];
    L55:
        return new Scope[r1];
    L57:
        return new gl[r1];
    L59:
        return new vd4[r1];
    L61:
        return new td4[r1];
    L63:
        return new SignInConfiguration[r1];
    }
}
