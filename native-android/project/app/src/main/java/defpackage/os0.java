package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ss0 o;

    public /* synthetic */ os0(ss0 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final Object b(Object r61) {
        Object r1 = this.o.p;
        z34 r2 = ((x34) r61).U("SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, ''), album), album, album_id, disc_number, track ASC");
        int r0 = rr2.E(r2, "id");     // Catch: Throwable -> L36
        int r3 = rr2.E(r2, "playlist_id");     // Catch: Throwable -> L36
        int r4 = rr2.E(r2, "playlist_name");     // Catch: Throwable -> L36
        int r5 = rr2.E(r2, "download_state");     // Catch: Throwable -> L36
        int r6 = rr2.E(r2, "download_uri");     // Catch: Throwable -> L36
        int r7 = rr2.E(r2, "parent_id");     // Catch: Throwable -> L36
        int r8 = rr2.E(r2, "is_dir");     // Catch: Throwable -> L36
        int r9 = rr2.E(r2, "title");     // Catch: Throwable -> L36
        int r10 = rr2.E(r2, "album");     // Catch: Throwable -> L36
        int r11 = rr2.E(r2, "artist");     // Catch: Throwable -> L36
        int r12 = rr2.E(r2, "track");     // Catch: Throwable -> L36
        int r13 = rr2.E(r2, "year");     // Catch: Throwable -> L36
        int r14 = rr2.E(r2, "genre");     // Catch: Throwable -> L36
        int r15 = rr2.E(r2, "cover_art_id");     // Catch: Throwable -> L36
        int r60 = rr2.E(r2, "size");     // Catch: Throwable -> L36
        int r62 = rr2.E(r2, "content_type");     // Catch: Throwable -> L36
        int r16 = rr2.E(r2, "suffix");     // Catch: Throwable -> L36
        int r17 = rr2.E(r2, "transcoding_content_type");     // Catch: Throwable -> L36
        int r18 = rr2.E(r2, "transcoded_suffix");     // Catch: Throwable -> L36
        int r19 = rr2.E(r2, "duration");     // Catch: Throwable -> L36
        int r20 = rr2.E(r2, "bitrate");     // Catch: Throwable -> L36
        int r21 = rr2.E(r2, "sampling_rate");     // Catch: Throwable -> L36
        int r22 = rr2.E(r2, "bit_depth");     // Catch: Throwable -> L36
        int r23 = rr2.E(r2, "path");     // Catch: Throwable -> L36
        int r24 = rr2.E(r2, "is_video");     // Catch: Throwable -> L36
        int r25 = rr2.E(r2, "user_rating");     // Catch: Throwable -> L36
        int r26 = rr2.E(r2, "average_rating");     // Catch: Throwable -> L36
        int r27 = rr2.E(r2, "play_count");     // Catch: Throwable -> L36
        int r28 = rr2.E(r2, "disc_number");     // Catch: Throwable -> L36
        int r29 = rr2.E(r2, "created");     // Catch: Throwable -> L36
        int r30 = rr2.E(r2, "starred");     // Catch: Throwable -> L36
        int r31 = rr2.E(r2, "album_id");     // Catch: Throwable -> L36
        int r32 = rr2.E(r2, "artist_id");     // Catch: Throwable -> L36
        int r33 = rr2.E(r2, "type");     // Catch: Throwable -> L36
        int r34 = rr2.E(r2, "bookmark_position");     // Catch: Throwable -> L36
        int r35 = rr2.E(r2, "original_width");     // Catch: Throwable -> L36
        int r36 = rr2.E(r2, "original_height");     // Catch: Throwable -> L36
        int r37 = rr2.E(r2, "album_artist");     // Catch: Throwable -> L36
        int r110 = rr2.E(r2, "rg_track_gain");     // Catch: Throwable -> L36
        int r38 = r15;
        int r111 = rr2.E(r2, "rg_album_gain");     // Catch: Throwable -> L36
        int r39 = r14;
        int r112 = rr2.E(r2, "rg_track_peak");     // Catch: Throwable -> L36
        int r40 = r13;
        int r113 = rr2.E(r2, "rg_album_peak");     // Catch: Throwable -> L36
        int r41 = r12;
        int r114 = rr2.E(r2, "rg_base_gain");     // Catch: Throwable -> L36
        int r42 = r11;
        int r115 = rr2.E(r2, "rg_fallback_gain");     // Catch: Throwable -> L36
        int r43 = r10;
        ArrayList r44 = new ArrayList();     // Catch: Throwable -> L36
    L4:
        if (r2.O() == false) goto L198;
        String r45 = null;
        if (r2.isNull(r0) == false) goto L9;
        String r47 = null;
    L11:
        if (r2.isNull(r3) == false) goto L13;
        String r48 = null;
    L15:
        if (r2.isNull(r4) == false) goto L17;
        String r49 = null;
    L18:
        int r46 = (int) r2.getLong(r5);     // Catch: Throwable -> L36
        if (r2.isNull(r6) == false) goto L21;
        String r51 = null;
    L23:
        if (r2.isNull(r110) == false) goto L39;
        if (r2.isNull(r111) == false) goto L39;
        if (r2.isNull(r112) == false) goto L39;
        if (r2.isNull(r113) == false) goto L39;
        if (r2.isNull(r114) == false) goto L39;
        if (r2.isNull(r115) == false) goto L39;
        r46 = r46;
        ReplayGainInfo r50 = null;
    L63:
        Download r410 = new Download(r47, r48, r49, r46, r51);     // Catch: Throwable -> L36
        if (r2.isNull(r7) == false) goto L66;
        String r52 = null;
    L67:
        r410.setParentId(r52);     // Catch: Throwable -> L36
        int r53 = r5;
        int r411 = r6;
        if (((int) r2.getLong(r8)) == 0) goto L70;
        boolean r54 = true;
    L71:
        r410.setDir(r54);     // Catch: Throwable -> L36
        if (r2.isNull(r9) == false) goto L74;
        String r55 = null;
    L75:
        r410.setTitle(r55);     // Catch: Throwable -> L36
        int r56 = r43;
        if (r2.isNull(r56) == false) goto L78;
        String r57 = null;
    L79:
        r410.setAlbum(r57);     // Catch: Throwable -> L36
        r42 = r42;
        if (r2.isNull(r42) == false) goto L82;
        String r58 = null;
    L83:
        r410.setArtist(r58);     // Catch: Throwable -> L36
        int r59 = r41;
        if (r2.isNull(r59) == false) goto L86;
        Integer r63 = null;
    L87:
        r410.setTrack(r63);     // Catch: Throwable -> L36
        int r64 = r40;
        if (r2.isNull(r64) == false) goto L90;
        Integer r65 = null;
    L91:
        r410.setYear(r65);     // Catch: Throwable -> L36
        int r66 = r39;
        if (r2.isNull(r66) == false) goto L94;
        String r67 = null;
    L95:
        r410.setGenre(r67);     // Catch: Throwable -> L36
        int r68 = r38;
        if (r2.isNull(r68) == false) goto L98;
        String r69 = null;
    L99:
        r410.setCoverArtId(r69);     // Catch: Throwable -> L36
        r60 = r60;
        if (r2.isNull(r60) == false) goto L102;
        Long r70 = null;
    L103:
        r410.setSize(r70);     // Catch: Throwable -> L36
        r62 = r62;
        if (r2.isNull(r62) == false) goto L106;
        String r71 = null;
    L107:
        r410.setContentType(r71);     // Catch: Throwable -> L36
        int r72 = r16;
        if (r2.isNull(r72) == false) goto L110;
        String r73 = null;
    L111:
        r410.setSuffix(r73);     // Catch: Throwable -> L36
        r17 = r17;
        if (r2.isNull(r17) == false) goto L114;
        String r74 = null;
    L115:
        r410.setTranscodedContentType(r74);     // Catch: Throwable -> L36
        r18 = r18;
        if (r2.isNull(r18) == false) goto L118;
        String r75 = null;
    L119:
        r410.setTranscodedSuffix(r75);     // Catch: Throwable -> L36
        int r76 = r19;
        if (r2.isNull(r76) == false) goto L122;
        Integer r77 = null;
    L123:
        r410.setDuration(r77);     // Catch: Throwable -> L36
        int r78 = r20;
        if (r2.isNull(r78) == false) goto L126;
        Integer r79 = null;
    L127:
        r410.setBitrate(r79);     // Catch: Throwable -> L36
        int r80 = r21;
        if (r2.isNull(r80) == false) goto L130;
        Integer r81 = null;
    L131:
        r410.setSamplingRate(r81);     // Catch: Throwable -> L36
        int r82 = r22;
        if (r2.isNull(r82) == false) goto L134;
        Integer r83 = null;
    L135:
        r410.setBitDepth(r83);     // Catch: Throwable -> L36
        int r84 = r23;
        if (r2.isNull(r84) == false) goto L138;
        String r85 = null;
    L139:
        r410.setPath(r85);     // Catch: Throwable -> L36
        int r86 = r24;
        if (((int) r2.getLong(r86)) == 0) goto L142;
        boolean r87 = true;
    L143:
        r410.setVideo(r87);     // Catch: Throwable -> L36
        int r88 = r25;
        if (r2.isNull(r88) == false) goto L146;
        Integer r89 = null;
    L147:
        r410.setUserRating(r89);     // Catch: Throwable -> L36
        r26 = r26;
        if (r2.isNull(r26) == false) goto L150;
        Double r90 = null;
    L151:
        r410.setAverageRating(r90);     // Catch: Throwable -> L36
        int r91 = r27;
        if (r2.isNull(r91) == false) goto L154;
        Long r92 = null;
    L155:
        r410.setPlayCount(r92);     // Catch: Throwable -> L36
        int r93 = r28;
        if (r2.isNull(r93) == false) goto L158;
        Integer r94 = null;
    L159:
        r410.setDiscNumber(r94);     // Catch: Throwable -> L36
        r29 = r29;
        if (r2.isNull(r29) == false) goto L162;
        Long r95 = null;
    L163:
        r410.setCreated(i80.B(r95));     // Catch: Throwable -> L36
        int r96 = r30;
        if (r2.isNull(r96) == false) goto L167;
        Long r210 = null;
    L168:
        r410.setStarred(i80.B(r210));     // Catch: Throwable -> L36
        r31 = r31;
        if (r2.isNull(r31) == false) goto L171;
        String r97 = null;
    L172:
        r410.setAlbumId(r97);     // Catch: Throwable -> L36
        r32 = r32;
        if (r2.isNull(r32) == false) goto L175;
        String r98 = null;
    L176:
        r410.setArtistId(r98);     // Catch: Throwable -> L36
        r33 = r33;
        if (r2.isNull(r33) == false) goto L179;
        String r99 = null;
    L180:
        r410.setType(r99);     // Catch: Throwable -> L36
        r34 = r34;
        if (r2.isNull(r34) == false) goto L183;
        Long r100 = null;
    L184:
        r410.setBookmarkPosition(r100);     // Catch: Throwable -> L36
        int r101 = r35;
        if (r2.isNull(r101) == false) goto L187;
        Integer r102 = null;
    L188:
        r410.setOriginalWidth(r102);     // Catch: Throwable -> L36
        int r103 = r36;
        if (r2.isNull(r103) == false) goto L191;
        Integer r104 = null;
    L192:
        r410.setOriginalHeight(r104);     // Catch: Throwable -> L36
        int r105 = r37;
        if (r2.isNull(r105) == true) goto L196;
        r45 = r2.D(r105);     // Catch: Throwable -> L36
    L196:
        r410.setAlbumArtist(r45);     // Catch: Throwable -> L36
        r410.setReplayGain(r50);     // Catch: Throwable -> L36
        r44.add(r410);     // Catch: Throwable -> L36
        r23 = r84;
        r8 = r8;
        r21 = r80;
        r22 = r82;
        r37 = r105;
        r7 = r7;
        r3 = r3;
        r6 = r411;
        r4 = r4;
        r40 = r64;
        r16 = r72;
        r38 = r68;
        r20 = r78;
        r24 = r86;
        r25 = r88;
        r36 = r103;
        r5 = r53;
        r43 = r56;
        r41 = r59;
        r39 = r66;
        r19 = r76;
        r27 = r91;
        r28 = r93;
        r30 = r96;
        r35 = r101;
        r0 = r0;
        goto L4
    L191:
        r104 = Integer.valueOf((int) r2.getLong(r103));     // Catch: Throwable -> L36
        goto L192
    L187:
        r102 = Integer.valueOf((int) r2.getLong(r101));     // Catch: Throwable -> L36
        goto L188
    L183:
        r100 = Long.valueOf(r2.getLong(r34));     // Catch: Throwable -> L36
        goto L184
    L179:
        r99 = r2.D(r33);     // Catch: Throwable -> L36
        goto L180
    L175:
        r98 = r2.D(r32);     // Catch: Throwable -> L36
        goto L176
    L171:
        r97 = r2.D(r31);     // Catch: Throwable -> L36
        goto L172
    L167:
        r210 = Long.valueOf(r2.getLong(r96));     // Catch: Throwable -> L36
        goto L168
    L162:
        r95 = Long.valueOf(r2.getLong(r29));     // Catch: Throwable -> L36
        goto L163
    L158:
        r94 = Integer.valueOf((int) r2.getLong(r93));     // Catch: Throwable -> L36
        goto L159
    L154:
        r92 = Long.valueOf(r2.getLong(r91));     // Catch: Throwable -> L36
        goto L155
    L150:
        r90 = Double.valueOf(r2.getDouble(r26));     // Catch: Throwable -> L36
        goto L151
    L146:
        r89 = Integer.valueOf((int) r2.getLong(r88));     // Catch: Throwable -> L36
        goto L147
    L142:
        r87 = false;
        goto L143
    L138:
        r85 = r2.D(r84);     // Catch: Throwable -> L36
        goto L139
    L134:
        r83 = Integer.valueOf((int) r2.getLong(r82));     // Catch: Throwable -> L36
        goto L135
    L130:
        r81 = Integer.valueOf((int) r2.getLong(r80));     // Catch: Throwable -> L36
        goto L131
    L126:
        r79 = Integer.valueOf((int) r2.getLong(r78));     // Catch: Throwable -> L36
        goto L127
    L122:
        r77 = Integer.valueOf((int) r2.getLong(r76));     // Catch: Throwable -> L36
        goto L123
    L118:
        r75 = r2.D(r18);     // Catch: Throwable -> L36
        goto L119
    L114:
        r74 = r2.D(r17);     // Catch: Throwable -> L36
        goto L115
    L110:
        r73 = r2.D(r72);     // Catch: Throwable -> L36
        goto L111
    L106:
        r71 = r2.D(r62);     // Catch: Throwable -> L36
        goto L107
    L102:
        r70 = Long.valueOf(r2.getLong(r60));     // Catch: Throwable -> L36
        goto L103
    L98:
        r69 = r2.D(r68);     // Catch: Throwable -> L36
        goto L99
    L94:
        r67 = r2.D(r66);     // Catch: Throwable -> L36
        goto L95
    L90:
        r65 = Integer.valueOf((int) r2.getLong(r64));     // Catch: Throwable -> L36
        goto L91
    L86:
        r63 = Integer.valueOf((int) r2.getLong(r59));     // Catch: Throwable -> L36
        goto L87
    L82:
        r58 = r2.D(r42);     // Catch: Throwable -> L36
        goto L83
    L78:
        r57 = r2.D(r56);     // Catch: Throwable -> L36
        goto L79
    L74:
        r55 = r2.D(r9);     // Catch: Throwable -> L36
        goto L75
    L70:
        r54 = false;
        goto L71
    L66:
        r52 = r2.D(r7);     // Catch: Throwable -> L36
    L39:
        if (r2.isNull(r110) == false) goto L41;
        Float r510 = null;
    L43:
        if (r2.isNull(r111) == false) goto L45;
        Float r511 = null;
    L47:
        if (r2.isNull(r112) == false) goto L49;
        Float r512 = null;
    L51:
        if (r2.isNull(r113) == false) goto L53;
        Float r513 = null;
    L55:
        if (r2.isNull(r114) == false) goto L57;
        Float r514 = null;
    L59:
        if (r2.isNull(r115) == false) goto L61;
        Float r515 = null;
    L62:
        r50 = new ReplayGainInfo(r510, r511, r512, r513, r514, r515);     // Catch: Throwable -> L36
        goto L63
    L61:
        r515 = Float.valueOf((float) r2.getDouble(r115));     // Catch: Throwable -> L36
        goto L62
    L57:
        r514 = Float.valueOf((float) r2.getDouble(r114));     // Catch: Throwable -> L36
        goto L59
    L53:
        r513 = Float.valueOf((float) r2.getDouble(r113));     // Catch: Throwable -> L36
        goto L55
    L49:
        r512 = Float.valueOf((float) r2.getDouble(r112));     // Catch: Throwable -> L36
        goto L51
    L45:
        r511 = Float.valueOf((float) r2.getDouble(r111));     // Catch: Throwable -> L36
        goto L47
    L41:
        r510 = Float.valueOf((float) r2.getDouble(r110));     // Catch: Throwable -> L36
        goto L43
    L21:
        r51 = r2.D(r6);     // Catch: Throwable -> L36
        goto L23
    L17:
        r49 = r2.D(r4);     // Catch: Throwable -> L36
        goto L18
    L13:
        r48 = r2.D(r3);     // Catch: Throwable -> L36
        goto L15
    L9:
        r47 = r2.D(r0);     // Catch: Throwable -> L36
        goto L11
    L198:
        r2.close();
        return r44;
    L36:
        th = move-exception;
        r2.close();
        throw th;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r61) {
        switch(this.n) {
            case 0: goto L205;
            default: goto L4;
        };
    L4:
        Object r0 = this.o.p;
        z34 r1 = ((x34) r61).U("SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, ''), album), album, album_id, disc_number, track ASC");
        int r2 = rr2.E(r1, "id");     // Catch: Throwable -> L38
        int r3 = rr2.E(r1, "playlist_id");     // Catch: Throwable -> L38
        int r4 = rr2.E(r1, "playlist_name");     // Catch: Throwable -> L38
        int r5 = rr2.E(r1, "download_state");     // Catch: Throwable -> L38
        int r6 = rr2.E(r1, "download_uri");     // Catch: Throwable -> L38
        int r7 = rr2.E(r1, "parent_id");     // Catch: Throwable -> L38
        int r8 = rr2.E(r1, "is_dir");     // Catch: Throwable -> L38
        int r9 = rr2.E(r1, "title");     // Catch: Throwable -> L38
        int r10 = rr2.E(r1, "album");     // Catch: Throwable -> L38
        int r11 = rr2.E(r1, "artist");     // Catch: Throwable -> L38
        int r12 = rr2.E(r1, "track");     // Catch: Throwable -> L38
        int r13 = rr2.E(r1, "year");     // Catch: Throwable -> L38
        int r14 = rr2.E(r1, "genre");     // Catch: Throwable -> L38
        int r15 = rr2.E(r1, "cover_art_id");     // Catch: Throwable -> L38
        int r60 = rr2.E(r1, "size");     // Catch: Throwable -> L38
        int r62 = rr2.E(r1, "content_type");     // Catch: Throwable -> L38
        int r16 = rr2.E(r1, "suffix");     // Catch: Throwable -> L38
        int r17 = rr2.E(r1, "transcoding_content_type");     // Catch: Throwable -> L38
        int r18 = rr2.E(r1, "transcoded_suffix");     // Catch: Throwable -> L38
        int r19 = rr2.E(r1, "duration");     // Catch: Throwable -> L38
        int r20 = rr2.E(r1, "bitrate");     // Catch: Throwable -> L38
        int r21 = rr2.E(r1, "sampling_rate");     // Catch: Throwable -> L38
        int r22 = rr2.E(r1, "bit_depth");     // Catch: Throwable -> L38
        int r23 = rr2.E(r1, "path");     // Catch: Throwable -> L38
        int r24 = rr2.E(r1, "is_video");     // Catch: Throwable -> L38
        int r25 = rr2.E(r1, "user_rating");     // Catch: Throwable -> L38
        int r26 = rr2.E(r1, "average_rating");     // Catch: Throwable -> L38
        int r27 = rr2.E(r1, "play_count");     // Catch: Throwable -> L38
        int r28 = rr2.E(r1, "disc_number");     // Catch: Throwable -> L38
        int r29 = rr2.E(r1, "created");     // Catch: Throwable -> L38
        int r30 = rr2.E(r1, "starred");     // Catch: Throwable -> L38
        int r31 = rr2.E(r1, "album_id");     // Catch: Throwable -> L38
        int r32 = rr2.E(r1, "artist_id");     // Catch: Throwable -> L38
        int r33 = rr2.E(r1, "type");     // Catch: Throwable -> L38
        int r34 = rr2.E(r1, "bookmark_position");     // Catch: Throwable -> L38
        int r35 = rr2.E(r1, "original_width");     // Catch: Throwable -> L38
        int r36 = rr2.E(r1, "original_height");     // Catch: Throwable -> L38
        int r37 = rr2.E(r1, "album_artist");     // Catch: Throwable -> L38
        int r110 = rr2.E(r1, "rg_track_gain");     // Catch: Throwable -> L38
        int r38 = r15;
        int r111 = rr2.E(r1, "rg_album_gain");     // Catch: Throwable -> L38
        int r39 = r14;
        int r112 = rr2.E(r1, "rg_track_peak");     // Catch: Throwable -> L38
        int r40 = r13;
        int r113 = rr2.E(r1, "rg_album_peak");     // Catch: Throwable -> L38
        int r41 = r12;
        int r114 = rr2.E(r1, "rg_base_gain");     // Catch: Throwable -> L38
        int r42 = r11;
        int r115 = rr2.E(r1, "rg_fallback_gain");     // Catch: Throwable -> L38
        int r43 = r10;
        ArrayList r44 = new ArrayList();     // Catch: Throwable -> L38
    L6:
        if (r1.O() == false) goto L200;
        String r45 = null;
        if (r1.isNull(r2) == false) goto L11;
        String r47 = null;
    L13:
        if (r1.isNull(r3) == false) goto L15;
        String r48 = null;
    L17:
        if (r1.isNull(r4) == false) goto L19;
        String r49 = null;
    L20:
        int r46 = (int) r1.getLong(r5);     // Catch: Throwable -> L38
        if (r1.isNull(r6) == false) goto L23;
        String r51 = null;
    L25:
        if (r1.isNull(r110) == false) goto L41;
        if (r1.isNull(r111) == false) goto L41;
        if (r1.isNull(r112) == false) goto L41;
        if (r1.isNull(r113) == false) goto L41;
        if (r1.isNull(r114) == false) goto L41;
        if (r1.isNull(r115) == false) goto L41;
        r46 = r46;
        ReplayGainInfo r50 = null;
    L65:
        Download r410 = new Download(r47, r48, r49, r46, r51);     // Catch: Throwable -> L38
        if (r1.isNull(r7) == false) goto L68;
        String r52 = null;
    L69:
        r410.setParentId(r52);     // Catch: Throwable -> L38
        int r53 = r5;
        int r411 = r6;
        if (((int) r1.getLong(r8)) == 0) goto L72;
        boolean r54 = true;
    L73:
        r410.setDir(r54);     // Catch: Throwable -> L38
        if (r1.isNull(r9) == false) goto L76;
        String r55 = null;
    L77:
        r410.setTitle(r55);     // Catch: Throwable -> L38
        int r56 = r43;
        if (r1.isNull(r56) == false) goto L80;
        String r57 = null;
    L81:
        r410.setAlbum(r57);     // Catch: Throwable -> L38
        r42 = r42;
        if (r1.isNull(r42) == false) goto L84;
        String r58 = null;
    L85:
        r410.setArtist(r58);     // Catch: Throwable -> L38
        int r59 = r41;
        if (r1.isNull(r59) == false) goto L88;
        Integer r63 = null;
    L89:
        r410.setTrack(r63);     // Catch: Throwable -> L38
        int r64 = r40;
        if (r1.isNull(r64) == false) goto L92;
        Integer r65 = null;
    L93:
        r410.setYear(r65);     // Catch: Throwable -> L38
        int r66 = r39;
        if (r1.isNull(r66) == false) goto L96;
        String r67 = null;
    L97:
        r410.setGenre(r67);     // Catch: Throwable -> L38
        int r68 = r38;
        if (r1.isNull(r68) == false) goto L100;
        String r69 = null;
    L101:
        r410.setCoverArtId(r69);     // Catch: Throwable -> L38
        r60 = r60;
        if (r1.isNull(r60) == false) goto L104;
        Long r70 = null;
    L105:
        r410.setSize(r70);     // Catch: Throwable -> L38
        r62 = r62;
        if (r1.isNull(r62) == false) goto L108;
        String r71 = null;
    L109:
        r410.setContentType(r71);     // Catch: Throwable -> L38
        int r72 = r16;
        if (r1.isNull(r72) == false) goto L112;
        String r73 = null;
    L113:
        r410.setSuffix(r73);     // Catch: Throwable -> L38
        r17 = r17;
        if (r1.isNull(r17) == false) goto L116;
        String r74 = null;
    L117:
        r410.setTranscodedContentType(r74);     // Catch: Throwable -> L38
        r18 = r18;
        if (r1.isNull(r18) == false) goto L120;
        String r75 = null;
    L121:
        r410.setTranscodedSuffix(r75);     // Catch: Throwable -> L38
        int r76 = r19;
        if (r1.isNull(r76) == false) goto L124;
        Integer r77 = null;
    L125:
        r410.setDuration(r77);     // Catch: Throwable -> L38
        int r78 = r20;
        if (r1.isNull(r78) == false) goto L128;
        Integer r79 = null;
    L129:
        r410.setBitrate(r79);     // Catch: Throwable -> L38
        int r80 = r21;
        if (r1.isNull(r80) == false) goto L132;
        Integer r81 = null;
    L133:
        r410.setSamplingRate(r81);     // Catch: Throwable -> L38
        int r82 = r22;
        if (r1.isNull(r82) == false) goto L136;
        Integer r83 = null;
    L137:
        r410.setBitDepth(r83);     // Catch: Throwable -> L38
        int r84 = r23;
        if (r1.isNull(r84) == false) goto L140;
        String r85 = null;
    L141:
        r410.setPath(r85);     // Catch: Throwable -> L38
        int r86 = r24;
        if (((int) r1.getLong(r86)) == 0) goto L144;
        boolean r87 = true;
    L145:
        r410.setVideo(r87);     // Catch: Throwable -> L38
        int r88 = r25;
        if (r1.isNull(r88) == false) goto L148;
        Integer r89 = null;
    L149:
        r410.setUserRating(r89);     // Catch: Throwable -> L38
        r26 = r26;
        if (r1.isNull(r26) == false) goto L152;
        Double r90 = null;
    L153:
        r410.setAverageRating(r90);     // Catch: Throwable -> L38
        int r91 = r27;
        if (r1.isNull(r91) == false) goto L156;
        Long r92 = null;
    L157:
        r410.setPlayCount(r92);     // Catch: Throwable -> L38
        int r93 = r28;
        if (r1.isNull(r93) == false) goto L160;
        Integer r94 = null;
    L161:
        r410.setDiscNumber(r94);     // Catch: Throwable -> L38
        r29 = r29;
        if (r1.isNull(r29) == false) goto L164;
        Long r95 = null;
    L165:
        r410.setCreated(i80.B(r95));     // Catch: Throwable -> L38
        int r96 = r30;
        if (r1.isNull(r96) == false) goto L169;
        Long r210 = null;
    L170:
        r410.setStarred(i80.B(r210));     // Catch: Throwable -> L38
        r31 = r31;
        if (r1.isNull(r31) == false) goto L173;
        String r97 = null;
    L174:
        r410.setAlbumId(r97);     // Catch: Throwable -> L38
        r32 = r32;
        if (r1.isNull(r32) == false) goto L177;
        String r98 = null;
    L178:
        r410.setArtistId(r98);     // Catch: Throwable -> L38
        r33 = r33;
        if (r1.isNull(r33) == false) goto L181;
        String r99 = null;
    L182:
        r410.setType(r99);     // Catch: Throwable -> L38
        r34 = r34;
        if (r1.isNull(r34) == false) goto L185;
        Long r100 = null;
    L186:
        r410.setBookmarkPosition(r100);     // Catch: Throwable -> L38
        int r101 = r35;
        if (r1.isNull(r101) == false) goto L189;
        Integer r102 = null;
    L190:
        r410.setOriginalWidth(r102);     // Catch: Throwable -> L38
        int r103 = r36;
        if (r1.isNull(r103) == false) goto L193;
        Integer r104 = null;
    L194:
        r410.setOriginalHeight(r104);     // Catch: Throwable -> L38
        int r105 = r37;
        if (r1.isNull(r105) == true) goto L198;
        r45 = r1.D(r105);     // Catch: Throwable -> L38
    L198:
        r410.setAlbumArtist(r45);     // Catch: Throwable -> L38
        r410.setReplayGain(r50);     // Catch: Throwable -> L38
        r44.add(r410);     // Catch: Throwable -> L38
        r23 = r84;
        r8 = r8;
        r21 = r80;
        r22 = r82;
        r37 = r105;
        r7 = r7;
        r3 = r3;
        r6 = r411;
        r4 = r4;
        r40 = r64;
        r16 = r72;
        r38 = r68;
        r20 = r78;
        r24 = r86;
        r25 = r88;
        r36 = r103;
        r5 = r53;
        r43 = r56;
        r41 = r59;
        r39 = r66;
        r19 = r76;
        r27 = r91;
        r28 = r93;
        r30 = r96;
        r35 = r101;
        r2 = r2;
        goto L6
    L193:
        r104 = Integer.valueOf((int) r1.getLong(r103));     // Catch: Throwable -> L38
        goto L194
    L189:
        r102 = Integer.valueOf((int) r1.getLong(r101));     // Catch: Throwable -> L38
        goto L190
    L185:
        r100 = Long.valueOf(r1.getLong(r34));     // Catch: Throwable -> L38
        goto L186
    L181:
        r99 = r1.D(r33);     // Catch: Throwable -> L38
        goto L182
    L177:
        r98 = r1.D(r32);     // Catch: Throwable -> L38
        goto L178
    L173:
        r97 = r1.D(r31);     // Catch: Throwable -> L38
        goto L174
    L169:
        r210 = Long.valueOf(r1.getLong(r96));     // Catch: Throwable -> L38
        goto L170
    L164:
        r95 = Long.valueOf(r1.getLong(r29));     // Catch: Throwable -> L38
        goto L165
    L160:
        r94 = Integer.valueOf((int) r1.getLong(r93));     // Catch: Throwable -> L38
        goto L161
    L156:
        r92 = Long.valueOf(r1.getLong(r91));     // Catch: Throwable -> L38
        goto L157
    L152:
        r90 = Double.valueOf(r1.getDouble(r26));     // Catch: Throwable -> L38
        goto L153
    L148:
        r89 = Integer.valueOf((int) r1.getLong(r88));     // Catch: Throwable -> L38
        goto L149
    L144:
        r87 = false;
        goto L145
    L140:
        r85 = r1.D(r84);     // Catch: Throwable -> L38
        goto L141
    L136:
        r83 = Integer.valueOf((int) r1.getLong(r82));     // Catch: Throwable -> L38
        goto L137
    L132:
        r81 = Integer.valueOf((int) r1.getLong(r80));     // Catch: Throwable -> L38
        goto L133
    L128:
        r79 = Integer.valueOf((int) r1.getLong(r78));     // Catch: Throwable -> L38
        goto L129
    L124:
        r77 = Integer.valueOf((int) r1.getLong(r76));     // Catch: Throwable -> L38
        goto L125
    L120:
        r75 = r1.D(r18);     // Catch: Throwable -> L38
        goto L121
    L116:
        r74 = r1.D(r17);     // Catch: Throwable -> L38
        goto L117
    L112:
        r73 = r1.D(r72);     // Catch: Throwable -> L38
        goto L113
    L108:
        r71 = r1.D(r62);     // Catch: Throwable -> L38
        goto L109
    L104:
        r70 = Long.valueOf(r1.getLong(r60));     // Catch: Throwable -> L38
        goto L105
    L100:
        r69 = r1.D(r68);     // Catch: Throwable -> L38
        goto L101
    L96:
        r67 = r1.D(r66);     // Catch: Throwable -> L38
        goto L97
    L92:
        r65 = Integer.valueOf((int) r1.getLong(r64));     // Catch: Throwable -> L38
        goto L93
    L88:
        r63 = Integer.valueOf((int) r1.getLong(r59));     // Catch: Throwable -> L38
        goto L89
    L84:
        r58 = r1.D(r42);     // Catch: Throwable -> L38
        goto L85
    L80:
        r57 = r1.D(r56);     // Catch: Throwable -> L38
        goto L81
    L76:
        r55 = r1.D(r9);     // Catch: Throwable -> L38
        goto L77
    L72:
        r54 = false;
        goto L73
    L68:
        r52 = r1.D(r7);     // Catch: Throwable -> L38
    L41:
        if (r1.isNull(r110) == false) goto L43;
        Float r510 = null;
    L45:
        if (r1.isNull(r111) == false) goto L47;
        Float r511 = null;
    L49:
        if (r1.isNull(r112) == false) goto L51;
        Float r512 = null;
    L53:
        if (r1.isNull(r113) == false) goto L55;
        Float r513 = null;
    L57:
        if (r1.isNull(r114) == false) goto L59;
        Float r514 = null;
    L61:
        if (r1.isNull(r115) == false) goto L63;
        Float r515 = null;
    L64:
        r50 = new ReplayGainInfo(r510, r511, r512, r513, r514, r515);     // Catch: Throwable -> L38
        goto L65
    L63:
        r515 = Float.valueOf((float) r1.getDouble(r115));     // Catch: Throwable -> L38
        goto L64
    L59:
        r514 = Float.valueOf((float) r1.getDouble(r114));     // Catch: Throwable -> L38
        goto L61
    L55:
        r513 = Float.valueOf((float) r1.getDouble(r113));     // Catch: Throwable -> L38
        goto L57
    L51:
        r512 = Float.valueOf((float) r1.getDouble(r112));     // Catch: Throwable -> L38
        goto L53
    L47:
        r511 = Float.valueOf((float) r1.getDouble(r111));     // Catch: Throwable -> L38
        goto L49
    L43:
        r510 = Float.valueOf((float) r1.getDouble(r110));     // Catch: Throwable -> L38
        goto L45
    L23:
        r51 = r1.D(r6);     // Catch: Throwable -> L38
        goto L25
    L19:
        r49 = r1.D(r4);     // Catch: Throwable -> L38
        goto L20
    L15:
        r48 = r1.D(r3);     // Catch: Throwable -> L38
        goto L17
    L11:
        r47 = r1.D(r2);     // Catch: Throwable -> L38
        goto L13
    L200:
        r1.close();
        return r44;
    L38:
        th = move-exception;
        r1.close();
        throw th;
    L205:
        return b(r61);
    }
}
