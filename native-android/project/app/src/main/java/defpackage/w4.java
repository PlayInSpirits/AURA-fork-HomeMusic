package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumWithSongsID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.DiscTitle;
import com.eddyizm.tempus.subsonic.models.ItemDate;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ w4(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r42) {
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
        int r5 = 0;
        boolean r6 = false;
        switch(this.a) {
            case 0: goto L280;
            case 1: goto L274;
            case 2: goto L222;
            case 3: goto L214;
            case 4: goto L209;
            case 5: goto L198;
            case 6: goto L196;
            case 7: goto L182;
            case 8: goto L181;
            case 9: goto L179;
            case 10: goto L176;
            case 11: goto L174;
            case 12: goto L173;
            case 13: goto L102;
            case 14: goto L100;
            case 15: goto L91;
            case 16: goto L82;
            case 17: goto L73;
            case 18: goto L61;
            case 19: goto L47;
            case 20: goto L46;
            case 21: goto L44;
            case 22: goto L22;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L14:
        r42.getClass();
        return new Download(r42.readString(), r42.readString(), r42.readString(), r42.readInt(), r42.readString());
    L16:
        r42.getClass();
        if (r42.readInt() != 0) goto L19;
        Integer r7 = null;
    L21:
        return new DiscTitle(r7, r42.readString());
    L19:
        r7 = Integer.valueOf(r42.readInt());
        goto L21
    L22:
        r42.getClass();
        if (r42.readInt() != 0) goto L25;
        ArrayList r8 = null;
    L29:
        String r9 = r42.readString();
        String r10 = r42.readString();
        String r11 = r42.readString();
        Date r12 = (Date) r42.readSerializable();
        if (r42.readInt() != 0) goto L32;
        Integer r13 = null;
    L34:
        if (r42.readInt() != 0) goto L36;
        Double r14 = null;
    L38:
        if (r42.readInt() != 0) goto L40;
        Long r15 = null;
    L42:
        return new Directory(r8, r9, r10, r11, r12, r13, r14, r15);
    L40:
        r15 = Long.valueOf(r42.readLong());
        goto L42
    L36:
        r14 = Double.valueOf(r42.readDouble());
        goto L38
    L32:
        r13 = Integer.valueOf(r42.readInt());
        goto L34
    L25:
        int r1 = r42.readInt();
        ArrayList r16 = new ArrayList(r1);
    L26:
        if (r3 == r1) goto L28;
        r16.add(r42.readParcelable(Directory.class.getClassLoader()));
        r3 = r3 + 1;
        goto L26
    L28:
        r8 = r16;
        goto L29
    L47:
        int r17 = l93.p0(r42);
        String r18 = "";
        String r19 = r18;
        String r110 = r19;
        Bundle r20 = null;
        Bundle r21 = null;
        String r22 = null;
    L49:
        if (r42.dataPosition() >= r17) goto L59;
        int r23 = r42.readInt();
        switch(((char) r23)) {
            case 1: goto L58;
            case 2: goto L57;
            case 3: goto L56;
            case 4: goto L55;
            case 5: goto L54;
            case 6: goto L53;
            default: goto L52;
        };
    L53:
        r110 = l93.x(r42, r23);
        goto L49
    L54:
        r19 = l93.x(r42, r23);
        goto L49
    L55:
        r22 = l93.x(r42, r23);
        goto L49
    L56:
        r21 = l93.u(r42, r23);
        goto L49
    L57:
        r20 = l93.u(r42, r23);
        goto L49
    L58:
        r18 = l93.x(r42, r23);
        goto L49
    L52:
        l93.m0(r42, r23);
        goto L49
    L59:
        l93.H(r42, r17);
        return new wf0(r18, r20, r21, r22, r19, r110);
    L61:
        int r24 = l93.p0(r42);
        Bundle r25 = null;
        String r26 = null;
    L63:
        if (r42.dataPosition() >= r24) goto L71;
        int r27 = r42.readInt();
        char r28 = (char) r27;
        if (r28 != 1) goto L67;
        r26 = l93.x(r42, r27);
        goto L63
    L67:
        if (r28 != 2) goto L68;
        r25 = l93.u(r42, r27);
        goto L63
    L68:
        l93.m0(r42, r27);
        goto L63
    L71:
        l93.H(r42, r24);
        return new uf0(r26, r25);
    L73:
        int r29 = l93.p0(r42);
        Bundle r30 = null;
    L75:
        if (r42.dataPosition() >= r29) goto L80;
        int r31 = r42.readInt();
        if (((char) r31) != 1) goto L78;
        r30 = l93.u(r42, r31);
        goto L75
    L78:
        l93.m0(r42, r31);
        goto L75
    L80:
        l93.H(r42, r29);
        return new rf0(r30);
    L82:
        int r32 = l93.p0(r42);
        Bundle r33 = null;
    L84:
        if (r42.dataPosition() >= r32) goto L89;
        int r34 = r42.readInt();
        if (((char) r34) != 1) goto L87;
        r33 = l93.u(r42, r34);
        goto L84
    L87:
        l93.m0(r42, r34);
        goto L84
    L89:
        l93.H(r42, r32);
        return new pf0(r33);
    L91:
        int r35 = l93.p0(r42);
    L93:
        if (r42.dataPosition() >= r35) goto L98;
        int r36 = r42.readInt();
        if (((char) r36) != 1) goto L96;
        r4 = l93.V(r42, r36);
        goto L93
    L96:
        l93.m0(r42, r36);
        goto L93
    L98:
        l93.H(r42, r35);
        return new o30(r4);
    L100:
        r42.getClass();
        return new Chronology(r42.readString(), r42.readLong(), r42.readString());
    L102:
        r42.getClass();
        String r37 = r42.readString();
        String r38 = r42.readString();
        if (r42.readInt() == 0) goto L105;
        boolean r39 = true;
    L106:
        String r40 = r42.readString();
        String r111 = r42.readString();
        String r112 = r42.readString();
        if (r42.readInt() != 0) goto L109;
        Integer r113 = null;
    L111:
        if (r42.readInt() != 0) goto L113;
        Integer r114 = null;
    L114:
        String r115 = r42.readString();
        String r116 = r42.readString();
        if (r42.readInt() != 0) goto L117;
        Long r117 = null;
    L118:
        String r118 = r42.readString();
        String r119 = r42.readString();
        String r120 = r42.readString();
        String r210 = r42.readString();
        if (r42.readInt() != 0) goto L121;
        Integer r211 = null;
    L123:
        if (r42.readInt() != 0) goto L125;
        Integer r212 = null;
    L127:
        if (r42.readInt() != 0) goto L129;
        Integer r213 = null;
    L131:
        if (r42.readInt() != 0) goto L133;
        Integer r214 = null;
    L134:
        String r215 = r42.readString();
        if (r42.readInt() == 0) goto L137;
        boolean r216 = true;
    L139:
        if (r42.readInt() != 0) goto L141;
        Integer r217 = null;
    L143:
        if (r42.readInt() != 0) goto L145;
        Double r218 = null;
    L147:
        if (r42.readInt() != 0) goto L149;
        Long r219 = null;
    L151:
        if (r42.readInt() != 0) goto L153;
        Integer r310 = null;
    L154:
        Date r311 = (Date) r42.readSerializable();
        Date r312 = (Date) r42.readSerializable();
        String r313 = r42.readString();
        String r314 = r42.readString();
        String r315 = r42.readString();
        if (r42.readInt() != 0) goto L157;
        Long r316 = null;
    L159:
        if (r42.readInt() != 0) goto L161;
        Integer r317 = null;
    L163:
        if (r42.readInt() != 0) goto L165;
        Integer r318 = null;
    L167:
        if (r42.readInt() != 0) goto L169;
        ReplayGainInfo r41 = null;
    L171:
        return new Child(r37, r38, r39, r40, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r310, r311, r312, r313, r314, r315, r316, r317, r318, r41, r42.readString());
    L169:
        r41 = ReplayGainInfo.CREATOR.createFromParcel(r42);
        goto L171
    L165:
        r318 = Integer.valueOf(r42.readInt());
        goto L167
    L161:
        r317 = Integer.valueOf(r42.readInt());
        goto L163
    L157:
        r316 = Long.valueOf(r42.readLong());
        goto L159
    L153:
        r310 = Integer.valueOf(r42.readInt());
        goto L154
    L149:
        r219 = Long.valueOf(r42.readLong());
        goto L151
    L145:
        r218 = Double.valueOf(r42.readDouble());
        goto L147
    L141:
        r217 = Integer.valueOf(r42.readInt());
        goto L143
    L137:
        r216 = false;
        goto L139
    L133:
        r214 = Integer.valueOf(r42.readInt());
        goto L134
    L129:
        r213 = Integer.valueOf(r42.readInt());
        goto L131
    L125:
        r212 = Integer.valueOf(r42.readInt());
        goto L127
    L121:
        r211 = Integer.valueOf(r42.readInt());
        goto L123
    L117:
        r117 = Long.valueOf(r42.readLong());
        goto L118
    L113:
        r114 = Integer.valueOf(r42.readInt());
        goto L114
    L109:
        r113 = Integer.valueOf(r42.readInt());
        goto L111
    L105:
        r39 = false;
        goto L106
    L174:
        tq r43 = new tq(r42);
        r43.n = r42.readFloat();
        r43.o = r42.readFloat();
        ArrayList r44 = new ArrayList();
        r43.p = r44;
        r42.readList(r44, Float.class.getClassLoader());
        r43.q = r42.readFloat();
        r43.r = r42.createBooleanArray()[0];
        return r43;
    L176:
        zo r45 = new zo();
        r45.v = 255;
        r45.x = -2;
        r45.y = -2;
        r45.z = -2;
        r45.G = Boolean.TRUE;
        r45.n = r42.readInt();
        r45.o = (Integer) r42.readSerializable();
        r45.p = (Integer) r42.readSerializable();
        r45.q = (Integer) r42.readSerializable();
        r45.r = (Integer) r42.readSerializable();
        r45.s = (Integer) r42.readSerializable();
        r45.t = (Integer) r42.readSerializable();
        r45.u = (Integer) r42.readSerializable();
        r45.v = r42.readInt();
        r45.w = r42.readString();
        r45.x = r42.readInt();
        r45.y = r42.readInt();
        r45.z = r42.readInt();
        r45.B = r42.readString();
        r45.C = r42.readString();
        r45.D = r42.readInt();
        r45.F = (Integer) r42.readSerializable();
        r45.H = (Integer) r42.readSerializable();
        r45.I = (Integer) r42.readSerializable();
        r45.J = (Integer) r42.readSerializable();
        r45.K = (Integer) r42.readSerializable();
        r45.L = (Integer) r42.readSerializable();
        r45.M = (Integer) r42.readSerializable();
        r45.P = (Integer) r42.readSerializable();
        r45.N = (Integer) r42.readSerializable();
        r45.O = (Integer) r42.readSerializable();
        r45.G = (Boolean) r42.readSerializable();
        r45.A = (Locale) r42.readSerializable();
        r45.Q = (Boolean) r42.readSerializable();
        return r45;
    L182:
        r42.getClass();
        if (r42.readInt() != 0) goto L185;
        ArrayList r46 = null;
    L189:
        if (r42.readInt() != 0) goto L191;
        ArrayList r47 = null;
    L195:
        return new ArtistWithAlbumsID3(r46, r47);
    L191:
        int r48 = r42.readInt();
        r47 = new ArrayList(r48);
    L192:
        if (r5 == r48) goto L195;
        r47.add(r42.readParcelable(ArtistWithAlbumsID3.class.getClassLoader()));
        r5 = r5 + 1;
        goto L192
    L185:
        int r49 = r42.readInt();
        r46 = new ArrayList(r49);
        int r50 = 0;
    L186:
        if (r50 == r49) goto L189;
        r46.add(r42.readParcelable(ArtistWithAlbumsID3.class.getClassLoader()));
        r50 = r50 + 1;
        goto L186
    L196:
        r42.getClass();
        return new ArtistID3(r42.readString(), r42.readString(), r42.readString(), r42.readInt(), (Date) r42.readSerializable());
    L198:
        r42.getClass();
        String r51 = r42.readString();
        String r52 = r42.readString();
        Date r53 = (Date) r42.readSerializable();
        if (r42.readInt() != 0) goto L201;
        Integer r54 = null;
    L203:
        if (r42.readInt() != 0) goto L206;
        Double r55 = null;
    L208:
        return new Artist(r51, r52, r53, r54, r55);
    L206:
        r55 = Double.valueOf(r42.readDouble());
        goto L208
    L201:
        r54 = Integer.valueOf(r42.readInt());
        goto L203
    L209:
        zg r0 = new zg(r42);
        if (r42.readByte() == 0) goto L212;
        r6 = true;
    L212:
        r0.n = r6;
        return r0;
    L214:
        r42.getClass();
        if (r42.readInt() != 0) goto L217;
        ArrayList r56 = null;
    L221:
        return new AlbumWithSongsID3(r56);
    L217:
        int r57 = r42.readInt();
        r56 = new ArrayList(r57);
    L218:
        if (r2 == r57) goto L221;
        r56.add(r42.readParcelable(AlbumWithSongsID3.class.getClassLoader()));
        r2 = r2 + 1;
        goto L218
    L222:
        r42.getClass();
        String r58 = r42.readString();
        String r59 = r42.readString();
        String r60 = r42.readString();
        String r61 = r42.readString();
        String r121 = r42.readString();
        if (r42.readInt() != 0) goto L225;
        Integer r122 = null;
    L227:
        if (r42.readInt() != 0) goto L229;
        Integer r123 = null;
    L231:
        if (r42.readInt() != 0) goto L233;
        Long r124 = null;
    L234:
        Date r125 = (Date) r42.readSerializable();
        Date r126 = (Date) r42.readSerializable();
        int r127 = r42.readInt();
        String r128 = r42.readString();
        Date r129 = (Date) r42.readSerializable();
        if (r42.readInt() != 0) goto L237;
        Integer r130 = null;
    L239:
        if (r42.readInt() != 0) goto L242;
        ArrayList r62 = null;
    L245:
        String r220 = r42.readString();
        if (r42.readInt() != 0) goto L248;
        ArrayList r63 = null;
    L252:
        if (r42.readInt() != 0) goto L254;
        Class r221 = AlbumID3.class;
        ArrayList r64 = null;
    L257:
        String r222 = r42.readString();
        ArrayList<String> r223 = r42.createStringArrayList();
        ArrayList<String> r224 = r42.createStringArrayList();
        String r225 = r42.readString();
        ItemDate r226 = (ItemDate) r42.readParcelable(r221.getClassLoader());
        ItemDate r227 = (ItemDate) r42.readParcelable(r221.getClassLoader());
        if (r42.readInt() != 0) goto L261;
        Boolean r319 = null;
    L266:
        if (r42.readInt() != 0) goto L268;
        ArrayList r320 = null;
    L273:
        return new AlbumID3(r58, r59, r60, r61, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r62, r220, r63, r64, r222, r223, r224, r225, r226, r227, r319, r320);
    L268:
        int r65 = r42.readInt();
        ArrayList r66 = new ArrayList(r65);
        int r67 = 0;
    L269:
        if (r67 == r65) goto L271;
        r66.add(r42.readParcelable(r221.getClassLoader()));
        r67 = r67 + 1;
        r65 = r65;
        goto L269
    L271:
        r320 = r66;
        goto L273
    L261:
        if (r42.readInt() == 0) goto L263;
        boolean r228 = true;
    L264:
        r319 = Boolean.valueOf(r228);
        goto L266
    L263:
        r228 = false;
        goto L264
    L254:
        int r68 = r42.readInt();
        r64 = new ArrayList(r68);
        r221 = AlbumID3.class;
        int r69 = 0;
    L255:
        if (r69 == r68) goto L257;
        r64.add(r42.readParcelable(r221.getClassLoader()));
        r69 = r69 + 1;
        r68 = r68;
        goto L255
    L248:
        int r70 = r42.readInt();
        r63 = new ArrayList(r70);
        int r71 = 0;
    L249:
        if (r71 == r70) goto L252;
        r63.add(r42.readParcelable(AlbumID3.class.getClassLoader()));
        r71 = r71 + 1;
        goto L249
    L242:
        int r72 = r42.readInt();
        r62 = new ArrayList(r72);
        int r73 = 0;
    L243:
        if (r73 == r72) goto L245;
        r62.add(r42.readParcelable(AlbumID3.class.getClassLoader()));
        r73 = r73 + 1;
        goto L243
    L237:
        r130 = Integer.valueOf(r42.readInt());
        goto L239
    L233:
        r124 = Long.valueOf(r42.readLong());
        goto L234
    L229:
        r123 = Integer.valueOf(r42.readInt());
        goto L231
    L225:
        r122 = Integer.valueOf(r42.readInt());
        goto L227
    L274:
        r42.getClass();
        int r74 = r42.readInt();
        if (r42.readInt() != 0) goto L277;
        Intent r75 = null;
    L279:
        return new o5(r75, r74);
    L277:
        r75 = (Intent) Intent.CREATOR.createFromParcel(r42);
        goto L279
    L280:
        x4 r76 = new x4();
        r76.n = r42.readInt();
        return r76;
    L5:
        return new nw0(r42);
    L7:
        return new ow0(r42);
    L9:
        return new st0(r42);
    L11:
        return new rt0(r42);
    L13:
        return new tt0(r42);
    L44:
        return new ql0(r42.readInt());
    L46:
        return new pi0(r42.readLong());
    L173:
        return new dy((ix2) r42.readParcelable(ix2.class.getClassLoader()), (ix2) r42.readParcelable(ix2.class.getClassLoader()), (pi0) r42.readParcelable(pi0.class.getClassLoader()), (ix2) r42.readParcelable(ix2.class.getClassLoader()), r42.readInt());
    L179:
        return new ro(r42);
    L181:
        return new qo(r42);
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
        return new nw0[r1];
    L7:
        return new ow0[r1];
    L9:
        return new st0[r1];
    L11:
        return new rt0[r1];
    L13:
        return new tt0[r1];
    L15:
        return new Download[r1];
    L17:
        return new DiscTitle[r1];
    L19:
        return new Directory[r1];
    L21:
        return new ql0[r1];
    L23:
        return new pi0[r1];
    L25:
        return new wf0[r1];
    L27:
        return new uf0[r1];
    L29:
        return new rf0[r1];
    L31:
        return new pf0[r1];
    L33:
        return new o30[r1];
    L35:
        return new Chronology[r1];
    L37:
        return new Child[r1];
    L39:
        return new dy[r1];
    L41:
        return new tq[r1];
    L43:
        return new zo[r1];
    L45:
        return new ro[r1];
    L47:
        return new qo[r1];
    L49:
        return new ArtistWithAlbumsID3[r1];
    L51:
        return new ArtistID3[r1];
    L53:
        return new Artist[r1];
    L55:
        return new zg[r1];
    L57:
        return new AlbumWithSongsID3[r1];
    L59:
        return new AlbumID3[r1];
    L61:
        return new o5[r1];
    L63:
        return new x4[r1];
    }
}
