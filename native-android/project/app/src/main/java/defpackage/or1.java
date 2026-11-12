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
import com.eddyizm.tempus.model.InternetRadioStationCache;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or1 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ or1(int r1) {
        this.n = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r18) {
        switch(this.n) {
            case 0: goto L186;
            case 1: goto L184;
            case 2: goto L182;
            case 3: goto L180;
            case 4: goto L178;
            case 5: goto L176;
            case 6: goto L174;
            case 7: goto L172;
            case 8: goto L170;
            case 9: goto L168;
            case 10: goto L166;
            case 11: goto L164;
            case 12: goto L162;
            case 13: goto L160;
            case 14: goto L158;
            case 15: goto L156;
            case 16: goto L154;
            case 17: goto L152;
            case 18: goto L150;
            case 19: goto L148;
            case 20: goto L146;
            case 21: goto L144;
            case 22: goto L142;
            case 23: goto L89;
            case 24: goto L87;
            case 25: goto L51;
            case 26: goto L15;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        Throwable r0 = (Throwable) r18;
        r0.getClass();
        return r0.getClass().getSimpleName();
    L6:
        Throwable r1 = (Throwable) r18;
        r1.getClass();
        return r1.getCause();
    L8:
        z34 r2 = ((x34) r18).U("DELETE FROM internet_radio_station_cache WHERE source = 'subsonic'");
        r2.O();     // Catch: Throwable -> L12
        r2.close();
        return null;
    L12:
        th = move-exception;
        r2.close();
        throw th;
    L15:
        z34 r3 = ((x34) r18).U("SELECT * FROM internet_radio_station_cache WHERE source = 'local'");
        int r4 = rr2.E(r3, "id");     // Catch: Throwable -> L45
        int r5 = rr2.E(r3, "name");     // Catch: Throwable -> L45
        int r6 = rr2.E(r3, "stream_url");     // Catch: Throwable -> L45
        int r7 = rr2.E(r3, "home_page_url");     // Catch: Throwable -> L45
        int r8 = rr2.E(r3, "source");     // Catch: Throwable -> L45
        int r9 = rr2.E(r3, "cover_art_url");     // Catch: Throwable -> L45
        ArrayList r10 = new ArrayList();     // Catch: Throwable -> L45
    L17:
        if (r3.O() == false) goto L47;
        if (r3.isNull(r4) == false) goto L22;
        String r11 = null;
    L24:
        if (r3.isNull(r5) == false) goto L26;
        String r12 = null;
    L28:
        if (r3.isNull(r6) == false) goto L30;
        String r13 = null;
    L32:
        if (r3.isNull(r7) == false) goto L34;
        String r14 = null;
    L36:
        if (r3.isNull(r8) == false) goto L38;
        String r15 = null;
    L40:
        if (r3.isNull(r9) == false) goto L42;
        String r16 = null;
    L43:
        r10.add(new InternetRadioStationCache(r11, r12, r13, r14, r15, r16));     // Catch: Throwable -> L45
        goto L17
    L42:
        r16 = r3.D(r9);     // Catch: Throwable -> L45
        goto L43
    L38:
        r15 = r3.D(r8);     // Catch: Throwable -> L45
        goto L40
    L34:
        r14 = r3.D(r7);     // Catch: Throwable -> L45
        goto L36
    L30:
        r13 = r3.D(r6);     // Catch: Throwable -> L45
        goto L32
    L26:
        r12 = r3.D(r5);     // Catch: Throwable -> L45
        goto L28
    L22:
        r11 = r3.D(r4);     // Catch: Throwable -> L45
        goto L24
    L47:
        r3.close();
        return r10;
    L45:
        th = move-exception;
        r3.close();
        throw th;
    L51:
        z34 r17 = ((x34) r18).U("SELECT * FROM internet_radio_station_cache");
        int r19 = rr2.E(r17, "id");     // Catch: Throwable -> L81
        int r20 = rr2.E(r17, "name");     // Catch: Throwable -> L81
        int r21 = rr2.E(r17, "stream_url");     // Catch: Throwable -> L81
        int r22 = rr2.E(r17, "home_page_url");     // Catch: Throwable -> L81
        int r23 = rr2.E(r17, "source");     // Catch: Throwable -> L81
        int r24 = rr2.E(r17, "cover_art_url");     // Catch: Throwable -> L81
        ArrayList r25 = new ArrayList();     // Catch: Throwable -> L81
    L53:
        if (r17.O() == false) goto L83;
        if (r17.isNull(r19) == false) goto L58;
        String r110 = null;
    L60:
        if (r17.isNull(r20) == false) goto L62;
        String r111 = null;
    L64:
        if (r17.isNull(r21) == false) goto L66;
        String r112 = null;
    L68:
        if (r17.isNull(r22) == false) goto L70;
        String r113 = null;
    L72:
        if (r17.isNull(r23) == false) goto L74;
        String r114 = null;
    L76:
        if (r17.isNull(r24) == false) goto L78;
        String r115 = null;
    L79:
        r25.add(new InternetRadioStationCache(r110, r111, r112, r113, r114, r115));     // Catch: Throwable -> L81
        goto L53
    L78:
        r115 = r17.D(r24);     // Catch: Throwable -> L81
        goto L79
    L74:
        r114 = r17.D(r23);     // Catch: Throwable -> L81
        goto L76
    L70:
        r113 = r17.D(r22);     // Catch: Throwable -> L81
        goto L72
    L66:
        r112 = r17.D(r21);     // Catch: Throwable -> L81
        goto L68
    L62:
        r111 = r17.D(r20);     // Catch: Throwable -> L81
        goto L64
    L58:
        r110 = r17.D(r19);     // Catch: Throwable -> L81
        goto L60
    L83:
        r17.close();
        return r25;
    L81:
        th = move-exception;
        r17.close();
        throw th;
    L87:
        ig3 r26 = (ig3) r18;
        return j15.a;
    L89:
        PlayEvent r27 = (PlayEvent) r18;
        r27.getClass();
        rs1 r28 = rs1.a;
        lh3 r29 = (lh3) rs1.b.getValue();
        monitor-enter(r29);
        ArrayList r30 = new ArrayList(r29.a());     // Catch: Throwable -> L100
        if (r30.isEmpty() == true) goto L103;
        int r31 = r30.size();     // Catch: Throwable -> L100
        int r32 = 0;
    L95:
        if (r32 >= r31) goto L103;
        Object r33 = r30.get(r32);     // Catch: Throwable -> L100
        r32 = r32 + 1;     // Catch: Throwable -> L100
        if (h12.c(((PlayEvent) r33).getEventId(), r27.getEventId()) == false) goto L95;
        monitor-exit(r29);
    L113:
        rs1 r34 = rs1.a;
        String r35 = r27.getPlaybackId();
        if (r35 == null) goto L139;
        File r36 = new File(App.a().getFilesDir(), "homemusic-open-plays");
        if (r36.exists() == false) goto L119;
    L122:
        File r37 = new File(r36, r35.concat(".json"));
        if (h12.c(r27.getKind(), PlayEvent.START) == false) goto L125;
    L135:
        File r38 = new File(r36, r35.concat(".tmp"));
        String r39 = rr1.c.j(r27);
        r39.getClass();
        ji2.U(r38, r39);
        if (r38.renameTo(r37) == true) goto L139;
        ji2.U(r37, ji2.H(r38));
        r38.delete();
        goto L139
    L125:
        if (h12.c(r27.getKind(), "progress") == true) goto L135;
        if (ti.t0(new String[]{PlayEvent.SKIP, PlayEvent.FINISH, "interrupted", "error"}).contains(r27.getKind()) == false) goto L139;
        if (r37.delete() == true) goto L139;
        if (r37.exists() == false) goto L139;
        kf2.o("Check failed.");
        return null;
    L119:
        if (r36.mkdirs() == true) goto L122;
        kf2.o("Check failed.");
        return null;
    L139:
        return j15.a;
    L103:
        if (h12.c(r27.getKind(), "progress") == true) goto L105;
    L111:
        r30.add(r27);     // Catch: Throwable -> L100
        r29.d(r30);     // Catch: Throwable -> L100
        r29.c = r30;     // Catch: Throwable -> L100
        monitor-exit(r29);
        goto L113
    L105:
        if (r27.getPlaybackId() == null) goto L111;
        if (r27.getDeviceId() == null) goto L111;
        if (r27.getListenedMs() == null) goto L111;
        v40.p0(r30, new x(28, r27));     // Catch: Throwable -> L100
    L100:
        th = move-exception;
        throw th;
    L142:
        String r40 = (String) r18;
        nz3 r41 = b11.f(r40);
        r41.d(r40.concat("/api/starred"));
        return new oz3(r41);
    L144:
        k14 r42 = (k14) r18;
        r42.getClass();
        rr1 r43 = rr1.a;
        return (HubPlayEventsResult) rr1.p(r42, HubPlayEventsResult.class);
    L146:
        k14 r44 = (k14) r18;
        r44.getClass();
        rr1 r45 = rr1.a;
        return rr1.q(r44, HubDownloadItem.class);
    L148:
        ((k14) r18).getClass();
        return j15.a;
    L150:
        String r46 = (String) r18;
        nz3 r47 = b11.f(r46);
        r47.d(r46.concat("/api/downloads?limit=200"));
        return new oz3(r47);
    L152:
        k14 r48 = (k14) r18;
        r48.getClass();
        rr1 r49 = rr1.a;
        return (SmartOut) rr1.p(r48, SmartOut.class);
    L154:
        ((k14) r18).getClass();
        return j15.a;
    L156:
        k14 r50 = (k14) r18;
        r50.getClass();
        rr1 r51 = rr1.a;
        return (SmartAddOut) rr1.p(r50, SmartAddOut.class);
    L158:
        k14 r52 = (k14) r18;
        r52.getClass();
        rr1 r53 = rr1.a;
        return (HubTrackSource) rr1.p(r52, HubTrackSource.class);
    L160:
        k14 r54 = (k14) r18;
        r54.getClass();
        rr1 r55 = rr1.a;
        return (HubTrackSource) rr1.p(r54, HubTrackSource.class);
    L162:
        k14 r56 = (k14) r18;
        r56.getClass();
        rr1 r57 = rr1.a;
        rr1.p(r56, vr1.class);
        throw new ClassCastException();
    L164:
        k14 r58 = (k14) r18;
        r58.getClass();
        rr1 r59 = rr1.a;
        return (HubMe) rr1.p(r58, HubMe.class);
    L166:
        String r60 = (String) r18;
        nz3 r61 = b11.f(r60);
        r61.d(r60.concat("/api/auth/google/link"));
        r61.b("DELETE", xe5.d);
        return new oz3(r61);
    L168:
        ((k14) r18).getClass();
        return j15.a;
    L170:
        k14 r62 = (k14) r18;
        r62.getClass();
        rr1 r63 = rr1.a;
        return (HubMe) rr1.p(r62, HubMe.class);
    L172:
        k14 r64 = (k14) r18;
        r64.getClass();
        rr1 r65 = rr1.a;
        return (HubLikedSongs) rr1.p(r64, HubLikedSongs.class);
    L174:
        String r66 = (String) r18;
        nz3 r67 = b11.f(r66);
        r67.d(r66.concat("/api/nd/liked"));
        return new oz3(r67);
    L176:
        k14 r68 = (k14) r18;
        r68.getClass();
        rr1 r69 = rr1.a;
        return (WaveOut) rr1.p(r68, WaveOut.class);
    L178:
        k14 r70 = (k14) r18;
        r70.getClass();
        rr1 r71 = rr1.a;
        return (SmartOut) rr1.p(r70, SmartOut.class);
    L180:
        k14 r72 = (k14) r18;
        r72.getClass();
        rr1 r73 = rr1.a;
        return (WaveOut) rr1.p(r72, WaveOut.class);
    L182:
        ((k14) r18).getClass();
        return j15.a;
    L184:
        k14 r74 = (k14) r18;
        r74.getClass();
        rr1 r75 = rr1.a;
        return (HubMixToday) rr1.p(r74, HubMixToday.class);
    L186:
        String r76 = (String) r18;
        nz3 r77 = b11.f(r76);
        r77.d(r76.concat("/api/mixes/today"));
        return new oz3(r77);
    }
}
