package com.eddyizm.tempus.homemusic;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
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
import defpackage.tt1;
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
    public static WeakReference a;
    public static WaveSession b;
    public static u6 c;
    public static long d;

    static {
        a = new WeakReference(null);
    }

    public static ArrayList a(qi3 r6, WaveSession r7) {
        int r0 = r6.o0();
        int r1 = 0;
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        j02 r2 = gb.g0(r0 + 1, r6.Q0());
        ArrayList r3 = new ArrayList(r40.k0(r2, 10));
        Iterator r4 = r2.iterator();
    L7:
        if (((i02) r4).p == false) goto L9;
        int r5 = ((b02) r4).nextInt();
        r3.add(new kd3(Integer.valueOf(r5), r6.Y(r5).a));
        goto L7
    L9:
        ArrayList r8 = new ArrayList();
        int r9 = r3.size();
    L10:
        if (r1 >= r9) goto L14;
        Object r10 = r3.get(r1);
        r1 = r1 + 1;
        if (r7.isWave((String) ((kd3) r10).o) == false) goto L10;
        r8.add(r10);
        goto L10
    L14:
        return r8;
    }

    public static void b(WaveSession r12, List r13) {
        ao2 r0 = (ao2) a.get();
        if (r0 == null) goto L91;
        qi3 r1 = j(r12);
        if (r1 == null) goto L92;
        ArrayList r2 = a(r1, r12);
        WavePlan.Companion r3 = WavePlan.Companion;
        ArrayList r4 = new ArrayList(r40.k0(r2, 10));
        int r6 = r2.size();
        int r7 = 0;
        int r8 = 0;
    L9:
        String r9 = "";
        if (r8 >= r6) goto L16;
        Object r10 = r2.get(r8);
        r8 = r8 + 1;
        String r11 = r12.refOf((String) ((kd3) r10).o);
        if (r11 == null) goto L15;
        r9 = r11;
    L15:
        r4.add(r9);
        goto L9
    L16:
        ArrayList r14 = new ArrayList(r40.k0(r13, 10));
        Iterator r15 = r13.iterator();
    L18:
        if (r15.hasNext() == false) goto L23;
        String r16 = ((ut1) r15.next()).a.getRef();
        if (r16 != null) goto L22;
        r16 = "";
    L22:
        r14.add(r16);
        goto L18
    L23:
        WavePlan r5 = r3.of(r4, r14);
        List<Integer> r17 = r5.getAdd();
        ArrayList r18 = new ArrayList(r40.k0(r17, 10));
        Iterator<T> r19 = r17.iterator();
    L25:
        if (r19.hasNext() == false) goto L27;
        r18.add((ut1) r13.get(((Number) r19.next()).intValue()));
        goto L25
    L27:
        String r20 = r12.getId();
        ArrayList r21 = new ArrayList(r40.k0(r2, 10));
        int r22 = r2.size();
        int r110 = 0;
    L28:
        if (r110 >= r22) goto L30;
        Object r111 = r2.get(r110);
        r110 = r110 + 1;
        r21.add(r12.refOf((String) ((kd3) r111).o));
        goto L28
    L30:
        ArrayList r23 = new ArrayList(r40.k0(r13, 10));
        Iterator r112 = r13.iterator();
    L32:
        if (r112.hasNext() == false) goto L34;
        r23.add(((ut1) r112.next()).a.getRef());
        goto L32
    L34:
        Log.i("HubWave", "next " + r20 + ": ahead " + r21 + " → " + r23 + " (kept " + r5.getKeep() + ")");
        if (r5.getRemove().isEmpty() == true) goto L37;
    L39:
        ArrayList r113 = new ArrayList(r40.k0(r2, 10));
        int r24 = r2.size();
        int r25 = 0;
    L40:
        if (r25 >= r24) goto L42;
        Object r26 = r2.get(r25);
        r25 = r25 + 1;
        r113.add(Integer.valueOf(((Number) ((kd3) r26).n).intValue()));
        goto L40
    L42:
        int r114 = r5.insertAt(r113, r1.Q0());
        Iterator r27 = q40.H0(r5.getRemove()).iterator();
    L44:
        if (r27.hasNext() == false) goto L47;
        int r28 = ((Number) ((kd3) r2.get(((Number) r27.next()).intValue())).n).intValue();
        bo2.k(r0, r28, r28 + 1);
        goto L44
    L47:
        if (r18.isEmpty() == true) goto L94;
        ArrayList r29 = new ArrayList(r40.k0(r18, 10));
        int r30 = r18.size();
        int r31 = 0;
    L50:
        if (r31 >= r30) goto L52;
        Object r32 = r18.get(r31);
        r31 = r31 + 1;
        r29.add(((ut1) r32).a);
        goto L50
    L52:
        r12.register(r29);
        rs1 r33 = rs1.a;
        Set<String> r34 = r12.ids();
        int r35 = lg2.W(r40.k0(r34, 10));
        if (r35 >= 16) goto L55;
        r35 = 16;
    L55:
        LinkedHashMap r36 = new LinkedHashMap(r35);
        Iterator<T> r37 = r34.iterator();
    L57:
        if (r37.hasNext() == false) goto L59;
        Object r38 = r37.next();
        String r39 = (String) r38;
        r36.put(r38, r12.getContext());
        goto L57
    L59:
        rs1.b(r36, g(r12));
        if (r1.g() == 4) goto L62;
    L64:
        boolean r115 = false;
    L65:
        ArrayList r40 = new ArrayList(r40.k0(r18, 10));
        int r41 = r18.size();
        int r42 = 0;
    L66:
        if (r42 >= r41) goto L68;
        Object r43 = r18.get(r42);
        r42 = r42 + 1;
        r40.add(((ut1) r43).b);
        goto L66
    L68:
        ArrayList r44 = new ArrayList(r40.k0(r18, 10));
        int r45 = r18.size();
    L69:
        if (r7 >= r45) goto L71;
        Object r46 = r18.get(r7);
        r7 = r7 + 1;
        r44.add(((ut1) r46).c);
        goto L69
    L71:
        bo2.h(r0, r114, r40, r44);
        if (r115 == true) goto L90;
        is3.b(r1, r114, r18.size());
        return;
    L90:
        return;
    L62:
        if ((SystemClock.elapsedRealtime() - d) <= 300000) goto L64;
        r115 = true;
        goto L65
    L94:
        return;
    L37:
        if (r18.isEmpty() == false) goto L39;
        return;
    L92:
        return;
    }

    public static void c() {
        WaveSession r0 = b;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.getInFlight() == false) goto L9;
        r0.setAgain(true);
        return;
    L9:
        qi3 r1 = j(r0);
        if (r1 != null) goto L12;
        return;
    L12:
        e();
        ArrayList r3 = a(r1, r0);
        ArrayList r4 = new ArrayList(r40.k0(r3, 10));
        int r5 = r3.size();
        int r7 = 0;
    L13:
        if (r7 >= r5) goto L15;
        Object r8 = r3.get(r7);
        r7 = r7 + 1;
        r4.add((String) ((kd3) r8).o);
        goto L13
    L15:
        WaveNextIn r6 = r0.snapshot(r4);
        String r9 = r0.getId();
        gn2 r2 = r1.a();
        if (r2 == null) goto L18;
        String r10 = r2.a;
    L19:
        r0.setAskedFor(r10);
        r0.setInFlight(true);
        r0.setAgain(false);
        io1.a.execute(new v6(r6, r9, r0, 20));
        return;
    L18:
        r10 = null;
        goto L19
    }

    public static void d(View r3, Child r4, final Runnable r5, final boolean r6, final boolean r7) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r6 == false) goto L6;
        r4.getClass();
        final Map<String, String> r0 = WaveSeeds.INSTANCE.artist(r4.getId(), r4.getArtistId());
    L8:
        if (ur1.b(r4) == false) goto L13;
        if (r0 == null) goto L13;
        r3.setVisibility(0);
        r3.setOnClickListener(new tt1(r5, r0, r6, r7));
        return;
    L13:
        r3.setVisibility(8);
        return;
    L6:
        r4.getClass();
        r0 = WaveSeeds.INSTANCE.track(r4.getId());
        goto L8
    }

    public static void e() {
        u6 r0 = c;
        if (r0 == null) goto L5;
        io1.b.removeCallbacks(r0);
    L5:
        c = null;
    }

    public static void f(WaveSession r2) {
        qi3 r3 = j(r2);
        if (r3 != null) goto L5;
        return;
    L5:
        rs3 r0 = rs3.a;
        Context r1 = App.a();
        r1.getClass();
        r0.c(r1, r3);
    }

    public static Map g(WaveSession r4) {
        ux3 r0 = k62.c;
        k62 r1 = gi1.P(r4.getContext(), WaveOrigin.WAVE);
        if (r1 == null) goto L5;
        Set<String> r5 = r4.ids();
        int r2 = lg2.W(r40.k0(r5, 10));
        if (r2 >= 16) goto L9;
        r2 = 16;
    L9:
        LinkedHashMap r3 = new LinkedHashMap(r2);
        Iterator<T> r6 = r5.iterator();
    L11:
        if (r6.hasNext() == false) goto L13;
        Object r7 = r6.next();
        String r8 = (String) r7;
        r3.put(r7, r1);
        goto L11
    L13:
        return r3;
    L5:
        return v01.n;
    }

    public static final boolean h(qi3 r2) {
        r2.getClass();
        WaveSession r0 = b;
        if (r0 == null) goto L11;
        gn2 r3 = r2.a();
        if (r3 == null) goto L7;
        String r4 = r3.a;
    L9:
        if (r0.isWave(r4) != true) goto L11;
        return true;
    L7:
        r4 = null;
    L11:
        return false;
    }

    public static void i(MainActivity r7, WaveOut r8) {
        r7.getClass();
        r8.getClass();
        String r0 = r8.getSessionId();
        if (r0 != null) goto L5;
    L7:
        r0 = null;
    L8:
        List<WaveTrack> r2 = r8.getTracks();
        if (r2 != null) goto L12;
        r2 = u01.n;
    L12:
        if (r0 != null) goto L14;
    L22:
        Toast.makeText(r7, R.string.homemusic_wave_empty, 0).show();
        return;
    L14:
        if (r2.isEmpty() == true) goto L22;
        e();
        WaveSession r4 = new WaveSession(r0, r8.getTitle(), r8.getSeed(), r8.getMode());
        r4.register(r2);
        b = r4;
        ExecutorService r9 = ms1.a;
        ArrayList r10 = new ArrayList(r40.k0(r2, 10));
        Iterator<T> r1 = r2.iterator();
    L18:
        if (r1.hasNext() == false) goto L20;
        r10.add(((WaveTrack) r1.next()).item(r4.getContext()));
        goto L18
    L20:
        ms1.a(r7, r10, 0, null);
        return;
    L5:
        if (qm4.u0(r0) == true) goto L7;
        goto L7
    }

    public static qi3 j(WaveSession r3) {
        if (u52.c().a == true) goto L17;
        ao2 r0 = (ao2) a.get();
        if (r0 == null) goto L17;
        qi3 r1 = r0.b();
        if (r1 == null) goto L17;
        gn2 r2 = r1.a();
        if (r2 == null) goto L13;
        String r4 = r2.a;
    L15:
        if (r3.isWave(r4) == false) goto L17;
        return r1;
    L13:
        r4 = null;
    L17:
        return null;
    }

    public static ArrayList k(String r8, List r9) {
        ArrayList r0 = new ArrayList(r40.k0(r9, 10));
        Iterator r1 = r9.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.add(((WaveTrack) r1.next()).item(r8));
        goto L4
    L6:
        ExecutorService r10 = ms1.a;
        ArrayList r11 = ms1.b(r0);
        ArrayList r2 = new ArrayList();
        int r3 = r11.size();
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L22;
        Object r6 = r11.get(r5);
        r5 = r5 + 1;
        int r7 = r4 + 1;
        ut1 r12 = null;
        if (r4 < 0) goto L20;
        Child r13 = (Child) r6;
        if (r13 == null) goto L17;
        gn2 r14 = (gn2) q40.x0(gi1.M(gb.O(r13)));
        if (r14 == null) goto L17;
        r12 = new ut1((WaveTrack) r9.get(r4), r13, r14);
    L17:
        if (r12 == null) goto L19;
        r2.add(r12);
    L19:
        r4 = r7;
        goto L7
    L20:
        gb.c0();
        throw null;
    L22:
        return r2;
    }

    public static void l(MainActivity r7, Map r8, k6 r9, String r10) {
        r7.getClass();
        Toast.makeText(r7, R.string.homemusic_wave_starting, 0).show();
        io1.a.execute(new t6(r8, r10, r7, r9, 10));
    }

    public static final void m(MainActivity r1, String r2, String r3) {
        r1.getClass();
        if (qm4.u0(r2) == true) goto L6;
        Map r4 = Collections.singletonMap("nd_artist_id", r2);
        r4.getClass();
        l(r1, r4, null, r3);
        return;
    }
}
