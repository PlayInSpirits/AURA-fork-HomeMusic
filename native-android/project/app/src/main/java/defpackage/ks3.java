package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ns3 o;

    public /* synthetic */ ks3(ns3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final Object b(Object r61) {
        Object r1 = this.o.q;
        z34 r2 = ((x34) r61).U("SELECT * FROM queue ORDER BY last_play DESC LIMIT 1");
        int r0 = rr2.E(r2, "id");     // Catch: Throwable -> L28
        int r3 = rr2.E(r2, "track_order");     // Catch: Throwable -> L28
        int r4 = rr2.E(r2, "last_play");     // Catch: Throwable -> L28
        int r5 = rr2.E(r2, "playing_changed");     // Catch: Throwable -> L28
        int r6 = rr2.E(r2, "stream_id");     // Catch: Throwable -> L28
        int r7 = rr2.E(r2, "parent_id");     // Catch: Throwable -> L28
        int r8 = rr2.E(r2, "is_dir");     // Catch: Throwable -> L28
        int r9 = rr2.E(r2, "title");     // Catch: Throwable -> L28
        int r10 = rr2.E(r2, "album");     // Catch: Throwable -> L28
        int r11 = rr2.E(r2, "artist");     // Catch: Throwable -> L28
        int r12 = rr2.E(r2, "track");     // Catch: Throwable -> L28
        int r13 = rr2.E(r2, "year");     // Catch: Throwable -> L28
        int r14 = rr2.E(r2, "genre");     // Catch: Throwable -> L28
        int r15 = rr2.E(r2, "cover_art_id");     // Catch: Throwable -> L28
        int r16 = rr2.E(r2, "size");     // Catch: Throwable -> L28
        int r17 = rr2.E(r2, "content_type");     // Catch: Throwable -> L28
        int r18 = rr2.E(r2, "suffix");     // Catch: Throwable -> L28
        int r19 = rr2.E(r2, "transcoding_content_type");     // Catch: Throwable -> L28
        int r110 = rr2.E(r2, "transcoded_suffix");     // Catch: Throwable -> L28
        int r111 = rr2.E(r2, "duration");     // Catch: Throwable -> L28
        int r112 = rr2.E(r2, "bitrate");     // Catch: Throwable -> L28
        int r113 = rr2.E(r2, "sampling_rate");     // Catch: Throwable -> L28
        int r114 = rr2.E(r2, "bit_depth");     // Catch: Throwable -> L28
        int r115 = rr2.E(r2, "path");     // Catch: Throwable -> L28
        int r116 = rr2.E(r2, "is_video");     // Catch: Throwable -> L28
        int r117 = rr2.E(r2, "user_rating");     // Catch: Throwable -> L28
        int r118 = rr2.E(r2, "average_rating");     // Catch: Throwable -> L28
        int r119 = rr2.E(r2, "play_count");     // Catch: Throwable -> L28
        int r120 = rr2.E(r2, "disc_number");     // Catch: Throwable -> L28
        int r121 = rr2.E(r2, "created");     // Catch: Throwable -> L28
        int r122 = rr2.E(r2, "starred");     // Catch: Throwable -> L28
        int r123 = rr2.E(r2, "album_id");     // Catch: Throwable -> L28
        int r124 = rr2.E(r2, "artist_id");     // Catch: Throwable -> L28
        int r125 = rr2.E(r2, "type");     // Catch: Throwable -> L28
        int r126 = rr2.E(r2, "bookmark_position");     // Catch: Throwable -> L28
        int r127 = rr2.E(r2, "original_width");     // Catch: Throwable -> L28
        int r128 = rr2.E(r2, "original_height");     // Catch: Throwable -> L28
        int r129 = rr2.E(r2, "album_artist");     // Catch: Throwable -> L28
        int r130 = rr2.E(r2, "rg_track_gain");     // Catch: Throwable -> L28
        int r131 = rr2.E(r2, "rg_album_gain");     // Catch: Throwable -> L28
        int r132 = rr2.E(r2, "rg_track_peak");     // Catch: Throwable -> L28
        int r133 = rr2.E(r2, "rg_album_peak");     // Catch: Throwable -> L28
        int r134 = rr2.E(r2, "rg_base_gain");     // Catch: Throwable -> L28
        int r135 = rr2.E(r2, "rg_fallback_gain");     // Catch: Throwable -> L28
        Queue r44 = null;
        String r45 = null;
        if (r2.O() == true) goto L6;
    L188:
        r2.close();
        return r44;
    L6:
        if (r2.isNull(r0) == false) goto L9;
        String r46 = null;
    L10:
        int r20 = (int) r2.getLong(r3);     // Catch: Throwable -> L28
        long r48 = r2.getLong(r4);     // Catch: Throwable -> L28
        long r50 = r2.getLong(r5);     // Catch: Throwable -> L28
        if (r2.isNull(r6) == false) goto L13;
        String r52 = null;
    L15:
        if (r2.isNull(r130) == false) goto L31;
        if (r2.isNull(r131) == false) goto L31;
        if (r2.isNull(r132) == false) goto L31;
        if (r2.isNull(r133) == false) goto L31;
        if (r2.isNull(r134) == false) goto L31;
        if (r2.isNull(r135) == false) goto L31;
        ReplayGainInfo r21 = null;
    L55:
        Queue r47 = new Queue(r46, r20, r48, r50, r52);     // Catch: Throwable -> L28
        if (r2.isNull(r7) == false) goto L58;
        String r22 = null;
    L59:
        r47.setParentId(r22);     // Catch: Throwable -> L28
        boolean r23 = false;
        if (((int) r2.getLong(r8)) == 0) goto L62;
        boolean r24 = true;
    L63:
        r47.setDir(r24);     // Catch: Throwable -> L28
        if (r2.isNull(r9) == false) goto L66;
        String r25 = null;
    L67:
        r47.setTitle(r25);     // Catch: Throwable -> L28
        if (r2.isNull(r10) == false) goto L70;
        String r26 = null;
    L71:
        r47.setAlbum(r26);     // Catch: Throwable -> L28
        if (r2.isNull(r11) == false) goto L74;
        String r27 = null;
    L75:
        r47.setArtist(r27);     // Catch: Throwable -> L28
        if (r2.isNull(r12) == false) goto L78;
        Integer r28 = null;
    L79:
        r47.setTrack(r28);     // Catch: Throwable -> L28
        if (r2.isNull(r13) == false) goto L82;
        Integer r29 = null;
    L83:
        r47.setYear(r29);     // Catch: Throwable -> L28
        if (r2.isNull(r14) == false) goto L86;
        String r30 = null;
    L87:
        r47.setGenre(r30);     // Catch: Throwable -> L28
        if (r2.isNull(r15) == false) goto L90;
        String r31 = null;
    L91:
        r47.setCoverArtId(r31);     // Catch: Throwable -> L28
        if (r2.isNull(r16) == false) goto L94;
        Long r32 = null;
    L95:
        r47.setSize(r32);     // Catch: Throwable -> L28
        if (r2.isNull(r17) == false) goto L98;
        String r33 = null;
    L99:
        r47.setContentType(r33);     // Catch: Throwable -> L28
        if (r2.isNull(r18) == false) goto L102;
        String r34 = null;
    L103:
        r47.setSuffix(r34);     // Catch: Throwable -> L28
        if (r2.isNull(r19) == false) goto L106;
        String r35 = null;
    L107:
        r47.setTranscodedContentType(r35);     // Catch: Throwable -> L28
        if (r2.isNull(r110) == false) goto L110;
        String r36 = null;
    L111:
        r47.setTranscodedSuffix(r36);     // Catch: Throwable -> L28
        if (r2.isNull(r111) == false) goto L114;
        Integer r37 = null;
    L115:
        r47.setDuration(r37);     // Catch: Throwable -> L28
        if (r2.isNull(r112) == false) goto L118;
        Integer r38 = null;
    L119:
        r47.setBitrate(r38);     // Catch: Throwable -> L28
        if (r2.isNull(r113) == false) goto L122;
        Integer r39 = null;
    L123:
        r47.setSamplingRate(r39);     // Catch: Throwable -> L28
        if (r2.isNull(r114) == false) goto L126;
        Integer r40 = null;
    L127:
        r47.setBitDepth(r40);     // Catch: Throwable -> L28
        if (r2.isNull(r115) == false) goto L130;
        String r41 = null;
    L131:
        r47.setPath(r41);     // Catch: Throwable -> L28
        if (((int) r2.getLong(r116)) == 0) goto L134;
        r23 = true;
    L134:
        r47.setVideo(r23);     // Catch: Throwable -> L28
        if (r2.isNull(r117) == false) goto L137;
        Integer r42 = null;
    L138:
        r47.setUserRating(r42);     // Catch: Throwable -> L28
        if (r2.isNull(r118) == false) goto L141;
        Double r43 = null;
    L142:
        r47.setAverageRating(r43);     // Catch: Throwable -> L28
        if (r2.isNull(r119) == false) goto L145;
        Long r49 = null;
    L146:
        r47.setPlayCount(r49);     // Catch: Throwable -> L28
        if (r2.isNull(r120) == false) goto L149;
        Integer r51 = null;
    L150:
        r47.setDiscNumber(r51);     // Catch: Throwable -> L28
        if (r2.isNull(r121) == false) goto L153;
        Long r53 = null;
    L154:
        r47.setCreated(i80.B(r53));     // Catch: Throwable -> L28
        if (r2.isNull(r122) == false) goto L157;
        Long r54 = null;
    L158:
        r47.setStarred(i80.B(r54));     // Catch: Throwable -> L28
        if (r2.isNull(r123) == false) goto L161;
        String r55 = null;
    L162:
        r47.setAlbumId(r55);     // Catch: Throwable -> L28
        if (r2.isNull(r124) == false) goto L165;
        String r56 = null;
    L166:
        r47.setArtistId(r56);     // Catch: Throwable -> L28
        if (r2.isNull(r125) == false) goto L169;
        String r57 = null;
    L170:
        r47.setType(r57);     // Catch: Throwable -> L28
        if (r2.isNull(r126) == false) goto L173;
        Long r58 = null;
    L174:
        r47.setBookmarkPosition(r58);     // Catch: Throwable -> L28
        if (r2.isNull(r127) == false) goto L177;
        Integer r59 = null;
    L178:
        r47.setOriginalWidth(r59);     // Catch: Throwable -> L28
        if (r2.isNull(r128) == false) goto L181;
        Integer r60 = null;
    L182:
        r47.setOriginalHeight(r60);     // Catch: Throwable -> L28
        if (r2.isNull(r129) == true) goto L186;
        r45 = r2.D(r129);     // Catch: Throwable -> L28
    L186:
        r47.setAlbumArtist(r45);     // Catch: Throwable -> L28
        r47.setReplayGain(r21);     // Catch: Throwable -> L28
        r44 = r47;
        goto L188
    L181:
        r60 = Integer.valueOf((int) r2.getLong(r128));     // Catch: Throwable -> L28
        goto L182
    L177:
        r59 = Integer.valueOf((int) r2.getLong(r127));     // Catch: Throwable -> L28
        goto L178
    L173:
        r58 = Long.valueOf(r2.getLong(r126));     // Catch: Throwable -> L28
        goto L174
    L169:
        r57 = r2.D(r125);     // Catch: Throwable -> L28
        goto L170
    L165:
        r56 = r2.D(r124);     // Catch: Throwable -> L28
        goto L166
    L161:
        r55 = r2.D(r123);     // Catch: Throwable -> L28
        goto L162
    L157:
        r54 = Long.valueOf(r2.getLong(r122));     // Catch: Throwable -> L28
        goto L158
    L153:
        r53 = Long.valueOf(r2.getLong(r121));     // Catch: Throwable -> L28
        goto L154
    L149:
        r51 = Integer.valueOf((int) r2.getLong(r120));     // Catch: Throwable -> L28
        goto L150
    L145:
        r49 = Long.valueOf(r2.getLong(r119));     // Catch: Throwable -> L28
        goto L146
    L141:
        r43 = Double.valueOf(r2.getDouble(r118));     // Catch: Throwable -> L28
        goto L142
    L137:
        r42 = Integer.valueOf((int) r2.getLong(r117));     // Catch: Throwable -> L28
        goto L138
    L130:
        r41 = r2.D(r115);     // Catch: Throwable -> L28
        goto L131
    L126:
        r40 = Integer.valueOf((int) r2.getLong(r114));     // Catch: Throwable -> L28
        goto L127
    L122:
        r39 = Integer.valueOf((int) r2.getLong(r113));     // Catch: Throwable -> L28
        goto L123
    L118:
        r38 = Integer.valueOf((int) r2.getLong(r112));     // Catch: Throwable -> L28
        goto L119
    L114:
        r37 = Integer.valueOf((int) r2.getLong(r111));     // Catch: Throwable -> L28
        goto L115
    L110:
        r36 = r2.D(r110);     // Catch: Throwable -> L28
        goto L111
    L106:
        r35 = r2.D(r19);     // Catch: Throwable -> L28
        goto L107
    L102:
        r34 = r2.D(r18);     // Catch: Throwable -> L28
        goto L103
    L98:
        r33 = r2.D(r17);     // Catch: Throwable -> L28
        goto L99
    L94:
        r32 = Long.valueOf(r2.getLong(r16));     // Catch: Throwable -> L28
        goto L95
    L90:
        r31 = r2.D(r15);     // Catch: Throwable -> L28
        goto L91
    L86:
        r30 = r2.D(r14);     // Catch: Throwable -> L28
        goto L87
    L82:
        r29 = Integer.valueOf((int) r2.getLong(r13));     // Catch: Throwable -> L28
        goto L83
    L78:
        r28 = Integer.valueOf((int) r2.getLong(r12));     // Catch: Throwable -> L28
        goto L79
    L74:
        r27 = r2.D(r11);     // Catch: Throwable -> L28
        goto L75
    L70:
        r26 = r2.D(r10);     // Catch: Throwable -> L28
        goto L71
    L66:
        r25 = r2.D(r9);     // Catch: Throwable -> L28
        goto L67
    L62:
        r24 = false;
        goto L63
    L58:
        r22 = r2.D(r7);     // Catch: Throwable -> L28
    L31:
        if (r2.isNull(r130) == false) goto L33;
        Float r510 = null;
    L35:
        if (r2.isNull(r131) == false) goto L37;
        Float r511 = null;
    L39:
        if (r2.isNull(r132) == false) goto L41;
        Float r512 = null;
    L43:
        if (r2.isNull(r133) == false) goto L45;
        Float r513 = null;
    L47:
        if (r2.isNull(r134) == false) goto L49;
        Float r514 = null;
    L51:
        if (r2.isNull(r135) == false) goto L53;
        Float r515 = null;
    L54:
        r21 = new ReplayGainInfo(r510, r511, r512, r513, r514, r515);     // Catch: Throwable -> L28
        goto L55
    L53:
        r515 = Float.valueOf((float) r2.getDouble(r135));     // Catch: Throwable -> L28
        goto L54
    L49:
        r514 = Float.valueOf((float) r2.getDouble(r134));     // Catch: Throwable -> L28
        goto L51
    L45:
        r513 = Float.valueOf((float) r2.getDouble(r133));     // Catch: Throwable -> L28
        goto L47
    L41:
        r512 = Float.valueOf((float) r2.getDouble(r132));     // Catch: Throwable -> L28
        goto L43
    L37:
        r511 = Float.valueOf((float) r2.getDouble(r131));     // Catch: Throwable -> L28
        goto L39
    L33:
        r510 = Float.valueOf((float) r2.getDouble(r130));     // Catch: Throwable -> L28
        goto L35
    L13:
        r52 = r2.D(r6);     // Catch: Throwable -> L28
        goto L15
    L9:
        r46 = r2.D(r0);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r2.close();
        throw th;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r64) {
        switch(this.n) {
            case 0: goto L197;
            default: goto L4;
        };
    L4:
        Object r0 = this.o.q;
        z34 r1 = ((x34) r64).U("SELECT * FROM queue ORDER BY track_order ASC");
        int r2 = rr2.E(r1, "id");     // Catch: Throwable -> L30
        int r3 = rr2.E(r1, "track_order");     // Catch: Throwable -> L30
        int r4 = rr2.E(r1, "last_play");     // Catch: Throwable -> L30
        int r5 = rr2.E(r1, "playing_changed");     // Catch: Throwable -> L30
        int r6 = rr2.E(r1, "stream_id");     // Catch: Throwable -> L30
        int r7 = rr2.E(r1, "parent_id");     // Catch: Throwable -> L30
        int r8 = rr2.E(r1, "is_dir");     // Catch: Throwable -> L30
        int r9 = rr2.E(r1, "title");     // Catch: Throwable -> L30
        int r10 = rr2.E(r1, "album");     // Catch: Throwable -> L30
        int r11 = rr2.E(r1, "artist");     // Catch: Throwable -> L30
        int r12 = rr2.E(r1, "track");     // Catch: Throwable -> L30
        int r13 = rr2.E(r1, "year");     // Catch: Throwable -> L30
        int r14 = rr2.E(r1, "genre");     // Catch: Throwable -> L30
        int r15 = rr2.E(r1, "cover_art_id");     // Catch: Throwable -> L30
        int r63 = rr2.E(r1, "size");     // Catch: Throwable -> L30
        int r65 = rr2.E(r1, "content_type");     // Catch: Throwable -> L30
        int r16 = rr2.E(r1, "suffix");     // Catch: Throwable -> L30
        int r17 = rr2.E(r1, "transcoding_content_type");     // Catch: Throwable -> L30
        int r18 = rr2.E(r1, "transcoded_suffix");     // Catch: Throwable -> L30
        int r19 = rr2.E(r1, "duration");     // Catch: Throwable -> L30
        int r20 = rr2.E(r1, "bitrate");     // Catch: Throwable -> L30
        int r21 = rr2.E(r1, "sampling_rate");     // Catch: Throwable -> L30
        int r22 = rr2.E(r1, "bit_depth");     // Catch: Throwable -> L30
        int r23 = rr2.E(r1, "path");     // Catch: Throwable -> L30
        int r24 = rr2.E(r1, "is_video");     // Catch: Throwable -> L30
        int r25 = rr2.E(r1, "user_rating");     // Catch: Throwable -> L30
        int r26 = rr2.E(r1, "average_rating");     // Catch: Throwable -> L30
        int r27 = rr2.E(r1, "play_count");     // Catch: Throwable -> L30
        int r28 = rr2.E(r1, "disc_number");     // Catch: Throwable -> L30
        int r29 = rr2.E(r1, "created");     // Catch: Throwable -> L30
        int r30 = rr2.E(r1, "starred");     // Catch: Throwable -> L30
        int r31 = rr2.E(r1, "album_id");     // Catch: Throwable -> L30
        int r32 = rr2.E(r1, "artist_id");     // Catch: Throwable -> L30
        int r33 = rr2.E(r1, "type");     // Catch: Throwable -> L30
        int r34 = rr2.E(r1, "bookmark_position");     // Catch: Throwable -> L30
        int r35 = rr2.E(r1, "original_width");     // Catch: Throwable -> L30
        int r36 = rr2.E(r1, "original_height");     // Catch: Throwable -> L30
        int r37 = rr2.E(r1, "album_artist");     // Catch: Throwable -> L30
        int r110 = rr2.E(r1, "rg_track_gain");     // Catch: Throwable -> L30
        int r38 = r15;
        int r111 = rr2.E(r1, "rg_album_gain");     // Catch: Throwable -> L30
        int r39 = r14;
        int r112 = rr2.E(r1, "rg_track_peak");     // Catch: Throwable -> L30
        int r40 = r13;
        int r113 = rr2.E(r1, "rg_album_peak");     // Catch: Throwable -> L30
        int r41 = r12;
        int r114 = rr2.E(r1, "rg_base_gain");     // Catch: Throwable -> L30
        int r42 = r11;
        int r115 = rr2.E(r1, "rg_fallback_gain");     // Catch: Throwable -> L30
        int r43 = r10;
        ArrayList r44 = new ArrayList();     // Catch: Throwable -> L30
    L6:
        if (r1.O() == false) goto L192;
        String r45 = null;
        if (r1.isNull(r2) == false) goto L11;
        String r47 = null;
    L12:
        int r46 = (int) r1.getLong(r3);     // Catch: Throwable -> L30
        long r49 = r1.getLong(r4);     // Catch: Throwable -> L30
        long r51 = r1.getLong(r5);     // Catch: Throwable -> L30
        if (r1.isNull(r6) == false) goto L15;
        String r53 = null;
    L17:
        if (r1.isNull(r110) == false) goto L33;
        if (r1.isNull(r111) == false) goto L33;
        if (r1.isNull(r112) == false) goto L33;
        if (r1.isNull(r113) == false) goto L33;
        if (r1.isNull(r114) == false) goto L33;
        if (r1.isNull(r115) == false) goto L33;
        r3 = r3;
        r4 = r4;
        ReplayGainInfo r48 = null;
    L57:
        Queue r410 = new Queue(r47, r46, r49, r51, r53);     // Catch: Throwable -> L30
        if (r1.isNull(r7) == false) goto L60;
        String r50 = null;
    L61:
        r410.setParentId(r50);     // Catch: Throwable -> L30
        int r52 = r5;
        int r411 = r6;
        if (((int) r1.getLong(r8)) == 0) goto L64;
        boolean r54 = true;
    L65:
        r410.setDir(r54);     // Catch: Throwable -> L30
        int r55 = r9;
        if (r1.isNull(r55) == false) goto L68;
        String r56 = null;
    L69:
        r410.setTitle(r56);     // Catch: Throwable -> L30
        int r57 = r43;
        if (r1.isNull(r57) == false) goto L72;
        String r58 = null;
    L73:
        r410.setAlbum(r58);     // Catch: Throwable -> L30
        int r59 = r42;
        if (r1.isNull(r59) == false) goto L76;
        String r60 = null;
    L77:
        r410.setArtist(r60);     // Catch: Throwable -> L30
        int r61 = r41;
        if (r1.isNull(r61) == false) goto L80;
        Integer r62 = null;
    L81:
        r410.setTrack(r62);     // Catch: Throwable -> L30
        int r66 = r40;
        if (r1.isNull(r66) == false) goto L84;
        Integer r67 = null;
    L85:
        r410.setYear(r67);     // Catch: Throwable -> L30
        int r68 = r39;
        if (r1.isNull(r68) == false) goto L88;
        String r69 = null;
    L89:
        r410.setGenre(r69);     // Catch: Throwable -> L30
        int r70 = r38;
        if (r1.isNull(r70) == false) goto L92;
        String r71 = null;
    L93:
        r410.setCoverArtId(r71);     // Catch: Throwable -> L30
        r63 = r63;
        if (r1.isNull(r63) == false) goto L96;
        Long r72 = null;
    L97:
        r410.setSize(r72);     // Catch: Throwable -> L30
        r65 = r65;
        if (r1.isNull(r65) == false) goto L100;
        String r73 = null;
    L101:
        r410.setContentType(r73);     // Catch: Throwable -> L30
        int r74 = r16;
        if (r1.isNull(r74) == false) goto L104;
        String r75 = null;
    L105:
        r410.setSuffix(r75);     // Catch: Throwable -> L30
        r17 = r17;
        if (r1.isNull(r17) == false) goto L108;
        String r76 = null;
    L109:
        r410.setTranscodedContentType(r76);     // Catch: Throwable -> L30
        r18 = r18;
        if (r1.isNull(r18) == false) goto L112;
        String r77 = null;
    L113:
        r410.setTranscodedSuffix(r77);     // Catch: Throwable -> L30
        int r78 = r19;
        if (r1.isNull(r78) == false) goto L116;
        Integer r79 = null;
    L117:
        r410.setDuration(r79);     // Catch: Throwable -> L30
        int r80 = r20;
        if (r1.isNull(r80) == false) goto L120;
        Integer r81 = null;
    L121:
        r410.setBitrate(r81);     // Catch: Throwable -> L30
        int r82 = r21;
        if (r1.isNull(r82) == false) goto L124;
        Integer r83 = null;
    L125:
        r410.setSamplingRate(r83);     // Catch: Throwable -> L30
        int r84 = r22;
        if (r1.isNull(r84) == false) goto L128;
        Integer r85 = null;
    L129:
        r410.setBitDepth(r85);     // Catch: Throwable -> L30
        int r86 = r23;
        if (r1.isNull(r86) == false) goto L132;
        String r87 = null;
    L133:
        r410.setPath(r87);     // Catch: Throwable -> L30
        int r88 = r24;
        if (((int) r1.getLong(r88)) == 0) goto L136;
        boolean r89 = true;
    L137:
        r410.setVideo(r89);     // Catch: Throwable -> L30
        int r90 = r25;
        if (r1.isNull(r90) == false) goto L140;
        Integer r91 = null;
    L141:
        r410.setUserRating(r91);     // Catch: Throwable -> L30
        r26 = r26;
        if (r1.isNull(r26) == false) goto L144;
        Double r92 = null;
    L145:
        r410.setAverageRating(r92);     // Catch: Throwable -> L30
        int r93 = r27;
        if (r1.isNull(r93) == false) goto L148;
        Long r94 = null;
    L149:
        r410.setPlayCount(r94);     // Catch: Throwable -> L30
        int r95 = r28;
        if (r1.isNull(r95) == false) goto L152;
        Integer r96 = null;
    L153:
        r410.setDiscNumber(r96);     // Catch: Throwable -> L30
        r29 = r29;
        if (r1.isNull(r29) == false) goto L156;
        Long r97 = null;
    L157:
        r410.setCreated(i80.B(r97));     // Catch: Throwable -> L30
        int r98 = r30;
        if (r1.isNull(r98) == false) goto L161;
        Long r210 = null;
    L162:
        r410.setStarred(i80.B(r210));     // Catch: Throwable -> L30
        r31 = r31;
        if (r1.isNull(r31) == false) goto L165;
        String r99 = null;
    L166:
        r410.setAlbumId(r99);     // Catch: Throwable -> L30
        r32 = r32;
        if (r1.isNull(r32) == false) goto L169;
        String r100 = null;
    L170:
        r410.setArtistId(r100);     // Catch: Throwable -> L30
        r33 = r33;
        if (r1.isNull(r33) == false) goto L173;
        String r101 = null;
    L174:
        r410.setType(r101);     // Catch: Throwable -> L30
        r34 = r34;
        if (r1.isNull(r34) == false) goto L177;
        Long r102 = null;
    L178:
        r410.setBookmarkPosition(r102);     // Catch: Throwable -> L30
        int r103 = r35;
        if (r1.isNull(r103) == false) goto L181;
        Integer r104 = null;
    L182:
        r410.setOriginalWidth(r104);     // Catch: Throwable -> L30
        int r105 = r36;
        if (r1.isNull(r105) == false) goto L185;
        Integer r106 = null;
    L186:
        r410.setOriginalHeight(r106);     // Catch: Throwable -> L30
        int r107 = r37;
        if (r1.isNull(r107) == true) goto L190;
        r45 = r1.D(r107);     // Catch: Throwable -> L30
    L190:
        r410.setAlbumArtist(r45);     // Catch: Throwable -> L30
        r410.setReplayGain(r48);     // Catch: Throwable -> L30
        ArrayList r108 = r44;
        r108.add(r410);     // Catch: Throwable -> L30
        int r109 = r3;
        r44 = r108;
        r3 = r109;
        r23 = r86;
        r8 = r8;
        r21 = r82;
        r22 = r84;
        r43 = r57;
        r42 = r59;
        r37 = r107;
        r7 = r7;
        r6 = r411;
        r4 = r4;
        r40 = r66;
        r16 = r74;
        r38 = r70;
        r20 = r80;
        r24 = r88;
        r25 = r90;
        r36 = r105;
        r5 = r52;
        r9 = r55;
        r41 = r61;
        r39 = r68;
        r19 = r78;
        r27 = r93;
        r28 = r95;
        r30 = r98;
        r35 = r103;
        r2 = r2;
        goto L6
    L185:
        r106 = Integer.valueOf((int) r1.getLong(r105));     // Catch: Throwable -> L30
        goto L186
    L181:
        r104 = Integer.valueOf((int) r1.getLong(r103));     // Catch: Throwable -> L30
        goto L182
    L177:
        r102 = Long.valueOf(r1.getLong(r34));     // Catch: Throwable -> L30
        goto L178
    L173:
        r101 = r1.D(r33);     // Catch: Throwable -> L30
        goto L174
    L169:
        r100 = r1.D(r32);     // Catch: Throwable -> L30
        goto L170
    L165:
        r99 = r1.D(r31);     // Catch: Throwable -> L30
        goto L166
    L161:
        r210 = Long.valueOf(r1.getLong(r98));     // Catch: Throwable -> L30
        goto L162
    L156:
        r97 = Long.valueOf(r1.getLong(r29));     // Catch: Throwable -> L30
        goto L157
    L152:
        r96 = Integer.valueOf((int) r1.getLong(r95));     // Catch: Throwable -> L30
        goto L153
    L148:
        r94 = Long.valueOf(r1.getLong(r93));     // Catch: Throwable -> L30
        goto L149
    L144:
        r92 = Double.valueOf(r1.getDouble(r26));     // Catch: Throwable -> L30
        goto L145
    L140:
        r91 = Integer.valueOf((int) r1.getLong(r90));     // Catch: Throwable -> L30
        goto L141
    L136:
        r89 = false;
        goto L137
    L132:
        r87 = r1.D(r86);     // Catch: Throwable -> L30
        goto L133
    L128:
        r85 = Integer.valueOf((int) r1.getLong(r84));     // Catch: Throwable -> L30
        goto L129
    L124:
        r83 = Integer.valueOf((int) r1.getLong(r82));     // Catch: Throwable -> L30
        goto L125
    L120:
        r81 = Integer.valueOf((int) r1.getLong(r80));     // Catch: Throwable -> L30
        goto L121
    L116:
        r79 = Integer.valueOf((int) r1.getLong(r78));     // Catch: Throwable -> L30
        goto L117
    L112:
        r77 = r1.D(r18);     // Catch: Throwable -> L30
        goto L113
    L108:
        r76 = r1.D(r17);     // Catch: Throwable -> L30
        goto L109
    L104:
        r75 = r1.D(r74);     // Catch: Throwable -> L30
        goto L105
    L100:
        r73 = r1.D(r65);     // Catch: Throwable -> L30
        goto L101
    L96:
        r72 = Long.valueOf(r1.getLong(r63));     // Catch: Throwable -> L30
        goto L97
    L92:
        r71 = r1.D(r70);     // Catch: Throwable -> L30
        goto L93
    L88:
        r69 = r1.D(r68);     // Catch: Throwable -> L30
        goto L89
    L84:
        r67 = Integer.valueOf((int) r1.getLong(r66));     // Catch: Throwable -> L30
        goto L85
    L80:
        r62 = Integer.valueOf((int) r1.getLong(r61));     // Catch: Throwable -> L30
        goto L81
    L76:
        r60 = r1.D(r59);     // Catch: Throwable -> L30
        goto L77
    L72:
        r58 = r1.D(r57);     // Catch: Throwable -> L30
        goto L73
    L68:
        r56 = r1.D(r55);     // Catch: Throwable -> L30
        goto L69
    L64:
        r54 = false;
        goto L65
    L60:
        r50 = r1.D(r7);     // Catch: Throwable -> L30
    L33:
        if (r1.isNull(r110) == false) goto L35;
        Float r510 = null;
    L37:
        if (r1.isNull(r111) == false) goto L39;
        Float r511 = null;
    L41:
        if (r1.isNull(r112) == false) goto L43;
        Float r512 = null;
    L45:
        if (r1.isNull(r113) == false) goto L47;
        Float r610 = null;
    L49:
        if (r1.isNull(r114) == false) goto L51;
        Float r611 = null;
    L53:
        if (r1.isNull(r115) == false) goto L55;
        Float r612 = null;
    L56:
        r48 = new ReplayGainInfo(r510, r511, r512, r610, r611, r612);     // Catch: Throwable -> L30
        goto L57
    L55:
        r612 = Float.valueOf((float) r1.getDouble(r115));     // Catch: Throwable -> L30
        goto L56
    L51:
        r611 = Float.valueOf((float) r1.getDouble(r114));     // Catch: Throwable -> L30
        goto L53
    L47:
        r610 = Float.valueOf((float) r1.getDouble(r113));     // Catch: Throwable -> L30
        goto L49
    L43:
        r512 = Float.valueOf((float) r1.getDouble(r112));     // Catch: Throwable -> L30
        goto L45
    L39:
        r511 = Float.valueOf((float) r1.getDouble(r111));     // Catch: Throwable -> L30
        goto L41
    L35:
        r510 = Float.valueOf((float) r1.getDouble(r110));     // Catch: Throwable -> L30
        goto L37
    L15:
        r53 = r1.D(r6);     // Catch: Throwable -> L30
        goto L17
    L11:
        r47 = r1.D(r2);     // Catch: Throwable -> L30
        goto L12
    L192:
        ArrayList r116 = r44;
        r1.close();
        return r116;
    L30:
        th = move-exception;
        r1.close();
        throw th;
    L197:
        return b(r64);
    }
}
