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
import com.eddyizm.tempus.homemusic.WaveRetry;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ur2(hh3 hh3Var, List list, k03 k03Var) {
        this.n = 17;
        this.o = list;
        this.p = k03Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x04de  */
    /* JADX WARN: Code duplicated, block: B:177:0x0504  */
    /* JADX WARN: Code duplicated, block: B:178:0x0506  */
    /* JADX WARN: Code duplicated, block: B:179:0x0508  */
    /* JADX WARN: Code duplicated, block: B:181:0x050f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0511  */
    /* JADX WARN: Code duplicated, block: B:184:0x0517  */
    /* JADX WARN: Code duplicated, block: B:185:0x0519  */
    @Override // java.lang.Runnable
    public final void run() {
        ab4 ab4Var;
        SearchResult3 searchResult3;
        int i = 4;
        int i2 = 2;
        long jIntValue = 0;
        int i3 = 8;
        int i4 = 1;
        int i5 = 0;
        switch (this.n) {
            case 0:
                tn2 tn2Var = (tn2) this.o;
                Runnable runnable = (Runnable) this.p;
                tn2Var.getClass();
                runnable.run();
                return;
            case 1:
                ic2 ic2Var = (ic2) this.o;
                ResultReceiver resultReceiver = (ResultReceiver) this.p;
                try {
                    ab4Var = (ab4) ic2Var.get();
                    rr2.s(ab4Var, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e) {
                    e = e;
                    l93.r0("MediaSessionLegacyStub", "Custom command failed", e);
                    ab4Var = new ab4(-1);
                } catch (CancellationException e2) {
                    l93.r0("MediaSessionLegacyStub", "Custom command cancelled", e2);
                    ab4Var = new ab4(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    l93.r0("MediaSessionLegacyStub", "Custom command failed", e);
                    ab4Var = new ab4(-1);
                }
                resultReceiver.send(ab4Var.a, ab4Var.b);
                return;
            case 2:
                tn2 tn2Var2 = (tn2) this.o;
                Intent intent = (Intent) this.p;
                int i6 = MediaLibraryService.t;
                fr2 fr2VarG = tn2Var2.g();
                if (fr2VarG == null) {
                    ComponentName component = intent.getComponent();
                    fr2VarG = new fr2(new ms2(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1009002300, 8, false, null, Bundle.EMPTY);
                }
                if (tn2Var2.t(fr2VarG, intent)) {
                    return;
                }
                l93.A("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                kt2 kt2Var = (kt2) this.o;
                ju1 ju1Var = (ju1) this.p;
                na4 na4Var = kt2Var.f;
                fr2 fr2VarW = na4Var.w(ju1Var.asBinder());
                if (fr2VarW != null) {
                    na4Var.N(fr2VarW);
                    return;
                }
                return;
            case 4:
                ((kt2) this.o).f.s((fr2) this.p);
                return;
            case 5:
                ((wc0) this.o).accept((st2) this.p);
                return;
            case 6:
                v53 v53Var = (v53) this.o;
                Context context = (Context) this.p;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new v9(i3, v53Var), intentFilter);
                return;
            case 7:
                v9 v9Var = (v9) this.o;
                Context context2 = (Context) this.p;
                v53 v53Var2 = (v53) v9Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case WaveRetry.MAX_FAILURES /* 16 */:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case WaveRetry.MAX_FAILURES /* 16 */:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            } else {
                                i = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    v53Var2.c(i);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    telephonyManager.getClass();
                    t53 t53Var = new t53(v53Var2);
                    telephonyManager.registerTelephonyCallback(v53Var2.a, t53Var);
                    telephonyManager.unregisterTelephonyCallback(t53Var);
                    return;
                } catch (RuntimeException unused2) {
                    v53Var2.c(5);
                    return;
                }
            case 8:
                xi3 xi3Var = (xi3) this.o;
                xi3Var.n0((bj2) this.p);
                xi3Var.r0.postDelayed(xi3Var.s0, 1000L);
                return;
            case 9:
                bl2 bl2Var = (bl2) this.o;
                hk3 hk3Var = (hk3) this.p;
                try {
                    bj2 bj2Var = (bj2) bl2Var.get();
                    hk3Var.o0 = bj2Var;
                    bj2Var.getClass();
                    do2 do2VarK0 = bj2Var.K0();
                    do2VarK0.getClass();
                    hk3Var.m0(do2VarK0, bj2Var.o0());
                    bj2Var.v(new gk3(hk3Var, bj2Var));
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 10:
                yk3 yk3Var = (yk3) this.o;
                xk3 xk3Var = (xk3) this.p;
                try {
                    bj2 bj2Var2 = (bj2) yk3Var.r.get();
                    int iC = xk3Var.c();
                    Child child = (Child) yk3Var.s.get(iC);
                    String str = yk3Var.t;
                    if (str == null || !str.equals(child.getId())) {
                        bj2Var2.n(iC, 0L);
                        bj2Var2.m0();
                    } else if (yk3Var.u) {
                        bj2Var2.c();
                    } else {
                        bj2Var2.m0();
                    }
                    return;
                } catch (Exception e5) {
                    Log.w("PlayerSongQueueAdapter", "Error obtaining MediaBrowser", e5);
                    return;
                }
            case 11:
                mm3 mm3Var = (mm3) this.o;
                List list = (List) this.p;
                ml3 ml3Var = mm3Var.b;
                s24 s24Var = (s24) ml3Var.a;
                List<Playlist> list2 = (List) xl.E(s24Var, true, false, new kl3(i5, ml3Var));
                if (list2 != null) {
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((Playlist) it.next()).getId());
                    }
                    String strD = ud3.D();
                    for (Playlist playlist : list2) {
                        if (!hashSet.contains(playlist.getId())) {
                            mm3Var.c.B(playlist.getId());
                            xl.E((s24) mm3Var.a.o, false, true, new rs0(11, playlist.getId()));
                            if (strD != null) {
                                mm3Var.d.o(playlist.getId(), strD);
                            }
                            xl.E(s24Var, false, true, new hl3(ml3Var, playlist, i4));
                            Log.d("PlaylistRepository", "Removed orphaned playlist " + playlist.getId() + " from local DB.");
                        }
                    }
                }
                xl.E(s24Var, false, true, new o(22, ml3Var, list));
                Log.d("PlaylistRepository", "Cached " + list.size() + " playlists to local DB.");
                return;
            case 12:
                pq3 pq3Var = (pq3) this.o;
                rc5 rc5Var = (rc5) this.p;
                synchronized (pq3Var.k) {
                    try {
                        ArrayList arrayList = pq3Var.j;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            ((w21) obj).b(rc5Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 13:
                ((hr3) this.o).E((m84) this.p);
                return;
            case 14:
                xl.E((s24) ((vs3) this.o).a.o, false, true, new jl3(1, System.currentTimeMillis(), (String) this.p));
                return;
            case 15:
                String str2 = (String) this.o;
                String strB = (String) this.p;
                try {
                    File fileE = xt3.e(str2);
                    if (!strB.startsWith("http://") && !strB.startsWith("https://")) {
                        strB = wg0.b(ud3.t(), strB);
                    }
                    if (strB.contains("/rest/getCoverArt")) {
                        xt3.d(fileE, strB);
                        return;
                    } else {
                        xt3.c(fileE, strB);
                        return;
                    }
                } catch (Exception e6) {
                    Log.e("RadioCoverArtDownloader", "Failed to download cover art for station " + str2, e6);
                    return;
                }
            case WaveRetry.MAX_FAILURES /* 16 */:
                String str3 = (String) this.o;
                fu3 fu3Var = (fu3) this.p;
                xl.E((AppDatabase_Impl) AppDatabase.y().z().o, false, true, new rs0(i3, str3));
                xt3.a.execute(new kt1(i, str3));
                new Handler(Looper.getMainLooper()).post(fu3Var);
                return;
            case 17:
                List list3 = (List) this.o;
                k03 k03Var = (k03) this.p;
                List list4 = (List) ((List) xl.E((AppDatabase_Impl) AppDatabase.y().z().o, true, false, new or1(26))).stream().map(new hu3(i5)).collect(Collectors.toList());
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                arrayList2.sort(Comparator.comparing(new hu3(i2), String.CASE_INSENSITIVE_ORDER));
                k03Var.i(arrayList2);
                return;
            case 18:
                gn2 gn2Var = (gn2) this.o;
                ArrayList arrayList3 = (ArrayList) this.p;
                qi3 qi3Var = (qi3) jz3.f.get();
                if (qi3Var == null) {
                    return;
                }
                gn2 gn2VarA = qi3Var.a();
                if (gn2VarA != null && gn2Var.a.equals(gn2VarA.a)) {
                    float fK = jz3.k(qi3Var, arrayList3);
                    if (fK != 0.0f) {
                        float fC = jz3.c(fK, jz3.l(qi3Var, arrayList3));
                        Log.d("ReplayGainUtil", "Late prefetch for current track " + gn2Var.a + " — applying gain immediately totalGain=" + fC);
                        jz3.e.n(fC);
                    } else {
                        Log.d("ReplayGainUtil", "Late prefetch for current track " + gn2Var.a + " — empty gains, skipping setGainImmediate");
                    }
                }
                jz3.h(qi3Var);
                return;
            case 19:
                ((au0) this.o).N((Typeface) this.p);
                return;
            case 20:
                String str4 = (String) this.o;
                SearchFragment searchFragment = (SearchFragment) this.p;
                ArrayList arrayList4 = new ArrayList();
                boolean z = true;
                int size2 = 0;
                while (z) {
                    try {
                        pn4 pn4VarF = App.f(false);
                        if (pn4VarF.g == null) {
                            pn4VarF.g = new hd5(pn4VarF);
                        }
                        Response responseExecute = pn4VarF.g.m(str4, 1000, size2, 0, 0).execute();
                        if (responseExecute.isSuccessful() && responseExecute.body() != null && (searchResult3 = ((ApiResponse) responseExecute.body()).getSubsonicResponse().getSearchResult3()) != null && searchResult3.getSongs() != null && !searchResult3.getSongs().isEmpty()) {
                            List<Child> songs = searchResult3.getSongs();
                            arrayList4.addAll(songs);
                            size2 += songs.size();
                            if (songs.size() == 1000) {
                                z = true;
                            }
                        }
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    z = false;
                }
                PlaylistWithSongs playlistWithSongs = new PlaylistWithSongs("allsongs", arrayList4);
                playlistWithSongs.setSongCount(arrayList4.size());
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(playlistWithSongs);
                int size3 = arrayList4.size();
                while (i5 < size3) {
                    Object obj2 = arrayList4.get(i5);
                    i5++;
                    Child child2 = (Child) obj2;
                    if (child2 != null && child2.getDuration() != null) {
                        jIntValue += (long) child2.getDuration().intValue();
                    }
                }
                playlistWithSongs.setDuration(jIntValue);
                new Handler(Looper.getMainLooper()).post(new t6(searchFragment, playlistWithSongs, arrayList4, arrayList5, 29));
                return;
            case 21:
                qe4 qe4Var = (qe4) this.o;
                ic2 ic2Var2 = (ic2) this.p;
                qe4Var.getClass();
                String str5 = f35.a;
                HashSet hashSet2 = qe4Var.f;
                hashSet2.remove(ic2Var2);
                if (!hashSet2.isEmpty() || qe4Var.i) {
                    return;
                }
                qe4Var.D1(qe4Var.i1(), false, false);
                return;
            case 22:
                sj4 sj4Var = (sj4) this.o;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.p;
                SurfaceTexture surfaceTexture2 = sj4Var.t;
                Surface surface = sj4Var.u;
                Surface surface2 = new Surface(surfaceTexture);
                sj4Var.t = surfaceTexture;
                sj4Var.u = surface2;
                Iterator it2 = sj4Var.n.iterator();
                while (it2.hasNext()) {
                    ((d41) it2.next()).n.t1(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 23:
                ns3 ns3Var = (ns3) this.o;
                Uri uri = (Uri) this.p;
                if (((LruCache) ns3Var.p).get(uri) != null) {
                    return;
                }
                try {
                    ((LruCache) ns3Var.p).put(uri, (Bitmap) a.c((Context) ns3Var.o).g().N(uri).R(512, 512).get());
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 24:
                ((rm3) ((na4) this.o).o).R((gl4) this.p, 3);
                return;
            case 25:
                Runnable runnable2 = (Runnable) this.p;
                ia4 ia4Var = (ia4) this.o;
                try {
                    runnable2.run();
                    return;
                } finally {
                    ia4Var.a();
                }
            case 26:
                rf2 rf2Var = (rf2) this.o;
                h40 h40Var = (h40) this.p;
                o55 o55Var = (o55) rf2Var.o;
                String str6 = f35.a;
                o55Var.r(h40Var);
                return;
            case 27:
                rf2 rf2Var2 = (rf2) this.o;
                s55 s55Var = (s55) this.p;
                o55 o55Var2 = (o55) rf2Var2.o;
                String str7 = f35.a;
                o55Var2.a(s55Var);
                return;
            case 28:
                rf2 rf2Var3 = (rf2) this.o;
                Exception exc = (Exception) this.p;
                o55 o55Var3 = (o55) rf2Var3.o;
                String str8 = f35.a;
                o55Var3.t(exc);
                return;
            default:
                rf2 rf2Var4 = (rf2) this.o;
                String str9 = (String) this.p;
                o55 o55Var4 = (o55) rf2Var4.o;
                String str10 = f35.a;
                o55Var4.c(str9);
                return;
        }
    }

    public /* synthetic */ ur2(tn2 tn2Var, fr2 fr2Var, Runnable runnable) {
        this.n = 0;
        this.o = tn2Var;
        this.p = runnable;
    }

    public /* synthetic */ ur2(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public /* synthetic */ ur2(Runnable runnable, ia4 ia4Var) {
        this.n = 25;
        this.p = runnable;
        this.o = ia4Var;
    }
}
