package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.LruCache;
import android.view.Surface;
import androidx.media3.session.MediaLibraryService;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.database.AppDatabase_Impl;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.subsonic.models.SearchResult3;
import com.eddyizm.tempus.ui.fragment.SearchFragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ur2(hh3 r1, List r2, k03 r3) {
        this.n = 17;
        this.o = r2;
        this.p = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r3 = 4;
        int r4 = 2;
        long r5 = 0;
        int r8 = 8;
        int r9 = 1;
        int r10 = 0;
        switch(this.n) {
            case 0: goto L229;
            case 1: goto L216;
            case 2: goto L205;
            case 3: goto L201;
            case 4: goto L199;
            case 5: goto L197;
            case 6: goto L195;
            case 7: goto L160;
            case 8: goto L158;
            case 9: goto L152;
            case 10: goto L138;
            case 11: goto L121;
            case 12: goto L110;
            case 13: goto L108;
            case 14: goto L106;
            case 15: goto L90;
            case 16: goto L88;
            case 17: goto L86;
            case 18: goto L73;
            case 19: goto L71;
            case 20: goto L41;
            case 21: goto L35;
            case 22: goto L26;
            case 23: goto L21;
            case 24: goto L19;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        rf2 r1 = (rf2) this.o;
        String r0 = (String) this.p;
        o55 r2 = (o55) r1.o;
        String r6 = f35.a;
        r2.c(r0);
        return;
    L6:
        rf2 r7 = (rf2) this.o;
        Exception r11 = (Exception) this.p;
        o55 r12 = (o55) r7.o;
        String r13 = f35.a;
        r12.t(r11);
        return;
    L8:
        rf2 r14 = (rf2) this.o;
        s55 r15 = (s55) this.p;
        o55 r16 = (o55) r14.o;
        String r17 = f35.a;
        r16.a(r15);
        return;
    L10:
        rf2 r18 = (rf2) this.o;
        h40 r19 = (h40) this.p;
        o55 r20 = (o55) r18.o;
        String r21 = f35.a;
        r20.r(r19);
        return;
    L12:
        Runnable r22 = (Runnable) this.p;
        ia4 r23 = (ia4) this.o;
        r22.run();     // Catch: Throwable -> L16
        r23.a();
        return;
    L16:
        th = move-exception;
        r23.a();
        throw th;
    L19:
        na4 r24 = (na4) this.o;
        ((rm3) r24.o).R((gl4) this.p, 3);
        return;
    L21:
        ns3 r25 = (ns3) this.o;
        Uri r26 = (Uri) this.p;
        if (((LruCache) r25.p).get(r26) != null) goto L279;
        ((LruCache) r25.p).put(r26, (Bitmap) a.c((Context) r25.o).g().N(r26).R(512, 512).get());     // Catch: Exception -> L231
        return;
    L280:
        return;
    L279:
        return;
    L26:
        sj4 r27 = (sj4) this.o;
        SurfaceTexture r28 = (SurfaceTexture) this.p;
        SurfaceTexture r29 = r27.t;
        Surface r30 = r27.u;
        Surface r31 = new Surface(r28);
        r27.t = r28;
        r27.u = r31;
        Iterator r32 = r27.n.iterator();
    L28:
        if (r32.hasNext() == false) goto L30;
        ((d41) r32.next()).n.t1(r31);
        goto L28
    L30:
        if (r29 == null) goto L32;
        r29.release();
    L32:
        if (r30 == null) goto L281;
        r30.release();
        return;
    L281:
        return;
    L35:
        qe4 r33 = (qe4) this.o;
        ic2 r34 = (ic2) this.p;
        r33.getClass();
        String r35 = f35.a;
        HashSet r36 = r33.f;
        r36.remove(r34);
        if (r36.isEmpty() == true) goto L38;
        return;
    L38:
        if (r33.i == true) goto L283;
        r33.D1(r33.i1(), false, false);
        return;
    L283:
        return;
    L41:
        String r110 = (String) this.o;
        SearchFragment r37 = (SearchFragment) this.p;
        ArrayList r38 = new ArrayList();
        boolean r39 = true;
        int r111 = 0;
    L42:
        if (r39 == false) goto L62;
        pn4 r40 = App.f(false);     // Catch: IOException -> L59
        if (r40.g != null) goto L46;
        r40.g = new hd5(r40);     // Catch: IOException -> L59
    L46:
        Response r41 = r40.g.m(r110, 1000, r111, 0, 0).execute();     // Catch: IOException -> L59
        if (r41.isSuccessful() == false) goto L61;
        if (r41.body() == null) goto L61;
        SearchResult3 r42 = ((ApiResponse) r41.body()).getSubsonicResponse().getSearchResult3();     // Catch: IOException -> L59
        if (r42 == null) goto L61;
        if (r42.getSongs() == null) goto L61;
        if (r42.getSongs().isEmpty() == true) goto L61;
        List<Child> r43 = r42.getSongs();     // Catch: IOException -> L59
        r38.addAll(r43);     // Catch: IOException -> L59
        r111 = r111 + r43.size();     // Catch: IOException -> L59
        if (r43.size() != 1000) goto L61;
        r39 = true;
    L61:
        r39 = false;
    L59:
        e = move-exception;
        e.printStackTrace();
        goto L61
    L62:
        PlaylistWithSongs r112 = new PlaylistWithSongs("allsongs", r38);
        r112.setSongCount(r38.size());
        ArrayList r44 = new ArrayList();
        r44.add(r112);
        int r45 = r38.size();
    L63:
        if (r10 >= r45) goto L69;
        Object r46 = r38.get(r10);
        r10 = r10 + 1;
        Child r47 = (Child) r46;
        if (r47 == null) goto L63;
        if (r47.getDuration() == null) goto L63;
        r5 = r5 + ((long) r47.getDuration().intValue());
        goto L63
    L69:
        r112.setDuration(r5);
        new Handler(Looper.getMainLooper()).post(new t6(r37, r112, r38, r44, 29));
        return;
    L71:
        ((au0) this.o).N((Typeface) this.p);
        return;
    L73:
        gn2 r48 = (gn2) this.o;
        ArrayList r49 = (ArrayList) this.p;
        qi3 r50 = (qi3) jz3.f.get();
        if (r50 == null) goto L284;
        gn2 r51 = r50.a();
        if (r51 != null) goto L79;
    L84:
        jz3.h(r50);
        return;
    L79:
        if (r48.a.equals(r51.a) == false) goto L84;
        float r52 = jz3.k(r50, r49);
        if (r52 == 0.0f) goto L83;
        float r53 = jz3.c(r52, jz3.l(r50, r49));
        Log.d("ReplayGainUtil", "Late prefetch for current track " + r48.a + " — applying gain immediately totalGain=" + r53);
        jz3.e.n(r53);
        goto L84
    L83:
        Log.d("ReplayGainUtil", "Late prefetch for current track " + r48.a + " — empty gains, skipping setGainImmediate");
        goto L84
    L284:
        return;
    L86:
        List r54 = (List) this.o;
        k03 r55 = (k03) this.p;
        List r56 = (List) ((List) xl.E((AppDatabase_Impl) AppDatabase.y().z().o, true, false, new or1(26))).stream().map(new hu3(r10)).collect(Collectors.toList());
        ArrayList r57 = new ArrayList(r54);
        r57.addAll(r56);
        r57.sort(Comparator.comparing(new hu3(r4), String.CASE_INSENSITIVE_ORDER));
        r55.i(r57);
        return;
    L88:
        String r58 = (String) this.o;
        fu3 r59 = (fu3) this.p;
        xl.E((AppDatabase_Impl) AppDatabase.y().z().o, false, true, new rs0(r8, r58));
        xt3.a.execute(new kt1(r3, r58));
        new Handler(Looper.getMainLooper()).post(r59);
        return;
    L90:
        String r60 = (String) this.o;
        String r61 = (String) this.p;
        File r62 = xt3.e(r60);     // Catch: Exception -> L100
        if (r61.startsWith("http://") == true) goto L98;
        if (r61.startsWith("https://") == true) goto L98;
        r61 = wg0.b(ud3.t(), r61);     // Catch: Exception -> L100
    L98:
        if (r61.contains("/rest/getCoverArt") == false) goto L102;
        xt3.d(r62, r61);     // Catch: Exception -> L100
        return;
    L102:
        xt3.c(r62, r61);     // Catch: Exception -> L100
        return;
    L100:
        e = move-exception;
        Log.e("RadioCoverArtDownloader", "Failed to download cover art for station " + r60, e);
        return;
    L106:
        vs3 r63 = (vs3) this.o;
        String r64 = (String) this.p;
        xl.E((s24) r63.a.o, false, true, new jl3(1, System.currentTimeMillis(), r64));
        return;
    L108:
        ((hr3) this.o).E((m84) this.p);
        return;
    L110:
        pq3 r65 = (pq3) this.o;
        rc5 r66 = (rc5) this.p;
        Object r67 = r65.k;
        monitor-enter(r67);
        ArrayList r68 = r65.j;     // Catch: Throwable -> L115
        int r69 = r68.size();     // Catch: Throwable -> L115
        int r70 = 0;
    L113:
        if (r70 >= r69) goto L117;
        Object r71 = r68.get(r70);     // Catch: Throwable -> L115
        r70 = r70 + 1;     // Catch: Throwable -> L115
        ((w21) r71).b(r66, false);     // Catch: Throwable -> L115
        goto L113
    L117:
        monitor-exit(r67);     // Catch: Throwable -> L115
        return;
    L115:
        th = move-exception;
        throw th;
    L121:
        mm3 r72 = (mm3) this.o;
        List r73 = (List) this.p;
        ml3 r74 = r72.b;
        s24 r75 = (s24) r74.a;
        List r76 = (List) xl.E(r75, true, false, new kl3(r10, r74));
        if (r76 == null) goto L136;
        HashSet r77 = new HashSet();
        Iterator r78 = r73.iterator();
    L125:
        if (r78.hasNext() == false) goto L127;
        r77.add(((Playlist) r78.next()).getId());
        goto L125
    L127:
        String r79 = ud3.D();
        Iterator r80 = r76.iterator();
    L129:
        if (r80.hasNext() == false) goto L136;
        Playlist r81 = (Playlist) r80.next();
        if (r77.contains(r81.getId()) == true) goto L129;
        r72.c.B(r81.getId());
        xl.E((s24) r72.a.o, false, true, new rs0(11, r81.getId()));
        if (r79 == null) goto L135;
        r72.d.o(r81.getId(), r79);
    L135:
        xl.E(r75, false, true, new hl3(r74, r81, r9));
        Log.d("PlaylistRepository", "Removed orphaned playlist " + r81.getId() + " from local DB.");
    L136:
        xl.E(r75, false, true, new o(22, r74, r73));
        Log.d("PlaylistRepository", "Cached " + r73.size() + " playlists to local DB.");
        return;
    L138:
        yk3 r82 = (yk3) this.o;
        xk3 r83 = (xk3) this.p;
        bj2 r84 = (bj2) r82.r.get();     // Catch: Exception -> L149
        int r85 = r83.c();     // Catch: Exception -> L149
        Child r86 = (Child) r82.s.get(r85);     // Catch: Exception -> L149
        String r87 = r82.t;     // Catch: Exception -> L149
        if (r87 != null) goto L142;
    L147:
        r84.n(r85, 0);     // Catch: Exception -> L149
        r84.m0();     // Catch: Exception -> L149
    L236:
        return;
    L142:
        if (r87.equals(r86.getId()) == false) goto L147;
        if (r82.u == false) goto L146;
        r84.c();     // Catch: Exception -> L149
        goto L236
    L146:
        r84.m0();     // Catch: Exception -> L149
    L149:
        e = move-exception;
        Log.w("PlayerSongQueueAdapter", "Error obtaining MediaBrowser", e);
        return;
    L152:
        bl2 r88 = (bl2) this.o;
        hk3 r89 = (hk3) this.p;
        bj2 r90 = (bj2) r88.get();     // Catch: Exception -> L155
        r89.o0 = r90;     // Catch: Exception -> L155
        r90.getClass();     // Catch: Exception -> L155
        do2 r91 = r90.K0();     // Catch: Exception -> L155
        r91.getClass();     // Catch: Exception -> L155
        r89.m0(r91, r90.o0());     // Catch: Exception -> L155
        r90.v(new gk3(r89, r90));     // Catch: Exception -> L155
        return;
    L155:
        e = move-exception;
        e.printStackTrace();
        return;
    L158:
        xi3 r92 = (xi3) this.o;
        r92.n0((bj2) this.p);
        r92.r0.postDelayed(r92.s0, 1000);
        return;
    L160:
        v9 r93 = (v9) this.o;
        Context r94 = (Context) this.p;
        v53 r95 = (v53) r93.b;
        ConnectivityManager r96 = (ConnectivityManager) r94.getSystemService("connectivity");
        if (r96 != null) goto L247;
    L162:
        r3 = 0;
    L188:
        if (Build.VERSION.SDK_INT < 31) goto L193;
        if (r3 != 5) goto L193;
        TelephonyManager r97 = (TelephonyManager) r94.getSystemService("phone");     // Catch: RuntimeException -> L192
        r97.getClass();     // Catch: RuntimeException -> L192
        t53 r98 = new t53(r95);     // Catch: RuntimeException -> L192
        go2.t(r97, r95.a, r98);     // Catch: RuntimeException -> L192
        go2.s(r97, r98);     // Catch: RuntimeException -> L192
        return;
    L192:
        r95.c(5);
        return;
    L193:
        r95.c(r3);
        return;
    L247:
        NetworkInfo r99 = r96.getActiveNetworkInfo();     // Catch: SecurityException -> L232
        if (r99 != null) goto L166;
    L186:
        r3 = 1;
        goto L188
    L166:
        if (r99.isConnected() == false) goto L186;
        int r100 = r99.getType();
        if (r100 == 0) goto L180;
        if (r100 == 1) goto L178;
        if (r100 == 4) goto L180;
        if (r100 == 5) goto L180;
        if (r100 == 6) goto L177;
        if (r100 == 9) goto L176;
        r3 = 8;
        goto L188
    L176:
        r3 = 7;
    L177:
        r3 = 5;
    L178:
        r3 = 2;
    L180:
        switch(r99.getSubtype()) {
            case 1: goto L185;
            case 2: goto L185;
            case 3: goto L188;
            case 4: goto L188;
            case 5: goto L188;
            case 6: goto L188;
            case 7: goto L188;
            case 8: goto L188;
            case 9: goto L188;
            case 10: goto L188;
            case 11: goto L188;
            case 12: goto L188;
            case 13: goto L177;
            case 14: goto L188;
            case 15: goto L188;
            case 16: goto L181;
            case 17: goto L188;
            case 18: goto L178;
            case 19: goto L181;
            case 20: goto L183;
            default: goto L181;
        };
    L181:
        r3 = 6;
        goto L188
    L185:
        r3 = 3;
        goto L188
    L183:
        if (Build.VERSION.SDK_INT < 29) goto L162;
        r3 = 9;
        goto L188
    L195:
        v53 r101 = (v53) this.o;
        Context r102 = (Context) this.p;
        IntentFilter r103 = new IntentFilter();
        r103.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        r102.registerReceiver(new v9(r8, r101), r103);
        return;
    L197:
        ((wc0) this.o).accept((st2) this.p);
        return;
    L199:
        kt2 r104 = (kt2) this.o;
        r104.f.s((fr2) this.p);
        return;
    L201:
        kt2 r105 = (kt2) this.o;
        ju1 r106 = (ju1) this.p;
        na4 r107 = r105.f;
        fr2 r108 = r107.w(r106.asBinder());
        if (r108 == null) goto L291;
        r107.N(r108);
        return;
    L291:
        return;
    L205:
        tn2 r109 = (tn2) this.o;
        Intent r113 = (Intent) this.p;
        int r114 = MediaLibraryService.t;
        fr2 r115 = r109.g();
        if (r115 != null) goto L213;
        ComponentName r116 = r113.getComponent();
        if (r116 == null) goto L210;
        String r117 = r116.getPackageName();
    L211:
        r115 = new fr2(new ms2(r117, -1, -1), 1009002300, 8, false, null, Bundle.EMPTY);
        goto L213
    L210:
        r117 = "androidx.media3.session.MediaSessionService";
    L213:
        if (r109.t(r115, r113) == true) goto L292;
        l93.A("MSessionService", "Ignored unrecognized media button intent.");
        return;
    L292:
        return;
    L216:
        ic2 r118 = (ic2) this.o;
        ResultReceiver r119 = (ResultReceiver) this.p;
        ab4 r120 = (ab4) r118.get();     // Catch: InterruptedException -> L219 ExecutionException -> L221 CancellationException -> L223
        rr2.s(r120, "SessionResult must not be null");     // Catch: InterruptedException -> L219 ExecutionException -> L221 CancellationException -> L223
    L227:
        r119.send(r120.a, r120.b);
        return;
    L219:
        e = e;
    L225:
        l93.r0("MediaSessionLegacyStub", "Custom command failed", e);
        r120 = new ab4(-1);
    L223:
        e = move-exception;
        l93.r0("MediaSessionLegacyStub", "Custom command cancelled", e);
        r120 = new ab4(1);
    L221:
        e = e;
        goto L225
    L229:
        tn2 r121 = (tn2) this.o;
        Runnable r122 = (Runnable) this.p;
        r121.getClass();
        r122.run();
    }

    public /* synthetic */ ur2(tn2 r1, fr2 r2, Runnable r3) {
        this.n = 0;
        this.o = r1;
        this.p = r3;
    }

    public /* synthetic */ ur2(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ ur2(Runnable r2, ia4 r3) {
        this.n = 25;
        this.p = r2;
        this.o = r3;
    }
}
