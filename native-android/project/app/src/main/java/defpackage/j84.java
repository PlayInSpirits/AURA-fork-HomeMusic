package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.subsonic.models.SimilarArtistID3;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j84 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ j84(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r25) {
        boolean r7 = true;
        int r8 = 0;
        int r9 = 0;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        ArrayList r18 = null;
        PendingIntent r19 = null;
        vd4 r20 = null;
        byte[] r21 = null;
        String r22 = null;
        PendingIntent r23 = null;
        GoogleSignInAccount r24 = null;
        Account r26 = null;
        ka0 r27 = null;
        ArrayList r28 = null;
        Intent r29 = null;
        ArrayList r30 = null;
        Bundle r31 = null;
        switch(this.a) {
            case 0: goto L339;
            case 1: goto L332;
            case 2: goto L324;
            case 3: goto L322;
            case 4: goto L320;
            case 5: goto L312;
            case 6: goto L292;
            case 7: goto L291;
            case 8: goto L289;
            case 9: goto L287;
            case 10: goto L273;
            case 11: goto L262;
            case 12: goto L249;
            case 13: goto L229;
            case 14: goto L211;
            case 15: goto L197;
            case 16: goto L184;
            case 17: goto L167;
            case 18: goto L152;
            case 19: goto L131;
            case 20: goto L116;
            case 21: goto L100;
            case 22: goto L91;
            case 23: goto L77;
            case 24: goto L59;
            case 25: goto L48;
            case 26: goto L35;
            case 27: goto L26;
            case 28: goto L13;
            default: goto L4;
        };
    L4:
        int r0 = l93.p0(r25);
    L6:
        if (r25.dataPosition() >= r0) goto L11;
        int r2 = r25.readInt();
        if (((char) r2) != 1) goto L9;
        r19 = (PendingIntent) l93.w(r25, r2, PendingIntent.CREATOR);
        goto L6
    L9:
        l93.m0(r25, r2);
        goto L6
    L11:
        l93.H(r25, r0);
        return new s44(r19);
    L13:
        int r1 = l93.p0(r25);
        String r3 = null;
    L15:
        if (r25.dataPosition() >= r1) goto L24;
        int r4 = r25.readInt();
        char r5 = (char) r4;
        if (r5 != 1) goto L18;
        r20 = (vd4) l93.w(r25, r4, vd4.CREATOR);
        goto L15
    L18:
        if (r5 != 2) goto L19;
        r3 = l93.x(r25, r4);
        goto L15
    L19:
        if (r5 != 3) goto L20;
        r9 = l93.W(r25, r4);
        goto L15
    L20:
        l93.m0(r25, r4);
        goto L15
    L24:
        l93.H(r25, r1);
        return new r44(r20, r3, r9);
    L26:
        int r6 = l93.p0(r25);
    L28:
        if (r25.dataPosition() >= r6) goto L33;
        int r32 = r25.readInt();
        if (((char) r32) != 1) goto L31;
        r10 = l93.V(r25, r32);
        goto L28
    L31:
        l93.m0(r25, r32);
        goto L28
    L33:
        l93.H(r25, r6);
        return new bs(r10);
    L35:
        int r33 = l93.p0(r25);
        String r34 = null;
    L37:
        if (r25.dataPosition() >= r33) goto L46;
        int r35 = r25.readInt();
        char r36 = (char) r35;
        if (r36 != 1) goto L40;
        r11 = l93.V(r25, r35);
        goto L37
    L40:
        if (r36 != 2) goto L41;
        r21 = l93.v(r25, r35);
        goto L37
    L41:
        if (r36 != 3) goto L42;
        r34 = l93.x(r25, r35);
        goto L37
    L42:
        l93.m0(r25, r35);
        goto L37
    L46:
        l93.H(r25, r33);
        return new as(r11, r21, r34);
    L48:
        int r37 = l93.p0(r25);
    L50:
        if (r25.dataPosition() >= r37) goto L57;
        int r38 = r25.readInt();
        char r39 = (char) r38;
        if (r39 != 1) goto L53;
        r12 = l93.V(r25, r38);
        goto L50
    L53:
        if (r39 != 2) goto L54;
        r22 = l93.x(r25, r38);
        goto L50
    L54:
        l93.m0(r25, r38);
        goto L50
    L57:
        l93.H(r25, r37);
        return new zr(r12, r22);
    L59:
        int r40 = l93.p0(r25);
        boolean r110 = false;
        boolean r111 = false;
        boolean r112 = false;
        String r113 = null;
        String r114 = null;
        String r115 = null;
        ArrayList<String> r116 = null;
    L61:
        if (r25.dataPosition() >= r40) goto L75;
        int r41 = r25.readInt();
        switch(((char) r41)) {
            case 1: goto L74;
            case 2: goto L73;
            case 3: goto L72;
            case 4: goto L71;
            case 5: goto L70;
            case 6: goto L66;
            case 7: goto L65;
            default: goto L64;
        };
    L65:
        r112 = l93.V(r25, r41);
        goto L61
    L66:
        int r42 = l93.Z(r25, r41);
        int r43 = r25.dataPosition();
        if (r42 == 0) goto L68;
        ArrayList<String> r44 = r25.createStringArrayList();
        r25.setDataPosition(r43 + r42);
        r116 = r44;
        goto L61
    L68:
        r116 = null;
        goto L61
    L70:
        r115 = l93.x(r25, r41);
        goto L61
    L71:
        r111 = l93.V(r25, r41);
        goto L61
    L72:
        r114 = l93.x(r25, r41);
        goto L61
    L73:
        r113 = l93.x(r25, r41);
        goto L61
    L74:
        r110 = l93.V(r25, r41);
        goto L61
    L64:
        l93.m0(r25, r41);
        goto L61
    L75:
        l93.H(r25, r40);
        return new yr(r110, r113, r114, r111, r115, r116, r112);
    L77:
        int r45 = l93.p0(r25);
        boolean r46 = false;
        int r47 = 0;
        String r48 = null;
        String r49 = null;
        String r50 = null;
        String r51 = null;
    L79:
        if (r25.dataPosition() >= r45) goto L89;
        int r52 = r25.readInt();
        switch(((char) r52)) {
            case 1: goto L88;
            case 2: goto L87;
            case 3: goto L86;
            case 4: goto L85;
            case 5: goto L84;
            case 6: goto L83;
            default: goto L82;
        };
    L83:
        r47 = l93.W(r25, r52);
        goto L79
    L84:
        r46 = l93.V(r25, r52);
        goto L79
    L85:
        r51 = l93.x(r25, r52);
        goto L79
    L86:
        r50 = l93.x(r25, r52);
        goto L79
    L87:
        r49 = l93.x(r25, r52);
        goto L79
    L88:
        r48 = l93.x(r25, r52);
        goto L79
    L82:
        l93.m0(r25, r52);
        goto L79
    L89:
        l93.H(r25, r45);
        return new th1(r48, r49, r50, r51, r46, r47);
    L91:
        int r53 = l93.p0(r25);
    L93:
        if (r25.dataPosition() >= r53) goto L98;
        int r54 = r25.readInt();
        if (((char) r54) != 1) goto L96;
        r23 = (PendingIntent) l93.w(r25, r54, PendingIntent.CREATOR);
        goto L93
    L96:
        l93.m0(r25, r54);
        goto L93
    L98:
        l93.H(r25, r53);
        return new ds(r23);
    L100:
        int r55 = l93.p0(r25);
        boolean r117 = false;
        int r118 = 0;
        boolean r119 = false;
        bs r120 = null;
        yr r121 = null;
        String r122 = null;
        as r123 = null;
        zr r124 = null;
    L102:
        if (r25.dataPosition() >= r55) goto L114;
        int r56 = r25.readInt();
        switch(((char) r56)) {
            case 1: goto L113;
            case 2: goto L112;
            case 3: goto L111;
            case 4: goto L110;
            case 5: goto L109;
            case 6: goto L108;
            case 7: goto L107;
            case 8: goto L106;
            default: goto L105;
        };
    L106:
        r119 = l93.V(r25, r56);
        goto L102
    L107:
        r124 = (zr) l93.w(r25, r56, zr.CREATOR);
        goto L102
    L108:
        r123 = (as) l93.w(r25, r56, as.CREATOR);
        goto L102
    L109:
        r118 = l93.W(r25, r56);
        goto L102
    L110:
        r117 = l93.V(r25, r56);
        goto L102
    L111:
        r122 = l93.x(r25, r56);
        goto L102
    L112:
        r121 = (yr) l93.w(r25, r56, yr.CREATOR);
        goto L102
    L113:
        r120 = (bs) l93.w(r25, r56, bs.CREATOR);
        goto L102
    L105:
        l93.m0(r25, r56);
        goto L102
    L114:
        l93.H(r25, r55);
        return new cs(r120, r121, r122, r117, r118, r123, r124, r119);
    L116:
        int r57 = l93.p0(r25);
        String r58 = "";
        String r59 = "";
    L118:
        if (r25.dataPosition() >= r57) goto L129;
        int r60 = r25.readInt();
        char r61 = (char) r60;
        if (r61 != 4) goto L122;
        r58 = l93.x(r25, r60);
        goto L118
    L122:
        if (r61 != 7) goto L124;
        r24 = (GoogleSignInAccount) l93.w(r25, r60, GoogleSignInAccount.CREATOR);
        goto L118
    L124:
        if (r61 != '\b') goto L125;
        r59 = l93.x(r25, r60);
        goto L118
    L125:
        l93.m0(r25, r60);
        goto L118
    L129:
        l93.H(r25, r57);
        return new SignInAccount(r58, r24, r59);
    L131:
        int r62 = l93.p0(r25);
        int r125 = 0;
        boolean r126 = false;
        boolean r127 = false;
        IBinder r128 = null;
        ka0 r129 = null;
    L133:
        if (r25.dataPosition() >= r62) goto L150;
        int r63 = r25.readInt();
        char r64 = (char) r63;
        if (r64 != 1) goto L136;
        r125 = l93.W(r25, r63);
        goto L133
    L136:
        if (r64 != 2) goto L137;
        int r65 = l93.Z(r25, r63);
        int r66 = r25.dataPosition();
        if (r65 == 0) goto L147;
        IBinder r67 = r25.readStrongBinder();
        r25.setDataPosition(r66 + r65);
        r128 = r67;
        goto L133
    L147:
        r128 = null;
        goto L133
    L137:
        if (r64 != 3) goto L138;
        r129 = (ka0) l93.w(r25, r63, ka0.CREATOR);
        goto L133
    L138:
        if (r64 != 4) goto L140;
        r126 = l93.V(r25, r63);
        goto L133
    L140:
        if (r64 != 5) goto L141;
        r127 = l93.V(r25, r63);
        goto L133
    L141:
        l93.m0(r25, r63);
        goto L133
    L150:
        l93.H(r25, r62);
        return new ig5(r125, r128, r129, r126, r127);
    L152:
        int r68 = l93.p0(r25);
        int r69 = 0;
        GoogleSignInAccount r70 = null;
    L154:
        if (r25.dataPosition() >= r68) goto L165;
        int r130 = r25.readInt();
        char r131 = (char) r130;
        if (r131 != 1) goto L157;
        r13 = l93.W(r25, r130);
        goto L154
    L157:
        if (r131 != 2) goto L158;
        r26 = (Account) l93.w(r25, r130, Account.CREATOR);
        goto L154
    L158:
        if (r131 != 3) goto L159;
        r69 = l93.W(r25, r130);
        goto L154
    L159:
        if (r131 != 4) goto L160;
        r70 = (GoogleSignInAccount) l93.w(r25, r130, GoogleSignInAccount.CREATOR);
        goto L154
    L160:
        l93.m0(r25, r130);
        goto L154
    L165:
        l93.H(r25, r68);
        return new hg5(r13, r26, r69, r70);
    L167:
        int r71 = l93.p0(r25);
        long r132 = 0;
        long r133 = 0;
        int r210 = -1;
        int r134 = 0;
        int r135 = 0;
        int r136 = 0;
        int r211 = 0;
        String r137 = null;
        String r138 = null;
    L169:
        if (r25.dataPosition() >= r71) goto L182;
        int r72 = r25.readInt();
        switch(((char) r72)) {
            case 1: goto L181;
            case 2: goto L180;
            case 3: goto L179;
            case 4: goto L178;
            case 5: goto L177;
            case 6: goto L176;
            case 7: goto L175;
            case 8: goto L174;
            case 9: goto L173;
            default: goto L172;
        };
    L173:
        r210 = l93.W(r25, r72);
        goto L169
    L174:
        r211 = l93.W(r25, r72);
        goto L169
    L175:
        r138 = l93.x(r25, r72);
        goto L169
    L176:
        r137 = l93.x(r25, r72);
        goto L169
    L177:
        r133 = l93.X(r25, r72);
        goto L169
    L178:
        r132 = l93.X(r25, r72);
        goto L169
    L179:
        r136 = l93.W(r25, r72);
        goto L169
    L180:
        r135 = l93.W(r25, r72);
        goto L169
    L181:
        r134 = l93.W(r25, r72);
        goto L169
    L172:
        l93.m0(r25, r72);
        goto L169
    L182:
        l93.H(r25, r71);
        return new iw2(r134, r135, r136, r132, r133, r137, r138, r211, r210);
    L184:
        int r73 = l93.p0(r25);
        ig5 r74 = null;
    L186:
        if (r25.dataPosition() >= r73) goto L195;
        int r75 = r25.readInt();
        char r76 = (char) r75;
        if (r76 != 1) goto L189;
        r14 = l93.W(r25, r75);
        goto L186
    L189:
        if (r76 != 2) goto L190;
        r27 = (ka0) l93.w(r25, r75, ka0.CREATOR);
        goto L186
    L190:
        if (r76 != 3) goto L191;
        r74 = (ig5) l93.w(r25, r75, ig5.CREATOR);
        goto L186
    L191:
        l93.m0(r25, r75);
        goto L186
    L195:
        l93.H(r25, r73);
        return new dg5(r14, r27, r74);
    L197:
        int r77 = l93.p0(r25);
        ArrayList<String> r78 = null;
        String r79 = null;
    L199:
        if (r25.dataPosition() >= r77) goto L209;
        int r80 = r25.readInt();
        char r81 = (char) r80;
        if (r81 != 1) goto L202;
        int r82 = l93.Z(r25, r80);
        int r83 = r25.dataPosition();
        if (r82 == 0) goto L207;
        ArrayList<String> r84 = r25.createStringArrayList();
        r25.setDataPosition(r83 + r82);
        r78 = r84;
        goto L199
    L207:
        r78 = null;
        goto L199
    L202:
        if (r81 != 2) goto L203;
        r79 = l93.x(r25, r80);
        goto L199
    L203:
        l93.m0(r25, r80);
        goto L199
    L209:
        l93.H(r25, r77);
        return new yf5(r79, r78);
    L211:
        int r85 = l93.p0(r25);
        int r139 = 0;
        boolean r140 = false;
        boolean r141 = false;
        boolean r142 = false;
        ArrayList r143 = null;
        Account r144 = null;
        String r145 = null;
        String r146 = null;
        String r212 = null;
    L213:
        if (r25.dataPosition() >= r85) goto L227;
        int r86 = r25.readInt();
        switch(((char) r86)) {
            case 1: goto L226;
            case 2: goto L225;
            case 3: goto L224;
            case 4: goto L223;
            case 5: goto L222;
            case 6: goto L221;
            case 7: goto L220;
            case 8: goto L219;
            case 9: goto L218;
            case 10: goto L217;
            default: goto L216;
        };
    L217:
        r212 = l93.x(r25, r86);
        goto L213
    L218:
        r28 = l93.z(r25, r86, nj1.CREATOR);
        goto L213
    L219:
        r146 = l93.x(r25, r86);
        goto L213
    L220:
        r145 = l93.x(r25, r86);
        goto L213
    L221:
        r142 = l93.V(r25, r86);
        goto L213
    L222:
        r141 = l93.V(r25, r86);
        goto L213
    L223:
        r140 = l93.V(r25, r86);
        goto L213
    L224:
        r144 = (Account) l93.w(r25, r86, Account.CREATOR);
        goto L213
    L225:
        r143 = l93.z(r25, r86, Scope.CREATOR);
        goto L213
    L226:
        r139 = l93.W(r25, r86);
        goto L213
    L216:
        l93.m0(r25, r86);
        goto L213
    L227:
        l93.H(r25, r85);
        return new GoogleSignInOptions(r139, r143, r144, r140, r141, r142, r145, r146, GoogleSignInOptions.c(r28), r212);
    L229:
        int r87 = l93.p0(r25);
        long r147 = 0;
        int r148 = 0;
        String r149 = null;
        String r150 = null;
        String r151 = null;
        String r152 = null;
        Uri r153 = null;
        String r154 = null;
        String r213 = null;
        ArrayList r214 = null;
        String r215 = null;
        String r216 = null;
    L231:
        if (r25.dataPosition() >= r87) goto L247;
        int r88 = r25.readInt();
        switch(((char) r88)) {
            case 1: goto L246;
            case 2: goto L245;
            case 3: goto L244;
            case 4: goto L243;
            case 5: goto L242;
            case 6: goto L241;
            case 7: goto L240;
            case 8: goto L239;
            case 9: goto L238;
            case 10: goto L237;
            case 11: goto L236;
            case 12: goto L235;
            default: goto L234;
        };
    L235:
        r216 = l93.x(r25, r88);
        goto L231
    L236:
        r215 = l93.x(r25, r88);
        goto L231
    L237:
        r214 = l93.z(r25, r88, Scope.CREATOR);
        goto L231
    L238:
        r213 = l93.x(r25, r88);
        goto L231
    L239:
        r147 = l93.X(r25, r88);
        goto L231
    L240:
        r154 = l93.x(r25, r88);
        goto L231
    L241:
        r153 = (Uri) l93.w(r25, r88, Uri.CREATOR);
        goto L231
    L242:
        r152 = l93.x(r25, r88);
        goto L231
    L243:
        r151 = l93.x(r25, r88);
        goto L231
    L244:
        r150 = l93.x(r25, r88);
        goto L231
    L245:
        r149 = l93.x(r25, r88);
        goto L231
    L246:
        r148 = l93.W(r25, r88);
        goto L231
    L234:
        l93.m0(r25, r88);
        goto L231
    L247:
        l93.H(r25, r87);
        return new GoogleSignInAccount(r148, r149, r150, r151, r152, r153, r154, r147, r213, r214, r215, r216);
    L249:
        int r89 = l93.p0(r25);
        int r90 = 0;
    L251:
        if (r25.dataPosition() >= r89) goto L260;
        int r91 = r25.readInt();
        char r92 = (char) r91;
        if (r92 != 1) goto L254;
        r15 = l93.W(r25, r91);
        goto L251
    L254:
        if (r92 != 2) goto L255;
        r90 = l93.W(r25, r91);
        goto L251
    L255:
        if (r92 != 3) goto L256;
        r29 = (Intent) l93.w(r25, r91, Intent.CREATOR);
        goto L251
    L256:
        l93.m0(r25, r91);
        goto L251
    L260:
        l93.H(r25, r89);
        return new bf5(r15, r90, r29);
    L262:
        int r93 = l93.p0(r25);
    L264:
        if (r25.dataPosition() >= r93) goto L271;
        int r94 = r25.readInt();
        char r95 = (char) r94;
        if (r95 != 1) goto L267;
        r16 = l93.W(r25, r94);
        goto L264
    L267:
        if (r95 != 2) goto L268;
        r30 = l93.z(r25, r94, iw2.CREATOR);
        goto L264
    L268:
        l93.m0(r25, r94);
        goto L264
    L271:
        l93.H(r25, r93);
        return new kr4(r30, r16);
    L273:
        int r96 = l93.p0(r25);
        int r97 = 0;
    L275:
        if (r25.dataPosition() >= r96) goto L284;
        int r98 = r25.readInt();
        char r99 = (char) r98;
        if (r99 != 1) goto L278;
        r17 = l93.W(r25, r98);
        goto L275
    L278:
        if (r99 != 2) goto L279;
        r97 = l93.W(r25, r98);
        goto L275
    L279:
        if (r99 != 3) goto L280;
        r31 = l93.u(r25, r98);
        goto L275
    L280:
        l93.m0(r25, r98);
        goto L275
    L284:
        l93.H(r25, r96);
        return new nj1(r17, r97, r31);
    L292:
        qk4 r100 = new qk4();
        r100.n = r25.readInt();
        r100.o = r25.readInt();
        int r101 = r25.readInt();
        r100.p = r101;
        if (r101 <= 0) goto L295;
        int[] r102 = new int[r101];
        r100.q = r102;
        r25.readIntArray(r102);
    L295:
        int r103 = r25.readInt();
        r100.r = r103;
        if (r103 <= 0) goto L299;
        int[] r104 = new int[r103];
        r100.s = r104;
        r25.readIntArray(r104);
    L299:
        if (r25.readInt() != 1) goto L301;
        boolean r105 = true;
    L302:
        r100.u = r105;
        if (r25.readInt() != 1) goto L305;
        boolean r106 = true;
    L306:
        r100.v = r106;
        if (r25.readInt() == 1) goto L310;
        r7 = false;
    L310:
        r100.w = r7;
        r100.t = r25.readArrayList(pk4.class.getClassLoader());
        return r100;
    L305:
        r106 = false;
        goto L306
    L301:
        r105 = false;
        goto L302
    L312:
        pk4 r107 = new pk4();
        r107.n = r25.readInt();
        r107.o = r25.readInt();
        if (r25.readInt() == 1) goto L316;
        r7 = false;
    L316:
        r107.q = r7;
        int r108 = r25.readInt();
        if (r108 <= 0) goto L319;
        int[] r109 = new int[r108];
        r107.p = r109;
        r25.readIntArray(r109);
    L319:
        return r107;
    L320:
        ze4 r155 = new ze4();
        r155.n = (Long) r25.readValue(Long.class.getClassLoader());
        return r155;
    L322:
        r25.getClass();
        r25.readInt();
        return new SimilarArtistID3();
    L324:
        r25.getClass();
        if (r25.readInt() == 0) goto L331;
        int r156 = r25.readInt();
        r18 = new ArrayList(r156);
    L328:
        if (r8 == r156) goto L331;
        r18.add(r25.readParcelable(Share.class.getClassLoader()));
        r8 = r8 + 1;
    L331:
        return new Share(r18, r25.readString(), r25.readString(), r25.readString(), r25.readString(), (Date) r25.readSerializable(), (Date) r25.readSerializable(), (Date) r25.readSerializable(), r25.readInt());
    L332:
        r25.getClass();
        String r157 = r25.readString();
        String r158 = r25.readString();
        String r159 = r25.readString();
        String r160 = r25.readString();
        String r161 = r25.readString();
        String r162 = r25.readString();
        long r163 = r25.readLong();
        if (r25.readInt() == 0) goto L335;
        boolean r217 = true;
    L337:
        return new Server(r157, r158, r159, r160, r161, r162, r163, r217, r25.readString());
    L335:
        r217 = false;
        goto L337
    L287:
        return new zy4(r25);
    L289:
        return new op4(r25);
    L291:
        return new fm4(r25);
    L339:
        return new k84(r25);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
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
        return new s44[r1];
    L7:
        return new r44[r1];
    L9:
        return new bs[r1];
    L11:
        return new as[r1];
    L13:
        return new zr[r1];
    L15:
        return new yr[r1];
    L17:
        return new th1[r1];
    L19:
        return new ds[r1];
    L21:
        return new cs[r1];
    L23:
        return new SignInAccount[r1];
    L25:
        return new ig5[r1];
    L27:
        return new hg5[r1];
    L29:
        return new iw2[r1];
    L31:
        return new dg5[r1];
    L33:
        return new yf5[r1];
    L35:
        return new GoogleSignInOptions[r1];
    L37:
        return new GoogleSignInAccount[r1];
    L39:
        return new bf5[r1];
    L41:
        return new kr4[r1];
    L43:
        return new nj1[r1];
    L45:
        return new zy4[r1];
    L47:
        return new op4[r1];
    L49:
        return new fm4[r1];
    L51:
        return new qk4[r1];
    L53:
        return new pk4[r1];
    L55:
        return new ze4[r1];
    L57:
        return new SimilarArtistID3[r1];
    L59:
        return new Share[r1];
    L61:
        return new Server[r1];
    L63:
        return new k84[r1];
    }
}
