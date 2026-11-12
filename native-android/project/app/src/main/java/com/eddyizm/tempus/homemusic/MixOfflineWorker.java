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
    public static final Object e = null;

    static {
        e = new Object();
    }

    public MixOfflineWorker(Context r1, WorkerParameters r2) {
        r1.getClass();
        r2.getClass();
        super(r1, r2);
    }

    @Override // androidx.work.Worker
    public final nc2 d() {
        if (xa3.u("homemusic_mix_offline", true) == false) goto L27;
        if (pt0.c() == false) goto L27;
        if (ud3.o() == null) goto L12;
        return new mc2();
    L12:
        if (jp1.b() == true) goto L14;
        Object r0 = e;     // Catch: Exception -> L23
        monitor-enter(r0);     // Catch: Exception -> L23
        nc2 r3 = e();     // Catch: Throwable -> L20
        monitor-exit(r0);     // Catch: Exception -> L23
        return r3;
    L20:
        th = move-exception;
        throw th;     // Catch: Exception -> L23
    L23:
        e = move-exception;
        Log.d("MixOffline", "mix download: " + e.getMessage());
        return new lc2();
    L14:
        return new lc2();
    L27:
        return new mc2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [u01] */
    public final nc2 e() {
        int r1 = 0;
        HubMix r0 = ((HubMixToday) rr1.d(new or1(0), new or1(1))).getMix();
        if (r0 == null) goto L5;
        String r2 = r0.getNdPlaylistId();
        if (r2 == null) goto L164;
        if (qm4.u0(r2) == false) goto L12;
        r2 = null;
    L12:
        if (r2 == null) goto L164;
        pn4 r4 = App.f(false);
        ApiResponse r3 = (ApiResponse) r4.g().F(r2).execute().body();
        if (r3 == null) goto L28;
        SubsonicResponse r5 = r3.getSubsonicResponse();
        if (r5 == null) goto L28;
        PlaylistWithSongs r6 = r5.getPlaylist();
        if (r6 == null) goto L28;
        List<Child> r7 = r6.getEntries();
        if (r7 == null) goto L28;
        ?? r8 = new ArrayList();
        Iterator r9 = r7.iterator();
    L24:
        if (r9.hasNext() == false) goto L29;
        Object r10 = r9.next();
        if (ot1.c(((Child) r10).getId()) == true) goto L24;
        r8.add(r10);
    L29:
        if (r8 != 0) goto L32;
        r8 = u01.n;
    L32:
        if (r8.isEmpty() == true) goto L34;
        ApiResponse r11 = (ApiResponse) r4.a().s().execute().body();
        if (r11 == null) goto L162;
        SubsonicResponse r12 = r11.getSubsonicResponse();
        if (r12 == null) goto L162;
        Starred2 r13 = r12.getStarred2();
        if (r13 == null) goto L162;
        List<Child> r14 = r13.getSongs();
        if (r14 == null) goto L162;
        ArrayList r15 = new ArrayList(r40.k0(r14, 10));
        Iterator r16 = r14.iterator();
    L45:
        if (r16.hasNext() == false) goto L47;
        r15.add(((Child) r16.next()).getId());
        goto L45
    L47:
        Set r17 = q40.T0(r15);
        Context r18 = this.a;
        eu0 r19 = au0.w(r18);
        ow2 r110 = gi1.E();
        Set r111 = r110.b;
        ArrayList r112 = new ArrayList(r40.k0(r8, 10));
        Iterator r113 = r8.iterator();
    L49:
        if (r113.hasNext() == false) goto L51;
        r112.add(((Child) r113.next()).getId());
        goto L49
    L51:
        Set r114 = r111;
        ArrayList r115 = q40.G0(r112, r114);
        ArrayList r116 = new ArrayList();
        int r117 = r115.size();
    L52:
        if (r1 >= r117) goto L56;
        Object r20 = r115.get(r1);
        r1 = r1 + 1;
        r19.getClass();
        if (eu0.d((String) r20) == false) goto L52;
        r116.add(r20);
        goto L52
    L56:
        Set r21 = q40.T0(r116);
        long r118 = r0.getId();
        Set r22 = q40.T0(r112);
        ArrayList r119 = new ArrayList();
        Iterator r120 = r114.iterator();
    L58:
        if (r120.hasNext() == false) goto L65;
        Object r23 = r120.next();
        String r24 = (String) r23;
        if (r22.contains(r24) == true) goto L58;
        if (r17.contains(r24) == true) goto L58;
        r119.add(r23);
        goto L58
    L65:
        ArrayList r25 = new ArrayList();
        Iterator r26 = r114.iterator();
    L67:
        if (r26.hasNext() == false) goto L72;
        Object r27 = r26.next();
        if (r22.contains((String) r27) == false) goto L67;
        r25.add(r27);
        goto L67
    L72:
        if (r110.a != r118) goto L74;
        Set r28 = r110.c;
    L75:
        ArrayList r29 = new ArrayList();
        int r30 = r112.size();
        int r121 = 0;
    L76:
        if (r121 >= r30) goto L83;
        Object r122 = r112.get(r121);
        r121 = r121 + 1;
        HubMix r123 = r0;
        String r31 = (String) r122;
        if (r21.contains(r31) == true) goto L82;
        if (r28.contains(r31) == true) goto L82;
        r29.add(r122);
    L82:
        r0 = r123;
        goto L76
    L83:
        HubMix r124 = r0;
        List r32 = q40.t0(r29);
        Set r33 = q40.T0(r25);
        ow2 r34 = new ow2(r118, r33, r28);
        Log.i("MixOffline", "mix " + r124.getId() + ": download " + r32.size() + ", remove " + r119.size() + ", kept " + r33.size());
        r19.getClass();
        ss0 r35 = AppDatabase.y().w();
        int r36 = r119.size();
        int r37 = 0;
    L84:
        if (r37 >= r36) goto L93;
        int r125 = r37 + 1;
        pb0 r38 = new pb0(r35, (String) r119.get(r37), 1);
        Thread r126 = new Thread(r38);
        r126.start();
        r126.join();     // Catch: InterruptedException -> L88
        Download r39 = (Download) r38.q;     // Catch: InterruptedException -> L88
    L90:
        if (r39 == null) goto L91;
        r19.e(gi1.G(r39), r39);
    L91:
        r37 = r125;
    L88:
        e = move-exception;
        e.printStackTrace();
        r39 = null;
        goto L90
    L93:
        gi1.V(r34);
        int r40 = lg2.W(r40.k0(r8, 10));
        if (r40 >= 16) goto L96;
        r40 = 16;
    L96:
        LinkedHashMap r41 = new LinkedHashMap(r40);
        Iterator r42 = r8.iterator();
    L98:
        if (r42.hasNext() == false) goto L100;
        Object r43 = r42.next();
        r41.put(((Child) r43).getId(), r43);
        goto L98
    L100:
        File r44 = r18.getExternalFilesDir(null);
        if (r44 != null) goto L103;
        r44 = r18.getFilesDir();
    L103:
        Iterator r45 = r32.iterator();
    L105:
        if (r45.hasNext() == false) goto L160;
        String r46 = (String) r45.next();
        Child r47 = (Child) r41.get(r46);
        if (r47 == null) goto L105;
        if (b() == true) goto L158;
        if (jp1.b() == true) goto L158;
        if (eu0.e.contains(r46) == true) goto L105;
        long r127 = r44.getUsableSpace();
        Long r128 = r47.getSize();
        if (r128 == null) goto L119;
        long r129 = r128.longValue();
    L121:
        if ((r127 - r129) < 2147483648L) goto L155;
        ow2 r130 = new ow2(r34.a, kb4.Q(r34.b, r46), kb4.Q(r34.c, r46));
        gi1.V(r130);
        if (r19.b(gi1.G(r47), new Download(r47), true) == false) goto L125;
        long r131 = System.currentTimeMillis() + 300000;
    L128:
        if (System.currentTimeMillis() >= r131) goto L146;
        Integer r48 = eu0.c(r46);
        if (r48 != null) goto L133;
    L134:
        if (r48 == null) goto L140;
        if (r48.intValue() != 4) goto L140;
    L145:
        r34 = r130;
    L140:
        if (b() == true) goto L146;
        if (jp1.b() == true) goto L146;
        Thread.sleep(1000);
        goto L128
    L133:
        if (r48.intValue() == 3) goto L145;
    L146:
        pb0 r49 = new pb0(AppDatabase.y().w(), r46, 1);
        Thread r50 = new Thread(r49);
        r50.start();
        r50.join();     // Catch: InterruptedException -> L149
        Download r51 = (Download) r49.q;     // Catch: InterruptedException -> L149
    L151:
        if (r51 == null) goto L153;
        r19.e(gi1.G(r51), r51);
    L153:
        LinkedHashSet r52 = kb4.K(r130.b, r46);
        LinkedHashSet r132 = kb4.K(r130.c, r46);
        App.b().getClass();
        App.c().edit().putString("homemusic_mix_offline_state", q40.B0(gb.P(new String[]{String.valueOf(r130.a), q40.B0(r52, ",", null, null, null, 62), q40.B0(r132, ",", null, null, null, 62)}), "\n", null, null, null, 62)).apply();
        return new lc2();
    L149:
        e = move-exception;
        e.printStackTrace();
        r51 = null;
        goto L151
    L125:
        return new lc2();
    L155:
        Log.i("MixOffline", "mix: no room left");
        return new mc2();
    L119:
        r129 = 0;
    L158:
        return new lc2();
    L160:
        return new mc2();
    L74:
        r28 = z01.n;
    L162:
        return new lc2();
    L34:
        return new mc2();
    L28:
        r8 = 0;
    L164:
        return new mc2();
    L5:
        return new mc2();
    }
}
