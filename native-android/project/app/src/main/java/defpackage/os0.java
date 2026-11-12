package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ss0 o;

    public /* synthetic */ os0(ss0 ss0Var, int i) {
        this.n = i;
        this.o = ss0Var;
    }

    private final Object b(Object obj) throws Exception {
        ReplayGainInfo replayGainInfo;
        Object obj2 = this.o.p;
        z34 z34VarU = ((x34) obj).U("SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, ''), album), album, album_id, disc_number, track ASC");
        try {
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
            int i = iE14;
            int iE40 = rr2.E(z34VarU, "rg_album_gain");
            int i2 = iE13;
            int iE41 = rr2.E(z34VarU, "rg_track_peak");
            int i3 = iE12;
            int iE42 = rr2.E(z34VarU, "rg_album_peak");
            int i4 = iE11;
            int iE43 = rr2.E(z34VarU, "rg_base_gain");
            int i5 = iE10;
            int iE44 = rr2.E(z34VarU, "rg_fallback_gain");
            int i6 = iE9;
            ArrayList arrayList = new ArrayList();
            while (z34VarU.O()) {
                String strD = z34VarU.isNull(iE) ? null : z34VarU.D(iE);
                String strD2 = z34VarU.isNull(iE2) ? null : z34VarU.D(iE2);
                String strD3 = z34VarU.isNull(iE3) ? null : z34VarU.D(iE3);
                int i7 = (int) z34VarU.getLong(iE4);
                String strD4 = z34VarU.isNull(iE5) ? null : z34VarU.D(iE5);
                if (z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42) && z34VarU.isNull(iE43) && z34VarU.isNull(iE44)) {
                    i7 = i7;
                    replayGainInfo = null;
                } else {
                    replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)), z34VarU.isNull(iE43) ? null : Float.valueOf((float) z34VarU.getDouble(iE43)), z34VarU.isNull(iE44) ? null : Float.valueOf((float) z34VarU.getDouble(iE44)));
                }
                Download download = new Download(strD, strD2, strD3, i7, strD4);
                download.setParentId(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                int i8 = iE4;
                int i9 = iE5;
                download.setDir(((int) z34VarU.getLong(iE7)) != 0);
                download.setTitle(z34VarU.isNull(iE8) ? null : z34VarU.D(iE8));
                int i10 = i6;
                download.setAlbum(z34VarU.isNull(i10) ? null : z34VarU.D(i10));
                i5 = i5;
                download.setArtist(z34VarU.isNull(i5) ? null : z34VarU.D(i5));
                int i11 = i4;
                download.setTrack(z34VarU.isNull(i11) ? null : Integer.valueOf((int) z34VarU.getLong(i11)));
                int i12 = i3;
                download.setYear(z34VarU.isNull(i12) ? null : Integer.valueOf((int) z34VarU.getLong(i12)));
                int i13 = i2;
                download.setGenre(z34VarU.isNull(i13) ? null : z34VarU.D(i13));
                int i14 = i;
                download.setCoverArtId(z34VarU.isNull(i14) ? null : z34VarU.D(i14));
                iE15 = iE15;
                download.setSize(z34VarU.isNull(iE15) ? null : Long.valueOf(z34VarU.getLong(iE15)));
                iE16 = iE16;
                download.setContentType(z34VarU.isNull(iE16) ? null : z34VarU.D(iE16));
                int i15 = iE17;
                download.setSuffix(z34VarU.isNull(i15) ? null : z34VarU.D(i15));
                iE18 = iE18;
                download.setTranscodedContentType(z34VarU.isNull(iE18) ? null : z34VarU.D(iE18));
                iE19 = iE19;
                download.setTranscodedSuffix(z34VarU.isNull(iE19) ? null : z34VarU.D(iE19));
                int i16 = iE20;
                download.setDuration(z34VarU.isNull(i16) ? null : Integer.valueOf((int) z34VarU.getLong(i16)));
                int i17 = iE21;
                download.setBitrate(z34VarU.isNull(i17) ? null : Integer.valueOf((int) z34VarU.getLong(i17)));
                int i18 = iE22;
                download.setSamplingRate(z34VarU.isNull(i18) ? null : Integer.valueOf((int) z34VarU.getLong(i18)));
                int i19 = iE23;
                download.setBitDepth(z34VarU.isNull(i19) ? null : Integer.valueOf((int) z34VarU.getLong(i19)));
                int i20 = iE24;
                download.setPath(z34VarU.isNull(i20) ? null : z34VarU.D(i20));
                int i21 = iE25;
                download.setVideo(((int) z34VarU.getLong(i21)) != 0);
                int i22 = iE26;
                download.setUserRating(z34VarU.isNull(i22) ? null : Integer.valueOf((int) z34VarU.getLong(i22)));
                iE27 = iE27;
                download.setAverageRating(z34VarU.isNull(iE27) ? null : Double.valueOf(z34VarU.getDouble(iE27)));
                int i23 = iE28;
                download.setPlayCount(z34VarU.isNull(i23) ? null : Long.valueOf(z34VarU.getLong(i23)));
                int i24 = iE29;
                download.setDiscNumber(z34VarU.isNull(i24) ? null : Integer.valueOf((int) z34VarU.getLong(i24)));
                iE30 = iE30;
                download.setCreated(i80.B(z34VarU.isNull(iE30) ? null : Long.valueOf(z34VarU.getLong(iE30))));
                int i25 = iE31;
                download.setStarred(i80.B(z34VarU.isNull(i25) ? null : Long.valueOf(z34VarU.getLong(i25))));
                iE32 = iE32;
                download.setAlbumId(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                iE33 = iE33;
                download.setArtistId(z34VarU.isNull(iE33) ? null : z34VarU.D(iE33));
                iE34 = iE34;
                download.setType(z34VarU.isNull(iE34) ? null : z34VarU.D(iE34));
                iE35 = iE35;
                download.setBookmarkPosition(z34VarU.isNull(iE35) ? null : Long.valueOf(z34VarU.getLong(iE35)));
                int i26 = iE36;
                download.setOriginalWidth(z34VarU.isNull(i26) ? null : Integer.valueOf((int) z34VarU.getLong(i26)));
                int i27 = iE37;
                download.setOriginalHeight(z34VarU.isNull(i27) ? null : Integer.valueOf((int) z34VarU.getLong(i27)));
                int i28 = iE38;
                download.setAlbumArtist(z34VarU.isNull(i28) ? null : z34VarU.D(i28));
                download.setReplayGain(replayGainInfo);
                arrayList.add(download);
                iE24 = i20;
                iE7 = iE7;
                iE22 = i18;
                iE23 = i19;
                iE38 = i28;
                iE6 = iE6;
                iE2 = iE2;
                iE5 = i9;
                iE3 = iE3;
                i3 = i12;
                iE17 = i15;
                i = i14;
                iE21 = i17;
                iE25 = i21;
                iE26 = i22;
                iE37 = i27;
                iE4 = i8;
                i6 = i10;
                i4 = i11;
                i2 = i13;
                iE20 = i16;
                iE28 = i23;
                iE29 = i24;
                iE31 = i25;
                iE36 = i26;
                iE = iE;
            }
            return arrayList;
        } finally {
            z34VarU.close();
        }
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        ReplayGainInfo replayGainInfo;
        switch (this.n) {
            case 0:
                return b(obj);
            default:
                Object obj2 = this.o.p;
                z34 z34VarU = ((x34) obj).U("SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, ''), album), album, album_id, disc_number, track ASC");
                try {
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
                    int i = iE14;
                    int iE40 = rr2.E(z34VarU, "rg_album_gain");
                    int i2 = iE13;
                    int iE41 = rr2.E(z34VarU, "rg_track_peak");
                    int i3 = iE12;
                    int iE42 = rr2.E(z34VarU, "rg_album_peak");
                    int i4 = iE11;
                    int iE43 = rr2.E(z34VarU, "rg_base_gain");
                    int i5 = iE10;
                    int iE44 = rr2.E(z34VarU, "rg_fallback_gain");
                    int i6 = iE9;
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        String strD = z34VarU.isNull(iE) ? null : z34VarU.D(iE);
                        String strD2 = z34VarU.isNull(iE2) ? null : z34VarU.D(iE2);
                        String strD3 = z34VarU.isNull(iE3) ? null : z34VarU.D(iE3);
                        int i7 = (int) z34VarU.getLong(iE4);
                        String strD4 = z34VarU.isNull(iE5) ? null : z34VarU.D(iE5);
                        if (z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42) && z34VarU.isNull(iE43) && z34VarU.isNull(iE44)) {
                            i7 = i7;
                            replayGainInfo = null;
                        } else {
                            replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)), z34VarU.isNull(iE43) ? null : Float.valueOf((float) z34VarU.getDouble(iE43)), z34VarU.isNull(iE44) ? null : Float.valueOf((float) z34VarU.getDouble(iE44)));
                        }
                        Download download = new Download(strD, strD2, strD3, i7, strD4);
                        download.setParentId(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                        int i8 = iE4;
                        int i9 = iE5;
                        download.setDir(((int) z34VarU.getLong(iE7)) != 0);
                        download.setTitle(z34VarU.isNull(iE8) ? null : z34VarU.D(iE8));
                        int i10 = i6;
                        download.setAlbum(z34VarU.isNull(i10) ? null : z34VarU.D(i10));
                        i5 = i5;
                        download.setArtist(z34VarU.isNull(i5) ? null : z34VarU.D(i5));
                        int i11 = i4;
                        download.setTrack(z34VarU.isNull(i11) ? null : Integer.valueOf((int) z34VarU.getLong(i11)));
                        int i12 = i3;
                        download.setYear(z34VarU.isNull(i12) ? null : Integer.valueOf((int) z34VarU.getLong(i12)));
                        int i13 = i2;
                        download.setGenre(z34VarU.isNull(i13) ? null : z34VarU.D(i13));
                        int i14 = i;
                        download.setCoverArtId(z34VarU.isNull(i14) ? null : z34VarU.D(i14));
                        iE15 = iE15;
                        download.setSize(z34VarU.isNull(iE15) ? null : Long.valueOf(z34VarU.getLong(iE15)));
                        iE16 = iE16;
                        download.setContentType(z34VarU.isNull(iE16) ? null : z34VarU.D(iE16));
                        int i15 = iE17;
                        download.setSuffix(z34VarU.isNull(i15) ? null : z34VarU.D(i15));
                        iE18 = iE18;
                        download.setTranscodedContentType(z34VarU.isNull(iE18) ? null : z34VarU.D(iE18));
                        iE19 = iE19;
                        download.setTranscodedSuffix(z34VarU.isNull(iE19) ? null : z34VarU.D(iE19));
                        int i16 = iE20;
                        download.setDuration(z34VarU.isNull(i16) ? null : Integer.valueOf((int) z34VarU.getLong(i16)));
                        int i17 = iE21;
                        download.setBitrate(z34VarU.isNull(i17) ? null : Integer.valueOf((int) z34VarU.getLong(i17)));
                        int i18 = iE22;
                        download.setSamplingRate(z34VarU.isNull(i18) ? null : Integer.valueOf((int) z34VarU.getLong(i18)));
                        int i19 = iE23;
                        download.setBitDepth(z34VarU.isNull(i19) ? null : Integer.valueOf((int) z34VarU.getLong(i19)));
                        int i20 = iE24;
                        download.setPath(z34VarU.isNull(i20) ? null : z34VarU.D(i20));
                        int i21 = iE25;
                        download.setVideo(((int) z34VarU.getLong(i21)) != 0);
                        int i22 = iE26;
                        download.setUserRating(z34VarU.isNull(i22) ? null : Integer.valueOf((int) z34VarU.getLong(i22)));
                        iE27 = iE27;
                        download.setAverageRating(z34VarU.isNull(iE27) ? null : Double.valueOf(z34VarU.getDouble(iE27)));
                        int i23 = iE28;
                        download.setPlayCount(z34VarU.isNull(i23) ? null : Long.valueOf(z34VarU.getLong(i23)));
                        int i24 = iE29;
                        download.setDiscNumber(z34VarU.isNull(i24) ? null : Integer.valueOf((int) z34VarU.getLong(i24)));
                        iE30 = iE30;
                        download.setCreated(i80.B(z34VarU.isNull(iE30) ? null : Long.valueOf(z34VarU.getLong(iE30))));
                        int i25 = iE31;
                        download.setStarred(i80.B(z34VarU.isNull(i25) ? null : Long.valueOf(z34VarU.getLong(i25))));
                        iE32 = iE32;
                        download.setAlbumId(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                        iE33 = iE33;
                        download.setArtistId(z34VarU.isNull(iE33) ? null : z34VarU.D(iE33));
                        iE34 = iE34;
                        download.setType(z34VarU.isNull(iE34) ? null : z34VarU.D(iE34));
                        iE35 = iE35;
                        download.setBookmarkPosition(z34VarU.isNull(iE35) ? null : Long.valueOf(z34VarU.getLong(iE35)));
                        int i26 = iE36;
                        download.setOriginalWidth(z34VarU.isNull(i26) ? null : Integer.valueOf((int) z34VarU.getLong(i26)));
                        int i27 = iE37;
                        download.setOriginalHeight(z34VarU.isNull(i27) ? null : Integer.valueOf((int) z34VarU.getLong(i27)));
                        int i28 = iE38;
                        download.setAlbumArtist(z34VarU.isNull(i28) ? null : z34VarU.D(i28));
                        download.setReplayGain(replayGainInfo);
                        arrayList.add(download);
                        iE24 = i20;
                        iE7 = iE7;
                        iE22 = i18;
                        iE23 = i19;
                        iE38 = i28;
                        iE6 = iE6;
                        iE2 = iE2;
                        iE5 = i9;
                        iE3 = iE3;
                        i3 = i12;
                        iE17 = i15;
                        i = i14;
                        iE21 = i17;
                        iE25 = i21;
                        iE26 = i22;
                        iE37 = i27;
                        iE4 = i8;
                        i6 = i10;
                        i4 = i11;
                        i2 = i13;
                        iE20 = i16;
                        iE28 = i23;
                        iE29 = i24;
                        iE31 = i25;
                        iE36 = i26;
                        iE = iE;
                        break;
                    }
                    return arrayList;
                } finally {
                    z34VarU.close();
                }
        }
    }
}
