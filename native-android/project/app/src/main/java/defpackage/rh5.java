package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rh5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ rh5(int r1) {
        this.a = r1;
    }

    public static void a(sh1 r4, Parcel r5, int r6) {
        int r0 = ud3.R0(r5, 20293);
        int r1 = r4.n;
        ud3.T0(r5, 1, 4);
        r5.writeInt(r1);
        int r2 = r4.o;
        ud3.T0(r5, 2, 4);
        r5.writeInt(r2);
        int r3 = r4.p;
        ud3.T0(r5, 3, 4);
        r5.writeInt(r3);
        ud3.O0(r5, 4, r4.q);
        IBinder r7 = r4.r;
        if (r7 == null) goto L6;
        int r8 = ud3.R0(r5, 5);
        r5.writeStrongBinder(r7);
        ud3.S0(r5, r8);
    L6:
        ud3.P0(r5, 6, r4.s, r6);
        ud3.K0(r5, 7, r4.t);
        ud3.M0(r5, 8, r4.u, r6);
        ud3.P0(r5, 10, r4.v, r6);
        ud3.P0(r5, 11, r4.w, r6);
        boolean r9 = r4.x;
        ud3.T0(r5, 12, 4);
        r5.writeInt(r9 ? 1 : 0);
        int r10 = r4.y;
        ud3.T0(r5, 13, 4);
        r5.writeInt(r10);
        boolean r11 = r4.z;
        ud3.T0(r5, 14, 4);
        r5.writeInt(r11 ? 1 : 0);
        ud3.O0(r5, 15, r4.A);
        ud3.S0(r5, r0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r25) {
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        boolean r8 = false;
        int r9 = 0;
        String r10 = null;
        String r11 = null;
        ArrayList r12 = null;
        String r13 = null;
        Bundle r14 = null;
        rj5 r15 = null;
        rj5 r16 = null;
        switch(this.a) {
            case 0: goto L281;
            case 1: goto L264;
            case 2: goto L251;
            case 3: goto L231;
            case 4: goto L222;
            case 5: goto L204;
            case 6: goto L189;
            case 7: goto L171;
            case 8: goto L153;
            case 9: goto L138;
            case 10: goto L125;
            case 11: goto L105;
            case 12: goto L83;
            case 13: goto L58;
            case 14: goto L294;
            case 15: goto L37;
            case 16: goto L28;
            case 17: goto L19;
            case 18: goto L296;
            default: goto L4;
        };
    L4:
        int r0 = l93.p0(r25);
    L6:
        if (r25.dataPosition() >= r0) goto L11;
        int r2 = r25.readInt();
        if (((char) r2) != 2) goto L9;
        r11 = l93.x(r25, r2);
        goto L6
    L9:
        l93.m0(r25, r2);
        goto L6
    L11:
        l93.H(r25, r0);
        return new s61(r11);
    L19:
        int r1 = l93.p0(r25);
    L21:
        if (r25.dataPosition() >= r1) goto L26;
        int r3 = r25.readInt();
        if (((char) r3) != 1) goto L24;
        l93.V(r25, r3);
        goto L21
    L24:
        l93.m0(r25, r3);
        goto L21
    L26:
        l93.H(r25, r1);
        return new uk5();
    L28:
        int r17 = l93.p0(r25);
    L30:
        if (r25.dataPosition() >= r17) goto L35;
        int r18 = r25.readInt();
        if (((char) r18) != 1) goto L33;
        r12 = l93.z(r25, r18, qk5.CREATOR);
        goto L30
    L33:
        l93.m0(r25, r18);
        goto L30
    L35:
        l93.H(r25, r17);
        return new rk5(r12);
    L37:
        int r19 = l93.p0(r25);
        byte[] r110 = null;
        byte[] r111 = null;
        byte[] r112 = null;
        long r113 = 0;
    L39:
        if (r25.dataPosition() >= r19) goto L50;
        int r20 = r25.readInt();
        char r21 = (char) r20;
        if (r21 != 1) goto L42;
        r113 = l93.X(r25, r20);
        goto L39
    L42:
        if (r21 != 2) goto L43;
        r110 = l93.v(r25, r20);
        goto L39
    L43:
        if (r21 != 3) goto L44;
        r111 = l93.v(r25, r20);
        goto L39
    L44:
        if (r21 != 4) goto L45;
        r112 = l93.v(r25, r20);
        goto L39
    L45:
        l93.m0(r25, r20);
        goto L39
    L50:
        l93.H(r25, r19);
        return new qk5(r113, r110, r111, r112);
    L58:
        int r22 = l93.p0(r25);
        Bundle r23 = new Bundle();
        Bundle r114 = r23;
        Scope[] r115 = sh1.B;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        boolean r24 = false;
        int r26 = 0;
        boolean r27 = false;
        p61[] r119 = sh1.C;
        p61[] r120 = r119;
        String r121 = null;
        IBinder r122 = null;
        Account r123 = null;
        String r28 = null;
    L60:
        if (r25.dataPosition() >= r22) goto L81;
        int r29 = r25.readInt();
        switch(((char) r29)) {
            case 1: goto L80;
            case 2: goto L79;
            case 3: goto L78;
            case 4: goto L77;
            case 5: goto L73;
            case 6: goto L72;
            case 7: goto L71;
            case 8: goto L70;
            case 9: goto L63;
            case 10: goto L69;
            case 11: goto L68;
            case 12: goto L67;
            case 13: goto L66;
            case 14: goto L65;
            case 15: goto L64;
            default: goto L63;
        };
    L64:
        r28 = l93.x(r25, r29);
        goto L60
    L65:
        r27 = l93.V(r25, r29);
        goto L60
    L66:
        r26 = l93.W(r25, r29);
        goto L60
    L67:
        r24 = l93.V(r25, r29);
        goto L60
    L68:
        r120 = (p61[]) l93.y(r25, r29, p61.CREATOR);
        goto L60
    L69:
        r119 = (p61[]) l93.y(r25, r29, p61.CREATOR);
        goto L60
    L70:
        r123 = (Account) l93.w(r25, r29, Account.CREATOR);
        goto L60
    L71:
        r114 = l93.u(r25, r29);
        goto L60
    L72:
        r115 = (Scope[]) l93.y(r25, r29, Scope.CREATOR);
        goto L60
    L73:
        int r30 = l93.Z(r25, r29);
        int r31 = r25.dataPosition();
        if (r30 == 0) goto L75;
        IBinder r32 = r25.readStrongBinder();
        r25.setDataPosition(r31 + r30);
        r122 = r32;
        goto L60
    L75:
        r122 = null;
        goto L60
    L77:
        r121 = l93.x(r25, r29);
        goto L60
    L78:
        r118 = l93.W(r25, r29);
        goto L60
    L79:
        r117 = l93.W(r25, r29);
        goto L60
    L80:
        r116 = l93.W(r25, r29);
        goto L60
    L63:
        l93.m0(r25, r29);
        goto L60
    L81:
        l93.H(r25, r22);
        return new sh1(r116, r117, r118, r121, r122, r115, r114, r123, r119, r120, r24, r26, r27, r28);
    L83:
        int r33 = l93.p0(r25);
        String r34 = null;
        Boolean r124 = null;
        String r125 = null;
        String r126 = null;
    L85:
        if (r25.dataPosition() >= r33) goto L103;
        int r127 = r25.readInt();
        char r128 = (char) r127;
        if (r128 != 2) goto L88;
        r34 = l93.x(r25, r127);
        goto L85
    L88:
        if (r128 != 3) goto L89;
        int r129 = l93.Z(r25, r127);
        if (r129 == 0) goto L96;
        l93.s0(r25, r129, 4);
        if (r25.readInt() == 0) goto L100;
        boolean r130 = true;
    L101:
        r124 = Boolean.valueOf(r130);
        goto L85
    L100:
        r130 = false;
        goto L101
    L96:
        r124 = null;
        goto L85
    L89:
        if (r128 != 4) goto L90;
        r125 = l93.x(r25, r127);
        goto L85
    L90:
        if (r128 != 5) goto L91;
        r126 = l93.x(r25, r127);
        goto L85
    L91:
        l93.m0(r25, r127);
        goto L85
    L103:
        l93.H(r25, r33);
        return new nn(r34, r124, r125, r126);
    L105:
        int r35 = l93.p0(r25);
        boolean r131 = false;
        boolean r132 = false;
        int r133 = 0;
        e34 r134 = null;
        int[] r135 = null;
        int[] r136 = null;
    L107:
        if (r25.dataPosition() >= r35) goto L123;
        int r36 = r25.readInt();
        switch(((char) r36)) {
            case 1: goto L122;
            case 2: goto L121;
            case 3: goto L120;
            case 4: goto L116;
            case 5: goto L115;
            case 6: goto L111;
            default: goto L110;
        };
    L111:
        int r37 = l93.Z(r25, r36);
        int r38 = r25.dataPosition();
        if (r37 == 0) goto L113;
        int[] r39 = r25.createIntArray();
        r25.setDataPosition(r38 + r37);
        r136 = r39;
        goto L107
    L113:
        r136 = null;
        goto L107
    L115:
        r133 = l93.W(r25, r36);
        goto L107
    L116:
        int r40 = l93.Z(r25, r36);
        int r41 = r25.dataPosition();
        if (r40 == 0) goto L118;
        int[] r42 = r25.createIntArray();
        r25.setDataPosition(r41 + r40);
        r135 = r42;
        goto L107
    L118:
        r135 = null;
        goto L107
    L120:
        r132 = l93.V(r25, r36);
        goto L107
    L121:
        r131 = l93.V(r25, r36);
        goto L107
    L122:
        r134 = (e34) l93.w(r25, r36, e34.CREATOR);
        goto L107
    L110:
        l93.m0(r25, r36);
        goto L107
    L123:
        l93.H(r25, r35);
        return new pa0(r134, r131, r132, r135, r133, r136);
    L125:
        int r43 = l93.p0(r25);
        int r44 = 0;
    L127:
        if (r25.dataPosition() >= r43) goto L136;
        int r45 = r25.readInt();
        char r46 = (char) r45;
        if (r46 != 2) goto L130;
        r5 = l93.W(r25, r45);
        goto L127
    L130:
        if (r46 != 3) goto L131;
        r13 = l93.x(r25, r45);
        goto L127
    L131:
        if (r46 != 4) goto L132;
        r44 = l93.W(r25, r45);
        goto L127
    L132:
        l93.m0(r25, r45);
        goto L127
    L136:
        l93.H(r25, r43);
        return new ln(r13, r5, r44);
    L138:
        int r47 = l93.p0(r25);
        p61[] r48 = null;
        pa0 r49 = null;
    L140:
        if (r25.dataPosition() >= r47) goto L151;
        int r137 = r25.readInt();
        char r138 = (char) r137;
        if (r138 != 1) goto L143;
        r14 = l93.u(r25, r137);
        goto L140
    L143:
        if (r138 != 2) goto L144;
        r48 = (p61[]) l93.y(r25, r137, p61.CREATOR);
        goto L140
    L144:
        if (r138 != 3) goto L145;
        r6 = l93.W(r25, r137);
        goto L140
    L145:
        if (r138 != 4) goto L146;
        r49 = (pa0) l93.w(r25, r137, pa0.CREATOR);
        goto L140
    L146:
        l93.m0(r25, r137);
        goto L140
    L151:
        l93.H(r25, r47);
        jk5 r50 = new jk5();
        r50.n = r14;
        r50.o = r48;
        r50.p = r6;
        r50.q = r49;
        return r50;
    L153:
        int r51 = l93.p0(r25);
        byte[] r52 = null;
        byte[] r53 = null;
        byte[] r54 = null;
        String[] r139 = null;
    L155:
        if (r25.dataPosition() >= r51) goto L169;
        int r140 = r25.readInt();
        char r141 = (char) r140;
        if (r141 != 2) goto L158;
        r52 = l93.v(r25, r140);
        goto L155
    L158:
        if (r141 != 3) goto L159;
        r53 = l93.v(r25, r140);
        goto L155
    L159:
        if (r141 != 4) goto L160;
        r54 = l93.v(r25, r140);
        goto L155
    L160:
        if (r141 != 5) goto L161;
        int r142 = l93.Z(r25, r140);
        int r143 = r25.dataPosition();
        if (r142 == 0) goto L164;
        String[] r144 = r25.createStringArray();
        r25.setDataPosition(r143 + r142);
        r139 = r144;
        goto L155
    L164:
        r139 = null;
        goto L155
    L161:
        l93.m0(r25, r140);
        goto L155
    L169:
        l93.H(r25, r51);
        return new kn(r52, r53, r54, r139);
    L171:
        int r55 = l93.p0(r25);
        byte[] r145 = null;
        byte[] r146 = null;
        byte[] r147 = null;
        byte[] r148 = null;
        byte[] r149 = null;
    L173:
        if (r25.dataPosition() >= r55) goto L187;
        int r56 = r25.readInt();
        char r57 = (char) r56;
        if (r57 != 2) goto L176;
        r145 = l93.v(r25, r56);
        goto L173
    L176:
        if (r57 != 3) goto L177;
        r146 = l93.v(r25, r56);
        goto L173
    L177:
        if (r57 != 4) goto L178;
        r147 = l93.v(r25, r56);
        goto L173
    L178:
        if (r57 != 5) goto L180;
        r148 = l93.v(r25, r56);
        goto L173
    L180:
        if (r57 != 6) goto L181;
        r149 = l93.v(r25, r56);
        goto L173
    L181:
        l93.m0(r25, r56);
        goto L173
    L187:
        l93.H(r25, r55);
        return new jn(r145, r146, r147, r148, r149);
    L189:
        int r58 = l93.p0(r25);
        byte[] r59 = null;
    L191:
        if (r25.dataPosition() >= r58) goto L198;
        int r60 = r25.readInt();
        char r61 = (char) r60;
        if (r61 != 1) goto L194;
        r7 = l93.V(r25, r60);
        goto L191
    L194:
        if (r61 != 2) goto L195;
        r59 = l93.v(r25, r60);
        goto L191
    L195:
        l93.m0(r25, r60);
        goto L191
    L198:
        l93.H(r25, r58);
        if (r59 == null) goto L203;
        r15 = rj5.i(r59.length, r59);
    L203:
        return new sj5(r7, r15);
    L204:
        int r62 = l93.p0(r25);
        byte[] r63 = null;
        byte[] r64 = null;
    L206:
        if (r25.dataPosition() >= r62) goto L213;
        int r65 = r25.readInt();
        char r66 = (char) r65;
        if (r66 != 1) goto L209;
        r63 = l93.v(r25, r65);
        goto L206
    L209:
        if (r66 != 2) goto L210;
        r64 = l93.v(r25, r65);
        goto L206
    L210:
        l93.m0(r25, r65);
        goto L206
    L213:
        l93.H(r25, r62);
        if (r63 != null) goto L216;
        rj5 r67 = null;
    L217:
        if (r64 == null) goto L221;
        r16 = rj5.i(r64.length, r64);
    L221:
        return new zi5(r67, r16);
    L216:
        r67 = rj5.i(r63.length, r63);
        goto L217
    L222:
        int r68 = l93.p0(r25);
    L224:
        if (r25.dataPosition() >= r68) goto L229;
        int r69 = r25.readInt();
        if (((char) r69) != 1) goto L227;
        r8 = l93.V(r25, r69);
        goto L224
    L227:
        l93.m0(r25, r69);
        goto L224
    L229:
        l93.H(r25, r68);
        return new in(r8);
    L231:
        int r70 = l93.p0(r25);
        s61 r150 = null;
        rk5 r151 = null;
        y25 r152 = null;
        wk5 r153 = null;
        gh5 r154 = null;
        hh5 r155 = null;
        uk5 r156 = null;
        kh5 r157 = null;
        pj1 r158 = null;
        mh5 r159 = null;
        nh5 r210 = null;
        lh5 r211 = null;
    L233:
        if (r25.dataPosition() >= r70) goto L249;
        int r71 = r25.readInt();
        switch(((char) r71)) {
            case 2: goto L248;
            case 3: goto L247;
            case 4: goto L246;
            case 5: goto L245;
            case 6: goto L244;
            case 7: goto L243;
            case 8: goto L242;
            case 9: goto L241;
            case 10: goto L240;
            case 11: goto L239;
            case 12: goto L238;
            case 13: goto L237;
            default: goto L236;
        };
    L237:
        r211 = (lh5) l93.w(r25, r71, lh5.CREATOR);
        goto L233
    L238:
        r210 = (nh5) l93.w(r25, r71, nh5.CREATOR);
        goto L233
    L239:
        r159 = (mh5) l93.w(r25, r71, mh5.CREATOR);
        goto L233
    L240:
        r158 = (pj1) l93.w(r25, r71, pj1.CREATOR);
        goto L233
    L241:
        r157 = (kh5) l93.w(r25, r71, kh5.CREATOR);
        goto L233
    L242:
        r156 = (uk5) l93.w(r25, r71, uk5.CREATOR);
        goto L233
    L243:
        r155 = (hh5) l93.w(r25, r71, hh5.CREATOR);
        goto L233
    L244:
        r154 = (gh5) l93.w(r25, r71, gh5.CREATOR);
        goto L233
    L245:
        r153 = (wk5) l93.w(r25, r71, wk5.CREATOR);
        goto L233
    L246:
        r152 = (y25) l93.w(r25, r71, y25.CREATOR);
        goto L233
    L247:
        r151 = (rk5) l93.w(r25, r71, rk5.CREATOR);
        goto L233
    L248:
        r150 = (s61) l93.w(r25, r71, s61.CREATOR);
        goto L233
    L236:
        l93.m0(r25, r71);
        goto L233
    L249:
        l93.H(r25, r70);
        return new gn(r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r210, r211);
    L251:
        int r72 = l93.p0(r25);
        long r73 = -1;
    L253:
        if (r25.dataPosition() >= r72) goto L262;
        int r74 = r25.readInt();
        char r160 = (char) r74;
        if (r160 != 1) goto L256;
        r10 = l93.x(r25, r74);
        goto L253
    L256:
        if (r160 != 2) goto L257;
        r9 = l93.W(r25, r74);
        goto L253
    L257:
        if (r160 != 3) goto L258;
        r73 = l93.X(r25, r74);
        goto L253
    L258:
        l93.m0(r25, r74);
        goto L253
    L262:
        l93.H(r25, r72);
        return new p61(r9, r73, r10);
    L264:
        int r75 = l93.p0(r25);
        g35 r161 = null;
        zi5 r162 = null;
        in r163 = null;
        sj5 r164 = null;
        String r165 = null;
    L266:
        if (r25.dataPosition() >= r75) goto L279;
        int r76 = r25.readInt();
        char r77 = (char) r76;
        if (r77 != 1) goto L269;
        r161 = (g35) l93.w(r25, r76, g35.CREATOR);
        goto L266
    L269:
        if (r77 != 2) goto L270;
        r162 = (zi5) l93.w(r25, r76, zi5.CREATOR);
        goto L266
    L270:
        if (r77 != 3) goto L271;
        r163 = (in) l93.w(r25, r76, in.CREATOR);
        goto L266
    L271:
        if (r77 != 4) goto L272;
        r164 = (sj5) l93.w(r25, r76, sj5.CREATOR);
        goto L266
    L272:
        if (r77 != 5) goto L273;
        r165 = l93.x(r25, r76);
        goto L266
    L273:
        l93.m0(r25, r76);
        goto L266
    L279:
        l93.H(r25, r75);
        return new hn(r161, r162, r163, r164, r165);
    L281:
        int r78 = l93.p0(r25);
        short r79 = 0;
        short r80 = 0;
    L283:
        if (r25.dataPosition() >= r78) goto L292;
        int r81 = r25.readInt();
        char r166 = (char) r81;
        if (r166 != 1) goto L286;
        r4 = l93.W(r25, r81);
        goto L283
    L286:
        if (r166 != 2) goto L287;
        l93.t0(r25, r81, 4);
        r79 = (short) r25.readInt();
        goto L283
    L287:
        if (r166 != 3) goto L288;
        l93.t0(r25, r81, 4);
        r80 = (short) r25.readInt();
        goto L283
    L288:
        l93.m0(r25, r81);
        goto L283
    L292:
        l93.H(r25, r78);
        return new h35(r4, r79, r80);
    L296:
        return c21.a(r25.readInt());
    L16:
        e = move-exception;
        throw new IllegalArgumentException(e);
    L294:
        return bx.a(r25.readInt());
    L55:
        e = move-exception;
        er1.m(e);
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        switch(this.a) {
            case 0: goto L43;
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L33;
            case 6: goto L31;
            case 7: goto L29;
            case 8: goto L27;
            case 9: goto L25;
            case 10: goto L23;
            case 11: goto L21;
            case 12: goto L19;
            case 13: goto L17;
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            case 17: goto L9;
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        return new s61[r1];
    L7:
        return new c21[r1];
    L9:
        return new uk5[r1];
    L11:
        return new rk5[r1];
    L13:
        return new qk5[r1];
    L15:
        return new bx[r1];
    L17:
        return new sh1[r1];
    L19:
        return new nn[r1];
    L21:
        return new pa0[r1];
    L23:
        return new ln[r1];
    L25:
        return new jk5[r1];
    L27:
        return new kn[r1];
    L29:
        return new jn[r1];
    L31:
        return new sj5[r1];
    L33:
        return new zi5[r1];
    L35:
        return new in[r1];
    L37:
        return new gn[r1];
    L39:
        return new p61[r1];
    L41:
        return new hn[r1];
    L43:
        return new h35[r1];
    }
}
