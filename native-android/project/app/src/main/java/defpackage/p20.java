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

    public /* synthetic */ p20(r20 r20Var, long j, long j2, String str) {
        this.n = r20Var;
        this.o = j;
        this.p = j2;
        this.q = str;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        ReplayGainInfo replayGainInfo;
        long j = this.o;
        long j2 = this.p;
        Object obj2 = this.n.q;
        z34 z34VarU = ((x34) obj).U("SELECT * FROM chronology WHERE timestamp >= ? AND timestamp < ? AND server == ? GROUP BY id ORDER BY COUNT(id) DESC LIMIT 20");
        try {
            z34VarU.c(1, j);
            z34VarU.c(2, j2);
            String str = this.q;
            if (str == null) {
                z34VarU.e(3);
            } else {
                z34VarU.r(3, str);
            }
            int iE = rr2.E(z34VarU, "id");
            int iE2 = rr2.E(z34VarU, "timestamp");
            int iE3 = rr2.E(z34VarU, "server");
            int iE4 = rr2.E(z34VarU, "parent_id");
            int iE5 = rr2.E(z34VarU, "is_dir");
            int iE6 = rr2.E(z34VarU, "title");
            int iE7 = rr2.E(z34VarU, "album");
            int iE8 = rr2.E(z34VarU, "artist");
            int iE9 = rr2.E(z34VarU, "track");
            int iE10 = rr2.E(z34VarU, "year");
            int iE11 = rr2.E(z34VarU, "genre");
            int iE12 = rr2.E(z34VarU, "cover_art_id");
            int iE13 = rr2.E(z34VarU, "size");
            int iE14 = rr2.E(z34VarU, "content_type");
            int iE15 = rr2.E(z34VarU, "suffix");
            int iE16 = rr2.E(z34VarU, "transcoding_content_type");
            int iE17 = rr2.E(z34VarU, "transcoded_suffix");
            int iE18 = rr2.E(z34VarU, "duration");
            int iE19 = rr2.E(z34VarU, "bitrate");
            int iE20 = rr2.E(z34VarU, "sampling_rate");
            int iE21 = rr2.E(z34VarU, "bit_depth");
            int iE22 = rr2.E(z34VarU, "path");
            int iE23 = rr2.E(z34VarU, "is_video");
            int iE24 = rr2.E(z34VarU, "user_rating");
            int iE25 = rr2.E(z34VarU, "average_rating");
            int iE26 = rr2.E(z34VarU, "play_count");
            int iE27 = rr2.E(z34VarU, "disc_number");
            int iE28 = rr2.E(z34VarU, "created");
            int iE29 = rr2.E(z34VarU, "starred");
            int iE30 = rr2.E(z34VarU, "album_id");
            int iE31 = rr2.E(z34VarU, "artist_id");
            int iE32 = rr2.E(z34VarU, "type");
            int iE33 = rr2.E(z34VarU, "bookmark_position");
            int iE34 = rr2.E(z34VarU, "original_width");
            int iE35 = rr2.E(z34VarU, "original_height");
            int iE36 = rr2.E(z34VarU, "album_artist");
            int iE37 = rr2.E(z34VarU, "rg_track_gain");
            int i = iE14;
            int iE38 = rr2.E(z34VarU, "rg_album_gain");
            int i2 = iE13;
            int iE39 = rr2.E(z34VarU, "rg_track_peak");
            int i3 = iE12;
            int iE40 = rr2.E(z34VarU, "rg_album_peak");
            int i4 = iE11;
            int iE41 = rr2.E(z34VarU, "rg_base_gain");
            int i5 = iE10;
            int iE42 = rr2.E(z34VarU, "rg_fallback_gain");
            int i6 = iE9;
            ArrayList arrayList = new ArrayList();
            while (z34VarU.O()) {
                String strD = z34VarU.isNull(iE) ? null : z34VarU.D(iE);
                long j3 = z34VarU.getLong(iE2);
                String strD2 = z34VarU.isNull(iE3) ? null : z34VarU.D(iE3);
                if (z34VarU.isNull(iE37) && z34VarU.isNull(iE38) && z34VarU.isNull(iE39) && z34VarU.isNull(iE40) && z34VarU.isNull(iE41) && z34VarU.isNull(iE42)) {
                    iE6 = iE6;
                    iE7 = iE7;
                    replayGainInfo = null;
                } else {
                    replayGainInfo = new ReplayGainInfo(z34VarU.isNull(iE37) ? null : Float.valueOf((float) z34VarU.getDouble(iE37)), z34VarU.isNull(iE38) ? null : Float.valueOf((float) z34VarU.getDouble(iE38)), z34VarU.isNull(iE39) ? null : Float.valueOf((float) z34VarU.getDouble(iE39)), z34VarU.isNull(iE40) ? null : Float.valueOf((float) z34VarU.getDouble(iE40)), z34VarU.isNull(iE41) ? null : Float.valueOf((float) z34VarU.getDouble(iE41)), z34VarU.isNull(iE42) ? null : Float.valueOf((float) z34VarU.getDouble(iE42)));
                }
                Chronology chronology = new Chronology(strD, j3, strD2);
                chronology.setParentId(z34VarU.isNull(iE4) ? null : z34VarU.D(iE4));
                chronology.setDir(((int) z34VarU.getLong(iE5)) != 0);
                int i7 = iE6;
                chronology.setTitle(z34VarU.isNull(i7) ? null : z34VarU.D(i7));
                int i8 = iE7;
                chronology.setAlbum(z34VarU.isNull(i8) ? null : z34VarU.D(i8));
                int i9 = iE8;
                chronology.setArtist(z34VarU.isNull(i9) ? null : z34VarU.D(i9));
                int i10 = i6;
                chronology.setTrack(z34VarU.isNull(i10) ? null : Integer.valueOf((int) z34VarU.getLong(i10)));
                int i11 = i5;
                chronology.setYear(z34VarU.isNull(i11) ? null : Integer.valueOf((int) z34VarU.getLong(i11)));
                i4 = i4;
                chronology.setGenre(z34VarU.isNull(i4) ? null : z34VarU.D(i4));
                int i12 = i3;
                chronology.setCoverArtId(z34VarU.isNull(i12) ? null : z34VarU.D(i12));
                int i13 = i2;
                chronology.setSize(z34VarU.isNull(i13) ? null : Long.valueOf(z34VarU.getLong(i13)));
                int i14 = i;
                chronology.setContentType(z34VarU.isNull(i14) ? null : z34VarU.D(i14));
                iE15 = iE15;
                chronology.setSuffix(z34VarU.isNull(iE15) ? null : z34VarU.D(iE15));
                int i15 = iE16;
                chronology.setTranscodedContentType(z34VarU.isNull(i15) ? null : z34VarU.D(i15));
                iE17 = iE17;
                chronology.setTranscodedSuffix(z34VarU.isNull(iE17) ? null : z34VarU.D(iE17));
                int i16 = iE18;
                chronology.setDuration(z34VarU.isNull(i16) ? null : Integer.valueOf((int) z34VarU.getLong(i16)));
                int i17 = iE19;
                chronology.setBitrate(z34VarU.isNull(i17) ? null : Integer.valueOf((int) z34VarU.getLong(i17)));
                int i18 = iE20;
                chronology.setSamplingRate(z34VarU.isNull(i18) ? null : Integer.valueOf((int) z34VarU.getLong(i18)));
                int i19 = iE21;
                chronology.setBitDepth(z34VarU.isNull(i19) ? null : Integer.valueOf((int) z34VarU.getLong(i19)));
                int i20 = iE22;
                chronology.setPath(z34VarU.isNull(i20) ? null : z34VarU.D(i20));
                int i21 = iE23;
                chronology.setVideo(((int) z34VarU.getLong(i21)) != 0);
                int i22 = iE24;
                chronology.setUserRating(z34VarU.isNull(i22) ? null : Integer.valueOf((int) z34VarU.getLong(i22)));
                iE25 = iE25;
                chronology.setAverageRating(z34VarU.isNull(iE25) ? null : Double.valueOf(z34VarU.getDouble(iE25)));
                int i23 = iE26;
                chronology.setPlayCount(z34VarU.isNull(i23) ? null : Long.valueOf(z34VarU.getLong(i23)));
                int i24 = iE27;
                chronology.setDiscNumber(z34VarU.isNull(i24) ? null : Integer.valueOf((int) z34VarU.getLong(i24)));
                iE28 = iE28;
                chronology.setCreated(i80.B(z34VarU.isNull(iE28) ? null : Long.valueOf(z34VarU.getLong(iE28))));
                int i25 = iE29;
                chronology.setStarred(i80.B(z34VarU.isNull(i25) ? null : Long.valueOf(z34VarU.getLong(i25))));
                iE30 = iE30;
                chronology.setAlbumId(z34VarU.isNull(iE30) ? null : z34VarU.D(iE30));
                iE31 = iE31;
                chronology.setArtistId(z34VarU.isNull(iE31) ? null : z34VarU.D(iE31));
                iE32 = iE32;
                chronology.setType(z34VarU.isNull(iE32) ? null : z34VarU.D(iE32));
                iE33 = iE33;
                chronology.setBookmarkPosition(z34VarU.isNull(iE33) ? null : Long.valueOf(z34VarU.getLong(iE33)));
                int i26 = iE34;
                chronology.setOriginalWidth(z34VarU.isNull(i26) ? null : Integer.valueOf((int) z34VarU.getLong(i26)));
                int i27 = iE35;
                chronology.setOriginalHeight(z34VarU.isNull(i27) ? null : Integer.valueOf((int) z34VarU.getLong(i27)));
                int i28 = iE36;
                chronology.setAlbumArtist(z34VarU.isNull(i28) ? null : z34VarU.D(i28));
                chronology.setReplayGain(replayGainInfo);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(chronology);
                iE36 = i28;
                iE7 = i8;
                iE8 = i9;
                iE6 = i7;
                iE19 = i17;
                iE20 = i18;
                iE21 = i19;
                iE22 = i20;
                iE23 = i21;
                iE24 = i22;
                iE26 = i23;
                iE27 = i24;
                iE29 = i25;
                iE3 = iE3;
                iE34 = i26;
                arrayList = arrayList2;
                i6 = i10;
                iE4 = iE4;
                iE = iE;
                i5 = i11;
                iE16 = i15;
                i = i14;
                i2 = i13;
                i3 = i12;
                iE18 = i16;
                iE35 = i27;
                iE2 = iE2;
            }
            return arrayList;
        } finally {
            z34VarU.close();
        }
    }
}
