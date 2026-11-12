package defpackage;

import android.content.Context;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.homemusic.HubException;
import com.eddyizm.tempus.homemusic.HubShareActivity;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.homemusic.WaveSession;
import com.eddyizm.tempus.homemusic.WaveTrack;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ws1(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    private final void a() {
        List r0 = (List) this.o;
        bj2 r2 = (bj2) this.p;
        ArrayList r3 = gi1.M(r0);
        Queue r8 = new vs3().a();
        int r1 = -1;
        if (r8 == null) goto L11;
        String r4 = r8.getId();
        int r5 = 0;
    L6:
        if (r5 >= r3.size()) goto L11;
        if (((gn2) r3.get(r5)).a.equals(r4) == true) goto L9;
        r5 = r5 + 1;
        goto L6
    L9:
        r1 = r5;
    L11:
        if (r1 < 0) goto L13;
        int r6 = r1;
    L14:
        long r7 = 0;
        if (r1 < 0) goto L24;
        String r9 = r8.getId();
        r9.getClass();
        sp3 r10 = (sp3) ud3.A().get(r9);
        if (r10 == null) goto L19;
        long r11 = r10.b;
    L21:
        if (r11 == 0) goto L23;
    L22:
        r7 = r11;
        goto L24
    L23:
        r11 = Math.max(0, r8.getPlayingChanged());
        goto L22
    L19:
        r11 = 0;
    L24:
        new Handler(Looper.getMainLooper()).post(new wn2(r2, r3, r6, r7, 0));
        return;
    L13:
        r6 = 0;
        goto L14
    }

    private final void b() {
        ic2 r0 = (ic2) this.o;
        gn2 r3 = (gn2) this.p;
    L14:
        e = e;
    L15:
        e.printStackTrace();
        return;
    L4:
        if (r0.isDone() == true) goto L19;
        return;
    L19:
    L11:
        e = e;
        goto L15
    L6:
        if (u52.c().a == true) goto L20;
        bj2 r1 = (bj2) r0.get();     // Catch: Throwable -> L14 Throwable -> L14
        int r2 = 1;
        bo2.b.set(true);     // Catch: Throwable -> L14 Throwable -> L14
        r1.s0(r3);     // Catch: Throwable -> L14 Throwable -> L14
        r1.b();     // Catch: Throwable -> L14 Throwable -> L14
        r1.m0();     // Catch: Throwable -> L14 Throwable -> L14
        vs3 r4 = new vs3();     // Catch: InterruptedException -> L11 Throwable -> L14
        ExecutorService r5 = vs3.b;     // Catch: InterruptedException -> L11 Throwable -> L14
        ns3 r6 = r4.a;     // Catch: InterruptedException -> L11 Throwable -> L14
        Objects.requireNonNull(r6);     // Catch: InterruptedException -> L11 Throwable -> L14
        r5.execute(new jq3(r2, r6));     // Catch: InterruptedException -> L11 Throwable -> L14
        return;
    }

    private final void c() {
        ic2 r0 = (ic2) this.o;
        InternetRadioStation r3 = (InternetRadioStation) this.p;
    L13:
        e = e;
    L14:
        e.printStackTrace();
        return;
    L4:
        if (r0.isDone() == true) goto L18;
        return;
    L18:
        if (u52.c().a == true) goto L20;
        bj2 r1 = (bj2) r0.get();     // Catch: Throwable -> L13 Throwable -> L13
        bo2.b.set(true);     // Catch: Throwable -> L13 Throwable -> L13
        r1.s0(gi1.I(r3));     // Catch: Throwable -> L13 Throwable -> L13
        r1.b();     // Catch: Throwable -> L13 Throwable -> L13
        r1.m0();     // Catch: Throwable -> L13 Throwable -> L13
        return;
    L20:
        return;
    L10:
        e = e;
        goto L14
    }

    private final void d() {
        ho2 r0 = (ho2) this.o;
        NetworkEvent r1 = (NetworkEvent) this.p;
        fo2.q(r0.d, r1);
    }

    private final void e() {
        ho2 r0 = (ho2) this.o;
        PlaybackErrorEvent r1 = (PlaybackErrorEvent) this.p;
        fo2.r(r0.d, r1);
    }

    private final void f() {
        ho2 r0 = (ho2) this.o;
        PlaybackMetrics r1 = (PlaybackMetrics) this.p;
        fo2.s(r0.d, r1);
    }

    private final void g() {
        ho2 r0 = (ho2) this.o;
        PlaybackStateEvent r1 = (PlaybackStateEvent) this.p;
        fo2.t(r0.d, r1);
    }

    private final void h() {
        ((tn2) this.o).D(null, (al3) this.p);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r2 = 19;
        HubException r3 = null;
        s14 r4 = null;
        int r5 = 0;
        boolean r6 = false;
        int r7 = 1;
        switch(this.n) {
            case 0: goto L296;
            case 1: goto L291;
            case 2: goto L280;
            case 3: goto L264;
            case 4: goto L257;
            case 5: goto L226;
            case 6: goto L204;
            case 7: goto L200;
            case 8: goto L112;
            case 9: goto L110;
            case 10: goto L108;
            case 11: goto L103;
            case 12: goto L101;
            case 13: goto L78;
            case 14: goto L73;
            case 15: goto L63;
            case 16: goto L53;
            case 17: goto L40;
            case 18: goto L32;
            case 19: goto L30;
            case 20: goto L22;
            case 21: goto L20;
            case 22: goto L18;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        ((lb4) this.p).l(Boolean.valueOf(((tn2) this.o).u()));
        return;
    L6:
        h();
        return;
    L8:
        g();
        return;
    L10:
        f();
        return;
    L12:
        e();
        return;
    L14:
        d();
        return;
    L16:
        ho2 r1 = (ho2) this.o;
        go2.m(r1.d, (TrackChangeEvent) this.p);
        return;
    L18:
        c();
        return;
    L20:
        b();
        return;
    L22:
        ic2 r8 = (ic2) this.o;
        si1 r0 = (si1) this.p;
    L27:
        e = move-exception;
        e.printStackTrace();
        return;
    L24:
        if (r8.isDone() == false) goto L351;
        r0.onRecovery(((bj2) r8.get()).o0());     // Catch: Throwable -> L27
        return;
    L351:
        return;
    L30:
        a();
        return;
    L32:
        ic2 r9 = (ic2) this.o;
        List r10 = (List) this.p;
    L37:
        e = move-exception;
        e.printStackTrace();
        return;
    L34:
        if (r9.isDone() == false) goto L353;
        bo2.d.execute(new ws1(r2, r10, (bj2) r9.get()));     // Catch: Throwable -> L37
        return;
    L353:
        return;
    L40:
        ic2 r11 = (ic2) this.o;
        PodcastEpisode r12 = (PodcastEpisode) this.p;
    L50:
        e = e;
    L51:
        e.printStackTrace();
        return;
    L42:
        if (r11.isDone() == false) goto L355;
        if (u52.c().a == true) goto L356;
        bj2 r13 = (bj2) r11.get();     // Catch: Throwable -> L50 Throwable -> L50
        bo2.b.set(true);     // Catch: Throwable -> L50 Throwable -> L50
        r13.s0(gi1.L(r12));     // Catch: Throwable -> L50 Throwable -> L50
        r13.b();     // Catch: Throwable -> L50 Throwable -> L50
        r13.m0();     // Catch: Throwable -> L50 Throwable -> L50
        return;
    L356:
        return;
    L48:
        e = e;
        goto L51
    L355:
        return;
    L53:
        lb4 r14 = (lb4) this.o;
        ArrayList r15 = (ArrayList) this.p;
        if ((r14.n instanceof f0) == false) goto L62;
        int r16 = 0;
    L57:
        if (r16 >= r15.size()) goto L358;
        if (r15.get(r16) == null) goto L61;
        ((ic2) r15.get(r16)).cancel(false);
    L61:
        r16 = r16 + 1;
        goto L57
    L358:
        return;
    L62:
        return;
    L63:
        ic2 r17 = (ic2) this.o;
        nj2 r18 = (nj2) this.p;
        ab4 r19 = (ab4) r17.get();     // Catch: InterruptedException -> L66 Throwable -> L68 CancellationException -> L70
        rr2.s(r19, "SessionResult must not be null");     // Catch: InterruptedException -> L66 Throwable -> L68 CancellationException -> L70
        r18.f(r19.b);     // Catch: InterruptedException -> L66 Throwable -> L68 CancellationException -> L70
        return;
    L68:
        e = move-exception;
        l93.r0("MLSLegacyStub", "Custom action failed", e);
        r18.e();
        return;
    L73:
        bm2 r20 = (bm2) this.o;
        lm2 r21 = (lm2) this.p;
        if (r20.p == true) goto L360;
        r21.c(r20);
        return;
    L360:
        return;
    L78:
        im2 r22 = (im2) this.o;
        wo0 r23 = new wo0(r22.a, (pr2) this.p);
        r22.i = r23;
        gm2 r24 = r22.e;
        Handler r25 = r22.a1().f;
        if (((Set) r23.o).add(r24) == true) goto L81;
        l93.q0("MediaControllerCompat", "the callback has already been registered");
        return;
    L81:
        if (r25 != null) goto L83;
        r25 = new Handler();
    L83:
        r24.d(r25);
        xk2 r26 = (xk2) r23.n;
        MediaController r27 = r26.a;
        uk2 r28 = r24.a;
        r28.getClass();
        r27.registerCallback(r28, r25);
        Object r29 = r26.b;
        monitor-enter(r29);
        qu1 r30 = r26.e.a();     // Catch: Throwable -> L90
        if (r30 == null) goto L96;
        tk2 r31 = new tk2(r24);     // Catch: Throwable -> L90
        r26.d.put(r24, r31);     // Catch: Throwable -> L90
        r24.c = r31;     // Catch: Throwable -> L90
        r30.l0(r31);     // Catch: Throwable -> L90 Throwable -> L92 RemoteException -> L94
        r24.c(13, null);     // Catch: Throwable -> L90 Throwable -> L92 RemoteException -> L94
    L97:
        monitor-exit(r29);     // Catch: Throwable -> L90
        return;
    L92:
        e = move-exception;
        l93.G("MediaControllerCompat", "Dead object in registerCallback.", e);     // Catch: Throwable -> L90
        goto L97
    L96:
        r24.c = null;     // Catch: Throwable -> L90
        r26.c.add(r24);     // Catch: Throwable -> L90
    L90:
        th = move-exception;
        throw th;
    L101:
        gk2 r32 = (gk2) this.o;
        r32.Q.set(r32.z((gp3) this.p, r32.K, 0));
        return;
    L103:
        bl2 r33 = (bl2) this.o;
        bj2 r34 = (bj2) this.p;
        r33.v = r34;
        if (r33.w == false) goto L106;
        r33.l(r34);
    L106:
        r33.f(new pk2(r33, r34, r7), new h41(r7, r33));
        return;
    L108:
        ((wc0) this.o).accept((aj2) this.p);
        return;
    L110:
        LanReceiverService.a((LanReceiverService) this.o, (j52) this.p);
        return;
    L112:
        LanReceiverService r35 = (LanReceiverService) this.o;
        SSLSocket r36 = (SSLSocket) this.p;
        boolean r37 = LanReceiverService.y;
        w42 r38 = w42.a;     // Catch: Throwable -> L139 Exception -> L178
        w42.b("Receiver accepted connection; starting TLS");     // Catch: Throwable -> L139 Exception -> L178
        r36.startHandshake();     // Catch: Throwable -> L139 Exception -> L178
        w42.b("Receiver TLS established");     // Catch: Throwable -> L139 Exception -> L141
        LanReceiverService.z = null;     // Catch: Throwable -> L139 Exception -> L141
        String r39 = fz0.m(r36);     // Catch: Throwable -> L139 Exception -> L141
        if (r39.equals(fz0.l(r36)) == true) goto L177;
        JSONObject r110 = fz0.n(r36);     // Catch: Throwable -> L139 Exception -> L141
        String r40 = r110.optString("command");     // Catch: Throwable -> L139 Exception -> L141
        if (kb4.a0(r35).contains(r39) == true) goto L150;
        if (SystemClock.elapsedRealtime() >= LanReceiverService.A) goto L121;
        r6 = true;
    L121:
        w42.b("Receiver unpaired request; windowOpen=" + r6);     // Catch: Throwable -> L139 Exception -> L141
        r40.getClass();     // Catch: Throwable -> L139 Exception -> L141
        long r41 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L139 Exception -> L141
        long r111 = LanReceiverService.A;     // Catch: Throwable -> L139 Exception -> L141
        if (r40.equals("hello") == false) goto L148;
        if (r41 >= r111) goto L148;
        ConcurrentHashMap r42 = LanReceiverService.B;     // Catch: Throwable -> L139 Exception -> L141
        Set r43 = r42.entrySet();     // Catch: Throwable -> L139 Exception -> L141
        r43.getClass();     // Catch: Throwable -> L139 Exception -> L141
        Iterator r44 = r43.iterator();     // Catch: Throwable -> L139 Exception -> L141
    L127:
        if (r44.hasNext() == false) goto L133;
        Map.Entry r45 = (Map.Entry) r44.next();     // Catch: Throwable -> L139 Exception -> L141
        r45.getClass();     // Catch: Throwable -> L139 Exception -> L141
        if ((SystemClock.elapsedRealtime() - ((h52) r45.getValue()).d) <= 120000) goto L127;
        r44.remove();     // Catch: Throwable -> L139 Exception -> L141
        goto L127
    L133:
        if (r42.size() >= 4) goto L135;
    L143:
        String r112 = fz0.d(r39, fz0.l(r36));     // Catch: Throwable -> L139 Exception -> L141
        String r46 = r110.optString("name");     // Catch: Throwable -> L139 Exception -> L141
        r46.getClass();     // Catch: Throwable -> L139 Exception -> L141
        r42.put(r39, new h52(r39, qm4.J0(40, r46), SystemClock.elapsedRealtime(), r112));     // Catch: Throwable -> L139 Exception -> L141
        JSONObject r47 = new JSONObject().put("pair", r112);     // Catch: Throwable -> L139 Exception -> L141
        r47.getClass();     // Catch: Throwable -> L139 Exception -> L141
        fz0.p(r36, r47);     // Catch: Throwable -> L139 Exception -> L141
        w42.b("Receiver pairing code sent; awaiting approval");     // Catch: Throwable -> L139 Exception -> L141
    L144:
        r35.s.remove(r36);
        r36.close();     // Catch: Throwable -> L308
        return;
    L362:
        return;
    L135:
        if (r42.containsKey(r39) == true) goto L143;
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L139 Exception -> L141
    L148:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L139 Exception -> L141
    L150:
        if (h12.c(ud3.D(), r35.w) == false) goto L175;
        String r48 = r35.w;     // Catch: Throwable -> L139 Exception -> L141
        if (r48 == null) goto L175;
        if (r48.length() == 0) goto L175;
        if (h12.c(r40, "watch") == false) goto L167;
        if (r35.q.tryAcquire() == false) goto L165;
        r35.g(r36, r39);     // Catch: Throwable -> L161
        r35.q.release();     // Catch: Throwable -> L139 Exception -> L141
    L161:
        th = move-exception;
        r35.q.release();     // Catch: Throwable -> L139 Exception -> L141
        throw th;     // Catch: Throwable -> L139 Exception -> L141
    L165:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L139 Exception -> L141
    L167:
        if (h12.c(r40, "queue") == false) goto L170;
        JSONObject r49 = r35.c(r110, r39);     // Catch: Throwable -> L139 Exception -> L141
    L173:
        fz0.p(r36, r49);     // Catch: Throwable -> L139 Exception -> L141
        goto L144
    L170:
        if (h12.c(r40, "edit") == false) goto L172;
        r49 = r35.b(r110, r39);     // Catch: Throwable -> L139 Exception -> L141
        goto L173
    L172:
        r49 = (JSONObject) r35.d(new uy1(r35, r39, r40, r110, 1));     // Catch: Throwable -> L139 Exception -> L141
    L175:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L139 Exception -> L141
    L177:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L139 Exception -> L141
    L141:
        e = e;
        r5 = 1;
    L179:
        w42 r50 = w42.a;     // Catch: Throwable -> L139
        if (r5 == 0) goto L182;
        String r51 = "request";
    L183:
        r50.a("Receiver failed at ".concat(r51), e);     // Catch: Throwable -> L139
        if (r5 == 0) goto L186;
    L188:
        if (r5 == 0) goto L144;
        JSONObject r52 = new JSONObject().put("error", "unavailable");     // Catch: Throwable -> L307
        r52.getClass();     // Catch: Throwable -> L307
        String r53 = r52.toString();     // Catch: Throwable -> L307
        r53.getClass();     // Catch: Throwable -> L307
        byte[] r54 = r53.getBytes(w10.a);     // Catch: Throwable -> L307
        r54.getClass();     // Catch: Throwable -> L307
        int r55 = r54.length;     // Catch: Throwable -> L307
        if (1 > r55) goto L195;
        if (r55 >= 131073) goto L195;
        DataOutputStream r56 = new DataOutputStream(r36.getOutputStream());     // Catch: Throwable -> L307
        r56.writeInt(r54.length);     // Catch: Throwable -> L307
        r56.write(r54);     // Catch: Throwable -> L307
        r56.flush();     // Catch: Throwable -> L307
    L195:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L307
    L186:
        if (r35.o == false) goto L188;
        LanReceiverService.z = r35.getString(R.string.lan_tls_error);     // Catch: Throwable -> L139
        goto L188
    L182:
        r51 = "TLS";
    L178:
        e = e;
    L139:
        th = move-exception;
        r35.s.remove(r36);
        r36.close();     // Catch: Throwable -> L309
    L199:
        throw th;
    L200:
        fx3 r57 = (fx3) this.o;
        f9 r58 = (f9) this.p;
        if (r57.n == true) goto L363;
        r58.setTitle(R.string.lan_discovery_error);
        return;
    L363:
        return;
    L204:
        WaveSession r59 = (WaveSession) this.o;
        Serializable r60 = (Serializable) this.p;
        WeakReference r61 = b.a;
        r59.setInFlight(false);
        if (b.b == r59) goto L208;
        return;
    L208:
        if ((r60 instanceof s14) == true) goto L220;
        ly4 r62 = (ly4) r60;
        String r63 = r62.n;
        List r64 = (List) r62.p;
        r59.renew(r63);
        rs1 r65 = rs1.a;
        Set<String> r66 = r59.ids();
        int r67 = lg2.W(r40.k0(r66, 10));
        if (r67 >= 16) goto L212;
        r67 = 16;
    L212:
        LinkedHashMap r68 = new LinkedHashMap(r67);
        Iterator<T> r69 = r66.iterator();
    L214:
        if (r69.hasNext() == false) goto L216;
        Object r70 = r69.next();
        String r71 = (String) r70;
        r68.put(r70, r59.getContext());
        goto L214
    L216:
        rs1.b(r68, b.g(r59));
        b.b(r59, r64);
        if (r59.getAgain() == false) goto L219;
        b.c();
        goto L220
    L219:
        b.f(r59);
    L220:
        Throwable r72 = bb3.a(r60);
        if (r72 == null) goto L364;
        Log.w("HubWave", "renew: " + r72.getMessage());
        r59.setFailures(r59.getFailures() + 1);
        Long r73 = WaveRetry.INSTANCE.afterFailure(r59.getFailures());
        if (r73 == null) goto L365;
        long r74 = r73.longValue();
        b.e();
        u6 r75 = new u6(12);
        b.c = r75;
        io1.b.postDelayed(r75, r74);
        return;
    L365:
        return;
    L364:
        return;
    L226:
        WaveSession r76 = (WaveSession) this.p;
        String r77 = (String) this.o;
        WeakReference r78 = b.a;
        rr1 r79 = rr1.a;     // Catch: Throwable -> L241
        boolean r80 = rr1.e().contains("wave_origin_v1");     // Catch: Throwable -> L241
        WaveSession.Companion r81 = WaveSession.Companion;     // Catch: Throwable -> L241
        Map<String, ? extends Object> r82 = r76.getSeed();     // Catch: Throwable -> L241
        String r83 = r76.getMode();     // Catch: Throwable -> L241
        String r84 = WaveOrigin.RESTART;
        if (r80 == true) goto L231;
        r84 = null;
    L231:
        if (r80 == false) goto L233;
        String r85 = r77;
    L234:
        String r86 = rs1.f();     // Catch: Throwable -> L241
        if (r80 == false) goto L237;
        String r87 = r86;
    L238:
        WaveOut r88 = rr1.A(r81.startBody(r82, r83, r84, r85, r87));     // Catch: Throwable -> L241
        List<WaveTrack> r89 = r88.getTracks();     // Catch: Throwable -> L241
        if (r89 != null) goto L243;
        r89 = u01.n;     // Catch: Throwable -> L241
    L243:
        ArrayList r90 = new ArrayList();     // Catch: Throwable -> L241
        Iterator<T> r91 = r89.iterator();     // Catch: Throwable -> L241
    L245:
        if (r91.hasNext() == false) goto L249;
        Object r92 = r91.next();     // Catch: Throwable -> L241
        if (h12.c(((WaveTrack) r92).getGenerator(), WaveTrack.SEED) == true) goto L245;
        r90.add(r92);     // Catch: Throwable -> L241
        goto L245
    L249:
        String r93 = r88.getSessionId();     // Catch: Throwable -> L241
        if (r93 == null) goto L253;
        Object r94 = new ly4(r93, r88, b.k(WaveSession.CONTEXT_PREFIX + r93, r90));     // Catch: Throwable -> L241
    L255:
        io1.b.post(new ws1(6, r76, r94));
        return;
    L253:
        throw new HubException("Пустой ответ Хаба");     // Catch: Throwable -> L241
    L237:
        r87 = null;
        goto L238
    L233:
        r85 = null;
    L241:
        th = move-exception;
        r94 = new s14(th);
        goto L255
    L257:
        String r95 = (String) this.o;
        Context r96 = (Context) this.p;
        rr1.g(r95);     // Catch: Throwable -> L260
    L262:
        io1.b.post(new v6(r4, r96, r95, r2));
        return;
    L260:
        th = move-exception;
        r4 = new s14(th);
        goto L262
    L264:
        Object r97 = this.o;
        Context r98 = (Context) this.p;
        if ((r97 instanceof s14) == true) goto L267;
        j15 r99 = (j15) r97;
        Toast.makeText(r98, R.string.homemusic_smart_hidden, 0).show();
    L267:
        Throwable r100 = bb3.a(r97);
        if (r100 == null) goto L367;
        Log.w("HubSmart", "hide", r100);
        if ((r100 instanceof HubException) == false) goto L272;
        r3 = (HubException) r100;
    L272:
        if (r3 == null) goto L277;
        String r101 = r3.getMessage();
        if (r101 == null) goto L277;
    L278:
        Toast.makeText(r98, r101, 1).show();
        return;
    L277:
        r101 = r98.getString(R.string.homemusic_smart_failed);
        r101.getClass();
        goto L278
    L367:
        return;
    L280:
        HubShareActivity r102 = (HubShareActivity) this.p;
        String r103 = (String) this.o;
        ux3 r104 = HubShareActivity.P;
        if (r102.isFinishing() == false) goto L283;
        return;
    L283:
        if (r102.isDestroyed() == true) goto L369;
        jv3 r105 = r102.N;
        if (r105 == null) goto L288;
        ((TextView) r105.p).setText(r103);
        return;
    L288:
        h12.Q("bind");
        throw null;
    L369:
        return;
    L291:
        HubShareActivity r106 = (HubShareActivity) this.o;
        Exception r107 = (Exception) this.p;
        ux3 r108 = HubShareActivity.P;
        String r109 = r107.getMessage();
        if (r109 != null) goto L294;
        r109 = r106.getString(R.string.homemusic_share_failed);
        r109.getClass();
    L294:
        r106.p(r109);
        return;
    L296:
        String r113 = (String) this.o;
        MainActivity r114 = (MainActivity) this.p;
        if (r113 != null) goto L310;
    L305:
        io1.b.post(new xs1(r114, r5));
        return;
    L310:
        na4 r115 = AppDatabase.y().G();     // Catch: Throwable -> L300
        xl.E((s24) r115.n, false, true, new ma4(r115, new Server(r113, "", "", "", "", null, 0, false, null), 1));     // Catch: Throwable -> L300
        Object r116 = j15.a;     // Catch: Throwable -> L300
    L302:
        Throwable r117 = bb3.a(r116);
        if (r117 == null) goto L305;
        Log.w("HubSettings", "Cannot forget the account", r117);
    L300:
        th = move-exception;
        r116 = new s14(th);
        goto L302
    }

    public /* synthetic */ ws1(Object r1, String r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }
}
