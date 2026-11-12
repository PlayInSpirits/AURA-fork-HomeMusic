package defpackage;

import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ns3 o;

    public /* synthetic */ ks3(ns3 ns3Var, int i) {
        this.n = i;
        this.o = ns3Var;
    }

    private final Object b(Object obj) throws Exception {
        ReplayGainInfo replayGainInfo;
        Object obj2 = this.o.q;
        z34 z34VarU = ((x34) obj).U("SELECT * FROM queue ORDER BY last_play DESC LIMIT 1");
        try {
            int iE = rr2.E(z34VarU, "id");
            int iE2 = rr2.E(z34VarU, "track_order");
            int iE3 = rr2.E(z34VarU, "last_play");
            int iE4 = rr2.E(z34VarU, "playing_changed");
            int iE5 = rr2.E(z34VarU, "stream_id");
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
            Queue queue = null;
            if (z34VarU.O()) {
                String strD = z34VarU.isNull(iE) ? null : z34VarU.D(iE);
                int i = (int) z34VarU.getLong(iE2);
                long j = z34VarU.getLong(iE3);
                long j2 = z34VarU.getLong(iE4);
                String strD2 = z34VarU.isNull(iE5) ? null : z34VarU.D(iE5);
                if (z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42) && z34VarU.isNull(iE43) && z34VarU.isNull(iE44)) {
                    replayGainInfo = null;
                } else {
                    replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)), z34VarU.isNull(iE43) ? null : Float.valueOf((float) z34VarU.getDouble(iE43)), z34VarU.isNull(iE44) ? null : Float.valueOf((float) z34VarU.getDouble(iE44)));
                }
                Queue queue2 = new Queue(strD, i, j, j2, strD2);
                queue2.setParentId(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                queue2.setDir(((int) z34VarU.getLong(iE7)) != 0);
                queue2.setTitle(z34VarU.isNull(iE8) ? null : z34VarU.D(iE8));
                queue2.setAlbum(z34VarU.isNull(iE9) ? null : z34VarU.D(iE9));
                queue2.setArtist(z34VarU.isNull(iE10) ? null : z34VarU.D(iE10));
                queue2.setTrack(z34VarU.isNull(iE11) ? null : Integer.valueOf((int) z34VarU.getLong(iE11)));
                queue2.setYear(z34VarU.isNull(iE12) ? null : Integer.valueOf((int) z34VarU.getLong(iE12)));
                queue2.setGenre(z34VarU.isNull(iE13) ? null : z34VarU.D(iE13));
                queue2.setCoverArtId(z34VarU.isNull(iE14) ? null : z34VarU.D(iE14));
                queue2.setSize(z34VarU.isNull(iE15) ? null : Long.valueOf(z34VarU.getLong(iE15)));
                queue2.setContentType(z34VarU.isNull(iE16) ? null : z34VarU.D(iE16));
                queue2.setSuffix(z34VarU.isNull(iE17) ? null : z34VarU.D(iE17));
                queue2.setTranscodedContentType(z34VarU.isNull(iE18) ? null : z34VarU.D(iE18));
                queue2.setTranscodedSuffix(z34VarU.isNull(iE19) ? null : z34VarU.D(iE19));
                queue2.setDuration(z34VarU.isNull(iE20) ? null : Integer.valueOf((int) z34VarU.getLong(iE20)));
                queue2.setBitrate(z34VarU.isNull(iE21) ? null : Integer.valueOf((int) z34VarU.getLong(iE21)));
                queue2.setSamplingRate(z34VarU.isNull(iE22) ? null : Integer.valueOf((int) z34VarU.getLong(iE22)));
                queue2.setBitDepth(z34VarU.isNull(iE23) ? null : Integer.valueOf((int) z34VarU.getLong(iE23)));
                queue2.setPath(z34VarU.isNull(iE24) ? null : z34VarU.D(iE24));
                queue2.setVideo(((int) z34VarU.getLong(iE25)) != 0);
                queue2.setUserRating(z34VarU.isNull(iE26) ? null : Integer.valueOf((int) z34VarU.getLong(iE26)));
                queue2.setAverageRating(z34VarU.isNull(iE27) ? null : Double.valueOf(z34VarU.getDouble(iE27)));
                queue2.setPlayCount(z34VarU.isNull(iE28) ? null : Long.valueOf(z34VarU.getLong(iE28)));
                queue2.setDiscNumber(z34VarU.isNull(iE29) ? null : Integer.valueOf((int) z34VarU.getLong(iE29)));
                queue2.setCreated(i80.B(z34VarU.isNull(iE30) ? null : Long.valueOf(z34VarU.getLong(iE30))));
                queue2.setStarred(i80.B(z34VarU.isNull(iE31) ? null : Long.valueOf(z34VarU.getLong(iE31))));
                queue2.setAlbumId(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                queue2.setArtistId(z34VarU.isNull(iE33) ? null : z34VarU.D(iE33));
                queue2.setType(z34VarU.isNull(iE34) ? null : z34VarU.D(iE34));
                queue2.setBookmarkPosition(z34VarU.isNull(iE35) ? null : Long.valueOf(z34VarU.getLong(iE35)));
                queue2.setOriginalWidth(z34VarU.isNull(iE36) ? null : Integer.valueOf((int) z34VarU.getLong(iE36)));
                queue2.setOriginalHeight(z34VarU.isNull(iE37) ? null : Integer.valueOf((int) z34VarU.getLong(iE37)));
                queue2.setAlbumArtist(z34VarU.isNull(iE38) ? null : z34VarU.D(iE38));
                queue2.setReplayGain(replayGainInfo);
                queue = queue2;
            }
            return queue;
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
                Object obj2 = this.o.q;
                z34 z34VarU = ((x34) obj).U("SELECT * FROM queue ORDER BY track_order ASC");
                try {
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "track_order");
                    int iE3 = rr2.E(z34VarU, "last_play");
                    int iE4 = rr2.E(z34VarU, "playing_changed");
                    int iE5 = rr2.E(z34VarU, "stream_id");
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
                        int i7 = (int) z34VarU.getLong(iE2);
                        long j = z34VarU.getLong(iE3);
                        long j2 = z34VarU.getLong(iE4);
                        String strD2 = z34VarU.isNull(iE5) ? null : z34VarU.D(iE5);
                        if (z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42) && z34VarU.isNull(iE43) && z34VarU.isNull(iE44)) {
                            iE2 = iE2;
                            iE3 = iE3;
                            replayGainInfo = null;
                        } else {
                            replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)), z34VarU.isNull(iE43) ? null : Float.valueOf((float) z34VarU.getDouble(iE43)), z34VarU.isNull(iE44) ? null : Float.valueOf((float) z34VarU.getDouble(iE44)));
                        }
                        Queue queue = new Queue(strD, i7, j, j2, strD2);
                        queue.setParentId(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                        int i8 = iE4;
                        int i9 = iE5;
                        queue.setDir(((int) z34VarU.getLong(iE7)) != 0);
                        int i10 = iE8;
                        queue.setTitle(z34VarU.isNull(i10) ? null : z34VarU.D(i10));
                        int i11 = i6;
                        queue.setAlbum(z34VarU.isNull(i11) ? null : z34VarU.D(i11));
                        int i12 = i5;
                        queue.setArtist(z34VarU.isNull(i12) ? null : z34VarU.D(i12));
                        int i13 = i4;
                        queue.setTrack(z34VarU.isNull(i13) ? null : Integer.valueOf((int) z34VarU.getLong(i13)));
                        int i14 = i3;
                        queue.setYear(z34VarU.isNull(i14) ? null : Integer.valueOf((int) z34VarU.getLong(i14)));
                        int i15 = i2;
                        queue.setGenre(z34VarU.isNull(i15) ? null : z34VarU.D(i15));
                        int i16 = i;
                        queue.setCoverArtId(z34VarU.isNull(i16) ? null : z34VarU.D(i16));
                        iE15 = iE15;
                        queue.setSize(z34VarU.isNull(iE15) ? null : Long.valueOf(z34VarU.getLong(iE15)));
                        iE16 = iE16;
                        queue.setContentType(z34VarU.isNull(iE16) ? null : z34VarU.D(iE16));
                        int i17 = iE17;
                        queue.setSuffix(z34VarU.isNull(i17) ? null : z34VarU.D(i17));
                        iE18 = iE18;
                        queue.setTranscodedContentType(z34VarU.isNull(iE18) ? null : z34VarU.D(iE18));
                        iE19 = iE19;
                        queue.setTranscodedSuffix(z34VarU.isNull(iE19) ? null : z34VarU.D(iE19));
                        int i18 = iE20;
                        queue.setDuration(z34VarU.isNull(i18) ? null : Integer.valueOf((int) z34VarU.getLong(i18)));
                        int i19 = iE21;
                        queue.setBitrate(z34VarU.isNull(i19) ? null : Integer.valueOf((int) z34VarU.getLong(i19)));
                        int i20 = iE22;
                        queue.setSamplingRate(z34VarU.isNull(i20) ? null : Integer.valueOf((int) z34VarU.getLong(i20)));
                        int i21 = iE23;
                        queue.setBitDepth(z34VarU.isNull(i21) ? null : Integer.valueOf((int) z34VarU.getLong(i21)));
                        int i22 = iE24;
                        queue.setPath(z34VarU.isNull(i22) ? null : z34VarU.D(i22));
                        int i23 = iE25;
                        queue.setVideo(((int) z34VarU.getLong(i23)) != 0);
                        int i24 = iE26;
                        queue.setUserRating(z34VarU.isNull(i24) ? null : Integer.valueOf((int) z34VarU.getLong(i24)));
                        iE27 = iE27;
                        queue.setAverageRating(z34VarU.isNull(iE27) ? null : Double.valueOf(z34VarU.getDouble(iE27)));
                        int i25 = iE28;
                        queue.setPlayCount(z34VarU.isNull(i25) ? null : Long.valueOf(z34VarU.getLong(i25)));
                        int i26 = iE29;
                        queue.setDiscNumber(z34VarU.isNull(i26) ? null : Integer.valueOf((int) z34VarU.getLong(i26)));
                        iE30 = iE30;
                        queue.setCreated(i80.B(z34VarU.isNull(iE30) ? null : Long.valueOf(z34VarU.getLong(iE30))));
                        int i27 = iE31;
                        queue.setStarred(i80.B(z34VarU.isNull(i27) ? null : Long.valueOf(z34VarU.getLong(i27))));
                        iE32 = iE32;
                        queue.setAlbumId(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                        iE33 = iE33;
                        queue.setArtistId(z34VarU.isNull(iE33) ? null : z34VarU.D(iE33));
                        iE34 = iE34;
                        queue.setType(z34VarU.isNull(iE34) ? null : z34VarU.D(iE34));
                        iE35 = iE35;
                        queue.setBookmarkPosition(z34VarU.isNull(iE35) ? null : Long.valueOf(z34VarU.getLong(iE35)));
                        int i28 = iE36;
                        queue.setOriginalWidth(z34VarU.isNull(i28) ? null : Integer.valueOf((int) z34VarU.getLong(i28)));
                        int i29 = iE37;
                        queue.setOriginalHeight(z34VarU.isNull(i29) ? null : Integer.valueOf((int) z34VarU.getLong(i29)));
                        int i30 = iE38;
                        queue.setAlbumArtist(z34VarU.isNull(i30) ? null : z34VarU.D(i30));
                        queue.setReplayGain(replayGainInfo);
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(queue);
                        int i31 = iE2;
                        arrayList = arrayList2;
                        iE2 = i31;
                        iE24 = i22;
                        iE7 = iE7;
                        iE22 = i20;
                        iE23 = i21;
                        i6 = i11;
                        i5 = i12;
                        iE38 = i30;
                        iE6 = iE6;
                        iE5 = i9;
                        iE3 = iE3;
                        i3 = i14;
                        iE17 = i17;
                        i = i16;
                        iE21 = i19;
                        iE25 = i23;
                        iE26 = i24;
                        iE37 = i29;
                        iE4 = i8;
                        iE8 = i10;
                        i4 = i13;
                        i2 = i15;
                        iE20 = i18;
                        iE28 = i25;
                        iE29 = i26;
                        iE31 = i27;
                        iE36 = i28;
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
