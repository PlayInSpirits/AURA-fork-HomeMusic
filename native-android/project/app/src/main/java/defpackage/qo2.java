package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import android.util.Pair;
import android.view.KeyEvent;
import com.bumptech.glide.a;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ qo2(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zJ;
        boolean zContains;
        int i = 17;
        int i2 = 14;
        int i3 = 10;
        int i4 = 1;
        boolean zBooleanValue = true;
        int i5 = 0;
        switch (this.n) {
            case 0:
                ro2 ro2Var = (ro2) this.o;
                uw1 uw1Var = (uw1) this.p;
                mt2 mt2Var = (mt2) this.q;
                nj0 nj0Var = ro2Var.c;
                gy3 gy3VarF = uw1Var.f();
                ml3 ml3Var = nj0Var.q;
                qi3 qi3Var = nj0Var.t;
                qi3Var.getClass();
                ml3Var.getClass();
                ml3Var.b = yw1.k(gy3VarF);
                if (!gy3VarF.isEmpty()) {
                    ml3Var.e = (mt2) gy3VarF.get(0);
                    mt2Var.getClass();
                    ml3Var.f = mt2Var;
                }
                if (((mt2) ml3Var.d) == null) {
                    ml3Var.d = ml3.k(qi3Var, (yw1) ml3Var.b, (mt2) ml3Var.e, (zt4) ml3Var.a);
                }
                ml3Var.v(qi3Var.x0());
                return;
            case 1:
                cj2 cj2Var = (cj2) this.o;
                fr2 fr2Var = (fr2) this.p;
                KeyEvent keyEvent = (KeyEvent) this.q;
                tn2 tn2Var = (tn2) cj2Var.c;
                if (tn2Var.k(fr2Var)) {
                    tn2Var.c(keyEvent, false, false);
                } else {
                    ls2 ls2Var = tn2Var.h;
                    ms2 ms2Var = fr2Var.a;
                    ms2Var.getClass();
                    ls2Var.getClass();
                    ls2Var.I(1, new bs2(ls2Var, i4), ms2Var, true);
                }
                cj2Var.b = null;
                return;
            case 2:
                tn2 tn2Var2 = (tn2) this.o;
                gr2 gr2Var = (gr2) this.q;
                if (tn2Var2.l()) {
                    return;
                }
                ju2.f(tn2Var2.s, gr2Var);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                zt2 zt2Var = (zt2) this.o;
                Pair pair = (Pair) this.p;
                ((nj0) zt2Var.o.i).D(((Integer) pair.first).intValue(), (mt2) pair.second, (tv1) this.q);
                return;
            case 4:
                zt2 zt2Var2 = (zt2) this.o;
                Pair pair2 = (Pair) this.p;
                ((nj0) zt2Var2.o.i).c(((Integer) pair2.first).intValue(), (mt2) pair2.second, (Exception) this.q);
                return;
            case 5:
                PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) this.o;
                List list = (List) this.p;
                String str = (String) this.q;
                ArrayList arrayList = new ArrayList(list);
                Collections.shuffle(arrayList);
                bo2.q(playlistPageFragment.r0, arrayList, 0, str);
                ((au) playlistPageFragment.m0.V.n).d(true);
                return;
            case 6:
                mm3 mm3Var = (mm3) this.o;
                String str2 = (String) this.p;
                Context context = (Context) this.q;
                qp4 qp4Var = mm3Var.d;
                List list2 = (List) xl.E((s24) qp4Var.a, true, false, new o(29, qp4Var, str2));
                if (list2.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new qo2(mm3Var, list2, context, i3));
                return;
            case 7:
                mm3 mm3Var2 = (mm3) this.o;
                String str3 = (String) this.p;
                k03 k03Var = (k03) this.q;
                List<PlaylistSong> list3 = (List) xl.E((s24) mm3Var2.c.n, true, false, new rs0(i, str3));
                if (list3 == null || list3.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (PlaylistSong playlistSong : list3) {
                    Child child = new Child(playlistSong.getId());
                    child.setTitle(playlistSong.getTitle());
                    child.setArtist(playlistSong.getArtist());
                    child.setAlbum(playlistSong.getAlbum());
                    child.setTrack(playlistSong.getTrack());
                    child.setCoverArtId(playlistSong.getCoverArtId());
                    child.setDuration(playlistSong.getDuration());
                    child.setAlbumId(playlistSong.getAlbumId());
                    child.setArtistId(playlistSong.getArtistId());
                    arrayList2.add(child);
                }
                k03Var.i(arrayList2);
                return;
            case 8:
                xl.E((s24) ((mm3) this.o).b.a, false, true, new ps0(1, (String) this.q, (String) this.p));
                return;
            case 9:
                mm3 mm3Var3 = (mm3) this.o;
                String str4 = (String) this.p;
                Runnable runnable = (Runnable) this.q;
                mm3Var3.c.B(str4);
                xl.E((s24) mm3Var3.a.o, false, true, new rs0(11, str4));
                String strD = ud3.D();
                if (strD != null) {
                    mm3Var3.d.o(str4, strD);
                }
                xl.E((s24) mm3Var3.b.a, false, true, new rs0(i2, str4));
                if (runnable != null) {
                    new Handler(Looper.getMainLooper()).post(runnable);
                }
                mm3Var3.h();
                return;
            case 10:
                mm3 mm3Var4 = (mm3) this.o;
                List<Playlist> list4 = (List) this.p;
                Context context2 = (Context) this.q;
                for (Playlist playlist : list4) {
                    k03 k03VarC = mm3Var4.c(playlist.getId(), false, null);
                    k03VarC.f(new np1(k03VarC, context2, playlist));
                }
                return;
            case 11:
                mm3 mm3Var5 = (mm3) this.o;
                Playlist playlist2 = (Playlist) this.p;
                ArrayList arrayList3 = (ArrayList) this.q;
                String id = playlist2.getId();
                ml3 ml3Var2 = mm3Var5.b;
                xl.E((s24) ml3Var2.a, false, true, new hl3(ml3Var2, playlist2, i5));
                xl.E((s24) ml3Var2.a, false, true, new o(23, playlist2.isUniversal(), id));
                rm3 rm3Var = mm3Var5.c;
                List list5 = (List) xl.E((s24) rm3Var.n, true, false, new rs0(i, id));
                if (arrayList3.isEmpty()) {
                    if (list5 == null || list5.isEmpty()) {
                        return;
                    }
                    rm3Var.B(id);
                    Log.d("PlaylistRepository", "Cleared songs for playlist " + id);
                    return;
                }
                if (list5 != null && list5.size() == arrayList3.size()) {
                    Log.d("PlaylistRepository", "Songs for playlist " + id + " already cached (size match).");
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList3.get(i6);
                    i6++;
                    arrayList4.add(new PlaylistSong(id, (Child) obj));
                }
                rm3Var.B(id);
                xl.E((s24) rm3Var.n, false, true, new o(24, rm3Var, arrayList4));
                Log.d("PlaylistRepository", "Cached " + arrayList4.size() + " songs for playlist " + id);
                return;
            case 12:
                r20 r20Var = (r20) this.o;
                String str5 = (String) this.p;
                String str6 = (String) this.q;
                mm3 mm3Var6 = (mm3) r20Var.q;
                mm3Var6.c.B(str5);
                if (str6 != null) {
                    mm3Var6.d.o(str5, str6);
                }
                xl.E((s24) mm3Var6.b.a, false, true, new rs0(i2, str5));
                Log.d("PlaylistRepository", "Deleted playlist " + str5 + " and its songs from local DB.");
                return;
            case 13:
                pq3 pq3Var = (pq3) this.o;
                ry ryVar = (ry) this.p;
                td5 td5Var = (td5) this.q;
                try {
                    zBooleanValue = ((Boolean) ryVar.o.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (pq3Var.k) {
                    try {
                        rc5 rc5VarM = q05.m(td5Var.a);
                        String str7 = rc5VarM.a;
                        if (pq3Var.c(str7) == td5Var) {
                            pq3Var.b(str7);
                        }
                        cx.f().b(pq3.l, pq3.class.getSimpleName() + " " + str7 + " executed; reschedule = " + zBooleanValue);
                        ArrayList arrayList5 = pq3Var.j;
                        int size2 = arrayList5.size();
                        while (i5 < size2) {
                            Object obj2 = arrayList5.get(i5);
                            i5++;
                            ((w21) obj2).b(rc5VarM, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 14:
                List<qs3> list6 = (List) this.o;
                hx3 hx3Var = (hx3) this.p;
                Context context3 = (Context) this.q;
                for (qs3 qs3Var : list6) {
                    if (rs3.c.get() != hx3Var.n) {
                        return;
                    }
                    try {
                        se4 se4VarD = au0.D(context3);
                        String strD2 = new xi4(i3).d(new ii0(qs3Var.a, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
                        long jA = nd0.a(se4VarD.i(strD2));
                        if (jA == -1) {
                            HashSet hashSet = rs3.f;
                            synchronized (hashSet) {
                                try {
                                    zContains = hashSet.contains(strD2);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (!zContains) {
                                zJ = false;
                            }
                            if (!zJ) {
                                rs3.a.a(context3, qs3Var, hx3Var.n);
                            }
                        }
                        long jMin = qs3Var.b;
                        if (jA != -1) {
                            jMin = Math.min(jMin, jA);
                        }
                        zJ = se4VarD.j(strD2, jMin);
                    } catch (Exception unused2) {
                    }
                    if (!zJ) {
                        rs3.a.a(context3, qs3Var, hx3Var.n);
                    }
                }
                synchronized (rs3.a) {
                    if (rs3.c.get() == hx3Var.n) {
                        rs3.e = u01.n;
                    }
                    break;
                }
                return;
            case 15:
                SongListPageFragment songListPageFragment = (SongListPageFragment) this.o;
                ArrayList arrayList6 = (ArrayList) this.p;
                String str8 = (String) this.q;
                ArrayList arrayList7 = new ArrayList(arrayList6);
                Collections.shuffle(arrayList7);
                bo2.q(songListPageFragment.q0, arrayList7.subList(0, Math.min(SmartPlan.MAX_QUEUE, arrayList7.size())), 0, str8);
                ((au) songListPageFragment.m0.V.n).d(true);
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                ns3 ns3Var = (ns3) this.o;
                Uri uri = (Uri) this.p;
                lb4 lb4Var = (lb4) this.q;
                try {
                    Bitmap bitmap = (Bitmap) a.c((Context) ns3Var.o).g().N(uri).R(512, 512).get();
                    ((LruCache) ns3Var.p).put(uri, bitmap);
                    lb4Var.l(bitmap);
                    return;
                } catch (Exception e) {
                    lb4Var.m(e);
                    return;
                }
            case 17:
                ic2 ic2Var = (ic2) this.o;
                lb4 lb4Var2 = (lb4) this.p;
                try {
                    try {
                        lb4Var2.n(((mk) this.q).apply(hw.j(ic2Var)));
                        return;
                    } catch (Throwable th3) {
                        lb4Var2.m(th3);
                        return;
                    }
                } catch (Error e2) {
                    e = e2;
                    lb4Var2.m(e);
                    return;
                } catch (CancellationException unused3) {
                    lb4Var2.cancel(false);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    lb4Var2.m(e);
                    return;
                } catch (ExecutionException e4) {
                    e = e4;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    lb4Var2.m(e);
                    return;
                }
            case 18:
                lb4 lb4Var3 = (lb4) this.o;
                ur2 ur2Var = (ur2) this.p;
                ab4 ab4Var = (ab4) this.q;
                try {
                    if (lb4Var3.n instanceof f0) {
                        return;
                    }
                    ur2Var.run();
                    lb4Var3.l(ab4Var);
                    return;
                } catch (Throwable th4) {
                    lb4Var3.m(th4);
                    return;
                }
            case 19:
                rf2 rf2Var = (rf2) this.o;
                tb1 tb1Var = (tb1) this.p;
                ej0 ej0Var = (ej0) this.q;
                o55 o55Var = (o55) rf2Var.o;
                String str9 = f35.a;
                o55Var.s(tb1Var, ej0Var);
                return;
            case 20:
                bl2 bl2Var = (bl2) this.o;
                String str10 = (String) this.p;
                Context context4 = (Context) this.q;
                try {
                    if (bl2Var.isDone()) {
                        sk2 sk2Var = (sk2) bl2Var.get();
                        Log.d("TempoWidget", "controller connected, isPlaying=" + sk2Var.h0());
                        switch (str10.hashCode()) {
                            case -1515577246:
                                if (str10.equals("tempo.widget.SHUFFLE")) {
                                    qi3 qi3VarH = com.eddyizm.tempus.homemusic.a.h();
                                    if (qi3VarH != null && com.eddyizm.tempus.homemusic.a.b != null) {
                                        io1.b.post(new at1(qi3VarH, i5));
                                        i5 = 1;
                                    }
                                    if (i5 == 0) {
                                        sk2Var.s(!sk2Var.D0());
                                    }
                                }
                                break;
                            case -10242334:
                                if (str10.equals("tempo.widget.PLAY_PAUSE")) {
                                    if (sk2Var.h0()) {
                                        sk2Var.c();
                                    } else {
                                        sk2Var.m0();
                                    }
                                }
                                break;
                            case 837569034:
                                if (str10.equals("tempo.widget.NEXT")) {
                                    sk2Var.H0();
                                }
                                break;
                            case 837640522:
                                if (str10.equals("tempo.widget.PREV")) {
                                    sk2Var.S();
                                }
                                break;
                            case 1859223282:
                                if (str10.equals("tempo.widget.REPEAT")) {
                                    int iH = sk2Var.h();
                                    if (iH == 0) {
                                        i4 = 2;
                                    } else if (iH != 2) {
                                        i4 = 0;
                                    }
                                    sk2Var.p0(i4);
                                }
                                break;
                        }
                        ji2.I(context4);
                        sk2Var.Y0();
                        return;
                    }
                    return;
                } catch (InterruptedException e5) {
                    e = e5;
                    Log.e("TempoWidget", "dispatch failed", e);
                    return;
                } catch (ExecutionException e6) {
                    e = e6;
                    Log.e("TempoWidget", "dispatch failed", e);
                    return;
                }
            case 21:
                ((pq3) ((rm3) this.o).n).g((gl4) this.p, (z45) this.q);
                return;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.o;
                oy oyVar = (oy) this.p;
                gf1 gf1Var = (gf1) this.q;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    oyVar.a(gf1Var.invoke());
                    return;
                } catch (Throwable th5) {
                    oyVar.b(th5);
                    return;
                }
        }
    }
}
