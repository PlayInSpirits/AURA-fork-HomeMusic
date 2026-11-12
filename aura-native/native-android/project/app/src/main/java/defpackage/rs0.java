package defpackage;

import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    public /* synthetic */ rs0(ss0 ss0Var, String str) {
        this.n = 0;
        this.o = str;
    }

    private final Object b(Object obj) throws Exception {
        z34 z34VarU = ((x34) obj).U("DELETE FROM playlist WHERE id = ?");
        String str = this.o;
        try {
            if (str == null) {
                z34VarU.e(1);
            } else {
                z34VarU.r(1, str);
            }
            z34VarU.O();
            z34VarU.close();
            return null;
        } catch (Throwable th) {
            z34VarU.close();
            throw th;
        }
    }

    private final Object c(Object obj) throws Exception {
        z34 z34VarU = ((x34) obj).U("SELECT coverArt FROM playlist WHERE id = ?");
        String str = this.o;
        try {
            if (str == null) {
                z34VarU.e(1);
            } else {
                z34VarU.r(1, str);
            }
            String strD = null;
            if (z34VarU.O() && !z34VarU.isNull(0)) {
                strD = z34VarU.D(0);
            }
            z34VarU.close();
            return strD;
        } catch (Throwable th) {
            z34VarU.close();
            throw th;
        }
    }

    private final Object e(Object obj) throws Exception {
        z34 z34VarU = ((x34) obj).U("SELECT isUniversal FROM playlist WHERE id = ?");
        String str = this.o;
        boolean z = true;
        try {
            if (str == null) {
                z34VarU.e(1);
            } else {
                z34VarU.r(1, str);
            }
            Boolean boolValueOf = null;
            if (z34VarU.O()) {
                Integer numValueOf = z34VarU.isNull(0) ? null : Integer.valueOf((int) z34VarU.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            z34VarU.close();
            return boolValueOf;
        } catch (Throwable th) {
            z34VarU.close();
            throw th;
        }
    }

    private final Object f(Object obj) throws Exception {
        z34 z34VarU = ((x34) obj).U("DELETE FROM playlist_song WHERE playlist_id = ?");
        String str = this.o;
        try {
            if (str == null) {
                z34VarU.e(1);
            } else {
                z34VarU.r(1, str);
            }
            z34VarU.O();
            z34VarU.close();
            return null;
        } catch (Throwable th) {
            z34VarU.close();
            throw th;
        }
    }

    private final Object g(Object obj) throws Exception {
        z34 z34VarU = ((x34) obj).U("SELECT * FROM playlist_song WHERE playlist_id = ?");
        String str = this.o;
        try {
            if (str == null) {
                z34VarU.e(1);
            } else {
                z34VarU.r(1, str);
            }
            int iE = rr2.E(z34VarU, "playlist_id");
            int iE2 = rr2.E(z34VarU, "id");
            int iE3 = rr2.E(z34VarU, "title");
            int iE4 = rr2.E(z34VarU, "artist");
            int iE5 = rr2.E(z34VarU, "album");
            int iE6 = rr2.E(z34VarU, "track");
            int iE7 = rr2.E(z34VarU, "cover_art_id");
            int iE8 = rr2.E(z34VarU, "duration");
            int iE9 = rr2.E(z34VarU, "album_id");
            int iE10 = rr2.E(z34VarU, "artist_id");
            ArrayList arrayList = new ArrayList();
            while (z34VarU.O()) {
                arrayList.add(new PlaylistSong(z34VarU.isNull(iE) ? null : z34VarU.D(iE), z34VarU.isNull(iE2) ? null : z34VarU.D(iE2), z34VarU.isNull(iE3) ? null : z34VarU.D(iE3), z34VarU.isNull(iE4) ? null : z34VarU.D(iE4), z34VarU.isNull(iE5) ? null : z34VarU.D(iE5), z34VarU.isNull(iE6) ? null : Integer.valueOf((int) z34VarU.getLong(iE6)), z34VarU.isNull(iE7) ? null : z34VarU.D(iE7), z34VarU.isNull(iE8) ? null : Integer.valueOf((int) z34VarU.getLong(iE8)), z34VarU.isNull(iE9) ? null : z34VarU.D(iE9), z34VarU.isNull(iE10) ? null : z34VarU.D(iE10)));
            }
            z34VarU.close();
            return arrayList;
        } catch (Throwable th) {
            z34VarU.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        Download download;
        ReplayGainInfo replayGainInfo;
        int i = this.n;
        j15 j15Var = j15.a;
        Object internetRadioStationCache = null;
        String str = this.o;
        switch (i) {
            case 0:
                z34 z34VarU = ((x34) obj).U("SELECT * FROM download WHERE id = ?");
                try {
                    if (str == null) {
                        z34VarU.e(1);
                    } else {
                        z34VarU.r(1, str);
                    }
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "playlist_id");
                    int iE3 = rr2.E(z34VarU, "playlist_name");
                    int iE4 = rr2.E(z34VarU, "download_state");
                    int iE5 = rr2.E(z34VarU, "download_uri");
                    int iE6 = rr2.E(z34VarU, "parent_id");
                    int iE7 = rr2.E(z34VarU, "is_dir");
                    int iE8 = rr2.E(z34VarU, "title");
                    int iE9 = rr2.E(z34VarU, "album");
                    int iE10 = rr2.E(z34VarU, "artist");
                    int iE11 = rr2.E(z34VarU, "track");
                    int iE12 = rr2.E(z34VarU, "year");
                    int iE13 = rr2.E(z34VarU, "genre");
                    int iE14 = rr2.E(z34VarU, "cover_art_id");
                    int iE15 = rr2.E(z34VarU, "size");
                    int iE16 = rr2.E(z34VarU, "content_type");
                    int iE17 = rr2.E(z34VarU, "suffix");
                    int iE18 = rr2.E(z34VarU, "transcoding_content_type");
                    int iE19 = rr2.E(z34VarU, "transcoded_suffix");
                    int iE20 = rr2.E(z34VarU, "duration");
                    int iE21 = rr2.E(z34VarU, "bitrate");
                    int iE22 = rr2.E(z34VarU, "sampling_rate");
                    int iE23 = rr2.E(z34VarU, "bit_depth");
                    int iE24 = rr2.E(z34VarU, "path");
                    int iE25 = rr2.E(z34VarU, "is_video");
                    int iE26 = rr2.E(z34VarU, "user_rating");
                    int iE27 = rr2.E(z34VarU, "average_rating");
                    int iE28 = rr2.E(z34VarU, "play_count");
                    int iE29 = rr2.E(z34VarU, "disc_number");
                    int iE30 = rr2.E(z34VarU, "created");
                    int iE31 = rr2.E(z34VarU, "starred");
                    int iE32 = rr2.E(z34VarU, "album_id");
                    int iE33 = rr2.E(z34VarU, "artist_id");
                    int iE34 = rr2.E(z34VarU, "type");
                    int iE35 = rr2.E(z34VarU, "bookmark_position");
                    int iE36 = rr2.E(z34VarU, "original_width");
                    int iE37 = rr2.E(z34VarU, "original_height");
                    int iE38 = rr2.E(z34VarU, "album_artist");
                    int iE39 = rr2.E(z34VarU, "rg_track_gain");
                    int iE40 = rr2.E(z34VarU, "rg_album_gain");
                    int iE41 = rr2.E(z34VarU, "rg_track_peak");
                    int iE42 = rr2.E(z34VarU, "rg_album_peak");
                    int iE43 = rr2.E(z34VarU, "rg_base_gain");
                    int iE44 = rr2.E(z34VarU, "rg_fallback_gain");
                    if (z34VarU.O()) {
                        String strD = z34VarU.isNull(iE) ? null : z34VarU.D(iE);
                        String strD2 = z34VarU.isNull(iE2) ? null : z34VarU.D(iE2);
                        String strD3 = z34VarU.isNull(iE3) ? null : z34VarU.D(iE3);
                        int i2 = (int) z34VarU.getLong(iE4);
                        String strD4 = z34VarU.isNull(iE5) ? null : z34VarU.D(iE5);
                        if (z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42) && z34VarU.isNull(iE43) && z34VarU.isNull(iE44)) {
                            replayGainInfo = null;
                        } else {
                            replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)), z34VarU.isNull(iE43) ? null : Float.valueOf((float) z34VarU.getDouble(iE43)), z34VarU.isNull(iE44) ? null : Float.valueOf((float) z34VarU.getDouble(iE44)));
                        }
                        Download download2 = new Download(strD, strD2, strD3, i2, strD4);
                        download2.setParentId(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                        download2.setDir(((int) z34VarU.getLong(iE7)) != 0);
                        download2.setTitle(z34VarU.isNull(iE8) ? null : z34VarU.D(iE8));
                        download2.setAlbum(z34VarU.isNull(iE9) ? null : z34VarU.D(iE9));
                        download2.setArtist(z34VarU.isNull(iE10) ? null : z34VarU.D(iE10));
                        download2.setTrack(z34VarU.isNull(iE11) ? null : Integer.valueOf((int) z34VarU.getLong(iE11)));
                        download2.setYear(z34VarU.isNull(iE12) ? null : Integer.valueOf((int) z34VarU.getLong(iE12)));
                        download2.setGenre(z34VarU.isNull(iE13) ? null : z34VarU.D(iE13));
                        download2.setCoverArtId(z34VarU.isNull(iE14) ? null : z34VarU.D(iE14));
                        download2.setSize(z34VarU.isNull(iE15) ? null : Long.valueOf(z34VarU.getLong(iE15)));
                        download2.setContentType(z34VarU.isNull(iE16) ? null : z34VarU.D(iE16));
                        download2.setSuffix(z34VarU.isNull(iE17) ? null : z34VarU.D(iE17));
                        download2.setTranscodedContentType(z34VarU.isNull(iE18) ? null : z34VarU.D(iE18));
                        download2.setTranscodedSuffix(z34VarU.isNull(iE19) ? null : z34VarU.D(iE19));
                        download2.setDuration(z34VarU.isNull(iE20) ? null : Integer.valueOf((int) z34VarU.getLong(iE20)));
                        download2.setBitrate(z34VarU.isNull(iE21) ? null : Integer.valueOf((int) z34VarU.getLong(iE21)));
                        download2.setSamplingRate(z34VarU.isNull(iE22) ? null : Integer.valueOf((int) z34VarU.getLong(iE22)));
                        download2.setBitDepth(z34VarU.isNull(iE23) ? null : Integer.valueOf((int) z34VarU.getLong(iE23)));
                        download2.setPath(z34VarU.isNull(iE24) ? null : z34VarU.D(iE24));
                        download2.setVideo(((int) z34VarU.getLong(iE25)) != 0);
                        download2.setUserRating(z34VarU.isNull(iE26) ? null : Integer.valueOf((int) z34VarU.getLong(iE26)));
                        download2.setAverageRating(z34VarU.isNull(iE27) ? null : Double.valueOf(z34VarU.getDouble(iE27)));
                        download2.setPlayCount(z34VarU.isNull(iE28) ? null : Long.valueOf(z34VarU.getLong(iE28)));
                        download2.setDiscNumber(z34VarU.isNull(iE29) ? null : Integer.valueOf((int) z34VarU.getLong(iE29)));
                        download2.setCreated(i80.B(z34VarU.isNull(iE30) ? null : Long.valueOf(z34VarU.getLong(iE30))));
                        download2.setStarred(i80.B(z34VarU.isNull(iE31) ? null : Long.valueOf(z34VarU.getLong(iE31))));
                        download2.setAlbumId(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                        download2.setArtistId(z34VarU.isNull(iE33) ? null : z34VarU.D(iE33));
                        download2.setType(z34VarU.isNull(iE34) ? null : z34VarU.D(iE34));
                        download2.setBookmarkPosition(z34VarU.isNull(iE35) ? null : Long.valueOf(z34VarU.getLong(iE35)));
                        download2.setOriginalWidth(z34VarU.isNull(iE36) ? null : Integer.valueOf((int) z34VarU.getLong(iE36)));
                        download2.setOriginalHeight(z34VarU.isNull(iE37) ? null : Integer.valueOf((int) z34VarU.getLong(iE37)));
                        download2.setAlbumArtist(z34VarU.isNull(iE38) ? null : z34VarU.D(iE38));
                        download2.setReplayGain(replayGainInfo);
                        download = download2;
                    } else {
                        download = null;
                    }
                    z34VarU.close();
                    return download;
                } catch (Throwable th) {
                    z34VarU.close();
                    throw th;
                }
            case 1:
                z34 z34VarU2 = ((x34) obj).U("DELETE FROM download WHERE id = ?");
                try {
                    if (str == null) {
                        z34VarU2.e(1);
                    } else {
                        z34VarU2.r(1, str);
                    }
                    z34VarU2.O();
                    z34VarU2.close();
                    return null;
                } catch (Throwable th2) {
                    z34VarU2.close();
                    throw th2;
                }
            case 2:
                z34 z34VarU3 = ((x34) obj).U("UPDATE download SET download_state = 1 WHERE id = ?");
                try {
                    if (str == null) {
                        z34VarU3.e(1);
                    } else {
                        z34VarU3.r(1, str);
                    }
                    z34VarU3.O();
                    z34VarU3.close();
                    return null;
                } catch (Throwable th3) {
                    z34VarU3.close();
                    throw th3;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                String str2 = (String) obj;
                str2.getClass();
                String strConcat = str2.concat("/api/library/track-source");
                fr1 fr1Var = new fr1();
                fr1Var.e(null, strConcat);
                fr1 fr1VarG = fr1Var.b().g();
                fr1VarG.a("nd_song_id", str);
                gr1 gr1VarB = fr1VarG.b();
                nz3 nz3Var = new nz3();
                nz3Var.a = gr1VarB;
                return new oz3(nz3Var);
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                String strConcat2 = str3.concat("/api/listen");
                fr1 fr1Var2 = new fr1();
                fr1Var2.e(null, strConcat2);
                fr1 fr1VarG2 = fr1Var2.b().g();
                fr1VarG2.a("ref", str);
                gr1 gr1VarB2 = fr1VarG2.b();
                nz3 nz3Var2 = new nz3();
                nz3Var2.a = gr1VarB2;
                return new oz3(nz3Var2);
            case 5:
                qr1 qr1Var = (qr1) obj;
                qr1Var.getClass();
                rr1 rr1Var = rr1.a;
                o83 o83Var = (o83) rr1.f.getValue();
                nz3 nz3Var3 = new nz3();
                nz3Var3.d(qr1Var.a.concat("/api/auth/me"));
                nz3Var3.a("Cookie", qr1Var.b);
                oz3 oz3Var = new oz3(nz3Var3);
                o83Var.getClass();
                k14 k14VarC = new bv3(o83Var, oz3Var).c();
                try {
                    if (!k14VarC.C) {
                        throw rr1.i(k14VarC);
                    }
                    HubMe hubMe = (HubMe) rr1.p(k14VarC, HubMe.class);
                    k14VarC.close();
                    return Boolean.valueOf(h12.c(hubMe.getUsername(), qm4.G0(str, '\n', str)));
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        q05.h(k14VarC, th4);
                        throw th5;
                    }
                }
            case 6:
                q94 q94Var = (q94) obj;
                c42[] c42VarArr = o94.a;
                q94Var.a(n94.a, gb.O(str));
                o94.a(q94Var);
                return j15Var;
            case 7:
                z34 z34VarU4 = ((x34) obj).U("SELECT * FROM internet_radio_station_cache WHERE id = ? LIMIT 1");
                try {
                    if (str == null) {
                        z34VarU4.e(1);
                    } else {
                        z34VarU4.r(1, str);
                    }
                    int iE45 = rr2.E(z34VarU4, "id");
                    int iE46 = rr2.E(z34VarU4, "name");
                    int iE47 = rr2.E(z34VarU4, "stream_url");
                    int iE48 = rr2.E(z34VarU4, "home_page_url");
                    int iE49 = rr2.E(z34VarU4, "source");
                    int iE50 = rr2.E(z34VarU4, "cover_art_url");
                    if (z34VarU4.O()) {
                        internetRadioStationCache = new InternetRadioStationCache(z34VarU4.isNull(iE45) ? null : z34VarU4.D(iE45), z34VarU4.isNull(iE46) ? null : z34VarU4.D(iE46), z34VarU4.isNull(iE47) ? null : z34VarU4.D(iE47), z34VarU4.isNull(iE48) ? null : z34VarU4.D(iE48), z34VarU4.isNull(iE49) ? null : z34VarU4.D(iE49), z34VarU4.isNull(iE50) ? null : z34VarU4.D(iE50));
                    }
                    z34VarU4.close();
                    return internetRadioStationCache;
                } catch (Throwable th6) {
                    z34VarU4.close();
                    throw th6;
                }
            case 8:
                z34 z34VarU5 = ((x34) obj).U("DELETE FROM internet_radio_station_cache WHERE id = ?");
                try {
                    if (str == null) {
                        z34VarU5.e(1);
                    } else {
                        z34VarU5.r(1, str);
                    }
                    z34VarU5.O();
                    z34VarU5.close();
                    return null;
                } catch (Throwable th7) {
                    z34VarU5.close();
                    throw th7;
                }
            case 9:
                z34 z34VarU6 = ((x34) obj).U("SELECT * FROM lyrics_cache WHERE song_id = ?");
                try {
                    if (str == null) {
                        z34VarU6.e(1);
                    } else {
                        z34VarU6.r(1, str);
                    }
                    int iE51 = rr2.E(z34VarU6, "song_id");
                    int iE52 = rr2.E(z34VarU6, "artist");
                    int iE53 = rr2.E(z34VarU6, "title");
                    int iE54 = rr2.E(z34VarU6, "lyrics");
                    int iE55 = rr2.E(z34VarU6, "structured_lyrics");
                    int iE56 = rr2.E(z34VarU6, "updated_at");
                    if (z34VarU6.O()) {
                        internetRadioStationCache = new LyricsCache(z34VarU6.isNull(iE51) ? null : z34VarU6.D(iE51), z34VarU6.isNull(iE52) ? null : z34VarU6.D(iE52), z34VarU6.isNull(iE53) ? null : z34VarU6.D(iE53), z34VarU6.isNull(iE54) ? null : z34VarU6.D(iE54), z34VarU6.isNull(iE55) ? null : z34VarU6.D(iE55), z34VarU6.getLong(iE56));
                    }
                    z34VarU6.close();
                    return internetRadioStationCache;
                } catch (Throwable th8) {
                    z34VarU6.close();
                    throw th8;
                }
            case 10:
                z34 z34VarU7 = ((x34) obj).U("SELECT * FROM lyrics_cache WHERE song_id = ?");
                try {
                    if (str == null) {
                        z34VarU7.e(1);
                    } else {
                        z34VarU7.r(1, str);
                    }
                    int iE57 = rr2.E(z34VarU7, "song_id");
                    int iE58 = rr2.E(z34VarU7, "artist");
                    int iE59 = rr2.E(z34VarU7, "title");
                    int iE60 = rr2.E(z34VarU7, "lyrics");
                    int iE61 = rr2.E(z34VarU7, "structured_lyrics");
                    int iE62 = rr2.E(z34VarU7, "updated_at");
                    if (z34VarU7.O()) {
                        internetRadioStationCache = new LyricsCache(z34VarU7.isNull(iE57) ? null : z34VarU7.D(iE57), z34VarU7.isNull(iE58) ? null : z34VarU7.D(iE58), z34VarU7.isNull(iE59) ? null : z34VarU7.D(iE59), z34VarU7.isNull(iE60) ? null : z34VarU7.D(iE60), z34VarU7.isNull(iE61) ? null : z34VarU7.D(iE61), z34VarU7.getLong(iE62));
                    }
                    z34VarU7.close();
                    return internetRadioStationCache;
                } catch (Throwable th9) {
                    z34VarU7.close();
                    throw th9;
                }
            case 11:
                z34 z34VarU8 = ((x34) obj).U("DELETE FROM pinned_playlist WHERE playlistId = ?");
                try {
                    if (str == null) {
                        z34VarU8.e(1);
                    } else {
                        z34VarU8.r(1, str);
                    }
                    z34VarU8.O();
                    z34VarU8.close();
                    return null;
                } catch (Throwable th10) {
                    z34VarU8.close();
                    throw th10;
                }
            case 12:
                z34 z34VarU9 = ((x34) obj).U("INSERT OR IGNORE INTO pinned_playlist (playlistId) VALUES (?)");
                try {
                    if (str == null) {
                        z34VarU9.e(1);
                    } else {
                        z34VarU9.r(1, str);
                    }
                    z34VarU9.O();
                    z34VarU9.close();
                    return null;
                } catch (Throwable th11) {
                    z34VarU9.close();
                    throw th11;
                }
            case 13:
                return c(obj);
            case 14:
                return b(obj);
            case 15:
                return e(obj);
            case WaveRetry.MAX_FAILURES /* 16 */:
                return f(obj);
            case 17:
                return g(obj);
            case 18:
                c42[] c42VarArr2 = o94.a;
                ((q94) obj).a(n94.a, gb.O(str));
                return j15Var;
            default:
                String str4 = (String) obj;
                str4.getClass();
                if (qm4.u0(str4)) {
                    return str4.length() < str.length() ? str : str4;
                }
                return str.concat(str4);
        }
    }

    public /* synthetic */ rs0(int i, String str) {
        this.n = i;
        this.o = str;
    }
}
