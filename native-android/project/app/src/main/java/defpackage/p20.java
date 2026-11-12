package defpackage;

import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p20 implements if1 {
    public final /* synthetic */ r20 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ String q;

    public /* synthetic */ p20(r20 r1, long r2, long r4, String r6) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r6;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r58) {
        long r1 = this.o;
        long r3 = this.p;
        Object r6 = this.n.q;
        z34 r5 = ((x34) r58).U("SELECT * FROM chronology WHERE timestamp >= ? AND timestamp < ? AND server == ? GROUP BY id ORDER BY COUNT(id) DESC LIMIT 20");
        r5.c(1, r1);     // Catch: Throwable -> L7
        r5.c(2, r3);     // Catch: Throwable -> L7
        String r0 = this.q;
        if (r0 != null) goto L9;
        r5.e(3);     // Catch: Throwable -> L7
    L10:
        int r2 = rr2.E(r5, "id");     // Catch: Throwable -> L7
        int r4 = rr2.E(r5, "timestamp");     // Catch: Throwable -> L7
        int r7 = rr2.E(r5, "server");     // Catch: Throwable -> L7
        int r8 = rr2.E(r5, "parent_id");     // Catch: Throwable -> L7
        int r9 = rr2.E(r5, "is_dir");     // Catch: Throwable -> L7
        int r10 = rr2.E(r5, "title");     // Catch: Throwable -> L7
        int r11 = rr2.E(r5, "album");     // Catch: Throwable -> L7
        int r12 = rr2.E(r5, "artist");     // Catch: Throwable -> L7
        int r13 = rr2.E(r5, "track");     // Catch: Throwable -> L7
        int r14 = rr2.E(r5, "year");     // Catch: Throwable -> L7
        int r15 = rr2.E(r5, "genre");     // Catch: Throwable -> L7
        int r16 = rr2.E(r5, "cover_art_id");     // Catch: Throwable -> L7
        int r17 = rr2.E(r5, "size");     // Catch: Throwable -> L7
        int r18 = rr2.E(r5, "content_type");     // Catch: Throwable -> L7
        int r57 = rr2.E(r5, "suffix");     // Catch: Throwable -> L7
        int r19 = rr2.E(r5, "transcoding_content_type");     // Catch: Throwable -> L7
        int r110 = rr2.E(r5, "transcoded_suffix");     // Catch: Throwable -> L7
        int r111 = rr2.E(r5, "duration");     // Catch: Throwable -> L7
        int r112 = rr2.E(r5, "bitrate");     // Catch: Throwable -> L7
        int r20 = rr2.E(r5, "sampling_rate");     // Catch: Throwable -> L7
        int r21 = rr2.E(r5, "bit_depth");     // Catch: Throwable -> L7
        int r22 = rr2.E(r5, "path");     // Catch: Throwable -> L7
        int r23 = rr2.E(r5, "is_video");     // Catch: Throwable -> L7
        int r24 = rr2.E(r5, "user_rating");     // Catch: Throwable -> L7
        int r25 = rr2.E(r5, "average_rating");     // Catch: Throwable -> L7
        int r26 = rr2.E(r5, "play_count");     // Catch: Throwable -> L7
        int r27 = rr2.E(r5, "disc_number");     // Catch: Throwable -> L7
        int r28 = rr2.E(r5, "created");     // Catch: Throwable -> L7
        int r29 = rr2.E(r5, "starred");     // Catch: Throwable -> L7
        int r30 = rr2.E(r5, "album_id");     // Catch: Throwable -> L7
        int r31 = rr2.E(r5, "artist_id");     // Catch: Throwable -> L7
        int r32 = rr2.E(r5, "type");     // Catch: Throwable -> L7
        int r33 = rr2.E(r5, "bookmark_position");     // Catch: Throwable -> L7
        int r34 = rr2.E(r5, "original_width");     // Catch: Throwable -> L7
        int r35 = rr2.E(r5, "original_height");     // Catch: Throwable -> L7
        int r36 = rr2.E(r5, "album_artist");     // Catch: Throwable -> L7
        int r37 = rr2.E(r5, "rg_track_gain");     // Catch: Throwable -> L7
        int r38 = r18;
        int r113 = rr2.E(r5, "rg_album_gain");     // Catch: Throwable -> L7
        int r39 = r17;
        int r114 = rr2.E(r5, "rg_track_peak");     // Catch: Throwable -> L7
        int r310 = r16;
        int r115 = rr2.E(r5, "rg_album_peak");     // Catch: Throwable -> L7
        int r40 = r15;
        int r116 = rr2.E(r5, "rg_base_gain");     // Catch: Throwable -> L7
        int r41 = r14;
        int r117 = rr2.E(r5, "rg_fallback_gain");     // Catch: Throwable -> L7
        int r42 = r13;
        ArrayList r118 = new ArrayList();     // Catch: Throwable -> L7
    L11:
        if (r5.O() == false) goto L195;
        String r44 = null;
        if (r5.isNull(r2) == false) goto L16;
        String r43 = null;
    L17:
        long r45 = r5.getLong(r4);     // Catch: Throwable -> L7
        if (r5.isNull(r7) == false) goto L20;
        String r46 = null;
    L22:
        if (r5.isNull(r37) == false) goto L36;
        if (r5.isNull(r113) == false) goto L36;
        if (r5.isNull(r114) == false) goto L36;
        if (r5.isNull(r115) == false) goto L36;
        if (r5.isNull(r116) == false) goto L36;
        if (r5.isNull(r117) == false) goto L36;
        r10 = r10;
        r11 = r11;
        ReplayGainInfo r47 = null;
    L60:
        Chronology r48 = new Chronology(r43, r45, r46);     // Catch: Throwable -> L7
        if (r5.isNull(r8) == false) goto L63;
        String r49 = null;
    L64:
        r48.setParentId(r49);     // Catch: Throwable -> L7
        if (((int) r5.getLong(r9)) == 0) goto L67;
        boolean r50 = true;
    L68:
        r48.setDir(r50);     // Catch: Throwable -> L7
        int r51 = r10;
        if (r5.isNull(r51) == false) goto L71;
        String r52 = null;
    L72:
        r48.setTitle(r52);     // Catch: Throwable -> L7
        int r53 = r11;
        if (r5.isNull(r53) == false) goto L75;
        String r119 = null;
    L76:
        r48.setAlbum(r119);     // Catch: Throwable -> L7
        int r120 = r12;
        if (r5.isNull(r120) == false) goto L79;
        String r54 = null;
    L80:
        r48.setArtist(r54);     // Catch: Throwable -> L7
        int r55 = r42;
        if (r5.isNull(r55) == false) goto L83;
        Integer r56 = null;
    L84:
        r48.setTrack(r56);     // Catch: Throwable -> L7
        int r59 = r41;
        if (r5.isNull(r59) == false) goto L87;
        Integer r60 = null;
    L88:
        r48.setYear(r60);     // Catch: Throwable -> L7
        r40 = r40;
        if (r5.isNull(r40) == false) goto L91;
        String r61 = null;
    L92:
        r48.setGenre(r61);     // Catch: Throwable -> L7
        int r62 = r310;
        if (r5.isNull(r62) == false) goto L95;
        String r63 = null;
    L96:
        r48.setCoverArtId(r63);     // Catch: Throwable -> L7
        int r64 = r39;
        if (r5.isNull(r64) == false) goto L99;
        Long r65 = null;
    L100:
        r48.setSize(r65);     // Catch: Throwable -> L7
        int r66 = r38;
        if (r5.isNull(r66) == false) goto L103;
        String r67 = null;
    L104:
        r48.setContentType(r67);     // Catch: Throwable -> L7
        r57 = r57;
        if (r5.isNull(r57) == false) goto L107;
        String r68 = null;
    L108:
        r48.setSuffix(r68);     // Catch: Throwable -> L7
        int r69 = r19;
        if (r5.isNull(r69) == false) goto L111;
        String r70 = null;
    L112:
        r48.setTranscodedContentType(r70);     // Catch: Throwable -> L7
        r110 = r110;
        if (r5.isNull(r110) == false) goto L115;
        String r71 = null;
    L116:
        r48.setTranscodedSuffix(r71);     // Catch: Throwable -> L7
        int r72 = r111;
        if (r5.isNull(r72) == false) goto L119;
        Integer r73 = null;
    L120:
        r48.setDuration(r73);     // Catch: Throwable -> L7
        int r74 = r112;
        if (r5.isNull(r74) == false) goto L123;
        Integer r75 = null;
    L124:
        r48.setBitrate(r75);     // Catch: Throwable -> L7
        int r76 = r20;
        if (r5.isNull(r76) == false) goto L127;
        Integer r77 = null;
    L128:
        r48.setSamplingRate(r77);     // Catch: Throwable -> L7
        int r78 = r21;
        if (r5.isNull(r78) == false) goto L131;
        Integer r79 = null;
    L132:
        r48.setBitDepth(r79);     // Catch: Throwable -> L7
        int r80 = r22;
        if (r5.isNull(r80) == false) goto L135;
        String r81 = null;
    L136:
        r48.setPath(r81);     // Catch: Throwable -> L7
        int r82 = r23;
        if (((int) r5.getLong(r82)) == 0) goto L139;
        boolean r83 = true;
    L140:
        r48.setVideo(r83);     // Catch: Throwable -> L7
        int r84 = r24;
        if (r5.isNull(r84) == false) goto L143;
        Integer r85 = null;
    L144:
        r48.setUserRating(r85);     // Catch: Throwable -> L7
        r25 = r25;
        if (r5.isNull(r25) == false) goto L147;
        Double r86 = null;
    L148:
        r48.setAverageRating(r86);     // Catch: Throwable -> L7
        int r87 = r26;
        if (r5.isNull(r87) == false) goto L151;
        Long r88 = null;
    L152:
        r48.setPlayCount(r88);     // Catch: Throwable -> L7
        int r89 = r27;
        if (r5.isNull(r89) == false) goto L155;
        Integer r90 = null;
    L156:
        r48.setDiscNumber(r90);     // Catch: Throwable -> L7
        r28 = r28;
        if (r5.isNull(r28) == false) goto L159;
        Long r91 = null;
    L160:
        r48.setCreated(i80.B(r91));     // Catch: Throwable -> L7
        int r92 = r29;
        if (r5.isNull(r92) == false) goto L164;
        Long r210 = null;
    L165:
        r48.setStarred(i80.B(r210));     // Catch: Throwable -> L7
        r30 = r30;
        if (r5.isNull(r30) == false) goto L168;
        String r93 = null;
    L169:
        r48.setAlbumId(r93);     // Catch: Throwable -> L7
        r31 = r31;
        if (r5.isNull(r31) == false) goto L172;
        String r94 = null;
    L173:
        r48.setArtistId(r94);     // Catch: Throwable -> L7
        r32 = r32;
        if (r5.isNull(r32) == false) goto L176;
        String r95 = null;
    L177:
        r48.setType(r95);     // Catch: Throwable -> L7
        r33 = r33;
        if (r5.isNull(r33) == false) goto L180;
        Long r96 = null;
    L181:
        r48.setBookmarkPosition(r96);     // Catch: Throwable -> L7
        int r97 = r34;
        if (r5.isNull(r97) == false) goto L184;
        Integer r98 = null;
    L185:
        r48.setOriginalWidth(r98);     // Catch: Throwable -> L7
        int r99 = r35;
        if (r5.isNull(r99) == false) goto L188;
        Integer r100 = null;
    L189:
        r48.setOriginalHeight(r100);     // Catch: Throwable -> L7
        int r101 = r36;
        if (r5.isNull(r101) == true) goto L193;
        r44 = r5.D(r101);     // Catch: Throwable -> L7
    L193:
        r48.setAlbumArtist(r44);     // Catch: Throwable -> L7
        r48.setReplayGain(r47);     // Catch: Throwable -> L7
        ArrayList r102 = r118;
        r102.add(r48);     // Catch: Throwable -> L7
        r36 = r101;
        r11 = r53;
        r12 = r120;
        r10 = r51;
        r112 = r74;
        r20 = r76;
        r21 = r78;
        r22 = r80;
        r23 = r82;
        r24 = r84;
        r26 = r87;
        r27 = r89;
        r29 = r92;
        r7 = r7;
        r34 = r97;
        r118 = r102;
        r42 = r55;
        r8 = r8;
        r2 = r2;
        r41 = r59;
        r19 = r69;
        r38 = r66;
        r39 = r64;
        r310 = r62;
        r111 = r72;
        r35 = r99;
        r4 = r4;
        goto L11
    L188:
        r100 = Integer.valueOf((int) r5.getLong(r99));     // Catch: Throwable -> L7
        goto L189
    L184:
        r98 = Integer.valueOf((int) r5.getLong(r97));     // Catch: Throwable -> L7
        goto L185
    L180:
        r96 = Long.valueOf(r5.getLong(r33));     // Catch: Throwable -> L7
        goto L181
    L176:
        r95 = r5.D(r32);     // Catch: Throwable -> L7
        goto L177
    L172:
        r94 = r5.D(r31);     // Catch: Throwable -> L7
        goto L173
    L168:
        r93 = r5.D(r30);     // Catch: Throwable -> L7
        goto L169
    L164:
        r210 = Long.valueOf(r5.getLong(r92));     // Catch: Throwable -> L7
        goto L165
    L159:
        r91 = Long.valueOf(r5.getLong(r28));     // Catch: Throwable -> L7
        goto L160
    L155:
        r90 = Integer.valueOf((int) r5.getLong(r89));     // Catch: Throwable -> L7
        goto L156
    L151:
        r88 = Long.valueOf(r5.getLong(r87));     // Catch: Throwable -> L7
        goto L152
    L147:
        r86 = Double.valueOf(r5.getDouble(r25));     // Catch: Throwable -> L7
        goto L148
    L143:
        r85 = Integer.valueOf((int) r5.getLong(r84));     // Catch: Throwable -> L7
        goto L144
    L139:
        r83 = false;
        goto L140
    L135:
        r81 = r5.D(r80);     // Catch: Throwable -> L7
        goto L136
    L131:
        r79 = Integer.valueOf((int) r5.getLong(r78));     // Catch: Throwable -> L7
        goto L132
    L127:
        r77 = Integer.valueOf((int) r5.getLong(r76));     // Catch: Throwable -> L7
        goto L128
    L123:
        r75 = Integer.valueOf((int) r5.getLong(r74));     // Catch: Throwable -> L7
        goto L124
    L119:
        r73 = Integer.valueOf((int) r5.getLong(r72));     // Catch: Throwable -> L7
        goto L120
    L115:
        r71 = r5.D(r110);     // Catch: Throwable -> L7
        goto L116
    L111:
        r70 = r5.D(r69);     // Catch: Throwable -> L7
        goto L112
    L107:
        r68 = r5.D(r57);     // Catch: Throwable -> L7
        goto L108
    L103:
        r67 = r5.D(r66);     // Catch: Throwable -> L7
        goto L104
    L99:
        r65 = Long.valueOf(r5.getLong(r64));     // Catch: Throwable -> L7
        goto L100
    L95:
        r63 = r5.D(r62);     // Catch: Throwable -> L7
        goto L96
    L91:
        r61 = r5.D(r40);     // Catch: Throwable -> L7
        goto L92
    L87:
        r60 = Integer.valueOf((int) r5.getLong(r59));     // Catch: Throwable -> L7
        goto L88
    L83:
        r56 = Integer.valueOf((int) r5.getLong(r55));     // Catch: Throwable -> L7
        goto L84
    L79:
        r54 = r5.D(r120);     // Catch: Throwable -> L7
        goto L80
    L75:
        r119 = r5.D(r53);     // Catch: Throwable -> L7
        goto L76
    L71:
        r52 = r5.D(r51);     // Catch: Throwable -> L7
        goto L72
    L67:
        r50 = false;
        goto L68
    L63:
        r49 = r5.D(r8);     // Catch: Throwable -> L7
    L36:
        if (r5.isNull(r37) == false) goto L38;
        Float r510 = null;
    L40:
        if (r5.isNull(r113) == false) goto L42;
        Float r511 = null;
    L44:
        if (r5.isNull(r114) == false) goto L46;
        Float r512 = null;
    L48:
        if (r5.isNull(r115) == false) goto L50;
        Float r513 = null;
    L52:
        if (r5.isNull(r116) == false) goto L54;
        Float r514 = null;
    L56:
        if (r5.isNull(r117) == false) goto L58;
        Float r515 = null;
    L59:
        r47 = new ReplayGainInfo(r510, r511, r512, r513, r514, r515);     // Catch: Throwable -> L7
        goto L60
    L58:
        r515 = Float.valueOf((float) r5.getDouble(r117));     // Catch: Throwable -> L7
        goto L59
    L54:
        r514 = Float.valueOf((float) r5.getDouble(r116));     // Catch: Throwable -> L7
        goto L56
    L50:
        r513 = Float.valueOf((float) r5.getDouble(r115));     // Catch: Throwable -> L7
        goto L52
    L46:
        r512 = Float.valueOf((float) r5.getDouble(r114));     // Catch: Throwable -> L7
        goto L48
    L42:
        r511 = Float.valueOf((float) r5.getDouble(r113));     // Catch: Throwable -> L7
        goto L44
    L38:
        r510 = Float.valueOf((float) r5.getDouble(r37));     // Catch: Throwable -> L7
        goto L40
    L20:
        r46 = r5.D(r7);     // Catch: Throwable -> L7
        goto L22
    L16:
        r43 = r5.D(r2);     // Catch: Throwable -> L7
        goto L17
    L195:
        ArrayList r103 = r118;
        r5.close();
        return r103;
    L9:
        r5.r(3, r0);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r5.close();
        throw th;
    }
}
