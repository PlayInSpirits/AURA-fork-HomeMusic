package com.eddyizm.tempus.lan;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.AudioManager;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import defpackage.aj2;
import defpackage.au0;
import defpackage.b02;
import defpackage.b11;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.cb4;
import defpackage.d52;
import defpackage.do2;
import defpackage.e52;
import defpackage.f35;
import defpackage.f52;
import defpackage.fa;
import defpackage.fi0;
import defpackage.g52;
import defpackage.gb;
import defpackage.gf1;
import defpackage.gi1;
import defpackage.gm0;
import defpackage.gn2;
import defpackage.h12;
import defpackage.i02;
import defpackage.i52;
import defpackage.j02;
import defpackage.j51;
import defpackage.j52;
import defpackage.kb4;
import defpackage.kf2;
import defpackage.q40;
import defpackage.q63;
import defpackage.qi3;
import defpackage.qm4;
import defpackage.r40;
import defpackage.s63;
import defpackage.sk2;
import defpackage.ti;
import defpackage.tn;
import defpackage.tp;
import defpackage.u01;
import defpackage.ud3;
import defpackage.vs3;
import defpackage.w10;
import defpackage.w42;
import defpackage.ws1;
import defpackage.x;
import defpackage.x7;
import defpackage.xc5;
import defpackage.yf4;
import java.io.DataOutputStream;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LanReceiverService extends Service {
    public static volatile long A;
    public static final ConcurrentHashMap B = null;
    public static volatile boolean y;
    public static volatile String z;
    public final Handler n;
    public volatile boolean o;
    public final ThreadPoolExecutor p;
    public final Semaphore q;
    public SSLServerSocket r;
    public final ConcurrentHashMap.KeySetView s;
    public NsdManager t;
    public boolean u;
    public bl2 v;
    public String w;
    public final i52 x;

    static {
        B = new ConcurrentHashMap();
    }

    public LanReceiverService() {
        this.n = new Handler(Looper.getMainLooper());
        this.o = true;
        ArrayBlockingQueue r7 = new ArrayBlockingQueue(4);
        this.p = new ThreadPoolExecutor(4, 4, 0, TimeUnit.SECONDS, r7);
        this.q = new Semaphore(2);
        this.s = ConcurrentHashMap.newKeySet();
        this.x = new i52(this);
    }

    public static void a(LanReceiverService r3, j52 r4) {
        bl2 r0 = r3.v;
        if (r0 != null) goto L5;
        h12.Q("browserFuture");
        throw null;
    L5:
        if (r0.isDone() == true) goto L16;
        return;
    L16:
        bl2 r5 = r3.v;     // Catch: Throwable -> L15
        if (r5 == null) goto L10;
        ((bj2) r5.get()).r0(r4);     // Catch: Throwable -> L15
        return;
    L10:
        h12.Q("browserFuture");     // Catch: Throwable -> L15
        throw null;     // Catch: Throwable -> L15
    }

    public static String e(qi3 r8) {
        int r1 = 0;
        byte[] r9 = q40.B0(gb.g0(0, r8.Q0()), "\u0000", null, null, new x(19, r8), 30).getBytes(w10.a);
        r9.getClass();
        byte[] r10 = MessageDigest.getInstance("SHA-256").digest(r9);
        r10.getClass();
        StringBuilder r0 = new StringBuilder();
        r0.append("");
        int r3 = r10.length;
        int r4 = 0;
    L3:
        if (r1 >= r3) goto L8;
        byte r5 = r10[r1];
        r4 = r4 + 1;
        if (r4 <= 1) goto L7;
        r0.append("");
    L7:
        r0.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r5)}, 1)));
        r1 = r1 + 1;
        goto L3
    L8:
        r0.append("");
        return r0.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [u01] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    public final synchronized JSONObject b(final JSONObject r17, String r18) {
        monitor-enter(this);
        String r0 = r17.getString("server");     // Catch: Throwable -> L18
        String r1 = this.w;     // Catch: Throwable -> L18
        r1.getClass();     // Catch: Throwable -> L18
        int r3 = 1;
        boolean r6 = false;
        byte[] r2 = qm4.L0(r1, new char[]{'/'}).getBytes(w10.a);     // Catch: Throwable -> L18
        r2.getClass();     // Catch: Throwable -> L18
        byte[] r4 = MessageDigest.getInstance("SHA-256").digest(r2);     // Catch: Throwable -> L18
        r4.getClass();     // Catch: Throwable -> L18
        StringBuilder r7 = new StringBuilder();     // Catch: Throwable -> L18
        r7.append("");     // Catch: Throwable -> L18
        int r8 = r4.length;     // Catch: Throwable -> L18
        int r9 = 0;
        int r10 = 0;
    L5:
        if (r9 >= r8) goto L10;
        byte r11 = r4[r9];     // Catch: Throwable -> L18
        r10 = r10 + 1;     // Catch: Throwable -> L18
        if (r10 <= 1) goto L9;
        r7.append("");     // Catch: Throwable -> L18
    L9:
        r7.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r11)}, 1)));     // Catch: Throwable -> L18
        r9 = r9 + 1;     // Catch: Throwable -> L18
        goto L5
    L10:
        r7.append("");     // Catch: Throwable -> L18
        if (h12.c(r0, r7.toString()) == false) goto L59;
        final String r5 = r17.getString("action");     // Catch: Throwable -> L18
        final g52 r12 = new g52(this, r18, r3);     // Catch: Throwable -> L18
        if (ti.t0(new String[]{"replace", "append", "next"}).contains(r5) == false) goto L54;
        JSONArray r13 = r17.getJSONArray("ids");     // Catch: Throwable -> L18
        j02 r14 = gb.g0(0, r13.length());     // Catch: Throwable -> L18
        ArrayList r15 = new ArrayList(r40.k0(r14, 10));     // Catch: Throwable -> L18
        Iterator r16 = r14.iterator();     // Catch: Throwable -> L18
    L16:
        if (((i02) r16).p == false) goto L20;
        r15.add(r13.getString(((b02) r16).nextInt()));     // Catch: Throwable -> L18
        goto L16
    L20:
        j51.T(r15);     // Catch: Throwable -> L18
        if (h12.c(r5, "replace") == false) goto L28;
        int r19 = r15.size();     // Catch: Throwable -> L18
        int r20 = r17.getInt("index");     // Catch: Throwable -> L18
        if (r20 < 0) goto L27;
        if (r20 < r19) goto L28;
    L27:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L18
    L28:
        long r21 = SystemClock.elapsedRealtime() + 90000;     // Catch: Throwable -> L18
        ArrayList r22 = new ArrayList(r40.k0(r15, 10));     // Catch: Throwable -> L18
        int r23 = r15.size();     // Catch: Throwable -> L18
        int r110 = 0;
    L29:
        if (r110 >= r23) goto L50;
        Object r111 = r15.get(r110);     // Catch: Throwable -> L18
        r110 = r110 + 1;     // Catch: Throwable -> L18
        String r112 = (String) r111;     // Catch: Throwable -> L18
        r12.invoke();     // Catch: Throwable -> L18
        if (Thread.currentThread().isInterrupted() == true) goto L49;
        if (SystemClock.elapsedRealtime() >= r21) goto L49;
        Call r113 = App.f(r6).c().m(r112);     // Catch: Throwable -> L18
        ArrayList r114 = r15;
        r113.timeout().g(10, TimeUnit.SECONDS);     // Catch: Throwable -> L18
        Response r24 = r113.execute();     // Catch: Throwable -> L18
        if (r24.isSuccessful() == false) goto L47;
        ApiResponse r25 = (ApiResponse) r24.body();     // Catch: Throwable -> L18
        if (r25 == null) goto L41;
        SubsonicResponse r26 = r25.getSubsonicResponse();     // Catch: Throwable -> L18
        if (r26 == null) goto L41;
        Child r27 = r26.getSong();     // Catch: Throwable -> L18
    L42:
        if (r27 == null) goto L45;
        r22.add(r27);     // Catch: Throwable -> L18
        r15 = r114;
        r6 = false;
        goto L29
    L45:
        throw new IllegalArgumentException("Required value was null.");     // Catch: Throwable -> L18
    L41:
        r27 = null;
        goto L42
    L47:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L18
    L49:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L18
    L50:
        final ?? r28 = new ArrayList(r40.k0(r22, 10));     // Catch: Throwable -> L18
        int r29 = r22.size();     // Catch: Throwable -> L18
        int r115 = 0;
    L51:
        if (r115 >= r29) goto L55;
        Object r30 = r22.get(r115);     // Catch: Throwable -> L18
        r115 = r115 + 1;     // Catch: Throwable -> L18
        r28.add(gi1.K((Child) r30));     // Catch: Throwable -> L18
    L55:
        JSONObject r31 = (JSONObject) d(new d52(r12, this, r5, r17, r28));     // Catch: Throwable -> L18
        monitor-exit(this);
        return r31;
    L54:
        r28 = u01.n;     // Catch: Throwable -> L18
        goto L55
    L59:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public final synchronized JSONObject c(JSONObject r17, final String r18) {
        monitor-enter(this);
        String r2 = r17.getString("server");     // Catch: Throwable -> L27
        String r3 = this.w;     // Catch: Throwable -> L27
        r3.getClass();     // Catch: Throwable -> L27
        int r7 = 1;
        boolean r8 = false;
        byte[] r4 = qm4.L0(r3, new char[]{'/'}).getBytes(w10.a);     // Catch: Throwable -> L27
        r4.getClass();     // Catch: Throwable -> L27
        byte[] r5 = MessageDigest.getInstance("SHA-256").digest(r4);     // Catch: Throwable -> L27
        r5.getClass();     // Catch: Throwable -> L27
        StringBuilder r6 = new StringBuilder();     // Catch: Throwable -> L27
        r6.append("");     // Catch: Throwable -> L27
        int r9 = r5.length;     // Catch: Throwable -> L27
        int r10 = 0;
        int r11 = 0;
    L5:
        if (r10 >= r9) goto L10;
        byte r12 = r5[r10];     // Catch: Throwable -> L27
        r11 = r11 + 1;     // Catch: Throwable -> L27
        if (r11 <= 1) goto L9;
        r6.append("");     // Catch: Throwable -> L27
    L9:
        r6.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r12)}, 1)));     // Catch: Throwable -> L27
        r10 = r10 + 1;     // Catch: Throwable -> L27
        goto L5
    L10:
        r6.append("");     // Catch: Throwable -> L27
        if (h12.c(r2, r6.toString()) == false) goto L77;
        JSONArray r13 = r17.getJSONArray("ids");     // Catch: Throwable -> L27
        int r14 = r13.length();     // Catch: Throwable -> L27
        if (1 > r14) goto L75;
        if (r14 >= 501) goto L75;
        final int r15 = r17.getInt("index");     // Catch: Throwable -> L27
        if (r15 < 0) goto L73;
        if (r15 >= r13.length()) goto L73;
        final long r16 = r17.getLong("position");     // Catch: Throwable -> L27
        if (r16 >= 0) goto L23;
        r16 = 0;
    L23:
        j02 r0 = gb.g0(0, r13.length());     // Catch: Throwable -> L27
        ArrayList r19 = new ArrayList(r40.k0(r0, 10));     // Catch: Throwable -> L27
        Iterator r1 = r0.iterator();     // Catch: Throwable -> L27
    L25:
        if (((i02) r1).p == false) goto L29;
        r19.add(r13.getString(((b02) r1).nextInt()));     // Catch: Throwable -> L27
        goto L25
    L29:
        au0.U(r19, r15, r16);     // Catch: Throwable -> L27
        long r110 = SystemClock.elapsedRealtime() + 90000;     // Catch: Throwable -> L27
        j02 r20 = gb.g0(0, r13.length());     // Catch: Throwable -> L27
        ArrayList r111 = new ArrayList(r40.k0(r20, 10));     // Catch: Throwable -> L27
        Iterator r21 = r20.iterator();     // Catch: Throwable -> L27
    L31:
        if (((i02) r21).p == false) goto L66;
        int r22 = ((b02) r21).nextInt();     // Catch: Throwable -> L27
        if (this.o == false) goto L65;
        if (Thread.currentThread().isInterrupted() == true) goto L65;
        if (SystemClock.elapsedRealtime() >= r110) goto L65;
        if (kb4.a0(this).contains(r18) == false) goto L63;
        if (h12.c(ud3.D(), this.w) == false) goto L63;
        String r23 = r13.getString(r22);     // Catch: Throwable -> L27
        int r112 = r23.length();     // Catch: Throwable -> L27
        if (r7 > r112) goto L61;
        if (r112 >= 513) goto L61;
        Call r24 = App.f(r8).c().m(r23);     // Catch: Throwable -> L27
        r24.timeout().g(10, TimeUnit.SECONDS);     // Catch: Throwable -> L27
        Response r25 = r24.execute();     // Catch: Throwable -> L27
        if (r25.isSuccessful() == false) goto L59;
        ApiResponse r26 = (ApiResponse) r25.body();     // Catch: Throwable -> L27
        if (r26 == null) goto L53;
        SubsonicResponse r27 = r26.getSubsonicResponse();     // Catch: Throwable -> L27
        if (r27 == null) goto L53;
        Child r28 = r27.getSong();     // Catch: Throwable -> L27
    L54:
        if (r28 == null) goto L57;
        r111.add(r28);     // Catch: Throwable -> L27
        r7 = 1;
        r8 = false;
        goto L31
    L57:
        throw new IllegalArgumentException("Required value was null.");     // Catch: Throwable -> L27
    L53:
        r28 = null;
        goto L54
    L59:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L61:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L63:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L65:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L66:
        final ArrayList r29 = new ArrayList(r40.k0(r111, 10));     // Catch: Throwable -> L27
        int r30 = r111.size();     // Catch: Throwable -> L27
        int r31 = 0;
    L67:
        if (r31 >= r30) goto L69;
        Object r32 = r111.get(r31);     // Catch: Throwable -> L27
        r31 = r31 + 1;     // Catch: Throwable -> L27
        r29.add(gi1.K((Child) r32));     // Catch: Throwable -> L27
        goto L67
    L69:
        d(new e52(this, r18, r29, r15, r16));     // Catch: Throwable -> L27
        new vs3().c(r111, true, 0);     // Catch: Throwable -> L27
        JSONObject r33 = new JSONObject().put("ok", true);     // Catch: Throwable -> L27
        r33.getClass();     // Catch: Throwable -> L27
        monitor-exit(this);
        return r33;
    L73:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L75:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L77:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;
    }

    public final Object d(gf1 r4) {
        bl2 r0 = this.v;
        if (r0 != null) goto L5;
        h12.Q("browserFuture");
        throw null;
    L5:
        if (r0.isDone() == false) goto L12;
        FutureTask r1 = new FutureTask(new tp(2, r4));
        this.n.post(r1);
        return r1.get(5, TimeUnit.SECONDS);
    L9:
        e = move-exception;
        r1.cancel(false);
        throw e;
    L12:
        kf2.n("Failed requirement.");
        return null;
    }

    public final JSONObject f(qi3 r13) {
        do2 r0 = r13.K0();
        r0.getClass();
        AudioManager r1 = (AudioManager) getSystemService(AudioManager.class);
        JSONObject r2 = new JSONObject().put("ok", true).put("remoteVersion", 4);
        String r3 = this.w;
        r3.getClass();
        int r6 = 0;
        byte[] r4 = qm4.L0(r3, new char[]{'/'}).getBytes(w10.a);
        r4.getClass();
        byte[] r5 = MessageDigest.getInstance("SHA-256").digest(r4);
        r5.getClass();
        StringBuilder r7 = new StringBuilder();
        String r8 = "";
        r7.append("");
        int r9 = r5.length;
        int r10 = 0;
    L3:
        if (r6 >= r9) goto L8;
        byte r11 = r5[r6];
        r10 = r10 + 1;
        if (r10 <= 1) goto L7;
        r7.append("");
    L7:
        r7.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(r11)}, 1)));
        r6 = r6 + 1;
        goto L3
    L8:
        r7.append("");
        JSONObject r12 = r2.put("server", r7.toString()).put("name", kb4.M(this));
        CharSequence r14 = r0.a;
        if (r14 == null) goto L13;
        String r15 = r14.toString();
        if (r15 == null) goto L13;
        String r16 = qm4.J0(256, r15);
    L14:
        JSONObject r17 = r12.put("title", r16);
        CharSequence r18 = r0.b;
        if (r18 == null) goto L19;
        String r19 = r18.toString();
        if (r19 == null) goto L19;
        String r20 = qm4.J0(256, r19);
    L20:
        JSONObject r110 = r17.put("artist", r20);
        CharSequence r21 = r0.c;
        if (r21 == null) goto L25;
        String r22 = r21.toString();
        if (r22 == null) goto L25;
        String r23 = qm4.J0(256, r22);
    L26:
        JSONObject r111 = r110.put("album", r23);
        Bundle r24 = r0.I;
        if (r24 == null) goto L31;
        String r25 = r24.getString("coverArtId");
        if (r25 == null) goto L31;
        String r26 = qm4.J0(512, r25);
    L32:
        JSONObject r112 = r111.put("cover", r26);
        long r27 = r13.M0();
        long r28 = 0;
        if (r27 >= 0) goto L35;
        r27 = 0;
    L35:
        JSONObject r113 = r112.put("position", r27);
        long r29 = r13.getDuration();
        if (r29 < 0) goto L39;
        r28 = r29;
    L39:
        JSONObject r114 = r113.put("duration", r28).put("playing", r13.h0()).put("playWhenReady", r13.q()).put("volume", Float.valueOf(r13.B())).put("index", r13.o0()).put("deviceVolume", r1.getStreamVolume(3)).put("deviceVolumeMax", r1.getStreamMaxVolume(3)).put("shuffle", r13.D0()).put("repeat", r13.h());
        gn2 r30 = r13.a();
        if (r30 == null) goto L45;
        String r31 = r30.a;
        if (r31 == null) goto L45;
        r8 = r31;
    L45:
        JSONObject r115 = r114.put("id", r8).put("speed", Float.valueOf(r13.i().a)).put("pitch", Float.valueOf(r13.i().b)).put("timerActive", yf4.c().f).put("timerEnd", yf4.c().g).put("timerRemaining", yf4.c().d()).put("next", r13.f0()).put("previous", r13.I()).put("count", r13.Q0()).put("revision", e(r13));
        r115.getClass();
        return r115;
    L31:
        r26 = "";
    L25:
        r23 = "";
    L19:
        r20 = "";
    L13:
        r16 = "";
        goto L14
    }

    public final void g(SSLSocket r10, String r11) {
        ArrayBlockingQueue r1 = new ArrayBlockingQueue(1);
        int r4 = 0;
        j52 r3 = new j52(r4, r1);
        int r6 = 9;
        d(new fa(r6, this, r3));
        w42 r5 = w42.a;
        w42.b("Receiver live updates started");
    L20:
    L12:
        th = move-exception;
        this.n.post(new ws1(r6, this, r3));
        w42 r9 = w42.a;
        w42.b("Receiver live updates stopped");
        throw th;
    L4:
        if (this.o == false) goto L16;
        if (Thread.currentThread().isInterrupted() == true) goto L16;
        JSONObject r7 = (JSONObject) d(new g52(this, r11, r4));     // Catch: Throwable -> L12
        r7.getClass();     // Catch: Throwable -> L12
        String r8 = r7.toString();     // Catch: Throwable -> L12
        r8.getClass();     // Catch: Throwable -> L12
        byte[] r12 = r8.getBytes(w10.a);     // Catch: Throwable -> L12
        r12.getClass();     // Catch: Throwable -> L12
        int r13 = r12.length;     // Catch: Throwable -> L12
        if (1 > r13) goto L15;
        if (r13 >= 131073) goto L15;
        DataOutputStream r14 = new DataOutputStream(r10.getOutputStream());     // Catch: Throwable -> L12
        r14.writeInt(r12.length);     // Catch: Throwable -> L12
        r14.write(r12);     // Catch: Throwable -> L12
        r14.flush();     // Catch: Throwable -> L12
        r1.poll(1, TimeUnit.SECONDS);     // Catch: Throwable -> L12
    L15:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L12
    L16:
        this.n.post(new ws1(r6, this, r3));
        w42 r15 = w42.a;
        w42.b("Receiver live updates stopped");
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent r1) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        xc5 r0 = null;
        z = null;
        w42 r1 = w42.a;
        w42.b("Receiver starting");
        this.w = ud3.D();
        NotificationManager r2 = (NotificationManager) getSystemService(NotificationManager.class);
        if (Build.VERSION.SDK_INT < 26) goto L5;
        gm0.n();
        tn.p(r2, gm0.C(getString(R.string.lan_title)));
    L5:
        int r3 = 0;
        PendingIntent r4 = PendingIntent.getActivity(this, 0, new Intent(this, LanPlaybackActivity.class), 67108864);
        PendingIntent r5 = PendingIntent.getService(this, 1, new Intent(this, LanReceiverService.class).setAction("stop"), 67108864);
        s63 r6 = new s63(this, "lan_receiver");
        r6.v.icon = R.drawable.ic_queue;
        r6.e = s63.b(getString(R.string.lan_available));
        r6.f = s63.b(kb4.M(this));
        r6.g = r4;
        r6.c(2, true);
        String r7 = getString(R.string.lan_disable);
        r6.b.add(new q63(null, r7, r5));
        startForeground(7301, r6.a());
        Object r8 = getSystemService(NsdManager.class);
        r8.getClass();
        this.t = (NsdManager) r8;
        cb4 r9 = new cb4(this, new ComponentName(this, MediaService.class));
        Bundle r10 = Bundle.EMPTY;
        aj2 r11 = new aj2();
        Looper r12 = f35.x();
        bl2 r13 = new bl2(r12);
        if (r9.a.e() == false) goto L8;
        fi0 r14 = new fi0(new x7(this));
        r0 = new xc5(4, r14);
    L8:
        b11.w(r13, new bj2(this, r9, r10, r11, r12, r13, r0), new Handler(r12));
        this.v = r13;
        y = true;
        new Thread(new f52(this, r3), "tempus-lan-listener").start();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        w42 r0 = w42.a;
        w42.b("Receiver stopping");
        this.o = false;
        y = false;
        A = 0;
        B.clear();
        SSLServerSocket r1 = this.r;     // Catch: Throwable -> L25
        if (r1 == null) goto L6;
        r1.close();     // Catch: Throwable -> L25
    L6:
        ConcurrentHashMap.KeySetView r2 = this.s;
        r2.getClass();
        Iterator r3 = r2.iterator();
    L8:
        if (r3.hasNext() == false) goto L12;
        ((Socket) r3.next()).close();     // Catch: Throwable -> L26
        goto L8
    L12:
        this.p.shutdownNow();
        if (this.u == true) goto L32;
    L19:
        bl2 r4 = this.v;
        if (r4 == null) goto L23;
        sk2.Z0(r4);
        super.onDestroy();
        return;
    L23:
        h12.Q("browserFuture");
        throw null;
    L32:
        NsdManager r5 = this.t;     // Catch: Throwable -> L27
        if (r5 == null) goto L17;
        r5.unregisterService(this.x);     // Catch: Throwable -> L27
        goto L19
    L17:
        h12.Q("nsd");     // Catch: Throwable -> L27
        throw null;     // Catch: Throwable -> L27
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent r1, int r2, int r3) {
        if (r1 == null) goto L4;
        String r4 = r1.getAction();
    L6:
        if (h12.c(r4, "stop") == false) goto L10;
        stopSelf();
        return 2;
    L10:
        return 2;
    L4:
        r4 = null;
        goto L6
    }
}
