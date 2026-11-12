package com.eddyizm.tempus.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaLibraryService;
import app.homemusic.AURAWavePlaybackListener;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.a0;
import defpackage.al3;
import defpackage.ao2;
import defpackage.aq;
import defpackage.b00;
import defpackage.b02;
import defpackage.bn;
import defpackage.bo2;
import defpackage.cu4;
import defpackage.d34;
import defpackage.do2;
import defpackage.f25;
import defpackage.f35;
import defpackage.fq;
import defpackage.fr2;
import defpackage.g41;
import defpackage.g5;
import defpackage.gb;
import defpackage.gj0;
import defpackage.gn2;
import defpackage.go2;
import defpackage.gq0;
import defpackage.gy3;
import defpackage.h12;
import defpackage.hd5;
import defpackage.hn2;
import defpackage.i02;
import defpackage.i41;
import defpackage.i80;
import defpackage.ic2;
import defpackage.ii;
import defpackage.ik3;
import defpackage.il;
import defpackage.is3;
import defpackage.j02;
import defpackage.j52;
import defpackage.jg0;
import defpackage.ji2;
import defpackage.ju3;
import defpackage.jz3;
import defpackage.k6;
import defpackage.kd3;
import defpackage.kn2;
import defpackage.ku3;
import defpackage.l93;
import defpackage.lg1;
import defpackage.mj0;
import defpackage.my0;
import defpackage.n61;
import defpackage.nj0;
import defpackage.ns3;
import defpackage.o31;
import defpackage.oi3;
import defpackage.os3;
import defpackage.pd4;
import defpackage.ph3;
import defpackage.pq;
import defpackage.ps1;
import defpackage.q25;
import defpackage.q40;
import defpackage.q41;
import defpackage.q90;
import defpackage.qh3;
import defpackage.qi3;
import defpackage.qm4;
import defpackage.r40;
import defpackage.rr2;
import defpackage.rs1;
import defpackage.rs3;
import defpackage.s25;
import defpackage.sl;
import defpackage.sp;
import defpackage.t6;
import defpackage.tn2;
import defpackage.tp;
import defpackage.ua4;
import defpackage.ud3;
import defpackage.ui1;
import defpackage.v11;
import defpackage.vq2;
import defpackage.vw1;
import defpackage.w12;
import defpackage.wl0;
import defpackage.wo0;
import defpackage.wp;
import defpackage.wr1;
import defpackage.x7;
import defpackage.xa3;
import defpackage.xp;
import defpackage.y41;
import defpackage.yc5;
import defpackage.yf4;
import defpackage.yp;
import defpackage.yp4;
import defpackage.yq2;
import defpackage.yw1;
import defpackage.zh0;
import defpackage.zp;
import defpackage.zq2;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaService extends MediaLibraryService implements ao2 {
    public wo0 A;
    public final Handler B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public final g5 F;
    public final ScheduledExecutorService G;
    public boolean H;
    public ScheduledFuture I;
    public final sp J;
    public final xp K;
    public final ii L;
    public String M;
    public String N;
    public long O;
    public final long P;
    public i41 u;
    public kn2 v;
    public s25 w;
    public q25 x;
    public ns3 y;
    public wp z;

    public MediaService() {
        this.B = new Handler(Looper.getMainLooper());
        this.F = new g5(4, this);
        ScheduledExecutorService r0 = Executors.newSingleThreadScheduledExecutor();
        r0.getClass();
        this.G = r0;
        this.J = new sp(this, 0);
        this.K = new xp(this);
        this.L = new ii();
        this.P = 5000;
    }

    public static final void m(MediaService r8) {
        qi3 r0 = r8.p().a();
        r0.getClass();
        gn2 r1 = r0.a();
        if (r1 == null) goto L17;
        Bundle r2 = r1.d.I;
        if (r2 == null) goto L8;
        String r3 = r2.getString("type");
    L10:
        if (h12.c(r3, WaveOrigin.RADIO) == true) goto L13;
        return;
    L13:
        if (r8.H == false) goto L15;
        return;
    L15:
        r8.n();
        r8.I = r8.G.scheduleWithFixedDelay(r8.J, 30, 30, TimeUnit.SECONDS);
        r8.H = true;
        return;
    L8:
        r3 = null;
        goto L10
    }

    @Override // defpackage.ao2
    public final void a(int r2, int r3, int r4) {
        if (r2 < 0) goto L8;
        if (r3 <= 0) goto L9;
        if (r4 < 0) goto L10;
        yp r0 = new yp(r2, r3, r4);
        this.L.addLast(r0);
        u();
        return;
    L10:
        return;
    L9:
        return;
    }

    @Override // defpackage.ao2
    public final qi3 b() {
        if (this.D == false) goto L7;
        return null;
    L7:
        return p().a();
    }

    @Override // androidx.media3.session.MediaLibraryService
    public final kn2 h(fr2 r1) {
        return p();
    }

    @Override // androidx.media3.session.MediaLibraryService
    public final kn2 i(fr2 r1) {
        return p();
    }

    public final void n() {
        qi3 r0 = p().a();
        r0.getClass();
        gn2 r1 = r0.a();
        if (r1 == null) goto L72;
        do2 r2 = r1.d;
        Bundle r3 = r2.I;
        HttpURLConnection r4 = null;
        if (r3 == null) goto L8;
        String r5 = r3.getString("type");
    L10:
        if (h12.c(r5, WaveOrigin.RADIO) == false) goto L73;
        CharSequence r6 = r2.b;
        if (r6 != null) goto L15;
    L16:
        CharSequence r7 = r2.a;
        if (r7 != null) goto L19;
    L20:
        if (r3 == null) goto L25;
        String r8 = r3.getString("radioArtist");
        if (r8 == null) goto L25;
        if (qm4.u0(r8) == true) goto L25;
        return;
    L25:
        if (r3 == null) goto L30;
        String r9 = r3.getString("radioTitle");
        if (r9 == null) goto L30;
        if (qm4.u0(r9) == true) goto L30;
        return;
    L30:
        if (r3 == null) goto L33;
        String r10 = r3.getString("uri");
        if (r10 == null) goto L33;
    L37:
        if (r10 != null) goto L39;
        return;
    L39:
        if (qm4.u0(r10) == true) goto L74;
        URLConnection r11 = new URL(r10).openConnection();     // Catch: Exception -> L62
        if ((r11 instanceof HttpURLConnection) == false) goto L44;
        r4 = (HttpURLConnection) r11;     // Catch: Exception -> L62
    L44:
        if (r4 == null) goto L69;
        r4.setRequestMethod("HEAD");     // Catch: Exception -> L62
        r4.setRequestProperty("Icy-MetaData", "1");     // Catch: Exception -> L62
        r4.setRequestProperty("User-Agent", "Tempus/1.0");     // Catch: Exception -> L62
        r4.setConnectTimeout(3000);     // Catch: Exception -> L62
        r4.setReadTimeout(3000);     // Catch: Exception -> L62
        r4.connect();     // Catch: Exception -> L62
        if (r4.getResponseCode() < 400) goto L50;
        r4.disconnect();     // Catch: Exception -> L62
        return;
    L50:
        String r12 = r4.getHeaderField("icy-name");     // Catch: Exception -> L62
        if (r12 != null) goto L55;
        r12 = r4.getHeaderField("StreamTitle");     // Catch: Exception -> L62
        if (r12 != null) goto L55;
        r12 = r4.getHeaderField("stream-title");     // Catch: Exception -> L62
    L55:
        r4.disconnect();     // Catch: Exception -> L62
        if (r12 != null) goto L58;
        return;
    L58:
        if (qm4.u0(r12) == true) goto L71;
        r(r12, r0);     // Catch: Exception -> L62
        return;
    L71:
        return;
    L69:
        return;
    L75:
        return;
    L74:
        return;
    L33:
        Uri r13 = r1.f.a;
        if (r13 == null) goto L36;
        r10 = r13.toString();
        goto L37
    L36:
        r10 = null;
        goto L37
    L19:
        if (qm4.u0(r7) == true) goto L20;
        return;
    L15:
        if (qm4.u0(r6) == true) goto L16;
        return;
    L73:
        return;
    L8:
        r5 = null;
        goto L10
    }

    public final ExoPlayer o() {
        i41 r0 = this.u;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("exoplayer");
        throw null;
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final IBinder onBind(Intent r3) {
        if (r3 == null) goto L4;
        String r0 = r3.getAction();
    L6:
        if (h12.c(r0, "com.eddyizm.tempus.service.BIND_EQUALIZER") == false) goto L10;
        return this.K;
    L10:
        return super.onBind(r3);
    L4:
        r0 = null;
        goto L6
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        o31 r0 = new o31(this);
        zp r2 = new zp(this);
        int r11 = 1;
        r2.c = 1;
        rr2.w(!r0.D);
        r0.c = new sl(4, r2);
        my0 r3 = new my0(this);
        rr2.w(!r0.D);
        r0.d = new sl(3, r3);
        il r4 = il.i;
        rr2.w(!r0.D);
        r0.j = r4;
        r0.k = true;
        rr2.w(!r0.D);
        r0.n = true;
        rr2.w(!r0.D);
        r0.l = 2;
        r0.m = true;
        HashMap r5 = new HashMap();
        r5.put(ik3.d.a, 144179200);
        wl0.k(1000, 0, "bufferForPlaybackMs", "0");
        wl0.k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        wl0.k(1200000, 1000, "minBufferMs", "bufferForPlaybackMs");
        wl0.k(1200000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        wl0.k(1200000, 1200000, "maxBufferMs", "minBufferMs");
        os3 r6 = new os3(new wl0(new gj0(), 1200000, 1200000, 1200000, 1200000, 2000, false, r5));
        rr2.w(!r0.D);
        r0.f = new sl(2, r6);
        rr2.w(!r0.D);
        r0.D = true;
        this.u = new i41(r0);
        boolean r14 = false;
        ((i41) o()).s(xa3.u("shuffle_mode", false));
        ExoPlayer r1 = o();
        App.b().getClass();
        ((i41) r1).p0(App.c().getInt("repeat_mode", 0));
        ExoPlayer r7 = o();
        App.b().getClass();
        float r8 = 1.0f;
        float r9 = App.c().getFloat("playback_speed", 1.0f);
        if (xa3.u("playback_speed_pitch", false) == true) goto L5;
    L8:
        ((i41) r7).d(new qh3(r9, r8));
        ExoPlayer r10 = o();
        Log.d("BaseMediaService", "initializeMediaLibrarySession");
        Intent r12 = new Intent(this, MainActivity.class);
        r12.setAction("com.eddyizm.tempus.action.OPEN_NOW_PLAYING");
        r12.setFlags(603979776);
        PendingIntent r13 = PendingIntent.getActivity(this, 0, r12, 201326592);
        Context r15 = getApplicationContext();
        r15.getClass();
        this.y = new ns3(r15);
        Context r16 = getBaseContext();
        r16.getClass();
        pq r17 = new pq(r16, this);
        Bundle r18 = new Bundle();
        Bundle r19 = new Bundle();
        vw1 r20 = yw1.o;
        gy3 r21 = gy3.r;
        int r22 = Build.VERSION.SDK_INT;
        if (r22 < 31) goto L11;
        rr2.l(go2.v(r13));
    L11:
        r13.getClass();
        ns3 r23 = this.y;
        if (r23 == null) goto L36;
        Object r24 = kn2.b;
        int r25 = ((Integer) tn2.I.get()).intValue();
        if (r22 >= 27) goto L16;
        r25 = Math.max(r25, (int) TypedValue.applyDimension(1, 320.0f, getResources().getDisplayMetrics()));
    L16:
        int r26 = 12;
        this.v = new kn2(this, r10, r13, r21, r21, r21, r17, r18, r19, new x7(r25, r26, r23));
        q(o());
        yf4.c().i = new zh0(9, this);
        if (yf4.c().f == true) goto L19;
    L21:
        s(null, o());
        int r27 = ud3.C();
        if (r27 == 1) goto L26;
        if (r27 == 2) goto L25;
        v11 r28 = new i80(23);
    L27:
        Context r29 = getBaseContext();
        r29.getClass();
        wo0 r30 = new wo0();
        r30.n = r28;
        r30.o = r29;
        this.A = r30;
        int r31 = ((i41) o()).e1();
        Context r32 = r29.getApplicationContext();
        r32.getClass();
        r28.f(r32, r31);
        sendBroadcast(new Intent("com.eddyizm.tempus.service.EQUALIZER_UPDATED"));
        this.z = new wp(this);
        ConnectivityManager r33 = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        wp r34 = this.z;
        if (r34 == null) goto L34;
        r33.registerDefaultNetworkCallback(r34);
        qi3 r35 = p().a();
        r35.getClass();
        v(r35);
        f25 r36 = new f25();
        s25 r37 = new s25(this, r36);
        r37.w = new hd5(3, this, r36);
        yq2.d(this);
        yq2.b();
        yq2.c().a(r37, false);
        this.w = r37;
        qi3 r38 = p().a();
        r38.getClass();
        if (r38.Q0() <= 0) goto L32;
        return;
    L32:
        new Thread(new k6(10, this, r38)).start();
        return;
    L34:
        h12.Q("networkCallback");
        throw null;
    L25:
        r28 = new y41(r11);
        goto L27
    L26:
        r28 = new d34(r26, r14);
        goto L27
    L19:
        if (yf4.c().g == false) goto L21;
        yf4 r39 = yf4.c();
        qi3 r40 = p().a();
        r39.f();
        r39.c = false;
        ua4 r41 = new ua4(r39, r40);
        r39.d = r41;
        r39.a.post(r41);
        goto L21
    L36:
        h12.Q("bitmapLoader");
        throw null;
    L5:
        if (xa3.u("playback_speed_manual_pitch", false) == false) goto L7;
        App.b().getClass();
        r8 = App.c().getFloat("playback_speed_manual_pitch_value", 1.0f);
        goto L8
    L7:
        r8 = r9;
        goto L8
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onDestroy() {
        rs3.a.b();
        qi3 r0 = p().a();
        r0.getClass();
        ps1 r1 = (ps1) rs1.q.remove(r0);
        if (r1 == null) goto L9;
        r0.r0(r1);
        Handler r2 = r1.q;
        r2.removeCallbacks(r1.r);
        r2.removeCallbacks(r1.s);
        rs1 r3 = rs1.a;
        b00 r4 = b00.a;
        rs1.a(b00.a(), null);
        zq2 r5 = r1.p;
        qi3 r6 = r1.n;
        gn2 r7 = r6.a();
        if (r7 == null) goto L7;
        String r8 = r7.a;
    L8:
        r5.c(r8, Long.valueOf(r6.M0()), SystemClock.elapsedRealtime(), false, "interrupted");
        goto L9
    L7:
        r8 = null;
    L9:
        is3.a.removeCallbacks(is3.f);
        WeakHashMap r9 = is3.b;
        Iterator r10 = r9.entrySet().iterator();
    L11:
        if (r10.hasNext() == false) goto L13;
        Map.Entry r11 = (Map.Entry) r10.next();
        ((qi3) r11.getKey()).r0((oi3) r11.getValue());
        goto L11
    L13:
        r9.clear();
        is3.c = null;
        is3.e.k(Boolean.FALSE);
        this.D = true;
        n61.e = null;
        ConnectivityManager r12 = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        wp r13 = this.z;
        if (r13 == null) goto L78;
        r12.unregisterNetworkCallback(r13);
        wo0 r14 = this.A;
        if (r14 == null) goto L76;
        int r15 = ((i41) o()).e1();
        v11 r16 = (v11) r14.n;
        Context r17 = ((Context) r14.o).getApplicationContext();
        r17.getClass();
        r16.o(r17, r15);
        jz3.b.clear();
        jz3.c.clear();
        jz3.f = new WeakReference(null);
        if (this.C == false) goto L21;
        this.B.removeCallbacks(this.F);
        this.C = false;
    L21:
        t();
        yf4.c().f();
        yf4.c().i = null;
        this.G.shutdown();
        ns3 r18 = this.y;
        if (r18 == null) goto L24;
        ((ExecutorService) r18.q).shutdown();
    L24:
        s25 r19 = this.w;
        if (r19 == null) goto L30;
        r19.w = null;
        yq2.d(this);
        yq2.b();
        ui1 r20 = yq2.c();
        vq2 r21 = r20.d(r19);
        if (r21 == null) goto L29;
        yq2.b();
        r19.q = null;
        r19.g(null);
        r20.m(r21, null);
        r20.a.b(514, r21);
        r20.k.remove(r21);
    L29:
        r19.A = false;
        r19.B = false;
        r19.y.removeCallbacksAndMessages(null);
        r19.x.shutdown();
    L30:
        this.w = null;
        q25 r22 = this.x;
        if (r22 == null) goto L33;
        r22.A1();
    L33:
        this.x = null;
        i41 r23 = (i41) o();
        StringBuilder r24 = new StringBuilder("Release ");
        r24.append(Integer.toHexString(System.identityHashCode(r23)));
        r24.append(" [AndroidXMedia3/1.9.2] [");
        r24.append(f35.a);
        r24.append("] [");
        monitor-enter(hn2.class);
        String r25 = hn2.b;     // Catch: Throwable -> L72
        monitor-exit(hn2.class);
        r24.append(r25);
        r24.append("]");
        l93.K("ExoPlayerImpl", r24.toString());
        r23.z1();
        r23.z.l(false);
        r23.A.k(false);
        r23.B.k(false);
        yc5 r26 = r23.F;
        if (r26 != null) goto L40;
    L45:
        w12 r27 = r23.E;
        ((yp4) r27.g).e();
        ((i41) r27.b).r0((j52) r27.c);
        q41 r28 = r23.m;
        if (r28.X == false) goto L48;
    L51:
        boolean r29 = true;
    L52:
        if (r29 == true) goto L54;
        r23.n.f(10, new mj0(17));
    L54:
        r23.n.d();
        r23.k.e();
        r23.v.h(r23.t);
        ph3 r30 = r23.p0;
        if (r30.p == false) goto L57;
        r23.p0 = r30.a();
    L57:
        ph3 r31 = i41.k1(r23.p0, 1);
        r23.p0 = r31;
        ph3 r32 = r31.c(r31.b);
        r23.p0 = r32;
        r32.q = r32.s;
        r23.p0.r = 0;
        nj0 r33 = r23.t;
        yp4 r34 = r33.u;
        r34.getClass();
        r34.d(new a0(16, r33));
        r23.p1();
        Surface r35 = r23.V;
        if (r35 == null) goto L60;
        r35.release();
        r23.V = null;
    L60:
        r23.e0 = jg0.d;
        r23.i0 = true;
        kn2 r36 = p();
        Object r37 = kn2.b;     // Catch: Exception -> L80
        monitor-enter(r37);     // Catch: Exception -> L80
        kn2.c.remove(r36.a.i);     // Catch: Throwable -> L67
        monitor-exit(r37);     // Catch: Throwable -> L67
        r36.a.A();     // Catch: Exception -> L80
        goto L70
    L67:
        th = move-exception;
        throw th;     // Catch: Exception -> L80
    L70:
        super.onDestroy();
        return;
    L48:
        if (r28.w.getThread().isAlive() == false) goto L51;
        r28.X = true;
        q90 r38 = new q90(r28.D);
        r28.u.b(7, r38).b();
        r29 = r38.c(r28.I);
        goto L52
    L40:
        if (Build.VERSION.SDK_INT < 34) goto L45;
        Context r39 = (Context) ((WeakReference) r26.n).get();
        if (r39 == null) goto L45;
        bn.u(r39, (g41) r26.o);
    L72:
        th = move-exception;
        throw th;
    L76:
        h12.Q("equalizerManager");
        throw null;
    L78:
        h12.Q("networkCallback");
        throw null;
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final int onStartCommand(Intent r6, int r7, int r8) {
        if (r6 == null) goto L5;
        String r1 = r6.getAction();
    L6:
        int r2 = 1;
        if (r1 != null) goto L9;
    L25:
        super.onStartCommand(r6, r7, r8);
        return 1;
    L9:
        if (r1.hashCode() != (-170235117)) goto L25;
        if (r1.equals("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER") == false) goto L25;
        wo0 r3 = this.A;
        if (r3 == null) goto L23;
        int r0 = ((i41) o()).e1();
        v11 r4 = (v11) r3.n;
        Context r5 = ((Context) r3.o).getApplicationContext();
        r5.getClass();
        r4.o(r5, r0);
        int r9 = ud3.C();
        if (r9 != 1) goto L18;
        v11 r10 = new d34(12, false);
    L22:
        Context r11 = getBaseContext();
        r11.getClass();
        wo0 r12 = new wo0();
        r12.n = r10;
        r12.o = r11;
        this.A = r12;
        int r13 = ((i41) o()).e1();
        Context r14 = r11.getApplicationContext();
        r14.getClass();
        r10.f(r14, r13);
        sendBroadcast(new Intent("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER"));
        goto L25
    L18:
        if (r9 == 2) goto L20;
        r10 = new i80(23);
        goto L22
    L20:
        r10 = new y41(r2);
        goto L22
    L23:
        h12.Q("equalizerManager");
        throw null;
    L5:
        r1 = null;
        goto L6
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onTaskRemoved(Intent r5) {
        qi3 r6 = p().a();
        r6.getClass();
        if (r6.q() == false) goto L9;
        if (r6.Q0() == 0) goto L9;
        return;
    L9:
        if (r6.a() != null) goto L11;
    L13:
        stopSelf();
        return;
    L11:
        if (r6.M0() <= 0) goto L13;
        bo2.n(r6.a(), r6.M0());
        goto L13
    }

    public final kn2 p() {
        kn2 r0 = this.v;
        if (r0 == null) goto L5;
        return r0;
    L5:
        h12.Q("mediaLibrarySession");
        throw null;
    }

    public final void q(qi3 r4) {
        rs1.g();
        WeakHashMap r0 = rs1.q;
        if (r0.containsKey(r4) == true) goto L6;
        ps1 r1 = new ps1(r4);
        r0.put(r4, r1);
        r4.v(r1);
    L6:
        is3.c = this;
        WeakHashMap r2 = is3.b;
        if (r2.containsKey(r4) == true) goto L10;
        j52 r3 = new j52(2, this);
        r2.put(r4, r3);
        r4.v(r3);
    L10:
        WeakReference r5 = b.a;
        b.a = new WeakReference(this);
        WeakReference r6 = a.a;
        a.a = new WeakReference(this);
        r4.v(new aq(this, r4));
        AURAWavePlaybackListener.attach(r4);
        if (r4.h0() == true) goto L13;
        return;
    L13:
        if (this.C == true) goto L18;
        g5 r7 = this.F;
        this.B.postDelayed(r7, 1000);
        this.C = true;
        return;
    }

    public final void r(String r11, qi3 r12) {
        List r0 = qm4.C0(r11, new String[]{" - "}, 2);
        String r3 = null;
        if (r0.size() != 2) goto L8;
        String r2 = qm4.K0((String) r0.get(0)).toString();
        if (r2.length() != 0) goto L7;
        r2 = null;
    L7:
        String r6 = r2;
    L10:
        if (r0.size() != 2) goto L16;
        String r13 = qm4.K0((String) r0.get(1)).toString();
        if (r13.length() == 0) goto L15;
    L14:
        r3 = r13;
    L15:
        String r7 = r3;
        if (r6 != null) goto L21;
    L22:
        if (r7 != null) goto L24;
        return;
    L24:
        if (qm4.u0(r7) == false) goto L27;
        return;
    L27:
        if (h12.c(r6, this.M) == true) goto L29;
    L31:
        this.M = r6;
        this.N = r7;
        this.B.post(new t6(r12, r6, r7, this, 2));
        return;
    L29:
        if (h12.c(r7, this.N) == false) goto L31;
        return;
    L21:
        if (qm4.u0(r6) == false) goto L27;
    L16:
        r13 = qm4.K0(r11).toString();
        if (r13.length() != 0) goto L14;
    L8:
        r6 = null;
        goto L10
    }

    public final void s(qi3 r8, qi3 r9) {
        if (r8 == r9) goto L25;
        boolean r0 = true;
        if (r8 == null) goto L11;
        j02 r2 = new j02(0, r8.Q0() - 1, 1);
        ArrayList r3 = new ArrayList(r40.k0(r2, 10));
        Iterator r4 = r2.iterator();
    L8:
        if (((i02) r4).p == false) goto L10;
        r3.add(r8.Y(((b02) r4).nextInt()));
        goto L8
    L10:
        int r5 = r8.o0();
        long r6 = r8.M0();
        boolean r7 = r8.q();
        r8.stop();
        r9.T(r3, r5, r6);
        r9.V(r7);
        r9.b();
    L11:
        kn2 r10 = p();
        rr2.l(r9.P0());
        if (r9.U0() != r10.a().U0()) goto L14;
        boolean r11 = true;
    L15:
        rr2.l(r11);
        if (r9.U0() == Looper.myLooper()) goto L19;
        r0 = false;
    L19:
        rr2.w(r0);
        tn2 r12 = r10.a;
        al3 r13 = r12.s;
        if (r9 != r13.b) goto L22;
        return;
    L22:
        r12.D(r13, new al3(r9));
        return;
    L14:
        r11 = false;
        goto L15
    }

    public final void t() {
        if (this.H == true) goto L5;
        return;
    L5:
        ScheduledFuture r0 = this.I;
        if (r0 == null) goto L8;
        r0.cancel(false);
    L8:
        this.I = null;
        this.H = false;
    }

    public final void u() {
        Object r0 = o();
    L3:
        ii r1 = this.L;
        if (r1.isEmpty() == true) goto L34;
        yp r2 = (yp) r1.first();
        fq r3 = (fq) r0;
        int r4 = r3.Q0();
        int r5 = r2.c;
        int r6 = r2.a;
        int r7 = r2.b;
        if (r4 < r5) goto L56;
        if (r3.Q0() != r5) goto L10;
        i41 r8 = (i41) r0;
        r8.z1();
        if (r8.J == false) goto L13;
        if (r8.o0() == (-1)) goto L33;
        int r9 = r6 + r7;
        if (r9 > r5) goto L33;
        cu4 r10 = r8.x0();
        r10.getClass();
        ArrayList r11 = new ArrayList(r5);
        int r12 = r10.a(true);
    L20:
        int r13 = 0;
        if (r12 == (-1)) goto L26;
        if (r12 < r6) goto L24;
        if (r12 >= r9) goto L24;
    L25:
        r12 = r10.e(r12, 0, true);
    L24:
        r11.add(Integer.valueOf(r12));
        goto L25
    L26:
        int r14 = r11.indexOf(Integer.valueOf(r6 - 1));
        if (r14 < 0) goto L28;
        ArrayList r15 = new ArrayList(r5);
        r15.addAll(r11);
    L30:
        if (r13 >= r7) goto L32;
        r15.add((r14 + 1) + r13, Integer.valueOf(r6 + r13));
        r13 = r13 + 1;
        goto L30
    L32:
        int[] r16 = q40.P0(r15);
        ju3 r17 = ku3.n;
        r8.s1(new pd4(r16, ku3.o.b().nextLong()));
        Log.d("BaseMediaService", "playNextFixup: " + r7 + " item(s) moved to shuffle position " + (r14 + 1));
        r1.removeFirst();
        goto L3
    L28:
        r1.removeFirst();
    L33:
        r1.removeFirst();
        goto L3
    L13:
        r1.removeFirst();
        goto L3
    L10:
        r1.removeFirst();
        goto L3
    L56:
        return;
    }

    public final void v(qi3 r6) {
        Log.d("BaseMediaService", "update items");
        int r0 = r6.o0();
        if (r0 == (-1)) goto L15;
        j02 r1 = gb.g0(r0 + 1, r6.Q0());
        ArrayList r2 = new ArrayList(r40.k0(r1, 10));
        Iterator r3 = r1.iterator();
    L7:
        if (((i02) r3).p == false) goto L10;
        int r4 = ((b02) r3).nextInt();
        r2.add(new kd3(Integer.valueOf(r4), r6.Y(r4)));
        goto L7
    L10:
        if (r2.isEmpty() == false) goto L12;
        return;
    L12:
        ExecutorService r5 = Executors.newSingleThreadExecutor();
        int r7 = 0;
        ic2 r8 = wr1.M(r5).b(new tp(r7, r2));
        r8.getClass();
        r5.shutdown();
        r8.f(new lg1(r7, r8, new wo0(this, r6)), gq0.n);
        return;
    }

    public final void w(qi3 r24) {
        gn2 r0 = r24.a();
        Long r1 = null;
        if (r0 == null) goto L10;
        do2 r2 = r0.d;
        if (r2 == null) goto L10;
        CharSequence r3 = r2.a;
        if (r3 == null) goto L10;
        String r4 = r3.toString();
        if (r4 == null) goto L10;
    L18:
        if (r0 == null) goto L25;
        do2 r5 = r0.d;
        if (r5 == null) goto L25;
        CharSequence r6 = r5.b;
        if (r6 == null) goto L25;
        String r7 = r6.toString();
        if (r7 == null) goto L25;
    L33:
        if (r0 == null) goto L40;
        do2 r8 = r0.d;
        if (r8 == null) goto L40;
        CharSequence r9 = r8.c;
        if (r9 == null) goto L40;
        String r10 = r9.toString();
        if (r10 == null) goto L40;
    L47:
        if (r0 == null) goto L51;
        do2 r11 = r0.d;
        if (r11 == null) goto L51;
        Bundle r12 = r11.I;
    L52:
        if (r12 == null) goto L54;
        String r13 = r12.getString("coverArtId");
    L55:
        if (r12 == null) goto L60;
        String r14 = r12.getString("assetLinkSong");
        if (r14 == null) goto L60;
    L59:
        String r20 = r14;
        if (r12 == null) goto L69;
        String r15 = r12.getString("assetLinkAlbum");
        if (r15 == null) goto L69;
    L68:
        String r21 = r15;
        if (r12 == null) goto L78;
        String r16 = r12.getString("assetLinkArtist");
        if (r16 == null) goto L78;
    L77:
        String r22 = r16;
        long r17 = r24.M0();
        Long r18 = Long.valueOf(r17);
        if (r17 != (-9223372036854775807L)) goto L86;
        r18 = null;
    L86:
        long r19 = 0;
        if (r18 == null) goto L89;
        long r110 = r18.longValue();
    L90:
        long r111 = r24.getDuration();
        Long r23 = Long.valueOf(r111);
        if (r111 == (-9223372036854775807L)) goto L93;
        r1 = r23;
    L93:
        if (r1 == null) goto L95;
        r19 = r1.longValue();
    L95:
        long r112 = r19;
        if (r4 != null) goto L98;
        String r25 = "";
    L99:
        if (r7 != null) goto L101;
        String r113 = "";
    L102:
        if (r10 != null) goto L104;
        String r114 = "";
    L105:
        ji2.T(this, r25, r113, r114, r13, r24.h0(), r24.D0(), r24.h(), r110, r112, r20, r21, r22);
        return;
    L104:
        r114 = r10;
        goto L105
    L101:
        r113 = r7;
        goto L102
    L98:
        r25 = r4;
        goto L99
    L89:
        r110 = 0;
    L78:
        if (r12 == null) goto L80;
        String r26 = r12.getString("artistId");
    L81:
        r16 = l93.i("artist", r26);
        goto L77
    L80:
        r26 = null;
    L69:
        if (r12 == null) goto L71;
        String r27 = r12.getString("albumId");
    L72:
        r15 = l93.i("album", r27);
        goto L68
    L71:
        r27 = null;
    L60:
        if (r12 == null) goto L62;
        String r28 = r12.getString("id");
    L63:
        r14 = l93.i("song", r28);
        goto L59
    L62:
        r28 = null;
        goto L63
    L54:
        r13 = null;
    L51:
        r12 = null;
    L40:
        if (r0 == null) goto L46;
        do2 r29 = r0.d;
        if (r29 == null) goto L46;
        Bundle r30 = r29.I;
        if (r30 == null) goto L46;
        r10 = r30.getString("album");
    L46:
        r10 = null;
    L25:
        if (r0 == null) goto L31;
        do2 r31 = r0.d;
        if (r31 == null) goto L31;
        Bundle r32 = r31.I;
        if (r32 == null) goto L31;
        r7 = r32.getString("artist");
    L31:
        r7 = null;
    L10:
        if (r0 == null) goto L16;
        do2 r33 = r0.d;
        if (r33 == null) goto L16;
        Bundle r34 = r33.I;
        if (r34 == null) goto L16;
        r4 = r34.getString("title");
    L16:
        r4 = null;
        goto L18
    }
}
