package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.ao2;
import defpackage.b02;
import defpackage.bo2;
import defpackage.gb;
import defpackage.gi1;
import defpackage.gn2;
import defpackage.i02;
import defpackage.io1;
import defpackage.is3;
import defpackage.j02;
import defpackage.k6;
import defpackage.k62;
import defpackage.kd3;
import defpackage.lg2;
import defpackage.ms1;
import defpackage.q40;
import defpackage.qi3;
import defpackage.qm4;
import defpackage.r40;
import defpackage.rs1;
import defpackage.rs3;
import defpackage.t6;
import defpackage.u01;
import defpackage.u52;
import defpackage.u6;
import defpackage.ur1;
import defpackage.ut1;
import defpackage.ux3;
import defpackage.v01;
import defpackage.v6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static WeakReference a = new WeakReference(null);
    public static WaveSession b;
    public static u6 c;
    public static long d;

    public static ArrayList a(qi3 qi3Var, WaveSession waveSession) {
        int iO0 = qi3Var.o0();
        int i = 0;
        if (iO0 < 0) {
            iO0 = 0;
        }
        j02 j02VarG0 = gb.g0(iO0 + 1, qi3Var.Q0());
        ArrayList arrayList = new ArrayList(r40.k0(j02VarG0, 10));
        Iterator it = j02VarG0.iterator();
        while (((i02) it).p) {
            int iNextInt = ((b02) it).nextInt();
            arrayList.add(new kd3(Integer.valueOf(iNextInt), qi3Var.Y(iNextInt).a));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (waveSession.isWave((String) ((kd3) obj).o)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static void b(WaveSession waveSession, List list) {
        qi3 qi3VarJ;
        ao2 ao2Var = (ao2) a.get();
        if (ao2Var == null || (qi3VarJ = j(waveSession)) == null) {
            return;
        }
        ArrayList arrayListA = a(qi3VarJ, waveSession);
        WavePlan.Companion companion = WavePlan.Companion;
        ArrayList arrayList = new ArrayList(r40.k0(arrayListA, 10));
        int size = arrayListA.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = "";
            if (i2 >= size) {
                break;
            }
            Object obj = arrayListA.get(i2);
            i2++;
            String strRefOf = waveSession.refOf((String) ((kd3) obj).o);
            if (strRefOf != null) {
                str = strRefOf;
            }
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String ref = ((ut1) it.next()).a.getRef();
            if (ref == null) {
                ref = "";
            }
            arrayList2.add(ref);
        }
        WavePlan wavePlanOf = companion.of(arrayList, arrayList2);
        List<Integer> add = wavePlanOf.getAdd();
        ArrayList arrayList3 = new ArrayList(r40.k0(add, 10));
        Iterator<T> it2 = add.iterator();
        while (it2.hasNext()) {
            arrayList3.add((ut1) list.get(((Number) it2.next()).intValue()));
        }
        String id = waveSession.getId();
        ArrayList arrayList4 = new ArrayList(r40.k0(arrayListA, 10));
        int size2 = arrayListA.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayListA.get(i3);
            i3++;
            arrayList4.add(waveSession.refOf((String) ((kd3) obj2).o));
        }
        ArrayList arrayList5 = new ArrayList(r40.k0(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((ut1) it3.next()).a.getRef());
        }
        Log.i("HubWave", "next " + id + ": ahead " + arrayList4 + " → " + arrayList5 + " (kept " + wavePlanOf.getKeep() + ")");
        if (wavePlanOf.getRemove().isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ArrayList arrayList6 = new ArrayList(r40.k0(arrayListA, 10));
        int size3 = arrayListA.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayListA.get(i4);
            i4++;
            arrayList6.add(Integer.valueOf(((Number) ((kd3) obj3).n).intValue()));
        }
        int iInsertAt = wavePlanOf.insertAt(arrayList6, qi3VarJ.Q0());
        Iterator it4 = q40.H0(wavePlanOf.getRemove()).iterator();
        while (it4.hasNext()) {
            int iIntValue = ((Number) ((kd3) arrayListA.get(((Number) it4.next()).intValue())).n).intValue();
            bo2.k(ao2Var, iIntValue, iIntValue + 1);
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        ArrayList arrayList7 = new ArrayList(r40.k0(arrayList3, 10));
        int size4 = arrayList3.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList3.get(i5);
            i5++;
            arrayList7.add(((ut1) obj4).a);
        }
        waveSession.register(arrayList7);
        rs1 rs1Var = rs1.a;
        Set<String> setIds = waveSession.ids();
        int iW = lg2.W(r40.k0(setIds, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj5 : setIds) {
            linkedHashMap.put(obj5, waveSession.getContext());
        }
        rs1.b(linkedHashMap, g(waveSession));
        boolean z = qi3VarJ.g() == 4 && SystemClock.elapsedRealtime() - d > 300000;
        ArrayList arrayList8 = new ArrayList(r40.k0(arrayList3, 10));
        int size5 = arrayList3.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList3.get(i6);
            i6++;
            arrayList8.add(((ut1) obj6).b);
        }
        ArrayList arrayList9 = new ArrayList(r40.k0(arrayList3, 10));
        int size6 = arrayList3.size();
        while (i < size6) {
            Object obj7 = arrayList3.get(i);
            i++;
            arrayList9.add(((ut1) obj7).c);
        }
        bo2.h(ao2Var, iInsertAt, arrayList8, arrayList9);
        if (z) {
            return;
        }
        is3.b(qi3VarJ, iInsertAt, arrayList3.size());
    }

    public static void c() {
        WaveSession waveSession = b;
        if (waveSession == null) {
            return;
        }
        if (waveSession.getInFlight()) {
            waveSession.setAgain(true);
            return;
        }
        qi3 qi3VarJ = j(waveSession);
        if (qi3VarJ == null) {
            return;
        }
        e();
        ArrayList arrayListA = a(qi3VarJ, waveSession);
        ArrayList arrayList = new ArrayList(r40.k0(arrayListA, 10));
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            arrayList.add((String) ((kd3) obj).o);
        }
        WaveNextIn waveNextInSnapshot = waveSession.snapshot(arrayList);
        String id = waveSession.getId();
        gn2 gn2VarA = qi3VarJ.a();
        waveSession.setAskedFor(gn2VarA != null ? gn2VarA.a : null);
        waveSession.setInFlight(true);
        waveSession.setAgain(false);
        io1.a.execute(new v6(waveNextInSnapshot, id, waveSession, 20));
    }

    public static void d(View view, Child child, final Runnable runnable, final boolean z, final boolean z2) {
        final Map<String, String> mapTrack;
        if (view == null) {
            return;
        }
        if (z) {
            child.getClass();
            mapTrack = WaveSeeds.INSTANCE.artist(child.getId(), child.getArtistId());
        } else {
            child.getClass();
            mapTrack = WaveSeeds.INSTANCE.track(child.getId());
        }
        if (!ur1.b(child) || mapTrack == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: tt1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    ExecutorService executorService = ur1.a;
                    MainActivity mainActivityA = ur1.a(view2.getContext());
                    runnable.run();
                    if (mainActivityA != null) {
                        WeakReference weakReference = b.a;
                        if (z2) {
                            str = WaveOrigin.PLAYER;
                        } else {
                            str = z ? WaveOrigin.ARTIST_MENU : WaveOrigin.TRACK_MENU;
                        }
                        b.l(mainActivityA, mapTrack, null, str);
                    }
                }
            });
        }
    }

    public static void e() {
        u6 u6Var = c;
        if (u6Var != null) {
            io1.b.removeCallbacks(u6Var);
        }
        c = null;
    }

    public static void f(WaveSession waveSession) {
        qi3 qi3VarJ = j(waveSession);
        if (qi3VarJ == null) {
            return;
        }
        rs3 rs3Var = rs3.a;
        Context contextA = App.a();
        contextA.getClass();
        rs3Var.c(contextA, qi3VarJ);
    }

    public static Map g(WaveSession waveSession) {
        ux3 ux3Var = k62.c;
        k62 k62VarP = gi1.P(waveSession.getContext(), WaveOrigin.WAVE);
        if (k62VarP == null) {
            return v01.n;
        }
        Set<String> setIds = waveSession.ids();
        int iW = lg2.W(r40.k0(setIds, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : setIds) {
            linkedHashMap.put(obj, k62VarP);
        }
        return linkedHashMap;
    }

    public static final boolean h(qi3 qi3Var) {
        qi3Var.getClass();
        WaveSession waveSession = b;
        if (waveSession != null) {
            gn2 gn2VarA = qi3Var.a();
            if (waveSession.isWave(gn2VarA != null ? gn2VarA.a : null)) {
                return true;
            }
        }
        return false;
    }

    public static void i(MainActivity mainActivity, WaveOut waveOut) {
        mainActivity.getClass();
        waveOut.getClass();
        String sessionId = waveOut.getSessionId();
        if (sessionId == null || qm4.u0(sessionId)) {
            sessionId = null;
        }
        List<WaveTrack> tracks = waveOut.getTracks();
        if (tracks == null) {
            tracks = u01.n;
        }
        if (sessionId == null || tracks.isEmpty()) {
            Toast.makeText(mainActivity, R.string.homemusic_wave_empty, 0).show();
            return;
        }
        e();
        WaveSession waveSession = new WaveSession(sessionId, waveOut.getTitle(), waveOut.getSeed(), waveOut.getMode());
        waveSession.register(tracks);
        b = waveSession;
        ExecutorService executorService = ms1.a;
        ArrayList arrayList = new ArrayList(r40.k0(tracks, 10));
        Iterator<T> it = tracks.iterator();
        while (it.hasNext()) {
            arrayList.add(((WaveTrack) it.next()).item(waveSession.getContext()));
        }
        ms1.a(mainActivity, arrayList, 0, null);
    }

    public static qi3 j(WaveSession waveSession) {
        ao2 ao2Var;
        qi3 qi3VarB;
        if (!u52.c().a && (ao2Var = (ao2) a.get()) != null && (qi3VarB = ao2Var.b()) != null) {
            gn2 gn2VarA = qi3VarB.a();
            if (waveSession.isWave(gn2VarA != null ? gn2VarA.a : null)) {
                return qi3VarB;
            }
        }
        return null;
    }

    public static ArrayList k(String str, List list) {
        gn2 gn2Var;
        ArrayList arrayList = new ArrayList(r40.k0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WaveTrack) it.next()).item(str));
        }
        ExecutorService executorService = ms1.a;
        ArrayList arrayListB = ms1.b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            int i3 = i + 1;
            ut1 ut1Var = null;
            if (i < 0) {
                gb.c0();
                throw null;
            }
            Child child = (Child) obj;
            if (child != null && (gn2Var = (gn2) q40.x0(gi1.M(gb.O(child)))) != null) {
                ut1Var = new ut1((WaveTrack) list.get(i), child, gn2Var);
            }
            if (ut1Var != null) {
                arrayList2.add(ut1Var);
            }
            i = i3;
        }
        return arrayList2;
    }

    public static void l(MainActivity mainActivity, Map map, k6 k6Var, String str) {
        mainActivity.getClass();
        Toast.makeText(mainActivity, R.string.homemusic_wave_starting, 0).show();
        io1.a.execute(new t6(map, str, mainActivity, k6Var, 10));
    }

    public static final void m(MainActivity mainActivity, String str, String str2) {
        mainActivity.getClass();
        if (qm4.u0(str)) {
            return;
        }
        Map mapSingletonMap = Collections.singletonMap("nd_artist_id", str);
        mapSingletonMap.getClass();
        l(mainActivity, mapSingletonMap, null, str2);
    }
}
