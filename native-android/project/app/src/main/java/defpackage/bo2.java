package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.subsonic.models.Child;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
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
    public static WeakReference a;
    public static final AtomicBoolean b = null;
    public static final AtomicBoolean c = null;
    public static final ExecutorService d = null;

    static {
        a = new WeakReference(null);
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
        d = Executors.newSingleThreadExecutor();
    }

    public static List a(ao2 r3, List r4) {
        qi3 r5 = r3.b();
        if (r5 == null) goto L5;
        HashSet r0 = new HashSet();
        int r1 = 0;
    L8:
        if (r1 >= r5.Q0()) goto L11;
        r0.add(r5.Y(r1).a);
        r1 = r1 + 1;
        goto L8
    L11:
        return (List) r4.stream().filter(new tj(3, r0)).collect(Collectors.toList());
    L5:
        return new ArrayList(r4);
    }

    public static int b(ao2 r6, List r7) {
        qi3 r0 = r6.b();
        if (r0 != null) goto L5;
        return -1;
    L5:
        rs1 r2 = rs1.a;
        int r3 = lg2.W(r40.k0(r7, 10));
        if (r3 >= 16) goto L8;
        r3 = 16;
    L8:
        LinkedHashMap r4 = new LinkedHashMap(r3);
        Iterator r5 = r7.iterator();
    L10:
        if (r5.hasNext() == false) goto L12;
        r4.put(((Child) r5.next()).getId(), "continuous");
        goto L10
    L12:
        rs1.b(r4, v01.n);
        Handler r8 = is3.a;
        cu4 r9 = r0.x0();
        r9.getClass();
        if (r9.p() == false) goto L15;
        int r1 = r0.Q0();
    L19:
        ArrayList r10 = gi1.M(r7);
        new vs3().c(r7, false, r1);
        r6.a(r1, r10.size(), r10.size() + r0.Q0());
        r0.N0(r10, r1);
        return r1;
    L15:
        int r11 = r9.c(r0.D0());
        if (r11 != (-1)) goto L18;
        r1 = r0.Q0();
        goto L19
    L18:
        r1 = r11 + 1;
        goto L19
    }

    public static void c(gn2 r6, ao2 r7, vp r8) {
        AtomicBoolean r0 = c;
        if (r0.get() == false) goto L5;
    L35:
        Log.d("MediaManager", "Continuous Play: already running");
        if (r8 == null) goto L40;
        r8.run();
        return;
    L40:
        return;
    L5:
        if (ud3.T() == false) goto L35;
        qi3 r1 = r7.b();
        if (r1 != null) goto L13;
        Log.d("MediaManager", "Continuous Play: queue target gone");
        if (r8 == null) goto L39;
        r8.run();
        return;
    L39:
        return;
    L13:
        Log.d("MediaManager", "Continuous Play");
        App.b().getClass();
        App.c().edit().putLong("last_instant_mix", System.currentTimeMillis()).apply();
        r0.set(true);
        App.b().getClass();
        int r2 = App.c().getInt("number_tracks_keep_in_queue", 30) - 1;
        if (r1.a() == null) goto L16;
        int r9 = r1.o0();
    L18:
        if (r1.D0() == false) goto L20;
        int r10 = 0;
    L21:
        if (r10 <= 0) goto L23;
        Log.d("MediaManager", "Continuous Play: purging " + r10 + " old items from queue");
        k(r7, 0, r10);
    L23:
        String r11 = r6.a;
        Bundle r12 = r6.d.I;
        if (r12 == null) goto L26;
        String r13 = r12.getString("artistId");
    L27:
        xi4 r3 = new xi4(2);
        k03 r4 = new k03();
        if (r13 != null) goto L30;
    L32:
        r3.l(r11, r4);
    L33:
        r4.f(new i7(3, r4, r7));
        return;
    L30:
        if (r13.isEmpty() == true) goto L32;
        gp3 r5 = App.f(false).c();
        r5.getClass();
        Log.d("BrowsingClient", "getSimilarSongs2()");
        ((ov) r5.p).a(((pn4) r5.o).f(), r13, 25).enqueue(new yc5(r3, r4, r11));
        goto L33
    L26:
        r13 = null;
        goto L27
    L20:
        r10 = Math.max(0, r9 - r2);
        goto L21
    L16:
        r9 = 0;
        goto L18
    }

    public static void d(gn2 r3) {
        if (r3 == null) goto L11;
        new vs3();
        String r4 = r3.a;
        if (r4 == null) goto L12;
        Map r0 = ud3.A();
        if (r0.remove(r4) == null) goto L9;
        ud3.N0(r0);
    L9:
        rm3 r1 = App.f(false).b();
        r1.getClass();
        Log.d("BookmarksClient", "deleteBookmark() id=".concat(r4));
        ((mt) r1.o).d(((pn4) r1.n).f(), r4).enqueue(new hh3(9));
        return;
    L12:
        return;
    }

    public static void e(ic2 r4, List r5, boolean r6) {
        if (r6 == false) goto L4;
        String r0 = "next";
    L5:
        Handler r1 = u52.a;
        r5.getClass();
        if (u52.r(r5, r0, 0, 0) == true) goto L12;
        if (r4 == null) goto L11;
        r4.f(new bs1(r4, r5, r6, 4), gq0.n);
        return;
    L11:
        return;
    L12:
        return;
    L4:
        r0 = "append";
        goto L5
    }

    public static void f(bl2 r5, Child r6, boolean r7) {
        List r0 = Collections.singletonList(r6);
        if (r7 == false) goto L5;
        String r1 = "next";
    L6:
        Handler r2 = u52.a;
        r0.getClass();
        if (u52.r(r0, r1, 0, 0) == true) goto L13;
        if (r5 == null) goto L12;
        r5.f(new bs1(r5, r6, r7, 5), gq0.n);
        return;
    L12:
        return;
    L13:
        return;
    L5:
        r1 = "append";
        goto L6
    }

    public static void g(yn2 r3, List r4, boolean r5) {
        bj2 r0 = r3.n;
        if (r0 != null) goto L6;
        Log.d("MediaManager", "enqueue: queue target gone, dropping " + r4.size() + " items");
        return;
    L6:
        Log.d("MediaManager", "enqueue");
        rs1.i(r4);
        int r1 = r0.o0();
        if (r5 == true) goto L9;
    L12:
        new vs3().c(r4, false, r0.Q0());
        r0.w0(gi1.M(r4));
        return;
    L9:
        if (r1 == (-1)) goto L12;
        new vs3().c(r4, false, r1 + 1);
        i(r3, r0, gi1.M(r4));
    }

    public static void h(ao2 r2, int r3, List r4, List r5) {
        qi3 r6 = r2.b();
        if (r6 != null) goto L5;
        return;
    L5:
        if (r4.isEmpty() == true) goto L10;
        int r7 = Math.max(0, Math.min(r3, r6.Q0()));
        new vs3().c(r4, false, r7);
        r6.N0(r5, r7);
        return;
    }

    public static void i(yn2 r3, qi3 r4, List r5) {
        if (r5.isEmpty() == false) goto L5;
        return;
    L5:
        int r0 = r4.o0() + 1;
        int r1 = r4.Q0();
        int r2 = r5.size() + r1;
        r3.a(r0, r5.size(), r2);
        r4.N0(r5, r0);
    }

    public static void j(bl2 r2, li3 r3) {
        om1 r0 = new om1(9, r3);
        r2.f(new lg1(0, r2, r0), gq0.n);
    }

    public static void k(ao2 r2, final int r3, final int r4) {
        qi3 r5 = r2.b();
        if (r5 != null) goto L6;
        Log.d("MediaManager", "removeRange: queue target gone");
        return;
    L6:
        r5.P(r3, r4);
        final vs3 r6 = new vs3();
        vs3.b.execute(new us3(r6, r3, r4));
    }

    public static void l(gn2 r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (ot1.c(r3.a) == true) goto L8;
        int r2 = 7;
        new Thread(new lg1(r2, AppDatabase.y().v(), new Chronology(r3))).start();
        return;
    }

    public static void m(gn2 r4, boolean r5) {
        if (r4 != null) goto L4;
    L6:
        if (r4 == null) goto L13;
        do2 r6 = r4.d;
        if (r6.I != null) goto L10;
        return;
    L10:
        if (xa3.u("scrobbling", true) == false) goto L15;
        String r7 = r6.I.getString("id");
        gp3 r1 = App.f(false).e();
        r1.getClass();
        Log.d("MediaAnnotationClient", "scrobble()");
        ((zi2) r1.p).d(((pn4) r1.o).f(), r7, Boolean.valueOf(r5)).enqueue(new xi4(0));
        return;
    L15:
        return;
    L13:
        return;
    L4:
        if (ot1.c(r4.a) == false) goto L6;
    }

    public static void n(gn2 r13, long r14) {
        if (r13 == null) goto L57;
        String r1 = r13.a;
        do2 r15 = r13.d;
        Bundle r6 = r15.I;
        String r7 = null;
        if (r6 == null) goto L7;
        String r9 = r6.getString("type");
    L9:
        if (r6 == null) goto L11;
        int r0 = r6.getInt("duration");
    L12:
        long r10 = ((long) r0) * 1000;
        if (WaveOrigin.RADIO.equals(r9) == false) goto L15;
        return;
    L15:
        if ("video".equals(r9) == true) goto L58;
        vs3.b.execute(new ss3(new vs3(), r1, r14, 0));
        if ("podcast".equals(r9) == false) goto L20;
    L26:
        CharSequence r16 = r15.a;
        if (r16 == null) goto L29;
        String r4 = r16.toString();
    L30:
        CharSequence r17 = r15.c;
        if (r17 == null) goto L33;
        String r5 = r17.toString();
    L34:
        CharSequence r18 = r15.b;
        if (r18 == null) goto L37;
        String r19 = r18.toString();
    L38:
        if (r6 == null) goto L40;
        String r110 = r6.getString("albumId");
    L41:
        if (r6 == null) goto L43;
        r7 = r6.getString("coverArtId");
    L43:
        String r8 = r7;
        r1.getClass();
        if (qm4.u0(r1) == false) goto L46;
    L49:
        new vs3();
        if (r14 <= 5000) goto L59;
        rm3 r111 = App.f(false).b();
        r111.getClass();
        Log.d("BookmarksClient", "createBookmark() id=" + r1 + " position=" + r14);
        ((mt) r111.o).b(((pn4) r111.n).f(), r1, r14).enqueue(new e20(r1, r14));
        return;
    L59:
        return;
    L46:
        if (r14 <= 0) goto L49;
        Map r112 = ud3.A();
        r112.put(r1, new sp3(r1, r14, r4, r5, r19, r110, r8, r9, System.currentTimeMillis()));
        ud3.N0(r112);
        goto L49
    L40:
        r110 = null;
        goto L41
    L37:
        r19 = null;
        goto L38
    L33:
        r5 = null;
        goto L34
    L29:
        r4 = null;
        goto L30
    L20:
        if ("audiobook".equals(r9) == true) goto L26;
        if ("music".equals(r9) == true) goto L25;
        return;
    L25:
        if (r10 > 600000) goto L26;
        return;
    L58:
        return;
    L11:
        r0 = 0;
        goto L12
    L7:
        r9 = null;
        goto L9
    }

    public static void o(ic2 r2, List r3, int r4) {
        p(r2, r3, r4, 0);
    }

    public static void p(ic2 r8, List r9, int r10, long r11) {
        v01 r0 = v01.n;
        kd3 r1 = rs1.m;
        rs1.m = null;
        final int r2 = 0;
        final int r3 = 1;
        if (r1 != null) goto L5;
    L7:
        boolean r4 = false;
    L8:
        if (r4 == false) goto L10;
        r1.getClass();
        Map r5 = (Map) r1.o;
    L11:
        rs1.n = r5;
        if (r4 == false) goto L14;
        Map r6 = rs1.p;
    L15:
        rs1.o = r6;
        rs1.p = r0;
        WeakReference r7 = b.a;
        final Map r12 = rs1.n;
        r12.getClass();
        Handler r13 = io1.b;
        r13.post(new zs1(r12, r3));
        WeakReference r14 = a.a;
        final Map r15 = rs1.n;
        r15.getClass();
        r13.post(new zs1(r15, r2));
        if (u52.r(r9, "replace", r10, r11) == true) goto L22;
        if (r8 == null) goto L21;
        r8.f(new us1(r8, r9, r10, r11, 1), gq0.n);
        return;
    L21:
        return;
    L22:
        return;
    L14:
        r6 = r0;
        goto L15
    L10:
        r5 = r0;
        goto L11
    L5:
        if (r1.n != r9) goto L7;
        r4 = true;
        goto L8
    }

    public static void q(ic2 r8, List r9, int r10, String r11) {
        rs1 r0 = rs1.a;
        r9.getClass();
        ux3 r1 = k62.c;
        Set r2 = v13.a;
        if (r11.equals("playlist") == false) goto L5;
    L11:
        String r3 = "nd_playlist";
    L12:
        String r4 = UUID.randomUUID().toString();
        r4.getClass();
        k62 r5 = new k62(r4, gi1.b0(r3));
        rs1 r6 = rs1.a;
        int r7 = lg2.W(r40.k0(r9, 10));
        int r12 = 16;
        if (r7 >= 16) goto L15;
        r7 = 16;
    L15:
        LinkedHashMap r13 = new LinkedHashMap(r7);
        Iterator r14 = r9.iterator();
    L17:
        if (r14.hasNext() == false) goto L19;
        Child r15 = (Child) r14.next();
        String r16 = r15.getId();
        Set r17 = v13.a;
        r13.put(r16, v13.b(r11, (String) rs1.n.get(r15.getId())));
        goto L17
    L19:
        int r18 = lg2.W(r40.k0(r9, 10));
        if (r18 < 16) goto L23;
        r12 = r18;
    L23:
        LinkedHashMap r19 = new LinkedHashMap(r12);
        Iterator r20 = r9.iterator();
    L25:
        if (r20.hasNext() == false) goto L32;
        Child r21 = (Child) r20.next();
        String r22 = r21.getId();
        Set r23 = v13.a;
        String r24 = (String) rs1.n.get(r21.getId());
        k62 r25 = (k62) rs1.o.get(r21.getId());
        if (v13.b(r11, r24).equals(r11) == true) goto L30;
        if (r25 == null) goto L30;
    L31:
        r19.put(r22, r25);
    L30:
        r25 = r5;
        goto L31
    L32:
        rs1.m = new kd3(r9, r13);
        rs1.p = r19;
        o(r8, r9, r10);
        return;
    L5:
        if (xm4.k0(r11, "playlist:", false) == true) goto L11;
        if (v13.a.contains(r11) == false) goto L10;
        r3 = r11;
        goto L12
    L10:
        r3 = null;
        goto L12
    }
}
