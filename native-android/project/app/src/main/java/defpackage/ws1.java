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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocket;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ws1(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    private final void a() {
        List list = (List) this.o;
        bj2 bj2Var = (bj2) this.p;
        ArrayList arrayListM = gi1.M(list);
        Queue queueA = new vs3().a();
        int i = -1;
        if (queueA != null) {
            String id = queueA.getId();
            for (int i2 = 0; i2 < arrayListM.size(); i2++) {
                if (((gn2) arrayListM.get(i2)).a.equals(id)) {
                    i = i2;
                    break;
                }
            }
        }
        int i3 = i >= 0 ? i : 0;
        long j = 0;
        if (i >= 0) {
            String id2 = queueA.getId();
            id2.getClass();
            sp3 sp3Var = (sp3) ud3.A().get(id2);
            long jMax = sp3Var != null ? sp3Var.b : 0L;
            if (jMax == 0) {
                jMax = Math.max(0L, queueA.getPlayingChanged());
            }
            j = jMax;
        }
        new Handler(Looper.getMainLooper()).post(new wn2(bj2Var, arrayListM, i3, j, 0));
    }

    private final void b() {
        ic2 ic2Var = (ic2) this.o;
        gn2 gn2Var = (gn2) this.p;
        try {
            if (!ic2Var.isDone()) {
                return;
            }
            try {
                if (u52.c().a) {
                    return;
                }
                bj2 bj2Var = (bj2) ic2Var.get();
                int i = 1;
                bo2.b.set(true);
                bj2Var.s0(gn2Var);
                bj2Var.b();
                bj2Var.m0();
                vs3 vs3Var = new vs3();
                ExecutorService executorService = vs3.b;
                ns3 ns3Var = vs3Var.a;
                Objects.requireNonNull(ns3Var);
                executorService.execute(new jq3(i, ns3Var));
                return;
            } catch (InterruptedException e) {
                e = e;
            }
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        e.printStackTrace();
    }

    private final void c() {
        ic2 ic2Var = (ic2) this.o;
        InternetRadioStation internetRadioStation = (InternetRadioStation) this.p;
        try {
            if (!ic2Var.isDone()) {
                return;
            }
            try {
                if (u52.c().a) {
                    return;
                }
                bj2 bj2Var = (bj2) ic2Var.get();
                bo2.b.set(true);
                bj2Var.s0(gi1.I(internetRadioStation));
                bj2Var.b();
                bj2Var.m0();
                return;
            } catch (InterruptedException e) {
                e = e;
            }
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        e.printStackTrace();
    }

    private final void d() {
        ho2 ho2Var = (ho2) this.o;
        ho2Var.d.reportNetworkEvent((NetworkEvent) this.p);
    }

    private final void e() {
        ho2 ho2Var = (ho2) this.o;
        ho2Var.d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.p);
    }

    private final void f() {
        ho2 ho2Var = (ho2) this.o;
        ho2Var.d.reportPlaybackMetrics((PlaybackMetrics) this.p);
    }

    private final void g() {
        ho2 ho2Var = (ho2) this.o;
        ho2Var.d.reportPlaybackStateEvent((PlaybackStateEvent) this.p);
    }

    private final void h() {
        ((tn2) this.o).D(null, (al3) this.p);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        String string;
        Object s14Var2;
        String str;
        int i = 19;
        s14 s14Var3 = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.n) {
            case 0:
                String str2 = (String) this.o;
                MainActivity mainActivity = (MainActivity) this.p;
                if (str2 != null) {
                    try {
                        na4 na4VarG = AppDatabase.y().G();
                        xl.E((s24) na4VarG.n, false, true, new ma4(na4VarG, new Server(str2, "", "", "", "", null, 0L, false, null), 1));
                        s14Var = j15.a;
                    } catch (Throwable th) {
                        s14Var = new s14(th);
                    }
                    Throwable thA = bb3.a(s14Var);
                    if (thA != null) {
                        Log.w("HubSettings", "Cannot forget the account", thA);
                    }
                    break;
                }
                io1.b.post(new xs1(mainActivity, i2));
                return;
            case 1:
                HubShareActivity hubShareActivity = (HubShareActivity) this.o;
                Exception exc = (Exception) this.p;
                ux3 ux3Var = HubShareActivity.P;
                String message = exc.getMessage();
                if (message == null) {
                    message = hubShareActivity.getString(R.string.homemusic_share_failed);
                    message.getClass();
                }
                hubShareActivity.p(message);
                return;
            case 2:
                HubShareActivity hubShareActivity2 = (HubShareActivity) this.p;
                String str3 = (String) this.o;
                ux3 ux3Var2 = HubShareActivity.P;
                if (hubShareActivity2.isFinishing() || hubShareActivity2.isDestroyed()) {
                    return;
                }
                jv3 jv3Var = hubShareActivity2.N;
                if (jv3Var != null) {
                    ((TextView) jv3Var.p).setText(str3);
                    return;
                } else {
                    h12.Q("bind");
                    throw null;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Object obj = this.o;
                Context context = (Context) this.p;
                if (!(obj instanceof s14)) {
                    Toast.makeText(context, R.string.homemusic_smart_hidden, 0).show();
                }
                Throwable thA2 = bb3.a(obj);
                if (thA2 != null) {
                    Log.w("HubSmart", "hide", thA2);
                    HubException hubException = thA2 instanceof HubException ? (HubException) thA2 : null;
                    if (hubException == null || (string = hubException.getMessage()) == null) {
                        string = context.getString(R.string.homemusic_smart_failed);
                        string.getClass();
                    }
                    Toast.makeText(context, string, 1).show();
                    return;
                }
                return;
            case 4:
                String str4 = (String) this.o;
                Context context2 = (Context) this.p;
                try {
                    rr1.g(str4);
                    break;
                } catch (Throwable th2) {
                    s14Var3 = new s14(th2);
                }
                io1.b.post(new v6(s14Var3, context2, str4, i));
                return;
            case 5:
                WaveSession waveSession = (WaveSession) this.p;
                String str5 = (String) this.o;
                WeakReference weakReference = b.a;
                try {
                    rr1 rr1Var = rr1.a;
                    boolean zContains = rr1.e().contains("wave_origin_v1");
                    WaveSession.Companion companion = WaveSession.Companion;
                    Map<String, ? extends Object> seed = waveSession.getSeed();
                    String mode = waveSession.getMode();
                    String str6 = WaveOrigin.RESTART;
                    if (!zContains) {
                        str6 = null;
                    }
                    WaveOut waveOutA = rr1.A(companion.startBody(seed, mode, str6, zContains ? str5 : null, zContains ? rs1.f() : null));
                    List<WaveTrack> tracks = waveOutA.getTracks();
                    if (tracks == null) {
                        tracks = u01.n;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : tracks) {
                        if (!h12.c(((WaveTrack) obj2).getGenerator(), WaveTrack.SEED)) {
                            arrayList.add(obj2);
                        }
                    }
                    String sessionId = waveOutA.getSessionId();
                    if (sessionId == null) {
                        throw new HubException("Пустой ответ Хаба");
                    }
                    s14Var2 = new ly4(sessionId, waveOutA, b.k(WaveSession.CONTEXT_PREFIX + sessionId, arrayList));
                    io1.b.post(new ws1(6, waveSession, s14Var2));
                    return;
                } catch (Throwable th3) {
                    s14Var2 = new s14(th3);
                }
                break;
            case 6:
                WaveSession waveSession2 = (WaveSession) this.o;
                Serializable serializable = (Serializable) this.p;
                WeakReference weakReference2 = b.a;
                waveSession2.setInFlight(false);
                if (b.b != waveSession2) {
                    return;
                }
                if (!(serializable instanceof s14)) {
                    ly4 ly4Var = (ly4) serializable;
                    String str7 = ly4Var.n;
                    List list = (List) ly4Var.p;
                    waveSession2.renew(str7);
                    rs1 rs1Var = rs1.a;
                    Set<String> setIds = waveSession2.ids();
                    int iW = lg2.W(r40.k0(setIds, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                    for (Object obj3 : setIds) {
                        linkedHashMap.put(obj3, waveSession2.getContext());
                    }
                    rs1.b(linkedHashMap, b.g(waveSession2));
                    b.b(waveSession2, list);
                    if (waveSession2.getAgain()) {
                        b.c();
                    } else {
                        b.f(waveSession2);
                    }
                }
                Throwable thA3 = bb3.a(serializable);
                if (thA3 != null) {
                    Log.w("HubWave", "renew: " + thA3.getMessage());
                    waveSession2.setFailures(waveSession2.getFailures() + 1);
                    Long lAfterFailure = WaveRetry.INSTANCE.afterFailure(waveSession2.getFailures());
                    if (lAfterFailure != null) {
                        long jLongValue = lAfterFailure.longValue();
                        b.e();
                        u6 u6Var = new u6(12);
                        b.c = u6Var;
                        io1.b.postDelayed(u6Var, jLongValue);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                fx3 fx3Var = (fx3) this.o;
                f9 f9Var = (f9) this.p;
                if (fx3Var.n) {
                    return;
                }
                f9Var.setTitle(R.string.lan_discovery_error);
                return;
            case 8:
                LanReceiverService lanReceiverService = (LanReceiverService) this.o;
                SSLSocket sSLSocket = (SSLSocket) this.p;
                boolean z = LanReceiverService.y;
                try {
                    try {
                        w42 w42Var = w42.a;
                        w42.a.a("Receiver accepted connection; starting TLS", null);
                        sSLSocket.startHandshake();
                        try {
                            w42.a.a("Receiver TLS established", null);
                            LanReceiverService.z = null;
                            String strM = fz0.m(sSLSocket);
                            if (strM.equals(fz0.l(sSLSocket))) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            JSONObject jSONObjectN = fz0.n(sSLSocket);
                            String strOptString = jSONObjectN.optString("command");
                            if (!kb4.a0(lanReceiverService).contains(strM)) {
                                w42.a.a("Receiver unpaired request; windowOpen=" + (SystemClock.elapsedRealtime() < LanReceiverService.A), null);
                                strOptString.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                long j = LanReceiverService.A;
                                if (!strOptString.equals("hello") || jElapsedRealtime >= j) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                ConcurrentHashMap concurrentHashMap = LanReceiverService.B;
                                Set setEntrySet = concurrentHashMap.entrySet();
                                setEntrySet.getClass();
                                Iterator it = setEntrySet.iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getClass();
                                    if (SystemClock.elapsedRealtime() - ((h52) entry.getValue()).d > 120000) {
                                        it.remove();
                                    }
                                }
                                if (concurrentHashMap.size() >= 4 && !concurrentHashMap.containsKey(strM)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strD = fz0.d(strM, fz0.l(sSLSocket));
                                String strOptString2 = jSONObjectN.optString("name");
                                strOptString2.getClass();
                                concurrentHashMap.put(strM, new h52(strM, qm4.J0(40, strOptString2), SystemClock.elapsedRealtime(), strD));
                                JSONObject jSONObjectPut = new JSONObject().put("pair", strD);
                                jSONObjectPut.getClass();
                                fz0.p(sSLSocket, jSONObjectPut);
                                w42.a.a("Receiver pairing code sent; awaiting approval", null);
                            } else {
                                if (!h12.c(ud3.D(), lanReceiverService.w) || (str = lanReceiverService.w) == null || str.length() == 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                if (!h12.c(strOptString, "watch")) {
                                    fz0.p(sSLSocket, h12.c(strOptString, "queue") ? lanReceiverService.c(jSONObjectN, strM) : h12.c(strOptString, "edit") ? lanReceiverService.b(jSONObjectN, strM) : (JSONObject) lanReceiverService.d(new uy1(lanReceiverService, strM, strOptString, jSONObjectN, 1)));
                                } else {
                                    if (!lanReceiverService.q.tryAcquire()) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    try {
                                        lanReceiverService.g(sSLSocket, strM);
                                        lanReceiverService.q.release();
                                    } catch (Throwable th4) {
                                        lanReceiverService.q.release();
                                        throw th4;
                                    }
                                }
                            }
                            lanReceiverService.s.remove(sSLSocket);
                            try {
                                sSLSocket.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        } catch (Exception e) {
                            e = e;
                            i2 = 1;
                            w42.a.a("Receiver failed at ".concat(i2 != 0 ? "request" : "TLS"), e);
                            if (i2 == 0 && lanReceiverService.o) {
                                LanReceiverService.z = lanReceiverService.getString(R.string.lan_tls_error);
                            }
                            if (i2 != 0) {
                                try {
                                    JSONObject jSONObjectPut2 = new JSONObject().put("error", "unavailable");
                                    jSONObjectPut2.getClass();
                                    String string2 = jSONObjectPut2.toString();
                                    string2.getClass();
                                    byte[] bytes = string2.getBytes(w10.a);
                                    bytes.getClass();
                                    int length = bytes.length;
                                    if (1 > length || length >= 131073) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    DataOutputStream dataOutputStream = new DataOutputStream(sSLSocket.getOutputStream());
                                    dataOutputStream.writeInt(bytes.length);
                                    dataOutputStream.write(bytes);
                                    dataOutputStream.flush();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th5) {
                    lanReceiverService.s.remove(sSLSocket);
                    try {
                        sSLSocket.close();
                        break;
                    } catch (Throwable unused3) {
                    }
                    throw th5;
                }
                break;
            case 9:
                LanReceiverService.a((LanReceiverService) this.o, (j52) this.p);
                return;
            case 10:
                ((wc0) this.o).accept((aj2) this.p);
                return;
            case 11:
                bl2 bl2Var = (bl2) this.o;
                bj2 bj2Var = (bj2) this.p;
                bl2Var.v = bj2Var;
                if (bl2Var.w) {
                    bl2Var.l(bj2Var);
                }
                bl2Var.f(new pk2(bl2Var, bj2Var, i3), new h41(i3, bl2Var));
                return;
            case 12:
                gk2 gk2Var = (gk2) this.o;
                gk2Var.Q.set(gk2Var.z((gp3) this.p, gk2Var.K, 0));
                return;
            case 13:
                im2 im2Var = (im2) this.o;
                wo0 wo0Var = new wo0(im2Var.a, (pr2) this.p);
                im2Var.i = wo0Var;
                gm2 gm2Var = im2Var.e;
                Handler handler = im2Var.a1().f;
                if (!((Set) wo0Var.o).add(gm2Var)) {
                    l93.q0("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                gm2Var.d(handler);
                xk2 xk2Var = (xk2) wo0Var.n;
                MediaController mediaController = xk2Var.a;
                uk2 uk2Var = gm2Var.a;
                uk2Var.getClass();
                mediaController.registerCallback(uk2Var, handler);
                synchronized (xk2Var.b) {
                    qu1 qu1VarA = xk2Var.e.a();
                    if (qu1VarA != null) {
                        tk2 tk2Var = new tk2(gm2Var);
                        xk2Var.d.put(gm2Var, tk2Var);
                        gm2Var.c = tk2Var;
                        try {
                            qu1VarA.l0(tk2Var);
                            gm2Var.c(13, null);
                        } catch (RemoteException | SecurityException e3) {
                            l93.G("MediaControllerCompat", "Dead object in registerCallback.", e3);
                        }
                    } else {
                        gm2Var.c = null;
                        xk2Var.c.add(gm2Var);
                    }
                    break;
                }
                return;
            case 14:
                bm2 bm2Var = (bm2) this.o;
                lm2 lm2Var = (lm2) this.p;
                if (bm2Var.p) {
                    return;
                }
                lm2Var.c(bm2Var);
                return;
            case 15:
                ic2 ic2Var = (ic2) this.o;
                nj2 nj2Var = (nj2) this.p;
                try {
                    ab4 ab4Var = (ab4) ic2Var.get();
                    rr2.s(ab4Var, "SessionResult must not be null");
                    nj2Var.f(ab4Var.b);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e4) {
                    l93.r0("MLSLegacyStub", "Custom action failed", e4);
                    nj2Var.e();
                    return;
                }
            case WaveRetry.MAX_FAILURES /* 16 */:
                lb4 lb4Var = (lb4) this.o;
                ArrayList arrayList2 = (ArrayList) this.p;
                if (lb4Var.n instanceof f0) {
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        if (arrayList2.get(i4) != null) {
                            ((ic2) arrayList2.get(i4)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 17:
                ic2 ic2Var2 = (ic2) this.o;
                PodcastEpisode podcastEpisode = (PodcastEpisode) this.p;
                try {
                    if (!ic2Var2.isDone()) {
                        return;
                    }
                    try {
                        if (u52.c().a) {
                            return;
                        }
                        bj2 bj2Var2 = (bj2) ic2Var2.get();
                        bo2.b.set(true);
                        bj2Var2.s0(gi1.L(podcastEpisode));
                        bj2Var2.b();
                        bj2Var2.m0();
                        return;
                    } catch (InterruptedException e5) {
                        e = e5;
                    }
                } catch (InterruptedException | ExecutionException e6) {
                    e = e6;
                }
                e.printStackTrace();
                return;
            case 18:
                ic2 ic2Var3 = (ic2) this.o;
                List list2 = (List) this.p;
                try {
                    if (ic2Var3.isDone()) {
                        bo2.d.execute(new ws1(i, list2, (bj2) ic2Var3.get()));
                        return;
                    }
                    return;
                } catch (InterruptedException | ExecutionException e7) {
                    e7.printStackTrace();
                    return;
                }
            case 19:
                a();
                return;
            case 20:
                ic2 ic2Var4 = (ic2) this.o;
                si1 si1Var = (si1) this.p;
                try {
                    if (ic2Var4.isDone()) {
                        si1Var.onRecovery(((bj2) ic2Var4.get()).o0());
                        return;
                    }
                    return;
                } catch (InterruptedException | ExecutionException e8) {
                    e8.printStackTrace();
                    return;
                }
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                ((ho2) this.o).d.reportTrackChangeEvent((TrackChangeEvent) this.p);
                return;
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                ((lb4) this.p).l(Boolean.valueOf(((tn2) this.o).u()));
                return;
        }
    }

    public /* synthetic */ ws1(Object obj, String str, int i) {
        this.n = i;
        this.p = obj;
        this.o = str;
    }
}
