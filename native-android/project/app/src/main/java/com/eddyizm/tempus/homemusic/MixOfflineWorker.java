package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PlaylistWithSongs;
import com.eddyizm.tempus.subsonic.models.Starred2;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import defpackage.au0;
import defpackage.eu0;
import defpackage.gb;
import defpackage.gi1;
import defpackage.jp1;
import defpackage.kb4;
import defpackage.lc2;
import defpackage.lg2;
import defpackage.mc2;
import defpackage.nc2;
import defpackage.or1;
import defpackage.ot1;
import defpackage.ow2;
import defpackage.pb0;
import defpackage.pn4;
import defpackage.pt0;
import defpackage.q40;
import defpackage.qm4;
import defpackage.r40;
import defpackage.rr1;
import defpackage.ss0;
import defpackage.u01;
import defpackage.ud3;
import defpackage.xa3;
import defpackage.z01;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MixOfflineWorker extends Worker {
    public static final Object e = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MixOfflineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final nc2 d() {
        nc2 nc2VarE;
        if (!xa3.u("homemusic_mix_offline", true) || !pt0.c()) {
            return new mc2();
        }
        if (ud3.o() != null) {
            return new mc2();
        }
        if (jp1.b()) {
            return new lc2();
        }
        try {
            synchronized (e) {
                nc2VarE = e();
            }
            return nc2VarE;
        } catch (Exception e2) {
            Log.d("MixOffline", "mix download: " + e2.getMessage());
            return new lc2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [u01] */
    public final nc2 e() throws InterruptedException {
        ?? arrayList;
        SubsonicResponse subsonicResponse;
        Starred2 starred2;
        List<Child> songs;
        Download download;
        Download download2;
        SubsonicResponse subsonicResponse2;
        PlaylistWithSongs playlist;
        List<Child> entries;
        int i = 0;
        HubMix mix = ((HubMixToday) rr1.d(new or1(0), new or1(1))).getMix();
        if (mix == null) {
            return new mc2();
        }
        String ndPlaylistId = mix.getNdPlaylistId();
        if (ndPlaylistId != null) {
            if (qm4.u0(ndPlaylistId)) {
                ndPlaylistId = null;
            }
            if (ndPlaylistId != null) {
                pn4 pn4VarF = App.f(false);
                ApiResponse apiResponse = (ApiResponse) pn4VarF.g().F(ndPlaylistId).execute().body();
                if (apiResponse == null || (subsonicResponse2 = apiResponse.getSubsonicResponse()) == null || (playlist = subsonicResponse2.getPlaylist()) == null || (entries = playlist.getEntries()) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : entries) {
                        if (!ot1.c(((Child) obj).getId())) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList == 0) {
                    arrayList = u01.n;
                }
                if (arrayList.isEmpty()) {
                    return new mc2();
                }
                ApiResponse apiResponse2 = (ApiResponse) pn4VarF.a().s().execute().body();
                if (apiResponse2 == null || (subsonicResponse = apiResponse2.getSubsonicResponse()) == null || (starred2 = subsonicResponse.getStarred2()) == null || (songs = starred2.getSongs()) == null) {
                    return new lc2();
                }
                ArrayList arrayList2 = new ArrayList(r40.k0(songs, 10));
                Iterator it = songs.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Child) it.next()).getId());
                }
                Set setT0 = q40.T0(arrayList2);
                Context context = this.a;
                eu0 eu0VarW = au0.w(context);
                ow2 ow2VarE = gi1.E();
                Set set = ow2VarE.b;
                ArrayList arrayList3 = new ArrayList(r40.k0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((Child) it2.next()).getId());
                }
                Set set2 = set;
                ArrayList arrayListG0 = q40.G0(arrayList3, set2);
                ArrayList arrayList4 = new ArrayList();
                int size = arrayListG0.size();
                while (i < size) {
                    Object obj2 = arrayListG0.get(i);
                    i++;
                    eu0VarW.getClass();
                    if (eu0.d((String) obj2)) {
                        arrayList4.add(obj2);
                    }
                }
                Set setT1 = q40.T0(arrayList4);
                long id = mix.getId();
                Set setT2 = q40.T0(arrayList3);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : set2) {
                    String str = (String) obj3;
                    if (!setT2.contains(str) && !setT0.contains(str)) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : set2) {
                    if (setT2.contains((String) obj4)) {
                        arrayList6.add(obj4);
                    }
                }
                Set set3 = ow2VarE.a == id ? ow2VarE.c : z01.n;
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj5 = arrayList3.get(i2);
                    i2++;
                    HubMix hubMix = mix;
                    String str2 = (String) obj5;
                    if (!setT1.contains(str2) && !set3.contains(str2)) {
                        arrayList7.add(obj5);
                    }
                    mix = hubMix;
                }
                HubMix hubMix2 = mix;
                List<String> listT0 = q40.t0(arrayList7);
                Set setT3 = q40.T0(arrayList6);
                ow2 ow2Var = new ow2(id, setT3, set3);
                Log.i("MixOffline", "mix " + hubMix2.getId() + ": download " + listT0.size() + ", remove " + arrayList5.size() + ", kept " + setT3.size());
                eu0VarW.getClass();
                ss0 ss0VarW = AppDatabase.y().w();
                int size3 = arrayList5.size();
                int i3 = 0;
                while (i3 < size3) {
                    int i4 = i3 + 1;
                    pb0 pb0Var = new pb0(ss0VarW, (String) arrayList5.get(i3), 1);
                    Thread thread = new Thread(pb0Var);
                    thread.start();
                    try {
                        thread.join();
                        download2 = (Download) pb0Var.q;
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        download2 = null;
                    }
                    if (download2 != null) {
                        eu0VarW.e(gi1.G(download2), download2);
                    }
                    i3 = i4;
                }
                gi1.V(ow2Var);
                int iW = lg2.W(r40.k0(arrayList, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (Object obj6 : arrayList) {
                    linkedHashMap.put(((Child) obj6).getId(), obj6);
                }
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    externalFilesDir = context.getFilesDir();
                }
                for (String str3 : listT0) {
                    Child child = (Child) linkedHashMap.get(str3);
                    if (child != null) {
                        if (b() || jp1.b()) {
                            return new lc2();
                        }
                        if (!eu0.e.contains(str3)) {
                            long usableSpace = externalFilesDir.getUsableSpace();
                            Long size4 = child.getSize();
                            if (usableSpace - (size4 != null ? size4.longValue() : 0L) < 2147483648L) {
                                Log.i("MixOffline", "mix: no room left");
                                return new mc2();
                            }
                            ow2 ow2Var2 = new ow2(ow2Var.a, kb4.Q(ow2Var.b, str3), kb4.Q(ow2Var.c, str3));
                            gi1.V(ow2Var2);
                            if (!eu0VarW.b(gi1.G(child), new Download(child), true)) {
                                return new lc2();
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis() + 300000;
                            while (true) {
                                if (System.currentTimeMillis() < jCurrentTimeMillis) {
                                    Integer numC = eu0.c(str3);
                                    if ((numC != null && numC.intValue() == 3) || (numC != null && numC.intValue() == 4)) {
                                        ow2Var = ow2Var2;
                                    } else if (!b() && !jp1.b()) {
                                        Thread.sleep(1000L);
                                    }
                                }
                                pb0 pb0Var2 = new pb0(AppDatabase.y().w(), str3, 1);
                                Thread thread2 = new Thread(pb0Var2);
                                thread2.start();
                                try {
                                    thread2.join();
                                    download = (Download) pb0Var2.q;
                                } catch (InterruptedException e3) {
                                    e3.printStackTrace();
                                    download = null;
                                }
                                if (download != null) {
                                    eu0VarW.e(gi1.G(download), download);
                                }
                                LinkedHashSet linkedHashSetK = kb4.K(ow2Var2.b, str3);
                                LinkedHashSet linkedHashSetK2 = kb4.K(ow2Var2.c, str3);
                                App.b().getClass();
                                App.c().edit().putString("homemusic_mix_offline_state", q40.B0(gb.P(String.valueOf(ow2Var2.a), q40.B0(linkedHashSetK, ",", null, null, null, 62), q40.B0(linkedHashSetK2, ",", null, null, null, 62)), "\n", null, null, null, 62)).apply();
                                return new lc2();
                            }
                        }
                    }
                }
                return new mc2();
            }
        }
        return new mc2();
    }
}
