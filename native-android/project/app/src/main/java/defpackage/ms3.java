package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ms3 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ ms3(ns3 ns3Var) {
        this.n = 0;
    }

    private final Object b(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (h12.c(obj, bool)) {
            return new bt4(bt4.c);
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        r54 r54Var = s54.w;
        h12.c(obj3, bool);
        ct4 ct4Var = obj3 != null ? (ct4) r54Var.o.invoke(obj3) : null;
        ct4Var.getClass();
        return new bt4(su3.z(ct4Var.a, fFloatValue));
    }

    private final Object c(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        os4 os4Var = null;
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        xc5 xc5Var = s54.i;
        if (!h12.c(obj3, Boolean.FALSE) && obj3 != null) {
            os4Var = (os4) ((if1) xc5Var.p).invoke(obj3);
        }
        return new gb2(str, os4Var);
    }

    private final Object e(Object obj) {
        if (h12.c(obj, Boolean.FALSE)) {
            return new g83(9205357640488583168L);
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        Float f2 = obj3 != null ? (Float) obj3 : null;
        f2.getClass();
        return new g83((((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32));
    }

    private final Object f(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            xc5 xc5Var = s54.z;
            ud2 ud2Var = null;
            if (!h12.c(obj2, Boolean.FALSE) && obj2 != null) {
                ud2Var = (ud2) ((if1) xc5Var.p).invoke(obj2);
            }
            ud2Var.getClass();
            arrayList.add(ud2Var);
        }
        return new vd2(arrayList);
    }

    private final Object g(Object obj) {
        obj.getClass();
        String str = (String) obj;
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (h12.c(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return new ud2(localeForLanguageTag);
    }

    private final Object h(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        float f = oa2.b;
        r54 r54Var = s54.B;
        Boolean bool = Boolean.FALSE;
        h12.c(obj2, bool);
        oa2 oa2Var = obj2 != null ? (oa2) r54Var.o.invoke(obj2) : null;
        oa2Var.getClass();
        float f2 = oa2Var.a;
        Object obj3 = list.get(1);
        r54 r54Var2 = s54.C;
        h12.c(obj3, bool);
        qa2 qa2Var = obj3 != null ? (qa2) r54Var2.o.invoke(obj3) : null;
        qa2Var.getClass();
        int i = qa2Var.a;
        Object obj4 = list.get(2);
        r54 r54Var3 = s54.D;
        h12.c(obj4, bool);
        pa2 pa2Var = obj4 != null ? (pa2) r54Var3.o.invoke(obj4) : null;
        pa2Var.getClass();
        return new ra2(i, f2, pa2Var.a);
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        ReplayGainInfo replayGainInfo;
        ge geVar;
        switch (this.n) {
            case 0:
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
                        int i9 = iE41;
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
                        iE39 = iE39;
                        iE22 = i20;
                        iE23 = i21;
                        i6 = i11;
                        i5 = i12;
                        iE38 = i30;
                        iE40 = iE40;
                        iE41 = i9;
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
            case 1:
                z34 z34VarU2 = ((x34) obj).U("SELECT search FROM recent_search ORDER BY search DESC");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (z34VarU2.O()) {
                        arrayList3.add(z34VarU2.isNull(0) ? null : z34VarU2.D(0));
                        break;
                    }
                    return arrayList3;
                } finally {
                    z34VarU2.close();
                }
            case 2:
                z34 z34VarU3 = ((x34) obj).U("SELECT search FROM recent_search ORDER BY timestamp DESC");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (z34VarU3.O()) {
                        arrayList4.add(z34VarU3.isNull(0) ? null : z34VarU3.D(0));
                        break;
                    }
                    return arrayList4;
                } finally {
                    z34VarU3.close();
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new w44((Map) obj);
            case 4:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                if1 if1Var = (if1) s54.h.p;
                Boolean bool = Boolean.FALSE;
                ij4 ij4Var = (h12.c(obj2, bool) || obj2 == null) ? null : (ij4) if1Var.invoke(obj2);
                Object obj3 = list.get(1);
                ij4 ij4Var2 = (h12.c(obj3, bool) || obj3 == null) ? null : (ij4) if1Var.invoke(obj3);
                Object obj4 = list.get(2);
                ij4 ij4Var3 = (h12.c(obj4, bool) || obj4 == null) ? null : (ij4) if1Var.invoke(obj4);
                Object obj5 = list.get(3);
                return new os4(ij4Var, ij4Var2, ij4Var3, (h12.c(obj5, bool) || obj5 == null) ? null : (ij4) if1Var.invoke(obj5));
            case 5:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (h12.c(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((if1) s54.a.p).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new he(list3, str);
            case 6:
                obj.getClass();
                return new sr4(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                List list4 = (List) obj;
                return new bs4(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 8:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                ct4[] ct4VarArr = bt4.b;
                if1 if1Var2 = s54.v.o;
                Boolean bool2 = Boolean.FALSE;
                h12.c(obj8, bool2);
                bt4 bt4Var = obj8 != null ? (bt4) if1Var2.invoke(obj8) : null;
                bt4Var.getClass();
                long j3 = bt4Var.a;
                Object obj9 = list5.get(1);
                h12.c(obj9, bool2);
                bt4 bt4Var2 = obj9 != null ? (bt4) if1Var2.invoke(obj9) : null;
                bt4Var2.getClass();
                return new cs4(j3, bt4Var2.a);
            case 9:
                obj.getClass();
                return new gb1(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                return new hr(((Float) obj).floatValue());
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new ss4(l93.c(iIntValue, num2.intValue()));
            case 12:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i32 = x40.h;
                Boolean bool3 = Boolean.FALSE;
                h12.c(obj12, bool3);
                x40 x40Var = obj12 != null ? h12.c(obj12, Boolean.FALSE) ? new x40(x40.g) : new x40(e35.b(((Integer) obj12).intValue())) : null;
                x40Var.getClass();
                long j4 = x40Var.a;
                Object obj13 = list7.get(1);
                r54 r54Var = s54.x;
                h12.c(obj13, bool3);
                g83 g83Var = obj13 != null ? (g83) r54Var.o.invoke(obj13) : null;
                g83Var.getClass();
                long j5 = g83Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new xb4(j4, j5, f.floatValue());
            case 13:
                obj.getClass();
                return new mr4(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                return new hb2(str2, (h12.c(obj16, Boolean.FALSE) || obj16 == null) ? null : (os4) ((if1) s54.i.p).invoke(obj16));
            case 15:
                obj.getClass();
                return new ur4(((Integer) obj).intValue());
            case WaveRetry.MAX_FAILURES /* 16 */:
                obj.getClass();
                return new du1(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList5 = new ArrayList(list9.size());
                int size = list9.size();
                for (int i33 = 0; i33 < size; i33++) {
                    Object obj17 = list9.get(i33);
                    ge geVar2 = (h12.c(obj17, Boolean.FALSE) || obj17 == null) ? null : (ge) ((if1) s54.b.p).invoke(obj17);
                    geVar2.getClass();
                    arrayList5.add(geVar2);
                }
                return arrayList5;
            case 18:
                obj.getClass();
                return new eb1(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new fb1(((Integer) obj).intValue());
            case 20:
                return b(obj);
            case 21:
                if (h12.c(obj, 0)) {
                    return new ct4(8589934592L);
                }
                return h12.c(obj, 1) ? new ct4(4294967296L) : new ct4(0L);
            case 22:
                return e(obj);
            case 23:
                return f(obj);
            case 24:
                return g(obj);
            case 25:
                return c(obj);
            case 26:
                return h(obj);
            case 27:
                obj.getClass();
                float fFloatValue = ((Float) obj).floatValue();
                oa2.a(fFloatValue);
                return new oa2(fFloatValue);
            case 28:
                obj.getClass();
                return new qa2(((Integer) obj).intValue());
            default:
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                je jeVar = obj18 != null ? (je) obj18 : null;
                jeVar.getClass();
                Object obj19 = list10.get(2);
                Integer num3 = obj19 != null ? (Integer) obj19 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj20 = list10.get(3);
                Integer num4 = obj20 != null ? (Integer) obj20 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj21 = list10.get(4);
                String str3 = obj21 != null ? (String) obj21 : null;
                str3.getClass();
                switch (jeVar.ordinal()) {
                    case 0:
                        Object obj22 = list10.get(1);
                        sd3 sd3Var = (h12.c(obj22, Boolean.FALSE) || obj22 == null) ? null : (sd3) ((if1) s54.g.p).invoke(obj22);
                        sd3Var.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, sd3Var, str3);
                        break;
                    case 1:
                        Object obj23 = list10.get(1);
                        ij4 ij4Var4 = (h12.c(obj23, Boolean.FALSE) || obj23 == null) ? null : (ij4) ((if1) s54.h.p).invoke(obj23);
                        ij4Var4.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, ij4Var4, str3);
                        break;
                    case 2:
                        Object obj24 = list10.get(1);
                        p45 p45Var = (h12.c(obj24, Boolean.FALSE) || obj24 == null) ? null : (p45) ((if1) s54.c.p).invoke(obj24);
                        p45Var.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, p45Var, str3);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        Object obj25 = list10.get(1);
                        v25 v25Var = (h12.c(obj25, Boolean.FALSE) || obj25 == null) ? null : (v25) ((if1) s54.d.p).invoke(obj25);
                        v25Var.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, v25Var, str3);
                        break;
                    case 4:
                        Object obj26 = list10.get(1);
                        hb2 hb2Var = (h12.c(obj26, Boolean.FALSE) || obj26 == null) ? null : (hb2) ((if1) s54.e.p).invoke(obj26);
                        hb2Var.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, hb2Var, str3);
                        break;
                    case 5:
                        Object obj27 = list10.get(1);
                        gb2 gb2Var = (h12.c(obj27, Boolean.FALSE) || obj27 == null) ? null : (gb2) ((if1) s54.f.p).invoke(obj27);
                        gb2Var.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, gb2Var, str3);
                        break;
                    case 6:
                        Object obj28 = list10.get(1);
                        String str4 = obj28 != null ? (String) obj28 : null;
                        str4.getClass();
                        geVar = new ge(iIntValue2, iIntValue3, new om4(str4), str3);
                        break;
                    default:
                        er1.n();
                        return null;
                }
                return geVar;
        }
    }

    public /* synthetic */ ms3(int i) {
        this.n = i;
    }
}
