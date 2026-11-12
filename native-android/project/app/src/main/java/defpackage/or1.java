package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubDownloadItem;
import com.eddyizm.tempus.homemusic.HubLikedSongs;
import com.eddyizm.tempus.homemusic.HubMe;
import com.eddyizm.tempus.homemusic.HubMixToday;
import com.eddyizm.tempus.homemusic.HubPlayEventsResult;
import com.eddyizm.tempus.homemusic.HubTrackSource;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.SmartAddOut;
import com.eddyizm.tempus.homemusic.SmartOut;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import java.io.File;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or1 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ or1(int i) {
        this.n = i;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        switch (this.n) {
            case 0:
                String str = (String) obj;
                nz3 nz3VarF = b11.f(str);
                nz3VarF.d(str.concat("/api/mixes/today"));
                return new oz3(nz3VarF);
            case 1:
                k14 k14Var = (k14) obj;
                k14Var.getClass();
                rr1 rr1Var = rr1.a;
                return (HubMixToday) rr1.p(k14Var, HubMixToday.class);
            case 2:
                ((k14) obj).getClass();
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                k14 k14Var2 = (k14) obj;
                k14Var2.getClass();
                rr1 rr1Var2 = rr1.a;
                return (WaveOut) rr1.p(k14Var2, WaveOut.class);
            case 4:
                k14 k14Var3 = (k14) obj;
                k14Var3.getClass();
                rr1 rr1Var3 = rr1.a;
                return (SmartOut) rr1.p(k14Var3, SmartOut.class);
            case 5:
                k14 k14Var4 = (k14) obj;
                k14Var4.getClass();
                rr1 rr1Var4 = rr1.a;
                return (WaveOut) rr1.p(k14Var4, WaveOut.class);
            case 6:
                String str2 = (String) obj;
                nz3 nz3VarF2 = b11.f(str2);
                nz3VarF2.d(str2.concat("/api/nd/liked"));
                return new oz3(nz3VarF2);
            case 7:
                k14 k14Var5 = (k14) obj;
                k14Var5.getClass();
                rr1 rr1Var5 = rr1.a;
                return (HubLikedSongs) rr1.p(k14Var5, HubLikedSongs.class);
            case 8:
                k14 k14Var6 = (k14) obj;
                k14Var6.getClass();
                rr1 rr1Var6 = rr1.a;
                return (HubMe) rr1.p(k14Var6, HubMe.class);
            case 9:
                ((k14) obj).getClass();
                return j15.a;
            case 10:
                String str3 = (String) obj;
                nz3 nz3VarF3 = b11.f(str3);
                nz3VarF3.d(str3.concat("/api/auth/google/link"));
                nz3VarF3.b("DELETE", xe5.d);
                return new oz3(nz3VarF3);
            case 11:
                k14 k14Var7 = (k14) obj;
                k14Var7.getClass();
                rr1 rr1Var7 = rr1.a;
                return (HubMe) rr1.p(k14Var7, HubMe.class);
            case 12:
                k14 k14Var8 = (k14) obj;
                k14Var8.getClass();
                rr1 rr1Var8 = rr1.a;
                rr1.p(k14Var8, vr1.class);
                throw new ClassCastException();
            case 13:
                k14 k14Var9 = (k14) obj;
                k14Var9.getClass();
                rr1 rr1Var9 = rr1.a;
                return (HubTrackSource) rr1.p(k14Var9, HubTrackSource.class);
            case 14:
                k14 k14Var10 = (k14) obj;
                k14Var10.getClass();
                rr1 rr1Var10 = rr1.a;
                return (HubTrackSource) rr1.p(k14Var10, HubTrackSource.class);
            case 15:
                k14 k14Var11 = (k14) obj;
                k14Var11.getClass();
                rr1 rr1Var11 = rr1.a;
                return (SmartAddOut) rr1.p(k14Var11, SmartAddOut.class);
            case WaveRetry.MAX_FAILURES /* 16 */:
                ((k14) obj).getClass();
                return j15.a;
            case 17:
                k14 k14Var12 = (k14) obj;
                k14Var12.getClass();
                rr1 rr1Var12 = rr1.a;
                return (SmartOut) rr1.p(k14Var12, SmartOut.class);
            case 18:
                String str4 = (String) obj;
                nz3 nz3VarF4 = b11.f(str4);
                nz3VarF4.d(str4.concat("/api/downloads?limit=200"));
                return new oz3(nz3VarF4);
            case 19:
                ((k14) obj).getClass();
                return j15.a;
            case 20:
                k14 k14Var13 = (k14) obj;
                k14Var13.getClass();
                rr1 rr1Var13 = rr1.a;
                return rr1.q(k14Var13, HubDownloadItem.class);
            case 21:
                k14 k14Var14 = (k14) obj;
                k14Var14.getClass();
                rr1 rr1Var14 = rr1.a;
                return (HubPlayEventsResult) rr1.p(k14Var14, HubPlayEventsResult.class);
            case 22:
                String str5 = (String) obj;
                nz3 nz3VarF5 = b11.f(str5);
                nz3VarF5.d(str5.concat("/api/starred"));
                return new oz3(nz3VarF5);
            case 23:
                PlayEvent playEvent = (PlayEvent) obj;
                playEvent.getClass();
                rs1 rs1Var = rs1.a;
                lh3 lh3Var = (lh3) rs1.b.getValue();
                synchronized (lh3Var) {
                    ArrayList arrayList = new ArrayList(lh3Var.a());
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                if (h12.c(((PlayEvent) obj2).getEventId(), playEvent.getEventId())) {
                                }
                            }
                        }
                    }
                    if (h12.c(playEvent.getKind(), "progress") && playEvent.getPlaybackId() != null && playEvent.getDeviceId() != null && playEvent.getListenedMs() != null) {
                        v40.p0(arrayList, new x(28, playEvent));
                    }
                    arrayList.add(playEvent);
                    lh3Var.d(arrayList);
                    lh3Var.c = arrayList;
                }
                rs1 rs1Var2 = rs1.a;
                String playbackId = playEvent.getPlaybackId();
                if (playbackId != null) {
                    File file = new File(App.a().getFilesDir(), "homemusic-open-plays");
                    if (!file.exists() && !file.mkdirs()) {
                        kf2.o("Check failed.");
                        return null;
                    }
                    File file2 = new File(file, playbackId.concat(".json"));
                    if (h12.c(playEvent.getKind(), PlayEvent.START) || h12.c(playEvent.getKind(), "progress")) {
                        File file3 = new File(file, playbackId.concat(".tmp"));
                        String strJ = rr1.c.j(playEvent);
                        strJ.getClass();
                        ji2.U(file3, strJ);
                        if (!file3.renameTo(file2)) {
                            ji2.U(file2, ji2.H(file3));
                            file3.delete();
                        }
                    } else if (ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, "interrupted", "error"}).contains(playEvent.getKind()) && !file2.delete() && file2.exists()) {
                        kf2.o("Check failed.");
                        return null;
                    }
                }
                return j15.a;
            case 24:
                return j15.a;
            case 25:
                z34 z34VarU = ((x34) obj).U("SELECT * FROM internet_radio_station_cache");
                try {
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "name");
                    int iE3 = rr2.E(z34VarU, "stream_url");
                    int iE4 = rr2.E(z34VarU, "home_page_url");
                    int iE5 = rr2.E(z34VarU, "source");
                    int iE6 = rr2.E(z34VarU, "cover_art_url");
                    ArrayList arrayList2 = new ArrayList();
                    while (z34VarU.O()) {
                        arrayList2.add(new InternetRadioStationCache(z34VarU.isNull(iE) ? null : z34VarU.D(iE), z34VarU.isNull(iE2) ? null : z34VarU.D(iE2), z34VarU.isNull(iE3) ? null : z34VarU.D(iE3), z34VarU.isNull(iE4) ? null : z34VarU.D(iE4), z34VarU.isNull(iE5) ? null : z34VarU.D(iE5), z34VarU.isNull(iE6) ? null : z34VarU.D(iE6)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    z34VarU.close();
                }
            case 26:
                z34 z34VarU2 = ((x34) obj).U("SELECT * FROM internet_radio_station_cache WHERE source = 'local'");
                try {
                    int iE7 = rr2.E(z34VarU2, "id");
                    int iE8 = rr2.E(z34VarU2, "name");
                    int iE9 = rr2.E(z34VarU2, "stream_url");
                    int iE10 = rr2.E(z34VarU2, "home_page_url");
                    int iE11 = rr2.E(z34VarU2, "source");
                    int iE12 = rr2.E(z34VarU2, "cover_art_url");
                    ArrayList arrayList3 = new ArrayList();
                    while (z34VarU2.O()) {
                        arrayList3.add(new InternetRadioStationCache(z34VarU2.isNull(iE7) ? null : z34VarU2.D(iE7), z34VarU2.isNull(iE8) ? null : z34VarU2.D(iE8), z34VarU2.isNull(iE9) ? null : z34VarU2.D(iE9), z34VarU2.isNull(iE10) ? null : z34VarU2.D(iE10), z34VarU2.isNull(iE11) ? null : z34VarU2.D(iE11), z34VarU2.isNull(iE12) ? null : z34VarU2.D(iE12)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    z34VarU2.close();
                }
            case 27:
                z34 z34VarU3 = ((x34) obj).U("DELETE FROM internet_radio_station_cache WHERE source = 'subsonic'");
                try {
                    z34VarU3.O();
                    return null;
                } finally {
                    z34VarU3.close();
                }
            case 28:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                return th2.getClass().getSimpleName();
        }
    }
}
