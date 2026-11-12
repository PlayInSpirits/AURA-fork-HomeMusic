package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms3 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ ms3(ns3 r1) {
        this.n = 0;
    }

    private final Object b(Object r4) {
        Boolean r3 = Boolean.FALSE;
        if (h12.c(r4, r3) == true) goto L5;
        r4.getClass();
        List r5 = (List) r4;
        Object r0 = r5.get(0);
        ct4 r1 = null;
        if (r0 == null) goto L9;
        Float r2 = (Float) r0;
    L10:
        r2.getClass();
        float r6 = r2.floatValue();
        Object r7 = r5.get(1);
        r54 r8 = s54.w;
        h12.c(r7, r3);
        if (r7 == null) goto L13;
        r1 = (ct4) r8.o.invoke(r7);
    L13:
        r1.getClass();
        return new bt4(su3.z(r1.a, r6));
    L9:
        r2 = null;
        goto L10
    L5:
        return new bt4(bt4.c);
    }

    private final Object c(Object r4) {
        r4.getClass();
        List r5 = (List) r4;
        Object r3 = r5.get(0);
        os4 r0 = null;
        if (r3 == null) goto L5;
        String r6 = (String) r3;
    L6:
        r6.getClass();
        Object r7 = r5.get(1);
        xc5 r1 = s54.i;
        if (h12.c(r7, Boolean.FALSE) == true) goto L12;
        if (r7 == null) goto L12;
        r0 = (os4) ((if1) r1.p).invoke(r7);
    L12:
        return new gb2(r6, r0);
    L5:
        r6 = null;
        goto L6
    }

    private final Object e(Object r5) {
        if (h12.c(r5, Boolean.FALSE) == true) goto L5;
        r5.getClass();
        List r6 = (List) r5;
        Object r4 = r6.get(0);
        Float r0 = null;
        if (r4 == null) goto L9;
        Float r7 = (Float) r4;
    L10:
        r7.getClass();
        float r8 = r7.floatValue();
        Object r9 = r6.get(1);
        if (r9 == null) goto L13;
        r0 = (Float) r9;
    L13:
        r0.getClass();
        float r10 = r0.floatValue();
        long r1 = Float.floatToRawIntBits(r8);
        return new g83((((long) Float.floatToRawIntBits(r10)) & 4294967295L) | (r1 << 32));
    L9:
        r7 = null;
        goto L10
    L5:
        return new g83(9205357640488583168L);
    }

    private final Object f(Object r7) {
        r7.getClass();
        List r8 = (List) r7;
        ArrayList r6 = new ArrayList(r8.size());
        int r0 = r8.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        Object r2 = r8.get(r1);
        xc5 r3 = s54.z;
        ud2 r5 = null;
        if (h12.c(r2, Boolean.FALSE) == true) goto L9;
        if (r2 == null) goto L9;
        r5 = (ud2) ((if1) r3.p).invoke(r2);
    L9:
        r5.getClass();
        r6.add(r5);
        r1 = r1 + 1;
        goto L3
    L11:
        return new vd2(r6);
    }

    private final Object g(Object r5) {
        r5.getClass();
        String r6 = (String) r5;
        Locale r0 = Locale.forLanguageTag(r6);
        if (h12.c(r0.toLanguageTag(), "und") == false) goto L6;
        System.err.println("The language tag " + r6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
    L6:
        return new ud2(r0);
    }

    private final Object h(Object r6) {
        r6.getClass();
        List r7 = (List) r6;
        Object r0 = r7.get(0);
        float r1 = oa2.b;
        r54 r2 = s54.B;
        Boolean r3 = Boolean.FALSE;
        h12.c(r0, r3);
        pa2 r4 = null;
        if (r0 == null) goto L5;
        oa2 r5 = (oa2) r2.o.invoke(r0);
    L6:
        r5.getClass();
        float r8 = r5.a;
        Object r9 = r7.get(1);
        r54 r10 = s54.C;
        h12.c(r9, r3);
        if (r9 == null) goto L9;
        qa2 r11 = (qa2) r10.o.invoke(r9);
    L10:
        r11.getClass();
        int r12 = r11.a;
        Object r13 = r7.get(2);
        r54 r14 = s54.D;
        h12.c(r13, r3);
        if (r13 == null) goto L13;
        r4 = (pa2) r14.o.invoke(r13);
    L13:
        r4.getClass();
        return new ra2(r12, r8, r4.a);
    L9:
        r11 = null;
        goto L10
    L5:
        r5 = null;
        goto L6
    }

    @Override // defpackage.if1
    public final Object invoke(Object r63) {
        int r7 = 0;
        switch(this.n) {
            case 0: goto L232;
            case 1: goto L216;
            case 2: goto L200;
            case 3: goto L199;
            case 4: goto L176;
            case 5: goto L165;
            case 6: goto L163;
            case 7: goto L161;
            case 8: goto L151;
            case 9: goto L149;
            case 10: goto L147;
            case 11: goto L137;
            case 12: goto L120;
            case 13: goto L118;
            case 14: goto L107;
            case 15: goto L105;
            case 16: goto L103;
            case 17: goto L94;
            case 18: goto L92;
            case 19: goto L90;
            case 20: goto L89;
            case 21: goto L81;
            case 22: goto L79;
            case 23: goto L77;
            case 24: goto L75;
            case 25: goto L73;
            case 26: goto L71;
            case 27: goto L68;
            case 28: goto L66;
            default: goto L4;
        };
    L4:
        r63.getClass();
        List r0 = (List) r63;
        Object r1 = r0.get(0);
        if (r1 == null) goto L7;
        je r2 = (je) r1;
    L8:
        r2.getClass();
        Object r3 = r0.get(2);
        if (r3 == null) goto L11;
        Integer r4 = (Integer) r3;
    L12:
        r4.getClass();
        int r5 = r4.intValue();
        Object r6 = r0.get(3);
        if (r6 == null) goto L15;
        Integer r8 = (Integer) r6;
    L16:
        r8.getClass();
        int r9 = r8.intValue();
        Object r10 = r0.get(4);
        if (r10 == null) goto L19;
        String r11 = (String) r10;
    L20:
        r11.getClass();
        switch(r2.ordinal()) {
            case 0: goto L59;
            case 1: goto L53;
            case 2: goto L47;
            case 3: goto L41;
            case 4: goto L35;
            case 5: goto L29;
            case 6: goto L23;
            default: goto L22;
        };
    L22:
        er1.n();
        return null;
    L23:
        Object r12 = r0.get(1);
        if (r12 == null) goto L26;
        String r13 = (String) r12;
    L27:
        r13.getClass();
        ge r14 = new ge(r5, r9, new om4(r13), r11);
    L440:
        return r14;
    L26:
        r13 = null;
        goto L27
    L29:
        Object r15 = r0.get(1);
        xc5 r16 = s54.f;
        if (h12.c(r15, Boolean.FALSE) == false) goto L32;
    L31:
        gb2 r17 = null;
    L34:
        r17.getClass();
        r14 = new ge(r5, r9, r17, r11);
        goto L440
    L32:
        if (r15 == null) goto L31;
        r17 = (gb2) ((if1) r16.p).invoke(r15);
        goto L34
    L35:
        Object r18 = r0.get(1);
        xc5 r19 = s54.e;
        if (h12.c(r18, Boolean.FALSE) == false) goto L38;
    L37:
        hb2 r20 = null;
    L40:
        r20.getClass();
        r14 = new ge(r5, r9, r20, r11);
        goto L440
    L38:
        if (r18 == null) goto L37;
        r20 = (hb2) ((if1) r19.p).invoke(r18);
        goto L40
    L41:
        Object r21 = r0.get(1);
        xc5 r22 = s54.d;
        if (h12.c(r21, Boolean.FALSE) == false) goto L44;
    L43:
        v25 r23 = null;
    L46:
        r23.getClass();
        r14 = new ge(r5, r9, r23, r11);
        goto L440
    L44:
        if (r21 == null) goto L43;
        r23 = (v25) ((if1) r22.p).invoke(r21);
        goto L46
    L47:
        Object r24 = r0.get(1);
        xc5 r25 = s54.c;
        if (h12.c(r24, Boolean.FALSE) == false) goto L50;
    L49:
        p45 r26 = null;
    L52:
        r26.getClass();
        r14 = new ge(r5, r9, r26, r11);
        goto L440
    L50:
        if (r24 == null) goto L49;
        r26 = (p45) ((if1) r25.p).invoke(r24);
        goto L52
    L53:
        Object r27 = r0.get(1);
        xc5 r28 = s54.h;
        if (h12.c(r27, Boolean.FALSE) == false) goto L56;
    L55:
        ij4 r29 = null;
    L58:
        r29.getClass();
        r14 = new ge(r5, r9, r29, r11);
        goto L440
    L56:
        if (r27 == null) goto L55;
        r29 = (ij4) ((if1) r28.p).invoke(r27);
        goto L58
    L59:
        Object r30 = r0.get(1);
        xc5 r31 = s54.g;
        if (h12.c(r30, Boolean.FALSE) == false) goto L62;
    L61:
        sd3 r32 = null;
    L64:
        r32.getClass();
        r14 = new ge(r5, r9, r32, r11);
        goto L440
    L62:
        if (r30 == null) goto L61;
        r32 = (sd3) ((if1) r31.p).invoke(r30);
        goto L64
    L19:
        r11 = null;
        goto L20
    L15:
        r8 = null;
        goto L16
    L11:
        r4 = null;
        goto L12
    L7:
        r2 = null;
        goto L8
    L66:
        r63.getClass();
        return new qa2(((Integer) r63).intValue());
    L68:
        r63.getClass();
        float r33 = ((Float) r63).floatValue();
        oa2.a(r33);
        return new oa2(r33);
    L90:
        r63.getClass();
        return new fb1(((Integer) r63).intValue());
    L92:
        r63.getClass();
        return new eb1(((Integer) r63).intValue());
    L94:
        r63.getClass();
        List r34 = (List) r63;
        ArrayList r35 = new ArrayList(r34.size());
        int r36 = r34.size();
    L95:
        if (r7 >= r36) goto L102;
        Object r37 = r34.get(r7);
        xc5 r38 = s54.b;
        if (h12.c(r37, Boolean.FALSE) == false) goto L99;
    L98:
        ge r39 = null;
    L101:
        r39.getClass();
        r35.add(r39);
        r7 = r7 + 1;
        goto L95
    L99:
        if (r37 == null) goto L98;
        r39 = (ge) ((if1) r38.p).invoke(r37);
        goto L101
    L102:
        return r35;
    L103:
        r63.getClass();
        return new du1(((Integer) r63).intValue());
    L105:
        r63.getClass();
        return new ur4(((Integer) r63).intValue());
    L107:
        r63.getClass();
        List r40 = (List) r63;
        Object r41 = r40.get(0);
        if (r41 == null) goto L110;
        String r42 = (String) r41;
    L111:
        r42.getClass();
        Object r43 = r40.get(1);
        xc5 r44 = s54.i;
        if (h12.c(r43, Boolean.FALSE) == false) goto L114;
    L113:
        os4 r45 = null;
    L117:
        return new hb2(r42, r45);
    L114:
        if (r43 == null) goto L113;
        r45 = (os4) ((if1) r44.p).invoke(r43);
        goto L117
    L110:
        r42 = null;
        goto L111
    L118:
        r63.getClass();
        return new mr4(((Integer) r63).intValue());
    L120:
        r63.getClass();
        List r46 = (List) r63;
        Object r47 = r46.get(0);
        int r48 = x40.h;
        Boolean r49 = Boolean.FALSE;
        h12.c(r47, r49);
        if (r47 != null) goto L123;
        x40 r50 = null;
    L127:
        r50.getClass();
        long r51 = r50.a;
        Object r52 = r46.get(1);
        r54 r53 = s54.x;
        h12.c(r52, r49);
        if (r52 == null) goto L130;
        g83 r54 = (g83) r53.o.invoke(r52);
    L131:
        r54.getClass();
        long r110 = r54.a;
        Object r55 = r46.get(2);
        if (r55 == null) goto L134;
        Float r56 = (Float) r55;
    L135:
        r56.getClass();
        return new xb4(r51, r110, r56.floatValue());
    L134:
        r56 = null;
        goto L135
    L130:
        r54 = null;
        goto L131
    L123:
        if (h12.c(r47, Boolean.FALSE) == false) goto L125;
        r50 = new x40(x40.g);
        goto L127
    L125:
        r50 = new x40(e35.b(((Integer) r47).intValue()));
        goto L127
    L137:
        r63.getClass();
        List r57 = (List) r63;
        Object r58 = r57.get(0);
        if (r58 == null) goto L140;
        Integer r59 = (Integer) r58;
    L141:
        r59.getClass();
        int r60 = r59.intValue();
        Object r61 = r57.get(1);
        if (r61 == null) goto L144;
        Integer r62 = (Integer) r61;
    L145:
        r62.getClass();
        return new ss4(l93.c(r60, r62.intValue()));
    L144:
        r62 = null;
        goto L145
    L140:
        r59 = null;
        goto L141
    L147:
        r63.getClass();
        return new hr(((Float) r63).floatValue());
    L149:
        r63.getClass();
        return new gb1(((Integer) r63).intValue());
    L151:
        r63.getClass();
        List r64 = (List) r63;
        Object r65 = r64.get(0);
        ct4[] r66 = bt4.b;
        if1 r67 = s54.v.o;
        Boolean r68 = Boolean.FALSE;
        h12.c(r65, r68);
        if (r65 == null) goto L154;
        bt4 r69 = (bt4) r67.invoke(r65);
    L155:
        r69.getClass();
        long r70 = r69.a;
        Object r71 = r64.get(1);
        h12.c(r71, r68);
        if (r71 == null) goto L158;
        bt4 r72 = (bt4) r67.invoke(r71);
    L159:
        r72.getClass();
        return new cs4(r70, r72.a);
    L158:
        r72 = null;
        goto L159
    L154:
        r69 = null;
        goto L155
    L161:
        r63.getClass();
        List r73 = (List) r63;
        return new bs4(((Number) r73.get(0)).floatValue(), ((Number) r73.get(1)).floatValue());
    L163:
        r63.getClass();
        return new sr4(((Integer) r63).intValue());
    L165:
        r63.getClass();
        List r74 = (List) r63;
        Object r75 = r74.get(1);
        xc5 r76 = s54.a;
        if (h12.c(r75, Boolean.FALSE) == false) goto L168;
    L167:
        List r77 = null;
    L170:
        Object r78 = r74.get(0);
        if (r78 == null) goto L173;
        String r79 = (String) r78;
    L174:
        r79.getClass();
        return new he(r77, r79);
    L173:
        r79 = null;
        goto L174
    L168:
        if (r75 == null) goto L167;
        r77 = (List) ((if1) r76.p).invoke(r75);
        goto L170
    L176:
        r63.getClass();
        List r80 = (List) r63;
        Object r81 = r80.get(0);
        if1 r82 = (if1) s54.h.p;
        Boolean r83 = Boolean.FALSE;
        if (h12.c(r81, r83) == false) goto L179;
    L178:
        ij4 r84 = null;
    L181:
        Object r85 = r80.get(1);
        if (h12.c(r85, r83) == false) goto L184;
    L183:
        ij4 r86 = null;
    L186:
        Object r87 = r80.get(2);
        if (h12.c(r87, r83) == false) goto L189;
    L188:
        ij4 r88 = null;
    L191:
        Object r89 = r80.get(3);
        if (h12.c(r89, r83) == false) goto L194;
    L193:
        ij4 r90 = null;
    L197:
        return new os4(r84, r86, r88, r90);
    L194:
        if (r89 == null) goto L193;
        r90 = (ij4) r82.invoke(r89);
        goto L197
    L189:
        if (r87 == null) goto L188;
        r88 = (ij4) r82.invoke(r87);
        goto L191
    L184:
        if (r85 == null) goto L183;
        r86 = (ij4) r82.invoke(r85);
        goto L186
    L179:
        if (r81 == null) goto L178;
        r84 = (ij4) r82.invoke(r81);
        goto L181
    L200:
        z34 r91 = ((x34) r63).U("SELECT search FROM recent_search ORDER BY timestamp DESC");
        ArrayList r92 = new ArrayList();     // Catch: Throwable -> L210
    L202:
        if (r91.O() == false) goto L212;
        if (r91.isNull(0) == false) goto L207;
        String r93 = null;
    L208:
        r92.add(r93);     // Catch: Throwable -> L210
        goto L202
    L207:
        r93 = r91.D(0);     // Catch: Throwable -> L210
        goto L208
    L212:
        r91.close();
        return r92;
    L210:
        th = move-exception;
        r91.close();
        throw th;
    L216:
        z34 r94 = ((x34) r63).U("SELECT search FROM recent_search ORDER BY search DESC");
        ArrayList r95 = new ArrayList();     // Catch: Throwable -> L226
    L218:
        if (r94.O() == false) goto L228;
        if (r94.isNull(0) == false) goto L223;
        String r96 = null;
    L224:
        r95.add(r96);     // Catch: Throwable -> L226
        goto L218
    L223:
        r96 = r94.D(0);     // Catch: Throwable -> L226
        goto L224
    L228:
        r94.close();
        return r95;
    L226:
        th = move-exception;
        r94.close();
        throw th;
    L232:
        z34 r97 = ((x34) r63).U("SELECT * FROM queue ORDER BY track_order ASC");
        int r98 = rr2.E(r97, "id");     // Catch: Throwable -> L258
        int r99 = rr2.E(r97, "track_order");     // Catch: Throwable -> L258
        int r100 = rr2.E(r97, "last_play");     // Catch: Throwable -> L258
        int r101 = rr2.E(r97, "playing_changed");     // Catch: Throwable -> L258
        int r102 = rr2.E(r97, "stream_id");     // Catch: Throwable -> L258
        int r103 = rr2.E(r97, "parent_id");     // Catch: Throwable -> L258
        int r111 = rr2.E(r97, "is_dir");     // Catch: Throwable -> L258
        int r112 = rr2.E(r97, "title");     // Catch: Throwable -> L258
        int r113 = rr2.E(r97, "album");     // Catch: Throwable -> L258
        int r114 = rr2.E(r97, "artist");     // Catch: Throwable -> L258
        int r115 = rr2.E(r97, "track");     // Catch: Throwable -> L258
        int r116 = rr2.E(r97, "year");     // Catch: Throwable -> L258
        int r104 = rr2.E(r97, "genre");     // Catch: Throwable -> L258
        int r105 = rr2.E(r97, "cover_art_id");     // Catch: Throwable -> L258
        int r610 = rr2.E(r97, "size");     // Catch: Throwable -> L258
        int r611 = rr2.E(r97, "content_type");     // Catch: Throwable -> L258
        int r117 = rr2.E(r97, "suffix");     // Catch: Throwable -> L258
        int r118 = rr2.E(r97, "transcoding_content_type");     // Catch: Throwable -> L258
        int r119 = rr2.E(r97, "transcoded_suffix");     // Catch: Throwable -> L258
        int r120 = rr2.E(r97, "duration");     // Catch: Throwable -> L258
        int r210 = rr2.E(r97, "bitrate");     // Catch: Throwable -> L258
        int r211 = rr2.E(r97, "sampling_rate");     // Catch: Throwable -> L258
        int r212 = rr2.E(r97, "bit_depth");     // Catch: Throwable -> L258
        int r213 = rr2.E(r97, "path");     // Catch: Throwable -> L258
        int r214 = rr2.E(r97, "is_video");     // Catch: Throwable -> L258
        int r215 = rr2.E(r97, "user_rating");     // Catch: Throwable -> L258
        int r216 = rr2.E(r97, "average_rating");     // Catch: Throwable -> L258
        int r217 = rr2.E(r97, "play_count");     // Catch: Throwable -> L258
        int r218 = rr2.E(r97, "disc_number");     // Catch: Throwable -> L258
        int r219 = rr2.E(r97, "created");     // Catch: Throwable -> L258
        int r310 = rr2.E(r97, "starred");     // Catch: Throwable -> L258
        int r311 = rr2.E(r97, "album_id");     // Catch: Throwable -> L258
        int r312 = rr2.E(r97, "artist_id");     // Catch: Throwable -> L258
        int r313 = rr2.E(r97, "type");     // Catch: Throwable -> L258
        int r314 = rr2.E(r97, "bookmark_position");     // Catch: Throwable -> L258
        int r315 = rr2.E(r97, "original_width");     // Catch: Throwable -> L258
        int r316 = rr2.E(r97, "original_height");     // Catch: Throwable -> L258
        int r317 = rr2.E(r97, "album_artist");     // Catch: Throwable -> L258
        int r106 = rr2.E(r97, "rg_track_gain");     // Catch: Throwable -> L258
        int r318 = r105;
        int r107 = rr2.E(r97, "rg_album_gain");     // Catch: Throwable -> L258
        int r319 = r104;
        int r108 = rr2.E(r97, "rg_track_peak");     // Catch: Throwable -> L258
        int r410 = r116;
        int r121 = rr2.E(r97, "rg_album_peak");     // Catch: Throwable -> L258
        int r411 = r115;
        int r122 = rr2.E(r97, "rg_base_gain");     // Catch: Throwable -> L258
        int r412 = r114;
        int r123 = rr2.E(r97, "rg_fallback_gain");     // Catch: Throwable -> L258
        int r413 = r113;
        ArrayList r124 = new ArrayList();     // Catch: Throwable -> L258
    L234:
        if (r97.O() == false) goto L420;
        if (r97.isNull(r98) == false) goto L239;
        String r414 = null;
    L240:
        int r125 = (int) r97.getLong(r99);     // Catch: Throwable -> L258
        long r415 = r97.getLong(r100);     // Catch: Throwable -> L258
        long r510 = r97.getLong(r101);     // Catch: Throwable -> L258
        if (r97.isNull(r102) == false) goto L243;
        String r511 = null;
    L245:
        if (r97.isNull(r106) == false) goto L261;
        if (r97.isNull(r107) == false) goto L261;
        if (r97.isNull(r108) == false) goto L261;
        if (r97.isNull(r121) == false) goto L261;
        if (r97.isNull(r122) == false) goto L261;
        if (r97.isNull(r123) == false) goto L261;
        r99 = r99;
        r100 = r100;
        ReplayGainInfo r109 = null;
    L285:
        Queue r416 = new Queue(r414, r125, r415, r510, r511);     // Catch: Throwable -> L258
        if (r97.isNull(r103) == false) goto L288;
        String r126 = null;
    L289:
        r416.setParentId(r126);     // Catch: Throwable -> L258
        int r127 = r101;
        int r417 = r108;
        if (((int) r97.getLong(r111)) == 0) goto L292;
        boolean r128 = true;
    L293:
        r416.setDir(r128);     // Catch: Throwable -> L258
        int r129 = r112;
        if (r97.isNull(r129) == false) goto L296;
        String r130 = null;
    L297:
        r416.setTitle(r130);     // Catch: Throwable -> L258
        int r131 = r413;
        if (r97.isNull(r131) == false) goto L300;
        String r132 = null;
    L301:
        r416.setAlbum(r132);     // Catch: Throwable -> L258
        int r133 = r412;
        if (r97.isNull(r133) == false) goto L304;
        String r134 = null;
    L305:
        r416.setArtist(r134);     // Catch: Throwable -> L258
        int r135 = r411;
        if (r97.isNull(r135) == false) goto L308;
        Integer r136 = null;
    L309:
        r416.setTrack(r136);     // Catch: Throwable -> L258
        int r137 = r410;
        if (r97.isNull(r137) == false) goto L312;
        Integer r138 = null;
    L313:
        r416.setYear(r138);     // Catch: Throwable -> L258
        int r139 = r319;
        if (r97.isNull(r139) == false) goto L316;
        String r140 = null;
    L317:
        r416.setGenre(r140);     // Catch: Throwable -> L258
        int r141 = r318;
        if (r97.isNull(r141) == false) goto L320;
        String r142 = null;
    L321:
        r416.setCoverArtId(r142);     // Catch: Throwable -> L258
        r610 = r610;
        if (r97.isNull(r610) == false) goto L324;
        Long r143 = null;
    L325:
        r416.setSize(r143);     // Catch: Throwable -> L258
        r611 = r611;
        if (r97.isNull(r611) == false) goto L328;
        String r144 = null;
    L329:
        r416.setContentType(r144);     // Catch: Throwable -> L258
        int r145 = r117;
        if (r97.isNull(r145) == false) goto L332;
        String r146 = null;
    L333:
        r416.setSuffix(r146);     // Catch: Throwable -> L258
        r118 = r118;
        if (r97.isNull(r118) == false) goto L336;
        String r147 = null;
    L337:
        r416.setTranscodedContentType(r147);     // Catch: Throwable -> L258
        r119 = r119;
        if (r97.isNull(r119) == false) goto L340;
        String r148 = null;
    L341:
        r416.setTranscodedSuffix(r148);     // Catch: Throwable -> L258
        int r149 = r120;
        if (r97.isNull(r149) == false) goto L344;
        Integer r150 = null;
    L345:
        r416.setDuration(r150);     // Catch: Throwable -> L258
        int r151 = r210;
        if (r97.isNull(r151) == false) goto L348;
        Integer r152 = null;
    L349:
        r416.setBitrate(r152);     // Catch: Throwable -> L258
        int r153 = r211;
        if (r97.isNull(r153) == false) goto L352;
        Integer r154 = null;
    L353:
        r416.setSamplingRate(r154);     // Catch: Throwable -> L258
        int r155 = r212;
        if (r97.isNull(r155) == false) goto L356;
        Integer r156 = null;
    L357:
        r416.setBitDepth(r156);     // Catch: Throwable -> L258
        int r157 = r213;
        if (r97.isNull(r157) == false) goto L360;
        String r158 = null;
    L361:
        r416.setPath(r158);     // Catch: Throwable -> L258
        int r159 = r214;
        if (((int) r97.getLong(r159)) == 0) goto L364;
        boolean r160 = true;
    L365:
        r416.setVideo(r160);     // Catch: Throwable -> L258
        int r161 = r215;
        if (r97.isNull(r161) == false) goto L368;
        Integer r162 = null;
    L369:
        r416.setUserRating(r162);     // Catch: Throwable -> L258
        r216 = r216;
        if (r97.isNull(r216) == false) goto L372;
        Double r163 = null;
    L373:
        r416.setAverageRating(r163);     // Catch: Throwable -> L258
        int r164 = r217;
        if (r97.isNull(r164) == false) goto L376;
        Long r165 = null;
    L377:
        r416.setPlayCount(r165);     // Catch: Throwable -> L258
        int r166 = r218;
        if (r97.isNull(r166) == false) goto L380;
        Integer r167 = null;
    L381:
        r416.setDiscNumber(r167);     // Catch: Throwable -> L258
        r219 = r219;
        if (r97.isNull(r219) == false) goto L384;
        Long r168 = null;
    L385:
        r416.setCreated(i80.B(r168));     // Catch: Throwable -> L258
        int r169 = r310;
        if (r97.isNull(r169) == false) goto L389;
        Long r220 = null;
    L390:
        r416.setStarred(i80.B(r220));     // Catch: Throwable -> L258
        r311 = r311;
        if (r97.isNull(r311) == false) goto L393;
        String r170 = null;
    L394:
        r416.setAlbumId(r170);     // Catch: Throwable -> L258
        r312 = r312;
        if (r97.isNull(r312) == false) goto L397;
        String r171 = null;
    L398:
        r416.setArtistId(r171);     // Catch: Throwable -> L258
        r313 = r313;
        if (r97.isNull(r313) == false) goto L401;
        String r172 = null;
    L402:
        r416.setType(r172);     // Catch: Throwable -> L258
        r314 = r314;
        if (r97.isNull(r314) == false) goto L405;
        Long r173 = null;
    L406:
        r416.setBookmarkPosition(r173);     // Catch: Throwable -> L258
        int r174 = r315;
        if (r97.isNull(r174) == false) goto L409;
        Integer r175 = null;
    L410:
        r416.setOriginalWidth(r175);     // Catch: Throwable -> L258
        int r176 = r316;
        if (r97.isNull(r176) == false) goto L413;
        Integer r177 = null;
    L414:
        r416.setOriginalHeight(r177);     // Catch: Throwable -> L258
        int r178 = r317;
        if (r97.isNull(r178) == false) goto L417;
        String r179 = null;
    L418:
        r416.setAlbumArtist(r179);     // Catch: Throwable -> L258
        r416.setReplayGain(r109);     // Catch: Throwable -> L258
        ArrayList r180 = r124;
        r180.add(r416);     // Catch: Throwable -> L258
        int r181 = r99;
        r124 = r180;
        r99 = r181;
        r213 = r157;
        r106 = r106;
        r211 = r153;
        r212 = r155;
        r413 = r131;
        r412 = r133;
        r317 = r178;
        r107 = r107;
        r108 = r417;
        r100 = r100;
        r410 = r137;
        r117 = r145;
        r318 = r141;
        r210 = r151;
        r214 = r159;
        r215 = r161;
        r316 = r176;
        r101 = r127;
        r112 = r129;
        r411 = r135;
        r319 = r139;
        r120 = r149;
        r217 = r164;
        r218 = r166;
        r310 = r169;
        r315 = r174;
        r98 = r98;
        goto L234
    L417:
        r179 = r97.D(r178);     // Catch: Throwable -> L258
        goto L418
    L413:
        r177 = Integer.valueOf((int) r97.getLong(r176));     // Catch: Throwable -> L258
        goto L414
    L409:
        r175 = Integer.valueOf((int) r97.getLong(r174));     // Catch: Throwable -> L258
        goto L410
    L405:
        r173 = Long.valueOf(r97.getLong(r314));     // Catch: Throwable -> L258
        goto L406
    L401:
        r172 = r97.D(r313);     // Catch: Throwable -> L258
        goto L402
    L397:
        r171 = r97.D(r312);     // Catch: Throwable -> L258
        goto L398
    L393:
        r170 = r97.D(r311);     // Catch: Throwable -> L258
        goto L394
    L389:
        r220 = Long.valueOf(r97.getLong(r169));     // Catch: Throwable -> L258
        goto L390
    L384:
        r168 = Long.valueOf(r97.getLong(r219));     // Catch: Throwable -> L258
        goto L385
    L380:
        r167 = Integer.valueOf((int) r97.getLong(r166));     // Catch: Throwable -> L258
        goto L381
    L376:
        r165 = Long.valueOf(r97.getLong(r164));     // Catch: Throwable -> L258
        goto L377
    L372:
        r163 = Double.valueOf(r97.getDouble(r216));     // Catch: Throwable -> L258
        goto L373
    L368:
        r162 = Integer.valueOf((int) r97.getLong(r161));     // Catch: Throwable -> L258
        goto L369
    L364:
        r160 = false;
        goto L365
    L360:
        r158 = r97.D(r157);     // Catch: Throwable -> L258
        goto L361
    L356:
        r156 = Integer.valueOf((int) r97.getLong(r155));     // Catch: Throwable -> L258
        goto L357
    L352:
        r154 = Integer.valueOf((int) r97.getLong(r153));     // Catch: Throwable -> L258
        goto L353
    L348:
        r152 = Integer.valueOf((int) r97.getLong(r151));     // Catch: Throwable -> L258
        goto L349
    L344:
        r150 = Integer.valueOf((int) r97.getLong(r149));     // Catch: Throwable -> L258
        goto L345
    L340:
        r148 = r97.D(r119);     // Catch: Throwable -> L258
        goto L341
    L336:
        r147 = r97.D(r118);     // Catch: Throwable -> L258
        goto L337
    L332:
        r146 = r97.D(r145);     // Catch: Throwable -> L258
        goto L333
    L328:
        r144 = r97.D(r611);     // Catch: Throwable -> L258
        goto L329
    L324:
        r143 = Long.valueOf(r97.getLong(r610));     // Catch: Throwable -> L258
        goto L325
    L320:
        r142 = r97.D(r141);     // Catch: Throwable -> L258
        goto L321
    L316:
        r140 = r97.D(r139);     // Catch: Throwable -> L258
        goto L317
    L312:
        r138 = Integer.valueOf((int) r97.getLong(r137));     // Catch: Throwable -> L258
        goto L313
    L308:
        r136 = Integer.valueOf((int) r97.getLong(r135));     // Catch: Throwable -> L258
        goto L309
    L304:
        r134 = r97.D(r133);     // Catch: Throwable -> L258
        goto L305
    L300:
        r132 = r97.D(r131);     // Catch: Throwable -> L258
        goto L301
    L296:
        r130 = r97.D(r129);     // Catch: Throwable -> L258
        goto L297
    L292:
        r128 = false;
        goto L293
    L288:
        r126 = r97.D(r103);     // Catch: Throwable -> L258
    L261:
        if (r97.isNull(r106) == false) goto L263;
        Float r512 = null;
    L265:
        if (r97.isNull(r107) == false) goto L267;
        Float r513 = null;
    L269:
        if (r97.isNull(r108) == false) goto L271;
        Float r514 = null;
    L273:
        if (r97.isNull(r121) == false) goto L275;
        Float r515 = null;
    L277:
        if (r97.isNull(r122) == false) goto L279;
        Float r612 = null;
    L281:
        if (r97.isNull(r123) == false) goto L283;
        Float r613 = null;
    L284:
        r109 = new ReplayGainInfo(r512, r513, r514, r515, r612, r613);     // Catch: Throwable -> L258
        goto L285
    L283:
        r613 = Float.valueOf((float) r97.getDouble(r123));     // Catch: Throwable -> L258
        goto L284
    L279:
        r612 = Float.valueOf((float) r97.getDouble(r122));     // Catch: Throwable -> L258
        goto L281
    L275:
        r515 = Float.valueOf((float) r97.getDouble(r121));     // Catch: Throwable -> L258
        goto L277
    L271:
        r514 = Float.valueOf((float) r97.getDouble(r108));     // Catch: Throwable -> L258
        goto L273
    L267:
        r513 = Float.valueOf((float) r97.getDouble(r107));     // Catch: Throwable -> L258
        goto L269
    L263:
        r512 = Float.valueOf((float) r97.getDouble(r106));     // Catch: Throwable -> L258
        goto L265
    L243:
        r511 = r97.D(r102);     // Catch: Throwable -> L258
        goto L245
    L239:
        r414 = r97.D(r98);     // Catch: Throwable -> L258
        goto L240
    L420:
        ArrayList r182 = r124;
        r97.close();
        return r182;
    L258:
        th = move-exception;
        r97.close();
        throw th;
    L71:
        return h(r63);
    L73:
        return c(r63);
    L75:
        return g(r63);
    L77:
        return f(r63);
    L79:
        return e(r63);
    L81:
        if (h12.c(r63, 0) == false) goto L84;
        return new ct4(8589934592L);
    L84:
        if (h12.c(r63, 1) == false) goto L87;
        return new ct4(4294967296L);
    L87:
        return new ct4(0);
    L89:
        return b(r63);
    L199:
        return new w44((Map) r63);
    }

    public /* synthetic */ ms3(int r1) {
        this.n = r1;
    }
}
