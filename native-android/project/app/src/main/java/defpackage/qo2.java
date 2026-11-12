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
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ qo2(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r3 = 17;
        int r4 = 14;
        int r5 = 10;
        int r6 = 1;
        boolean r7 = true;
        int r8 = 0;
        switch(this.n) {
            case 0: goto L216;
            case 1: goto L210;
            case 2: goto L206;
            case 3: goto L204;
            case 4: goto L202;
            case 5: goto L200;
            case 6: goto L195;
            case 7: goto L185;
            case 8: goto L183;
            case 9: goto L175;
            case 10: goto L170;
            case 11: goto L155;
            case 12: goto L150;
            case 13: goto L134;
            case 14: goto L98;
            case 15: goto L96;
            case 16: goto L90;
            case 17: goto L72;
            case 18: goto L63;
            case 19: goto L61;
            case 20: goto L14;
            case 21: goto L12;
            default: goto L4;
        };
    L4:
        AtomicBoolean r1 = (AtomicBoolean) this.o;
        oy r2 = (oy) this.p;
        gf1 r0 = (gf1) this.q;
        if (r1.get() == true) goto L259;
        r2.a(r0.invoke());     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        r2.b(th);
        return;
    L259:
        return;
    L12:
        rm3 r9 = (rm3) this.o;
        ((pq3) r9.n).g((gl4) this.p, (z45) this.q);
        return;
    L14:
        bl2 r10 = (bl2) this.o;
        String r11 = (String) this.p;
        Context r12 = (Context) this.q;
    L30:
        e = e;
    L59:
        Log.e("TempoWidget", "dispatch failed", e);
        return;
    L32:
        e = e;
        goto L59
    L16:
        if (r10.isDone() == false) goto L261;
        sk2 r13 = (sk2) r10.get();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        Log.d("TempoWidget", "controller connected, isPlaying=" + r13.h0());     // Catch: InterruptedException -> L30 ExecutionException -> L32
        switch(r11.hashCode()) {
            case -1515577246: goto L47;
            case -10242334: goto L41;
            case 837569034: goto L38;
            case 837640522: goto L35;
            case 1859223282: goto L22;
            default: goto L57;
        };     // Catch: InterruptedException -> L30 ExecutionException -> L32
    L57:
        ji2.I(r12);     // Catch: InterruptedException -> L30 ExecutionException -> L32
        r13.Y0();     // Catch: InterruptedException -> L30 ExecutionException -> L32
    L262:
        return;
    L22:
        if (r11.equals("tempo.widget.REPEAT") == false) goto L57;
        int r14 = r13.h();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        if (r14 != 0) goto L26;
        r6 = 2;
    L29:
        r13.p0(r6);     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L26:
        if (r14 == 2) goto L29;
        r6 = 0;
        goto L29
    L35:
        if (r11.equals("tempo.widget.PREV") == false) goto L57;
        r13.S();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L38:
        if (r11.equals("tempo.widget.NEXT") == false) goto L57;
        r13.H0();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L41:
        if (r11.equals("tempo.widget.PLAY_PAUSE") == false) goto L57;
        if (r13.h0() == false) goto L45;
        r13.c();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L45:
        r13.m0();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L47:
        if (r11.equals("tempo.widget.SHUFFLE") == false) goto L57;
        qi3 r15 = a.h();     // Catch: InterruptedException -> L30 ExecutionException -> L32
        if (r15 != null) goto L52;
    L55:
        if (r8 != 0) goto L57;
        r13.s(!r13.D0());     // Catch: InterruptedException -> L30 ExecutionException -> L32
        goto L57
    L52:
        if (a.b == null) goto L55;
        io1.b.post(new at1(r15, r8));     // Catch: InterruptedException -> L30 ExecutionException -> L32
        r8 = 1;
        goto L55
    L261:
        return;
    L61:
        rf2 r16 = (rf2) this.o;
        tb1 r17 = (tb1) this.p;
        ej0 r18 = (ej0) this.q;
        o55 r19 = (o55) r16.o;
        String r20 = f35.a;
        r19.s(r17, r18);
        return;
    L63:
        lb4 r21 = (lb4) this.o;
        ur2 r22 = (ur2) this.p;
        ab4 r23 = (ab4) this.q;
    L69:
        th = move-exception;
        r21.m(th);
        return;
    L65:
        if ((r21.n instanceof f0) == true) goto L263;
        r22.run();     // Catch: Throwable -> L69
        r21.l(r23);     // Catch: Throwable -> L69
        return;
    L263:
        return;
    L72:
        ic2 r24 = (ic2) this.o;
        lb4 r25 = (lb4) this.p;
        r25.n(((mk) this.q).apply(hw.j(r24)));     // Catch: Throwable -> L76
        return;
    L76:
        th = move-exception;
        r25.m(th);
        return;
    L78:
        e = e;
    L81:
        r25.m(e);
        return;
    L88:
        r25.cancel(false);
        return;
    L80:
        e = e;
    L82:
        e = e;
        Throwable r26 = e.getCause();
        if (r26 == null) goto L87;
        e = r26;
    L87:
        r25.m(e);
        return;
    L90:
        ns3 r27 = (ns3) this.o;
        Uri r28 = (Uri) this.p;
        lb4 r29 = (lb4) this.q;
        Bitmap r30 = (Bitmap) com.bumptech.glide.a.c((Context) r27.o).g().N(r28).R(512, 512).get();     // Catch: Exception -> L93
        ((LruCache) r27.p).put(r28, r30);     // Catch: Exception -> L93
        r29.l(r30);     // Catch: Exception -> L93
        return;
    L93:
        e = move-exception;
        r29.m(e);
        return;
    L96:
        SongListPageFragment r31 = (SongListPageFragment) this.o;
        ArrayList r32 = (ArrayList) this.p;
        String r33 = (String) this.q;
        ArrayList r34 = new ArrayList(r32);
        Collections.shuffle(r34);
        bo2.q(r31.q0, r34.subList(0, Math.min(SmartPlan.MAX_QUEUE, r34.size())), 0, r33);
        ((au) r31.m0.V.n).d(true);
        return;
    L98:
        List r35 = (List) this.o;
        hx3 r36 = (hx3) this.p;
        Context r37 = (Context) this.q;
        Iterator r38 = r35.iterator();
    L100:
        if (r38.hasNext() == false) goto L122;
        qs3 r39 = (qs3) r38.next();
        if (rs3.c.get() != r36.n) goto L270;
        se4 r40 = au0.D(r37);     // Catch: Exception -> L224
        String r41 = new xi4(r5).d(new ii0(r39.a, 0, 1, null, Collections.EMPTY_MAP, 0, -1, null, 0));     // Catch: Exception -> L224
        long r42 = nd0.a(r40.i(r41));     // Catch: Exception -> L224
        if (r42 != (-1)) goto L115;
        HashSet r110 = rs3.f;     // Catch: Exception -> L224
        monitor-enter(r110);     // Catch: Exception -> L224
        boolean r111 = r110.contains(r41);     // Catch: Throwable -> L112
        monitor-exit(r110);     // Catch: Exception -> L224
        if (r111 == true) goto L115;
    L112:
        th = move-exception;
        throw th;     // Catch: Exception -> L224
    L115:
        long r112 = r39.b;
        if (r42 == (-1)) goto L119;
        r112 = Math.min(r112, r42);     // Catch: Exception -> L224
    L119:
        boolean r43 = r40.j(r41, r112);     // Catch: Exception -> L224
    L120:
        if (r43 == true) goto L100;
        rs3.a.a(r37, r39, r36.n);
    L111:
        r43 = false;
        goto L120
    L270:
        return;
    L122:
        rs3 r44 = rs3.a;
        monitor-enter(r44);
    L128:
        th = move-exception;
        throw th;
    L125:
        if (rs3.c.get() != r36.n) goto L130;
        rs3.e = u01.n;     // Catch: Throwable -> L128
    L130:
        monitor-exit(r44);
        return;
    L134:
        pq3 r45 = (pq3) this.o;
        ry r46 = (ry) this.p;
        td5 r47 = (td5) this.q;
        r7 = ((Boolean) r46.o.get()).booleanValue();     // Catch: Throwable -> L225
    L136:
        Object r48 = r45.k;
        monitor-enter(r48);
        rc5 r49 = q05.m(r47.a);     // Catch: Throwable -> L141
        String r50 = r49.a;     // Catch: Throwable -> L141
        if (r45.c(r50) != r47) goto L143;
        r45.b(r50);     // Catch: Throwable -> L141
    L143:
        cx.f().b(pq3.l, pq3.class.getSimpleName() + " " + r50 + " executed; reschedule = " + r7);     // Catch: Throwable -> L141
        ArrayList r51 = r45.j;     // Catch: Throwable -> L141
        int r52 = r51.size();     // Catch: Throwable -> L141
    L144:
        if (r8 >= r52) goto L146;
        Object r53 = r51.get(r8);     // Catch: Throwable -> L141
        r8 = r8 + 1;     // Catch: Throwable -> L141
        ((w21) r53).b(r49, r7);     // Catch: Throwable -> L141
        goto L144
    L146:
        monitor-exit(r48);     // Catch: Throwable -> L141
        return;
    L141:
        th = move-exception;
        throw th;
    L150:
        r20 r54 = (r20) this.o;
        String r55 = (String) this.p;
        String r56 = (String) this.q;
        mm3 r57 = (mm3) r54.q;
        r57.c.B(r55);
        if (r56 == null) goto L153;
        r57.d.o(r55, r56);
    L153:
        xl.E((s24) r57.b.a, false, true, new rs0(r4, r55));
        Log.d("PlaylistRepository", "Deleted playlist " + r55 + " and its songs from local DB.");
        return;
    L155:
        mm3 r58 = (mm3) this.o;
        Playlist r59 = (Playlist) this.p;
        ArrayList r60 = (ArrayList) this.q;
        String r61 = r59.getId();
        ml3 r62 = r58.b;
        xl.E((s24) r62.a, false, true, new hl3(r62, r59, r8));
        xl.E((s24) r62.a, false, true, new o(23, r59.isUniversal(), r61));
        rm3 r63 = r58.c;
        List r64 = (List) xl.E((s24) r63.n, true, false, new rs0(r3, r61));
        if (r60.isEmpty() == false) goto L161;
        if (r64 != null) goto L159;
        return;
    L159:
        if (r64.isEmpty() == true) goto L272;
        r63.B(r61);
        Log.d("PlaylistRepository", "Cleared songs for playlist " + r61);
        return;
    L272:
        return;
    L161:
        if (r64 != null) goto L163;
    L165:
        ArrayList r65 = new ArrayList();
        int r66 = r60.size();
        int r67 = 0;
    L166:
        if (r67 >= r66) goto L168;
        Object r68 = r60.get(r67);
        r67 = r67 + 1;
        r65.add(new PlaylistSong(r61, (Child) r68));
        goto L166
    L168:
        r63.B(r61);
        xl.E((s24) r63.n, false, true, new o(24, r63, r65));
        Log.d("PlaylistRepository", "Cached " + r65.size() + " songs for playlist " + r61);
        return;
    L163:
        if (r64.size() != r60.size()) goto L165;
        Log.d("PlaylistRepository", "Songs for playlist " + r61 + " already cached (size match).");
        return;
    L170:
        mm3 r69 = (mm3) this.o;
        List r70 = (List) this.p;
        Context r71 = (Context) this.q;
        Iterator r72 = r70.iterator();
    L172:
        if (r72.hasNext() == false) goto L174;
        Playlist r73 = (Playlist) r72.next();
        k03 r74 = r69.c(r73.getId(), false, null);
        r74.f(new np1(r74, r71, r73));
        goto L172
    L174:
        return;
    L175:
        mm3 r75 = (mm3) this.o;
        String r76 = (String) this.p;
        Runnable r77 = (Runnable) this.q;
        r75.c.B(r76);
        xl.E((s24) r75.a.o, false, true, new rs0(11, r76));
        String r78 = ud3.D();
        if (r78 == null) goto L178;
        r75.d.o(r76, r78);
    L178:
        xl.E((s24) r75.b.a, false, true, new rs0(r4, r76));
        if (r77 == null) goto L181;
        new Handler(Looper.getMainLooper()).post(r77);
    L181:
        r75.h();
        return;
    L183:
        mm3 r79 = (mm3) this.o;
        String r80 = (String) this.p;
        xl.E((s24) r79.b.a, false, true, new ps0(1, (String) this.q, r80));
        return;
    L185:
        mm3 r81 = (mm3) this.o;
        String r82 = (String) this.p;
        k03 r83 = (k03) this.q;
        List r84 = (List) xl.E((s24) r81.c.n, true, false, new rs0(r3, r82));
        if (r84 != null) goto L188;
        return;
    L188:
        if (r84.isEmpty() == true) goto L276;
        ArrayList r85 = new ArrayList();
        Iterator r86 = r84.iterator();
    L191:
        if (r86.hasNext() == false) goto L193;
        PlaylistSong r87 = (PlaylistSong) r86.next();
        Child r88 = new Child(r87.getId());
        r88.setTitle(r87.getTitle());
        r88.setArtist(r87.getArtist());
        r88.setAlbum(r87.getAlbum());
        r88.setTrack(r87.getTrack());
        r88.setCoverArtId(r87.getCoverArtId());
        r88.setDuration(r87.getDuration());
        r88.setAlbumId(r87.getAlbumId());
        r88.setArtistId(r87.getArtistId());
        r85.add(r88);
        goto L191
    L193:
        r83.i(r85);
        return;
    L276:
        return;
    L195:
        mm3 r89 = (mm3) this.o;
        String r90 = (String) this.p;
        Context r91 = (Context) this.q;
        qp4 r92 = r89.d;
        List r93 = (List) xl.E((s24) r92.a, true, false, new o(29, r92, r90));
        if (r93.isEmpty() == true) goto L277;
        new Handler(Looper.getMainLooper()).post(new qo2(r89, r93, r91, r5));
        return;
    L277:
        return;
    L200:
        PlaylistPageFragment r94 = (PlaylistPageFragment) this.o;
        List r95 = (List) this.p;
        String r96 = (String) this.q;
        ArrayList r97 = new ArrayList(r95);
        Collections.shuffle(r97);
        bo2.q(r94.r0, r97, 0, r96);
        ((au) r94.m0.V.n).d(true);
        return;
    L202:
        zt2 r98 = (zt2) this.o;
        Pair r99 = (Pair) this.p;
        ((nj0) r98.o.i).c(((Integer) r99.first).intValue(), (mt2) r99.second, (Exception) this.q);
        return;
    L204:
        zt2 r100 = (zt2) this.o;
        Pair r101 = (Pair) this.p;
        ((nj0) r100.o.i).D(((Integer) r101.first).intValue(), (mt2) r101.second, (tv1) this.q);
        return;
    L206:
        tn2 r102 = (tn2) this.o;
        gr2 r103 = (gr2) this.q;
        if (r102.l() == true) goto L278;
        ju2.f(r102.s, r103);
        return;
    L278:
        return;
    L210:
        cj2 r104 = (cj2) this.o;
        fr2 r105 = (fr2) this.p;
        KeyEvent r106 = (KeyEvent) this.q;
        tn2 r107 = (tn2) r104.c;
        if (r107.k(r105) == false) goto L213;
        r107.c(r106, false, false);
    L214:
        r104.b = null;
        return;
    L213:
        ls2 r108 = r107.h;
        ms2 r109 = r105.a;
        r109.getClass();
        r108.getClass();
        r108.I(1, new bs2(r108, r6), r109, true);
        goto L214
    L216:
        ro2 r113 = (ro2) this.o;
        uw1 r114 = (uw1) this.p;
        mt2 r115 = (mt2) this.q;
        nj0 r116 = r113.c;
        gy3 r117 = r114.f();
        ml3 r118 = r116.q;
        qi3 r119 = r116.t;
        r119.getClass();
        r118.getClass();
        r118.b = yw1.k(r117);
        if (r117.isEmpty() == true) goto L220;
        r118.e = (mt2) r117.get(0);
        r115.getClass();
        r118.f = r115;
    L220:
        if (((mt2) r118.d) != null) goto L222;
        r118.d = ml3.k(r119, (yw1) r118.b, (mt2) r118.e, (zt4) r118.a);
    L222:
        r118.v(r119.x0());
    }
}
