package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rs3 {
    public static final rs3 a = null;
    public static final ExecutorService b = null;
    public static final AtomicInteger c = null;
    public static volatile ux d;
    public static volatile List e;
    public static final HashSet f = null;

    static {
        a = new rs3();
        b = Executors.newSingleThreadExecutor(new ps3(0));
        c = new AtomicInteger(0);
        e = u01.n;
        f = new HashSet();
    }

    public final void a(Context r22, qs3 r23, int r24) {
        Uri r5 = r23.a;
        se4 r6 = au0.D(r22);     // Catch: Exception -> L27
        String r18 = "Pre-cached ";
        int r3 = 10;
        String r17 = "Pre-cache aborted for ";
        String r11 = new xi4(10).d(new ii0(r5, 0, 1, null, Collections.EMPTY_MAP, 0, -1, null, 0));     // Catch: Exception -> L20
        r6.getClass();     // Catch: Exception -> L20
        if (nd0.a(r6.i(r11)) == (-1)) goto L11;
    L30:
        Map r0 = Collections.EMPTY_MAP;
        long r13 = r23.b;
        if (ot1.d(r5) == false) goto L34;
        Map r1 = Collections.singletonMap("X-HomeMusic-Prefetch", "1");
        r1.getClass();
    L35:
        ii0 r4 = new ii0(r5, 0, 1, null, r1, 0, r13, null, 0);
        monitor-enter(au0.class);
        se4 r7 = au0.B(r22);     // Catch: Throwable -> L88
        xi4 r12 = new xi4(r3);     // Catch: Throwable -> L88
        bi0 r2 = au0.x();     // Catch: Throwable -> L88
        Context r8 = r22.getApplicationContext();     // Catch: Throwable -> L88
        r2.getClass();     // Catch: Throwable -> L88
        se4 r9 = au0.B(r22);     // Catch: Throwable -> L88
        r9.getClass();     // Catch: Throwable -> L88
        monitor-exit(au0.class);
        qx r10 = new qx(new zj0(r8, ((om1) r2).m()), r9);
        r7.getClass();
        ux r14 = new ux(new lx(r7, r10, new t61(false), new jx(r7), r12, 0), r4, null, null);
        monitor-enter(this);
    L85:
        th = move-exception;
        throw th;
    L43:
        if (c.get() == r24) goto L46;
        monitor-exit(this);
        return;
    L46:
        d = r14;     // Catch: Throwable -> L85
        monitor-exit(this);
        r14.a();     // Catch: Throwable -> L60 Exception -> L62
        Log.d("QueuePreloader", r18 + r23.b + " bytes of " + r5);     // Catch: Throwable -> L60 Exception -> L62
        monitor-enter(this);
    L54:
        th = move-exception;
        throw th;
    L51:
        if (d != r14) goto L56;
        d = null;     // Catch: Throwable -> L54
    L56:
        monitor-exit(this);
        return;
    L60:
        th = move-exception;
        monitor-enter(this);
    L79:
        th = move-exception;
        throw th;
    L76:
        if (d != r14) goto L82;
        d = null;     // Catch: Throwable -> L79
    L82:
        throw th;
    L62:
        e = move-exception;
        Log.d("QueuePreloader", r17 + r5 + ": " + e);     // Catch: Throwable -> L60
        monitor-enter(this);
    L69:
        th = move-exception;
        throw th;
    L66:
        if (d != r14) goto L56;
        d = null;     // Catch: Throwable -> L69
    L88:
        th = move-exception;
        throw th;
    L34:
        r1 = v01.n;
        goto L35
    L11:
        if (r6.g(0, 1, r11) <= 0) goto L30;
        HashSet r15 = f;     // Catch: Exception -> L20
        monitor-enter(r15);     // Catch: Exception -> L20
        boolean r16 = r15.add(r11);     // Catch: Throwable -> L22
        monitor-exit(r15);     // Catch: Exception -> L20
        if (r16 == false) goto L30;
        Log.d("QueuePreloader", "Head of " + r11 + " has no length, loading it again");     // Catch: Exception -> L20
        r6.m(r11);     // Catch: Exception -> L20
        goto L30
    L22:
        th = move-exception;
        throw th;     // Catch: Exception -> L20
    L20:
        e = e;
    L29:
        Log.d("QueuePreloader", "Could not check the head of " + r5 + ": " + e);
    L25:
        e = e;
        r17 = "Pre-cache aborted for ";
        r18 = "Pre-cached ";
        r3 = 10;
    L27:
        e = e;
        r17 = "Pre-cache aborted for ";
        r18 = "Pre-cached ";
        r3 = 10;
        goto L29
    }

    public final void b() {
        monitor-enter(this);
        c.incrementAndGet();     // Catch: Throwable -> L7
        e = u01.n;     // Catch: Throwable -> L7
        ux r0 = d;     // Catch: Throwable -> L7
        if (r0 == null) goto L9;
        r0.j = true;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [u01] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    public final void c(Context r30, qi3 r31) {
        boolean r0 = jp1.a();
        App.b().getClass();
        String r1 = App.c().getString("precache_tracks_count", "0");
        r1.getClass();
        int r2 = Integer.parseInt(r1);
        int r3 = 1;
        if (r0 == false) goto L6;
        if (r2 <= 1) goto L6;
        r2 = 1;
    L6:
        if (r2 > 0) goto L9;
        return;
    L9:
        if (ud3.F() <= 0) goto L131;
        Context r4 = r30.getApplicationContext();
        if (xa3.u("precache_wifi_only", true) == false) goto L21;
        r4.getClass();
        ConnectivityManager r5 = (ConnectivityManager) r4.getSystemService(ConnectivityManager.class);
        if (r5 != null) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == false) goto L21;
        b();
        return;
    L16:
        r6 = r5.isActiveNetworkMetered();
    L21:
        if (r31.f() == true) goto L132;
        WaveSession r7 = b.b;
        if (r7 == null) goto L37;
        gn2 r8 = r31.a();
        if (r8 == null) goto L29;
        String r9 = r8.a;
    L31:
        if (r7.isWave(r9) == false) goto L37;
        if (r7.settled(r9) == true) goto L37;
        b();
        return;
    L29:
        r9 = null;
    L37:
        r4.getClass();
        ?? r10 = u01.n;
        cu4 r11 = r31.x0();
        r11.getClass();
        if (r11.p() == false) goto L40;
    L39:
        Context r16 = r4;
        hx3 r12 = new hx3();
        monitor-enter(this);
    L113:
        th = move-exception;
        throw th;
    L106:
        if (r10.equals(e) == false) goto L109;
        monitor-exit(this);
        return;
    L109:
        r12.n = c.incrementAndGet();     // Catch: Throwable -> L113
        e = r10;     // Catch: Throwable -> L113
        ux r13 = d;     // Catch: Throwable -> L113
        if (r13 == null) goto L115;
        r13.j = true;     // Catch: Throwable -> L113
    L115:
        monitor-exit(this);
        if (r10.isEmpty() == false) goto L119;
        return;
    L119:
        b.execute(new qo2(r10, r12, r16, 14));
        return;
    L40:
        int r14 = r31.o0();
        int r15 = -1;
        if (r14 == (-1)) goto L39;
        r10 = new ArrayList(r2);
        int r17 = r14;
    L45:
        if (r10.size() >= r2) goto L39;
        int r18 = r11.e(r17, r31.h(), r31.D0());
        if (r18 == r15) goto L39;
        if (r18 == r14) goto L39;
        gn2 r19 = r31.Y(r18);
        r19.getClass();
        String r110 = r19.a;
        do2 r111 = r19.d;
        Bundle r112 = r111.I;
        if (r112 == null) goto L53;
        String r113 = r112.getString("type");
    L55:
        if (h12.c(r113, WaveOrigin.RADIO) == true) goto L102;
        r110.getClass();
        if (xm4.k0(r110, "ir-", false) == true) goto L102;
        au0.w(r4).getClass();
        if (eu0.d(r110) == true) goto L102;
        bn2 r114 = r19.b;
        if (r114 == null) goto L65;
        Uri r115 = r114.a;
        if (r115 == null) goto L65;
    L68:
        String r116 = r115.getScheme();
        if (h12.c(r116, "http") == true) goto L75;
        if (h12.c(r116, "https") == true) goto L75;
        if (ot1.d(r115) == false) goto L102;
    L75:
        if (ot1.d(r115) == true) goto L83;
        String r117 = r115.getQueryParameter("format");
        String r118 = r115.getQueryParameter("maxBitRate");
        if (r117 != null) goto L79;
    L80:
        if (r118 == null) goto L83;
        if (r118.equals("0") == false) goto L102;
    L79:
        if (r117.equals("raw") == false) goto L102;
    L83:
        Bundle r20 = r111.I;
        if (r20 == null) goto L86;
        int r21 = r20.getInt("bitrate");
    L87:
        int r119 = 10;
        if (xm4.e0(new xi4(10).d(new ii0(r115, 0, 1, null, Collections.EMPTY_MAP, 0, -1, null, 0)), "|mobile", false) == true) goto L90;
    L94:
        if (r21 > 0) goto L97;
        r21 = 320;
    L97:
        long r22 = (((long) r21) * 1000) / 8;
        if (r0 == true) goto L101;
        r119 = 15;
    L101:
        r10.add(new qs3(r115, Math.max(262144, (r22 * ((long) r119)) + 65536)));
        goto L102
    L90:
        if (r3 > r21) goto L93;
        if (r21 < 160) goto L94;
    L93:
        r21 = 160;
        goto L94
    L86:
        r21 = 0;
    L65:
        r115 = r19.f.a;
        if (r115 != null) goto L68;
    L102:
        r17 = r18;
        r4 = r4;
        r3 = 1;
        r15 = -1;
        goto L45
    L53:
        r113 = null;
        goto L55
    L132:
        return;
    }
}
