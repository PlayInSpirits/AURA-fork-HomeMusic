package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.SmartSession;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.subsonic.models.Child;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bo2 {
    public static WeakReference a = new WeakReference(null);
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ExecutorService d = Executors.newSingleThreadExecutor();

    public static List a(ao2 ao2Var, List list) {
        qi3 qi3VarB = ao2Var.b();
        if (qi3VarB == null) {
            return new ArrayList(list);
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < qi3VarB.Q0(); i++) {
            hashSet.add(qi3VarB.Y(i).a);
        }
        return (List) list.stream().filter(new tj(3, hashSet)).collect(Collectors.toList());
    }

    public static int b(ao2 ao2Var, List list) {
        int iC;
        qi3 qi3VarB = ao2Var.b();
        if (qi3VarB == null) {
            return -1;
        }
        rs1 rs1Var = rs1.a;
        int iW = lg2.W(r40.k0(list, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((Child) it.next()).getId(), "continuous");
        }
        rs1.b(linkedHashMap, v01.n);
        Handler handler = is3.a;
        cu4 cu4VarX0 = qi3VarB.x0();
        cu4VarX0.getClass();
        int iQ0 = (cu4VarX0.p() || (iC = cu4VarX0.c(qi3VarB.D0())) == -1) ? qi3VarB.Q0() : iC + 1;
        ArrayList arrayListM = gi1.M(list);
        new vs3().c(list, false, iQ0);
        ao2Var.a(iQ0, arrayListM.size(), arrayListM.size() + qi3VarB.Q0());
        qi3VarB.N0(arrayListM, iQ0);
        return iQ0;
    }

    public static void c(gn2 gn2Var, ao2 ao2Var, vp vpVar) {
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get() || !ud3.T()) {
            Log.d("MediaManager", "Continuous Play: already running");
            if (vpVar != null) {
                vpVar.run();
                return;
            }
            return;
        }
        qi3 qi3VarB = ao2Var.b();
        if (qi3VarB == null) {
            Log.d("MediaManager", "Continuous Play: queue target gone");
            if (vpVar != null) {
                vpVar.run();
                return;
            }
            return;
        }
        Log.d("MediaManager", "Continuous Play");
        App.b().getClass();
        App.c().edit().putLong("last_instant_mix", System.currentTimeMillis()).apply();
        atomicBoolean.set(true);
        App.b().getClass();
        int iMax = qi3VarB.D0() ? 0 : Math.max(0, (qi3VarB.a() != null ? qi3VarB.o0() : 0) - (App.c().getInt("number_tracks_keep_in_queue", 30) - 1));
        if (iMax > 0) {
            Log.d("MediaManager", "Continuous Play: purging " + iMax + " old items from queue");
            k(ao2Var, 0, iMax);
        }
        String str = gn2Var.a;
        Bundle bundle = gn2Var.d.I;
        String string = bundle != null ? bundle.getString("artistId") : null;
        xi4 xi4Var = new xi4(2);
        k03 k03Var = new k03();
        if (string == null || string.isEmpty()) {
            xi4Var.l(str, k03Var);
        } else {
            gp3 gp3VarC = App.f(false).c();
            gp3VarC.getClass();
            Log.d("BrowsingClient", "getSimilarSongs2()");
            ((ov) gp3VarC.p).a(((pn4) gp3VarC.o).f(), string, 25).enqueue(new yc5(xi4Var, k03Var, str));
        }
        k03Var.f(new i7(3, k03Var, ao2Var));
    }

    public static void d(gn2 gn2Var) {
        if (gn2Var != null) {
            new vs3();
            String str = gn2Var.a;
            if (str == null) {
                return;
            }
            Map mapA = ud3.A();
            if (mapA.remove(str) != null) {
                ud3.N0(mapA);
            }
            rm3 rm3VarB = App.f(false).b();
            rm3VarB.getClass();
            Log.d("BookmarksClient", "deleteBookmark() id=".concat(str));
            ((mt) rm3VarB.o).d(((pn4) rm3VarB.n).f(), str).enqueue(new hh3(9));
        }
    }

    public static void e(ic2 ic2Var, List list, boolean z) {
        String str = z ? "next" : "append";
        Handler handler = u52.a;
        list.getClass();
        if (u52.r(list, str, 0, 0L) || ic2Var == null) {
            return;
        }
        ic2Var.f(new bs1(ic2Var, list, z, 4), gq0.n);
    }

    public static void f(bl2 bl2Var, Child child, boolean z) {
        List listSingletonList = Collections.singletonList(child);
        String str = z ? "next" : "append";
        Handler handler = u52.a;
        listSingletonList.getClass();
        if (u52.r(listSingletonList, str, 0, 0L) || bl2Var == null) {
            return;
        }
        bl2Var.f(new bs1(bl2Var, child, z, 5), gq0.n);
    }

    public static void g(yn2 yn2Var, List list, boolean z) {
        bj2 bj2Var = yn2Var.n;
        if (bj2Var == null) {
            Log.d("MediaManager", "enqueue: queue target gone, dropping " + list.size() + " items");
            return;
        }
        Log.d("MediaManager", "enqueue");
        rs1.i(list);
        int iO0 = bj2Var.o0();
        if (!z || iO0 == -1) {
            new vs3().c(list, false, bj2Var.Q0());
            bj2Var.w0(gi1.M(list));
        } else {
            new vs3().c(list, false, iO0 + 1);
            i(yn2Var, bj2Var, gi1.M(list));
        }
    }

    public static void h(ao2 ao2Var, int i, List list, List list2) {
        qi3 qi3VarB = ao2Var.b();
        if (qi3VarB == null || list.isEmpty()) {
            return;
        }
        int iMax = Math.max(0, Math.min(i, qi3VarB.Q0()));
        new vs3().c(list, false, iMax);
        qi3VarB.N0(list2, iMax);
    }

    public static void i(yn2 yn2Var, qi3 qi3Var, List list) {
        if (list.isEmpty()) {
            return;
        }
        int iO0 = qi3Var.o0() + 1;
        yn2Var.a(iO0, list.size(), list.size() + qi3Var.Q0());
        qi3Var.N0(list, iO0);
    }

    public static void j(bl2 bl2Var, li3 li3Var) {
        bl2Var.f(new lg1(0, bl2Var, new om1(9, li3Var)), gq0.n);
    }

    public static void k(ao2 ao2Var, final int i, final int i2) {
        qi3 qi3VarB = ao2Var.b();
        if (qi3VarB == null) {
            Log.d("MediaManager", "removeRange: queue target gone");
            return;
        }
        qi3VarB.P(i, i2);
        final vs3 vs3Var = new vs3();
        vs3.b.execute(new Runnable() { // from class: us3
            @Override // java.lang.Runnable
            public final void run() {
                ns3 ns3Var = vs3Var.a;
                List listC = ns3Var.c();
                int i3 = i;
                if (i3 >= 0) {
                    int size = listC.size();
                    int i4 = i2;
                    if (i4 > size || i3 >= i4) {
                        return;
                    }
                    listC.subList(i3, i4).clear();
                    int i5 = 0;
                    for (int i6 = 0; i6 < listC.size(); i6++) {
                        ((Queue) listC.get(i6)).setTrackOrder(i6);
                    }
                    xl.E((s24) ns3Var.o, false, true, new ls3(ns3Var, listC, i5));
                }
            }
        });
    }

    public static void l(gn2 gn2Var) {
        if (gn2Var == null || ot1.c(gn2Var.a)) {
            return;
        }
        new Thread(new lg1(7, AppDatabase.y().v(), new Chronology(gn2Var))).start();
    }

    public static void m(gn2 gn2Var, boolean z) {
        if ((gn2Var == null || !ot1.c(gn2Var.a)) && gn2Var != null) {
            do2 do2Var = gn2Var.d;
            if (do2Var.I == null || !xa3.u("scrobbling", true)) {
                return;
            }
            String string = do2Var.I.getString("id");
            gp3 gp3VarE = App.f(false).e();
            gp3VarE.getClass();
            Log.d("MediaAnnotationClient", "scrobble()");
            ((zi2) gp3VarE.p).d(((pn4) gp3VarE.o).f(), string, Boolean.valueOf(z)).enqueue(new xi4(0));
        }
    }

    public static void n(gn2 gn2Var, long j) {
        if (gn2Var == null) {
            return;
        }
        String str = gn2Var.a;
        do2 do2Var = gn2Var.d;
        Bundle bundle = do2Var.I;
        String string = bundle != null ? bundle.getString("type") : null;
        long j2 = ((long) (bundle != null ? bundle.getInt("duration") : 0)) * 1000;
        if (WaveOrigin.RADIO.equals(string) || "video".equals(string)) {
            return;
        }
        vs3.b.execute(new ss3(new vs3(), str, j, 0));
        if ("podcast".equals(string) || "audiobook".equals(string) || ("music".equals(string) && j2 > 600000)) {
            CharSequence charSequence = do2Var.a;
            String string2 = charSequence != null ? charSequence.toString() : null;
            CharSequence charSequence2 = do2Var.c;
            String string3 = charSequence2 != null ? charSequence2.toString() : null;
            CharSequence charSequence3 = do2Var.b;
            String string4 = charSequence3 != null ? charSequence3.toString() : null;
            String string5 = bundle != null ? bundle.getString("albumId") : null;
            String string6 = bundle != null ? bundle.getString("coverArtId") : null;
            str.getClass();
            if (!qm4.u0(str) && j > 0) {
                Map mapA = ud3.A();
                mapA.put(str, new sp3(str, j, string2, string3, string4, string5, string6, string, System.currentTimeMillis()));
                ud3.N0(mapA);
            }
            new vs3();
            if (j <= 5000) {
                return;
            }
            rm3 rm3VarB = App.f(false).b();
            rm3VarB.getClass();
            Log.d("BookmarksClient", "createBookmark() id=" + str + " position=" + j);
            ((mt) rm3VarB.o).b(((pn4) rm3VarB.n).f(), str, j).enqueue(new e20(str, j));
        }
    }

    public static void o(ic2 ic2Var, List list, int i) {
        p(ic2Var, list, i, 0L);
    }

    public static void p(ic2 ic2Var, List list, int i, long j) {
        Map map;
        v01 v01Var = v01.n;
        kd3 kd3Var = rs1.m;
        rs1.m = null;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = kd3Var != null && kd3Var.n == list;
        if (z) {
            kd3Var.getClass();
            map = (Map) kd3Var.o;
        } else {
            map = v01Var;
        }
        rs1.n = map;
        rs1.o = z ? rs1.p : v01Var;
        rs1.p = v01Var;
        WeakReference weakReference = b.a;
        final Map map2 = rs1.n;
        map2.getClass();
        Handler handler = io1.b;
        handler.post(new Runnable() { // from class: zs1
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                Map map3 = map2;
                switch (i4) {
                    case 0:
                        SmartSession smartSession = a.b;
                        if (smartSession != null) {
                            Collection collectionValues = map3.values();
                            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                Iterator it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    if (h12.c((String) it.next(), smartSession.getRecContext())) {
                                        break;
                                    }
                                }
                            }
                            a.b = null;
                            a.d();
                            a.c();
                            break;
                        }
                        break;
                    default:
                        WaveSession waveSession = b.b;
                        if (waveSession != null) {
                            Collection collectionValues2 = map3.values();
                            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                                Iterator it2 = collectionValues2.iterator();
                                while (it2.hasNext()) {
                                    if (h12.c((String) it2.next(), waveSession.getContext())) {
                                        break;
                                    }
                                }
                            }
                            b.b = null;
                            b.e();
                            break;
                        }
                        break;
                }
            }
        });
        WeakReference weakReference2 = a.a;
        final Map map3 = rs1.n;
        map3.getClass();
        handler.post(new Runnable() { // from class: zs1
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i2;
                Map map4 = map3;
                switch (i4) {
                    case 0:
                        SmartSession smartSession = a.b;
                        if (smartSession != null) {
                            Collection collectionValues = map4.values();
                            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                Iterator it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    if (h12.c((String) it.next(), smartSession.getRecContext())) {
                                        break;
                                    }
                                }
                            }
                            a.b = null;
                            a.d();
                            a.c();
                            break;
                        }
                        break;
                    default:
                        WaveSession waveSession = b.b;
                        if (waveSession != null) {
                            Collection collectionValues2 = map4.values();
                            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                                Iterator it2 = collectionValues2.iterator();
                                while (it2.hasNext()) {
                                    if (h12.c((String) it2.next(), waveSession.getContext())) {
                                        break;
                                    }
                                }
                            }
                            b.b = null;
                            b.e();
                            break;
                        }
                        break;
                }
            }
        });
        if (u52.r(list, "replace", i, j) || ic2Var == null) {
            return;
        }
        ic2Var.f(new us1(ic2Var, list, i, j, 1), gq0.n);
    }

    public static void q(ic2 ic2Var, List list, int i, String str) {
        String str2;
        rs1 rs1Var = rs1.a;
        list.getClass();
        ux3 ux3Var = k62.c;
        Set set = v13.a;
        if (str.equals("playlist") || xm4.k0(str, "playlist:", false)) {
            str2 = "nd_playlist";
        } else {
            str2 = v13.a.contains(str) ? str : null;
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        k62 k62Var = new k62(string, gi1.b0(str2));
        rs1 rs1Var2 = rs1.a;
        int iW = lg2.W(r40.k0(list, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Child child = (Child) it.next();
            String id = child.getId();
            Set set2 = v13.a;
            linkedHashMap.put(id, v13.b(str, (String) rs1.n.get(child.getId())));
        }
        int iW2 = lg2.W(r40.k0(list, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW2 >= 16 ? iW2 : 16);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Child child2 = (Child) it2.next();
            String id2 = child2.getId();
            Set set3 = v13.a;
            String str3 = (String) rs1.n.get(child2.getId());
            k62 k62Var2 = (k62) rs1.o.get(child2.getId());
            if (v13.b(str, str3).equals(str) || k62Var2 == null) {
                k62Var2 = k62Var;
            }
            linkedHashMap2.put(id2, k62Var2);
        }
        rs1.m = new kd3(list, linkedHashMap);
        rs1.p = linkedHashMap2;
        o(ic2Var, list, i);
    }
}
