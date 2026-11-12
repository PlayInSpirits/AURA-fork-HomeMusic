package defpackage;

import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ rs0(ss0 r1, String r2) {
        this.n = 0;
        this.o = r2;
    }

    private final Object b(Object r2) {
        z34 r3 = ((x34) r2).U("DELETE FROM playlist WHERE id = ?");
        String r1 = this.o;
        if (r1 != null) goto L7;
        r3.e(1);     // Catch: Throwable -> L5
    L8:
        r3.O();     // Catch: Throwable -> L5
        r3.close();
        return null;
    L7:
        r3.r(1, r1);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r3.close();
        throw th;
    }

    private final Object c(Object r3) {
        z34 r4 = ((x34) r3).U("SELECT coverArt FROM playlist WHERE id = ?");
        String r2 = this.o;
        if (r2 != null) goto L7;
        r4.e(1);     // Catch: Throwable -> L5
    L8:
        String r0 = null;
        if (r4.O() == true) goto L11;
    L14:
        r4.close();
        return r0;
    L11:
        if (r4.isNull(0) == true) goto L14;
        r0 = r4.D(0);     // Catch: Throwable -> L5
        goto L14
    L7:
        r4.r(1, r2);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r4.close();
        throw th;
    }

    private final Object e(Object r5) {
        z34 r6 = ((x34) r5).U("SELECT isUniversal FROM playlist WHERE id = ?");
        String r4 = this.o;
        boolean r0 = true;
        if (r4 != null) goto L7;
        r6.e(1);     // Catch: Throwable -> L5
    L8:
        Boolean r1 = null;
        if (r6.O() == true) goto L11;
    L21:
        r6.close();
        return r1;
    L11:
        if (r6.isNull(0) == false) goto L13;
        Integer r2 = null;
    L14:
        if (r2 == null) goto L21;
        if (r2.intValue() != 0) goto L20;
        r0 = false;
    L20:
        r1 = Boolean.valueOf(r0);     // Catch: Throwable -> L5
        goto L21
    L13:
        r2 = Integer.valueOf((int) r6.getLong(0));     // Catch: Throwable -> L5
        goto L14
    L7:
        r6.r(1, r4);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r6.close();
        throw th;
    }

    private final Object f(Object r2) {
        z34 r3 = ((x34) r2).U("DELETE FROM playlist_song WHERE playlist_id = ?");
        String r1 = this.o;
        if (r1 != null) goto L7;
        r3.e(1);     // Catch: Throwable -> L5
    L8:
        r3.O();     // Catch: Throwable -> L5
        r3.close();
        return null;
    L7:
        r3.r(1, r1);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r3.close();
        throw th;
    }

    private final Object g(Object r26) {
        z34 r1 = ((x34) r26).U("SELECT * FROM playlist_song WHERE playlist_id = ?");
        String r0 = this.o;
        if (r0 != null) goto L7;
        r1.e(1);     // Catch: Throwable -> L5
    L8:
        int r2 = rr2.E(r1, "playlist_id");     // Catch: Throwable -> L5
        int r3 = rr2.E(r1, "id");     // Catch: Throwable -> L5
        int r4 = rr2.E(r1, "title");     // Catch: Throwable -> L5
        int r5 = rr2.E(r1, "artist");     // Catch: Throwable -> L5
        int r6 = rr2.E(r1, "album");     // Catch: Throwable -> L5
        int r7 = rr2.E(r1, "track");     // Catch: Throwable -> L5
        int r8 = rr2.E(r1, "cover_art_id");     // Catch: Throwable -> L5
        int r9 = rr2.E(r1, "duration");     // Catch: Throwable -> L5
        int r10 = rr2.E(r1, "album_id");     // Catch: Throwable -> L5
        int r11 = rr2.E(r1, "artist_id");     // Catch: Throwable -> L5
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L5
    L9:
        if (r1.O() == false) goto L53;
        if (r1.isNull(r2) == false) goto L14;
        String r15 = null;
    L16:
        if (r1.isNull(r3) == false) goto L18;
        String r16 = null;
    L20:
        if (r1.isNull(r4) == false) goto L22;
        String r17 = null;
    L24:
        if (r1.isNull(r5) == false) goto L26;
        String r18 = null;
    L28:
        if (r1.isNull(r6) == false) goto L30;
        String r19 = null;
    L32:
        if (r1.isNull(r7) == false) goto L34;
        Integer r20 = null;
    L36:
        if (r1.isNull(r8) == false) goto L38;
        String r21 = null;
    L40:
        if (r1.isNull(r9) == false) goto L42;
        Integer r22 = null;
    L44:
        if (r1.isNull(r10) == false) goto L46;
        String r23 = null;
    L48:
        if (r1.isNull(r11) == false) goto L50;
        String r24 = null;
    L51:
        r12.add(new PlaylistSong(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24));     // Catch: Throwable -> L5
        goto L9
    L50:
        r24 = r1.D(r11);     // Catch: Throwable -> L5
        goto L51
    L46:
        r23 = r1.D(r10);     // Catch: Throwable -> L5
        goto L48
    L42:
        r22 = Integer.valueOf((int) r1.getLong(r9));     // Catch: Throwable -> L5
        goto L44
    L38:
        r21 = r1.D(r8);     // Catch: Throwable -> L5
        goto L40
    L34:
        r20 = Integer.valueOf((int) r1.getLong(r7));     // Catch: Throwable -> L5
        goto L36
    L30:
        r19 = r1.D(r6);     // Catch: Throwable -> L5
        goto L32
    L26:
        r18 = r1.D(r5);     // Catch: Throwable -> L5
        goto L28
    L22:
        r17 = r1.D(r4);     // Catch: Throwable -> L5
        goto L24
    L18:
        r16 = r1.D(r3);     // Catch: Throwable -> L5
        goto L20
    L14:
        r15 = r1.D(r2);     // Catch: Throwable -> L5
        goto L16
    L53:
        r1.close();
        return r12;
    L7:
        r1.r(1, r0);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r1.close();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.if1
    public final Object invoke(Object r59) {
        int r1 = this.n;
        j15 r8 = j15.a;
        Object r12 = null;
        String r13 = this.o;
        switch(r1) {
            case 0: goto L205;
            case 1: goto L194;
            case 2: goto L183;
            case 3: goto L181;
            case 4: goto L179;
            case 5: goto L165;
            case 6: goto L163;
            case 7: goto L125;
            case 8: goto L114;
            case 9: goto L80;
            case 10: goto L46;
            case 11: goto L35;
            case 12: goto L24;
            case 13: goto L23;
            case 14: goto L21;
            case 15: goto L19;
            case 16: goto L17;
            case 17: goto L15;
            case 18: goto L12;
            default: goto L4;
        };
    L4:
        String r0 = (String) r59;
        r0.getClass();
        if (qm4.u0(r0) == false) goto L11;
        if (r0.length() >= r13.length()) goto L428;
        return r13;
    L428:
        return r0;
    L11:
        return r13.concat(r0);
    L12:
        c42[] r2 = o94.a;
        ((q94) r59).a(n94.a, gb.O(r13));
        return r8;
    L24:
        z34 r3 = ((x34) r59).U("INSERT OR IGNORE INTO pinned_playlist (playlistId) VALUES (?)");
        if (r13 != null) goto L29;
        r3.e(1);     // Catch: Throwable -> L27
    L30:
        r3.O();     // Catch: Throwable -> L27
        r3.close();
        return null;
    L29:
        r3.r(1, r13);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r3.close();
        throw th;
    L35:
        z34 r4 = ((x34) r59).U("DELETE FROM pinned_playlist WHERE playlistId = ?");
        if (r13 != null) goto L40;
        r4.e(1);     // Catch: Throwable -> L38
    L41:
        r4.O();     // Catch: Throwable -> L38
        r4.close();
        return null;
    L40:
        r4.r(1, r13);     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        r4.close();
        throw th;
    L46:
        z34 r5 = ((x34) r59).U("SELECT * FROM lyrics_cache WHERE song_id = ?");
        if (r13 != null) goto L51;
        r5.e(1);     // Catch: Throwable -> L49
    L52:
        int r6 = rr2.E(r5, "song_id");     // Catch: Throwable -> L49
        int r7 = rr2.E(r5, "artist");     // Catch: Throwable -> L49
        int r9 = rr2.E(r5, "title");     // Catch: Throwable -> L49
        int r10 = rr2.E(r5, "lyrics");     // Catch: Throwable -> L49
        int r11 = rr2.E(r5, "structured_lyrics");     // Catch: Throwable -> L49
        int r14 = rr2.E(r5, "updated_at");     // Catch: Throwable -> L49
        if (r5.O() == true) goto L55;
    L76:
        r5.close();
        return r12;
    L55:
        if (r5.isNull(r6) == false) goto L57;
        String r15 = null;
    L59:
        if (r5.isNull(r7) == false) goto L61;
        String r16 = null;
    L63:
        if (r5.isNull(r9) == false) goto L65;
        String r17 = null;
    L67:
        if (r5.isNull(r10) == false) goto L69;
        String r18 = null;
    L71:
        if (r5.isNull(r11) == true) goto L74;
        r12 = r5.D(r11);     // Catch: Throwable -> L49
    L74:
        r12 = new LyricsCache(r15, r16, r17, r18, r12, r5.getLong(r14));     // Catch: Throwable -> L49
        goto L76
    L69:
        r18 = r5.D(r10);     // Catch: Throwable -> L49
        goto L71
    L65:
        r17 = r5.D(r9);     // Catch: Throwable -> L49
        goto L67
    L61:
        r16 = r5.D(r7);     // Catch: Throwable -> L49
        goto L63
    L57:
        r15 = r5.D(r6);     // Catch: Throwable -> L49
        goto L59
    L51:
        r5.r(1, r13);     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        r5.close();
        throw th;
    L80:
        z34 r19 = ((x34) r59).U("SELECT * FROM lyrics_cache WHERE song_id = ?");
        if (r13 != null) goto L85;
        r19.e(1);     // Catch: Throwable -> L83
    L86:
        int r20 = rr2.E(r19, "song_id");     // Catch: Throwable -> L83
        int r21 = rr2.E(r19, "artist");     // Catch: Throwable -> L83
        int r22 = rr2.E(r19, "title");     // Catch: Throwable -> L83
        int r23 = rr2.E(r19, "lyrics");     // Catch: Throwable -> L83
        int r24 = rr2.E(r19, "structured_lyrics");     // Catch: Throwable -> L83
        int r25 = rr2.E(r19, "updated_at");     // Catch: Throwable -> L83
        if (r19.O() == true) goto L89;
    L110:
        r19.close();
        return r12;
    L89:
        if (r19.isNull(r20) == false) goto L91;
        String r110 = null;
    L93:
        if (r19.isNull(r21) == false) goto L95;
        String r111 = null;
    L97:
        if (r19.isNull(r22) == false) goto L99;
        String r112 = null;
    L101:
        if (r19.isNull(r23) == false) goto L103;
        String r113 = null;
    L105:
        if (r19.isNull(r24) == true) goto L108;
        r12 = r19.D(r24);     // Catch: Throwable -> L83
    L108:
        r12 = new LyricsCache(r110, r111, r112, r113, r12, r19.getLong(r25));     // Catch: Throwable -> L83
        goto L110
    L103:
        r113 = r19.D(r23);     // Catch: Throwable -> L83
        goto L105
    L99:
        r112 = r19.D(r22);     // Catch: Throwable -> L83
        goto L101
    L95:
        r111 = r19.D(r21);     // Catch: Throwable -> L83
        goto L97
    L91:
        r110 = r19.D(r20);     // Catch: Throwable -> L83
        goto L93
    L85:
        r19.r(1, r13);     // Catch: Throwable -> L83
    L83:
        th = move-exception;
        r19.close();
        throw th;
    L114:
        z34 r26 = ((x34) r59).U("DELETE FROM internet_radio_station_cache WHERE id = ?");
        if (r13 != null) goto L119;
        r26.e(1);     // Catch: Throwable -> L117
    L120:
        r26.O();     // Catch: Throwable -> L117
        r26.close();
        return null;
    L119:
        r26.r(1, r13);     // Catch: Throwable -> L117
    L117:
        th = move-exception;
        r26.close();
        throw th;
    L125:
        z34 r27 = ((x34) r59).U("SELECT * FROM internet_radio_station_cache WHERE id = ? LIMIT 1");
        if (r13 != null) goto L130;
        r27.e(1);     // Catch: Throwable -> L128
    L131:
        int r28 = rr2.E(r27, "id");     // Catch: Throwable -> L128
        int r29 = rr2.E(r27, "name");     // Catch: Throwable -> L128
        int r30 = rr2.E(r27, "stream_url");     // Catch: Throwable -> L128
        int r31 = rr2.E(r27, "home_page_url");     // Catch: Throwable -> L128
        int r32 = rr2.E(r27, "source");     // Catch: Throwable -> L128
        int r33 = rr2.E(r27, "cover_art_url");     // Catch: Throwable -> L128
        if (r27.O() == true) goto L134;
    L159:
        r27.close();
        return r12;
    L134:
        if (r27.isNull(r28) == false) goto L136;
        String r114 = null;
    L138:
        if (r27.isNull(r29) == false) goto L140;
        String r115 = null;
    L142:
        if (r27.isNull(r30) == false) goto L144;
        String r116 = null;
    L146:
        if (r27.isNull(r31) == false) goto L148;
        String r117 = null;
    L150:
        if (r27.isNull(r32) == false) goto L152;
        String r118 = null;
    L154:
        if (r27.isNull(r33) == true) goto L157;
        r12 = r27.D(r33);     // Catch: Throwable -> L128
    L157:
        r12 = new InternetRadioStationCache(r114, r115, r116, r117, r118, r12);     // Catch: Throwable -> L128
        goto L159
    L152:
        r118 = r27.D(r32);     // Catch: Throwable -> L128
        goto L154
    L148:
        r117 = r27.D(r31);     // Catch: Throwable -> L128
        goto L150
    L144:
        r116 = r27.D(r30);     // Catch: Throwable -> L128
        goto L146
    L140:
        r115 = r27.D(r29);     // Catch: Throwable -> L128
        goto L142
    L136:
        r114 = r27.D(r28);     // Catch: Throwable -> L128
        goto L138
    L130:
        r27.r(1, r13);     // Catch: Throwable -> L128
    L128:
        th = move-exception;
        r27.close();
        throw th;
    L163:
        q94 r34 = (q94) r59;
        c42[] r35 = o94.a;
        r34.a(n94.a, gb.O(r13));
        o94.a(r34);
        return r8;
    L165:
        qr1 r36 = (qr1) r59;
        r36.getClass();
        rr1 r37 = rr1.a;
        o83 r38 = (o83) rr1.f.getValue();
        nz3 r39 = new nz3();
        r39.d(r36.a.concat("/api/auth/me"));
        r39.a("Cookie", r36.b);
        oz3 r40 = new oz3(r39);
        r38.getClass();
        k14 r41 = new bv3(r38, r40).c();
    L171:
        th = move-exception;
        throw th;     // Catch: Throwable -> L176
    L176:
        th = move-exception;
        q05.h(r41, th);
        throw th;
    L167:
        if (r41.C == false) goto L174;
        HubMe r42 = (HubMe) rr1.p(r41, HubMe.class);     // Catch: Throwable -> L171
        r41.close();
        return Boolean.valueOf(h12.c(r42.getUsername(), qm4.G0(r13, '\n', r13)));
    L174:
        throw rr1.i(r41);     // Catch: Throwable -> L171
    L179:
        String r43 = (String) r59;
        r43.getClass();
        String r44 = r43.concat("/api/listen");
        fr1 r45 = new fr1();
        r45.e(null, r44);
        fr1 r46 = r45.b().g();
        r46.a("ref", r13);
        gr1 r47 = r46.b();
        nz3 r48 = new nz3();
        r48.a = r47;
        return new oz3(r48);
    L181:
        String r49 = (String) r59;
        r49.getClass();
        String r50 = r49.concat("/api/library/track-source");
        fr1 r51 = new fr1();
        r51.e(null, r50);
        fr1 r52 = r51.b().g();
        r52.a("nd_song_id", r13);
        gr1 r53 = r52.b();
        nz3 r54 = new nz3();
        r54.a = r53;
        return new oz3(r54);
    L183:
        z34 r55 = ((x34) r59).U("UPDATE download SET download_state = 1 WHERE id = ?");
        if (r13 != null) goto L188;
        r55.e(1);     // Catch: Throwable -> L186
    L189:
        r55.O();     // Catch: Throwable -> L186
        r55.close();
        return null;
    L188:
        r55.r(1, r13);     // Catch: Throwable -> L186
    L186:
        th = move-exception;
        r55.close();
        throw th;
    L194:
        z34 r56 = ((x34) r59).U("DELETE FROM download WHERE id = ?");
        if (r13 != null) goto L199;
        r56.e(1);     // Catch: Throwable -> L197
    L200:
        r56.O();     // Catch: Throwable -> L197
        r56.close();
        return null;
    L199:
        r56.r(1, r13);     // Catch: Throwable -> L197
    L197:
        th = move-exception;
        r56.close();
        throw th;
    L205:
        z34 r57 = ((x34) r59).U("SELECT * FROM download WHERE id = ?");
        if (r13 != null) goto L210;
        r57.e(1);     // Catch: Throwable -> L208
    L211:
        int r58 = rr2.E(r57, "id");     // Catch: Throwable -> L208
        int r60 = rr2.E(r57, "playlist_id");     // Catch: Throwable -> L208
        int r61 = rr2.E(r57, "playlist_name");     // Catch: Throwable -> L208
        int r62 = rr2.E(r57, "download_state");     // Catch: Throwable -> L208
        int r63 = rr2.E(r57, "download_uri");     // Catch: Throwable -> L208
        int r64 = rr2.E(r57, "parent_id");     // Catch: Throwable -> L208
        int r65 = rr2.E(r57, "is_dir");     // Catch: Throwable -> L208
        int r66 = rr2.E(r57, "title");     // Catch: Throwable -> L208
        int r67 = rr2.E(r57, "album");     // Catch: Throwable -> L208
        int r119 = rr2.E(r57, "artist");     // Catch: Throwable -> L208
        int r120 = rr2.E(r57, "track");     // Catch: Throwable -> L208
        int r121 = rr2.E(r57, "year");     // Catch: Throwable -> L208
        int r122 = rr2.E(r57, "genre");     // Catch: Throwable -> L208
        int r123 = rr2.E(r57, "cover_art_id");     // Catch: Throwable -> L208
        int r124 = rr2.E(r57, "size");     // Catch: Throwable -> L208
        int r125 = rr2.E(r57, "content_type");     // Catch: Throwable -> L208
        int r126 = rr2.E(r57, "suffix");     // Catch: Throwable -> L208
        int r127 = rr2.E(r57, "transcoding_content_type");     // Catch: Throwable -> L208
        int r128 = rr2.E(r57, "transcoded_suffix");     // Catch: Throwable -> L208
        int r129 = rr2.E(r57, "duration");     // Catch: Throwable -> L208
        int r130 = rr2.E(r57, "bitrate");     // Catch: Throwable -> L208
        int r131 = rr2.E(r57, "sampling_rate");     // Catch: Throwable -> L208
        int r132 = rr2.E(r57, "bit_depth");     // Catch: Throwable -> L208
        int r133 = rr2.E(r57, "path");     // Catch: Throwable -> L208
        int r134 = rr2.E(r57, "is_video");     // Catch: Throwable -> L208
        int r135 = rr2.E(r57, "user_rating");     // Catch: Throwable -> L208
        int r136 = rr2.E(r57, "average_rating");     // Catch: Throwable -> L208
        int r137 = rr2.E(r57, "play_count");     // Catch: Throwable -> L208
        int r138 = rr2.E(r57, "disc_number");     // Catch: Throwable -> L208
        int r139 = rr2.E(r57, "created");     // Catch: Throwable -> L208
        int r140 = rr2.E(r57, "starred");     // Catch: Throwable -> L208
        int r141 = rr2.E(r57, "album_id");     // Catch: Throwable -> L208
        int r142 = rr2.E(r57, "artist_id");     // Catch: Throwable -> L208
        int r143 = rr2.E(r57, "type");     // Catch: Throwable -> L208
        int r144 = rr2.E(r57, "bookmark_position");     // Catch: Throwable -> L208
        int r145 = rr2.E(r57, "original_width");     // Catch: Throwable -> L208
        int r146 = rr2.E(r57, "original_height");     // Catch: Throwable -> L208
        int r147 = rr2.E(r57, "album_artist");     // Catch: Throwable -> L208
        int r148 = rr2.E(r57, "rg_track_gain");     // Catch: Throwable -> L208
        int r149 = rr2.E(r57, "rg_album_gain");     // Catch: Throwable -> L208
        int r150 = rr2.E(r57, "rg_track_peak");     // Catch: Throwable -> L208
        int r151 = rr2.E(r57, "rg_album_peak");     // Catch: Throwable -> L208
        int r152 = rr2.E(r57, "rg_base_gain");     // Catch: Throwable -> L208
        int r153 = rr2.E(r57, "rg_fallback_gain");     // Catch: Throwable -> L208
        if (r57.O() == true) goto L214;
        Download r154 = null;
    L403:
        r57.close();
        return r154;
    L214:
        if (r57.isNull(r58) == false) goto L216;
        String r410 = null;
    L218:
        if (r57.isNull(r60) == false) goto L220;
        String r411 = null;
    L222:
        if (r57.isNull(r61) == false) goto L224;
        String r412 = null;
    L225:
        int r68 = (int) r57.getLong(r62);     // Catch: Throwable -> L208
        if (r57.isNull(r63) == false) goto L228;
        String r510 = null;
    L230:
        if (r57.isNull(r148) == false) goto L244;
        if (r57.isNull(r149) == false) goto L244;
        if (r57.isNull(r150) == false) goto L244;
        if (r57.isNull(r151) == false) goto L244;
        if (r57.isNull(r152) == false) goto L244;
        if (r57.isNull(r153) == false) goto L244;
        ReplayGainInfo r69 = null;
    L268:
        Download r413 = new Download(r410, r411, r412, r68, r510);     // Catch: Throwable -> L208
        if (r57.isNull(r64) == false) goto L271;
        String r70 = null;
    L272:
        r413.setParentId(r70);     // Catch: Throwable -> L208
        if (((int) r57.getLong(r65)) == 0) goto L275;
        boolean r71 = true;
    L276:
        r413.setDir(r71);     // Catch: Throwable -> L208
        if (r57.isNull(r66) == false) goto L279;
        String r72 = null;
    L280:
        r413.setTitle(r72);     // Catch: Throwable -> L208
        if (r57.isNull(r67) == false) goto L283;
        String r73 = null;
    L284:
        r413.setAlbum(r73);     // Catch: Throwable -> L208
        if (r57.isNull(r119) == false) goto L287;
        String r74 = null;
    L288:
        r413.setArtist(r74);     // Catch: Throwable -> L208
        if (r57.isNull(r120) == false) goto L291;
        Integer r75 = null;
    L292:
        r413.setTrack(r75);     // Catch: Throwable -> L208
        if (r57.isNull(r121) == false) goto L295;
        Integer r76 = null;
    L296:
        r413.setYear(r76);     // Catch: Throwable -> L208
        if (r57.isNull(r122) == false) goto L299;
        String r77 = null;
    L300:
        r413.setGenre(r77);     // Catch: Throwable -> L208
        if (r57.isNull(r123) == false) goto L303;
        String r78 = null;
    L304:
        r413.setCoverArtId(r78);     // Catch: Throwable -> L208
        if (r57.isNull(r124) == false) goto L307;
        Long r79 = null;
    L308:
        r413.setSize(r79);     // Catch: Throwable -> L208
        if (r57.isNull(r125) == false) goto L311;
        String r80 = null;
    L312:
        r413.setContentType(r80);     // Catch: Throwable -> L208
        if (r57.isNull(r126) == false) goto L315;
        String r81 = null;
    L316:
        r413.setSuffix(r81);     // Catch: Throwable -> L208
        if (r57.isNull(r127) == false) goto L319;
        String r82 = null;
    L320:
        r413.setTranscodedContentType(r82);     // Catch: Throwable -> L208
        if (r57.isNull(r128) == false) goto L323;
        String r83 = null;
    L324:
        r413.setTranscodedSuffix(r83);     // Catch: Throwable -> L208
        if (r57.isNull(r129) == false) goto L327;
        Integer r84 = null;
    L328:
        r413.setDuration(r84);     // Catch: Throwable -> L208
        if (r57.isNull(r130) == false) goto L331;
        Integer r85 = null;
    L332:
        r413.setBitrate(r85);     // Catch: Throwable -> L208
        if (r57.isNull(r131) == false) goto L335;
        Integer r86 = null;
    L336:
        r413.setSamplingRate(r86);     // Catch: Throwable -> L208
        if (r57.isNull(r132) == false) goto L339;
        Integer r87 = null;
    L340:
        r413.setBitDepth(r87);     // Catch: Throwable -> L208
        if (r57.isNull(r133) == false) goto L343;
        String r88 = null;
    L344:
        r413.setPath(r88);     // Catch: Throwable -> L208
        if (((int) r57.getLong(r134)) == 0) goto L347;
        boolean r155 = true;
    L348:
        r413.setVideo(r155);     // Catch: Throwable -> L208
        if (r57.isNull(r135) == false) goto L351;
        Integer r89 = null;
    L352:
        r413.setUserRating(r89);     // Catch: Throwable -> L208
        if (r57.isNull(r136) == false) goto L355;
        Double r90 = null;
    L356:
        r413.setAverageRating(r90);     // Catch: Throwable -> L208
        if (r57.isNull(r137) == false) goto L359;
        Long r91 = null;
    L360:
        r413.setPlayCount(r91);     // Catch: Throwable -> L208
        if (r57.isNull(r138) == false) goto L363;
        Integer r92 = null;
    L364:
        r413.setDiscNumber(r92);     // Catch: Throwable -> L208
        if (r57.isNull(r139) == false) goto L367;
        Long r93 = null;
    L368:
        r413.setCreated(i80.B(r93));     // Catch: Throwable -> L208
        if (r57.isNull(r140) == false) goto L371;
        Long r94 = null;
    L372:
        r413.setStarred(i80.B(r94));     // Catch: Throwable -> L208
        if (r57.isNull(r141) == false) goto L375;
        String r95 = null;
    L376:
        r413.setAlbumId(r95);     // Catch: Throwable -> L208
        if (r57.isNull(r142) == false) goto L379;
        String r96 = null;
    L380:
        r413.setArtistId(r96);     // Catch: Throwable -> L208
        if (r57.isNull(r143) == false) goto L383;
        String r97 = null;
    L384:
        r413.setType(r97);     // Catch: Throwable -> L208
        if (r57.isNull(r144) == false) goto L387;
        Long r98 = null;
    L388:
        r413.setBookmarkPosition(r98);     // Catch: Throwable -> L208
        if (r57.isNull(r145) == false) goto L391;
        Integer r99 = null;
    L392:
        r413.setOriginalWidth(r99);     // Catch: Throwable -> L208
        if (r57.isNull(r146) == false) goto L395;
        Integer r100 = null;
    L396:
        r413.setOriginalHeight(r100);     // Catch: Throwable -> L208
        if (r57.isNull(r147) == false) goto L399;
        String r156 = null;
    L400:
        r413.setAlbumArtist(r156);     // Catch: Throwable -> L208
        r413.setReplayGain(r69);     // Catch: Throwable -> L208
        r154 = r413;
        goto L403
    L399:
        r156 = r57.D(r147);     // Catch: Throwable -> L208
        goto L400
    L395:
        r100 = Integer.valueOf((int) r57.getLong(r146));     // Catch: Throwable -> L208
        goto L396
    L391:
        r99 = Integer.valueOf((int) r57.getLong(r145));     // Catch: Throwable -> L208
        goto L392
    L387:
        r98 = Long.valueOf(r57.getLong(r144));     // Catch: Throwable -> L208
        goto L388
    L383:
        r97 = r57.D(r143);     // Catch: Throwable -> L208
        goto L384
    L379:
        r96 = r57.D(r142);     // Catch: Throwable -> L208
        goto L380
    L375:
        r95 = r57.D(r141);     // Catch: Throwable -> L208
        goto L376
    L371:
        r94 = Long.valueOf(r57.getLong(r140));     // Catch: Throwable -> L208
        goto L372
    L367:
        r93 = Long.valueOf(r57.getLong(r139));     // Catch: Throwable -> L208
        goto L368
    L363:
        r92 = Integer.valueOf((int) r57.getLong(r138));     // Catch: Throwable -> L208
        goto L364
    L359:
        r91 = Long.valueOf(r57.getLong(r137));     // Catch: Throwable -> L208
        goto L360
    L355:
        r90 = Double.valueOf(r57.getDouble(r136));     // Catch: Throwable -> L208
        goto L356
    L351:
        r89 = Integer.valueOf((int) r57.getLong(r135));     // Catch: Throwable -> L208
        goto L352
    L347:
        r155 = false;
        goto L348
    L343:
        r88 = r57.D(r133);     // Catch: Throwable -> L208
        goto L344
    L339:
        r87 = Integer.valueOf((int) r57.getLong(r132));     // Catch: Throwable -> L208
        goto L340
    L335:
        r86 = Integer.valueOf((int) r57.getLong(r131));     // Catch: Throwable -> L208
        goto L336
    L331:
        r85 = Integer.valueOf((int) r57.getLong(r130));     // Catch: Throwable -> L208
        goto L332
    L327:
        r84 = Integer.valueOf((int) r57.getLong(r129));     // Catch: Throwable -> L208
        goto L328
    L323:
        r83 = r57.D(r128);     // Catch: Throwable -> L208
        goto L324
    L319:
        r82 = r57.D(r127);     // Catch: Throwable -> L208
        goto L320
    L315:
        r81 = r57.D(r126);     // Catch: Throwable -> L208
        goto L316
    L311:
        r80 = r57.D(r125);     // Catch: Throwable -> L208
        goto L312
    L307:
        r79 = Long.valueOf(r57.getLong(r124));     // Catch: Throwable -> L208
        goto L308
    L303:
        r78 = r57.D(r123);     // Catch: Throwable -> L208
        goto L304
    L299:
        r77 = r57.D(r122);     // Catch: Throwable -> L208
        goto L300
    L295:
        r76 = Integer.valueOf((int) r57.getLong(r121));     // Catch: Throwable -> L208
        goto L296
    L291:
        r75 = Integer.valueOf((int) r57.getLong(r120));     // Catch: Throwable -> L208
        goto L292
    L287:
        r74 = r57.D(r119);     // Catch: Throwable -> L208
        goto L288
    L283:
        r73 = r57.D(r67);     // Catch: Throwable -> L208
        goto L284
    L279:
        r72 = r57.D(r66);     // Catch: Throwable -> L208
        goto L280
    L275:
        r71 = false;
        goto L276
    L271:
        r70 = r57.D(r64);     // Catch: Throwable -> L208
    L244:
        if (r57.isNull(r148) == false) goto L246;
        Float r511 = null;
    L248:
        if (r57.isNull(r149) == false) goto L250;
        Float r512 = null;
    L252:
        if (r57.isNull(r150) == false) goto L254;
        Float r513 = null;
    L256:
        if (r57.isNull(r151) == false) goto L258;
        Float r514 = null;
    L260:
        if (r57.isNull(r152) == false) goto L262;
        Float r515 = null;
    L264:
        if (r57.isNull(r153) == false) goto L266;
        Float r516 = null;
    L267:
        r69 = new ReplayGainInfo(r511, r512, r513, r514, r515, r516);     // Catch: Throwable -> L208
        goto L268
    L266:
        r516 = Float.valueOf((float) r57.getDouble(r153));     // Catch: Throwable -> L208
        goto L267
    L262:
        r515 = Float.valueOf((float) r57.getDouble(r152));     // Catch: Throwable -> L208
        goto L264
    L258:
        r514 = Float.valueOf((float) r57.getDouble(r151));     // Catch: Throwable -> L208
        goto L260
    L254:
        r513 = Float.valueOf((float) r57.getDouble(r150));     // Catch: Throwable -> L208
        goto L256
    L250:
        r512 = Float.valueOf((float) r57.getDouble(r149));     // Catch: Throwable -> L208
        goto L252
    L246:
        r511 = Float.valueOf((float) r57.getDouble(r148));     // Catch: Throwable -> L208
        goto L248
    L228:
        r510 = r57.D(r63);     // Catch: Throwable -> L208
        goto L230
    L224:
        r412 = r57.D(r61);     // Catch: Throwable -> L208
        goto L225
    L220:
        r411 = r57.D(r60);     // Catch: Throwable -> L208
        goto L222
    L216:
        r410 = r57.D(r58);     // Catch: Throwable -> L208
        goto L218
    L210:
        r57.r(1, r13);     // Catch: Throwable -> L208
    L208:
        th = move-exception;
        r57.close();
        throw th;
    L15:
        return g(r59);
    L17:
        return f(r59);
    L19:
        return e(r59);
    L21:
        return b(r59);
    L23:
        return c(r59);
    }

    public /* synthetic */ rs0(int r1, String r2) {
        this.n = r1;
        this.o = r2;
    }
}
