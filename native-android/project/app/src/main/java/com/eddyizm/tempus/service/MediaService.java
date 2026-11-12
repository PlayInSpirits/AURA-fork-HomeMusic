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
    public boolean C;
    public volatile boolean D;
    public long E;
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
    public final Handler B = new Handler(Looper.getMainLooper());
    public final g5 F = new g5(4, this);

    public MediaService() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        this.G = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.J = new sp(this, 0);
        this.K = new xp(this);
        this.L = new ii();
        this.P = 5000L;
    }

    public static final void m(MediaService mediaService) {
        qi3 qi3VarA = mediaService.p().a();
        qi3VarA.getClass();
        gn2 gn2VarA = qi3VarA.a();
        if (gn2VarA == null) {
            return;
        }
        Bundle bundle = gn2VarA.d.I;
        if (h12.c(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO) && !mediaService.H) {
            mediaService.n();
            mediaService.I = mediaService.G.scheduleWithFixedDelay(mediaService.J, 30L, 30L, TimeUnit.SECONDS);
            mediaService.H = true;
        }
    }

    @Override // defpackage.ao2
    public final void a(int i, int i2, int i3) {
        if (i < 0 || i2 <= 0 || i3 < 0) {
            return;
        }
        this.L.addLast(new yp(i, i2, i3));
        u();
    }

    @Override // defpackage.ao2
    public final qi3 b() {
        if (this.D) {
            return null;
        }
        return p().a();
    }

    @Override // androidx.media3.session.MediaLibraryService
    public final kn2 h(fr2 fr2Var) {
        return p();
    }

    @Override // androidx.media3.session.MediaLibraryService
    public final kn2 i(fr2 fr2Var) {
        return p();
    }

    public final void n() {
        String string;
        String string2;
        String string3;
        qi3 qi3VarA = p().a();
        qi3VarA.getClass();
        gn2 gn2VarA = qi3VarA.a();
        if (gn2VarA == null) {
            return;
        }
        do2 do2Var = gn2VarA.d;
        Bundle bundle = do2Var.I;
        if (h12.c(bundle != null ? bundle.getString("type") : null, WaveOrigin.RADIO)) {
            CharSequence charSequence = do2Var.b;
            if (charSequence == null || qm4.u0(charSequence)) {
                CharSequence charSequence2 = do2Var.a;
                if (charSequence2 == null || qm4.u0(charSequence2)) {
                    if (bundle == null || (string3 = bundle.getString("radioArtist")) == null || qm4.u0(string3)) {
                        if (bundle == null || (string2 = bundle.getString("radioTitle")) == null || qm4.u0(string2)) {
                            if (bundle == null || (string = bundle.getString("uri")) == null) {
                                Uri uri = gn2VarA.f.a;
                                string = uri != null ? uri.toString() : null;
                            }
                            if (string == null || qm4.u0(string)) {
                                return;
                            }
                            try {
                                URLConnection uRLConnectionOpenConnection = new URL(string).openConnection();
                                HttpURLConnection httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.setRequestMethod("HEAD");
                                httpURLConnection.setRequestProperty("Icy-MetaData", "1");
                                httpURLConnection.setRequestProperty("User-Agent", "Tempus/1.0");
                                httpURLConnection.setConnectTimeout(3000);
                                httpURLConnection.setReadTimeout(3000);
                                httpURLConnection.connect();
                                if (httpURLConnection.getResponseCode() >= 400) {
                                    httpURLConnection.disconnect();
                                    return;
                                }
                                String headerField = httpURLConnection.getHeaderField("icy-name");
                                if (headerField == null && (headerField = httpURLConnection.getHeaderField("StreamTitle")) == null) {
                                    headerField = httpURLConnection.getHeaderField("stream-title");
                                }
                                httpURLConnection.disconnect();
                                if (headerField != null && !qm4.u0(headerField)) {
                                    r(headerField, qi3VarA);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final ExoPlayer o() {
        i41 i41Var = this.u;
        if (i41Var != null) {
            return i41Var;
        }
        h12.Q("exoplayer");
        throw null;
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final IBinder onBind(Intent intent) {
        return h12.c(intent != null ? intent.getAction() : null, "com.eddyizm.tempus.service.BIND_EQUALIZER") ? this.K : super.onBind(intent);
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onCreate() {
        v11 d34Var;
        super.onCreate();
        o31 o31Var = new o31(this);
        zp zpVar = new zp(this);
        int i = 1;
        zpVar.c = 1;
        rr2.w(!o31Var.D);
        o31Var.c = new sl(4, zpVar);
        my0 my0Var = new my0(this);
        rr2.w(!o31Var.D);
        o31Var.d = new sl(3, my0Var);
        il ilVar = il.i;
        rr2.w(!o31Var.D);
        o31Var.j = ilVar;
        o31Var.k = true;
        rr2.w(!o31Var.D);
        o31Var.n = true;
        rr2.w(!o31Var.D);
        o31Var.l = 2;
        o31Var.m = true;
        HashMap map = new HashMap();
        map.put(ik3.d.a, 144179200);
        wl0.k(1000, 0, "bufferForPlaybackMs", "0");
        wl0.k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        wl0.k(1200000, 1000, "minBufferMs", "bufferForPlaybackMs");
        wl0.k(1200000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        wl0.k(1200000, 1200000, "maxBufferMs", "minBufferMs");
        os3 os3Var = new os3(new wl0(new gj0(), 1200000, 1200000, 1200000, 1200000, 2000, false, map));
        rr2.w(!o31Var.D);
        o31Var.f = new sl(2, os3Var);
        rr2.w(!o31Var.D);
        o31Var.D = true;
        this.u = new i41(o31Var);
        boolean z = false;
        ((i41) o()).s(xa3.u("shuffle_mode", false));
        ExoPlayer exoPlayerO = o();
        App.b().getClass();
        ((i41) exoPlayerO).p0(App.c().getInt("repeat_mode", 0));
        ExoPlayer exoPlayerO2 = o();
        App.b().getClass();
        float f = 1.0f;
        float f2 = App.c().getFloat("playback_speed", 1.0f);
        if (xa3.u("playback_speed_pitch", false)) {
            if (xa3.u("playback_speed_manual_pitch", false)) {
                App.b().getClass();
                f = App.c().getFloat("playback_speed_manual_pitch_value", 1.0f);
            } else {
                f = f2;
            }
        }
        ((i41) exoPlayerO2).d(new qh3(f2, f));
        ExoPlayer exoPlayerO3 = o();
        Log.d("BaseMediaService", "initializeMediaLibrarySession");
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setAction("com.eddyizm.tempus.action.OPEN_NOW_PLAYING");
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.y = new ns3(applicationContext);
        Context baseContext = getBaseContext();
        baseContext.getClass();
        pq pqVar = new pq(baseContext, this);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            rr2.l(activity.isActivity());
        }
        activity.getClass();
        ns3 ns3Var = this.y;
        if (ns3Var == null) {
            h12.Q("bitmapLoader");
            throw null;
        }
        Object obj = kn2.b;
        int iIntValue = ((Integer) tn2.I.get()).intValue();
        if (i2 < 27) {
            iIntValue = Math.max(iIntValue, (int) TypedValue.applyDimension(1, 320.0f, getResources().getDisplayMetrics()));
        }
        int i3 = 12;
        this.v = new kn2(this, exoPlayerO3, activity, gy3Var, gy3Var, gy3Var, pqVar, bundle, bundle2, new x7(iIntValue, i3, ns3Var));
        q(o());
        yf4.c().i = new zh0(9, this);
        if (yf4.c().f && yf4.c().g) {
            yf4 yf4VarC = yf4.c();
            qi3 qi3VarA = p().a();
            yf4VarC.f();
            yf4VarC.c = false;
            ua4 ua4Var = new ua4(yf4VarC, qi3VarA);
            yf4VarC.d = ua4Var;
            yf4VarC.a.post(ua4Var);
        }
        s(null, o());
        int iC = ud3.C();
        if (iC != 1) {
            d34Var = iC != 2 ? new i80(23) : new y41(i);
        } else {
            d34Var = new d34(i3, z);
        }
        Context baseContext2 = getBaseContext();
        baseContext2.getClass();
        wo0 wo0Var = new wo0();
        wo0Var.n = d34Var;
        wo0Var.o = baseContext2;
        this.A = wo0Var;
        int iE1 = ((i41) o()).e1();
        Context applicationContext2 = baseContext2.getApplicationContext();
        applicationContext2.getClass();
        d34Var.f(applicationContext2, iE1);
        sendBroadcast(new Intent("com.eddyizm.tempus.service.EQUALIZER_UPDATED"));
        this.z = new wp(this);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        wp wpVar = this.z;
        if (wpVar == null) {
            h12.Q("networkCallback");
            throw null;
        }
        connectivityManager.registerDefaultNetworkCallback(wpVar);
        qi3 qi3VarA2 = p().a();
        qi3VarA2.getClass();
        v(qi3VarA2);
        f25 f25Var = new f25();
        s25 s25Var = new s25(this, f25Var);
        s25Var.w = new hd5(3, this, f25Var);
        yq2.d(this);
        yq2.b();
        yq2.c().a(s25Var, false);
        this.w = s25Var;
        qi3 qi3VarA3 = p().a();
        qi3VarA3.getClass();
        if (qi3VarA3.Q0() > 0) {
            return;
        }
        new Thread(new k6(10, this, qi3VarA3)).start();
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onDestroy() {
        String str;
        boolean zC;
        Context context;
        rs3.a.b();
        qi3 qi3VarA = p().a();
        qi3VarA.getClass();
        ps1 ps1Var = (ps1) rs1.q.remove(qi3VarA);
        if (ps1Var != null) {
            qi3VarA.r0(ps1Var);
            Handler handler = ps1Var.q;
            handler.removeCallbacks(ps1Var.r);
            handler.removeCallbacks(ps1Var.s);
            rs1 rs1Var = rs1.a;
            b00 b00Var = b00.a;
            rs1.a(b00.a(), null);
            zq2 zq2Var = ps1Var.p;
            qi3 qi3Var = ps1Var.n;
            gn2 gn2VarA = qi3Var.a();
            zq2Var.c(gn2VarA != null ? gn2VarA.a : null, Long.valueOf(qi3Var.M0()), SystemClock.elapsedRealtime(), false, "interrupted");
        }
        is3.a.removeCallbacks(is3.f);
        WeakHashMap weakHashMap = is3.b;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            ((qi3) entry.getKey()).r0((oi3) entry.getValue());
        }
        weakHashMap.clear();
        is3.c = null;
        is3.e.k(Boolean.FALSE);
        this.D = true;
        n61.e = null;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        wp wpVar = this.z;
        if (wpVar == null) {
            h12.Q("networkCallback");
            throw null;
        }
        connectivityManager.unregisterNetworkCallback(wpVar);
        wo0 wo0Var = this.A;
        if (wo0Var == null) {
            h12.Q("equalizerManager");
            throw null;
        }
        int iE1 = ((i41) o()).e1();
        v11 v11Var = (v11) wo0Var.n;
        Context applicationContext = ((Context) wo0Var.o).getApplicationContext();
        applicationContext.getClass();
        v11Var.o(applicationContext, iE1);
        jz3.b.clear();
        jz3.c.clear();
        jz3.f = new WeakReference(null);
        if (this.C) {
            this.B.removeCallbacks(this.F);
            this.C = false;
        }
        t();
        yf4.c().f();
        yf4.c().i = null;
        this.G.shutdown();
        ns3 ns3Var = this.y;
        if (ns3Var != null) {
            ((ExecutorService) ns3Var.q).shutdown();
        }
        s25 s25Var = this.w;
        if (s25Var != null) {
            s25Var.w = null;
            yq2.d(this);
            yq2.b();
            ui1 ui1VarC = yq2.c();
            vq2 vq2VarD = ui1VarC.d(s25Var);
            if (vq2VarD != null) {
                yq2.b();
                s25Var.q = null;
                s25Var.g(null);
                ui1VarC.m(vq2VarD, null);
                ui1VarC.a.b(514, vq2VarD);
                ui1VarC.k.remove(vq2VarD);
            }
            s25Var.A = false;
            s25Var.B = false;
            s25Var.y.removeCallbacksAndMessages(null);
            s25Var.x.shutdown();
        }
        this.w = null;
        q25 q25Var = this.x;
        if (q25Var != null) {
            q25Var.A1();
        }
        this.x = null;
        i41 i41Var = (i41) o();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(i41Var)));
        sb.append(" [AndroidXMedia3/1.9.2] [");
        sb.append(f35.a);
        sb.append("] [");
        synchronized (hn2.class) {
            str = hn2.b;
        }
        sb.append(str);
        sb.append("]");
        l93.K("ExoPlayerImpl", sb.toString());
        i41Var.z1();
        i41Var.z.l(false);
        i41Var.A.k(false);
        i41Var.B.k(false);
        yc5 yc5Var = i41Var.F;
        if (yc5Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) yc5Var.n).get()) != null) {
            context.unregisterDeviceIdChangeListener((g41) yc5Var.o);
        }
        w12 w12Var = i41Var.E;
        ((yp4) w12Var.g).e();
        ((i41) w12Var.b).r0((j52) w12Var.c);
        q41 q41Var = i41Var.m;
        if (q41Var.X || !q41Var.w.getThread().isAlive()) {
            zC = true;
        } else {
            q41Var.X = true;
            q90 q90Var = new q90(q41Var.D);
            q41Var.u.b(7, q90Var).b();
            zC = q90Var.c(q41Var.I);
        }
        if (!zC) {
            i41Var.n.f(10, new mj0(17));
        }
        i41Var.n.d();
        i41Var.k.e();
        i41Var.v.h(i41Var.t);
        ph3 ph3Var = i41Var.p0;
        if (ph3Var.p) {
            i41Var.p0 = ph3Var.a();
        }
        ph3 ph3VarK1 = i41.k1(i41Var.p0, 1);
        i41Var.p0 = ph3VarK1;
        ph3 ph3VarC = ph3VarK1.c(ph3VarK1.b);
        i41Var.p0 = ph3VarC;
        ph3VarC.q = ph3VarC.s;
        i41Var.p0.r = 0L;
        nj0 nj0Var = i41Var.t;
        yp4 yp4Var = nj0Var.u;
        yp4Var.getClass();
        yp4Var.d(new a0(16, nj0Var));
        i41Var.p1();
        Surface surface = i41Var.V;
        if (surface != null) {
            surface.release();
            i41Var.V = null;
        }
        i41Var.e0 = jg0.d;
        i41Var.i0 = true;
        kn2 kn2VarP = p();
        try {
            synchronized (kn2.b) {
                kn2.c.remove(kn2VarP.a.i);
            }
            kn2VarP.a.A();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        v11 d34Var;
        String action = intent != null ? intent.getAction() : null;
        int i3 = 1;
        if (action != null && action.hashCode() == -170235117 && action.equals("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER")) {
            wo0 wo0Var = this.A;
            if (wo0Var == null) {
                h12.Q("equalizerManager");
                throw null;
            }
            int iE1 = ((i41) o()).e1();
            v11 v11Var = (v11) wo0Var.n;
            Context applicationContext = ((Context) wo0Var.o).getApplicationContext();
            applicationContext.getClass();
            v11Var.o(applicationContext, iE1);
            int iC = ud3.C();
            if (iC != 1) {
                d34Var = iC != 2 ? new i80(23) : new y41(i3);
            } else {
                d34Var = new d34(12, false);
            }
            Context baseContext = getBaseContext();
            baseContext.getClass();
            wo0 wo0Var2 = new wo0();
            wo0Var2.n = d34Var;
            wo0Var2.o = baseContext;
            this.A = wo0Var2;
            int iE2 = ((i41) o()).e1();
            Context applicationContext2 = baseContext.getApplicationContext();
            applicationContext2.getClass();
            d34Var.f(applicationContext2, iE2);
            sendBroadcast(new Intent("com.eddyizm.tempus.service.ACTION_RELOAD_EQUALIZER"));
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // androidx.media3.session.MediaLibraryService, android.app.Service
    public final void onTaskRemoved(Intent intent) {
        qi3 qi3VarA = p().a();
        qi3VarA.getClass();
        if (!qi3VarA.q() || qi3VarA.Q0() == 0) {
            if (qi3VarA.a() != null && qi3VarA.M0() > 0) {
                bo2.n(qi3VarA.a(), qi3VarA.M0());
            }
            stopSelf();
        }
    }

    public final kn2 p() {
        kn2 kn2Var = this.v;
        if (kn2Var != null) {
            return kn2Var;
        }
        h12.Q("mediaLibrarySession");
        throw null;
    }

    public final void q(qi3 qi3Var) {
        rs1.g();
        WeakHashMap weakHashMap = rs1.q;
        if (!weakHashMap.containsKey(qi3Var)) {
            ps1 ps1Var = new ps1(qi3Var);
            weakHashMap.put(qi3Var, ps1Var);
            qi3Var.v(ps1Var);
        }
        is3.c = this;
        WeakHashMap weakHashMap2 = is3.b;
        if (!weakHashMap2.containsKey(qi3Var)) {
            j52 j52Var = new j52(2, this);
            weakHashMap2.put(qi3Var, j52Var);
            qi3Var.v(j52Var);
        }
        WeakReference weakReference = b.a;
        b.a = new WeakReference(this);
        WeakReference weakReference2 = a.a;
        a.a = new WeakReference(this);
        qi3Var.v(new aq(this, qi3Var));
        AURAWavePlaybackListener.attach(qi3Var);
        if (!qi3Var.h0() || this.C) {
            return;
        }
        this.B.postDelayed(this.F, 1000L);
        this.C = true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
  0x0047: PHI (r11v9 java.lang.String) = (r11v2 java.lang.String), (r11v14 java.lang.String) binds: [B:17:0x0056, B:12:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public final void r(String str, qi3 qi3Var) {
        String str2;
        String string;
        List listC0 = qm4.C0(str, new String[]{" - "}, 2);
        String str3 = null;
        if (listC0.size() == 2) {
            String string2 = qm4.K0((String) listC0.get(0)).toString();
            if (string2.length() == 0) {
                string2 = null;
            }
            str2 = string2;
        } else {
            str2 = null;
        }
        if (listC0.size() == 2) {
            string = qm4.K0((String) listC0.get(1)).toString();
            if (string.length() != 0) {
                str3 = string;
            }
        } else {
            string = qm4.K0(str).toString();
            if (string.length() != 0) {
                str3 = string;
            }
        }
        String str4 = str3;
        if ((str2 == null || qm4.u0(str2)) && (str4 == null || qm4.u0(str4))) {
            return;
        }
        if (h12.c(str2, this.M) && h12.c(str4, this.N)) {
            return;
        }
        this.M = str2;
        this.N = str4;
        this.B.post(new t6(qi3Var, str2, str4, this, 2));
    }

    public final void s(qi3 qi3Var, qi3 qi3Var2) {
        if (qi3Var == qi3Var2) {
            return;
        }
        if (qi3Var != null) {
            j02 j02Var = new j02(0, qi3Var.Q0() - 1, 1);
            ArrayList arrayList = new ArrayList(r40.k0(j02Var, 10));
            Iterator it = j02Var.iterator();
            while (((i02) it).p) {
                arrayList.add(qi3Var.Y(((b02) it).nextInt()));
            }
            int iO0 = qi3Var.o0();
            long jM0 = qi3Var.M0();
            boolean zQ = qi3Var.q();
            qi3Var.stop();
            qi3Var2.T(arrayList, iO0, jM0);
            qi3Var2.V(zQ);
            qi3Var2.b();
        }
        kn2 kn2VarP = p();
        rr2.l(qi3Var2.P0());
        rr2.l(qi3Var2.U0() == kn2VarP.a().U0());
        rr2.w(qi3Var2.U0() == Looper.myLooper());
        tn2 tn2Var = kn2VarP.a;
        al3 al3Var = tn2Var.s;
        if (qi3Var2 == al3Var.b) {
            return;
        }
        tn2Var.D(al3Var, new al3(qi3Var2));
    }

    public final void t() {
        if (this.H) {
            ScheduledFuture scheduledFuture = this.I;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.I = null;
            this.H = false;
        }
    }

    public final void u() {
        int i;
        int i2;
        Object objO = o();
        while (true) {
            ii iiVar = this.L;
            if (iiVar.isEmpty()) {
                return;
            }
            yp ypVar = (yp) iiVar.first();
            fq fqVar = (fq) objO;
            int iQ0 = fqVar.Q0();
            int i3 = ypVar.c;
            int i4 = ypVar.a;
            int i5 = ypVar.b;
            if (iQ0 < i3) {
                return;
            }
            if (fqVar.Q0() != i3) {
                iiVar.removeFirst();
            } else {
                i41 i41Var = (i41) objO;
                i41Var.z1();
                if (!i41Var.J) {
                    iiVar.removeFirst();
                } else if (i41Var.o0() == -1 || (i = i4 + i5) > i3) {
                    iiVar.removeFirst();
                } else {
                    cu4 cu4VarX0 = i41Var.x0();
                    cu4VarX0.getClass();
                    ArrayList arrayList = new ArrayList(i3);
                    int iA = cu4VarX0.a(true);
                    while (true) {
                        if (iA == -1) {
                            break;
                        }
                        if (iA < i4 || iA >= i) {
                            arrayList.add(Integer.valueOf(iA));
                        }
                        iA = cu4VarX0.e(iA, 0, true);
                    }
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(i4 - 1));
                    if (iIndexOf < 0) {
                        iiVar.removeFirst();
                    } else {
                        ArrayList arrayList2 = new ArrayList(i3);
                        arrayList2.addAll(arrayList);
                        for (i2 = 0; i2 < i5; i2++) {
                            arrayList2.add(iIndexOf + 1 + i2, Integer.valueOf(i4 + i2));
                        }
                        int[] iArrP0 = q40.P0(arrayList2);
                        ju3 ju3Var = ku3.n;
                        i41Var.s1(new pd4(iArrP0, ku3.o.b().nextLong()));
                        Log.d("BaseMediaService", "playNextFixup: " + i5 + " item(s) moved to shuffle position " + (iIndexOf + 1));
                        iiVar.removeFirst();
                    }
                }
            }
        }
    }

    public final void v(qi3 qi3Var) {
        Log.d("BaseMediaService", "update items");
        int iO0 = qi3Var.o0();
        if (iO0 == -1) {
            return;
        }
        j02 j02VarG0 = gb.g0(iO0 + 1, qi3Var.Q0());
        ArrayList arrayList = new ArrayList(r40.k0(j02VarG0, 10));
        Iterator it = j02VarG0.iterator();
        while (((i02) it).p) {
            int iNextInt = ((b02) it).nextInt();
            arrayList.add(new kd3(Integer.valueOf(iNextInt), qi3Var.Y(iNextInt)));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        int i = 0;
        ic2 ic2VarB = wr1.M(executorServiceNewSingleThreadExecutor).b(new tp(i, arrayList));
        ic2VarB.getClass();
        executorServiceNewSingleThreadExecutor.shutdown();
        ic2VarB.f(new lg1(i, ic2VarB, new wo0(this, qi3Var)), gq0.n);
    }

    public final void w(qi3 qi3Var) {
        String string;
        do2 do2Var;
        Bundle bundle;
        String string2;
        do2 do2Var2;
        Bundle bundle2;
        String string3;
        do2 do2Var3;
        Bundle bundle3;
        String strI;
        String strI2;
        String strI3;
        do2 do2Var4;
        do2 do2Var5;
        CharSequence charSequence;
        do2 do2Var6;
        CharSequence charSequence2;
        do2 do2Var7;
        CharSequence charSequence3;
        gn2 gn2VarA = qi3Var.a();
        if (gn2VarA == null || (do2Var7 = gn2VarA.d) == null || (charSequence3 = do2Var7.a) == null || (string = charSequence3.toString()) == null) {
            string = (gn2VarA == null || (do2Var = gn2VarA.d) == null || (bundle = do2Var.I) == null) ? null : bundle.getString("title");
        }
        if (gn2VarA == null || (do2Var6 = gn2VarA.d) == null || (charSequence2 = do2Var6.b) == null || (string2 = charSequence2.toString()) == null) {
            string2 = (gn2VarA == null || (do2Var2 = gn2VarA.d) == null || (bundle2 = do2Var2.I) == null) ? null : bundle2.getString("artist");
        }
        if (gn2VarA == null || (do2Var5 = gn2VarA.d) == null || (charSequence = do2Var5.c) == null || (string3 = charSequence.toString()) == null) {
            string3 = (gn2VarA == null || (do2Var3 = gn2VarA.d) == null || (bundle3 = do2Var3.I) == null) ? null : bundle3.getString("album");
        }
        Bundle bundle4 = (gn2VarA == null || (do2Var4 = gn2VarA.d) == null) ? null : do2Var4.I;
        String string4 = bundle4 != null ? bundle4.getString("coverArtId") : null;
        if (bundle4 == null || (strI = bundle4.getString("assetLinkSong")) == null) {
            strI = l93.i("song", bundle4 != null ? bundle4.getString("id") : null);
        }
        String str = strI;
        if (bundle4 == null || (strI2 = bundle4.getString("assetLinkAlbum")) == null) {
            strI2 = l93.i("album", bundle4 != null ? bundle4.getString("albumId") : null);
        }
        String str2 = strI2;
        if (bundle4 == null || (strI3 = bundle4.getString("assetLinkArtist")) == null) {
            strI3 = l93.i("artist", bundle4 != null ? bundle4.getString("artistId") : null);
        }
        String str3 = strI3;
        long jM0 = qi3Var.M0();
        Long lValueOf = Long.valueOf(jM0);
        if (jM0 == -9223372036854775807L) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        long duration = qi3Var.getDuration();
        Long lValueOf2 = duration != -9223372036854775807L ? Long.valueOf(duration) : null;
        ji2.T(this, string == null ? "" : string, string2 == null ? "" : string2, string3 == null ? "" : string3, string4, qi3Var.h0(), qi3Var.D0(), qi3Var.h(), jLongValue, lValueOf2 != null ? lValueOf2.longValue() : 0L, str, str2, str3);
    }
}
