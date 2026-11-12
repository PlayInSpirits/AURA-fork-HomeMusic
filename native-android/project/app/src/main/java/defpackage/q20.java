package defpackage;

import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 extends au0 {
    public final /* synthetic */ int G;

    public /* synthetic */ q20(int r1) {
        this.G = r1;
    }

    private final void W(z34 r8, Object r9) {
        Queue r10 = (Queue) r9;
        if (r10.getId() != null) goto L5;
        r8.e(1);
    L6:
        r8.c(2, r10.getTrackOrder());
        r8.c(3, r10.getLastPlay());
        r8.c(4, r10.getPlayingChanged());
        if (r10.getStreamId() != null) goto L9;
        r8.e(5);
    L11:
        if (r10.getParentId() != null) goto L13;
        r8.e(6);
    L14:
        r8.c(7, r10.isDir() ? 1 : 0);
        if (r10.getTitle() != null) goto L17;
        r8.e(8);
    L19:
        if (r10.getAlbum() != null) goto L21;
        r8.e(9);
    L23:
        if (r10.getArtist() != null) goto L25;
        r8.e(10);
    L27:
        if (r10.getTrack() != null) goto L29;
        r8.e(11);
    L31:
        if (r10.getYear() != null) goto L33;
        r8.e(12);
    L35:
        if (r10.getGenre() != null) goto L37;
        r8.e(13);
    L39:
        if (r10.getCoverArtId() != null) goto L41;
        r8.e(14);
    L43:
        if (r10.getSize() != null) goto L45;
        r8.e(15);
    L47:
        if (r10.getContentType() != null) goto L49;
        r8.e(16);
    L51:
        if (r10.getSuffix() != null) goto L53;
        r8.e(17);
    L55:
        if (r10.getTranscodedContentType() != null) goto L57;
        r8.e(18);
    L59:
        if (r10.getTranscodedSuffix() != null) goto L61;
        r8.e(19);
    L63:
        if (r10.getDuration() != null) goto L65;
        r8.e(20);
    L67:
        if (r10.getBitrate() != null) goto L69;
        r8.e(21);
    L71:
        if (r10.getSamplingRate() != null) goto L73;
        r8.e(22);
    L75:
        if (r10.getBitDepth() != null) goto L77;
        r8.e(23);
    L79:
        if (r10.getPath() != null) goto L81;
        r8.e(24);
    L82:
        r8.c(25, r10.isVideo() ? 1 : 0);
        if (r10.getUserRating() != null) goto L85;
        r8.e(26);
    L87:
        if (r10.getAverageRating() != null) goto L89;
        r8.e(27);
    L91:
        if (r10.getPlayCount() != null) goto L93;
        r8.e(28);
    L95:
        if (r10.getDiscNumber() != null) goto L97;
        r8.e(29);
    L98:
        Long r7 = i80.j(r10.getCreated());
        if (r7 != null) goto L101;
        r8.e(30);
    L102:
        Long r11 = i80.j(r10.getStarred());
        if (r11 != null) goto L105;
        r8.e(31);
    L107:
        if (r10.getAlbumId() != null) goto L109;
        r8.e(32);
    L111:
        if (r10.getArtistId() != null) goto L113;
        r8.e(33);
    L115:
        if (r10.getType() != null) goto L117;
        r8.e(34);
    L119:
        if (r10.getBookmarkPosition() != null) goto L121;
        r8.e(35);
    L123:
        if (r10.getOriginalWidth() != null) goto L125;
        r8.e(36);
    L127:
        if (r10.getOriginalHeight() != null) goto L129;
        r8.e(37);
    L131:
        if (r10.getAlbumArtist() != null) goto L133;
        r8.e(38);
    L134:
        ReplayGainInfo r12 = r10.getReplayGain();
        if (r12 != null) goto L137;
        r8.e(39);
        r8.e(40);
        r8.e(41);
        r8.e(42);
        r8.e(43);
        r8.e(44);
        return;
    L137:
        if (r12.getTrackGain() != null) goto L139;
        r8.e(39);
    L141:
        if (r12.getAlbumGain() != null) goto L143;
        r8.e(40);
    L145:
        if (r12.getTrackPeak() != null) goto L147;
        r8.e(41);
    L149:
        if (r12.getAlbumPeak() != null) goto L151;
        r8.e(42);
    L153:
        if (r12.getBaseGain() != null) goto L155;
        r8.e(43);
    L157:
        if (r12.getFallbackGain() != null) goto L160;
        r8.e(44);
        return;
    L160:
        r8.d(r12.getFallbackGain().floatValue(), 44);
        return;
    L155:
        r8.d(r12.getBaseGain().floatValue(), 43);
        goto L157
    L151:
        r8.d(r12.getAlbumPeak().floatValue(), 42);
        goto L153
    L147:
        r8.d(r12.getTrackPeak().floatValue(), 41);
        goto L149
    L143:
        r8.d(r12.getAlbumGain().floatValue(), 40);
        goto L145
    L139:
        r8.d(r12.getTrackGain().floatValue(), 39);
        goto L141
    L133:
        r8.r(38, r10.getAlbumArtist());
        goto L134
    L129:
        r8.c(37, r10.getOriginalHeight().intValue());
        goto L131
    L125:
        r8.c(36, r10.getOriginalWidth().intValue());
        goto L127
    L121:
        r8.c(35, r10.getBookmarkPosition().longValue());
        goto L123
    L117:
        r8.r(34, r10.getType());
        goto L119
    L113:
        r8.r(33, r10.getArtistId());
        goto L115
    L109:
        r8.r(32, r10.getAlbumId());
        goto L111
    L105:
        r8.c(31, r11.longValue());
        goto L107
    L101:
        r8.c(30, r7.longValue());
        goto L102
    L97:
        r8.c(29, r10.getDiscNumber().intValue());
        goto L98
    L93:
        r8.c(28, r10.getPlayCount().longValue());
        goto L95
    L89:
        r8.d(r10.getAverageRating().doubleValue(), 27);
        goto L91
    L85:
        r8.c(26, r10.getUserRating().intValue());
        goto L87
    L81:
        r8.r(24, r10.getPath());
        goto L82
    L77:
        r8.c(23, r10.getBitDepth().intValue());
        goto L79
    L73:
        r8.c(22, r10.getSamplingRate().intValue());
        goto L75
    L69:
        r8.c(21, r10.getBitrate().intValue());
        goto L71
    L65:
        r8.c(20, r10.getDuration().intValue());
        goto L67
    L61:
        r8.r(19, r10.getTranscodedSuffix());
        goto L63
    L57:
        r8.r(18, r10.getTranscodedContentType());
        goto L59
    L53:
        r8.r(17, r10.getSuffix());
        goto L55
    L49:
        r8.r(16, r10.getContentType());
        goto L51
    L45:
        r8.c(15, r10.getSize().longValue());
        goto L47
    L41:
        r8.r(14, r10.getCoverArtId());
        goto L43
    L37:
        r8.r(13, r10.getGenre());
        goto L39
    L33:
        r8.c(12, r10.getYear().intValue());
        goto L35
    L29:
        r8.c(11, r10.getTrack().intValue());
        goto L31
    L25:
        r8.r(10, r10.getArtist());
        goto L27
    L21:
        r8.r(9, r10.getAlbum());
        goto L23
    L17:
        r8.r(8, r10.getTitle());
        goto L19
    L13:
        r8.r(6, r10.getParentId());
        goto L14
    L9:
        r8.r(5, r10.getStreamId());
        goto L11
    L5:
        r8.r(1, r10.getId());
        goto L6
    }

    @Override // defpackage.au0
    public final void c(z34 r17, Object r18) {
        switch(this.G) {
            case 0: goto L479;
            case 1: goto L311;
            case 2: goto L143;
            case 3: goto L129;
            case 4: goto L104;
            case 5: goto L82;
            case 6: goto L41;
            case 7: goto L39;
            case 8: goto L33;
            default: goto L4;
        };
    L4:
        Server r1 = (Server) r18;
        if (r1.getServerId() != null) goto L7;
        r17.e(1);
    L9:
        if (r1.getServerName() != null) goto L11;
        r17.e(2);
    L13:
        if (r1.getUsername() != null) goto L15;
        r17.e(3);
    L17:
        if (r1.getPassword() != null) goto L19;
        r17.e(4);
    L21:
        if (r1.getAddress() != null) goto L23;
        r17.e(5);
    L25:
        if (r1.getLocalAddress() != null) goto L27;
        r17.e(6);
    L28:
        r17.c(7, r1.getTimestamp());
        r17.c(8, r1.isLowSecurity() ? 1 : 0);
        if (r1.getClientCert() != null) goto L31;
        r17.e(9);
        return;
    L31:
        r17.r(9, r1.getClientCert());
        return;
    L27:
        r17.r(6, r1.getLocalAddress());
        goto L28
    L23:
        r17.r(5, r1.getAddress());
        goto L25
    L19:
        r17.r(4, r1.getPassword());
        goto L21
    L15:
        r17.r(3, r1.getUsername());
        goto L17
    L11:
        r17.r(2, r1.getServerName());
        goto L13
    L7:
        r17.r(1, r1.getServerId());
        goto L9
    L33:
        RecentSearch r2 = (RecentSearch) r18;
        if (r2.getSearch() != null) goto L36;
        r17.e(1);
    L37:
        r17.c(2, r2.getTimestamp());
        return;
    L36:
        r17.r(1, r2.getSearch());
        goto L37
    L39:
        W(r17, r18);
        return;
    L41:
        PlaylistSong r3 = (PlaylistSong) r18;
        if (r3.getPlaylistId() != null) goto L44;
        r17.e(1);
    L46:
        if (r3.getId() != null) goto L48;
        r17.e(2);
    L50:
        if (r3.getTitle() != null) goto L52;
        r17.e(3);
    L54:
        if (r3.getArtist() != null) goto L56;
        r17.e(4);
    L58:
        if (r3.getAlbum() != null) goto L60;
        r17.e(5);
    L62:
        if (r3.getTrack() != null) goto L64;
        r17.e(6);
    L66:
        if (r3.getCoverArtId() != null) goto L68;
        r17.e(7);
    L70:
        if (r3.getDuration() != null) goto L72;
        r17.e(8);
    L74:
        if (r3.getAlbumId() != null) goto L76;
        r17.e(9);
    L78:
        if (r3.getArtistId() != null) goto L80;
        r17.e(10);
        return;
    L80:
        r17.r(10, r3.getArtistId());
        return;
    L76:
        r17.r(9, r3.getAlbumId());
        goto L78
    L72:
        r17.c(8, r3.getDuration().intValue());
        goto L74
    L68:
        r17.r(7, r3.getCoverArtId());
        goto L70
    L64:
        r17.c(6, r3.getTrack().intValue());
        goto L66
    L60:
        r17.r(5, r3.getAlbum());
        goto L62
    L56:
        r17.r(4, r3.getArtist());
        goto L58
    L52:
        r17.r(3, r3.getTitle());
        goto L54
    L48:
        r17.r(2, r3.getId());
        goto L50
    L44:
        r17.r(1, r3.getPlaylistId());
        goto L46
    L82:
        LyricsCache r4 = (LyricsCache) r18;
        if (r4.getSongId() != null) goto L85;
        r17.e(1);
    L87:
        if (r4.getArtist() != null) goto L89;
        r17.e(2);
    L91:
        if (r4.getTitle() != null) goto L93;
        r17.e(3);
    L95:
        if (r4.getLyrics() != null) goto L97;
        r17.e(4);
    L99:
        if (r4.getStructuredLyrics() != null) goto L101;
        r17.e(5);
    L102:
        r17.c(6, r4.getUpdatedAt());
        return;
    L101:
        r17.r(5, r4.getStructuredLyrics());
        goto L102
    L97:
        r17.r(4, r4.getLyrics());
        goto L99
    L93:
        r17.r(3, r4.getTitle());
        goto L95
    L89:
        r17.r(2, r4.getArtist());
        goto L91
    L85:
        r17.r(1, r4.getSongId());
        goto L87
    L104:
        InternetRadioStationCache r5 = (InternetRadioStationCache) r18;
        if (r5.getId() != null) goto L107;
        r17.e(1);
    L109:
        if (r5.getName() != null) goto L111;
        r17.e(2);
    L113:
        if (r5.getStreamUrl() != null) goto L115;
        r17.e(3);
    L117:
        if (r5.getHomePageUrl() != null) goto L119;
        r17.e(4);
    L121:
        if (r5.getSource() != null) goto L123;
        r17.e(5);
    L125:
        if (r5.getCoverArtUrl() != null) goto L127;
        r17.e(6);
        return;
    L127:
        r17.r(6, r5.getCoverArtUrl());
        return;
    L123:
        r17.r(5, r5.getSource());
        goto L125
    L119:
        r17.r(4, r5.getHomePageUrl());
        goto L121
    L115:
        r17.r(3, r5.getStreamUrl());
        goto L117
    L111:
        r17.r(2, r5.getName());
        goto L113
    L107:
        r17.r(1, r5.getId());
        goto L109
    L129:
        Favorite r6 = (Favorite) r18;
        r17.c(1, r6.getTimestamp());
        if (r6.getSongId() != null) goto L132;
        r17.e(2);
    L134:
        if (r6.getAlbumId() != null) goto L136;
        r17.e(3);
    L138:
        if (r6.getArtistId() != null) goto L140;
        r17.e(4);
    L141:
        r17.c(5, r6.getToStar() ? 1 : 0);
        return;
    L140:
        r17.r(4, r6.getArtistId());
        goto L141
    L136:
        r17.r(3, r6.getAlbumId());
        goto L138
    L132:
        r17.r(2, r6.getSongId());
        goto L134
    L143:
        Download r7 = (Download) r18;
        if (r7.getId() != null) goto L146;
        r17.e(1);
    L148:
        if (r7.getPlaylistId() != null) goto L150;
        r17.e(2);
    L152:
        if (r7.getPlaylistName() != null) goto L154;
        r17.e(3);
    L155:
        r17.c(4, r7.getDownloadState());
        if (r7.getDownloadUri() != null) goto L158;
        r17.e(5);
    L160:
        if (r7.getParentId() != null) goto L162;
        r17.e(6);
    L163:
        r17.c(7, r7.isDir() ? 1 : 0);
        if (r7.getTitle() != null) goto L166;
        r17.e(8);
    L168:
        if (r7.getAlbum() != null) goto L170;
        r17.e(9);
    L172:
        if (r7.getArtist() != null) goto L174;
        r17.e(10);
    L176:
        if (r7.getTrack() != null) goto L178;
        r17.e(11);
    L180:
        if (r7.getYear() != null) goto L182;
        r17.e(12);
    L184:
        if (r7.getGenre() != null) goto L186;
        r17.e(13);
    L188:
        if (r7.getCoverArtId() != null) goto L190;
        r17.e(14);
    L192:
        if (r7.getSize() != null) goto L194;
        r17.e(15);
    L196:
        if (r7.getContentType() != null) goto L198;
        r17.e(16);
    L200:
        if (r7.getSuffix() != null) goto L202;
        r17.e(17);
    L204:
        if (r7.getTranscodedContentType() != null) goto L206;
        r17.e(18);
    L208:
        if (r7.getTranscodedSuffix() != null) goto L210;
        r17.e(19);
    L212:
        if (r7.getDuration() != null) goto L214;
        r17.e(20);
    L216:
        if (r7.getBitrate() != null) goto L218;
        r17.e(21);
    L220:
        if (r7.getSamplingRate() != null) goto L222;
        r17.e(22);
    L224:
        if (r7.getBitDepth() != null) goto L226;
        r17.e(23);
    L228:
        if (r7.getPath() != null) goto L230;
        r17.e(24);
    L231:
        r17.c(25, r7.isVideo() ? 1 : 0);
        if (r7.getUserRating() != null) goto L234;
        r17.e(26);
    L236:
        if (r7.getAverageRating() != null) goto L238;
        r17.e(27);
    L240:
        if (r7.getPlayCount() != null) goto L242;
        r17.e(28);
    L244:
        if (r7.getDiscNumber() != null) goto L246;
        r17.e(29);
    L247:
        Long r8 = i80.j(r7.getCreated());
        if (r8 != null) goto L250;
        r17.e(30);
    L251:
        Long r9 = i80.j(r7.getStarred());
        if (r9 != null) goto L254;
        r17.e(31);
    L256:
        if (r7.getAlbumId() != null) goto L258;
        r17.e(32);
    L260:
        if (r7.getArtistId() != null) goto L262;
        r17.e(33);
    L264:
        if (r7.getType() != null) goto L266;
        r17.e(34);
    L268:
        if (r7.getBookmarkPosition() != null) goto L270;
        r17.e(35);
    L272:
        if (r7.getOriginalWidth() != null) goto L274;
        r17.e(36);
    L276:
        if (r7.getOriginalHeight() != null) goto L278;
        r17.e(37);
    L280:
        if (r7.getAlbumArtist() != null) goto L282;
        r17.e(38);
    L283:
        ReplayGainInfo r10 = r7.getReplayGain();
        if (r10 != null) goto L286;
        r17.e(39);
        r17.e(40);
        r17.e(41);
        r17.e(42);
        r17.e(43);
        r17.e(44);
        return;
    L286:
        if (r10.getTrackGain() != null) goto L288;
        r17.e(39);
    L290:
        if (r10.getAlbumGain() != null) goto L292;
        r17.e(40);
    L294:
        if (r10.getTrackPeak() != null) goto L296;
        r17.e(41);
    L298:
        if (r10.getAlbumPeak() != null) goto L300;
        r17.e(42);
    L302:
        if (r10.getBaseGain() != null) goto L304;
        r17.e(43);
    L306:
        if (r10.getFallbackGain() != null) goto L308;
        r17.e(44);
        return;
    L308:
        r17.d(r10.getFallbackGain().floatValue(), 44);
        return;
    L304:
        r17.d(r10.getBaseGain().floatValue(), 43);
        goto L306
    L300:
        r17.d(r10.getAlbumPeak().floatValue(), 42);
        goto L302
    L296:
        r17.d(r10.getTrackPeak().floatValue(), 41);
        goto L298
    L292:
        r17.d(r10.getAlbumGain().floatValue(), 40);
        goto L294
    L288:
        r17.d(r10.getTrackGain().floatValue(), 39);
        goto L290
    L282:
        r17.r(38, r7.getAlbumArtist());
        goto L283
    L278:
        r17.c(37, r7.getOriginalHeight().intValue());
        goto L280
    L274:
        r17.c(36, r7.getOriginalWidth().intValue());
        goto L276
    L270:
        r17.c(35, r7.getBookmarkPosition().longValue());
        goto L272
    L266:
        r17.r(34, r7.getType());
        goto L268
    L262:
        r17.r(33, r7.getArtistId());
        goto L264
    L258:
        r17.r(32, r7.getAlbumId());
        goto L260
    L254:
        r17.c(31, r9.longValue());
        goto L256
    L250:
        r17.c(30, r8.longValue());
        goto L251
    L246:
        r17.c(29, r7.getDiscNumber().intValue());
        goto L247
    L242:
        r17.c(28, r7.getPlayCount().longValue());
        goto L244
    L238:
        r17.d(r7.getAverageRating().doubleValue(), 27);
        goto L240
    L234:
        r17.c(26, r7.getUserRating().intValue());
        goto L236
    L230:
        r17.r(24, r7.getPath());
        goto L231
    L226:
        r17.c(23, r7.getBitDepth().intValue());
        goto L228
    L222:
        r17.c(22, r7.getSamplingRate().intValue());
        goto L224
    L218:
        r17.c(21, r7.getBitrate().intValue());
        goto L220
    L214:
        r17.c(20, r7.getDuration().intValue());
        goto L216
    L210:
        r17.r(19, r7.getTranscodedSuffix());
        goto L212
    L206:
        r17.r(18, r7.getTranscodedContentType());
        goto L208
    L202:
        r17.r(17, r7.getSuffix());
        goto L204
    L198:
        r17.r(16, r7.getContentType());
        goto L200
    L194:
        r17.c(15, r7.getSize().longValue());
        goto L196
    L190:
        r17.r(14, r7.getCoverArtId());
        goto L192
    L186:
        r17.r(13, r7.getGenre());
        goto L188
    L182:
        r17.c(12, r7.getYear().intValue());
        goto L184
    L178:
        r17.c(11, r7.getTrack().intValue());
        goto L180
    L174:
        r17.r(10, r7.getArtist());
        goto L176
    L170:
        r17.r(9, r7.getAlbum());
        goto L172
    L166:
        r17.r(8, r7.getTitle());
        goto L168
    L162:
        r17.r(6, r7.getParentId());
        goto L163
    L158:
        r17.r(5, r7.getDownloadUri());
        goto L160
    L154:
        r17.r(3, r7.getPlaylistName());
        goto L155
    L150:
        r17.r(2, r7.getPlaylistId());
        goto L152
    L146:
        r17.r(1, r7.getId());
        goto L148
    L311:
        Download r11 = (Download) r18;
        if (r11.getId() != null) goto L314;
        r17.e(1);
    L316:
        if (r11.getPlaylistId() != null) goto L318;
        r17.e(2);
    L320:
        if (r11.getPlaylistName() != null) goto L322;
        r17.e(3);
    L323:
        r17.c(4, r11.getDownloadState());
        if (r11.getDownloadUri() != null) goto L326;
        r17.e(5);
    L328:
        if (r11.getParentId() != null) goto L330;
        r17.e(6);
    L331:
        r17.c(7, r11.isDir() ? 1 : 0);
        if (r11.getTitle() != null) goto L334;
        r17.e(8);
    L336:
        if (r11.getAlbum() != null) goto L338;
        r17.e(9);
    L340:
        if (r11.getArtist() != null) goto L342;
        r17.e(10);
    L344:
        if (r11.getTrack() != null) goto L346;
        r17.e(11);
    L348:
        if (r11.getYear() != null) goto L350;
        r17.e(12);
    L352:
        if (r11.getGenre() != null) goto L354;
        r17.e(13);
    L356:
        if (r11.getCoverArtId() != null) goto L358;
        r17.e(14);
    L360:
        if (r11.getSize() != null) goto L362;
        r17.e(15);
    L364:
        if (r11.getContentType() != null) goto L366;
        r17.e(16);
    L368:
        if (r11.getSuffix() != null) goto L370;
        r17.e(17);
    L372:
        if (r11.getTranscodedContentType() != null) goto L374;
        r17.e(18);
    L376:
        if (r11.getTranscodedSuffix() != null) goto L378;
        r17.e(19);
    L380:
        if (r11.getDuration() != null) goto L382;
        r17.e(20);
    L384:
        if (r11.getBitrate() != null) goto L386;
        r17.e(21);
    L388:
        if (r11.getSamplingRate() != null) goto L390;
        r17.e(22);
    L392:
        if (r11.getBitDepth() != null) goto L394;
        r17.e(23);
    L396:
        if (r11.getPath() != null) goto L398;
        r17.e(24);
    L399:
        r17.c(25, r11.isVideo() ? 1 : 0);
        if (r11.getUserRating() != null) goto L402;
        r17.e(26);
    L404:
        if (r11.getAverageRating() != null) goto L406;
        r17.e(27);
    L408:
        if (r11.getPlayCount() != null) goto L410;
        r17.e(28);
    L412:
        if (r11.getDiscNumber() != null) goto L414;
        r17.e(29);
    L415:
        Long r12 = i80.j(r11.getCreated());
        if (r12 != null) goto L418;
        r17.e(30);
    L419:
        Long r13 = i80.j(r11.getStarred());
        if (r13 != null) goto L422;
        r17.e(31);
    L424:
        if (r11.getAlbumId() != null) goto L426;
        r17.e(32);
    L428:
        if (r11.getArtistId() != null) goto L430;
        r17.e(33);
    L432:
        if (r11.getType() != null) goto L434;
        r17.e(34);
    L436:
        if (r11.getBookmarkPosition() != null) goto L438;
        r17.e(35);
    L440:
        if (r11.getOriginalWidth() != null) goto L442;
        r17.e(36);
    L444:
        if (r11.getOriginalHeight() != null) goto L446;
        r17.e(37);
    L448:
        if (r11.getAlbumArtist() != null) goto L450;
        r17.e(38);
    L451:
        ReplayGainInfo r14 = r11.getReplayGain();
        if (r14 != null) goto L454;
        r17.e(39);
        r17.e(40);
        r17.e(41);
        r17.e(42);
        r17.e(43);
        r17.e(44);
        return;
    L454:
        if (r14.getTrackGain() != null) goto L456;
        r17.e(39);
    L458:
        if (r14.getAlbumGain() != null) goto L460;
        r17.e(40);
    L462:
        if (r14.getTrackPeak() != null) goto L464;
        r17.e(41);
    L466:
        if (r14.getAlbumPeak() != null) goto L468;
        r17.e(42);
    L470:
        if (r14.getBaseGain() != null) goto L472;
        r17.e(43);
    L474:
        if (r14.getFallbackGain() != null) goto L476;
        r17.e(44);
        return;
    L476:
        r17.d(r14.getFallbackGain().floatValue(), 44);
        return;
    L472:
        r17.d(r14.getBaseGain().floatValue(), 43);
        goto L474
    L468:
        r17.d(r14.getAlbumPeak().floatValue(), 42);
        goto L470
    L464:
        r17.d(r14.getTrackPeak().floatValue(), 41);
        goto L466
    L460:
        r17.d(r14.getAlbumGain().floatValue(), 40);
        goto L462
    L456:
        r17.d(r14.getTrackGain().floatValue(), 39);
        goto L458
    L450:
        r17.r(38, r11.getAlbumArtist());
        goto L451
    L446:
        r17.c(37, r11.getOriginalHeight().intValue());
        goto L448
    L442:
        r17.c(36, r11.getOriginalWidth().intValue());
        goto L444
    L438:
        r17.c(35, r11.getBookmarkPosition().longValue());
        goto L440
    L434:
        r17.r(34, r11.getType());
        goto L436
    L430:
        r17.r(33, r11.getArtistId());
        goto L432
    L426:
        r17.r(32, r11.getAlbumId());
        goto L428
    L422:
        r17.c(31, r13.longValue());
        goto L424
    L418:
        r17.c(30, r12.longValue());
        goto L419
    L414:
        r17.c(29, r11.getDiscNumber().intValue());
        goto L415
    L410:
        r17.c(28, r11.getPlayCount().longValue());
        goto L412
    L406:
        r17.d(r11.getAverageRating().doubleValue(), 27);
        goto L408
    L402:
        r17.c(26, r11.getUserRating().intValue());
        goto L404
    L398:
        r17.r(24, r11.getPath());
        goto L399
    L394:
        r17.c(23, r11.getBitDepth().intValue());
        goto L396
    L390:
        r17.c(22, r11.getSamplingRate().intValue());
        goto L392
    L386:
        r17.c(21, r11.getBitrate().intValue());
        goto L388
    L382:
        r17.c(20, r11.getDuration().intValue());
        goto L384
    L378:
        r17.r(19, r11.getTranscodedSuffix());
        goto L380
    L374:
        r17.r(18, r11.getTranscodedContentType());
        goto L376
    L370:
        r17.r(17, r11.getSuffix());
        goto L372
    L366:
        r17.r(16, r11.getContentType());
        goto L368
    L362:
        r17.c(15, r11.getSize().longValue());
        goto L364
    L358:
        r17.r(14, r11.getCoverArtId());
        goto L360
    L354:
        r17.r(13, r11.getGenre());
        goto L356
    L350:
        r17.c(12, r11.getYear().intValue());
        goto L352
    L346:
        r17.c(11, r11.getTrack().intValue());
        goto L348
    L342:
        r17.r(10, r11.getArtist());
        goto L344
    L338:
        r17.r(9, r11.getAlbum());
        goto L340
    L334:
        r17.r(8, r11.getTitle());
        goto L336
    L330:
        r17.r(6, r11.getParentId());
        goto L331
    L326:
        r17.r(5, r11.getDownloadUri());
        goto L328
    L322:
        r17.r(3, r11.getPlaylistName());
        goto L323
    L318:
        r17.r(2, r11.getPlaylistId());
        goto L320
    L314:
        r17.r(1, r11.getId());
        goto L316
    L479:
        Chronology r15 = (Chronology) r18;
        if (r15.getId() != null) goto L482;
        r17.e(1);
    L483:
        r17.c(2, r15.getTimestamp());
        if (r15.getServer() != null) goto L486;
        r17.e(3);
    L488:
        if (r15.getParentId() != null) goto L490;
        r17.e(4);
    L491:
        r17.c(5, r15.isDir() ? 1 : 0);
        if (r15.getTitle() != null) goto L494;
        r17.e(6);
    L496:
        if (r15.getAlbum() != null) goto L498;
        r17.e(7);
    L500:
        if (r15.getArtist() != null) goto L502;
        r17.e(8);
    L504:
        if (r15.getTrack() != null) goto L506;
        r17.e(9);
    L508:
        if (r15.getYear() != null) goto L510;
        r17.e(10);
    L512:
        if (r15.getGenre() != null) goto L514;
        r17.e(11);
    L516:
        if (r15.getCoverArtId() != null) goto L518;
        r17.e(12);
    L520:
        if (r15.getSize() != null) goto L522;
        r17.e(13);
    L524:
        if (r15.getContentType() != null) goto L526;
        r17.e(14);
    L528:
        if (r15.getSuffix() != null) goto L530;
        r17.e(15);
    L532:
        if (r15.getTranscodedContentType() != null) goto L534;
        r17.e(16);
    L536:
        if (r15.getTranscodedSuffix() != null) goto L538;
        r17.e(17);
    L540:
        if (r15.getDuration() != null) goto L542;
        r17.e(18);
    L544:
        if (r15.getBitrate() != null) goto L546;
        r17.e(19);
    L548:
        if (r15.getSamplingRate() != null) goto L550;
        r17.e(20);
    L552:
        if (r15.getBitDepth() != null) goto L554;
        r17.e(21);
    L556:
        if (r15.getPath() != null) goto L558;
        r17.e(22);
    L559:
        r17.c(23, r15.isVideo() ? 1 : 0);
        if (r15.getUserRating() != null) goto L562;
        r17.e(24);
    L564:
        if (r15.getAverageRating() != null) goto L566;
        r17.e(25);
    L568:
        if (r15.getPlayCount() != null) goto L570;
        r17.e(26);
    L572:
        if (r15.getDiscNumber() != null) goto L574;
        r17.e(27);
    L575:
        Long r16 = i80.j(r15.getCreated());
        if (r16 != null) goto L578;
        r17.e(28);
    L579:
        Long r19 = i80.j(r15.getStarred());
        if (r19 != null) goto L582;
        r17.e(29);
    L584:
        if (r15.getAlbumId() != null) goto L586;
        r17.e(30);
    L588:
        if (r15.getArtistId() != null) goto L590;
        r17.e(31);
    L592:
        if (r15.getType() != null) goto L594;
        r17.e(32);
    L596:
        if (r15.getBookmarkPosition() != null) goto L598;
        r17.e(33);
    L600:
        if (r15.getOriginalWidth() != null) goto L602;
        r17.e(34);
    L604:
        if (r15.getOriginalHeight() != null) goto L606;
        r17.e(35);
    L608:
        if (r15.getAlbumArtist() != null) goto L610;
        r17.e(36);
    L611:
        ReplayGainInfo r20 = r15.getReplayGain();
        if (r20 != null) goto L614;
        r17.e(37);
        r17.e(38);
        r17.e(39);
        r17.e(40);
        r17.e(41);
        r17.e(42);
        return;
    L614:
        if (r20.getTrackGain() != null) goto L616;
        r17.e(37);
    L618:
        if (r20.getAlbumGain() != null) goto L620;
        r17.e(38);
    L622:
        if (r20.getTrackPeak() != null) goto L624;
        r17.e(39);
    L626:
        if (r20.getAlbumPeak() != null) goto L628;
        r17.e(40);
    L630:
        if (r20.getBaseGain() != null) goto L632;
        r17.e(41);
    L634:
        if (r20.getFallbackGain() != null) goto L636;
        r17.e(42);
        return;
    L636:
        r17.d(r20.getFallbackGain().floatValue(), 42);
        return;
    L632:
        r17.d(r20.getBaseGain().floatValue(), 41);
        goto L634
    L628:
        r17.d(r20.getAlbumPeak().floatValue(), 40);
        goto L630
    L624:
        r17.d(r20.getTrackPeak().floatValue(), 39);
        goto L626
    L620:
        r17.d(r20.getAlbumGain().floatValue(), 38);
        goto L622
    L616:
        r17.d(r20.getTrackGain().floatValue(), 37);
        goto L618
    L610:
        r17.r(36, r15.getAlbumArtist());
        goto L611
    L606:
        r17.c(35, r15.getOriginalHeight().intValue());
        goto L608
    L602:
        r17.c(34, r15.getOriginalWidth().intValue());
        goto L604
    L598:
        r17.c(33, r15.getBookmarkPosition().longValue());
        goto L600
    L594:
        r17.r(32, r15.getType());
        goto L596
    L590:
        r17.r(31, r15.getArtistId());
        goto L592
    L586:
        r17.r(30, r15.getAlbumId());
        goto L588
    L582:
        r17.c(29, r19.longValue());
        goto L584
    L578:
        r17.c(28, r16.longValue());
        goto L579
    L574:
        r17.c(27, r15.getDiscNumber().intValue());
        goto L575
    L570:
        r17.c(26, r15.getPlayCount().longValue());
        goto L572
    L566:
        r17.d(r15.getAverageRating().doubleValue(), 25);
        goto L568
    L562:
        r17.c(24, r15.getUserRating().intValue());
        goto L564
    L558:
        r17.r(22, r15.getPath());
        goto L559
    L554:
        r17.c(21, r15.getBitDepth().intValue());
        goto L556
    L550:
        r17.c(20, r15.getSamplingRate().intValue());
        goto L552
    L546:
        r17.c(19, r15.getBitrate().intValue());
        goto L548
    L542:
        r17.c(18, r15.getDuration().intValue());
        goto L544
    L538:
        r17.r(17, r15.getTranscodedSuffix());
        goto L540
    L534:
        r17.r(16, r15.getTranscodedContentType());
        goto L536
    L530:
        r17.r(15, r15.getSuffix());
        goto L532
    L526:
        r17.r(14, r15.getContentType());
        goto L528
    L522:
        r17.c(13, r15.getSize().longValue());
        goto L524
    L518:
        r17.r(12, r15.getCoverArtId());
        goto L520
    L514:
        r17.r(11, r15.getGenre());
        goto L516
    L510:
        r17.c(10, r15.getYear().intValue());
        goto L512
    L506:
        r17.c(9, r15.getTrack().intValue());
        goto L508
    L502:
        r17.r(8, r15.getArtist());
        goto L504
    L498:
        r17.r(7, r15.getAlbum());
        goto L500
    L494:
        r17.r(6, r15.getTitle());
        goto L496
    L490:
        r17.r(4, r15.getParentId());
        goto L491
    L486:
        r17.r(3, r15.getServer());
        goto L488
    L482:
        r17.r(1, r15.getId());
        goto L483
    }

    @Override // defpackage.au0
    public final String i() {
        switch(this.G) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        return "INSERT OR REPLACE INTO `server` (`id`,`server_name`,`username`,`password`,`address`,`local_address`,`timestamp`,`low_security`,`client_cert`) VALUES (?,?,?,?,?,?,?,?,?)";
    L6:
        return "INSERT OR REPLACE INTO `recent_search` (`search`,`timestamp`) VALUES (?,?)";
    L8:
        return "INSERT OR REPLACE INTO `queue` (`id`,`track_order`,`last_play`,`playing_changed`,`stream_id`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    L10:
        return "INSERT OR REPLACE INTO `playlist_song` (`playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    L12:
        return "INSERT OR REPLACE INTO `lyrics_cache` (`song_id`,`artist`,`title`,`lyrics`,`structured_lyrics`,`updated_at`) VALUES (?,?,?,?,?,?)";
    L14:
        return "INSERT OR REPLACE INTO `internet_radio_station_cache` (`id`,`name`,`stream_url`,`home_page_url`,`source`,`cover_art_url`) VALUES (?,?,?,?,?,?)";
    L16:
        return "INSERT OR IGNORE INTO `favorite` (`timestamp`,`songId`,`albumId`,`artistId`,`toStar`) VALUES (?,?,?,?,?)";
    L18:
        return "INSERT OR IGNORE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    L20:
        return "INSERT OR REPLACE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    L22:
        return "INSERT OR REPLACE INTO `chronology` (`id`,`timestamp`,`server`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public /* synthetic */ q20(int r1, Object r2) {
        this.G = r1;
    }
}
